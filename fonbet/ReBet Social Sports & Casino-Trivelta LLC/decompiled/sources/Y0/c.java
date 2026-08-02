package Y0;

import androidx.lifecycle.Q;
import androidx.lifecycle.U;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* loaded from: classes.dex */
public final class c implements U.c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f13893a = new c();

    @Override // androidx.lifecycle.U.c
    public Q create(KClass modelClass, X0.a extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        return d.f13894a.a(JvmClassMappingKt.getJavaClass(modelClass));
    }
}
