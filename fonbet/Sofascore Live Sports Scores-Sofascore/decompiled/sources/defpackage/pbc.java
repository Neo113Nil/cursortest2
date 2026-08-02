package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.support.v4.media.session.MediaSessionCompat$Token;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class pbc {
    public static yz8 c;
    public final Context a;
    public final ArrayList b = new ArrayList();

    public pbc(Context context) {
        this.a = context;
    }

    public static void b() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        a70.r("The media router service must only be accessed on the application's main thread.");
    }

    public static yz8 c() {
        yz8 yz8Var = c;
        if (yz8Var != null) {
            return yz8Var;
        }
        a70.r("getGlobalRouter cannot be called when sGlobal is null");
        return null;
    }

    public static pbc d(Context context) {
        if (context == null) {
            a70.p("context must not be null");
            return null;
        }
        b();
        yz8 yz8Var = c;
        if (yz8Var == null) {
            yz8Var = new yz8(context.getApplicationContext());
            c = yz8Var;
        }
        ArrayList arrayList = yz8Var.h;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                pbc pbcVar = new pbc(context);
                arrayList.add(new WeakReference(pbcVar));
                return pbcVar;
            }
            pbc pbcVar2 = (pbc) ((WeakReference) arrayList.get(size)).get();
            if (pbcVar2 == null) {
                arrayList.remove(size);
            } else if (pbcVar2.a == context) {
                return pbcVar2;
            }
        }
    }

    public static MediaSessionCompat$Token e() {
        yz8 yz8Var = c;
        if (yz8Var == null) {
            return null;
        }
        ejg ejgVar = yz8Var.C;
        if (ejgVar != null) {
            hcc hccVar = (hcc) ejgVar.c;
            if (hccVar != null) {
                return ((dcc) hccVar.b).b;
            }
            return null;
        }
        hcc hccVar2 = yz8Var.D;
        if (hccVar2 != null) {
            return ((dcc) hccVar2.b).b;
        }
        return null;
    }

    public static obc f() {
        b();
        return c().h();
    }

    public static boolean g() {
        Bundle bundle;
        if (c == null) {
            return false;
        }
        return c().u == null || (bundle = Bundle.EMPTY) == null || bundle.getBoolean("androidx.mediarouter.media.MediaRouterParams.ENABLE_GROUP_VOLUME_UX", true);
    }

    public static void i(a8g a8gVar) {
        b();
        z9c z9cVar = c().r;
        if (z9cVar == null || Build.VERSION.SDK_INT < 34) {
            return;
        }
        q9.I(z9cVar.i, a8gVar != null ? q9.M(a8gVar) : null);
    }

    public static void j(int i) {
        if (i < 0 || i > 3) {
            a70.p("Unsupported reason to unselect route");
            return;
        }
        b();
        yz8 c2 = c();
        obc c3 = c2.c();
        if (c2.h() != c3) {
            c2.k(c3, i, true);
        }
    }

    public final void a(ibc ibcVar, jbc jbcVar, int i) {
        kbc kbcVar;
        ibc ibcVar2;
        if (ibcVar == null) {
            a70.p("selector must not be null");
            return;
        }
        if (jbcVar == null) {
            a70.p("callback must not be null");
            return;
        }
        b();
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((kbc) arrayList.get(i2)).b == jbcVar) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 < 0) {
            kbcVar = new kbc(this, jbcVar);
            arrayList.add(kbcVar);
        } else {
            kbcVar = (kbc) arrayList.get(i2);
        }
        boolean z2 = true;
        if (i != kbcVar.d) {
            kbcVar.d = i;
            z = true;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if ((i & 1) != 0) {
            z = true;
        }
        kbcVar.e = elapsedRealtime;
        ibc ibcVar3 = kbcVar.c;
        ibcVar3.a();
        ibcVar.a();
        if (ibcVar3.b.containsAll(ibcVar.b)) {
            z2 = z;
        } else {
            ibc ibcVar4 = kbcVar.c;
            if (ibcVar4 == null) {
                a70.p("selector must not be null");
                return;
            }
            ibcVar4.a();
            ArrayList<String> arrayList2 = !ibcVar4.b.isEmpty() ? new ArrayList<>(ibcVar4.b) : null;
            ArrayList c2 = ibcVar.c();
            if (!c2.isEmpty()) {
                Iterator it = c2.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (str == null) {
                        a70.p("category must not be null");
                        return;
                    }
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>();
                    }
                    ArrayList<String> arrayList3 = arrayList2;
                    if (!arrayList2.contains(str)) {
                        arrayList3.add(str);
                    }
                    arrayList2 = arrayList3;
                }
            }
            if (arrayList2 == null) {
                ibcVar2 = ibc.c;
            } else {
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("controlCategories", arrayList2);
                ibcVar2 = new ibc(bundle, arrayList2);
            }
            kbcVar.c = ibcVar2;
        }
        if (z2) {
            c().m();
        }
    }

    public final void h(jbc jbcVar) {
        if (jbcVar == null) {
            a70.p("callback must not be null");
            return;
        }
        b();
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (((kbc) arrayList.get(i)).b == jbcVar) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            arrayList.remove(i);
            c().m();
        }
    }
}
