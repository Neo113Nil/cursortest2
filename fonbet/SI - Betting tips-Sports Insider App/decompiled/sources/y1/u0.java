package y1;

import androidx.appcompat.widget.c1;
import com.google.android.gms.internal.measurement.d5;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class u0 {

    /* renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f25638b = new LinkedHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f25639a = new LinkedHashMap();

    public final void a(t0 navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        String name = d5.w(navigator.getClass());
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        if (name == null || name.length() <= 0) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        LinkedHashMap linkedHashMap = this.f25639a;
        t0 t0Var = (t0) linkedHashMap.get(name);
        if (Intrinsics.areEqual(t0Var, navigator)) {
            return;
        }
        if (t0Var != null && t0Var.f25635b) {
            throw new IllegalStateException(("Navigator " + navigator + " is replacing an already attached " + t0Var).toString());
        }
        if (!navigator.f25635b) {
            return;
        }
        throw new IllegalStateException(("Navigator " + navigator + " is already attached to another NavController").toString());
    }

    public final t0 b(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (name == null || name.length() <= 0) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        t0 t0Var = (t0) this.f25639a.get(name);
        if (t0Var != null) {
            return t0Var;
        }
        throw new IllegalStateException(c1.n("Could not find Navigator with name \"", name, "\". You must call NavController.addNavigator() for each navigation type."));
    }
}
