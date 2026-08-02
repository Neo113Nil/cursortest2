package com.mbridge.msdk.dycreator.baseview.webview;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.dycreator.baseview.GradientOrientationUtils;
import com.mbridge.msdk.dycreator.baseview.inter.InterBase;
import com.mbridge.msdk.dycreator.baseview.webview.client.MBWebChromeClient;
import com.mbridge.msdk.dycreator.baseview.webview.client.MBWebViewClient;
import com.mbridge.msdk.dycreator.baseview.webview.communicator.WebCommunicator;
import com.mbridge.msdk.dycreator.baseview.webview.listener.WebViewEventListener;
import com.mbridge.msdk.dycreator.engine.b;
import com.mbridge.msdk.dycreator.engine.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class MBWebView extends WebView implements InterBase {
    private final String a;
    private Map<String, String> b;
    private MBWebViewClient c;
    private MBWebChromeClient d;
    public Map<String, String> dataMethodMap;
    private boolean e;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.mbridge.msdk.dycreator.baseview.webview.MBWebView$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[c.values().length];
            a = iArr;
            try {
                iArr[c.id.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[c.fadingEdge.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[c.visibility.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[c.background.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[c.contentDescription.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[c.tag.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[c.padding.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[c.paddingTop.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[c.paddingBottom.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[c.paddingLeft.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[c.paddingRight.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[c.paddingStart.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[c.paddingEnd.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[c.layout_width.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[c.layout_height.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    public MBWebView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = "MBWebView";
        try {
            this.b = com.mbridge.msdk.dycreator.utils.c.a(context, attributeSet);
            setAttributeSet(attributeSet);
            setLayoutParams(generateLayoutParams(attributeSet));
            com.mbridge.msdk.dycreator.utils.c.a(this.b, this);
        } catch (Exception e) {
            q0.b("MBWebView", e.getMessage());
        }
        a();
    }

    private void a() {
        b();
        MBWebViewClient mBWebViewClient = new MBWebViewClient();
        this.c = mBWebViewClient;
        setWebViewClient(mBWebViewClient);
        MBWebChromeClient mBWebChromeClient = new MBWebChromeClient();
        this.d = mBWebChromeClient;
        setWebChromeClient(mBWebChromeClient);
    }

    private void b() {
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        WebSettings settings = getSettings();
        settings.setUserAgentString(settings.getUserAgentString() + " WindVane/3.0.2");
        settings.setJavaScriptEnabled(true);
        settings.setCacheMode(-1);
        settings.setAllowFileAccess(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setDomStorageEnabled(true);
        settings.setSupportZoom(false);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setSavePassword(false);
        settings.setDatabaseEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
        settings.setSafeBrowsingEnabled(false);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setMixedContentMode(0);
        settings.setDatabaseEnabled(true);
        String path = getContext().getDir("database", 0).getPath();
        settings.setDatabasePath(path);
        settings.setGeolocationEnabled(true);
        settings.setGeolocationDatabasePath(path);
    }

    @Override // android.webkit.WebView
    public void destroy() {
        if (this.e) {
            return;
        }
        try {
            this.e = true;
            setVisibility(8);
            removeAllViews();
            setDownloadListener(null);
            destroy();
        } catch (Throwable th) {
            q0.b("MBWebView", th.getMessage());
        }
    }

    @Override // android.widget.AbsoluteLayout, android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        if (attributeSet != null) {
            HashMap b = b.a().b();
            int attributeCount = attributeSet.getAttributeCount();
            for (int i = 0; i < attributeCount; i++) {
                c cVar = (c) b.get(attributeSet.getAttributeName(i));
                if (cVar != null) {
                    int i2 = AnonymousClass1.a[cVar.ordinal()];
                    if (i2 == 14) {
                        String attributeValue = attributeSet.getAttributeValue(i);
                        if (attributeValue.startsWith(InneractiveMediationDefs.GENDER_FEMALE) || attributeValue.startsWith(InneractiveMediationDefs.GENDER_MALE)) {
                            layoutParams.width = -1;
                        } else if (attributeValue.startsWith("wrap")) {
                            layoutParams.width = -2;
                        } else {
                            layoutParams.width = b.a().a(attributeValue);
                        }
                    } else if (i2 == 15) {
                        String attributeValue2 = attributeSet.getAttributeValue(i);
                        if (attributeValue2.startsWith(InneractiveMediationDefs.GENDER_FEMALE) || attributeValue2.startsWith(InneractiveMediationDefs.GENDER_MALE)) {
                            layoutParams.height = -1;
                        } else if (attributeValue2.startsWith("wrap")) {
                            layoutParams.height = -2;
                        } else {
                            layoutParams.height = b.a().a(attributeValue2);
                        }
                    }
                }
            }
        }
        return layoutParams;
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getActionDes() {
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getBindDataDes() {
        Map<String, String> map = this.dataMethodMap;
        return map != null ? map.get("mbridgeData") : "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getEffectDes() {
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getReportDes() {
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getStrategyDes() {
        return "";
    }

    public boolean isDestroyed() {
        return this.e;
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void setAttributeSet(AttributeSet attributeSet) {
        String[] strArr;
        if (attributeSet == null) {
            return;
        }
        HashMap<String, c> c = b.a().c();
        int attributeCount = attributeSet.getAttributeCount();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < attributeCount; i5++) {
            c cVar = c.get(attributeSet.getAttributeName(i5));
            if (cVar != null) {
                switch (AnonymousClass1.a[cVar.ordinal()]) {
                    case 1:
                        String attributeValue = attributeSet.getAttributeValue(i5);
                        if (attributeValue.startsWith("@+id/")) {
                            setId(attributeValue.substring(5).hashCode());
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        setHorizontalFadingEdgeEnabled(attributeSet.getAttributeBooleanValue(i5, false));
                        break;
                    case 3:
                        String attributeValue2 = attributeSet.getAttributeValue(i5);
                        if (TextUtils.isEmpty(attributeValue2)) {
                            break;
                        } else if (attributeValue2.equals("invisible")) {
                            setVisibility(4);
                            break;
                        } else if (attributeValue2.equalsIgnoreCase("gone")) {
                            setVisibility(8);
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        String attributeValue3 = attributeSet.getAttributeValue(i5);
                        if (attributeValue3.startsWith("#")) {
                            try {
                                strArr = attributeValue3.split("-");
                            } catch (Exception unused) {
                                strArr = null;
                            }
                            if (strArr == null || strArr.length > 2) {
                                if (strArr == null || strArr.length != 3) {
                                    setBackgroundColor(b.a().d(attributeSet.getAttributeValue(i5)));
                                    break;
                                } else {
                                    try {
                                        GradientDrawable gradientDrawable = new GradientDrawable(GradientOrientationUtils.getOrientation(strArr[2]), new int[]{Color.parseColor(strArr[0]), Color.parseColor(strArr[1])});
                                        gradientDrawable.setGradientType(0);
                                        setBackground(gradientDrawable);
                                        break;
                                    } catch (Exception unused2) {
                                        setBackgroundColor(b.a().d(attributeSet.getAttributeValue(i5)));
                                        break;
                                    }
                                }
                            } else {
                                setBackgroundColor(b.a().d(attributeSet.getAttributeValue(i5)));
                                break;
                            }
                        } else {
                            if (attributeValue3.startsWith("@drawable/")) {
                                attributeValue3 = attributeValue3.substring(10);
                            }
                            setBackgroundResource(getResources().getIdentifier(attributeValue3, "drawable", getContext().getPackageName()));
                            break;
                        }
                        break;
                    case 5:
                        String attributeValue4 = attributeSet.getAttributeValue(i5);
                        if (TextUtils.isEmpty(attributeValue4)) {
                            break;
                        } else {
                            CharSequence charSequence = (String) com.mbridge.msdk.dycreator.utils.b.a.get(attributeValue4.substring(8));
                            if (TextUtils.isEmpty(charSequence)) {
                                break;
                            } else {
                                setContentDescription(charSequence);
                                break;
                            }
                        }
                    case 6:
                        String attributeValue5 = attributeSet.getAttributeValue(i5);
                        if (TextUtils.isEmpty(attributeValue5)) {
                            break;
                        } else {
                            String str = com.mbridge.msdk.dycreator.utils.b.a.get(attributeValue5.substring(8));
                            if (TextUtils.isEmpty(str)) {
                                break;
                            } else {
                                setTag(str);
                                break;
                            }
                        }
                    case 7:
                        int a = b.a().a(attributeSet.getAttributeValue(i5));
                        setPadding(a, a, a, a);
                        break;
                    case 8:
                        i4 = b.a().a(attributeSet.getAttributeValue(i5));
                        setPadding(i, i4, i2, i3);
                        break;
                    case 9:
                        i3 = b.a().a(attributeSet.getAttributeValue(i5));
                        setPadding(i, i4, i2, i3);
                        break;
                    case 10:
                        i = b.a().a(attributeSet.getAttributeValue(i5));
                        setPadding(i, i4, i2, i3);
                        break;
                    case 11:
                        i2 = b.a().a(attributeSet.getAttributeValue(i5));
                        setPadding(i, i4, i2, i3);
                        break;
                    case 12:
                        setPadding(b.a().a(attributeSet.getAttributeValue(i5)), i4, i2, i3);
                        break;
                    case 13:
                        setPadding(i, i4, b.a().a(attributeSet.getAttributeValue(i5)), i3);
                        break;
                }
            }
        }
    }

    public void setCommunicator(WebCommunicator webCommunicator) {
        MBWebChromeClient mBWebChromeClient = this.d;
        if (mBWebChromeClient != null) {
            mBWebChromeClient.setCommunicator(webCommunicator);
        }
    }

    public void setWebViewEventListener(WebViewEventListener webViewEventListener) {
        MBWebViewClient mBWebViewClient = this.c;
        if (mBWebViewClient != null) {
            mBWebViewClient.setWebViewEventListener(webViewEventListener);
        }
        MBWebChromeClient mBWebChromeClient = this.d;
        if (mBWebChromeClient != null) {
            mBWebChromeClient.setWebViewEventListener(webViewEventListener);
        }
    }

    public MBWebView(@NonNull Context context) {
        super(context);
        this.a = "MBWebView";
        a();
    }

    public MBWebView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = "MBWebView";
        a();
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public void setDynamicReport(String str, CampaignEx campaignEx) {
    }

    public MBWebView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = "MBWebView";
        a();
    }
}
