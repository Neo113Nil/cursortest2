package b2;

import H1.AbstractC1168a;
import H1.AbstractC1169b;
import H1.AbstractC1170c;
import H1.AbstractC1185s;
import H1.B;
import H1.C;
import H1.C1171d;
import H1.H;
import H1.S;
import android.util.Pair;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.a;
import b1.AbstractC2335D;
import b1.C2334C;
import b1.C2338G;
import b1.C2357k;
import b2.AbstractC2374d;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.google.common.collect.AbstractC3445z;
import com.plaid.internal.EnumC3631g;
import com.twilio.voice.AudioFormat;
import e1.AbstractC4134a;
import e1.AbstractC4144k;
import e1.AbstractC4156x;
import e1.I;
import e1.J;
import e1.Z;
import f1.AbstractC4227e;
import f1.AbstractC4230h;
import f1.C4223a;
import f1.C4225c;
import f1.C4226d;
import f1.C4228f;
import f1.C4229g;
import io.agora.rtc2.internal.RtcEngineEvent;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.LongCompanionObject;
import lb.C5444x;

/* renamed from: b2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2372b {
    private static final byte[] opusMagic = Z.B0("OpusHead");

    /* renamed from: b2.b$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f24793a;

        /* renamed from: b, reason: collision with root package name */
        public final long f24794b;

        public a(long j10, long j11) {
            this.f24793a = j10;
            this.f24794b = j11;
        }
    }

    /* renamed from: b2.b$b, reason: collision with other inner class name */
    public static final class C0431b {

        /* renamed from: a, reason: collision with root package name */
        public final int f24795a;

        /* renamed from: b, reason: collision with root package name */
        public int f24796b;

        /* renamed from: c, reason: collision with root package name */
        public int f24797c;

        /* renamed from: d, reason: collision with root package name */
        public long f24798d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f24799e;

        /* renamed from: f, reason: collision with root package name */
        public final J f24800f;

        /* renamed from: g, reason: collision with root package name */
        public final J f24801g;

        /* renamed from: h, reason: collision with root package name */
        public int f24802h;

        /* renamed from: i, reason: collision with root package name */
        public int f24803i;

        public C0431b(J j10, J j11, boolean z10) {
            this.f24801g = j10;
            this.f24800f = j11;
            this.f24799e = z10;
            j11.b0(12);
            this.f24795a = j11.Q();
            j10.b0(12);
            this.f24803i = j10.Q();
            AbstractC1185s.a(j10.v() == 1, "first_chunk must be 1");
            this.f24796b = -1;
        }

        public boolean a() {
            int i10 = this.f24796b + 1;
            this.f24796b = i10;
            if (i10 == this.f24795a) {
                return false;
            }
            this.f24798d = this.f24799e ? this.f24800f.T() : this.f24800f.O();
            if (this.f24796b == this.f24802h) {
                this.f24797c = this.f24801g.Q();
                this.f24801g.c0(4);
                int i11 = this.f24803i - 1;
                this.f24803i = i11;
                this.f24802h = i11 > 0 ? this.f24801g.Q() - 1 : -1;
            }
            return true;
        }
    }

    /* renamed from: b2.b$c */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final String f24804a;

        /* renamed from: b, reason: collision with root package name */
        public final long f24805b;

        /* renamed from: c, reason: collision with root package name */
        public final long f24806c;
        private final byte[] initializationData;

        public c(String str, byte[] bArr, long j10, long j11) {
            this.f24804a = str;
            this.initializationData = bArr;
            this.f24805b = j10;
            this.f24806c = j11;
        }
    }

    /* renamed from: b2.b$d */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final g f24807a;

        public d(g gVar) {
            this.f24807a = gVar;
        }
    }

    /* renamed from: b2.b$e */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final long f24808a;

        /* renamed from: b, reason: collision with root package name */
        public final long f24809b;

        /* renamed from: c, reason: collision with root package name */
        public final String f24810c;

        public e(long j10, long j11, String str) {
            this.f24808a = j10;
            this.f24809b = j11;
            this.f24810c = str;
        }
    }

    /* renamed from: b2.b$f */
    public interface f {
        int a();

        int b();

        int c();
    }

    /* renamed from: b2.b$g */
    public static final class g {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f24811a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f24812b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f24813c;

        public g(boolean z10, boolean z11, boolean z12) {
            this.f24811a = z10;
            this.f24812b = z11;
            this.f24813c = z12;
        }
    }

    /* renamed from: b2.b$h */
    public static final class h {

        /* renamed from: a, reason: collision with root package name */
        public androidx.media3.common.a f24814a;

        /* renamed from: b, reason: collision with root package name */
        public int f24815b;

        /* renamed from: c, reason: collision with root package name */
        public int f24816c = 0;
        public final u[] trackEncryptionBoxes;

        public h(int i10) {
            this.trackEncryptionBoxes = new u[i10];
        }
    }

    /* renamed from: b2.b$i */
    public static final class i implements f {

        /* renamed from: a, reason: collision with root package name */
        public final int f24817a;

        /* renamed from: b, reason: collision with root package name */
        public final int f24818b;

        /* renamed from: c, reason: collision with root package name */
        public final J f24819c;

        public i(AbstractC4227e.c cVar, androidx.media3.common.a aVar) {
            J j10 = cVar.f46179b;
            this.f24819c = j10;
            j10.b0(12);
            int Q10 = j10.Q();
            if ("audio/raw".equals(aVar.f20543o)) {
                int q02 = Z.q0(aVar.f20520H, aVar.f20518F);
                if (Q10 == 0 || Q10 % q02 != 0) {
                    AbstractC4156x.i("BoxParsers", "Audio sample size mismatch. stsd sample size: " + q02 + ", stsz sample size: " + Q10);
                    Q10 = q02;
                }
            }
            this.f24817a = Q10 == 0 ? -1 : Q10;
            this.f24818b = j10.Q();
        }

        @Override // b2.AbstractC2372b.f
        public int a() {
            int i10 = this.f24817a;
            return i10 == -1 ? this.f24819c.Q() : i10;
        }

        @Override // b2.AbstractC2372b.f
        public int b() {
            return this.f24817a;
        }

        @Override // b2.AbstractC2372b.f
        public int c() {
            return this.f24818b;
        }
    }

    /* renamed from: b2.b$j */
    public static final class j implements f {

        /* renamed from: a, reason: collision with root package name */
        public final J f24820a;

        /* renamed from: b, reason: collision with root package name */
        public final int f24821b;

        /* renamed from: c, reason: collision with root package name */
        public final int f24822c;

        /* renamed from: d, reason: collision with root package name */
        public int f24823d;

        /* renamed from: e, reason: collision with root package name */
        public int f24824e;

        public j(AbstractC4227e.c cVar) {
            J j10 = cVar.f46179b;
            this.f24820a = j10;
            j10.b0(12);
            this.f24822c = j10.Q() & 255;
            this.f24821b = j10.Q();
        }

        @Override // b2.AbstractC2372b.f
        public int a() {
            int i10 = this.f24822c;
            if (i10 == 8) {
                return this.f24820a.M();
            }
            if (i10 == 16) {
                return this.f24820a.U();
            }
            int i11 = this.f24823d;
            this.f24823d = i11 + 1;
            if (i11 % 2 != 0) {
                return this.f24824e & 15;
            }
            int M10 = this.f24820a.M();
            this.f24824e = M10;
            return (M10 & EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE) >> 4;
        }

        @Override // b2.AbstractC2372b.f
        public int b() {
            return -1;
        }

        @Override // b2.AbstractC2372b.f
        public int c() {
            return this.f24821b;
        }
    }

    /* renamed from: b2.b$k */
    public static final class k {

        /* renamed from: a, reason: collision with root package name */
        public final int f24825a;

        /* renamed from: b, reason: collision with root package name */
        public final long f24826b;

        /* renamed from: c, reason: collision with root package name */
        public final int f24827c;

        /* renamed from: d, reason: collision with root package name */
        public final int f24828d;

        /* renamed from: e, reason: collision with root package name */
        public final int f24829e;

        /* renamed from: f, reason: collision with root package name */
        public final int f24830f;

        public k(int i10, long j10, int i11, int i12, int i13, int i14) {
            this.f24825a = i10;
            this.f24826b = j10;
            this.f24827c = i11;
            this.f24828d = i12;
            this.f24829e = i13;
            this.f24830f = i14;
        }
    }

    /* renamed from: b2.b$l */
    public static final class l {

        /* renamed from: a, reason: collision with root package name */
        public final d f24831a;

        public l(d dVar) {
            this.f24831a = dVar;
        }

        public boolean b() {
            d dVar = this.f24831a;
            return dVar != null && dVar.f24807a.f24811a && this.f24831a.f24807a.f24812b;
        }
    }

    public static u A(J j10, int i10, int i11, String str) {
        int i12;
        int i13;
        int i14 = i10 + 8;
        while (true) {
            byte[] bArr = null;
            if (i14 - i10 >= i11) {
                return null;
            }
            j10.b0(i14);
            int v10 = j10.v();
            if (j10.v() == 1952804451) {
                int q10 = q(j10.v());
                j10.c0(1);
                if (q10 == 0) {
                    j10.c0(1);
                    i13 = 0;
                    i12 = 0;
                } else {
                    int M10 = j10.M();
                    i12 = M10 & 15;
                    i13 = (M10 & EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE) >> 4;
                }
                boolean z10 = j10.M() == 1;
                int M11 = j10.M();
                byte[] bArr2 = new byte[16];
                j10.q(bArr2, 0, 16);
                if (z10 && M11 == 0) {
                    int M12 = j10.M();
                    bArr = new byte[M12];
                    j10.q(bArr, 0, M12);
                }
                return new u(z10, str, M11, bArr2, i13, i12, bArr);
            }
            i14 += v10;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v15, types: [boolean] */
    public static w B(t tVar, AbstractC4227e.b bVar, B b10) {
        f jVar;
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int[] iArr;
        int i17;
        int i18;
        long[] jArr;
        int[] iArr2;
        long j10;
        long j11;
        int i19;
        long[] jArr2;
        int[] iArr3;
        int[] iArr4;
        int i20;
        int[] iArr5;
        int i21;
        ?? r82;
        int i22;
        t tVar2 = tVar;
        AbstractC4227e.c e10 = bVar.e(1937011578);
        if (e10 != null) {
            jVar = new i(e10, tVar2.f24954g);
        } else {
            AbstractC4227e.c e11 = bVar.e(1937013298);
            if (e11 == null) {
                throw C2338G.a("Track has no sample table size information", null);
            }
            jVar = new j(e11);
        }
        int c10 = jVar.c();
        if (c10 == 0) {
            return new w(tVar2, new long[0], new int[0], 0, new long[0], new int[0], 0L);
        }
        if (tVar2.f24949b == 2) {
            long j12 = tVar2.f24953f;
            if (j12 > 0) {
                tVar2 = tVar2.a(tVar2.f24954g.b().f0(c10 / (j12 / 1000000.0f)).P());
            }
        }
        AbstractC4227e.c e12 = bVar.e(1937007471);
        if (e12 == null) {
            e12 = (AbstractC4227e.c) AbstractC4134a.e(bVar.e(1668232756));
            z10 = true;
        } else {
            z10 = false;
        }
        J j13 = e12.f46179b;
        J j14 = ((AbstractC4227e.c) AbstractC4134a.e(bVar.e(1937011555))).f46179b;
        J j15 = ((AbstractC4227e.c) AbstractC4134a.e(bVar.e(1937011827))).f46179b;
        AbstractC4227e.c e13 = bVar.e(1937011571);
        J j16 = e13 != null ? e13.f46179b : null;
        AbstractC4227e.c e14 = bVar.e(1668576371);
        J j17 = e14 != null ? e14.f46179b : null;
        C0431b c0431b = new C0431b(j14, j13, z10);
        j15.b0(12);
        int Q10 = j15.Q() - 1;
        int Q11 = j15.Q();
        int Q12 = j15.Q();
        if (j17 != null) {
            j17.b0(12);
            i10 = j17.Q();
        } else {
            i10 = 0;
        }
        if (j16 != null) {
            j16.b0(12);
            i12 = j16.Q();
            if (i12 > 0) {
                i11 = j16.Q() - 1;
                i13 = 0;
            } else {
                i11 = -1;
                i13 = 0;
                j16 = null;
            }
        } else {
            i11 = -1;
            i12 = 0;
            i13 = 0;
        }
        int b11 = jVar.b();
        String str = tVar2.f24954g.f20543o;
        if (((b11 == -1 || !(("audio/raw".equals(str) || "audio/g711-mlaw".equals(str) || "audio/g711-alaw".equals(str)) && Q10 == 0 && i10 == 0 && i12 == 0)) ? i13 : 1) != 0) {
            int i23 = c0431b.f24795a;
            long[] jArr3 = new long[i23];
            int[] iArr6 = new int[i23];
            while (c0431b.a()) {
                int i24 = c0431b.f24796b;
                jArr3[i24] = c0431b.f24798d;
                iArr6[i24] = c0431b.f24797c;
            }
            AbstractC2374d.b a10 = AbstractC2374d.a(b11, jArr3, iArr6, Q12);
            long[] jArr4 = a10.offsets;
            int[] iArr7 = a10.sizes;
            int i25 = a10.f24836a;
            long[] jArr5 = a10.timestamps;
            int[] iArr8 = a10.flags;
            long j18 = a10.f24837b;
            j11 = a10.f24838c;
            j10 = j18;
            i14 = 1;
            jArr = jArr5;
            iArr2 = iArr8;
            i19 = i25;
            iArr3 = iArr7;
            jArr2 = jArr4;
        } else {
            long[] jArr6 = new long[c10];
            int[] iArr9 = new int[c10];
            long[] jArr7 = new long[c10];
            i14 = 1;
            int[] iArr10 = new int[c10];
            J j19 = j17;
            f fVar = jVar;
            int i26 = Q12;
            J j20 = j16;
            long j21 = 0;
            long j22 = 0;
            int i27 = i10;
            int i28 = i11;
            int i29 = i13;
            int i30 = i29;
            int i31 = i30;
            int i32 = i31;
            int i33 = Q11;
            long j23 = 0;
            int i34 = Q10;
            int i35 = i12;
            int i36 = i32;
            while (true) {
                if (i29 >= c10) {
                    i15 = i34;
                    i16 = i33;
                    iArr = iArr9;
                    i17 = i31;
                    break;
                }
                long j24 = j22;
                int i37 = i31;
                boolean z11 = true;
                while (i37 == 0) {
                    z11 = c0431b.a();
                    if (!z11) {
                        break;
                    }
                    int i38 = i34;
                    long j25 = c0431b.f24798d;
                    i37 = c0431b.f24797c;
                    j24 = j25;
                    i34 = i38;
                    i33 = i33;
                    c10 = c10;
                }
                int i39 = c10;
                i15 = i34;
                i16 = i33;
                if (!z11) {
                    AbstractC4156x.i("BoxParsers", "Unexpected end of chunk data");
                    long[] copyOf = Arrays.copyOf(jArr6, i29);
                    int[] copyOf2 = Arrays.copyOf(iArr9, i29);
                    jArr7 = Arrays.copyOf(jArr7, i29);
                    iArr10 = Arrays.copyOf(iArr10, i29);
                    jArr6 = copyOf;
                    iArr = copyOf2;
                    c10 = i29;
                    i17 = i37;
                    break;
                }
                if (j19 != null) {
                    int i40 = i32;
                    while (i40 == 0 && i27 > 0) {
                        i40 = j19.Q();
                        i30 = j19.v();
                        i27--;
                    }
                    i32 = i40 - 1;
                }
                jArr6[i29] = j24;
                int a11 = fVar.a();
                iArr9[i29] = a11;
                j23 += a11;
                if (a11 > i36) {
                    i36 = a11;
                }
                jArr7[i29] = j21 + i30;
                iArr10[i29] = j20 == null ? 1 : i13;
                if (i29 == i28) {
                    iArr10[i29] = 1;
                    i35--;
                    if (i35 > 0) {
                        i28 = ((J) AbstractC4134a.e(j20)).Q() - 1;
                    }
                }
                j21 += i26;
                i33 = i16 - 1;
                if (i33 != 0 || i15 <= 0) {
                    i34 = i15;
                } else {
                    i34 = i15 - 1;
                    i33 = j15.Q();
                    i26 = j15.v();
                }
                long j26 = j24 + iArr9[i29];
                i31 = i37 - 1;
                i29++;
                j22 = j26;
                c10 = i39;
            }
            long j27 = j21 + i30;
            if (j19 != null) {
                while (i27 > 0) {
                    if (j19.Q() != 0) {
                        i18 = i13;
                        break;
                    }
                    j19.v();
                    i27--;
                }
            }
            i18 = 1;
            if (i35 != 0 || i16 != 0 || i17 != 0 || i15 != 0 || i32 != 0 || i18 == 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Inconsistent stbl box for track ");
                sb2.append(tVar2.f24948a);
                sb2.append(": remainingSynchronizationSamples ");
                sb2.append(i35);
                sb2.append(", remainingSamplesAtTimestampDelta ");
                sb2.append(i16);
                sb2.append(", remainingSamplesInChunk ");
                sb2.append(i17);
                sb2.append(", remainingTimestampDeltaChanges ");
                sb2.append(i15);
                sb2.append(", remainingSamplesAtTimestampOffset ");
                sb2.append(i32);
                sb2.append(i18 == 0 ? ", ctts invalid" : "");
                AbstractC4156x.i("BoxParsers", sb2.toString());
            }
            jArr = jArr7;
            iArr2 = iArr10;
            j10 = j27;
            j11 = j23;
            i19 = i36;
            jArr2 = jArr6;
            iArr3 = iArr;
        }
        long j28 = tVar2.f24953f;
        if (j28 > 0) {
            long s12 = Z.s1(j11 * 8, 1000000L, j28, RoundingMode.HALF_DOWN);
            if (s12 > 0 && s12 < 2147483647L) {
                tVar2 = tVar2.a(tVar2.f24954g.b().S((int) s12).P());
            }
        }
        t tVar3 = tVar2;
        long p12 = Z.p1(j10, 1000000L, tVar3.f24950c);
        long[] jArr8 = tVar3.editListDurations;
        if (jArr8 == null) {
            Z.r1(jArr, 1000000L, tVar3.f24950c);
            return new w(tVar3, jArr2, iArr3, i19, jArr, iArr2, p12);
        }
        int[] iArr11 = iArr2;
        int i41 = i14;
        if (jArr8.length == i41 && tVar3.f24949b == i41 && jArr.length >= 2) {
            long j29 = ((long[]) AbstractC4134a.e(tVar3.editListMediaTimes))[i13];
            long p13 = j29 + Z.p1(tVar3.editListDurations[i13], tVar3.f24950c, tVar3.f24951d);
            if (b(jArr, j10, j29, p13)) {
                long p14 = Z.p1(j29 - jArr[i13], tVar3.f24954g.f20519G, tVar3.f24950c);
                long p15 = Z.p1(j10 - p13, tVar3.f24954g.f20519G, tVar3.f24950c);
                if ((p14 != 0 || p15 != 0) && p14 <= 2147483647L && p15 <= 2147483647L) {
                    b10.f4303a = (int) p14;
                    b10.f4304b = (int) p15;
                    Z.r1(jArr, 1000000L, tVar3.f24950c);
                    return new w(tVar3, jArr2, iArr3, i19, jArr, iArr11, Z.p1(tVar3.editListDurations[i13], 1000000L, tVar3.f24951d));
                }
            }
        }
        long[] jArr9 = tVar3.editListDurations;
        if (jArr9.length == 1 && jArr9[i13] == 0) {
            long j30 = ((long[]) AbstractC4134a.e(tVar3.editListMediaTimes))[i13];
            for (int i42 = i13; i42 < jArr.length; i42++) {
                jArr[i42] = Z.p1(jArr[i42] - j30, 1000000L, tVar3.f24950c);
            }
            return new w(tVar3, jArr2, iArr3, i19, jArr, iArr11, Z.p1(j10 - j30, 1000000L, tVar3.f24950c));
        }
        ?? r12 = tVar3.f24949b == 1 ? 1 : i13;
        int[] iArr12 = new int[jArr9.length];
        int[] iArr13 = new int[jArr9.length];
        long[] jArr10 = (long[]) AbstractC4134a.e(tVar3.editListMediaTimes);
        int i43 = i13;
        int i44 = i43;
        int i45 = i44;
        int i46 = i45;
        while (true) {
            long[] jArr11 = tVar3.editListDurations;
            iArr4 = iArr13;
            if (i43 >= jArr11.length) {
                break;
            }
            int i47 = i43;
            int i48 = i44;
            long j31 = jArr10[i47];
            if (j31 != -1) {
                long j32 = jArr11[i47];
                iArr5 = iArr3;
                i21 = i19;
                long p16 = Z.p1(j32, tVar3.f24950c, tVar3.f24951d);
                i20 = i47;
                iArr12[i20] = Z.h(jArr, j31, true, true);
                long j33 = j31 + p16;
                r82 = i13;
                iArr4[i20] = Z.d(jArr, j33, r12, r82);
                int i49 = iArr12[i20];
                while (true) {
                    i22 = iArr12[i20];
                    if (i22 < 0 || (iArr11[i22] & 1) != 0) {
                        break;
                    }
                    iArr12[i20] = i22 - 1;
                }
                if (i22 < 0) {
                    iArr12[i20] = i49;
                    while (true) {
                        int i50 = iArr12[i20];
                        if (i50 >= iArr4[i20] || (iArr11[i50] & 1) != 0) {
                            break;
                        }
                        iArr12[i20] = i50 + 1;
                    }
                }
                if (tVar3.f24949b == 2 && iArr12[i20] != iArr4[i20]) {
                    while (true) {
                        int i51 = iArr4[i20];
                        if (i51 >= jArr.length - 1 || jArr[i51 + 1] > j33) {
                            break;
                        }
                        iArr4[i20] = i51 + 1;
                    }
                }
                int i52 = iArr4[i20];
                int i53 = iArr12[i20];
                i45 += i52 - i53;
                i44 = i48 | (i46 != i53 ? 1 : r82 == true ? 1 : 0);
                i46 = i52;
            } else {
                i20 = i47;
                iArr5 = iArr3;
                i21 = i19;
                r82 = i13;
                i44 = i48;
            }
            i43 = i20 + 1;
            i13 = r82;
            iArr3 = iArr5;
            iArr13 = iArr4;
            i19 = i21;
        }
        int[] iArr14 = iArr3;
        int i54 = i19;
        int i55 = i13;
        int i56 = i44 | (i45 != c10 ? 1 : i55);
        long[] jArr12 = i56 != 0 ? new long[i45] : jArr2;
        int[] iArr15 = i56 != 0 ? new int[i45] : iArr14;
        int i57 = i56 != 0 ? i55 : i54;
        int[] iArr16 = i56 != 0 ? new int[i45] : iArr11;
        long[] jArr13 = new long[i45];
        int i58 = i57;
        int i59 = i55;
        int i60 = i59;
        long j34 = 0;
        while (i55 < tVar3.editListDurations.length) {
            long j35 = tVar3.editListMediaTimes[i55];
            int i61 = iArr12[i55];
            int i62 = iArr4[i55];
            int i63 = i56;
            if (i56 != 0) {
                int i64 = i62 - i61;
                System.arraycopy(jArr2, i61, jArr12, i60, i64);
                System.arraycopy(iArr14, i61, iArr15, i60, i64);
                System.arraycopy(iArr11, i61, iArr16, i60, i64);
            }
            int i65 = i58;
            while (i61 < i62) {
                long[] jArr14 = jArr12;
                int[] iArr17 = iArr12;
                long p17 = Z.p1(j34, 1000000L, tVar3.f24951d);
                long p18 = Z.p1(jArr[i61] - j35, 1000000L, tVar3.f24950c);
                if (p18 < 0) {
                    i59 = 1;
                }
                jArr13[i60] = p17 + p18;
                if (i63 != 0 && iArr15[i60] > i65) {
                    i65 = iArr14[i61];
                }
                i60++;
                i61++;
                iArr12 = iArr17;
                jArr12 = jArr14;
            }
            j34 += tVar3.editListDurations[i55];
            i55++;
            i58 = i65;
            jArr12 = jArr12;
            i56 = i63;
        }
        long[] jArr15 = jArr12;
        long p19 = Z.p1(j34, 1000000L, tVar3.f24951d);
        if (i59 != 0) {
            tVar3 = tVar3.a(tVar3.f24954g.b().g0(true).P());
        }
        return new w(tVar3, jArr15, iArr15, i58, jArr13, iArr16, p19);
    }

    public static d C(J j10, int i10, int i11) {
        j10.b0(i10 + 8);
        int g10 = j10.g();
        while (g10 - i10 < i11) {
            j10.b0(g10);
            int v10 = j10.v();
            AbstractC1185s.a(v10 > 0, "childAtomSize must be positive");
            if (j10.v() == 1937011305) {
                j10.c0(4);
                int M10 = j10.M();
                return new d(new g((M10 & 1) == 1, (M10 & 2) == 2, (M10 & 8) == 8));
            }
            g10 += v10;
        }
        return null;
    }

    public static h D(J j10, k kVar, String str, DrmInitData drmInitData, boolean z10) {
        j10.b0(12);
        int v10 = j10.v();
        h hVar = new h(v10);
        for (int i10 = 0; i10 < v10; i10++) {
            int g10 = j10.g();
            int v11 = j10.v();
            AbstractC1185s.a(v11 > 0, "childAtomSize must be positive");
            int v12 = j10.v();
            if (v12 == 1635148593 || v12 == 1635148595 || v12 == 1701733238 || v12 == 1831958048 || v12 == 1836070006 || v12 == 1752589105 || v12 == 1751479857 || v12 == 1932670515 || v12 == 1211250227 || v12 == 1748121139 || v12 == 1987063864 || v12 == 1987063865 || v12 == 1635135537 || v12 == 1685479798 || v12 == 1685479729 || v12 == 1685481573 || v12 == 1685481521 || v12 == 1634760241) {
                L(j10, v12, g10, v11, kVar.f24825a, str, kVar.f24828d, drmInitData, hVar, i10);
            } else if (v12 == 1836069985 || v12 == 1701733217 || v12 == 1633889587 || v12 == 1700998451 || v12 == 1633889588 || v12 == 1835823201 || v12 == 1685353315 || v12 == 1685353317 || v12 == 1685353320 || v12 == 1685353324 || v12 == 1685353336 || v12 == 1935764850 || v12 == 1935767394 || v12 == 1819304813 || v12 == 1936684916 || v12 == 1953984371 || v12 == 778924082 || v12 == 778924083 || v12 == 1835557169 || v12 == 1835560241 || v12 == 1634492771 || v12 == 1634492791 || v12 == 1970037111 || v12 == 1332770163 || v12 == 1716281667 || v12 == 1767992678 || v12 == 1768973165 || v12 == 1718641517) {
                i(j10, v12, g10, v11, kVar.f24825a, str, z10, drmInitData, hVar, i10);
            } else if (v12 == 1414810956 || v12 == 1954034535 || v12 == 2004251764 || v12 == 1937010800 || v12 == 1664495672 || v12 == 1836070003) {
                h hVar2 = hVar;
                E(j10, v12, g10, v11, kVar, str, hVar2);
                hVar = hVar2;
            } else if (v12 == 1835365492) {
                v(j10, v12, g10, kVar.f24825a, hVar);
            } else if (v12 == 1667329389) {
                hVar.f24814a = new a.b().i0(kVar.f24825a).y0("application/x-camera-motion").P();
            }
            j10.b0(g10 + v11);
        }
        return hVar;
    }

    public static void E(J j10, int i10, int i11, int i12, k kVar, String str, h hVar) {
        j10.b0(i11 + 16);
        String str2 = "application/ttml+xml";
        AbstractC3445z abstractC3445z = null;
        long j11 = LongCompanionObject.MAX_VALUE;
        if (i10 != 1414810956) {
            if (i10 == 1954034535) {
                int i13 = i12 - 16;
                byte[] bArr = new byte[i13];
                j10.q(bArr, 0, i13);
                abstractC3445z = AbstractC3445z.u(bArr);
                str2 = "application/x-quicktime-tx3g";
            } else if (i10 == 2004251764) {
                str2 = "application/x-mp4-vtt";
            } else if (i10 == 1937010800) {
                j11 = 0;
            } else if (i10 == 1664495672) {
                hVar.f24816c = 1;
                str2 = "application/x-mp4-cea-608";
            } else {
                if (i10 != 1836070003) {
                    throw new IllegalStateException();
                }
                int g10 = j10.g();
                j10.c0(4);
                if (j10.v() == 1702061171) {
                    c n10 = n(j10, g10);
                    if (n10.initializationData == null || n10.initializationData.length != 64) {
                        return;
                    }
                    abstractC3445z = AbstractC3445z.u(Z.B0(d(n10.initializationData, kVar.f24829e, kVar.f24830f)));
                    str2 = "application/vobsub";
                } else {
                    str2 = null;
                }
            }
        }
        if (str2 != null) {
            hVar.f24814a = new a.b().i0(kVar.f24825a).y0(str2).n0(str).C0(j11).k0(abstractC3445z).P();
        }
    }

    public static k F(J j10) {
        long j11;
        j10.b0(8);
        int q10 = q(j10.v());
        j10.c0(q10 == 0 ? 8 : 16);
        int v10 = j10.v();
        j10.c0(4);
        int g10 = j10.g();
        int i10 = q10 == 0 ? 4 : 8;
        int i11 = 0;
        while (true) {
            j11 = -9223372036854775807L;
            if (i11 >= i10) {
                j10.c0(i10);
                break;
            }
            if (j10.f()[g10 + i11] != -1) {
                long O10 = q10 == 0 ? j10.O() : j10.T();
                if (O10 != 0) {
                    j11 = O10;
                }
            } else {
                i11++;
            }
        }
        j10.c0(10);
        int i12 = 0;
        long j12 = j11;
        int U10 = j10.U();
        j10.c0(4);
        int v11 = j10.v();
        int v12 = j10.v();
        j10.c0(4);
        int v13 = j10.v();
        int v14 = j10.v();
        if (v11 == 0 && v12 == 65536 && ((v13 == -65536 || v13 == 65536) && v14 == 0)) {
            i12 = 90;
        } else if (v11 == 0 && v12 == -65536 && ((v13 == 65536 || v13 == -65536) && v14 == 0)) {
            i12 = 270;
        } else if ((v11 == -65536 || v11 == 65536) && v12 == 0 && v13 == 0 && v14 == -65536) {
            i12 = 180;
        }
        int i13 = i12;
        j10.c0(16);
        short I10 = j10.I();
        j10.c0(2);
        return new k(v10, j12, U10, i13, I10, j10.I());
    }

    public static t G(AbstractC4227e.b bVar, AbstractC4227e.c cVar, long j10, DrmInitData drmInitData, boolean z10, boolean z11) {
        long[] jArr;
        long[] jArr2;
        androidx.media3.common.a aVar;
        AbstractC4227e.b d10;
        Pair m10;
        AbstractC4227e.b bVar2 = (AbstractC4227e.b) AbstractC4134a.e(bVar.d(1835297121));
        int f10 = f(r(((AbstractC4227e.c) AbstractC4134a.e(bVar2.e(1751411826))).f46179b));
        if (f10 == -1) {
            return null;
        }
        k F10 = F(((AbstractC4227e.c) AbstractC4134a.e(bVar.e(1953196132))).f46179b);
        long j11 = j10 == -9223372036854775807L ? F10.f24826b : j10;
        long j12 = w(cVar.f46179b).f46184c;
        long p12 = j11 != -9223372036854775807L ? Z.p1(j11, 1000000L, j12) : -9223372036854775807L;
        AbstractC4227e.b bVar3 = (AbstractC4227e.b) AbstractC4134a.e(((AbstractC4227e.b) AbstractC4134a.e(bVar2.d(1835626086))).d(1937007212));
        e t10 = t(((AbstractC4227e.c) AbstractC4134a.e(bVar2.e(1835296868))).f46179b);
        AbstractC4227e.c e10 = bVar3.e(1937011556);
        if (e10 == null) {
            throw C2338G.a("Malformed sample table (stbl) missing sample description (stsd)", null);
        }
        h D10 = D(e10.f46179b, F10, t10.f24810c, drmInitData, z11);
        if (z10 || (d10 = bVar.d(1701082227)) == null || (m10 = m(d10)) == null) {
            jArr = null;
            jArr2 = null;
        } else {
            long[] jArr3 = (long[]) m10.first;
            jArr2 = (long[]) m10.second;
            jArr = jArr3;
        }
        if (D10.f24814a == null) {
            return null;
        }
        if (F10.f24827c != 0) {
            C4226d c4226d = new C4226d(F10.f24827c);
            a.b b10 = D10.f24814a.b();
            C2334C c2334c = D10.f24814a.f20540l;
            aVar = b10.r0(c2334c != null ? c2334c.a(c4226d) : new C2334C(c4226d)).P();
        } else {
            aVar = D10.f24814a;
        }
        return new t(F10.f24825a, f10, t10.f24808a, j12, p12, t10.f24809b, aVar, D10.f24816c, D10.trackEncryptionBoxes, D10.f24815b, jArr, jArr2);
    }

    public static List H(AbstractC4227e.b bVar, B b10, long j10, DrmInitData drmInitData, boolean z10, boolean z11, Ra.f fVar) {
        t tVar;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < bVar.f46178d.size(); i10++) {
            AbstractC4227e.b bVar2 = (AbstractC4227e.b) bVar.f46178d.get(i10);
            if (bVar2.f46175a == 1953653099 && (tVar = (t) fVar.apply(G(bVar2, (AbstractC4227e.c) AbstractC4134a.e(bVar.e(1836476516)), j10, drmInitData, z10, z11))) != null) {
                arrayList.add(B(tVar, (AbstractC4227e.b) AbstractC4134a.e(((AbstractC4227e.b) AbstractC4134a.e(((AbstractC4227e.b) AbstractC4134a.e(bVar2.d(1835297121))).d(1835626086))).d(1937007212)), b10));
            }
        }
        return arrayList;
    }

    public static C2334C I(AbstractC4227e.c cVar) {
        J j10 = cVar.f46179b;
        j10.b0(8);
        C2334C c2334c = new C2334C(new C2334C.a[0]);
        while (j10.a() >= 8) {
            int g10 = j10.g();
            int v10 = j10.v();
            int v11 = j10.v();
            if (v11 == 1835365473) {
                j10.b0(g10);
                c2334c = c2334c.b(J(j10, g10 + v10));
            } else if (v11 == 1936553057) {
                j10.b0(g10);
                c2334c = c2334c.b(r.b(j10, g10 + v10));
            } else if (v11 == -1451722374) {
                c2334c = c2334c.b(M(j10));
            }
            j10.b0(g10 + v10);
        }
        return c2334c;
    }

    public static C2334C J(J j10, int i10) {
        j10.c0(8);
        g(j10);
        while (j10.g() < i10) {
            int g10 = j10.g();
            int v10 = j10.v();
            if (j10.v() == 1768715124) {
                j10.b0(g10);
                return s(j10, g10 + v10);
            }
            j10.b0(g10 + v10);
        }
        return null;
    }

    public static l K(J j10, int i10, int i11) {
        j10.b0(i10 + 8);
        int g10 = j10.g();
        d dVar = null;
        while (g10 - i10 < i11) {
            j10.b0(g10);
            int v10 = j10.v();
            AbstractC1185s.a(v10 > 0, "childAtomSize must be positive");
            if (j10.v() == 1702454643) {
                dVar = C(j10, g10, v10);
            }
            g10 += v10;
        }
        if (dVar == null) {
            return null;
        }
        return new l(dVar);
    }

    public static void L(J j10, int i10, int i11, int i12, int i13, String str, int i14, DrmInitData drmInitData, h hVar, int i15) {
        int i16;
        String str2;
        int i17;
        int i18;
        DrmInitData drmInitData2;
        int i19;
        int i20;
        int i21;
        int i22;
        AbstractC4230h.k kVar;
        int i23;
        int i24;
        int i25;
        int i26 = i11;
        int i27 = i12;
        DrmInitData drmInitData3 = drmInitData;
        h hVar2 = hVar;
        j10.b0(i26 + 16);
        j10.c0(16);
        int U10 = j10.U();
        int U11 = j10.U();
        j10.c0(50);
        int g10 = j10.g();
        int i28 = i10;
        if (i28 == 1701733238) {
            Pair z10 = z(j10, i26, i27);
            if (z10 != null) {
                i28 = ((Integer) z10.first).intValue();
                drmInitData3 = drmInitData3 == null ? null : drmInitData3.e(((u) z10.second).f24958b);
                hVar2.trackEncryptionBoxes[i15] = (u) z10.second;
            }
            j10.b0(g10);
        }
        String str3 = "video/3gpp";
        String str4 = i28 == 1831958048 ? "video/mpeg" : i28 == 1211250227 ? "video/3gpp" : null;
        float f10 = 1.0f;
        int i29 = 8;
        int i30 = 8;
        ByteBuffer byteBuffer = null;
        List list = null;
        String str5 = null;
        byte[] bArr = null;
        int i31 = -1;
        int i32 = -1;
        int i33 = -1;
        int i34 = -1;
        int i35 = -1;
        int i36 = -1;
        int i37 = -1;
        int i38 = -1;
        a aVar = null;
        c cVar = null;
        AbstractC4230h.k kVar2 = null;
        boolean z11 = false;
        while (g10 - i26 < i27) {
            j10.b0(g10);
            int g11 = j10.g();
            int v10 = j10.v();
            if (v10 == 0 && j10.g() - i11 == i27) {
                break;
            }
            AbstractC1185s.a(v10 > 0, "childAtomSize must be positive");
            int v11 = j10.v();
            if (v11 == 1635148611) {
                AbstractC1185s.a(str4 == null, null);
                j10.b0(g11 + 8);
                C1171d b10 = C1171d.b(j10);
                List list2 = b10.f4399a;
                hVar2.f24815b = b10.f4400b;
                if (!z11) {
                    f10 = b10.f4409k;
                }
                String str6 = b10.f4410l;
                int i39 = b10.f4408j;
                int i40 = b10.f4405g;
                int i41 = b10.f4406h;
                list = list2;
                int i42 = b10.f4407i;
                int i43 = b10.f4403e;
                AbstractC4230h.k kVar3 = kVar2;
                drmInitData2 = drmInitData3;
                kVar = kVar3;
                i21 = b10.f4404f;
                i16 = g10;
                i19 = i28;
                str2 = str3;
                i17 = i40;
                i18 = i41;
                i38 = i42;
                i29 = i43;
                str5 = str6;
                str4 = "video/avc";
                i32 = i39;
            } else {
                i16 = g10;
                if (v11 == 1752589123) {
                    AbstractC1185s.a(str4 == null, null);
                    j10.b0(g11 + 8);
                    C a10 = C.a(j10);
                    List list3 = a10.f4305a;
                    hVar2.f24815b = a10.f4306b;
                    if (!z11) {
                        f10 = a10.f4318n;
                    }
                    int i44 = a10.f4319o;
                    int i45 = a10.f4307c;
                    String str7 = a10.f4320p;
                    int i46 = a10.f4317m;
                    list = list3;
                    if (i46 != -1) {
                        i31 = i46;
                    }
                    int i47 = a10.f4310f;
                    int i48 = a10.f4311g;
                    int i49 = a10.f4314j;
                    int i50 = a10.f4315k;
                    int i51 = a10.f4316l;
                    i35 = i48;
                    i29 = a10.f4312h;
                    i21 = a10.f4313i;
                    drmInitData2 = drmInitData3;
                    i19 = i28;
                    str2 = str3;
                    i17 = i49;
                    i18 = i50;
                    i38 = i51;
                    kVar = a10.f4321q;
                    i32 = i44;
                    i33 = i45;
                    i34 = i47;
                    str4 = "video/hevc";
                    str5 = str7;
                } else {
                    str2 = str3;
                    if (v11 == 1818785347) {
                        AbstractC1185s.a("video/hevc".equals(str4), "lhvC must follow hvcC atom");
                        AbstractC4230h.k kVar4 = kVar2;
                        AbstractC1185s.a(kVar4 != null && kVar4.f46233b.size() >= 2, "must have at least two layers");
                        j10.b0(g11 + 8);
                        C c10 = C.c(j10, (AbstractC4230h.k) AbstractC4134a.e(kVar4));
                        AbstractC1185s.a(hVar2.f24815b == c10.f4306b, "nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms");
                        int i52 = c10.f4314j;
                        int i53 = i36;
                        if (i52 != -1) {
                            AbstractC1185s.a(i53 == i52, "colorSpace must be the same for both views");
                        }
                        int i54 = c10.f4315k;
                        int i55 = i37;
                        if (i54 != -1) {
                            AbstractC1185s.a(i55 == i54, "colorRange must be the same for both views");
                        }
                        int i56 = c10.f4316l;
                        if (i56 != -1) {
                            int i57 = i38;
                            i24 = i57;
                            AbstractC1185s.a(i57 == i56, "colorTransfer must be the same for both views");
                        } else {
                            i24 = i38;
                        }
                        AbstractC1185s.a(i29 == c10.f4312h, "bitdepthLuma must be the same for both views");
                        AbstractC1185s.a(i30 == c10.f4313i, "bitdepthChroma must be the same for both views");
                        List list4 = list;
                        if (list4 != null) {
                            list4 = AbstractC3445z.k().k(list4).k(c10.f4305a).m();
                            i25 = i53;
                        } else {
                            i25 = i53;
                            AbstractC1185s.a(false, "initializationData must be already set from hvcC atom");
                        }
                        str4 = "video/mv-hevc";
                        drmInitData2 = drmInitData3;
                        i19 = i28;
                        i18 = i55;
                        i21 = i30;
                        i17 = i25;
                        i38 = i24;
                        str5 = c10.f4320p;
                        kVar = kVar4;
                        list = list4;
                    } else {
                        List list5 = list;
                        i17 = i36;
                        i18 = i37;
                        int i58 = i38;
                        AbstractC4230h.k kVar5 = kVar2;
                        if (v11 == 1986361461) {
                            l K10 = K(j10, g11, v10);
                            if (K10 != null && K10.f24831a != null) {
                                if (kVar5 == null || kVar5.f46233b.size() < 2) {
                                    i23 = i31;
                                    if (i23 == -1) {
                                        i31 = K10.f24831a.f24807a.f24813c ? 5 : 4;
                                        drmInitData2 = drmInitData3;
                                        list = list5;
                                        i19 = i28;
                                        i21 = i30;
                                        i38 = i58;
                                        kVar = kVar5;
                                    }
                                    i31 = i23;
                                    drmInitData2 = drmInitData3;
                                    list = list5;
                                    i19 = i28;
                                    i21 = i30;
                                    i38 = i58;
                                    kVar = kVar5;
                                } else {
                                    AbstractC1185s.a(K10.b(), "both eye views must be marked as available");
                                    AbstractC1185s.a(!K10.f24831a.f24807a.f24813c, "for MV-HEVC, eye_views_reversed must be set to false");
                                }
                            }
                            i23 = i31;
                            i31 = i23;
                            drmInitData2 = drmInitData3;
                            list = list5;
                            i19 = i28;
                            i21 = i30;
                            i38 = i58;
                            kVar = kVar5;
                        } else {
                            int i59 = i31;
                            if (v11 == 1685480259 || v11 == 1685485123 || v11 == 1685485379) {
                                drmInitData2 = drmInitData3;
                                i19 = i28;
                                i20 = i59;
                                i21 = i30;
                                float f11 = f10;
                                int i60 = i29;
                                i22 = i58;
                                int i61 = v10 - 8;
                                byte[] bArr2 = new byte[i61];
                                j10.q(bArr2, 0, i61);
                                if (list5 != null) {
                                    list = AbstractC3445z.k().k(list5).a(bArr2).m();
                                } else {
                                    AbstractC1185s.a(false, "initializationData must already be set from hvcC or avcC atom");
                                    list = list5;
                                }
                                j10.b0(g11 + 8);
                                C4223a a11 = C4223a.a(j10);
                                if (a11 != null) {
                                    str4 = "video/dolby-vision";
                                    str5 = a11.f46170c;
                                }
                                i17 = i17;
                                i29 = i60;
                                f10 = f11;
                            } else if (v11 == 1987076931) {
                                AbstractC1185s.a(str4 == null, null);
                                String str8 = i28 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                j10.b0(g11 + 12);
                                byte M10 = (byte) j10.M();
                                byte M11 = (byte) j10.M();
                                int M12 = j10.M();
                                i29 = M12 >> 4;
                                i19 = i28;
                                byte b11 = (byte) ((M12 >> 1) & 7);
                                if (str8.equals("video/x-vnd.on2.vp9")) {
                                    list5 = AbstractC4144k.m(M10, M11, (byte) i29, b11);
                                }
                                boolean z12 = (M12 & 1) != 0;
                                int M13 = j10.M();
                                int M14 = j10.M();
                                int j11 = C2357k.j(M13);
                                int i62 = z12 ? 1 : 2;
                                i38 = C2357k.k(M14);
                                str4 = str8;
                                drmInitData2 = drmInitData3;
                                i18 = i62;
                                kVar = kVar5;
                                i17 = j11;
                                list = list5;
                                i31 = i59;
                                i21 = i29;
                            } else {
                                i19 = i28;
                                if (v11 == 1635135811) {
                                    int i63 = v10 - 8;
                                    byte[] bArr3 = new byte[i63];
                                    j10.q(bArr3, 0, i63);
                                    list = AbstractC3445z.u(bArr3);
                                    j10.b0(g11 + 8);
                                    C2357k j12 = j(j10);
                                    int i64 = j12.f24607d;
                                    int i65 = j12.f24608e;
                                    int i66 = j12.f24604a;
                                    int i67 = j12.f24605b;
                                    i38 = j12.f24606c;
                                    i29 = i64;
                                    drmInitData2 = drmInitData3;
                                    i21 = i65;
                                    i17 = i66;
                                    i18 = i67;
                                    str4 = "video/av01";
                                    kVar = kVar5;
                                } else if (v11 == 1668050025) {
                                    if (byteBuffer == null) {
                                        byteBuffer = a();
                                    }
                                    ByteBuffer byteBuffer2 = byteBuffer;
                                    byteBuffer2.position(21);
                                    byteBuffer2.putShort(j10.I());
                                    byteBuffer2.putShort(j10.I());
                                    byteBuffer = byteBuffer2;
                                    drmInitData2 = drmInitData3;
                                    list = list5;
                                    i21 = i30;
                                    kVar = kVar5;
                                    i38 = i58;
                                } else if (v11 == 1835295606) {
                                    if (byteBuffer == null) {
                                        byteBuffer = a();
                                    }
                                    ByteBuffer byteBuffer3 = byteBuffer;
                                    short I10 = j10.I();
                                    short I11 = j10.I();
                                    short I12 = j10.I();
                                    short I13 = j10.I();
                                    i21 = i30;
                                    short I14 = j10.I();
                                    int i68 = i29;
                                    short I15 = j10.I();
                                    drmInitData2 = drmInitData3;
                                    short I16 = j10.I();
                                    short I17 = j10.I();
                                    long O10 = j10.O();
                                    long O11 = j10.O();
                                    byteBuffer3.position(1);
                                    byteBuffer3.putShort(I14);
                                    byteBuffer3.putShort(I15);
                                    byteBuffer3.putShort(I10);
                                    byteBuffer3.putShort(I11);
                                    byteBuffer3.putShort(I12);
                                    byteBuffer3.putShort(I13);
                                    byteBuffer3.putShort(I16);
                                    byteBuffer3.putShort(I17);
                                    byteBuffer3.putShort((short) (O10 / 10000));
                                    byteBuffer3.putShort((short) (O11 / 10000));
                                    byteBuffer = byteBuffer3;
                                    list = list5;
                                    kVar = kVar5;
                                    i29 = i68;
                                    i38 = i58;
                                    i31 = i59;
                                    f10 = f10;
                                } else {
                                    drmInitData2 = drmInitData3;
                                    i20 = i59;
                                    i21 = i30;
                                    float f12 = f10;
                                    int i69 = i29;
                                    if (v11 == 1681012275) {
                                        AbstractC1185s.a(str4 == null, null);
                                        list = list5;
                                        kVar = kVar5;
                                        i29 = i69;
                                        str4 = str2;
                                    } else {
                                        if (v11 == 1702061171) {
                                            AbstractC1185s.a(str4 == null, null);
                                            cVar = n(j10, g11);
                                            String str9 = cVar.f24804a;
                                            byte[] bArr4 = cVar.initializationData;
                                            list = bArr4 != null ? AbstractC3445z.u(bArr4) : list5;
                                            str4 = str9;
                                        } else {
                                            if (v11 == 1651798644) {
                                                aVar = k(j10, g11);
                                            } else if (v11 == 1885434736) {
                                                f10 = x(j10, g11);
                                                list = list5;
                                                kVar = kVar5;
                                                i29 = i69;
                                                i38 = i58;
                                                i31 = i20;
                                                z11 = true;
                                            } else if (v11 == 1937126244) {
                                                bArr = y(j10, g11, v10);
                                            } else if (v11 == 1936995172) {
                                                int M15 = j10.M();
                                                j10.c0(3);
                                                if (M15 == 0) {
                                                    int M16 = j10.M();
                                                    if (M16 == 0) {
                                                        i20 = 0;
                                                    } else if (M16 == 1) {
                                                        i20 = 1;
                                                    } else if (M16 == 2) {
                                                        i20 = 2;
                                                    } else if (M16 == 3) {
                                                        i20 = 3;
                                                    }
                                                }
                                            } else if (v11 == 1634760259) {
                                                int i70 = v10 - 12;
                                                byte[] bArr5 = new byte[i70];
                                                j10.b0(g11 + 12);
                                                j10.q(bArr5, 0, i70);
                                                list = AbstractC3445z.u(bArr5);
                                                C2357k h10 = h(new J(bArr5));
                                                int i71 = h10.f24607d;
                                                int i72 = h10.f24608e;
                                                int i73 = h10.f24604a;
                                                int i74 = h10.f24605b;
                                                i38 = h10.f24606c;
                                                i29 = i71;
                                                i21 = i72;
                                                i17 = i73;
                                                i18 = i74;
                                                str4 = "video/apv";
                                                kVar = kVar5;
                                                i31 = i20;
                                                f10 = f12;
                                            } else {
                                                if (v11 == 1668246642) {
                                                    i22 = i58;
                                                    if (i17 == -1 && i22 == -1) {
                                                        int v12 = j10.v();
                                                        if (v12 == 1852009592 || v12 == 1852009571) {
                                                            int U12 = j10.U();
                                                            int U13 = j10.U();
                                                            j10.c0(2);
                                                            boolean z13 = v10 == 19 && (j10.M() & 128) != 0;
                                                            i17 = C2357k.j(U12);
                                                            list = list5;
                                                            i18 = z13 ? 1 : 2;
                                                            kVar = kVar5;
                                                            i29 = i69;
                                                            i31 = i20;
                                                            f10 = f12;
                                                            i38 = C2357k.k(U13);
                                                        } else {
                                                            AbstractC4156x.i("BoxParsers", "Unsupported color type: " + AbstractC4227e.a(v12));
                                                        }
                                                    }
                                                } else {
                                                    i22 = i58;
                                                }
                                                list = list5;
                                                i17 = i17;
                                                i29 = i69;
                                                f10 = f12;
                                            }
                                            list = list5;
                                        }
                                        kVar = kVar5;
                                        i29 = i69;
                                    }
                                    i38 = i58;
                                    i31 = i20;
                                    f10 = f12;
                                }
                                i31 = i59;
                            }
                            i38 = i22;
                            kVar = kVar5;
                            i31 = i20;
                        }
                    }
                }
            }
            g10 = i16 + v10;
            DrmInitData drmInitData4 = drmInitData2;
            kVar2 = kVar;
            drmInitData3 = drmInitData4;
            i26 = i11;
            i27 = i12;
            hVar2 = hVar;
            i30 = i21;
            i28 = i19;
            str3 = str2;
            i36 = i17;
            i37 = i18;
        }
        DrmInitData drmInitData5 = drmInitData3;
        float f13 = f10;
        List list6 = list;
        int i75 = i31;
        int i76 = i36;
        int i77 = i37;
        int i78 = i38;
        int i79 = i30;
        int i80 = i29;
        if (str4 == null) {
            return;
        }
        a.b V10 = new a.b().i0(i13).y0(str4).U(str5).F0(U10).h0(U11).b0(i34).a0(i35).u0(f13).x0(i14).v0(bArr).B0(i75).k0(list6).p0(i32).q0(i33).c0(drmInitData5).n0(str).V(new C2357k.b().d(i76).c(i77).e(i78).f(byteBuffer != null ? byteBuffer.array() : null).g(i80).b(i79).a());
        if (aVar != null) {
            V10.S(com.google.common.primitives.f.n(aVar.f24793a)).t0(com.google.common.primitives.f.n(aVar.f24794b));
        } else if (cVar != null) {
            V10.S(com.google.common.primitives.f.n(cVar.f24805b)).t0(com.google.common.primitives.f.n(cVar.f24806c));
        }
        hVar.f24814a = V10.P();
    }

    public static C2334C M(J j10) {
        short I10 = j10.I();
        j10.c0(2);
        String J10 = j10.J(I10);
        int max = Math.max(J10.lastIndexOf(43), J10.lastIndexOf(45));
        try {
            return new C2334C(new C4228f(Float.parseFloat(J10.substring(0, max)), Float.parseFloat(J10.substring(max, J10.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    public static int N(int i10) {
        int i11 = (i10 >> 16) & 255;
        int i12 = ((i10 >> 8) & 255) - 128;
        int i13 = (i10 & 255) - 128;
        return Z.o(i11 + ((i13 * 17790) / 10000), 0, 255) | (Z.o(((i12 * RtcEngineEvent.EvtType.EVT_PERMISSION_GRANTED) / 10000) + i11, 0, 255) << 16) | (Z.o((i11 - ((i13 * 3455) / 10000)) - ((i12 * 7169) / 10000), 0, 255) << 8);
    }

    public static ByteBuffer a() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    public static boolean b(long[] jArr, long j10, long j11, long j12) {
        int length = jArr.length - 1;
        return jArr[0] <= j11 && j11 < jArr[Z.o(4, 0, length)] && jArr[Z.o(jArr.length - 4, 0, length)] < j12 && j12 <= j10;
    }

    public static int c(J j10, int i10, int i11, int i12) {
        int g10 = j10.g();
        AbstractC1185s.a(g10 >= i11, null);
        while (g10 - i11 < i12) {
            j10.b0(g10);
            int v10 = j10.v();
            AbstractC1185s.a(v10 > 0, "childAtomSize must be positive");
            if (j10.v() == i10) {
                return g10;
            }
            g10 += v10;
        }
        return -1;
    }

    public static String d(byte[] bArr, int i10, int i11) {
        AbstractC4134a.g(bArr.length == 64);
        ArrayList arrayList = new ArrayList(16);
        for (int i12 = 0; i12 < bArr.length - 3; i12 += 4) {
            arrayList.add(String.format("%06x", Integer.valueOf(N(com.google.common.primitives.f.i(bArr[i12], bArr[i12 + 1], bArr[i12 + 2], bArr[i12 + 3])))));
        }
        return "size: " + i10 + C5444x.f55808b + i11 + "\npalette: " + Ra.g.g(", ").d(arrayList) + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE;
    }

    public static String e(int i10) {
        char[] cArr = {(char) (((i10 >> 10) & 31) + 96), (char) (((i10 >> 5) & 31) + 96), (char) ((i10 & 31) + 96)};
        for (int i11 = 0; i11 < 3; i11++) {
            char c10 = cArr[i11];
            if (c10 < 'a' || c10 > 'z') {
                return null;
            }
        }
        return new String(cArr);
    }

    public static int f(int i10) {
        if (i10 == 1936684398) {
            return 1;
        }
        if (i10 == 1986618469) {
            return 2;
        }
        if (i10 == 1952807028 || i10 == 1935832172 || i10 == 1937072756 || i10 == 1668047728 || i10 == 1937072752) {
            return 3;
        }
        return i10 == 1835365473 ? 5 : -1;
    }

    public static void g(J j10) {
        int g10 = j10.g();
        j10.c0(4);
        if (j10.v() != 1751411826) {
            g10 += 4;
        }
        j10.b0(g10);
    }

    public static C2357k h(J j10) {
        C2357k.b bVar = new C2357k.b();
        I i10 = new I(j10.f());
        i10.p(j10.g() * 8);
        i10.s(1);
        int h10 = i10.h(8);
        for (int i11 = 0; i11 < h10; i11++) {
            i10.s(1);
            int h11 = i10.h(8);
            for (int i12 = 0; i12 < h11; i12++) {
                i10.r(6);
                boolean g10 = i10.g();
                i10.q();
                i10.s(11);
                i10.r(4);
                int h12 = i10.h(4) + 8;
                bVar.g(h12);
                bVar.b(h12);
                i10.s(1);
                if (g10) {
                    int h13 = i10.h(8);
                    int h14 = i10.h(8);
                    i10.s(1);
                    bVar.d(C2357k.j(h13)).c(i10.g() ? 1 : 2).e(C2357k.k(h14));
                }
            }
        }
        return bVar.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:158:0x04a7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:167:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void i(J j10, int i10, int i11, int i12, int i13, String str, boolean z10, DrmInitData drmInitData, h hVar, int i14) {
        int i15;
        int U10;
        int N10;
        int v10;
        int i16;
        int i17;
        String str2;
        int i18;
        String str3;
        String str4;
        String str5;
        String str6;
        int i19;
        int i20;
        int i21 = i10;
        int i22 = i12;
        DrmInitData drmInitData2 = drmInitData;
        j10.b0(i11 + 16);
        if (z10) {
            i15 = j10.U();
            j10.c0(6);
        } else {
            j10.c0(8);
            i15 = 0;
        }
        if (i15 == 0 || i15 == 1) {
            U10 = j10.U();
            j10.c0(6);
            N10 = j10.N();
            j10.b0(j10.g() - 4);
            v10 = j10.v();
            i16 = 2;
            if (i15 == 1) {
                j10.c0(16);
            }
            i17 = -1;
        } else {
            if (i15 != 2) {
                return;
            }
            j10.c0(16);
            N10 = (int) Math.round(j10.t());
            int Q10 = j10.Q();
            j10.c0(4);
            int Q11 = j10.Q();
            int Q12 = j10.Q();
            boolean z11 = (Q12 & 1) != 0;
            boolean z12 = (Q12 & 2) != 0;
            if (z11) {
                if (Q11 == 32) {
                    i17 = 4;
                    j10.c0(8);
                    U10 = Q10;
                    i16 = 2;
                    v10 = 0;
                }
                i17 = -1;
                j10.c0(8);
                U10 = Q10;
                i16 = 2;
                v10 = 0;
            } else {
                if (Q11 == 8) {
                    i17 = 3;
                } else if (Q11 == 16) {
                    i17 = z12 ? 268435456 : 2;
                } else if (Q11 == 24) {
                    i17 = z12 ? 1342177280 : 21;
                } else {
                    if (Q11 == 32) {
                        i17 = z12 ? 1610612736 : 22;
                    }
                    i17 = -1;
                }
                j10.c0(8);
                U10 = Q10;
                i16 = 2;
                v10 = 0;
            }
        }
        if (i21 == 1767992678) {
            N10 = -1;
            U10 = -1;
        } else {
            if (i21 == 1935764850) {
                N10 = AudioFormat.AUDIO_SAMPLE_RATE_8000;
            } else if (i21 == 1935767394) {
                N10 = AudioFormat.AUDIO_SAMPLE_RATE_16000;
            }
            U10 = 1;
        }
        int g10 = j10.g();
        if (i21 == 1701733217) {
            Pair z13 = z(j10, i11, i22);
            if (z13 != null) {
                i21 = ((Integer) z13.first).intValue();
                drmInitData2 = drmInitData2 == null ? null : drmInitData2.e(((u) z13.second).f24958b);
                hVar.trackEncryptionBoxes[i14] = (u) z13.second;
            }
            j10.b0(g10);
        }
        String str7 = "audio/mhm1";
        if (i21 == 1633889587) {
            str2 = "audio/ac3";
        } else if (i21 == 1700998451) {
            str2 = "audio/eac3";
        } else if (i21 == 1633889588) {
            str2 = "audio/ac4";
        } else if (i21 == 1685353315) {
            str2 = "audio/vnd.dts";
        } else if (i21 == 1685353320 || i21 == 1685353324) {
            str2 = "audio/vnd.dts.hd";
        } else if (i21 == 1685353317) {
            str2 = "audio/vnd.dts.hd;profile=lbr";
        } else if (i21 == 1685353336) {
            str2 = "audio/vnd.dts.uhd;profile=p2";
        } else if (i21 == 1935764850) {
            str2 = "audio/3gpp";
        } else {
            if (i21 != 1935767394) {
                if (i21 != 1936684916) {
                    if (i21 == 1953984371) {
                        str3 = "audio/raw";
                        i18 = 268435456;
                    } else if (i21 == 1819304813) {
                        if (i17 != -1) {
                            i18 = i17;
                            str3 = "audio/raw";
                        }
                    } else if (i21 == 778924082 || i21 == 778924083) {
                        str2 = "audio/mpeg";
                    } else if (i21 == 1835557169) {
                        str2 = "audio/mha1";
                    } else if (i21 == 1835560241) {
                        i18 = i17;
                        str3 = "audio/mhm1";
                    } else if (i21 == 1634492771) {
                        str2 = "audio/alac";
                    } else if (i21 == 1634492791) {
                        str2 = "audio/g711-alaw";
                    } else if (i21 == 1970037111) {
                        str2 = "audio/g711-mlaw";
                    } else if (i21 == 1332770163) {
                        str2 = "audio/opus";
                    } else if (i21 == 1716281667) {
                        str2 = "audio/flac";
                    } else if (i21 == 1835823201) {
                        str2 = "audio/true-hd";
                    } else if (i21 == 1767992678) {
                        str2 = "audio/iamf";
                    } else {
                        i18 = i17;
                        str3 = null;
                    }
                    int i23 = i18;
                    List list = null;
                    String str8 = null;
                    c cVar = null;
                    a aVar = null;
                    while (g10 - i11 < i22) {
                        j10.b0(g10);
                        int v11 = j10.v();
                        String str9 = str8;
                        AbstractC1185s.a(v11 > 0, "childAtomSize must be positive");
                        int v12 = j10.v();
                        if (v12 == 1835557187) {
                            j10.b0(g10 + 8);
                            j10.c0(1);
                            int M10 = j10.M();
                            j10.c0(1);
                            String format = Objects.equals(str3, str7) ? String.format("mhm1.%02X", Integer.valueOf(M10)) : String.format("mha1.%02X", Integer.valueOf(M10));
                            int U11 = j10.U();
                            str9 = format;
                            byte[] bArr = new byte[U11];
                            str4 = str7;
                            j10.q(bArr, 0, U11);
                            list = list == null ? AbstractC3445z.u(bArr) : AbstractC3445z.v(bArr, (byte[]) list.get(0));
                        } else {
                            str4 = str7;
                            if (v12 == 1835557200) {
                                j10.b0(g10 + 8);
                                int M11 = j10.M();
                                if (M11 > 0) {
                                    byte[] bArr2 = new byte[M11];
                                    j10.q(bArr2, 0, M11);
                                    list = list == null ? AbstractC3445z.u(bArr2) : AbstractC3445z.v((byte[]) list.get(0), bArr2);
                                }
                            } else {
                                if (v12 == 1702061171 || (z10 && v12 == 2002876005)) {
                                    int c10 = v12 == 1702061171 ? g10 : c(j10, 1702061171, g10, v11);
                                    if (c10 != -1) {
                                        cVar = n(j10, c10);
                                        str3 = cVar.f24804a;
                                        byte[] bArr3 = cVar.initializationData;
                                        if (bArr3 != null) {
                                            if ("audio/vorbis".equals(str3)) {
                                                list = S.e(bArr3);
                                            } else {
                                                if ("audio/mp4a-latm".equals(str3)) {
                                                    AbstractC1168a.b f10 = AbstractC1168a.f(bArr3);
                                                    N10 = f10.f4377a;
                                                    U10 = f10.f4378b;
                                                    str5 = f10.f4379c;
                                                } else {
                                                    str5 = str9;
                                                }
                                                AbstractC3445z u10 = AbstractC3445z.u(bArr3);
                                                str6 = str5;
                                                list = u10;
                                            }
                                        }
                                    }
                                    str6 = str9;
                                } else if (v12 == 1651798644) {
                                    aVar = k(j10, g10);
                                } else {
                                    if (v12 == 1684103987) {
                                        j10.b0(g10 + 8);
                                        hVar.f24814a = AbstractC1169b.d(j10, Integer.toString(i13), str, drmInitData2);
                                    } else if (v12 == 1684366131) {
                                        j10.b0(g10 + 8);
                                        hVar.f24814a = AbstractC1169b.h(j10, Integer.toString(i13), str, drmInitData2);
                                    } else if (v12 == 1684103988) {
                                        j10.b0(g10 + 8);
                                        hVar.f24814a = AbstractC1170c.e(j10, Integer.toString(i13), str, drmInitData2);
                                    } else if (v12 == 1684892784) {
                                        if (v10 <= 0) {
                                            throw C2338G.a("Invalid sample rate for Dolby TrueHD MLP stream: " + v10, null);
                                        }
                                        str6 = str9;
                                        N10 = v10;
                                        U10 = i16;
                                    } else if (v12 == 1684305011 || v12 == 1969517683) {
                                        hVar.f24814a = new a.b().i0(i13).y0(str3).T(U10).z0(N10).c0(drmInitData2).n0(str).P();
                                        str6 = str9;
                                    } else if (v12 == 1682927731) {
                                        int i24 = v11 - 8;
                                        byte[] bArr4 = opusMagic;
                                        byte[] copyOf = Arrays.copyOf(bArr4, bArr4.length + i24);
                                        j10.b0(g10 + 8);
                                        j10.q(copyOf, bArr4.length, i24);
                                        list = H.a(copyOf);
                                    } else if (v12 == 1684425825) {
                                        byte[] bArr5 = new byte[v11 - 8];
                                        bArr5[0] = 102;
                                        bArr5[1] = 76;
                                        bArr5[i16] = 97;
                                        bArr5[3] = 67;
                                        j10.b0(g10 + 12);
                                        j10.q(bArr5, 4, v11 - 12);
                                        list = AbstractC3445z.u(bArr5);
                                    } else {
                                        if (v12 == 1634492771) {
                                            int i25 = v11 - 12;
                                            byte[] bArr6 = new byte[i25];
                                            j10.b0(g10 + 12);
                                            j10.q(bArr6, 0, i25);
                                            Pair F10 = AbstractC4144k.F(bArr6);
                                            N10 = ((Integer) F10.first).intValue();
                                            U10 = ((Integer) F10.second).intValue();
                                            list = AbstractC3445z.u(bArr6);
                                        } else if (v12 == 1767990114) {
                                            j10.b0(g10 + 9);
                                            int R10 = j10.R();
                                            byte[] bArr7 = new byte[R10];
                                            j10.q(bArr7, 0, R10);
                                            String k10 = AbstractC4144k.k(bArr7);
                                            AbstractC3445z u11 = AbstractC3445z.u(bArr7);
                                            str6 = k10;
                                            list = u11;
                                        } else if (v12 == 1885564227) {
                                            j10.b0(g10 + 12);
                                            ByteOrder byteOrder = (j10.M() & 1) != 0 ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
                                            int M12 = j10.M();
                                            if (i21 == 1768973165) {
                                                i19 = Z.o0(M12, byteOrder);
                                                i20 = -1;
                                            } else {
                                                if (i21 == 1718641517 && M12 == 32 && byteOrder.equals(ByteOrder.LITTLE_ENDIAN)) {
                                                    i19 = 4;
                                                    i20 = -1;
                                                }
                                                i19 = i23;
                                                i20 = -1;
                                            }
                                            i23 = i19;
                                            if (i19 != i20) {
                                                str3 = "audio/raw";
                                            }
                                        }
                                        str6 = str9;
                                    }
                                    str6 = str9;
                                }
                                g10 += v11;
                                str7 = str4;
                                str8 = str6;
                                i22 = i12;
                            }
                        }
                        str6 = str9;
                        g10 += v11;
                        str7 = str4;
                        str8 = str6;
                        i22 = i12;
                    }
                    String str10 = str8;
                    if (hVar.f24814a != null || str3 == null) {
                        return;
                    }
                    a.b n02 = new a.b().i0(i13).y0(str3).U(str10).T(U10).z0(N10).s0(i23).k0(list).c0(drmInitData2).n0(str);
                    if (cVar != null) {
                        n02.S(com.google.common.primitives.f.n(cVar.f24805b)).t0(com.google.common.primitives.f.n(cVar.f24806c));
                    } else if (aVar != null) {
                        n02.S(com.google.common.primitives.f.n(aVar.f24793a)).t0(com.google.common.primitives.f.n(aVar.f24794b));
                    }
                    hVar.f24814a = n02.P();
                    return;
                }
                i18 = i16;
                str3 = "audio/raw";
                int i232 = i18;
                List list2 = null;
                String str82 = null;
                c cVar2 = null;
                a aVar2 = null;
                while (g10 - i11 < i22) {
                }
                String str102 = str82;
                if (hVar.f24814a != null) {
                    return;
                } else {
                    return;
                }
            }
            str2 = "audio/amr-wb";
        }
        String str11 = str2;
        i18 = i17;
        str3 = str11;
        int i2322 = i18;
        List list22 = null;
        String str822 = null;
        c cVar22 = null;
        a aVar22 = null;
        while (g10 - i11 < i22) {
        }
        String str1022 = str822;
        if (hVar.f24814a != null) {
        }
    }

    public static C2357k j(J j10) {
        C2357k.b bVar = new C2357k.b();
        I i10 = new I(j10.f());
        i10.p(j10.g() * 8);
        i10.s(1);
        int h10 = i10.h(3);
        i10.r(6);
        boolean g10 = i10.g();
        boolean g11 = i10.g();
        if (h10 == 2 && g10) {
            bVar.g(g11 ? 12 : 10);
            bVar.b(g11 ? 12 : 10);
        } else if (h10 <= 2) {
            bVar.g(g10 ? 10 : 8);
            bVar.b(g10 ? 10 : 8);
        }
        i10.r(13);
        i10.q();
        int h11 = i10.h(4);
        if (h11 != 1) {
            AbstractC4156x.g("BoxParsers", "Unsupported obu_type: " + h11);
            return bVar.a();
        }
        if (i10.g()) {
            AbstractC4156x.g("BoxParsers", "Unsupported obu_extension_flag");
            return bVar.a();
        }
        boolean g12 = i10.g();
        i10.q();
        if (g12 && i10.h(8) > 127) {
            AbstractC4156x.g("BoxParsers", "Excessive obu_size");
            return bVar.a();
        }
        int h12 = i10.h(3);
        i10.q();
        if (i10.g()) {
            AbstractC4156x.g("BoxParsers", "Unsupported reduced_still_picture_header");
            return bVar.a();
        }
        if (i10.g()) {
            AbstractC4156x.g("BoxParsers", "Unsupported timing_info_present_flag");
            return bVar.a();
        }
        if (i10.g()) {
            AbstractC4156x.g("BoxParsers", "Unsupported initial_display_delay_present_flag");
            return bVar.a();
        }
        int h13 = i10.h(5);
        boolean z10 = false;
        for (int i11 = 0; i11 <= h13; i11++) {
            i10.r(12);
            if (i10.h(5) > 7) {
                i10.q();
            }
        }
        int h14 = i10.h(4);
        int h15 = i10.h(4);
        i10.r(h14 + 1);
        i10.r(h15 + 1);
        if (i10.g()) {
            i10.r(7);
        }
        i10.r(7);
        boolean g13 = i10.g();
        if (g13) {
            i10.r(2);
        }
        if ((i10.g() ? 2 : i10.h(1)) > 0 && !i10.g()) {
            i10.r(1);
        }
        if (g13) {
            i10.r(3);
        }
        i10.r(3);
        boolean g14 = i10.g();
        if (h12 == 2 && g14) {
            i10.q();
        }
        if (h12 != 1 && i10.g()) {
            z10 = true;
        }
        if (i10.g()) {
            int h16 = i10.h(8);
            int h17 = i10.h(8);
            bVar.d(C2357k.j(h16)).c(((z10 || h16 != 1 || h17 != 13 || i10.h(8) != 0) ? i10.h(1) : 1) != 1 ? 2 : 1).e(C2357k.k(h17));
        }
        return bVar.a();
    }

    public static a k(J j10, int i10) {
        j10.b0(i10 + 8);
        j10.c0(4);
        return new a(j10.O(), j10.O());
    }

    public static Pair l(J j10, int i10, int i11) {
        int i12 = i10 + 8;
        int i13 = -1;
        int i14 = 0;
        String str = null;
        Integer num = null;
        while (i12 - i10 < i11) {
            j10.b0(i12);
            int v10 = j10.v();
            int v11 = j10.v();
            if (v11 == 1718775137) {
                num = Integer.valueOf(j10.v());
            } else if (v11 == 1935894637) {
                j10.c0(4);
                str = j10.J(4);
            } else if (v11 == 1935894633) {
                i13 = i12;
                i14 = v10;
            }
            i12 += v10;
        }
        if (!"cenc".equals(str) && !"cbc1".equals(str) && !"cens".equals(str) && !"cbcs".equals(str)) {
            return null;
        }
        AbstractC1185s.a(num != null, "frma atom is mandatory");
        AbstractC1185s.a(i13 != -1, "schi atom is mandatory");
        u A10 = A(j10, i13, i14, str);
        AbstractC1185s.a(A10 != null, "tenc atom is mandatory");
        return Pair.create(num, (u) Z.i(A10));
    }

    public static Pair m(AbstractC4227e.b bVar) {
        AbstractC4227e.c e10 = bVar.e(1701606260);
        if (e10 == null) {
            return null;
        }
        J j10 = e10.f46179b;
        j10.b0(8);
        int q10 = q(j10.v());
        int Q10 = j10.Q();
        long[] jArr = new long[Q10];
        long[] jArr2 = new long[Q10];
        for (int i10 = 0; i10 < Q10; i10++) {
            jArr[i10] = q10 == 1 ? j10.T() : j10.O();
            jArr2[i10] = q10 == 1 ? j10.F() : j10.v();
            if (j10.I() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            j10.c0(2);
        }
        return Pair.create(jArr, jArr2);
    }

    public static c n(J j10, int i10) {
        j10.b0(i10 + 12);
        j10.c0(1);
        o(j10);
        j10.c0(2);
        int M10 = j10.M();
        if ((M10 & 128) != 0) {
            j10.c0(2);
        }
        if ((M10 & 64) != 0) {
            j10.c0(j10.M());
        }
        if ((M10 & 32) != 0) {
            j10.c0(2);
        }
        j10.c0(1);
        o(j10);
        String h10 = AbstractC2335D.h(j10.M());
        if ("audio/mpeg".equals(h10) || "audio/vnd.dts".equals(h10) || "audio/vnd.dts.hd".equals(h10)) {
            return new c(h10, null, -1L, -1L);
        }
        j10.c0(4);
        long O10 = j10.O();
        long O11 = j10.O();
        j10.c0(1);
        int o10 = o(j10);
        long j11 = O11;
        byte[] bArr = new byte[o10];
        j10.q(bArr, 0, o10);
        if (j11 <= 0) {
            j11 = -1;
        }
        return new c(h10, bArr, j11, O10 > 0 ? O10 : -1L);
    }

    public static int o(J j10) {
        int M10 = j10.M();
        int i10 = M10 & 127;
        while ((M10 & 128) == 128) {
            M10 = j10.M();
            i10 = (i10 << 7) | (M10 & 127);
        }
        return i10;
    }

    public static int p(int i10) {
        return i10 & 16777215;
    }

    public static int q(int i10) {
        return (i10 >> 24) & 255;
    }

    public static int r(J j10) {
        j10.b0(16);
        return j10.v();
    }

    public static C2334C s(J j10, int i10) {
        j10.c0(8);
        ArrayList arrayList = new ArrayList();
        while (j10.g() < i10) {
            C2334C.a d10 = AbstractC2380j.d(j10);
            if (d10 != null) {
                arrayList.add(d10);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C2334C(arrayList);
    }

    public static e t(J j10) {
        long j11;
        j10.b0(8);
        int q10 = q(j10.v());
        j10.c0(q10 == 0 ? 8 : 16);
        long O10 = j10.O();
        int g10 = j10.g();
        int i10 = q10 == 0 ? 4 : 8;
        int i11 = 0;
        while (true) {
            j11 = -9223372036854775807L;
            if (i11 >= i10) {
                j10.c0(i10);
                break;
            }
            if (j10.f()[g10 + i11] != -1) {
                long O11 = q10 == 0 ? j10.O() : j10.T();
                if (O11 != 0) {
                    long p12 = Z.p1(O11, 1000000L, O10);
                    O10 = O10;
                    j11 = p12;
                }
            } else {
                i11++;
            }
        }
        return new e(O10, j11, e(j10.U()));
    }

    public static C2334C u(AbstractC4227e.b bVar) {
        AbstractC4227e.c e10 = bVar.e(1751411826);
        AbstractC4227e.c e11 = bVar.e(1801812339);
        AbstractC4227e.c e12 = bVar.e(1768715124);
        if (e10 == null || e11 == null || e12 == null || r(e10.f46179b) != 1835299937) {
            return null;
        }
        J j10 = e11.f46179b;
        j10.b0(12);
        int v10 = j10.v();
        String[] strArr = new String[v10];
        for (int i10 = 0; i10 < v10; i10++) {
            int v11 = j10.v();
            j10.c0(4);
            strArr[i10] = j10.J(v11 - 8);
        }
        J j11 = e12.f46179b;
        j11.b0(8);
        ArrayList arrayList = new ArrayList();
        while (j11.a() > 8) {
            int g10 = j11.g();
            int v12 = j11.v();
            int v13 = j11.v() - 1;
            if (v13 < 0 || v13 >= v10) {
                AbstractC4156x.i("BoxParsers", "Skipped metadata with unknown key index: " + v13);
            } else {
                C4225c i11 = AbstractC2380j.i(j11, g10 + v12, strArr[v13]);
                if (i11 != null) {
                    arrayList.add(i11);
                }
            }
            j11.b0(g10 + v12);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C2334C(arrayList);
    }

    public static void v(J j10, int i10, int i11, int i12, h hVar) {
        j10.b0(i11 + 16);
        if (i10 == 1835365492) {
            j10.G();
            String G10 = j10.G();
            if (G10 != null) {
                hVar.f24814a = new a.b().i0(i12).y0(G10).P();
            }
        }
    }

    public static C4229g w(J j10) {
        long F10;
        long F11;
        j10.b0(8);
        if (q(j10.v()) == 0) {
            F10 = j10.O();
            F11 = j10.O();
        } else {
            F10 = j10.F();
            F11 = j10.F();
        }
        return new C4229g(F10, F11, j10.O());
    }

    public static float x(J j10, int i10) {
        j10.b0(i10 + 8);
        return j10.Q() / j10.Q();
    }

    public static byte[] y(J j10, int i10, int i11) {
        int i12 = i10 + 8;
        while (i12 - i10 < i11) {
            j10.b0(i12);
            int v10 = j10.v();
            if (j10.v() == 1886547818) {
                return Arrays.copyOfRange(j10.f(), i12, v10 + i12);
            }
            i12 += v10;
        }
        return null;
    }

    public static Pair z(J j10, int i10, int i11) {
        Pair l10;
        int g10 = j10.g();
        while (g10 - i10 < i11) {
            j10.b0(g10);
            int v10 = j10.v();
            AbstractC1185s.a(v10 > 0, "childAtomSize must be positive");
            if (j10.v() == 1936289382 && (l10 = l(j10, g10, v10)) != null) {
                return l10;
            }
            g10 += v10;
        }
        return null;
    }
}
