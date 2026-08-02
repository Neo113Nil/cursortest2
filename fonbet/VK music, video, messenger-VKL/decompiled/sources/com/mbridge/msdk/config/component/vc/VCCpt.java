package com.mbridge.msdk.config.component.vc;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.view.ViewGroup;
import com.ironsource.X3;
import com.mbridge.msdk.config.activity.MBRewardVideoActivity;
import com.mbridge.msdk.config.component.common.util.c;
import com.mbridge.msdk.foundation.tools.q0;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import xsna.k6c0;

/* loaded from: classes13.dex */
public class VCCpt extends com.mbridge.msdk.config.component.base.a {
    private static ConcurrentHashMap<String, VCCpt> l;
    final String h = "1200001";
    final String i = "1200002";
    private String j;
    private com.mbridge.msdk.config.component.vc.model.a k;

    public static class b implements com.mbridge.msdk.config.activity.lifecycle.a, Serializable {
        private String a;

        private b() {
        }

        public void a(String str) {
            this.a = str;
        }

        @Override // com.mbridge.msdk.config.activity.lifecycle.a
        public void b() {
            VCCpt vCCpt;
            if (VCCpt.l == null || VCCpt.l.isEmpty() || (vCCpt = (VCCpt) VCCpt.l.get(this.a)) == null) {
                return;
            }
            vCCpt.a(vCCpt.a("902007", (Map<String, Object>) new HashMap()));
            vCCpt.c(X3.i.u0);
        }

        @Override // com.mbridge.msdk.config.activity.lifecycle.a
        public void c() {
            VCCpt vCCpt;
            if (VCCpt.l == null || VCCpt.l.isEmpty() || (vCCpt = (VCCpt) VCCpt.l.get(this.a)) == null) {
                return;
            }
            vCCpt.a(vCCpt.a("902009", (Map<String, Object>) new HashMap()));
        }

        @Override // com.mbridge.msdk.config.activity.lifecycle.a
        public void a(ViewGroup viewGroup) {
            VCCpt vCCpt;
            if (VCCpt.l == null || VCCpt.l.isEmpty() || (vCCpt = (VCCpt) VCCpt.l.get(this.a)) == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                vCCpt.a(viewGroup);
            }
            Object b = vCCpt.d.b((Object) c.c("sdk_context"));
            if (b instanceof Map) {
                ((Map) b).put(c.c("rootView"), viewGroup);
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put(c.c("rootView"), viewGroup);
                vCCpt.d.a(c.c("sdk_context"), hashMap);
            }
            vCCpt.a(vCCpt.a("902002", (Map<String, Object>) new HashMap()));
            vCCpt.a(vCCpt.a("902003", (Map<String, Object>) new HashMap()));
        }

        @Override // com.mbridge.msdk.config.activity.lifecycle.a
        public void a() {
            VCCpt vCCpt;
            if (VCCpt.l == null || VCCpt.l.isEmpty() || (vCCpt = (VCCpt) VCCpt.l.get(this.a)) == null) {
                return;
            }
            vCCpt.a(vCCpt.a("902006", (Map<String, Object>) new HashMap()));
            vCCpt.c("onStop");
        }

        @Override // com.mbridge.msdk.config.activity.lifecycle.a
        public void e() {
        }

        @Override // com.mbridge.msdk.config.activity.lifecycle.a
        public void f() {
        }

        @Override // com.mbridge.msdk.config.activity.lifecycle.a
        public void onStart() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar = this.d;
        if (aVar == null) {
            return;
        }
        Object b2 = aVar.b((Object) c.c("sdk_context"));
        try {
            if (b2 instanceof Map) {
                Object obj = ((Map) b2).get("lifecycleListeners");
                if (obj instanceof List) {
                    List<com.mbridge.msdk.config.component.vc.inter.a> list = (List) obj;
                    if (list.isEmpty()) {
                        return;
                    }
                    synchronized (list) {
                        try {
                            for (com.mbridge.msdk.config.component.vc.inter.a aVar2 : list) {
                                if (aVar2 != null) {
                                    aVar2.a(str);
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            q0.b("VCCpt", th2.getMessage(), th2);
        }
    }

    private void h() {
        a(a("902005", (Map<String, Object>) new HashMap()));
        l();
        if (e() == null || !(e().getContext() instanceof Activity)) {
            return;
        }
        ((Activity) e().getContext()).finish();
    }

    private void i() {
        String a2 = this.k.a();
        try {
            if (a2.equals(c.c("319"))) {
                m();
            } else if (a2.equals(c.c("307"))) {
                h();
            }
            if (this.k.f() == 1) {
                n();
            }
        } catch (Exception e) {
            q0.b("VCCpt", "Error in doRenderTemplateAction", e);
            a("1200002", "Root view render fail");
        }
    }

    private com.mbridge.msdk.config.activity.backdispatcher.a j() {
        com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar;
        try {
            aVar = this.d;
        } catch (Throwable th) {
            q0.b("VCCpt", th.getMessage());
        }
        if (aVar == null) {
            return null;
        }
        Object b2 = aVar.b((Object) c.c("sdk_context"));
        if (b2 instanceof Map) {
            Object obj = ((Map) b2).get("backInvocationCallback");
            if (obj instanceof com.mbridge.msdk.config.activity.backdispatcher.a) {
                return (com.mbridge.msdk.config.activity.backdispatcher.a) obj;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k() {
        a(a("902010", (Map<String, Object>) new HashMap()));
    }

    private void l() {
        try {
            Object b2 = this.d.b((Object) c.c("sdk_context"));
            if (b2 instanceof Map) {
                Map map = (Map) b2;
                Object obj = map.get("lifecycleListeners");
                if (obj instanceof List) {
                    ((List) obj).clear();
                }
                Object obj2 = map.get(c.c("component_cache"));
                if (obj2 instanceof Map) {
                    ((Map) obj2).clear();
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    n();
                }
                map.remove("backInvocationCallback");
            }
            ConcurrentHashMap<String, VCCpt> concurrentHashMap = l;
            if (concurrentHashMap != null) {
                concurrentHashMap.remove(this.j);
                if (l.isEmpty()) {
                    l = null;
                }
            }
        } catch (Throwable th) {
            q0.b("VCCpt", th.getMessage(), th);
        }
    }

    private void m() {
        Intent intent = new Intent(com.mbridge.msdk.foundation.controller.c.n().d(), (Class<?>) MBRewardVideoActivity.class);
        intent.putExtra("155", this.k.c());
        intent.putExtra("154", this.k.d());
        intent.putExtra("157", this.k.g());
        intent.putExtra("158", this.k.b());
        intent.putExtra("156", this.k.e());
        b bVar = new b();
        bVar.a(this.j);
        intent.putExtra("lifecycleCallbackByActivity", bVar);
        try {
            if (com.mbridge.msdk.foundation.controller.c.n() != null && com.mbridge.msdk.foundation.controller.c.n().f() != null) {
                ((Activity) com.mbridge.msdk.foundation.controller.c.n().f()).startActivity(intent);
                return;
            }
        } catch (Throwable th) {
            q0.b("VCCpt", th.getMessage());
        }
        intent.addFlags(268435456);
        com.mbridge.msdk.foundation.controller.c.n().d().startActivity(intent);
    }

    private void n() {
        Context context;
        com.mbridge.msdk.config.activity.backdispatcher.a j;
        if (Build.VERSION.SDK_INT >= 33) {
            try {
                ViewGroup e = e();
                if (e != null && (context = e.getContext()) != null && (context instanceof Activity) && (j = j()) != null) {
                    j.a(((Activity) context).getWindow());
                }
            } catch (Throwable th) {
                q0.b("VCCpt", th.getMessage());
            }
        }
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void b(Map<String, Object> map) {
        this.f = "902001";
        this.k = new com.mbridge.msdk.config.component.vc.model.a(map);
        this.j = UUID.randomUUID().toString();
        if (l == null) {
            l = new ConcurrentHashMap<>();
        }
        l.put(this.j, this);
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        super.d();
        i();
        a("902011", (HashMap<String, Object>) null);
    }

    private void a(String str, String str2) {
        a("902008", str, str2);
        h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(ViewGroup viewGroup) {
        com.mbridge.msdk.config.component.vc.model.a aVar;
        if (Build.VERSION.SDK_INT < 33 || viewGroup == null || (aVar = this.k) == null || aVar.f() == 1) {
            return;
        }
        try {
            Context context = viewGroup.getContext();
            if (context != null && (context instanceof Activity)) {
                com.mbridge.msdk.config.activity.backdispatcher.a aVar2 = new com.mbridge.msdk.config.activity.backdispatcher.a();
                aVar2.a(((Activity) context).getWindow(), new k6c0(this, 11));
                a(aVar2);
            }
        } catch (Throwable th) {
            q0.b("VCCpt", th.getMessage());
        }
    }

    private void a(Object obj) {
        try {
            com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar = this.d;
            if (aVar == null) {
                return;
            }
            Object b2 = aVar.b((Object) c.c("sdk_context"));
            if (b2 instanceof Map) {
                ((Map) b2).put("backInvocationCallback", obj);
            }
        } catch (Throwable th) {
            q0.b("VCCpt", th.getMessage());
        }
    }
}
