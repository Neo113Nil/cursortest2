package db;

import com.google.crypto.tink.y;

/* renamed from: db.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4050b {

    /* renamed from: a, reason: collision with root package name */
    public final C4049a f45167a;

    public C4050b(C4049a c4049a) {
        this.f45167a = c4049a;
    }

    public static C4050b a(byte[] bArr, y yVar) {
        if (yVar != null) {
            return new C4050b(C4049a.a(bArr));
        }
        throw new NullPointerException("SecretKeyAccess required");
    }

    public int b() {
        return this.f45167a.c();
    }
}
