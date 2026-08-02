package defpackage;

import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class h2l implements ll6 {
    public static final Pattern i = Pattern.compile("LOCAL:([^,]+)");
    public static final Pattern j = Pattern.compile("MPEGTS:(-?\\d+)");
    public final String a;
    public final djj b;
    public final xli d;
    public final boolean e;
    public pl6 f;
    public int h;
    public final j9e c = new j9e();
    public byte[] g = new byte[1024];

    public h2l(String str, djj djjVar, xli xliVar, boolean z) {
        this.a = str;
        this.b = djjVar;
        this.d = xliVar;
        this.e = z;
    }

    @Override // defpackage.ll6
    public final boolean a(nl6 nl6Var) {
        bp4 bp4Var = (bp4) nl6Var;
        bp4Var.peekFully(this.g, 0, 6, false);
        byte[] bArr = this.g;
        j9e j9eVar = this.c;
        j9eVar.L(bArr, 6);
        if (j2l.a(j9eVar)) {
            return true;
        }
        bp4Var.peekFully(this.g, 6, 3, false);
        j9eVar.L(this.g, 9);
        return j2l.a(j9eVar);
    }

    @Override // defpackage.ll6
    public final int b(nl6 nl6Var, b78 b78Var) {
        String n;
        this.f.getClass();
        int length = (int) nl6Var.getLength();
        int i2 = this.h;
        byte[] bArr = this.g;
        if (i2 == bArr.length) {
            bArr = Arrays.copyOf(bArr, ((length != -1 ? length : bArr.length) * 3) / 2);
            this.g = bArr;
        }
        int i3 = this.h;
        int read = nl6Var.read(bArr, i3, bArr.length - i3);
        if (read != -1) {
            int i4 = this.h + read;
            this.h = i4;
            if (length == -1 || i4 != length) {
                return 0;
            }
        }
        j9e j9eVar = new j9e(this.g);
        j2l.d(j9eVar);
        String n2 = j9eVar.n(StandardCharsets.UTF_8);
        long j2 = 0;
        long j3 = 0;
        while (true) {
            Matcher matcher = null;
            if (TextUtils.isEmpty(n2)) {
                while (true) {
                    String n3 = j9eVar.n(StandardCharsets.UTF_8);
                    if (n3 == null) {
                        break;
                    }
                    if (j2l.a.matcher(n3).matches()) {
                        do {
                            n = j9eVar.n(StandardCharsets.UTF_8);
                            if (n != null) {
                            }
                        } while (!n.isEmpty());
                    } else {
                        Matcher matcher2 = f2l.a.matcher(n3);
                        if (matcher2.matches()) {
                            matcher = matcher2;
                            break;
                        }
                    }
                }
                if (matcher == null) {
                    f(0L);
                    return -1;
                }
                String group = matcher.group(1);
                group.getClass();
                long c = j2l.c(group);
                String str = nik.a;
                long b = this.b.b(nik.b0((j2 + c) - j3, 90000L, 1000000L, RoundingMode.DOWN) % 8589934592L);
                vsj f = f(b - c);
                byte[] bArr2 = this.g;
                int i5 = this.h;
                j9e j9eVar2 = this.c;
                j9eVar2.L(bArr2, i5);
                f.g(this.h, j9eVar2);
                f.a(b, 1, this.h, 0, null);
                return -1;
            }
            if (n2.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher3 = i.matcher(n2);
                if (!matcher3.find()) {
                    throw s9e.a(null, "X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(n2));
                }
                Matcher matcher4 = j.matcher(n2);
                if (!matcher4.find()) {
                    throw s9e.a(null, "X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(n2));
                }
                String group2 = matcher3.group(1);
                group2.getClass();
                j3 = j2l.c(group2);
                String group3 = matcher4.group(1);
                group3.getClass();
                long parseLong = Long.parseLong(group3);
                String str2 = nik.a;
                j2 = nik.b0(parseLong, 1000000L, 90000L, RoundingMode.DOWN);
            }
            n2 = j9eVar.n(StandardCharsets.UTF_8);
        }
    }

    @Override // defpackage.ll6
    public final void e(pl6 pl6Var) {
        if (this.e) {
            pl6Var = new en0(pl6Var, this.d);
        }
        this.f = pl6Var;
        pl6Var.m(new bw0(C.TIME_UNSET));
    }

    public final vsj f(long j2) {
        vsj mo2track = this.f.mo2track(0, 3);
        qm8 qm8Var = new qm8();
        qm8Var.n = sjc.p(MimeTypes.TEXT_VTT);
        qm8Var.d = this.a;
        qm8Var.s = j2;
        w1l.r(qm8Var, mo2track);
        this.f.endTracks();
        return mo2track;
    }

    @Override // defpackage.ll6
    public final void seek(long j2, long j3) {
        throw new IllegalStateException();
    }

    @Override // defpackage.ll6
    public final void release() {
    }
}
