package ru.ozon.app.android.travel.feature.avia.widgets.addToFavoritesButton.data;

import Ak.b;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMoleculeV4;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000f\u001a\u00020\u0001HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003J+\u0010\u0012\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/addToFavoritesButton/data/AddToFavoritesButtonDTO;", "", "button", "onboarding", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "modalAction", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "<init>", "(Ljava/lang/Object;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "getButton", "()Ljava/lang/Object;", "getOnboarding", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "getModalAction", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AddToFavoritesButtonDTO {
    public static final int $stable = 8;

    @NotNull
    private final Object button;
    private final CommonControlSettings modalAction;
    private final OnBoardingDTO onboarding;

    public AddToFavoritesButtonDTO(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "favoriteButton", type = FavoriteProductMoleculeV4.class), @ProtoOneOfSignature(name = "iconButton", type = IconButtonV3DTO.class)}) @NotNull @ProtoOneOf(label = "type") Object button, OnBoardingDTO onBoardingDTO, CommonControlSettings commonControlSettings) {
        Intrinsics.checkNotNullParameter(button, "button");
        this.button = button;
        this.onboarding = onBoardingDTO;
        this.modalAction = commonControlSettings;
    }

    public static /* synthetic */ AddToFavoritesButtonDTO copy$default(AddToFavoritesButtonDTO addToFavoritesButtonDTO, Object obj, OnBoardingDTO onBoardingDTO, CommonControlSettings commonControlSettings, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            obj = addToFavoritesButtonDTO.button;
        }
        if ((i11 & 2) != 0) {
            onBoardingDTO = addToFavoritesButtonDTO.onboarding;
        }
        if ((i11 & 4) != 0) {
            commonControlSettings = addToFavoritesButtonDTO.modalAction;
        }
        return addToFavoritesButtonDTO.copy(obj, onBoardingDTO, commonControlSettings);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Object getButton() {
        return this.button;
    }

    /* renamed from: component2, reason: from getter */
    public final OnBoardingDTO getOnboarding() {
        return this.onboarding;
    }

    /* renamed from: component3, reason: from getter */
    public final CommonControlSettings getModalAction() {
        return this.modalAction;
    }

    @NotNull
    public final AddToFavoritesButtonDTO copy(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "favoriteButton", type = FavoriteProductMoleculeV4.class), @ProtoOneOfSignature(name = "iconButton", type = IconButtonV3DTO.class)}) @NotNull @ProtoOneOf(label = "type") Object button, OnBoardingDTO onboarding, CommonControlSettings modalAction) {
        Intrinsics.checkNotNullParameter(button, "button");
        return new AddToFavoritesButtonDTO(button, onboarding, modalAction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddToFavoritesButtonDTO)) {
            return false;
        }
        AddToFavoritesButtonDTO addToFavoritesButtonDTO = (AddToFavoritesButtonDTO) other;
        return Intrinsics.d(this.button, addToFavoritesButtonDTO.button) && Intrinsics.d(this.onboarding, addToFavoritesButtonDTO.onboarding) && Intrinsics.d(this.modalAction, addToFavoritesButtonDTO.modalAction);
    }

    @NotNull
    public final Object getButton() {
        return this.button;
    }

    public final CommonControlSettings getModalAction() {
        return this.modalAction;
    }

    public final OnBoardingDTO getOnboarding() {
        return this.onboarding;
    }

    public int hashCode() {
        int hashCode = this.button.hashCode() * 31;
        OnBoardingDTO onBoardingDTO = this.onboarding;
        int hashCode2 = (hashCode + (onBoardingDTO == null ? 0 : onBoardingDTO.hashCode())) * 31;
        CommonControlSettings commonControlSettings = this.modalAction;
        return hashCode2 + (commonControlSettings != null ? commonControlSettings.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Object obj = this.button;
        OnBoardingDTO onBoardingDTO = this.onboarding;
        CommonControlSettings commonControlSettings = this.modalAction;
        StringBuilder sb2 = new StringBuilder("AddToFavoritesButtonDTO(button=");
        sb2.append(obj);
        sb2.append(", onboarding=");
        sb2.append(onBoardingDTO);
        sb2.append(", modalAction=");
        return b.g(sb2, commonControlSettings, ")");
    }
}
