package fi;

import bi.m;
import ei.AbstractC4212b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.serialization.json.JsonElement;

/* loaded from: classes5.dex */
public abstract class d0 {
    public static final boolean c(bi.f fVar) {
        return (fVar.getKind() instanceof bi.e) || fVar.getKind() == m.b.f25229a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final JsonElement d(AbstractC4212b json, Object obj, Zh.p serializer) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        new M(json, new Function1() { // from class: fi.c0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit e10;
                e10 = d0.e(Ref.ObjectRef.this, (JsonElement) obj2);
                return e10;
            }
        }).i(serializer, obj);
        T t10 = objectRef.element;
        if (t10 != 0) {
            return (JsonElement) t10;
        }
        Intrinsics.throwUninitializedPropertyAccessException("result");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit e(Ref.ObjectRef objectRef, JsonElement it) {
        Intrinsics.checkNotNullParameter(it, "it");
        objectRef.element = it;
        return Unit.INSTANCE;
    }
}
