package ru.ozon.app.android.tabbar.ui.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.tabbar.data.BottomNavigationBehavior;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/tabbar/ui/model/BottomMenuItem;", "", "", "id", "Lru/ozon/app/android/tabbar/data/BottomNavigationBehavior;", "behavior", "<init>", "(ILru/ozon/app/android/tabbar/data/BottomNavigationBehavior;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/app/android/tabbar/data/BottomNavigationBehavior;", "getBehavior", "()Lru/ozon/app/android/tabbar/data/BottomNavigationBehavior;", "Companion", "tabbar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class BottomMenuItem {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final BottomMenuItem NONE_ITEM = new BottomMenuItem(-1, BottomNavigationBehavior.BEHAVIOR_TYPE_SELECT);

    @NotNull
    private final BottomNavigationBehavior behavior;
    private final int id;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/tabbar/ui/model/BottomMenuItem$Companion;", "", "<init>", "()V", "NONE_ITEM", "Lru/ozon/app/android/tabbar/ui/model/BottomMenuItem;", "getNONE_ITEM$tabbar_prodGoogleAllVendorsRelease", "()Lru/ozon/app/android/tabbar/ui/model/BottomMenuItem;", "tabbar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final BottomMenuItem getNONE_ITEM$tabbar_prodGoogleAllVendorsRelease() {
            return BottomMenuItem.NONE_ITEM;
        }

        private Companion() {
        }
    }

    public BottomMenuItem(int i11, @NotNull BottomNavigationBehavior behavior) {
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        this.id = i11;
        this.behavior = behavior;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BottomMenuItem)) {
            return false;
        }
        BottomMenuItem bottomMenuItem = (BottomMenuItem) other;
        return this.id == bottomMenuItem.id && this.behavior == bottomMenuItem.behavior;
    }

    @NotNull
    public final BottomNavigationBehavior getBehavior() {
        return this.behavior;
    }

    public final int getId() {
        return this.id;
    }

    public int hashCode() {
        return this.behavior.hashCode() + (Integer.hashCode(this.id) * 31);
    }

    @NotNull
    public String toString() {
        return "BottomMenuItem(id=" + this.id + ", behavior=" + this.behavior + ")";
    }
}
