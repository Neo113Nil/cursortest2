package x3;

import N3.C3659j;
import N3.G;
import N3.H;
import N3.InterfaceC3665p;
import N3.M;
import N3.q;
import N3.r;
import android.text.TextUtils;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import j3.C7272n;
import j3.v;
import java.io.IOException;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k4.p;
import m3.C8050C;
import m3.C8056I;
import m3.N;
import t4.h;

/* loaded from: classes8.dex */
public final class g implements InterfaceC3665p {

    /* renamed from: i, reason: collision with root package name */
    private static final Pattern f104961i = Pattern.compile("LOCAL:([^,]+)");

    /* renamed from: j, reason: collision with root package name */
    private static final Pattern f104962j = Pattern.compile("MPEGTS:(-?\\d+)");

    /* renamed from: a, reason: collision with root package name */
    private final String f104963a;

    /* renamed from: b, reason: collision with root package name */
    private final C8056I f104964b;

    /* renamed from: d, reason: collision with root package name */
    private final k4.e f104966d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f104967e;

    /* renamed from: f, reason: collision with root package name */
    private r f104968f;

    /* renamed from: h, reason: collision with root package name */
    private int f104970h;

    /* renamed from: c, reason: collision with root package name */
    private final C8050C f104965c = new C8050C();

    /* renamed from: g, reason: collision with root package name */
    private byte[] f104969g = new byte[UserVerificationMethods.USER_VERIFY_ALL];

    public g(String str, C8056I c8056i, k4.e eVar, boolean z11) {
        this.f104963a = str;
        this.f104964b = c8056i;
        this.f104966d = eVar;
        this.f104967e = z11;
    }

    private M g(long j11) {
        M track = this.f104968f.track(0, 3);
        C7272n.a aVar = new C7272n.a();
        aVar.y0("text/vtt");
        aVar.n0(this.f104963a);
        aVar.C0(j11);
        track.a(aVar.P());
        this.f104968f.endTracks();
        return track;
    }

    @Override // N3.InterfaceC3665p
    public final void a(long j11, long j12) {
        throw new IllegalStateException();
    }

    @Override // N3.InterfaceC3665p
    public final void b(r rVar) {
        if (this.f104967e) {
            rVar = new p(rVar, this.f104966d);
        }
        this.f104968f = rVar;
        rVar.seekMap(new H.b(-9223372036854775807L));
    }

    @Override // N3.InterfaceC3665p
    public final boolean d(q qVar) throws IOException {
        C3659j c3659j = (C3659j) qVar;
        c3659j.d(this.f104969g, 0, 6, false);
        byte[] bArr = this.f104969g;
        C8050C c8050c = this.f104965c;
        c8050c.P(6, bArr);
        if (h.b(c8050c)) {
            return true;
        }
        c3659j.d(this.f104969g, 6, 3, false);
        c8050c.P(9, this.f104969g);
        return h.b(c8050c);
    }

    @Override // N3.InterfaceC3665p
    public final int f(q qVar, G g10) throws IOException {
        this.f104968f.getClass();
        C3659j c3659j = (C3659j) qVar;
        int length = (int) c3659j.getLength();
        int i11 = this.f104970h;
        byte[] bArr = this.f104969g;
        if (i11 == bArr.length) {
            this.f104969g = Arrays.copyOf(bArr, ((length != -1 ? length : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.f104969g;
        int i12 = this.f104970h;
        int read = c3659j.read(bArr2, i12, bArr2.length - i12);
        if (read != -1) {
            int i13 = this.f104970h + read;
            this.f104970h = i13;
            if (length == -1 || i13 != length) {
                return 0;
            }
        }
        C8050C c8050c = new C8050C(this.f104969g);
        h.e(c8050c);
        long j11 = 0;
        long j12 = 0;
        for (String r11 = c8050c.r(StandardCharsets.UTF_8); !TextUtils.isEmpty(r11); r11 = c8050c.r(StandardCharsets.UTF_8)) {
            if (r11.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher = f104961i.matcher(r11);
                if (!matcher.find()) {
                    throw v.a(null, "X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(r11));
                }
                Matcher matcher2 = f104962j.matcher(r11);
                if (!matcher2.find()) {
                    throw v.a(null, "X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(r11));
                }
                String group = matcher.group(1);
                group.getClass();
                j12 = h.d(group);
                String group2 = matcher2.group(1);
                group2.getClass();
                long parseLong = Long.parseLong(group2);
                int i14 = N.f74289a;
                j11 = N.Z(parseLong, 1000000L, 90000L, RoundingMode.DOWN);
            }
        }
        Matcher a11 = h.a(c8050c);
        if (a11 == null) {
            g(0L);
            return -1;
        }
        String group3 = a11.group(1);
        group3.getClass();
        long d11 = h.d(group3);
        int i15 = N.f74289a;
        long b11 = this.f104964b.b(N.Z((j11 + d11) - j12, 90000L, 1000000L, RoundingMode.DOWN) % 8589934592L);
        M g11 = g(b11 - d11);
        byte[] bArr3 = this.f104969g;
        int i16 = this.f104970h;
        C8050C c8050c2 = this.f104965c;
        c8050c2.P(i16, bArr3);
        g11.e(this.f104970h, c8050c2);
        g11.b(b11, 1, this.f104970h, 0, null);
        return -1;
    }

    @Override // N3.InterfaceC3665p
    public final void release() {
    }
}
