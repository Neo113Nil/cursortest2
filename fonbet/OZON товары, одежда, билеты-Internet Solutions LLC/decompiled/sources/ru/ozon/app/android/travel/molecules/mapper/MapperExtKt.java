package ru.ozon.app.android.travel.molecules.mapper;

import Ej.b;
import Sc.o;
import WZ.t;
import android.content.Context;
import android.graphics.Color;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.list.ListElementAtom;
import ru.ozon.app.android.atoms.data.list.Select;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.travel.molecules.dto.airlineCustomCell.AirlineCustomCellDTO;
import ru.ozon.app.android.travel.molecules.dto.asyncAction.AsyncActionDTO;
import ru.ozon.app.android.travel.molecules.dto.awardBadge.AwardBadgeDTO;
import ru.ozon.app.android.travel.molecules.dto.banner.BannerDTO;
import ru.ozon.app.android.travel.molecules.dto.buttonsRow.ButtonsRowDTO;
import ru.ozon.app.android.travel.molecules.dto.copyInput.CopyInputDTO;
import ru.ozon.app.android.travel.molecules.dto.dropDownBanner.DropDownBannerDTO;
import ru.ozon.app.android.travel.molecules.dto.emptyState.v1.EmptyStateDTO;
import ru.ozon.app.android.travel.molecules.dto.emptyState.v2.EmptyStateV2DTO;
import ru.ozon.app.android.travel.molecules.dto.errorState.ErrorStateDTO;
import ru.ozon.app.android.travel.molecules.dto.iconField.IconFieldDTO;
import ru.ozon.app.android.travel.molecules.dto.iconWithText.v2.IconWithTextV2DTO;
import ru.ozon.app.android.travel.molecules.dto.iconWithText.v3.IconWithTextV3DTO;
import ru.ozon.app.android.travel.molecules.dto.imageBanner.ImageBannerDTO;
import ru.ozon.app.android.travel.molecules.dto.infoBadge.InfoBadgeDTO;
import ru.ozon.app.android.travel.molecules.dto.linkButton.LinkButtonDTO;
import ru.ozon.app.android.travel.molecules.dto.priceCard.PriceCardDTO;
import ru.ozon.app.android.travel.molecules.dto.quickFiltersRowList.QuickFiltersRowListDTO;
import ru.ozon.app.android.travel.molecules.dto.railwayServices.RailwayServicesDTO;
import ru.ozon.app.android.travel.molecules.dto.serviceBlock.v4.ServiceBlockV4DTO;
import ru.ozon.app.android.travel.molecules.dto.shiftedPreviewIcons.ShiftedPreviewIconsDTO;
import ru.ozon.app.android.travel.molecules.dto.sliderWithLabels.v2.SliderWithLabelsV2DTO;
import ru.ozon.app.android.travel.molecules.dto.starsBadge.v1.StarsBadgeDTO;
import ru.ozon.app.android.travel.molecules.dto.starsBalance.StarsBalanceMoleculeDTO;
import ru.ozon.app.android.travel.molecules.dto.stepListWithScaleMolecule.StepListWithScaleMoleculeDTO;
import ru.ozon.app.android.travel.molecules.dto.textInfoCells.TextInfoCellDTO;
import ru.ozon.app.android.travel.molecules.dto.themeImage.v1.ThemeImageV1DTO;
import ru.ozon.app.android.travel.molecules.dto.themeImage.v2.ThemeImageV2DTO;
import ru.ozon.app.android.travel.molecules.dto.travelFiltersButton.TravelFiltersButtonDTO;
import ru.ozon.app.android.travel.molecules.dto.travelSorting.TravelSortingDTO;
import ru.ozon.app.android.travel.molecules.dto.travelTab.v2.TravelTabDTO;
import ru.ozon.app.android.travel.molecules.dto.travelWidgetSettings.TravelWidgetSettingsDTO;
import ru.ozon.app.android.travel.molecules.dto.tripLeg.v1.TripLegDTO;
import ru.ozon.app.android.travel.molecules.dto.tripRoute.TripRouteDTO;
import ru.ozon.app.android.travel.molecules.view.airlineCustomCell.AirlineCustomCellVO;
import ru.ozon.app.android.travel.molecules.view.awardBadge.AwardBadgeVI;
import ru.ozon.app.android.travel.molecules.view.banner.BannerVO;
import ru.ozon.app.android.travel.molecules.view.buttonsRow.ButtonsRowVO;
import ru.ozon.app.android.travel.molecules.view.copyInput.CopyInputVO;
import ru.ozon.app.android.travel.molecules.view.dropDownBanner.DropDownBannerVO;
import ru.ozon.app.android.travel.molecules.view.emptyState.v1.EmptyStateVO;
import ru.ozon.app.android.travel.molecules.view.emptyState.v2.EmptyStateV2VO;
import ru.ozon.app.android.travel.molecules.view.errorState.ErrorStateVO;
import ru.ozon.app.android.travel.molecules.view.iconField.IconFieldVO;
import ru.ozon.app.android.travel.molecules.view.iconWithText.v2.IconWithTextV2VO;
import ru.ozon.app.android.travel.molecules.view.iconWithText.v3.IconWithTextV3VO;
import ru.ozon.app.android.travel.molecules.view.imageBanner.ImageBannerVO;
import ru.ozon.app.android.travel.molecules.view.infoBadge.InfoBadgeVO;
import ru.ozon.app.android.travel.molecules.view.linkButton.LinkButtonVO;
import ru.ozon.app.android.travel.molecules.view.priceCard.PriceCardComposeVO;
import ru.ozon.app.android.travel.molecules.view.priceCard.PriceCardVO;
import ru.ozon.app.android.travel.molecules.view.quickFiltersRowList.QuickFiltersRowListVO;
import ru.ozon.app.android.travel.molecules.view.railwayServices.RailwayServicesVO;
import ru.ozon.app.android.travel.molecules.view.serviceBlock.v4.ServiceBlockV4VO;
import ru.ozon.app.android.travel.molecules.view.shiftedPreviewIcons.ShiftedPreviewIconsVO;
import ru.ozon.app.android.travel.molecules.view.sliderWithLabels.v2.SliderWithLabelsV2VO;
import ru.ozon.app.android.travel.molecules.view.sliderWithLabels.v2.SliderWithLabelsV2ViewGroup;
import ru.ozon.app.android.travel.molecules.view.starsBadge.v1.StarsBadgeVI;
import ru.ozon.app.android.travel.molecules.view.starsBlock.StarsBalanceMoleculeVI;
import ru.ozon.app.android.travel.molecules.view.stepListWithScaleMolecule.StepListWithScaleMoleculeVO;
import ru.ozon.app.android.travel.molecules.view.textInfoCells.TextInfoCellVO;
import ru.ozon.app.android.travel.molecules.view.themeImage.v1.ThemeImageV1VO;
import ru.ozon.app.android.travel.molecules.view.themeImage.v2.ThemeImageV2VO;
import ru.ozon.app.android.travel.molecules.view.travelFiltersButton.TravelFiltersButtonVO;
import ru.ozon.app.android.travel.molecules.view.travelSorting.TravelSortingVO;
import ru.ozon.app.android.travel.molecules.view.travelTab.v2.TravelTabVO;
import ru.ozon.app.android.travel.molecules.view.travelWidgetSettings.TravelWidgetSettingsVO;
import ru.ozon.app.android.travel.molecules.view.tripLeg.v1.TripLegVO;
import ru.ozon.app.android.travel.molecules.view.tripRoute.TripRouteVO;
import ru.ozon.app.android.travel.utils.asyncWidget.asyncAction.AsyncActionVO;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.indicator.IndicatorDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000æ\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006\u001a\u0011\u0010\u0002\u001a\u00020\b*\u00020\u0007¢\u0006\u0004\b\u0002\u0010\t\u001a\u0011\u0010\u0002\u001a\u00020\u000b*\u00020\n¢\u0006\u0004\b\u0002\u0010\f\u001a\u0019\u0010\u0002\u001a\u00020\u0010*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0002\u0010\u0011\u001a\u0011\u0010\u0013\u001a\u00020\u0012*\u00020\r¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0011\u0010\u0002\u001a\u00020\u0016*\u00020\u0015¢\u0006\u0004\b\u0002\u0010\u0017\u001a\u0011\u0010\u0002\u001a\u00020\u0019*\u00020\u0018¢\u0006\u0004\b\u0002\u0010\u001a\u001a\u0011\u0010\u0002\u001a\u00020\u001c*\u00020\u001b¢\u0006\u0004\b\u0002\u0010\u001d\u001a\u0011\u0010\u0002\u001a\u00020\u001f*\u00020\u001e¢\u0006\u0004\b\u0002\u0010 \u001a\u0011\u0010\u0002\u001a\u00020\"*\u00020!¢\u0006\u0004\b\u0002\u0010#\u001a\u0011\u0010\u0002\u001a\u00020%*\u00020$¢\u0006\u0004\b\u0002\u0010&\u001a!\u0010\u0002\u001a\u00020**\u00020'2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b\u0002\u0010+\u001a\u0019\u0010.\u001a\u00020-*\u00020,2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b.\u0010/\u001a%\u0010.\u001a\u000203*\u0002002\u0006\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u00102\u001a\u0004\u0018\u000101¢\u0006\u0004\b.\u00104\u001a\u001d\u0010\u0002\u001a\u000207*\u0002052\n\b\u0002\u00106\u001a\u0004\u0018\u00010(¢\u0006\u0004\b\u0002\u00108\u001a\u0019\u0010\u0002\u001a\u00020:*\u0002092\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0002\u0010;\u001a\u0011\u0010\u0002\u001a\u00020=*\u00020<¢\u0006\u0004\b\u0002\u0010>\u001a\u001d\u0010\u0002\u001a\u00020@*\u00020?2\n\b\u0002\u00102\u001a\u0004\u0018\u000101¢\u0006\u0004\b\u0002\u0010A\u001a\u001d\u0010\u0002\u001a\u00020C*\u00020B2\n\b\u0002\u00102\u001a\u0004\u0018\u000101¢\u0006\u0004\b\u0002\u0010D\u001a\u0011\u0010\u0002\u001a\u00020F*\u00020E¢\u0006\u0004\b\u0002\u0010G\u001a\u001d\u0010\u0002\u001a\u00020J*\u00020H2\n\b\u0002\u0010I\u001a\u0004\u0018\u00010(¢\u0006\u0004\b\u0002\u0010K\u001a\u001b\u0010M\u001a\u0004\u0018\u00010L2\b\u0010I\u001a\u0004\u0018\u00010(H\u0002¢\u0006\u0004\bM\u0010N\u001a\u0011\u0010.\u001a\u00020P*\u00020O¢\u0006\u0004\b.\u0010Q\u001a\u0017\u0010S\u001a\u0002012\u0006\u0010R\u001a\u00020OH\u0002¢\u0006\u0004\bS\u0010T\u001a\u0011\u0010\u0002\u001a\u00020V*\u00020U¢\u0006\u0004\b\u0002\u0010W\u001a\u0011\u0010\u0002\u001a\u00020Y*\u00020X¢\u0006\u0004\b\u0002\u0010Z\u001a\u0019\u0010\u0002\u001a\u00020\\*\u00020[2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0002\u0010]\u001a\u001d\u0010\u0002\u001a\u00020_*\u0004\u0018\u00010^2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0002\u0010`\u001a\u001b\u0010\u0002\u001a\u00020b*\u0004\u0018\u00010a2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0002\u0010c\u001a\u0011\u0010\u0002\u001a\u00020e*\u00020d¢\u0006\u0004\b\u0002\u0010f\u001a\u0011\u0010\u0002\u001a\u00020h*\u00020g¢\u0006\u0004\b\u0002\u0010i\u001a\u0019\u0010\u0002\u001a\u00020l*\u00020j2\u0006\u0010k\u001a\u000201¢\u0006\u0004\b\u0002\u0010m\u001a\u0013\u0010\u0002\u001a\u00020o*\u00020nH\u0002¢\u0006\u0004\b\u0002\u0010p\u001a\u0019\u0010\u0002\u001a\u00020r*\u00020q2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0002\u0010s\u001a\u001d\u0010\u0002\u001a\u00020u*\u0004\u0018\u00010t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0002\u0010v\u001a\u001f\u0010\u0002\u001a\u0004\u0018\u00010x*\u0004\u0018\u00010w2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0002\u0010y\u001a\u001f\u0010\u0002\u001a\u0004\u0018\u00010{*\u0004\u0018\u00010z2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0002\u0010|\u001a\u0013\u0010\u0002\u001a\u00020~*\u00020}H\u0002¢\u0006\u0004\b\u0002\u0010\u007f\u001a\u001f\u0010\u0002\u001a\u00030\u0082\u0001*\u00030\u0080\u00012\t\u0010\u0081\u0001\u001a\u0004\u0018\u00010L¢\u0006\u0005\b\u0002\u0010\u0083\u0001\u001a\u0016\u0010\u0002\u001a\u00030\u0085\u0001*\u00030\u0084\u0001H\u0002¢\u0006\u0005\b\u0002\u0010\u0086\u0001\u001a\u0014\u0010\u0002\u001a\u00030\u0088\u0001*\u00030\u0087\u0001¢\u0006\u0005\b\u0002\u0010\u0089\u0001\u001a\u001e\u0010\u008c\u0001\u001a\u00030\u008b\u0001*\u00030\u008a\u00012\u0006\u00102\u001a\u000201¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a&\u0010\u008c\u0001\u001a\u00030\u008f\u0001*\u00030\u008e\u00012\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010k\u001a\u000201¢\u0006\u0006\b\u008c\u0001\u0010\u0090\u0001\u001a%\u0010\u0094\u0001\u001a\u00030\u0093\u00012\u0010\u0010\u0092\u0001\u001a\u000b\u0012\u0004\u0012\u00020L\u0018\u00010\u0091\u0001H\u0002¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001\u001a\u0013\u0010\u0096\u0001\u001a\u00030\u0093\u0001H\u0002¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001\u001a\u0016\u0010\u008c\u0001\u001a\u00030\u0099\u0001*\u00030\u0098\u0001¢\u0006\u0006\b\u008c\u0001\u0010\u009a\u0001¨\u0006\u009b\u0001"}, d2 = {"Lru/ozon/app/android/travel/molecules/dto/tripLeg/v1/TripLegDTO;", "Lru/ozon/app/android/travel/molecules/view/tripLeg/v1/TripLegVO;", "toVO", "(Lru/ozon/app/android/travel/molecules/dto/tripLeg/v1/TripLegDTO;)Lru/ozon/app/android/travel/molecules/view/tripLeg/v1/TripLegVO;", "Lru/ozon/app/android/travel/molecules/dto/linkButton/LinkButtonDTO;", "Lru/ozon/app/android/travel/molecules/view/linkButton/LinkButtonVO;", "(Lru/ozon/app/android/travel/molecules/dto/linkButton/LinkButtonDTO;)Lru/ozon/app/android/travel/molecules/view/linkButton/LinkButtonVO;", "Lru/ozon/app/android/travel/molecules/dto/infoBadge/InfoBadgeDTO;", "Lru/ozon/app/android/travel/molecules/view/infoBadge/InfoBadgeVO;", "(Lru/ozon/app/android/travel/molecules/dto/infoBadge/InfoBadgeDTO;)Lru/ozon/app/android/travel/molecules/view/infoBadge/InfoBadgeVO;", "Lru/ozon/app/android/travel/molecules/dto/railwayServices/RailwayServicesDTO;", "Lru/ozon/app/android/travel/molecules/view/railwayServices/RailwayServicesVO;", "(Lru/ozon/app/android/travel/molecules/dto/railwayServices/RailwayServicesDTO;)Lru/ozon/app/android/travel/molecules/view/railwayServices/RailwayServicesVO;", "Lru/ozon/app/android/travel/molecules/dto/priceCard/PriceCardDTO;", "Landroid/content/Context;", "context", "Lru/ozon/app/android/travel/molecules/view/priceCard/PriceCardVO;", "(Lru/ozon/app/android/travel/molecules/dto/priceCard/PriceCardDTO;Landroid/content/Context;)Lru/ozon/app/android/travel/molecules/view/priceCard/PriceCardVO;", "Lru/ozon/app/android/travel/molecules/view/priceCard/PriceCardComposeVO;", "toComposeVO", "(Lru/ozon/app/android/travel/molecules/dto/priceCard/PriceCardDTO;)Lru/ozon/app/android/travel/molecules/view/priceCard/PriceCardComposeVO;", "Lru/ozon/app/android/travel/molecules/dto/tripRoute/TripRouteDTO;", "Lru/ozon/app/android/travel/molecules/view/tripRoute/TripRouteVO;", "(Lru/ozon/app/android/travel/molecules/dto/tripRoute/TripRouteDTO;)Lru/ozon/app/android/travel/molecules/view/tripRoute/TripRouteVO;", "Lru/ozon/app/android/travel/molecules/dto/errorState/ErrorStateDTO;", "Lru/ozon/app/android/travel/molecules/view/errorState/ErrorStateVO;", "(Lru/ozon/app/android/travel/molecules/dto/errorState/ErrorStateDTO;)Lru/ozon/app/android/travel/molecules/view/errorState/ErrorStateVO;", "Lru/ozon/app/android/travel/molecules/dto/emptyState/v1/EmptyStateDTO;", "Lru/ozon/app/android/travel/molecules/view/emptyState/v1/EmptyStateVO;", "(Lru/ozon/app/android/travel/molecules/dto/emptyState/v1/EmptyStateDTO;)Lru/ozon/app/android/travel/molecules/view/emptyState/v1/EmptyStateVO;", "Lru/ozon/app/android/travel/molecules/dto/emptyState/v2/EmptyStateV2DTO;", "Lru/ozon/app/android/travel/molecules/view/emptyState/v2/EmptyStateV2VO;", "(Lru/ozon/app/android/travel/molecules/dto/emptyState/v2/EmptyStateV2DTO;)Lru/ozon/app/android/travel/molecules/view/emptyState/v2/EmptyStateV2VO;", "Lru/ozon/app/android/travel/molecules/dto/themeImage/v1/ThemeImageV1DTO;", "Lru/ozon/app/android/travel/molecules/view/themeImage/v1/ThemeImageV1VO;", "(Lru/ozon/app/android/travel/molecules/dto/themeImage/v1/ThemeImageV1DTO;)Lru/ozon/app/android/travel/molecules/view/themeImage/v1/ThemeImageV1VO;", "Lru/ozon/app/android/travel/molecules/dto/themeImage/v2/ThemeImageV2DTO;", "Lru/ozon/app/android/travel/molecules/view/themeImage/v2/ThemeImageV2VO;", "(Lru/ozon/app/android/travel/molecules/dto/themeImage/v2/ThemeImageV2DTO;)Lru/ozon/app/android/travel/molecules/view/themeImage/v2/ThemeImageV2VO;", "Lru/ozon/app/android/travel/molecules/dto/imageBanner/ImageBannerDTO;", "", "bgRadius", "Lru/ozon/app/android/travel/molecules/view/imageBanner/ImageBannerVO;", "(Lru/ozon/app/android/travel/molecules/dto/imageBanner/ImageBannerDTO;Landroid/content/Context;I)Lru/ozon/app/android/travel/molecules/view/imageBanner/ImageBannerVO;", "Lru/ozon/app/android/travel/molecules/dto/dropDownBanner/DropDownBannerDTO;", "Lru/ozon/app/android/travel/molecules/view/dropDownBanner/DropDownBannerVO;", "toVo", "(Lru/ozon/app/android/travel/molecules/dto/dropDownBanner/DropDownBannerDTO;Landroid/content/Context;)Lru/ozon/app/android/travel/molecules/view/dropDownBanner/DropDownBannerVO;", "Lru/ozon/app/android/travel/molecules/dto/banner/BannerDTO;", "", "widgetId", "Lru/ozon/app/android/travel/molecules/view/banner/BannerVO;", "(Lru/ozon/app/android/travel/molecules/dto/banner/BannerDTO;Landroid/content/Context;Ljava/lang/Long;)Lru/ozon/app/android/travel/molecules/view/banner/BannerVO;", "Lru/ozon/app/android/travel/molecules/dto/iconWithText/v2/IconWithTextV2DTO;", "itemCounts", "Lru/ozon/app/android/travel/molecules/view/iconWithText/v2/IconWithTextV2VO;", "(Lru/ozon/app/android/travel/molecules/dto/iconWithText/v2/IconWithTextV2DTO;Ljava/lang/Integer;)Lru/ozon/app/android/travel/molecules/view/iconWithText/v2/IconWithTextV2VO;", "Lru/ozon/app/android/travel/molecules/dto/iconWithText/v3/IconWithTextV3DTO;", "Lru/ozon/app/android/travel/molecules/view/iconWithText/v3/IconWithTextV3VO;", "(Lru/ozon/app/android/travel/molecules/dto/iconWithText/v3/IconWithTextV3DTO;Landroid/content/Context;)Lru/ozon/app/android/travel/molecules/view/iconWithText/v3/IconWithTextV3VO;", "Lru/ozon/app/android/travel/molecules/dto/textInfoCells/TextInfoCellDTO;", "Lru/ozon/app/android/travel/molecules/view/textInfoCells/TextInfoCellVO;", "(Lru/ozon/app/android/travel/molecules/dto/textInfoCells/TextInfoCellDTO;)Lru/ozon/app/android/travel/molecules/view/textInfoCells/TextInfoCellVO;", "Lru/ozon/app/android/travel/molecules/dto/travelSorting/TravelSortingDTO;", "Lru/ozon/app/android/travel/molecules/view/travelSorting/TravelSortingVO;", "(Lru/ozon/app/android/travel/molecules/dto/travelSorting/TravelSortingDTO;Ljava/lang/Long;)Lru/ozon/app/android/travel/molecules/view/travelSorting/TravelSortingVO;", "Lru/ozon/app/android/travel/molecules/dto/travelFiltersButton/TravelFiltersButtonDTO;", "Lru/ozon/app/android/travel/molecules/view/travelFiltersButton/TravelFiltersButtonVO;", "(Lru/ozon/app/android/travel/molecules/dto/travelFiltersButton/TravelFiltersButtonDTO;Ljava/lang/Long;)Lru/ozon/app/android/travel/molecules/view/travelFiltersButton/TravelFiltersButtonVO;", "Lru/ozon/app/android/travel/molecules/dto/serviceBlock/v4/ServiceBlockV4DTO;", "Lru/ozon/app/android/travel/molecules/view/serviceBlock/v4/ServiceBlockV4VO;", "(Lru/ozon/app/android/travel/molecules/dto/serviceBlock/v4/ServiceBlockV4DTO;)Lru/ozon/app/android/travel/molecules/view/serviceBlock/v4/ServiceBlockV4VO;", "Lru/ozon/app/android/travel/molecules/dto/travelTab/v2/TravelTabDTO;", "index", "Lru/ozon/app/android/travel/molecules/view/travelTab/v2/TravelTabVO;", "(Lru/ozon/app/android/travel/molecules/dto/travelTab/v2/TravelTabDTO;Ljava/lang/Integer;)Lru/ozon/app/android/travel/molecules/view/travelTab/v2/TravelTabVO;", "", "getLocator", "(Ljava/lang/Integer;)Ljava/lang/String;", "Lru/ozon/app/android/travel/molecules/dto/iconField/IconFieldDTO;", "Lru/ozon/app/android/travel/molecules/view/iconField/IconFieldVO;", "(Lru/ozon/app/android/travel/molecules/dto/iconField/IconFieldDTO;)Lru/ozon/app/android/travel/molecules/view/iconField/IconFieldVO;", "of", "calculateId", "(Lru/ozon/app/android/travel/molecules/dto/iconField/IconFieldDTO;)J", "Lru/ozon/app/android/travel/molecules/dto/stepListWithScaleMolecule/StepListWithScaleMoleculeDTO;", "Lru/ozon/app/android/travel/molecules/view/stepListWithScaleMolecule/StepListWithScaleMoleculeVO;", "(Lru/ozon/app/android/travel/molecules/dto/stepListWithScaleMolecule/StepListWithScaleMoleculeDTO;)Lru/ozon/app/android/travel/molecules/view/stepListWithScaleMolecule/StepListWithScaleMoleculeVO;", "Lru/ozon/app/android/travel/molecules/dto/buttonsRow/ButtonsRowDTO;", "Lru/ozon/app/android/travel/molecules/view/buttonsRow/ButtonsRowVO;", "(Lru/ozon/app/android/travel/molecules/dto/buttonsRow/ButtonsRowDTO;)Lru/ozon/app/android/travel/molecules/view/buttonsRow/ButtonsRowVO;", "Lru/ozon/app/android/travel/molecules/dto/travelWidgetSettings/TravelWidgetSettingsDTO;", "Lru/ozon/app/android/travel/molecules/view/travelWidgetSettings/TravelWidgetSettingsVO;", "(Lru/ozon/app/android/travel/molecules/dto/travelWidgetSettings/TravelWidgetSettingsDTO;Landroid/content/Context;)Lru/ozon/app/android/travel/molecules/view/travelWidgetSettings/TravelWidgetSettingsVO;", "Lru/ozon/app/android/travel/molecules/dto/travelWidgetSettings/TravelWidgetSettingsDTO$CornersSetting;", "Lru/ozon/app/android/travel/molecules/view/travelWidgetSettings/TravelWidgetSettingsVO$CornersVO;", "(Lru/ozon/app/android/travel/molecules/dto/travelWidgetSettings/TravelWidgetSettingsDTO$CornersSetting;Landroid/content/Context;)Lru/ozon/app/android/travel/molecules/view/travelWidgetSettings/TravelWidgetSettingsVO$CornersVO;", "Lru/ozon/app/android/travel/molecules/dto/travelWidgetSettings/TravelWidgetSettingsDTO$PaddingsSetting;", "Lru/ozon/app/android/travel/molecules/view/travelWidgetSettings/TravelWidgetSettingsVO$PaddingsVO;", "(Lru/ozon/app/android/travel/molecules/dto/travelWidgetSettings/TravelWidgetSettingsDTO$PaddingsSetting;Landroid/content/Context;)Lru/ozon/app/android/travel/molecules/view/travelWidgetSettings/TravelWidgetSettingsVO$PaddingsVO;", "Lru/ozon/app/android/travel/molecules/dto/quickFiltersRowList/QuickFiltersRowListDTO;", "Lru/ozon/app/android/travel/molecules/view/quickFiltersRowList/QuickFiltersRowListVO;", "(Lru/ozon/app/android/travel/molecules/dto/quickFiltersRowList/QuickFiltersRowListDTO;)Lru/ozon/app/android/travel/molecules/view/quickFiltersRowList/QuickFiltersRowListVO;", "Lru/ozon/app/android/travel/molecules/dto/copyInput/CopyInputDTO;", "Lru/ozon/app/android/travel/molecules/view/copyInput/CopyInputVO;", "(Lru/ozon/app/android/travel/molecules/dto/copyInput/CopyInputDTO;)Lru/ozon/app/android/travel/molecules/view/copyInput/CopyInputVO;", "Lru/ozon/app/android/travel/molecules/dto/sliderWithLabels/v2/SliderWithLabelsV2DTO;", "id", "Lru/ozon/app/android/travel/molecules/view/sliderWithLabels/v2/SliderWithLabelsV2VO;", "(Lru/ozon/app/android/travel/molecules/dto/sliderWithLabels/v2/SliderWithLabelsV2DTO;J)Lru/ozon/app/android/travel/molecules/view/sliderWithLabels/v2/SliderWithLabelsV2VO;", "Lru/ozon/app/android/travel/molecules/dto/sliderWithLabels/v2/SliderWithLabelsV2DTO$PointDTO;", "Lru/ozon/app/android/travel/molecules/view/sliderWithLabels/v2/SliderWithLabelsV2ViewGroup$Label;", "(Lru/ozon/app/android/travel/molecules/dto/sliderWithLabels/v2/SliderWithLabelsV2DTO$PointDTO;)Lru/ozon/app/android/travel/molecules/view/sliderWithLabels/v2/SliderWithLabelsV2ViewGroup$Label;", "Lru/ozon/app/android/travel/molecules/dto/airlineCustomCell/AirlineCustomCellDTO;", "Lru/ozon/app/android/travel/molecules/view/airlineCustomCell/AirlineCustomCellVO;", "(Lru/ozon/app/android/travel/molecules/dto/airlineCustomCell/AirlineCustomCellDTO;Landroid/content/Context;)Lru/ozon/app/android/travel/molecules/view/airlineCustomCell/AirlineCustomCellVO;", "Lru/ozon/app/android/travel/molecules/dto/airlineCustomCell/AirlineCustomCellDTO$SettingsDTO;", "Lru/ozon/app/android/travel/molecules/view/airlineCustomCell/AirlineCustomCellVO$SettingsVO;", "(Lru/ozon/app/android/travel/molecules/dto/airlineCustomCell/AirlineCustomCellDTO$SettingsDTO;Landroid/content/Context;)Lru/ozon/app/android/travel/molecules/view/airlineCustomCell/AirlineCustomCellVO$SettingsVO;", "Lru/ozon/app/android/travel/molecules/dto/airlineCustomCell/AirlineCustomCellDTO$LeftBlockDTO;", "Lru/ozon/app/android/travel/molecules/view/airlineCustomCell/AirlineCustomCellVO$LeftBlockVO;", "(Lru/ozon/app/android/travel/molecules/dto/airlineCustomCell/AirlineCustomCellDTO$LeftBlockDTO;Landroid/content/Context;)Lru/ozon/app/android/travel/molecules/view/airlineCustomCell/AirlineCustomCellVO$LeftBlockVO;", "Lru/ozon/app/android/travel/molecules/dto/airlineCustomCell/AirlineCustomCellDTO$RightBlockDTO;", "Lru/ozon/app/android/travel/molecules/view/airlineCustomCell/AirlineCustomCellVO$RightBlockVO;", "(Lru/ozon/app/android/travel/molecules/dto/airlineCustomCell/AirlineCustomCellDTO$RightBlockDTO;Landroid/content/Context;)Lru/ozon/app/android/travel/molecules/view/airlineCustomCell/AirlineCustomCellVO$RightBlockVO;", "Lru/ozon/app/android/travel/molecules/dto/airlineCustomCell/AirlineCustomCellDTO$CenterBlockDTO;", "Lru/ozon/app/android/travel/molecules/view/airlineCustomCell/AirlineCustomCellVO$CenterBlockVO;", "(Lru/ozon/app/android/travel/molecules/dto/airlineCustomCell/AirlineCustomCellDTO$CenterBlockDTO;)Lru/ozon/app/android/travel/molecules/view/airlineCustomCell/AirlineCustomCellVO$CenterBlockVO;", "Lru/ozon/app/android/travel/molecules/dto/asyncAction/AsyncActionDTO;", "asyncData", "Lru/ozon/app/android/travel/utils/asyncWidget/asyncAction/AsyncActionVO;", "(Lru/ozon/app/android/travel/molecules/dto/asyncAction/AsyncActionDTO;Ljava/lang/String;)Lru/ozon/app/android/travel/utils/asyncWidget/asyncAction/AsyncActionVO;", "Lru/ozon/app/android/travel/molecules/dto/asyncAction/AsyncActionDTO$AsyncBehaviorType;", "Lru/ozon/app/android/travel/utils/asyncWidget/asyncAction/AsyncActionVO$AsyncBehaviorType;", "(Lru/ozon/app/android/travel/molecules/dto/asyncAction/AsyncActionDTO$AsyncBehaviorType;)Lru/ozon/app/android/travel/utils/asyncWidget/asyncAction/AsyncActionVO$AsyncBehaviorType;", "Lru/ozon/app/android/travel/molecules/dto/shiftedPreviewIcons/ShiftedPreviewIconsDTO;", "Lru/ozon/app/android/travel/molecules/view/shiftedPreviewIcons/ShiftedPreviewIconsVO;", "(Lru/ozon/app/android/travel/molecules/dto/shiftedPreviewIcons/ShiftedPreviewIconsDTO;)Lru/ozon/app/android/travel/molecules/view/shiftedPreviewIcons/ShiftedPreviewIconsVO;", "Lru/ozon/app/android/travel/molecules/dto/starsBadge/v1/StarsBadgeDTO;", "Lru/ozon/app/android/travel/molecules/view/starsBadge/v1/StarsBadgeVI;", "toVI", "(Lru/ozon/app/android/travel/molecules/dto/starsBadge/v1/StarsBadgeDTO;J)Lru/ozon/app/android/travel/molecules/view/starsBadge/v1/StarsBadgeVI;", "Lru/ozon/app/android/travel/molecules/dto/starsBalance/StarsBalanceMoleculeDTO;", "Lru/ozon/app/android/travel/molecules/view/starsBlock/StarsBalanceMoleculeVI;", "(Lru/ozon/app/android/travel/molecules/dto/starsBalance/StarsBalanceMoleculeDTO;Landroid/content/Context;J)Lru/ozon/app/android/travel/molecules/view/starsBlock/StarsBalanceMoleculeVI;", "", "colorsDTO", "", "mapStarsBadgeColors", "(Ljava/util/List;)[I", "defaultStarsBadgeColors", "()[I", "Lru/ozon/app/android/travel/molecules/dto/awardBadge/AwardBadgeDTO;", "Lru/ozon/app/android/travel/molecules/view/awardBadge/AwardBadgeVI;", "(Lru/ozon/app/android/travel/molecules/dto/awardBadge/AwardBadgeDTO;)Lru/ozon/app/android/travel/molecules/view/awardBadge/AwardBadgeVI;", "molecules_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MapperExtKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AsyncActionDTO.AsyncBehaviorType.values().length];
            try {
                iArr[AsyncActionDTO.AsyncBehaviorType.UNDEFINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AsyncActionDTO.AsyncBehaviorType.NO_ACTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AsyncActionDTO.AsyncBehaviorType.FETCH_STATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AsyncActionDTO.AsyncBehaviorType.ACTION_STATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final long calculateId(IconFieldDTO iconFieldDTO) {
        return ((155 + iconFieldDTO.getText().hashCode()) * 31) + iconFieldDTO.getIcon().hashCode();
    }

    private static final int[] defaultStarsBadgeColors() {
        List b02 = C7714v.b0("#066CEE", "#29BBFF", "#12F15E", "#066CEE", "#00B8B8");
        ArrayList arrayList = new ArrayList(C7714v.z(b02, 10));
        Iterator it = b02.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(Color.parseColor((String) it.next())));
        }
        return C7714v.T0(arrayList);
    }

    private static final String getLocator(Integer num) {
        if (num == null) {
            return null;
        }
        return b.a(num.intValue() + 1, "travel.tab.");
    }

    private static final int[] mapStarsBadgeColors(List<String> list) {
        if (list == null || list.isEmpty()) {
            return defaultStarsBadgeColors();
        }
        try {
            List<String> list2 = list;
            ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(Color.parseColor((String) it.next())));
            }
            int[] T02 = C7714v.T0(arrayList);
            Integer E11 = C7705l.E(T02);
            if (E11 != null) {
                T02 = C7705l.T(T02, E11.intValue());
            }
            return C7705l.W(T02);
        } catch (IllegalArgumentException unused) {
            return defaultStarsBadgeColors();
        }
    }

    @NotNull
    public static final PriceCardComposeVO toComposeVO(@NotNull PriceCardDTO priceCardDTO) {
        Intrinsics.checkNotNullParameter(priceCardDTO, "<this>");
        PriceCardDTO.Settings settings = priceCardDTO.getSettings();
        PriceCardComposeVO.SettingsVO settingsVO = settings != null ? new PriceCardComposeVO.SettingsVO(settings.getTopPadding(), settings.getBottomPadding(), settings.getLeftPadding(), settings.getRightPadding(), settings.getCornerRadius()) : null;
        PriceDTO price = priceCardDTO.getPrice();
        TextDTO subtitle = priceCardDTO.getSubtitle();
        String backgroundColor = priceCardDTO.getBackgroundColor();
        IconDTO icon = priceCardDTO.getIcon();
        CommonControlSettings commonControlSettings = priceCardDTO.getCommonControlSettings();
        return new PriceCardComposeVO(settingsVO, price, subtitle, backgroundColor, icon, commonControlSettings != null ? commonControlSettings.toAtomAction() : null, priceCardDTO.getCommonControlSettings() != null);
    }

    @NotNull
    public static final StarsBadgeVI toVI(@NotNull StarsBadgeDTO starsBadgeDTO, long j11) {
        Map<String, TokenizedTrackingInfo> trackingInfo;
        Intrinsics.checkNotNullParameter(starsBadgeDTO, "<this>");
        String text = starsBadgeDTO.getText();
        String leftIcon = starsBadgeDTO.getLeftIcon();
        String rightIcon = starsBadgeDTO.getRightIcon();
        String backgroundColor = starsBadgeDTO.getBackgroundColor();
        int[] mapStarsBadgeColors = mapStarsBadgeColors(starsBadgeDTO.getTextGradientColors());
        CommonControlSettings common = starsBadgeDTO.getCommon();
        t tVar = null;
        AtomAction atomAction = common != null ? common.toAtomAction() : null;
        CommonControlSettings common2 = starsBadgeDTO.getCommon();
        if (common2 != null && (trackingInfo = common2.getTrackingInfo()) != null) {
            tVar = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null);
        }
        return new StarsBadgeVI(text, leftIcon, rightIcon, backgroundColor, mapStarsBadgeColors, atomAction, tVar);
    }

    @NotNull
    public static final TripLegVO toVO(@NotNull TripLegDTO tripLegDTO) {
        boolean z11;
        boolean z12;
        Intrinsics.checkNotNullParameter(tripLegDTO, "<this>");
        String startTime = tripLegDTO.getStartTime();
        String endTime = tripLegDTO.getEndTime();
        String tripDuration = tripLegDTO.getTripDuration();
        String tripDeparture = tripLegDTO.getTripDeparture();
        String tripDestination = tripLegDTO.getTripDestination();
        boolean z13 = false;
        boolean z14 = true;
        if (tripLegDTO.getSegmentTransfer() == null && tripLegDTO.getTechStopButton() == null) {
            z11 = false;
        } else {
            z11 = false;
            z13 = true;
        }
        if (tripLegDTO.getSegmentTransfer() != null) {
            z12 = true;
        } else {
            z12 = true;
            z14 = z11;
        }
        String segmentTransfer = tripLegDTO.getSegmentTransfer();
        boolean z15 = z12;
        Badge techStopButton = tripLegDTO.getTechStopButton();
        String arrivalDays = tripLegDTO.getArrivalDays();
        if (arrivalDays == null || h.K(arrivalDays)) {
            z11 = z15;
        }
        return new TripLegVO(startTime, endTime, tripDuration, tripDeparture, tripDestination, z13, z14, segmentTransfer, techStopButton, z15 ^ z11, tripLegDTO.getArrivalDays());
    }

    public static /* synthetic */ TravelSortingVO toVO$default(TravelSortingDTO travelSortingDTO, Long l11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            l11 = null;
        }
        return toVO(travelSortingDTO, l11);
    }

    private static final ServiceBlockV4VO.AdditionalInfoVO toVO$toVO(ServiceBlockV4DTO.AdditionalInfo additionalInfo) {
        OzonSpannableString text = additionalInfo.getInfo().getText();
        ListElementAtom.Marker.Icon icon = additionalInfo.getIcon();
        String image = icon != null ? icon.getImage() : null;
        return new ServiceBlockV4VO.AdditionalInfoVO((((Object) text) + image).hashCode(), additionalInfo.getInfo(), additionalInfo.getIcon());
    }

    private static final ServiceBlockV4VO.CopyBlockVO toVO$toVO$7(ServiceBlockV4DTO.CopyBlock copyBlock) {
        OzonSpannableString text = copyBlock.getText().getText();
        String icon = copyBlock.getClipboard().getIcon();
        return new ServiceBlockV4VO.CopyBlockVO((((Object) text) + icon).hashCode(), copyBlock.getText(), copyBlock.getClipboard());
    }

    @NotNull
    public static final DropDownBannerVO toVo(@NotNull DropDownBannerDTO dropDownBannerDTO, @NotNull Context context) {
        String image;
        Intrinsics.checkNotNullParameter(dropDownBannerDTO, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Icon icon = dropDownBannerDTO.getIcon();
        boolean z11 = false;
        if (icon != null && (image = icon.getImage()) != null && !h.K(image)) {
            z11 = true;
        }
        Icon icon2 = dropDownBannerDTO.getIcon();
        String image2 = icon2 != null ? icon2.getImage() : null;
        StyleParser styleParser = StyleParser.INSTANCE;
        Icon icon3 = dropDownBannerDTO.getIcon();
        return new DropDownBannerVO(z11, image2, styleParser.parseColor(context, icon3 != null ? icon3.getTintColor() : null), dropDownBannerDTO.getTitle(), dropDownBannerDTO.getHiddenText(), false);
    }

    public static /* synthetic */ TravelTabVO toVO$default(TravelTabDTO travelTabDTO, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = null;
        }
        return toVO(travelTabDTO, num);
    }

    @NotNull
    public static final BannerVO toVo(@NotNull BannerDTO bannerDTO, @NotNull Context context, Long l11) {
        Intrinsics.checkNotNullParameter(bannerDTO, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        String leftImageLink = bannerDTO.getLeftImageLink();
        String rightImageLink = bannerDTO.getRightImageLink();
        int px = ResourceExtKt.toPx(bannerDTO.getHeight(), context);
        TextDTO title = bannerDTO.getTitle();
        TextDTO subtitle = bannerDTO.getSubtitle();
        String gradientColor = bannerDTO.getGradientColor();
        String solidColor = bannerDTO.getSolidColor();
        String contourColor = bannerDTO.getContourColor();
        AtomActionDTO action = bannerDTO.getAction();
        AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, bannerDTO.getTrackingInfo()) : null;
        IconButtonV3DTO closeButton = bannerDTO.getCloseButton();
        Map<String, TokenizedTrackingInfo> trackingInfo = bannerDTO.getTrackingInfo();
        return new BannerVO(leftImageLink, rightImageLink, px, title, subtitle, gradientColor, solidColor, contourColor, atomAction, closeButton, trackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, l11, null, 2, null) : null);
    }

    @NotNull
    public static final StarsBalanceMoleculeVI toVI(@NotNull StarsBalanceMoleculeDTO starsBalanceMoleculeDTO, @NotNull Context context, long j11) {
        Intrinsics.checkNotNullParameter(starsBalanceMoleculeDTO, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        TextDTO title = starsBalanceMoleculeDTO.getTitle();
        TextDTO titlePrefix = starsBalanceMoleculeDTO.getTitlePrefix();
        TextDTO subtitle = starsBalanceMoleculeDTO.getSubtitle();
        IconDTO icon = starsBalanceMoleculeDTO.getIcon();
        TravelWidgetSettingsDTO settings = starsBalanceMoleculeDTO.getSettings();
        TravelWidgetSettingsVO vo = settings != null ? toVO(settings, context) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = starsBalanceMoleculeDTO.getTrackingInfo();
        return new StarsBalanceMoleculeVI(title, titlePrefix, subtitle, icon, vo, trackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null);
    }

    @NotNull
    public static final LinkButtonVO toVO(@NotNull LinkButtonDTO linkButtonDTO) {
        Intrinsics.checkNotNullParameter(linkButtonDTO, "<this>");
        return new LinkButtonVO(linkButtonDTO.getTitle(), AtomActionMapperKt.toAtomAction(linkButtonDTO.getAction(), linkButtonDTO.getTrackingInfo()), linkButtonDTO.getIcon(), linkButtonDTO.getTrackingInfo());
    }

    @NotNull
    public static final AwardBadgeVI toVI(@NotNull AwardBadgeDTO awardBadgeDTO) {
        Intrinsics.checkNotNullParameter(awardBadgeDTO, "<this>");
        return new AwardBadgeVI(awardBadgeDTO.getIcon(), awardBadgeDTO.getText(), awardBadgeDTO.getBackgroundColor(), awardBadgeDTO.getSize());
    }

    @NotNull
    public static final InfoBadgeVO toVO(@NotNull InfoBadgeDTO infoBadgeDTO) {
        Intrinsics.checkNotNullParameter(infoBadgeDTO, "<this>");
        TextAtom text = infoBadgeDTO.getText();
        Icon icon = infoBadgeDTO.getIcon();
        boolean z11 = infoBadgeDTO.getIcon() != null;
        AtomActionDTO action = infoBadgeDTO.getAction();
        AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, null) : null;
        String backgroundColor = infoBadgeDTO.getBackgroundColor();
        LinkButtonDTO linkButton = infoBadgeDTO.getLinkButton();
        return new InfoBadgeVO(text, icon, z11, atomAction, backgroundColor, linkButton != null ? toVO(linkButton) : null, infoBadgeDTO.getMaxLines());
    }

    @NotNull
    public static final IconFieldVO toVo(@NotNull IconFieldDTO iconFieldDTO) {
        Intrinsics.checkNotNullParameter(iconFieldDTO, "<this>");
        return new IconFieldVO(calculateId(iconFieldDTO), iconFieldDTO.getText(), iconFieldDTO.getIcon(), iconFieldDTO.getBackgroundColor(), iconFieldDTO.getCornerRadius(), iconFieldDTO.isCompact(), iconFieldDTO.getCommonControlSettings());
    }

    @NotNull
    public static final RailwayServicesVO toVO(@NotNull RailwayServicesDTO railwayServicesDTO) {
        Intrinsics.checkNotNullParameter(railwayServicesDTO, "<this>");
        return new RailwayServicesVO(railwayServicesDTO.getIcons(), railwayServicesDTO.getInfoButton());
    }

    @NotNull
    public static final PriceCardVO toVO(@NotNull PriceCardDTO priceCardDTO, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(priceCardDTO, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        PriceCardDTO.Settings settings = priceCardDTO.getSettings();
        PriceCardVO.SettingsVO settingsVO = settings != null ? new PriceCardVO.SettingsVO(ResourceExtKt.toPx(settings.getTopPadding().getPx(), context), ResourceExtKt.toPx(settings.getBottomPadding().getPx(), context), ResourceExtKt.toPx(settings.getLeftPadding().getPx(), context), ResourceExtKt.toPx(settings.getRightPadding().getPx(), context), ResourceExtKt.toPxF(settings.getCornerRadius().getPx(), context)) : null;
        PriceDTO price = priceCardDTO.getPrice();
        TextDTO subtitle = priceCardDTO.getSubtitle();
        String backgroundColor = priceCardDTO.getBackgroundColor();
        IconDTO icon = priceCardDTO.getIcon();
        CommonControlSettings commonControlSettings = priceCardDTO.getCommonControlSettings();
        return new PriceCardVO(settingsVO, price, subtitle, backgroundColor, icon, commonControlSettings != null ? commonControlSettings.toAtomAction() : null);
    }

    @NotNull
    public static final TripRouteVO toVO(@NotNull TripRouteDTO tripRouteDTO) {
        Intrinsics.checkNotNullParameter(tripRouteDTO, "<this>");
        return new TripRouteVO(tripRouteDTO.getAirlineIconUrls(), tripRouteDTO.getTripTime(), tripRouteDTO.getTripDuration(), tripRouteDTO.getRouteInfo(), tripRouteDTO.getTransferIcon(), tripRouteDTO.getTransferInfo(), tripRouteDTO.getTransferTime(), tripRouteDTO.getArrivalDays());
    }

    @NotNull
    public static final ErrorStateVO toVO(@NotNull ErrorStateDTO errorStateDTO) {
        Intrinsics.checkNotNullParameter(errorStateDTO, "<this>");
        return new ErrorStateVO(errorStateDTO.getMessage(), errorStateDTO.getTitle(), errorStateDTO.getImage(), errorStateDTO.getButtons());
    }

    @NotNull
    public static final EmptyStateVO toVO(@NotNull EmptyStateDTO emptyStateDTO) {
        Intrinsics.checkNotNullParameter(emptyStateDTO, "<this>");
        String imageURL = emptyStateDTO.getImageURL();
        TextAtom title = emptyStateDTO.getTitle();
        TextAtom message = emptyStateDTO.getMessage();
        List<AtomDTO> buttons = emptyStateDTO.getButtons();
        List<AtomDTO> buttons2 = emptyStateDTO.getButtons();
        return new EmptyStateVO(imageURL, title, message, buttons, true ^ (buttons2 == null || buttons2.isEmpty()), emptyStateDTO.getTrackingInfo());
    }

    @NotNull
    public static final EmptyStateV2VO toVO(@NotNull EmptyStateV2DTO emptyStateV2DTO) {
        Intrinsics.checkNotNullParameter(emptyStateV2DTO, "<this>");
        String imageURL = emptyStateV2DTO.getImageURL();
        Integer imageSize = emptyStateV2DTO.getImageSize();
        return new EmptyStateV2VO(imageURL, imageSize != null ? imageSize.intValue() : 160, emptyStateV2DTO.getTitle(), emptyStateV2DTO.getMessage(), emptyStateV2DTO.getButtons(), !emptyStateV2DTO.getButtons().isEmpty(), emptyStateV2DTO.getTrackingInfo());
    }

    @NotNull
    public static final ThemeImageV1VO toVO(@NotNull ThemeImageV1DTO themeImageV1DTO) {
        Intrinsics.checkNotNullParameter(themeImageV1DTO, "<this>");
        return new ThemeImageV1VO(themeImageV1DTO.getLightImageUrl(), themeImageV1DTO.getDarkImageUrl());
    }

    @NotNull
    public static final ThemeImageV2VO toVO(@NotNull ThemeImageV2DTO themeImageV2DTO) {
        Intrinsics.checkNotNullParameter(themeImageV2DTO, "<this>");
        return new ThemeImageV2VO(themeImageV2DTO.getLight(), themeImageV2DTO.getDark());
    }

    @NotNull
    public static final ImageBannerVO toVO(@NotNull ImageBannerDTO imageBannerDTO, @NotNull Context context, int i11) {
        Intrinsics.checkNotNullParameter(imageBannerDTO, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        return new ImageBannerVO(imageBannerDTO.getTitle(), imageBannerDTO.getDarkImageUrl(), imageBannerDTO.getLightImageUrl(), AtomActionMapperKt.toAtomAction(imageBannerDTO.getAction(), imageBannerDTO.getClickTrackingInfo()), StyleParser.INSTANCE.parseColor(context, imageBannerDTO.getBgColor(), R$color.bg_action_secondary), ResourceExtKt.toPxF(i11, context));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0027, code lost:
    
        if (r9 == 1) goto L7;
     */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final IconWithTextV2VO toVO(@NotNull IconWithTextV2DTO iconWithTextV2DTO, Integer num) {
        boolean z11;
        Intrinsics.checkNotNullParameter(iconWithTextV2DTO, "<this>");
        Icon icon = iconWithTextV2DTO.getIcon();
        TextAtom text = iconWithTextV2DTO.getText();
        TextAtom subText = iconWithTextV2DTO.getSubText();
        String borderColor = iconWithTextV2DTO.getBorderColor();
        String backgroundColor = iconWithTextV2DTO.getBackgroundColor();
        Integer borderRadius = iconWithTextV2DTO.getBorderRadius();
        if (num != null) {
            int intValue = num.intValue();
            z11 = true;
        }
        z11 = false;
        return new IconWithTextV2VO(icon, text, subText, borderColor, backgroundColor, borderRadius, z11);
    }

    @NotNull
    public static final IconWithTextV3VO toVO(@NotNull IconWithTextV3DTO iconWithTextV3DTO, @NotNull Context context) {
        Pair pair;
        Intrinsics.checkNotNullParameter(iconWithTextV3DTO, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        if (iconWithTextV3DTO.getIcon() != null && iconWithTextV3DTO.getText() != null) {
            pair = new Pair(Paddings.PADDING_300, Paddings.PADDING_400);
        } else if (iconWithTextV3DTO.getIcon() != null) {
            Paddings paddings = Paddings.PADDING_300;
            pair = new Pair(paddings, paddings);
        } else {
            Paddings paddings2 = Paddings.PADDING_400;
            pair = new Pair(paddings2, paddings2);
        }
        Paddings paddings3 = (Paddings) pair.a();
        Paddings paddings4 = (Paddings) pair.b();
        IconDTO icon = iconWithTextV3DTO.getIcon();
        TextDTO text = iconWithTextV3DTO.getText();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(icon);
        sb2.append(text);
        return new IconWithTextV3VO(sb2.toString().hashCode(), iconWithTextV3DTO.getIcon(), iconWithTextV3DTO.getText(), iconWithTextV3DTO.getBackgroundColor(), iconWithTextV3DTO.getCornerRadius(), ResourceExtKt.toPx(paddings3.getPx(), context), ResourceExtKt.toPx(paddings4.getPx(), context));
    }

    @NotNull
    public static final TextInfoCellVO toVO(@NotNull TextInfoCellDTO textInfoCellDTO) {
        Intrinsics.checkNotNullParameter(textInfoCellDTO, "<this>");
        return new TextInfoCellVO(((((527 + textInfoCellDTO.getText().getText().hashCode()) * 31) + textInfoCellDTO.getText().getTextColor().hashCode()) * 31) + textInfoCellDTO.getText().getTextStyle().hashCode(), textInfoCellDTO.getText(), textInfoCellDTO.getTopPadding(), textInfoCellDTO.isCenteredText(), textInfoCellDTO.getMarker(), textInfoCellDTO.getMarkerAlignment(), textInfoCellDTO.getOffsetBetween(), textInfoCellDTO.getServiceBadge());
    }

    @NotNull
    public static final TravelSortingVO toVO(@NotNull TravelSortingDTO travelSortingDTO, Long l11) {
        Intrinsics.checkNotNullParameter(travelSortingDTO, "<this>");
        List<TravelSortingDTO.TravelSortingTypeDTO> sortingTypes = travelSortingDTO.getSortingTypes();
        ArrayList arrayList = new ArrayList(C7714v.z(sortingTypes, 10));
        for (TravelSortingDTO.TravelSortingTypeDTO travelSortingTypeDTO : sortingTypes) {
            arrayList.add(new Select.Option(travelSortingTypeDTO.getName(), new AtomActionDTO(AtomActionDTO.Behavior.BEHAVIOR_TYPE_REFRESH, h.X(travelSortingDTO.getUrlBase(), "sorting={value}", "sorting=" + travelSortingTypeDTO.getUrlValue(), false), travelSortingTypeDTO.getId(), null, 8, null), Boolean.valueOf(travelSortingTypeDTO.isSelected()), travelSortingTypeDTO.getTrackingInfo()));
        }
        Select select = new Select(arrayList, null, null);
        boolean isEnabled = travelSortingDTO.isEnabled();
        String urlBase = travelSortingDTO.getUrlBase();
        Map<String, TokenizedTrackingInfo> trackingInfo = travelSortingDTO.getTrackingInfo();
        return new TravelSortingVO(select, isEnabled, urlBase, trackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, l11, null, 2, null) : null);
    }

    @NotNull
    public static final TravelFiltersButtonVO toVO(@NotNull TravelFiltersButtonDTO travelFiltersButtonDTO, Long l11) {
        Intrinsics.checkNotNullParameter(travelFiltersButtonDTO, "<this>");
        Icon icon = travelFiltersButtonDTO.getIcon();
        TextAtom label = travelFiltersButtonDTO.getLabel();
        TravelFiltersButtonDTO.CountBadge countBadge = travelFiltersButtonDTO.getCountBadge();
        TravelFiltersButtonVO.CountBadge countBadge2 = countBadge != null ? new TravelFiltersButtonVO.CountBadge(countBadge.getTextAtom(), countBadge.getBackgroundColor()) : null;
        AtomActionDTO action = travelFiltersButtonDTO.getAction();
        AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, travelFiltersButtonDTO.getTrackingInfo()) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = travelFiltersButtonDTO.getTrackingInfo();
        t mapToTokenizedEvent$default = trackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, l11, null, 2, null) : null;
        TestInfo testInfo = travelFiltersButtonDTO.getTestInfo();
        return new TravelFiltersButtonVO(icon, label, countBadge2, atomAction, mapToTokenizedEvent$default, (testInfo == null || testInfo.getAutomatizationId().length() <= 0) ? null : testInfo);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.collections.K] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.collections.K] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    @NotNull
    public static final ServiceBlockV4VO toVO(@NotNull ServiceBlockV4DTO serviceBlockV4DTO) {
        ?? r22;
        ?? r32;
        Intrinsics.checkNotNullParameter(serviceBlockV4DTO, "<this>");
        List<ServiceBlockV4DTO.AdditionalInfo> additionalInfoList = serviceBlockV4DTO.getAdditionalInfoList();
        if (additionalInfoList != null) {
            List<ServiceBlockV4DTO.AdditionalInfo> list = additionalInfoList;
            r22 = new ArrayList(C7714v.z(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                r22.add(toVO$toVO((ServiceBlockV4DTO.AdditionalInfo) it.next()));
            }
        } else {
            r22 = K.f71697a;
        }
        Collection collection = (Collection) r22;
        List<ServiceBlockV4DTO.CopyBlock> copyBlockList = serviceBlockV4DTO.getCopyBlockList();
        if (copyBlockList != null) {
            List<ServiceBlockV4DTO.CopyBlock> list2 = copyBlockList;
            r32 = new ArrayList(C7714v.z(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                r32.add(toVO$toVO$7((ServiceBlockV4DTO.CopyBlock) it2.next()));
            }
        } else {
            r32 = K.f71697a;
        }
        return new ServiceBlockV4VO(serviceBlockV4DTO.getTitle(), serviceBlockV4DTO.getContent(), serviceBlockV4DTO.getMoreAction(), serviceBlockV4DTO.getTravelBadgesList(), serviceBlockV4DTO.getPriceDescription(), serviceBlockV4DTO.getChangeServiceButton(), C7714v.p0(r32, collection), !r11.isEmpty());
    }

    @NotNull
    public static final TravelTabVO toVO(@NotNull TravelTabDTO travelTabDTO, Integer num) {
        Intrinsics.checkNotNullParameter(travelTabDTO, "<this>");
        int hashCode = travelTabDTO.getText().hashCode();
        String text = travelTabDTO.getText();
        boolean isSelected = travelTabDTO.isSelected();
        IndicatorDTO indicator = travelTabDTO.getIndicator();
        String accentColor = travelTabDTO.getAccentColor();
        AtomActionDTO action = travelTabDTO.getAction();
        return new TravelTabVO(hashCode, text, isSelected, indicator, accentColor, action != null ? AtomActionMapperKt.toAtomAction(action, travelTabDTO.getTrackingInfo()) : null, getLocator(num), travelTabDTO.getTrackingInfo());
    }

    @NotNull
    public static final StepListWithScaleMoleculeVO toVO(@NotNull StepListWithScaleMoleculeDTO stepListWithScaleMoleculeDTO) {
        Intrinsics.checkNotNullParameter(stepListWithScaleMoleculeDTO, "<this>");
        int P11 = C7714v.P(stepListWithScaleMoleculeDTO.getSteps());
        List<StepListWithScaleMoleculeDTO.StepDTO> steps = stepListWithScaleMoleculeDTO.getSteps();
        ArrayList arrayList = new ArrayList(C7714v.z(steps, 10));
        int i11 = 0;
        for (Object obj : steps) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            StepListWithScaleMoleculeDTO.StepDTO stepDTO = (StepListWithScaleMoleculeDTO.StepDTO) obj;
            arrayList.add(new StepListWithScaleMoleculeVO.StepVO(stepDTO.getTitle().getText().hashCode(), stepDTO.getTitle(), stepDTO.getDescription(), stepDTO.getMarginBottom(), stepDTO.getIndicatorColor(), stepDTO.getIndicatorColor(), stepDTO.getScaleColor(), i11 != 0, i11 != P11));
            i11 = i12;
        }
        return new StepListWithScaleMoleculeVO(stepListWithScaleMoleculeDTO.getBackgroundColor(), stepListWithScaleMoleculeDTO.getPaddingLeft(), stepListWithScaleMoleculeDTO.getPaddingRight(), arrayList);
    }

    @NotNull
    public static final ButtonsRowVO toVO(@NotNull ButtonsRowDTO buttonsRowDTO) {
        Intrinsics.checkNotNullParameter(buttonsRowDTO, "<this>");
        return new ButtonsRowVO(buttonsRowDTO.getButtons(), buttonsRowDTO.getTopPadding(), buttonsRowDTO.getBottomPadding(), buttonsRowDTO.getHorizontalPadding(), buttonsRowDTO.getButtonsMargin());
    }

    @NotNull
    public static final TravelWidgetSettingsVO toVO(@NotNull TravelWidgetSettingsDTO travelWidgetSettingsDTO, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(travelWidgetSettingsDTO, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        return new TravelWidgetSettingsVO(travelWidgetSettingsDTO.getBackgroundColor(), toVO(travelWidgetSettingsDTO.getCorners(), context), toVO(travelWidgetSettingsDTO.getPaddings(), context));
    }

    private static final TravelWidgetSettingsVO.CornersVO toVO(TravelWidgetSettingsDTO.CornersSetting cornersSetting, Context context) {
        CornerRadius bottomRadius;
        CornerRadius topRadius;
        float f7 = 0.0f;
        float pxF = (cornersSetting == null || (topRadius = cornersSetting.getTopRadius()) == null) ? 0.0f : ResourceExtKt.toPxF(topRadius.getPx(), context);
        if (cornersSetting != null && (bottomRadius = cornersSetting.getBottomRadius()) != null) {
            f7 = ResourceExtKt.toPxF(bottomRadius.getPx(), context);
        }
        return new TravelWidgetSettingsVO.CornersVO(pxF, f7);
    }

    @NotNull
    public static final TravelWidgetSettingsVO.PaddingsVO toVO(TravelWidgetSettingsDTO.PaddingsSetting paddingsSetting, @NotNull Context context) {
        Paddings bottomPadding;
        Paddings topPadding;
        Paddings rightPadding;
        Paddings leftPadding;
        Intrinsics.checkNotNullParameter(context, "context");
        int i11 = 0;
        int px = (paddingsSetting == null || (leftPadding = paddingsSetting.getLeftPadding()) == null) ? 0 : ResourceExtKt.toPx(leftPadding.getPx(), context);
        int px2 = (paddingsSetting == null || (rightPadding = paddingsSetting.getRightPadding()) == null) ? 0 : ResourceExtKt.toPx(rightPadding.getPx(), context);
        int px3 = (paddingsSetting == null || (topPadding = paddingsSetting.getTopPadding()) == null) ? 0 : ResourceExtKt.toPx(topPadding.getPx(), context);
        if (paddingsSetting != null && (bottomPadding = paddingsSetting.getBottomPadding()) != null) {
            i11 = ResourceExtKt.toPx(bottomPadding.getPx(), context);
        }
        return new TravelWidgetSettingsVO.PaddingsVO(px, px2, px3, i11);
    }

    @NotNull
    public static final QuickFiltersRowListVO toVO(@NotNull QuickFiltersRowListDTO quickFiltersRowListDTO) {
        TagButtonDTO copy;
        Intrinsics.checkNotNullParameter(quickFiltersRowListDTO, "<this>");
        List<TagButtonDTO> filters = quickFiltersRowListDTO.getFilters();
        ArrayList arrayList = new ArrayList(C7714v.z(filters, 10));
        Iterator<T> it = filters.iterator();
        while (it.hasNext()) {
            copy = r4.copy((r34 & 1) != 0 ? r4.styleType : null, (r34 & 2) != 0 ? r4.size : null, (r34 & 4) != 0 ? r4.isSelected : null, (r34 & 8) != 0 ? r4.isDisabled : null, (r34 & 16) != 0 ? r4.isClosable : null, (r34 & 32) != 0 ? r4.icon : null, (r34 & 64) != 0 ? r4.text : null, (r34 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? r4.indicator : null, (r34 & 256) != 0 ? r4.customDefaultStyle : null, (r34 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? r4.customSelectedStyle : null, (r34 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? r4.common : null, (r34 & 2048) != 0 ? r4.closeControlSettings : null, (r34 & 4096) != 0 ? r4.context : null, (r34 & 8192) != 0 ? r4.isStateChangeDisabled : Boolean.TRUE, (r34 & 16384) != 0 ? r4.image : null, (r34 & 32768) != 0 ? ((TagButtonDTO) it.next()).round : null);
            arrayList.add(copy);
        }
        TagButtonDTO clearFilters = quickFiltersRowListDTO.getClearFilters();
        TagButtonDTO copy2 = clearFilters != null ? clearFilters.copy((r34 & 1) != 0 ? clearFilters.styleType : null, (r34 & 2) != 0 ? clearFilters.size : null, (r34 & 4) != 0 ? clearFilters.isSelected : null, (r34 & 8) != 0 ? clearFilters.isDisabled : null, (r34 & 16) != 0 ? clearFilters.isClosable : null, (r34 & 32) != 0 ? clearFilters.icon : null, (r34 & 64) != 0 ? clearFilters.text : null, (r34 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? clearFilters.indicator : null, (r34 & 256) != 0 ? clearFilters.customDefaultStyle : null, (r34 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? clearFilters.customSelectedStyle : null, (r34 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? clearFilters.common : null, (r34 & 2048) != 0 ? clearFilters.closeControlSettings : null, (r34 & 4096) != 0 ? clearFilters.context : null, (r34 & 8192) != 0 ? clearFilters.isStateChangeDisabled : Boolean.TRUE, (r34 & 16384) != 0 ? clearFilters.image : null, (r34 & 32768) != 0 ? clearFilters.round : null) : null;
        TagButtonDTO hiddenFiltersCount = quickFiltersRowListDTO.getHiddenFiltersCount();
        Map<String, TokenizedTrackingInfo> viewTracking = quickFiltersRowListDTO.getViewTracking();
        Integer maxNumberOfFilterLines = quickFiltersRowListDTO.getMaxNumberOfFilterLines();
        return new QuickFiltersRowListVO(arrayList, copy2, hiddenFiltersCount, viewTracking, maxNumberOfFilterLines != null ? maxNumberOfFilterLines.intValue() : 5);
    }

    @NotNull
    public static final CopyInputVO toVO(@NotNull CopyInputDTO copyInputDTO) {
        Intrinsics.checkNotNullParameter(copyInputDTO, "<this>");
        return new CopyInputVO(copyInputDTO.getValue(), copyInputDTO.getIconName(), copyInputDTO.getCommon().toAtomAction());
    }

    @NotNull
    public static final SliderWithLabelsV2VO toVO(@NotNull SliderWithLabelsV2DTO sliderWithLabelsV2DTO, long j11) {
        Map<String, TokenizedTrackingInfo> trackingInfo;
        Intrinsics.checkNotNullParameter(sliderWithLabelsV2DTO, "<this>");
        List<SliderWithLabelsV2DTO.PointDTO> points = sliderWithLabelsV2DTO.getPoints();
        ArrayList arrayList = new ArrayList(C7714v.z(points, 10));
        Iterator<T> it = points.iterator();
        while (it.hasNext()) {
            arrayList.add(toVO((SliderWithLabelsV2DTO.PointDTO) it.next()));
        }
        int min = sliderWithLabelsV2DTO.getMin();
        int max = sliderWithLabelsV2DTO.getMax();
        int initialMinValue = sliderWithLabelsV2DTO.getInitialMinValue();
        int initialMaxValue = sliderWithLabelsV2DTO.getInitialMaxValue();
        int step = sliderWithLabelsV2DTO.getStep();
        int maxRange = sliderWithLabelsV2DTO.getMaxRange() - 1;
        SliderWithLabelsV2ViewGroup.Thumb thumb = SliderWithLabelsV2ViewGroup.Thumb.MIN;
        CommonControlSettings common = sliderWithLabelsV2DTO.getCommon();
        CommonControlSettings common2 = sliderWithLabelsV2DTO.getCommon();
        t mapToTokenizedEvent$default = (common2 == null || (trackingInfo = common2.getTrackingInfo()) == null) ? null : TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null);
        CommonControlSettings common3 = sliderWithLabelsV2DTO.getCommon();
        return new SliderWithLabelsV2VO(arrayList, min, max, initialMinValue, initialMaxValue, step, maxRange, thumb, common, mapToTokenizedEvent$default, common3 != null ? common3.toAtomAction() : null);
    }

    private static final SliderWithLabelsV2ViewGroup.Label toVO(SliderWithLabelsV2DTO.PointDTO pointDTO) {
        return new SliderWithLabelsV2ViewGroup.Label(pointDTO.getLabel(), pointDTO.getValue());
    }

    @NotNull
    public static final AirlineCustomCellVO toVO(@NotNull AirlineCustomCellDTO airlineCustomCellDTO, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(airlineCustomCellDTO, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        return new AirlineCustomCellVO(toVO(airlineCustomCellDTO.getSettings(), context), toVO(airlineCustomCellDTO.getLeftBlock(), context), toVO(airlineCustomCellDTO.getCenterBlock()), toVO(airlineCustomCellDTO.getRightBlock(), context));
    }

    private static final AirlineCustomCellVO.SettingsVO toVO(AirlineCustomCellDTO.SettingsDTO settingsDTO, Context context) {
        if (settingsDTO == null) {
            return new AirlineCustomCellVO.SettingsVO(0, 0, 0, 0, 15, null);
        }
        return new AirlineCustomCellVO.SettingsVO(ResourceExtKt.toPx(settingsDTO.getTopPadding(), context), ResourceExtKt.toPx(settingsDTO.getBottomPadding(), context), ResourceExtKt.toPx(settingsDTO.getLeftPadding(), context), ResourceExtKt.toPx(settingsDTO.getRightPadding(), context));
    }

    private static final AirlineCustomCellVO.LeftBlockVO toVO(AirlineCustomCellDTO.LeftBlockDTO leftBlockDTO, Context context) {
        if (leftBlockDTO == null) {
            return null;
        }
        return new AirlineCustomCellVO.LeftBlockVO(leftBlockDTO.getMainCarrier(), leftBlockDTO.getOperatingCarrier(), ResourceExtKt.toPx(leftBlockDTO.getRightPadding(), context));
    }

    private static final AirlineCustomCellVO.RightBlockVO toVO(AirlineCustomCellDTO.RightBlockDTO rightBlockDTO, Context context) {
        if (rightBlockDTO == null) {
            return null;
        }
        return new AirlineCustomCellVO.RightBlockVO(rightBlockDTO.getBadge(), ResourceExtKt.toPx(rightBlockDTO.getLeftPadding(), context));
    }

    private static final AirlineCustomCellVO.CenterBlockVO toVO(AirlineCustomCellDTO.CenterBlockDTO centerBlockDTO) {
        TextDTO title = centerBlockDTO.getTitle();
        title.setTagSupported(true);
        TextDTO subtitle = centerBlockDTO.getSubtitle();
        if (subtitle != null) {
            subtitle.setTagSupported(true);
        } else {
            subtitle = null;
        }
        return new AirlineCustomCellVO.CenterBlockVO(title, subtitle);
    }

    @NotNull
    public static final AsyncActionVO toVO(@NotNull AsyncActionDTO asyncActionDTO, String str) {
        Intrinsics.checkNotNullParameter(asyncActionDTO, "<this>");
        return new AsyncActionVO(toVO(asyncActionDTO.getType()), str, asyncActionDTO.getAsyncParams(), asyncActionDTO.getAction());
    }

    private static final AsyncActionVO.AsyncBehaviorType toVO(AsyncActionDTO.AsyncBehaviorType asyncBehaviorType) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[asyncBehaviorType.ordinal()];
        if (i11 == 1) {
            return AsyncActionVO.AsyncBehaviorType.UNDEFINED;
        }
        if (i11 == 2) {
            return AsyncActionVO.AsyncBehaviorType.NO_ACTION;
        }
        if (i11 == 3) {
            return AsyncActionVO.AsyncBehaviorType.FETCH_STATE;
        }
        if (i11 == 4) {
            return AsyncActionVO.AsyncBehaviorType.ACTION_STATE;
        }
        throw new o();
    }

    @NotNull
    public static final ShiftedPreviewIconsVO toVO(@NotNull ShiftedPreviewIconsDTO shiftedPreviewIconsDTO) {
        Intrinsics.checkNotNullParameter(shiftedPreviewIconsDTO, "<this>");
        return new ShiftedPreviewIconsVO(shiftedPreviewIconsDTO.getIcons(), shiftedPreviewIconsDTO.getHiddenIconsCount());
    }
}
