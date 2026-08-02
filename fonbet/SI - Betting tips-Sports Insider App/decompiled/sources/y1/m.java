package y1;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.d5;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final b6.p f25591a;

    public m(l entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        int i5 = entry.f25583b.f25534b.f3017e;
        Intrinsics.checkNotNullParameter(entry, "entry");
        b6.p pVar = new b6.p();
        pVar.f3079b = entry.f25587f;
        pVar.f3078a = i5;
        b2.d dVar = entry.f25589h;
        pVar.f3080c = dVar.a();
        kotlin.collections.n0.c().getClass();
        Bundle outBundle = a.a.b((Pair[]) Arrays.copyOf(new Pair[0], 0));
        Intrinsics.checkNotNullParameter(outBundle, "source");
        pVar.f3081d = outBundle;
        Intrinsics.checkNotNullParameter(outBundle, "outBundle");
        Intrinsics.checkNotNullParameter(outBundle, "outBundle");
        dVar.f2963h.c(outBundle);
        this.f25591a = pVar;
    }

    public final l a(b2.e context, b0 destination, androidx.lifecycle.x hostLifecycleState, s sVar) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(hostLifecycleState, "hostLifecycleState");
        b6.p pVar = this.f25591a;
        Bundle args = (Bundle) pVar.f3080c;
        if (args != null) {
            Intrinsics.checkNotNullParameter(args, "args");
            Intrinsics.checkNotNullParameter(context, "context");
            args.setClassLoader(context.f2968a.getClassLoader());
        } else {
            args = null;
        }
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(hostLifecycleState, "hostLifecycleState");
        String id2 = (String) pVar.f3079b;
        Bundle bundle = (Bundle) pVar.f3081d;
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(hostLifecycleState, "hostLifecycleState");
        Intrinsics.checkNotNullParameter(id2, "id");
        return new l(context, destination, args, hostLifecycleState, sVar, id2, bundle);
    }

    public final Bundle b() {
        b6.p pVar = this.f25591a;
        pVar.getClass();
        kotlin.collections.n0.c().getClass();
        Bundle source = a.a.b((Pair[]) Arrays.copyOf(new Pair[0], 0));
        Intrinsics.checkNotNullParameter(source, "source");
        String value = (String) pVar.f3079b;
        Intrinsics.checkNotNullParameter("nav-entry-state:id", "key");
        Intrinsics.checkNotNullParameter(value, "value");
        source.putString("nav-entry-state:id", value);
        int i5 = pVar.f3078a;
        Intrinsics.checkNotNullParameter("nav-entry-state:destination-id", "key");
        source.putInt("nav-entry-state:destination-id", i5);
        Bundle source2 = (Bundle) pVar.f3080c;
        if (source2 == null) {
            kotlin.collections.n0.c().getClass();
            source2 = a.a.b((Pair[]) Arrays.copyOf(new Pair[0], 0));
            Intrinsics.checkNotNullParameter(source2, "source");
        }
        h8.b.x(source, "nav-entry-state:args", source2);
        h8.b.x(source, "nav-entry-state:saved-state", (Bundle) pVar.f3081d);
        return source;
    }

    public m(Bundle source) {
        Intrinsics.checkNotNullParameter(source, "state");
        source.setClassLoader(m.class.getClassLoader());
        Intrinsics.checkNotNullParameter(source, "state");
        b6.p pVar = new b6.p();
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter("nav-entry-state:id", "key");
        String string = source.getString("nav-entry-state:id");
        if (string != null) {
            pVar.f3079b = string;
            Intrinsics.checkNotNullParameter(source, "source");
            pVar.f3078a = d5.u(source, "nav-entry-state:destination-id");
            Intrinsics.checkNotNullParameter(source, "source");
            pVar.f3080c = d5.x(source, "nav-entry-state:args");
            Intrinsics.checkNotNullParameter(source, "source");
            pVar.f3081d = d5.x(source, "nav-entry-state:saved-state");
            this.f25591a = pVar;
            return;
        }
        com.google.android.play.core.appupdate.b.v("nav-entry-state:id");
        throw null;
    }
}
