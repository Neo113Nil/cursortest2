package ru.ozon.fintech.ui.imageV2;

import E30.i;
import Ef0.c;
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
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u001c\n\u0002\u0010\u0000\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001B£\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\u001a\u0010\u0016\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010 J\u0012\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b#\u0010 J\u0012\u0010$\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b&\u0010 J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001aJ\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u001aJ\u0010\u0010)\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b)\u0010*J$\u0010+\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b+\u0010,JÆ\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u001c\b\u0002\u0010\u0016\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013HÆ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b/\u0010\u001aJ\u0010\u00100\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b0\u00101J\u001a\u00104\u001a\u00020\u00142\b\u00103\u001a\u0004\u0018\u000102HÖ\u0003¢\u0006\u0004\b4\u00105R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00106\u001a\u0004\b7\u0010\u001aR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00106\u001a\u0004\b8\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00106\u001a\u0004\b9\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00106\u001a\u0004\b:\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010;\u001a\u0004\b<\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010;\u001a\u0004\b=\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\n\u0010;\u001a\u0004\b>\u0010 R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u0010;\u001a\u0004\b?\u0010 R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010@\u001a\u0004\bA\u0010%R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u0010;\u001a\u0004\bB\u0010 R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u00106\u001a\u0004\bC\u0010\u001aR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u00106\u001a\u0004\bD\u0010\u001aR\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010E\u001a\u0004\bF\u0010*R+\u0010\u0016\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0016\u0010G\u001a\u0004\bH\u0010,¨\u0006I"}, d2 = {"Lru/ozon/fintech/ui/imageV2/FinImageV2State;", "Lcom/detmir/recycli/adapters/RecyclerItem;", "", "id", "iconSrc", "icon", "iconColor", "", "width", "height", "ratioW", "ratioH", "", "percentW", "radius", "backColor", "actionId", "Landroid/graphics/Rect;", "paddings", "Lkotlin/Function2;", "", "", "onClick", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Rect;Lkotlin/jvm/functions/Function2;)V", "provideId", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "()Ljava/lang/Integer;", "component6", "component7", "component8", "component9", "()Ljava/lang/Float;", "component10", "component11", "component12", "component13", "()Landroid/graphics/Rect;", "component14", "()Lkotlin/jvm/functions/Function2;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Rect;Lkotlin/jvm/functions/Function2;)Lru/ozon/fintech/ui/imageV2/FinImageV2State;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getIconSrc", "getIcon", "getIconColor", "Ljava/lang/Integer;", "getWidth", "getHeight", "getRatioW", "getRatioH", "Ljava/lang/Float;", "getPercentW", "getRadius", "getBackColor", "getActionId", "Landroid/graphics/Rect;", "getPaddings", "Lkotlin/jvm/functions/Function2;", "getOnClick", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FinImageV2State implements RecyclerItem {
    private final String actionId;
    private final String backColor;
    private final Integer height;
    private final String icon;
    private final String iconColor;
    private final String iconSrc;

    @NotNull
    private final String id;
    private final Function2<String, Boolean, Unit> onClick;

    @NotNull
    private final Rect paddings;
    private final Float percentW;
    private final Integer radius;
    private final Integer ratioH;
    private final Integer ratioW;
    private final Integer width;

    /* JADX WARN: Multi-variable type inference failed */
    public FinImageV2State(@NotNull String id2, String str, String str2, String str3, Integer num, Integer num2, Integer num3, Integer num4, Float f7, Integer num5, String str4, String str5, @NotNull Rect paddings, Function2<? super String, ? super Boolean, Unit> function2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        this.id = id2;
        this.iconSrc = str;
        this.icon = str2;
        this.iconColor = str3;
        this.width = num;
        this.height = num2;
        this.ratioW = num3;
        this.ratioH = num4;
        this.percentW = f7;
        this.radius = num5;
        this.backColor = str4;
        this.actionId = str5;
        this.paddings = paddings;
        this.onClick = function2;
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
    public final Integer getRadius() {
        return this.radius;
    }

    /* renamed from: component11, reason: from getter */
    public final String getBackColor() {
        return this.backColor;
    }

    /* renamed from: component12, reason: from getter */
    public final String getActionId() {
        return this.actionId;
    }

    @NotNull
    /* renamed from: component13, reason: from getter */
    public final Rect getPaddings() {
        return this.paddings;
    }

    public final Function2<String, Boolean, Unit> component14() {
        return this.onClick;
    }

    /* renamed from: component2, reason: from getter */
    public final String getIconSrc() {
        return this.iconSrc;
    }

    /* renamed from: component3, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* renamed from: component4, reason: from getter */
    public final String getIconColor() {
        return this.iconColor;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getWidth() {
        return this.width;
    }

    /* renamed from: component6, reason: from getter */
    public final Integer getHeight() {
        return this.height;
    }

    /* renamed from: component7, reason: from getter */
    public final Integer getRatioW() {
        return this.ratioW;
    }

    /* renamed from: component8, reason: from getter */
    public final Integer getRatioH() {
        return this.ratioH;
    }

    /* renamed from: component9, reason: from getter */
    public final Float getPercentW() {
        return this.percentW;
    }

    @NotNull
    public final FinImageV2State copy(@NotNull String id2, String iconSrc, String icon, String iconColor, Integer width, Integer height, Integer ratioW, Integer ratioH, Float percentW, Integer radius, String backColor, String actionId, @NotNull Rect paddings, Function2<? super String, ? super Boolean, Unit> onClick) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        return new FinImageV2State(id2, iconSrc, icon, iconColor, width, height, ratioW, ratioH, percentW, radius, backColor, actionId, paddings, onClick);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FinImageV2State)) {
            return false;
        }
        FinImageV2State finImageV2State = (FinImageV2State) other;
        return Intrinsics.d(this.id, finImageV2State.id) && Intrinsics.d(this.iconSrc, finImageV2State.iconSrc) && Intrinsics.d(this.icon, finImageV2State.icon) && Intrinsics.d(this.iconColor, finImageV2State.iconColor) && Intrinsics.d(this.width, finImageV2State.width) && Intrinsics.d(this.height, finImageV2State.height) && Intrinsics.d(this.ratioW, finImageV2State.ratioW) && Intrinsics.d(this.ratioH, finImageV2State.ratioH) && Intrinsics.d(this.percentW, finImageV2State.percentW) && Intrinsics.d(this.radius, finImageV2State.radius) && Intrinsics.d(this.backColor, finImageV2State.backColor) && Intrinsics.d(this.actionId, finImageV2State.actionId) && Intrinsics.d(this.paddings, finImageV2State.paddings) && Intrinsics.d(this.onClick, finImageV2State.onClick);
    }

    public final String getActionId() {
        return this.actionId;
    }

    public final String getBackColor() {
        return this.backColor;
    }

    public final Integer getHeight() {
        return this.height;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getIconColor() {
        return this.iconColor;
    }

    public final String getIconSrc() {
        return this.iconSrc;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final Function2<String, Boolean, Unit> getOnClick() {
        return this.onClick;
    }

    @NotNull
    public final Rect getPaddings() {
        return this.paddings;
    }

    public final Float getPercentW() {
        return this.percentW;
    }

    public final Integer getRadius() {
        return this.radius;
    }

    public final Integer getRatioH() {
        return this.ratioH;
    }

    public final Integer getRatioW() {
        return this.ratioW;
    }

    public final Integer getWidth() {
        return this.width;
    }

    public int hashCode() {
        int hashCode = this.id.hashCode() * 31;
        String str = this.iconSrc;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.icon;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.iconColor;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.width;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.height;
        int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.ratioW;
        int hashCode7 = (hashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.ratioH;
        int hashCode8 = (hashCode7 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Float f7 = this.percentW;
        int hashCode9 = (hashCode8 + (f7 == null ? 0 : f7.hashCode())) * 31;
        Integer num5 = this.radius;
        int hashCode10 = (hashCode9 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str4 = this.backColor;
        int hashCode11 = (hashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.actionId;
        int a11 = d.a(this.paddings, (hashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31, 31);
        Function2<String, Boolean, Unit> function2 = this.onClick;
        return a11 + (function2 != null ? function2.hashCode() : 0);
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    @NotNull
    public String provideId() {
        return this.id;
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.iconSrc;
        String str3 = this.icon;
        String str4 = this.iconColor;
        Integer num = this.width;
        Integer num2 = this.height;
        Integer num3 = this.ratioW;
        Integer num4 = this.ratioH;
        Float f7 = this.percentW;
        Integer num5 = this.radius;
        String str5 = this.backColor;
        String str6 = this.actionId;
        Rect rect = this.paddings;
        Function2<String, Boolean, Unit> function2 = this.onClick;
        StringBuilder d11 = C3660k.d("FinImageV2State(id=", str, ", iconSrc=", str2, ", icon=");
        Nh.a.h(d11, str3, ", iconColor=", str4, ", width=");
        c.e(d11, num, ", height=", num2, ", ratioW=");
        c.e(d11, num3, ", ratioH=", num4, ", percentW=");
        d11.append(f7);
        d11.append(", radius=");
        d11.append(num5);
        d11.append(", backColor=");
        Nh.a.h(d11, str5, ", actionId=", str6, ", paddings=");
        d11.append(rect);
        d11.append(", onClick=");
        d11.append(function2);
        d11.append(")");
        return d11.toString();
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    public Class<? extends Object> withView() {
        return null;
    }

    public /* synthetic */ FinImageV2State(String str, String str2, String str3, String str4, Integer num, Integer num2, Integer num3, Integer num4, Float f7, Integer num5, String str5, String str6, Rect rect, Function2 function2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, num, num2, num3, num4, f7, num5, str5, str6, (i11 & 4096) != 0 ? i.a() : rect, function2);
    }
}
