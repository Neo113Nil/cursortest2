package ru.ozon.uni.atoms.af;

import B0.A0;
import B0.C2454a;
import Bk.C2638a;
import E0.C2942q;
import G.g;
import Kk.C3532b;
import N3.C3660k;
import T7.P;
import Tg.b;
import V.e;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0017\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\"\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0001\u0012#$%&'()*+,-./01234¨\u00065"}, d2 = {"Lru/ozon/uni/atoms/af/AtomAction;", "LTg/b;", "<init>", "()V", "", "getId", "()Ljava/lang/String;", "id", "", "getParams", "()Ljava/util/Map;", "params", "CopyWithMutateTrackingInfo", "SendAnalytics", "HasUsageAnalytics", "Move", "InvalidAction", "Click", "TextChange", "OpenNestedPage", "OpenComposerNestedPage", "CurtainShowConfig", "Dismiss", "DismissAndScroll", "DismissRedirect", "DismissRefresh", "ScrollToWidget", "ScrollToWidgetByKey", "ComposerAction", "ActionSheet", "ViewAction", "IgnoreViewPoolViewAction", "Refresh", "ScrollPosition", "AppendPayloads", "Lru/ozon/uni/atoms/af/AtomAction$ActionSheet;", "Lru/ozon/uni/atoms/af/AtomAction$AppendPayloads;", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "Lru/ozon/uni/atoms/af/AtomAction$Dismiss;", "Lru/ozon/uni/atoms/af/AtomAction$DismissAndScroll;", "Lru/ozon/uni/atoms/af/AtomAction$DismissRedirect;", "Lru/ozon/uni/atoms/af/AtomAction$DismissRefresh;", "Lru/ozon/uni/atoms/af/AtomAction$IgnoreViewPoolViewAction;", "Lru/ozon/uni/atoms/af/AtomAction$InvalidAction;", "Lru/ozon/uni/atoms/af/AtomAction$Move;", "Lru/ozon/uni/atoms/af/AtomAction$OpenComposerNestedPage;", "Lru/ozon/uni/atoms/af/AtomAction$OpenNestedPage;", "Lru/ozon/uni/atoms/af/AtomAction$Refresh;", "Lru/ozon/uni/atoms/af/AtomAction$ScrollToWidget;", "Lru/ozon/uni/atoms/af/AtomAction$ScrollToWidgetByKey;", "Lru/ozon/uni/atoms/af/AtomAction$TextChange;", "Lru/ozon/uni/atoms/af/AtomAction$ViewAction;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class AtomAction implements b {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004BU\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n\u0018\u00010\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0011\u001a\u00020\u00002\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012Jb\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b!\u0010\u0016R(\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010$R(\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b%\u0010$R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lru/ozon/uni/atoms/af/AtomAction$ActionSheet;", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/uni/atoms/af/AtomAction$SendAnalytics;", "Lru/ozon/uni/atoms/af/AtomAction$CopyWithMutateTrackingInfo;", "Lru/ozon/uni/atoms/af/AtomAction$HasUsageAnalytics;", "", "id", "actionName", "", "params", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "Lru/ozon/uni/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;", "usageAnalytics", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lru/ozon/uni/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;)V", "newTrackingInfo", "mutateTrackingInfo", "(Ljava/util/Map;)Lru/ozon/uni/atoms/af/AtomAction$ActionSheet;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lru/ozon/uni/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;)Lru/ozon/uni/atoms/af/AtomAction$ActionSheet;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getActionName", "Ljava/util/Map;", "getParams", "()Ljava/util/Map;", "getTrackingInfo", "Lru/ozon/uni/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;", "getUsageAnalytics", "()Lru/ozon/uni/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final /* data */ class ActionSheet extends AtomAction implements SendAnalytics, CopyWithMutateTrackingInfo, HasUsageAnalytics {

        @NotNull
        private final String actionName;
        private final String id;
        private final Map<String, String> params;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;
        private final HasUsageAnalytics.UsageAnalytics usageAnalytics;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionSheet(String str, @NotNull String actionName, Map<String, String> map, Map<String, TokenizedTrackingInfo> map2, HasUsageAnalytics.UsageAnalytics usageAnalytics) {
            super(null);
            Intrinsics.checkNotNullParameter(actionName, "actionName");
            this.id = str;
            this.actionName = actionName;
            this.params = map;
            this.trackingInfo = map2;
            this.usageAnalytics = usageAnalytics;
        }

        public static /* synthetic */ ActionSheet copy$default(ActionSheet actionSheet, String str, String str2, Map map, Map map2, HasUsageAnalytics.UsageAnalytics usageAnalytics, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = actionSheet.id;
            }
            if ((i11 & 2) != 0) {
                str2 = actionSheet.actionName;
            }
            if ((i11 & 4) != 0) {
                map = actionSheet.params;
            }
            if ((i11 & 8) != 0) {
                map2 = actionSheet.trackingInfo;
            }
            if ((i11 & 16) != 0) {
                usageAnalytics = actionSheet.usageAnalytics;
            }
            HasUsageAnalytics.UsageAnalytics usageAnalytics2 = usageAnalytics;
            Map map3 = map;
            return actionSheet.copy(str, str2, map3, map2, usageAnalytics2);
        }

        @NotNull
        public final ActionSheet copy(String id2, @NotNull String actionName, Map<String, String> params, Map<String, TokenizedTrackingInfo> trackingInfo, HasUsageAnalytics.UsageAnalytics usageAnalytics) {
            Intrinsics.checkNotNullParameter(actionName, "actionName");
            return new ActionSheet(id2, actionName, params, trackingInfo, usageAnalytics);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ActionSheet)) {
                return false;
            }
            ActionSheet actionSheet = (ActionSheet) other;
            return Intrinsics.d(this.id, actionSheet.id) && Intrinsics.d(this.actionName, actionSheet.actionName) && Intrinsics.d(this.params, actionSheet.params) && Intrinsics.d(this.trackingInfo, actionSheet.trackingInfo) && Intrinsics.d(this.usageAnalytics, actionSheet.usageAnalytics);
        }

        @NotNull
        public final String getActionName() {
            return this.actionName;
        }

        @Override // ru.ozon.uni.atoms.af.AtomAction, Tg.b
        public String getId() {
            return this.id;
        }

        @Override // ru.ozon.uni.atoms.af.AtomAction
        public Map<String, String> getParams() {
            return this.params;
        }

        @Override // ru.ozon.uni.atoms.af.AtomAction.SendAnalytics
        public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        @Override // ru.ozon.uni.atoms.af.AtomAction.HasUsageAnalytics
        public HasUsageAnalytics.UsageAnalytics getUsageAnalytics() {
            return this.usageAnalytics;
        }

        public int hashCode() {
            String str = this.id;
            int a11 = g.a((str == null ? 0 : str.hashCode()) * 31, 31, this.actionName);
            Map<String, String> map = this.params;
            int hashCode = (a11 + (map == null ? 0 : map.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map2 = this.trackingInfo;
            int hashCode2 = (hashCode + (map2 == null ? 0 : map2.hashCode())) * 31;
            HasUsageAnalytics.UsageAnalytics usageAnalytics = this.usageAnalytics;
            return hashCode2 + (usageAnalytics != null ? usageAnalytics.hashCode() : 0);
        }

        @Override // ru.ozon.uni.atoms.af.AtomAction.CopyWithMutateTrackingInfo
        public /* bridge */ /* synthetic */ AtomAction mutateTrackingInfo(Map map) {
            return mutateTrackingInfo((Map<String, TokenizedTrackingInfo>) map);
        }

        @NotNull
        public String toString() {
            String str = this.id;
            String str2 = this.actionName;
            Map<String, String> map = this.params;
            Map<String, TokenizedTrackingInfo> map2 = this.trackingInfo;
            HasUsageAnalytics.UsageAnalytics usageAnalytics = this.usageAnalytics;
            StringBuilder d11 = C3660k.d("ActionSheet(id=", str, ", actionName=", str2, ", params=");
            Tl.b.g(d11, map, ", trackingInfo=", map2, ", usageAnalytics=");
            d11.append(usageAnalytics);
            d11.append(")");
            return d11.toString();
        }

        @Override // ru.ozon.uni.atoms.af.AtomAction.CopyWithMutateTrackingInfo
        @NotNull
        public ActionSheet mutateTrackingInfo(Map<String, TokenizedTrackingInfo> newTrackingInfo) {
            return copy$default(this, null, null, null, newTrackingInfo, null, 23, null);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R#\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\t¨\u0006\u0017"}, d2 = {"Lru/ozon/uni/atoms/af/AtomAction$AppendPayloads;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "", "payloads", "id", "<init>", "(Ljava/util/Map;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "getPayloads", "()Ljava/util/Map;", "Ljava/lang/String;", "getId", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final /* data */ class AppendPayloads extends AtomAction {
        private final String id;

        @NotNull
        private final Map<String, String> payloads;

        public /* synthetic */ AppendPayloads(Map map, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(map, (i11 & 2) != 0 ? null : str);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AppendPayloads)) {
                return false;
            }
            AppendPayloads appendPayloads = (AppendPayloads) other;
            return Intrinsics.d(this.payloads, appendPayloads.payloads) && Intrinsics.d(this.id, appendPayloads.id);
        }

        @Override // ru.ozon.uni.atoms.af.AtomAction, Tg.b
        public String getId() {
            return this.id;
        }

        @NotNull
        public final Map<String, String> getPayloads() {
            return this.payloads;
        }

        public int hashCode() {
            int hashCode = this.payloads.hashCode() * 31;
            String str = this.id;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            return "AppendPayloads(payloads=" + this.payloads + ", id=" + this.id + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AppendPayloads(@NotNull Map<String, String> payloads, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(payloads, "payloads");
            this.payloads = payloads;
            this.id = str;
        }
    }

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004Bc\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\n\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\n\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011BY\b\u0016\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\n\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\u0004\b\u0010\u0010\u0012J%\u0010\u0014\u001a\u00020\u00002\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0015Jp\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\n2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b$\u0010\u0019R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010%\u0012\u0004\b(\u0010)\u001a\u0004\b&\u0010'R(\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b+\u0010,R(\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010*\u001a\u0004\b-\u0010,R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010.\u001a\u0004\b/\u00100¨\u00061"}, d2 = {"Lru/ozon/uni/atoms/af/AtomAction$Click;", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/uni/atoms/af/AtomAction$SendAnalytics;", "Lru/ozon/uni/atoms/af/AtomAction$CopyWithMutateTrackingInfo;", "Lru/ozon/uni/atoms/af/AtomAction$HasUsageAnalytics;", "", "id", "link", "Lru/ozon/uni/atoms/data/AtomDTO;", "dto", "", "params", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "Lru/ozon/uni/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;", "usageAnalytics", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomDTO;Ljava/util/Map;Ljava/util/Map;Lru/ozon/uni/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;)V", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomDTO;Ljava/util/Map;Ljava/util/Map;)V", "newTrackingInfo", "mutateTrackingInfo", "(Ljava/util/Map;)Lru/ozon/uni/atoms/af/AtomAction$Click;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomDTO;Ljava/util/Map;Ljava/util/Map;Lru/ozon/uni/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;)Lru/ozon/uni/atoms/af/AtomAction$Click;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getLink", "Lru/ozon/uni/atoms/data/AtomDTO;", "getDto", "()Lru/ozon/uni/atoms/data/AtomDTO;", "getDto$annotations", "()V", "Ljava/util/Map;", "getParams", "()Ljava/util/Map;", "getTrackingInfo", "Lru/ozon/uni/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;", "getUsageAnalytics", "()Lru/ozon/uni/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Click extends AtomAction implements SendAnalytics, CopyWithMutateTrackingInfo, HasUsageAnalytics {
        public static final int $stable = 8;
        private final AtomDTO dto;
        private final String id;
        private final String link;
        private final Map<String, String> params;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;
        private final HasUsageAnalytics.UsageAnalytics usageAnalytics;

        public Click(String str, String str2, AtomDTO atomDTO, Map<String, String> map, Map<String, TokenizedTrackingInfo> map2, HasUsageAnalytics.UsageAnalytics usageAnalytics) {
            super(null);
            this.id = str;
            this.link = str2;
            this.dto = atomDTO;
            this.params = map;
            this.trackingInfo = map2;
            this.usageAnalytics = usageAnalytics;
        }

        public static /* synthetic */ Click copy$default(Click click, String str, String str2, AtomDTO atomDTO, Map map, Map map2, HasUsageAnalytics.UsageAnalytics usageAnalytics, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = click.id;
            }
            if ((i11 & 2) != 0) {
                str2 = click.link;
            }
            if ((i11 & 4) != 0) {
                atomDTO = click.dto;
            }
            if ((i11 & 8) != 0) {
                map = click.params;
            }
            if ((i11 & 16) != 0) {
                map2 = click.trackingInfo;
            }
            if ((i11 & 32) != 0) {
                usageAnalytics = click.usageAnalytics;
            }
            Map map3 = map2;
            HasUsageAnalytics.UsageAnalytics usageAnalytics2 = usageAnalytics;
            return click.copy(str, str2, atomDTO, map, map3, usageAnalytics2);
        }

        @NotNull
        public final Click copy(String id2, String link, AtomDTO dto, Map<String, String> params, Map<String, TokenizedTrackingInfo> trackingInfo, HasUsageAnalytics.UsageAnalytics usageAnalytics) {
            return new Click(id2, link, dto, params, trackingInfo, usageAnalytics);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Click)) {
                return false;
            }
            Click click = (Click) other;
            return Intrinsics.d(this.id, click.id) && Intrinsics.d(this.link, click.link) && Intrinsics.d(this.dto, click.dto) && Intrinsics.d(this.params, click.params) && Intrinsics.d(this.trackingInfo, click.trackingInfo) && Intrinsics.d(this.usageAnalytics, click.usageAnalytics);
        }

        public final AtomDTO getDto() {
            return this.dto;
        }

        @Override // ru.ozon.uni.atoms.af.AtomAction, Tg.b
        public String getId() {
            return this.id;
        }

        public final String getLink() {
            return this.link;
        }

        @Override // ru.ozon.uni.atoms.af.AtomAction
        public Map<String, String> getParams() {
            return this.params;
        }

        @Override // ru.ozon.uni.atoms.af.AtomAction.SendAnalytics
        public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        @Override // ru.ozon.uni.atoms.af.AtomAction.HasUsageAnalytics
        public HasUsageAnalytics.UsageAnalytics getUsageAnalytics() {
            return this.usageAnalytics;
        }

        public int hashCode() {
            String str = this.id;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.link;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            AtomDTO atomDTO = this.dto;
            int hashCode3 = (hashCode2 + (atomDTO == null ? 0 : atomDTO.hashCode())) * 31;
            Map<String, String> map = this.params;
            int hashCode4 = (hashCode3 + (map == null ? 0 : map.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map2 = this.trackingInfo;
            int hashCode5 = (hashCode4 + (map2 == null ? 0 : map2.hashCode())) * 31;
            HasUsageAnalytics.UsageAnalytics usageAnalytics = this.usageAnalytics;
            return hashCode5 + (usageAnalytics != null ? usageAnalytics.hashCode() : 0);
        }

        @Override // ru.ozon.uni.atoms.af.AtomAction.CopyWithMutateTrackingInfo
        public /* bridge */ /* synthetic */ AtomAction mutateTrackingInfo(Map map) {
            return mutateTrackingInfo((Map<String, TokenizedTrackingInfo>) map);
        }

        @NotNull
        public String toString() {
            String str = this.id;
            String str2 = this.link;
            AtomDTO atomDTO = this.dto;
            Map<String, String> map = this.params;
            Map<String, TokenizedTrackingInfo> map2 = this.trackingInfo;
            HasUsageAnalytics.UsageAnalytics usageAnalytics = this.usageAnalytics;
            StringBuilder d11 = C3660k.d("Click(id=", str, ", link=", str2, ", dto=");
            d11.append(atomDTO);
            d11.append(", params=");
            d11.append(map);
            d11.append(", trackingInfo=");
            d11.append(map2);
            d11.append(", usageAnalytics=");
            d11.append(usageAnalytics);
            d11.append(")");
            return d11.toString();
        }

        @Override // ru.ozon.uni.atoms.af.AtomAction.CopyWithMutateTrackingInfo
        @NotNull
        public Click mutateTrackingInfo(Map<String, TokenizedTrackingInfo> newTrackingInfo) {
            return copy$default(this, null, null, null, null, newTrackingInfo, null, 47, null);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ Click(String str, String str2, AtomDTO atomDTO, Map map, Map map2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, atomDTO, r6, r7);
            Map map3;
            Map map4;
            str = (i11 & 1) != 0 ? null : str;
            atomDTO = (i11 & 4) != 0 ? null : atomDTO;
            if ((i11 & 8) != 0) {
                map3 = map2;
                map4 = null;
            } else {
                map3 = map2;
                map4 = map;
            }
        }

        public Click(String str, String str2, AtomDTO atomDTO, Map<String, String> map, Map<String, TokenizedTrackingInfo> map2) {
            this(str, str2, atomDTO, map, map2, null);
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004BU\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n\u0018\u00010\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0011\u001a\u00020\u00002\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012Jb\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b!\u0010\u0016R(\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010$R(\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b%\u0010$R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/uni/atoms/af/AtomAction$SendAnalytics;", "Lru/ozon/uni/atoms/af/AtomAction$CopyWithMutateTrackingInfo;", "Lru/ozon/uni/atoms/af/AtomAction$HasUsageAnalytics;", "", "id", "actionName", "", "params", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "Lru/ozon/uni/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;", "usageAnalytics", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lru/ozon/uni/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;)V", "newTrackingInfo", "mutateTrackingInfo", "(Ljava/util/Map;)Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lru/ozon/uni/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;)Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getActionName", "Ljava/util/Map;", "getParams", "()Ljava/util/Map;", "getTrackingInfo", "Lru/ozon/uni/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;", "getUsageAnalytics", "()Lru/ozon/uni/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ComposerAction extends AtomAction implements SendAnalytics, CopyWithMutateTrackingInfo, HasUsageAnalytics {
        public static final int $stable = 8;

        @NotNull
        private final String actionName;
        private final String id;
        private final Map<String, String> params;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;
        private final HasUsageAnalytics.UsageAnalytics usageAnalytics;

        public /* synthetic */ ComposerAction(String str, String str2, Map map, Map map2, HasUsageAnalytics.UsageAnalytics usageAnalytics, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, str2, (i11 & 4) != 0 ? null : map, map2, (i11 & 16) != 0 ? null : usageAnalytics);
        }

        public static /* synthetic */ ComposerAction copy$default(ComposerAction composerAction, String str, String str2, Map map, Map map2, HasUsageAnalytics.UsageAnalytics usageAnalytics, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = composerAction.id;
            }
            if ((i11 & 2) != 0) {
                str2 = composerAction.actionName;
            }
            if ((i11 & 4) != 0) {
                map = composerAction.params;
            }
            if ((i11 & 8) != 0) {
                map2 = composerAction.trackingInfo;
            }
            if ((i11 & 16) != 0) {
                usageAnalytics = composerAction.usageAnalytics;
            }
            HasUsageAnalytics.UsageAnalytics usageAnalytics2 = usageAnalytics;
            Map map3 = map;
            return composerAction.copy(str, str2, map3, map2, usageAnalytics2);
        }

        @NotNull
        public final ComposerAction copy(String id2, @NotNull String actionName, Map<String, String> params, Map<String, TokenizedTrackingInfo> trackingInfo, HasUsageAnalytics.UsageAnalytics usageAnalytics) {
            Intrinsics.checkNotNullParameter(actionName, "actionName");
            return new ComposerAction(id2, actionName, params, trackingInfo, usageAnalytics);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ComposerAction)) {
                return false;
            }
            ComposerAction composerAction = (ComposerAction) other;
            return Intrinsics.d(this.id, composerAction.id) && Intrinsics.d(this.actionName, composerAction.actionName) && Intrinsics.d(this.params, composerAction.params) && Intrinsics.d(this.trackingInfo, composerAction.trackingInfo) && Intrinsics.d(this.usageAnalytics, composerAction.usageAnalytics);
        }

        @NotNull
        public final String getActionName() {
            return this.actionName;
        }

        @Override // ru.ozon.uni.atoms.af.AtomAction, Tg.b
        public String getId() {
            return this.id;
        }

        @Override // ru.ozon.uni.atoms.af.AtomAction
        public Map<String, String> getParams() {
            return this.params;
        }

        @Override // ru.ozon.uni.atoms.af.AtomAction.SendAnalytics
        public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        @Override // ru.ozon.uni.atoms.af.AtomAction.HasUsageAnalytics
        public HasUsageAnalytics.UsageAnalytics getUsageAnalytics() {
            return this.usageAnalytics;
        }

        public int hashCode() {
            String str = this.id;
            int a11 = g.a((str == null ? 0 : str.hashCode()) * 31, 31, this.actionName);
            Map<String, String> map = this.params;
            int hashCode = (a11 + (map == null ? 0 : map.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map2 = this.trackingInfo;
            int hashCode2 = (hashCode + (map2 == null ? 0 : map2.hashCode())) * 31;
            HasUsageAnalytics.UsageAnalytics usageAnalytics = this.usageAnalytics;
            return hashCode2 + (usageAnalytics != null ? usageAnalytics.hashCode() : 0);
        }

        @Override // ru.ozon.uni.atoms.af.AtomAction.CopyWithMutateTrackingInfo
        public /* bridge */ /* synthetic */ AtomAction mutateTrackingInfo(Map map) {
            return mutateTrackingInfo((Map<String, TokenizedTrackingInfo>) map);
        }

        @NotNull
        public String toString() {
            String str = this.id;
            String str2 = this.actionName;
            Map<String, String> map = this.params;
            Map<String, TokenizedTrackingInfo> map2 = this.trackingInfo;
            HasUsageAnalytics.UsageAnalytics usageAnalytics = this.usageAnalytics;
            StringBuilder d11 = C3660k.d("ComposerAction(id=", str, ", actionName=", str2, ", params=");
            Tl.b.g(d11, map, ", trackingInfo=", map2, ", usageAnalytics=");
            d11.append(usageAnalytics);
            d11.append(")");
            return d11.toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ComposerAction(String str, @NotNull String actionName, Map<String, String> map, Map<String, TokenizedTrackingInfo> map2, HasUsageAnalytics.UsageAnalytics usageAnalytics) {
            super(null);
            Intrinsics.checkNotNullParameter(actionName, "actionName");
            this.id = str;
            this.actionName = actionName;
            this.params = map;
            this.trackingInfo = map2;
            this.usageAnalytics = usageAnalytics;
        }

        @Override // ru.ozon.uni.atoms.af.AtomAction.CopyWithMutateTrackingInfo
        @NotNull
        public ComposerAction mutateTrackingInfo(Map<String, TokenizedTrackingInfo> newTrackingInfo) {
            return copy$default(this, null, null, null, newTrackingInfo, null, 23, null);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005H&¨\u0006\b"}, d2 = {"Lru/ozon/uni/atoms/af/AtomAction$CopyWithMutateTrackingInfo;", "", "mutateTrackingInfo", "Lru/ozon/uni/atoms/af/AtomAction;", "newTrackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface CopyWithMutateTrackingInfo {
        @NotNull
        AtomAction mutateTrackingInfo(Map<String, TokenizedTrackingInfo> newTrackingInfo);
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lru/ozon/uni/atoms/af/AtomAction$CurtainShowConfig;", "", "<init>", "()V", "None", "Full", "Wrap", "Ratio", "Lru/ozon/uni/atoms/af/AtomAction$CurtainShowConfig$Full;", "Lru/ozon/uni/atoms/af/AtomAction$CurtainShowConfig$None;", "Lru/ozon/uni/atoms/af/AtomAction$CurtainShowConfig$Ratio;", "Lru/ozon/uni/atoms/af/AtomAction$CurtainShowConfig$Wrap;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class CurtainShowConfig {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/uni/atoms/af/AtomAction$CurtainShowConfig$Full;", "Lru/ozon/uni/atoms/af/AtomAction$CurtainShowConfig;", "<init>", "()V", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Full extends CurtainShowConfig {

            @NotNull
            public static final Full INSTANCE = new Full();

            private Full() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/uni/atoms/af/AtomAction$CurtainShowConfig$None;", "Lru/ozon/uni/atoms/af/AtomAction$CurtainShowConfig;", "<init>", "()V", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class None extends CurtainShowConfig {

            @NotNull
            public static final None INSTANCE = new None();

            private None() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/uni/atoms/af/AtomAction$CurtainShowConfig$Ratio;", "Lru/ozon/uni/atoms/af/AtomAction$CurtainShowConfig;", "", "ratio", "<init>", "(F)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getRatio", "()F", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final /* data */ class Ratio extends CurtainShowConfig {
            private final float ratio;

            public Ratio(float f7) {
                super(null);
                this.ratio = f7;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Ratio) && Float.compare(this.ratio, ((Ratio) other).ratio) == 0;
            }

            public int hashCode() {
                return Float.hashCode(this.ratio);
            }

            @NotNull
            public String toString() {
                return C2942q.b(this.ratio, "Ratio(ratio=", ")");
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/uni/atoms/af/AtomAction$CurtainShowConfig$Wrap;", "Lru/ozon/uni/atoms/af/AtomAction$CurtainShowConfig;", "", "minimumHeight", "<init>", "(Ljava/lang/Integer;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getMinimumHeight", "()Ljava/lang/Integer;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Wrap extends CurtainShowConfig {
            private final Integer minimumHeight;

            /* JADX WARN: Multi-variable type inference failed */
            public Wrap() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Wrap) && Intrinsics.d(this.minimumHeight, ((Wrap) other).minimumHeight);
            }

            public final Integer getMinimumHeight() {
                return this.minimumHeight;
            }

            public int hashCode() {
                Integer num = this.minimumHeight;
                if (num == null) {
                    return 0;
                }
                return num.hashCode();
            }

            @NotNull
            public String toString() {
                return "Wrap(minimumHeight=" + this.minimumHeight + ")";
            }

            public Wrap(Integer num) {
                super(null);
                this.minimumHeight = num;
            }

            public /* synthetic */ Wrap(Integer num, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? null : num);
            }
        }

        public /* synthetic */ CurtainShowConfig(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CurtainShowConfig() {
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005BM\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0011\u001a\u00020\u00002\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012JX\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u0016R(\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010#R(\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b$\u0010#R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/ozon/uni/atoms/af/AtomAction$Dismiss;", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/uni/atoms/af/AtomAction$SendAnalytics;", "Lru/ozon/uni/atoms/af/AtomAction$CopyWithMutateTrackingInfo;", "Lru/ozon/uni/atoms/af/AtomAction$HasUsageAnalytics;", "LTg/b$a;", "", "id", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "params", "Lru/ozon/uni/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;", "usageAnalytics", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lru/ozon/uni/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;)V", "newTrackingInfo", "mutateTrackingInfo", "(Ljava/util/Map;)Lru/ozon/uni/atoms/af/AtomAction$Dismiss;", "copy", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lru/ozon/uni/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;)Lru/ozon/uni/atoms/af/AtomAction$Dismiss;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "getParams", "Lru/ozon/uni/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;", "getUsageAnalytics", "()Lru/ozon/uni/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Dismiss extends AtomAction implements SendAnalytics, CopyWithMutateTrackingInfo, HasUsageAnalytics, b.a {
        private final String id;
        private final Map<String, String> params;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;
        private final HasUsageAnalytics.UsageAnalytics usageAnalytics;

        public /* synthetic */ Dismiss(String str, Map map, Map map2, HasUsageAnalytics.UsageAnalytics usageAnalytics, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, map, (i11 & 4) != 0 ? null : map2, (i11 & 8) != 0 ? null : usageAnalytics);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Dismiss copy$default(Dismiss dismiss, String str, Map map, Map map2, HasUsageAnalytics.UsageAnalytics usageAnalytics, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = dismiss.id;
            }
            if ((i11 & 2) != 0) {
                map = dismiss.trackingInfo;
            }
            if ((i11 & 4) != 0) {
                map2 = dismiss.params;
            }
            if ((i11 & 8) != 0) {
                usageAnalytics = dismiss.usageAnalytics;
            }
            return dismiss.copy(str, map, map2, usageAnalytics);
        }

        @NotNull
        public final Dismiss copy(String id2, Map<String, TokenizedTrackingInfo> trackingInfo, Map<String, String> params, HasUsageAnalytics.UsageAnalytics usageAnalytics) {
            return new Dismiss(id2, trackingInfo, params, usageAnalytics);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Dismiss)) {
                return false;
            }
            Dismiss dismiss = (Dismiss) other;
            return Intrinsics.d(this.id, dismiss.id) && Intrinsics.d(this.trackingInfo, dismiss.trackingInfo) && Intrinsics.d(this.params, dismiss.params) && Intrinsics.d(this.usageAnalytics, dismiss.usageAnalytics);
        }

        @Override // ru.ozon.uni.atoms.af.AtomAction, Tg.b
        public String getId() {
            return this.id;
        }

        @Override // ru.ozon.uni.atoms.af.AtomAction
        public Map<String, String> getParams() {
            return this.params;
        }

        @Override // ru.ozon.uni.atoms.af.AtomAction.SendAnalytics
        public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        @Override // ru.ozon.uni.atoms.af.AtomAction.HasUsageAnalytics
        public HasUsageAnalytics.UsageAnalytics getUsageAnalytics() {
            return this.usageAnalytics;
        }

        public int hashCode() {
            String str = this.id;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
            Map<String, String> map2 = this.params;
            int hashCode3 = (hashCode2 + (map2 == null ? 0 : map2.hashCode())) * 31;
            HasUsageAnalytics.UsageAnalytics usageAnalytics = this.usageAnalytics;
            return hashCode3 + (usageAnalytics != null ? usageAnalytics.hashCode() : 0);
        }

        @Override // ru.ozon.uni.atoms.af.AtomAction.CopyWithMutateTrackingInfo
        public /* bridge */ /* synthetic */ AtomAction mutateTrackingInfo(Map map) {
            return mutateTrackingInfo((Map<String, TokenizedTrackingInfo>) map);
        }

        @NotNull
        public String toString() {
            return "Dismiss(id=" + this.id + ", trackingInfo=" + this.trackingInfo + ", params=" + this.params + ", usageAnalytics=" + this.usageAnalytics + ")";
        }

        public Dismiss(String str, Map<String, TokenizedTrackingInfo> map, Map<String, String> map2, HasUsageAnalytics.UsageAnalytics usageAnalytics) {
            super(null);
            this.id = str;
            this.trackingInfo = map;
            this.params = map2;
            this.usageAnalytics = usageAnalytics;
        }

        @Override // ru.ozon.uni.atoms.af.AtomAction.CopyWithMutateTrackingInfo
        @NotNull
        public Dismiss mutateTrackingInfo(Map<String, TokenizedTrackingInfo> newTrackingInfo) {
            return copy$default(this, null, newTrackingInfo, null, null, 13, null);
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004BW\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0011\u001a\u00020\u00002\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012Jd\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u0016R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b!\u0010\u0016R(\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b&\u0010'R(\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\"\u001a\u0004\b(\u0010$¨\u0006)"}, d2 = {"Lru/ozon/uni/atoms/af/AtomAction$DismissAndScroll;", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/uni/atoms/af/AtomAction$SendAnalytics;", "Lru/ozon/uni/atoms/af/AtomAction$CopyWithMutateTrackingInfo;", "Lru/ozon/uni/atoms/af/AtomAction$HasUsageAnalytics;", "", "id", "link", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "Lru/ozon/uni/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;", "usageAnalytics", "params", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lru/ozon/uni/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;Ljava/util/Map;)V", "newTrackingInfo", "mutateTrackingInfo", "(Ljava/util/Map;)Lru/ozon/uni/atoms/af/AtomAction$DismissAndScroll;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lru/ozon/uni/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;Ljava/util/Map;)Lru/ozon/uni/atoms/af/AtomAction$DismissAndScroll;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getLink", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "Lru/ozon/uni/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;", "getUsageAnalytics", "()Lru/ozon/uni/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;", "getParams", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final /* data */ class DismissAndScroll extends AtomAction implements SendAnalytics, CopyWithMutateTrackingInfo, HasUsageAnalytics {
        private final String id;
        private final String link;
        private final Map<String, String> params;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;
        private final HasUsageAnalytics.UsageAnalytics usageAnalytics;

        public DismissAndScroll(String str, String str2, Map<String, TokenizedTrackingInfo> map, HasUsageAnalytics.UsageAnalytics usageAnalytics, Map<String, String> map2) {
            super(null);
            this.id = str;
            this.link = str2;
            this.trackingInfo = map;
            this.usageAnalytics = usageAnalytics;
            this.params = map2;
        }

        public static /* synthetic */ DismissAndScroll copy$default(DismissAndScroll dismissAndScroll, String str, String str2, Map map, HasUsageAnalytics.UsageAnalytics usageAnalytics, Map map2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = dismissAndScroll.id;
            }
            if ((i11 & 2) != 0) {
                str2 = dismissAndScroll.link;
            }
            if ((i11 & 4) != 0) {
                map = dismissAndScroll.trackingInfo;
            }
            if ((i11 & 8) != 0) {
                usageAnalytics = dismissAndScroll.usageAnalytics;
            }
            if ((i11 & 16) != 0) {
                map2 = dismissAndScroll.params;
            }
            Map map3 = map2;
            Map map4 = map;
            return dismissAndScroll.copy(str, str2, map4, usageAnalytics, map3);
        }

        @NotNull
        public final DismissAndScroll copy(String id2, String link, Map<String, TokenizedTrackingInfo> trackingInfo, HasUsageAnalytics.UsageAnalytics usageAnalytics, Map<String, String> params) {
            return new DismissAndScroll(id2, link, trackingInfo, usageAnalytics, params);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DismissAndScroll)) {
                return false;
            }
            DismissAndScroll dismissAndScroll = (DismissAndScroll) other;
            return Intrinsics.d(this.id, dismissAndScroll.id) && Intrinsics.d(this.link, dismissAndScroll.link) && Intrinsics.d(this.trackingInfo, dismissAndScroll.trackingInfo) && Intrinsics.d(this.usageAnalytics, dismissAndScroll.usageAnalytics) && Intrinsics.d(this.params, dismissAndScroll.params);
        }

        @Override // ru.ozon.uni.atoms.af.AtomAction, Tg.b
        public String getId() {
            return this.id;
        }

        public final String getLink() {
            return this.link;
        }

        @Override // ru.ozon.uni.atoms.af.AtomAction
        public Map<String, String> getParams() {
            return this.params;
        }

        @Override // ru.ozon.uni.atoms.af.AtomAction.SendAnalytics
        public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        @Override // ru.ozon.uni.atoms.af.AtomAction.HasUsageAnalytics
        public HasUsageAnalytics.UsageAnalytics getUsageAnalytics() {
            return this.usageAnalytics;
        }

        public int hashCode() {
            String str = this.id;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.link;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            int hashCode3 = (hashCode2 + (map == null ? 0 : map.hashCode())) * 31;
            HasUsageAnalytics.UsageAnalytics usageAnalytics = this.usageAnalytics;
            int hashCode4 = (hashCode3 + (usageAnalytics == null ? 0 : usageAnalytics.hashCode())) * 31;
            Map<String, String> map2 = this.params;
            return hashCode4 + (map2 != null ? map2.hashCode() : 0);
        }

        @Override // ru.ozon.uni.atoms.af.AtomAction.CopyWithMutateTrackingInfo
        public /* bridge */ /* synthetic */ AtomAction mutateTrackingInfo(Map map) {
            return mutateTrackingInfo((Map<String, TokenizedTrackingInfo>) map);
        }

        @NotNull
        public String toString() {
            String str = this.id;
            String str2 = this.link;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            HasUsageAnalytics.UsageAnalytics usageAnalytics = this.usageAnalytics;
            Map<String, String> map2 = this.params;
            StringBuilder d11 = C3660k.d("DismissAndScroll(id=", str, ", link=", str2, ", trackingInfo=");
            d11.append(map);
            d11.append(", usageAnalytics=");
            d11.append(usageAnalytics);
            d11.append(", params=");
            return P.f(d11, map2, ")");
        }

        @Override // ru.ozon.uni.atoms.af.AtomAction.CopyWithMutateTrackingInfo
        @NotNull
        public DismissAndScroll mutateTrackingInfo(Map<String, TokenizedTrackingInfo> newTrackingInfo) {
            return copy$default(this, null, null, newTrackingInfo, null, null, 27, null);
        }
    }

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005BW\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0012\u001a\u00020\u00002\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013Jd\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u0017R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b\"\u0010\u0017R(\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b$\u0010%R(\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b&\u0010%R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/ozon/uni/atoms/af/AtomAction$DismissRedirect;", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/uni/atoms/af/AtomAction$SendAnalytics;", "Lru/ozon/uni/atoms/af/AtomAction$CopyWithMutateTrackingInfo;", "Lru/ozon/uni/atoms/af/AtomAction$HasUsageAnalytics;", "LTg/b$b;", "", "id", "link", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "params", "Lru/ozon/uni/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;", "usageAnalytics", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lru/ozon/uni/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;)V", "newTrackingInfo", "mutateTrackingInfo", "(Ljava/util/Map;)Lru/ozon/uni/atoms/af/AtomAction$DismissRedirect;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lru/ozon/uni/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;)Lru/ozon/uni/atoms/af/AtomAction$DismissRedirect;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getLink", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "getParams", "Lru/ozon/uni/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;", "getUsageAnalytics", "()Lru/ozon/uni/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DismissRedirect extends AtomAction implements SendAnalytics, CopyWithMutateTrackingInfo, HasUsageAnalytics, b.InterfaceC0546b {
        private final String id;
        private final String link;
        private final Map<String, String> params;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;
        private final HasUsageAnalytics.UsageAnalytics usageAnalytics;

        public /* synthetic */ DismissRedirect(String str, String str2, Map map, Map map2, HasUsageAnalytics.UsageAnalytics usageAnalytics, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, str2, map, (i11 & 8) != 0 ? null : map2, (i11 & 16) != 0 ? null : usageAnalytics);
        }

        public static /* synthetic */ DismissRedirect copy$default(DismissRedirect dismissRedirect, String str, String str2, Map map, Map map2, HasUsageAnalytics.UsageAnalytics usageAnalytics, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = dismissRedirect.id;
            }
            if ((i11 & 2) != 0) {
                str2 = dismissRedirect.link;
            }
            if ((i11 & 4) != 0) {
                map = dismissRedirect.trackingInfo;
            }
            if ((i11 & 8) != 0) {
                map2 = dismissRedirect.params;
            }
            if ((i11 & 16) != 0) {
                usageAnalytics = dismissRedirect.usageAnalytics;
            }
            HasUsageAnalytics.UsageAnalytics usageAnalytics2 = usageAnalytics;
            Map map3 = map;
            return dismissRedirect.copy(str, str2, map3, map2, usageAnalytics2);
        }

        @NotNull
        public final DismissRedirect copy(String id2, String link, Map<String, TokenizedTrackingInfo> trackingInfo, Map<String, String> params, HasUsageAnalytics.UsageAnalytics usageAnalytics) {
            return new DismissRedirect(id2, link, trackingInfo, params, usageAnalytics);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DismissRedirect)) {
                return false;
            }
            DismissRedirect dismissRedirect = (DismissRedirect) other;
            return Intrinsics.d(this.id, dismissRedirect.id) && Intrinsics.d(this.link, dismissRedirect.link) && Intrinsics.d(this.trackingInfo, dismissRedirect.trackingInfo) && Intrinsics.d(this.params, dismissRedirect.params) && Intrinsics.d(this.usageAnalytics, dismissRedirect.usageAnalytics);
        }

        @Override // ru.ozon.uni.atoms.af.AtomAction, Tg.b
        public String getId() {
            return this.id;
        }

        @Override // Tg.b.InterfaceC0546b
        public String getLink() {
            return this.link;
        }

        @Override // ru.ozon.uni.atoms.af.AtomAction
        public Map<String, String> getParams() {
            return this.params;
        }

        @Override // ru.ozon.uni.atoms.af.AtomAction.SendAnalytics
        public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        @Override // ru.ozon.uni.atoms.af.AtomAction.HasUsageAnalytics
        public HasUsageAnalytics.UsageAnalytics getUsageAnalytics() {
            return this.usageAnalytics;
        }

        public int hashCode() {
            String str = this.id;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.link;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            int hashCode3 = (hashCode2 + (map == null ? 0 : map.hashCode())) * 31;
            Map<String, String> map2 = this.params;
            int hashCode4 = (hashCode3 + (map2 == null ? 0 : map2.hashCode())) * 31;
            HasUsageAnalytics.UsageAnalytics usageAnalytics = this.usageAnalytics;
            return hashCode4 + (usageAnalytics != null ? usageAnalytics.hashCode() : 0);
        }

        @Override // ru.ozon.uni.atoms.af.AtomAction.CopyWithMutateTrackingInfo
        public /* bridge */ /* synthetic */ AtomAction mutateTrackingInfo(Map map) {
            return mutateTrackingInfo((Map<String, TokenizedTrackingInfo>) map);
        }

        @NotNull
        public String toString() {
            String str = this.id;
            String str2 = this.link;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            Map<String, String> map2 = this.params;
            HasUsageAnalytics.UsageAnalytics usageAnalytics = this.usageAnalytics;
            StringBuilder d11 = C3660k.d("DismissRedirect(id=", str, ", link=", str2, ", trackingInfo=");
            Tl.b.g(d11, map, ", params=", map2, ", usageAnalytics=");
            d11.append(usageAnalytics);
            d11.append(")");
            return d11.toString();
        }

        public DismissRedirect(String str, String str2, Map<String, TokenizedTrackingInfo> map, Map<String, String> map2, HasUsageAnalytics.UsageAnalytics usageAnalytics) {
            super(null);
            this.id = str;
            this.link = str2;
            this.trackingInfo = map;
            this.params = map2;
            this.usageAnalytics = usageAnalytics;
        }

        @Override // ru.ozon.uni.atoms.af.AtomAction.CopyWithMutateTrackingInfo
        @NotNull
        public DismissRedirect mutateTrackingInfo(Map<String, TokenizedTrackingInfo> newTrackingInfo) {
            return copy$default(this, null, null, newTrackingInfo, null, null, 27, null);
        }
    }

    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005Bc\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0014\u001a\u00020\u00002\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015Jp\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010\u0019R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b$\u0010\u0019R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b&\u0010'R(\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010(\u001a\u0004\b)\u0010*R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010+\u001a\u0004\b,\u0010-R(\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010(\u001a\u0004\b.\u0010*R\u0016\u00102\u001a\u0004\u0018\u00010/8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00063"}, d2 = {"Lru/ozon/uni/atoms/af/AtomAction$DismissRefresh;", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/uni/atoms/af/AtomAction$SendAnalytics;", "Lru/ozon/uni/atoms/af/AtomAction$CopyWithMutateTrackingInfo;", "Lru/ozon/uni/atoms/af/AtomAction$HasUsageAnalytics;", "LTg/b$c;", "", "id", "link", "Lru/ozon/uni/atoms/af/AtomAction$ScrollPosition;", "scrollPosition", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "Lru/ozon/uni/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;", "usageAnalytics", "params", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction$ScrollPosition;Ljava/util/Map;Lru/ozon/uni/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;Ljava/util/Map;)V", "newTrackingInfo", "mutateTrackingInfo", "(Ljava/util/Map;)Lru/ozon/uni/atoms/af/AtomAction$DismissRefresh;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction$ScrollPosition;Ljava/util/Map;Lru/ozon/uni/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;Ljava/util/Map;)Lru/ozon/uni/atoms/af/AtomAction$DismissRefresh;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getLink", "Lru/ozon/uni/atoms/af/AtomAction$ScrollPosition;", "getScrollPosition", "()Lru/ozon/uni/atoms/af/AtomAction$ScrollPosition;", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "Lru/ozon/uni/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;", "getUsageAnalytics", "()Lru/ozon/uni/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;", "getParams", "LTg/b$f;", "getScrollTo", "()LTg/b$f;", "scrollTo", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final /* data */ class DismissRefresh extends AtomAction implements SendAnalytics, CopyWithMutateTrackingInfo, HasUsageAnalytics, b.c {
        private final String id;
        private final String link;
        private final Map<String, String> params;
        private final ScrollPosition scrollPosition;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;
        private final HasUsageAnalytics.UsageAnalytics usageAnalytics;

        public /* synthetic */ DismissRefresh(String str, String str2, ScrollPosition scrollPosition, Map map, HasUsageAnalytics.UsageAnalytics usageAnalytics, Map map2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, str2, (i11 & 4) != 0 ? ScrollPosition.None.INSTANCE : scrollPosition, map, (i11 & 16) != 0 ? null : usageAnalytics, (i11 & 32) != 0 ? null : map2);
        }

        public static /* synthetic */ DismissRefresh copy$default(DismissRefresh dismissRefresh, String str, String str2, ScrollPosition scrollPosition, Map map, HasUsageAnalytics.UsageAnalytics usageAnalytics, Map map2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = dismissRefresh.id;
            }
            if ((i11 & 2) != 0) {
                str2 = dismissRefresh.link;
            }
            if ((i11 & 4) != 0) {
                scrollPosition = dismissRefresh.scrollPosition;
            }
            if ((i11 & 8) != 0) {
                map = dismissRefresh.trackingInfo;
            }
            if ((i11 & 16) != 0) {
                usageAnalytics = dismissRefresh.usageAnalytics;
            }
            if ((i11 & 32) != 0) {
                map2 = dismissRefresh.params;
            }
            HasUsageAnalytics.UsageAnalytics usageAnalytics2 = usageAnalytics;
            Map map3 = map2;
            return dismissRefresh.copy(str, str2, scrollPosition, map, usageAnalytics2, map3);
        }

        @NotNull
        public final DismissRefresh copy(String id2, String link, ScrollPosition scrollPosition, Map<String, TokenizedTrackingInfo> trackingInfo, HasUsageAnalytics.UsageAnalytics usageAnalytics, Map<String, String> params) {
            return new DismissRefresh(id2, link, scrollPosition, trackingInfo, usageAnalytics, params);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DismissRefresh)) {
                return false;
            }
            DismissRefresh dismissRefresh = (DismissRefresh) other;
            return Intrinsics.d(this.id, dismissRefresh.id) && Intrinsics.d(this.link, dismissRefresh.link) && Intrinsics.d(this.scrollPosition, dismissRefresh.scrollPosition) && Intrinsics.d(this.trackingInfo, dismissRefresh.trackingInfo) && Intrinsics.d(this.usageAnalytics, dismissRefresh.usageAnalytics) && Intrinsics.d(this.params, dismissRefresh.params);
        }

        @Override // ru.ozon.uni.atoms.af.AtomAction, Tg.b
        public String getId() {
            return this.id;
        }

        @Override // Tg.b.c
        public String getLink() {
            return this.link;
        }

        @Override // ru.ozon.uni.atoms.af.AtomAction
        public Map<String, String> getParams() {
            return this.params;
        }

        public final ScrollPosition getScrollPosition() {
            return this.scrollPosition;
        }

        @Override // Tg.b.c
        public b.f getScrollTo() {
            return this.scrollPosition;
        }

        @Override // ru.ozon.uni.atoms.af.AtomAction.SendAnalytics
        public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        @Override // ru.ozon.uni.atoms.af.AtomAction.HasUsageAnalytics
        public HasUsageAnalytics.UsageAnalytics getUsageAnalytics() {
            return this.usageAnalytics;
        }

        public int hashCode() {
            String str = this.id;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.link;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            ScrollPosition scrollPosition = this.scrollPosition;
            int hashCode3 = (hashCode2 + (scrollPosition == null ? 0 : scrollPosition.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            int hashCode4 = (hashCode3 + (map == null ? 0 : map.hashCode())) * 31;
            HasUsageAnalytics.UsageAnalytics usageAnalytics = this.usageAnalytics;
            int hashCode5 = (hashCode4 + (usageAnalytics == null ? 0 : usageAnalytics.hashCode())) * 31;
            Map<String, String> map2 = this.params;
            return hashCode5 + (map2 != null ? map2.hashCode() : 0);
        }

        @Override // ru.ozon.uni.atoms.af.AtomAction.CopyWithMutateTrackingInfo
        public /* bridge */ /* synthetic */ AtomAction mutateTrackingInfo(Map map) {
            return mutateTrackingInfo((Map<String, TokenizedTrackingInfo>) map);
        }

        @NotNull
        public String toString() {
            String str = this.id;
            String str2 = this.link;
            ScrollPosition scrollPosition = this.scrollPosition;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            HasUsageAnalytics.UsageAnalytics usageAnalytics = this.usageAnalytics;
            Map<String, String> map2 = this.params;
            StringBuilder d11 = C3660k.d("DismissRefresh(id=", str, ", link=", str2, ", scrollPosition=");
            d11.append(scrollPosition);
            d11.append(", trackingInfo=");
            d11.append(map);
            d11.append(", usageAnalytics=");
            d11.append(usageAnalytics);
            d11.append(", params=");
            d11.append(map2);
            d11.append(")");
            return d11.toString();
        }

        @Override // ru.ozon.uni.atoms.af.AtomAction.CopyWithMutateTrackingInfo
        @NotNull
        public DismissRefresh mutateTrackingInfo(Map<String, TokenizedTrackingInfo> newTrackingInfo) {
            return copy$default(this, null, null, null, newTrackingInfo, null, null, 55, null);
        }

        public DismissRefresh(String str, String str2, ScrollPosition scrollPosition, Map<String, TokenizedTrackingInfo> map, HasUsageAnalytics.UsageAnalytics usageAnalytics, Map<String, String> map2) {
            super(null);
            this.id = str;
            this.link = str2;
            this.scrollPosition = scrollPosition;
            this.trackingInfo = map;
            this.usageAnalytics = usageAnalytics;
            this.params = map2;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u0006R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lru/ozon/uni/atoms/af/AtomAction$HasUsageAnalytics;", "", "usageAnalytics", "Lru/ozon/uni/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;", "getUsageAnalytics", "()Lru/ozon/uni/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;", "UsageAnalytics", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface HasUsageAnalytics {

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/uni/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;", "", "", "rawBehavior", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getRawBehavior", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class UsageAnalytics {

            /* renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion(null);

            @NotNull
            private final String rawBehavior;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/uni/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics$Companion;", "", "<init>", "()V", "create", "Lru/ozon/uni/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;", "rawBehavior", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final UsageAnalytics create(String rawBehavior) {
                    if (rawBehavior != null) {
                        return new UsageAnalytics(rawBehavior);
                    }
                    return null;
                }

                private Companion() {
                }
            }

            public UsageAnalytics(@NotNull String rawBehavior) {
                Intrinsics.checkNotNullParameter(rawBehavior, "rawBehavior");
                this.rawBehavior = rawBehavior;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof UsageAnalytics) && Intrinsics.d(this.rawBehavior, ((UsageAnalytics) other).rawBehavior);
            }

            @NotNull
            public final String getRawBehavior() {
                return this.rawBehavior;
            }

            public int hashCode() {
                return this.rawBehavior.hashCode();
            }

            @NotNull
            public String toString() {
                return A0.b("UsageAnalytics(rawBehavior=", this.rawBehavior, ")");
            }
        }

        UsageAnalytics getUsageAnalytics();
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B+\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB!\b\u0016\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0017\u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/uni/atoms/af/AtomAction$InvalidAction;", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/uni/atoms/af/AtomAction$HasUsageAnalytics;", "", "id", "link", "Lru/ozon/uni/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;", "usageAnalytics", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getLink", "Lru/ozon/uni/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;", "getUsageAnalytics", "()Lru/ozon/uni/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InvalidAction extends AtomAction implements HasUsageAnalytics {
        private final String id;
        private final String link;
        private final HasUsageAnalytics.UsageAnalytics usageAnalytics;

        public InvalidAction() {
            this(null, null, null, 7, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InvalidAction)) {
                return false;
            }
            InvalidAction invalidAction = (InvalidAction) other;
            return Intrinsics.d(this.id, invalidAction.id) && Intrinsics.d(this.link, invalidAction.link) && Intrinsics.d(this.usageAnalytics, invalidAction.usageAnalytics);
        }

        @Override // ru.ozon.uni.atoms.af.AtomAction, Tg.b
        public String getId() {
            return this.id;
        }

        @Override // ru.ozon.uni.atoms.af.AtomAction.HasUsageAnalytics
        public HasUsageAnalytics.UsageAnalytics getUsageAnalytics() {
            return this.usageAnalytics;
        }

        public int hashCode() {
            String str = this.id;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.link;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            HasUsageAnalytics.UsageAnalytics usageAnalytics = this.usageAnalytics;
            return hashCode2 + (usageAnalytics != null ? usageAnalytics.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.id;
            String str2 = this.link;
            HasUsageAnalytics.UsageAnalytics usageAnalytics = this.usageAnalytics;
            StringBuilder d11 = C3660k.d("InvalidAction(id=", str, ", link=", str2, ", usageAnalytics=");
            d11.append(usageAnalytics);
            d11.append(")");
            return d11.toString();
        }

        public /* synthetic */ InvalidAction(String str, String str2, HasUsageAnalytics.UsageAnalytics usageAnalytics, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : usageAnalytics);
        }

        public InvalidAction(String str, String str2, HasUsageAnalytics.UsageAnalytics usageAnalytics) {
            super(null);
            this.id = str;
            this.link = str2;
            this.usageAnalytics = usageAnalytics;
        }

        public /* synthetic */ InvalidAction(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2);
        }

        public InvalidAction(String str, String str2) {
            this(str, str2, null);
        }
    }

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005BW\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010BM\b\u0016\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000f\u0010\u0011J%\u0010\u0013\u001a\u00020\u00002\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014Jd\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010\u0018R(\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010%R(\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b&\u0010%R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010!\u001a\u0004\b'\u0010\u0018R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lru/ozon/uni/atoms/af/AtomAction$Move;", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/uni/atoms/af/AtomAction$SendAnalytics;", "Lru/ozon/uni/atoms/af/AtomAction$CopyWithMutateTrackingInfo;", "Lru/ozon/uni/atoms/af/AtomAction$HasUsageAnalytics;", "LTg/b$d;", "", "link", "", "params", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "id", "Lru/ozon/uni/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;", "usageAnalytics", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;)V", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;)V", "newTrackingInfo", "mutateTrackingInfo", "(Ljava/util/Map;)Lru/ozon/uni/atoms/af/AtomAction$Move;", "copy", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;)Lru/ozon/uni/atoms/af/AtomAction$Move;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLink", "Ljava/util/Map;", "getParams", "()Ljava/util/Map;", "getTrackingInfo", "getId", "Lru/ozon/uni/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;", "getUsageAnalytics", "()Lru/ozon/uni/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Move extends AtomAction implements SendAnalytics, CopyWithMutateTrackingInfo, HasUsageAnalytics, b.d {
        private final String id;
        private final String link;
        private final Map<String, String> params;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;
        private final HasUsageAnalytics.UsageAnalytics usageAnalytics;

        public Move(String str, Map<String, String> map, Map<String, TokenizedTrackingInfo> map2, String str2, HasUsageAnalytics.UsageAnalytics usageAnalytics) {
            super(null);
            this.link = str;
            this.params = map;
            this.trackingInfo = map2;
            this.id = str2;
            this.usageAnalytics = usageAnalytics;
        }

        public static /* synthetic */ Move copy$default(Move move, String str, Map map, Map map2, String str2, HasUsageAnalytics.UsageAnalytics usageAnalytics, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = move.link;
            }
            if ((i11 & 2) != 0) {
                map = move.params;
            }
            if ((i11 & 4) != 0) {
                map2 = move.trackingInfo;
            }
            if ((i11 & 8) != 0) {
                str2 = move.id;
            }
            if ((i11 & 16) != 0) {
                usageAnalytics = move.usageAnalytics;
            }
            HasUsageAnalytics.UsageAnalytics usageAnalytics2 = usageAnalytics;
            Map map3 = map2;
            return move.copy(str, map, map3, str2, usageAnalytics2);
        }

        @NotNull
        public final Move copy(String link, Map<String, String> params, Map<String, TokenizedTrackingInfo> trackingInfo, String id2, HasUsageAnalytics.UsageAnalytics usageAnalytics) {
            return new Move(link, params, trackingInfo, id2, usageAnalytics);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Move)) {
                return false;
            }
            Move move = (Move) other;
            return Intrinsics.d(this.link, move.link) && Intrinsics.d(this.params, move.params) && Intrinsics.d(this.trackingInfo, move.trackingInfo) && Intrinsics.d(this.id, move.id) && Intrinsics.d(this.usageAnalytics, move.usageAnalytics);
        }

        @Override // ru.ozon.uni.atoms.af.AtomAction, Tg.b
        public String getId() {
            return this.id;
        }

        @Override // Tg.b.d
        public String getLink() {
            return this.link;
        }

        @Override // ru.ozon.uni.atoms.af.AtomAction
        public Map<String, String> getParams() {
            return this.params;
        }

        @Override // ru.ozon.uni.atoms.af.AtomAction.SendAnalytics
        public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        @Override // ru.ozon.uni.atoms.af.AtomAction.HasUsageAnalytics
        public HasUsageAnalytics.UsageAnalytics getUsageAnalytics() {
            return this.usageAnalytics;
        }

        public int hashCode() {
            String str = this.link;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Map<String, String> map = this.params;
            int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map2 = this.trackingInfo;
            int hashCode3 = (hashCode2 + (map2 == null ? 0 : map2.hashCode())) * 31;
            String str2 = this.id;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            HasUsageAnalytics.UsageAnalytics usageAnalytics = this.usageAnalytics;
            return hashCode4 + (usageAnalytics != null ? usageAnalytics.hashCode() : 0);
        }

        @Override // ru.ozon.uni.atoms.af.AtomAction.CopyWithMutateTrackingInfo
        public /* bridge */ /* synthetic */ AtomAction mutateTrackingInfo(Map map) {
            return mutateTrackingInfo((Map<String, TokenizedTrackingInfo>) map);
        }

        @NotNull
        public String toString() {
            return "Move(link=" + this.link + ", params=" + this.params + ", trackingInfo=" + this.trackingInfo + ", id=" + this.id + ", usageAnalytics=" + this.usageAnalytics + ")";
        }

        @Override // ru.ozon.uni.atoms.af.AtomAction.CopyWithMutateTrackingInfo
        @NotNull
        public Move mutateTrackingInfo(Map<String, TokenizedTrackingInfo> newTrackingInfo) {
            return copy$default(this, null, null, newTrackingInfo, null, null, 27, null);
        }

        public /* synthetic */ Move(String str, Map map, Map map2, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? null : map, map2, (i11 & 8) != 0 ? null : str2);
        }

        public Move(String str, Map<String, String> map, Map<String, TokenizedTrackingInfo> map2, String str2) {
            this(str, map, map2, str2, null);
        }
    }

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004Bi\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f¢\u0006\u0004\b\u0012\u0010\u0013BG\b\u0016\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u0012\u0010\u0014J%\u0010\u0016\u001a\u00020\u00002\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017Jv\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\n2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b%\u0010\u001bR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b*\u0010+R(\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010,\u001a\u0004\b-\u0010.R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010/\u001a\u0004\b0\u00101R(\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010,\u001a\u0004\b2\u0010.¨\u00063"}, d2 = {"Lru/ozon/uni/atoms/af/AtomAction$OpenComposerNestedPage;", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/uni/atoms/af/AtomAction$SendAnalytics;", "Lru/ozon/uni/atoms/af/AtomAction$CopyWithMutateTrackingInfo;", "Lru/ozon/uni/atoms/af/AtomAction$HasUsageAnalytics;", "", "id", "link", "Lru/ozon/uni/atoms/af/AtomAction$CurtainShowConfig;", "showConfig", "", "cancellable", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "Lru/ozon/uni/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;", "usageAnalytics", "params", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction$CurtainShowConfig;ZLjava/util/Map;Lru/ozon/uni/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;Ljava/util/Map;)V", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction$CurtainShowConfig;ZLjava/util/Map;)V", "newTrackingInfo", "mutateTrackingInfo", "(Ljava/util/Map;)Lru/ozon/uni/atoms/af/AtomAction$OpenComposerNestedPage;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction$CurtainShowConfig;ZLjava/util/Map;Lru/ozon/uni/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;Ljava/util/Map;)Lru/ozon/uni/atoms/af/AtomAction$OpenComposerNestedPage;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getLink", "Lru/ozon/uni/atoms/af/AtomAction$CurtainShowConfig;", "getShowConfig", "()Lru/ozon/uni/atoms/af/AtomAction$CurtainShowConfig;", "Z", "getCancellable", "()Z", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "Lru/ozon/uni/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;", "getUsageAnalytics", "()Lru/ozon/uni/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;", "getParams", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OpenComposerNestedPage extends AtomAction implements SendAnalytics, CopyWithMutateTrackingInfo, HasUsageAnalytics {
        private final boolean cancellable;
        private final String id;

        @NotNull
        private final String link;
        private final Map<String, String> params;

        @NotNull
        private final CurtainShowConfig showConfig;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;
        private final HasUsageAnalytics.UsageAnalytics usageAnalytics;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenComposerNestedPage(String str, @NotNull String link, @NotNull CurtainShowConfig showConfig, boolean z11, Map<String, TokenizedTrackingInfo> map, HasUsageAnalytics.UsageAnalytics usageAnalytics, Map<String, String> map2) {
            super(null);
            Intrinsics.checkNotNullParameter(link, "link");
            Intrinsics.checkNotNullParameter(showConfig, "showConfig");
            this.id = str;
            this.link = link;
            this.showConfig = showConfig;
            this.cancellable = z11;
            this.trackingInfo = map;
            this.usageAnalytics = usageAnalytics;
            this.params = map2;
        }

        public static /* synthetic */ OpenComposerNestedPage copy$default(OpenComposerNestedPage openComposerNestedPage, String str, String str2, CurtainShowConfig curtainShowConfig, boolean z11, Map map, HasUsageAnalytics.UsageAnalytics usageAnalytics, Map map2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = openComposerNestedPage.id;
            }
            if ((i11 & 2) != 0) {
                str2 = openComposerNestedPage.link;
            }
            if ((i11 & 4) != 0) {
                curtainShowConfig = openComposerNestedPage.showConfig;
            }
            if ((i11 & 8) != 0) {
                z11 = openComposerNestedPage.cancellable;
            }
            if ((i11 & 16) != 0) {
                map = openComposerNestedPage.trackingInfo;
            }
            if ((i11 & 32) != 0) {
                usageAnalytics = openComposerNestedPage.usageAnalytics;
            }
            if ((i11 & 64) != 0) {
                map2 = openComposerNestedPage.params;
            }
            HasUsageAnalytics.UsageAnalytics usageAnalytics2 = usageAnalytics;
            Map map3 = map2;
            Map map4 = map;
            CurtainShowConfig curtainShowConfig2 = curtainShowConfig;
            return openComposerNestedPage.copy(str, str2, curtainShowConfig2, z11, map4, usageAnalytics2, map3);
        }

        @NotNull
        public final OpenComposerNestedPage copy(String id2, @NotNull String link, @NotNull CurtainShowConfig showConfig, boolean cancellable, Map<String, TokenizedTrackingInfo> trackingInfo, HasUsageAnalytics.UsageAnalytics usageAnalytics, Map<String, String> params) {
            Intrinsics.checkNotNullParameter(link, "link");
            Intrinsics.checkNotNullParameter(showConfig, "showConfig");
            return new OpenComposerNestedPage(id2, link, showConfig, cancellable, trackingInfo, usageAnalytics, params);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OpenComposerNestedPage)) {
                return false;
            }
            OpenComposerNestedPage openComposerNestedPage = (OpenComposerNestedPage) other;
            return Intrinsics.d(this.id, openComposerNestedPage.id) && Intrinsics.d(this.link, openComposerNestedPage.link) && Intrinsics.d(this.showConfig, openComposerNestedPage.showConfig) && this.cancellable == openComposerNestedPage.cancellable && Intrinsics.d(this.trackingInfo, openComposerNestedPage.trackingInfo) && Intrinsics.d(this.usageAnalytics, openComposerNestedPage.usageAnalytics) && Intrinsics.d(this.params, openComposerNestedPage.params);
        }

        public final boolean getCancellable() {
            return this.cancellable;
        }

        @Override // ru.ozon.uni.atoms.af.AtomAction, Tg.b
        public String getId() {
            return this.id;
        }

        @NotNull
        public final String getLink() {
            return this.link;
        }

        @Override // ru.ozon.uni.atoms.af.AtomAction
        public Map<String, String> getParams() {
            return this.params;
        }

        @NotNull
        public final CurtainShowConfig getShowConfig() {
            return this.showConfig;
        }

        @Override // ru.ozon.uni.atoms.af.AtomAction.SendAnalytics
        public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        @Override // ru.ozon.uni.atoms.af.AtomAction.HasUsageAnalytics
        public HasUsageAnalytics.UsageAnalytics getUsageAnalytics() {
            return this.usageAnalytics;
        }

        public int hashCode() {
            String str = this.id;
            int a11 = C3532b.a((this.showConfig.hashCode() + g.a((str == null ? 0 : str.hashCode()) * 31, 31, this.link)) * 31, 31, this.cancellable);
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            int hashCode = (a11 + (map == null ? 0 : map.hashCode())) * 31;
            HasUsageAnalytics.UsageAnalytics usageAnalytics = this.usageAnalytics;
            int hashCode2 = (hashCode + (usageAnalytics == null ? 0 : usageAnalytics.hashCode())) * 31;
            Map<String, String> map2 = this.params;
            return hashCode2 + (map2 != null ? map2.hashCode() : 0);
        }

        @Override // ru.ozon.uni.atoms.af.AtomAction.CopyWithMutateTrackingInfo
        public /* bridge */ /* synthetic */ AtomAction mutateTrackingInfo(Map map) {
            return mutateTrackingInfo((Map<String, TokenizedTrackingInfo>) map);
        }

        @NotNull
        public String toString() {
            String str = this.id;
            String str2 = this.link;
            CurtainShowConfig curtainShowConfig = this.showConfig;
            boolean z11 = this.cancellable;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            HasUsageAnalytics.UsageAnalytics usageAnalytics = this.usageAnalytics;
            Map<String, String> map2 = this.params;
            StringBuilder d11 = C3660k.d("OpenComposerNestedPage(id=", str, ", link=", str2, ", showConfig=");
            d11.append(curtainShowConfig);
            d11.append(", cancellable=");
            d11.append(z11);
            d11.append(", trackingInfo=");
            d11.append(map);
            d11.append(", usageAnalytics=");
            d11.append(usageAnalytics);
            d11.append(", params=");
            return P.f(d11, map2, ")");
        }

        @Override // ru.ozon.uni.atoms.af.AtomAction.CopyWithMutateTrackingInfo
        @NotNull
        public OpenComposerNestedPage mutateTrackingInfo(Map<String, TokenizedTrackingInfo> newTrackingInfo) {
            return copy$default(this, null, null, null, false, newTrackingInfo, null, null, 111, null);
        }

        public /* synthetic */ OpenComposerNestedPage(String str, String str2, CurtainShowConfig curtainShowConfig, boolean z11, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, str2, (i11 & 4) != 0 ? CurtainShowConfig.Full.INSTANCE : curtainShowConfig, (i11 & 8) != 0 ? true : z11, map);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public OpenComposerNestedPage(String str, @NotNull String link, @NotNull CurtainShowConfig showConfig, boolean z11, Map<String, TokenizedTrackingInfo> map) {
            this(str, link, showConfig, z11, map, (HasUsageAnalytics.UsageAnalytics) null, (Map<String, String>) null);
            Intrinsics.checkNotNullParameter(link, "link");
            Intrinsics.checkNotNullParameter(showConfig, "showConfig");
        }
    }

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B_\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\n¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0013\u001a\u00020\u00002\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014Jl\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b#\u0010\u0018R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010&R(\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010*\u001a\u0004\b+\u0010,R(\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010'\u001a\u0004\b-\u0010)¨\u0006."}, d2 = {"Lru/ozon/uni/atoms/af/AtomAction$OpenNestedPage;", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/uni/atoms/af/AtomAction$SendAnalytics;", "Lru/ozon/uni/atoms/af/AtomAction$CopyWithMutateTrackingInfo;", "Lru/ozon/uni/atoms/af/AtomAction$HasUsageAnalytics;", "", "id", "nestedPageKey", "Lru/ozon/uni/atoms/af/AtomAction$CurtainShowConfig;", "showConfig", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "Lru/ozon/uni/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;", "usageAnalytics", "params", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction$CurtainShowConfig;Ljava/util/Map;Lru/ozon/uni/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;Ljava/util/Map;)V", "newTrackingInfo", "mutateTrackingInfo", "(Ljava/util/Map;)Lru/ozon/uni/atoms/af/AtomAction$OpenNestedPage;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction$CurtainShowConfig;Ljava/util/Map;Lru/ozon/uni/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;Ljava/util/Map;)Lru/ozon/uni/atoms/af/AtomAction$OpenNestedPage;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getNestedPageKey", "Lru/ozon/uni/atoms/af/AtomAction$CurtainShowConfig;", "getShowConfig", "()Lru/ozon/uni/atoms/af/AtomAction$CurtainShowConfig;", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "Lru/ozon/uni/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;", "getUsageAnalytics", "()Lru/ozon/uni/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;", "getParams", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OpenNestedPage extends AtomAction implements SendAnalytics, CopyWithMutateTrackingInfo, HasUsageAnalytics {
        private final String id;

        @NotNull
        private final String nestedPageKey;
        private final Map<String, String> params;

        @NotNull
        private final CurtainShowConfig showConfig;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;
        private final HasUsageAnalytics.UsageAnalytics usageAnalytics;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenNestedPage(String str, @NotNull String nestedPageKey, @NotNull CurtainShowConfig showConfig, Map<String, TokenizedTrackingInfo> map, HasUsageAnalytics.UsageAnalytics usageAnalytics, Map<String, String> map2) {
            super(null);
            Intrinsics.checkNotNullParameter(nestedPageKey, "nestedPageKey");
            Intrinsics.checkNotNullParameter(showConfig, "showConfig");
            this.id = str;
            this.nestedPageKey = nestedPageKey;
            this.showConfig = showConfig;
            this.trackingInfo = map;
            this.usageAnalytics = usageAnalytics;
            this.params = map2;
        }

        public static /* synthetic */ OpenNestedPage copy$default(OpenNestedPage openNestedPage, String str, String str2, CurtainShowConfig curtainShowConfig, Map map, HasUsageAnalytics.UsageAnalytics usageAnalytics, Map map2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = openNestedPage.id;
            }
            if ((i11 & 2) != 0) {
                str2 = openNestedPage.nestedPageKey;
            }
            if ((i11 & 4) != 0) {
                curtainShowConfig = openNestedPage.showConfig;
            }
            if ((i11 & 8) != 0) {
                map = openNestedPage.trackingInfo;
            }
            if ((i11 & 16) != 0) {
                usageAnalytics = openNestedPage.usageAnalytics;
            }
            if ((i11 & 32) != 0) {
                map2 = openNestedPage.params;
            }
            HasUsageAnalytics.UsageAnalytics usageAnalytics2 = usageAnalytics;
            Map map3 = map2;
            return openNestedPage.copy(str, str2, curtainShowConfig, map, usageAnalytics2, map3);
        }

        @NotNull
        public final OpenNestedPage copy(String id2, @NotNull String nestedPageKey, @NotNull CurtainShowConfig showConfig, Map<String, TokenizedTrackingInfo> trackingInfo, HasUsageAnalytics.UsageAnalytics usageAnalytics, Map<String, String> params) {
            Intrinsics.checkNotNullParameter(nestedPageKey, "nestedPageKey");
            Intrinsics.checkNotNullParameter(showConfig, "showConfig");
            return new OpenNestedPage(id2, nestedPageKey, showConfig, trackingInfo, usageAnalytics, params);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OpenNestedPage)) {
                return false;
            }
            OpenNestedPage openNestedPage = (OpenNestedPage) other;
            return Intrinsics.d(this.id, openNestedPage.id) && Intrinsics.d(this.nestedPageKey, openNestedPage.nestedPageKey) && Intrinsics.d(this.showConfig, openNestedPage.showConfig) && Intrinsics.d(this.trackingInfo, openNestedPage.trackingInfo) && Intrinsics.d(this.usageAnalytics, openNestedPage.usageAnalytics) && Intrinsics.d(this.params, openNestedPage.params);
        }

        @Override // ru.ozon.uni.atoms.af.AtomAction, Tg.b
        public String getId() {
            return this.id;
        }

        @NotNull
        public final String getNestedPageKey() {
            return this.nestedPageKey;
        }

        @Override // ru.ozon.uni.atoms.af.AtomAction
        public Map<String, String> getParams() {
            return this.params;
        }

        @NotNull
        public final CurtainShowConfig getShowConfig() {
            return this.showConfig;
        }

        @Override // ru.ozon.uni.atoms.af.AtomAction.SendAnalytics
        public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        @Override // ru.ozon.uni.atoms.af.AtomAction.HasUsageAnalytics
        public HasUsageAnalytics.UsageAnalytics getUsageAnalytics() {
            return this.usageAnalytics;
        }

        public int hashCode() {
            String str = this.id;
            int hashCode = (this.showConfig.hashCode() + g.a((str == null ? 0 : str.hashCode()) * 31, 31, this.nestedPageKey)) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
            HasUsageAnalytics.UsageAnalytics usageAnalytics = this.usageAnalytics;
            int hashCode3 = (hashCode2 + (usageAnalytics == null ? 0 : usageAnalytics.hashCode())) * 31;
            Map<String, String> map2 = this.params;
            return hashCode3 + (map2 != null ? map2.hashCode() : 0);
        }

        @Override // ru.ozon.uni.atoms.af.AtomAction.CopyWithMutateTrackingInfo
        public /* bridge */ /* synthetic */ AtomAction mutateTrackingInfo(Map map) {
            return mutateTrackingInfo((Map<String, TokenizedTrackingInfo>) map);
        }

        @NotNull
        public String toString() {
            String str = this.id;
            String str2 = this.nestedPageKey;
            CurtainShowConfig curtainShowConfig = this.showConfig;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            HasUsageAnalytics.UsageAnalytics usageAnalytics = this.usageAnalytics;
            Map<String, String> map2 = this.params;
            StringBuilder d11 = C3660k.d("OpenNestedPage(id=", str, ", nestedPageKey=", str2, ", showConfig=");
            d11.append(curtainShowConfig);
            d11.append(", trackingInfo=");
            d11.append(map);
            d11.append(", usageAnalytics=");
            d11.append(usageAnalytics);
            d11.append(", params=");
            d11.append(map2);
            d11.append(")");
            return d11.toString();
        }

        @Override // ru.ozon.uni.atoms.af.AtomAction.CopyWithMutateTrackingInfo
        @NotNull
        public OpenNestedPage mutateTrackingInfo(Map<String, TokenizedTrackingInfo> newTrackingInfo) {
            return copy$default(this, null, null, null, newTrackingInfo, null, null, 55, null);
        }
    }

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004Ba\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\n¢\u0006\u0004\b\u0010\u0010\u0011Jp\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010\u0015R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b#\u0010\u0015R(\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010'\u001a\u0004\b(\u0010)R(\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010$\u001a\u0004\b*\u0010&R\u001c\u0010,\u001a\u0004\u0018\u00010+8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/¨\u00060"}, d2 = {"Lru/ozon/uni/atoms/af/AtomAction$Refresh;", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/uni/atoms/af/AtomAction$SendAnalytics;", "Lru/ozon/uni/atoms/af/AtomAction$HasUsageAnalytics;", "LTg/b$e;", "", "link", "Lru/ozon/uni/atoms/af/AtomAction$ScrollPosition;", "scrollPosition", "id", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "Lru/ozon/uni/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;", "usageAnalytics", "params", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction$ScrollPosition;Ljava/lang/String;Ljava/util/Map;Lru/ozon/uni/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;Ljava/util/Map;)V", "copy", "(Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction$ScrollPosition;Ljava/lang/String;Ljava/util/Map;Lru/ozon/uni/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;Ljava/util/Map;)Lru/ozon/uni/atoms/af/AtomAction$Refresh;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLink", "Lru/ozon/uni/atoms/af/AtomAction$ScrollPosition;", "getScrollPosition", "()Lru/ozon/uni/atoms/af/AtomAction$ScrollPosition;", "getId", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "Lru/ozon/uni/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;", "getUsageAnalytics", "()Lru/ozon/uni/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;", "getParams", "LTg/b$f;", "scrollTo", "LTg/b$f;", "getScrollTo", "()LTg/b$f;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final /* data */ class Refresh extends AtomAction implements SendAnalytics, HasUsageAnalytics, b.e {
        private final String id;
        private final String link;
        private final Map<String, String> params;
        private final ScrollPosition scrollPosition;
        private final b.f scrollTo;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;
        private final HasUsageAnalytics.UsageAnalytics usageAnalytics;

        public Refresh(String str, ScrollPosition scrollPosition, String str2, Map<String, TokenizedTrackingInfo> map, HasUsageAnalytics.UsageAnalytics usageAnalytics, Map<String, String> map2) {
            super(null);
            this.link = str;
            this.scrollPosition = scrollPosition;
            this.id = str2;
            this.trackingInfo = map;
            this.usageAnalytics = usageAnalytics;
            this.params = map2;
            this.scrollTo = scrollPosition;
        }

        public static /* synthetic */ Refresh copy$default(Refresh refresh, String str, ScrollPosition scrollPosition, String str2, Map map, HasUsageAnalytics.UsageAnalytics usageAnalytics, Map map2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = refresh.link;
            }
            if ((i11 & 2) != 0) {
                scrollPosition = refresh.scrollPosition;
            }
            if ((i11 & 4) != 0) {
                str2 = refresh.id;
            }
            if ((i11 & 8) != 0) {
                map = refresh.trackingInfo;
            }
            if ((i11 & 16) != 0) {
                usageAnalytics = refresh.usageAnalytics;
            }
            if ((i11 & 32) != 0) {
                map2 = refresh.params;
            }
            HasUsageAnalytics.UsageAnalytics usageAnalytics2 = usageAnalytics;
            Map map3 = map2;
            return refresh.copy(str, scrollPosition, str2, map, usageAnalytics2, map3);
        }

        @NotNull
        public final Refresh copy(String link, ScrollPosition scrollPosition, String id2, Map<String, TokenizedTrackingInfo> trackingInfo, HasUsageAnalytics.UsageAnalytics usageAnalytics, Map<String, String> params) {
            return new Refresh(link, scrollPosition, id2, trackingInfo, usageAnalytics, params);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Refresh)) {
                return false;
            }
            Refresh refresh = (Refresh) other;
            return Intrinsics.d(this.link, refresh.link) && Intrinsics.d(this.scrollPosition, refresh.scrollPosition) && Intrinsics.d(this.id, refresh.id) && Intrinsics.d(this.trackingInfo, refresh.trackingInfo) && Intrinsics.d(this.usageAnalytics, refresh.usageAnalytics) && Intrinsics.d(this.params, refresh.params);
        }

        @Override // ru.ozon.uni.atoms.af.AtomAction, Tg.b
        public String getId() {
            return this.id;
        }

        @Override // Tg.b.e
        public String getLink() {
            return this.link;
        }

        @Override // ru.ozon.uni.atoms.af.AtomAction
        public Map<String, String> getParams() {
            return this.params;
        }

        public final ScrollPosition getScrollPosition() {
            return this.scrollPosition;
        }

        @Override // Tg.b.e
        public b.f getScrollTo() {
            return this.scrollTo;
        }

        @Override // ru.ozon.uni.atoms.af.AtomAction.SendAnalytics
        public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        @Override // ru.ozon.uni.atoms.af.AtomAction.HasUsageAnalytics
        public HasUsageAnalytics.UsageAnalytics getUsageAnalytics() {
            return this.usageAnalytics;
        }

        public int hashCode() {
            String str = this.link;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            ScrollPosition scrollPosition = this.scrollPosition;
            int hashCode2 = (hashCode + (scrollPosition == null ? 0 : scrollPosition.hashCode())) * 31;
            String str2 = this.id;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            int hashCode4 = (hashCode3 + (map == null ? 0 : map.hashCode())) * 31;
            HasUsageAnalytics.UsageAnalytics usageAnalytics = this.usageAnalytics;
            int hashCode5 = (hashCode4 + (usageAnalytics == null ? 0 : usageAnalytics.hashCode())) * 31;
            Map<String, String> map2 = this.params;
            return hashCode5 + (map2 != null ? map2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.link;
            ScrollPosition scrollPosition = this.scrollPosition;
            String str2 = this.id;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            HasUsageAnalytics.UsageAnalytics usageAnalytics = this.usageAnalytics;
            Map<String, String> map2 = this.params;
            StringBuilder sb2 = new StringBuilder("Refresh(link=");
            sb2.append(str);
            sb2.append(", scrollPosition=");
            sb2.append(scrollPosition);
            sb2.append(", id=");
            C2638a.e(sb2, str2, ", trackingInfo=", map, ", usageAnalytics=");
            sb2.append(usageAnalytics);
            sb2.append(", params=");
            sb2.append(map2);
            sb2.append(")");
            return sb2.toString();
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/uni/atoms/af/AtomAction$ScrollPosition;", "LTg/b$f;", "<init>", "()V", "Top", "None", "Lru/ozon/uni/atoms/af/AtomAction$ScrollPosition$None;", "Lru/ozon/uni/atoms/af/AtomAction$ScrollPosition$Top;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static abstract class ScrollPosition implements b.f {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/ozon/uni/atoms/af/AtomAction$ScrollPosition$None;", "Lru/ozon/uni/atoms/af/AtomAction$ScrollPosition;", "", "<init>", "()V", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class None extends ScrollPosition {

            @NotNull
            public static final None INSTANCE = new None();

            private None() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/ozon/uni/atoms/af/AtomAction$ScrollPosition$Top;", "Lru/ozon/uni/atoms/af/AtomAction$ScrollPosition;", "LTg/b$f$b;", "<init>", "()V", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Top extends ScrollPosition implements b.f.InterfaceC0547b {

            @NotNull
            public static final Top INSTANCE = new Top();

            private Top() {
                super(null);
            }
        }

        public /* synthetic */ ScrollPosition(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ScrollPosition() {
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004BU\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001c\u0010\u0011R(\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010 \u001a\u0004\b!\u0010\"R(\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u001d\u001a\u0004\b#\u0010\u001f¨\u0006$"}, d2 = {"Lru/ozon/uni/atoms/af/AtomAction$ScrollToWidget;", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/uni/atoms/af/AtomAction$SendAnalytics;", "Lru/ozon/uni/atoms/af/AtomAction$HasUsageAnalytics;", "LTg/b$g;", "", "id", "widgetName", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "Lru/ozon/uni/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;", "usageAnalytics", "params", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lru/ozon/uni/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getWidgetName", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "Lru/ozon/uni/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;", "getUsageAnalytics", "()Lru/ozon/uni/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;", "getParams", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final /* data */ class ScrollToWidget extends AtomAction implements SendAnalytics, HasUsageAnalytics, b.g {
        private final String id;
        private final Map<String, String> params;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;
        private final HasUsageAnalytics.UsageAnalytics usageAnalytics;

        @NotNull
        private final String widgetName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ScrollToWidget(String str, @NotNull String widgetName, Map<String, TokenizedTrackingInfo> map, HasUsageAnalytics.UsageAnalytics usageAnalytics, Map<String, String> map2) {
            super(null);
            Intrinsics.checkNotNullParameter(widgetName, "widgetName");
            this.id = str;
            this.widgetName = widgetName;
            this.trackingInfo = map;
            this.usageAnalytics = usageAnalytics;
            this.params = map2;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ScrollToWidget)) {
                return false;
            }
            ScrollToWidget scrollToWidget = (ScrollToWidget) other;
            return Intrinsics.d(this.id, scrollToWidget.id) && Intrinsics.d(this.widgetName, scrollToWidget.widgetName) && Intrinsics.d(this.trackingInfo, scrollToWidget.trackingInfo) && Intrinsics.d(this.usageAnalytics, scrollToWidget.usageAnalytics) && Intrinsics.d(this.params, scrollToWidget.params);
        }

        @Override // ru.ozon.uni.atoms.af.AtomAction, Tg.b
        public String getId() {
            return this.id;
        }

        @Override // ru.ozon.uni.atoms.af.AtomAction
        public Map<String, String> getParams() {
            return this.params;
        }

        @Override // ru.ozon.uni.atoms.af.AtomAction.SendAnalytics
        public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        @Override // ru.ozon.uni.atoms.af.AtomAction.HasUsageAnalytics
        public HasUsageAnalytics.UsageAnalytics getUsageAnalytics() {
            return this.usageAnalytics;
        }

        @Override // Tg.b.g
        @NotNull
        public String getWidgetName() {
            return this.widgetName;
        }

        public int hashCode() {
            String str = this.id;
            int a11 = g.a((str == null ? 0 : str.hashCode()) * 31, 31, this.widgetName);
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            int hashCode = (a11 + (map == null ? 0 : map.hashCode())) * 31;
            HasUsageAnalytics.UsageAnalytics usageAnalytics = this.usageAnalytics;
            int hashCode2 = (hashCode + (usageAnalytics == null ? 0 : usageAnalytics.hashCode())) * 31;
            Map<String, String> map2 = this.params;
            return hashCode2 + (map2 != null ? map2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.id;
            String str2 = this.widgetName;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            HasUsageAnalytics.UsageAnalytics usageAnalytics = this.usageAnalytics;
            Map<String, String> map2 = this.params;
            StringBuilder d11 = C3660k.d("ScrollToWidget(id=", str, ", widgetName=", str2, ", trackingInfo=");
            d11.append(map);
            d11.append(", usageAnalytics=");
            d11.append(usageAnalytics);
            d11.append(", params=");
            return P.f(d11, map2, ")");
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003BU\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u0013R(\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010 \u001a\u0004\b!\u0010\"R(\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u001d\u001a\u0004\b#\u0010\u001f¨\u0006$"}, d2 = {"Lru/ozon/uni/atoms/af/AtomAction$ScrollToWidgetByKey;", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/uni/atoms/af/AtomAction$SendAnalytics;", "Lru/ozon/uni/atoms/af/AtomAction$HasUsageAnalytics;", "", "id", "", "widgetKey", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "Lru/ozon/uni/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;", "usageAnalytics", "params", "<init>", "(Ljava/lang/String;ILjava/util/Map;Lru/ozon/uni/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "I", "getWidgetKey", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "Lru/ozon/uni/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;", "getUsageAnalytics", "()Lru/ozon/uni/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;", "getParams", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final /* data */ class ScrollToWidgetByKey extends AtomAction implements SendAnalytics, HasUsageAnalytics {
        private final String id;
        private final Map<String, String> params;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;
        private final HasUsageAnalytics.UsageAnalytics usageAnalytics;
        private final int widgetKey;

        public ScrollToWidgetByKey(String str, int i11, Map<String, TokenizedTrackingInfo> map, HasUsageAnalytics.UsageAnalytics usageAnalytics, Map<String, String> map2) {
            super(null);
            this.id = str;
            this.widgetKey = i11;
            this.trackingInfo = map;
            this.usageAnalytics = usageAnalytics;
            this.params = map2;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ScrollToWidgetByKey)) {
                return false;
            }
            ScrollToWidgetByKey scrollToWidgetByKey = (ScrollToWidgetByKey) other;
            return Intrinsics.d(this.id, scrollToWidgetByKey.id) && this.widgetKey == scrollToWidgetByKey.widgetKey && Intrinsics.d(this.trackingInfo, scrollToWidgetByKey.trackingInfo) && Intrinsics.d(this.usageAnalytics, scrollToWidgetByKey.usageAnalytics) && Intrinsics.d(this.params, scrollToWidgetByKey.params);
        }

        @Override // ru.ozon.uni.atoms.af.AtomAction, Tg.b
        public String getId() {
            return this.id;
        }

        @Override // ru.ozon.uni.atoms.af.AtomAction
        public Map<String, String> getParams() {
            return this.params;
        }

        @Override // ru.ozon.uni.atoms.af.AtomAction.SendAnalytics
        public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        @Override // ru.ozon.uni.atoms.af.AtomAction.HasUsageAnalytics
        public HasUsageAnalytics.UsageAnalytics getUsageAnalytics() {
            return this.usageAnalytics;
        }

        public final int getWidgetKey() {
            return this.widgetKey;
        }

        public int hashCode() {
            String str = this.id;
            int a11 = C2454a.a(this.widgetKey, (str == null ? 0 : str.hashCode()) * 31, 31);
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            int hashCode = (a11 + (map == null ? 0 : map.hashCode())) * 31;
            HasUsageAnalytics.UsageAnalytics usageAnalytics = this.usageAnalytics;
            int hashCode2 = (hashCode + (usageAnalytics == null ? 0 : usageAnalytics.hashCode())) * 31;
            Map<String, String> map2 = this.params;
            return hashCode2 + (map2 != null ? map2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.id;
            int i11 = this.widgetKey;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            HasUsageAnalytics.UsageAnalytics usageAnalytics = this.usageAnalytics;
            Map<String, String> map2 = this.params;
            StringBuilder c11 = C3660k.c(i11, "ScrollToWidgetByKey(id=", str, ", widgetKey=", ", trackingInfo=");
            c11.append(map);
            c11.append(", usageAnalytics=");
            c11.append(usageAnalytics);
            c11.append(", params=");
            return P.f(c11, map2, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R \u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/uni/atoms/af/AtomAction$SendAnalytics;", "", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "getTrackingInfo", "()Ljava/util/Map;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface SendAnalytics {
        Map<String, TokenizedTrackingInfo> getTrackingInfo();
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/uni/atoms/af/AtomAction$TextChange;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "id", "text", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getText", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TextChange extends AtomAction {
        private final String id;

        @NotNull
        private final String text;

        public /* synthetic */ TextChange(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, str2);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TextChange)) {
                return false;
            }
            TextChange textChange = (TextChange) other;
            return Intrinsics.d(this.id, textChange.id) && Intrinsics.d(this.text, textChange.text);
        }

        @Override // ru.ozon.uni.atoms.af.AtomAction, Tg.b
        public String getId() {
            return this.id;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            String str = this.id;
            return this.text.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @NotNull
        public String toString() {
            return e.a("TextChange(id=", this.id, ", text=", this.text, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TextChange(String str, @NotNull String text) {
            super(null);
            Intrinsics.checkNotNullParameter(text, "text");
            this.id = str;
            this.text = text;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B)\u0012\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tR\"\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/uni/atoms/af/AtomAction$ViewAction;", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/uni/atoms/af/AtomAction$SendAnalytics;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "id", "<init>", "(Ljava/util/Map;Ljava/lang/String;)V", "getTrackingInfo", "()Ljava/util/Map;", "getId", "()Ljava/lang/String;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ViewAction extends AtomAction implements SendAnalytics {
        private final String id;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public /* synthetic */ ViewAction(Map map, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(map, (i11 & 2) != 0 ? null : str);
        }

        @Override // ru.ozon.uni.atoms.af.AtomAction, Tg.b
        public String getId() {
            return this.id;
        }

        @Override // ru.ozon.uni.atoms.af.AtomAction.SendAnalytics
        public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public ViewAction(Map<String, TokenizedTrackingInfo> map, String str) {
            super(null);
            this.trackingInfo = map;
            this.id = str;
        }
    }

    public /* synthetic */ AtomAction(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // Tg.b
    public abstract String getId();

    public Map<String, String> getParams() {
        return null;
    }

    private AtomAction() {
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B)\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R(\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u000e¨\u0006\u001c"}, d2 = {"Lru/ozon/uni/atoms/af/AtomAction$IgnoreViewPoolViewAction;", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/uni/atoms/af/AtomAction$SendAnalytics;", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "id", "<init>", "(Ljava/util/Map;Ljava/lang/String;)V", "Lru/ozon/uni/atoms/af/AtomAction$ViewAction;", "viewAction", "(Lru/ozon/uni/atoms/af/AtomAction$ViewAction;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "Ljava/lang/String;", "getId", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class IgnoreViewPoolViewAction extends AtomAction implements SendAnalytics {
        private final String id;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public IgnoreViewPoolViewAction(Map<String, TokenizedTrackingInfo> map, String str) {
            super(null);
            this.trackingInfo = map;
            this.id = str;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IgnoreViewPoolViewAction)) {
                return false;
            }
            IgnoreViewPoolViewAction ignoreViewPoolViewAction = (IgnoreViewPoolViewAction) other;
            return Intrinsics.d(this.trackingInfo, ignoreViewPoolViewAction.trackingInfo) && Intrinsics.d(this.id, ignoreViewPoolViewAction.id);
        }

        @Override // ru.ozon.uni.atoms.af.AtomAction, Tg.b
        public String getId() {
            return this.id;
        }

        @Override // ru.ozon.uni.atoms.af.AtomAction.SendAnalytics
        public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            int hashCode = (map == null ? 0 : map.hashCode()) * 31;
            String str = this.id;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "IgnoreViewPoolViewAction(trackingInfo=" + this.trackingInfo + ", id=" + this.id + ")";
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public IgnoreViewPoolViewAction(@NotNull ViewAction viewAction) {
            this(viewAction.getTrackingInfo(), viewAction.getId());
            Intrinsics.checkNotNullParameter(viewAction, "viewAction");
        }
    }
}
