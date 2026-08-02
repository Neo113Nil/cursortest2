package defpackage;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class y0 implements qf0 {
    public final Object a;
    public Object b;
    public final Object c;

    public y0(k6g k6gVar) {
        k6gVar.getClass();
        this.a = k6gVar;
        this.b = new AtomicBoolean(false);
        this.c = ypa.b(new e6g(this, 19));
    }

    public static void n(View view, String str) {
        if (view == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            view.setBackgroundColor(Color.parseColor(str));
        } catch (IllegalArgumentException e) {
            e.toString();
        }
    }

    public static void o(Button button, o72 o72Var) {
        String str = o72Var.a.b;
        String str2 = o72Var.b;
        try {
            Drawable background = button.getBackground();
            background.setTint(Color.parseColor(str2));
            button.setBackground(background);
        } catch (IllegalArgumentException e) {
            e.toString();
        }
        button.setText(o72Var.a.a);
        button.setTextColor(Color.parseColor(str));
    }

    @Override // defpackage.qf0
    public void A() {
        this.b = ((ArrayList) this.c).remove(r0.size() - 1);
    }

    public mni a() {
        k6g k6gVar = (k6g) this.a;
        k6gVar.assertNotMainThread();
        return ((AtomicBoolean) this.b).compareAndSet(false, true) ? (mni) ((mqi) this.c).getValue() : k6gVar.compileStatement(c());
    }

    public void b() {
        ((ArrayList) this.c).clear();
        this.b = this.a;
        l();
    }

    public abstract String c();

    public String d(String str, HashMap hashMap, HashMap hashMap2) {
        String K = tz9.K(tz9.K(str, (HashMap) this.a), hashMap2);
        if (hashMap.size() == 0) {
            return K;
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            String str2 = (String) entry.getKey();
            String str3 = (String) entry.getValue();
            String replace = str2.replace("{", "").replace("}", "");
            String[] split = str2.split(Pattern.quote("{"), -1);
            String str4 = null;
            if (split.length == 2) {
                String str5 = split[0];
                String[] split2 = split[split.length - 1].split(Pattern.quote("}"), -1);
                if (split2.length == 2) {
                    str4 = wv8.i(str5, str3, split2[split2.length - 1]);
                }
            }
            if (str4 != null && K.contains(replace)) {
                K = K.replace(replace, str4);
            }
        }
        return K;
    }

    public mw9 e() {
        return (mw9) this.b;
    }

    public View.OnClickListener f() {
        return null;
    }

    @Override // defpackage.qf0
    public Object g() {
        return this.b;
    }

    public abstract ImageView h();

    public abstract ViewGroup i();

    public abstract ViewTreeObserver.OnGlobalLayoutListener j(HashMap hashMap, w38 w38Var);

    public abstract void l();

    public void m(mni mniVar) {
        mniVar.getClass();
        if (mniVar == ((mni) ((mqi) this.c).getValue())) {
            ((AtomicBoolean) this.b).set(false);
        }
    }

    public synchronized void q(fkg fkgVar, HashMap hashMap, HashMap hashMap2) {
        if (((ArrayList) this.c).contains(fkgVar)) {
            ((ujg) this.b).J(d(fkgVar.a(), hashMap, hashMap2));
            if (fkgVar.d()) {
                ((ArrayList) this.c).remove(fkgVar);
            }
        }
    }

    public synchronized void u(String str, HashMap hashMap, HashMap hashMap2) {
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = ((ArrayList) this.c).iterator();
            while (it.hasNext()) {
                fkg fkgVar = (fkg) it.next();
                if (fkgVar.c().equals(str)) {
                    arrayList.add(fkgVar);
                }
            }
            if (arrayList.size() == 0) {
                return;
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                q((fkg) it2.next(), hashMap, hashMap2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.qf0
    public void x(Object obj) {
        ((ArrayList) this.c).add(this.b);
        this.b = obj;
    }

    public y0(wm2 wm2Var, HashMap hashMap) {
        ujg P = ujg.P(null);
        this.c = new ArrayList(wm2Var.a);
        this.a = hashMap;
        this.b = P;
    }

    public y0(mw9 mw9Var, LayoutInflater layoutInflater, lw9 lw9Var) {
        this.b = mw9Var;
        this.c = layoutInflater;
        this.a = lw9Var;
    }

    public y0(Object obj) {
        this.a = obj;
        this.c = new ArrayList();
        this.b = obj;
    }
}
