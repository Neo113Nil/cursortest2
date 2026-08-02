package h1;

import android.net.Uri;
import h1.InterfaceC4411g;
import java.io.IOException;

/* renamed from: h1.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4399B implements InterfaceC4411g {

    /* renamed from: a, reason: collision with root package name */
    public static final C4399B f47499a = new C4399B();

    /* renamed from: b, reason: collision with root package name */
    public static final InterfaceC4411g.a f47500b = new InterfaceC4411g.a() { // from class: h1.A
        @Override // h1.InterfaceC4411g.a
        public final InterfaceC4411g a() {
            return C4399B.o();
        }
    };

    public static /* synthetic */ C4399B o() {
        return new C4399B();
    }

    @Override // h1.InterfaceC4411g
    public long b(C4418n c4418n) {
        throw new IOException("PlaceholderDataSource cannot be opened");
    }

    @Override // h1.InterfaceC4411g
    public Uri getUri() {
        return null;
    }

    @Override // b1.InterfaceC2358l
    public int read(byte[] bArr, int i10, int i11) {
        throw new UnsupportedOperationException();
    }

    @Override // h1.InterfaceC4411g
    public void close() {
    }

    @Override // h1.InterfaceC4411g
    public void c(InterfaceC4403F interfaceC4403F) {
    }
}
