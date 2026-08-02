package ru.ozon.app.android.returns.creation.widgets.stepProgress;

import B0.C2454a;
import G.g;
import Nh.a;
import Pk0.b;
import Z1.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0081\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b \u0010\u0015R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0013R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b#\u0010\u0013R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b'\u0010&R\u0017\u0010\r\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\r\u0010$\u001a\u0004\b(\u0010&R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000e\u0010$\u001a\u0004\b)\u0010&R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000f\u0010$\u001a\u0004\b*\u0010&¨\u0006+"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/stepProgress/ReturnCreationStepProgressVI;", "Ll20/c;", "", "id", "", "count", "countOfSelected", "", "selectedColor", "unselectedColor", "LZ1/h;", "horizontalPadding", "betweenSpacing", "bottomPadding", "topPadding", "bottomCornersRadius", "<init>", "(JIILjava/lang/String;Ljava/lang/String;FFFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "I", "getCount", "getCountOfSelected", "Ljava/lang/String;", "getSelectedColor", "getUnselectedColor", "F", "getHorizontalPadding-D9Ej5fM", "()F", "getBetweenSpacing-D9Ej5fM", "getBottomPadding-D9Ej5fM", "getTopPadding-D9Ej5fM", "getBottomCornersRadius-D9Ej5fM", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ReturnCreationStepProgressVI implements c {
    private final float betweenSpacing;
    private final float bottomCornersRadius;
    private final float bottomPadding;
    private final int count;
    private final int countOfSelected;
    private final float horizontalPadding;
    private final long id;

    @NotNull
    private final String selectedColor;
    private final float topPadding;

    @NotNull
    private final String unselectedColor;

    public /* synthetic */ ReturnCreationStepProgressVI(long j11, int i11, int i12, String str, String str2, float f7, float f11, float f12, float f13, float f14, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, i11, i12, str, str2, f7, f11, f12, f13, f14);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReturnCreationStepProgressVI)) {
            return false;
        }
        ReturnCreationStepProgressVI returnCreationStepProgressVI = (ReturnCreationStepProgressVI) other;
        return this.id == returnCreationStepProgressVI.id && this.count == returnCreationStepProgressVI.count && this.countOfSelected == returnCreationStepProgressVI.countOfSelected && Intrinsics.d(this.selectedColor, returnCreationStepProgressVI.selectedColor) && Intrinsics.d(this.unselectedColor, returnCreationStepProgressVI.unselectedColor) && h.b(this.horizontalPadding, returnCreationStepProgressVI.horizontalPadding) && h.b(this.betweenSpacing, returnCreationStepProgressVI.betweenSpacing) && h.b(this.bottomPadding, returnCreationStepProgressVI.bottomPadding) && h.b(this.topPadding, returnCreationStepProgressVI.topPadding) && h.b(this.bottomCornersRadius, returnCreationStepProgressVI.bottomCornersRadius);
    }

    /* renamed from: getBetweenSpacing-D9Ej5fM, reason: not valid java name and from getter */
    public final float getBetweenSpacing() {
        return this.betweenSpacing;
    }

    /* renamed from: getBottomCornersRadius-D9Ej5fM, reason: not valid java name and from getter */
    public final float getBottomCornersRadius() {
        return this.bottomCornersRadius;
    }

    /* renamed from: getBottomPadding-D9Ej5fM, reason: not valid java name and from getter */
    public final float getBottomPadding() {
        return this.bottomPadding;
    }

    public final int getCount() {
        return this.count;
    }

    public final int getCountOfSelected() {
        return this.countOfSelected;
    }

    /* renamed from: getHorizontalPadding-D9Ej5fM, reason: not valid java name and from getter */
    public final float getHorizontalPadding() {
        return this.horizontalPadding;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final String getSelectedColor() {
        return this.selectedColor;
    }

    /* renamed from: getTopPadding-D9Ej5fM, reason: not valid java name and from getter */
    public final float getTopPadding() {
        return this.topPadding;
    }

    @NotNull
    public final String getUnselectedColor() {
        return this.unselectedColor;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        return Float.hashCode(this.bottomCornersRadius) + b.a(this.topPadding, b.a(this.bottomPadding, b.a(this.betweenSpacing, b.a(this.horizontalPadding, g.a(g.a(C2454a.a(this.countOfSelected, C2454a.a(this.count, Long.hashCode(this.id) * 31, 31), 31), 31, this.selectedColor), 31, this.unselectedColor), 31), 31), 31), 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        int i11 = this.count;
        int i12 = this.countOfSelected;
        String str = this.selectedColor;
        String str2 = this.unselectedColor;
        String c11 = h.c(this.horizontalPadding);
        String c12 = h.c(this.betweenSpacing);
        String c13 = h.c(this.bottomPadding);
        String c14 = h.c(this.topPadding);
        String c15 = h.c(this.bottomCornersRadius);
        StringBuilder b11 = Ql.c.b(j11, "ReturnCreationStepProgressVI(id=", i11, ", count=");
        b11.append(", countOfSelected=");
        b11.append(i12);
        b11.append(", selectedColor=");
        b11.append(str);
        a.h(b11, ", unselectedColor=", str2, ", horizontalPadding=", c11);
        a.h(b11, ", betweenSpacing=", c12, ", bottomPadding=", c13);
        a.h(b11, ", topPadding=", c14, ", bottomCornersRadius=", c15);
        b11.append(")");
        return b11.toString();
    }

    private ReturnCreationStepProgressVI(long j11, int i11, int i12, String selectedColor, String unselectedColor, float f7, float f11, float f12, float f13, float f14) {
        Intrinsics.checkNotNullParameter(selectedColor, "selectedColor");
        Intrinsics.checkNotNullParameter(unselectedColor, "unselectedColor");
        this.id = j11;
        this.count = i11;
        this.countOfSelected = i12;
        this.selectedColor = selectedColor;
        this.unselectedColor = unselectedColor;
        this.horizontalPadding = f7;
        this.betweenSpacing = f11;
        this.bottomPadding = f12;
        this.topPadding = f13;
        this.bottomCornersRadius = f14;
    }
}
