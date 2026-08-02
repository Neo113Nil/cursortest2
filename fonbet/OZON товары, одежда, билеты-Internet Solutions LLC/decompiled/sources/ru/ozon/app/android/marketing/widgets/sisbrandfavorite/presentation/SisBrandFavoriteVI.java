package ru.ozon.app.android.marketing.widgets.sisbrandfavorite.presentation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.sisbrandfavorite.data.DynamicOnScrollColors;
import ru.ozon.app.android.marketing.widgets.sisbrandfavorite.data.Options;
import ru.ozon.app.android.seller.molecule.sisbrandfavorite.data.SisBrandFavoriteButton;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0081\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b%\u0010$R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lru/ozon/app/android/marketing/widgets/sisbrandfavorite/presentation/SisBrandFavoriteVI;", "Ll20/c;", "", "id", "Lru/ozon/app/android/seller/molecule/sisbrandfavorite/data/SisBrandFavoriteButton;", "favoriteButton", "Lru/ozon/app/android/marketing/widgets/sisbrandfavorite/data/Options;", "options", "Lru/ozon/app/android/marketing/widgets/sisbrandfavorite/data/DynamicOnScrollColors;", "dynamicOnScrollColors", "dynamicOnScrollFavoriteColors", "", "hasDynamicColors", "<init>", "(JLru/ozon/app/android/seller/molecule/sisbrandfavorite/data/SisBrandFavoriteButton;Lru/ozon/app/android/marketing/widgets/sisbrandfavorite/data/Options;Lru/ozon/app/android/marketing/widgets/sisbrandfavorite/data/DynamicOnScrollColors;Lru/ozon/app/android/marketing/widgets/sisbrandfavorite/data/DynamicOnScrollColors;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/seller/molecule/sisbrandfavorite/data/SisBrandFavoriteButton;", "getFavoriteButton", "()Lru/ozon/app/android/seller/molecule/sisbrandfavorite/data/SisBrandFavoriteButton;", "Lru/ozon/app/android/marketing/widgets/sisbrandfavorite/data/Options;", "getOptions", "()Lru/ozon/app/android/marketing/widgets/sisbrandfavorite/data/Options;", "Lru/ozon/app/android/marketing/widgets/sisbrandfavorite/data/DynamicOnScrollColors;", "getDynamicOnScrollColors", "()Lru/ozon/app/android/marketing/widgets/sisbrandfavorite/data/DynamicOnScrollColors;", "getDynamicOnScrollFavoriteColors", "Z", "getHasDynamicColors", "()Z", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class SisBrandFavoriteVI implements c {
    private final DynamicOnScrollColors dynamicOnScrollColors;
    private final DynamicOnScrollColors dynamicOnScrollFavoriteColors;

    @NotNull
    private final SisBrandFavoriteButton favoriteButton;
    private final boolean hasDynamicColors;
    private final long id;
    private final Options options;

    public SisBrandFavoriteVI(long j11, @NotNull SisBrandFavoriteButton favoriteButton, Options options, DynamicOnScrollColors dynamicOnScrollColors, DynamicOnScrollColors dynamicOnScrollColors2, boolean z11) {
        Intrinsics.checkNotNullParameter(favoriteButton, "favoriteButton");
        this.id = j11;
        this.favoriteButton = favoriteButton;
        this.options = options;
        this.dynamicOnScrollColors = dynamicOnScrollColors;
        this.dynamicOnScrollFavoriteColors = dynamicOnScrollColors2;
        this.hasDynamicColors = z11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SisBrandFavoriteVI)) {
            return false;
        }
        SisBrandFavoriteVI sisBrandFavoriteVI = (SisBrandFavoriteVI) other;
        return this.id == sisBrandFavoriteVI.id && Intrinsics.d(this.favoriteButton, sisBrandFavoriteVI.favoriteButton) && Intrinsics.d(this.options, sisBrandFavoriteVI.options) && Intrinsics.d(this.dynamicOnScrollColors, sisBrandFavoriteVI.dynamicOnScrollColors) && Intrinsics.d(this.dynamicOnScrollFavoriteColors, sisBrandFavoriteVI.dynamicOnScrollFavoriteColors) && this.hasDynamicColors == sisBrandFavoriteVI.hasDynamicColors;
    }

    public final DynamicOnScrollColors getDynamicOnScrollColors() {
        return this.dynamicOnScrollColors;
    }

    public final DynamicOnScrollColors getDynamicOnScrollFavoriteColors() {
        return this.dynamicOnScrollFavoriteColors;
    }

    @NotNull
    public final SisBrandFavoriteButton getFavoriteButton() {
        return this.favoriteButton;
    }

    public final boolean getHasDynamicColors() {
        return this.hasDynamicColors;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final Options getOptions() {
        return this.options;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.favoriteButton.hashCode() + (Long.hashCode(this.id) * 31)) * 31;
        Options options = this.options;
        int hashCode2 = (hashCode + (options == null ? 0 : options.hashCode())) * 31;
        DynamicOnScrollColors dynamicOnScrollColors = this.dynamicOnScrollColors;
        int hashCode3 = (hashCode2 + (dynamicOnScrollColors == null ? 0 : dynamicOnScrollColors.hashCode())) * 31;
        DynamicOnScrollColors dynamicOnScrollColors2 = this.dynamicOnScrollFavoriteColors;
        return Boolean.hashCode(this.hasDynamicColors) + ((hashCode3 + (dynamicOnScrollColors2 != null ? dynamicOnScrollColors2.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        return "SisBrandFavoriteVI(id=" + this.id + ", favoriteButton=" + this.favoriteButton + ", options=" + this.options + ", dynamicOnScrollColors=" + this.dynamicOnScrollColors + ", dynamicOnScrollFavoriteColors=" + this.dynamicOnScrollFavoriteColors + ", hasDynamicColors=" + this.hasDynamicColors + ")";
    }
}
