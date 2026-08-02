package h1;

import android.net.Uri;
import android.util.Base64;
import b1.C2338G;
import com.twilio.voice.EventKeys;
import e1.AbstractC4134a;
import e1.Z;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/* renamed from: h1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4409e extends AbstractC4406b {
    private byte[] data;

    /* renamed from: e, reason: collision with root package name */
    public C4418n f47538e;

    /* renamed from: f, reason: collision with root package name */
    public int f47539f;

    /* renamed from: g, reason: collision with root package name */
    public int f47540g;

    public C4409e() {
        super(false);
    }

    @Override // h1.InterfaceC4411g
    public long b(C4418n c4418n) {
        q(c4418n);
        this.f47538e = c4418n;
        Uri normalizeScheme = c4418n.f47554a.normalizeScheme();
        String scheme = normalizeScheme.getScheme();
        AbstractC4134a.b(EventKeys.DATA.equals(scheme), "Unsupported scheme: " + scheme);
        String[] A12 = Z.A1(normalizeScheme.getSchemeSpecificPart(), ",");
        if (A12.length != 2) {
            throw C2338G.b("Unexpected URI format: " + normalizeScheme, null);
        }
        String str = A12[1];
        if (A12[0].contains(";base64")) {
            try {
                this.data = Base64.decode(str, 0);
            } catch (IllegalArgumentException e10) {
                throw C2338G.b("Error while parsing Base64 encoded string: " + str, e10);
            }
        } else {
            this.data = Z.B0(URLDecoder.decode(str, StandardCharsets.US_ASCII.name()));
        }
        long j10 = c4418n.f47559f;
        byte[] bArr = this.data;
        if (j10 > bArr.length) {
            this.data = null;
            throw new C4415k(2008);
        }
        int i10 = (int) j10;
        this.f47539f = i10;
        int length = bArr.length - i10;
        this.f47540g = length;
        long j11 = c4418n.f47560g;
        if (j11 != -1) {
            this.f47540g = (int) Math.min(length, j11);
        }
        r(c4418n);
        long j12 = c4418n.f47560g;
        return j12 != -1 ? j12 : this.f47540g;
    }

    @Override // h1.InterfaceC4411g
    public void close() {
        if (this.data != null) {
            this.data = null;
            p();
        }
        this.f47538e = null;
    }

    @Override // h1.InterfaceC4411g
    public Uri getUri() {
        C4418n c4418n = this.f47538e;
        if (c4418n != null) {
            return c4418n.f47554a;
        }
        return null;
    }

    @Override // b1.InterfaceC2358l
    public int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f47540g;
        if (i12 == 0) {
            return -1;
        }
        int min = Math.min(i11, i12);
        System.arraycopy(Z.i(this.data), this.f47539f, bArr, i10, min);
        this.f47539f += min;
        this.f47540g -= min;
        o(min);
        return min;
    }
}
