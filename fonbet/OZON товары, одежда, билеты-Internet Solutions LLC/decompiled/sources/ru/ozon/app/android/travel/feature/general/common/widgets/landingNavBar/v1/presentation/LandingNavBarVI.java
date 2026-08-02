package ru.ozon.app.android.travel.feature.general.common.widgets.landingNavBar.v1.presentation;

import N3.C3660k;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.view.travelWidgetSettings.TravelWidgetSettingsVO;
import ru.ozon.uni.core.UniGradient;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0081\b\u0018\u00002\u00020\u0001:\u0001+BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b$\u0010#R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b&\u0010'R\u001f\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f8\u0006¢\u0006\f\n\u0004\b\r\u0010(\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/landingNavBar/v1/presentation/LandingNavBarVI;", "Ll20/c;", "", "id", "Lru/ozon/app/android/travel/feature/general/common/widgets/landingNavBar/v1/presentation/LandingNavBarVI$WidgetBackground;", "background", "Lru/ozon/app/android/travel/molecules/view/travelWidgetSettings/TravelWidgetSettingsVO;", "topHeaderSettings", "bottomIslandSettings", "", "bottomRadius", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JLru/ozon/app/android/travel/feature/general/common/widgets/landingNavBar/v1/presentation/LandingNavBarVI$WidgetBackground;Lru/ozon/app/android/travel/molecules/view/travelWidgetSettings/TravelWidgetSettingsVO;Lru/ozon/app/android/travel/molecules/view/travelWidgetSettings/TravelWidgetSettingsVO;Ljava/lang/Float;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/travel/feature/general/common/widgets/landingNavBar/v1/presentation/LandingNavBarVI$WidgetBackground;", "getBackground", "()Lru/ozon/app/android/travel/feature/general/common/widgets/landingNavBar/v1/presentation/LandingNavBarVI$WidgetBackground;", "Lru/ozon/app/android/travel/molecules/view/travelWidgetSettings/TravelWidgetSettingsVO;", "getTopHeaderSettings", "()Lru/ozon/app/android/travel/molecules/view/travelWidgetSettings/TravelWidgetSettingsVO;", "getBottomIslandSettings", "Ljava/lang/Float;", "getBottomRadius", "()Ljava/lang/Float;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "WidgetBackground", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class LandingNavBarVI implements c {

    @NotNull
    private final WidgetBackground background;
    private final TravelWidgetSettingsVO bottomIslandSettings;
    private final Float bottomRadius;
    private final long id;
    private final t tokenizedEvent;
    private final TravelWidgetSettingsVO topHeaderSettings;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0014\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/landingNavBar/v1/presentation/LandingNavBarVI$WidgetBackground;", "", "", "image", "color", "Lru/ozon/uni/core/UniGradient;", "gradient", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/core/UniGradient;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getImage", "getColor", "Lru/ozon/uni/core/UniGradient;", "getGradient", "()Lru/ozon/uni/core/UniGradient;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class WidgetBackground {
        public static final int $stable = UniGradient.$stable;
        private final String color;
        private final UniGradient gradient;
        private final String image;

        public WidgetBackground(String str, String str2, UniGradient uniGradient) {
            this.image = str;
            this.color = str2;
            this.gradient = uniGradient;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WidgetBackground)) {
                return false;
            }
            WidgetBackground widgetBackground = (WidgetBackground) other;
            return Intrinsics.d(this.image, widgetBackground.image) && Intrinsics.d(this.color, widgetBackground.color) && Intrinsics.d(this.gradient, widgetBackground.gradient);
        }

        public final String getColor() {
            return this.color;
        }

        public final UniGradient getGradient() {
            return this.gradient;
        }

        public final String getImage() {
            return this.image;
        }

        public int hashCode() {
            String str = this.image;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.color;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            UniGradient uniGradient = this.gradient;
            return hashCode2 + (uniGradient != null ? uniGradient.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.image;
            String str2 = this.color;
            UniGradient uniGradient = this.gradient;
            StringBuilder d11 = C3660k.d("WidgetBackground(image=", str, ", color=", str2, ", gradient=");
            d11.append(uniGradient);
            d11.append(")");
            return d11.toString();
        }
    }

    public LandingNavBarVI(long j11, @NotNull WidgetBackground background, TravelWidgetSettingsVO travelWidgetSettingsVO, TravelWidgetSettingsVO travelWidgetSettingsVO2, Float f7, t tVar) {
        Intrinsics.checkNotNullParameter(background, "background");
        this.id = j11;
        this.background = background;
        this.topHeaderSettings = travelWidgetSettingsVO;
        this.bottomIslandSettings = travelWidgetSettingsVO2;
        this.bottomRadius = f7;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LandingNavBarVI)) {
            return false;
        }
        LandingNavBarVI landingNavBarVI = (LandingNavBarVI) other;
        return this.id == landingNavBarVI.id && Intrinsics.d(this.background, landingNavBarVI.background) && Intrinsics.d(this.topHeaderSettings, landingNavBarVI.topHeaderSettings) && Intrinsics.d(this.bottomIslandSettings, landingNavBarVI.bottomIslandSettings) && Intrinsics.d(this.bottomRadius, landingNavBarVI.bottomRadius) && Intrinsics.d(this.tokenizedEvent, landingNavBarVI.tokenizedEvent);
    }

    @NotNull
    public final WidgetBackground getBackground() {
        return this.background;
    }

    public final TravelWidgetSettingsVO getBottomIslandSettings() {
        return this.bottomIslandSettings;
    }

    public final Float getBottomRadius() {
        return this.bottomRadius;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final TravelWidgetSettingsVO getTopHeaderSettings() {
        return this.topHeaderSettings;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.background.hashCode() + (Long.hashCode(this.id) * 31)) * 31;
        TravelWidgetSettingsVO travelWidgetSettingsVO = this.topHeaderSettings;
        int hashCode2 = (hashCode + (travelWidgetSettingsVO == null ? 0 : travelWidgetSettingsVO.hashCode())) * 31;
        TravelWidgetSettingsVO travelWidgetSettingsVO2 = this.bottomIslandSettings;
        int hashCode3 = (hashCode2 + (travelWidgetSettingsVO2 == null ? 0 : travelWidgetSettingsVO2.hashCode())) * 31;
        Float f7 = this.bottomRadius;
        int hashCode4 = (hashCode3 + (f7 == null ? 0 : f7.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode4 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "LandingNavBarVI(id=" + this.id + ", background=" + this.background + ", topHeaderSettings=" + this.topHeaderSettings + ", bottomIslandSettings=" + this.bottomIslandSettings + ", bottomRadius=" + this.bottomRadius + ", tokenizedEvent=" + this.tokenizedEvent + ")";
    }
}
