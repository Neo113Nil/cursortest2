package u4;

import h1.InterfaceC4425u;
import java.util.UUID;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.internal.Intrinsics;
import q1.C6099h;
import q1.InterfaceC6089A;

/* renamed from: u4.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6499e implements InterfaceC6500f {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4425u f66097a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f66098b;

    public C6499e(InterfaceC4425u dataSourceFactory) {
        Intrinsics.checkNotNullParameter(dataSourceFactory, "dataSourceFactory");
        this.f66097a = dataSourceFactory;
    }

    public static final InterfaceC6089A d(q1.J j10, UUID it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return j10;
    }

    @Override // u4.InterfaceC6500f
    public q1.u a(UUID uuid, r4.f drmProps) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(drmProps, "drmProps");
        return c(uuid, drmProps, 0);
    }

    public final q1.u c(UUID uuid, r4.f fVar, int i10) {
        if (e1.Z.f45503a < 18) {
            return null;
        }
        try {
            q1.K k10 = new q1.K(fVar.b(), this.f66097a);
            String[] a10 = fVar.a();
            int i11 = 0;
            int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(0, a10.length - 1, 2);
            if (progressionLastElement >= 0) {
                while (true) {
                    k10.c(a10[i11], a10[i11 + 1]);
                    if (i11 == progressionLastElement) {
                        break;
                    }
                    i11 += 2;
                }
            }
            final q1.J C10 = q1.J.C(uuid);
            Intrinsics.checkNotNullExpressionValue(C10, "newInstance(...)");
            if (this.f66098b) {
                C10.D("securityLevel", "L3");
            }
            return new C6099h.b().g(uuid, new InterfaceC6089A.c() { // from class: u4.d
                @Override // q1.InterfaceC6089A.c
                public final InterfaceC6089A a(UUID uuid2) {
                    InterfaceC6089A d10;
                    d10 = C6499e.d(q1.J.this, uuid2);
                    return d10;
                }
            }).b(null).d(fVar.d()).a(k10);
        } catch (q1.O e10) {
            this.f66098b = true;
            throw e10;
        } catch (Exception e11) {
            if (i10 >= 3) {
                throw new q1.O(1, e11);
            }
            this.f66098b = true;
            return c(uuid, fVar, i10 + 1);
        }
    }
}
