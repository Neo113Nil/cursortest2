package com.plaid.internal;

import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public abstract class V<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f39696a;

    public static final class a extends V<X6> {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public static final a f39697b = new a();

        public a() {
            super(Reflection.getOrCreateKotlinClass(X6.class));
        }
    }

    public V(KClass kClass) {
        String simpleName = JvmClassMappingKt.getJavaClass(kClass).getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        this.f39696a = simpleName;
    }
}
