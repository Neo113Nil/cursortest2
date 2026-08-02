package Nh;

import android.app.Activity;
import android.net.Uri;
import w.d;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: Nh.a$a, reason: collision with other inner class name */
    public interface InterfaceC0166a {
        void a(Activity activity, Uri uri);
    }

    public static void a(Activity activity, d dVar, Uri uri, InterfaceC0166a interfaceC0166a) {
        String a10 = b.a(activity);
        if (a10 != null) {
            dVar.f67200a.setPackage(a10);
            dVar.a(activity, uri);
        } else if (interfaceC0166a != null) {
            interfaceC0166a.a(activity, uri);
        }
    }
}
