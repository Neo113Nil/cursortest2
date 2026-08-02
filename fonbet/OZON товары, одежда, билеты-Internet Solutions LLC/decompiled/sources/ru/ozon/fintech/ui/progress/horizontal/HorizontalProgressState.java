package ru.ozon.fintech.ui.progress.horizontal;

import B0.C2454a;
import E30.i;
import Kk.d;
import N3.C3660k;
import android.graphics.Rect;
import androidx.annotation.Keep;
import com.detmir.recycli.adapters.RecyclerItem;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0018\u001a\u00020\u0003H\u0016J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0013J\t\u0010\u001d\u001a\u00020\tHÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003JN\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020\u0006HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000e¨\u0006'"}, d2 = {"Lru/ozon/fintech/ui/progress/horizontal/HorizontalProgressState;", "Lcom/detmir/recycli/adapters/RecyclerItem;", "id", "", "percentLineColor", "percentage", "", "progressStrokeWidth", "paddings", "Landroid/graphics/Rect;", "percentBackgroundColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;Landroid/graphics/Rect;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getPercentLineColor", "getPercentage", "()I", "getProgressStrokeWidth", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPaddings", "()Landroid/graphics/Rect;", "getPercentBackgroundColor", "provideId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;Landroid/graphics/Rect;Ljava/lang/String;)Lru/ozon/fintech/ui/progress/horizontal/HorizontalProgressState;", "equals", "", "other", "", "hashCode", "toString", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class HorizontalProgressState implements RecyclerItem {

    @NotNull
    private final String id;

    @NotNull
    private final Rect paddings;

    @NotNull
    private final String percentBackgroundColor;
    private final String percentLineColor;
    private final int percentage;
    private final Integer progressStrokeWidth;

    public HorizontalProgressState(@NotNull String id2, String str, int i11, Integer num, @NotNull Rect paddings, @NotNull String percentBackgroundColor) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        Intrinsics.checkNotNullParameter(percentBackgroundColor, "percentBackgroundColor");
        this.id = id2;
        this.percentLineColor = str;
        this.percentage = i11;
        this.progressStrokeWidth = num;
        this.paddings = paddings;
        this.percentBackgroundColor = percentBackgroundColor;
    }

    public static /* synthetic */ HorizontalProgressState copy$default(HorizontalProgressState horizontalProgressState, String str, String str2, int i11, Integer num, Rect rect, String str3, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = horizontalProgressState.id;
        }
        if ((i12 & 2) != 0) {
            str2 = horizontalProgressState.percentLineColor;
        }
        if ((i12 & 4) != 0) {
            i11 = horizontalProgressState.percentage;
        }
        if ((i12 & 8) != 0) {
            num = horizontalProgressState.progressStrokeWidth;
        }
        if ((i12 & 16) != 0) {
            rect = horizontalProgressState.paddings;
        }
        if ((i12 & 32) != 0) {
            str3 = horizontalProgressState.percentBackgroundColor;
        }
        Rect rect2 = rect;
        String str4 = str3;
        return horizontalProgressState.copy(str, str2, i11, num, rect2, str4);
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    public boolean areContentsTheSame(@NotNull RecyclerItem recyclerItem) {
        return RecyclerItem.a.a(this, recyclerItem);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPercentLineColor() {
        return this.percentLineColor;
    }

    /* renamed from: component3, reason: from getter */
    public final int getPercentage() {
        return this.percentage;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getProgressStrokeWidth() {
        return this.progressStrokeWidth;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final Rect getPaddings() {
        return this.paddings;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getPercentBackgroundColor() {
        return this.percentBackgroundColor;
    }

    @NotNull
    public final HorizontalProgressState copy(@NotNull String id2, String percentLineColor, int percentage, Integer progressStrokeWidth, @NotNull Rect paddings, @NotNull String percentBackgroundColor) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        Intrinsics.checkNotNullParameter(percentBackgroundColor, "percentBackgroundColor");
        return new HorizontalProgressState(id2, percentLineColor, percentage, progressStrokeWidth, paddings, percentBackgroundColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HorizontalProgressState)) {
            return false;
        }
        HorizontalProgressState horizontalProgressState = (HorizontalProgressState) other;
        return Intrinsics.d(this.id, horizontalProgressState.id) && Intrinsics.d(this.percentLineColor, horizontalProgressState.percentLineColor) && this.percentage == horizontalProgressState.percentage && Intrinsics.d(this.progressStrokeWidth, horizontalProgressState.progressStrokeWidth) && Intrinsics.d(this.paddings, horizontalProgressState.paddings) && Intrinsics.d(this.percentBackgroundColor, horizontalProgressState.percentBackgroundColor);
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final Rect getPaddings() {
        return this.paddings;
    }

    @NotNull
    public final String getPercentBackgroundColor() {
        return this.percentBackgroundColor;
    }

    public final String getPercentLineColor() {
        return this.percentLineColor;
    }

    public final int getPercentage() {
        return this.percentage;
    }

    public final Integer getProgressStrokeWidth() {
        return this.progressStrokeWidth;
    }

    public int hashCode() {
        int hashCode = this.id.hashCode() * 31;
        String str = this.percentLineColor;
        int a11 = C2454a.a(this.percentage, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        Integer num = this.progressStrokeWidth;
        return this.percentBackgroundColor.hashCode() + d.a(this.paddings, (a11 + (num != null ? num.hashCode() : 0)) * 31, 31);
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    @NotNull
    public String provideId() {
        return this.id;
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.percentLineColor;
        int i11 = this.percentage;
        Integer num = this.progressStrokeWidth;
        Rect rect = this.paddings;
        String str3 = this.percentBackgroundColor;
        StringBuilder d11 = C3660k.d("HorizontalProgressState(id=", str, ", percentLineColor=", str2, ", percentage=");
        d11.append(i11);
        d11.append(", progressStrokeWidth=");
        d11.append(num);
        d11.append(", paddings=");
        d11.append(rect);
        d11.append(", percentBackgroundColor=");
        d11.append(str3);
        d11.append(")");
        return d11.toString();
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    public Class<? extends Object> withView() {
        return null;
    }

    public /* synthetic */ HorizontalProgressState(String str, String str2, int i11, Integer num, Rect rect, String str3, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i11, num, (i12 & 16) != 0 ? i.a() : rect, (i12 & 32) != 0 ? "ozParandja" : str3);
    }
}
