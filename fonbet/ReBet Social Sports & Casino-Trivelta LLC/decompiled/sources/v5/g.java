package v5;

import android.view.View;
import android.view.ViewGroup;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;
import y5.C6855b;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f67034a;

    /* renamed from: b, reason: collision with root package name */
    public static final Map f67035b;

    /* renamed from: c, reason: collision with root package name */
    public static final Map f67036c;

    static {
        g gVar = new g();
        f67034a = gVar;
        f67035b = new LinkedHashMap();
        f67036c = new LinkedHashMap();
        gVar.l();
        gVar.k();
    }

    public static final Class f(Class it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getSuperclass();
    }

    public static final InterfaceC6638a g(Class it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (InterfaceC6638a) f67036c.get(it);
    }

    public static final Class i(Class it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getSuperclass();
    }

    public static final InterfaceC6639b j(Class it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (InterfaceC6639b) f67035b.get(it);
    }

    public y5.c e(ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(layoutParams, "layoutParams");
        Class<?> cls = layoutParams.getClass();
        Intrinsics.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<*>");
        InterfaceC6638a interfaceC6638a = (InterfaceC6638a) SequencesKt.firstOrNull(SequencesKt.mapNotNull(SequencesKt.generateSequence(cls, (Function1<? super Class<?>, ? extends Class<?>>) new Function1() { // from class: v5.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Class f10;
                f10 = g.f((Class) obj);
                return f10;
            }
        }), new Function1() { // from class: v5.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                InterfaceC6638a g10;
                g10 = g.g((Class) obj);
                return g10;
            }
        }));
        if (interfaceC6638a != null) {
            return interfaceC6638a.a(layoutParams);
        }
        throw new IllegalArgumentException("Converter for class " + cls.getCanonicalName() + " not found");
    }

    public y5.d h(View view, C6855b hierarchyMaskConfiguration) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(hierarchyMaskConfiguration, "hierarchyMaskConfiguration");
        Class<?> cls = view.getClass();
        Intrinsics.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<*>");
        InterfaceC6639b interfaceC6639b = (InterfaceC6639b) SequencesKt.firstOrNull(SequencesKt.mapNotNull(SequencesKt.generateSequence(cls, (Function1<? super Class<?>, ? extends Class<?>>) new Function1() { // from class: v5.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Class i10;
                i10 = g.i((Class) obj);
                return i10;
            }
        }), new Function1() { // from class: v5.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                InterfaceC6639b j10;
                j10 = g.j((Class) obj);
                return j10;
            }
        }));
        if (interfaceC6639b != null) {
            return interfaceC6639b.a(view, hierarchyMaskConfiguration);
        }
        throw new IllegalArgumentException("Converter for class " + cls.getCanonicalName() + " not found");
    }

    public final void k() {
        for (h hVar : h.f67037b.a()) {
            Map map = f67036c;
            Class b10 = hVar.b();
            Intrinsics.checkNotNull(hVar, "null cannot be cast to non-null type com.coralogix.android.sdk.internal.infrastructure.display.converters.Converter.Layout<com.coralogix.android.sdk.internal.infrastructure.display.model.Model.LayoutParams, android.view.ViewGroup.LayoutParams>");
            map.put(b10, hVar);
        }
    }

    public final void l() {
        for (i iVar : i.f67039b.a()) {
            Map map = f67035b;
            Class b10 = iVar.b();
            Intrinsics.checkNotNull(iVar, "null cannot be cast to non-null type com.coralogix.android.sdk.internal.infrastructure.display.converters.Converter.View<com.coralogix.android.sdk.internal.infrastructure.display.model.Model.ViewParams, android.view.View>");
            map.put(b10, iVar);
        }
    }
}
