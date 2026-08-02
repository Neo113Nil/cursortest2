package ru.ozon.fintech.ui.row.verticalrow;

import B0.C2454a;
import E30.i;
import Ef0.c;
import G.g;
import Kk.d;
import N3.C3660k;
import android.graphics.Rect;
import androidx.annotation.Keep;
import com.detmir.recycli.adapters.RecyclerItem;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.ui.common.MidDecorator;
import ru.ozon.fintech.ui.row.base.RowRecyclerItemState;

@Keep
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u0010,\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u0010-\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u0010.\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u0010/\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u00100\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001bJ\t\u00101\u001a\u00020\u000eHÆ\u0003J\u000f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010HÆ\u0003J\t\u00103\u001a\u00020\u0013HÆ\u0003J\u009c\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\r\u001a\u00020\u000e2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0013HÆ\u0001¢\u0006\u0002\u00105J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u000109HÖ\u0003J\t\u0010:\u001a\u00020\u0007HÖ\u0001J\t\u0010;\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001d\u0010\u001bR\u0015\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001e\u0010\u001bR\u0015\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001f\u0010\u001bR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b \u0010\u001bR\u0015\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b!\u0010\u001bR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u0006<"}, d2 = {"Lru/ozon/fintech/ui/row/verticalrow/VerticalRowState;", "Lru/ozon/fintech/ui/row/base/RowRecyclerItemState;", "id", "", "actionId", "backColor", "radius", "", "leftOffset", "rightOffset", "topOffset", "bottomOffset", "spacing", "paddings", "Landroid/graphics/Rect;", "widgets", "", "Lcom/detmir/recycli/adapters/RecyclerItem;", "orientation", "Lru/ozon/fintech/ui/common/MidDecorator$ORIENTATION;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Landroid/graphics/Rect;Ljava/util/List;Lru/ozon/fintech/ui/common/MidDecorator$ORIENTATION;)V", "getId", "()Ljava/lang/String;", "getActionId", "getBackColor", "getRadius", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLeftOffset", "getRightOffset", "getTopOffset", "getBottomOffset", "getSpacing", "getPaddings", "()Landroid/graphics/Rect;", "getWidgets", "()Ljava/util/List;", "getOrientation", "()Lru/ozon/fintech/ui/common/MidDecorator$ORIENTATION;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Landroid/graphics/Rect;Ljava/util/List;Lru/ozon/fintech/ui/common/MidDecorator$ORIENTATION;)Lru/ozon/fintech/ui/row/verticalrow/VerticalRowState;", "equals", "", "other", "", "hashCode", "toString", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class VerticalRowState extends RowRecyclerItemState {
    private final String actionId;
    private final String backColor;
    private final Integer bottomOffset;

    @NotNull
    private final String id;
    private final Integer leftOffset;

    @NotNull
    private final MidDecorator.ORIENTATION orientation;

    @NotNull
    private final Rect paddings;
    private final Integer radius;
    private final Integer rightOffset;
    private final Integer spacing;
    private final Integer topOffset;

    @NotNull
    private final List<RecyclerItem> widgets;

    public /* synthetic */ VerticalRowState(String str, String str2, String str3, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Rect rect, List list, MidDecorator.ORIENTATION orientation, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, num, num2, num3, num4, num5, num6, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? i.a() : rect, list, (i11 & 2048) != 0 ? MidDecorator.ORIENTATION.VERTICAL : orientation);
    }

    public static /* synthetic */ VerticalRowState copy$default(VerticalRowState verticalRowState, String str, String str2, String str3, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Rect rect, List list, MidDecorator.ORIENTATION orientation, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = verticalRowState.id;
        }
        if ((i11 & 2) != 0) {
            str2 = verticalRowState.actionId;
        }
        if ((i11 & 4) != 0) {
            str3 = verticalRowState.backColor;
        }
        if ((i11 & 8) != 0) {
            num = verticalRowState.radius;
        }
        if ((i11 & 16) != 0) {
            num2 = verticalRowState.leftOffset;
        }
        if ((i11 & 32) != 0) {
            num3 = verticalRowState.rightOffset;
        }
        if ((i11 & 64) != 0) {
            num4 = verticalRowState.topOffset;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            num5 = verticalRowState.bottomOffset;
        }
        if ((i11 & 256) != 0) {
            num6 = verticalRowState.spacing;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            rect = verticalRowState.paddings;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            list = verticalRowState.widgets;
        }
        if ((i11 & 2048) != 0) {
            orientation = verticalRowState.orientation;
        }
        List list2 = list;
        MidDecorator.ORIENTATION orientation2 = orientation;
        Integer num7 = num6;
        Rect rect2 = rect;
        Integer num8 = num4;
        Integer num9 = num5;
        Integer num10 = num2;
        Integer num11 = num3;
        return verticalRowState.copy(str, str2, str3, num, num10, num11, num8, num9, num7, rect2, list2, orientation2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component10, reason: from getter */
    public final Rect getPaddings() {
        return this.paddings;
    }

    @NotNull
    public final List<RecyclerItem> component11() {
        return this.widgets;
    }

    @NotNull
    /* renamed from: component12, reason: from getter */
    public final MidDecorator.ORIENTATION getOrientation() {
        return this.orientation;
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
    public final Integer getLeftOffset() {
        return this.leftOffset;
    }

    /* renamed from: component6, reason: from getter */
    public final Integer getRightOffset() {
        return this.rightOffset;
    }

    /* renamed from: component7, reason: from getter */
    public final Integer getTopOffset() {
        return this.topOffset;
    }

    /* renamed from: component8, reason: from getter */
    public final Integer getBottomOffset() {
        return this.bottomOffset;
    }

    /* renamed from: component9, reason: from getter */
    public final Integer getSpacing() {
        return this.spacing;
    }

    @NotNull
    public final VerticalRowState copy(@NotNull String id2, String actionId, String backColor, Integer radius, Integer leftOffset, Integer rightOffset, Integer topOffset, Integer bottomOffset, Integer spacing, @NotNull Rect paddings, @NotNull List<? extends RecyclerItem> widgets, @NotNull MidDecorator.ORIENTATION orientation) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        Intrinsics.checkNotNullParameter(widgets, "widgets");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        return new VerticalRowState(id2, actionId, backColor, radius, leftOffset, rightOffset, topOffset, bottomOffset, spacing, paddings, widgets, orientation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerticalRowState)) {
            return false;
        }
        VerticalRowState verticalRowState = (VerticalRowState) other;
        return Intrinsics.d(this.id, verticalRowState.id) && Intrinsics.d(this.actionId, verticalRowState.actionId) && Intrinsics.d(this.backColor, verticalRowState.backColor) && Intrinsics.d(this.radius, verticalRowState.radius) && Intrinsics.d(this.leftOffset, verticalRowState.leftOffset) && Intrinsics.d(this.rightOffset, verticalRowState.rightOffset) && Intrinsics.d(this.topOffset, verticalRowState.topOffset) && Intrinsics.d(this.bottomOffset, verticalRowState.bottomOffset) && Intrinsics.d(this.spacing, verticalRowState.spacing) && Intrinsics.d(this.paddings, verticalRowState.paddings) && Intrinsics.d(this.widgets, verticalRowState.widgets) && this.orientation == verticalRowState.orientation;
    }

    public final String getActionId() {
        return this.actionId;
    }

    public final String getBackColor() {
        return this.backColor;
    }

    public final Integer getBottomOffset() {
        return this.bottomOffset;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final Integer getLeftOffset() {
        return this.leftOffset;
    }

    @NotNull
    public final MidDecorator.ORIENTATION getOrientation() {
        return this.orientation;
    }

    @NotNull
    public final Rect getPaddings() {
        return this.paddings;
    }

    public final Integer getRadius() {
        return this.radius;
    }

    public final Integer getRightOffset() {
        return this.rightOffset;
    }

    public final Integer getSpacing() {
        return this.spacing;
    }

    public final Integer getTopOffset() {
        return this.topOffset;
    }

    @NotNull
    public final List<RecyclerItem> getWidgets() {
        return this.widgets;
    }

    public int hashCode() {
        int hashCode = this.id.hashCode() * 31;
        String str = this.actionId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.backColor;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.radius;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.leftOffset;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.rightOffset;
        int hashCode6 = (hashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.topOffset;
        int hashCode7 = (hashCode6 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.bottomOffset;
        int hashCode8 = (hashCode7 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.spacing;
        return this.orientation.hashCode() + g.b(d.a(this.paddings, (hashCode8 + (num6 != null ? num6.hashCode() : 0)) * 31, 31), 31, this.widgets);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.actionId;
        String str3 = this.backColor;
        Integer num = this.radius;
        Integer num2 = this.leftOffset;
        Integer num3 = this.rightOffset;
        Integer num4 = this.topOffset;
        Integer num5 = this.bottomOffset;
        Integer num6 = this.spacing;
        Rect rect = this.paddings;
        List<RecyclerItem> list = this.widgets;
        MidDecorator.ORIENTATION orientation = this.orientation;
        StringBuilder d11 = C3660k.d("VerticalRowState(id=", str, ", actionId=", str2, ", backColor=");
        C2454a.f(num, str3, ", radius=", ", leftOffset=", d11);
        c.e(d11, num2, ", rightOffset=", num3, ", topOffset=");
        c.e(d11, num4, ", bottomOffset=", num5, ", spacing=");
        d11.append(num6);
        d11.append(", paddings=");
        d11.append(rect);
        d11.append(", widgets=");
        d11.append(list);
        d11.append(", orientation=");
        d11.append(orientation);
        d11.append(")");
        return d11.toString();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public VerticalRowState(@NotNull String id2, String str, String str2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, @NotNull Rect paddings, @NotNull List<? extends RecyclerItem> widgets, @NotNull MidDecorator.ORIENTATION orientation) {
        super(id2, num6, num2, num3, num4, num5, orientation);
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        Intrinsics.checkNotNullParameter(widgets, "widgets");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        this.id = id2;
        this.actionId = str;
        this.backColor = str2;
        this.radius = num;
        this.leftOffset = num2;
        this.rightOffset = num3;
        this.topOffset = num4;
        this.bottomOffset = num5;
        this.spacing = num6;
        this.paddings = paddings;
        this.widgets = widgets;
        this.orientation = orientation;
    }
}
