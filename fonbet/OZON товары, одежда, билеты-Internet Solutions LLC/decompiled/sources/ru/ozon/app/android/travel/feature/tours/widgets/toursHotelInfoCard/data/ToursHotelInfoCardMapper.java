package ru.ozon.app.android.travel.feature.tours.widgets.toursHotelInfoCard.data;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.travel.feature.tours.widgets.toursHotelInfoCard.data.ToursHotelInfoCardDTO;
import ru.ozon.app.android.travel.feature.tours.widgets.toursHotelInfoCard.presentation.ToursHotelInfoCardVO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.html.spans.OzonClickableSpan;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u001f\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ*\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u001d\u001a\u00020\u00022\n\u0010\u001f\u001a\u00060\u0003j\u0002`\u001eH\u0096\u0002¢\u0006\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursHotelInfoCard/data/ToursHotelInfoCardMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/tours/widgets/toursHotelInfoCard/data/ToursHotelInfoCardDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/tours/widgets/toursHotelInfoCard/presentation/ToursHotelInfoCardVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "description", "Lru/ozon/app/android/travel/feature/tours/widgets/toursHotelInfoCard/data/ToursHotelInfoCardDTO$DescriptionInfo;", "info", "", "widgetId", "Lru/ozon/app/android/travel/feature/tours/widgets/toursHotelInfoCard/presentation/ToursHotelInfoCardVO$DescriptionInfo;", "mapDescriptionInfo", "(Ljava/lang/String;Lru/ozon/app/android/travel/feature/tours/widgets/toursHotelInfoCard/data/ToursHotelInfoCardDTO$DescriptionInfo;J)Lru/ozon/app/android/travel/feature/tours/widgets/toursHotelInfoCard/presentation/ToursHotelInfoCardVO$DescriptionInfo;", "descriptionInfo", "Lkotlin/Pair;", "", "Lru/ozon/uni/atoms/html/spans/OzonClickableSpan;", "getShortDescriptionInfo", "(Ljava/lang/String;Lru/ozon/app/android/travel/feature/tours/widgets/toursHotelInfoCard/data/ToursHotelInfoCardDTO$DescriptionInfo;)Lkotlin/Pair;", "getFullDescriptionData", "text", "span", "setClickableSpan", "(Ljava/lang/String;Lru/ozon/uni/atoms/html/spans/OzonClickableSpan;)Ljava/lang/CharSequence;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/tours/widgets/toursHotelInfoCard/data/ToursHotelInfoCardDTO;Ll20/d;)Ljava/util/List;", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ToursHotelInfoCardMapper implements Function2<ToursHotelInfoCardDTO, d, List<? extends ToursHotelInfoCardVO>> {
    private final Pair<CharSequence, OzonClickableSpan> getFullDescriptionData(String description, ToursHotelInfoCardDTO.DescriptionInfo descriptionInfo) {
        OzonClickableSpan ozonClickableSpan = new OzonClickableSpan(null, false, 3, null);
        return new Pair<>(new SpannableStringBuilder(description).append((CharSequence) " ").append(setClickableSpan(descriptionInfo.getHideFullButtonText(), ozonClickableSpan)), ozonClickableSpan);
    }

    private final Pair<CharSequence, OzonClickableSpan> getShortDescriptionInfo(String description, ToursHotelInfoCardDTO.DescriptionInfo descriptionInfo) {
        OzonClickableSpan ozonClickableSpan = new OzonClickableSpan(null, false, 3, null);
        String substring = description.substring(0, descriptionInfo.getShortFormLettersCount());
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return new Pair<>(new SpannableStringBuilder(substring).append((CharSequence) "…").append((CharSequence) " ").append(setClickableSpan(descriptionInfo.getShowFullButtonText(), ozonClickableSpan)), ozonClickableSpan);
    }

    private final ToursHotelInfoCardVO.DescriptionInfo mapDescriptionInfo(String description, ToursHotelInfoCardDTO.DescriptionInfo info, long widgetId) {
        if (description == null || h.K(description) || info == null) {
            return null;
        }
        int shortFormLettersCount = info.getShortFormLettersCount();
        String showFullButtonText = info.getShowFullButtonText();
        String hideFullButtonText = info.getHideFullButtonText();
        Map<String, TokenizedTrackingInfo> showFullButtonTrackingInfo = info.getShowFullButtonTrackingInfo();
        return new ToursHotelInfoCardVO.DescriptionInfo(description, shortFormLettersCount, showFullButtonText, hideFullButtonText, showFullButtonTrackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(showFullButtonTrackingInfo, Long.valueOf(widgetId), null, 2, null) : null);
    }

    private final CharSequence setClickableSpan(String text, OzonClickableSpan span) {
        SpannableString spannableString = new SpannableString(text);
        spannableString.setSpan(span, 0, spannableString.length(), 33);
        return spannableString;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<ToursHotelInfoCardVO> invoke(@NotNull ToursHotelInfoCardDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        String description = state.getDescription();
        ToursHotelInfoCardDTO.DescriptionInfo descriptionRepresentation = state.getDescriptionRepresentation();
        Pair<CharSequence, OzonClickableSpan> pair = (description == null || descriptionRepresentation == null) ? new Pair<>(description, null) : getShortDescriptionInfo(description, descriptionRepresentation);
        Pair<CharSequence, OzonClickableSpan> fullDescriptionData = (description == null || descriptionRepresentation == null) ? null : getFullDescriptionData(description, descriptionRepresentation);
        long hashCode = widgetInfo.d().hashCode();
        TextAtom title = state.getTitle();
        boolean z11 = !(description == null || h.K(description));
        CharSequence e11 = pair.e();
        OzonClickableSpan f7 = pair.f();
        CharSequence e12 = fullDescriptionData != null ? fullDescriptionData.e() : null;
        OzonClickableSpan f11 = fullDescriptionData != null ? fullDescriptionData.f() : null;
        ToursHotelInfoCardVO.DescriptionInfo mapDescriptionInfo = mapDescriptionInfo(description, descriptionRepresentation, hashCode);
        List<Badge> hotelFeatures = state.getHotelFeatures();
        boolean z12 = !(hotelFeatures == null || hotelFeatures.isEmpty());
        List<Badge> hotelFeatures2 = state.getHotelFeatures();
        if (hotelFeatures2 == null) {
            hotelFeatures2 = K.f71697a;
        }
        List<Badge> list = hotelFeatures2;
        List<CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCounter> cells = state.getCells();
        boolean z13 = !(cells == null || cells.isEmpty());
        List<CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCounter> cells2 = state.getCells();
        if (cells2 == null) {
            cells2 = K.f71697a;
        }
        return C7714v.a0(new ToursHotelInfoCardVO(hashCode, title, z11, e11, f7, e12, f11, mapDescriptionInfo, false, z12, list, z13, cells2));
    }
}
