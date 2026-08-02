package defpackage;

import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.a;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@x8d(NotificationCompat.CATEGORY_NAVIGATION)
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lj7d;", "Ly8d;", "Lg7d;", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public class j7d extends y8d {
    public final z8d c;

    public j7d(z8d z8dVar) {
        z8dVar.getClass();
        this.c = z8dVar;
    }

    @Override // defpackage.y8d
    public final void d(List list, u7d u7dVar) {
        list.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d6d d6dVar = (d6d) it.next();
            s6d s6dVar = d6dVar.b;
            s6dVar.getClass();
            g7d g7dVar = (g7d) s6dVar;
            fsf fsfVar = new fsf();
            fsfVar.a = d6dVar.h.a();
            gtj gtjVar = g7dVar.g;
            int i = gtjVar.b;
            String str = (String) gtjVar.c;
            if (i == 0 && str == null) {
                i3d i3dVar = g7dVar.b;
                String str2 = (String) i3dVar.d;
                if (str2 == null) {
                    str2 = String.valueOf(i3dVar.b);
                }
                str2.getClass();
                if (((g7d) gtjVar.d).b.b == 0) {
                    str2 = "the root navigation";
                }
                hc5.f("no start destination defined via app:startDestination for ".concat(str2));
                return;
            }
            s6d k = str != null ? gtjVar.k(str, false) : (s6d) gz8.C((zwh) gtjVar.e, i);
            if (k == null) {
                String str3 = (String) gtjVar.f;
                if (str3 == null) {
                    str3 = (String) gtjVar.c;
                    if (str3 == null) {
                        str3 = String.valueOf(gtjVar.b);
                    }
                    gtjVar.f = str3;
                }
                str3.getClass();
                a70.p(lnb.o("navigation destination ", str3, " is not a direct child of this NavGraph"));
                return;
            }
            i3d i3dVar2 = k.b;
            if (str != null) {
                if (!str.equals((String) i3dVar2.g)) {
                    r6d a = i3dVar2.a(str);
                    Bundle bundle = a != null ? a.b : null;
                    if (bundle != null && !bundle.isEmpty()) {
                        lm5.a.getClass();
                        Bundle E = hz8.E((Pair[]) Arrays.copyOf(new Pair[0], 0));
                        E.putAll(bundle);
                        Bundle bundle2 = (Bundle) fsfVar.a;
                        if (bundle2 != null) {
                            E.putAll(bundle2);
                        }
                        fsfVar.a = E;
                    }
                }
                if (k.m().isEmpty()) {
                    continue;
                } else {
                    ArrayList D = i2a.D(k.m(), new k31(fsfVar, 1));
                    if (!D.isEmpty()) {
                        i3c.j("Cannot navigate to startDestination ", k, ". Missing required arguments [", D, 93);
                        return;
                    }
                }
            }
            this.c.b(k.a).d(a.c(b().b(k, k.c((Bundle) fsfVar.a))), u7dVar);
        }
    }

    @Override // defpackage.y8d
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public g7d a() {
        return new g7d(this);
    }
}
