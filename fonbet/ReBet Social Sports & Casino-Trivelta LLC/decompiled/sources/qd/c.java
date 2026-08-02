package qd;

import com.zoho.livechat.android.utils.LiveChatUtil;
import com.zoho.livechat.android.utils.MobilistenUtil;
import com.zoho.messenger.api.h;
import com.zoho.messenger.api.i;
import dg.C4073a;
import ie.b;
import java.util.Hashtable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import me.C5582a;
import ne.l;
import rd.C6218a;
import wg.C6754i;
import xg.C6825b;

/* loaded from: classes4.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final com.zoho.livechat.android.modules.conversations.data.wms.handlers.b f63474a = new com.zoho.livechat.android.modules.conversations.data.wms.handlers.b();

    /* renamed from: b, reason: collision with root package name */
    public static final Oe.a f63475b = new Oe.a();

    /* renamed from: c, reason: collision with root package name */
    public static final com.zoho.livechat.android.modules.conversations.data.wms.handlers.a f63476c = new com.zoho.livechat.android.modules.conversations.data.wms.handlers.a();

    public static /* synthetic */ Unit a(String str, String str2, String str3, String str4, ug.e eVar, C4073a c4073a, C5582a c5582a) {
        try {
            if (!c5582a.d() || c5582a.b() == null || ((String) c5582a.b()).isEmpty()) {
                LiveChatUtil.log("PEX | TOKEN FETCH FAILED");
                f63475b.r(false);
            } else {
                C6825b c6825b = new C6825b(str, (String) c5582a.b());
                c6825b.j(C6218a.L());
                String visitorName = LiveChatUtil.getVisitorName();
                if (visitorName != null && !visitorName.trim().isEmpty()) {
                    c6825b.i(visitorName);
                }
                Hashtable hashtable = new Hashtable();
                hashtable.put("bundleid", str2);
                hashtable.put("accesskey", str3);
                String l10 = Ye.d.l(De.a.InstallationId, null);
                String l11 = Ye.d.l(De.a.PnsKey, null);
                if (l11 != null && !l11.trim().isEmpty()) {
                    System.setProperty("pnskey", l11);
                }
                LiveChatUtil.log("PEX | PCONNECT CALLING CONNECT");
                com.zoho.messenger.api.b.b(str4, l10, c6825b, eVar, c4073a, hashtable);
            }
        } catch (Throwable th2) {
            LiveChatUtil.log(th2);
        }
        return Unit.INSTANCE;
    }

    public static void b() {
        com.zoho.messenger.api.b.a(f());
        LiveChatUtil.log("WMS, Session cleared");
    }

    public static void c() {
        synchronized (c.class) {
            try {
                String f10 = f();
                if (j()) {
                    com.zoho.messenger.api.b.j(f10);
                    return;
                }
                String l10 = Ye.d.l(De.a.AnnonId, null);
                Oe.a aVar = f63475b;
                com.zoho.messenger.api.b.k(f10, aVar);
                h.l(f10, f63476c);
                i.m(f10, f63474a);
                if (!aVar.q() && !k() && l10 != null) {
                    aVar.r(true);
                    d(l10, f10, ug.e.f66668R, new C4073a(15));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void d(final String str, final String str2, final ug.e eVar, final C4073a c4073a) {
        LiveChatUtil.log("PEX | PCONNECT INIT");
        final String c10 = MobilistenUtil.c();
        final String g10 = MobilistenUtil.g();
        if (c10 == null || c10.trim().isEmpty()) {
            LiveChatUtil.log("PEX | ACCESS KEY IS EMPTY");
            l.f(new b.m());
            f63475b.r(false);
        } else if (g10 != null && !g10.trim().isEmpty()) {
            Ed.a.h(new Function1() { // from class: qd.b
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return c.a(str, g10, c10, str2, eVar, c4073a, (C5582a) obj);
                }
            });
        } else {
            LiveChatUtil.log("PEX | PACKAGE NAME IS EMPTY");
            f63475b.r(false);
        }
    }

    public static void e() {
        LiveChatUtil.log("PEX | disconnect");
        com.zoho.messenger.api.b.c(f());
        Oe.a aVar = f63475b;
        aVar.r(false);
        aVar.s(false);
        LiveChatUtil.log("PEX | DISCONNECTED");
    }

    public static String f() {
        return "Wms-" + Ye.d.l(De.a.AnnonId, "");
    }

    public static void g() {
        String f10 = f();
        if (!com.zoho.messenger.api.b.g(f10)) {
            LiveChatUtil.log("PEX | HOLD RETURNED FOR DISCONNECTED");
            return;
        }
        LiveChatUtil.log("PEX | HOLD CALLED");
        if (Td.e.m0()) {
            LiveChatUtil.log("PEX | HOLD RETURNED FOR ACTIVE CALL");
            return;
        }
        com.zoho.messenger.api.b.f(f10);
        if (com.zoho.messenger.api.b.h(f10)) {
            LiveChatUtil.log("PEX | HOLD");
        } else {
            LiveChatUtil.log("PEX | HOLD FAILED");
        }
    }

    public static boolean h() {
        return com.zoho.messenger.api.b.g(f());
    }

    public static boolean i() {
        return !com.zoho.messenger.api.b.g(f()) && f63475b.q();
    }

    public static boolean j() {
        return com.zoho.messenger.api.b.h(f());
    }

    public static boolean k() {
        return com.zoho.messenger.api.b.g(f()) && !j();
    }

    public static void l(C6754i c6754i) {
        if (k()) {
            try {
                com.zoho.messenger.api.b.i(f(), c6754i);
            } catch (Exception e10) {
                LiveChatUtil.log(e10);
            }
        }
    }

    public static void m() {
        LiveChatUtil.log("PEX | RESUME Called");
        com.zoho.messenger.api.b.j(f());
        if (!k()) {
            LiveChatUtil.log("PEX | STILL ON HOLD");
            return;
        }
        LiveChatUtil.log("PEX | RESUME");
        Function1 e10 = rd.b.e().e();
        if (e10 != null) {
            e10.invoke(Boolean.TRUE);
            rd.b.e().q(null);
        }
    }

    public static void n(boolean z10) {
        f63475b.r(z10);
    }
}
