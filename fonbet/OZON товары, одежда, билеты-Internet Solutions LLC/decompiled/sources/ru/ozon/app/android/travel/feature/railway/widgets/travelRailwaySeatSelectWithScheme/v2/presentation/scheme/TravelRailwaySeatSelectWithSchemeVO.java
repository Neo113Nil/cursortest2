package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.scheme;

import B4.V;
import B90.C2616s;
import Cm.e;
import De.C2860c;
import G.g;
import Kk.C3532b;
import N3.C3660k;
import Nh.a;
import Pk0.b;
import WZ.t;
import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.data.mapper.ParseTextStyleHelper;
import ru.ozon.app.android.travel.molecules.extensions.TextBlockParams;
import ru.ozon.app.android.travel.molecules.extensions.TextParams;
import ru.ozon.app.android.travel.molecules.extensions.TextRowsParams;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.tabs.Tabs;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\f\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0007MNOPQRSB«\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\t\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\t\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0007\u0012\u000e\u0010\u001c\u001a\n\u0018\u00010\u001aj\u0004\u0018\u0001`\u001b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 JÈ\u0001\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\t2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\t2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00072\u0010\b\u0002\u0010\u001c\u001a\n\u0018\u00010\u001aj\u0004\u0018\u0001`\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020\u00072\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b\b\u00102R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u00103\u001a\u0004\b4\u00105R\u001f\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\r\u00103\u001a\u0004\b6\u00105R\u001f\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000f\u00103\u001a\u0004\b7\u00105R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\t8\u0006¢\u0006\f\n\u0004\b\u0011\u00103\u001a\u0004\b8\u00105R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u00109\u001a\u0004\b:\u0010$R\u0017\u0010\u0014\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0014\u00109\u001a\u0004\b;\u0010$R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010<\u001a\u0004\b=\u0010>R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010\u0019\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u00101\u001a\u0004\b\u0019\u00102R\u001f\u0010\u001c\u001a\n\u0018\u00010\u001aj\u0004\u0018\u0001`\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010B\u001a\u0004\bC\u0010DR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010E\u001a\u0004\bF\u0010GR\u0017\u0010I\u001a\u00020H8\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L¨\u0006T"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/scheme/TravelRailwaySeatSelectWithSchemeVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/tabs/Tabs;", "tabSelector", "", "isTabSelectorVisible", "", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/scheme/TravelRailwaySeatSelectWithSchemeVO$SeatVO;", "seats", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/scheme/TravelRailwaySeatSelectWithSchemeVO$TextRectangleVO;", "compartmentGenders", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/scheme/TravelRailwaySeatSelectWithSchemeVO$GenderIndicatorVO;", "genderIndicator", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/scheme/TravelRailwaySeatSelectWithSchemeVO$SeatTypeVO;", "seatTypes", "", "darkSchemeLink", "lightSchemeLink", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "schemeScrollDescription", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/scheme/TravelRailwaySeatSelectWithSchemeVO$TrainDirectionVO;", "trainDirection", "isBorderVisible", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "viewEvent", "", "scrollXPosition", "<init>", "(JLru/ozon/uni/atoms/data/tabs/Tabs;ZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/scheme/TravelRailwaySeatSelectWithSchemeVO$TrainDirectionVO;ZLWZ/t;Ljava/lang/Integer;)V", "copy", "(JLru/ozon/uni/atoms/data/tabs/Tabs;ZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/scheme/TravelRailwaySeatSelectWithSchemeVO$TrainDirectionVO;ZLWZ/t;Ljava/lang/Integer;)Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/scheme/TravelRailwaySeatSelectWithSchemeVO;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/tabs/Tabs;", "getTabSelector", "()Lru/ozon/uni/atoms/data/tabs/Tabs;", "Z", "()Z", "Ljava/util/List;", "getSeats", "()Ljava/util/List;", "getCompartmentGenders", "getGenderIndicator", "getSeatTypes", "Ljava/lang/String;", "getDarkSchemeLink", "getLightSchemeLink", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSchemeScrollDescription", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/scheme/TravelRailwaySeatSelectWithSchemeVO$TrainDirectionVO;", "getTrainDirection", "()Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/scheme/TravelRailwaySeatSelectWithSchemeVO$TrainDirectionVO;", "LWZ/t;", "getViewEvent", "()LWZ/t;", "Ljava/lang/Integer;", "getScrollXPosition", "()Ljava/lang/Integer;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/scheme/TravelRailwaySeatSelectWithSchemeVO$SchemeVO;", "schemeVO", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/scheme/TravelRailwaySeatSelectWithSchemeVO$SchemeVO;", "getSchemeVO", "()Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/scheme/TravelRailwaySeatSelectWithSchemeVO$SchemeVO;", "SeatVO", "TooltipVO", "TrainDirectionVO", "SeatTypeVO", "SchemeVO", "TextRectangleVO", "GenderIndicatorVO", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TravelRailwaySeatSelectWithSchemeVO implements c {
    private final List<TextRectangleVO> compartmentGenders;

    @NotNull
    private final String darkSchemeLink;
    private final List<GenderIndicatorVO> genderIndicator;
    private final long id;
    private final boolean isBorderVisible;
    private final boolean isTabSelectorVisible;

    @NotNull
    private final String lightSchemeLink;
    private final TextAtom schemeScrollDescription;

    @NotNull
    private final SchemeVO schemeVO;
    private final Integer scrollXPosition;

    @NotNull
    private final List<SeatTypeVO> seatTypes;

    @NotNull
    private final List<SeatVO> seats;
    private final Tabs tabSelector;
    private final TrainDirectionVO trainDirection;
    private final t viewEvent;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/scheme/TravelRailwaySeatSelectWithSchemeVO$GenderIndicatorVO;", "", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icon", "", "x", "y", "<init>", "(Lru/ozon/uni/atoms/data/icon/IconDTO;FF)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "F", "getX", "()F", "getY", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class GenderIndicatorVO {
        public static final int $stable = IconDTO.$stable;

        @NotNull
        private final IconDTO icon;
        private final float x;
        private final float y;

        public GenderIndicatorVO(@NotNull IconDTO icon, float f7, float f11) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            this.icon = icon;
            this.x = f7;
            this.y = f11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GenderIndicatorVO)) {
                return false;
            }
            GenderIndicatorVO genderIndicatorVO = (GenderIndicatorVO) other;
            return Intrinsics.d(this.icon, genderIndicatorVO.icon) && Float.compare(this.x, genderIndicatorVO.x) == 0 && Float.compare(this.y, genderIndicatorVO.y) == 0;
        }

        @NotNull
        public final IconDTO getIcon() {
            return this.icon;
        }

        public final float getX() {
            return this.x;
        }

        public final float getY() {
            return this.y;
        }

        public int hashCode() {
            return Float.hashCode(this.y) + b.a(this.x, this.icon.hashCode() * 31, 31);
        }

        @NotNull
        public String toString() {
            IconDTO iconDTO = this.icon;
            float f7 = this.x;
            float f11 = this.y;
            StringBuilder sb2 = new StringBuilder("GenderIndicatorVO(icon=");
            sb2.append(iconDTO);
            sb2.append(", x=");
            sb2.append(f7);
            sb2.append(", y=");
            return V.b(f11, ")", sb2);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\u0011R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010 \u001a\u0004\b\r\u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/scheme/TravelRailwaySeatSelectWithSchemeVO$SchemeVO;", "", "", "darkSchemeLink", "lightSchemeLink", "", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/scheme/SeatItemVO;", "seats", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/scheme/TravelRailwaySeatSelectWithSchemeVO$TextRectangleVO;", "compartmentGenders", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/scheme/TravelRailwaySeatSelectWithSchemeVO$GenderIndicatorVO;", "genderIndicator", "", "isBorderVisible", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDarkSchemeLink", "getLightSchemeLink", "Ljava/util/List;", "getSeats", "()Ljava/util/List;", "getCompartmentGenders", "getGenderIndicator", "Z", "()Z", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SchemeVO {
        private final List<TextRectangleVO> compartmentGenders;

        @NotNull
        private final String darkSchemeLink;
        private final List<GenderIndicatorVO> genderIndicator;
        private final boolean isBorderVisible;

        @NotNull
        private final String lightSchemeLink;

        @NotNull
        private final List<SeatItemVO> seats;

        public SchemeVO(@NotNull String darkSchemeLink, @NotNull String lightSchemeLink, @NotNull List<SeatItemVO> seats, List<TextRectangleVO> list, List<GenderIndicatorVO> list2, boolean z11) {
            Intrinsics.checkNotNullParameter(darkSchemeLink, "darkSchemeLink");
            Intrinsics.checkNotNullParameter(lightSchemeLink, "lightSchemeLink");
            Intrinsics.checkNotNullParameter(seats, "seats");
            this.darkSchemeLink = darkSchemeLink;
            this.lightSchemeLink = lightSchemeLink;
            this.seats = seats;
            this.compartmentGenders = list;
            this.genderIndicator = list2;
            this.isBorderVisible = z11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SchemeVO)) {
                return false;
            }
            SchemeVO schemeVO = (SchemeVO) other;
            return Intrinsics.d(this.darkSchemeLink, schemeVO.darkSchemeLink) && Intrinsics.d(this.lightSchemeLink, schemeVO.lightSchemeLink) && Intrinsics.d(this.seats, schemeVO.seats) && Intrinsics.d(this.compartmentGenders, schemeVO.compartmentGenders) && Intrinsics.d(this.genderIndicator, schemeVO.genderIndicator) && this.isBorderVisible == schemeVO.isBorderVisible;
        }

        public final List<TextRectangleVO> getCompartmentGenders() {
            return this.compartmentGenders;
        }

        @NotNull
        public final String getDarkSchemeLink() {
            return this.darkSchemeLink;
        }

        public final List<GenderIndicatorVO> getGenderIndicator() {
            return this.genderIndicator;
        }

        @NotNull
        public final String getLightSchemeLink() {
            return this.lightSchemeLink;
        }

        @NotNull
        public final List<SeatItemVO> getSeats() {
            return this.seats;
        }

        public int hashCode() {
            int b11 = g.b(g.a(this.darkSchemeLink.hashCode() * 31, 31, this.lightSchemeLink), 31, this.seats);
            List<TextRectangleVO> list = this.compartmentGenders;
            int hashCode = (b11 + (list == null ? 0 : list.hashCode())) * 31;
            List<GenderIndicatorVO> list2 = this.genderIndicator;
            return Boolean.hashCode(this.isBorderVisible) + ((hashCode + (list2 != null ? list2.hashCode() : 0)) * 31);
        }

        /* renamed from: isBorderVisible, reason: from getter */
        public final boolean getIsBorderVisible() {
            return this.isBorderVisible;
        }

        @NotNull
        public String toString() {
            String str = this.darkSchemeLink;
            String str2 = this.lightSchemeLink;
            List<SeatItemVO> list = this.seats;
            List<TextRectangleVO> list2 = this.compartmentGenders;
            List<GenderIndicatorVO> list3 = this.genderIndicator;
            boolean z11 = this.isBorderVisible;
            StringBuilder d11 = C3660k.d("SchemeVO(darkSchemeLink=", str, ", lightSchemeLink=", str2, ", seats=");
            C2616s.g(", compartmentGenders=", ", genderIndicator=", d11, list, list2);
            d11.append(list3);
            d11.append(", isBorderVisible=");
            d11.append(z11);
            d11.append(")");
            return d11.toString();
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\b\u0087\b\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u00102\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b\"\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b#\u0010\u0018R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00100\u001a\u0004\b\u0011\u00101R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u0014\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0014\u00100\u001a\u0004\b\u0014\u00101¨\u00065"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/scheme/TravelRailwaySeatSelectWithSchemeVO$SeatVO;", "", "", "id", "", "seatTypeName", "number", "numberColor", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/mapper/ParseTextStyleHelper$ParsedTextStyle;", "numberTextStyle", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icon", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/scheme/TravelRailwaySeatSelectWithSchemeVO$TooltipVO;", "tooltip", "Landroid/graphics/Point;", "position", "", "isTopLayer", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "isSelected", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/mapper/ParseTextStyleHelper$ParsedTextStyle;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/scheme/TravelRailwaySeatSelectWithSchemeVO$TooltipVO;Landroid/graphics/Point;ZLru/ozon/uni/atoms/af/AtomAction;Z)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Ljava/lang/String;", "getSeatTypeName", "getNumber", "getNumberColor", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/mapper/ParseTextStyleHelper$ParsedTextStyle;", "getNumberTextStyle", "()Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/mapper/ParseTextStyleHelper$ParsedTextStyle;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/scheme/TravelRailwaySeatSelectWithSchemeVO$TooltipVO;", "getTooltip", "()Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/scheme/TravelRailwaySeatSelectWithSchemeVO$TooltipVO;", "Landroid/graphics/Point;", "getPosition", "()Landroid/graphics/Point;", "Z", "()Z", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SeatVO {
        private final AtomAction action;
        private final IconDTO icon;
        private final int id;
        private final boolean isSelected;
        private final boolean isTopLayer;
        private final String number;
        private final String numberColor;
        private final ParseTextStyleHelper.ParsedTextStyle numberTextStyle;
        private final Point position;

        @NotNull
        private final String seatTypeName;
        private final TooltipVO tooltip;

        public SeatVO(int i11, @NotNull String seatTypeName, String str, String str2, ParseTextStyleHelper.ParsedTextStyle parsedTextStyle, IconDTO iconDTO, TooltipVO tooltipVO, Point point, boolean z11, AtomAction atomAction, boolean z12) {
            Intrinsics.checkNotNullParameter(seatTypeName, "seatTypeName");
            this.id = i11;
            this.seatTypeName = seatTypeName;
            this.number = str;
            this.numberColor = str2;
            this.numberTextStyle = parsedTextStyle;
            this.icon = iconDTO;
            this.tooltip = tooltipVO;
            this.position = point;
            this.isTopLayer = z11;
            this.action = atomAction;
            this.isSelected = z12;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SeatVO)) {
                return false;
            }
            SeatVO seatVO = (SeatVO) other;
            return this.id == seatVO.id && Intrinsics.d(this.seatTypeName, seatVO.seatTypeName) && Intrinsics.d(this.number, seatVO.number) && Intrinsics.d(this.numberColor, seatVO.numberColor) && Intrinsics.d(this.numberTextStyle, seatVO.numberTextStyle) && Intrinsics.d(this.icon, seatVO.icon) && Intrinsics.d(this.tooltip, seatVO.tooltip) && Intrinsics.d(this.position, seatVO.position) && this.isTopLayer == seatVO.isTopLayer && Intrinsics.d(this.action, seatVO.action) && this.isSelected == seatVO.isSelected;
        }

        public final AtomAction getAction() {
            return this.action;
        }

        public final IconDTO getIcon() {
            return this.icon;
        }

        public final int getId() {
            return this.id;
        }

        public final String getNumber() {
            return this.number;
        }

        public final String getNumberColor() {
            return this.numberColor;
        }

        public final ParseTextStyleHelper.ParsedTextStyle getNumberTextStyle() {
            return this.numberTextStyle;
        }

        public final Point getPosition() {
            return this.position;
        }

        @NotNull
        public final String getSeatTypeName() {
            return this.seatTypeName;
        }

        public final TooltipVO getTooltip() {
            return this.tooltip;
        }

        public int hashCode() {
            int a11 = g.a(Integer.hashCode(this.id) * 31, 31, this.seatTypeName);
            String str = this.number;
            int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.numberColor;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            ParseTextStyleHelper.ParsedTextStyle parsedTextStyle = this.numberTextStyle;
            int hashCode3 = (hashCode2 + (parsedTextStyle == null ? 0 : parsedTextStyle.hashCode())) * 31;
            IconDTO iconDTO = this.icon;
            int hashCode4 = (hashCode3 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
            TooltipVO tooltipVO = this.tooltip;
            int hashCode5 = (hashCode4 + (tooltipVO == null ? 0 : tooltipVO.hashCode())) * 31;
            Point point = this.position;
            int a12 = C3532b.a((hashCode5 + (point == null ? 0 : point.hashCode())) * 31, 31, this.isTopLayer);
            AtomAction atomAction = this.action;
            return Boolean.hashCode(this.isSelected) + ((a12 + (atomAction != null ? atomAction.hashCode() : 0)) * 31);
        }

        /* renamed from: isSelected, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        /* renamed from: isTopLayer, reason: from getter */
        public final boolean getIsTopLayer() {
            return this.isTopLayer;
        }

        @NotNull
        public String toString() {
            int i11 = this.id;
            String str = this.seatTypeName;
            String str2 = this.number;
            String str3 = this.numberColor;
            ParseTextStyleHelper.ParsedTextStyle parsedTextStyle = this.numberTextStyle;
            IconDTO iconDTO = this.icon;
            TooltipVO tooltipVO = this.tooltip;
            Point point = this.position;
            boolean z11 = this.isTopLayer;
            AtomAction atomAction = this.action;
            boolean z12 = this.isSelected;
            StringBuilder g10 = e.g(i11, "SeatVO(id=", ", seatTypeName=", str, ", number=");
            a.h(g10, str2, ", numberColor=", str3, ", numberTextStyle=");
            g10.append(parsedTextStyle);
            g10.append(", icon=");
            g10.append(iconDTO);
            g10.append(", tooltip=");
            g10.append(tooltipVO);
            g10.append(", position=");
            g10.append(point);
            g10.append(", isTopLayer=");
            g10.append(z11);
            g10.append(", action=");
            g10.append(atomAction);
            g10.append(", isSelected=");
            return Pk0.a.a(")", g10, z12);
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/scheme/TravelRailwaySeatSelectWithSchemeVO$TextRectangleVO;", "", "", "cacheHash", "Lru/ozon/app/android/travel/molecules/extensions/TextParams;", "textParams", "Lru/ozon/app/android/travel/molecules/extensions/TextRowsParams;", "textRowsParams", "Lru/ozon/app/android/travel/molecules/extensions/TextBlockParams;", "textBlockParams", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/travel/molecules/extensions/TextParams;Lru/ozon/app/android/travel/molecules/extensions/TextRowsParams;Lru/ozon/app/android/travel/molecules/extensions/TextBlockParams;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCacheHash", "Lru/ozon/app/android/travel/molecules/extensions/TextParams;", "getTextParams", "()Lru/ozon/app/android/travel/molecules/extensions/TextParams;", "Lru/ozon/app/android/travel/molecules/extensions/TextRowsParams;", "getTextRowsParams", "()Lru/ozon/app/android/travel/molecules/extensions/TextRowsParams;", "Lru/ozon/app/android/travel/molecules/extensions/TextBlockParams;", "getTextBlockParams", "()Lru/ozon/app/android/travel/molecules/extensions/TextBlockParams;", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TextRectangleVO {
        public static final int $stable = (TextBlockParams.$stable | TextRowsParams.$stable) | TextParams.$stable;

        @NotNull
        private final String cacheHash;

        @NotNull
        private final TextBlockParams textBlockParams;

        @NotNull
        private final TextParams textParams;

        @NotNull
        private final TextRowsParams textRowsParams;

        public TextRectangleVO(@NotNull String cacheHash, @NotNull TextParams textParams, @NotNull TextRowsParams textRowsParams, @NotNull TextBlockParams textBlockParams) {
            Intrinsics.checkNotNullParameter(cacheHash, "cacheHash");
            Intrinsics.checkNotNullParameter(textParams, "textParams");
            Intrinsics.checkNotNullParameter(textRowsParams, "textRowsParams");
            Intrinsics.checkNotNullParameter(textBlockParams, "textBlockParams");
            this.cacheHash = cacheHash;
            this.textParams = textParams;
            this.textRowsParams = textRowsParams;
            this.textBlockParams = textBlockParams;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TextRectangleVO)) {
                return false;
            }
            TextRectangleVO textRectangleVO = (TextRectangleVO) other;
            return Intrinsics.d(this.cacheHash, textRectangleVO.cacheHash) && Intrinsics.d(this.textParams, textRectangleVO.textParams) && Intrinsics.d(this.textRowsParams, textRectangleVO.textRowsParams) && Intrinsics.d(this.textBlockParams, textRectangleVO.textBlockParams);
        }

        @NotNull
        public final String getCacheHash() {
            return this.cacheHash;
        }

        @NotNull
        public final TextBlockParams getTextBlockParams() {
            return this.textBlockParams;
        }

        @NotNull
        public final TextParams getTextParams() {
            return this.textParams;
        }

        @NotNull
        public final TextRowsParams getTextRowsParams() {
            return this.textRowsParams;
        }

        public int hashCode() {
            return this.textBlockParams.hashCode() + ((this.textRowsParams.hashCode() + ((this.textParams.hashCode() + (this.cacheHash.hashCode() * 31)) * 31)) * 31);
        }

        @NotNull
        public String toString() {
            return "TextRectangleVO(cacheHash=" + this.cacheHash + ", textParams=" + this.textParams + ", textRowsParams=" + this.textRowsParams + ", textBlockParams=" + this.textBlockParams + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0003\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/scheme/TravelRailwaySeatSelectWithSchemeVO$TooltipVO;", "", "", "isTooltipOnTop", "Lru/ozon/uni/atoms/data/text/TextDTO;", "tooltipTitle", "tooltipDescription", "<init>", "(ZLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTooltipTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getTooltipDescription", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TooltipVO {
        private final boolean isTooltipOnTop;

        @NotNull
        private final TextDTO tooltipDescription;

        @NotNull
        private final TextDTO tooltipTitle;

        public TooltipVO(boolean z11, @NotNull TextDTO tooltipTitle, @NotNull TextDTO tooltipDescription) {
            Intrinsics.checkNotNullParameter(tooltipTitle, "tooltipTitle");
            Intrinsics.checkNotNullParameter(tooltipDescription, "tooltipDescription");
            this.isTooltipOnTop = z11;
            this.tooltipTitle = tooltipTitle;
            this.tooltipDescription = tooltipDescription;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TooltipVO)) {
                return false;
            }
            TooltipVO tooltipVO = (TooltipVO) other;
            return this.isTooltipOnTop == tooltipVO.isTooltipOnTop && Intrinsics.d(this.tooltipTitle, tooltipVO.tooltipTitle) && Intrinsics.d(this.tooltipDescription, tooltipVO.tooltipDescription);
        }

        @NotNull
        public final TextDTO getTooltipDescription() {
            return this.tooltipDescription;
        }

        @NotNull
        public final TextDTO getTooltipTitle() {
            return this.tooltipTitle;
        }

        public int hashCode() {
            return this.tooltipDescription.hashCode() + Ns.b.a(this.tooltipTitle, Boolean.hashCode(this.isTooltipOnTop) * 31, 31);
        }

        /* renamed from: isTooltipOnTop, reason: from getter */
        public final boolean getIsTooltipOnTop() {
            return this.isTooltipOnTop;
        }

        @NotNull
        public String toString() {
            boolean z11 = this.isTooltipOnTop;
            TextDTO textDTO = this.tooltipTitle;
            TextDTO textDTO2 = this.tooltipDescription;
            StringBuilder sb2 = new StringBuilder("TooltipVO(isTooltipOnTop=");
            sb2.append(z11);
            sb2.append(", tooltipTitle=");
            sb2.append(textDTO);
            sb2.append(", tooltipDescription=");
            return Tl.b.e(sb2, textDTO2, ")");
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/scheme/TravelRailwaySeatSelectWithSchemeVO$TrainDirectionVO;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "description", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icon", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getDescription", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TrainDirectionVO {
        public static final int $stable = IconDTO.$stable;

        @NotNull
        private final TextDTO description;

        @NotNull
        private final IconDTO icon;

        public TrainDirectionVO(@NotNull TextDTO description, @NotNull IconDTO icon) {
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(icon, "icon");
            this.description = description;
            this.icon = icon;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TrainDirectionVO)) {
                return false;
            }
            TrainDirectionVO trainDirectionVO = (TrainDirectionVO) other;
            return Intrinsics.d(this.description, trainDirectionVO.description) && Intrinsics.d(this.icon, trainDirectionVO.icon);
        }

        @NotNull
        public final TextDTO getDescription() {
            return this.description;
        }

        @NotNull
        public final IconDTO getIcon() {
            return this.icon;
        }

        public int hashCode() {
            return this.icon.hashCode() + (this.description.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "TrainDirectionVO(description=" + this.description + ", icon=" + this.icon + ")";
        }
    }

    public TravelRailwaySeatSelectWithSchemeVO(long j11, Tabs tabs, boolean z11, @NotNull List<SeatVO> seats, List<TextRectangleVO> list, List<GenderIndicatorVO> list2, @NotNull List<SeatTypeVO> seatTypes, @NotNull String darkSchemeLink, @NotNull String lightSchemeLink, TextAtom textAtom, TrainDirectionVO trainDirectionVO, boolean z12, t tVar, Integer num) {
        SchemeVO schemeVO;
        Intrinsics.checkNotNullParameter(seats, "seats");
        Intrinsics.checkNotNullParameter(seatTypes, "seatTypes");
        Intrinsics.checkNotNullParameter(darkSchemeLink, "darkSchemeLink");
        Intrinsics.checkNotNullParameter(lightSchemeLink, "lightSchemeLink");
        this.id = j11;
        this.tabSelector = tabs;
        this.isTabSelectorVisible = z11;
        this.seats = seats;
        this.compartmentGenders = list;
        this.genderIndicator = list2;
        this.seatTypes = seatTypes;
        this.darkSchemeLink = darkSchemeLink;
        this.lightSchemeLink = lightSchemeLink;
        this.schemeScrollDescription = textAtom;
        this.trainDirection = trainDirectionVO;
        this.isBorderVisible = z12;
        this.viewEvent = tVar;
        this.scrollXPosition = num;
        schemeVO = TravelRailwaySeatSelectWithSchemeVOKt.toSchemeVO(this);
        this.schemeVO = schemeVO;
    }

    @NotNull
    public final TravelRailwaySeatSelectWithSchemeVO copy(long id2, Tabs tabSelector, boolean isTabSelectorVisible, @NotNull List<SeatVO> seats, List<TextRectangleVO> compartmentGenders, List<GenderIndicatorVO> genderIndicator, @NotNull List<SeatTypeVO> seatTypes, @NotNull String darkSchemeLink, @NotNull String lightSchemeLink, TextAtom schemeScrollDescription, TrainDirectionVO trainDirection, boolean isBorderVisible, t viewEvent, Integer scrollXPosition) {
        Intrinsics.checkNotNullParameter(seats, "seats");
        Intrinsics.checkNotNullParameter(seatTypes, "seatTypes");
        Intrinsics.checkNotNullParameter(darkSchemeLink, "darkSchemeLink");
        Intrinsics.checkNotNullParameter(lightSchemeLink, "lightSchemeLink");
        return new TravelRailwaySeatSelectWithSchemeVO(id2, tabSelector, isTabSelectorVisible, seats, compartmentGenders, genderIndicator, seatTypes, darkSchemeLink, lightSchemeLink, schemeScrollDescription, trainDirection, isBorderVisible, viewEvent, scrollXPosition);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelRailwaySeatSelectWithSchemeVO)) {
            return false;
        }
        TravelRailwaySeatSelectWithSchemeVO travelRailwaySeatSelectWithSchemeVO = (TravelRailwaySeatSelectWithSchemeVO) other;
        return this.id == travelRailwaySeatSelectWithSchemeVO.id && Intrinsics.d(this.tabSelector, travelRailwaySeatSelectWithSchemeVO.tabSelector) && this.isTabSelectorVisible == travelRailwaySeatSelectWithSchemeVO.isTabSelectorVisible && Intrinsics.d(this.seats, travelRailwaySeatSelectWithSchemeVO.seats) && Intrinsics.d(this.compartmentGenders, travelRailwaySeatSelectWithSchemeVO.compartmentGenders) && Intrinsics.d(this.genderIndicator, travelRailwaySeatSelectWithSchemeVO.genderIndicator) && Intrinsics.d(this.seatTypes, travelRailwaySeatSelectWithSchemeVO.seatTypes) && Intrinsics.d(this.darkSchemeLink, travelRailwaySeatSelectWithSchemeVO.darkSchemeLink) && Intrinsics.d(this.lightSchemeLink, travelRailwaySeatSelectWithSchemeVO.lightSchemeLink) && Intrinsics.d(this.schemeScrollDescription, travelRailwaySeatSelectWithSchemeVO.schemeScrollDescription) && Intrinsics.d(this.trainDirection, travelRailwaySeatSelectWithSchemeVO.trainDirection) && this.isBorderVisible == travelRailwaySeatSelectWithSchemeVO.isBorderVisible && Intrinsics.d(this.viewEvent, travelRailwaySeatSelectWithSchemeVO.viewEvent) && Intrinsics.d(this.scrollXPosition, travelRailwaySeatSelectWithSchemeVO.scrollXPosition);
    }

    public final List<TextRectangleVO> getCompartmentGenders() {
        return this.compartmentGenders;
    }

    @NotNull
    public final String getDarkSchemeLink() {
        return this.darkSchemeLink;
    }

    public final List<GenderIndicatorVO> getGenderIndicator() {
        return this.genderIndicator;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final String getLightSchemeLink() {
        return this.lightSchemeLink;
    }

    public final TextAtom getSchemeScrollDescription() {
        return this.schemeScrollDescription;
    }

    @NotNull
    public final SchemeVO getSchemeVO() {
        return this.schemeVO;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final List<SeatTypeVO> getSeatTypes() {
        return this.seatTypes;
    }

    @NotNull
    public final List<SeatVO> getSeats() {
        return this.seats;
    }

    public final Tabs getTabSelector() {
        return this.tabSelector;
    }

    public final TrainDirectionVO getTrainDirection() {
        return this.trainDirection;
    }

    public final t getViewEvent() {
        return this.viewEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        Tabs tabs = this.tabSelector;
        int b11 = g.b(C3532b.a((hashCode + (tabs == null ? 0 : tabs.hashCode())) * 31, 31, this.isTabSelectorVisible), 31, this.seats);
        List<TextRectangleVO> list = this.compartmentGenders;
        int hashCode2 = (b11 + (list == null ? 0 : list.hashCode())) * 31;
        List<GenderIndicatorVO> list2 = this.genderIndicator;
        int a11 = g.a(g.a(g.b((hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31, 31, this.seatTypes), 31, this.darkSchemeLink), 31, this.lightSchemeLink);
        TextAtom textAtom = this.schemeScrollDescription;
        int hashCode3 = (a11 + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
        TrainDirectionVO trainDirectionVO = this.trainDirection;
        int a12 = C3532b.a((hashCode3 + (trainDirectionVO == null ? 0 : trainDirectionVO.hashCode())) * 31, 31, this.isBorderVisible);
        t tVar = this.viewEvent;
        int hashCode4 = (a12 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        Integer num = this.scrollXPosition;
        return hashCode4 + (num != null ? num.hashCode() : 0);
    }

    /* renamed from: isBorderVisible, reason: from getter */
    public final boolean getIsBorderVisible() {
        return this.isBorderVisible;
    }

    /* renamed from: isTabSelectorVisible, reason: from getter */
    public final boolean getIsTabSelectorVisible() {
        return this.isTabSelectorVisible;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        Tabs tabs = this.tabSelector;
        boolean z11 = this.isTabSelectorVisible;
        List<SeatVO> list = this.seats;
        List<TextRectangleVO> list2 = this.compartmentGenders;
        List<GenderIndicatorVO> list3 = this.genderIndicator;
        List<SeatTypeVO> list4 = this.seatTypes;
        String str = this.darkSchemeLink;
        String str2 = this.lightSchemeLink;
        TextAtom textAtom = this.schemeScrollDescription;
        TrainDirectionVO trainDirectionVO = this.trainDirection;
        boolean z12 = this.isBorderVisible;
        t tVar = this.viewEvent;
        Integer num = this.scrollXPosition;
        StringBuilder sb2 = new StringBuilder("TravelRailwaySeatSelectWithSchemeVO(id=");
        sb2.append(j11);
        sb2.append(", tabSelector=");
        sb2.append(tabs);
        sb2.append(", isTabSelectorVisible=");
        sb2.append(z11);
        sb2.append(", seats=");
        sb2.append(list);
        C2860c.g(", compartmentGenders=", ", genderIndicator=", sb2, list2, list3);
        sb2.append(", seatTypes=");
        sb2.append(list4);
        sb2.append(", darkSchemeLink=");
        sb2.append(str);
        sb2.append(", lightSchemeLink=");
        sb2.append(str2);
        sb2.append(", schemeScrollDescription=");
        sb2.append(textAtom);
        sb2.append(", trainDirection=");
        sb2.append(trainDirectionVO);
        sb2.append(", isBorderVisible=");
        sb2.append(z12);
        sb2.append(", viewEvent=");
        sb2.append(tVar);
        sb2.append(", scrollXPosition=");
        sb2.append(num);
        sb2.append(")");
        return sb2.toString();
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0019\u0010\u000eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b \u0010\u000e¨\u0006!"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/scheme/TravelRailwaySeatSelectWithSchemeVO$SeatTypeVO;", "", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "darkImageLink", "lightImageLink", "Landroid/graphics/Rect;", "numberRect", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/mapper/ParseTextStyleHelper$ParsedTextStyle;", "seatNumberTextStyle", "seatNumberTextColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Rect;Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/mapper/ParseTextStyleHelper$ParsedTextStyle;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "getDarkImageLink", "getLightImageLink", "Landroid/graphics/Rect;", "getNumberRect", "()Landroid/graphics/Rect;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/mapper/ParseTextStyleHelper$ParsedTextStyle;", "getSeatNumberTextStyle", "()Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/mapper/ParseTextStyleHelper$ParsedTextStyle;", "getSeatNumberTextColor", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SeatTypeVO {

        @NotNull
        private final String darkImageLink;

        @NotNull
        private final String lightImageLink;

        @NotNull
        private final String name;
        private final Rect numberRect;
        private final String seatNumberTextColor;
        private final ParseTextStyleHelper.ParsedTextStyle seatNumberTextStyle;

        public SeatTypeVO(@NotNull String name, @NotNull String darkImageLink, @NotNull String lightImageLink, Rect rect, ParseTextStyleHelper.ParsedTextStyle parsedTextStyle, String str) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(darkImageLink, "darkImageLink");
            Intrinsics.checkNotNullParameter(lightImageLink, "lightImageLink");
            this.name = name;
            this.darkImageLink = darkImageLink;
            this.lightImageLink = lightImageLink;
            this.numberRect = rect;
            this.seatNumberTextStyle = parsedTextStyle;
            this.seatNumberTextColor = str;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SeatTypeVO)) {
                return false;
            }
            SeatTypeVO seatTypeVO = (SeatTypeVO) other;
            return Intrinsics.d(this.name, seatTypeVO.name) && Intrinsics.d(this.darkImageLink, seatTypeVO.darkImageLink) && Intrinsics.d(this.lightImageLink, seatTypeVO.lightImageLink) && Intrinsics.d(this.numberRect, seatTypeVO.numberRect) && Intrinsics.d(this.seatNumberTextStyle, seatTypeVO.seatNumberTextStyle) && Intrinsics.d(this.seatNumberTextColor, seatTypeVO.seatNumberTextColor);
        }

        @NotNull
        public final String getDarkImageLink() {
            return this.darkImageLink;
        }

        @NotNull
        public final String getLightImageLink() {
            return this.lightImageLink;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        public final String getSeatNumberTextColor() {
            return this.seatNumberTextColor;
        }

        public final ParseTextStyleHelper.ParsedTextStyle getSeatNumberTextStyle() {
            return this.seatNumberTextStyle;
        }

        public int hashCode() {
            int a11 = g.a(g.a(this.name.hashCode() * 31, 31, this.darkImageLink), 31, this.lightImageLink);
            Rect rect = this.numberRect;
            int hashCode = (a11 + (rect == null ? 0 : rect.hashCode())) * 31;
            ParseTextStyleHelper.ParsedTextStyle parsedTextStyle = this.seatNumberTextStyle;
            int hashCode2 = (hashCode + (parsedTextStyle == null ? 0 : parsedTextStyle.hashCode())) * 31;
            String str = this.seatNumberTextColor;
            return hashCode2 + (str != null ? str.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.name;
            String str2 = this.darkImageLink;
            String str3 = this.lightImageLink;
            Rect rect = this.numberRect;
            ParseTextStyleHelper.ParsedTextStyle parsedTextStyle = this.seatNumberTextStyle;
            String str4 = this.seatNumberTextColor;
            StringBuilder d11 = C3660k.d("SeatTypeVO(name=", str, ", darkImageLink=", str2, ", lightImageLink=");
            d11.append(str3);
            d11.append(", numberRect=");
            d11.append(rect);
            d11.append(", seatNumberTextStyle=");
            d11.append(parsedTextStyle);
            d11.append(", seatNumberTextColor=");
            d11.append(str4);
            d11.append(")");
            return d11.toString();
        }

        public /* synthetic */ SeatTypeVO(String str, String str2, String str3, Rect rect, ParseTextStyleHelper.ParsedTextStyle parsedTextStyle, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, (i11 & 8) != 0 ? null : rect, (i11 & 16) != 0 ? null : parsedTextStyle, (i11 & 32) != 0 ? null : str4);
        }
    }

    public /* synthetic */ TravelRailwaySeatSelectWithSchemeVO(long j11, Tabs tabs, boolean z11, List list, List list2, List list3, List list4, String str, String str2, TextAtom textAtom, TrainDirectionVO trainDirectionVO, boolean z12, t tVar, Integer num, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, tabs, z11, list, list2, (i11 & 32) != 0 ? null : list3, list4, str, str2, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : textAtom, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : trainDirectionVO, (i11 & 2048) != 0 ? false : z12, tVar, num);
    }
}
