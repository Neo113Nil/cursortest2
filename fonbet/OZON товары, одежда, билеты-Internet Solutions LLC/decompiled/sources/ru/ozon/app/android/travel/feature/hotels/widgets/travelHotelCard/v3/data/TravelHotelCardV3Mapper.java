package ru.ozon.app.android.travel.feature.hotels.widgets.travelHotelCard.v3.data;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import l20.d;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.feature.hotels.widgets.travelHotelCard.v3.data.TravelHotelCardV3DTO;
import ru.ozon.app.android.travel.feature.hotels.widgets.travelHotelCard.v3.presentation.TravelHotelCardV3VO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ1\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J*\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0012\u001a\u00020\u00022\n\u0010\u0014\u001a\u00060\u0003j\u0002`\u0013H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/travelHotelCard/v3/data/TravelHotelCardV3Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/hotels/widgets/travelHotelCard/v3/data/TravelHotelCardV3DTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/travelHotelCard/v3/presentation/TravelHotelCardV3VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/travel/feature/hotels/widgets/travelHotelCard/v3/data/TravelHotelCardV3DTO$PendingAction;", "pendingAction", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "Lru/ozon/app/android/travel/feature/hotels/widgets/travelHotelCard/v3/presentation/TravelHotelCardV3VO$PendingAction;", "mapPendingAction", "(Lru/ozon/app/android/travel/feature/hotels/widgets/travelHotelCard/v3/data/TravelHotelCardV3DTO$PendingAction;Ljava/util/Map;)Lru/ozon/app/android/travel/feature/hotels/widgets/travelHotelCard/v3/presentation/TravelHotelCardV3VO$PendingAction;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/hotels/widgets/travelHotelCard/v3/data/TravelHotelCardV3DTO;Ll20/d;)Ljava/util/List;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelHotelCardV3Mapper implements Function2<TravelHotelCardV3DTO, d, List<? extends TravelHotelCardV3VO>> {
    private final TravelHotelCardV3VO.PendingAction mapPendingAction(TravelHotelCardV3DTO.PendingAction pendingAction, Map<String, TokenizedTrackingInfo> trackingInfo) {
        if (pendingAction != null) {
            return new TravelHotelCardV3VO.PendingAction(pendingAction.getTimeLeft(), AtomActionMapperKt.toAtomAction(pendingAction.getAction(), trackingInfo));
        }
        return null;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    @Override // kotlin.jvm.functions.Function2
    @org.jetbrains.annotations.NotNull
    public java.util.List<ru.ozon.app.android.travel.feature.hotels.widgets.travelHotelCard.v3.presentation.TravelHotelCardV3VO> invoke(@org.jetbrains.annotations.NotNull ru.ozon.app.android.travel.feature.hotels.widgets.travelHotelCard.v3.data.TravelHotelCardV3DTO r21, @org.jetbrains.annotations.NotNull l20.d r22) {
        /*
            r20 = this;
            java.lang.String r0 = "state"
            r1 = r21
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "widgetInfo"
            r2 = r22
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = r2.d()
            int r0 = r0.hashCode()
            long r2 = (long) r0
            ru.ozon.app.android.travel.feature.hotels.widgets.travelHotelCard.v3.presentation.TravelHotelCardV3VO r1 = new ru.ozon.app.android.travel.feature.hotels.widgets.travelHotelCard.v3.presentation.TravelHotelCardV3VO
            java.util.List r4 = r21.getBadges()
            ru.ozon.app.android.travel.molecules.dto.timer.TimerDTO r5 = r21.getPayUntilBadge()
            java.util.List r0 = r21.getBadges()
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 == 0) goto L2f
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L35
        L2f:
            ru.ozon.app.android.travel.molecules.dto.timer.TimerDTO r0 = r21.getPayUntilBadge()
            if (r0 == 0) goto L38
        L35:
            r0 = 1
        L36:
            r6 = r0
            goto L3a
        L38:
            r0 = 0
            goto L36
        L3a:
            ru.ozon.uni.atoms.data.texts.TextAtom r7 = r21.getName()
            ru.ozon.uni.atoms.data.texts.TextAtom r8 = r21.getAddress()
            ru.ozon.app.android.travel.feature.hotels.widgets.travelHotelCard.v3.data.TravelHotelCardV3DTO$DateV3 r0 = r21.getCheckInDate()
            if (r0 == 0) goto L4d
            ru.ozon.uni.atoms.data.texts.TextAtom r0 = r0.getTitle()
            goto L4e
        L4d:
            r0 = 0
        L4e:
            ru.ozon.app.android.travel.feature.hotels.widgets.travelHotelCard.v3.data.TravelHotelCardV3DTO$DateV3 r10 = r21.getCheckInDate()
            if (r10 == 0) goto L59
            ru.ozon.uni.atoms.data.texts.TextAtom r10 = r10.getDateWithTime()
            goto L5a
        L59:
            r10 = 0
        L5a:
            ru.ozon.app.android.travel.feature.hotels.widgets.travelHotelCard.v3.data.TravelHotelCardV3DTO$DateV3 r11 = r21.getCheckOutDate()
            if (r11 == 0) goto L65
            ru.ozon.uni.atoms.data.texts.TextAtom r11 = r11.getTitle()
            goto L66
        L65:
            r11 = 0
        L66:
            ru.ozon.app.android.travel.feature.hotels.widgets.travelHotelCard.v3.data.TravelHotelCardV3DTO$DateV3 r12 = r21.getCheckOutDate()
            if (r12 == 0) goto L71
            ru.ozon.uni.atoms.data.texts.TextAtom r12 = r12.getDateWithTime()
            goto L72
        L71:
            r12 = 0
        L72:
            ru.ozon.uni.atoms.data.price.Price r13 = r21.getTotalPrice()
            ru.ozon.uni.atoms.data.texts.TextAtom r14 = r21.getPriceDescription()
            ru.ozon.app.android.travel.feature.hotels.widgets.travelHotelCard.v3.data.TravelHotelCardV3DTO$PendingAction r15 = r21.getPendingAction()
            java.util.Map r9 = r21.getTrackingInfo()
            r16 = r0
            r0 = r20
            ru.ozon.app.android.travel.feature.hotels.widgets.travelHotelCard.v3.presentation.TravelHotelCardV3VO$PendingAction r15 = r0.mapPendingAction(r15, r9)
            java.util.Map r9 = r21.getTrackingInfo()
            if (r9 == 0) goto La8
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r17 = r1
            r1 = 2
            r18 = r2
            r2 = 0
            WZ.t r9 = ru.ozon.app.android.composer.TrackingInfoMapperKt.toTokenizedEvent$default(r9, r0, r2, r1, r2)
            r1 = r16
            r16 = r9
            r9 = r1
            r1 = r17
        La5:
            r2 = r18
            goto Lb0
        La8:
            r18 = r2
            r2 = 0
            r9 = r16
            r16 = r2
            goto La5
        Lb0:
            r1.<init>(r2, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            java.util.List r0 = kotlin.collections.C7714v.a0(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ozon.app.android.travel.feature.hotels.widgets.travelHotelCard.v3.data.TravelHotelCardV3Mapper.invoke(ru.ozon.app.android.travel.feature.hotels.widgets.travelHotelCard.v3.data.TravelHotelCardV3DTO, l20.d):java.util.List");
    }
}
