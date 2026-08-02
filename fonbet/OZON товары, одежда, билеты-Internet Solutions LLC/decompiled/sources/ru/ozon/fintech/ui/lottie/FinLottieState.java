package ru.ozon.fintech.ui.lottie;

import E30.i;
import Ef0.c;
import G.g;
import Kk.C3532b;
import N3.C3660k;
import android.graphics.Rect;
import androidx.annotation.Keep;
import com.detmir.recycli.adapters.RecyclerItem;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\"\u001a\u00020\u0003H\u0016J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010&\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010'\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010(\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010)\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001cJ\t\u0010*\u001a\u00020\rHÆ\u0003J\t\u0010+\u001a\u00020\u000fHÆ\u0003Jr\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001¢\u0006\u0002\u0010-J\u0013\u0010.\u001a\u00020\r2\b\u0010/\u001a\u0004\u0018\u000100HÖ\u0003J\t\u00101\u001a\u00020\u0006HÖ\u0001J\t\u00102\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\u0016R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0019\u0010\u0016R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u001a\u0010\u0016R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00063"}, d2 = {"Lru/ozon/fintech/ui/lottie/FinLottieState;", "Lcom/detmir/recycli/adapters/RecyclerItem;", "id", "", "lottieResource", "width", "", "height", "ratioW", "ratioH", "percentW", "", "infinity", "", "paddings", "Landroid/graphics/Rect;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;ZLandroid/graphics/Rect;)V", "getId", "()Ljava/lang/String;", "getLottieResource", "getWidth", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getHeight", "getRatioW", "getRatioH", "getPercentW", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getInfinity", "()Z", "getPaddings", "()Landroid/graphics/Rect;", "provideId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;ZLandroid/graphics/Rect;)Lru/ozon/fintech/ui/lottie/FinLottieState;", "equals", "other", "", "hashCode", "toString", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FinLottieState implements RecyclerItem {
    private final Integer height;

    @NotNull
    private final String id;
    private final boolean infinity;

    @NotNull
    private final String lottieResource;

    @NotNull
    private final Rect paddings;
    private final Float percentW;
    private final Integer ratioH;
    private final Integer ratioW;
    private final Integer width;

    public FinLottieState(@NotNull String id2, @NotNull String lottieResource, Integer num, Integer num2, Integer num3, Integer num4, Float f7, boolean z11, @NotNull Rect paddings) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(lottieResource, "lottieResource");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        this.id = id2;
        this.lottieResource = lottieResource;
        this.width = num;
        this.height = num2;
        this.ratioW = num3;
        this.ratioH = num4;
        this.percentW = f7;
        this.infinity = z11;
        this.paddings = paddings;
    }

    public static /* synthetic */ FinLottieState copy$default(FinLottieState finLottieState, String str, String str2, Integer num, Integer num2, Integer num3, Integer num4, Float f7, boolean z11, Rect rect, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = finLottieState.id;
        }
        if ((i11 & 2) != 0) {
            str2 = finLottieState.lottieResource;
        }
        if ((i11 & 4) != 0) {
            num = finLottieState.width;
        }
        if ((i11 & 8) != 0) {
            num2 = finLottieState.height;
        }
        if ((i11 & 16) != 0) {
            num3 = finLottieState.ratioW;
        }
        if ((i11 & 32) != 0) {
            num4 = finLottieState.ratioH;
        }
        if ((i11 & 64) != 0) {
            f7 = finLottieState.percentW;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            z11 = finLottieState.infinity;
        }
        if ((i11 & 256) != 0) {
            rect = finLottieState.paddings;
        }
        boolean z12 = z11;
        Rect rect2 = rect;
        Integer num5 = num4;
        Float f11 = f7;
        Integer num6 = num3;
        Integer num7 = num;
        return finLottieState.copy(str, str2, num7, num2, num6, num5, f11, z12, rect2);
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

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getLottieResource() {
        return this.lottieResource;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getWidth() {
        return this.width;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getHeight() {
        return this.height;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getRatioW() {
        return this.ratioW;
    }

    /* renamed from: component6, reason: from getter */
    public final Integer getRatioH() {
        return this.ratioH;
    }

    /* renamed from: component7, reason: from getter */
    public final Float getPercentW() {
        return this.percentW;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getInfinity() {
        return this.infinity;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final Rect getPaddings() {
        return this.paddings;
    }

    @NotNull
    public final FinLottieState copy(@NotNull String id2, @NotNull String lottieResource, Integer width, Integer height, Integer ratioW, Integer ratioH, Float percentW, boolean infinity, @NotNull Rect paddings) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(lottieResource, "lottieResource");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        return new FinLottieState(id2, lottieResource, width, height, ratioW, ratioH, percentW, infinity, paddings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FinLottieState)) {
            return false;
        }
        FinLottieState finLottieState = (FinLottieState) other;
        return Intrinsics.d(this.id, finLottieState.id) && Intrinsics.d(this.lottieResource, finLottieState.lottieResource) && Intrinsics.d(this.width, finLottieState.width) && Intrinsics.d(this.height, finLottieState.height) && Intrinsics.d(this.ratioW, finLottieState.ratioW) && Intrinsics.d(this.ratioH, finLottieState.ratioH) && Intrinsics.d(this.percentW, finLottieState.percentW) && this.infinity == finLottieState.infinity && Intrinsics.d(this.paddings, finLottieState.paddings);
    }

    public final Integer getHeight() {
        return this.height;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final boolean getInfinity() {
        return this.infinity;
    }

    @NotNull
    public final String getLottieResource() {
        return this.lottieResource;
    }

    @NotNull
    public final Rect getPaddings() {
        return this.paddings;
    }

    public final Float getPercentW() {
        return this.percentW;
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
        int a11 = g.a(this.id.hashCode() * 31, 31, this.lottieResource);
        Integer num = this.width;
        int hashCode = (a11 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.height;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.ratioW;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.ratioH;
        int hashCode4 = (hashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Float f7 = this.percentW;
        return this.paddings.hashCode() + C3532b.a((hashCode4 + (f7 != null ? f7.hashCode() : 0)) * 31, 31, this.infinity);
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    @NotNull
    public String provideId() {
        return this.id;
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.lottieResource;
        Integer num = this.width;
        Integer num2 = this.height;
        Integer num3 = this.ratioW;
        Integer num4 = this.ratioH;
        Float f7 = this.percentW;
        boolean z11 = this.infinity;
        Rect rect = this.paddings;
        StringBuilder d11 = C3660k.d("FinLottieState(id=", str, ", lottieResource=", str2, ", width=");
        c.e(d11, num, ", height=", num2, ", ratioW=");
        c.e(d11, num3, ", ratioH=", num4, ", percentW=");
        d11.append(f7);
        d11.append(", infinity=");
        d11.append(z11);
        d11.append(", paddings=");
        d11.append(rect);
        d11.append(")");
        return d11.toString();
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    public Class<? extends Object> withView() {
        return null;
    }

    public /* synthetic */ FinLottieState(String str, String str2, Integer num, Integer num2, Integer num3, Integer num4, Float f7, boolean z11, Rect rect, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, num, num2, num3, num4, f7, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? false : z11, (i11 & 256) != 0 ? i.a() : rect);
    }
}
