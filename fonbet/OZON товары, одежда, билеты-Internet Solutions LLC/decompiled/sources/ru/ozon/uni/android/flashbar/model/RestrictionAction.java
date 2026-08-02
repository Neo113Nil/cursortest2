package ru.ozon.uni.android.flashbar.model;

import B0.A0;
import Nh.a;
import Sc.InterfaceC3999a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@InterfaceC3999a
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lru/ozon/uni/android/flashbar/model/RestrictionAction;", "", "<init>", "()V", "OpenDeeplinkAction", "ScrollAction", "RefreshAction", "Lru/ozon/uni/android/flashbar/model/RestrictionAction$OpenDeeplinkAction;", "Lru/ozon/uni/android/flashbar/model/RestrictionAction$RefreshAction;", "Lru/ozon/uni/android/flashbar/model/RestrictionAction$ScrollAction;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class RestrictionAction {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/uni/android/flashbar/model/RestrictionAction$OpenDeeplinkAction;", "Lru/ozon/uni/android/flashbar/model/RestrictionAction;", "", "deeplink", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDeeplink", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OpenDeeplinkAction extends RestrictionAction {

        @NotNull
        private final String deeplink;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenDeeplinkAction(@NotNull String deeplink) {
            super(null);
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            this.deeplink = deeplink;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OpenDeeplinkAction) && Intrinsics.d(this.deeplink, ((OpenDeeplinkAction) other).deeplink);
        }

        @NotNull
        public final String getDeeplink() {
            return this.deeplink;
        }

        public int hashCode() {
            return this.deeplink.hashCode();
        }

        @NotNull
        public String toString() {
            return A0.b("OpenDeeplinkAction(deeplink=", this.deeplink, ")");
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\tR%\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/uni/android/flashbar/model/RestrictionAction$RefreshAction;", "Lru/ozon/uni/android/flashbar/model/RestrictionAction;", "", "deeplink", "", "params", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDeeplink", "Ljava/util/Map;", "getParams", "()Ljava/util/Map;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RefreshAction extends RestrictionAction {
        private final String deeplink;
        private final Map<String, String> params;

        public RefreshAction(String str, Map<String, String> map) {
            super(null);
            this.deeplink = str;
            this.params = map;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RefreshAction)) {
                return false;
            }
            RefreshAction refreshAction = (RefreshAction) other;
            return Intrinsics.d(this.deeplink, refreshAction.deeplink) && Intrinsics.d(this.params, refreshAction.params);
        }

        public final String getDeeplink() {
            return this.deeplink;
        }

        public final Map<String, String> getParams() {
            return this.params;
        }

        public int hashCode() {
            String str = this.deeplink;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Map<String, String> map = this.params;
            return hashCode + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return a.d("RefreshAction(deeplink=", this.deeplink, ", params=", ")", this.params);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/uni/android/flashbar/model/RestrictionAction$ScrollAction;", "Lru/ozon/uni/android/flashbar/model/RestrictionAction;", "", "widgetId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getWidgetId", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ScrollAction extends RestrictionAction {

        @NotNull
        private final String widgetId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ScrollAction(@NotNull String widgetId) {
            super(null);
            Intrinsics.checkNotNullParameter(widgetId, "widgetId");
            this.widgetId = widgetId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ScrollAction) && Intrinsics.d(this.widgetId, ((ScrollAction) other).widgetId);
        }

        @NotNull
        public final String getWidgetId() {
            return this.widgetId;
        }

        public int hashCode() {
            return this.widgetId.hashCode();
        }

        @NotNull
        public String toString() {
            return A0.b("ScrollAction(widgetId=", this.widgetId, ")");
        }
    }

    public /* synthetic */ RestrictionAction(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private RestrictionAction() {
    }
}
