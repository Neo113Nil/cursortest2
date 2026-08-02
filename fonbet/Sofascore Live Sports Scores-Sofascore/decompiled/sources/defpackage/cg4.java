package defpackage;

import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import java.util.List;
import kotlin.Unit;
import kotlin.text.StringsKt__StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class cg4 {
    public final ye4 a;

    public cg4(ye4 ye4Var) {
        this.a = ye4Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, boolean z, sq3 sq3Var) {
        sf4 sf4Var;
        int i;
        Boolean bool;
        if (sq3Var instanceof sf4) {
            sf4Var = (sf4) sq3Var;
            int i2 = sf4Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sf4Var.v = i2 - Integer.MIN_VALUE;
                Object obj = sf4Var.t;
                lu3 lu3Var = lu3.a;
                i = sf4Var.v;
                boolean z2 = true;
                if (i != 0) {
                    y6a.M(obj);
                    z88 data = this.a.getData();
                    sf4Var.r = str;
                    sf4Var.s = z;
                    sf4Var.v = 1;
                    obj = rd0.y(data, sf4Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = sf4Var.s;
                    str = sf4Var.r;
                    y6a.M(obj);
                }
                str.getClass();
                bool = (Boolean) ((p0d) obj).c(new e5f(str));
                if (bool == null) {
                    z2 = bool.booleanValue();
                } else if (!z) {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            }
        }
        sf4Var = new sf4(this, sq3Var);
        Object obj2 = sf4Var.t;
        lu3 lu3Var2 = lu3.a;
        i = sf4Var.v;
        boolean z22 = true;
        if (i != 0) {
        }
        str.getClass();
        bool = (Boolean) ((p0d) obj2).c(new e5f(str));
        if (bool == null) {
        }
        return Boolean.valueOf(z22);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(int i, String str, sq3 sq3Var) {
        tf4 tf4Var;
        int i2;
        Integer num;
        if (sq3Var instanceof tf4) {
            tf4Var = (tf4) sq3Var;
            int i3 = tf4Var.v;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                tf4Var.v = i3 - Integer.MIN_VALUE;
                Object obj = tf4Var.t;
                lu3 lu3Var = lu3.a;
                i2 = tf4Var.v;
                if (i2 != 0) {
                    y6a.M(obj);
                    z88 data = this.a.getData();
                    tf4Var.r = str;
                    tf4Var.s = i;
                    tf4Var.v = 1;
                    obj = rd0.y(data, tf4Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i = tf4Var.s;
                    str = tf4Var.r;
                    y6a.M(obj);
                }
                str.getClass();
                num = (Integer) ((p0d) obj).c(new e5f(str));
                if (num != null) {
                    i = num.intValue();
                }
                return new Integer(i);
            }
        }
        tf4Var = new tf4(this, sq3Var);
        Object obj2 = tf4Var.t;
        lu3 lu3Var2 = lu3.a;
        i2 = tf4Var.v;
        if (i2 != 0) {
        }
        str.getClass();
        num = (Integer) ((p0d) obj2).c(new e5f(str));
        if (num != null) {
        }
        return new Integer(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, sq3 sq3Var) {
        uf4 uf4Var;
        int i;
        String str2;
        List split$default;
        if (sq3Var instanceof uf4) {
            uf4Var = (uf4) sq3Var;
            int i2 = uf4Var.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                uf4Var.u = i2 - Integer.MIN_VALUE;
                Object obj = uf4Var.s;
                lu3 lu3Var = lu3.a;
                i = uf4Var.u;
                if (i != 0) {
                    y6a.M(obj);
                    z88 data = this.a.getData();
                    uf4Var.r = str;
                    uf4Var.u = 1;
                    obj = rd0.y(data, uf4Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = uf4Var.r;
                    y6a.M(obj);
                }
                str2 = (String) ((p0d) obj).c(f6a.J(str));
                if (str2 != null) {
                    return null;
                }
                split$default = StringsKt__StringsKt.split$default(str2, new String[]{BlazeDataSourcePersonalizedType.STRING_SEPARATOR}, false, 0, 6, null);
                return split$default;
            }
        }
        uf4Var = new uf4(this, sq3Var);
        Object obj2 = uf4Var.s;
        lu3 lu3Var2 = lu3.a;
        i = uf4Var.u;
        if (i != 0) {
        }
        str2 = (String) ((p0d) obj2).c(f6a.J(str));
        if (str2 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, sq3 sq3Var) {
        vf4 vf4Var;
        int i;
        if (sq3Var instanceof vf4) {
            vf4Var = (vf4) sq3Var;
            int i2 = vf4Var.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vf4Var.u = i2 - Integer.MIN_VALUE;
                Object obj = vf4Var.s;
                lu3 lu3Var = lu3.a;
                i = vf4Var.u;
                if (i != 0) {
                    y6a.M(obj);
                    z88 data = this.a.getData();
                    vf4Var.r = str;
                    vf4Var.u = 1;
                    obj = rd0.y(data, vf4Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = vf4Var.r;
                    y6a.M(obj);
                }
                str.getClass();
                Long l = (Long) ((p0d) obj).c(new e5f(str));
                return new Long(l == null ? l.longValue() : 0L);
            }
        }
        vf4Var = new vf4(this, sq3Var);
        Object obj2 = vf4Var.s;
        lu3 lu3Var2 = lu3.a;
        i = vf4Var.u;
        if (i != 0) {
        }
        str.getClass();
        Long l2 = (Long) ((p0d) obj2).c(new e5f(str));
        return new Long(l2 == null ? l2.longValue() : 0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0057 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, String str2, sq3 sq3Var) {
        wf4 wf4Var;
        int i;
        if (sq3Var instanceof wf4) {
            wf4Var = (wf4) sq3Var;
            int i2 = wf4Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wf4Var.v = i2 - Integer.MIN_VALUE;
                Object obj = wf4Var.t;
                lu3 lu3Var = lu3.a;
                i = wf4Var.v;
                if (i != 0) {
                    y6a.M(obj);
                    z88 data = this.a.getData();
                    wf4Var.r = str;
                    wf4Var.s = str2;
                    wf4Var.v = 1;
                    obj = rd0.y(data, wf4Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str2 = wf4Var.s;
                    str = wf4Var.r;
                    y6a.M(obj);
                }
                String str3 = (String) ((p0d) obj).c(f6a.J(str));
                return str3 != null ? str2 : str3;
            }
        }
        wf4Var = new wf4(this, sq3Var);
        Object obj2 = wf4Var.t;
        lu3 lu3Var2 = lu3.a;
        i = wf4Var.v;
        if (i != 0) {
        }
        String str32 = (String) ((p0d) obj2).c(f6a.J(str));
        if (str32 != null) {
        }
    }

    public final yf4 f(e5f e5fVar, Object obj) {
        return new yf4(this.a.getData(), e5fVar, obj, 0);
    }

    public final Object g(String str, boolean z, rq3 rq3Var) {
        Object x = o6a.x(this.a, new l84(str, z, (rq3) null), rq3Var);
        return x == lu3.a ? x : Unit.a;
    }

    public final Object h(String str, long j, sq3 sq3Var) {
        Object x = o6a.x(this.a, new ag4(j, str, null), sq3Var);
        return x == lu3.a ? x : Unit.a;
    }

    public final Object i(String str, String str2, hoi hoiVar) {
        Object x = o6a.x(this.a, new bg4(0, str, str2, null), hoiVar);
        return x == lu3.a ? x : Unit.a;
    }
}
