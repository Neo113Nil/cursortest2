package io.github.lukmccall.pika;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Types.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003J\t\u0010\u001c\u001a\u00020\fHÆ\u0003JA\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\f2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0017¨\u0006#"}, d2 = {"Lio/github/lukmccall/pika/FullFieldInfo;", "", "name", "", "typeInfo", "Lio/github/lukmccall/pika/TypeInfo;", "annotations", "", "Lio/github/lukmccall/pika/AnnotationInfo;", "visibility", "Lio/github/lukmccall/pika/Visibility;", "isMutable", "", "<init>", "(Ljava/lang/String;Lio/github/lukmccall/pika/TypeInfo;Ljava/util/List;Lio/github/lukmccall/pika/Visibility;Z)V", "getName", "()Ljava/lang/String;", "getTypeInfo", "()Lio/github/lukmccall/pika/TypeInfo;", "getAnnotations", "()Ljava/util/List;", "getVisibility", "()Lio/github/lukmccall/pika/Visibility;", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "pika-api"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class FullFieldInfo {
    private final List<AnnotationInfo> annotations;
    private final boolean isMutable;
    private final String name;
    private final TypeInfo typeInfo;
    private final Visibility visibility;

    public static /* synthetic */ FullFieldInfo copy$default(FullFieldInfo fullFieldInfo, String str, TypeInfo typeInfo, List list, Visibility visibility, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fullFieldInfo.name;
        }
        if ((i & 2) != 0) {
            typeInfo = fullFieldInfo.typeInfo;
        }
        if ((i & 4) != 0) {
            list = fullFieldInfo.annotations;
        }
        if ((i & 8) != 0) {
            visibility = fullFieldInfo.visibility;
        }
        if ((i & 16) != 0) {
            z = fullFieldInfo.isMutable;
        }
        boolean z2 = z;
        List list2 = list;
        return fullFieldInfo.copy(str, typeInfo, list2, visibility, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final TypeInfo getTypeInfo() {
        return this.typeInfo;
    }

    public final List<AnnotationInfo> component3() {
        return this.annotations;
    }

    /* renamed from: component4, reason: from getter */
    public final Visibility getVisibility() {
        return this.visibility;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsMutable() {
        return this.isMutable;
    }

    public final FullFieldInfo copy(String name, TypeInfo typeInfo, List<AnnotationInfo> annotations, Visibility visibility, boolean isMutable) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(typeInfo, "typeInfo");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        return new FullFieldInfo(name, typeInfo, annotations, visibility, isMutable);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FullFieldInfo)) {
            return false;
        }
        FullFieldInfo fullFieldInfo = (FullFieldInfo) other;
        return Intrinsics.areEqual(this.name, fullFieldInfo.name) && Intrinsics.areEqual(this.typeInfo, fullFieldInfo.typeInfo) && Intrinsics.areEqual(this.annotations, fullFieldInfo.annotations) && this.visibility == fullFieldInfo.visibility && this.isMutable == fullFieldInfo.isMutable;
    }

    public int hashCode() {
        return (((((((this.name.hashCode() * 31) + this.typeInfo.hashCode()) * 31) + this.annotations.hashCode()) * 31) + this.visibility.hashCode()) * 31) + Boolean.hashCode(this.isMutable);
    }

    public String toString() {
        return "FullFieldInfo(name=" + this.name + ", typeInfo=" + this.typeInfo + ", annotations=" + this.annotations + ", visibility=" + this.visibility + ", isMutable=" + this.isMutable + ")";
    }

    public FullFieldInfo(String name, TypeInfo typeInfo, List<AnnotationInfo> annotations, Visibility visibility, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(typeInfo, "typeInfo");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        this.name = name;
        this.typeInfo = typeInfo;
        this.annotations = annotations;
        this.visibility = visibility;
        this.isMutable = z;
    }

    public final String getName() {
        return this.name;
    }

    public final TypeInfo getTypeInfo() {
        return this.typeInfo;
    }

    public final List<AnnotationInfo> getAnnotations() {
        return this.annotations;
    }

    public final Visibility getVisibility() {
        return this.visibility;
    }

    public final boolean isMutable() {
        return this.isMutable;
    }
}
