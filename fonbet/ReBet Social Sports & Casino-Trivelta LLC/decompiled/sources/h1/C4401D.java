package h1;

import android.net.Uri;
import e1.AbstractC4134a;
import java.util.Collections;
import java.util.Map;

/* renamed from: h1.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4401D implements InterfaceC4411g {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4411g f47507a;

    /* renamed from: b, reason: collision with root package name */
    public long f47508b;

    /* renamed from: c, reason: collision with root package name */
    public Uri f47509c = Uri.EMPTY;

    /* renamed from: d, reason: collision with root package name */
    public Map f47510d = Collections.EMPTY_MAP;

    public C4401D(InterfaceC4411g interfaceC4411g) {
        this.f47507a = (InterfaceC4411g) AbstractC4134a.e(interfaceC4411g);
    }

    @Override // h1.InterfaceC4411g
    public long b(C4418n c4418n) {
        this.f47509c = c4418n.f47554a;
        this.f47510d = Collections.EMPTY_MAP;
        try {
            return this.f47507a.b(c4418n);
        } finally {
            Uri uri = getUri();
            if (uri != null) {
                this.f47509c = uri;
            }
            this.f47510d = f();
        }
    }

    @Override // h1.InterfaceC4411g
    public void c(InterfaceC4403F interfaceC4403F) {
        AbstractC4134a.e(interfaceC4403F);
        this.f47507a.c(interfaceC4403F);
    }

    @Override // h1.InterfaceC4411g
    public void close() {
        this.f47507a.close();
    }

    @Override // h1.InterfaceC4411g
    public Map f() {
        return this.f47507a.f();
    }

    @Override // h1.InterfaceC4411g
    public Uri getUri() {
        return this.f47507a.getUri();
    }

    public long o() {
        return this.f47508b;
    }

    public Uri p() {
        return this.f47509c;
    }

    public Map q() {
        return this.f47510d;
    }

    public void r() {
        this.f47508b = 0L;
    }

    @Override // b1.InterfaceC2358l
    public int read(byte[] bArr, int i10, int i11) {
        int read = this.f47507a.read(bArr, i10, i11);
        if (read != -1) {
            this.f47508b += read;
        }
        return read;
    }
}
