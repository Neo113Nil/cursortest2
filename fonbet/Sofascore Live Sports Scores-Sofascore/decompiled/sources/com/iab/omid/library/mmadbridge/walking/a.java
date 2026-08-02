package com.iab.omid.library.mmadbridge.walking;

import android.view.View;
import com.iab.omid.library.mmadbridge.internal.e;
import com.iab.omid.library.mmadbridge.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes4.dex */
public class a {
    private final HashMap<View, String> a = new HashMap<>();
    private final HashMap<View, C0164a> b = new HashMap<>();
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

    public C0164a b(View view) {
        C0164a c0164a = this.b.get(view);
        if (c0164a != null) {
            this.b.remove(view);
        }
        return c0164a;
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
        com.iab.omid.library.mmadbridge.internal.c c = com.iab.omid.library.mmadbridge.internal.c.c();
        if (c != null) {
            for (com.iab.omid.library.mmadbridge.adsession.a aVar : c.a()) {
                View c2 = aVar.c();
                if (aVar.f()) {
                    String adSessionId = aVar.getAdSessionId();
                    if (c2 != null) {
                        boolean e = h.e(c2);
                        if (e) {
                            this.h.add(adSessionId);
                        }
                        String a = a(c2, e);
                        if (a == null) {
                            this.e.add(adSessionId);
                            this.a.put(c2, adSessionId);
                            a(aVar);
                        } else if (a != "noWindowFocus") {
                            this.f.add(adSessionId);
                            this.c.put(adSessionId, c2);
                            this.g.put(adSessionId, a);
                        }
                    } else {
                        this.f.add(adSessionId);
                        this.g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    /* renamed from: com.iab.omid.library.mmadbridge.walking.a$a, reason: collision with other inner class name */
    public static class C0164a {
        private final e a;
        private final ArrayList<String> b = new ArrayList<>();

        public C0164a(e eVar, String str) {
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

    private void a(com.iab.omid.library.mmadbridge.adsession.a aVar) {
        Iterator<e> it = aVar.d().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(e eVar, com.iab.omid.library.mmadbridge.adsession.a aVar) {
        View view = eVar.c().get();
        if (view == null) {
            return;
        }
        C0164a c0164a = this.b.get(view);
        if (c0164a != null) {
            c0164a.a(aVar.getAdSessionId());
        } else {
            this.b.put(view, new C0164a(eVar, aVar.getAdSessionId()));
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
