package hh;

import java.lang.reflect.Type;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;

/* renamed from: hh.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4509b {
    public static final boolean a(Object obj, KClass type) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        return JvmClassMappingKt.getJavaClass(type).isInstance(obj);
    }

    public static final C4508a b(Type reifiedType, KClass kClass, KType kType) {
        Intrinsics.checkNotNullParameter(reifiedType, "reifiedType");
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        return new C4508a(kClass, reifiedType, kType);
    }
}
