package com.google.android.gms.internal.ads;

import com.sofascore.model.mvvm.model.PlayerKt;
import java.util.Locale;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzafl {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final String e;

    public zzafl(int i, int i2, int i3, int i4, String str) {
        this.a = i;
        this.e = str;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01d5, code lost:
    
        if (r4.h(1) > 0) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0204 A[Catch: RuntimeException -> 0x0249, TryCatch #0 {RuntimeException -> 0x0249, blocks: (B:3:0x0008, B:5:0x0019, B:8:0x0037, B:12:0x005b, B:15:0x007f, B:17:0x00c5, B:19:0x00d1, B:21:0x00db, B:23:0x0103, B:25:0x0109, B:27:0x011a, B:29:0x0123, B:31:0x012b, B:33:0x013c, B:35:0x0149, B:37:0x015a, B:39:0x0160, B:41:0x0171, B:43:0x0177, B:45:0x0188, B:47:0x0190, B:49:0x019c, B:51:0x019f, B:54:0x01a2, B:56:0x01b8, B:57:0x01be, B:59:0x01c7, B:60:0x01ca, B:63:0x01d7, B:65:0x01dd, B:67:0x01e2, B:68:0x01e5, B:71:0x01f0, B:72:0x01f7, B:75:0x01fe, B:77:0x0204, B:79:0x0210, B:86:0x0234, B:89:0x023f, B:94:0x0230, B:99:0x01d1), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0210 A[Catch: RuntimeException -> 0x0249, TryCatch #0 {RuntimeException -> 0x0249, blocks: (B:3:0x0008, B:5:0x0019, B:8:0x0037, B:12:0x005b, B:15:0x007f, B:17:0x00c5, B:19:0x00d1, B:21:0x00db, B:23:0x0103, B:25:0x0109, B:27:0x011a, B:29:0x0123, B:31:0x012b, B:33:0x013c, B:35:0x0149, B:37:0x015a, B:39:0x0160, B:41:0x0171, B:43:0x0177, B:45:0x0188, B:47:0x0190, B:49:0x019c, B:51:0x019f, B:54:0x01a2, B:56:0x01b8, B:57:0x01be, B:59:0x01c7, B:60:0x01ca, B:63:0x01d7, B:65:0x01dd, B:67:0x01e2, B:68:0x01e5, B:71:0x01f0, B:72:0x01f7, B:75:0x01fe, B:77:0x0204, B:79:0x0210, B:86:0x0234, B:89:0x023f, B:94:0x0230, B:99:0x01d1), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x023d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzafl a(byte[] bArr) {
        int i;
        int i2;
        int h;
        try {
            zzet zzetVar = new zzet(bArr, bArr.length);
            zzetVar.e();
            int h2 = zzetVar.h(7);
            if (h2 != 1) {
                StringBuilder sb = new StringBuilder(String.valueOf(h2).length() + 26);
                sb.append("Unsupported av1C version: ");
                sb.append(h2);
                zzeh.c(sb.toString());
                return null;
            }
            int h3 = zzetVar.h(3);
            int h4 = zzetVar.h(5);
            boolean g = zzetVar.g();
            int i3 = zzetVar.g() ? true != zzetVar.g() ? 10 : 12 : 8;
            zzetVar.f(13);
            Object[] objArr = {Integer.valueOf(h4)};
            String str = zzfm.a;
            Locale locale = Locale.US;
            String format = String.format(locale, "%02d", objArr);
            String str2 = true != g ? PlayerKt.FOOTBALL_MIDFIELDER : "H";
            String format2 = String.format(locale, "%02d", Integer.valueOf(i3));
            StringBuilder sb2 = new StringBuilder(String.valueOf(h3).length() + 6 + format.length() + 2 + format2.length());
            sb2.append("av01.");
            sb2.append(h3);
            sb2.append(".");
            sb2.append(format);
            sb2.append(str2);
            sb2.append(".");
            sb2.append(format2);
            String sb3 = sb2.toString();
            if (zzetVar.b() <= 0) {
                return new zzafl(i3, -1, -1, -1, sb3);
            }
            zzetVar.e();
            int h5 = zzetVar.h(4);
            if (h5 != 1) {
                StringBuilder sb4 = new StringBuilder(String.valueOf(h5).length() + 22);
                sb4.append("Unsupported obu_type: ");
                sb4.append(h5);
                zzeh.b(sb4.toString());
                return new zzafl(i3, -1, -1, -1, sb3);
            }
            if (zzetVar.g()) {
                zzeh.b("Unsupported obu_extension_flag");
                return new zzafl(i3, -1, -1, -1, sb3);
            }
            boolean g2 = zzetVar.g();
            zzetVar.e();
            if (g2 && zzetVar.h(8) > 127) {
                zzeh.b("Excessive obu_size");
                return new zzafl(i3, -1, -1, -1, sb3);
            }
            int h6 = zzetVar.h(3);
            zzetVar.e();
            if (zzetVar.g()) {
                zzeh.b("Unsupported reduced_still_picture_header");
                return new zzafl(i3, -1, -1, -1, sb3);
            }
            if (zzetVar.g()) {
                zzeh.b("Unsupported timing_info_present_flag");
                return new zzafl(i3, -1, -1, -1, sb3);
            }
            if (zzetVar.g()) {
                zzeh.b("Unsupported initial_display_delay_present_flag");
                return new zzafl(i3, -1, -1, -1, sb3);
            }
            int h7 = zzetVar.h(5);
            boolean z = false;
            for (int i4 = 0; i4 <= h7; i4++) {
                zzetVar.f(12);
                if (zzetVar.h(5) > 7) {
                    zzetVar.e();
                }
            }
            int h8 = zzetVar.h(4);
            int h9 = zzetVar.h(4);
            zzetVar.f(h8 + 1);
            zzetVar.f(h9 + 1);
            if (zzetVar.g()) {
                i = 7;
                zzetVar.f(7);
            } else {
                i = 7;
            }
            zzetVar.f(i);
            boolean g3 = zzetVar.g();
            if (g3) {
                zzetVar.f(2);
            }
            if (!zzetVar.g()) {
            }
            if (!zzetVar.g()) {
                zzetVar.f(1);
            }
            if (g3) {
                zzetVar.f(3);
            }
            zzetVar.f(3);
            boolean g4 = zzetVar.g();
            if (h6 == 2) {
                if (g4) {
                    zzetVar.e();
                }
            } else if (h6 == 1) {
                if (zzetVar.g()) {
                    return new zzafl(i3, -1, -1, -1, sb3);
                }
                int h10 = zzetVar.h(8);
                int h11 = zzetVar.h(8);
                int h12 = zzetVar.h(8);
                if (z || h10 != 1) {
                    i2 = h11;
                } else {
                    if (h11 != 13) {
                        i2 = h11;
                    } else {
                        if (h12 == 0) {
                            i2 = 13;
                            h10 = 1;
                            h = 1;
                            return new zzafl(i3, zzi.b(h10), h != 1 ? 1 : 2, zzi.c(i2), sb3);
                        }
                        i2 = 13;
                    }
                    h10 = 1;
                }
                h = zzetVar.h(1);
                return new zzafl(i3, zzi.b(h10), h != 1 ? 1 : 2, zzi.c(i2), sb3);
            }
            if (zzetVar.g()) {
                z = true;
            }
            if (zzetVar.g()) {
            }
        } catch (RuntimeException e) {
            throw zzat.a(e, "Error parsing AV1 config");
        }
    }
}
