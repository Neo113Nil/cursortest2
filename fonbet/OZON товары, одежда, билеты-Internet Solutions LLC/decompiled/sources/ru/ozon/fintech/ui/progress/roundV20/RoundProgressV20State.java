package ru.ozon.fintech.ui.progress.roundV20;

import B0.C2454a;
import G.g;
import Nh.a;
import androidx.annotation.Keep;
import com.detmir.recycli.adapters.RecyclerItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.ui.utils.Common;
import ru.ozon.fintech.ui.utils.WidgetState;

@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0017\u001a\u00020\bH\u0016J\t\u0010\u0018\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0015JD\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\u0006HÖ\u0001J\t\u0010$\u001a\u00020\bHÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015¨\u0006%"}, d2 = {"Lru/ozon/fintech/ui/progress/roundV20/RoundProgressV20State;", "Lcom/detmir/recycli/adapters/RecyclerItem;", "Lru/ozon/fintech/ui/utils/WidgetState;", "common", "Lru/ozon/fintech/ui/utils/Common;", "percentage", "", "percentColor", "", "percentBackgroundColor", "progressStrokeWidth", "<init>", "(Lru/ozon/fintech/ui/utils/Common;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getCommon", "()Lru/ozon/fintech/ui/utils/Common;", "getPercentage", "()I", "getPercentColor", "()Ljava/lang/String;", "getPercentBackgroundColor", "getProgressStrokeWidth", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "provideId", "component1", "component2", "component3", "component4", "component5", "copy", "(Lru/ozon/fintech/ui/utils/Common;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lru/ozon/fintech/ui/progress/roundV20/RoundProgressV20State;", "equals", "", "other", "", "hashCode", "toString", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RoundProgressV20State implements RecyclerItem, WidgetState {

    @NotNull
    private final Common common;
    private final String percentBackgroundColor;

    @NotNull
    private final String percentColor;
    private final int percentage;
    private final Integer progressStrokeWidth;

    public RoundProgressV20State(@NotNull Common common, int i11, @NotNull String percentColor, String str, Integer num) {
        Intrinsics.checkNotNullParameter(common, "common");
        Intrinsics.checkNotNullParameter(percentColor, "percentColor");
        this.common = common;
        this.percentage = i11;
        this.percentColor = percentColor;
        this.percentBackgroundColor = str;
        this.progressStrokeWidth = num;
    }

    public static /* synthetic */ RoundProgressV20State copy$default(RoundProgressV20State roundProgressV20State, Common common, int i11, String str, String str2, Integer num, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            common = roundProgressV20State.common;
        }
        if ((i12 & 2) != 0) {
            i11 = roundProgressV20State.percentage;
        }
        if ((i12 & 4) != 0) {
            str = roundProgressV20State.percentColor;
        }
        if ((i12 & 8) != 0) {
            str2 = roundProgressV20State.percentBackgroundColor;
        }
        if ((i12 & 16) != 0) {
            num = roundProgressV20State.progressStrokeWidth;
        }
        Integer num2 = num;
        String str3 = str;
        return roundProgressV20State.copy(common, i11, str3, str2, num2);
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    public boolean areContentsTheSame(@NotNull RecyclerItem recyclerItem) {
        return RecyclerItem.a.a(this, recyclerItem);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Common getCommon() {
        return this.common;
    }

    /* renamed from: component2, reason: from getter */
    public final int getPercentage() {
        return this.percentage;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getPercentColor() {
        return this.percentColor;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPercentBackgroundColor() {
        return this.percentBackgroundColor;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getProgressStrokeWidth() {
        return this.progressStrokeWidth;
    }

    @NotNull
    public final RoundProgressV20State copy(@NotNull Common common, int percentage, @NotNull String percentColor, String percentBackgroundColor, Integer progressStrokeWidth) {
        Intrinsics.checkNotNullParameter(common, "common");
        Intrinsics.checkNotNullParameter(percentColor, "percentColor");
        return new RoundProgressV20State(common, percentage, percentColor, percentBackgroundColor, progressStrokeWidth);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RoundProgressV20State)) {
            return false;
        }
        RoundProgressV20State roundProgressV20State = (RoundProgressV20State) other;
        return Intrinsics.d(this.common, roundProgressV20State.common) && this.percentage == roundProgressV20State.percentage && Intrinsics.d(this.percentColor, roundProgressV20State.percentColor) && Intrinsics.d(this.percentBackgroundColor, roundProgressV20State.percentBackgroundColor) && Intrinsics.d(this.progressStrokeWidth, roundProgressV20State.progressStrokeWidth);
    }

    @Override // ru.ozon.fintech.ui.utils.WidgetState
    @NotNull
    public Common getCommon() {
        return this.common;
    }

    public final String getPercentBackgroundColor() {
        return this.percentBackgroundColor;
    }

    @NotNull
    public final String getPercentColor() {
        return this.percentColor;
    }

    public final int getPercentage() {
        return this.percentage;
    }

    public final Integer getProgressStrokeWidth() {
        return this.progressStrokeWidth;
    }

    public int hashCode() {
        int a11 = g.a(C2454a.a(this.percentage, this.common.hashCode() * 31, 31), 31, this.percentColor);
        String str = this.percentBackgroundColor;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.progressStrokeWidth;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    @NotNull
    public String provideId() {
        return getCommon().getWidgetId();
    }

    @NotNull
    public String toString() {
        Common common = this.common;
        int i11 = this.percentage;
        String str = this.percentColor;
        String str2 = this.percentBackgroundColor;
        Integer num = this.progressStrokeWidth;
        StringBuilder sb2 = new StringBuilder("RoundProgressV20State(common=");
        sb2.append(common);
        sb2.append(", percentage=");
        sb2.append(i11);
        sb2.append(", percentColor=");
        a.h(sb2, str, ", percentBackgroundColor=", str2, ", progressStrokeWidth=");
        return Ep.a.c(sb2, num, ")");
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    public Class<? extends Object> withView() {
        return null;
    }
}
