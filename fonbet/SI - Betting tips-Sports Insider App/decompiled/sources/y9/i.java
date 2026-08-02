package y9;

import com.logrocket.core.f0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: d, reason: collision with root package name */
    public static final long f25750d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f25751e;

    /* renamed from: a, reason: collision with root package name */
    public final String f25752a;

    /* renamed from: b, reason: collision with root package name */
    public final c f25753b;

    /* renamed from: c, reason: collision with root package name */
    public final ba.d f25754c = new ba.d("persistence");

    static {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        TimeUnit timeUnit2 = TimeUnit.MINUTES;
        f25750d = timeUnit.convert(5L, timeUnit2);
        f25751e = timeUnit.convert(30L, timeUnit2);
    }

    public i(String str, c cVar) {
        this.f25752a = str;
        this.f25753b = cVar;
    }

    public final f0 a(ArrayList arrayList) {
        int size = arrayList.size();
        ba.d dVar = this.f25754c;
        if (size > 0) {
            f0 f0Var = ((b) arrayList.get(arrayList.size() - 1)).f25740a.f25735a;
            if (f0Var.f6445a.equals(this.f25752a)) {
                long currentTimeMillis = System.currentTimeMillis() - f0Var.f6460r;
                if (currentTimeMillis >= f25750d) {
                    if (currentTimeMillis >= f25751e) {
                        f0 f0Var2 = new f0(this.f25752a, f0.a(), 0, f0Var.f6449e, null, null);
                        dVar.h("Previous recording past max age to resume. Creating a new session " + f0Var2.c());
                        return f0Var2;
                    }
                    dVar.h("Starting a new session from " + f0Var.c());
                    f0 f0Var3 = new f0(f0Var.f6445a, f0.a(), 0, f0Var.f6449e, f0Var.f6451g, f0Var.f6452h);
                    f0Var3.f6461s = f0Var;
                    return f0Var3;
                }
                dVar.h("Resuming session " + f0Var.c());
                return new f0(f0Var.f6445a, f0Var.f6446b, f0Var.f6447c, UUID.randomUUID().toString(), System.currentTimeMillis(), System.currentTimeMillis(), f0Var.f6449e, f0Var.f6450f, f0Var.f6451g, f0Var.f6452h, f0Var.f6453i, f0Var.j, f0Var.f6454k, f0Var.f6455l, System.currentTimeMillis(), f0Var.f6456m, f0Var.f6457n);
            }
        }
        f0 f0Var4 = new f0(this.f25752a, f0.a(), 0, UUID.randomUUID().toString(), null, null);
        dVar.h("Creating a new session " + f0Var4.c());
        return f0Var4;
    }

    public final ArrayList b() {
        c cVar = this.f25753b;
        ArrayList f6 = cVar.f();
        ArrayList arrayList = new ArrayList();
        Collections.sort(f6, new com.google.android.material.color.utilities.h(4));
        Iterator it = f6.iterator();
        while (it.hasNext()) {
            b a7 = cVar.a((a) it.next());
            a7.d();
            f0 f0Var = a7.f25740a.f25735a;
            String str = f0Var.f6453i;
            char c2 = 0;
            if (str != null) {
                switch (str) {
                    case "FULL":
                        c2 = 3;
                        break;
                    case "NONE":
                        c2 = 1;
                        break;
                    case "LIMITED":
                        c2 = 2;
                        break;
                }
            }
            boolean z5 = f0Var.j;
            if (c2 != 2 || z5) {
                arrayList.add(a7);
            } else {
                this.f25754c.a("Found unconfirmed session " + f0Var.f6446b + "/" + f0Var.f6447c + " with limited lookback conditional recording enabled. Deleting files");
                a7.c();
            }
        }
        return arrayList;
    }
}
