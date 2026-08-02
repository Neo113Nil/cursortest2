package com.sleeperbot;

import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import androidx.core.content.pm.ShortcutInfoCompat;
import androidx.core.content.pm.ShortcutManagerCompat;
import androidx.core.graphics.drawable.IconCompat;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: QuickActionsModule.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0002\u0016\u0017B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007J\u0012\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0002\u0010\u0013J\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u0007*\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0007H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/sleeperbot/QuickActionsModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getName", "", "setQuickActions", "", "rawActions", "Lcom/facebook/react/bridge/ReadableArray;", "parseAction", "Lcom/sleeperbot/QuickActionsModule$QuickAction;", "map", "Lcom/facebook/react/bridge/ReadableMap;", "resolveIconResource", "", "iconName", "(Ljava/lang/String;)Ljava/lang/Integer;", "getOptionalString", SDKConstants.PARAM_KEY, "QuickAction", "Companion", "app_fullRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class QuickActionsModule extends ReactContextBaseJavaModule {
    private static final String TAG = "QuickActions";
    private final ReactApplicationContext reactContext;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuickActionsModule(ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.reactContext = reactContext;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "QuickActionsBridge";
    }

    /* compiled from: QuickActionsModule.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J5\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/sleeperbot/QuickActionsModule$QuickAction;", "", "title", "", "subtitle", "url", "iconName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getUrl", "getIconName", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "app_fullRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class QuickAction {
        private final String iconName;
        private final String subtitle;
        private final String title;
        private final String url;

        public static /* synthetic */ QuickAction copy$default(QuickAction quickAction, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = quickAction.title;
            }
            if ((i & 2) != 0) {
                str2 = quickAction.subtitle;
            }
            if ((i & 4) != 0) {
                str3 = quickAction.url;
            }
            if ((i & 8) != 0) {
                str4 = quickAction.iconName;
            }
            return quickAction.copy(str, str2, str3, str4);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component3, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        /* renamed from: component4, reason: from getter */
        public final String getIconName() {
            return this.iconName;
        }

        public final QuickAction copy(String title, String subtitle, String url, String iconName) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(url, "url");
            return new QuickAction(title, subtitle, url, iconName);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof QuickAction)) {
                return false;
            }
            QuickAction quickAction = (QuickAction) other;
            return Intrinsics.areEqual(this.title, quickAction.title) && Intrinsics.areEqual(this.subtitle, quickAction.subtitle) && Intrinsics.areEqual(this.url, quickAction.url) && Intrinsics.areEqual(this.iconName, quickAction.iconName);
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            String str = this.subtitle;
            int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.url.hashCode()) * 31;
            String str2 = this.iconName;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "QuickAction(title=" + this.title + ", subtitle=" + this.subtitle + ", url=" + this.url + ", iconName=" + this.iconName + ")";
        }

        public QuickAction(String title, String str, String url, String str2) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(url, "url");
            this.title = title;
            this.subtitle = str;
            this.url = url;
            this.iconName = str2;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final String getUrl() {
            return this.url;
        }

        public final String getIconName() {
            return this.iconName;
        }
    }

    @ReactMethod
    public final void setQuickActions(ReadableArray rawActions) {
        QuickAction parseAction;
        if (rawActions == null || rawActions.size() == 0) {
            Log.d(TAG, "No Quick Actions provided.");
            return;
        }
        ArrayList arrayList = new ArrayList();
        int size = rawActions.size();
        for (int i = 0; i < size; i++) {
            ReadableMap map = rawActions.getMap(i);
            if (map != null && (parseAction = parseAction(map)) != null) {
                arrayList.add(parseAction);
            }
        }
        if (arrayList.isEmpty()) {
            Log.d(TAG, "No valid Quick Actions parsed from payload.");
            return;
        }
        ArrayList<QuickAction> arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        for (QuickAction quickAction : arrayList2) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(quickAction.getUrl()));
            intent.setFlags(335544320);
            ShortcutInfoCompat.Builder shortLabel = new ShortcutInfoCompat.Builder(this.reactContext, quickAction.getUrl()).setShortLabel(quickAction.getTitle());
            String subtitle = quickAction.getSubtitle();
            if (subtitle == null) {
                subtitle = quickAction.getTitle();
            }
            ShortcutInfoCompat.Builder intent2 = shortLabel.setLongLabel(subtitle).setIntent(intent);
            Intrinsics.checkNotNullExpressionValue(intent2, "setIntent(...)");
            Integer resolveIconResource = resolveIconResource(quickAction.getIconName());
            if (resolveIconResource != null) {
                intent2.setIcon(IconCompat.createWithResource(this.reactContext, resolveIconResource.intValue()));
            }
            arrayList3.add(intent2.build());
        }
        ShortcutManagerCompat.setDynamicShortcuts(this.reactContext, arrayList3);
    }

    private final QuickAction parseAction(ReadableMap map) {
        String string = map.getString("title");
        if (string == null) {
            Log.w(TAG, "Skipping action missing required 'title'.");
            return null;
        }
        String string2 = map.getString("url");
        if (string2 == null) {
            Log.w(TAG, "Skipping action missing required 'url'.");
            return null;
        }
        return new QuickAction(string, getOptionalString(map, "subtitle"), string2, getOptionalString(map, "iconName"));
    }

    private final Integer resolveIconResource(String iconName) {
        String str = iconName;
        if (str == null || StringsKt.isBlank(str)) {
            return null;
        }
        int identifier = this.reactContext.getResources().getIdentifier(StringsKt.replace$default(iconName, ".", "_", false, 4, (Object) null), "drawable", this.reactContext.getPackageName());
        if (identifier == 0) {
            Log.d(TAG, "Icon resource not found for name " + iconName + ", using default.");
            return null;
        }
        return Integer.valueOf(identifier);
    }

    private final String getOptionalString(ReadableMap readableMap, String str) {
        if (!readableMap.hasKey(str) || readableMap.isNull(str)) {
            return null;
        }
        return readableMap.getString(str);
    }
}
