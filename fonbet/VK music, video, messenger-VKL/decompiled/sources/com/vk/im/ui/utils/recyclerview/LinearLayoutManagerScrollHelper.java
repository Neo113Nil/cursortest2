package com.vk.im.ui.utils.recyclerview;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import io.reactivex.rxjava3.subjects.b;
import xsna.asp;
import xsna.cf00;
import xsna.f8z;
import xsna.g8z;
import xsna.gzs;
import xsna.lhg;
import xsna.shy;
import xsna.tgw;
import xsna.xq;
import xsna.zrp;

/* compiled from: LinearLayoutManagerScrollHelper.kt */
/* loaded from: classes2.dex */
public final class LinearLayoutManagerScrollHelper {
    public final RecyclerView a;
    public final Snap b;
    public final Speed c;
    public final cf00 d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LinearLayoutManagerScrollHelper.kt */
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
    /* compiled from: LinearLayoutManagerScrollHelper.kt */
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

    /* compiled from: LinearLayoutManagerScrollHelper.kt */
    public static final class a {
        public final int a;
        public final int b;
        public final float c;
        public final float d;

        public a(float f, float f2, int i, int i2) {
            this.a = i;
            this.b = i2;
            this.c = f;
            this.d = f2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && Float.compare(this.c, aVar.c) == 0 && Float.compare(this.d, aVar.d) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.d) + b.a(this.c, shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Distance(pixels=");
            sb.append(this.a);
            sb.append(", items=");
            sb.append(this.b);
            sb.append(", screens=");
            sb.append(this.c);
            sb.append(", itemsPerScreen=");
            return xq.c(')', this.d, sb);
        }
    }

    public LinearLayoutManagerScrollHelper(RecyclerView recyclerView, Speed speed, cf00 cf00Var) {
        Snap snap = Snap.START;
        this.a = recyclerView;
        this.b = snap;
        this.c = speed;
        this.d = cf00Var;
    }

    public static /* synthetic */ void d(LinearLayoutManagerScrollHelper linearLayoutManagerScrollHelper, int i, int i2, int i3) {
        if ((i3 & 4) != 0) {
            linearLayoutManagerScrollHelper.getClass();
            i2 = 0;
        }
        linearLayoutManagerScrollHelper.c(i, i2, true, true);
    }

    public static void f(final LinearLayoutManagerScrollHelper linearLayoutManagerScrollHelper, final int i, int i2, int i3, Snap snap, Speed speed, int i4) {
        int i5;
        int i6;
        int i7;
        a a2;
        if ((i4 & 4) != 0) {
            linearLayoutManagerScrollHelper.getClass();
            i5 = 0;
        } else {
            i5 = i2;
        }
        if ((i4 & 8) != 0) {
            linearLayoutManagerScrollHelper.getClass();
            i6 = 0;
        } else {
            i6 = i3;
        }
        Snap snap2 = (i4 & 16) != 0 ? linearLayoutManagerScrollHelper.b : snap;
        final Speed speed2 = (i4 & 32) != 0 ? linearLayoutManagerScrollHelper.c : speed;
        LinearLayoutManager b = linearLayoutManagerScrollHelper.b();
        RecyclerView recyclerView = linearLayoutManagerScrollHelper.a;
        if (b.getItemCount() <= 0) {
            L l = L.a;
            l.getClass();
            if (L.m(LoggerOutputTarget.NONE)) {
                return;
            }
            L.u(l, L.LogType.d, new Object[]{tgw.b(i, "ChatScrollIssue: smoothScrollToPosition ", " skip")});
            return;
        }
        int v = linearLayoutManagerScrollHelper.b().v();
        final int x = linearLayoutManagerScrollHelper.b().x();
        if (i <= v) {
            a2 = linearLayoutManagerScrollHelper.a(v, i, snap2, i5, i6);
            i7 = v;
        } else {
            i7 = v;
            a2 = i >= x ? linearLayoutManagerScrollHelper.a(x, i, snap2, i5, i6) : linearLayoutManagerScrollHelper.a(i, i, snap2, i5, i6);
        }
        final Snap snap3 = snap2;
        final int i8 = i7;
        final a aVar = a2;
        final int i9 = i5;
        L.d(new gzs() { // from class: xsna.e8z
            @Override // xsna.gzs
            public final Object invoke() {
                StringBuilder a3 = odj.a(i, i8, "ChatScrollIssue: smoothScrollToPosition position ", " fvp=", " lvp=");
                a3.append(x);
                a3.append(" count=");
                a3.append(linearLayoutManagerScrollHelper.b().getItemCount());
                a3.append(" offset=");
                a3.append(i9);
                a3.append(" distance ");
                a3.append(aVar);
                a3.append(" speed ");
                a3.append(speed2);
                a3.append(" force true snap ");
                a3.append(snap3);
                return a3.toString();
            }
        });
        if (aVar == null) {
            d(linearLayoutManagerScrollHelper, i, i9, 8);
            return;
        }
        if (speed2.i()) {
            float f = aVar.c;
            int i10 = aVar.b;
            int max = (int) (Math.max(0, ((int) f) - 2) * aVar.d);
            r10 = i <= i8 ? (i10 - max) + i : -1;
            if (i >= x) {
                r10 = i - (i10 - max);
            }
        }
        recyclerView.stopScroll();
        if (r10 < 0) {
            if (aVar.a > 0) {
                linearLayoutManagerScrollHelper.e(i, i9, snap3, speed2);
                return;
            } else {
                linearLayoutManagerScrollHelper.d.invoke();
                return;
            }
        }
        L l2 = L.a;
        l2.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l2, L.LogType.d, new Object[]{lhg.a(r10, "ChatScrollIssue: instantScrollToPosition ")});
        }
        linearLayoutManagerScrollHelper.b().scrollToPosition(r10);
        recyclerView.post(new g8z(linearLayoutManagerScrollHelper, r10, new f8z(linearLayoutManagerScrollHelper, i, i9, snap3, speed2)));
    }

    public final a a(int i, int i2, Snap snap, int i3, int i4) {
        int i5;
        boolean z = b().b == 1;
        int itemCount = b().getItemCount();
        int childCount = b().getChildCount();
        if (itemCount == 0 || childCount == 0) {
            return null;
        }
        int i6 = itemCount - 1;
        if (i < 0 || i > i6 || i2 < 0 || i2 > i6) {
            return null;
        }
        LinearLayoutManager b = b();
        int height = z ? b.getHeight() : b.getWidth();
        if (height == 0) {
            return null;
        }
        int childCount2 = b().getChildCount();
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        for (int i7 = 0; i7 < childCount2; i7++) {
            View childAt = b().getChildAt(i7);
            f += z ? childAt.getHeight() : childAt.getWidth();
        }
        float childCount3 = f / b().getChildCount();
        int v = b().v();
        int x = b().x();
        if (v > i2 || i2 > x) {
            i5 = i3;
        } else {
            View findViewByPosition = b().findViewByPosition(i2);
            i5 = snap == Snap.START ? findViewByPosition.getTop() - i4 : findViewByPosition.getBottom();
        }
        int i8 = i3 - i5;
        int abs = Math.abs(i - i2);
        float f2 = height;
        return new a((abs * childCount3) / f2, f2 / childCount3, i8, abs);
    }

    public final LinearLayoutManager b() {
        RecyclerView.o layoutManager = this.a.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            return linearLayoutManager;
        }
        throw new UnsupportedOperationException("Only [LinearLayoutManager] is supported now");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
    
        if (r1 != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
    
        if (r2 != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0061, code lost:
    
        if (r0 != false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(final int i, final int i2, final boolean z, final boolean z2) {
        if (b().getItemCount() > 0) {
            if (!z) {
                boolean z3 = false;
                if (i >= 0 && i < b().getItemCount()) {
                    int v = b().v();
                    int x = b().x();
                    if (v <= i && i <= x) {
                        View findViewByPosition = b().findViewByPosition(i);
                        int top = findViewByPosition.getTop();
                        RecyclerView recyclerView = this.a;
                        boolean z4 = top < recyclerView.getPaddingTop();
                        boolean z5 = findViewByPosition.getBottom() > recyclerView.getHeight() - recyclerView.getPaddingBottom();
                        if (z4) {
                        }
                    }
                    z3 = true;
                }
            }
            L.d(new gzs() { // from class: xsna.h8z
                @Override // xsna.gzs
                public final Object invoke() {
                    return "ChatScrollIssue: instantScrollToPosition position " + i + " force " + z + " offset " + i2 + " stopCurrentSmoothScroll " + z2;
                }
            });
            if (z2) {
                this.a.stopScroll();
            }
            if (i2 == 0) {
                b().scrollToPosition(i);
                return;
            } else {
                b().K(i, i2);
                return;
            }
        }
        L l = L.a;
        l.getClass();
        if (L.m(LoggerOutputTarget.NONE)) {
            return;
        }
        L.u(l, L.LogType.d, new Object[]{tgw.b(i, "ChatScrollIssue: instantScrollToPosition ", " skip")});
    }

    public final void e(int i, int i2, Snap snap, Speed speed) {
        com.vk.im.ui.utils.recyclerview.a aVar = new com.vk.im.ui.utils.recyclerview.a(this.a.getContext(), speed, snap, i2);
        aVar.setTargetPosition(i);
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.d, new Object[]{lhg.a(i, "ChatScrollIssue: startSmoothScroll ")});
        }
        b().startSmoothScroll(aVar);
    }
}
