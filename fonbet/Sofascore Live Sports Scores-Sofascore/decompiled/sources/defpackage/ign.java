package defpackage;

import com.google.android.gms.internal.ads.s;
import com.google.android.gms.internal.ads.zzagh;
import com.google.android.gms.internal.ads.zzagi;
import com.google.android.gms.internal.ads.zzagk;
import com.google.android.gms.internal.ads.zzahh;
import com.google.android.gms.internal.ads.zzahj;
import com.google.android.gms.internal.ads.zzahp;
import com.google.android.gms.internal.ads.zzahr;
import com.google.android.gms.internal.ads.zzaht;
import com.google.android.gms.internal.ads.zzajc;
import com.google.android.gms.internal.ads.zzaji;
import com.google.android.gms.internal.ads.zzamp;
import com.google.android.gms.internal.ads.zzanx;
import com.google.android.gms.internal.ads.zzap;
import com.google.android.gms.internal.ads.zzat;
import com.google.android.gms.internal.ads.zzeh;
import com.google.android.gms.internal.ads.zzeu;
import com.google.android.gms.internal.ads.zzfv;
import com.google.android.gms.internal.ads.zzgxm;
import com.google.android.gms.internal.ads.zzt;
import com.google.android.gms.internal.ads.zzv;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.StringReader;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ign implements zzagh {
    public zzagk b;
    public int c;
    public int d;
    public int e;
    public zzaji g;
    public zzagi h;
    public zzahp i;
    public zzamp j;
    public final zzeu a = new zzeu(2);
    public long f = -1;

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void a(long j, long j2) {
        if (j == 0) {
            this.c = 0;
            this.j = null;
        } else if (this.c == 5) {
            zzamp zzampVar = this.j;
            zzampVar.getClass();
            zzampVar.a(j, j2);
        }
    }

    public final void b() {
        zzagk zzagkVar = this.b;
        zzagkVar.getClass();
        zzagkVar.zzv();
        this.b.c(new zzahj(C.TIME_UNSET, 0L));
        this.c = 6;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final boolean c(zzagi zzagiVar) {
        String m;
        zzeu zzeuVar = this.a;
        zzeuVar.y(2);
        zzagiVar.h(0, 2, zzeuVar.a);
        if (zzeuVar.J() == 65496) {
            while (true) {
                zzeuVar.y(2);
                zzagiVar.h(0, 2, zzeuVar.a);
                int J = zzeuVar.J();
                this.d = J;
                if (J == 65498) {
                    break;
                }
                zzeuVar.y(2);
                zzagiVar.h(0, 2, zzeuVar.a);
                int J2 = zzeuVar.J() - 2;
                if (J2 < 0) {
                    break;
                }
                if (this.d != 65505) {
                    zzagiVar.d(J2);
                } else {
                    zzeuVar.y(J2);
                    zzagiVar.h(0, J2, zzeuVar.a);
                    if (Objects.equals(zzeuVar.m(), "http://ns.adobe.com/xap/1.0/") && (m = zzeuVar.m()) != null) {
                        String[] strArr = fkf.d;
                        for (int i = 0; i < 4; i++) {
                            if (m.contains(String.valueOf(strArr[i]).concat("=\"1\""))) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void d(zzagk zzagkVar) {
        this.b = zzagkVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x0183, code lost:
    
        r16 = -9223372036854775807L;
     */
    /* JADX WARN: Removed duplicated region for block: B:150:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x020b  */
    @Override // com.google.android.gms.internal.ads.zzagh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(zzagi zzagiVar, zzahh zzahhVar) {
        String m;
        long j;
        am0 am0Var;
        s sVar;
        int i;
        int i2;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        XmlPullParser newPullParser;
        int i3 = this.c;
        zzeu zzeuVar = this.a;
        long j7 = -1;
        if (i3 == 0) {
            zzeuVar.y(2);
            zzagiVar.g(0, 2, zzeuVar.a);
            int J = zzeuVar.J();
            this.d = J;
            if (J == 65498) {
                if (this.f != -1) {
                    this.c = 4;
                    return 0;
                }
                b();
                return 0;
            }
            if ((J < 65488 || J > 65497) && J != 65281) {
                this.c = 1;
            }
            return 0;
        }
        if (i3 == 1) {
            zzeuVar.y(2);
            zzagiVar.h(0, 2, zzeuVar.a);
            this.e = zzeuVar.J() - 2;
            zzagiVar.zzf(2);
            this.c = 2;
            return 0;
        }
        if (i3 != 2) {
            if (i3 != 4) {
                if (i3 != 5) {
                    if (i3 == 6) {
                        return -1;
                    }
                    zzl.s();
                    return 0;
                }
                if (this.i == null || zzagiVar != this.h) {
                    this.h = zzagiVar;
                    this.i = new zzahp(zzagiVar, this.f);
                }
                zzamp zzampVar = this.j;
                zzampVar.getClass();
                int e = zzampVar.e(this.i, zzahhVar);
                if (e == 1) {
                    zzahhVar.a += this.f;
                }
                return e;
            }
            long zzn = zzagiVar.zzn();
            long j8 = this.f;
            if (zzn != j8) {
                zzahhVar.a = j8;
                return 1;
            }
            if (!zzagiVar.f(zzeuVar.a, 0, 1, true)) {
                b();
                return 0;
            }
            zzagiVar.zzl();
            if (this.j == null) {
                this.j = new zzamp(8, zzanx.G7);
            }
            zzahp zzahpVar = new zzahp(zzagiVar, this.f);
            this.i = zzahpVar;
            if (!this.j.c(zzahpVar)) {
                b();
                return 0;
            }
            zzamp zzampVar2 = this.j;
            long j9 = this.f;
            zzagk zzagkVar = this.b;
            zzagkVar.getClass();
            zzampVar2.d(new zzahr(j9, zzagkVar));
            zzaji zzajiVar = this.g;
            zzajiVar.getClass();
            zzagk zzagkVar2 = this.b;
            zzagkVar2.getClass();
            zzaht b = zzagkVar2.b(1024, 4);
            zzt zztVar = new zzt();
            zztVar.c("image/jpeg");
            zztVar.k = new zzap(zzajiVar);
            b.e(new zzv(zztVar));
            this.c = 5;
            return 0;
        }
        if (this.d == 65505) {
            zzeu zzeuVar2 = new zzeu(this.e);
            zzagiVar.g(0, this.e, zzeuVar2.a);
            if (this.g == null && "http://ns.adobe.com/xap/1.0/".equals(zzeuVar2.m()) && (m = zzeuVar2.m()) != null) {
                long zzo = zzagiVar.zzo();
                zzaji zzajiVar2 = null;
                if (zzo != -1) {
                    try {
                        newPullParser = XmlPullParserFactory.newInstance().newPullParser();
                        newPullParser.setInput(new StringReader(m));
                        newPullParser.next();
                        try {
                        } catch (zzat | NumberFormatException | XmlPullParserException unused) {
                            zzeh.c("Ignoring unexpected XMP metadata");
                            am0Var = null;
                            if (am0Var != null) {
                                j2 = j;
                                j3 = j2;
                                j4 = j3;
                                j5 = j4;
                                while (i2 >= 0) {
                                }
                                if (j4 != j) {
                                    zzajiVar2 = new zzaji(j2, j3, am0Var.b, j4, j5);
                                }
                            }
                            this.g = zzajiVar2;
                            if (zzajiVar2 != null) {
                            }
                            this.c = 0;
                            return 0;
                        }
                    } catch (zzat | NumberFormatException | XmlPullParserException unused2) {
                        j = j7;
                    }
                    if (!zzfv.b(newPullParser, "x:xmpmeta")) {
                        throw zzat.a(null, "Couldn't find xmp metadata");
                    }
                    mio mioVar = zzgxm.b;
                    s sVar2 = s.e;
                    long j10 = -9223372036854775807L;
                    loop0: while (true) {
                        newPullParser.next();
                        j = j7;
                        if (zzfv.b(newPullParser, "rdf:Description")) {
                            String[] strArr = fkf.d;
                            int i4 = 0;
                            while (true) {
                                if (i4 >= 4) {
                                    break loop0;
                                }
                                String c = zzfv.c(newPullParser, strArr[i4]);
                                if (c == null) {
                                    i4++;
                                } else {
                                    if (Integer.parseInt(c) != 1) {
                                        break;
                                    }
                                    String[] strArr2 = fkf.e;
                                    int i5 = 0;
                                    while (true) {
                                        if (i5 >= 4) {
                                            break;
                                        }
                                        String c2 = zzfv.c(newPullParser, strArr2[i5]);
                                        if (c2 != null) {
                                            long parseLong = Long.parseLong(c2);
                                            if (parseLong != j) {
                                                j10 = parseLong;
                                            }
                                        } else {
                                            i5++;
                                        }
                                    }
                                    String[] strArr3 = fkf.f;
                                    int i6 = 0;
                                    while (true) {
                                        if (i6 >= 2) {
                                            sVar2 = s.e;
                                            break;
                                        }
                                        String c3 = zzfv.c(newPullParser, strArr3[i6]);
                                        if (c3 != null) {
                                            sVar2 = zzgxm.u(new zzajc("image/jpeg", 0L, 0L), new zzajc(MimeTypes.VIDEO_MP4, Long.parseLong(c3), 0L));
                                            break;
                                        }
                                        i6++;
                                    }
                                }
                            }
                        } else if (zzfv.b(newPullParser, "Container:Directory")) {
                            sVar2 = fkf.Q(newPullParser, "Container", "Item");
                        } else if (zzfv.b(newPullParser, "GContainer:Directory")) {
                            sVar2 = fkf.Q(newPullParser, "GContainer", "GContainerItem");
                        }
                        long j11 = j10;
                        if (!zzfv.a(newPullParser, "x:xmpmeta")) {
                            j10 = j11;
                            j7 = j;
                        } else if (!sVar2.isEmpty()) {
                            am0Var = new am0(j11, sVar2, 12);
                        }
                    }
                    am0Var = null;
                    if (am0Var != null && (i = (sVar = (s) am0Var.c).d) >= 2) {
                        j2 = j;
                        j3 = j2;
                        j4 = j3;
                        j5 = j4;
                        for (i2 = i - 1; i2 >= 0; i2--) {
                            zzajc zzajcVar = (zzajc) sVar.get(i2);
                            String str = zzajcVar.a;
                            boolean z = str.equals(MimeTypes.VIDEO_MP4) || str.equals("video/quicktime");
                            if (i2 == 0) {
                                zzo -= zzajcVar.c;
                                j6 = 0;
                            } else {
                                j6 = zzo - zzajcVar.b;
                            }
                            long j12 = j6;
                            long j13 = zzo;
                            zzo = j12;
                            if (z && zzo != j13) {
                                j5 = j13 - zzo;
                                j4 = zzo;
                            }
                            if (i2 == 0) {
                                j3 = j13;
                            }
                            if (i2 == 0) {
                                j2 = zzo;
                            }
                        }
                        if (j4 != j && j5 != j && j2 != j && j3 != j) {
                            zzajiVar2 = new zzaji(j2, j3, am0Var.b, j4, j5);
                        }
                    }
                }
                this.g = zzajiVar2;
                if (zzajiVar2 != null) {
                    this.f = zzajiVar2.d;
                }
            }
        } else {
            zzagiVar.zzf(this.e);
        }
        this.c = 0;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzf() {
    }
}
