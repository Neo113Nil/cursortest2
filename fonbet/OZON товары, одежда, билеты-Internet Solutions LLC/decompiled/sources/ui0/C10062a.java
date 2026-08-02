package ui0;

import U7.m;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: ui0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10062a implements z0.b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<Class<? extends w0>, Pc.a<w0>> f100798a;

    public C10062a(@NotNull Map<Class<? extends w0>, Pc.a<w0>> creators) {
        Intrinsics.checkNotNullParameter(creators, "creators");
        this.f100798a = creators;
    }

    @Override // androidx.lifecycle.z0.b
    @NotNull
    public final <T extends w0> T create(@NotNull Class<T> modelClass) {
        Object obj;
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Map<Class<? extends w0>, Pc.a<w0>> map = this.f100798a;
        Pc.a<w0> aVar = map.get(modelClass);
        if (aVar == null) {
            Iterator<T> it = map.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (modelClass.isAssignableFrom((Class) ((Map.Entry) obj).getKey())) {
                    break;
                }
            }
            Map.Entry entry = (Map.Entry) obj;
            aVar = entry != null ? (Pc.a) entry.getValue() : null;
            if (aVar == null) {
                throw new IllegalArgumentException(m.a(modelClass, "unknown model class "));
            }
        }
        try {
            w0 w0Var = aVar.get();
            Intrinsics.g(w0Var, "null cannot be cast to non-null type T of ru.ozon.tracker.debug.menu.di.utils.DaggerViewModelFactory.create");
            return (T) w0Var;
        } catch (Exception e11) {
            throw new RuntimeException(e11);
        }
    }
}
