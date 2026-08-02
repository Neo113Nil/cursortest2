package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import defpackage.bf3;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzake extends zzajz {
    public final String b;
    public final zzgxm c;

    public zzake(String str, String str2, s sVar) {
        super(str);
        zzguk.a(!sVar.isEmpty());
        this.b = str2;
        zzgxm x = zzgxm.x(sVar);
        this.c = x;
    }

    public static ArrayList b(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            }
            if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            }
            if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01aa A[Catch: NumberFormatException | StringIndexOutOfBoundsException -> 0x023d, TryCatch #0 {NumberFormatException | StringIndexOutOfBoundsException -> 0x023d, blocks: (B:6:0x015a, B:18:0x01a1, B:20:0x01aa, B:21:0x01b4, B:27:0x004e, B:29:0x0057, B:30:0x0061, B:84:0x01f8), top: B:2:0x0010 }] */
    @Override // com.google.android.gms.internal.ads.zzao
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(zzam zzamVar) {
        Integer valueOf;
        String str = this.a;
        int hashCode = str.hashCode();
        zzgxm zzgxmVar = this.c;
        try {
            switch (hashCode) {
                case 82815:
                    if (!str.equals("TAL")) {
                    }
                    zzamVar.c = (CharSequence) zzgxmVar.get(0);
                    break;
                case 82878:
                    if (!str.equals("TCM")) {
                    }
                    zzamVar.s = (CharSequence) zzgxmVar.get(0);
                    break;
                case 82897:
                    if (!str.equals("TDA")) {
                    }
                    String str2 = (String) zzgxmVar.get(0);
                    int parseInt = Integer.parseInt(str2.substring(2, 4));
                    int parseInt2 = Integer.parseInt(str2.substring(0, 2));
                    zzamVar.m = Integer.valueOf(parseInt);
                    zzamVar.n = Integer.valueOf(parseInt2);
                    break;
                case 83253:
                    if (!str.equals("TP1")) {
                    }
                    zzamVar.b = (CharSequence) zzgxmVar.get(0);
                    break;
                case 83254:
                    if (!str.equals("TP2")) {
                    }
                    zzamVar.d = (CharSequence) zzgxmVar.get(0);
                    break;
                case 83255:
                    if (!str.equals("TP3")) {
                    }
                    zzamVar.t = (CharSequence) zzgxmVar.get(0);
                    break;
                case 83341:
                    if (!str.equals("TRK")) {
                    }
                    String str3 = (String) zzgxmVar.get(0);
                    String str4 = zzfm.a;
                    String[] split = str3.split("/", -1);
                    int parseInt3 = Integer.parseInt(split[0]);
                    valueOf = split.length > 1 ? Integer.valueOf(Integer.parseInt(split[1])) : null;
                    zzamVar.h = Integer.valueOf(parseInt3);
                    zzamVar.i = valueOf;
                    break;
                case 83378:
                    if (!str.equals("TT2")) {
                    }
                    zzamVar.a = (CharSequence) zzgxmVar.get(0);
                    break;
                case 83536:
                    if (!str.equals("TXT")) {
                    }
                    zzamVar.r = (CharSequence) zzgxmVar.get(0);
                    break;
                case 83552:
                    if (!str.equals("TYE")) {
                    }
                    zzamVar.l = Integer.valueOf(Integer.parseInt((String) zzgxmVar.get(0)));
                    break;
                case 2567331:
                    if (!str.equals("TALB")) {
                    }
                    zzamVar.c = (CharSequence) zzgxmVar.get(0);
                    break;
                case 2569357:
                    if (!str.equals("TCOM")) {
                    }
                    zzamVar.s = (CharSequence) zzgxmVar.get(0);
                    break;
                case 2569358:
                    if (str.equals("TCON")) {
                        Integer f = zzhbj.f((String) zzgxmVar.get(0));
                        if (f != null) {
                            String a = zzaka.a(f.intValue());
                            if (a != null) {
                                zzamVar.x = a;
                                break;
                            }
                        } else {
                            zzamVar.x = (CharSequence) zzgxmVar.get(0);
                            break;
                        }
                    }
                    break;
                case 2569891:
                    if (!str.equals("TDAT")) {
                    }
                    String str22 = (String) zzgxmVar.get(0);
                    int parseInt4 = Integer.parseInt(str22.substring(2, 4));
                    int parseInt22 = Integer.parseInt(str22.substring(0, 2));
                    zzamVar.m = Integer.valueOf(parseInt4);
                    zzamVar.n = Integer.valueOf(parseInt22);
                    break;
                case 2570401:
                    if (str.equals("TDRC")) {
                        ArrayList b = b((String) zzgxmVar.get(0));
                        int size = b.size();
                        if (size != 1) {
                            if (size != 2) {
                                if (size == 3) {
                                    zzamVar.n = (Integer) b.get(2);
                                }
                            }
                            zzamVar.m = (Integer) b.get(1);
                        }
                        zzamVar.l = (Integer) b.get(0);
                        break;
                    }
                    break;
                case 2570410:
                    if (str.equals("TDRL")) {
                        ArrayList b2 = b((String) zzgxmVar.get(0));
                        int size2 = b2.size();
                        if (size2 != 1) {
                            if (size2 != 2) {
                                if (size2 == 3) {
                                    zzamVar.q = (Integer) b2.get(2);
                                }
                            }
                            zzamVar.p = (Integer) b2.get(1);
                        }
                        zzamVar.o = (Integer) b2.get(0);
                        break;
                    }
                    break;
                case 2571565:
                    if (!str.equals("TEXT")) {
                    }
                    zzamVar.r = (CharSequence) zzgxmVar.get(0);
                    break;
                case 2575251:
                    if (!str.equals("TIT2")) {
                    }
                    zzamVar.a = (CharSequence) zzgxmVar.get(0);
                    break;
                case 2581512:
                    if (!str.equals("TPE1")) {
                    }
                    zzamVar.b = (CharSequence) zzgxmVar.get(0);
                    break;
                case 2581513:
                    if (!str.equals("TPE2")) {
                    }
                    zzamVar.d = (CharSequence) zzgxmVar.get(0);
                    break;
                case 2581514:
                    if (!str.equals("TPE3")) {
                    }
                    zzamVar.t = (CharSequence) zzgxmVar.get(0);
                    break;
                case 2581856:
                    if (str.equals("TPOS")) {
                        String str5 = (String) zzgxmVar.get(0);
                        String str6 = zzfm.a;
                        String[] split2 = str5.split("/", -1);
                        int parseInt5 = Integer.parseInt(split2[0]);
                        valueOf = split2.length > 1 ? Integer.valueOf(Integer.parseInt(split2[1])) : null;
                        zzamVar.v = Integer.valueOf(parseInt5);
                        zzamVar.w = valueOf;
                        break;
                    }
                    break;
                case 2583398:
                    if (!str.equals("TRCK")) {
                    }
                    String str32 = (String) zzgxmVar.get(0);
                    String str42 = zzfm.a;
                    String[] split3 = str32.split("/", -1);
                    int parseInt32 = Integer.parseInt(split3[0]);
                    if (split3.length > 1) {
                    }
                    zzamVar.h = Integer.valueOf(parseInt32);
                    zzamVar.i = valueOf;
                    break;
                case 2584864:
                    if (str.equals("TSST")) {
                        zzamVar.u = (CharSequence) zzgxmVar.get(0);
                        break;
                    }
                    break;
                case 2590194:
                    if (!str.equals("TYER")) {
                    }
                    zzamVar.l = Integer.valueOf(Integer.parseInt((String) zzgxmVar.get(0)));
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzake.class != obj.getClass()) {
            return false;
        }
        zzake zzakeVar = (zzake) obj;
        return this.a.equals(zzakeVar.a) && Objects.equals(this.b, zzakeVar.b) && this.c.equals(zzakeVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        String str = this.b;
        return this.c.hashCode() + (((hashCode * 31) + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzajz
    public final String toString() {
        String valueOf = String.valueOf(this.c);
        String str = this.a;
        int length = str.length();
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(length + 14 + String.valueOf(str2).length() + 9 + valueOf.length());
        bf3.v(sb, str, ": description=", str2, ": values=");
        sb.append(valueOf);
        return sb.toString();
    }
}
