package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class bkk extends kda {
    public final Object b;
    public final String c;
    public final fok d;
    public final wxf e;

    public bkk(Object obj, String str, fok fokVar, wxf wxfVar) {
        this.b = obj;
        this.c = str;
        this.d = fokVar;
        this.e = wxfVar;
    }

    @Override // defpackage.kda
    public final kda L(String str, Function1 function1) {
        Object obj = this.b;
        if (((Boolean) function1.invoke(obj)).booleanValue()) {
            return this;
        }
        return new kn6(obj, this.c, str, this.e, this.d);
    }

    @Override // defpackage.kda
    public final Object u() {
        return this.b;
    }
}
