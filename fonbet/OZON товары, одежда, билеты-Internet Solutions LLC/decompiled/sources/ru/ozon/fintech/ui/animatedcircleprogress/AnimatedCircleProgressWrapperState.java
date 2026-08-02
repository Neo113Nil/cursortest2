package ru.ozon.fintech.ui.animatedcircleprogress;

import B4.V;
import G.g;
import androidx.annotation.Keep;
import com.detmir.recycli.adapters.RecyclerItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.ui.utils.Common;
import ru.ozon.fintech.ui.utils.WidgetState;

@Keep
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0011\u001a\u00020\u0006H\u0016J\t\u0010\u0012\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0006HÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, d2 = {"Lru/ozon/fintech/ui/animatedcircleprogress/AnimatedCircleProgressWrapperState;", "Lcom/detmir/recycli/adapters/RecyclerItem;", "Lru/ozon/fintech/ui/utils/WidgetState;", "common", "Lru/ozon/fintech/ui/utils/Common;", "tintColor", "", "progressStrokeWidth", "", "<init>", "(Lru/ozon/fintech/ui/utils/Common;Ljava/lang/String;F)V", "getCommon", "()Lru/ozon/fintech/ui/utils/Common;", "getTintColor", "()Ljava/lang/String;", "getProgressStrokeWidth", "()F", "provideId", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AnimatedCircleProgressWrapperState implements RecyclerItem, WidgetState {

    @NotNull
    private final Common common;
    private final float progressStrokeWidth;

    @NotNull
    private final String tintColor;

    public AnimatedCircleProgressWrapperState(@NotNull Common common, @NotNull String tintColor, float f7) {
        Intrinsics.checkNotNullParameter(common, "common");
        Intrinsics.checkNotNullParameter(tintColor, "tintColor");
        this.common = common;
        this.tintColor = tintColor;
        this.progressStrokeWidth = f7;
    }

    public static /* synthetic */ AnimatedCircleProgressWrapperState copy$default(AnimatedCircleProgressWrapperState animatedCircleProgressWrapperState, Common common, String str, float f7, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            common = animatedCircleProgressWrapperState.common;
        }
        if ((i11 & 2) != 0) {
            str = animatedCircleProgressWrapperState.tintColor;
        }
        if ((i11 & 4) != 0) {
            f7 = animatedCircleProgressWrapperState.progressStrokeWidth;
        }
        return animatedCircleProgressWrapperState.copy(common, str, f7);
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

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getTintColor() {
        return this.tintColor;
    }

    /* renamed from: component3, reason: from getter */
    public final float getProgressStrokeWidth() {
        return this.progressStrokeWidth;
    }

    @NotNull
    public final AnimatedCircleProgressWrapperState copy(@NotNull Common common, @NotNull String tintColor, float progressStrokeWidth) {
        Intrinsics.checkNotNullParameter(common, "common");
        Intrinsics.checkNotNullParameter(tintColor, "tintColor");
        return new AnimatedCircleProgressWrapperState(common, tintColor, progressStrokeWidth);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnimatedCircleProgressWrapperState)) {
            return false;
        }
        AnimatedCircleProgressWrapperState animatedCircleProgressWrapperState = (AnimatedCircleProgressWrapperState) other;
        return Intrinsics.d(this.common, animatedCircleProgressWrapperState.common) && Intrinsics.d(this.tintColor, animatedCircleProgressWrapperState.tintColor) && Float.compare(this.progressStrokeWidth, animatedCircleProgressWrapperState.progressStrokeWidth) == 0;
    }

    @Override // ru.ozon.fintech.ui.utils.WidgetState
    @NotNull
    public Common getCommon() {
        return this.common;
    }

    public final float getProgressStrokeWidth() {
        return this.progressStrokeWidth;
    }

    @NotNull
    public final String getTintColor() {
        return this.tintColor;
    }

    public int hashCode() {
        return Float.hashCode(this.progressStrokeWidth) + g.a(this.common.hashCode() * 31, 31, this.tintColor);
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    @NotNull
    public String provideId() {
        return getCommon().getWidgetId();
    }

    @NotNull
    public String toString() {
        Common common = this.common;
        String str = this.tintColor;
        float f7 = this.progressStrokeWidth;
        StringBuilder sb2 = new StringBuilder("AnimatedCircleProgressWrapperState(common=");
        sb2.append(common);
        sb2.append(", tintColor=");
        sb2.append(str);
        sb2.append(", progressStrokeWidth=");
        return V.b(f7, ")", sb2);
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    public Class<? extends Object> withView() {
        return null;
    }
}
