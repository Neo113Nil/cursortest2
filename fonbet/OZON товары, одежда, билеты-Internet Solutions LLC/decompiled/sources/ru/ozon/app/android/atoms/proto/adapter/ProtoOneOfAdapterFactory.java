package ru.ozon.app.android.atoms.proto.adapter;

import Sc.InterfaceC3999a;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.proto.ProtoOneOf;

@InterfaceC3999a
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/atoms/proto/adapter/ProtoOneOfAdapterFactory;", "Lcom/squareup/moshi/JsonAdapter$a;", "<init>", "()V", "Ljava/lang/reflect/Type;", "type", "", "", "annotations", "Lcom/squareup/moshi/Moshi;", "moshi", "Lcom/squareup/moshi/JsonAdapter;", "create", "(Ljava/lang/reflect/Type;Ljava/util/Set;Lcom/squareup/moshi/Moshi;)Lcom/squareup/moshi/JsonAdapter;", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ProtoOneOfAdapterFactory implements JsonAdapter.a {
    @Override // com.squareup.moshi.JsonAdapter.a
    public JsonAdapter<?> create(@NotNull Type type, @NotNull Set<? extends Annotation> annotations, @NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        ArrayList arrayList = new ArrayList();
        for (Object obj : annotations) {
            if (obj instanceof ProtoOneOf) {
                arrayList.add(obj);
            }
        }
        Class<?> c11 = D.c(type);
        Annotation[] annotations2 = c11.getAnnotations();
        Intrinsics.checkNotNullExpressionValue(annotations2, "getAnnotations(...)");
        ArrayList arrayList2 = new ArrayList();
        for (Annotation annotation : annotations2) {
            if (annotation instanceof ProtoOneOf) {
                arrayList2.add(annotation);
            }
        }
        if (!arrayList2.isEmpty() && !arrayList.isEmpty()) {
            throw new IllegalStateException("Annotation ProtoOneOf must be set only for class or field.");
        }
        ArrayList p02 = C7714v.p0(arrayList2, arrayList);
        if (p02.isEmpty()) {
            return null;
        }
        ProtoOneOf protoOneOf = (ProtoOneOf) C7714v.K(p02);
        if (Iterable.class.isAssignableFrom(c11)) {
            throw new IllegalStateException("for Collection use ProtoOneOfCollection");
        }
        return new ProtoOneOfAdapter(moshi, protoOneOf);
    }
}
