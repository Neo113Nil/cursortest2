package androidx.compose.runtime;

import defpackage.av8;
import defpackage.boh;
import defpackage.e1d;
import defpackage.foh;
import defpackage.nf3;
import defpackage.of3;
import defpackage.vnh;
import defpackage.wib;
import defpackage.xnh;
import defpackage.znh;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class e {
    public static final vnh a() {
        return new ParcelableSnapshotMutableDoubleState(0.0d);
    }

    public static final xnh b(float f) {
        return new ParcelableSnapshotMutableFloatState(f);
    }

    public static final znh c(int i) {
        return new ParcelableSnapshotMutableIntState(i);
    }

    public static final boh d(long j) {
        return new ParcelableSnapshotMutableLongState(j);
    }

    public static final e1d e(Object obj, foh fohVar) {
        return new ParcelableSnapshotMutableState(obj, fohVar);
    }

    public static e1d f(Object obj) {
        return new ParcelableSnapshotMutableState(obj, wib.i);
    }

    public static final e1d g(Object obj, of3 of3Var) {
        av8 av8Var = (av8) of3Var;
        Object O = av8Var.O();
        if (O == nf3.a) {
            O = f(obj);
            av8Var.n0(O);
        }
        e1d e1dVar = (e1d) O;
        e1dVar.setValue(obj);
        return e1dVar;
    }
}
