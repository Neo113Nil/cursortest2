package y5;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: y5.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6855b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f68282a;

    /* renamed from: b, reason: collision with root package name */
    public final List f68283b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f68284c;

    /* renamed from: d, reason: collision with root package name */
    public final List f68285d;

    public C6855b(boolean z10, List stringsToMask, boolean z11, List maskInputFieldsOfTypes) {
        Intrinsics.checkNotNullParameter(stringsToMask, "stringsToMask");
        Intrinsics.checkNotNullParameter(maskInputFieldsOfTypes, "maskInputFieldsOfTypes");
        this.f68282a = z10;
        this.f68283b = stringsToMask;
        this.f68284c = z11;
        this.f68285d = maskInputFieldsOfTypes;
    }

    public final boolean a() {
        return this.f68284c;
    }

    public final List b() {
        return this.f68285d;
    }

    public final boolean c() {
        return this.f68282a;
    }

    public final List d() {
        return this.f68283b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6855b)) {
            return false;
        }
        C6855b c6855b = (C6855b) obj;
        return this.f68282a == c6855b.f68282a && Intrinsics.areEqual(this.f68283b, c6855b.f68283b) && this.f68284c == c6855b.f68284c && Intrinsics.areEqual(this.f68285d, c6855b.f68285d);
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.f68282a) * 31) + this.f68283b.hashCode()) * 31) + Boolean.hashCode(this.f68284c)) * 31) + this.f68285d.hashCode();
    }

    public String toString() {
        return "HierarchyMaskConfiguration(maskStrings=" + this.f68282a + ", stringsToMask=" + this.f68283b + ", maskImages=" + this.f68284c + ", maskInputFieldsOfTypes=" + this.f68285d + ")";
    }

    public /* synthetic */ C6855b(boolean z10, List list, boolean z11, List list2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? true : z10, (i10 & 2) != 0 ? CollectionsKt.emptyList() : list, (i10 & 4) != 0 ? false : z11, (i10 & 8) != 0 ? CollectionsKt.emptyList() : list2);
    }
}
