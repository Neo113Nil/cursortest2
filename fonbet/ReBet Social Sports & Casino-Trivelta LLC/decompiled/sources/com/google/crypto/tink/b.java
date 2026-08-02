package com.google.crypto.tink;

import com.google.crypto.tink.proto.C;
import com.google.crypto.tink.shaded.protobuf.C3484p;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* loaded from: classes3.dex */
public final class b implements p {

    /* renamed from: a, reason: collision with root package name */
    public final InputStream f37012a;

    public b(InputStream inputStream) {
        this.f37012a = inputStream;
    }

    public static p b(byte[] bArr) {
        return new b(new ByteArrayInputStream(bArr));
    }

    @Override // com.google.crypto.tink.p
    public com.google.crypto.tink.proto.t a() {
        try {
            return com.google.crypto.tink.proto.t.T(this.f37012a, C3484p.b());
        } finally {
            this.f37012a.close();
        }
    }

    @Override // com.google.crypto.tink.p
    public C read() {
        try {
            return C.Y(this.f37012a, C3484p.b());
        } finally {
            this.f37012a.close();
        }
    }
}
