package ru.ozon.fintech.ui.lottieV20;

import G.g;
import Pk0.a;
import androidx.annotation.Keep;
import com.detmir.recycli.adapters.RecyclerItem;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.ui.utils.Common;
import ru.ozon.fintech.ui.utils.WidgetState;

@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0011\u001a\u00020\u0006H\u0016J\t\u0010\u0012\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lru/ozon/fintech/ui/lottieV20/LottieV20State;", "Lcom/detmir/recycli/adapters/RecyclerItem;", "Lru/ozon/fintech/ui/utils/WidgetState;", "common", "Lru/ozon/fintech/ui/utils/Common;", "lottieResource", "", "infinity", "", "<init>", "(Lru/ozon/fintech/ui/utils/Common;Ljava/lang/String;Z)V", "getCommon", "()Lru/ozon/fintech/ui/utils/Common;", "getLottieResource", "()Ljava/lang/String;", "getInfinity", "()Z", "provideId", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class LottieV20State implements RecyclerItem, WidgetState {

    @NotNull
    private final Common common;
    private final boolean infinity;

    @NotNull
    private final String lottieResource;

    public LottieV20State(@NotNull Common common, @NotNull String lottieResource, boolean z11) {
        Intrinsics.checkNotNullParameter(common, "common");
        Intrinsics.checkNotNullParameter(lottieResource, "lottieResource");
        this.common = common;
        this.lottieResource = lottieResource;
        this.infinity = z11;
    }

    public static /* synthetic */ LottieV20State copy$default(LottieV20State lottieV20State, Common common, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            common = lottieV20State.common;
        }
        if ((i11 & 2) != 0) {
            str = lottieV20State.lottieResource;
        }
        if ((i11 & 4) != 0) {
            z11 = lottieV20State.infinity;
        }
        return lottieV20State.copy(common, str, z11);
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
    public final String getLottieResource() {
        return this.lottieResource;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getInfinity() {
        return this.infinity;
    }

    @NotNull
    public final LottieV20State copy(@NotNull Common common, @NotNull String lottieResource, boolean infinity) {
        Intrinsics.checkNotNullParameter(common, "common");
        Intrinsics.checkNotNullParameter(lottieResource, "lottieResource");
        return new LottieV20State(common, lottieResource, infinity);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LottieV20State)) {
            return false;
        }
        LottieV20State lottieV20State = (LottieV20State) other;
        return Intrinsics.d(this.common, lottieV20State.common) && Intrinsics.d(this.lottieResource, lottieV20State.lottieResource) && this.infinity == lottieV20State.infinity;
    }

    @Override // ru.ozon.fintech.ui.utils.WidgetState
    @NotNull
    public Common getCommon() {
        return this.common;
    }

    public final boolean getInfinity() {
        return this.infinity;
    }

    @NotNull
    public final String getLottieResource() {
        return this.lottieResource;
    }

    public int hashCode() {
        return Boolean.hashCode(this.infinity) + g.a(this.common.hashCode() * 31, 31, this.lottieResource);
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    @NotNull
    public String provideId() {
        return getCommon().getWidgetId();
    }

    @NotNull
    public String toString() {
        Common common = this.common;
        String str = this.lottieResource;
        boolean z11 = this.infinity;
        StringBuilder sb2 = new StringBuilder("LottieV20State(common=");
        sb2.append(common);
        sb2.append(", lottieResource=");
        sb2.append(str);
        sb2.append(", infinity=");
        return a.a(")", sb2, z11);
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    public Class<? extends Object> withView() {
        return null;
    }

    public /* synthetic */ LottieV20State(Common common, String str, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(common, str, (i11 & 4) != 0 ? false : z11);
    }
}
