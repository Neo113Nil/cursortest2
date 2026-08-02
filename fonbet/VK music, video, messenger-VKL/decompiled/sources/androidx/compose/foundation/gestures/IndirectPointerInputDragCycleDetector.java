package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.d;
import com.unity3d.services.UnityAdsConstants;
import xsna.alk;
import xsna.asp;
import xsna.c4g0;
import xsna.fh50;
import xsna.fho;
import xsna.idp0;
import xsna.itl;
import xsna.kmb0;
import xsna.muw;
import xsna.nuw;
import xsna.ouw;
import xsna.ov70;
import xsna.wg50;
import xsna.zrp;
import xsna.zv70;

/* compiled from: IndirectPointerInputDragCycleDetector.kt */
/* loaded from: classes11.dex */
public final class IndirectPointerInputDragCycleDetector {
    public final e a;
    public DragDetectionState.AwaitDown b;
    public DragDetectionState.c c;
    public DragDetectionState.b d;
    public DragDetectionState.a e;
    public DragDetectionState f;
    public com.vk.comments.impl.a g;
    public long h = 9205357640488583168L;
    public idp0 i;
    public final ouw j;
    public final zv70 k;
    public long l;

    /* compiled from: IndirectPointerInputDragCycleDetector.kt */
    public static abstract class DragDetectionState {

        /* compiled from: IndirectPointerInputDragCycleDetector.kt */
        public static final class AwaitDown extends DragDetectionState {
            public AwaitTouchSlop a;
            public boolean b;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: IndirectPointerInputDragCycleDetector.kt */
            public static final class AwaitTouchSlop {
                private static final /* synthetic */ zrp $ENTRIES;
                private static final /* synthetic */ AwaitTouchSlop[] $VALUES;
                public static final AwaitTouchSlop No;
                public static final AwaitTouchSlop NotInitialized;
                public static final AwaitTouchSlop Yes;

                static {
                    AwaitTouchSlop awaitTouchSlop = new AwaitTouchSlop("Yes", 0);
                    Yes = awaitTouchSlop;
                    AwaitTouchSlop awaitTouchSlop2 = new AwaitTouchSlop("No", 1);
                    No = awaitTouchSlop2;
                    AwaitTouchSlop awaitTouchSlop3 = new AwaitTouchSlop("NotInitialized", 2);
                    NotInitialized = awaitTouchSlop3;
                    AwaitTouchSlop[] awaitTouchSlopArr = {awaitTouchSlop, awaitTouchSlop2, awaitTouchSlop3};
                    $VALUES = awaitTouchSlopArr;
                    $ENTRIES = new asp(awaitTouchSlopArr);
                }

                public AwaitTouchSlop() {
                    throw null;
                }

                public static AwaitTouchSlop valueOf(String str) {
                    return (AwaitTouchSlop) Enum.valueOf(AwaitTouchSlop.class, str);
                }

                public static AwaitTouchSlop[] values() {
                    return (AwaitTouchSlop[]) $VALUES.clone();
                }
            }

            public AwaitDown() {
                this(0);
            }

            public AwaitDown(int i) {
                this.a = AwaitTouchSlop.NotInitialized;
                this.b = false;
            }
        }

        /* compiled from: IndirectPointerInputDragCycleDetector.kt */
        public static final class a extends DragDetectionState {
            public nuw a;
            public long b;
        }

        /* compiled from: IndirectPointerInputDragCycleDetector.kt */
        public static final class b extends DragDetectionState {
            public nuw a;
            public long b;
            public boolean c;
        }

        /* compiled from: IndirectPointerInputDragCycleDetector.kt */
        public static final class c extends DragDetectionState {
            public long a;
        }
    }

    /* compiled from: IndirectPointerInputDragCycleDetector.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DragDetectionState.AwaitDown.AwaitTouchSlop.values().length];
            try {
                iArr[DragDetectionState.AwaitDown.AwaitTouchSlop.NotInitialized.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public IndirectPointerInputDragCycleDetector(e eVar) {
        this.a = eVar;
        ouw ouwVar = new ouw();
        ouwVar.b = new fh50((Object) null);
        this.j = ouwVar;
        zv70 zv70Var = new zv70();
        zv70Var.b = new wg50();
        this.k = zv70Var;
        this.l = 0L;
    }

    public static void c(IndirectPointerInputDragCycleDetector indirectPointerInputDragCycleDetector, nuw nuwVar, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = 0;
        }
        e eVar = indirectPointerInputDragCycleDetector.a;
        DragDetectionState.b bVar = indirectPointerInputDragCycleDetector.d;
        if (bVar == null) {
            bVar = new DragDetectionState.b();
            bVar.a = null;
            bVar.b = Long.MAX_VALUE;
            bVar.c = false;
            indirectPointerInputDragCycleDetector.d = bVar;
        }
        bVar.a = nuwVar;
        bVar.b = j;
        idp0 idp0Var = indirectPointerInputDragCycleDetector.i;
        if (idp0Var == null) {
            indirectPointerInputDragCycleDetector.i = new idp0(eVar.r, 2);
        } else {
            idp0Var.a = eVar.r;
            idp0Var.b = j2;
        }
        bVar.c = false;
        indirectPointerInputDragCycleDetector.f = bVar;
    }

    public final void a() {
        DragDetectionState.AwaitDown awaitDown = this.b;
        if (awaitDown == null) {
            awaitDown = new DragDetectionState.AwaitDown(0);
            this.b = awaitDown;
        }
        awaitDown.a = DragDetectionState.AwaitDown.AwaitTouchSlop.NotInitialized;
        awaitDown.b = false;
        this.f = awaitDown;
    }

    public final void b(nuw nuwVar, long j, idp0 idp0Var) {
        DragDetectionState.a aVar = this.e;
        if (aVar == null) {
            aVar = new DragDetectionState.a();
            aVar.a = null;
            aVar.b = Long.MAX_VALUE;
            this.e = aVar;
        }
        aVar.a = nuwVar;
        aVar.b = j;
        idp0Var.b = 0L;
        this.f = aVar;
    }

    public final com.vk.comments.impl.a d() {
        com.vk.comments.impl.a aVar = this.g;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalArgumentException("Velocity Tracker not initialized.");
    }

    public final void e(nuw nuwVar, muw muwVar, long j) {
        e eVar = this.a;
        long k = itl.e(eVar).k(0L);
        if (!ov70.c(this.h, 9205357640488583168L) && !ov70.c(k, this.h)) {
            this.l = ov70.f(this.l, ov70.e(k, this.h));
        }
        this.h = k;
        Orientation orientation = eVar.r;
        fho.a aVar = fho.a;
        if (Math.abs(Float.intBitsToFloat((int) (orientation == Orientation.Vertical ? j & 4294967295L : j >> 32))) > 2.0f) {
            c4g0.a(d(), nuwVar, eVar.r, muwVar, this.j, this.l);
            zv70 zv70Var = this.k;
            wg50 wg50Var = zv70Var.b;
            int i = wg50Var.b;
            if (i == 3) {
                int i2 = zv70Var.a;
                zv70Var.a = i2 + 1;
                if (i2 < 0 || i2 >= i) {
                    alk.D("Index must be between 0 and size");
                    throw null;
                }
                long[] jArr = wg50Var.a;
                long j2 = jArr[i2];
                jArr[i2] = j;
            } else {
                wg50Var.a(j);
            }
            if (zv70Var.a == 3) {
                zv70Var.a = 0;
            }
            long[] jArr2 = wg50Var.a;
            int i3 = wg50Var.b;
            float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            float f2 = 0.0f;
            for (int i4 = 0; i4 < i3; i4++) {
                f2 += Float.intBitsToFloat((int) (jArr2[i4] >> 32));
            }
            int i5 = wg50Var.b;
            float f3 = f2 / i5;
            long[] jArr3 = wg50Var.a;
            for (int i6 = 0; i6 < i5; i6++) {
                f += Float.intBitsToFloat((int) (jArr3[i6] & 4294967295L));
            }
            eVar.t2(new d.b((Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f / wg50Var.b) & 4294967295L), true));
        }
    }

    public final void f(nuw nuwVar, nuw nuwVar2, muw muwVar, long j) {
        if (this.g == null) {
            this.g = new com.vk.comments.impl.a();
        }
        this.l = 0L;
        com.vk.comments.impl.a d = d();
        e eVar = this.a;
        c4g0.a(d, nuwVar, eVar.r, muwVar, this.j, this.l);
        long e = ov70.e(c4g0.A(nuwVar2, eVar.r, muwVar), j);
        if (eVar.s.invoke(new kmb0(1)).booleanValue()) {
            this.h = itl.e(eVar).k(0L);
            eVar.t2(new d.c(e));
        }
        zv70 zv70Var = this.k;
        zv70Var.a = 0;
        zv70Var.b.b = 0;
    }
}
