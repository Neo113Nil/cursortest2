package com.iab.omid.library.smartadserver1.walking;

import android.view.View;
import com.iab.omid.library.smartadserver1.internal.e;
import com.iab.omid.library.smartadserver1.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes4.dex */
public class a {
    private final HashMap<View, String> a = new HashMap<>();
    private final HashMap<View, C0170a> b = new HashMap<>();
    private final HashMap<String, View> c = new HashMap<>();
    private final HashSet<View> d = new HashSet<>();
    private final HashSet<String> e = new HashSet<>();
    private final HashSet<String> f = new HashSet<>();
    private final HashMap<String, String> g = new HashMap<>();
    private final HashSet<String> h = new HashSet<>();
    private final Map<View, Boolean> i = new WeakHashMap();
    private boolean j;

    private String a(View view, boolean z) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        if (a(view).booleanValue() && !z) {
            return "noWindowFocus";
        }
        HashSet hashSet = new HashSet();
        while (view != null) {
            String a = h.a(view);
            if (a != null) {
                return a;
            }
            hashSet.add(view);
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        this.d.addAll(hashSet);
        return null;
    }

    public C0170a b(View view) {
        C0170a c0170a = this.b.get(view);
        if (c0170a != null) {
            this.b.remove(view);
        }
        return c0170a;
    }

    public String c(View view) {
        if (this.a.size() == 0) {
            return null;
        }
        String str = this.a.get(view);
        if (str != null) {
            this.a.remove(view);
        }
        return str;
    }

    public c d(View view) {
        return this.d.contains(view) ? c.PARENT_VIEW : this.j ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public void e() {
        com.iab.omid.library.smartadserver1.internal.c c = com.iab.omid.library.smartadserver1.internal.c.c();
        if (c != null) {
            for (com.iab.omid.library.smartadserver1.adsession.a aVar : c.a()) {
                View e = aVar.e();
                if (aVar.h()) {
                    String c2 = aVar.c();
                    if (e != null) {
                        boolean e2 = h.e(e);
                        if (e2) {
                            this.h.add(c2);
                        }
                        String a = a(e, e2);
                        if (a == null) {
                            this.e.add(c2);
                            this.a.put(e, c2);
                            a(aVar);
                        } else if (a != "noWindowFocus") {
                            this.f.add(c2);
                            this.c.put(c2, e);
                            this.g.put(c2, a);
                        }
                    } else {
                        this.f.add(c2);
                        this.g.put(c2, "noAdView");
                    }
                }
            }
        }
    }

    /* renamed from: com.iab.omid.library.smartadserver1.walking.a$a, reason: collision with other inner class name */
    public static class C0170a {
        private final e a;
        private final ArrayList<String> b = new ArrayList<>();

        public C0170a(e eVar, String str) {
            this.a = eVar;
            a(str);
        }

        public void a(String str) {
            this.b.add(str);
        }

        public ArrayList<String> b() {
            return this.b;
        }

        public e a() {
            return this.a;
        }
    }

    public String b(String str) {
        return this.g.get(str);
    }

    public HashSet<String> b() {
        return this.f;
    }

    public void d() {
        this.j = true;
    }

    public HashSet<String> c() {
        return this.e;
    }

    public boolean c(String str) {
        return this.h.contains(str);
    }

    private Boolean a(View view) {
        boolean hasWindowFocus = view.hasWindowFocus();
        Map<View, Boolean> map = this.i;
        if (hasWindowFocus) {
            map.remove(view);
            return Boolean.FALSE;
        }
        boolean containsKey = map.containsKey(view);
        Map<View, Boolean> map2 = this.i;
        if (containsKey) {
            return map2.get(view);
        }
        Boolean bool = Boolean.FALSE;
        map2.put(view, bool);
        return bool;
    }

    public View a(String str) {
        return this.c.get(str);
    }

    public void a() {
        this.a.clear();
        this.b.clear();
        this.c.clear();
        this.d.clear();
        this.e.clear();
        this.f.clear();
        this.g.clear();
        this.j = false;
        this.h.clear();
    }

    private void a(com.iab.omid.library.smartadserver1.adsession.a aVar) {
        Iterator<e> it = aVar.f().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(e eVar, com.iab.omid.library.smartadserver1.adsession.a aVar) {
        View view = eVar.c().get();
        if (view == null) {
            return;
        }
        C0170a c0170a = this.b.get(view);
        if (c0170a != null) {
            c0170a.a(aVar.c());
        } else {
            this.b.put(view, new C0170a(eVar, aVar.c()));
        }
    }

    public boolean e(View view) {
        if (!this.i.containsKey(view)) {
            return true;
        }
        this.i.put(view, Boolean.TRUE);
        return false;
    }
}
