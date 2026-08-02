package ru.ozon.fintech.ui.separator;

import B0.C2454a;
import E30.i;
import N3.C3660k;
import android.graphics.Rect;
import androidx.annotation.Keep;
import com.detmir.recycli.adapters.RecyclerItem;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u001a\u001a\u00020\u0003H\u0016J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0016J\t\u0010 \u001a\u00020\u000bHÆ\u0003JR\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001¢\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020\u0007HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006)"}, d2 = {"Lru/ozon/fintech/ui/separator/SeparatorState;", "Lcom/detmir/recycli/adapters/RecyclerItem;", "id", "", "actionId", "backColor", "radius", "", "height", "", "paddings", "Landroid/graphics/Rect;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Float;Landroid/graphics/Rect;)V", "getId", "()Ljava/lang/String;", "getActionId", "getBackColor", "getRadius", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getHeight", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getPaddings", "()Landroid/graphics/Rect;", "provideId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Float;Landroid/graphics/Rect;)Lru/ozon/fintech/ui/separator/SeparatorState;", "equals", "", "other", "", "hashCode", "toString", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SeparatorState implements RecyclerItem {
    private final String actionId;
    private final String backColor;
    private final Float height;

    @NotNull
    private final String id;

    @NotNull
    private final Rect paddings;
    private final Integer radius;

    public SeparatorState(@NotNull String id2, String str, String str2, Integer num, Float f7, @NotNull Rect paddings) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        this.id = id2;
        this.actionId = str;
        this.backColor = str2;
        this.radius = num;
        this.height = f7;
        this.paddings = paddings;
    }

    public static /* synthetic */ SeparatorState copy$default(SeparatorState separatorState, String str, String str2, String str3, Integer num, Float f7, Rect rect, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = separatorState.id;
        }
        if ((i11 & 2) != 0) {
            str2 = separatorState.actionId;
        }
        if ((i11 & 4) != 0) {
            str3 = separatorState.backColor;
        }
        if ((i11 & 8) != 0) {
            num = separatorState.radius;
        }
        if ((i11 & 16) != 0) {
            f7 = separatorState.height;
        }
        if ((i11 & 32) != 0) {
            rect = separatorState.paddings;
        }
        Float f11 = f7;
        Rect rect2 = rect;
        return separatorState.copy(str, str2, str3, num, f11, rect2);
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
    public final String getActionId() {
        return this.actionId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getBackColor() {
        return this.backColor;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getRadius() {
        return this.radius;
    }

    /* renamed from: component5, reason: from getter */
    public final Float getHeight() {
        return this.height;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final Rect getPaddings() {
        return this.paddings;
    }

    @NotNull
    public final SeparatorState copy(@NotNull String id2, String actionId, String backColor, Integer radius, Float height, @NotNull Rect paddings) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        return new SeparatorState(id2, actionId, backColor, radius, height, paddings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SeparatorState)) {
            return false;
        }
        SeparatorState separatorState = (SeparatorState) other;
        return Intrinsics.d(this.id, separatorState.id) && Intrinsics.d(this.actionId, separatorState.actionId) && Intrinsics.d(this.backColor, separatorState.backColor) && Intrinsics.d(this.radius, separatorState.radius) && Intrinsics.d(this.height, separatorState.height) && Intrinsics.d(this.paddings, separatorState.paddings);
    }

    public final String getActionId() {
        return this.actionId;
    }

    public final String getBackColor() {
        return this.backColor;
    }

    public final Float getHeight() {
        return this.height;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final Rect getPaddings() {
        return this.paddings;
    }

    public final Integer getRadius() {
        return this.radius;
    }

    public int hashCode() {
        int hashCode = this.id.hashCode() * 31;
        String str = this.actionId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.backColor;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.radius;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Float f7 = this.height;
        return this.paddings.hashCode() + ((hashCode4 + (f7 != null ? f7.hashCode() : 0)) * 31);
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    @NotNull
    public String provideId() {
        return this.id;
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.actionId;
        String str3 = this.backColor;
        Integer num = this.radius;
        Float f7 = this.height;
        Rect rect = this.paddings;
        StringBuilder d11 = C3660k.d("SeparatorState(id=", str, ", actionId=", str2, ", backColor=");
        C2454a.f(num, str3, ", radius=", ", height=", d11);
        d11.append(f7);
        d11.append(", paddings=");
        d11.append(rect);
        d11.append(")");
        return d11.toString();
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    public Class<? extends Object> withView() {
        return null;
    }

    public /* synthetic */ SeparatorState(String str, String str2, String str3, Integer num, Float f7, Rect rect, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, num, f7, (i11 & 32) != 0 ? i.a() : rect);
    }
}
