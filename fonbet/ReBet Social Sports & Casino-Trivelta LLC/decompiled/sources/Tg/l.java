package Tg;

import ch.C2924a;
import ch.InterfaceC2925b;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final C2924a f11893a = new C2924a("ApplicationPluginRegistry");

    public static final C2924a a() {
        return f11893a;
    }

    public static final Object b(Ng.a aVar, k plugin) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(plugin, "plugin");
        Object c10 = c(aVar, plugin);
        if (c10 != null) {
            return c10;
        }
        throw new IllegalStateException("Plugin " + plugin + " is not installed. Consider using `install(" + plugin.getKey() + ")` in client config first.");
    }

    public static final Object c(Ng.a aVar, k plugin) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(plugin, "plugin");
        InterfaceC2925b interfaceC2925b = (InterfaceC2925b) aVar.getAttributes().f(f11893a);
        if (interfaceC2925b != null) {
            return interfaceC2925b.f(plugin.getKey());
        }
        return null;
    }
}
