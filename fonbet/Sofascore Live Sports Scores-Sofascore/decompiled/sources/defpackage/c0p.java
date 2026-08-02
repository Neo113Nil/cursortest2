package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.internal.measurement.zzagp;
import com.google.android.gms.internal.measurement.zzle;
import com.google.android.gms.internal.measurement.zzlf;
import com.google.android.gms.internal.measurement.zzlg;
import com.google.android.gms.internal.measurement.zzlk;
import com.google.android.gms.internal.measurement.zzlz;
import com.google.android.gms.internal.measurement.zzom;
import com.google.android.gms.internal.measurement.zzpg;
import com.google.android.gms.internal.measurement.zzph;
import com.google.android.gms.internal.measurement.zzps;
import java.io.IOException;
import java.util.logging.Level;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class c0p implements zzom {
    public final String a;
    public final zzph b;
    public volatile int c = -1;
    public zzps d;

    public c0p(String str, zzph zzphVar) {
        this.a = str;
        this.b = zzphVar;
    }

    public abstract Object a();

    public abstract Object b(String str);

    public abstract Object c(Object obj);

    public abstract Object d();

    public abstract void e(Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0144 A[Catch: all -> 0x00e8, TryCatch #4 {all -> 0x00e8, blocks: (B:59:0x00d3, B:61:0x00d7, B:62:0x00ec, B:64:0x00f6, B:66:0x0108, B:68:0x0116, B:74:0x0137, B:76:0x0144, B:77:0x014a, B:79:0x015a, B:81:0x0162, B:82:0x017a, B:95:0x018d, B:84:0x0197, B:88:0x01a1, B:90:0x01a7, B:91:0x01ac, B:97:0x0192, B:99:0x013c, B:100:0x012b, B:101:0x0123, B:103:0x01ae), top: B:58:0x00d3, inners: #0, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01a1 A[Catch: all -> 0x00e8, TryCatch #4 {all -> 0x00e8, blocks: (B:59:0x00d3, B:61:0x00d7, B:62:0x00ec, B:64:0x00f6, B:66:0x0108, B:68:0x0116, B:74:0x0137, B:76:0x0144, B:77:0x014a, B:79:0x015a, B:81:0x0162, B:82:0x017a, B:95:0x018d, B:84:0x0197, B:88:0x01a1, B:90:0x01a7, B:91:0x01ac, B:97:0x0192, B:99:0x013c, B:100:0x012b, B:101:0x0123, B:103:0x01ae), top: B:58:0x00d3, inners: #0, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a7 A[Catch: all -> 0x00e8, TryCatch #4 {all -> 0x00e8, blocks: (B:59:0x00d3, B:61:0x00d7, B:62:0x00ec, B:64:0x00f6, B:66:0x0108, B:68:0x0116, B:74:0x0137, B:76:0x0144, B:77:0x014a, B:79:0x015a, B:81:0x0162, B:82:0x017a, B:95:0x018d, B:84:0x0197, B:88:0x01a1, B:90:0x01a7, B:91:0x01ac, B:97:0x0192, B:99:0x013c, B:100:0x012b, B:101:0x0123, B:103:0x01ae), top: B:58:0x00d3, inners: #0, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x018d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.tmi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get() {
        zzpg zzpgVar;
        Object obj;
        String str;
        Object obj2;
        fhh fhhVar;
        boolean z;
        zzlk zzlkVar;
        Object applicationContext;
        if (tgj.k == null) {
            Object obj3 = zzlk.j;
            tgj.k = new wo0();
        }
        Context context = (Context) zzlk.k.get();
        Object obj4 = null;
        if (context == null) {
            synchronized (tgj.i) {
            }
            a70.r("Must call PhenotypeContext.setContext() first");
            return null;
        }
        zzlk zzlkVar2 = zzlk.l;
        int i = 0;
        if (zzlkVar2 == null) {
            Context applicationContext2 = context.getApplicationContext();
            try {
                applicationContext2.getClass();
                applicationContext = applicationContext2.getApplicationContext();
                applicationContext.getClass();
            } catch (IllegalStateException unused) {
                z = false;
            }
            if (!(applicationContext instanceof zzagp)) {
                Class<?> cls = applicationContext.getClass();
                new StringBuilder(String.valueOf(cls).length() + 72);
                cls.toString();
                throw new IllegalStateException("Given application context does not implement GeneratedComponentManager: ".concat(String.valueOf(cls)));
            }
            try {
                Object cast = zzlk.zza.class.cast(((zzagp) applicationContext).zza());
                cast.getClass();
                kvd zza = ((zzlk.zza) cast).zza();
                try {
                    if (zza.g()) {
                        zzlkVar2 = (zzlk) zza.d();
                    }
                } catch (IllegalStateException unused2) {
                }
                z = true;
                synchronized (zzlk.j) {
                    try {
                        if (zzlk.l != null) {
                            zzlkVar = zzlk.l;
                        } else {
                            kvd kvdVar = p0.a;
                            boolean z2 = applicationContext2 instanceof zzlk.zza;
                            if (z2) {
                                kvdVar = ((zzlk.zza) applicationContext2).zza();
                            }
                            zzlkVar = (zzlk) kvdVar.h(new ewo(applicationContext2, 0));
                            zzlk.l = zzlkVar;
                            if (!z && !z2) {
                                zzlz.a(Level.CONFIG, zzlkVar.a(), null, "Application doesn't implement PhenotypeApplication interface, falling back to globally set context. See go/phenotype-flag#process-stable-init for more info.", new Object[0]);
                            }
                        }
                    } finally {
                    }
                }
                zzlkVar2 = zzlkVar;
            } catch (ClassCastException e) {
                throw new IllegalStateException("Failed to get an entry point. Did you mark your interface with @SingletonEntryPoint?", e);
            }
        }
        int i2 = this.c;
        if (i2 == -1 || i2 < this.d.a.get()) {
            synchronized (this) {
                try {
                    int i3 = this.c;
                    if (i3 == -1) {
                        zzlk.b();
                        zzlkVar2.getClass();
                        zzpgVar = this.b.a(zzlkVar2);
                        this.d = zzpgVar.f;
                    } else {
                        zzpgVar = null;
                    }
                    int i4 = this.d.a.get();
                    if (i3 < i4) {
                        zzlk.b();
                        zzlkVar2.getClass();
                        kvd a = zzlf.a(zzlkVar2.b);
                        if (a.g()) {
                            zzle zzleVar = (zzle) a.d();
                            Uri a2 = zzlg.a();
                            String str2 = this.a;
                            if (a2 != null) {
                                fhhVar = (fhh) zzleVar.a.get(a2.toString());
                            } else {
                                zzleVar.getClass();
                                fhhVar = null;
                            }
                            String str3 = fhhVar == null ? null : (String) fhhVar.get(str2);
                            if (str3 != null) {
                                try {
                                    obj = b(str3);
                                } catch (IOException | IllegalArgumentException unused3) {
                                    "Invalid Phenotype flag value for flag ".concat(this.a);
                                }
                                if (zzpgVar == null) {
                                    zzpgVar = this.b.a(zzlkVar2);
                                }
                                str = zzpgVar.c;
                                if (!zzlkVar2.b.getPackageName().equals("com.android.vending") && !str.startsWith("com.google.android.gms.measurement#")) {
                                    ddb e2 = zzlkVar2.a().e(new vvo(4, zzlkVar2, str));
                                    e2.addListener(new f2p(i, e2), f35.a);
                                }
                                obj2 = ((awf) zzpgVar.a().d).get(this.a);
                                if (obj2 != null) {
                                    try {
                                        obj4 = c(obj2);
                                    } catch (IOException | ClassCastException unused4) {
                                        "Invalid Phenotype flag value for flag ".concat(this.a);
                                    }
                                }
                                if (true == a.g()) {
                                    obj = obj4;
                                }
                                if (obj == null) {
                                    obj = a();
                                }
                                if (obj != null) {
                                    e(obj);
                                    this.c = i4;
                                }
                            }
                        }
                        obj = null;
                        if (zzpgVar == null) {
                        }
                        str = zzpgVar.c;
                        if (!zzlkVar2.b.getPackageName().equals("com.android.vending")) {
                            ddb e22 = zzlkVar2.a().e(new vvo(4, zzlkVar2, str));
                            e22.addListener(new f2p(i, e22), f35.a);
                        }
                        obj2 = ((awf) zzpgVar.a().d).get(this.a);
                        if (obj2 != null) {
                        }
                        if (true == a.g()) {
                        }
                        if (obj == null) {
                        }
                        if (obj != null) {
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            obj.getClass();
            return obj;
        }
        obj = d();
        obj.getClass();
        return obj;
    }
}
