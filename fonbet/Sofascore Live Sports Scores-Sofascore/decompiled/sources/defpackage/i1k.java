package defpackage;

import android.content.Context;
import android.content.Intent;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import com.facebook.internal.d;
import com.google.android.gms.internal.playcore_hsdp.zzg;
import com.google.android.gms.internal.playcore_hsdp.zzj;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class i1k {
    public static final String[] l = {"INSERT", "UPDATE", "DELETE"};
    public boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;

    public i1k(k6g k6gVar, HashMap hashMap, HashMap hashMap2, String[] strArr, boolean z, s26 s26Var) {
        String str;
        this.b = k6gVar;
        this.c = hashMap;
        this.d = hashMap2;
        this.a = z;
        this.e = s26Var;
        this.j = new AtomicBoolean(false);
        this.k = new wc4(21);
        this.f = new LinkedHashMap();
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            String str2 = strArr[i];
            Locale locale = Locale.ROOT;
            String lowerCase = str2.toLowerCase(locale);
            lowerCase.getClass();
            ((LinkedHashMap) this.f).put(lowerCase, Integer.valueOf(i));
            String str3 = (String) ((HashMap) this.c).get(strArr[i]);
            if (str3 != null) {
                str = str3.toLowerCase(locale);
                str.getClass();
            } else {
                str = null;
            }
            if (str != null) {
                lowerCase = str;
            }
            strArr2[i] = lowerCase;
        }
        this.g = strArr2;
        for (Map.Entry entry : ((HashMap) this.c).entrySet()) {
            String str4 = (String) entry.getValue();
            Locale locale2 = Locale.ROOT;
            String lowerCase2 = str4.toLowerCase(locale2);
            lowerCase2.getClass();
            if (((LinkedHashMap) this.f).containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(locale2);
                lowerCase3.getClass();
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.f;
                linkedHashMap.put(lowerCase3, tub.e(lowerCase2, linkedHashMap));
            }
        }
        this.h = new pkd(((String[]) this.g).length);
        this.i = new yia(((String[]) this.g).length);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if (r4 == r6) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(i0f i0fVar, sq3 sq3Var) {
        b1k b1kVar;
        int i;
        Set set;
        if (sq3Var instanceof b1k) {
            b1kVar = (b1k) sq3Var;
            int i2 = b1kVar.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                b1kVar.u = i2 - Integer.MIN_VALUE;
                Object obj = b1kVar.s;
                lu3 lu3Var = lu3.a;
                i = b1kVar.u;
                if (i != 0) {
                    y6a.M(obj);
                    crj crjVar = new crj(11);
                    b1kVar.r = i0fVar;
                    b1kVar.u = 1;
                    obj = i0fVar.c("SELECT * FROM room_table_modification_log WHERE invalidated = 1", crjVar, b1kVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Set set2 = (Set) b1kVar.r;
                        y6a.M(obj);
                        return set2;
                    }
                    i0fVar = (i0f) b1kVar.r;
                    y6a.M(obj);
                }
                set = (Set) obj;
                if (!set.isEmpty()) {
                    b1kVar.r = set;
                    b1kVar.u = 2;
                    if (v7a.n(i0fVar, "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1", b1kVar) == lu3Var) {
                        return lu3Var;
                    }
                }
                return set;
            }
        }
        b1kVar = new b1k(this, sq3Var);
        Object obj2 = b1kVar.s;
        lu3 lu3Var2 = lu3.a;
        i = b1kVar.u;
        if (i != 0) {
        }
        set = (Set) obj2;
        if (!set.isEmpty()) {
        }
        return set;
    }

    public List b() {
        gxh gxhVar;
        if (Build.VERSION.SDK_INT >= 32 && (gxhVar = (gxh) this.h) != null) {
            return gxhVar.b();
        }
        av9 av9Var = hv9.b;
        return vvf.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x008d A[Catch: all -> 0x002f, TryCatch #1 {all -> 0x002f, blocks: (B:11:0x002b, B:12:0x0082, B:14:0x008d, B:17:0x00c7, B:19:0x009b, B:20:0x009f, B:22:0x00ac, B:24:0x00b6, B:26:0x00bc, B:27:0x00ba, B:30:0x00c1), top: B:10:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object c(sq3 sq3Var) {
        d1k d1kVar;
        int i;
        cz2 cz2Var;
        Set set;
        Object value;
        int[] iArr;
        k6g k6gVar = (k6g) this.b;
        if (sq3Var instanceof d1k) {
            d1kVar = (d1k) sq3Var;
            int i2 = d1kVar.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                d1kVar.u = i2 - Integer.MIN_VALUE;
                Object obj = d1kVar.s;
                lu3 lu3Var = lu3.a;
                i = d1kVar.u;
                rq3 rq3Var = null;
                int i3 = 1;
                if (i != 0) {
                    y6a.M(obj);
                    cz2 closeBarrier$room_runtime = k6gVar.getCloseBarrier$room_runtime();
                    if (!closeBarrier$room_runtime.a()) {
                        return rm5.a;
                    }
                    try {
                        if (!((AtomicBoolean) this.j).compareAndSet(true, false)) {
                            rm5 rm5Var = rm5.a;
                            closeBarrier$room_runtime.b();
                            return rm5Var;
                        }
                        if (!((Boolean) ((Function0) this.k).invoke()).booleanValue()) {
                            rm5 rm5Var2 = rm5.a;
                            closeBarrier$room_runtime.b();
                            return rm5Var2;
                        }
                        e1k e1kVar = new e1k(this, rq3Var, i3);
                        d1kVar.r = closeBarrier$room_runtime;
                        d1kVar.u = 1;
                        Object useConnection = k6gVar.useConnection(false, e1kVar, d1kVar);
                        if (useConnection == lu3Var) {
                            return lu3Var;
                        }
                        cz2Var = closeBarrier$room_runtime;
                        obj = useConnection;
                    } catch (Throwable th) {
                        th = th;
                        cz2Var = closeBarrier$room_runtime;
                        cz2Var.b();
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cz2Var = d1kVar.r;
                    try {
                        y6a.M(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        cz2Var.b();
                        throw th;
                    }
                }
                set = (Set) obj;
                if (!set.isEmpty()) {
                    yia yiaVar = (yia) this.i;
                    set.getClass();
                    if (!set.isEmpty()) {
                        fdi fdiVar = (fdi) yiaVar.b;
                        do {
                            value = fdiVar.getValue();
                            int[] iArr2 = (int[]) value;
                            int length = iArr2.length;
                            iArr = new int[length];
                            for (int i4 = 0; i4 < length; i4++) {
                                iArr[i4] = set.contains(Integer.valueOf(i4)) ? iArr2[i4] + 1 : iArr2[i4];
                            }
                        } while (!fdiVar.k(value, iArr));
                    }
                    ((s26) this.e).invoke(set);
                }
                cz2Var.b();
                return set;
            }
        }
        d1kVar = new d1k(this, sq3Var);
        Object obj2 = d1kVar.s;
        lu3 lu3Var2 = lu3.a;
        i = d1kVar.u;
        rq3 rq3Var2 = null;
        int i32 = 1;
        if (i != 0) {
        }
        set = (Set) obj2;
        if (!set.isEmpty()) {
        }
        cz2Var.b();
        return set;
    }

    public void d(jn0 jn0Var) {
        if (!this.a || jn0Var.equals((jn0) this.i)) {
            return;
        }
        this.i = jn0Var;
        mp0 mp0Var = (mp0) ((l1) this.c).b;
        mp0Var.f();
        jn0 jn0Var2 = mp0Var.g;
        if (jn0Var2 == null || jn0Var.equals(jn0Var2)) {
            return;
        }
        mp0Var.g = jn0Var;
        vdb vdbVar = mp0Var.e;
        if (vdbVar != null) {
            vdbVar.g(-1, new a70(14));
        }
    }

    public void e(Function0 function0, Function0 function02) {
        function0.getClass();
        function02.getClass();
        if (((AtomicBoolean) this.j).compareAndSet(false, true)) {
            function0.invoke();
            xw3.L(((k6g) this.b).getCoroutineScope(), new gu3("Room Invalidation Tracker Refresh"), null, new vki(this, function02, null, 20), 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00d7, code lost:
    
        if (defpackage.v7a.n(r11, r3, r4) == r5) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00d9, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0075, code lost:
    
        if (defpackage.v7a.n(r1, r3, r4) == r5) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Type inference failed for: r2v6, types: [i0f] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00d7 -> B:11:0x00da). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object f(avj avjVar, int i, sq3 sq3Var) {
        f1k f1kVar;
        int i2;
        int i3;
        int i4;
        String[] strArr;
        i0f i0fVar;
        int i5;
        String str;
        avj avjVar2 = avjVar;
        int i6 = i;
        if (sq3Var instanceof f1k) {
            f1kVar = (f1k) sq3Var;
            int i7 = f1kVar.z;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                f1kVar.z = i7 - Integer.MIN_VALUE;
                Object obj = f1kVar.x;
                lu3 lu3Var = lu3.a;
                i2 = f1kVar.z;
                boolean z = true;
                if (i2 != 0) {
                    y6a.M(obj);
                    String str2 = "INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i6 + ", 0)";
                    f1kVar.r = avjVar2;
                    f1kVar.u = i6;
                    f1kVar.z = 1;
                } else if (i2 == 1) {
                    int i8 = f1kVar.u;
                    ?? r2 = f1kVar.r;
                    y6a.M(obj);
                    i6 = i8;
                    avjVar2 = r2;
                } else {
                    if (i2 != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i5 = f1kVar.w;
                    i4 = f1kVar.v;
                    i3 = f1kVar.u;
                    strArr = f1kVar.t;
                    str = f1kVar.s;
                    i0fVar = f1kVar.r;
                    y6a.M(obj);
                    boolean z2 = true;
                    i4++;
                    z = z2;
                    if (i4 >= i5) {
                        return Unit.a;
                    }
                    String str3 = strArr[i4];
                    z2 = z;
                    StringBuilder s = mz1.s("CREATE ", this.a ? "TEMP" : "", " TRIGGER IF NOT EXISTS `", "room_table_modification_trigger_" + str + '_' + str3, "` AFTER ");
                    bf3.v(s, str3, " ON `", str, "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = ");
                    String h = fc6.h(i3, " AND invalidated = 0; END", s);
                    f1kVar.r = i0fVar;
                    f1kVar.s = str;
                    f1kVar.t = strArr;
                    f1kVar.u = i3;
                    f1kVar.v = i4;
                    f1kVar.w = i5;
                    f1kVar.z = 2;
                }
                String str4 = ((String[]) this.g)[i6];
                i3 = i6;
                i4 = 0;
                strArr = l;
                i0fVar = avjVar2;
                i5 = 3;
                str = str4;
                if (i4 >= i5) {
                }
            }
        }
        f1kVar = new f1k(this, sq3Var);
        Object obj2 = f1kVar.x;
        lu3 lu3Var2 = lu3.a;
        i2 = f1kVar.z;
        boolean z3 = true;
        if (i2 != 0) {
        }
        String str42 = ((String[]) this.g)[i6];
        i3 = i6;
        i4 = 0;
        strArr = l;
        i0fVar = avjVar2;
        i5 = 3;
        str = str42;
        if (i4 >= i5) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r4v4, types: [i0f] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0080 -> B:10:0x0083). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object g(avj avjVar, int i, sq3 sq3Var) {
        g1k g1kVar;
        int i2;
        String str;
        int i3;
        avj avjVar2;
        int i4;
        String[] strArr;
        if (sq3Var instanceof g1k) {
            g1kVar = (g1k) sq3Var;
            int i5 = g1kVar.y;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                g1kVar.y = i5 - Integer.MIN_VALUE;
                Object obj = g1kVar.w;
                lu3 lu3Var = lu3.a;
                i2 = g1kVar.y;
                if (i2 != 0) {
                    y6a.M(obj);
                    str = ((String[]) this.g)[i];
                    i3 = 3;
                    avjVar2 = avjVar;
                    i4 = 0;
                    strArr = l;
                    if (i4 < i3) {
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i3 = g1kVar.v;
                    i4 = g1kVar.u;
                    String[] strArr2 = g1kVar.t;
                    str = g1kVar.s;
                    ?? r4 = g1kVar.r;
                    y6a.M(obj);
                    strArr = strArr2;
                    avjVar2 = r4;
                    i4++;
                    if (i4 < i3) {
                        String j = dmi.j('`', "DROP TRIGGER IF EXISTS `", "room_table_modification_trigger_" + str + '_' + strArr[i4]);
                        g1kVar.r = avjVar2;
                        g1kVar.s = str;
                        g1kVar.t = strArr;
                        g1kVar.u = i4;
                        g1kVar.v = i3;
                        g1kVar.y = 1;
                        if (v7a.n(avjVar2, j, g1kVar) == lu3Var) {
                            return lu3Var;
                        }
                        i4++;
                        if (i4 < i3) {
                            return Unit.a;
                        }
                    }
                }
            }
        }
        g1kVar = new g1k(this, sq3Var);
        Object obj2 = g1kVar.w;
        lu3 lu3Var2 = lu3.a;
        i2 = g1kVar.y;
        if (i2 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object h(sq3 sq3Var) {
        h1k h1kVar;
        int i;
        Throwable th;
        cz2 cz2Var;
        k6g k6gVar = (k6g) this.b;
        if (sq3Var instanceof h1k) {
            h1kVar = (h1k) sq3Var;
            int i2 = h1kVar.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                h1kVar.u = i2 - Integer.MIN_VALUE;
                Object obj = h1kVar.s;
                lu3 lu3Var = lu3.a;
                i = h1kVar.u;
                rq3 rq3Var = null;
                if (i != 0) {
                    y6a.M(obj);
                    cz2 closeBarrier$room_runtime = k6gVar.getCloseBarrier$room_runtime();
                    if (closeBarrier$room_runtime.a()) {
                        try {
                            h4i h4iVar = new h4i(this, rq3Var, 23);
                            h1kVar.r = closeBarrier$room_runtime;
                            h1kVar.u = 1;
                            if (k6gVar.useConnection(false, h4iVar, h1kVar) == lu3Var) {
                                return lu3Var;
                            }
                            cz2Var = closeBarrier$room_runtime;
                        } catch (Throwable th2) {
                            th = th2;
                            cz2Var = closeBarrier$room_runtime;
                            cz2Var.b();
                            throw th;
                        }
                    }
                    return Unit.a;
                }
                if (i != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                cz2Var = h1kVar.r;
                try {
                    y6a.M(obj);
                } catch (Throwable th3) {
                    th = th3;
                    cz2Var.b();
                    throw th;
                }
                cz2Var.b();
                return Unit.a;
            }
        }
        h1kVar = new h1k(this, sq3Var);
        Object obj2 = h1kVar.s;
        lu3 lu3Var2 = lu3.a;
        i = h1kVar.u;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
        cz2Var.b();
        return Unit.a;
    }

    public void i() {
        List b = b();
        Context context = (Context) this.b;
        an0 an0Var = (an0) this.k;
        AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) this.j;
        vvf vvfVar = jn0.e;
        d(jn0.b(context, fn0.f("android.media.action.HDMI_AUDIO_PLUG", context, null), an0Var, audioDeviceInfo, b));
    }

    public Pair j(String[] strArr) {
        c9h c9hVar = new c9h();
        for (String str : strArr) {
            HashMap hashMap = (HashMap) this.d;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            Set set = (Set) hashMap.get(lowerCase);
            if (set != null) {
                c9hVar.addAll(set);
            } else {
                c9hVar.add(str);
            }
        }
        String[] strArr2 = (String[]) w9h.a(c9hVar).toArray(new String[0]);
        int length = strArr2.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            String str2 = strArr2[i];
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.f;
            String lowerCase2 = str2.toLowerCase(Locale.ROOT);
            lowerCase2.getClass();
            Integer num = (Integer) linkedHashMap.get(lowerCase2);
            if (num == null) {
                a70.p("There is no table with name ".concat(str2));
                return null;
            }
            iArr[i] = num.intValue();
        }
        return new Pair(strArr2, iArr);
    }

    public void k(Runnable runnable) {
        m(new pyn(29, this, runnable));
    }

    public void l() {
        Iterator it = ((CopyOnWriteArrayList) this.f).iterator();
        while (it.hasNext()) {
            rfn rfnVar = (rfn) it.next();
            ((Handler) ((zzg) rfnVar.b.b).zza()).post(new dno(rfnVar, 24));
        }
    }

    public void m(Runnable runnable) {
        ((Handler) ((zzg) this.b).zza()).post(new pc(4, runnable));
    }

    public i1k(Context context, l1 l1Var, an0 an0Var, AudioDeviceInfo audioDeviceInfo) {
        i1k i1kVar;
        Context applicationContext = context.getApplicationContext();
        this.b = applicationContext;
        this.c = l1Var;
        this.k = an0Var;
        this.j = audioDeviceInfo;
        String str = nik.a;
        Looper myLooper = Looper.myLooper();
        ln0 ln0Var = null;
        Handler handler = new Handler(myLooper == null ? Looper.getMainLooper() : myLooper, null);
        this.d = handler;
        this.e = new kn0(this, 0);
        this.f = new d(this, 2);
        vvf vvfVar = jn0.e;
        String str2 = Build.MANUFACTURER;
        Uri uriFor = (str2.equals("Amazon") || str2.equals("Xiaomi")) ? Settings.Global.getUriFor("external_surround_sound_enabled") : null;
        if (uriFor != null) {
            i1kVar = this;
            ln0Var = new ln0(i1kVar, handler, applicationContext.getContentResolver(), uriFor, 0);
        } else {
            i1kVar = this;
        }
        i1kVar.g = ln0Var;
    }

    public i1k(Context context, String str, Intent intent, eln elnVar) {
        this.e = new ArrayList();
        this.f = new CopyOnWriteArrayList();
        this.c = context;
        this.d = str;
        this.g = intent;
        this.h = elnVar;
        this.b = zzj.a(new k02(str));
        this.i = new fnn(this, 0);
    }
}
