package com.google.android.gms.internal.ads;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.ironsource.U3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import defpackage.fc6;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzakj implements zzao {
    public final String a;
    public final String b;

    public zzakj(String str, String str2) {
        this.a = zzgts.b(str);
        this.b = str2;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.ads.zzao
    public final void a(zzam zzamVar) {
        Integer f;
        Integer f2;
        Integer f3;
        Integer f4;
        String str = this.a;
        int hashCode = str.hashCode();
        String str2 = this.b;
        switch (hashCode) {
            case -1935137620:
                if (str.equals("TOTALTRACKS") && (f = zzhbj.f(str2)) != null) {
                    zzamVar.i = f;
                    break;
                }
                break;
            case -215998278:
                if (str.equals("TOTALDISCS") && (f2 = zzhbj.f(str2)) != null) {
                    zzamVar.w = f2;
                    break;
                }
                break;
            case -113312716:
                if (str.equals("TRACKNUMBER") && (f3 = zzhbj.f(str2)) != null) {
                    zzamVar.h = f3;
                    break;
                }
                break;
            case 62359119:
                if (str.equals("ALBUM")) {
                    zzamVar.c = str2;
                    break;
                }
                break;
            case 67703139:
                if (str.equals("GENRE")) {
                    zzamVar.x = str2;
                    break;
                }
                break;
            case 79833656:
                if (str.equals(NativeAdContent.ViewTag.AD_TITLE)) {
                    zzamVar.a = str2;
                    break;
                }
                break;
            case 428414940:
                if (str.equals(NativeAdContent.ViewTag.AD_DESCRIPTION)) {
                    zzamVar.e = str2;
                    break;
                }
                break;
            case 905239725:
                if (str.equals("DISCSUBTITLE")) {
                    zzamVar.u = str2;
                    break;
                }
                break;
            case 993300766:
                if (str.equals("DISCNUMBER") && (f4 = zzhbj.f(str2)) != null) {
                    zzamVar.v = f4;
                    break;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    zzamVar.d = str2;
                    break;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    zzamVar.b = str2;
                    break;
                }
                break;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzakj.class == obj.getClass()) {
            zzakj zzakjVar = (zzakj) obj;
            if (this.a.equals(zzakjVar.a) && this.b.equals(zzakjVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
    }

    public final String toString() {
        String str = this.a;
        int length = String.valueOf(str).length();
        String str2 = this.b;
        return fc6.o(new StringBuilder(length + 5 + String.valueOf(str2).length()), "VC: ", str, U3.j.b, str2);
    }
}
