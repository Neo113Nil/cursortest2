package ru.ozon.fintech.ui.horizontalthree;

import E30.i;
import Ef0.c;
import HY.b;
import Kk.d;
import N3.C3660k;
import android.graphics.Rect;
import androidx.annotation.Keep;
import com.detmir.recycli.adapters.RecyclerItem;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u001f\n\u0002\u0010\u0000\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001B¡\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001\u0012\u001a\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0005¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0019J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b#\u0010 J\u0012\u0010$\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b$\u0010 J\u0012\u0010%\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b%\u0010 J\u0012\u0010&\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b(\u0010'J\u0012\u0010)\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b)\u0010'J$\u0010*\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b,\u0010-JÄ\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00012\u001c\b\u0002\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b0\u0010\u0019J\u0010\u00101\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b1\u00102J\u001a\u00105\u001a\u00020\u00052\b\u00104\u001a\u0004\u0018\u000103HÖ\u0003¢\u0006\u0004\b5\u00106R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00107\u001a\u0004\b8\u0010\u0019R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00107\u001a\u0004\b9\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010:\u001a\u0004\b;\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00107\u001a\u0004\b<\u0010\u0019R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010=\u001a\u0004\b>\u0010 R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010?\u001a\u0004\b@\u0010\"R\u0019\u0010\f\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\f\u0010=\u001a\u0004\bA\u0010 R\u0019\u0010\r\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\r\u0010=\u001a\u0004\bB\u0010 R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010=\u001a\u0004\bC\u0010 R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u000f\u0010D\u001a\u0004\bE\u0010'R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0010\u0010D\u001a\u0004\bF\u0010'R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0011\u0010D\u001a\u0004\bG\u0010'R+\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0014\u0010H\u001a\u0004\bI\u0010+R\u0017\u0010\u0015\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010J\u001a\u0004\bK\u0010-¨\u0006L"}, d2 = {"Lru/ozon/fintech/ui/horizontalthree/HorizontalThreeState;", "Lcom/detmir/recycli/adapters/RecyclerItem;", "", "id", "actionId", "", "actionEnabled", "backColor", "", "radius", "Landroid/graphics/Rect;", "paddings", "leftWidgetGravity", "rightWidgetGravity", "centerWidgetGravity", "leftWidget", "rightWidget", "centerWidget", "Lkotlin/Function2;", "", "onClick", "closeOnClick", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Landroid/graphics/Rect;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/detmir/recycli/adapters/RecyclerItem;Lcom/detmir/recycli/adapters/RecyclerItem;Lcom/detmir/recycli/adapters/RecyclerItem;Lkotlin/jvm/functions/Function2;Z)V", "provideId", "()Ljava/lang/String;", "component1", "component2", "component3", "()Ljava/lang/Boolean;", "component4", "component5", "()Ljava/lang/Integer;", "component6", "()Landroid/graphics/Rect;", "component7", "component8", "component9", "component10", "()Lcom/detmir/recycli/adapters/RecyclerItem;", "component11", "component12", "component13", "()Lkotlin/jvm/functions/Function2;", "component14", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Landroid/graphics/Rect;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/detmir/recycli/adapters/RecyclerItem;Lcom/detmir/recycli/adapters/RecyclerItem;Lcom/detmir/recycli/adapters/RecyclerItem;Lkotlin/jvm/functions/Function2;Z)Lru/ozon/fintech/ui/horizontalthree/HorizontalThreeState;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getActionId", "Ljava/lang/Boolean;", "getActionEnabled", "getBackColor", "Ljava/lang/Integer;", "getRadius", "Landroid/graphics/Rect;", "getPaddings", "getLeftWidgetGravity", "getRightWidgetGravity", "getCenterWidgetGravity", "Lcom/detmir/recycli/adapters/RecyclerItem;", "getLeftWidget", "getRightWidget", "getCenterWidget", "Lkotlin/jvm/functions/Function2;", "getOnClick", "Z", "getCloseOnClick", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class HorizontalThreeState implements RecyclerItem {
    private final Boolean actionEnabled;
    private final String actionId;
    private final String backColor;
    private final RecyclerItem centerWidget;
    private final Integer centerWidgetGravity;
    private final boolean closeOnClick;

    @NotNull
    private final String id;
    private final RecyclerItem leftWidget;
    private final Integer leftWidgetGravity;
    private final Function2<String, Boolean, Unit> onClick;

    @NotNull
    private final Rect paddings;
    private final Integer radius;
    private final RecyclerItem rightWidget;
    private final Integer rightWidgetGravity;

    /* JADX WARN: Multi-variable type inference failed */
    public HorizontalThreeState(@NotNull String id2, String str, Boolean bool, String str2, Integer num, @NotNull Rect paddings, Integer num2, Integer num3, Integer num4, RecyclerItem recyclerItem, RecyclerItem recyclerItem2, RecyclerItem recyclerItem3, Function2<? super String, ? super Boolean, Unit> function2, boolean z11) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        this.id = id2;
        this.actionId = str;
        this.actionEnabled = bool;
        this.backColor = str2;
        this.radius = num;
        this.paddings = paddings;
        this.leftWidgetGravity = num2;
        this.rightWidgetGravity = num3;
        this.centerWidgetGravity = num4;
        this.leftWidget = recyclerItem;
        this.rightWidget = recyclerItem2;
        this.centerWidget = recyclerItem3;
        this.onClick = function2;
        this.closeOnClick = z11;
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

    /* renamed from: component10, reason: from getter */
    public final RecyclerItem getLeftWidget() {
        return this.leftWidget;
    }

    /* renamed from: component11, reason: from getter */
    public final RecyclerItem getRightWidget() {
        return this.rightWidget;
    }

    /* renamed from: component12, reason: from getter */
    public final RecyclerItem getCenterWidget() {
        return this.centerWidget;
    }

    public final Function2<String, Boolean, Unit> component13() {
        return this.onClick;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getCloseOnClick() {
        return this.closeOnClick;
    }

    /* renamed from: component2, reason: from getter */
    public final String getActionId() {
        return this.actionId;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getActionEnabled() {
        return this.actionEnabled;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBackColor() {
        return this.backColor;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getRadius() {
        return this.radius;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final Rect getPaddings() {
        return this.paddings;
    }

    /* renamed from: component7, reason: from getter */
    public final Integer getLeftWidgetGravity() {
        return this.leftWidgetGravity;
    }

    /* renamed from: component8, reason: from getter */
    public final Integer getRightWidgetGravity() {
        return this.rightWidgetGravity;
    }

    /* renamed from: component9, reason: from getter */
    public final Integer getCenterWidgetGravity() {
        return this.centerWidgetGravity;
    }

    @NotNull
    public final HorizontalThreeState copy(@NotNull String id2, String actionId, Boolean actionEnabled, String backColor, Integer radius, @NotNull Rect paddings, Integer leftWidgetGravity, Integer rightWidgetGravity, Integer centerWidgetGravity, RecyclerItem leftWidget, RecyclerItem rightWidget, RecyclerItem centerWidget, Function2<? super String, ? super Boolean, Unit> onClick, boolean closeOnClick) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        return new HorizontalThreeState(id2, actionId, actionEnabled, backColor, radius, paddings, leftWidgetGravity, rightWidgetGravity, centerWidgetGravity, leftWidget, rightWidget, centerWidget, onClick, closeOnClick);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HorizontalThreeState)) {
            return false;
        }
        HorizontalThreeState horizontalThreeState = (HorizontalThreeState) other;
        return Intrinsics.d(this.id, horizontalThreeState.id) && Intrinsics.d(this.actionId, horizontalThreeState.actionId) && Intrinsics.d(this.actionEnabled, horizontalThreeState.actionEnabled) && Intrinsics.d(this.backColor, horizontalThreeState.backColor) && Intrinsics.d(this.radius, horizontalThreeState.radius) && Intrinsics.d(this.paddings, horizontalThreeState.paddings) && Intrinsics.d(this.leftWidgetGravity, horizontalThreeState.leftWidgetGravity) && Intrinsics.d(this.rightWidgetGravity, horizontalThreeState.rightWidgetGravity) && Intrinsics.d(this.centerWidgetGravity, horizontalThreeState.centerWidgetGravity) && Intrinsics.d(this.leftWidget, horizontalThreeState.leftWidget) && Intrinsics.d(this.rightWidget, horizontalThreeState.rightWidget) && Intrinsics.d(this.centerWidget, horizontalThreeState.centerWidget) && Intrinsics.d(this.onClick, horizontalThreeState.onClick) && this.closeOnClick == horizontalThreeState.closeOnClick;
    }

    public final Boolean getActionEnabled() {
        return this.actionEnabled;
    }

    public final String getActionId() {
        return this.actionId;
    }

    public final String getBackColor() {
        return this.backColor;
    }

    public final RecyclerItem getCenterWidget() {
        return this.centerWidget;
    }

    public final Integer getCenterWidgetGravity() {
        return this.centerWidgetGravity;
    }

    public final boolean getCloseOnClick() {
        return this.closeOnClick;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final RecyclerItem getLeftWidget() {
        return this.leftWidget;
    }

    public final Integer getLeftWidgetGravity() {
        return this.leftWidgetGravity;
    }

    public final Function2<String, Boolean, Unit> getOnClick() {
        return this.onClick;
    }

    @NotNull
    public final Rect getPaddings() {
        return this.paddings;
    }

    public final Integer getRadius() {
        return this.radius;
    }

    public final RecyclerItem getRightWidget() {
        return this.rightWidget;
    }

    public final Integer getRightWidgetGravity() {
        return this.rightWidgetGravity;
    }

    public int hashCode() {
        int hashCode = this.id.hashCode() * 31;
        String str = this.actionId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.actionEnabled;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.backColor;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.radius;
        int a11 = d.a(this.paddings, (hashCode4 + (num == null ? 0 : num.hashCode())) * 31, 31);
        Integer num2 = this.leftWidgetGravity;
        int hashCode5 = (a11 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.rightWidgetGravity;
        int hashCode6 = (hashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.centerWidgetGravity;
        int hashCode7 = (hashCode6 + (num4 == null ? 0 : num4.hashCode())) * 31;
        RecyclerItem recyclerItem = this.leftWidget;
        int hashCode8 = (hashCode7 + (recyclerItem == null ? 0 : recyclerItem.hashCode())) * 31;
        RecyclerItem recyclerItem2 = this.rightWidget;
        int hashCode9 = (hashCode8 + (recyclerItem2 == null ? 0 : recyclerItem2.hashCode())) * 31;
        RecyclerItem recyclerItem3 = this.centerWidget;
        int hashCode10 = (hashCode9 + (recyclerItem3 == null ? 0 : recyclerItem3.hashCode())) * 31;
        Function2<String, Boolean, Unit> function2 = this.onClick;
        return Boolean.hashCode(this.closeOnClick) + ((hashCode10 + (function2 != null ? function2.hashCode() : 0)) * 31);
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
        Boolean bool = this.actionEnabled;
        String str3 = this.backColor;
        Integer num = this.radius;
        Rect rect = this.paddings;
        Integer num2 = this.leftWidgetGravity;
        Integer num3 = this.rightWidgetGravity;
        Integer num4 = this.centerWidgetGravity;
        RecyclerItem recyclerItem = this.leftWidget;
        RecyclerItem recyclerItem2 = this.rightWidget;
        RecyclerItem recyclerItem3 = this.centerWidget;
        Function2<String, Boolean, Unit> function2 = this.onClick;
        boolean z11 = this.closeOnClick;
        StringBuilder d11 = C3660k.d("HorizontalThreeState(id=", str, ", actionId=", str2, ", actionEnabled=");
        b.c(bool, ", backColor=", str3, ", radius=", d11);
        d11.append(num);
        d11.append(", paddings=");
        d11.append(rect);
        d11.append(", leftWidgetGravity=");
        c.e(d11, num2, ", rightWidgetGravity=", num3, ", centerWidgetGravity=");
        d11.append(num4);
        d11.append(", leftWidget=");
        d11.append(recyclerItem);
        d11.append(", rightWidget=");
        d11.append(recyclerItem2);
        d11.append(", centerWidget=");
        d11.append(recyclerItem3);
        d11.append(", onClick=");
        d11.append(function2);
        d11.append(", closeOnClick=");
        d11.append(z11);
        d11.append(")");
        return d11.toString();
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    public Class<? extends Object> withView() {
        return null;
    }

    public /* synthetic */ HorizontalThreeState(String str, String str2, Boolean bool, String str3, Integer num, Rect rect, Integer num2, Integer num3, Integer num4, RecyclerItem recyclerItem, RecyclerItem recyclerItem2, RecyclerItem recyclerItem3, Function2 function2, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, bool, str3, num, (i11 & 32) != 0 ? i.a() : rect, num2, num3, num4, recyclerItem, recyclerItem2, recyclerItem3, function2, z11);
    }
}
