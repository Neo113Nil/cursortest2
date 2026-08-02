package ru.ozon.android.messenger.utils;

import Sc.InterfaceC4008j;
import android.os.Build;
import android.os.Bundle;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class f {
    public static final <T> T a(@NotNull Bundle bundle, String str, @NotNull Class<T> clazz) {
        T t2;
        Object parcelable;
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = bundle.getParcelable(str, clazz);
            t2 = (T) parcelable;
        } else {
            t2 = (T) bundle.getParcelable(str);
        }
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException("Parcelable with key: " + str + ", class: " + clazz + " can not be null");
    }

    @NotNull
    public static final <T> InterfaceC4008j<T> b(@NotNull Function0<? extends T> initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        return Sc.k.a(Sc.n.NONE, initializer);
    }
}
