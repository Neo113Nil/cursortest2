package ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v3.data;

import B3.p;
import GR.b;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.common.Paddings;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v3/data/Spacers;", "", "top", "Lru/ozon/uni/atoms/data/common/Paddings;", "bottom", "horizontal", "between", "<init>", "(Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "getTop", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getBottom", "getHorizontal", "getBetween", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class Spacers {
    public static final int $stable = 0;

    @NotNull
    private final Paddings between;

    @NotNull
    private final Paddings bottom;

    @NotNull
    private final Paddings horizontal;

    @NotNull
    private final Paddings top;

    public Spacers() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ Spacers copy$default(Spacers spacers, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            paddings = spacers.top;
        }
        if ((i11 & 2) != 0) {
            paddings2 = spacers.bottom;
        }
        if ((i11 & 4) != 0) {
            paddings3 = spacers.horizontal;
        }
        if ((i11 & 8) != 0) {
            paddings4 = spacers.between;
        }
        return spacers.copy(paddings, paddings2, paddings3, paddings4);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Paddings getTop() {
        return this.top;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Paddings getBottom() {
        return this.bottom;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final Paddings getHorizontal() {
        return this.horizontal;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final Paddings getBetween() {
        return this.between;
    }

    @NotNull
    public final Spacers copy(@NotNull Paddings top, @NotNull Paddings bottom, @NotNull Paddings horizontal, @NotNull Paddings between) {
        Intrinsics.checkNotNullParameter(top, "top");
        Intrinsics.checkNotNullParameter(bottom, "bottom");
        Intrinsics.checkNotNullParameter(horizontal, "horizontal");
        Intrinsics.checkNotNullParameter(between, "between");
        return new Spacers(top, bottom, horizontal, between);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Spacers)) {
            return false;
        }
        Spacers spacers = (Spacers) other;
        return this.top == spacers.top && this.bottom == spacers.bottom && this.horizontal == spacers.horizontal && this.between == spacers.between;
    }

    @NotNull
    public final Paddings getBetween() {
        return this.between;
    }

    @NotNull
    public final Paddings getBottom() {
        return this.bottom;
    }

    @NotNull
    public final Paddings getHorizontal() {
        return this.horizontal;
    }

    @NotNull
    public final Paddings getTop() {
        return this.top;
    }

    public int hashCode() {
        return this.between.hashCode() + b.b(this.horizontal, b.b(this.bottom, this.top.hashCode() * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        Paddings paddings = this.top;
        Paddings paddings2 = this.bottom;
        return b.e(p.b("Spacers(top=", paddings, ", bottom=", paddings2, ", horizontal="), this.horizontal, ", between=", this.between, ")");
    }

    public Spacers(@NotNull Paddings top, @NotNull Paddings bottom, @NotNull Paddings horizontal, @NotNull Paddings between) {
        Intrinsics.checkNotNullParameter(top, "top");
        Intrinsics.checkNotNullParameter(bottom, "bottom");
        Intrinsics.checkNotNullParameter(horizontal, "horizontal");
        Intrinsics.checkNotNullParameter(between, "between");
        this.top = top;
        this.bottom = bottom;
        this.horizontal = horizontal;
        this.between = between;
    }

    public /* synthetic */ Spacers(Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? Paddings.PADDING_400 : paddings, (i11 & 2) != 0 ? Paddings.PADDING_200 : paddings2, (i11 & 4) != 0 ? Paddings.PADDING_300 : paddings3, (i11 & 8) != 0 ? Paddings.PADDING_350 : paddings4);
    }
}
