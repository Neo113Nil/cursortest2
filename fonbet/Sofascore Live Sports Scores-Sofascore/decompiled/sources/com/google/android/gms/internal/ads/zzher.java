package com.google.android.gms.internal.ads;

import com.ironsource.U3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import defpackage.hmo;
import defpackage.is8;
import defpackage.mpo;
import defpackage.zmo;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzher implements zzhff {
    public static final Charset b = Charset.forName(C.UTF8_NAME);
    public final ByteArrayInputStream a;

    public zzher(ByteArrayInputStream byteArrayInputStream) {
        this.a = byteArrayInputStream;
    }

    public static int b(zzico zzicoVar) {
        if (!(zzicoVar instanceof zzics)) {
            is8.e("invalid key id: not a JSON primitive");
            return 0;
        }
        if (!(zzicoVar.e().a instanceof Number)) {
            is8.e("invalid key id: not a JSON number");
            return 0;
        }
        Number m = zzicoVar.e().m();
        try {
            if (!(m instanceof zmo)) {
                throw new IllegalArgumentException("does not contain a parsed number.");
            }
            long parseLong = Long.parseLong(((zmo) m).a);
            if (parseLong <= 4294967295L && parseLong >= -2147483648L) {
                return (int) parseLong;
            }
            is8.e("invalid key id");
            return 0;
        } catch (NumberFormatException e) {
            throw new IOException(e);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x016d A[Catch: all -> 0x002f, IllegalStateException -> 0x0032, zzicr -> 0x0035, TryCatch #2 {all -> 0x002f, blocks: (B:3:0x0016, B:4:0x0023, B:6:0x002b, B:8:0x0038, B:10:0x0051, B:12:0x0059, B:14:0x0063, B:16:0x006d, B:18:0x0080, B:20:0x0086, B:22:0x0098, B:24:0x009e, B:26:0x00a4, B:28:0x00aa, B:30:0x00b2, B:40:0x00fd, B:46:0x0157, B:48:0x016d, B:50:0x0173, B:52:0x0179, B:58:0x01e6, B:60:0x0218, B:61:0x0221, B:79:0x0222, B:80:0x0229, B:84:0x022a, B:85:0x0233, B:100:0x0234, B:101:0x023d, B:112:0x023e, B:113:0x0245, B:115:0x0246, B:116:0x024d, B:121:0x024e, B:124:0x0258, B:125:0x025f, B:126:0x0260, B:127:0x0267, B:128:0x0268, B:129:0x026f, B:136:0x0270, B:137:0x0275), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0222 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x022a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzhuc a() {
        int i;
        String c;
        int i2;
        zzide zzideVar;
        String str = "status";
        String str2 = "keyData";
        ByteArrayInputStream byteArrayInputStream = this.a;
        try {
            try {
                int i3 = hmo.a;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = byteArrayInputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
                zzicq d = zzhms.b(new String(byteArrayOutputStream.toByteArray(), b)).d();
                zzide zzideVar2 = d.a;
                if (!zzideVar2.containsKey(U3.i.W)) {
                    throw new zzicr("invalid keyset: no key");
                }
                zzico m = d.m(U3.i.W);
                if (!(m instanceof zzicn)) {
                    throw new zzicr("invalid keyset: key must be an array");
                }
                ArrayList arrayList = ((zzicn) m).a;
                if (arrayList.size() == 0) {
                    throw new zzicr("invalid keyset: key is empty");
                }
                zzhtz J = zzhuc.J();
                if (zzideVar2.containsKey("primaryKeyId")) {
                    int b2 = b(d.m("primaryKeyId"));
                    J.n();
                    ((zzhuc) J.b).K(b2);
                }
                int i4 = 0;
                while (i4 < arrayList.size()) {
                    zzicq d2 = ((zzico) arrayList.get(i4)).d();
                    zzide zzideVar3 = d2.a;
                    if (!zzideVar3.containsKey(str2) || !zzideVar3.containsKey(str) || !zzideVar3.containsKey("keyId") || !zzideVar3.containsKey("outputPrefixType")) {
                        throw new zzicr("invalid key");
                    }
                    zzico m2 = d2.m(str2);
                    if (!(m2 instanceof zzicq)) {
                        throw new zzicr("invalid key: keyData must be an object");
                    }
                    zzhua G = zzhub.G();
                    String c2 = d2.m(str).c();
                    String str3 = str;
                    int hashCode = c2.hashCode();
                    String str4 = str2;
                    if (hashCode == -891611359) {
                        if (!c2.equals("ENABLED")) {
                            throw new zzicr("unknown status: ".concat(c2));
                        }
                        i = 3;
                        G.n();
                        ((zzhub) G.b).L(i);
                        int b3 = b(d2.m("keyId"));
                        G.n();
                        ((zzhub) G.b).I(b3);
                        c = d2.m("outputPrefixType").c();
                        int i5 = 6;
                        switch (c.hashCode()) {
                            case -2053249079:
                                break;
                            case 80904:
                                break;
                            case 2575090:
                                break;
                            case 1761684556:
                                break;
                        }
                        throw new zzicr("unknown output prefix type: ".concat(c));
                    }
                    if (hashCode == 478389753) {
                        if (!c2.equals("DESTROYED")) {
                            throw new zzicr("unknown status: ".concat(c2));
                        }
                        i = 5;
                        G.n();
                        ((zzhub) G.b).L(i);
                        int b32 = b(d2.m("keyId"));
                        G.n();
                        ((zzhub) G.b).I(b32);
                        c = d2.m("outputPrefixType").c();
                        int i52 = 6;
                        switch (c.hashCode()) {
                            case -2053249079:
                                break;
                            case 80904:
                                break;
                            case 2575090:
                                break;
                            case 1761684556:
                                break;
                        }
                        throw new zzicr("unknown output prefix type: ".concat(c));
                    }
                    if (hashCode == 1053567612 && c2.equals("DISABLED")) {
                        i = 4;
                        G.n();
                        ((zzhub) G.b).L(i);
                        int b322 = b(d2.m("keyId"));
                        G.n();
                        ((zzhub) G.b).I(b322);
                        c = d2.m("outputPrefixType").c();
                        int i522 = 6;
                        switch (c.hashCode()) {
                            case -2053249079:
                                if (!c.equals("LEGACY")) {
                                    break;
                                } else {
                                    i2 = 4;
                                    G.n();
                                    ((zzhub) G.b).M(i2);
                                    zzicq d3 = m2.d();
                                    zzideVar = d3.a;
                                    if (zzideVar.containsKey("typeUrl") || !zzideVar.containsKey(U3.i.X) || !zzideVar.containsKey("keyMaterialType")) {
                                        throw new zzicr("invalid keyData");
                                    }
                                    byte[] a = zzias.a(d3.m(U3.i.X).c());
                                    zzhts F = zzhtt.F();
                                    String c3 = d3.m("typeUrl").c();
                                    F.n();
                                    ((zzhtt) F.b).H(c3);
                                    mpo B = zziei.B(0, a.length, a);
                                    F.n();
                                    ((zzhtt) F.b).I(B);
                                    String c4 = d3.m("keyMaterialType").c();
                                    switch (c4.hashCode()) {
                                        case -1881281466:
                                            if (!c4.equals("REMOTE")) {
                                                throw new zzicr("unknown key material type: ".concat(c4));
                                            }
                                            break;
                                        case -1609477353:
                                            if (!c4.equals("SYMMETRIC")) {
                                                throw new zzicr("unknown key material type: ".concat(c4));
                                            }
                                            i522 = 3;
                                            break;
                                        case 249237018:
                                            if (!c4.equals("ASYMMETRIC_PRIVATE")) {
                                                throw new zzicr("unknown key material type: ".concat(c4));
                                            }
                                            i522 = 4;
                                            break;
                                        case 1534613202:
                                            if (!c4.equals("ASYMMETRIC_PUBLIC")) {
                                                throw new zzicr("unknown key material type: ".concat(c4));
                                            }
                                            i522 = 5;
                                            break;
                                        default:
                                            throw new zzicr("unknown key material type: ".concat(c4));
                                    }
                                    F.n();
                                    ((zzhtt) F.b).K(i522);
                                    zzhtt zzhttVar = (zzhtt) F.o();
                                    G.n();
                                    ((zzhub) G.b).H(zzhttVar);
                                    zzhub zzhubVar = (zzhub) G.o();
                                    J.n();
                                    ((zzhuc) J.b).L(zzhubVar);
                                    i4++;
                                    str = str3;
                                    str2 = str4;
                                }
                                break;
                            case 80904:
                                if (!c.equals("RAW")) {
                                    break;
                                } else {
                                    i2 = 5;
                                    G.n();
                                    ((zzhub) G.b).M(i2);
                                    zzicq d32 = m2.d();
                                    zzideVar = d32.a;
                                    if (zzideVar.containsKey("typeUrl")) {
                                        break;
                                    }
                                    throw new zzicr("invalid keyData");
                                }
                            case 2575090:
                                if (!c.equals("TINK")) {
                                    break;
                                } else {
                                    i2 = 3;
                                    G.n();
                                    ((zzhub) G.b).M(i2);
                                    zzicq d322 = m2.d();
                                    zzideVar = d322.a;
                                    if (zzideVar.containsKey("typeUrl")) {
                                    }
                                    throw new zzicr("invalid keyData");
                                }
                            case 1761684556:
                                if (!c.equals("CRUNCHY")) {
                                    break;
                                } else {
                                    i2 = 6;
                                    G.n();
                                    ((zzhub) G.b).M(i2);
                                    zzicq d3222 = m2.d();
                                    zzideVar = d3222.a;
                                    if (zzideVar.containsKey("typeUrl")) {
                                    }
                                    throw new zzicr("invalid keyData");
                                }
                        }
                        throw new zzicr("unknown output prefix type: ".concat(c));
                    }
                    throw new zzicr("unknown status: ".concat(c2));
                }
                zzhuc zzhucVar = (zzhuc) J.o();
                byteArrayInputStream.close();
                return zzhucVar;
            } catch (Throwable th) {
                byteArrayInputStream.close();
                throw th;
            }
        } catch (zzicr e) {
            e = e;
            throw new IOException(e);
        } catch (IllegalStateException e2) {
            e = e2;
            throw new IOException(e);
        }
    }
}
