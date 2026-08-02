package ug;

import f3.x;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.e0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class g extends x {

    /* renamed from: a, reason: collision with root package name */
    public final u f24271a;

    /* renamed from: b, reason: collision with root package name */
    public final c4.d f24272b;

    public g(u lexer, tg.c json) {
        Intrinsics.checkNotNullParameter(lexer, "lexer");
        Intrinsics.checkNotNullParameter(json, "json");
        this.f24271a = lexer;
        this.f24272b = json.f23938b;
    }

    @Override // f3.x, rg.b
    public final byte B() {
        u uVar = this.f24271a;
        String j = uVar.j();
        try {
            return e0.c(j);
        } catch (IllegalArgumentException unused) {
            u.m(uVar, d9.e.e('\'', "Failed to parse type 'UByte' for input '", j), 0, null, 6);
            throw null;
        }
    }

    @Override // f3.x, rg.b
    public final short C() {
        u uVar = this.f24271a;
        String j = uVar.j();
        try {
            return e0.h(j);
        } catch (IllegalArgumentException unused) {
            u.m(uVar, d9.e.e('\'', "Failed to parse type 'UShort' for input '", j), 0, null, 6);
            throw null;
        }
    }

    @Override // f3.x, rg.b
    public final int l() {
        u uVar = this.f24271a;
        String j = uVar.j();
        try {
            return e0.d(j);
        } catch (IllegalArgumentException unused) {
            u.m(uVar, d9.e.e('\'', "Failed to parse type 'UInt' for input '", j), 0, null, 6);
            throw null;
        }
    }

    @Override // rg.a
    public final c4.d n() {
        return this.f24272b;
    }

    @Override // f3.x, rg.b
    public final long v() {
        u uVar = this.f24271a;
        String j = uVar.j();
        try {
            return e0.f(j);
        } catch (IllegalArgumentException unused) {
            u.m(uVar, d9.e.e('\'', "Failed to parse type 'ULong' for input '", j), 0, null, 6);
            throw null;
        }
    }

    @Override // rg.a
    public final int z(qg.g descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        throw new IllegalStateException("unsupported");
    }
}
