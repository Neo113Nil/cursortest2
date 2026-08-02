package ru.ozon.android.messenger.utils;

import B0.A0;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.ComponentCallbacksC5392m;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.core.initialization.newinit.d;

/* loaded from: classes10.dex */
public final class g {
    public static final ru.ozon.android.messenger.framework.core.initialization.di.b a(ComponentCallbacksC5392m componentCallbacksC5392m) {
        ru.ozon.android.messenger.framework.core.initialization.newinit.d b11 = b(componentCallbacksC5392m);
        if (b11 != null) {
            return b11.a();
        }
        String e11 = e(componentCallbacksC5392m);
        ru.ozon.android.messenger.api.b.f83914a.getClass();
        return ru.ozon.android.messenger.api.b.c(e11).a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ru.ozon.android.messenger.framework.core.initialization.newinit.d b(@NotNull ComponentCallbacksC5392m componentCallbacksC5392m) {
        Intrinsics.checkNotNullParameter(componentCallbacksC5392m, "<this>");
        for (ComponentCallbacksC5392m componentCallbacksC5392m2 = componentCallbacksC5392m; componentCallbacksC5392m2 != 0; componentCallbacksC5392m2 = componentCallbacksC5392m2.getParentFragment()) {
            if (componentCallbacksC5392m2 instanceof ru.ozon.android.messenger.framework.core.initialization.newinit.d) {
                return (ru.ozon.android.messenger.framework.core.initialization.newinit.d) componentCallbacksC5392m2;
            }
        }
        return null;
    }

    public static final <T> T c(@NotNull ComponentCallbacksC5392m componentCallbacksC5392m, String str, @NotNull Class<T> clazz) {
        Object parcelable;
        Intrinsics.checkNotNullParameter(componentCallbacksC5392m, "<this>");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        T t2 = null;
        if (Build.VERSION.SDK_INT >= 33) {
            Bundle arguments = componentCallbacksC5392m.getArguments();
            if (arguments != null) {
                parcelable = arguments.getParcelable(str, clazz);
                t2 = (T) parcelable;
            }
        } else {
            Bundle arguments2 = componentCallbacksC5392m.getArguments();
            if (arguments2 != null) {
                t2 = (T) arguments2.getParcelable(str);
            }
        }
        if (t2 != null) {
            return t2;
        }
        throw new IllegalArgumentException(A0.b("Parameter with key ", str, " shouldn't be null"));
    }

    @NotNull
    public static final ru.ozon.android.messenger.framework.core.initialization.di.c d(@NotNull ComponentCallbacksC5392m componentCallbacksC5392m) {
        Intrinsics.checkNotNullParameter(componentCallbacksC5392m, "<this>");
        ru.ozon.android.messenger.framework.core.initialization.newinit.d b11 = b(componentCallbacksC5392m);
        if (b11 != null) {
            return b11.getComponent();
        }
        String e11 = e(componentCallbacksC5392m);
        ru.ozon.android.messenger.api.b.f83914a.getClass();
        return ru.ozon.android.messenger.api.b.c(e11).getComponent();
    }

    @NotNull
    public static final String e(@NotNull ComponentCallbacksC5392m componentCallbacksC5392m) {
        String string;
        Intrinsics.checkNotNullParameter(componentCallbacksC5392m, "<this>");
        ru.ozon.android.messenger.framework.core.initialization.newinit.d b11 = b(componentCallbacksC5392m);
        if (b11 != null) {
            return b11.getNetworkConfig().b();
        }
        Bundle arguments = componentCallbacksC5392m.getArguments();
        if (arguments == null || (string = arguments.getString("ARG_MESSENGER_NAMESPACE")) == null) {
            throw new IllegalStateException("Не нашли namespace");
        }
        return string;
    }

    @NotNull
    public static final d.a f(@NotNull ComponentCallbacksC5392m componentCallbacksC5392m) {
        d.a networkConfig;
        Intrinsics.checkNotNullParameter(componentCallbacksC5392m, "<this>");
        ru.ozon.android.messenger.framework.core.initialization.newinit.d b11 = b(componentCallbacksC5392m);
        if (b11 == null || (networkConfig = b11.getNetworkConfig()) == null) {
            throw new IllegalStateException("Не нашли нужный networkConfig");
        }
        return networkConfig;
    }

    @NotNull
    public static final void g(@NotNull ComponentCallbacksC5392m componentCallbacksC5392m, @NotNull Pair... pairs) {
        Intrinsics.checkNotNullParameter(componentCallbacksC5392m, "<this>");
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        componentCallbacksC5392m.setArguments(androidx.core.os.d.b((Pair[]) Arrays.copyOf(pairs, pairs.length)));
    }
}
