package defpackage;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
/* loaded from: classes.dex */
public final class pv1 {

    @NotNull
    public static final ov1 Companion = new ov1();
    public static final joa[] m;
    public static final bga n;
    public final hw9[] a;
    public ja0 b;
    public t05 c;
    public tm8 d;
    public wek e;
    public final byte f;
    public final int g;
    public final String[] h;
    public dwh i;
    public uvf j;
    public ygh k;
    public final Map l;

    static {
        ysa ysaVar = ysa.b;
        m = new joa[]{ypa.a(ysaVar, mz.E), null, null, null, null, null, null, ypa.a(ysaVar, mz.F), null, null, null, ypa.a(ysaVar, mz.G)};
        n = cga.c(ry.G);
    }

    public /* synthetic */ pv1(int i, hw9[] hw9VarArr, ja0 ja0Var, t05 t05Var, tm8 tm8Var, wek wekVar, byte b, int i2, String[] strArr, dwh dwhVar, uvf uvfVar, ygh yghVar, Map map) {
        if ((i & 1) == 0) {
            this.a = new hw9[0];
        } else {
            this.a = hw9VarArr;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = ja0Var;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = t05Var;
        }
        if ((i & 8) == 0) {
            this.d = new tm8(0, 0);
        } else {
            this.d = tm8Var;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = wekVar;
        }
        if ((i & 32) == 0) {
            this.f = (byte) 0;
        } else {
            this.f = b;
        }
        if ((i & 64) == 0) {
            this.g = 500;
        } else {
            this.g = i2;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = strArr;
        }
        if ((i & NotificationCompat.FLAG_LOCAL_ONLY) == 0) {
            this.i = null;
        } else {
            this.i = dwhVar;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = uvfVar;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = yghVar;
        }
        if ((i & a.o) == 0) {
            this.l = new LinkedHashMap();
        } else {
            this.l = map;
        }
    }

    public pv1(hw9[] hw9VarArr, dwh dwhVar) {
        tm8 tm8Var = new tm8(0, 0);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.a = hw9VarArr;
        this.b = null;
        this.c = null;
        this.d = tm8Var;
        this.e = null;
        this.f = (byte) 0;
        this.g = 500;
        this.h = null;
        this.i = dwhVar;
        this.j = null;
        this.k = null;
        this.l = linkedHashMap;
    }
}
