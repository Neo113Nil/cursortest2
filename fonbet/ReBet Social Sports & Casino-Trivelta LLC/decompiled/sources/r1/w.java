package r1;

import H1.I;
import H1.InterfaceC1183p;
import H1.InterfaceC1184q;
import H1.J;
import H1.O;
import android.text.TextUtils;
import androidx.media3.common.a;
import b1.C2338G;
import e1.AbstractC4134a;
import e1.J;
import e1.Q;
import e2.s;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class w implements InterfaceC1183p {

    /* renamed from: h, reason: collision with root package name */
    public static final Pattern f63916h = Pattern.compile("LOCAL:([^,]+)");

    /* renamed from: i, reason: collision with root package name */
    public static final Pattern f63917i = Pattern.compile("MPEGTS:(-?\\d+)");

    /* renamed from: a, reason: collision with root package name */
    public final String f63918a;

    /* renamed from: b, reason: collision with root package name */
    public final Q f63919b;

    /* renamed from: d, reason: collision with root package name */
    public final s.a f63921d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f63922e;

    /* renamed from: f, reason: collision with root package name */
    public H1.r f63923f;

    /* renamed from: g, reason: collision with root package name */
    public int f63924g;

    /* renamed from: c, reason: collision with root package name */
    public final J f63920c = new J();
    private byte[] sampleData = new byte[1024];

    public w(String str, Q q10, s.a aVar, boolean z10) {
        this.f63918a = str;
        this.f63919b = q10;
        this.f63921d = aVar;
        this.f63922e = z10;
    }

    @Override // H1.InterfaceC1183p
    public void a(long j10, long j11) {
        throw new IllegalStateException();
    }

    public final O b(long j10) {
        O c10 = this.f63923f.c(0, 3);
        c10.c(new a.b().y0("text/vtt").n0(this.f63918a).C0(j10).P());
        this.f63923f.s();
        return c10;
    }

    @Override // H1.InterfaceC1183p
    public void c(H1.r rVar) {
        if (this.f63922e) {
            rVar = new e2.t(rVar, this.f63921d);
        }
        this.f63923f = rVar;
        rVar.q(new J.b(-9223372036854775807L));
    }

    public final void d() {
        e1.J j10 = new e1.J(this.sampleData);
        n2.h.e(j10);
        long j11 = 0;
        long j12 = 0;
        for (String x10 = j10.x(); !TextUtils.isEmpty(x10); x10 = j10.x()) {
            if (x10.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher = f63916h.matcher(x10);
                if (!matcher.find()) {
                    throw C2338G.a("X-TIMESTAMP-MAP doesn't contain local timestamp: " + x10, null);
                }
                Matcher matcher2 = f63917i.matcher(x10);
                if (!matcher2.find()) {
                    throw C2338G.a("X-TIMESTAMP-MAP doesn't contain media timestamp: " + x10, null);
                }
                j12 = n2.h.d((String) AbstractC4134a.e(matcher.group(1)));
                j11 = Q.h(Long.parseLong((String) AbstractC4134a.e(matcher2.group(1))));
            }
        }
        Matcher a10 = n2.h.a(j10);
        if (a10 == null) {
            b(0L);
            return;
        }
        long d10 = n2.h.d((String) AbstractC4134a.e(a10.group(1)));
        long b10 = this.f63919b.b(Q.l((j11 + d10) - j12));
        O b11 = b(b10 - d10);
        this.f63920c.Z(this.sampleData, this.f63924g);
        b11.a(this.f63920c, this.f63924g);
        b11.g(b10, 1, this.f63924g, 0, null);
    }

    @Override // H1.InterfaceC1183p
    public int g(InterfaceC1184q interfaceC1184q, I i10) {
        AbstractC4134a.e(this.f63923f);
        int length = (int) interfaceC1184q.getLength();
        int i11 = this.f63924g;
        byte[] bArr = this.sampleData;
        if (i11 == bArr.length) {
            this.sampleData = Arrays.copyOf(bArr, ((length != -1 ? length : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.sampleData;
        int i12 = this.f63924g;
        int read = interfaceC1184q.read(bArr2, i12, bArr2.length - i12);
        if (read != -1) {
            int i13 = this.f63924g + read;
            this.f63924g = i13;
            if (length == -1 || i13 != length) {
                return 0;
            }
        }
        d();
        return -1;
    }

    @Override // H1.InterfaceC1183p
    public boolean j(InterfaceC1184q interfaceC1184q) {
        interfaceC1184q.e(this.sampleData, 0, 6, false);
        this.f63920c.Z(this.sampleData, 6);
        if (n2.h.b(this.f63920c)) {
            return true;
        }
        interfaceC1184q.e(this.sampleData, 6, 3, false);
        this.f63920c.Z(this.sampleData, 9);
        return n2.h.b(this.f63920c);
    }

    @Override // H1.InterfaceC1183p
    public void release() {
    }
}
