package defpackage;

import android.net.Uri;
import com.google.android.gms.internal.ads.zzace;
import com.google.android.gms.internal.ads.zzahh;
import com.google.android.gms.internal.ads.zzaht;
import com.google.android.gms.internal.ads.zzajo;
import com.google.android.gms.internal.ads.zzdt;
import com.google.android.gms.internal.ads.zzeh;
import com.google.android.gms.internal.ads.zzgxo;
import com.google.android.gms.internal.ads.zzhs;
import com.google.android.gms.internal.ads.zzhv;
import com.google.android.gms.internal.ads.zzhw;
import com.google.android.gms.internal.ads.zzip;
import com.google.android.gms.internal.ads.zzxd;
import com.google.android.gms.internal.ads.zzxf;
import com.google.android.gms.internal.ads.zzyh;
import com.mbridge.msdk.foundation.download.Command;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class vdp implements zzace, zzxd {
    public final Uri a;
    public final zzip b;
    public final zzyh c;
    public final kep d;
    public final zzdt e;
    public volatile boolean g;
    public long i;
    public zzhw j;
    public zzaht k;
    public boolean l;
    public final /* synthetic */ kep m;
    public final zzahh f = new zzahh();
    public boolean h = true;

    public vdp(kep kepVar, Uri uri, zzhs zzhsVar, zzyh zzyhVar, kep kepVar2, zzdt zzdtVar) {
        this.m = kepVar;
        this.a = uri;
        this.b = new zzip(zzhsVar);
        this.c = zzyhVar;
        this.d = kepVar2;
        this.e = zzdtVar;
        zzxf.a.getAndIncrement();
        this.j = b(0L, null);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(35:9|(1:150)(1:13)|14|(1:16)|17|18|(6:134|135|136|137|138|(28:140|21|(1:23)(1:133)|24|(1:26)(1:132)|27|(1:29)(1:131)|30|(1:32)(1:130)|33|(4:35|36|37|(16:39|(1:41)(1:121)|42|(1:120)(1:46)|47|(1:49)|50|(1:52)|53|(1:(3:55|56|(6:58|59|1d5|67|(5:69|1f2|74|75|76)(1:83)|77)(2:91|92))(1:119))|93|(1:95)(3:102|(1:104)|105)|96|97|99|100)(2:122|123))|129|(0)(0)|42|(1:44)|120|47|(0)|50|(0)|53|(2:(0)(0)|77)|93|(0)(0)|96|97|99|100)(2:141|142))|20|21|(0)(0)|24|(0)(0)|27|(0)(0)|30|(0)(0)|33|(0)|129|(0)(0)|42|(0)|120|47|(0)|50|(0)|53|(2:(0)(0)|77)|93|(0)(0)|96|97|99|100) */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0210 A[EDGE_INSN: B:119:0x0210->B:93:0x0210 BREAK  A[LOOP:1: B:54:0x01cd->B:77:0x01cd], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00db A[Catch: all -> 0x00bf, TryCatch #12 {all -> 0x00bf, blocks: (B:135:0x008d, B:137:0x0093, B:21:0x00d1, B:23:0x00db, B:24:0x00e7, B:26:0x00f1, B:27:0x00fd, B:29:0x0107, B:30:0x0113, B:32:0x011d, B:33:0x012f, B:35:0x0139, B:37:0x013f, B:41:0x0178, B:42:0x0181, B:44:0x018b, B:46:0x0190, B:47:0x01a9, B:49:0x01be, B:50:0x01c1, B:52:0x01c5, B:123:0x0149, B:126:0x0169, B:142:0x009f, B:145:0x00c3), top: B:134:0x008d }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f1 A[Catch: all -> 0x00bf, TryCatch #12 {all -> 0x00bf, blocks: (B:135:0x008d, B:137:0x0093, B:21:0x00d1, B:23:0x00db, B:24:0x00e7, B:26:0x00f1, B:27:0x00fd, B:29:0x0107, B:30:0x0113, B:32:0x011d, B:33:0x012f, B:35:0x0139, B:37:0x013f, B:41:0x0178, B:42:0x0181, B:44:0x018b, B:46:0x0190, B:47:0x01a9, B:49:0x01be, B:50:0x01c1, B:52:0x01c5, B:123:0x0149, B:126:0x0169, B:142:0x009f, B:145:0x00c3), top: B:134:0x008d }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0107 A[Catch: all -> 0x00bf, TryCatch #12 {all -> 0x00bf, blocks: (B:135:0x008d, B:137:0x0093, B:21:0x00d1, B:23:0x00db, B:24:0x00e7, B:26:0x00f1, B:27:0x00fd, B:29:0x0107, B:30:0x0113, B:32:0x011d, B:33:0x012f, B:35:0x0139, B:37:0x013f, B:41:0x0178, B:42:0x0181, B:44:0x018b, B:46:0x0190, B:47:0x01a9, B:49:0x01be, B:50:0x01c1, B:52:0x01c5, B:123:0x0149, B:126:0x0169, B:142:0x009f, B:145:0x00c3), top: B:134:0x008d }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x011d A[Catch: all -> 0x00bf, TryCatch #12 {all -> 0x00bf, blocks: (B:135:0x008d, B:137:0x0093, B:21:0x00d1, B:23:0x00db, B:24:0x00e7, B:26:0x00f1, B:27:0x00fd, B:29:0x0107, B:30:0x0113, B:32:0x011d, B:33:0x012f, B:35:0x0139, B:37:0x013f, B:41:0x0178, B:42:0x0181, B:44:0x018b, B:46:0x0190, B:47:0x01a9, B:49:0x01be, B:50:0x01c1, B:52:0x01c5, B:123:0x0149, B:126:0x0169, B:142:0x009f, B:145:0x00c3), top: B:134:0x008d }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0139 A[Catch: all -> 0x00bf, TRY_LEAVE, TryCatch #12 {all -> 0x00bf, blocks: (B:135:0x008d, B:137:0x0093, B:21:0x00d1, B:23:0x00db, B:24:0x00e7, B:26:0x00f1, B:27:0x00fd, B:29:0x0107, B:30:0x0113, B:32:0x011d, B:33:0x012f, B:35:0x0139, B:37:0x013f, B:41:0x0178, B:42:0x0181, B:44:0x018b, B:46:0x0190, B:47:0x01a9, B:49:0x01be, B:50:0x01c1, B:52:0x01c5, B:123:0x0149, B:126:0x0169, B:142:0x009f, B:145:0x00c3), top: B:134:0x008d }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0178 A[Catch: all -> 0x00bf, TryCatch #12 {all -> 0x00bf, blocks: (B:135:0x008d, B:137:0x0093, B:21:0x00d1, B:23:0x00db, B:24:0x00e7, B:26:0x00f1, B:27:0x00fd, B:29:0x0107, B:30:0x0113, B:32:0x011d, B:33:0x012f, B:35:0x0139, B:37:0x013f, B:41:0x0178, B:42:0x0181, B:44:0x018b, B:46:0x0190, B:47:0x01a9, B:49:0x01be, B:50:0x01c1, B:52:0x01c5, B:123:0x0149, B:126:0x0169, B:142:0x009f, B:145:0x00c3), top: B:134:0x008d }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x018b A[Catch: all -> 0x00bf, TryCatch #12 {all -> 0x00bf, blocks: (B:135:0x008d, B:137:0x0093, B:21:0x00d1, B:23:0x00db, B:24:0x00e7, B:26:0x00f1, B:27:0x00fd, B:29:0x0107, B:30:0x0113, B:32:0x011d, B:33:0x012f, B:35:0x0139, B:37:0x013f, B:41:0x0178, B:42:0x0181, B:44:0x018b, B:46:0x0190, B:47:0x01a9, B:49:0x01be, B:50:0x01c1, B:52:0x01c5, B:123:0x0149, B:126:0x0169, B:142:0x009f, B:145:0x00c3), top: B:134:0x008d }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01be A[Catch: all -> 0x00bf, TryCatch #12 {all -> 0x00bf, blocks: (B:135:0x008d, B:137:0x0093, B:21:0x00d1, B:23:0x00db, B:24:0x00e7, B:26:0x00f1, B:27:0x00fd, B:29:0x0107, B:30:0x0113, B:32:0x011d, B:33:0x012f, B:35:0x0139, B:37:0x013f, B:41:0x0178, B:42:0x0181, B:44:0x018b, B:46:0x0190, B:47:0x01a9, B:49:0x01be, B:50:0x01c1, B:52:0x01c5, B:123:0x0149, B:126:0x0169, B:142:0x009f, B:145:0x00c3), top: B:134:0x008d }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01c5 A[Catch: all -> 0x00bf, TRY_LEAVE, TryCatch #12 {all -> 0x00bf, blocks: (B:135:0x008d, B:137:0x0093, B:21:0x00d1, B:23:0x00db, B:24:0x00e7, B:26:0x00f1, B:27:0x00fd, B:29:0x0107, B:30:0x0113, B:32:0x011d, B:33:0x012f, B:35:0x0139, B:37:0x013f, B:41:0x0178, B:42:0x0181, B:44:0x018b, B:46:0x0190, B:47:0x01a9, B:49:0x01be, B:50:0x01c1, B:52:0x01c5, B:123:0x0149, B:126:0x0169, B:142:0x009f, B:145:0x00c3), top: B:134:0x008d }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01cf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0213  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        long j;
        int i;
        boolean z;
        int i2;
        List list;
        String str;
        List list2;
        String str2;
        List list3;
        String str3;
        List list4;
        boolean z2;
        List list5;
        int i3;
        zzip zzipVar;
        kep kepVar;
        zzajo zzajoVar;
        zzhs zzhsVar;
        int i4;
        int i5;
        int i6;
        int i7 = 0;
        int i8 = 0;
        String str4 = null;
        while (i8 == 0 && !this.g) {
            try {
                long j2 = this.f.a;
                zzhw b = b(j2, str4);
                this.j = b;
                zzip zzipVar2 = this.b;
                long a = zzipVar2.a(b);
                if (this.g) {
                    zzyh zzyhVar = this.c;
                    if (zzyhVar.zzd() != -1) {
                        this.f.a = zzyhVar.zzd();
                    }
                    try {
                        this.b.zzd();
                        return;
                    } catch (IOException unused) {
                        return;
                    }
                }
                List list6 = (List) zzipVar2.a.zzj().get(Command.HTTP_HEADER_ETAG);
                str4 = (list6 == null || list6.isEmpty()) ? null : (String) list6.get(0);
                if (a != -1) {
                    a += j2;
                    kep kepVar2 = this.m;
                    kepVar2.getClass();
                    kepVar2.o.post(new l8n(kepVar2, 2));
                }
                long j3 = a;
                kep kepVar3 = this.m;
                Map zzj = zzipVar2.a.zzj();
                List list7 = (List) zzj.get("icy-br");
                j = -1;
                if (list7 != null) {
                    try {
                        String str5 = (String) list7.get(0);
                        try {
                            i = Integer.parseInt(str5) * 1000;
                        } catch (NumberFormatException unused2) {
                            i = -1;
                        }
                        if (i > 0) {
                            i2 = i;
                            z = true;
                            list = (List) zzj.get("icy-genre");
                            if (list != null) {
                                str = (String) list.get(0);
                                z = true;
                            } else {
                                str = null;
                            }
                            list2 = (List) zzj.get("icy-name");
                            if (list2 != null) {
                                str2 = (String) list2.get(0);
                                z = true;
                            } else {
                                str2 = null;
                            }
                            list3 = (List) zzj.get("icy-url");
                            if (list3 != null) {
                                str3 = (String) list3.get(0);
                                z = true;
                            } else {
                                str3 = null;
                            }
                            list4 = (List) zzj.get("icy-pub");
                            if (list4 != null) {
                                z2 = ((String) list4.get(0)).equals("1");
                                z = true;
                            } else {
                                z2 = false;
                            }
                            list5 = (List) zzj.get("icy-metaint");
                            if (list5 != null) {
                                String str6 = (String) list5.get(0);
                                try {
                                    i6 = Integer.parseInt(str6);
                                } catch (NumberFormatException unused3) {
                                    i6 = -1;
                                }
                                if (i6 > 0) {
                                    i3 = i6;
                                    z = true;
                                    kepVar3.q = z ? new zzajo(i2, i3, str, str2, str3, z2) : null;
                                    zzipVar = this.b;
                                    kepVar = this.m;
                                    zzajoVar = kepVar.q;
                                    if (zzajoVar != null || (i5 = zzajoVar.f) == -1) {
                                        zzhsVar = zzipVar;
                                    } else {
                                        zzhs wbpVar = new wbp(zzipVar, i5, this);
                                        zzaht n = kepVar.n(new iep(0, true));
                                        this.k = n;
                                        n.e(kep.P);
                                        zzhsVar = wbpVar;
                                    }
                                    zzyh zzyhVar2 = this.c;
                                    zzyhVar2.c(zzhsVar, this.a, zzipVar.a.zzj(), j2, j3, this.d);
                                    if (kepVar.q != null) {
                                        zzyhVar2.zzc();
                                    }
                                    if (this.h) {
                                        zzyhVar2.a(j2, this.i);
                                        this.h = false;
                                    }
                                    i4 = 0;
                                    while (true) {
                                        if (i4 != 0) {
                                            break;
                                        }
                                        try {
                                            if (this.g) {
                                                i4 = 0;
                                                break;
                                            }
                                            try {
                                                zzdt zzdtVar = this.e;
                                                synchronized (zzdtVar) {
                                                    while (!zzdtVar.a) {
                                                        zzdtVar.wait();
                                                    }
                                                }
                                                i4 = zzyhVar2.b(this.f);
                                                long zzd = zzyhVar2.zzd();
                                                if (zzd > kepVar.h + j2) {
                                                    synchronized (zzdtVar) {
                                                        zzdtVar.a = false;
                                                    }
                                                    kepVar.o.post(kepVar.n);
                                                    j2 = zzd;
                                                }
                                            } catch (InterruptedException unused4) {
                                                throw new InterruptedIOException();
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            i7 = i4;
                                            if (i7 != 1) {
                                                zzyh zzyhVar3 = this.c;
                                                if (zzyhVar3.zzd() != j) {
                                                    this.f.a = zzyhVar3.zzd();
                                                }
                                            }
                                            try {
                                                this.b.zzd();
                                            } catch (IOException unused5) {
                                            }
                                            throw th;
                                        }
                                    }
                                    if (i4 == 1) {
                                        i8 = 0;
                                    } else {
                                        if (zzyhVar2.zzd() != -1) {
                                            this.f.a = zzyhVar2.zzd();
                                        }
                                        i8 = i4;
                                    }
                                    zzipVar.zzd();
                                } else {
                                    try {
                                        StringBuilder sb = new StringBuilder(String.valueOf(str6).length() + 27);
                                        sb.append("Invalid metadata interval: ");
                                        sb.append(str6);
                                        zzeh.c(sb.toString());
                                    } catch (NumberFormatException unused6) {
                                        zzeh.c("Invalid metadata interval: ".concat(String.valueOf(str6)));
                                        i3 = i6;
                                        kepVar3.q = z ? new zzajo(i2, i3, str, str2, str3, z2) : null;
                                        zzipVar = this.b;
                                        kepVar = this.m;
                                        zzajoVar = kepVar.q;
                                        if (zzajoVar != null) {
                                        }
                                        zzhsVar = zzipVar;
                                        zzyh zzyhVar22 = this.c;
                                        zzyhVar22.c(zzhsVar, this.a, zzipVar.a.zzj(), j2, j3, this.d);
                                        if (kepVar.q != null) {
                                        }
                                        if (this.h) {
                                        }
                                        i4 = 0;
                                        while (true) {
                                            if (i4 != 0) {
                                            }
                                        }
                                        if (i4 == 1) {
                                        }
                                        zzipVar.zzd();
                                    }
                                }
                            }
                            i3 = -1;
                            kepVar3.q = z ? new zzajo(i2, i3, str, str2, str3, z2) : null;
                            zzipVar = this.b;
                            kepVar = this.m;
                            zzajoVar = kepVar.q;
                            if (zzajoVar != null) {
                            }
                            zzhsVar = zzipVar;
                            zzyh zzyhVar222 = this.c;
                            zzyhVar222.c(zzhsVar, this.a, zzipVar.a.zzj(), j2, j3, this.d);
                            if (kepVar.q != null) {
                            }
                            if (this.h) {
                            }
                            i4 = 0;
                            while (true) {
                                if (i4 != 0) {
                                }
                            }
                            if (i4 == 1) {
                            }
                            zzipVar.zzd();
                        } else {
                            try {
                                StringBuilder sb2 = new StringBuilder(String.valueOf(str5).length() + 17);
                                sb2.append("Invalid bitrate: ");
                                sb2.append(str5);
                                zzeh.c(sb2.toString());
                            } catch (NumberFormatException unused7) {
                                zzeh.c("Invalid bitrate header: ".concat(String.valueOf(str5)));
                                z = false;
                                i2 = i;
                                list = (List) zzj.get("icy-genre");
                                if (list != null) {
                                }
                                list2 = (List) zzj.get("icy-name");
                                if (list2 != null) {
                                }
                                list3 = (List) zzj.get("icy-url");
                                if (list3 != null) {
                                }
                                list4 = (List) zzj.get("icy-pub");
                                if (list4 != null) {
                                }
                                list5 = (List) zzj.get("icy-metaint");
                                if (list5 != null) {
                                }
                                i3 = -1;
                                kepVar3.q = z ? new zzajo(i2, i3, str, str2, str3, z2) : null;
                                zzipVar = this.b;
                                kepVar = this.m;
                                zzajoVar = kepVar.q;
                                if (zzajoVar != null) {
                                }
                                zzhsVar = zzipVar;
                                zzyh zzyhVar2222 = this.c;
                                zzyhVar2222.c(zzhsVar, this.a, zzipVar.a.zzj(), j2, j3, this.d);
                                if (kepVar.q != null) {
                                }
                                if (this.h) {
                                }
                                i4 = 0;
                                while (true) {
                                    if (i4 != 0) {
                                    }
                                }
                                if (i4 == 1) {
                                }
                                zzipVar.zzd();
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (i7 != 1) {
                        }
                        this.b.zzd();
                        throw th;
                    }
                }
                z = false;
                i2 = -1;
                list = (List) zzj.get("icy-genre");
                if (list != null) {
                }
                list2 = (List) zzj.get("icy-name");
                if (list2 != null) {
                }
                list3 = (List) zzj.get("icy-url");
                if (list3 != null) {
                }
                list4 = (List) zzj.get("icy-pub");
                if (list4 != null) {
                }
                list5 = (List) zzj.get("icy-metaint");
                if (list5 != null) {
                }
                i3 = -1;
                kepVar3.q = z ? new zzajo(i2, i3, str, str2, str3, z2) : null;
                zzipVar = this.b;
                kepVar = this.m;
                zzajoVar = kepVar.q;
                if (zzajoVar != null) {
                }
                zzhsVar = zzipVar;
                zzyh zzyhVar22222 = this.c;
                zzyhVar22222.c(zzhsVar, this.a, zzipVar.a.zzj(), j2, j3, this.d);
                if (kepVar.q != null) {
                }
                if (this.h) {
                }
                i4 = 0;
                while (true) {
                    if (i4 != 0) {
                    }
                }
                if (i4 == 1) {
                }
                zzipVar.zzd();
            } catch (Throwable th3) {
                th = th3;
                j = -1;
            }
        }
    }

    public final zzhw b(long j, String str) {
        Map map = kep.O;
        if (str != null && !str.startsWith("W/")) {
            zzgxo zzgxoVar = new zzgxo();
            zzgxoVar.b(map.entrySet());
            zzgxoVar.a("If-Range", str);
            map = zzgxoVar.d(false);
        }
        zzhv zzhvVar = new zzhv();
        zzhvVar.a = this.a;
        zzhvVar.c = j;
        zzhvVar.e = 6;
        zzhvVar.b = map;
        return zzhvVar.a();
    }
}
