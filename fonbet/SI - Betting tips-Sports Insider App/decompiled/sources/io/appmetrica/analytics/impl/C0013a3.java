package io.appmetrica.analytics.impl;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.a3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0013a3 implements InterfaceC0039b3 {

    /* renamed from: a, reason: collision with root package name */
    public final int f13333a;

    public C0013a3(int i5) {
        this.f13333a = i5;
    }

    public static InterfaceC0039b3 a(InterfaceC0039b3... interfaceC0039b3Arr) {
        return new C0013a3(b(interfaceC0039b3Arr));
    }

    public static int b(InterfaceC0039b3... interfaceC0039b3Arr) {
        int i5 = 0;
        for (InterfaceC0039b3 interfaceC0039b3 : interfaceC0039b3Arr) {
            if (interfaceC0039b3 != null) {
                i5 = interfaceC0039b3.getBytesTruncated() + i5;
            }
        }
        return i5;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0039b3
    public final int getBytesTruncated() {
        return this.f13333a;
    }

    public String toString() {
        return d9.e.i(new StringBuilder("BytesTruncatedInfo{bytesTruncated="), this.f13333a, '}');
    }
}
