package ru.ozon.uni.android.wrappers.mainaddon.data;

import B0.C2454a;
import Sc.InterfaceC3999a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.wrappers.mainaddon.data.ContentAxisRelatedPadding;
import ru.ozon.uni.android.wrappers.mainaddon.data.LayoutPadding;

@InterfaceC3999a
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013Jx\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000fHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b(\u0010'R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b)\u0010'R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b+\u0010\u001aR\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\f\u0010*\u001a\u0004\b,\u0010\u001aR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00100\u001a\u0004\b1\u00102R\u0017\u0010\u0011\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u00100\u001a\u0004\b3\u00102¨\u00064"}, d2 = {"Lru/ozon/uni/android/wrappers/mainaddon/data/MainAddonSettings;", "", "Lru/ozon/uni/android/wrappers/mainaddon/data/Axis;", "axis", "Lru/ozon/uni/android/wrappers/mainaddon/data/AddonSide;", "addonSide", "Lru/ozon/uni/android/wrappers/mainaddon/data/Alignment;", "alignment", "mainAlignment", "addonAlignment", "", "gap", "minWrapperHeight", "Lru/ozon/uni/android/wrappers/mainaddon/data/LayoutPadding;", "padding", "Lru/ozon/uni/android/wrappers/mainaddon/data/ContentAxisRelatedPadding;", "mainPadding", "addonPadding", "<init>", "(Lru/ozon/uni/android/wrappers/mainaddon/data/Axis;Lru/ozon/uni/android/wrappers/mainaddon/data/AddonSide;Lru/ozon/uni/android/wrappers/mainaddon/data/Alignment;Lru/ozon/uni/android/wrappers/mainaddon/data/Alignment;Lru/ozon/uni/android/wrappers/mainaddon/data/Alignment;IILru/ozon/uni/android/wrappers/mainaddon/data/LayoutPadding;Lru/ozon/uni/android/wrappers/mainaddon/data/ContentAxisRelatedPadding;Lru/ozon/uni/android/wrappers/mainaddon/data/ContentAxisRelatedPadding;)V", "copy", "(Lru/ozon/uni/android/wrappers/mainaddon/data/Axis;Lru/ozon/uni/android/wrappers/mainaddon/data/AddonSide;Lru/ozon/uni/android/wrappers/mainaddon/data/Alignment;Lru/ozon/uni/android/wrappers/mainaddon/data/Alignment;Lru/ozon/uni/android/wrappers/mainaddon/data/Alignment;IILru/ozon/uni/android/wrappers/mainaddon/data/LayoutPadding;Lru/ozon/uni/android/wrappers/mainaddon/data/ContentAxisRelatedPadding;Lru/ozon/uni/android/wrappers/mainaddon/data/ContentAxisRelatedPadding;)Lru/ozon/uni/android/wrappers/mainaddon/data/MainAddonSettings;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/android/wrappers/mainaddon/data/Axis;", "getAxis", "()Lru/ozon/uni/android/wrappers/mainaddon/data/Axis;", "Lru/ozon/uni/android/wrappers/mainaddon/data/AddonSide;", "getAddonSide", "()Lru/ozon/uni/android/wrappers/mainaddon/data/AddonSide;", "Lru/ozon/uni/android/wrappers/mainaddon/data/Alignment;", "getAlignment", "()Lru/ozon/uni/android/wrappers/mainaddon/data/Alignment;", "getMainAlignment", "getAddonAlignment", "I", "getGap", "getMinWrapperHeight", "Lru/ozon/uni/android/wrappers/mainaddon/data/LayoutPadding;", "getPadding", "()Lru/ozon/uni/android/wrappers/mainaddon/data/LayoutPadding;", "Lru/ozon/uni/android/wrappers/mainaddon/data/ContentAxisRelatedPadding;", "getMainPadding", "()Lru/ozon/uni/android/wrappers/mainaddon/data/ContentAxisRelatedPadding;", "getAddonPadding", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class MainAddonSettings {
    private final Alignment addonAlignment;

    @NotNull
    private final ContentAxisRelatedPadding addonPadding;

    @NotNull
    private final AddonSide addonSide;

    @NotNull
    private final Alignment alignment;

    @NotNull
    private final Axis axis;
    private final int gap;
    private final Alignment mainAlignment;

    @NotNull
    private final ContentAxisRelatedPadding mainPadding;
    private final int minWrapperHeight;

    @NotNull
    private final LayoutPadding padding;

    public MainAddonSettings() {
        this(null, null, null, null, null, 0, 0, null, null, null, 1023, null);
    }

    public static /* synthetic */ MainAddonSettings copy$default(MainAddonSettings mainAddonSettings, Axis axis, AddonSide addonSide, Alignment alignment, Alignment alignment2, Alignment alignment3, int i11, int i12, LayoutPadding layoutPadding, ContentAxisRelatedPadding contentAxisRelatedPadding, ContentAxisRelatedPadding contentAxisRelatedPadding2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            axis = mainAddonSettings.axis;
        }
        if ((i13 & 2) != 0) {
            addonSide = mainAddonSettings.addonSide;
        }
        if ((i13 & 4) != 0) {
            alignment = mainAddonSettings.alignment;
        }
        if ((i13 & 8) != 0) {
            alignment2 = mainAddonSettings.mainAlignment;
        }
        if ((i13 & 16) != 0) {
            alignment3 = mainAddonSettings.addonAlignment;
        }
        if ((i13 & 32) != 0) {
            i11 = mainAddonSettings.gap;
        }
        if ((i13 & 64) != 0) {
            i12 = mainAddonSettings.minWrapperHeight;
        }
        if ((i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            layoutPadding = mainAddonSettings.padding;
        }
        if ((i13 & 256) != 0) {
            contentAxisRelatedPadding = mainAddonSettings.mainPadding;
        }
        if ((i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            contentAxisRelatedPadding2 = mainAddonSettings.addonPadding;
        }
        ContentAxisRelatedPadding contentAxisRelatedPadding3 = contentAxisRelatedPadding;
        ContentAxisRelatedPadding contentAxisRelatedPadding4 = contentAxisRelatedPadding2;
        int i14 = i12;
        LayoutPadding layoutPadding2 = layoutPadding;
        Alignment alignment4 = alignment3;
        int i15 = i11;
        return mainAddonSettings.copy(axis, addonSide, alignment, alignment2, alignment4, i15, i14, layoutPadding2, contentAxisRelatedPadding3, contentAxisRelatedPadding4);
    }

    @NotNull
    public final MainAddonSettings copy(@NotNull Axis axis, @NotNull AddonSide addonSide, @NotNull Alignment alignment, Alignment mainAlignment, Alignment addonAlignment, int gap, int minWrapperHeight, @NotNull LayoutPadding padding, @NotNull ContentAxisRelatedPadding mainPadding, @NotNull ContentAxisRelatedPadding addonPadding) {
        Intrinsics.checkNotNullParameter(axis, "axis");
        Intrinsics.checkNotNullParameter(addonSide, "addonSide");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Intrinsics.checkNotNullParameter(padding, "padding");
        Intrinsics.checkNotNullParameter(mainPadding, "mainPadding");
        Intrinsics.checkNotNullParameter(addonPadding, "addonPadding");
        return new MainAddonSettings(axis, addonSide, alignment, mainAlignment, addonAlignment, gap, minWrapperHeight, padding, mainPadding, addonPadding);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MainAddonSettings)) {
            return false;
        }
        MainAddonSettings mainAddonSettings = (MainAddonSettings) other;
        return this.axis == mainAddonSettings.axis && this.addonSide == mainAddonSettings.addonSide && this.alignment == mainAddonSettings.alignment && this.mainAlignment == mainAddonSettings.mainAlignment && this.addonAlignment == mainAddonSettings.addonAlignment && this.gap == mainAddonSettings.gap && this.minWrapperHeight == mainAddonSettings.minWrapperHeight && Intrinsics.d(this.padding, mainAddonSettings.padding) && Intrinsics.d(this.mainPadding, mainAddonSettings.mainPadding) && Intrinsics.d(this.addonPadding, mainAddonSettings.addonPadding);
    }

    public final Alignment getAddonAlignment() {
        return this.addonAlignment;
    }

    @NotNull
    public final ContentAxisRelatedPadding getAddonPadding() {
        return this.addonPadding;
    }

    @NotNull
    public final AddonSide getAddonSide() {
        return this.addonSide;
    }

    @NotNull
    public final Alignment getAlignment() {
        return this.alignment;
    }

    @NotNull
    public final Axis getAxis() {
        return this.axis;
    }

    public final int getGap() {
        return this.gap;
    }

    public final Alignment getMainAlignment() {
        return this.mainAlignment;
    }

    @NotNull
    public final ContentAxisRelatedPadding getMainPadding() {
        return this.mainPadding;
    }

    public final int getMinWrapperHeight() {
        return this.minWrapperHeight;
    }

    @NotNull
    public final LayoutPadding getPadding() {
        return this.padding;
    }

    public int hashCode() {
        int hashCode = (this.alignment.hashCode() + ((this.addonSide.hashCode() + (this.axis.hashCode() * 31)) * 31)) * 31;
        Alignment alignment = this.mainAlignment;
        int hashCode2 = (hashCode + (alignment == null ? 0 : alignment.hashCode())) * 31;
        Alignment alignment2 = this.addonAlignment;
        return this.addonPadding.hashCode() + ((this.mainPadding.hashCode() + ((this.padding.hashCode() + C2454a.a(this.minWrapperHeight, C2454a.a(this.gap, (hashCode2 + (alignment2 != null ? alignment2.hashCode() : 0)) * 31, 31), 31)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "MainAddonSettings(axis=" + this.axis + ", addonSide=" + this.addonSide + ", alignment=" + this.alignment + ", mainAlignment=" + this.mainAlignment + ", addonAlignment=" + this.addonAlignment + ", gap=" + this.gap + ", minWrapperHeight=" + this.minWrapperHeight + ", padding=" + this.padding + ", mainPadding=" + this.mainPadding + ", addonPadding=" + this.addonPadding + ")";
    }

    public MainAddonSettings(@NotNull Axis axis, @NotNull AddonSide addonSide, @NotNull Alignment alignment, Alignment alignment2, Alignment alignment3, int i11, int i12, @NotNull LayoutPadding padding, @NotNull ContentAxisRelatedPadding mainPadding, @NotNull ContentAxisRelatedPadding addonPadding) {
        Intrinsics.checkNotNullParameter(axis, "axis");
        Intrinsics.checkNotNullParameter(addonSide, "addonSide");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Intrinsics.checkNotNullParameter(padding, "padding");
        Intrinsics.checkNotNullParameter(mainPadding, "mainPadding");
        Intrinsics.checkNotNullParameter(addonPadding, "addonPadding");
        this.axis = axis;
        this.addonSide = addonSide;
        this.alignment = alignment;
        this.mainAlignment = alignment2;
        this.addonAlignment = alignment3;
        this.gap = i11;
        this.minWrapperHeight = i12;
        this.padding = padding;
        this.mainPadding = mainPadding;
        this.addonPadding = addonPadding;
    }

    public /* synthetic */ MainAddonSettings(Axis axis, AddonSide addonSide, Alignment alignment, Alignment alignment2, Alignment alignment3, int i11, int i12, LayoutPadding layoutPadding, ContentAxisRelatedPadding contentAxisRelatedPadding, ContentAxisRelatedPadding contentAxisRelatedPadding2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? Axis.HORIZONTAL : axis, (i13 & 2) != 0 ? AddonSide.START : addonSide, (i13 & 4) != 0 ? Alignment.LEADING : alignment, (i13 & 8) != 0 ? null : alignment2, (i13 & 16) != 0 ? null : alignment3, (i13 & 32) != 0 ? 0 : i11, (i13 & 64) != 0 ? 0 : i12, (i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? new LayoutPadding.zero() : layoutPadding, (i13 & 256) != 0 ? new ContentAxisRelatedPadding.zero() : contentAxisRelatedPadding, (i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? new ContentAxisRelatedPadding.zero() : contentAxisRelatedPadding2);
    }
}
