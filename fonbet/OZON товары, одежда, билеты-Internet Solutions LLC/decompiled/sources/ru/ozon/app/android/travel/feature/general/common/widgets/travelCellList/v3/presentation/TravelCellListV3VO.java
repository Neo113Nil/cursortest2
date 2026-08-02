package ru.ozon.app.android.travel.feature.general.common.widgets.travelCellList.v3.presentation;

import B0.C2454a;
import B4.V;
import Ek.a;
import N3.C3660k;
import Pk0.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001$B)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/travelCellList/v3/presentation/TravelCellListV3VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/AtomDTO;", "atom", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelCellList/v3/presentation/TravelCellListV3VO$LayoutModel;", "layoutModel", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "onboardingApp", "<init>", "(JLru/ozon/uni/atoms/data/AtomDTO;Lru/ozon/app/android/travel/feature/general/common/widgets/travelCellList/v3/presentation/TravelCellListV3VO$LayoutModel;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/AtomDTO;", "getAtom", "()Lru/ozon/uni/atoms/data/AtomDTO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelCellList/v3/presentation/TravelCellListV3VO$LayoutModel;", "getLayoutModel", "()Lru/ozon/app/android/travel/feature/general/common/widgets/travelCellList/v3/presentation/TravelCellListV3VO$LayoutModel;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "getOnboardingApp", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "LayoutModel", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TravelCellListV3VO implements c {
    public static final int $stable = AtomDTO.$stable;

    @NotNull
    private final AtomDTO atom;
    private final long id;

    @NotNull
    private final LayoutModel layoutModel;
    private final OnBoardingDTO onboardingApp;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001fB;\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0019\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u001a\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u001b\u0010\u0010R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/travelCellList/v3/presentation/TravelCellListV3VO$LayoutModel;", "", "", "backgroundColor", "", "leftMargin", "topMargin", "rightMargin", "bottomMargin", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelCellList/v3/presentation/TravelCellListV3VO$LayoutModel$Background;", "blockBackground", "<init>", "(Ljava/lang/String;IIIILru/ozon/app/android/travel/feature/general/common/widgets/travelCellList/v3/presentation/TravelCellListV3VO$LayoutModel$Background;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBackgroundColor", "I", "getLeftMargin", "getTopMargin", "getRightMargin", "getBottomMargin", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelCellList/v3/presentation/TravelCellListV3VO$LayoutModel$Background;", "getBlockBackground", "()Lru/ozon/app/android/travel/feature/general/common/widgets/travelCellList/v3/presentation/TravelCellListV3VO$LayoutModel$Background;", "Background", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LayoutModel {
        private final String backgroundColor;
        private final Background blockBackground;
        private final int bottomMargin;
        private final int leftMargin;
        private final int rightMargin;
        private final int topMargin;

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/travelCellList/v3/presentation/TravelCellListV3VO$LayoutModel$Background;", "", "", "backgroundColor", "", "topCornersRadius", "bottomCornersRadius", "<init>", "(Ljava/lang/String;FF)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBackgroundColor", "F", "getTopCornersRadius", "()F", "getBottomCornersRadius", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Background {

            @NotNull
            private final String backgroundColor;
            private final float bottomCornersRadius;
            private final float topCornersRadius;

            public Background(@NotNull String backgroundColor, float f7, float f11) {
                Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
                this.backgroundColor = backgroundColor;
                this.topCornersRadius = f7;
                this.bottomCornersRadius = f11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Background)) {
                    return false;
                }
                Background background = (Background) other;
                return Intrinsics.d(this.backgroundColor, background.backgroundColor) && Float.compare(this.topCornersRadius, background.topCornersRadius) == 0 && Float.compare(this.bottomCornersRadius, background.bottomCornersRadius) == 0;
            }

            @NotNull
            public final String getBackgroundColor() {
                return this.backgroundColor;
            }

            public final float getBottomCornersRadius() {
                return this.bottomCornersRadius;
            }

            public final float getTopCornersRadius() {
                return this.topCornersRadius;
            }

            public int hashCode() {
                return Float.hashCode(this.bottomCornersRadius) + b.a(this.topCornersRadius, this.backgroundColor.hashCode() * 31, 31);
            }

            @NotNull
            public String toString() {
                String str = this.backgroundColor;
                float f7 = this.topCornersRadius;
                float f11 = this.bottomCornersRadius;
                StringBuilder sb2 = new StringBuilder("Background(backgroundColor=");
                sb2.append(str);
                sb2.append(", topCornersRadius=");
                sb2.append(f7);
                sb2.append(", bottomCornersRadius=");
                return V.b(f11, ")", sb2);
            }
        }

        public LayoutModel(String str, int i11, int i12, int i13, int i14, Background background) {
            this.backgroundColor = str;
            this.leftMargin = i11;
            this.topMargin = i12;
            this.rightMargin = i13;
            this.bottomMargin = i14;
            this.blockBackground = background;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LayoutModel)) {
                return false;
            }
            LayoutModel layoutModel = (LayoutModel) other;
            return Intrinsics.d(this.backgroundColor, layoutModel.backgroundColor) && this.leftMargin == layoutModel.leftMargin && this.topMargin == layoutModel.topMargin && this.rightMargin == layoutModel.rightMargin && this.bottomMargin == layoutModel.bottomMargin && Intrinsics.d(this.blockBackground, layoutModel.blockBackground);
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final Background getBlockBackground() {
            return this.blockBackground;
        }

        public final int getBottomMargin() {
            return this.bottomMargin;
        }

        public final int getLeftMargin() {
            return this.leftMargin;
        }

        public final int getRightMargin() {
            return this.rightMargin;
        }

        public final int getTopMargin() {
            return this.topMargin;
        }

        public int hashCode() {
            String str = this.backgroundColor;
            int a11 = C2454a.a(this.bottomMargin, C2454a.a(this.rightMargin, C2454a.a(this.topMargin, C2454a.a(this.leftMargin, (str == null ? 0 : str.hashCode()) * 31, 31), 31), 31), 31);
            Background background = this.blockBackground;
            return a11 + (background != null ? background.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.backgroundColor;
            int i11 = this.leftMargin;
            int i12 = this.topMargin;
            int i13 = this.rightMargin;
            int i14 = this.bottomMargin;
            Background background = this.blockBackground;
            StringBuilder c11 = C3660k.c(i11, "LayoutModel(backgroundColor=", str, ", leftMargin=", ", topMargin=");
            a.f(i12, i13, ", rightMargin=", ", bottomMargin=", c11);
            c11.append(i14);
            c11.append(", blockBackground=");
            c11.append(background);
            c11.append(")");
            return c11.toString();
        }
    }

    public TravelCellListV3VO(long j11, @NotNull AtomDTO atom, @NotNull LayoutModel layoutModel, OnBoardingDTO onBoardingDTO) {
        Intrinsics.checkNotNullParameter(atom, "atom");
        Intrinsics.checkNotNullParameter(layoutModel, "layoutModel");
        this.id = j11;
        this.atom = atom;
        this.layoutModel = layoutModel;
        this.onboardingApp = onBoardingDTO;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelCellListV3VO)) {
            return false;
        }
        TravelCellListV3VO travelCellListV3VO = (TravelCellListV3VO) other;
        return this.id == travelCellListV3VO.id && Intrinsics.d(this.atom, travelCellListV3VO.atom) && Intrinsics.d(this.layoutModel, travelCellListV3VO.layoutModel) && Intrinsics.d(this.onboardingApp, travelCellListV3VO.onboardingApp);
    }

    @NotNull
    public final AtomDTO getAtom() {
        return this.atom;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final LayoutModel getLayoutModel() {
        return this.layoutModel;
    }

    public final OnBoardingDTO getOnboardingApp() {
        return this.onboardingApp;
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
        int hashCode = (this.layoutModel.hashCode() + ((this.atom.hashCode() + (Long.hashCode(this.id) * 31)) * 31)) * 31;
        OnBoardingDTO onBoardingDTO = this.onboardingApp;
        return hashCode + (onBoardingDTO == null ? 0 : onBoardingDTO.hashCode());
    }

    @NotNull
    public String toString() {
        return "TravelCellListV3VO(id=" + this.id + ", atom=" + this.atom + ", layoutModel=" + this.layoutModel + ", onboardingApp=" + this.onboardingApp + ")";
    }
}
