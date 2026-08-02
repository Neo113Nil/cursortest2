package ru.ozon.fintech.ui.image;

import B0.C2454a;
import E30.i;
import Kk.d;
import N3.C3660k;
import Nh.a;
import android.graphics.Rect;
import androidx.annotation.Keep;
import com.detmir.recycli.adapters.RecyclerItem;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikit.common.StyleParser;

@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001By\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\u001a\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0016J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0016J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0016J\u0010\u0010\"\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b\"\u0010#J$\u0010$\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0092\u0001\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000e\u001a\u00020\r2\u001c\b\u0002\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u0016J\u0010\u0010)\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b)\u0010\u0019J\u001a\u0010,\u001a\u00020\u00102\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b1\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b2\u0010\u0019R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b4\u0010\u001cR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b5\u0010\u0016R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\n\u00106\u001a\u0004\b7\u0010\u001fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010.\u001a\u0004\b8\u0010\u0016R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010.\u001a\u0004\b9\u0010\u0016R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010:\u001a\u0004\b;\u0010#R+\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0012\u0010<\u001a\u0004\b=\u0010%¨\u0006>"}, d2 = {"Lru/ozon/fintech/ui/image/FinImageState;", "Lcom/detmir/recycli/adapters/RecyclerItem;", "", "id", "", "ratioW", "ratioH", "", "percentW", "src", "radius", "backColor", "actionId", "Landroid/graphics/Rect;", "paddings", "Lkotlin/Function2;", "", "", "onClick", "<init>", "(Ljava/lang/String;IILjava/lang/Float;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Rect;Lkotlin/jvm/functions/Function2;)V", "provideId", "()Ljava/lang/String;", "component1", "component2", "()I", "component3", "component4", "()Ljava/lang/Float;", "component5", "component6", "()Ljava/lang/Integer;", "component7", "component8", "component9", "()Landroid/graphics/Rect;", "component10", "()Lkotlin/jvm/functions/Function2;", "copy", "(Ljava/lang/String;IILjava/lang/Float;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Rect;Lkotlin/jvm/functions/Function2;)Lru/ozon/fintech/ui/image/FinImageState;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "I", "getRatioW", "getRatioH", "Ljava/lang/Float;", "getPercentW", "getSrc", "Ljava/lang/Integer;", "getRadius", "getBackColor", "getActionId", "Landroid/graphics/Rect;", "getPaddings", "Lkotlin/jvm/functions/Function2;", "getOnClick", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FinImageState implements RecyclerItem {
    private final String actionId;
    private final String backColor;

    @NotNull
    private final String id;
    private final Function2<String, Boolean, Unit> onClick;

    @NotNull
    private final Rect paddings;
    private final Float percentW;
    private final Integer radius;
    private final int ratioH;
    private final int ratioW;
    private final String src;

    /* JADX WARN: Multi-variable type inference failed */
    public FinImageState(@NotNull String id2, int i11, int i12, Float f7, String str, Integer num, String str2, String str3, @NotNull Rect paddings, Function2<? super String, ? super Boolean, Unit> function2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        this.id = id2;
        this.ratioW = i11;
        this.ratioH = i12;
        this.percentW = f7;
        this.src = str;
        this.radius = num;
        this.backColor = str2;
        this.actionId = str3;
        this.paddings = paddings;
        this.onClick = function2;
    }

    public static /* synthetic */ FinImageState copy$default(FinImageState finImageState, String str, int i11, int i12, Float f7, String str2, Integer num, String str3, String str4, Rect rect, Function2 function2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = finImageState.id;
        }
        if ((i13 & 2) != 0) {
            i11 = finImageState.ratioW;
        }
        if ((i13 & 4) != 0) {
            i12 = finImageState.ratioH;
        }
        if ((i13 & 8) != 0) {
            f7 = finImageState.percentW;
        }
        if ((i13 & 16) != 0) {
            str2 = finImageState.src;
        }
        if ((i13 & 32) != 0) {
            num = finImageState.radius;
        }
        if ((i13 & 64) != 0) {
            str3 = finImageState.backColor;
        }
        if ((i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            str4 = finImageState.actionId;
        }
        if ((i13 & 256) != 0) {
            rect = finImageState.paddings;
        }
        if ((i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            function2 = finImageState.onClick;
        }
        Rect rect2 = rect;
        Function2 function22 = function2;
        String str5 = str3;
        String str6 = str4;
        String str7 = str2;
        Integer num2 = num;
        return finImageState.copy(str, i11, i12, f7, str7, num2, str5, str6, rect2, function22);
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

    public final Function2<String, Boolean, Unit> component10() {
        return this.onClick;
    }

    /* renamed from: component2, reason: from getter */
    public final int getRatioW() {
        return this.ratioW;
    }

    /* renamed from: component3, reason: from getter */
    public final int getRatioH() {
        return this.ratioH;
    }

    /* renamed from: component4, reason: from getter */
    public final Float getPercentW() {
        return this.percentW;
    }

    /* renamed from: component5, reason: from getter */
    public final String getSrc() {
        return this.src;
    }

    /* renamed from: component6, reason: from getter */
    public final Integer getRadius() {
        return this.radius;
    }

    /* renamed from: component7, reason: from getter */
    public final String getBackColor() {
        return this.backColor;
    }

    /* renamed from: component8, reason: from getter */
    public final String getActionId() {
        return this.actionId;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final Rect getPaddings() {
        return this.paddings;
    }

    @NotNull
    public final FinImageState copy(@NotNull String id2, int ratioW, int ratioH, Float percentW, String src, Integer radius, String backColor, String actionId, @NotNull Rect paddings, Function2<? super String, ? super Boolean, Unit> onClick) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        return new FinImageState(id2, ratioW, ratioH, percentW, src, radius, backColor, actionId, paddings, onClick);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FinImageState)) {
            return false;
        }
        FinImageState finImageState = (FinImageState) other;
        return Intrinsics.d(this.id, finImageState.id) && this.ratioW == finImageState.ratioW && this.ratioH == finImageState.ratioH && Intrinsics.d(this.percentW, finImageState.percentW) && Intrinsics.d(this.src, finImageState.src) && Intrinsics.d(this.radius, finImageState.radius) && Intrinsics.d(this.backColor, finImageState.backColor) && Intrinsics.d(this.actionId, finImageState.actionId) && Intrinsics.d(this.paddings, finImageState.paddings) && Intrinsics.d(this.onClick, finImageState.onClick);
    }

    public final String getActionId() {
        return this.actionId;
    }

    public final String getBackColor() {
        return this.backColor;
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

    public final int getRatioH() {
        return this.ratioH;
    }

    public final int getRatioW() {
        return this.ratioW;
    }

    public final String getSrc() {
        return this.src;
    }

    public int hashCode() {
        int a11 = C2454a.a(this.ratioH, C2454a.a(this.ratioW, this.id.hashCode() * 31, 31), 31);
        Float f7 = this.percentW;
        int hashCode = (a11 + (f7 == null ? 0 : f7.hashCode())) * 31;
        String str = this.src;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.radius;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.backColor;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.actionId;
        int a12 = d.a(this.paddings, (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
        Function2<String, Boolean, Unit> function2 = this.onClick;
        return a12 + (function2 != null ? function2.hashCode() : 0);
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    @NotNull
    public String provideId() {
        return this.id;
    }

    @NotNull
    public String toString() {
        String str = this.id;
        int i11 = this.ratioW;
        int i12 = this.ratioH;
        Float f7 = this.percentW;
        String str2 = this.src;
        Integer num = this.radius;
        String str3 = this.backColor;
        String str4 = this.actionId;
        Rect rect = this.paddings;
        Function2<String, Boolean, Unit> function2 = this.onClick;
        StringBuilder c11 = C3660k.c(i11, "FinImageState(id=", str, ", ratioW=", ", ratioH=");
        c11.append(i12);
        c11.append(", percentW=");
        c11.append(f7);
        c11.append(", src=");
        C2454a.f(num, str2, ", radius=", ", backColor=", c11);
        a.h(c11, str3, ", actionId=", str4, ", paddings=");
        c11.append(rect);
        c11.append(", onClick=");
        c11.append(function2);
        c11.append(")");
        return c11.toString();
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    public Class<? extends Object> withView() {
        return null;
    }

    public /* synthetic */ FinImageState(String str, int i11, int i12, Float f7, String str2, Integer num, String str3, String str4, Rect rect, Function2 function2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i11, i12, f7, str2, num, (i13 & 64) != 0 ? StyleParser.OzColor.OZ_SEMANTIC_CTRL_PRIMARY_PALE.getValue() : str3, str4, (i13 & 256) != 0 ? i.a() : rect, function2);
    }
}
