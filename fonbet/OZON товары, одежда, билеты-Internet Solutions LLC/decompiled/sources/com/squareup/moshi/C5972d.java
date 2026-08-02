package com.squareup.moshi;

import com.squareup.moshi.AdapterMethodsFactory;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.squareup.moshi.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5972d extends AdapterMethodsFactory.a {

    /* renamed from: h, reason: collision with root package name */
    private JsonAdapter<Object> f60393h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ Set<Annotation> f60394i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ Type[] f60395j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ Type f60396k;

    /* renamed from: l, reason: collision with root package name */
    final /* synthetic */ Set<Annotation> f60397l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    C5972d(Set<? extends Annotation> set, Object obj, Method method, boolean z11, Type[] typeArr, Type type, Set<? extends Annotation> set2, Type type2, int i11) {
        super(1, type2, i11, set, obj, method, z11);
        this.f60394i = set;
        this.f60395j = typeArr;
        this.f60396k = type;
        this.f60397l = set2;
        Intrinsics.checkNotNullExpressionValue(type2, "parameterTypes[0]");
    }

    @Override // com.squareup.moshi.AdapterMethodsFactory.a
    public final void a(@NotNull Moshi moshi, @NotNull AdapterMethodsFactory factory) {
        JsonAdapter<Object> e11;
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(factory, "factory");
        super.a(moshi, factory);
        Type type = this.f60395j[0];
        Type returnType = this.f60396k;
        boolean b11 = D.b(type, returnType);
        Set<Annotation> set = this.f60397l;
        if (b11 && Intrinsics.d(this.f60394i, set)) {
            Intrinsics.checkNotNullExpressionValue(returnType, "returnType");
            e11 = moshi.h(factory, returnType, set);
        } else {
            Intrinsics.checkNotNullExpressionValue(returnType, "returnType");
            e11 = moshi.e(returnType, set);
        }
        this.f60393h = e11;
    }

    @Override // com.squareup.moshi.AdapterMethodsFactory.a
    public final void i(@NotNull Moshi moshi, @NotNull x writer, Object obj) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(writer, "writer");
        JsonAdapter<Object> jsonAdapter = this.f60393h;
        if (jsonAdapter != null) {
            jsonAdapter.mo44toJson(writer, (x) g(obj));
        } else {
            Intrinsics.n("delegate");
            throw null;
        }
    }
}
