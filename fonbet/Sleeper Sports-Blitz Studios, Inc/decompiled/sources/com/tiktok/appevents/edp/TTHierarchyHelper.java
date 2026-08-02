package com.tiktok.appevents.edp;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.tiktok.TikTokBusinessSdk;
import com.tiktok.appevents.edp.proxy.ITouchListener;
import com.tiktok.appevents.edp.proxy.TouchProxyHelper;
import com.tiktok.util.RegexUtil;
import java.lang.ref.WeakReference;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class TTHierarchyHelper {
    public static Handler mHandler;

    public static JSONObject getViewHierarchy(WeakReference<View> rootView, int hierarchy) {
        JSONObject jSONObject = new JSONObject();
        if (hierarchy > 0) {
            try {
                jSONObject.put("class_name", rootView.get().getClass().getCanonicalName());
                if (rootView.get() instanceof TextView) {
                    String str = "";
                    if (((TextView) rootView.get()).getText() != null) {
                        str = ((TextView) rootView.get()).getText().toString();
                    }
                    if (!TextUtils.isEmpty(str)) {
                        str = RegexUtil.replaceAllToHash(EDPConfig.sensig_filtering_regex_list, str);
                    }
                    jSONObject.put("text", str);
                    jSONObject.put(ViewHierarchyConstants.TEXT_SIZE, ((TextView) rootView.get()).getTextSize());
                }
                int[] iArr = new int[2];
                rootView.get().getLocationOnScreen(iArr);
                jSONObject.put("left", iArr[0]);
                jSONObject.put("top", iArr[1]);
                jSONObject.put("width", rootView.get().getMeasuredWidth());
                jSONObject.put("height", rootView.get().getMeasuredHeight());
                jSONObject.put("scroll_x", rootView.get().getScrollX());
                jSONObject.put("scroll_y", rootView.get().getScrollY());
                if (rootView.get() instanceof ViewGroup) {
                    JSONArray jSONArray = new JSONArray();
                    for (int i = 0; i < ((ViewGroup) rootView.get()).getChildCount(); i++) {
                        ViewGroup viewGroup = (ViewGroup) rootView.get();
                        ViewGroup viewGroup2 = viewGroup;
                        jSONArray.put(getViewHierarchy(new WeakReference(viewGroup.getChildAt(i)), hierarchy - 1));
                    }
                    try {
                        jSONObject.put("child_views", jSONArray);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return jSONObject;
    }

    public static void proxyOnTouch(WeakReference<View> rootView, WeakReference<Activity> activity) {
        if (EDPConfig.enable_click_track) {
            TouchProxyHelper.proxy(rootView, new AnonymousClass1(activity, rootView));
        }
    }

    /* renamed from: com.tiktok.appevents.edp.TTHierarchyHelper$1, reason: invalid class name */
    static class AnonymousClass1 implements ITouchListener {
        long touchDown = 0;
        final /* synthetic */ WeakReference val$activity;
        final /* synthetic */ WeakReference val$rootView;

        AnonymousClass1(final WeakReference val$rootView, final WeakReference val$activity) {
            this.val$activity = val$rootView;
            this.val$rootView = val$activity;
        }

        @Override // com.tiktok.appevents.edp.proxy.ITouchListener
        public boolean onTouch(View v, final MotionEvent event) {
            try {
                int action = event.getAction();
                if (action == 0) {
                    this.touchDown = System.currentTimeMillis();
                } else if (action == 1) {
                    WeakReference weakReference = this.val$activity;
                    if (weakReference == null || weakReference.get() == null || EDPConfig.button_black_list.contains(((View) this.val$rootView.get()).getClass().getCanonicalName()) || !TTEDPEventTrack.checkUpload() || TTEDPEventTrack.isSending || System.currentTimeMillis() - TTEDPEventTrack.LAST_CLICK_TS <= EDPConfig.time_diff_frequency_control * 1000.0d) {
                        return false;
                    }
                    TTEDPEventTrack.isSending = true;
                    final String canonicalName = v.getClass().getCanonicalName();
                    if (EDPConfig.enable_sync_get_touch_info) {
                        final float rawX = event.getRawX();
                        final float rawY = event.getRawY();
                        TikTokBusinessSdk.getAppEventLogger().addToQ(new Runnable() { // from class: com.tiktok.appevents.edp.TTHierarchyHelper.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                String str;
                                try {
                                    String str2 = canonicalName;
                                    float f = rawX;
                                    float f2 = rawY;
                                    int measuredWidth = ((View) AnonymousClass1.this.val$rootView.get()).getMeasuredWidth();
                                    int measuredHeight = ((View) AnonymousClass1.this.val$rootView.get()).getMeasuredHeight();
                                    if (AnonymousClass1.this.val$rootView.get() instanceof TextView) {
                                        TextView textView = (TextView) AnonymousClass1.this.val$rootView.get();
                                        TextView textView2 = textView;
                                        str = textView.getText().toString();
                                    } else {
                                        str = "";
                                    }
                                    TTEDPEventTrack.trackClick(str2, f, f2, measuredWidth, measuredHeight, str, ((Activity) AnonymousClass1.this.val$activity.get()).getClass().getSimpleName(), TTHierarchyHelper.getViewHierarchy(new WeakReference(((Activity) AnonymousClass1.this.val$activity.get()).getWindow().getDecorView()), EDPConfig.page_detail_upload_deep_count), TTHierarchyHelper.getViewHierarchyCount(new WeakReference(((Activity) AnonymousClass1.this.val$activity.get()).getWindow().getDecorView())), System.currentTimeMillis() - AnonymousClass1.this.touchDown);
                                } catch (Throwable unused) {
                                }
                            }
                        });
                    } else {
                        TikTokBusinessSdk.getAppEventLogger().addToQ(new Runnable() { // from class: com.tiktok.appevents.edp.TTHierarchyHelper.1.2
                            @Override // java.lang.Runnable
                            public void run() {
                                String str;
                                try {
                                    String str2 = canonicalName;
                                    float rawX2 = event.getRawX();
                                    float rawY2 = event.getRawY();
                                    int measuredWidth = ((View) AnonymousClass1.this.val$rootView.get()).getMeasuredWidth();
                                    int measuredHeight = ((View) AnonymousClass1.this.val$rootView.get()).getMeasuredHeight();
                                    if (AnonymousClass1.this.val$rootView.get() instanceof TextView) {
                                        TextView textView = (TextView) AnonymousClass1.this.val$rootView.get();
                                        TextView textView2 = textView;
                                        str = textView.getText().toString();
                                    } else {
                                        str = "";
                                    }
                                    TTEDPEventTrack.trackClick(str2, rawX2, rawY2, measuredWidth, measuredHeight, str, ((Activity) AnonymousClass1.this.val$activity.get()).getClass().getSimpleName(), TTHierarchyHelper.getViewHierarchy(new WeakReference(((Activity) AnonymousClass1.this.val$activity.get()).getWindow().getDecorView()), EDPConfig.page_detail_upload_deep_count), TTHierarchyHelper.getViewHierarchyCount(new WeakReference(((Activity) AnonymousClass1.this.val$activity.get()).getWindow().getDecorView())), System.currentTimeMillis() - AnonymousClass1.this.touchDown);
                                } catch (Throwable unused) {
                                }
                            }
                        });
                    }
                }
            } catch (Throwable unused) {
            }
            return false;
        }
    }

    public static int getViewHierarchyCount(WeakReference<View> rootView) {
        try {
            if (!(rootView.get() instanceof ViewGroup)) {
                return 1;
            }
            int i = 0;
            int i2 = 1;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) rootView.get();
                ViewGroup viewGroup2 = viewGroup;
                if (i >= viewGroup.getChildCount()) {
                    return i2;
                }
                ViewGroup viewGroup3 = (ViewGroup) rootView.get();
                ViewGroup viewGroup4 = viewGroup3;
                i2 = Math.max(getViewHierarchyCount(new WeakReference(viewGroup3.getChildAt(i))) + 1, i2);
                i++;
            }
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static Handler getHandler() {
        if (mHandler == null) {
            mHandler = new Handler(Looper.getMainLooper());
        }
        return mHandler;
    }

    public static int getViewHierarchyCountAndRegisterOnTouch(final WeakReference<View> rootView, final WeakReference<Activity> activity) {
        try {
            if ((rootView.get() instanceof WebView) && EDPConfig.enable_webview_request_track) {
                getHandler().post(new Runnable() { // from class: com.tiktok.appevents.edp.TTHierarchyHelper.2
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            String originalUrl = ((WebView) rootView.get()).getOriginalUrl();
                            if (TextUtils.isEmpty(originalUrl)) {
                                return;
                            }
                            TTEDPEventTrack.trackWebviewRequest(originalUrl);
                        } catch (Throwable unused) {
                        }
                    }
                });
            }
            getHandler().post(new Runnable() { // from class: com.tiktok.appevents.edp.TTHierarchyHelper.3
                @Override // java.lang.Runnable
                public void run() {
                    TTHierarchyHelper.proxyOnTouch(rootView, activity);
                }
            });
            if (!(rootView.get() instanceof ViewGroup)) {
                return 1;
            }
            int i = 0;
            int i2 = 1;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) rootView.get();
                ViewGroup viewGroup2 = viewGroup;
                if (i < viewGroup.getChildCount()) {
                    ViewGroup viewGroup3 = (ViewGroup) rootView.get();
                    ViewGroup viewGroup4 = viewGroup3;
                    i2 = Math.max(getViewHierarchyCountAndRegisterOnTouch(new WeakReference(viewGroup3.getChildAt(i)), activity) + 1, i2);
                    i++;
                } else {
                    ViewGroup viewGroup5 = (ViewGroup) rootView.get();
                    ViewGroup viewGroup6 = viewGroup5;
                    viewGroup5.setOnHierarchyChangeListener(new ViewGroup.OnHierarchyChangeListener() { // from class: com.tiktok.appevents.edp.TTHierarchyHelper.4
                        @Override // android.view.ViewGroup.OnHierarchyChangeListener
                        public void onChildViewRemoved(View parent, View child) {
                        }

                        @Override // android.view.ViewGroup.OnHierarchyChangeListener
                        public void onChildViewAdded(View parent, View child) {
                            TTHierarchyHelper.getViewHierarchyCountAndRegisterOnTouch(new WeakReference(child), activity);
                        }
                    });
                    return i2;
                }
            }
        } catch (Throwable unused) {
            return 0;
        }
    }
}
