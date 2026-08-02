package defpackage;

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListView;
import com.facebook.internal.u;
import com.facebook.internal.x;
import com.facebook.w;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.text.c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class o03 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Runnable {
    public final WeakReference a;
    public ArrayList b;
    public final HashSet c;
    public final String d;

    public o03(View view, Handler handler, HashSet hashSet, String str) {
        hashSet.getClass();
        this.a = new WeakReference(view);
        this.c = hashSet;
        this.d = str;
        handler.postDelayed(this, 200L);
    }

    public final void a(n03 n03Var, View view, et5 et5Var) {
        View a = n03Var.a();
        if (a == null) {
            return;
        }
        String str = n03Var.b;
        View.OnClickListener f = xsk.f(a);
        boolean z = (f instanceof i03) && ((i03) f).e;
        HashSet hashSet = this.c;
        if (hashSet.contains(str) || z) {
            return;
        }
        i03 i03Var = null;
        if (!cw3.a.contains(k03.class)) {
            try {
                i03 i03Var2 = new i03();
                i03Var2.a = et5Var;
                i03Var2.b = new WeakReference(a);
                i03Var2.c = new WeakReference(view);
                i03Var2.d = xsk.f(a);
                i03Var2.e = true;
                i03Var = i03Var2;
            } catch (Throwable th) {
                cw3.a(k03.class, th);
            }
        }
        a.setOnClickListener(i03Var);
        hashSet.add(str);
    }

    public final void b(n03 n03Var, View view, et5 et5Var) {
        AdapterView adapterView = (AdapterView) n03Var.a();
        if (adapterView == null) {
            return;
        }
        String str = n03Var.b;
        AdapterView.OnItemClickListener onItemClickListener = adapterView.getOnItemClickListener();
        boolean z = (onItemClickListener instanceof j03) && ((j03) onItemClickListener).e;
        HashSet hashSet = this.c;
        if (hashSet.contains(str) || z) {
            return;
        }
        j03 j03Var = null;
        if (!cw3.a.contains(k03.class)) {
            try {
                j03 j03Var2 = new j03();
                j03Var2.a = et5Var;
                j03Var2.b = new WeakReference(adapterView);
                j03Var2.c = new WeakReference(view);
                j03Var2.d = adapterView.getOnItemClickListener();
                j03Var2.e = true;
                j03Var = j03Var2;
            } catch (Throwable th) {
                cw3.a(k03.class, th);
            }
        }
        adapterView.setOnItemClickListener(j03Var);
        hashSet.add(str);
    }

    public final void c() {
        ArrayList arrayList = this.b;
        if (arrayList != null) {
            WeakReference weakReference = this.a;
            if (weakReference.get() != null) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    et5 et5Var = (et5) arrayList.get(i);
                    View view = (View) weakReference.get();
                    if (et5Var != null) {
                        String str = et5Var.d;
                        if (view != null) {
                            String str2 = this.d;
                            if (str == null || str.length() == 0 || str.equals(str2)) {
                                List unmodifiableList = Collections.unmodifiableList(et5Var.b);
                                unmodifiableList.getClass();
                                if (unmodifiableList.size() <= 25) {
                                    Iterator it = pco.B(view, unmodifiableList, 0, -1, str2).iterator();
                                    while (it.hasNext()) {
                                        n03 n03Var = (n03) it.next();
                                        try {
                                            View a = n03Var.a();
                                            if (a != null) {
                                                View a2 = xsk.a(a);
                                                if (a2 != null && xsk.a.m(a, a2)) {
                                                    HashSet hashSet = this.c;
                                                    View a3 = n03Var.a();
                                                    if (a3 != null) {
                                                        String str3 = n03Var.b;
                                                        boolean z = xsk.g(a3) instanceof ekf;
                                                        if (!hashSet.contains(str3) && !z) {
                                                            ekf ekfVar = null;
                                                            if (!cw3.a.contains(fkf.class)) {
                                                                try {
                                                                    ekfVar = new ekf(et5Var, view, a3);
                                                                } catch (Throwable th) {
                                                                    cw3.a(fkf.class, th);
                                                                }
                                                            }
                                                            a3.setOnTouchListener(ekfVar);
                                                            hashSet.add(str3);
                                                        }
                                                    }
                                                } else if (!c.v(a.getClass().getName(), "com.facebook.react", false)) {
                                                    if (!(a instanceof AdapterView)) {
                                                        a(n03Var, view, et5Var);
                                                    } else if (a instanceof ListView) {
                                                        b(n03Var, view, et5Var);
                                                    }
                                                }
                                            }
                                        } catch (Exception unused) {
                                            cw3.a.contains(p03.class);
                                            w wVar = w.a;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        c();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        c();
    }

    @Override // java.lang.Runnable
    public final void run() {
        Set set = cw3.a;
        if (set.contains(this)) {
            return;
        }
        try {
            if (set.contains(this)) {
                return;
            }
            try {
                u b = x.b(w.b());
                if (b != null && b.g) {
                    JSONArray jSONArray = b.h;
                    ArrayList arrayList = new ArrayList();
                    if (jSONArray != null) {
                        try {
                            int length = jSONArray.length();
                            for (int i = 0; i < length; i++) {
                                JSONObject jSONObject = jSONArray.getJSONObject(i);
                                jSONObject.getClass();
                                arrayList.add(oyn.F(jSONObject));
                            }
                        } catch (IllegalArgumentException | JSONException unused) {
                        }
                    }
                    this.b = arrayList;
                    View view = (View) this.a.get();
                    if (view == null) {
                        return;
                    }
                    ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.addOnGlobalLayoutListener(this);
                        viewTreeObserver.addOnScrollChangedListener(this);
                    }
                    c();
                }
            } catch (Throwable th) {
                cw3.a(this, th);
            }
        } catch (Throwable th2) {
            cw3.a(this, th2);
        }
    }
}
