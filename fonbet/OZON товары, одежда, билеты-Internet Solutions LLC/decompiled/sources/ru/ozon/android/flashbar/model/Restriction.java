package ru.ozon.android.flashbar.model;

import B0.C2454a;
import C.o0;
import G.g;
import N3.C3660k;
import Nh.a;
import Sc.InterfaceC3999a;
import T7.P;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@j(generateAdapter = true)
@InterfaceC3999a
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001:\u0003IJKB\u009b\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0014\u0010\u0015B\u0091\u0001\b\u0017\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\u0004\b\u0014\u0010\u0016J\u009b\u0001\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001cJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001cJ\u0012\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b$\u0010\u001aJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001cJ\u0012\u0010&\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b&\u0010'J\u001e\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b*\u0010+J¨\u0001\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\b\u0017\u0010,J\u0010\u0010-\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b-\u0010\u001cJ\u0010\u0010/\u001a\u00020.HÖ\u0001¢\u0006\u0004\b/\u00100J\u001a\u00103\u001a\u0002022\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b3\u00104R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00105\u001a\u0004\b6\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00105\u001a\u0004\b7\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b8\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00105\u001a\u0004\b9\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00105\u001a\u0004\b:\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u00105\u001a\u0004\b;\u0010\u001cR\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010<\u0012\u0004\b>\u0010?\u001a\u0004\b=\u0010#R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010@\u001a\u0004\bA\u0010\u001aR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u00105\u001a\u0004\bB\u0010\u001cR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010C\u001a\u0004\bD\u0010'R%\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u0010E\u001a\u0004\bF\u0010)R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0013\u0010G\u001a\u0004\bH\u0010+¨\u0006L"}, d2 = {"Lru/ozon/android/flashbar/model/Restriction;", "", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "message", "image", "imageTintColor", "type", "lifetime", "Lru/ozon/android/flashbar/model/Restriction$ActionButton;", "actionButton", "Lru/ozon/android/flashbar/model/Restriction$Action;", "action", "context", "Lru/ozon/android/flashbar/model/Restriction$Progress;", "progress", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "button", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/android/flashbar/model/Restriction$ActionButton;Lru/ozon/android/flashbar/model/Restriction$Action;Ljava/lang/String;Lru/ozon/android/flashbar/model/Restriction$Progress;Ljava/util/Map;Ljava/lang/Object;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/android/flashbar/model/Restriction$ActionButton;Lru/ozon/android/flashbar/model/Restriction$Action;Ljava/lang/String;Lru/ozon/android/flashbar/model/Restriction$Progress;Ljava/util/Map;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/android/flashbar/model/Restriction$ActionButton;Lru/ozon/android/flashbar/model/Restriction$Action;Ljava/lang/String;Lru/ozon/android/flashbar/model/Restriction$Progress;Ljava/util/Map;)Lru/ozon/android/flashbar/model/Restriction;", "readAction", "()Lru/ozon/android/flashbar/model/Restriction$Action;", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "()Lru/ozon/android/flashbar/model/Restriction$ActionButton;", "component8", "component9", "component10", "()Lru/ozon/android/flashbar/model/Restriction$Progress;", "component11", "()Ljava/util/Map;", "component12", "()Ljava/lang/Object;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/android/flashbar/model/Restriction$ActionButton;Lru/ozon/android/flashbar/model/Restriction$Action;Ljava/lang/String;Lru/ozon/android/flashbar/model/Restriction$Progress;Ljava/util/Map;Ljava/lang/Object;)Lru/ozon/android/flashbar/model/Restriction;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getMessage", "getImage", "getImageTintColor", "getType", "getLifetime", "Lru/ozon/android/flashbar/model/Restriction$ActionButton;", "getActionButton", "getActionButton$annotations", "()V", "Lru/ozon/android/flashbar/model/Restriction$Action;", "getAction", "getContext", "Lru/ozon/android/flashbar/model/Restriction$Progress;", "getProgress", "Ljava/util/Map;", "getTrackingInfo", "Ljava/lang/Object;", "getButton", "Action", "ActionButton", "Progress", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class Restriction {
    public static final int $stable = 8;
    private final Action action;
    private final ActionButton actionButton;
    private final Object button;
    private final String context;
    private final String image;
    private final String imageTintColor;
    private final String lifetime;

    @NotNull
    private final String message;
    private final Progress progress;
    private final String title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @NotNull
    private final String type;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bHÆ\u0003JM\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lru/ozon/android/flashbar/model/Restriction$Action;", "", "deeplink", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "type", "widgetName", "refreshParams", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getDeeplink", "()Ljava/lang/String;", "getTitle", "getType", "getWidgetName", "getRefreshParams", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Action {
        public static final int $stable = 0;
        private final String deeplink;
        private final Map<String, String> refreshParams;

        @NotNull
        private final String title;

        @NotNull
        private final String type;
        private final String widgetName;

        public Action(String str, @NotNull String title, @NotNull String type, String str2, Map<String, String> map) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(type, "type");
            this.deeplink = str;
            this.title = title;
            this.type = type;
            this.widgetName = str2;
            this.refreshParams = map;
        }

        public static /* synthetic */ Action copy$default(Action action, String str, String str2, String str3, String str4, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = action.deeplink;
            }
            if ((i11 & 2) != 0) {
                str2 = action.title;
            }
            if ((i11 & 4) != 0) {
                str3 = action.type;
            }
            if ((i11 & 8) != 0) {
                str4 = action.widgetName;
            }
            if ((i11 & 16) != 0) {
                map = action.refreshParams;
            }
            Map map2 = map;
            String str5 = str3;
            return action.copy(str, str2, str5, str4, map2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getDeeplink() {
            return this.deeplink;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* renamed from: component4, reason: from getter */
        public final String getWidgetName() {
            return this.widgetName;
        }

        public final Map<String, String> component5() {
            return this.refreshParams;
        }

        @NotNull
        public final Action copy(String deeplink, @NotNull String title, @NotNull String type, String widgetName, Map<String, String> refreshParams) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(type, "type");
            return new Action(deeplink, title, type, widgetName, refreshParams);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Action)) {
                return false;
            }
            Action action = (Action) other;
            return Intrinsics.d(this.deeplink, action.deeplink) && Intrinsics.d(this.title, action.title) && Intrinsics.d(this.type, action.type) && Intrinsics.d(this.widgetName, action.widgetName) && Intrinsics.d(this.refreshParams, action.refreshParams);
        }

        public final String getDeeplink() {
            return this.deeplink;
        }

        public final Map<String, String> getRefreshParams() {
            return this.refreshParams;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        public final String getType() {
            return this.type;
        }

        public final String getWidgetName() {
            return this.widgetName;
        }

        public int hashCode() {
            String str = this.deeplink;
            int a11 = g.a(g.a((str == null ? 0 : str.hashCode()) * 31, 31, this.title), 31, this.type);
            String str2 = this.widgetName;
            int hashCode = (a11 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Map<String, String> map = this.refreshParams;
            return hashCode + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.deeplink;
            String str2 = this.title;
            String str3 = this.type;
            String str4 = this.widgetName;
            Map<String, String> map = this.refreshParams;
            StringBuilder d11 = C3660k.d("Action(deeplink=", str, ", title=", str2, ", type=");
            a.h(d11, str3, ", widgetName=", str4, ", refreshParams=");
            return P.f(d11, map, ")");
        }
    }

    @InterfaceC3999a
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lru/ozon/android/flashbar/model/Restriction$ActionButton;", "", "type", "", "actionButton", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "getType", "()Ljava/lang/String;", "getActionButton", "()Ljava/lang/Object;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class ActionButton {
        public static final int $stable = 8;
        private final Object actionButton;

        @NotNull
        private final String type;

        public ActionButton(@NotNull String type, @RestrictionActionButton Object obj) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.type = type;
            this.actionButton = obj;
        }

        public static /* synthetic */ ActionButton copy$default(ActionButton actionButton, String str, Object obj, int i11, Object obj2) {
            if ((i11 & 1) != 0) {
                str = actionButton.type;
            }
            if ((i11 & 2) != 0) {
                obj = actionButton.actionButton;
            }
            return actionButton.copy(str, obj);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* renamed from: component2, reason: from getter */
        public final Object getActionButton() {
            return this.actionButton;
        }

        @NotNull
        public final ActionButton copy(@NotNull String type, @RestrictionActionButton Object actionButton) {
            Intrinsics.checkNotNullParameter(type, "type");
            return new ActionButton(type, actionButton);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ActionButton)) {
                return false;
            }
            ActionButton actionButton = (ActionButton) other;
            return Intrinsics.d(this.type, actionButton.type) && Intrinsics.d(this.actionButton, actionButton.actionButton);
        }

        public final Object getActionButton() {
            return this.actionButton;
        }

        @NotNull
        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            int hashCode = this.type.hashCode() * 31;
            Object obj = this.actionButton;
            return hashCode + (obj == null ? 0 : obj.hashCode());
        }

        @NotNull
        public String toString() {
            return "ActionButton(type=" + this.type + ", actionButton=" + this.actionButton + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0017"}, d2 = {"Lru/ozon/android/flashbar/model/Restriction$Progress;", "", "text", "", "percent", "", "progressBarColor", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getText", "()Ljava/lang/String;", "getPercent", "()I", "getProgressBarColor", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Progress {
        public static final int $stable = 0;
        private final int percent;
        private final String progressBarColor;

        @NotNull
        private final String text;

        public Progress(@NotNull String text, int i11, String str) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.percent = i11;
            this.progressBarColor = str;
        }

        public static /* synthetic */ Progress copy$default(Progress progress, String str, int i11, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = progress.text;
            }
            if ((i12 & 2) != 0) {
                i11 = progress.percent;
            }
            if ((i12 & 4) != 0) {
                str2 = progress.progressBarColor;
            }
            return progress.copy(str, i11, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final int getPercent() {
            return this.percent;
        }

        /* renamed from: component3, reason: from getter */
        public final String getProgressBarColor() {
            return this.progressBarColor;
        }

        @NotNull
        public final Progress copy(@NotNull String text, int percent, String progressBarColor) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new Progress(text, percent, progressBarColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Progress)) {
                return false;
            }
            Progress progress = (Progress) other;
            return Intrinsics.d(this.text, progress.text) && this.percent == progress.percent && Intrinsics.d(this.progressBarColor, progress.progressBarColor);
        }

        public final int getPercent() {
            return this.percent;
        }

        public final String getProgressBarColor() {
            return this.progressBarColor;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            int a11 = C2454a.a(this.percent, this.text.hashCode() * 31, 31);
            String str = this.progressBarColor;
            return a11 + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            String str = this.text;
            int i11 = this.percent;
            return o0.c(C3660k.c(i11, "Progress(text=", str, ", percent=", ", progressBarColor="), this.progressBarColor, ")");
        }
    }

    public Restriction(String str, @NotNull String message, String str2, String str3, @NotNull String type, String str4, @i(name = "invalid") ActionButton actionButton, Action action, String str5, Progress progress, Map<String, TokenizedTrackingInfo> map, @i(name = "actionButton") @RestrictionActionButton Object obj) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(type, "type");
        this.title = str;
        this.message = message;
        this.image = str2;
        this.imageTintColor = str3;
        this.type = type;
        this.lifetime = str4;
        this.actionButton = actionButton;
        this.action = action;
        this.context = str5;
        this.progress = progress;
        this.trackingInfo = map;
        this.button = obj;
    }

    public static /* synthetic */ Restriction copy$default(Restriction restriction, String str, String str2, String str3, String str4, String str5, String str6, ActionButton actionButton, Action action, String str7, Progress progress, Map map, Object obj, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            str = restriction.title;
        }
        if ((i11 & 2) != 0) {
            str2 = restriction.message;
        }
        if ((i11 & 4) != 0) {
            str3 = restriction.image;
        }
        if ((i11 & 8) != 0) {
            str4 = restriction.imageTintColor;
        }
        if ((i11 & 16) != 0) {
            str5 = restriction.type;
        }
        if ((i11 & 32) != 0) {
            str6 = restriction.lifetime;
        }
        if ((i11 & 64) != 0) {
            actionButton = restriction.actionButton;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            action = restriction.action;
        }
        if ((i11 & 256) != 0) {
            str7 = restriction.context;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            progress = restriction.progress;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            map = restriction.trackingInfo;
        }
        if ((i11 & 2048) != 0) {
            obj = restriction.button;
        }
        Map map2 = map;
        Object obj3 = obj;
        String str8 = str7;
        Progress progress2 = progress;
        ActionButton actionButton2 = actionButton;
        Action action2 = action;
        String str9 = str5;
        String str10 = str6;
        return restriction.copy(str, str2, str3, str4, str9, str10, actionButton2, action2, str8, progress2, map2, obj3);
    }

    @InterfaceC3999a
    public static /* synthetic */ void getActionButton$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component10, reason: from getter */
    public final Progress getProgress() {
        return this.progress;
    }

    public final Map<String, TokenizedTrackingInfo> component11() {
        return this.trackingInfo;
    }

    /* renamed from: component12, reason: from getter */
    public final Object getButton() {
        return this.button;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: component3, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    /* renamed from: component4, reason: from getter */
    public final String getImageTintColor() {
        return this.imageTintColor;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component6, reason: from getter */
    public final String getLifetime() {
        return this.lifetime;
    }

    /* renamed from: component7, reason: from getter */
    public final ActionButton getActionButton() {
        return this.actionButton;
    }

    /* renamed from: component8, reason: from getter */
    public final Action getAction() {
        return this.action;
    }

    /* renamed from: component9, reason: from getter */
    public final String getContext() {
        return this.context;
    }

    @NotNull
    public final Restriction copy(String title, @NotNull String message, String image, String imageTintColor, @NotNull String type, String lifetime, @i(name = "invalid") ActionButton actionButton, Action action, String context, Progress progress, Map<String, TokenizedTrackingInfo> trackingInfo, @i(name = "actionButton") @RestrictionActionButton Object button) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(type, "type");
        return new Restriction(title, message, image, imageTintColor, type, lifetime, actionButton, action, context, progress, trackingInfo, button);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Restriction)) {
            return false;
        }
        Restriction restriction = (Restriction) other;
        return Intrinsics.d(this.title, restriction.title) && Intrinsics.d(this.message, restriction.message) && Intrinsics.d(this.image, restriction.image) && Intrinsics.d(this.imageTintColor, restriction.imageTintColor) && Intrinsics.d(this.type, restriction.type) && Intrinsics.d(this.lifetime, restriction.lifetime) && Intrinsics.d(this.actionButton, restriction.actionButton) && Intrinsics.d(this.action, restriction.action) && Intrinsics.d(this.context, restriction.context) && Intrinsics.d(this.progress, restriction.progress) && Intrinsics.d(this.trackingInfo, restriction.trackingInfo) && Intrinsics.d(this.button, restriction.button);
    }

    public final Action getAction() {
        return this.action;
    }

    public final ActionButton getActionButton() {
        return this.actionButton;
    }

    public final Object getButton() {
        return this.button;
    }

    public final String getContext() {
        return this.context;
    }

    public final String getImage() {
        return this.image;
    }

    public final String getImageTintColor() {
        return this.imageTintColor;
    }

    public final String getLifetime() {
        return this.lifetime;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    public final Progress getProgress() {
        return this.progress;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.title;
        int a11 = g.a((str == null ? 0 : str.hashCode()) * 31, 31, this.message);
        String str2 = this.image;
        int hashCode = (a11 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.imageTintColor;
        int a12 = g.a((hashCode + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.type);
        String str4 = this.lifetime;
        int hashCode2 = (a12 + (str4 == null ? 0 : str4.hashCode())) * 31;
        ActionButton actionButton = this.actionButton;
        int hashCode3 = (hashCode2 + (actionButton == null ? 0 : actionButton.hashCode())) * 31;
        Action action = this.action;
        int hashCode4 = (hashCode3 + (action == null ? 0 : action.hashCode())) * 31;
        String str5 = this.context;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Progress progress = this.progress;
        int hashCode6 = (hashCode5 + (progress == null ? 0 : progress.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode7 = (hashCode6 + (map == null ? 0 : map.hashCode())) * 31;
        Object obj = this.button;
        return hashCode7 + (obj != null ? obj.hashCode() : 0);
    }

    public final Action readAction() {
        Action action = this.action;
        if (action != null) {
            return action;
        }
        Object obj = this.button;
        if (obj instanceof Action) {
            return (Action) obj;
        }
        return null;
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.message;
        String str3 = this.image;
        String str4 = this.imageTintColor;
        String str5 = this.type;
        String str6 = this.lifetime;
        ActionButton actionButton = this.actionButton;
        Action action = this.action;
        String str7 = this.context;
        Progress progress = this.progress;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        Object obj = this.button;
        StringBuilder d11 = C3660k.d("Restriction(title=", str, ", message=", str2, ", image=");
        a.h(d11, str3, ", imageTintColor=", str4, ", type=");
        a.h(d11, str5, ", lifetime=", str6, ", actionButton=");
        d11.append(actionButton);
        d11.append(", action=");
        d11.append(action);
        d11.append(", context=");
        d11.append(str7);
        d11.append(", progress=");
        d11.append(progress);
        d11.append(", trackingInfo=");
        d11.append(map);
        d11.append(", button=");
        d11.append(obj);
        d11.append(")");
        return d11.toString();
    }

    public static /* synthetic */ Restriction copy$default(Restriction restriction, String str, String str2, String str3, String str4, String str5, String str6, ActionButton actionButton, Action action, String str7, Progress progress, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = restriction.title;
        }
        if ((i11 & 2) != 0) {
            str2 = restriction.message;
        }
        if ((i11 & 4) != 0) {
            str3 = restriction.image;
        }
        if ((i11 & 8) != 0) {
            str4 = restriction.imageTintColor;
        }
        if ((i11 & 16) != 0) {
            str5 = restriction.type;
        }
        if ((i11 & 32) != 0) {
            str6 = restriction.lifetime;
        }
        if ((i11 & 64) != 0) {
            actionButton = restriction.actionButton;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            action = restriction.action;
        }
        if ((i11 & 256) != 0) {
            str7 = restriction.context;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            progress = restriction.progress;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            map = restriction.trackingInfo;
        }
        Progress progress2 = progress;
        Map map2 = map;
        Action action2 = action;
        String str8 = str7;
        String str9 = str6;
        ActionButton actionButton2 = actionButton;
        String str10 = str5;
        String str11 = str3;
        return restriction.copy(str, str2, str11, str4, str10, str9, actionButton2, action2, str8, progress2, map2);
    }

    @InterfaceC3999a
    public final /* synthetic */ Restriction copy(String title, String message, String image, String imageTintColor, String type, String lifetime, ActionButton actionButton, Action action, String context, Progress progress, Map trackingInfo) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(type, "type");
        return copy(title, message, image, imageTintColor, type, lifetime, actionButton, action, context, progress, trackingInfo, this.button);
    }

    public /* synthetic */ Restriction(String str, String str2, String str3, String str4, String str5, String str6, ActionButton actionButton, Action action, String str7, Progress progress, Map map, Object obj, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, str5, (i11 & 32) != 0 ? null : str6, (i11 & 64) != 0 ? null : actionButton, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : action, (i11 & 256) != 0 ? null : str7, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : progress, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : map, (i11 & 2048) != 0 ? null : obj);
    }

    public /* synthetic */ Restriction(String str, String str2, String str3, String str4, String str5, String str6, ActionButton actionButton, Action action, String str7, Progress progress, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, str5, (i11 & 32) != 0 ? null : str6, (i11 & 64) != 0 ? null : actionButton, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : action, (i11 & 256) != 0 ? null : str7, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : progress, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : map);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC3999a
    public /* synthetic */ Restriction(String str, String message, String str2, String str3, String type, String str4, ActionButton actionButton, Action action, String str5, Progress progress, Map map) {
        this(str, message, str2, str3, type, str4, actionButton, action, str5, progress, map, null);
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(type, "type");
    }
}
