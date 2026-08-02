package com.google.android.gms.internal.play_billing;

import defpackage.e5p;
import defpackage.fbo;
import defpackage.k6p;
import defpackage.v3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzp {
    public Object a;
    public k6p b;
    public zzv c = zzv.i();
    public boolean d;

    public final void a(Object obj) {
        this.d = true;
        k6p k6pVar = this.b;
        if (k6pVar != null) {
            e5p e5pVar = k6pVar.b;
            e5pVar.getClass();
            if (obj == null) {
                obj = zzo.g;
            }
            if (zzo.f.b0(e5pVar, null, obj)) {
                zzo.c(e5pVar);
                this.a = null;
                this.b = null;
                this.c = null;
            }
        }
    }

    public final void finalize() {
        zzv zzvVar;
        k6p k6pVar = this.b;
        if (k6pVar != null) {
            e5p e5pVar = k6pVar.b;
            if (!e5pVar.isDone()) {
                if (zzo.f.b0(e5pVar, null, new fbo(new v3("The completer object was garbage collected - this future would otherwise never complete. The tag was: ".concat(String.valueOf(this.a)), 5)))) {
                    zzo.c(e5pVar);
                }
            }
        }
        if (this.d || (zzvVar = this.c) == null) {
            return;
        }
        zzvVar.h(null);
    }
}
