package ru.ozon.app.android.travel.feature.entry.pushOnboarding.data;

import G.g;
import Nh.a;
import Ns.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/ozon/app/android/travel/feature/entry/pushOnboarding/data/PushOnboardingPageData;", "", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "logoImageDTO", "imageDTO", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "closeButtonDTO", "Lru/ozon/uni/atoms/data/text/TextDTO;", "titleDTO", "", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cells", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "confirmButtonDTO", "<init>", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "getLogoImageDTO", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getImageDTO", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getCloseButtonDTO", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitleDTO", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Ljava/util/List;", "getCells", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getConfirmButtonDTO", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "entry_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PushOnboardingPageData {

    @NotNull
    private final List<CellDTO> cells;

    @NotNull
    private final IconButtonV3DTO closeButtonDTO;

    @NotNull
    private final ButtonV3DTO confirmButtonDTO;

    @NotNull
    private final ImageDTO imageDTO;

    @NotNull
    private final ImageDTO logoImageDTO;

    @NotNull
    private final TextDTO titleDTO;

    public PushOnboardingPageData(@NotNull ImageDTO logoImageDTO, @NotNull ImageDTO imageDTO, @NotNull IconButtonV3DTO closeButtonDTO, @NotNull TextDTO titleDTO, @NotNull List<CellDTO> cells, @NotNull ButtonV3DTO confirmButtonDTO) {
        Intrinsics.checkNotNullParameter(logoImageDTO, "logoImageDTO");
        Intrinsics.checkNotNullParameter(imageDTO, "imageDTO");
        Intrinsics.checkNotNullParameter(closeButtonDTO, "closeButtonDTO");
        Intrinsics.checkNotNullParameter(titleDTO, "titleDTO");
        Intrinsics.checkNotNullParameter(cells, "cells");
        Intrinsics.checkNotNullParameter(confirmButtonDTO, "confirmButtonDTO");
        this.logoImageDTO = logoImageDTO;
        this.imageDTO = imageDTO;
        this.closeButtonDTO = closeButtonDTO;
        this.titleDTO = titleDTO;
        this.cells = cells;
        this.confirmButtonDTO = confirmButtonDTO;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PushOnboardingPageData)) {
            return false;
        }
        PushOnboardingPageData pushOnboardingPageData = (PushOnboardingPageData) other;
        return Intrinsics.d(this.logoImageDTO, pushOnboardingPageData.logoImageDTO) && Intrinsics.d(this.imageDTO, pushOnboardingPageData.imageDTO) && Intrinsics.d(this.closeButtonDTO, pushOnboardingPageData.closeButtonDTO) && Intrinsics.d(this.titleDTO, pushOnboardingPageData.titleDTO) && Intrinsics.d(this.cells, pushOnboardingPageData.cells) && Intrinsics.d(this.confirmButtonDTO, pushOnboardingPageData.confirmButtonDTO);
    }

    @NotNull
    public final List<CellDTO> getCells() {
        return this.cells;
    }

    @NotNull
    public final IconButtonV3DTO getCloseButtonDTO() {
        return this.closeButtonDTO;
    }

    @NotNull
    public final ButtonV3DTO getConfirmButtonDTO() {
        return this.confirmButtonDTO;
    }

    @NotNull
    public final ImageDTO getImageDTO() {
        return this.imageDTO;
    }

    @NotNull
    public final ImageDTO getLogoImageDTO() {
        return this.logoImageDTO;
    }

    @NotNull
    public final TextDTO getTitleDTO() {
        return this.titleDTO;
    }

    public int hashCode() {
        return this.confirmButtonDTO.hashCode() + g.b(b.a(this.titleDTO, GR.b.c(this.closeButtonDTO, a.b(this.imageDTO, this.logoImageDTO.hashCode() * 31, 31), 31), 31), 31, this.cells);
    }

    @NotNull
    public String toString() {
        return "PushOnboardingPageData(logoImageDTO=" + this.logoImageDTO + ", imageDTO=" + this.imageDTO + ", closeButtonDTO=" + this.closeButtonDTO + ", titleDTO=" + this.titleDTO + ", cells=" + this.cells + ", confirmButtonDTO=" + this.confirmButtonDTO + ")";
    }
}
