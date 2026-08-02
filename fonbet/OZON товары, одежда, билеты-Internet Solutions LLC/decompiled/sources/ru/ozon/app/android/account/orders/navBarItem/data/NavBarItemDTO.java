package ru.ozon.app.android.account.orders.navBarItem.data;

import B0.A0;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/account/orders/navBarItem/data/NavBarItemDTO;", "", "action", "Lru/ozon/app/android/account/orders/navBarItem/data/NavBarItemDTO$Action;", "<init>", "(Lru/ozon/app/android/account/orders/navBarItem/data/NavBarItemDTO$Action;)V", "getAction", "()Lru/ozon/app/android/account/orders/navBarItem/data/NavBarItemDTO$Action;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Action", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class NavBarItemDTO {
    public static final int $stable = 0;

    @NotNull
    private final Action action;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/account/orders/navBarItem/data/NavBarItemDTO$Action;", "", "type", "", "<init>", "(Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Action {
        public static final int $stable = 0;

        @NotNull
        private final String type;

        public Action(@NotNull String type) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.type = type;
        }

        public static /* synthetic */ Action copy$default(Action action, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = action.type;
            }
            return action.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getType() {
            return this.type;
        }

        @NotNull
        public final Action copy(@NotNull String type) {
            Intrinsics.checkNotNullParameter(type, "type");
            return new Action(type);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Action) && Intrinsics.d(this.type, ((Action) other).type);
        }

        @NotNull
        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            return this.type.hashCode();
        }

        @NotNull
        public String toString() {
            return A0.b("Action(type=", this.type, ")");
        }
    }

    public NavBarItemDTO(@NotNull Action action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.action = action;
    }

    public static /* synthetic */ NavBarItemDTO copy$default(NavBarItemDTO navBarItemDTO, Action action, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            action = navBarItemDTO.action;
        }
        return navBarItemDTO.copy(action);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Action getAction() {
        return this.action;
    }

    @NotNull
    public final NavBarItemDTO copy(@NotNull Action action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return new NavBarItemDTO(action);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof NavBarItemDTO) && Intrinsics.d(this.action, ((NavBarItemDTO) other).action);
    }

    @NotNull
    public final Action getAction() {
        return this.action;
    }

    public int hashCode() {
        return this.action.hashCode();
    }

    @NotNull
    public String toString() {
        return "NavBarItemDTO(action=" + this.action + ")";
    }
}
