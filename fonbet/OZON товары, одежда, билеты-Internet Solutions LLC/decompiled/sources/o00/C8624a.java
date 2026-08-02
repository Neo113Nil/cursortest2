package o00;

import android.app.Application;
import android.content.Context;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: o00.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C8624a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final LinkedHashMap f77453a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f77454b = 0;

    public static InterfaceC8626c a(@NotNull Context appContext) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        return (InterfaceC8626c) f77453a.get(appContext);
    }

    public static void b(@NotNull Application appContext, @NotNull InterfaceC8626c component) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(component, "component");
        f77453a.put(appContext, component);
    }
}
