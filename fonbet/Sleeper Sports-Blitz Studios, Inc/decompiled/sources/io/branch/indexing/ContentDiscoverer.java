package io.branch.indexing;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AbsListView;
import android.widget.TextView;
import androidx.media3.exoplayer.upstream.CmcdData;
import io.branch.indexing.ContentDiscoveryManifest;
import io.branch.referral.PrefHelper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class ContentDiscoverer {
    private static final String COLLECTION_VIEW_KEY_PREFIX = "$";
    private static final String CONTENT_DATA_KEY = "cd";
    private static final String CONTENT_KEYS_KEY = "ck";
    private static final String CONTENT_LINK_KEY = "cl";
    private static final String CONTENT_META_DATA_KEY = "cm";
    private static final String ENABLE_SCROLL_WATCH = "bnc_esw";
    private static final String ENTITIES_KEY = "e";
    private static final String NAV_PATH_KEY = "n";
    private static final String PACKAGE_NAME_KEY = "p";
    private static final String RECYCLER_VIEW = "RecyclerView";
    private static final String REFERRAL_LINK_KEY = "rl";
    private static final int SCROLL_SETTLE_TIME = 1500;
    private static final String TIME_STAMP_CLOSE_KEY = "tc";
    private static final String TIME_STAMP_KEY = "ts";
    private static final String VIEW_KEY = "v";
    private static final int VIEW_SETTLE_TIME = 1000;
    private static ContentDiscoverer thisInstance_;
    private ContentDiscoveryManifest cdManifest_;
    private JSONObject contentEvent_;
    private int discoveryRepeatCnt_;
    private WeakReference<Activity> lastActivityReference_;
    private String referredUrl_;
    private int maxDiscoveryRepeatCnt = 15;
    private ArrayList<String> discoveredViewList_ = new ArrayList<>();
    private Runnable readContentRunnable = new Runnable() { // from class: io.branch.indexing.ContentDiscoverer.1
        @Override // java.lang.Runnable
        public void run() {
            JSONArray jSONArray;
            try {
                ContentDiscoverer.access$008(ContentDiscoverer.this);
                if (!ContentDiscoverer.this.cdManifest_.isCDEnabled() || ContentDiscoverer.this.lastActivityReference_ == null || ContentDiscoverer.this.lastActivityReference_.get() == null) {
                    return;
                }
                Activity activity = (Activity) ContentDiscoverer.this.lastActivityReference_.get();
                ContentDiscoverer.this.contentEvent_ = new JSONObject();
                ContentDiscoverer.this.contentEvent_.put(ContentDiscoverer.TIME_STAMP_KEY, System.currentTimeMillis());
                if (!TextUtils.isEmpty(ContentDiscoverer.this.referredUrl_)) {
                    ContentDiscoverer.this.contentEvent_.put(ContentDiscoverer.REFERRAL_LINK_KEY, ContentDiscoverer.this.referredUrl_);
                }
                String str = "/" + activity.getClass().getSimpleName();
                ContentDiscoverer.this.contentEvent_.put("v", str);
                ViewGroup viewGroup = (ViewGroup) activity.findViewById(R.id.content);
                if (viewGroup != null) {
                    ContentDiscoveryManifest.CDPathProperties cDPathProperties = ContentDiscoverer.this.cdManifest_.getCDPathProperties(activity);
                    boolean z = cDPathProperties != null && cDPathProperties.isClearTextRequested();
                    if (cDPathProperties != null) {
                        z = cDPathProperties.isClearTextRequested();
                        ContentDiscoverer.this.contentEvent_.put(CmcdData.STREAMING_FORMAT_HLS, !z);
                        jSONArray = cDPathProperties.getFilteredElements();
                    } else {
                        jSONArray = null;
                    }
                    boolean z2 = z;
                    JSONArray jSONArray2 = jSONArray;
                    if (jSONArray2 == null || jSONArray2.length() <= 0) {
                        if (!ContentDiscoverer.this.discoveredViewList_.contains(str)) {
                            JSONArray jSONArray3 = new JSONArray();
                            ContentDiscoverer.this.contentEvent_.put(ContentDiscoverer.CONTENT_KEYS_KEY, jSONArray3);
                            ContentDiscoverer.this.discoverContentKeys(viewGroup, jSONArray3, activity.getResources());
                        }
                    } else {
                        JSONArray jSONArray4 = new JSONArray();
                        ContentDiscoverer.this.contentEvent_.put(ContentDiscoverer.CONTENT_KEYS_KEY, jSONArray4);
                        JSONArray jSONArray5 = new JSONArray();
                        ContentDiscoverer.this.contentEvent_.put("cd", jSONArray5);
                        ContentDiscoverer.this.discoverContentData(jSONArray2, jSONArray5, jSONArray4, activity, z2);
                    }
                    ContentDiscoverer.this.discoveredViewList_.add(str);
                    PrefHelper.getInstance(activity).saveBranchAnalyticsData(ContentDiscoverer.this.contentEvent_);
                    int discoveryRepeatInterval = ContentDiscoverer.this.cdManifest_.getCDPathProperties(activity).getDiscoveryRepeatInterval();
                    ContentDiscoverer contentDiscoverer = ContentDiscoverer.this;
                    contentDiscoverer.maxDiscoveryRepeatCnt = contentDiscoverer.cdManifest_.getCDPathProperties(activity).getMaxDiscoveryRepeatNumber();
                    if (ContentDiscoverer.this.discoveryRepeatCnt_ >= ContentDiscoverer.this.maxDiscoveryRepeatCnt || discoveryRepeatInterval < 500 || jSONArray2 == null || jSONArray2.length() <= 0) {
                        return;
                    }
                    ContentDiscoverer.this.handler_.postDelayed(ContentDiscoverer.this.readContentRunnable, discoveryRepeatInterval);
                }
            } catch (Exception unused) {
            }
        }
    };
    private ViewTreeObserver.OnScrollChangedListener scrollChangedListener = new ViewTreeObserver.OnScrollChangedListener() { // from class: io.branch.indexing.ContentDiscoverer.2
        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            ContentDiscoverer.this.handler_.removeCallbacks(ContentDiscoverer.this.readListRunnable);
            if (ContentDiscoverer.this.maxDiscoveryRepeatCnt > ContentDiscoverer.this.discoveryRepeatCnt_) {
                ContentDiscoverer.this.handler_.postDelayed(ContentDiscoverer.this.readListRunnable, 1500L);
            }
        }
    };
    private Runnable readListRunnable = new Runnable() { // from class: io.branch.indexing.ContentDiscoverer.3
        @Override // java.lang.Runnable
        public void run() {
            ContentDiscoverer.this.readContentRunnable.run();
        }
    };
    private Handler handler_ = new Handler();
    private final HashHelper hashHelper_ = new HashHelper();
    private final Map<String, WeakReference<ViewTreeObserver>> viewTreeObserverMap = new HashMap();

    static /* synthetic */ int access$008(ContentDiscoverer contentDiscoverer) {
        int i = contentDiscoverer.discoveryRepeatCnt_;
        contentDiscoverer.discoveryRepeatCnt_ = i + 1;
        return i;
    }

    public static ContentDiscoverer getInstance() {
        if (thisInstance_ == null) {
            thisInstance_ = new ContentDiscoverer();
        }
        return thisInstance_;
    }

    private ContentDiscoverer() {
    }

    public void discoverContent(Activity activity, String str) {
        ContentDiscoveryManifest contentDiscoveryManifest = ContentDiscoveryManifest.getInstance(activity);
        this.cdManifest_ = contentDiscoveryManifest;
        this.referredUrl_ = str;
        ContentDiscoveryManifest.CDPathProperties cDPathProperties = contentDiscoveryManifest.getCDPathProperties(activity);
        if (cDPathProperties != null) {
            if (cDPathProperties.isSkipContentDiscovery()) {
                return;
            }
            discoverContent(activity);
        } else {
            if (TextUtils.isEmpty(this.referredUrl_)) {
                return;
            }
            discoverContent(activity);
        }
    }

    public void onActivityStopped(Activity activity) {
        WeakReference<Activity> weakReference = this.lastActivityReference_;
        if (weakReference != null && weakReference.get() != null && this.lastActivityReference_.get().getClass().getName().equals(activity.getClass().getName())) {
            this.handler_.removeCallbacks(this.readContentRunnable);
            this.lastActivityReference_ = null;
        }
        updateLastViewTimeStampIfNeeded();
        Iterator<WeakReference<ViewTreeObserver>> it = this.viewTreeObserverMap.values().iterator();
        while (it.hasNext()) {
            ViewTreeObserver viewTreeObserver = it.next().get();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnScrollChangedListener(this.scrollChangedListener);
            }
        }
        this.viewTreeObserverMap.clear();
    }

    public void onSessionStarted(Activity activity, String str) {
        this.discoveredViewList_ = new ArrayList<>();
        discoverContent(activity, str);
    }

    private void discoverContent(Activity activity) {
        this.discoveryRepeatCnt_ = 0;
        if (this.discoveredViewList_.size() < this.cdManifest_.getMaxViewHistorySize()) {
            this.handler_.removeCallbacks(this.readContentRunnable);
            this.lastActivityReference_ = new WeakReference<>(activity);
            this.handler_.postDelayed(this.readContentRunnable, 1000L);
        }
    }

    private void updateLastViewTimeStampIfNeeded() {
        try {
            JSONObject jSONObject = this.contentEvent_;
            if (jSONObject != null) {
                jSONObject.put(TIME_STAMP_CLOSE_KEY, System.currentTimeMillis());
            }
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void discoverContentKeys(ViewGroup viewGroup, JSONArray jSONArray, Resources resources) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt.getVisibility() == 0) {
                if ((childAt instanceof AbsListView) || childAt.getClass().getSimpleName().equals(RECYCLER_VIEW)) {
                    discoverListViewContentKeys((ViewGroup) childAt, resources, jSONArray);
                } else if (childAt instanceof ViewGroup) {
                    discoverContentKeys((ViewGroup) childAt, jSONArray, resources);
                } else if (childAt instanceof TextView) {
                    jSONArray.put(getViewName(childAt, resources));
                }
            }
        }
    }

    private void discoverListViewContentKeys(ViewGroup viewGroup, Resources resources, JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        if (viewGroup == null || viewGroup.getChildCount() <= -1) {
            return;
        }
        View childAt = viewGroup.getChildAt(viewGroup.getChildCount() <= 1 ? 0 : 1);
        if (childAt != null) {
            JSONArray jSONArray2 = new JSONArray();
            try {
                jSONObject.put(getViewName(viewGroup, resources), jSONArray2);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (childAt instanceof ViewGroup) {
                discoverContentKeys((ViewGroup) childAt, jSONArray2, resources);
            } else if (childAt instanceof TextView) {
                jSONArray2.put(getViewName(childAt, resources));
            }
            if (jSONObject.length() > 0) {
                jSONArray.put(COLLECTION_VIEW_KEY_PREFIX + jSONObject);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void discoverContentData(JSONArray jSONArray, JSONArray jSONArray2, JSONArray jSONArray3, Activity activity, boolean z) {
        JSONArray jSONArray4;
        JSONArray jSONArray5;
        Activity activity2;
        boolean z2;
        int i = 0;
        while (i < jSONArray.length()) {
            try {
                String string = jSONArray.getString(i);
                if (string.startsWith(COLLECTION_VIEW_KEY_PREFIX)) {
                    jSONArray4 = jSONArray2;
                    jSONArray5 = jSONArray3;
                    Activity activity3 = activity;
                    z2 = z;
                    discoverListViewContentData(string, activity3, z2, jSONArray4, jSONArray5);
                    activity2 = activity3;
                } else {
                    jSONArray4 = jSONArray2;
                    jSONArray5 = jSONArray3;
                    activity2 = activity;
                    z2 = z;
                    updateElementData(string, activity2.findViewById(activity2.getResources().getIdentifier(jSONArray.getString(i), "id", activity2.getPackageName())), z2, jSONArray4, jSONArray5);
                }
                i++;
                activity = activity2;
                z = z2;
                jSONArray2 = jSONArray4;
                jSONArray3 = jSONArray5;
            } catch (JSONException unused) {
                return;
            }
        }
    }

    private void discoverListViewContentData(String str, Activity activity, boolean z, JSONArray jSONArray, JSONArray jSONArray2) {
        Activity activity2;
        int i;
        JSONObject jSONObject = new JSONObject();
        jSONArray2.put(str);
        jSONArray.put(jSONObject);
        String replace = str.replace(COLLECTION_VIEW_KEY_PREFIX, "");
        try {
            JSONObject jSONObject2 = new JSONObject(replace);
            if (jSONObject2.length() > 0) {
                String next = jSONObject2.keys().next();
                int identifier = activity.getResources().getIdentifier(next, "id", activity.getPackageName());
                View findViewById = activity.getCurrentFocus() != null ? activity.getCurrentFocus().findViewById(identifier) : null;
                if (findViewById == null) {
                    activity2 = activity;
                    findViewById = activity2.findViewById(identifier);
                } else {
                    activity2 = activity;
                }
                if (findViewById == null || !(findViewById instanceof ViewGroup)) {
                    return;
                }
                ViewGroup viewGroup = (ViewGroup) findViewById;
                JSONArray jSONArray3 = jSONObject2.getJSONArray(next);
                int length = jSONArray3.length();
                int[] iArr = new int[length];
                for (int i2 = 0; i2 < jSONArray3.length(); i2++) {
                    iArr[i2] = activity2.getResources().getIdentifier(jSONArray3.getString(i2), "id", activity2.getPackageName());
                }
                int firstVisiblePosition = viewGroup instanceof AbsListView ? ((AbsListView) viewGroup).getFirstVisiblePosition() : 0;
                int i3 = 0;
                while (i3 < viewGroup.getChildCount()) {
                    if (viewGroup.getChildAt(i3) != null) {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject.put("" + (i3 + firstVisiblePosition), jSONObject3);
                        int i4 = 0;
                        while (i4 < length) {
                            if (viewGroup.getChildAt(i3) != null) {
                                View findViewById2 = viewGroup.getChildAt(i3).findViewById(iArr[i4]);
                                if (findViewById2 instanceof TextView) {
                                    i = firstVisiblePosition;
                                    jSONObject3.put(jSONArray3.getString(i4), getTextViewValue(findViewById2, z));
                                    i4++;
                                    firstVisiblePosition = i;
                                }
                            }
                            i = firstVisiblePosition;
                            i4++;
                            firstVisiblePosition = i;
                        }
                    }
                    i3++;
                    firstVisiblePosition = firstVisiblePosition;
                }
                if (jSONObject2.has(ENABLE_SCROLL_WATCH) && jSONObject2.getBoolean(ENABLE_SCROLL_WATCH) && !this.viewTreeObserverMap.containsKey(replace)) {
                    viewGroup.getViewTreeObserver().addOnScrollChangedListener(this.scrollChangedListener);
                    this.viewTreeObserverMap.put(replace, new WeakReference<>(viewGroup.getViewTreeObserver()));
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private String getViewName(View view, Resources resources) {
        try {
            return resources.getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return String.valueOf(view.getId());
        }
    }

    private String getTextViewValue(View view, boolean z) {
        TextView textView = (TextView) view;
        if (textView.getText() == null) {
            return null;
        }
        String substring = textView.getText().toString().substring(0, Math.min(textView.getText().toString().length(), this.cdManifest_.getMaxTextLen()));
        return z ? substring : this.hashHelper_.hashContent(substring);
    }

    private void updateElementData(String str, View view, boolean z, JSONArray jSONArray, JSONArray jSONArray2) {
        if (view instanceof TextView) {
            jSONArray.put(getTextViewValue(view, z));
            jSONArray2.put(str);
        }
    }

    public JSONObject getContentDiscoverDataForCloseRequest(Context context) {
        JSONObject jSONObject;
        JSONObject branchAnalyticsData = PrefHelper.getInstance(context).getBranchAnalyticsData();
        if (branchAnalyticsData.length() <= 0 || branchAnalyticsData.toString().length() >= this.cdManifest_.getMaxPacketSize()) {
            jSONObject = null;
        } else {
            jSONObject = new JSONObject();
            try {
                jSONObject.put(ContentDiscoveryManifest.MANIFEST_VERSION_KEY, ContentDiscoveryManifest.getInstance(context).getManifestVersion()).put("e", branchAnalyticsData);
                if (context != null) {
                    jSONObject.put("p", context.getPackageName());
                    jSONObject.put("p", context.getPackageName());
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        PrefHelper.getInstance(context).clearBranchAnalyticsData();
        return jSONObject;
    }
}
