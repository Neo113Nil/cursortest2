package defpackage;

import android.os.Build;
import com.ironsource.mediationsdk.metadata.a;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
/* loaded from: classes.dex */
public final class t05 {

    @NotNull
    public static final s05 Companion = new s05();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public String e;
    public final String f;
    public final String g;
    public int h;
    public int i;
    public Float j;
    public String k;
    public final byte l;
    public byte m;
    public final byte n;
    public final byte o;
    public final vw8 p;
    public final String q;
    public final String r;

    public /* synthetic */ t05(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i2, int i3, Float f, String str8, byte b, byte b2, byte b3, byte b4, vw8 vw8Var, String str9, String str10) {
        if (495 != (i & 495)) {
            oea.z(i, 495, r05.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str5;
        }
        this.f = str6;
        this.g = str7;
        this.h = i2;
        this.i = i3;
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = f;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = str8;
        }
        if ((i & a.o) == 0) {
            this.l = (byte) 0;
        } else {
            this.l = b;
        }
        if ((i & 4096) == 0) {
            this.m = (byte) 0;
        } else {
            this.m = b2;
        }
        if ((i & 8192) == 0) {
            this.n = (byte) 0;
        } else {
            this.n = b3;
        }
        if ((i & 16384) == 0) {
            this.o = (byte) 0;
        } else {
            this.o = b4;
        }
        if ((32768 & i) == 0) {
            this.p = null;
        } else {
            this.p = vw8Var;
        }
        if ((65536 & i) == 0) {
            this.q = null;
        } else {
            this.q = str9;
        }
        if ((i & 131072) == 0) {
            this.r = null;
        } else {
            this.r = str10;
        }
    }

    public t05(String str, String str2, int i, int i2, Float f, String str3, byte b, byte b2) {
        String str4 = Build.MANUFACTURER;
        String str5 = Build.MODEL;
        String str6 = Build.VERSION.RELEASE;
        me4.p(str4, str5, str6);
        this.a = str;
        this.b = str2;
        this.c = str4;
        this.d = str5;
        this.e = null;
        this.f = "android";
        this.g = str6;
        this.h = i;
        this.i = i2;
        this.j = f;
        this.k = str3;
        this.l = (byte) 1;
        this.m = b;
        this.n = (byte) 0;
        this.o = b2;
        this.p = null;
        this.q = null;
        this.r = null;
    }
}
