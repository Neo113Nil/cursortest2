package defpackage;

import android.content.Context;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class dz8 {
    public static final dz8 a = new dz8();
    public static final j2d b = new j2d();
    public static final LinkedHashMap c = new LinkedHashMap();

    /* JADX WARN: Removed duplicated region for block: B:13:0x0058 A[Catch: all -> 0x0083, TryCatch #0 {all -> 0x0083, blocks: (B:11:0x004e, B:12:0x0055, B:13:0x0058, B:14:0x007a, B:19:0x0071, B:20:0x0076), top: B:10:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0071 A[Catch: all -> 0x0083, TryCatch #0 {all -> 0x0083, blocks: (B:11:0x004e, B:12:0x0055, B:13:0x0058, B:14:0x007a, B:19:0x0071, B:20:0x0076), top: B:10:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0076 A[Catch: all -> 0x0083, TryCatch #0 {all -> 0x0083, blocks: (B:11:0x004e, B:12:0x0055, B:13:0x0058, B:14:0x007a, B:19:0x0071, B:20:0x0076), top: B:10:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Context context, doa doaVar, String str, sq3 sq3Var) {
        zy8 zy8Var;
        int i;
        j2d j2dVar;
        File v;
        try {
            if (sq3Var instanceof zy8) {
                zy8Var = (zy8) sq3Var;
                int i2 = zy8Var.x;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    zy8Var.x = i2 - Integer.MIN_VALUE;
                    Object obj = zy8Var.v;
                    lu3 lu3Var = lu3.a;
                    i = zy8Var.x;
                    if (i != 0) {
                        y6a.M(obj);
                        zy8Var.r = context;
                        zy8Var.s = doaVar;
                        zy8Var.t = str;
                        j2dVar = b;
                        zy8Var.u = j2dVar;
                        zy8Var.x = 1;
                        if (j2dVar.e(zy8Var) == lu3Var) {
                            return lu3Var;
                        }
                    } else {
                        if (i != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        j2d j2dVar2 = zy8Var.u;
                        str = zy8Var.t;
                        doaVar = zy8Var.s;
                        Context context2 = zy8Var.r;
                        y6a.M(obj);
                        j2dVar = j2dVar2;
                        context = context2;
                    }
                    c.remove(str);
                    switch (doaVar.a) {
                        case 0:
                            v = gvd.v(context, str);
                            break;
                        case 1:
                            v = b6a.y(context, str);
                            break;
                        default:
                            context.getClass();
                            str.getClass();
                            v = b6a.y(context, "widget_preferences_" + str);
                            break;
                    }
                    v.delete();
                    j2dVar.f(null);
                    return Unit.a;
                }
            }
            c.remove(str);
            switch (doaVar.a) {
            }
            v.delete();
            j2dVar.f(null);
            return Unit.a;
        } catch (Throwable th) {
            j2dVar.f(null);
            throw th;
        }
        zy8Var = new zy8(this, sq3Var);
        Object obj2 = zy8Var.v;
        lu3 lu3Var2 = lu3.a;
        i = zy8Var.x;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x006a, code lost:
    
        if (r11.e(r0) == r15) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0075 A[Catch: all -> 0x00b9, TryCatch #1 {all -> 0x00b9, blocks: (B:27:0x006d, B:29:0x0075, B:30:0x0081, B:31:0x0084, B:35:0x008e, B:36:0x0098), top: B:26:0x006d }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Context context, doa doaVar, String str, sq3 sq3Var) {
        az8 az8Var;
        int i;
        j2d j2dVar;
        h2d h2dVar;
        Throwable th;
        Object obj;
        Object k;
        Map map;
        try {
            if (sq3Var instanceof az8) {
                az8Var = (az8) sq3Var;
                int i2 = az8Var.x;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    az8Var.x = i2 - Integer.MIN_VALUE;
                    Object obj2 = az8Var.v;
                    lu3 lu3Var = lu3.a;
                    i = az8Var.x;
                    int i3 = 2;
                    int i4 = 1;
                    if (i != 0) {
                        y6a.M(obj2);
                        az8Var.r = context;
                        az8Var.s = doaVar;
                        az8Var.t = str;
                        j2dVar = b;
                        az8Var.u = j2dVar;
                        az8Var.x = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            map = (Map) az8Var.t;
                            h2dVar = (h2d) az8Var.s;
                            str = (String) az8Var.r;
                            try {
                                y6a.M(obj2);
                                obj = (ye4) obj2;
                                map.put(str, obj);
                                obj.getClass();
                                ye4 ye4Var = (ye4) obj;
                                h2dVar.f(null);
                                return ye4Var;
                            } catch (Throwable th2) {
                                th = th2;
                                h2dVar.f(null);
                                throw th;
                            }
                        }
                        j2d j2dVar2 = az8Var.u;
                        str = (String) az8Var.t;
                        doaVar = (doa) az8Var.s;
                        Context context2 = (Context) az8Var.r;
                        y6a.M(obj2);
                        j2dVar = j2dVar2;
                        context = context2;
                    }
                    LinkedHashMap linkedHashMap = c;
                    obj = linkedHashMap.get(str);
                    if (obj == null) {
                        h2dVar = j2dVar;
                        obj.getClass();
                        ye4 ye4Var2 = (ye4) obj;
                        h2dVar.f(null);
                        return ye4Var2;
                    }
                    az8Var.r = str;
                    az8Var.s = j2dVar;
                    az8Var.t = linkedHashMap;
                    az8Var.u = null;
                    az8Var.x = 2;
                    switch (doaVar.a) {
                        case 0:
                            k = f8h.k(xna.a, null, null, null, new coa(context, str, 0), 14);
                            break;
                        case 1:
                            k = f7a.k(new coa(context, str, i4));
                            break;
                        default:
                            k = f7a.k(new feh(context, str, i3));
                            break;
                    }
                    if (k != lu3Var) {
                        h2dVar = j2dVar;
                        obj2 = k;
                        map = linkedHashMap;
                        obj = (ye4) obj2;
                        map.put(str, obj);
                        obj.getClass();
                        ye4 ye4Var22 = (ye4) obj;
                        h2dVar.f(null);
                        return ye4Var22;
                    }
                    return lu3Var;
                }
            }
            LinkedHashMap linkedHashMap2 = c;
            obj = linkedHashMap2.get(str);
            if (obj == null) {
            }
        } catch (Throwable th3) {
            h2dVar = j2dVar;
            th = th3;
            h2dVar.f(null);
            throw th;
        }
        az8Var = new az8(this, sq3Var);
        Object obj22 = az8Var.v;
        lu3 lu3Var2 = lu3.a;
        i = az8Var.x;
        int i32 = 2;
        int i42 = 1;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003e, code lost:
    
        if (r9 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Context context, doa doaVar, String str, sq3 sq3Var) {
        bz8 bz8Var;
        int i;
        if (sq3Var instanceof bz8) {
            bz8Var = (bz8) sq3Var;
            int i2 = bz8Var.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bz8Var.t = i2 - Integer.MIN_VALUE;
                Object obj = bz8Var.r;
                Object obj2 = lu3.a;
                i = bz8Var.t;
                if (i != 0) {
                    y6a.M(obj);
                    bz8Var.t = 1;
                    obj = b(context, doaVar, str, bz8Var);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            y6a.M(obj);
                            return obj;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                z88 data = ((ye4) obj).getData();
                bz8Var.t = 2;
                Object y = rd0.y(data, bz8Var);
                return y != obj2 ? obj2 : y;
            }
        }
        bz8Var = new bz8(this, sq3Var);
        Object obj3 = bz8Var.r;
        Object obj22 = lu3.a;
        i = bz8Var.t;
        if (i != 0) {
        }
        z88 data2 = ((ye4) obj3).getData();
        bz8Var.t = 2;
        Object y2 = rd0.y(data2, bz8Var);
        if (y2 != obj22) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
    
        if (r11 == r1) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0057 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(Context context, doa doaVar, String str, Function2 function2, sq3 sq3Var) {
        cz8 cz8Var;
        int i;
        Function2 function22;
        if (sq3Var instanceof cz8) {
            cz8Var = (cz8) sq3Var;
            int i2 = cz8Var.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cz8Var.u = i2 - Integer.MIN_VALUE;
                Object obj = cz8Var.s;
                Object obj2 = lu3.a;
                i = cz8Var.u;
                if (i != 0) {
                    y6a.M(obj);
                    cz8Var.r = (hoi) function2;
                    cz8Var.u = 1;
                    obj = b(context, doaVar, str, cz8Var);
                    function22 = function2;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            y6a.M(obj);
                            return obj;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Function2 function23 = (Function2) cz8Var.r;
                    y6a.M(obj);
                    function22 = function23;
                }
                cz8Var.r = null;
                cz8Var.u = 2;
                Object a2 = ((ye4) obj).a(function22, cz8Var);
                return a2 != obj2 ? obj2 : a2;
            }
        }
        cz8Var = new cz8(this, sq3Var);
        Object obj3 = cz8Var.s;
        Object obj22 = lu3.a;
        i = cz8Var.u;
        if (i != 0) {
        }
        cz8Var.r = null;
        cz8Var.u = 2;
        Object a22 = ((ye4) obj3).a(function22, cz8Var);
        if (a22 != obj22) {
        }
    }
}
