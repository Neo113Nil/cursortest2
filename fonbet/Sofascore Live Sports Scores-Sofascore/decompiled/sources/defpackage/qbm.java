package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class qbm extends a9m {
    public final Object a;

    public qbm(Object obj) {
        super(null);
        this.a = obj;
    }

    public static qbm copy$default(qbm qbmVar, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = qbmVar.a;
        }
        qbmVar.getClass();
        return new qbm(obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qbm) && Intrinsics.c(this.a, ((qbm) obj).a);
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return lnb.p(new StringBuilder("BlazeInternalRemoteResponseSuccess(value="), this.a, ')');
    }
}
