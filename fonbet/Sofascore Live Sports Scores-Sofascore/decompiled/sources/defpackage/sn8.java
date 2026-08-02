package defpackage;

import androidx.fragment.app.Fragment;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class sn8 extends un8 {
    public final /* synthetic */ kt8 a;
    public final /* synthetic */ AtomicReference b;
    public final /* synthetic */ yd c;
    public final /* synthetic */ xd d;
    public final /* synthetic */ Fragment e;

    public sn8(Fragment fragment, kt8 kt8Var, AtomicReference atomicReference, yd ydVar, xd xdVar) {
        this.e = fragment;
        this.a = kt8Var;
        this.b = atomicReference;
        this.c = ydVar;
        this.d = xdVar;
    }

    @Override // defpackage.un8
    public final void a() {
        Fragment fragment = this.e;
        this.b.set(((je) this.a.apply(null)).d(fragment.generateActivityResultKey(), fragment, this.c, this.d));
    }
}
