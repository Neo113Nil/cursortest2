package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class eaj implements c23, lt8 {
    public final /* synthetic */ ief a;

    public eaj(ief iefVar) {
        this.a = iefVar;
    }

    @Override // defpackage.c23
    public final /* synthetic */ long a() {
        return ((r13) this.a.invoke()).a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof c23) && (obj instanceof lt8)) {
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
}
