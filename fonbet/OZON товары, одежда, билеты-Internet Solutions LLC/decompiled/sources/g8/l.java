package g8;

import S7.s;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import java.util.ArrayList;

/* loaded from: classes9.dex */
final class l implements s {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f64021a;

    /* renamed from: b, reason: collision with root package name */
    private final s f64022b;

    public l(ArrayList arrayList, s sVar) throws GeneralSecurityException {
        this.f64021a = arrayList;
        this.f64022b = sVar;
    }

    @Override // S7.s
    public final OutputStream a(OutputStream outputStream, byte[] bArr) throws GeneralSecurityException, IOException {
        return this.f64022b.a(outputStream, bArr);
    }

    @Override // S7.s
    public final InputStream b(InputStream inputStream, byte[] bArr) throws GeneralSecurityException, IOException {
        i iVar = new i();
        iVar.f64007a = false;
        iVar.f64008b = null;
        iVar.f64010d = this.f64021a;
        if (inputStream.markSupported()) {
            iVar.f64009c = inputStream;
        } else {
            iVar.f64009c = new BufferedInputStream(inputStream);
        }
        iVar.f64009c.mark(Integer.MAX_VALUE);
        iVar.f64011e = (byte[]) bArr.clone();
        return iVar;
    }
}
