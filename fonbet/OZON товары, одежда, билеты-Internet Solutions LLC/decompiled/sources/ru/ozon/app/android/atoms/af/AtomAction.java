package ru.ozon.app.android.atoms.af;

import B0.C2454a;
import Bk.C2638a;
import E0.C2942q;
import G.g;
import Kk.C3532b;
import N3.C3660k;
import T7.P;
import Tg.b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.AtomDTO;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0010\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u000e\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !¨\u0006\""}, d2 = {"Lru/ozon/app/android/atoms/af/AtomAction;", "LTg/b;", "<init>", "()V", "Move", "InvalidAction", "Click", "OpenNestedPage", "OpenComposerNestedPage", "CurtainShowConfig", "Dismiss", "DismissAndScroll", "DismissRedirect", "DismissRefresh", "ScrollToWidget", "ScrollToWidgetByKey", "ComposerAction", "ActionSheet", "Refresh", "ScrollPosition", "Lru/ozon/app/android/atoms/af/AtomAction$ActionSheet;", "Lru/ozon/app/android/atoms/af/AtomAction$Click;", "Lru/ozon/app/android/atoms/af/AtomAction$ComposerAction;", "Lru/ozon/app/android/atoms/af/AtomAction$Dismiss;", "Lru/ozon/app/android/atoms/af/AtomAction$DismissAndScroll;", "Lru/ozon/app/android/atoms/af/AtomAction$DismissRedirect;", "Lru/ozon/app/android/atoms/af/AtomAction$DismissRefresh;", "Lru/ozon/app/android/atoms/af/AtomAction$InvalidAction;", "Lru/ozon/app/android/atoms/af/AtomAction$Move;", "Lru/ozon/app/android/atoms/af/AtomAction$OpenComposerNestedPage;", "Lru/ozon/app/android/atoms/af/AtomAction$OpenNestedPage;", "Lru/ozon/app/android/atoms/af/AtomAction$Refresh;", "Lru/ozon/app/android/atoms/af/AtomAction$ScrollToWidget;", "Lru/ozon/app/android/atoms/af/AtomAction$ScrollToWidgetByKey;", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class AtomAction implements b {

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00022\u00020\u0002BU\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0019\u0010\u000fR(\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR(\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/atoms/af/AtomAction$ActionSheet;", "Lru/ozon/app/android/atoms/af/AtomAction;", "", "", "id", "actionName", "", "params", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "Lru/ozon/app/android/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;", "usageAnalytics", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lru/ozon/app/android/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getActionName", "Ljava/util/Map;", "getParams", "()Ljava/util/Map;", "getTrackingInfo", "Lru/ozon/app/android/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;", "getUsageAnalytics", "()Lru/ozon/app/android/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ActionSheet extends AtomAction {

        @NotNull
        private final String actionName;
        private final String id;
        private final Map<String, String> params;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;
        private final AtomAction$HasUsageAnalytics$UsageAnalytics usageAnalytics;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionSheet(String str, @NotNull String actionName, Map<String, String> map, Map<String, TokenizedTrackingInfo> map2, AtomAction$HasUsageAnalytics$UsageAnalytics atomAction$HasUsageAnalytics$UsageAnalytics) {
            super(null);
            Intrinsics.checkNotNullParameter(actionName, "actionName");
            this.id = str;
            this.actionName = actionName;
            this.params = map;
            this.trackingInfo = map2;
            this.usageAnalytics = atomAction$HasUsageAnalytics$UsageAnalytics;
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

        @Override // Tg.b
        public String getId() {
            return this.id;
        }

        public int hashCode() {
            String str = this.id;
            int a11 = g.a((str == null ? 0 : str.hashCode()) * 31, 31, this.actionName);
            Map<String, String> map = this.params;
            int hashCode = (a11 + (map == null ? 0 : map.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map2 = this.trackingInfo;
            int hashCode2 = (hashCode + (map2 == null ? 0 : map2.hashCode())) * 31;
            AtomAction$HasUsageAnalytics$UsageAnalytics atomAction$HasUsageAnalytics$UsageAnalytics = this.usageAnalytics;
            return hashCode2 + (atomAction$HasUsageAnalytics$UsageAnalytics != null ? atomAction$HasUsageAnalytics$UsageAnalytics.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.id;
            String str2 = this.actionName;
            Map<String, String> map = this.params;
            Map<String, TokenizedTrackingInfo> map2 = this.trackingInfo;
            AtomAction$HasUsageAnalytics$UsageAnalytics atomAction$HasUsageAnalytics$UsageAnalytics = this.usageAnalytics;
            StringBuilder d11 = C3660k.d("ActionSheet(id=", str, ", actionName=", str2, ", params=");
            Tl.b.g(d11, map, ", trackingInfo=", map2, ", usageAnalytics=");
            d11.append(atomAction$HasUsageAnalytics$UsageAnalytics);
            d11.append(")");
            return d11.toString();
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00022\u00020\u0002Bc\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u0011R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001b\u0010\u0011R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u001c\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001eR(\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\"\u0010#R(\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b$\u0010#R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/ozon/app/android/atoms/af/AtomAction$Click;", "Lru/ozon/app/android/atoms/af/AtomAction;", "", "", "id", "link", "Lru/ozon/app/android/atoms/data/AtomDTO;", "dto", "", "params", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "Lru/ozon/app/android/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;", "usageAnalytics", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/atoms/data/AtomDTO;Ljava/util/Map;Ljava/util/Map;Lru/ozon/app/android/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getLink", "Lru/ozon/app/android/atoms/data/AtomDTO;", "getDto", "()Lru/ozon/app/android/atoms/data/AtomDTO;", "getDto$annotations", "()V", "Ljava/util/Map;", "getParams", "()Ljava/util/Map;", "getTrackingInfo", "Lru/ozon/app/android/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;", "getUsageAnalytics", "()Lru/ozon/app/android/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Click extends AtomAction {
        private final AtomDTO dto;
        private final String id;
        private final String link;
        private final Map<String, String> params;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;
        private final AtomAction$HasUsageAnalytics$UsageAnalytics usageAnalytics;

        public Click(String str, String str2, AtomDTO atomDTO, Map<String, String> map, Map<String, TokenizedTrackingInfo> map2, AtomAction$HasUsageAnalytics$UsageAnalytics atomAction$HasUsageAnalytics$UsageAnalytics) {
            super(null);
            this.id = str;
            this.link = str2;
            this.dto = atomDTO;
            this.params = map;
            this.trackingInfo = map2;
            this.usageAnalytics = atomAction$HasUsageAnalytics$UsageAnalytics;
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

        @Override // Tg.b
        public String getId() {
            return this.id;
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
            AtomAction$HasUsageAnalytics$UsageAnalytics atomAction$HasUsageAnalytics$UsageAnalytics = this.usageAnalytics;
            return hashCode5 + (atomAction$HasUsageAnalytics$UsageAnalytics != null ? atomAction$HasUsageAnalytics$UsageAnalytics.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.id;
            String str2 = this.link;
            AtomDTO atomDTO = this.dto;
            Map<String, String> map = this.params;
            Map<String, TokenizedTrackingInfo> map2 = this.trackingInfo;
            AtomAction$HasUsageAnalytics$UsageAnalytics atomAction$HasUsageAnalytics$UsageAnalytics = this.usageAnalytics;
            StringBuilder d11 = C3660k.d("Click(id=", str, ", link=", str2, ", dto=");
            d11.append(atomDTO);
            d11.append(", params=");
            d11.append(map);
            d11.append(", trackingInfo=");
            d11.append(map2);
            d11.append(", usageAnalytics=");
            d11.append(atomAction$HasUsageAnalytics$UsageAnalytics);
            d11.append(")");
            return d11.toString();
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00022\u00020\u0002BU\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0019\u0010\u000fR(\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR(\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/atoms/af/AtomAction$ComposerAction;", "Lru/ozon/app/android/atoms/af/AtomAction;", "", "", "id", "actionName", "", "params", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "Lru/ozon/app/android/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;", "usageAnalytics", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lru/ozon/app/android/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getActionName", "Ljava/util/Map;", "getParams", "()Ljava/util/Map;", "getTrackingInfo", "Lru/ozon/app/android/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;", "getUsageAnalytics", "()Lru/ozon/app/android/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ComposerAction extends AtomAction {

        @NotNull
        private final String actionName;
        private final String id;
        private final Map<String, String> params;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;
        private final AtomAction$HasUsageAnalytics$UsageAnalytics usageAnalytics;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ComposerAction(String str, @NotNull String actionName, Map<String, String> map, Map<String, TokenizedTrackingInfo> map2, AtomAction$HasUsageAnalytics$UsageAnalytics atomAction$HasUsageAnalytics$UsageAnalytics) {
            super(null);
            Intrinsics.checkNotNullParameter(actionName, "actionName");
            this.id = str;
            this.actionName = actionName;
            this.params = map;
            this.trackingInfo = map2;
            this.usageAnalytics = atomAction$HasUsageAnalytics$UsageAnalytics;
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

        @Override // Tg.b
        public String getId() {
            return this.id;
        }

        public int hashCode() {
            String str = this.id;
            int a11 = g.a((str == null ? 0 : str.hashCode()) * 31, 31, this.actionName);
            Map<String, String> map = this.params;
            int hashCode = (a11 + (map == null ? 0 : map.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map2 = this.trackingInfo;
            int hashCode2 = (hashCode + (map2 == null ? 0 : map2.hashCode())) * 31;
            AtomAction$HasUsageAnalytics$UsageAnalytics atomAction$HasUsageAnalytics$UsageAnalytics = this.usageAnalytics;
            return hashCode2 + (atomAction$HasUsageAnalytics$UsageAnalytics != null ? atomAction$HasUsageAnalytics$UsageAnalytics.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.id;
            String str2 = this.actionName;
            Map<String, String> map = this.params;
            Map<String, TokenizedTrackingInfo> map2 = this.trackingInfo;
            AtomAction$HasUsageAnalytics$UsageAnalytics atomAction$HasUsageAnalytics$UsageAnalytics = this.usageAnalytics;
            StringBuilder d11 = C3660k.d("ComposerAction(id=", str, ", actionName=", str2, ", params=");
            Tl.b.g(d11, map, ", trackingInfo=", map2, ", usageAnalytics=");
            d11.append(atomAction$HasUsageAnalytics$UsageAnalytics);
            d11.append(")");
            return d11.toString();
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/atoms/af/AtomAction$CurtainShowConfig;", "", "<init>", "()V", "None", "Full", "Wrap", "Ratio", "Lru/ozon/app/android/atoms/af/AtomAction$CurtainShowConfig$Full;", "Lru/ozon/app/android/atoms/af/AtomAction$CurtainShowConfig$None;", "Lru/ozon/app/android/atoms/af/AtomAction$CurtainShowConfig$Ratio;", "Lru/ozon/app/android/atoms/af/AtomAction$CurtainShowConfig$Wrap;", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class CurtainShowConfig {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/atoms/af/AtomAction$CurtainShowConfig$Full;", "Lru/ozon/app/android/atoms/af/AtomAction$CurtainShowConfig;", "<init>", "()V", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Full extends CurtainShowConfig {

            @NotNull
            public static final Full INSTANCE = new Full();

            private Full() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/atoms/af/AtomAction$CurtainShowConfig$None;", "Lru/ozon/app/android/atoms/af/AtomAction$CurtainShowConfig;", "<init>", "()V", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class None extends CurtainShowConfig {

            @NotNull
            public static final None INSTANCE = new None();

            private None() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/atoms/af/AtomAction$CurtainShowConfig$Ratio;", "Lru/ozon/app/android/atoms/af/AtomAction$CurtainShowConfig;", "", "ratio", "<init>", "(F)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getRatio", "()F", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/atoms/af/AtomAction$CurtainShowConfig$Wrap;", "Lru/ozon/app/android/atoms/af/AtomAction$CurtainShowConfig;", "", "minimumHeight", "<init>", "(Ljava/lang/Integer;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getMinimumHeight", "()Ljava/lang/Integer;", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00022\u00020\u00022\u00020\u0003BM\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u000fR(\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR(\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/atoms/af/AtomAction$Dismiss;", "Lru/ozon/app/android/atoms/af/AtomAction;", "", "LTg/b$a;", "", "id", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "params", "Lru/ozon/app/android/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;", "usageAnalytics", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lru/ozon/app/android/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "getParams", "Lru/ozon/app/android/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;", "getUsageAnalytics", "()Lru/ozon/app/android/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Dismiss extends AtomAction implements b.a {
        private final String id;
        private final Map<String, String> params;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;
        private final AtomAction$HasUsageAnalytics$UsageAnalytics usageAnalytics;

        public Dismiss(String str, Map<String, TokenizedTrackingInfo> map, Map<String, String> map2, AtomAction$HasUsageAnalytics$UsageAnalytics atomAction$HasUsageAnalytics$UsageAnalytics) {
            super(null);
            this.id = str;
            this.trackingInfo = map;
            this.params = map2;
            this.usageAnalytics = atomAction$HasUsageAnalytics$UsageAnalytics;
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

        @Override // Tg.b
        public String getId() {
            return this.id;
        }

        public int hashCode() {
            String str = this.id;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
            Map<String, String> map2 = this.params;
            int hashCode3 = (hashCode2 + (map2 == null ? 0 : map2.hashCode())) * 31;
            AtomAction$HasUsageAnalytics$UsageAnalytics atomAction$HasUsageAnalytics$UsageAnalytics = this.usageAnalytics;
            return hashCode3 + (atomAction$HasUsageAnalytics$UsageAnalytics != null ? atomAction$HasUsageAnalytics$UsageAnalytics.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Dismiss(id=" + this.id + ", trackingInfo=" + this.trackingInfo + ", params=" + this.params + ", usageAnalytics=" + this.usageAnalytics + ")";
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00022\u00020\u0002BW\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0019\u0010\u000fR(\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR(\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b \u0010\u001c¨\u0006!"}, d2 = {"Lru/ozon/app/android/atoms/af/AtomAction$DismissAndScroll;", "Lru/ozon/app/android/atoms/af/AtomAction;", "", "", "id", "link", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "Lru/ozon/app/android/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;", "usageAnalytics", "params", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lru/ozon/app/android/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getLink", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "Lru/ozon/app/android/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;", "getUsageAnalytics", "()Lru/ozon/app/android/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;", "getParams", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DismissAndScroll extends AtomAction {
        private final String id;
        private final String link;
        private final Map<String, String> params;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;
        private final AtomAction$HasUsageAnalytics$UsageAnalytics usageAnalytics;

        public DismissAndScroll(String str, String str2, Map<String, TokenizedTrackingInfo> map, AtomAction$HasUsageAnalytics$UsageAnalytics atomAction$HasUsageAnalytics$UsageAnalytics, Map<String, String> map2) {
            super(null);
            this.id = str;
            this.link = str2;
            this.trackingInfo = map;
            this.usageAnalytics = atomAction$HasUsageAnalytics$UsageAnalytics;
            this.params = map2;
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

        @Override // Tg.b
        public String getId() {
            return this.id;
        }

        public int hashCode() {
            String str = this.id;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.link;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            int hashCode3 = (hashCode2 + (map == null ? 0 : map.hashCode())) * 31;
            AtomAction$HasUsageAnalytics$UsageAnalytics atomAction$HasUsageAnalytics$UsageAnalytics = this.usageAnalytics;
            int hashCode4 = (hashCode3 + (atomAction$HasUsageAnalytics$UsageAnalytics == null ? 0 : atomAction$HasUsageAnalytics$UsageAnalytics.hashCode())) * 31;
            Map<String, String> map2 = this.params;
            return hashCode4 + (map2 != null ? map2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.id;
            String str2 = this.link;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            AtomAction$HasUsageAnalytics$UsageAnalytics atomAction$HasUsageAnalytics$UsageAnalytics = this.usageAnalytics;
            Map<String, String> map2 = this.params;
            StringBuilder d11 = C3660k.d("DismissAndScroll(id=", str, ", link=", str2, ", trackingInfo=");
            d11.append(map);
            d11.append(", usageAnalytics=");
            d11.append(atomAction$HasUsageAnalytics$UsageAnalytics);
            d11.append(", params=");
            return P.f(d11, map2, ")");
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00022\u00020\u00022\u00020\u0003BW\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001a\u0010\u0010R(\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR(\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/atoms/af/AtomAction$DismissRedirect;", "Lru/ozon/app/android/atoms/af/AtomAction;", "", "LTg/b$b;", "", "id", "link", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "params", "Lru/ozon/app/android/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;", "usageAnalytics", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lru/ozon/app/android/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getLink", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "getParams", "Lru/ozon/app/android/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;", "getUsageAnalytics", "()Lru/ozon/app/android/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DismissRedirect extends AtomAction implements b.InterfaceC0546b {
        private final String id;
        private final String link;
        private final Map<String, String> params;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;
        private final AtomAction$HasUsageAnalytics$UsageAnalytics usageAnalytics;

        public DismissRedirect(String str, String str2, Map<String, TokenizedTrackingInfo> map, Map<String, String> map2, AtomAction$HasUsageAnalytics$UsageAnalytics atomAction$HasUsageAnalytics$UsageAnalytics) {
            super(null);
            this.id = str;
            this.link = str2;
            this.trackingInfo = map;
            this.params = map2;
            this.usageAnalytics = atomAction$HasUsageAnalytics$UsageAnalytics;
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

        @Override // Tg.b
        public String getId() {
            return this.id;
        }

        @Override // Tg.b.InterfaceC0546b
        public String getLink() {
            return this.link;
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
            AtomAction$HasUsageAnalytics$UsageAnalytics atomAction$HasUsageAnalytics$UsageAnalytics = this.usageAnalytics;
            return hashCode4 + (atomAction$HasUsageAnalytics$UsageAnalytics != null ? atomAction$HasUsageAnalytics$UsageAnalytics.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.id;
            String str2 = this.link;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            Map<String, String> map2 = this.params;
            AtomAction$HasUsageAnalytics$UsageAnalytics atomAction$HasUsageAnalytics$UsageAnalytics = this.usageAnalytics;
            StringBuilder d11 = C3660k.d("DismissRedirect(id=", str, ", link=", str2, ", trackingInfo=");
            Tl.b.g(d11, map, ", params=", map2, ", usageAnalytics=");
            d11.append(atomAction$HasUsageAnalytics$UsageAnalytics);
            d11.append(")");
            return d11.toString();
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00022\u00020\u0002Bc\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u0011R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001b\u0010\u0011R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR(\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\"\u001a\u0004\b#\u0010$R(\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u001f\u001a\u0004\b%\u0010!¨\u0006&"}, d2 = {"Lru/ozon/app/android/atoms/af/AtomAction$DismissRefresh;", "Lru/ozon/app/android/atoms/af/AtomAction;", "", "", "id", "link", "Lru/ozon/app/android/atoms/af/AtomAction$ScrollPosition;", "scrollPosition", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "Lru/ozon/app/android/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;", "usageAnalytics", "params", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/atoms/af/AtomAction$ScrollPosition;Ljava/util/Map;Lru/ozon/app/android/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getLink", "Lru/ozon/app/android/atoms/af/AtomAction$ScrollPosition;", "getScrollPosition", "()Lru/ozon/app/android/atoms/af/AtomAction$ScrollPosition;", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "Lru/ozon/app/android/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;", "getUsageAnalytics", "()Lru/ozon/app/android/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;", "getParams", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DismissRefresh extends AtomAction {
        private final String id;
        private final String link;
        private final Map<String, String> params;
        private final ScrollPosition scrollPosition;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;
        private final AtomAction$HasUsageAnalytics$UsageAnalytics usageAnalytics;

        public DismissRefresh(String str, String str2, ScrollPosition scrollPosition, Map<String, TokenizedTrackingInfo> map, AtomAction$HasUsageAnalytics$UsageAnalytics atomAction$HasUsageAnalytics$UsageAnalytics, Map<String, String> map2) {
            super(null);
            this.id = str;
            this.link = str2;
            this.scrollPosition = scrollPosition;
            this.trackingInfo = map;
            this.usageAnalytics = atomAction$HasUsageAnalytics$UsageAnalytics;
            this.params = map2;
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

        @Override // Tg.b
        public String getId() {
            return this.id;
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
            AtomAction$HasUsageAnalytics$UsageAnalytics atomAction$HasUsageAnalytics$UsageAnalytics = this.usageAnalytics;
            int hashCode5 = (hashCode4 + (atomAction$HasUsageAnalytics$UsageAnalytics == null ? 0 : atomAction$HasUsageAnalytics$UsageAnalytics.hashCode())) * 31;
            Map<String, String> map2 = this.params;
            return hashCode5 + (map2 != null ? map2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.id;
            String str2 = this.link;
            ScrollPosition scrollPosition = this.scrollPosition;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            AtomAction$HasUsageAnalytics$UsageAnalytics atomAction$HasUsageAnalytics$UsageAnalytics = this.usageAnalytics;
            Map<String, String> map2 = this.params;
            StringBuilder d11 = C3660k.d("DismissRefresh(id=", str, ", link=", str2, ", scrollPosition=");
            d11.append(scrollPosition);
            d11.append(", trackingInfo=");
            d11.append(map);
            d11.append(", usageAnalytics=");
            d11.append(atomAction$HasUsageAnalytics$UsageAnalytics);
            d11.append(", params=");
            d11.append(map2);
            d11.append(")");
            return d11.toString();
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B+\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0015\u0010\u000bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/atoms/af/AtomAction$InvalidAction;", "Lru/ozon/app/android/atoms/af/AtomAction;", "", "", "id", "link", "Lru/ozon/app/android/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;", "usageAnalytics", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getLink", "Lru/ozon/app/android/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;", "getUsageAnalytics", "()Lru/ozon/app/android/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InvalidAction extends AtomAction {
        private final String id;
        private final String link;
        private final AtomAction$HasUsageAnalytics$UsageAnalytics usageAnalytics;

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

        @Override // Tg.b
        public String getId() {
            return this.id;
        }

        public int hashCode() {
            String str = this.id;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.link;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            AtomAction$HasUsageAnalytics$UsageAnalytics atomAction$HasUsageAnalytics$UsageAnalytics = this.usageAnalytics;
            return hashCode2 + (atomAction$HasUsageAnalytics$UsageAnalytics != null ? atomAction$HasUsageAnalytics$UsageAnalytics.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.id;
            String str2 = this.link;
            AtomAction$HasUsageAnalytics$UsageAnalytics atomAction$HasUsageAnalytics$UsageAnalytics = this.usageAnalytics;
            StringBuilder d11 = C3660k.d("InvalidAction(id=", str, ", link=", str2, ", usageAnalytics=");
            d11.append(atomAction$HasUsageAnalytics$UsageAnalytics);
            d11.append(")");
            return d11.toString();
        }

        public /* synthetic */ InvalidAction(String str, String str2, AtomAction$HasUsageAnalytics$UsageAnalytics atomAction$HasUsageAnalytics$UsageAnalytics, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : atomAction$HasUsageAnalytics$UsageAnalytics);
        }

        public InvalidAction(String str, String str2, AtomAction$HasUsageAnalytics$UsageAnalytics atomAction$HasUsageAnalytics$UsageAnalytics) {
            super(null);
            this.id = str;
            this.link = str2;
            this.usageAnalytics = atomAction$HasUsageAnalytics$UsageAnalytics;
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00022\u00020\u00022\u00020\u0003BW\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010R(\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR(\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u001e\u0010\u0010R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/atoms/af/AtomAction$Move;", "Lru/ozon/app/android/atoms/af/AtomAction;", "", "LTg/b$d;", "", "link", "", "params", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "id", "Lru/ozon/app/android/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;", "usageAnalytics", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Lru/ozon/app/android/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLink", "Ljava/util/Map;", "getParams", "()Ljava/util/Map;", "getTrackingInfo", "getId", "Lru/ozon/app/android/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;", "getUsageAnalytics", "()Lru/ozon/app/android/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Move extends AtomAction implements b.d {
        private final String id;
        private final String link;
        private final Map<String, String> params;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;
        private final AtomAction$HasUsageAnalytics$UsageAnalytics usageAnalytics;

        public Move(String str, Map<String, String> map, Map<String, TokenizedTrackingInfo> map2, String str2, AtomAction$HasUsageAnalytics$UsageAnalytics atomAction$HasUsageAnalytics$UsageAnalytics) {
            super(null);
            this.link = str;
            this.params = map;
            this.trackingInfo = map2;
            this.id = str2;
            this.usageAnalytics = atomAction$HasUsageAnalytics$UsageAnalytics;
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

        @Override // Tg.b
        public String getId() {
            return this.id;
        }

        @Override // Tg.b.d
        public String getLink() {
            return this.link;
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
            AtomAction$HasUsageAnalytics$UsageAnalytics atomAction$HasUsageAnalytics$UsageAnalytics = this.usageAnalytics;
            return hashCode4 + (atomAction$HasUsageAnalytics$UsageAnalytics != null ? atomAction$HasUsageAnalytics$UsageAnalytics.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Move(link=" + this.link + ", params=" + this.params + ", trackingInfo=" + this.trackingInfo + ", id=" + this.id + ", usageAnalytics=" + this.usageAnalytics + ")";
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00022\u00020\u0002Bi\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001c\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"R(\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010&\u001a\u0004\b'\u0010(R(\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010#\u001a\u0004\b)\u0010%¨\u0006*"}, d2 = {"Lru/ozon/app/android/atoms/af/AtomAction$OpenComposerNestedPage;", "Lru/ozon/app/android/atoms/af/AtomAction;", "", "", "id", "link", "Lru/ozon/app/android/atoms/af/AtomAction$CurtainShowConfig;", "showConfig", "", "cancellable", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "Lru/ozon/app/android/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;", "usageAnalytics", "params", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/atoms/af/AtomAction$CurtainShowConfig;ZLjava/util/Map;Lru/ozon/app/android/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getLink", "Lru/ozon/app/android/atoms/af/AtomAction$CurtainShowConfig;", "getShowConfig", "()Lru/ozon/app/android/atoms/af/AtomAction$CurtainShowConfig;", "Z", "getCancellable", "()Z", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "Lru/ozon/app/android/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;", "getUsageAnalytics", "()Lru/ozon/app/android/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;", "getParams", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OpenComposerNestedPage extends AtomAction {
        private final boolean cancellable;
        private final String id;

        @NotNull
        private final String link;
        private final Map<String, String> params;

        @NotNull
        private final CurtainShowConfig showConfig;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;
        private final AtomAction$HasUsageAnalytics$UsageAnalytics usageAnalytics;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenComposerNestedPage(String str, @NotNull String link, @NotNull CurtainShowConfig showConfig, boolean z11, Map<String, TokenizedTrackingInfo> map, AtomAction$HasUsageAnalytics$UsageAnalytics atomAction$HasUsageAnalytics$UsageAnalytics, Map<String, String> map2) {
            super(null);
            Intrinsics.checkNotNullParameter(link, "link");
            Intrinsics.checkNotNullParameter(showConfig, "showConfig");
            this.id = str;
            this.link = link;
            this.showConfig = showConfig;
            this.cancellable = z11;
            this.trackingInfo = map;
            this.usageAnalytics = atomAction$HasUsageAnalytics$UsageAnalytics;
            this.params = map2;
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

        @Override // Tg.b
        public String getId() {
            return this.id;
        }

        public int hashCode() {
            String str = this.id;
            int a11 = C3532b.a((this.showConfig.hashCode() + g.a((str == null ? 0 : str.hashCode()) * 31, 31, this.link)) * 31, 31, this.cancellable);
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            int hashCode = (a11 + (map == null ? 0 : map.hashCode())) * 31;
            AtomAction$HasUsageAnalytics$UsageAnalytics atomAction$HasUsageAnalytics$UsageAnalytics = this.usageAnalytics;
            int hashCode2 = (hashCode + (atomAction$HasUsageAnalytics$UsageAnalytics == null ? 0 : atomAction$HasUsageAnalytics$UsageAnalytics.hashCode())) * 31;
            Map<String, String> map2 = this.params;
            return hashCode2 + (map2 != null ? map2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.id;
            String str2 = this.link;
            CurtainShowConfig curtainShowConfig = this.showConfig;
            boolean z11 = this.cancellable;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            AtomAction$HasUsageAnalytics$UsageAnalytics atomAction$HasUsageAnalytics$UsageAnalytics = this.usageAnalytics;
            Map<String, String> map2 = this.params;
            StringBuilder d11 = C3660k.d("OpenComposerNestedPage(id=", str, ", link=", str2, ", showConfig=");
            d11.append(curtainShowConfig);
            d11.append(", cancellable=");
            d11.append(z11);
            d11.append(", trackingInfo=");
            d11.append(map);
            d11.append(", usageAnalytics=");
            d11.append(atomAction$HasUsageAnalytics$UsageAnalytics);
            d11.append(", params=");
            return P.f(d11, map2, ")");
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00022\u00020\u0002B_\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001b\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR(\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\"\u001a\u0004\b#\u0010$R(\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u001f\u001a\u0004\b%\u0010!¨\u0006&"}, d2 = {"Lru/ozon/app/android/atoms/af/AtomAction$OpenNestedPage;", "Lru/ozon/app/android/atoms/af/AtomAction;", "", "", "id", "nestedPageKey", "Lru/ozon/app/android/atoms/af/AtomAction$CurtainShowConfig;", "showConfig", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "Lru/ozon/app/android/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;", "usageAnalytics", "params", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/atoms/af/AtomAction$CurtainShowConfig;Ljava/util/Map;Lru/ozon/app/android/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getNestedPageKey", "Lru/ozon/app/android/atoms/af/AtomAction$CurtainShowConfig;", "getShowConfig", "()Lru/ozon/app/android/atoms/af/AtomAction$CurtainShowConfig;", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "Lru/ozon/app/android/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;", "getUsageAnalytics", "()Lru/ozon/app/android/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;", "getParams", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OpenNestedPage extends AtomAction {
        private final String id;

        @NotNull
        private final String nestedPageKey;
        private final Map<String, String> params;

        @NotNull
        private final CurtainShowConfig showConfig;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;
        private final AtomAction$HasUsageAnalytics$UsageAnalytics usageAnalytics;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenNestedPage(String str, @NotNull String nestedPageKey, @NotNull CurtainShowConfig showConfig, Map<String, TokenizedTrackingInfo> map, AtomAction$HasUsageAnalytics$UsageAnalytics atomAction$HasUsageAnalytics$UsageAnalytics, Map<String, String> map2) {
            super(null);
            Intrinsics.checkNotNullParameter(nestedPageKey, "nestedPageKey");
            Intrinsics.checkNotNullParameter(showConfig, "showConfig");
            this.id = str;
            this.nestedPageKey = nestedPageKey;
            this.showConfig = showConfig;
            this.trackingInfo = map;
            this.usageAnalytics = atomAction$HasUsageAnalytics$UsageAnalytics;
            this.params = map2;
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

        @Override // Tg.b
        public String getId() {
            return this.id;
        }

        public int hashCode() {
            String str = this.id;
            int hashCode = (this.showConfig.hashCode() + g.a((str == null ? 0 : str.hashCode()) * 31, 31, this.nestedPageKey)) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
            AtomAction$HasUsageAnalytics$UsageAnalytics atomAction$HasUsageAnalytics$UsageAnalytics = this.usageAnalytics;
            int hashCode3 = (hashCode2 + (atomAction$HasUsageAnalytics$UsageAnalytics == null ? 0 : atomAction$HasUsageAnalytics$UsageAnalytics.hashCode())) * 31;
            Map<String, String> map2 = this.params;
            return hashCode3 + (map2 != null ? map2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.id;
            String str2 = this.nestedPageKey;
            CurtainShowConfig curtainShowConfig = this.showConfig;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            AtomAction$HasUsageAnalytics$UsageAnalytics atomAction$HasUsageAnalytics$UsageAnalytics = this.usageAnalytics;
            Map<String, String> map2 = this.params;
            StringBuilder d11 = C3660k.d("OpenNestedPage(id=", str, ", nestedPageKey=", str2, ", showConfig=");
            d11.append(curtainShowConfig);
            d11.append(", trackingInfo=");
            d11.append(map);
            d11.append(", usageAnalytics=");
            d11.append(atomAction$HasUsageAnalytics$UsageAnalytics);
            d11.append(", params=");
            d11.append(map2);
            d11.append(")");
            return d11.toString();
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00022\u00020\u0003Ba\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\t¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u0012R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001f\u0010\u0012R(\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010#\u001a\u0004\b$\u0010%R(\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010 \u001a\u0004\b&\u0010\"R\u001c\u0010(\u001a\u0004\u0018\u00010'8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lru/ozon/app/android/atoms/af/AtomAction$Refresh;", "Lru/ozon/app/android/atoms/af/AtomAction;", "", "LTg/b$e;", "", "link", "Lru/ozon/app/android/atoms/af/AtomAction$ScrollPosition;", "scrollPosition", "id", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "Lru/ozon/app/android/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;", "usageAnalytics", "params", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/atoms/af/AtomAction$ScrollPosition;Ljava/lang/String;Ljava/util/Map;Lru/ozon/app/android/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLink", "Lru/ozon/app/android/atoms/af/AtomAction$ScrollPosition;", "getScrollPosition", "()Lru/ozon/app/android/atoms/af/AtomAction$ScrollPosition;", "getId", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "Lru/ozon/app/android/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;", "getUsageAnalytics", "()Lru/ozon/app/android/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;", "getParams", "LTg/b$f;", "scrollTo", "LTg/b$f;", "getScrollTo", "()LTg/b$f;", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Refresh extends AtomAction implements b.e {
        private final String id;
        private final String link;
        private final Map<String, String> params;
        private final ScrollPosition scrollPosition;
        private final b.f scrollTo;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;
        private final AtomAction$HasUsageAnalytics$UsageAnalytics usageAnalytics;

        public Refresh(String str, ScrollPosition scrollPosition, String str2, Map<String, TokenizedTrackingInfo> map, AtomAction$HasUsageAnalytics$UsageAnalytics atomAction$HasUsageAnalytics$UsageAnalytics, Map<String, String> map2) {
            super(null);
            this.link = str;
            this.scrollPosition = scrollPosition;
            this.id = str2;
            this.trackingInfo = map;
            this.usageAnalytics = atomAction$HasUsageAnalytics$UsageAnalytics;
            this.params = map2;
            this.scrollTo = scrollPosition;
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

        @Override // Tg.b
        public String getId() {
            return this.id;
        }

        @Override // Tg.b.e
        public String getLink() {
            return this.link;
        }

        @Override // Tg.b.e
        public b.f getScrollTo() {
            return this.scrollTo;
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
            AtomAction$HasUsageAnalytics$UsageAnalytics atomAction$HasUsageAnalytics$UsageAnalytics = this.usageAnalytics;
            int hashCode5 = (hashCode4 + (atomAction$HasUsageAnalytics$UsageAnalytics == null ? 0 : atomAction$HasUsageAnalytics$UsageAnalytics.hashCode())) * 31;
            Map<String, String> map2 = this.params;
            return hashCode5 + (map2 != null ? map2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.link;
            ScrollPosition scrollPosition = this.scrollPosition;
            String str2 = this.id;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            AtomAction$HasUsageAnalytics$UsageAnalytics atomAction$HasUsageAnalytics$UsageAnalytics = this.usageAnalytics;
            Map<String, String> map2 = this.params;
            StringBuilder sb2 = new StringBuilder("Refresh(link=");
            sb2.append(str);
            sb2.append(", scrollPosition=");
            sb2.append(scrollPosition);
            sb2.append(", id=");
            C2638a.e(sb2, str2, ", trackingInfo=", map, ", usageAnalytics=");
            sb2.append(atomAction$HasUsageAnalytics$UsageAnalytics);
            sb2.append(", params=");
            sb2.append(map2);
            sb2.append(")");
            return sb2.toString();
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/atoms/af/AtomAction$ScrollPosition;", "LTg/b$f;", "<init>", "()V", "Top", "None", "Lru/ozon/app/android/atoms/af/AtomAction$ScrollPosition$None;", "Lru/ozon/app/android/atoms/af/AtomAction$ScrollPosition$Top;", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class ScrollPosition implements b.f {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/ozon/app/android/atoms/af/AtomAction$ScrollPosition$None;", "Lru/ozon/app/android/atoms/af/AtomAction$ScrollPosition;", "", "<init>", "()V", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class None extends ScrollPosition {

            @NotNull
            public static final None INSTANCE = new None();

            private None() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/ozon/app/android/atoms/af/AtomAction$ScrollPosition$Top;", "Lru/ozon/app/android/atoms/af/AtomAction$ScrollPosition;", "LTg/b$f$b;", "<init>", "()V", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00022\u00020\u0003BU\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001a\u0010\u0010R(\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001e\u001a\u0004\b\u001f\u0010 R(\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b!\u0010\u001d¨\u0006\""}, d2 = {"Lru/ozon/app/android/atoms/af/AtomAction$ScrollToWidget;", "Lru/ozon/app/android/atoms/af/AtomAction;", "", "LTg/b$g;", "", "id", "widgetName", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "Lru/ozon/app/android/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;", "usageAnalytics", "params", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lru/ozon/app/android/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getWidgetName", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "Lru/ozon/app/android/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;", "getUsageAnalytics", "()Lru/ozon/app/android/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;", "getParams", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ScrollToWidget extends AtomAction implements b.g {
        private final String id;
        private final Map<String, String> params;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;
        private final AtomAction$HasUsageAnalytics$UsageAnalytics usageAnalytics;

        @NotNull
        private final String widgetName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ScrollToWidget(String str, @NotNull String widgetName, Map<String, TokenizedTrackingInfo> map, AtomAction$HasUsageAnalytics$UsageAnalytics atomAction$HasUsageAnalytics$UsageAnalytics, Map<String, String> map2) {
            super(null);
            Intrinsics.checkNotNullParameter(widgetName, "widgetName");
            this.id = str;
            this.widgetName = widgetName;
            this.trackingInfo = map;
            this.usageAnalytics = atomAction$HasUsageAnalytics$UsageAnalytics;
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

        @Override // Tg.b
        public String getId() {
            return this.id;
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
            AtomAction$HasUsageAnalytics$UsageAnalytics atomAction$HasUsageAnalytics$UsageAnalytics = this.usageAnalytics;
            int hashCode2 = (hashCode + (atomAction$HasUsageAnalytics$UsageAnalytics == null ? 0 : atomAction$HasUsageAnalytics$UsageAnalytics.hashCode())) * 31;
            Map<String, String> map2 = this.params;
            return hashCode2 + (map2 != null ? map2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.id;
            String str2 = this.widgetName;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            AtomAction$HasUsageAnalytics$UsageAnalytics atomAction$HasUsageAnalytics$UsageAnalytics = this.usageAnalytics;
            Map<String, String> map2 = this.params;
            StringBuilder d11 = C3660k.d("ScrollToWidget(id=", str, ", widgetName=", str2, ", trackingInfo=");
            d11.append(map);
            d11.append(", usageAnalytics=");
            d11.append(atomAction$HasUsageAnalytics$UsageAnalytics);
            d11.append(", params=");
            return P.f(d11, map2, ")");
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0002BU\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u0012R(\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001e\u001a\u0004\b\u001f\u0010 R(\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b!\u0010\u001d¨\u0006\""}, d2 = {"Lru/ozon/app/android/atoms/af/AtomAction$ScrollToWidgetByKey;", "Lru/ozon/app/android/atoms/af/AtomAction;", "", "", "id", "", "widgetKey", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "Lru/ozon/app/android/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;", "usageAnalytics", "params", "<init>", "(Ljava/lang/String;ILjava/util/Map;Lru/ozon/app/android/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "I", "getWidgetKey", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "Lru/ozon/app/android/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;", "getUsageAnalytics", "()Lru/ozon/app/android/atoms/af/AtomAction$HasUsageAnalytics$UsageAnalytics;", "getParams", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ScrollToWidgetByKey extends AtomAction {
        private final String id;
        private final Map<String, String> params;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;
        private final AtomAction$HasUsageAnalytics$UsageAnalytics usageAnalytics;
        private final int widgetKey;

        public ScrollToWidgetByKey(String str, int i11, Map<String, TokenizedTrackingInfo> map, AtomAction$HasUsageAnalytics$UsageAnalytics atomAction$HasUsageAnalytics$UsageAnalytics, Map<String, String> map2) {
            super(null);
            this.id = str;
            this.widgetKey = i11;
            this.trackingInfo = map;
            this.usageAnalytics = atomAction$HasUsageAnalytics$UsageAnalytics;
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

        @Override // Tg.b
        public String getId() {
            return this.id;
        }

        public int hashCode() {
            String str = this.id;
            int a11 = C2454a.a(this.widgetKey, (str == null ? 0 : str.hashCode()) * 31, 31);
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            int hashCode = (a11 + (map == null ? 0 : map.hashCode())) * 31;
            AtomAction$HasUsageAnalytics$UsageAnalytics atomAction$HasUsageAnalytics$UsageAnalytics = this.usageAnalytics;
            int hashCode2 = (hashCode + (atomAction$HasUsageAnalytics$UsageAnalytics == null ? 0 : atomAction$HasUsageAnalytics$UsageAnalytics.hashCode())) * 31;
            Map<String, String> map2 = this.params;
            return hashCode2 + (map2 != null ? map2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.id;
            int i11 = this.widgetKey;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            AtomAction$HasUsageAnalytics$UsageAnalytics atomAction$HasUsageAnalytics$UsageAnalytics = this.usageAnalytics;
            Map<String, String> map2 = this.params;
            StringBuilder c11 = C3660k.c(i11, "ScrollToWidgetByKey(id=", str, ", widgetKey=", ", trackingInfo=");
            c11.append(map);
            c11.append(", usageAnalytics=");
            c11.append(atomAction$HasUsageAnalytics$UsageAnalytics);
            c11.append(", params=");
            return P.f(c11, map2, ")");
        }
    }

    public /* synthetic */ AtomAction(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AtomAction() {
    }
}
