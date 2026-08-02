package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class n73 implements l3f {
    public final Object a;
    public final v9b b;

    public n73(Object obj, v9b v9bVar) {
        this.a = obj;
        this.b = v9bVar;
    }

    @Override // defpackage.l3f
    public final boolean test(Object obj) {
        return Intrinsics.c(this.b.invoke(obj), this.a);
    }
}
