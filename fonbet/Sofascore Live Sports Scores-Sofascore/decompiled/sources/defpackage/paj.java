package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class paj implements a88, lt8 {
    public final /* synthetic */ ief a;

    public paj(ief iefVar) {
        this.a = iefVar;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof a88) && (obj instanceof lt8)) {
            return Intrinsics.c(getFunctionDelegate(), ((lt8) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.lt8
    public final dt8 getFunctionDelegate() {
        return this.a;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // defpackage.a88
    public final /* synthetic */ float invoke() {
        return ((Number) this.a.invoke()).floatValue();
    }
}
