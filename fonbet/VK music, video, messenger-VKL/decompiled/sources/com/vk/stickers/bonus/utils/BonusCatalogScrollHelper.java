package com.vk.stickers.bonus.utils;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import io.reactivex.rxjava3.subjects.b;
import xsna.asp;
import xsna.xq;
import xsna.zrp;

/* compiled from: BonusCatalogScrollHelper.kt */
/* loaded from: classes5.dex */
public final class BonusCatalogScrollHelper {
    public final RecyclerView a;
    public final boolean b;
    public final int c;
    public final Snap d;
    public final Speed e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BonusCatalogScrollHelper.kt */
    public static final class Snap {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Snap[] $VALUES;
        public static final Snap END;
        public static final Snap START;

        static {
            Snap snap = new Snap("START", 0);
            START = snap;
            Snap snap2 = new Snap("END", 1);
            END = snap2;
            Snap[] snapArr = {snap, snap2};
            $VALUES = snapArr;
            $ENTRIES = new asp(snapArr);
        }

        public Snap() {
            throw null;
        }

        public static Snap valueOf(String str) {
            return (Snap) Enum.valueOf(Snap.class, str);
        }

        public static Snap[] values() {
            return (Snap[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BonusCatalogScrollHelper.kt */
    public static final class Speed {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Speed[] $VALUES;
        public static final Speed FAST;
        public static final Speed FASTEST;
        public static final Speed NORMAL;
        private final float millisecondsPerInch;
        private final boolean useInstantJump;

        static {
            Speed speed = new Speed(25.0f, 0, "NORMAL", false);
            NORMAL = speed;
            Speed speed2 = new Speed(25.0f, 1, "FAST", true);
            FAST = speed2;
            Speed speed3 = new Speed(16.0f, 2, "FASTEST", true);
            FASTEST = speed3;
            Speed[] speedArr = {speed, speed2, speed3};
            $VALUES = speedArr;
            $ENTRIES = new asp(speedArr);
        }

        public Speed(float f, int i, String str, boolean z) {
            this.useInstantJump = z;
            this.millisecondsPerInch = f;
        }

        public static Speed valueOf(String str) {
            return (Speed) Enum.valueOf(Speed.class, str);
        }

        public static Speed[] values() {
            return (Speed[]) $VALUES.clone();
        }

        public final float h() {
            return this.millisecondsPerInch;
        }

        public final boolean i() {
            return this.useInstantJump;
        }
    }

    /* compiled from: BonusCatalogScrollHelper.kt */
    public static final class a {
        public final int a;
        public final float b;
        public final float c;

        public a(float f, float f2, int i) {
            this.a = i;
            this.b = f;
            this.c = f2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && Float.compare(this.b, aVar.b) == 0 && Float.compare(this.c, aVar.c) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.c) + b.a(this.b, Integer.hashCode(this.a) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Distance(items=");
            sb.append(this.a);
            sb.append(", screens=");
            sb.append(this.b);
            sb.append(", itemsPerScreen=");
            return xq.c(')', this.c, sb);
        }
    }

    public BonusCatalogScrollHelper(RecyclerView recyclerView, int i) {
        Snap snap = Snap.START;
        Speed speed = Speed.NORMAL;
        this.a = recyclerView;
        this.b = true;
        this.c = i;
        this.d = snap;
        this.e = speed;
    }

    public static void d(BonusCatalogScrollHelper bonusCatalogScrollHelper, int i, Snap snap, int i2) {
        boolean z = (i2 & 2) != 0 ? bonusCatalogScrollHelper.b : true;
        int i3 = bonusCatalogScrollHelper.c;
        if ((i2 & 8) != 0) {
            snap = bonusCatalogScrollHelper.d;
        }
        Speed speed = bonusCatalogScrollHelper.e;
        RecyclerView recyclerView = bonusCatalogScrollHelper.a;
        if (bonusCatalogScrollHelper.b().getItemCount() > 0) {
            if (z || bonusCatalogScrollHelper.c(i)) {
                int v = bonusCatalogScrollHelper.b().v();
                int x = bonusCatalogScrollHelper.b().x();
                a a2 = i <= v ? bonusCatalogScrollHelper.a(v, i) : i >= x ? bonusCatalogScrollHelper.a(x, i) : bonusCatalogScrollHelper.a(i, i);
                if (a2 == null) {
                    if (bonusCatalogScrollHelper.b().getItemCount() > 0) {
                        if (z || bonusCatalogScrollHelper.c(i)) {
                            recyclerView.stopScroll();
                            if (i3 == 0) {
                                bonusCatalogScrollHelper.b().scrollToPosition(i);
                                return;
                            } else {
                                bonusCatalogScrollHelper.b().K(i, i3);
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                int i4 = a2.a;
                if (speed.i()) {
                    int max = (int) (Math.max(0, ((int) a2.b) - 2) * a2.c);
                    r7 = i <= v ? (i4 - max) + i : -1;
                    if (i >= x) {
                        r7 = i - (i4 - max);
                    }
                }
                recyclerView.stopScroll();
                if (r7 >= 0) {
                    bonusCatalogScrollHelper.b().scrollToPosition(r7);
                }
                com.vk.stickers.bonus.utils.a aVar = new com.vk.stickers.bonus.utils.a(recyclerView.getContext(), speed, snap, i3);
                aVar.setTargetPosition(i);
                bonusCatalogScrollHelper.b().startSmoothScroll(aVar);
            }
        }
    }

    public final a a(int i, int i2) {
        boolean z = b().b == 1;
        int itemCount = b().getItemCount();
        if (itemCount == 0) {
            return null;
        }
        int i3 = itemCount - 1;
        if (i < 0 || i > i3 || i2 < 0 || i2 > i3) {
            return null;
        }
        LinearLayoutManager b = b();
        int height = z ? b.getHeight() : b.getWidth();
        if (height == 0 || b().getChildCount() == 0) {
            return null;
        }
        int childCount = b().getChildCount();
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = b().getChildAt(i4);
            f += z ? childAt.getHeight() : childAt.getWidth();
        }
        float childCount2 = f / b().getChildCount();
        int abs = Math.abs(i - i2);
        float f2 = height;
        return new a((abs * childCount2) / f2, f2 / childCount2, abs);
    }

    public final LinearLayoutManager b() {
        RecyclerView.o layoutManager = this.a.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            return linearLayoutManager;
        }
        throw new UnsupportedOperationException("Only [LinearLayoutManager] is supported now");
    }

    public final boolean c(int i) {
        if (i < 0 || i >= b().getItemCount()) {
            return false;
        }
        int v = b().v();
        int x = b().x();
        if (v > i || i > x) {
            return true;
        }
        View findViewByPosition = b().findViewByPosition(i);
        int top = findViewByPosition.getTop();
        RecyclerView recyclerView = this.a;
        boolean z = top < recyclerView.getPaddingTop();
        return (z && (findViewByPosition.getBottom() > recyclerView.getHeight() - recyclerView.getPaddingBottom())) || z;
    }
}
