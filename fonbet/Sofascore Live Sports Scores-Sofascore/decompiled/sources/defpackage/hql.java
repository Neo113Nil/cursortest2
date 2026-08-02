package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public interface hql extends ServiceConnection, jql {
    void a(String str);

    boolean a();

    void b();

    void b(ebm ebmVar);

    void b(String str);

    void c(ebm ebmVar);

    void c(String str);

    boolean c();

    String d();

    void destroy();

    String e();

    void e(ComponentName componentName, IBinder iBinder);

    boolean f();

    Context g();

    boolean h();

    String i();

    boolean j();

    IIgniteServiceAPI k();
}
