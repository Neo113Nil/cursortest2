package com.squareup.moshi;

import com.squareup.moshi.AdapterMethodsFactory;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.squareup.moshi.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5970b extends AdapterMethodsFactory.a {

    /* renamed from: h, reason: collision with root package name */
    public JsonAdapter<Object> f60388h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ Type f60389i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ Set<Annotation> f60390j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ Type[] f60391k;

    /* renamed from: l, reason: collision with root package name */
    final /* synthetic */ Set<Annotation> f60392l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    C5970b(Type returnType, Set<? extends Annotation> set, Object obj, Method method, boolean z11, Type[] typeArr, Set<? extends Annotation> set2, int i11) {
        super(1, returnType, i11, set, obj, method, z11);
        this.f60389i = returnType;
        this.f60390j = set;
        this.f60391k = typeArr;
        this.f60392l = set2;
        Intrinsics.checkNotNullExpressionValue(returnType, "returnType");
    }

    @Override // com.squareup.moshi.AdapterMethodsFactory.a
    public final void a(@NotNull Moshi moshi, @NotNull AdapterMethodsFactory factory) {
        JsonAdapter<Object> e11;
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(factory, "factory");
        super.a(moshi, factory);
        Type[] typeArr = this.f60391k;
        boolean b11 = D.b(typeArr[0], this.f60389i);
        Set<Annotation> set = this.f60392l;
        if (b11 && Intrinsics.d(set, this.f60390j)) {
            Type type = typeArr[0];
            Intrinsics.checkNotNullExpressionValue(type, "parameterTypes[0]");
            e11 = moshi.h(factory, type, set);
        } else {
            Type type2 = typeArr[0];
            Intrinsics.checkNotNullExpressionValue(type2, "parameterTypes[0]");
            e11 = moshi.e(type2, set);
        }
        Intrinsics.checkNotNullParameter(e11, "<set-?>");
        this.f60388h = e11;
    }

    @Override // com.squareup.moshi.AdapterMethodsFactory.a
    public final Object b(@NotNull Moshi moshi, @NotNull n reader) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(reader, "reader");
        JsonAdapter<Object> jsonAdapter = this.f60388h;
        if (jsonAdapter != null) {
            return g(jsonAdapter.fromJson(reader));
        }
        Intrinsics.n("delegate");
        throw null;
    }
}
