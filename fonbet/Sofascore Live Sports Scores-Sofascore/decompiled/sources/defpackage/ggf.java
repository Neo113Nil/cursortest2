package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import com.google.android.gms.internal.measurement.zzlk;
import com.google.android.gms.internal.measurement.zzpe;
import com.google.android.gms.internal.measurement.zzpg;
import com.google.android.gms.internal.measurement.zzph;
import com.google.android.gms.internal.measurement.zzql;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ggf implements fu, pz8, j55, zzph {
    public static final Object c = new Object();
    public Object a;
    public volatile Object b;

    public /* synthetic */ ggf(Object obj) {
        this.a = obj;
    }

    @Override // com.google.android.gms.internal.measurement.zzph
    public zzpg a(final zzlk zzlkVar) {
        final i0p i0pVar = (i0p) this.b;
        i0p i0pVar2 = zzpg.i;
        if (i0pVar != i0pVar2) {
            zzpe zzpeVar = zzpg.h;
            zzpeVar.getClass();
            final r0a r0aVar = new r0a(13);
            r0aVar.b = false;
            ConcurrentHashMap concurrentHashMap = zzpeVar.a;
            Context context = zzlkVar.b;
            String str = i0pVar.d;
            if (str == null) {
                str = (String) i0pVar.a.apply(context);
                i0pVar.d = str;
            }
            k0p k0pVar = (k0p) concurrentHashMap.computeIfAbsent(str, new Function() { // from class: i1p
                @Override // java.util.function.Function
                public final /* synthetic */ Object apply(Object obj) {
                    k0p k0pVar2 = new k0p(new zzpg(zzlk.this, i0pVar));
                    r0aVar.b = true;
                    return k0pVar2;
                }
            });
            if (r0aVar.b) {
                Context context2 = zzlkVar.b;
                xto xtoVar = new xto(zzpeVar, 5);
                if (zzql.a == null) {
                    synchronized (zzql.class) {
                        try {
                            if (zzql.a == null) {
                                if (!Objects.equals(context2.getPackageName(), "com.google.android.gms")) {
                                    if (Build.VERSION.SDK_INT >= 33) {
                                        context2.registerReceiver(new zzql(), new IntentFilter("com.google.android.gms.phenotype.UPDATE"), 2);
                                    } else {
                                        context2.registerReceiver(new zzql(), new IntentFilter("com.google.android.gms.phenotype.UPDATE"));
                                    }
                                }
                                zzql.a = xtoVar;
                                xto xtoVar2 = zzql.a;
                            }
                        } finally {
                        }
                    }
                }
            }
            this.a = k0pVar.a;
            this.b = i0pVar2;
        }
        return (zzpg) this.a;
    }

    @Override // defpackage.fu
    public void b(Set set) {
        fu fuVar = (fu) this.b;
        if (fuVar == c) {
            return;
        }
        if (fuVar != null) {
            fuVar.b(set);
        } else {
            synchronized (this) {
                ((HashSet) this.a).addAll(set);
            }
        }
    }

    @Override // defpackage.j55
    public zu4 c() {
        return (av4) this.b;
    }

    public s35 d() {
        if (((s35) this.b) == null) {
            synchronized (this) {
                try {
                    if (((s35) this.b) == null) {
                        File cacheDir = ((u00) ((d4a) this.a).b).a.getCacheDir();
                        g7h g7hVar = null;
                        File file = cacheDir == null ? null : new File(cacheDir, "image_manager_disk_cache");
                        if (file != null && (file.isDirectory() || file.mkdirs())) {
                            g7hVar = new g7h(file);
                        }
                        this.b = g7hVar;
                    }
                    if (((s35) this.b) == null) {
                        this.b = new rik(21);
                    }
                } finally {
                }
            }
        }
        return (s35) this.b;
    }

    public dy2 e(kge kgeVar) {
        dfb dfbVar = ((qrb) this.a).y;
        if (((qrb) this.a).G.get()) {
            return ((qrb) this.a).E;
        }
        if (dfbVar == null) {
            ((qrb) this.a).m.execute(new b8(this, 24));
            return ((qrb) this.a).E;
        }
        dy2 f = n49.f(dfbVar.a(kgeVar), Boolean.TRUE.equals(kgeVar.a.e));
        return f != null ? f : ((qrb) this.a).E;
    }

    public void f(rk3 rk3Var) {
        z1a.y(rk3Var, "newState");
        if (((rk3) this.b) == rk3Var || ((rk3) this.b) == rk3.e) {
            return;
        }
        this.b = rk3Var;
        if (((ArrayList) this.a).isEmpty()) {
            return;
        }
        ArrayList arrayList = (ArrayList) this.a;
        this.a = new ArrayList();
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            throw lnb.i(it);
        }
    }

    @Override // defpackage.pz8
    public Object get() {
        if (this.b == null) {
            synchronized (this) {
                try {
                    if (this.b == null) {
                        Object obj = ((pz8) this.a).get();
                        w1a.m(obj, "Argument must not be null");
                        this.b = obj;
                    }
                } finally {
                }
            }
        }
        return this.b;
    }
}
