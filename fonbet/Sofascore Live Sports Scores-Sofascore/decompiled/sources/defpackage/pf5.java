package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.blazesdk.shared.results.r0;
import com.ironsource.U3;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class pf5 {
    public static final pf5 a = new pf5();
    public static final au3 b;
    public static final au3 c;
    public static ghh d;
    public static ghh e;
    public static final ConcurrentHashMap.KeySetView f;
    public static bpm g;
    public static jgm h;
    public static s4m i;
    public static mnm j;

    static {
        hs4 hs4Var = z45.a;
        hq4.c.getClass();
        ack ackVar = ack.c;
        b = ackVar.f0(4);
        c = ackVar.f0(6);
        f = ConcurrentHashMap.newKeySet();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(1:(1:(5:11|12|13|14|15)(2:17|18))(3:19|20|21))(3:29|30|(2:32|33)(2:34|(2:36|28)(1:37)))|22|(2:24|25)(1:26)))|39|6|7|(0)(0)|22|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009a, code lost:
    
        if (r14 == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007f A[Catch: Exception -> 0x009f, TryCatch #0 {Exception -> 0x009f, blocks: (B:12:0x002b, B:13:0x009d, B:20:0x0040, B:22:0x0077, B:24:0x007f, B:26:0x0082, B:30:0x004d, B:32:0x0055, B:34:0x0058), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0082 A[Catch: Exception -> 0x009f, TryCatch #0 {Exception -> 0x009f, blocks: (B:12:0x002b, B:13:0x009d, B:20:0x0040, B:22:0x0077, B:24:0x007f, B:26:0x0082, B:30:0x004d, B:32:0x0055, B:34:0x0058), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(yom yomVar, he2 he2Var, sq3 sq3Var) {
        kym kymVar;
        Object obj;
        int i2;
        yom yomVar2;
        he2 he2Var2;
        String str;
        String str2;
        if (sq3Var instanceof kym) {
            kymVar = (kym) sq3Var;
            int i3 = kymVar.w;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                kymVar.w = i3 - Integer.MIN_VALUE;
                obj = kymVar.v;
                lu3 lu3Var = lu3.a;
                i2 = kymVar.w;
                if (i2 != 0) {
                    y6a.M(obj);
                    String str3 = yomVar.a;
                    if (!f.add(str3)) {
                        return Unit.a;
                    }
                    kymVar.r = yomVar;
                    kymVar.s = he2Var;
                    kymVar.t = str3;
                    kymVar.u = str3;
                    kymVar.w = 1;
                    hs4 hs4Var = z45.a;
                    Object R = xw3.R(hq4.c, new ab4(str3, null), kymVar);
                    if (R == lu3Var) {
                        return lu3Var;
                    }
                    yomVar2 = yomVar;
                    he2Var2 = he2Var;
                    str = str3;
                    str2 = str;
                    obj = R;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        return Unit.a;
                    }
                    String str4 = kymVar.u;
                    String str5 = kymVar.t;
                    he2 he2Var3 = kymVar.s;
                    yom yomVar3 = (yom) kymVar.r;
                    y6a.M(obj);
                    str2 = str4;
                    str = str5;
                    he2Var2 = he2Var3;
                    yomVar2 = yomVar3;
                }
                if (!((Boolean) obj).booleanValue()) {
                    return Unit.a;
                }
                hs4 hs4Var2 = z45.a;
                hq4 hq4Var = hq4.c;
                m0n m0nVar = new m0n(str, yomVar2, str2, he2Var2, null);
                kymVar.r = str;
                kymVar.s = null;
                kymVar.t = null;
                kymVar.u = null;
                kymVar.w = 2;
                obj = xw3.R(hq4Var, m0nVar, kymVar);
            }
        }
        kymVar = new kym(sq3Var);
        obj = kymVar.v;
        lu3 lu3Var2 = lu3.a;
        i2 = kymVar.w;
        if (i2 != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }

    public static void d(File file) {
        File[] listFiles;
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                file2.getClass();
                d(file2);
            }
        }
        file.delete();
    }

    public static void e(List list, ContextWrapper contextWrapper) {
        list.getClass();
        contextWrapper.getClass();
        try {
            xw3.L(s9a.c(c.plus(new gu3(pf5.class.getSimpleName())).plus(new o1n(bu3.a))), null, null, new v(list, contextWrapper, null), 3);
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    public static void f(List list, axm axmVar) {
        uul uulVar;
        Boolean bool;
        list.getClass();
        axmVar.getClass();
        ghh ghhVar = e;
        if (ghhVar == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            int ordinal = ((yom) obj).d.ordinal();
            if (ordinal != 0) {
                boolean z = true;
                if (ordinal == 1) {
                    tul tulVar = jdm.d;
                    boolean booleanValue = (tulVar == null || (uulVar = tulVar.a) == null || (bool = uulVar.p) == null) ? false : bool.booleanValue();
                    if (!(axmVar instanceof qsm) && !(axmVar instanceof tum) && !(axmVar instanceof rvm)) {
                        if (!(axmVar instanceof aum)) {
                            zzl.b();
                            return;
                        }
                        z = false;
                    }
                    if (booleanValue && z) {
                    }
                } else if (ordinal != 2) {
                    zzl.b();
                    return;
                }
            }
            arrayList.add(obj);
        }
        xw3.L(s9a.c(b), null, null, new xc2(arrayList, ghhVar, null), 3);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:0|1|(2:3|(13:5|6|7|(1:(1:(1:(3:12|13|14)(2:16|17))(5:18|19|20|21|(7:23|24|25|(1:27)(1:38)|(5:29|(1:31)|32|(1:34)|35)|13|14)(6:39|25|(0)(0)|(0)|13|14)))(3:47|48|49))(4:61|62|(1:64)|37)|50|51|(3:55|(3:57|21|(0)(0))|37)|24|25|(0)(0)|(0)|13|14))|67|6|7|(0)(0)|50|51|(4:53|55|(0)|37)|24|25|(0)(0)|(0)|13|14|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0132, code lost:
    
        if (r11.d("blaze_data_store_cache_version", r12, r0) == r1) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c1, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00c2, code lost:
    
        r11 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0031, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0135, code lost:
    
        com.blaze.blazesdk.shared.BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(r10, null);
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e6 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:12:0x002c, B:20:0x0042, B:21:0x00aa, B:25:0x00e2, B:27:0x00e6, B:29:0x00ee, B:31:0x0102, B:32:0x0108, B:34:0x010e, B:35:0x0114, B:39:0x00b2, B:43:0x00c9, B:45:0x00cd, B:46:0x00d8, B:48:0x0054, B:51:0x0079, B:53:0x0088, B:55:0x008e, B:62:0x005e), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ee A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:12:0x002c, B:20:0x0042, B:21:0x00aa, B:25:0x00e2, B:27:0x00e6, B:29:0x00ee, B:31:0x0102, B:32:0x0108, B:34:0x010e, B:35:0x0114, B:39:0x00b2, B:43:0x00c9, B:45:0x00cd, B:46:0x00d8, B:48:0x0054, B:51:0x0079, B:53:0x0088, B:55:0x008e, B:62:0x005e), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b2 A[Catch: all -> 0x0031, Exception -> 0x0047, TRY_LEAVE, TryCatch #0 {all -> 0x0031, blocks: (B:12:0x002c, B:20:0x0042, B:21:0x00aa, B:25:0x00e2, B:27:0x00e6, B:29:0x00ee, B:31:0x0102, B:32:0x0108, B:34:0x010e, B:35:0x0114, B:39:0x00b2, B:43:0x00c9, B:45:0x00cd, B:46:0x00d8, B:48:0x0054, B:51:0x0079, B:53:0x0088, B:55:0x008e, B:62:0x005e), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cd A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:12:0x002c, B:20:0x0042, B:21:0x00aa, B:25:0x00e2, B:27:0x00e6, B:29:0x00ee, B:31:0x0102, B:32:0x0108, B:34:0x010e, B:35:0x0114, B:39:0x00b2, B:43:0x00c9, B:45:0x00cd, B:46:0x00d8, B:48:0x0054, B:51:0x0079, B:53:0x0088, B:55:0x008e, B:62:0x005e), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d8 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:12:0x002c, B:20:0x0042, B:21:0x00aa, B:25:0x00e2, B:27:0x00e6, B:29:0x00ee, B:31:0x0102, B:32:0x0108, B:34:0x010e, B:35:0x0114, B:39:0x00b2, B:43:0x00c9, B:45:0x00cd, B:46:0x00d8, B:48:0x0054, B:51:0x0079, B:53:0x0088, B:55:0x008e, B:62:0x005e), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(int i2, File file, sq3 sq3Var) {
        rxm rxmVar;
        Object obj;
        lu3 lu3Var;
        int i3;
        pf5 pf5Var;
        File file2;
        String str;
        int i4;
        vnm vnmVar;
        e5f J;
        ye4 a2;
        z88 data;
        int i5;
        File file3;
        pf5 pf5Var2;
        Object obj2;
        Integer num;
        String str2;
        if (sq3Var instanceof rxm) {
            rxmVar = (rxm) sq3Var;
            int i6 = rxmVar.y;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                rxmVar.y = i6 - Integer.MIN_VALUE;
                obj = rxmVar.w;
                lu3Var = lu3.a;
                i3 = rxmVar.y;
                if (i3 != 0) {
                    y6a.M(obj);
                    vnm vnmVar2 = vnm.a;
                    rxmVar.r = this;
                    rxmVar.s = file;
                    rxmVar.t = vnmVar2;
                    rxmVar.u = "blaze_data_store_cache_version";
                    rxmVar.v = i2;
                    rxmVar.y = 1;
                    if (vnmVar2.c(rxmVar) != lu3Var) {
                        pf5Var = this;
                        file2 = file;
                        str = "blaze_data_store_cache_version";
                        i4 = i2;
                        vnmVar = vnmVar2;
                    }
                    return lu3Var;
                }
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 == 3) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i5 = rxmVar.v;
                    vnmVar = rxmVar.t;
                    file3 = rxmVar.s;
                    pf5Var2 = rxmVar.r;
                    try {
                        y6a.M(obj);
                        str2 = (String) obj;
                    } catch (Exception e2) {
                        Exception e3 = e2;
                        pf5Var = pf5Var2;
                        file2 = file3;
                        i4 = i5;
                        if (e3 instanceof yga) {
                            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(e3, null);
                        } else {
                            r0 r0Var = new r0();
                            r0Var.f = e3;
                            j1m.a(r0Var);
                        }
                        i5 = i4;
                        file3 = file2;
                        pf5Var2 = pf5Var;
                        obj2 = null;
                        num = (Integer) obj2;
                        if ((num == null ? num.intValue() : -1) != i5) {
                        }
                        return Unit.a;
                    }
                    if (str2 == null) {
                        obj2 = vnm.b(vnmVar).fromJson(str2, (Class<Object>) Integer.class);
                        num = (Integer) obj2;
                        if ((num == null ? num.intValue() : -1) != i5) {
                        }
                        return Unit.a;
                    }
                    pf5Var = pf5Var2;
                    file2 = file3;
                    i4 = i5;
                    i5 = i4;
                    file3 = file2;
                    pf5Var2 = pf5Var;
                    obj2 = null;
                    num = (Integer) obj2;
                    if ((num == null ? num.intValue() : -1) != i5) {
                        File file4 = new File(file3, U3.i.I0);
                        File file5 = new File(file3, "mediaPartial");
                        if (file4.exists()) {
                            pf5Var2.getClass();
                            d(file4);
                        }
                        if (file5.exists()) {
                            pf5Var2.getClass();
                            d(file5);
                        }
                        f.clear();
                        d = null;
                        e = null;
                        vnm vnmVar3 = vnm.a;
                        Integer num2 = new Integer(i5);
                        rxmVar.r = null;
                        rxmVar.s = null;
                        rxmVar.t = null;
                        rxmVar.u = null;
                        rxmVar.y = 3;
                    }
                    return Unit.a;
                }
                int i7 = rxmVar.v;
                str = rxmVar.u;
                vnm vnmVar4 = rxmVar.t;
                file2 = rxmVar.s;
                pf5Var = rxmVar.r;
                y6a.M(obj);
                i4 = i7;
                vnmVar = vnmVar4;
                J = f6a.J(str);
                vnm vnmVar5 = vnm.a;
                vnmVar.getClass();
                a2 = vnm.a();
                if (a2 != null && (data = a2.getData()) != null) {
                    vdm vdmVar = new vdm(data, J);
                    rxmVar.r = pf5Var;
                    rxmVar.s = file2;
                    rxmVar.t = vnmVar;
                    rxmVar.u = null;
                    rxmVar.v = i4;
                    rxmVar.y = 2;
                    obj = rd0.y(vdmVar, rxmVar);
                    if (obj != lu3Var) {
                        i5 = i4;
                        file3 = file2;
                        pf5Var2 = pf5Var;
                        str2 = (String) obj;
                        if (str2 == null) {
                        }
                    }
                    return lu3Var;
                }
                i5 = i4;
                file3 = file2;
                pf5Var2 = pf5Var;
                obj2 = null;
                num = (Integer) obj2;
                if ((num == null ? num.intValue() : -1) != i5) {
                }
                return Unit.a;
            }
        }
        rxmVar = new rxm(this, sq3Var);
        obj = rxmVar.w;
        lu3Var = lu3.a;
        i3 = rxmVar.y;
        if (i3 != 0) {
        }
        J = f6a.J(str);
        vnm vnmVar52 = vnm.a;
        vnmVar.getClass();
        a2 = vnm.a();
        if (a2 != null) {
            vdm vdmVar2 = new vdm(data, J);
            rxmVar.r = pf5Var;
            rxmVar.s = file2;
            rxmVar.t = vnmVar;
            rxmVar.u = null;
            rxmVar.v = i4;
            rxmVar.y = 2;
            obj = rd0.y(vdmVar2, rxmVar);
            if (obj != lu3Var) {
            }
            return lu3Var;
        }
        i5 = i4;
        file3 = file2;
        pf5Var2 = pf5Var;
        obj2 = null;
        num = (Integer) obj2;
        if ((num == null ? num.intValue() : -1) != i5) {
        }
        return Unit.a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:0|1|(2:3|(13:5|6|7|(1:(2:10|11)(2:33|34))(3:35|36|(1:38))|12|(2:17|18)|20|(2:25|26)|27|(1:29)|30|31|32))|41|6|7|(0)(0)|12|(3:14|17|18)|20|(3:22|25|26)|27|(0)|30|31|32) */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x002c, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e1, code lost:
    
        defpackage.pf5.d = null;
        defpackage.pf5.e = null;
        com.blaze.blazesdk.shared.BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(r5, null);
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b3 A[Catch: all -> 0x002c, TryCatch #0 {all -> 0x002c, blocks: (B:11:0x0028, B:12:0x006f, B:14:0x008b, B:17:0x0092, B:18:0x0099, B:20:0x009a, B:22:0x00a0, B:25:0x00a7, B:26:0x00ae, B:29:0x00b3, B:30:0x00bb, B:36:0x0038), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Context context, Integer num, int i2, sq3 sq3Var) {
        b1n b1nVar;
        int i3;
        File file;
        File file2;
        if (sq3Var instanceof b1n) {
            b1nVar = (b1n) sq3Var;
            int i4 = b1nVar.v;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                b1nVar.v = i4 - Integer.MIN_VALUE;
                Object obj = b1nVar.t;
                Object obj2 = lu3.a;
                i3 = b1nVar.v;
                if (i3 != 0) {
                    y6a.M(obj);
                    Context applicationContext = context.getApplicationContext();
                    applicationContext.getClass();
                    g = new bpm(applicationContext);
                    h = new jgm(applicationContext);
                    i = new s4m(applicationContext);
                    j = new mnm(applicationContext);
                    File cacheDir = context.getCacheDir();
                    cacheDir.getClass();
                    b1nVar.r = context;
                    b1nVar.s = num;
                    b1nVar.v = 1;
                    if (a(i2, cacheDir, b1nVar) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i3 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    num = b1nVar.s;
                    context = b1nVar.r;
                    y6a.M(obj);
                }
                file = new File(context.getCacheDir(), U3.i.I0);
                file2 = new File(context.getCacheDir(), "mediaPartial");
                if (!file.exists() && !file.mkdirs()) {
                    throw new IOException("Cannot create playback cache directory");
                }
                if (!file2.exists() && !file2.mkdirs()) {
                    throw new IOException("Cannot create prefetch cache directory");
                }
                h5b h5bVar = new h5b((num != null ? Math.min(num.intValue(), 512) : 512) * 1000000);
                h5b h5bVar2 = new h5b(200000000L);
                h9i h9iVar = new h9i(context);
                d = new ghh(file, h5bVar, h9iVar);
                e = new ghh(file2, h5bVar2, h9iVar);
                return Unit.a;
            }
        }
        b1nVar = new b1n(this, sq3Var);
        Object obj3 = b1nVar.t;
        Object obj22 = lu3.a;
        i3 = b1nVar.v;
        if (i3 != 0) {
        }
        file = new File(context.getCacheDir(), U3.i.I0);
        file2 = new File(context.getCacheDir(), "mediaPartial");
        if (!file.exists()) {
            throw new IOException("Cannot create playback cache directory");
        }
        if (!file2.exists()) {
            throw new IOException("Cannot create prefetch cache directory");
        }
        h5b h5bVar3 = new h5b((num != null ? Math.min(num.intValue(), 512) : 512) * 1000000);
        h5b h5bVar22 = new h5b(200000000L);
        h9i h9iVar2 = new h9i(context);
        d = new ghh(file, h5bVar3, h9iVar2);
        e = new ghh(file2, h5bVar22, h9iVar2);
        return Unit.a;
    }
}
