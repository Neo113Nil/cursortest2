package d6;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import androidx.appcompat.app.v0;
import androidx.fragment.app.k1;
import androidx.fragment.app.p0;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.internal.measurement.h0;
import e6.c0;
import e6.d0;
import e6.i0;
import e6.j0;
import e6.s;
import e6.w;
import e6.y;
import g6.v;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8249a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8250b;

    /* renamed from: c, reason: collision with root package name */
    public final r7.a f8251c;

    /* renamed from: d, reason: collision with root package name */
    public final l1.a f8252d;

    /* renamed from: e, reason: collision with root package name */
    public final b f8253e;

    /* renamed from: f, reason: collision with root package name */
    public final e6.a f8254f;

    /* renamed from: g, reason: collision with root package name */
    public final Looper f8255g;

    /* renamed from: h, reason: collision with root package name */
    public final int f8256h;

    /* renamed from: i, reason: collision with root package name */
    public final s f8257i;
    public final m3.f j;

    /* renamed from: k, reason: collision with root package name */
    public final e6.e f8258k;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g(Activity activity, l1.a aVar, b bVar, m3.f fVar) {
        this(activity, activity, aVar, bVar, new f(fVar, r0));
        Looper mainLooper = activity.getMainLooper();
        v.i(mainLooper, "Looper must not be null.");
    }

    public final v0 a() {
        v0 v0Var = new v0(14, false);
        Set set = Collections.EMPTY_SET;
        if (((s.f) v0Var.f364b) == null) {
            v0Var.f364b = new s.f(0);
        }
        ((s.f) v0Var.f364b).addAll(set);
        Context context = this.f8249a;
        v0Var.f366d = context.getClass().getName();
        v0Var.f365c = context.getPackageName();
        return v0Var;
    }

    public final w7.m b(e6.i iVar, int i5) {
        v.i(iVar, "Listener key cannot be null.");
        e6.e eVar = this.f8258k;
        eVar.getClass();
        w7.g gVar = new w7.g();
        eVar.c(gVar, i5, this);
        w wVar = new w(new c0(iVar, gVar), eVar.f8701i.get(), this);
        h0 h0Var = eVar.f8705n;
        h0Var.sendMessage(h0Var.obtainMessage(13, wVar));
        return gVar.f24979a;
    }

    public final w7.m c(int i5, y yVar) {
        w7.g gVar = new w7.g();
        e6.e eVar = this.f8258k;
        eVar.getClass();
        eVar.c(gVar, yVar.f8766b, this);
        w wVar = new w(new d0(i5, yVar, gVar, this.j), eVar.f8701i.get(), this);
        h0 h0Var = eVar.f8705n;
        h0Var.sendMessage(h0Var.obtainMessage(4, wVar));
        return gVar.f24979a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0094, code lost:
    
        if (r1 != null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a4, code lost:
    
        if (r2 != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00dd, code lost:
    
        if (r1 == null) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g(Context context, Activity activity, l1.a aVar, b bVar, f fVar) {
        e6.h hVar;
        j0 j0Var;
        v.i(context, "Null context is not permitted.");
        v.i(aVar, "Api must not be null.");
        v.i(fVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        v.i(applicationContext, "The provided context did not have an application context.");
        this.f8249a = applicationContext;
        int i5 = Build.VERSION.SDK_INT;
        String attributionTag = (i5 < 30 || i5 < 30) ? null : context.getAttributionTag();
        this.f8250b = attributionTag;
        this.f8251c = i5 >= 31 ? new r7.a(2, context.getAttributionSource()) : null;
        this.f8252d = aVar;
        this.f8253e = bVar;
        this.f8255g = fVar.f8248b;
        e6.a aVar2 = new e6.a(aVar, bVar, attributionTag);
        this.f8254f = aVar2;
        this.f8257i = new s(this);
        e6.e e7 = e6.e.e(applicationContext);
        this.f8258k = e7;
        this.f8256h = e7.f8700h.getAndIncrement();
        this.j = fVar.f8247a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            if (activity instanceof p0) {
                p0 p0Var = (p0) activity;
                WeakHashMap weakHashMap = j0.f8720b;
                k1 r5 = p0Var.r();
                WeakHashMap weakHashMap2 = j0.f8720b;
                WeakReference weakReference = (WeakReference) weakHashMap2.get(p0Var);
                if (weakReference != null) {
                    e6.h hVar2 = (j0) weakReference.get();
                    hVar = hVar2;
                }
                try {
                    j0 j0Var2 = (j0) r5.E("SLifecycleFragmentImpl");
                    if (j0Var2 != null) {
                        boolean isRemoving = j0Var2.isRemoving();
                        j0Var = j0Var2;
                    }
                    j0 j0Var3 = new j0();
                    androidx.fragment.app.a aVar3 = new androidx.fragment.app.a(r5);
                    aVar3.c(0, j0Var3, "SLifecycleFragmentImpl", 1);
                    aVar3.g(true, true);
                    j0Var = j0Var3;
                    weakHashMap2.put(p0Var, new WeakReference(j0Var));
                    hVar = j0Var;
                } catch (ClassCastException e9) {
                    throw new IllegalStateException("Fragment with tag SLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e9);
                }
            } else {
                WeakHashMap weakHashMap3 = i0.f8716b;
                WeakReference weakReference2 = (WeakReference) weakHashMap3.get(activity);
                if (weakReference2 != null) {
                    e6.h hVar3 = (i0) weakReference2.get();
                    hVar = hVar3;
                }
                try {
                    i0 i0Var = (i0) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
                    if (i0Var == null || i0Var.isRemoving()) {
                        i0Var = new i0();
                        activity.getFragmentManager().beginTransaction().add(i0Var, "LifecycleFragmentImpl").commitAllowingStateLoss();
                    }
                    e6.h hVar4 = i0Var;
                    weakHashMap3.put(activity, new WeakReference(hVar4));
                    hVar = hVar4;
                } catch (ClassCastException e10) {
                    throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e10);
                }
            }
            e6.n g10 = hVar.g();
            if (g10 == null) {
                Object obj = c6.c.f3656d;
                g10 = new e6.n(hVar, e7);
            }
            g10.f8732f.add(aVar2);
            e7.f(g10);
        }
        h0 h0Var = e7.f8705n;
        h0Var.sendMessage(h0Var.obtainMessage(7, this));
    }
}
