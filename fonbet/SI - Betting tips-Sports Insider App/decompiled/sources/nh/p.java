package nh;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class p implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final u f20978a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f20979b;

    public p(q qVar, u reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        this.f20979b = qVar;
        this.f20978a = reader;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        b bVar;
        Throwable th2;
        q qVar = this.f20979b;
        u uVar = this.f20978a;
        b bVar2 = b.f20918e;
        IOException e7 = null;
        try {
            try {
                Intrinsics.checkNotNullParameter(this, "handler");
            } catch (Throwable th3) {
                th2 = th3;
            }
        } catch (IOException e9) {
            e7 = e9;
            bVar = bVar2;
        }
        if (!uVar.c(true, this)) {
            throw new IOException("Required SETTINGS preface not received");
        }
        do {
            try {
            } catch (Throwable th4) {
                th2 = th4;
                bVar = bVar2;
                qVar.c(bVar, bVar2, e7);
                hh.e.b(uVar);
                throw th2;
            }
        } while (uVar.c(false, this));
        bVar = b.f20916c;
        try {
            try {
                qVar.c(bVar, b.f20921h, null);
            } catch (IOException e10) {
                e7 = e10;
                b bVar3 = b.f20917d;
                qVar.c(bVar3, bVar3, e7);
                hh.e.b(uVar);
                return Unit.f19194a;
            }
            hh.e.b(uVar);
            return Unit.f19194a;
        } catch (Throwable th5) {
            th2 = th5;
            qVar.c(bVar, bVar2, e7);
            hh.e.b(uVar);
            throw th2;
        }
    }
}
