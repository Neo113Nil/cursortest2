package ru.ozon.app.android.travel.feature.general.main.widgets.miniAppTitle.presentation;

import El.C2971a;
import Gl.C3124a;
import Ns.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001,BA\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b(\u0010'R\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010)\u001a\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/miniAppTitle/presentation/MiniAppTitleVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icon", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "milesBadge", "topTravelBadge", "", "Lru/ozon/app/android/travel/feature/general/main/widgets/miniAppTitle/presentation/MiniAppTitleVO$OnbordingItem;", "onboardings", "<init>", "(JLru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getMilesBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getTopTravelBadge", "Ljava/util/List;", "getOnboardings", "()Ljava/util/List;", "OnbordingItem", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class MiniAppTitleVO implements c {

    @NotNull
    private final IconDTO icon;
    private final long id;

    @NotNull
    private final BadgeDTO milesBadge;
    private final List<OnbordingItem> onboardings;

    @NotNull
    private final TextDTO title;
    private final BadgeDTO topTravelBadge;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/miniAppTitle/presentation/MiniAppTitleVO$OnbordingItem;", "", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "onboarding", "Lru/ozon/app/android/travel/feature/general/main/widgets/miniAppTitle/presentation/OnboardingType;", "onboardingType", "<init>", "(Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;Lru/ozon/app/android/travel/feature/general/main/widgets/miniAppTitle/presentation/OnboardingType;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "getOnboarding", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "Lru/ozon/app/android/travel/feature/general/main/widgets/miniAppTitle/presentation/OnboardingType;", "getOnboardingType", "()Lru/ozon/app/android/travel/feature/general/main/widgets/miniAppTitle/presentation/OnboardingType;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnbordingItem {

        @NotNull
        private final OnBoardingDTO onboarding;

        @NotNull
        private final OnboardingType onboardingType;

        public OnbordingItem(@NotNull OnBoardingDTO onboarding, @NotNull OnboardingType onboardingType) {
            Intrinsics.checkNotNullParameter(onboarding, "onboarding");
            Intrinsics.checkNotNullParameter(onboardingType, "onboardingType");
            this.onboarding = onboarding;
            this.onboardingType = onboardingType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnbordingItem)) {
                return false;
            }
            OnbordingItem onbordingItem = (OnbordingItem) other;
            return Intrinsics.d(this.onboarding, onbordingItem.onboarding) && Intrinsics.d(this.onboardingType, onbordingItem.onboardingType);
        }

        @NotNull
        public final OnBoardingDTO getOnboarding() {
            return this.onboarding;
        }

        @NotNull
        public final OnboardingType getOnboardingType() {
            return this.onboardingType;
        }

        public int hashCode() {
            return this.onboardingType.hashCode() + (this.onboarding.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "OnbordingItem(onboarding=" + this.onboarding + ", onboardingType=" + this.onboardingType + ")";
        }
    }

    public MiniAppTitleVO(long j11, @NotNull IconDTO icon, @NotNull TextDTO title, @NotNull BadgeDTO milesBadge, BadgeDTO badgeDTO, List<OnbordingItem> list) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(milesBadge, "milesBadge");
        this.id = j11;
        this.icon = icon;
        this.title = title;
        this.milesBadge = milesBadge;
        this.topTravelBadge = badgeDTO;
        this.onboardings = list;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MiniAppTitleVO)) {
            return false;
        }
        MiniAppTitleVO miniAppTitleVO = (MiniAppTitleVO) other;
        return this.id == miniAppTitleVO.id && Intrinsics.d(this.icon, miniAppTitleVO.icon) && Intrinsics.d(this.title, miniAppTitleVO.title) && Intrinsics.d(this.milesBadge, miniAppTitleVO.milesBadge) && Intrinsics.d(this.topTravelBadge, miniAppTitleVO.topTravelBadge) && Intrinsics.d(this.onboardings, miniAppTitleVO.onboardings);
    }

    @NotNull
    public final IconDTO getIcon() {
        return this.icon;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final BadgeDTO getMilesBadge() {
        return this.milesBadge;
    }

    public final List<OnbordingItem> getOnboardings() {
        return this.onboardings;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final BadgeDTO getTopTravelBadge() {
        return this.topTravelBadge;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int c11 = C3124a.c(this.milesBadge, b.a(this.title, C2971a.a(this.icon, Long.hashCode(this.id) * 31, 31), 31), 31);
        BadgeDTO badgeDTO = this.topTravelBadge;
        int hashCode = (c11 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
        List<OnbordingItem> list = this.onboardings;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        IconDTO iconDTO = this.icon;
        TextDTO textDTO = this.title;
        BadgeDTO badgeDTO = this.milesBadge;
        BadgeDTO badgeDTO2 = this.topTravelBadge;
        List<OnbordingItem> list = this.onboardings;
        StringBuilder b11 = D40.c.b("MiniAppTitleVO(id=", j11, ", icon=", iconDTO);
        b11.append(", title=");
        b11.append(textDTO);
        b11.append(", milesBadge=");
        b11.append(badgeDTO);
        b11.append(", topTravelBadge=");
        b11.append(badgeDTO2);
        b11.append(", onboardings=");
        b11.append(list);
        b11.append(")");
        return b11.toString();
    }
}
