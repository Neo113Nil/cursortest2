package i3;

import android.app.Activity;
import o3.C5796a;
import q3.AbstractC6112d;
import q3.C6111c;

/* renamed from: i3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4520a extends AbstractC6112d {

    /* renamed from: a, reason: collision with root package name */
    public String f48056a;

    /* renamed from: i3.a$a, reason: collision with other inner class name */
    public interface InterfaceC0724a {
        void a(Throwable th2, C4526g c4526g);

        void b(C4526g c4526g);

        void c(C4526g c4526g);
    }

    public C4520a(String str) {
        c(str);
    }

    public void a(Activity activity, C6111c c6111c, InterfaceC0724a interfaceC0724a) {
        b(activity, c6111c, this.f48056a, interfaceC0724a);
    }

    public final void b(Activity activity, C6111c c6111c, String str, InterfaceC0724a interfaceC0724a) {
        try {
            d(str);
            new C4527h(activity, c6111c, interfaceC0724a).q();
        } catch (Exception e10) {
            interfaceC0724a.a(e10, null);
        }
    }

    public final void c(String str) {
        d(str);
        this.f48056a = str;
    }

    public final void d(String str) {
        if (str == null || str.length() < 1 || !str.startsWith("pk_")) {
            throw new C5796a("Invalid public key. To create a token, you must use a valid public key.\nEnsure that you have set a public key.\nCheck http://paystack.co for more");
        }
    }
}
