package ru.ozon.app.android.travel.feature.avia.widgets.addToFavoritesButton.presentation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.favorites.domain.model.FavoriteProductModel;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001$B-\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/addToFavoritesButton/presentation/AddToFavoritesButtonVI;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/travel/feature/avia/widgets/addToFavoritesButton/presentation/AddToFavoritesButtonVI$ButtonType;", "button", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "onboarding", "Lru/ozon/uni/atoms/af/AtomAction;", "modalAction", "<init>", "(JLru/ozon/app/android/travel/feature/avia/widgets/addToFavoritesButton/presentation/AddToFavoritesButtonVI$ButtonType;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;Lru/ozon/uni/atoms/af/AtomAction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/travel/feature/avia/widgets/addToFavoritesButton/presentation/AddToFavoritesButtonVI$ButtonType;", "getButton", "()Lru/ozon/app/android/travel/feature/avia/widgets/addToFavoritesButton/presentation/AddToFavoritesButtonVI$ButtonType;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "getOnboarding", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getModalAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "ButtonType", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AddToFavoritesButtonVI implements c {
    public static final int $stable = AtomAction.$stable;
    private final ButtonType button;
    private final long id;
    private final AtomAction modalAction;
    private final OnBoardingDTO onboarding;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/addToFavoritesButton/presentation/AddToFavoritesButtonVI$ButtonType;", "", "FavoriteButton", "IconButton", "Lru/ozon/app/android/travel/feature/avia/widgets/addToFavoritesButton/presentation/AddToFavoritesButtonVI$ButtonType$FavoriteButton;", "Lru/ozon/app/android/travel/feature/avia/widgets/addToFavoritesButton/presentation/AddToFavoritesButtonVI$ButtonType$IconButton;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface ButtonType {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/addToFavoritesButton/presentation/AddToFavoritesButtonVI$ButtonType$FavoriteButton;", "Lru/ozon/app/android/travel/feature/avia/widgets/addToFavoritesButton/presentation/AddToFavoritesButtonVI$ButtonType;", "Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;", "favoriteButton", "<init>", "(Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;", "getFavoriteButton", "()Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class FavoriteButton implements ButtonType {

            @NotNull
            private final FavoriteProductModel favoriteButton;

            public FavoriteButton(@NotNull FavoriteProductModel favoriteButton) {
                Intrinsics.checkNotNullParameter(favoriteButton, "favoriteButton");
                this.favoriteButton = favoriteButton;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof FavoriteButton) && Intrinsics.d(this.favoriteButton, ((FavoriteButton) other).favoriteButton);
            }

            @NotNull
            public final FavoriteProductModel getFavoriteButton() {
                return this.favoriteButton;
            }

            public int hashCode() {
                return this.favoriteButton.hashCode();
            }

            @NotNull
            public String toString() {
                return "FavoriteButton(favoriteButton=" + this.favoriteButton + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/addToFavoritesButton/presentation/AddToFavoritesButtonVI$ButtonType$IconButton;", "Lru/ozon/app/android/travel/feature/avia/widgets/addToFavoritesButton/presentation/AddToFavoritesButtonVI$ButtonType;", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "iconButton", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getIconButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class IconButton implements ButtonType {
            public static final int $stable = IconButtonV3DTO.$stable;

            @NotNull
            private final IconButtonV3DTO iconButton;

            public IconButton(@NotNull IconButtonV3DTO iconButton) {
                Intrinsics.checkNotNullParameter(iconButton, "iconButton");
                this.iconButton = iconButton;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof IconButton) && Intrinsics.d(this.iconButton, ((IconButton) other).iconButton);
            }

            @NotNull
            public final IconButtonV3DTO getIconButton() {
                return this.iconButton;
            }

            public int hashCode() {
                return this.iconButton.hashCode();
            }

            @NotNull
            public String toString() {
                return "IconButton(iconButton=" + this.iconButton + ")";
            }
        }
    }

    public AddToFavoritesButtonVI(long j11, ButtonType buttonType, OnBoardingDTO onBoardingDTO, AtomAction atomAction) {
        this.id = j11;
        this.button = buttonType;
        this.onboarding = onBoardingDTO;
        this.modalAction = atomAction;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddToFavoritesButtonVI)) {
            return false;
        }
        AddToFavoritesButtonVI addToFavoritesButtonVI = (AddToFavoritesButtonVI) other;
        return this.id == addToFavoritesButtonVI.id && Intrinsics.d(this.button, addToFavoritesButtonVI.button) && Intrinsics.d(this.onboarding, addToFavoritesButtonVI.onboarding) && Intrinsics.d(this.modalAction, addToFavoritesButtonVI.modalAction);
    }

    public final ButtonType getButton() {
        return this.button;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final AtomAction getModalAction() {
        return this.modalAction;
    }

    public final OnBoardingDTO getOnboarding() {
        return this.onboarding;
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
        int hashCode = Long.hashCode(this.id) * 31;
        ButtonType buttonType = this.button;
        int hashCode2 = (hashCode + (buttonType == null ? 0 : buttonType.hashCode())) * 31;
        OnBoardingDTO onBoardingDTO = this.onboarding;
        int hashCode3 = (hashCode2 + (onBoardingDTO == null ? 0 : onBoardingDTO.hashCode())) * 31;
        AtomAction atomAction = this.modalAction;
        return hashCode3 + (atomAction != null ? atomAction.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AddToFavoritesButtonVI(id=" + this.id + ", button=" + this.button + ", onboarding=" + this.onboarding + ", modalAction=" + this.modalAction + ")";
    }
}
