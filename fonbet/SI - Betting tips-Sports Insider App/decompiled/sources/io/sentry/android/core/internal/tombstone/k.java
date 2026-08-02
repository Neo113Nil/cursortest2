package io.sentry.android.core.internal.tombstone;

import s9.m0;
import s9.q;
import s9.r;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class k extends r {

    /* renamed from: e, reason: collision with root package name */
    public static final k f15680e;

    /* renamed from: f, reason: collision with root package name */
    public static volatile q f15681f;

    static {
        k kVar = new k();
        f15680e = kVar;
        kVar.f23373b = Integer.MAX_VALUE;
        r.f23372d.put(k.class, kVar);
    }

    @Override // s9.r
    public final Object a(int i5) {
        q qVar;
        int d10 = v.f.d(i5);
        if (d10 == 0) {
            return (byte) 1;
        }
        if (d10 == 2) {
            return new m0(f15680e, "\u0000\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001\u0004\u0002Ȉ\u0003\u0004\u0004Ȉ\u0005\u0007\u0006\u0004\u0007\u0004\b\u0007\t\u0003\nဉ\u0000", new Object[]{"bitField0_", "number_", "name_", "code_", "codeName_", "hasSender_", "senderUid_", "senderPid_", "hasFaultAddress_", "faultAddress_", "faultAdjacentMetadata_"});
        }
        if (d10 == 3) {
            return new k();
        }
        if (d10 == 4) {
            return new j(f15680e);
        }
        if (d10 == 5) {
            return f15680e;
        }
        if (d10 != 6) {
            throw null;
        }
        q qVar2 = f15681f;
        if (qVar2 != null) {
            return qVar2;
        }
        synchronized (k.class) {
            try {
                qVar = f15681f;
                if (qVar == null) {
                    qVar = new q();
                    f15681f = qVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return qVar;
    }
}
