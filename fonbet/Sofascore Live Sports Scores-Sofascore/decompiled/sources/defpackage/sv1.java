package defpackage;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.unity3d.services.UnityAdsConstants;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
/* loaded from: classes.dex */
public final class sv1 {

    @NotNull
    public static final rv1 Companion = new rv1();
    public static final joa[] t;
    public final String a;
    public final String b;
    public final String[] c;
    public final int d;
    public final float e;
    public final String f;
    public final String g;
    public final int h;
    public final int i;
    public final byte j;
    public final String k;
    public final String l;
    public final String m;
    public final byte n;
    public final String o;
    public final Map p;
    public final int q;
    public final int r;
    public final Map s;

    static {
        ysa ysaVar = ysa.b;
        t = new joa[]{null, null, ypa.a(ysaVar, mz.H), null, null, null, null, null, null, null, null, null, null, null, null, ypa.a(ysaVar, mz.I), null, null, ypa.a(ysaVar, mz.J)};
    }

    public sv1(int i, String str, String str2, String[] strArr, int i2, float f, String str3, String str4, int i3, int i4, byte b, String str5, String str6, String str7, byte b2, String str8, Map map, int i5, int i6, Map map2) {
        Map map3;
        Map map4;
        if (17411 != (i & 17411)) {
            oea.z(i, 17411, qv1.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = strArr;
        }
        if ((i & 8) == 0) {
            this.d = 0;
        } else {
            this.d = i2;
        }
        if ((i & 16) == 0) {
            this.e = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        } else {
            this.e = f;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str3;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str4;
        }
        if ((i & 128) == 0) {
            this.h = 0;
        } else {
            this.h = i3;
        }
        if ((i & NotificationCompat.FLAG_LOCAL_ONLY) == 0) {
            this.i = 0;
        } else {
            this.i = i4;
        }
        if ((i & 512) == 0) {
            this.j = (byte) 0;
        } else {
            this.j = b;
        }
        this.k = str5;
        this.l = (i & a.o) == 0 ? "" : str6;
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = str7;
        }
        if ((i & 8192) == 0) {
            this.n = (byte) 0;
        } else {
            this.n = b2;
        }
        this.o = str8;
        if ((32768 & i) == 0) {
            map3 = lm5.a;
            map3.getClass();
        } else {
            map3 = map;
        }
        this.p = map3;
        if ((65536 & i) == 0) {
            this.q = 0;
        } else {
            this.q = i5;
        }
        this.r = (131072 & i) == 0 ? -1 : i6;
        if ((i & 262144) == 0) {
            map4 = lm5.a;
            map4.getClass();
        } else {
            map4 = map2;
        }
        this.s = map4;
    }
}
