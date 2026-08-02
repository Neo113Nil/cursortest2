package qd;

import com.zoho.livechat.android.utils.LiveChatUtil;
import java.util.Hashtable;
import wg.AbstractC6749d;
import wg.C6748c;
import wg.C6751f;
import wg.C6753h;
import wg.C6754i;
import wg.C6755j;
import wg.InterfaceC6750e;

/* loaded from: classes4.dex */
public class g implements InterfaceC6750e {
    public void g(String str) {
        Hashtable hashtable = new Hashtable();
        hashtable.put("chids", str);
        C6754i c6754i = new C6754i(C6755j.f67762t, hashtable);
        c6754i.l(this);
        try {
            c.l(c6754i);
        } catch (C6751f e10) {
            LiveChatUtil.log("" + e10);
        }
    }

    @Override // wg.InterfaceC6750e
    public void a(C6753h c6753h) {
    }

    @Override // wg.InterfaceC6750e
    public void b(AbstractC6749d abstractC6749d) {
    }

    @Override // wg.InterfaceC6750e
    public void c(AbstractC6749d abstractC6749d) {
    }

    @Override // wg.InterfaceC6750e
    public void d(C6753h c6753h) {
    }

    @Override // wg.InterfaceC6750e
    public void e(C6748c c6748c) {
    }

    @Override // wg.InterfaceC6750e
    public void f(C6753h c6753h, boolean z10) {
    }
}
