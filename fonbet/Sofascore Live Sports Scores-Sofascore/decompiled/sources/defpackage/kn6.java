package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class kn6 extends kda {
    public final Object b;
    public final fok c;
    public final wo0 d;

    public kn6(Object obj, String str, String str2, wxf wxfVar, fok fokVar) {
        this.b = obj;
        this.c = fokVar;
        wo0 wo0Var = new wo0(str2 + " value: " + obj);
        StackTraceElement[] stackTrace = wo0Var.getStackTrace();
        stackTrace.getClass();
        wo0Var.setStackTrace((StackTraceElement[]) ph0.w(2, stackTrace).toArray(new StackTraceElement[0]));
        this.d = wo0Var;
    }

    @Override // defpackage.kda
    public final Object u() {
        int ordinal = this.c.ordinal();
        if (ordinal == 0) {
            throw this.d;
        }
        if (ordinal == 1) {
            this.b.toString();
            return null;
        }
        if (ordinal == 2) {
            return null;
        }
        zzl.b();
        return null;
    }

    @Override // defpackage.kda
    public final kda L(String str, Function1 function1) {
        return this;
    }
}
