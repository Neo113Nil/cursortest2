package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class lia implements KType {
    public final KType a;

    public lia(KType kType) {
        kType.getClass();
        this.a = kType;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        lia liaVar = obj instanceof lia ? (lia) obj : null;
        KType kType = liaVar != null ? liaVar.a : null;
        KType kType2 = this.a;
        if (!Intrinsics.c(kType2, kType)) {
            return false;
        }
        KClassifier classifier = kType2.getClassifier();
        if (classifier instanceof KClass) {
            KType kType3 = obj instanceof KType ? (KType) obj : null;
            KClassifier classifier2 = kType3 != null ? kType3.getClassifier() : null;
            if (classifier2 != null && (classifier2 instanceof KClass)) {
                return sha.x((KClass) classifier).equals(sha.x((KClass) classifier2));
            }
        }
        return false;
    }

    @Override // kotlin.reflect.KAnnotatedElement
    public final List getAnnotations() {
        return this.a.getAnnotations();
    }

    @Override // kotlin.reflect.KType
    public final List getArguments() {
        return this.a.getArguments();
    }

    @Override // kotlin.reflect.KType
    public final KClassifier getClassifier() {
        return this.a.getClassifier();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // kotlin.reflect.KType
    public final boolean isMarkedNullable() {
        return this.a.isMarkedNullable();
    }

    public final String toString() {
        return "KTypeWrapper: " + this.a;
    }
}
