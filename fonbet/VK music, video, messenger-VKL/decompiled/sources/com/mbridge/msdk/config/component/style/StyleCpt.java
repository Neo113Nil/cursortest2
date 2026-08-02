package com.mbridge.msdk.config.component.style;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.ironsource.X3;
import com.mbridge.msdk.config.component.base.d;
import com.mbridge.msdk.config.component.common.util.c;
import com.mbridge.msdk.config.component.style.model.b;
import com.mbridge.msdk.config.dynamic.baseview.cusview.XMLView;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.q0;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import xsna.cqi;
import xsna.dq;
import xsna.gv2;
import xsna.kft0;

/* loaded from: classes13.dex */
public class StyleCpt extends com.mbridge.msdk.config.component.base.a implements com.mbridge.msdk.config.component.vc.inter.a, d {
    private b h;
    private XMLView i;
    private com.mbridge.msdk.config.component.style.inter.a j;

    private void c(View view) {
        if (view != null) {
            view.setVisibility(0);
            HashMap hashMap = new HashMap();
            hashMap.put(c.c("view_tag"), view.getTag());
            a(a("903008", (Map<String, Object>) hashMap));
        }
    }

    private void h() {
        String a2 = this.h.a();
        if (TextUtils.isEmpty(a2)) {
            a("2000005", "Component command is null");
            return;
        }
        try {
            if (a2.equals(c.c("319"))) {
                q();
                return;
            }
            if (a2.equals(c.c("325"))) {
                l();
            } else if (a2.equals(c.c("326"))) {
                a(8);
            } else if (a2.equals(c.c("307"))) {
                g();
            }
        } catch (Exception e) {
            q0.b("StyleCpt", "Error in doRenderTemplateAction", e);
            a("", cqi.b(e, new StringBuilder("Command execute error ")));
        }
    }

    private void i() {
        b bVar = this.h;
        if (bVar == null || bVar.e() == null) {
            return;
        }
        for (com.mbridge.msdk.config.component.style.model.a aVar : this.h.e()) {
            if (aVar != null) {
                String a2 = aVar.a();
                String d = aVar.d();
                if (!TextUtils.isEmpty(a2) && !TextUtils.isEmpty(d)) {
                    View c = c(d);
                    if (c == null) {
                        dq.i("Widget view not found: ", d, "StyleCpt");
                    } else {
                        try {
                            if (a2.equals(c.c("319"))) {
                                c(c);
                            } else if (a2.equals(c.c("325"))) {
                                a(c);
                            } else if (a2.equals(c.c("328"))) {
                                a(c, aVar);
                            } else if (a2.equals(c.c("327"))) {
                                b(c);
                            }
                            c(c, aVar);
                            b(c, aVar);
                        } catch (Exception e) {
                            q0.b("StyleCpt", "Error in doWidgetViewAction", e);
                        }
                    }
                }
            }
        }
    }

    private void j() {
        b bVar = this.h;
        if (bVar == null || TextUtils.isEmpty(bVar.d())) {
            return;
        }
        this.i = com.mbridge.msdk.config.dynamic.utils.d.a(e(), SameMD5.getMD5(this.h.d()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Object> k() {
        String c;
        List<com.mbridge.msdk.config.component.style.model.a> e = this.h.e();
        if (e != null && !e.isEmpty()) {
            for (com.mbridge.msdk.config.component.style.model.a aVar : e) {
                if (aVar != null && (c = aVar.c()) != null) {
                    c.equals("1");
                }
            }
        }
        return com.mbridge.msdk.config.dynamic.utils.d.a((ViewGroup) this.i);
    }

    private void l() {
        XMLView xMLView = this.i;
        if (xMLView == null) {
            return;
        }
        xMLView.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m() {
        h();
        i();
    }

    private void p() {
        if (this.j != null) {
            return;
        }
        this.j = new a();
    }

    private void q() {
        HashMap hashMap = new HashMap();
        a(a("903002", (Map<String, Object>) hashMap));
        XMLView xMLView = this.i;
        if (xMLView == null) {
            a(0);
        } else if (xMLView.getVisibility() != 0) {
            this.i.setVisibility(0);
        }
        Map<String, Object> k = k();
        if (!k.isEmpty()) {
            hashMap.putAll(k);
        }
        a(a("903006", (Map<String, Object>) hashMap));
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void b(Map<String, Object> map) {
        this.f = "903001";
        this.h = new b(map);
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        super.d();
        j();
        com.mbridge.msdk.foundation.same.threadpool.a.c().post(new gv2(this, 14));
        a("903011", (HashMap<String, Object>) null);
    }

    public void n() {
        a(a("903004", (Map<String, Object>) new HashMap()));
    }

    public void o() {
        a(a("903003", (Map<String, Object>) new HashMap()));
    }

    private void g() {
        if (this.i != null && e() != null) {
            HashMap hashMap = new HashMap();
            e().removeView(this.i);
            Map<String, Object> k = k();
            if (!k.isEmpty()) {
                hashMap.putAll(k);
            }
            a(a("903005", (Map<String, Object>) hashMap));
        }
        Object b = this.d.b((Object) c.c("sdk_context"));
        if (b instanceof Map) {
            Object obj = ((Map) b).get("lifecycleListeners");
            if (obj instanceof List) {
                ((List) obj).clear();
            }
        }
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void a() {
        super.a();
        p();
    }

    private void b(View view) {
        if (view == null || !(view.getParent() instanceof ViewGroup)) {
            return;
        }
        ((ViewGroup) view.getParent()).removeView(view);
    }

    @Override // com.mbridge.msdk.config.component.base.d
    public boolean a(Map<?, ?> map) {
        if (map != null && !map.isEmpty()) {
            Object obj = map.get(c.c("16"));
            if (obj instanceof Map) {
                Object obj2 = ((Map) obj).get(c.c("116"));
                if (obj2 instanceof String) {
                    String valueOf = String.valueOf(obj2);
                    if (!TextUtils.isEmpty(valueOf)) {
                        return valueOf.equals(this.h.d());
                    }
                }
            }
        }
        return false;
    }

    private void b(int i) {
        XMLView xMLView;
        String d = this.h.d();
        if (TextUtils.isEmpty(d)) {
            a("2000001", "Template URL is empty");
            return;
        }
        if (TextUtils.isEmpty(this.h.b())) {
            a("2000003", "XML paths is error");
            return;
        }
        try {
            XMLView xMLView2 = (XMLView) new com.mbridge.msdk.config.dynamic.a().a(this.h.b(), e(), this.d);
            this.i = xMLView2;
            if (xMLView2 == null) {
                a("2000004", "xml render fail");
                return;
            }
            xMLView2.setRenderMap(d);
            this.i.setXmlViewActionListener(this.j);
            if (e() == null || (xMLView = this.i) == null) {
                return;
            }
            xMLView.setVisibility(i);
        } catch (Exception e) {
            a("2000004", e.getMessage());
        }
    }

    private void c(View view, com.mbridge.msdk.config.component.style.model.a aVar) {
        try {
            if (view == null) {
                q0.b("StyleCpt", "Widget view is null");
                return;
            }
            String f = aVar.f();
            if (TextUtils.isEmpty(f)) {
                return;
            }
            String[] d = d(f);
            if (d.length != 2) {
                q0.b("StyleCpt", "Invalid widget size format: " + f);
                return;
            }
            int parseInt = Integer.parseInt(d[0]);
            int parseInt2 = Integer.parseInt(d[1]);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = parseInt;
                layoutParams.height = parseInt2;
                view.setLayoutParams(layoutParams);
            }
        } catch (Exception e) {
            kft0.a(e, new StringBuilder("Error resizing widget: "), "StyleCpt");
        }
    }

    private String[] d(String str) {
        if (TextUtils.isEmpty(str)) {
            return new String[0];
        }
        return str.replaceAll("[\\[\\]]", "").split(StringUtils.COMMA);
    }

    public class a implements com.mbridge.msdk.config.component.style.inter.a {
        public a() {
        }

        @Override // com.mbridge.msdk.config.component.style.inter.a
        public void a(String str, Map<String, Object> map) {
            if (TextUtils.isEmpty(str)) {
                q0.b("StyleCpt", "Click tag is empty");
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put(c.c("view_tag"), str);
            if (map != null && !map.isEmpty()) {
                hashMap.putAll(map);
            }
            Map k = StyleCpt.this.k();
            if (!k.isEmpty()) {
                hashMap.put("all_properties", k);
            }
            StyleCpt styleCpt = StyleCpt.this;
            styleCpt.a(styleCpt.a("903010", (Map<String, Object>) hashMap));
        }

        @Override // com.mbridge.msdk.config.component.style.inter.a
        public void a(Map<String, Object> map) {
            if (map != null) {
                StyleCpt styleCpt = StyleCpt.this;
                styleCpt.a(styleCpt.a("903008", map));
            }
        }
    }

    private void a(String str, String str2) {
        q0.b("StyleCpt", str2);
        HashMap hashMap = new HashMap();
        hashMap.put(c.c("reason"), str2);
        hashMap.put(c.c("code"), str);
        if (this.h.e() != null) {
            q0.b("StyleCpt", hashMap.toString());
        } else {
            a(a("903007", (Map<String, Object>) hashMap));
        }
    }

    private void b(View view, com.mbridge.msdk.config.component.style.model.a aVar) {
        try {
            if (view == null) {
                q0.b("StyleCpt", "Widget view is null");
                return;
            }
            String e = aVar.e();
            if (TextUtils.isEmpty(e)) {
                return;
            }
            String[] d = d(e);
            if (d.length != 2) {
                q0.b("StyleCpt", "Invalid widget location format: " + e);
            } else {
                int parseInt = Integer.parseInt(d[0]);
                int parseInt2 = Integer.parseInt(d[1]);
                view.setX(parseInt);
                view.setY(parseInt2);
            }
        } catch (Exception e2) {
            kft0.a(e2, new StringBuilder("Error relocating widget: "), "StyleCpt");
        }
    }

    private void a(View view, com.mbridge.msdk.config.component.style.model.a aVar) {
        try {
            Object b = aVar.b();
            View view2 = b instanceof View ? (View) b : null;
            if (view2 == null) {
                q0.b("StyleCpt", "Action view is null");
            } else if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (view2.getParent() != null) {
                    ((ViewGroup) view2.getParent()).removeView(view2);
                }
                viewGroup.addView(view2);
            }
        } catch (Exception e) {
            kft0.a(e, new StringBuilder("Error adding widget: "), "StyleCpt");
        }
    }

    private View c(String str) {
        XMLView xMLView = this.i;
        if (xMLView == null) {
            return e().findViewWithTag(str);
        }
        return xMLView.findViewWithTag(str);
    }

    private void a(View view) {
        if (view != null) {
            view.setVisibility(4);
            HashMap hashMap = new HashMap();
            hashMap.put(c.c("view_tag"), view.getTag());
            a(a("903009", (Map<String, Object>) hashMap));
        }
    }

    private void a(int i) {
        b(i);
    }

    @Override // com.mbridge.msdk.config.component.vc.inter.a
    public void a(String str) {
        str.getClass();
        if (str.equals("onStop")) {
            o();
        } else if (str.equals(X3.i.u0)) {
            n();
        }
    }
}
