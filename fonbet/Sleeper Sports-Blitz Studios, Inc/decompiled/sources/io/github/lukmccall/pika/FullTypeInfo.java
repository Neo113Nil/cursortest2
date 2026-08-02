package io.github.lukmccall.pika;

import com.facebook.GraphRequest;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* compiled from: Types.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0000\u0012\u0010\u0010\n\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\r\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u0005HÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0000HÆ\u0003J\u0013\u0010 \u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0007HÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\f0\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\u000eHÆ\u0003Jk\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\b\u0002\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00002\u0012\b\u0002\u0010\n\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u0010$\u001a\u00020\u000e2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0000¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\n\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u001b¨\u0006)"}, d2 = {"Lio/github/lukmccall/pika/FullTypeInfo;", "", "className", "", "kClass", "Lkotlin/reflect/KClass;", GraphRequest.FIELDS_PARAM, "", "Lio/github/lukmccall/pika/FullFieldInfo;", "baseClass", "interfaces", "classAnnotations", "Lio/github/lukmccall/pika/AnnotationInfo;", "isNullable", "", "<init>", "(Ljava/lang/String;Lkotlin/reflect/KClass;Ljava/util/List;Lio/github/lukmccall/pika/FullTypeInfo;Ljava/util/List;Ljava/util/List;Z)V", "getClassName", "()Ljava/lang/String;", "getKClass", "()Lkotlin/reflect/KClass;", "getFields", "()Ljava/util/List;", "getBaseClass", "()Lio/github/lukmccall/pika/FullTypeInfo;", "getInterfaces", "getClassAnnotations", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "pika-api"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class FullTypeInfo {
    private final FullTypeInfo baseClass;
    private final List<AnnotationInfo> classAnnotations;
    private final String className;
    private final List<FullFieldInfo> fields;
    private final List<KClass<?>> interfaces;
    private final boolean isNullable;
    private final KClass<?> kClass;

    public static /* synthetic */ FullTypeInfo copy$default(FullTypeInfo fullTypeInfo, String str, KClass kClass, List list, FullTypeInfo fullTypeInfo2, List list2, List list3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fullTypeInfo.className;
        }
        if ((i & 2) != 0) {
            kClass = fullTypeInfo.kClass;
        }
        if ((i & 4) != 0) {
            list = fullTypeInfo.fields;
        }
        if ((i & 8) != 0) {
            fullTypeInfo2 = fullTypeInfo.baseClass;
        }
        if ((i & 16) != 0) {
            list2 = fullTypeInfo.interfaces;
        }
        if ((i & 32) != 0) {
            list3 = fullTypeInfo.classAnnotations;
        }
        if ((i & 64) != 0) {
            z = fullTypeInfo.isNullable;
        }
        List list4 = list3;
        boolean z2 = z;
        List list5 = list2;
        List list6 = list;
        return fullTypeInfo.copy(str, kClass, list6, fullTypeInfo2, list5, list4, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getClassName() {
        return this.className;
    }

    public final KClass<?> component2() {
        return this.kClass;
    }

    public final List<FullFieldInfo> component3() {
        return this.fields;
    }

    /* renamed from: component4, reason: from getter */
    public final FullTypeInfo getBaseClass() {
        return this.baseClass;
    }

    public final List<KClass<?>> component5() {
        return this.interfaces;
    }

    public final List<AnnotationInfo> component6() {
        return this.classAnnotations;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsNullable() {
        return this.isNullable;
    }

    public final FullTypeInfo copy(String className, KClass<?> kClass, List<FullFieldInfo> fields, FullTypeInfo baseClass, List<? extends KClass<?>> interfaces, List<AnnotationInfo> classAnnotations, boolean isNullable) {
        Intrinsics.checkNotNullParameter(className, "className");
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(fields, "fields");
        Intrinsics.checkNotNullParameter(interfaces, "interfaces");
        Intrinsics.checkNotNullParameter(classAnnotations, "classAnnotations");
        return new FullTypeInfo(className, kClass, fields, baseClass, interfaces, classAnnotations, isNullable);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FullTypeInfo)) {
            return false;
        }
        FullTypeInfo fullTypeInfo = (FullTypeInfo) other;
        return Intrinsics.areEqual(this.className, fullTypeInfo.className) && Intrinsics.areEqual(this.kClass, fullTypeInfo.kClass) && Intrinsics.areEqual(this.fields, fullTypeInfo.fields) && Intrinsics.areEqual(this.baseClass, fullTypeInfo.baseClass) && Intrinsics.areEqual(this.interfaces, fullTypeInfo.interfaces) && Intrinsics.areEqual(this.classAnnotations, fullTypeInfo.classAnnotations) && this.isNullable == fullTypeInfo.isNullable;
    }

    public int hashCode() {
        int hashCode = ((((this.className.hashCode() * 31) + this.kClass.hashCode()) * 31) + this.fields.hashCode()) * 31;
        FullTypeInfo fullTypeInfo = this.baseClass;
        return ((((((hashCode + (fullTypeInfo == null ? 0 : fullTypeInfo.hashCode())) * 31) + this.interfaces.hashCode()) * 31) + this.classAnnotations.hashCode()) * 31) + Boolean.hashCode(this.isNullable);
    }

    public String toString() {
        return "FullTypeInfo(className=" + this.className + ", kClass=" + this.kClass + ", fields=" + this.fields + ", baseClass=" + this.baseClass + ", interfaces=" + this.interfaces + ", classAnnotations=" + this.classAnnotations + ", isNullable=" + this.isNullable + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FullTypeInfo(String className, KClass<?> kClass, List<FullFieldInfo> fields, FullTypeInfo fullTypeInfo, List<? extends KClass<?>> interfaces, List<AnnotationInfo> classAnnotations, boolean z) {
        Intrinsics.checkNotNullParameter(className, "className");
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(fields, "fields");
        Intrinsics.checkNotNullParameter(interfaces, "interfaces");
        Intrinsics.checkNotNullParameter(classAnnotations, "classAnnotations");
        this.className = className;
        this.kClass = kClass;
        this.fields = fields;
        this.baseClass = fullTypeInfo;
        this.interfaces = interfaces;
        this.classAnnotations = classAnnotations;
        this.isNullable = z;
    }

    public final String getClassName() {
        return this.className;
    }

    public final KClass<?> getKClass() {
        return this.kClass;
    }

    public final List<FullFieldInfo> getFields() {
        return this.fields;
    }

    public final FullTypeInfo getBaseClass() {
        return this.baseClass;
    }

    public final List<KClass<?>> getInterfaces() {
        return this.interfaces;
    }

    public final List<AnnotationInfo> getClassAnnotations() {
        return this.classAnnotations;
    }

    public final boolean isNullable() {
        return this.isNullable;
    }
}
