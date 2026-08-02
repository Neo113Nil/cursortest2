package ru.ozon.moshi.adapters.serialize.proto;

import Ep.a;
import U7.m;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import ld.C7923d;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/moshi/adapters/serialize/proto/ProtoOneOfAdapterFactory;", "Lcom/squareup/moshi/JsonAdapter$a;", "<init>", "()V", "Ljava/lang/reflect/Type;", "type", "", "", "annotations", "Lcom/squareup/moshi/Moshi;", "moshi", "Lcom/squareup/moshi/JsonAdapter;", "create", "(Ljava/lang/reflect/Type;Ljava/util/Set;Lcom/squareup/moshi/Moshi;)Lcom/squareup/moshi/JsonAdapter;", "moshi-adapters_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ProtoOneOfAdapterFactory implements JsonAdapter.a {
    @Override // com.squareup.moshi.JsonAdapter.a
    public JsonAdapter<?> create(@NotNull Type type, @NotNull Set<? extends Annotation> annotations, @NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(type, "type");
        Class b11 = a.b(annotations, "annotations", moshi, "moshi", type);
        if (Intrinsics.d(b11, List.class) || Intrinsics.d(b11, Collection.class) || Intrinsics.d(b11, Set.class)) {
            try {
                return moshi.h(this, type, annotations);
            } catch (IllegalArgumentException unused) {
                return ProtoOneOfAdapterKt.getDefaultCollectionAdapterFactory().create(type, annotations, moshi);
            }
        }
        Set<? extends Annotation> set = annotations;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (obj instanceof ProtoOneOf) {
                arrayList.add(obj);
            }
        }
        ProtoOneOf protoOneOf = (ProtoOneOf) C7714v.M(arrayList);
        Annotation[] annotations2 = b11.getAnnotations();
        Intrinsics.checkNotNullExpressionValue(annotations2, "getAnnotations(...)");
        ArrayList arrayList2 = new ArrayList();
        for (Annotation annotation : annotations2) {
            if (annotation instanceof ProtoOneOf) {
                arrayList2.add(annotation);
            }
        }
        ProtoOneOf protoOneOf2 = (ProtoOneOf) C7714v.M(arrayList2);
        if (protoOneOf != null && protoOneOf2 != null) {
            throw new IllegalStateException(m.a(b11, "ProtoOneOf annotation must be set only for class or field, but found on both "));
        }
        if (protoOneOf == null) {
            if (protoOneOf2 == null) {
                return null;
            }
            protoOneOf = protoOneOf2;
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : set) {
            if (obj2 instanceof ProtoOneOfSignature) {
                arrayList3.add(obj2);
            }
        }
        Intrinsics.checkNotNullParameter(b11, "<this>");
        List a11 = C7923d.a(N.b(b11), N.b(ProtoOneOfSignature.class));
        if (!arrayList3.isEmpty() && !a11.isEmpty()) {
            throw new IllegalStateException(m.a(b11, "ProtoOneOfSignature annotations must be set only for class or field, but found on both "));
        }
        ArrayList p02 = C7714v.p0(a11, arrayList3);
        if (p02.isEmpty()) {
            return null;
        }
        return new ProtoOneOfAdapter(moshi, protoOneOf, p02);
    }
}
