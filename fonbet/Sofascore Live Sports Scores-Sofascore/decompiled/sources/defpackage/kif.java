package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzbra;
import com.google.android.gms.internal.ads.zzbut;
import com.google.android.gms.internal.ads.zzcbx;
import com.google.android.gms.internal.ads.zzdim;
import com.google.android.gms.internal.ads.zzdjm;
import com.google.android.gms.internal.ads.zzeb;
import com.google.android.gms.internal.ads.zzejd;
import com.google.android.gms.internal.ads.zzejj;
import com.google.android.gms.internal.ads.zzhes;
import com.google.android.gms.internal.ads.zzhfj;
import com.google.android.gms.internal.ads.zzhfm;
import com.google.android.gms.internal.ads.zzhfr;
import com.google.android.gms.internal.ads.zzhhn;
import com.google.android.gms.internal.ads.zzhil;
import com.google.android.gms.internal.ads.zzhim;
import com.google.android.gms.internal.ads.zzhir;
import com.google.android.gms.internal.ads.zzhks;
import com.google.android.gms.internal.ads.zzhma;
import com.google.android.gms.internal.ads.zzhmw;
import com.google.android.gms.internal.ads.zzhoc;
import com.google.android.gms.internal.ads.zzhos;
import com.google.android.gms.internal.ads.zzhot;
import com.google.android.gms.internal.ads.zzhpm;
import com.google.android.gms.internal.ads.zzhqp;
import com.google.android.gms.internal.ads.zzhrp;
import com.google.android.gms.internal.ads.zzhrq;
import com.google.android.gms.internal.ads.zzhrr;
import com.google.android.gms.internal.ads.zzhrs;
import com.google.android.gms.internal.ads.zzhss;
import com.google.android.gms.internal.ads.zzhta;
import com.google.android.gms.internal.ads.zzhtc;
import com.google.android.gms.internal.ads.zzhva;
import com.google.android.gms.internal.ads.zzhvb;
import com.google.android.gms.internal.ads.zzhvd;
import com.google.android.gms.internal.ads.zzhvs;
import com.google.android.gms.internal.ads.zzhvx;
import com.google.android.gms.internal.ads.zzhvy;
import com.google.android.gms.internal.ads.zzhwa;
import com.google.android.gms.internal.ads.zzhwb;
import com.google.android.gms.internal.ads.zzhyc;
import com.google.android.gms.internal.ads.zzhyz;
import com.google.android.gms.internal.ads.zziac;
import com.google.android.gms.internal.ads.zzich;
import com.google.android.gms.internal.ads.zzici;
import com.google.android.gms.internal.ads.zzicj;
import com.google.android.gms.internal.ads.zziei;
import com.google.android.gms.internal.ads.zziew;
import com.google.android.gms.internal.ads.zzige;
import com.google.android.gms.internal.measurement.zzaef;
import com.google.android.gms.internal.measurement.zzags;
import com.google.android.gms.internal.measurement.zzahh;
import com.google.android.gms.internal.measurement.zzahi;
import com.google.android.gms.internal.measurement.zzahk;
import com.google.android.gms.internal.measurement.zzahl;
import com.google.android.gms.internal.measurement.zzahz;
import com.google.android.gms.internal.measurement.zzaia;
import com.google.android.gms.measurement.internal.zzfy;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.sofascore.model.mvvm.model.PlayerKt;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.spec.ECPoint;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.f;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class kif implements gml, sm6, xeh, f, wy2, fon, zzdjm, zzbut, fmo, zzhoc, zzhmw, zzeb, eln {
    public static kif b;
    public static final /* synthetic */ kif c = new kif(7);
    public static final /* synthetic */ kif d = new kif(8);
    public static final /* synthetic */ kif e = new kif(9);
    public static final /* synthetic */ kif f = new kif(10);
    public static final /* synthetic */ kif g = new kif(11);
    public static final /* synthetic */ kif h = new kif(12);
    public static final /* synthetic */ kif i = new kif(13);
    public static final /* synthetic */ kif j = new kif(14);
    public static final /* synthetic */ kif k = new kif(16);
    public static final /* synthetic */ kif l = new kif(17);
    public static final /* synthetic */ kif m = new kif(18);
    public static final /* synthetic */ kif n = new kif(19);
    public static final /* synthetic */ kif o = new kif(20);
    public static final /* synthetic */ kif p = new kif(21);
    public static final /* synthetic */ kif q = new kif(22);
    public static final /* synthetic */ kif r = new kif(23);
    public final /* synthetic */ int a;

    public /* synthetic */ kif(int i2) {
        this.a = i2;
    }

    public static final zzaef a(Object obj, long j2) {
        zzaef zzaefVar = (zzaef) men.h(obj, j2);
        if (zzaefVar.zza()) {
            return zzaefVar;
        }
        int size = zzaefVar.size();
        zzaef f2 = zzaefVar.f(size == 0 ? 10 : size + size);
        men.i(j2, obj, f2);
        return f2;
    }

    @Override // defpackage.sm6
    public Object c() {
        try {
            return new vog(MessageDigest.getInstance("SHA-256"));
        } catch (NoSuchAlgorithmException e2) {
            is8.h(e2);
            return null;
        }
    }

    @Override // defpackage.xeh
    public z88 d(kki kkiVar) {
        return new wf2(veh.a, 6);
    }

    @Override // defpackage.eln
    public Object e(IBinder iBinder) {
        int i2 = abo.a;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.hsdp.protocol.IHsdpService");
        return queryLocalInterface instanceof ako ? (ako) queryLocalInterface : new a7o(iBinder, "com.google.android.play.core.hsdp.protocol.IHsdpService");
    }

    @Override // defpackage.wy2
    public long getTime() {
        return System.currentTimeMillis();
    }

    /* JADX WARN: Code restructure failed: missing block: B:286:0x0668, code lost:
    
        r12 = r12 + 1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x07c2  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:474:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x00e6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:500:0x0097 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:523:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:524:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0189 A[LOOP:1: B:63:0x015a->B:70:0x0189, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0198 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x038e A[LOOP:3: B:96:0x038c->B:97:0x038e, LOOP_END] */
    @Override // defpackage.gml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public lw1 k(String str, int i2, EnumMap enumMap) {
        int i3;
        boolean equals;
        jtc jtcVar;
        byte[] bytes;
        int length;
        int i4;
        jtc jtcVar2;
        cn5 cn5Var;
        int i5;
        int ordinal;
        cn5 cn5Var2;
        gok gokVar;
        int i6;
        int i7;
        int e2;
        int i8;
        int i9;
        char c2;
        int i10;
        int i11;
        tp2 tp2Var;
        int i12;
        int[] iArr = ww9.n;
        if (str.isEmpty()) {
            a70.p("Found empty contents");
            return null;
        }
        if (i2 != 12) {
            a70.p("Can only encode QR_CODE, but got ".concat(fn0.C(i2)));
            return null;
        }
        cn5 cn5Var3 = cn5.a;
        if (enumMap.containsKey(cn5Var3)) {
            String obj = enumMap.get(cn5Var3).toString();
            if (obj == null) {
                yhk.s("Name is null");
            } else if (!obj.equals("L")) {
                if (obj.equals(PlayerKt.FOOTBALL_MIDFIELDER)) {
                    i3 = 2;
                } else if (obj.equals("Q")) {
                    i3 = 3;
                } else if (obj.equals("H")) {
                    i3 = 4;
                } else {
                    a70.p("No enum constant com.google.zxing.qrcode.decoder.ErrorCorrectionLevel.".concat(obj));
                }
                cn5 cn5Var4 = cn5.f;
                int parseInt = enumMap.containsKey(cn5Var4) ? Integer.parseInt(enumMap.get(cn5Var4).toString()) : 4;
                cn5 cn5Var5 = cn5.b;
                boolean containsKey = enumMap.containsKey(cn5Var5);
                String obj2 = containsKey ? enumMap.get(cn5Var5).toString() : "ISO-8859-1";
                equals = "Shift_JIS".equals(obj2);
                int i13 = 0;
                jtcVar = jtc.BYTE;
                if (equals) {
                    try {
                        bytes = str.getBytes("Shift_JIS");
                        length = bytes.length;
                    } catch (UnsupportedEncodingException unused) {
                    }
                    if (length % 2 == 0) {
                        for (0; i4 < length; i4 + 2) {
                            int i14 = bytes[i4] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                            i4 = ((i14 >= 129 && i14 <= 159) || (i14 >= 224 && i14 <= 235)) ? i4 + 2 : 0;
                        }
                        jtcVar2 = jtc.KANJI;
                        int[] iArr2 = jtcVar2.a;
                        kw1 kw1Var = new kw1();
                        if (jtcVar2 != jtcVar && containsKey && (tp2Var = (tp2) tp2.d.get(obj2)) != null) {
                            kw1Var.b(7, 4);
                            kw1Var.b(tp2Var.a[0], 8);
                        }
                        cn5Var = cn5.l;
                        if (enumMap.containsKey(cn5Var) || !Boolean.valueOf(enumMap.get(cn5Var).toString()).booleanValue()) {
                            i5 = 4;
                        } else {
                            i5 = 4;
                            kw1Var.b(5, 4);
                        }
                        kw1Var.b(jtcVar2.b, i5);
                        kw1 kw1Var2 = new kw1();
                        ordinal = jtcVar2.ordinal();
                        if (ordinal == 1) {
                            int i15 = 8;
                            if (ordinal == 2) {
                                int length2 = str.length();
                                int i16 = 0;
                                while (i16 < length2) {
                                    char charAt = str.charAt(i16);
                                    int i17 = charAt < '`' ? iArr[charAt] : -1;
                                    if (i17 == -1) {
                                        throw new iml();
                                    }
                                    int i18 = i16 + 1;
                                    if (i18 < length2) {
                                        char charAt2 = str.charAt(i18);
                                        int i19 = charAt2 < '`' ? iArr[charAt2] : -1;
                                        if (i19 == -1) {
                                            throw new iml();
                                        }
                                        kw1Var2.b((i17 * 45) + i19, 11);
                                        i16 += 2;
                                    } else {
                                        kw1Var2.b(i17, 6);
                                        i16 = i18;
                                    }
                                }
                            } else if (ordinal == i5) {
                                try {
                                    byte[] bytes2 = str.getBytes(obj2);
                                    int length3 = bytes2.length;
                                    int i20 = 0;
                                    while (i20 < length3) {
                                        kw1Var2.b(bytes2[i20], i15);
                                        i20++;
                                        i15 = 8;
                                    }
                                } catch (UnsupportedEncodingException e3) {
                                    throw new iml(e3);
                                }
                            } else {
                                if (ordinal != 6) {
                                    throw new iml("Invalid mode: ".concat(String.valueOf(jtcVar2)));
                                }
                                try {
                                    byte[] bytes3 = str.getBytes("Shift_JIS");
                                    int length4 = bytes3.length;
                                    for (int i21 = 0; i21 < length4; i21 += 2) {
                                        int i22 = ((bytes3[i21] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bytes3[i21 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                                        int i23 = 33088;
                                        if (i22 < 33088 || i22 > 40956) {
                                            if (i22 < 57408 || i22 > 60351) {
                                                i10 = -1;
                                                i11 = -1;
                                                if (i11 != i10) {
                                                    throw new iml("Invalid byte sequence");
                                                }
                                                kw1Var2.b(((i11 >> 8) * PsExtractor.AUDIO_STREAM) + (i11 & 255), 13);
                                            } else {
                                                i23 = 49472;
                                            }
                                        }
                                        i11 = i22 - i23;
                                        i10 = -1;
                                        if (i11 != i10) {
                                        }
                                    }
                                } catch (UnsupportedEncodingException e4) {
                                    throw new iml(e4);
                                }
                            }
                        } else {
                            int length5 = str.length();
                            int i24 = 0;
                            while (i24 < length5) {
                                int charAt3 = str.charAt(i24) - '0';
                                int i25 = i24 + 2;
                                if (i25 < length5) {
                                    kw1Var2.b(bf3.c(str.charAt(i24 + 1) - '0', 10, charAt3 * 100, str.charAt(i25) - '0'), 10);
                                    i24 += 3;
                                } else {
                                    i24++;
                                    if (i24 < length5) {
                                        kw1Var2.b((charAt3 * 10) + (str.charAt(i24) - '0'), 7);
                                        i24 = i25;
                                    } else {
                                        kw1Var2.b(charAt3, 4);
                                    }
                                }
                            }
                        }
                        cn5Var2 = cn5.k;
                        if (enumMap.containsKey(cn5Var2)) {
                            gok a = gok.a(1);
                            int i26 = kw1Var.b;
                            int i27 = a.a;
                            int i28 = iArr2[i27 <= 9 ? (char) 0 : i27 <= 26 ? (char) 1 : (char) 2] + i26 + kw1Var2.b;
                            int i29 = 1;
                            while (i29 <= 40) {
                                gok a2 = gok.a(i29);
                                int i30 = a2.c;
                                yz1 yz1Var = a2.b[wt3.C(i3)];
                                int i31 = yz1Var.b;
                                uif[] uifVarArr = (uif[]) yz1Var.c;
                                int length6 = uifVarArr.length;
                                int i32 = i13;
                                int i33 = i32;
                                while (i32 < length6) {
                                    int i34 = i32;
                                    i33 += uifVarArr[i34].b;
                                    i32 = i34 + 1;
                                }
                                if (i30 - (i33 * i31) >= (i28 + 7) / 8) {
                                    int i35 = kw1Var.b;
                                    int i36 = a2.a;
                                    int i37 = iArr2[i36 <= 9 ? i13 : i36 <= 26 ? 1 : 2] + i35 + kw1Var2.b;
                                    int i38 = 1;
                                    while (i38 <= 40) {
                                        gok a3 = gok.a(i38);
                                        int i39 = a3.c;
                                        yz1 yz1Var2 = a3.b[wt3.C(i3)];
                                        int i40 = yz1Var2.b;
                                        uif[] uifVarArr2 = (uif[]) yz1Var2.c;
                                        int length7 = uifVarArr2.length;
                                        int i41 = i13;
                                        int i42 = i41;
                                        while (i41 < length7) {
                                            int i43 = i41;
                                            i42 += uifVarArr2[i43].b;
                                            i41 = i43 + 1;
                                        }
                                        if (i39 - (i42 * i40) >= (i37 + 7) / 8) {
                                            gokVar = a3;
                                        } else {
                                            i38++;
                                            i13 = 0;
                                        }
                                    }
                                    throw new iml("Data too big");
                                }
                                i29++;
                                i13 = 0;
                            }
                            throw new iml("Data too big");
                        }
                        gokVar = gok.a(Integer.parseInt(enumMap.get(cn5Var2).toString()));
                        int i44 = kw1Var.b;
                        int i45 = gokVar.a;
                        int i46 = iArr2[i45 <= 9 ? (char) 0 : i45 <= 26 ? (char) 1 : (char) 2] + i44 + kw1Var2.b;
                        int i47 = gokVar.c;
                        yz1 yz1Var3 = gokVar.b[wt3.C(i3)];
                        int i48 = yz1Var3.b;
                        int i49 = 0;
                        for (uif uifVar : (uif[]) yz1Var3.c) {
                            i49 += uifVar.b;
                        }
                        if (i47 - (i49 * i48) < (i46 + 7) / 8) {
                            throw new iml("Data too big for requested version");
                        }
                        int i50 = gokVar.a;
                        int i51 = gokVar.c;
                        kw1 kw1Var3 = new kw1();
                        i6 = kw1Var.b;
                        kw1Var3.c(i6);
                        for (i7 = i13; i7 < i6; i7++) {
                            kw1Var3.a(kw1Var.d(i7));
                        }
                        e2 = jtcVar2 != jtcVar ? kw1Var2.e() : str.length();
                        int i52 = iArr2[i50 > 9 ? i13 : i50 <= 26 ? 1 : 2];
                        i8 = 1 << i52;
                        if (e2 < i8) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(e2);
                            sb.append(" is bigger than ");
                            sb.append(i8 - 1);
                            throw new iml(sb.toString());
                        }
                        kw1Var3.b(e2, i52);
                        int i53 = kw1Var2.b;
                        kw1Var3.c(kw1Var3.b + i53);
                        for (int i54 = i13; i54 < i53; i54++) {
                            kw1Var3.a(kw1Var2.d(i54));
                        }
                        yz1 yz1Var4 = gokVar.b[wt3.C(i3)];
                        int i55 = yz1Var4.b;
                        uif[] uifVarArr3 = (uif[]) yz1Var4.c;
                        int length8 = uifVarArr3.length;
                        int i56 = i13;
                        int i57 = i56;
                        while (i56 < length8) {
                            i57 += uifVarArr3[i56].b;
                            i56++;
                        }
                        int i58 = i51 - (i57 * i55);
                        int i59 = i58 << 3;
                        if (kw1Var3.b > i59) {
                            throw new iml("data bits cannot fit in the QR Code" + kw1Var3.b + " > " + i59);
                        }
                        for (int i60 = i13; i60 < 4 && kw1Var3.b < i59; i60++) {
                            kw1Var3.a(i13);
                        }
                        boolean z = i13;
                        int i61 = kw1Var3.b & 7;
                        if (i61 > 0) {
                            while (i61 < 8) {
                                kw1Var3.a(z);
                                i61++;
                                z = 0;
                            }
                        }
                        int e5 = i58 - kw1Var3.e();
                        for (int i62 = 0; i62 < e5; i62++) {
                            kw1Var3.b((i62 & 1) == 0 ? 236 : 17, 8);
                        }
                        if (kw1Var3.b != i59) {
                            throw new iml("Bits size does not equal capacity");
                        }
                        int i63 = 0;
                        for (uif uifVar2 : uifVarArr3) {
                            i63 += uifVar2.b;
                        }
                        if (kw1Var3.e() != i58) {
                            throw new iml("Number of bits and data bytes does not match");
                        }
                        ArrayList arrayList = new ArrayList(i63);
                        int i64 = 0;
                        int i65 = 0;
                        int i66 = 0;
                        int i67 = 0;
                        while (i64 < i63) {
                            int[] iArr3 = new int[1];
                            int[] iArr4 = new int[1];
                            if (i64 >= i63) {
                                throw new iml("Block ID too large");
                            }
                            int i68 = i51 % i63;
                            int i69 = i50;
                            int i70 = i63 - i68;
                            int i71 = i51 / i63;
                            int i72 = i58 / i63;
                            int i73 = i72 + 1;
                            int i74 = parseInt;
                            int i75 = i71 - i72;
                            int i76 = (i71 + 1) - i73;
                            if (i75 != i76) {
                                throw new iml("EC bytes mismatch");
                            }
                            if (i63 != i70 + i68) {
                                throw new iml("RS blocks mismatch");
                            }
                            if (i51 != ((i73 + i76) * i68) + ((i72 + i75) * i70)) {
                                throw new iml("Total bytes mismatch");
                            }
                            if (i64 < i70) {
                                c2 = 0;
                                iArr3[0] = i72;
                                iArr4[0] = i75;
                            } else {
                                c2 = 0;
                                iArr3[0] = i73;
                                iArr4[0] = i76;
                            }
                            int i77 = iArr3[c2];
                            byte[] bArr = new byte[i77];
                            int i78 = i65 << 3;
                            int i79 = 0;
                            while (i79 < i77) {
                                int i80 = i64;
                                int i81 = i63;
                                int i82 = i79;
                                int i83 = i78;
                                int i84 = 0;
                                for (int i85 = 0; i85 < 8; i85++) {
                                    if (kw1Var3.d(i83)) {
                                        i84 |= 1 << (7 - i85);
                                    }
                                    i83++;
                                }
                                bArr[i82] = (byte) i84;
                                i79 = i82 + 1;
                                i78 = i83;
                                i64 = i80;
                                i63 = i81;
                            }
                            int i86 = i64;
                            int i87 = i63;
                            int i88 = iArr4[0];
                            int[] iArr5 = new int[i77 + i88];
                            for (int i89 = 0; i89 < i77; i89++) {
                                iArr5[i89] = bArr[i89] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                            }
                            new k1d(nw8.k).p(i88, iArr5);
                            byte[] bArr2 = new byte[i88];
                            int i90 = 0;
                            while (i90 < i88) {
                                int[] iArr6 = iArr5;
                                bArr2[i90] = (byte) iArr6[i77 + i90];
                                i90++;
                                iArr5 = iArr6;
                            }
                            arrayList.add(new gy1(bArr, bArr2));
                            i66 = Math.max(i66, i77);
                            i67 = Math.max(i67, i88);
                            i65 += iArr3[0];
                            i64 = i86 + 1;
                            i63 = i87;
                            i50 = i69;
                            parseInt = i74;
                        }
                        int i91 = i50;
                        int i92 = parseInt;
                        if (i58 != i65) {
                            throw new iml("Data bytes does not match offset");
                        }
                        kw1 kw1Var4 = new kw1();
                        for (int i93 = 0; i93 < i66; i93++) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                byte[] bArr3 = ((gy1) it.next()).a;
                                if (i93 < bArr3.length) {
                                    kw1Var4.b(bArr3[i93], 8);
                                }
                            }
                        }
                        for (int i94 = 0; i94 < i67; i94++) {
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                byte[] bArr4 = ((gy1) it2.next()).b;
                                if (i94 < bArr4.length) {
                                    kw1Var4.b(bArr4[i94], 8);
                                }
                            }
                        }
                        if (i51 != kw1Var4.e()) {
                            StringBuilder t = lnb.t(i51, "Interleaving error: ", " and ");
                            t.append(kw1Var4.e());
                            t.append(" differ.");
                            throw new iml(t.toString());
                        }
                        int i95 = (i91 * 4) + 17;
                        und undVar = new und(i95, i95, 3);
                        int i96 = undVar.c;
                        int i97 = undVar.b;
                        int i98 = Integer.MAX_VALUE;
                        int i99 = 0;
                        int i100 = -1;
                        while (i99 < 8) {
                            c6o.C(kw1Var4, i3, gokVar, i99, undVar);
                            int l2 = qha.l(undVar, false) + qha.l(undVar, true);
                            byte[][] bArr5 = (byte[][]) undVar.d;
                            int i101 = 0;
                            int i102 = 0;
                            while (i101 < i96 - 1) {
                                byte[] bArr6 = bArr5[i101];
                                int i103 = i102;
                                int i104 = 0;
                                while (i104 < i97 - 1) {
                                    byte b2 = bArr6[i104];
                                    int i105 = i104 + 1;
                                    int i106 = i101;
                                    if (b2 == bArr6[i105]) {
                                        byte[] bArr7 = bArr5[i106 + 1];
                                        if (b2 == bArr7[i104] && b2 == bArr7[i105]) {
                                            i103++;
                                        }
                                    }
                                    i104 = i105;
                                    i101 = i106;
                                }
                                i101++;
                                i102 = i103;
                            }
                            int i107 = (i102 * 3) + l2;
                            int i108 = 0;
                            int i109 = 0;
                            while (i108 < i96) {
                                int i110 = i109;
                                int i111 = 0;
                                while (i111 < i97) {
                                    byte[] bArr8 = bArr5[i108];
                                    int i112 = i111 + 6;
                                    int i113 = i99;
                                    if (i112 < i97) {
                                        i9 = i107;
                                        byte b3 = 1;
                                        if (bArr8[i111] == 1 && bArr8[i111 + 1] == 0 && bArr8[i111 + 2] == 1 && bArr8[i111 + 3] == 1 && bArr8[i111 + 4] == 1 && bArr8[i111 + 5] == 0 && bArr8[i112] == 1) {
                                            int max = Math.max(i111 - 4, 0);
                                            int min = Math.min(i111, bArr8.length);
                                            while (true) {
                                                if (max >= min) {
                                                    break;
                                                }
                                                int i114 = max;
                                                if (bArr8[i114] == b3) {
                                                    int max2 = Math.max(i111 + 7, 0);
                                                    int min2 = Math.min(i111 + 11, bArr8.length);
                                                    while (max2 < min2) {
                                                        int i115 = max2;
                                                        if (bArr8[max2] == 1) {
                                                            break;
                                                        }
                                                        max2 = i115 + 1;
                                                    }
                                                } else {
                                                    max = i114 + 1;
                                                    b3 = 1;
                                                }
                                            }
                                        }
                                    } else {
                                        i9 = i107;
                                    }
                                    int i116 = i108 + 6;
                                    if (i116 < i96) {
                                        byte b4 = 1;
                                        if (bArr5[i108][i111] == 1 && bArr5[i108 + 1][i111] == 0 && bArr5[i108 + 2][i111] == 1 && bArr5[i108 + 3][i111] == 1 && bArr5[i108 + 4][i111] == 1 && bArr5[i108 + 5][i111] == 0 && bArr5[i116][i111] == 1) {
                                            int max3 = Math.max(i108 - 4, 0);
                                            int min3 = Math.min(i108, bArr5.length);
                                            while (true) {
                                                if (max3 >= min3) {
                                                    break;
                                                }
                                                if (bArr5[max3][i111] == b4) {
                                                    int min4 = Math.min(i108 + 11, bArr5.length);
                                                    for (int max4 = Math.max(i108 + 7, 0); max4 < min4; max4++) {
                                                        if (bArr5[max4][i111] == 1) {
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    max3++;
                                                    b4 = 1;
                                                }
                                            }
                                            i110++;
                                        }
                                    }
                                    i111++;
                                    i107 = i9;
                                    i99 = i113;
                                }
                                i108++;
                                i109 = i110;
                            }
                            int i117 = i99;
                            int i118 = (i109 * 40) + i107;
                            int i119 = 0;
                            for (int i120 = 0; i120 < i96; i120++) {
                                byte[] bArr9 = bArr5[i120];
                                for (int i121 = 0; i121 < i97; i121++) {
                                    if (bArr9[i121] == 1) {
                                        i119++;
                                    }
                                }
                            }
                            int i122 = i96 * i97;
                            int abs = (((Math.abs((i119 << 1) - i122) * 10) / i122) * 10) + i118;
                            if (abs < i98) {
                                i98 = abs;
                                i100 = i117;
                            }
                            i99 = i117 + 1;
                        }
                        c6o.C(kw1Var4, i3, gokVar, i100, undVar);
                        int i123 = i92 << 1;
                        int i124 = i97 + i123;
                        int i125 = i123 + i96;
                        int max5 = Math.max(200, i124);
                        int max6 = Math.max(200, i125);
                        int min5 = Math.min(max5 / i124, max6 / i125);
                        int i126 = (max5 - (i97 * min5)) / 2;
                        int i127 = (max6 - (i96 * min5)) / 2;
                        lw1 lw1Var = new lw1(max5, max6);
                        int i128 = 0;
                        while (i128 < i96) {
                            int i129 = i126;
                            int i130 = 0;
                            while (i130 < i97) {
                                if (undVar.c(i130, i128) == 1) {
                                    lw1Var.c(i129, i127, min5, min5);
                                }
                                i130++;
                                i129 += min5;
                            }
                            i128++;
                            i127 += min5;
                        }
                        return lw1Var;
                    }
                }
                i12 = 0;
                boolean z2 = false;
                boolean z3 = false;
                while (true) {
                    if (i12 < str.length()) {
                        char charAt4 = str.charAt(i12);
                        if (charAt4 < '0' || charAt4 > '9') {
                            if ((charAt4 < '`' ? iArr[charAt4] : -1) == -1) {
                                break;
                            }
                            z2 = true;
                        } else {
                            z3 = true;
                        }
                        i12++;
                    } else if (z2) {
                        jtcVar2 = jtc.ALPHANUMERIC;
                    } else if (z3) {
                        jtcVar2 = jtc.NUMERIC;
                    }
                }
                jtcVar2 = jtcVar;
                int[] iArr22 = jtcVar2.a;
                kw1 kw1Var5 = new kw1();
                if (jtcVar2 != jtcVar) {
                }
                cn5Var = cn5.l;
                if (enumMap.containsKey(cn5Var)) {
                }
                i5 = 4;
                kw1Var5.b(jtcVar2.b, i5);
                kw1 kw1Var22 = new kw1();
                ordinal = jtcVar2.ordinal();
                if (ordinal == 1) {
                }
                cn5Var2 = cn5.k;
                if (enumMap.containsKey(cn5Var2)) {
                }
                int i502 = gokVar.a;
                int i512 = gokVar.c;
                kw1 kw1Var32 = new kw1();
                i6 = kw1Var5.b;
                kw1Var32.c(i6);
                while (i7 < i6) {
                }
                if (jtcVar2 != jtcVar) {
                }
                int i522 = iArr22[i502 > 9 ? i13 : i502 <= 26 ? 1 : 2];
                i8 = 1 << i522;
                if (e2 < i8) {
                }
            }
            i3 = 0;
            cn5 cn5Var42 = cn5.f;
            if (enumMap.containsKey(cn5Var42)) {
            }
            cn5 cn5Var52 = cn5.b;
            boolean containsKey2 = enumMap.containsKey(cn5Var52);
            if (containsKey2) {
            }
            equals = "Shift_JIS".equals(obj2);
            int i132 = 0;
            jtcVar = jtc.BYTE;
            if (equals) {
            }
            i12 = 0;
            boolean z22 = false;
            boolean z32 = false;
            while (true) {
                if (i12 < str.length()) {
                }
                i12++;
            }
            jtcVar2 = jtcVar;
            int[] iArr222 = jtcVar2.a;
            kw1 kw1Var52 = new kw1();
            if (jtcVar2 != jtcVar) {
            }
            cn5Var = cn5.l;
            if (enumMap.containsKey(cn5Var)) {
            }
            i5 = 4;
            kw1Var52.b(jtcVar2.b, i5);
            kw1 kw1Var222 = new kw1();
            ordinal = jtcVar2.ordinal();
            if (ordinal == 1) {
            }
            cn5Var2 = cn5.k;
            if (enumMap.containsKey(cn5Var2)) {
            }
            int i5022 = gokVar.a;
            int i5122 = gokVar.c;
            kw1 kw1Var322 = new kw1();
            i6 = kw1Var52.b;
            kw1Var322.c(i6);
            while (i7 < i6) {
            }
            if (jtcVar2 != jtcVar) {
            }
            int i5222 = iArr222[i5022 > 9 ? i132 : i5022 <= 26 ? 1 : 2];
            i8 = 1 << i5222;
            if (e2 < i8) {
            }
        }
        i3 = 1;
        cn5 cn5Var422 = cn5.f;
        if (enumMap.containsKey(cn5Var422)) {
        }
        cn5 cn5Var522 = cn5.b;
        boolean containsKey22 = enumMap.containsKey(cn5Var522);
        if (containsKey22) {
        }
        equals = "Shift_JIS".equals(obj2);
        int i1322 = 0;
        jtcVar = jtc.BYTE;
        if (equals) {
        }
        i12 = 0;
        boolean z222 = false;
        boolean z322 = false;
        while (true) {
            if (i12 < str.length()) {
            }
            i12++;
        }
        jtcVar2 = jtcVar;
        int[] iArr2222 = jtcVar2.a;
        kw1 kw1Var522 = new kw1();
        if (jtcVar2 != jtcVar) {
        }
        cn5Var = cn5.l;
        if (enumMap.containsKey(cn5Var)) {
        }
        i5 = 4;
        kw1Var522.b(jtcVar2.b, i5);
        kw1 kw1Var2222 = new kw1();
        ordinal = jtcVar2.ordinal();
        if (ordinal == 1) {
        }
        cn5Var2 = cn5.k;
        if (enumMap.containsKey(cn5Var2)) {
        }
        int i50222 = gokVar.a;
        int i51222 = gokVar.c;
        kw1 kw1Var3222 = new kw1();
        i6 = kw1Var522.b;
        kw1Var3222.c(i6);
        while (i7 < i6) {
        }
        if (jtcVar2 != jtcVar) {
        }
        int i52222 = iArr2222[i50222 > 9 ? i1322 : i50222 <= 26 ? 1 : 2];
        i8 = 1 << i52222;
        if (e2 < i8) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhoc
    public zzhot l(zzhfj zzhfjVar) {
        zzhfm zzhfmVar;
        switch (this.a) {
            case 19:
                zzhim zzhimVar = (zzhim) zzhfjVar;
                jno jnoVar = zzhir.a;
                zzhil zzhilVar = zzhimVar.a;
                if (zzhil.b == zzhilVar) {
                    zzhfmVar = zzhfm.c;
                } else {
                    if (zzhil.c != zzhilVar) {
                        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzhilVar)));
                    }
                    zzhfmVar = zzhfm.e;
                }
                return zzhot.a("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", zzhfmVar, (mpo) zzhir.a(zzhimVar).e());
            case 20:
            default:
                zzhyc zzhycVar = (zzhyc) zzhfjVar;
                jno jnoVar2 = zziac.a;
                zzhfm a = zziac.a(zzhycVar.c);
                zzhva H = zzhvb.H();
                zzhvd c2 = zziac.c(zzhycVar);
                H.n();
                ((zzhvb) H.b).I(c2);
                int i2 = zzhycVar.a;
                H.n();
                ((zzhvb) H.b).J(i2);
                byte[] a2 = zzhma.a(zzhycVar.b);
                mpo mpoVar = zziei.b;
                mpo B = zziei.B(0, a2.length, a2);
                H.n();
                ((zzhvb) H.b).K(B);
                return zzhot.a("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey", a, (mpo) ((zzhvb) H.o()).e());
            case 21:
                zzhpm zzhpmVar = (zzhpm) zzhfjVar;
                jno jnoVar3 = zzhqp.a;
                zzhfm a3 = zzhqp.a(zzhpmVar.c);
                zzhrp G = zzhrq.G();
                zzhrr E = zzhrs.E();
                int i3 = zzhpmVar.b;
                E.n();
                ((zzhrs) E.b).G(i3);
                zzhrs zzhrsVar = (zzhrs) E.o();
                G.n();
                ((zzhrq) G.b).I(zzhrsVar);
                int i4 = zzhpmVar.a;
                G.n();
                ((zzhrq) G.b).H(i4);
                return zzhot.a("type.googleapis.com/google.crypto.tink.AesCmacKey", a3, (mpo) ((zzhrq) G.o()).e());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhmw
    public zzhes n(zzhos zzhosVar, zzhfr zzhfrVar) {
        switch (this.a) {
            case 20:
                jno jnoVar = zzhks.a;
                if (!zzhosVar.a.equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                    a70.p("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
                    return null;
                }
                try {
                    zziei zzieiVar = zzhosVar.c;
                    zziew zziewVar = zziew.b;
                    int i2 = dpo.a;
                    zzhss F = zzhss.F(zzieiVar, zziew.c);
                    if (F.D() == 0) {
                        return zzhhn.d(zzhks.b(zzhosVar.e), new zzicj(zzich.a(F.E().d())), zzhosVar.f);
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (zzige unused) {
                    zzl.x("Parsing ChaCha20Poly1305Key failed");
                    return null;
                }
            default:
                jno jnoVar2 = zzhyz.a;
                String str = zzhosVar.a;
                if (!str.equals("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey")) {
                    a70.p("Wrong type URL in call to EcdsaProtoSerialization.parsePrivateKey: ".concat(String.valueOf(str)));
                    return null;
                }
                try {
                    zziei zzieiVar2 = zzhosVar.c;
                    zziew zziewVar2 = zziew.b;
                    int i3 = dpo.a;
                    zzhta G = zzhta.G(zzieiVar2, zziew.c);
                    if (G.D() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    zzhtc E = G.E();
                    if (E.D() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    int i4 = 0;
                    zzhvs zzhvsVar = new zzhvs(i4);
                    zzhvsVar.c = zzhyz.b(E.E().D());
                    zzhvsVar.a = zzhyz.h(E.E().I());
                    zzhvsVar.b = zzhyz.g(E.E().H());
                    zzhvsVar.d = zzhyz.c(zzhosVar.e);
                    zzhvx a = zzhvsVar.a();
                    zzhwa zzhwaVar = new zzhwa(i4);
                    zzhwaVar.a = a;
                    zzhwaVar.b = new ECPoint(new BigInteger(1, E.F().d()), new BigInteger(1, E.G().d()));
                    zzhwaVar.c = zzhosVar.f;
                    zzhwb a2 = zzhwaVar.a();
                    zzhvy zzhvyVar = new zzhvy(i4);
                    zzhvyVar.a = a2;
                    zzhvyVar.b = new zzici(new BigInteger(1, G.F().d()));
                    return zzhvyVar.a();
                } catch (zzige | IllegalArgumentException unused2) {
                    zzl.x("Parsing EcdsaPrivateKey failed");
                    return null;
                }
        }
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return "SharingStarted.Eagerly";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.fon
    /* renamed from: zza */
    public Object mo792zza() {
        switch (this.a) {
            case 7:
                return new Boolean(((zzahi) zzahh.b.a.a).zzb());
            case 8:
                List list = zzfy.a;
                return Integer.valueOf((int) zzags.b.get().K());
            case 9:
                List list2 = zzfy.a;
                return Long.valueOf(zzags.b.get().zzL());
            case 10:
                List list3 = zzfy.a;
                return Long.valueOf(zzags.b.get().o());
            case 11:
                List list4 = zzfy.a;
                return Long.valueOf(zzags.b.get().zzo());
            case 12:
            case 13:
            case 15:
            default:
                return new Boolean(((zzaia) zzahz.b.a.a).zza());
            case 14:
                List list5 = zzfy.a;
                return Integer.valueOf((int) zzags.b.get().zzz());
            case 16:
                List list6 = zzfy.a;
                return Boolean.valueOf(((zzahl) zzahk.b.a.a).zzb());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbut
    public JSONObject zzb(Object obj) {
        zzejd zzejdVar = (zzejd) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        if (((Boolean) zzba.zzc().a(zzbjg.Oa)).booleanValue()) {
            zzcbx zzcbxVar = zzejdVar.c;
            jSONObject2.put("ad_request_url", zzcbxVar.f);
            jSONObject2.put("ad_request_post_body", zzcbxVar.c);
        }
        zzcbx zzcbxVar2 = zzejdVar.c;
        jSONObject2.put("base_url", zzcbxVar2.b);
        jSONObject2.put("signals", zzejdVar.b);
        zzejj zzejjVar = zzejdVar.a;
        jSONObject3.put("body", zzejjVar.c);
        jSONObject3.put("headers", zzay.zza().zzm(zzejjVar.b));
        jSONObject3.put("response_code", zzejjVar.a);
        jSONObject3.put(Payload.LATENCY, zzejjVar.d);
        jSONObject.put("request", jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", zzcbxVar2.h);
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzdjm, com.google.android.gms.internal.ads.zzeb
    /* renamed from: zza */
    public /* synthetic */ void mo13zza(Object obj) {
        switch (this.a) {
            case 12:
                ((zzdim) obj).zza();
                break;
            case 13:
                ((zzbra) obj).zza();
                break;
            case 25:
                break;
            default:
                break;
        }
    }

    @Override // defpackage.fmo
    public /* synthetic */ void zza() {
    }
}
