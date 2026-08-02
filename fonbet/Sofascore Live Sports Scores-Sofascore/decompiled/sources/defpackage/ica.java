package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.google.android.gms.internal.ads.zzhoh;
import com.ironsource.U3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ica implements Iterable {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public ica(Context context) {
        this.a = 2;
        this.b = new ArrayList();
        this.c = context;
    }

    public void a(Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            component = intent.resolveActivity(((Context) this.c).getPackageManager());
        }
        if (component != null) {
            b(component);
        }
        ((ArrayList) this.b).add(intent);
    }

    public void b(ComponentName componentName) {
        Context context = (Context) this.c;
        ArrayList arrayList = (ArrayList) this.b;
        int size = arrayList.size();
        try {
            for (Intent w = d7a.w(context, componentName); w != null; w = d7a.w(context, w.getComponent())) {
                arrayList.add(size, w);
            }
        } catch (PackageManager.NameNotFoundException e) {
            ilg.k(e);
        }
    }

    public void c() {
        ArrayList arrayList = (ArrayList) this.b;
        if (arrayList.isEmpty()) {
            a70.r("No intents added to TaskStackBuilder; cannot startActivities");
            return;
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        ((Context) this.c).startActivities(intentArr, null);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return new lca(((Iterable) obj2).iterator(), (w6k) obj);
            case 1:
                a02 a02Var = (a02) obj;
                return ((qyh) a02Var.e).b(a02Var, (String) obj2);
            case 2:
                return ((ArrayList) obj2).iterator();
            default:
                return new a8n(((List) obj2).iterator(), ((List) obj).iterator());
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                Iterator it = iterator();
                StringBuilder sb = new StringBuilder(U3.j.d);
                boolean z = true;
                while (it.hasNext()) {
                    if (!z) {
                        sb.append(", ");
                    }
                    sb.append(it.next());
                    z = false;
                }
                sb.append(']');
                return sb.toString();
            case 1:
                ih2 ih2Var = new ih2(", ");
                StringBuilder sb2 = new StringBuilder();
                sb2.append('[');
                ih2Var.a(sb2, iterator());
                sb2.append(']');
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public ica(zzhoh zzhohVar, List list, List list2) {
        this.a = 3;
        this.b = list;
        this.c = list2;
    }

    public ica(vvf vvfVar, w6k w6kVar) {
        this.a = 0;
        this.b = vvfVar;
        this.c = w6kVar;
    }

    public ica(a02 a02Var, String str) {
        this.a = 1;
        this.b = str;
        this.c = a02Var;
    }
}
