package di;

import java.util.List;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;

/* renamed from: di.a0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4078a0 implements KType {

    /* renamed from: a, reason: collision with root package name */
    public final KType f45343a;

    public C4078a0(KType origin) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        this.f45343a = origin;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        KType kType = this.f45343a;
        C4078a0 c4078a0 = obj instanceof C4078a0 ? (C4078a0) obj : null;
        if (!Intrinsics.areEqual(kType, c4078a0 != null ? c4078a0.f45343a : null)) {
            return false;
        }
        KClassifier classifier = getClassifier();
        if (classifier instanceof KClass) {
            KType kType2 = obj instanceof KType ? (KType) obj : null;
            KClassifier classifier2 = kType2 != null ? kType2.getClassifier() : null;
            if (classifier2 != null && (classifier2 instanceof KClass)) {
                return Intrinsics.areEqual(JvmClassMappingKt.getJavaClass((KClass) classifier), JvmClassMappingKt.getJavaClass((KClass) classifier2));
            }
        }
        return false;
    }

    @Override // kotlin.reflect.KAnnotatedElement
    public List getAnnotations() {
        return this.f45343a.getAnnotations();
    }

    @Override // kotlin.reflect.KType
    public List getArguments() {
        return this.f45343a.getArguments();
    }

    @Override // kotlin.reflect.KType
    public KClassifier getClassifier() {
        return this.f45343a.getClassifier();
    }

    public int hashCode() {
        return this.f45343a.hashCode();
    }

    @Override // kotlin.reflect.KType
    public boolean isMarkedNullable() {
        return this.f45343a.isMarkedNullable();
    }

    public String toString() {
        return "KTypeWrapper: " + this.f45343a;
    }
}
