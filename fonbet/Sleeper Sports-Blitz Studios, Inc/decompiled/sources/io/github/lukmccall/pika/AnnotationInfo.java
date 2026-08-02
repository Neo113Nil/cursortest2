package io.github.lukmccall.pika;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* compiled from: Types.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\r\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0005HÆ\u0003J\u0017\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007HÆ\u0003J9\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\b\u0002\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lio/github/lukmccall/pika/AnnotationInfo;", "", "className", "", "kClass", "Lkotlin/reflect/KClass;", "arguments", "", "<init>", "(Ljava/lang/String;Lkotlin/reflect/KClass;Ljava/util/Map;)V", "getClassName", "()Ljava/lang/String;", "getKClass", "()Lkotlin/reflect/KClass;", "getArguments", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "pika-api"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class AnnotationInfo {
    private final Map<String, Object> arguments;
    private final String className;
    private final KClass<?> kClass;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AnnotationInfo copy$default(AnnotationInfo annotationInfo, String str, KClass kClass, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = annotationInfo.className;
        }
        if ((i & 2) != 0) {
            kClass = annotationInfo.kClass;
        }
        if ((i & 4) != 0) {
            map = annotationInfo.arguments;
        }
        return annotationInfo.copy(str, kClass, map);
    }

    /* renamed from: component1, reason: from getter */
    public final String getClassName() {
        return this.className;
    }

    public final KClass<?> component2() {
        return this.kClass;
    }

    public final Map<String, Object> component3() {
        return this.arguments;
    }

    public final AnnotationInfo copy(String className, KClass<?> kClass, Map<String, ? extends Object> arguments) {
        Intrinsics.checkNotNullParameter(className, "className");
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        return new AnnotationInfo(className, kClass, arguments);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnnotationInfo)) {
            return false;
        }
        AnnotationInfo annotationInfo = (AnnotationInfo) other;
        return Intrinsics.areEqual(this.className, annotationInfo.className) && Intrinsics.areEqual(this.kClass, annotationInfo.kClass) && Intrinsics.areEqual(this.arguments, annotationInfo.arguments);
    }

    public int hashCode() {
        return (((this.className.hashCode() * 31) + this.kClass.hashCode()) * 31) + this.arguments.hashCode();
    }

    public String toString() {
        return "AnnotationInfo(className=" + this.className + ", kClass=" + this.kClass + ", arguments=" + this.arguments + ")";
    }

    public AnnotationInfo(String className, KClass<?> kClass, Map<String, ? extends Object> arguments) {
        Intrinsics.checkNotNullParameter(className, "className");
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        this.className = className;
        this.kClass = kClass;
        this.arguments = arguments;
    }

    public final String getClassName() {
        return this.className;
    }

    public final KClass<?> getKClass() {
        return this.kClass;
    }

    public final Map<String, Object> getArguments() {
        return this.arguments;
    }
}
