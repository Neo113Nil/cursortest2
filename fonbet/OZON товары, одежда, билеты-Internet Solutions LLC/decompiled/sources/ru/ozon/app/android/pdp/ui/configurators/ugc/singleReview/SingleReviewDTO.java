package ru.ozon.app.android.pdp.ui.configurators.ugc.singleReview;

import B90.C2618u;
import Cm.e;
import Co.a;
import De.C2859b;
import De.C2860c;
import Fj.c;
import G.g;
import J0.P;
import Kk.C3532b;
import Ns.b;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.islandSeparator.data.IslandSeparatorDTO;
import ru.ozon.android.composerCommonViewKit.plainText.data.PlainTextDTO;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.pdp.common.ugc.timer.TimerDTO;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewMedia.data.MediaDTO;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewProductTile.ReviewProductTileDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.video.preload.data.PreloadVideoInfo;
import ru.ozon.app.android.widgets.buttonWidget.ButtonWidgetDTO;
import ru.ozon.app.android.widgets.separator.SeparatorDTO;
import ru.ozon.moshi.adapters.serialize.collection.JsonCollectionDecoding;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonsDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageAspectRatio;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bR\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001:\u001a\u008d\u0001\u008e\u0001\u008f\u0001\u0090\u0001\u0091\u0001\u0092\u0001\u0093\u0001\u0094\u0001\u0095\u0001\u0096\u0001\u0097\u0001\u0098\u0001\u0099\u0001Bé\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000b\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000b\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u000b\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u000b\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010$\u001a\u0004\u0018\u00010%\u0012\b\u0010&\u001a\u0004\u0018\u00010'\u0012\b\u0010(\u001a\u0004\u0018\u00010)\u0012\u0014\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019\u0012\u0014\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019\u0012\b\u0010,\u001a\u0004\u0018\u00010-\u0012\b\u0010.\u001a\u0004\u0018\u00010/\u0012\u0010\b\u0001\u00100\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b\u0012\b\u00101\u001a\u0004\u0018\u000102\u0012\b\u00103\u001a\u0004\u0018\u000104\u0012\b\u00105\u001a\u0004\u0018\u000106¢\u0006\u0004\b7\u00108J\t\u0010j\u001a\u00020\u0003HÆ\u0003J\t\u0010k\u001a\u00020\u0005HÆ\u0003J\t\u0010l\u001a\u00020\u0007HÆ\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0011\u0010n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003J\u0011\u0010o\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0011\u0010q\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000bHÆ\u0003J\u0011\u0010r\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000bHÆ\u0003J\u0011\u0010s\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u000bHÆ\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u0017\u0010u\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019HÆ\u0003J\u000b\u0010v\u001a\u0004\u0018\u00010\u001cHÆ\u0003J\u000b\u0010w\u001a\u0004\u0018\u00010\u001eHÆ\u0003J\u000b\u0010x\u001a\u0004\u0018\u00010 HÆ\u0003J\u0011\u0010y\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u000bHÆ\u0003J\u0010\u0010z\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010UJ\u000b\u0010{\u001a\u0004\u0018\u00010%HÆ\u0003J\u000b\u0010|\u001a\u0004\u0018\u00010'HÆ\u0003J\u000b\u0010}\u001a\u0004\u0018\u00010)HÆ\u0003J\u0017\u0010~\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019HÆ\u0003J\u0017\u0010\u007f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019HÆ\u0003J\f\u0010\u0080\u0001\u001a\u0004\u0018\u00010-HÆ\u0003J\f\u0010\u0081\u0001\u001a\u0004\u0018\u00010/HÆ\u0003J\u0012\u0010\u0082\u0001\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000bHÆ\u0003J\f\u0010\u0083\u0001\u001a\u0004\u0018\u000102HÆ\u0003J\f\u0010\u0084\u0001\u001a\u0004\u0018\u000104HÆ\u0003J\f\u0010\u0085\u0001\u001a\u0004\u0018\u000106HÆ\u0003J¨\u0003\u0010\u0086\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000b2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000b2\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u000b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00192\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u000b2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)2\u0016\b\u0002\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00192\u0016\b\u0002\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00192\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010/2\u0010\b\u0003\u00100\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b2\n\b\u0002\u00101\u001a\u0004\u0018\u0001022\n\b\u0002\u00103\u001a\u0004\u0018\u0001042\n\b\u0002\u00105\u001a\u0004\u0018\u000106HÆ\u0001¢\u0006\u0003\u0010\u0087\u0001J\u0016\u0010\u0088\u0001\u001a\u00030\u0089\u00012\t\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010\u008b\u0001\u001a\u00020\u0003HÖ\u0001J\n\u0010\u008c\u0001\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bC\u0010BR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0019\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bF\u0010BR\u0019\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bG\u0010BR\u0019\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bH\u0010BR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\bI\u0010JR\u001f\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\bK\u0010LR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\b\n\u0000\u001a\u0004\bM\u0010NR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001e¢\u0006\b\n\u0000\u001a\u0004\bO\u0010PR\u0013\u0010\u001f\u001a\u0004\u0018\u00010 ¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010RR\u0019\u0010!\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bS\u0010BR\u0015\u0010#\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010V\u001a\u0004\bT\u0010UR\u0013\u0010$\u001a\u0004\u0018\u00010%¢\u0006\b\n\u0000\u001a\u0004\bW\u0010XR\u0013\u0010&\u001a\u0004\u0018\u00010'¢\u0006\b\n\u0000\u001a\u0004\bY\u0010ZR\u0013\u0010(\u001a\u0004\u0018\u00010)¢\u0006\b\n\u0000\u001a\u0004\b[\u0010\\R\u001f\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b]\u0010LR\u001f\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b^\u0010LR\u0013\u0010,\u001a\u0004\u0018\u00010-¢\u0006\b\n\u0000\u001a\u0004\b_\u0010`R\u0013\u0010.\u001a\u0004\u0018\u00010/¢\u0006\b\n\u0000\u001a\u0004\ba\u0010bR\u0019\u00100\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bc\u0010BR\u0013\u00101\u001a\u0004\u0018\u000102¢\u0006\b\n\u0000\u001a\u0004\bd\u0010eR\u0013\u00103\u001a\u0004\u0018\u000104¢\u0006\b\n\u0000\u001a\u0004\bf\u0010gR\u0013\u00105\u001a\u0004\u0018\u000106¢\u0006\b\n\u0000\u001a\u0004\bh\u0010i¨\u0006\u009a\u0001"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO;", "", "indent", "", "uuid", "", "productId", "", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$HeaderDTO;", "photos", "", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/data/MediaDTO;", "videos", "showReviewGalleryButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "contextQuestions", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "buttonBlocks", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$ButtonBlockDTO;", "bodySections", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$BodySectionDTO;", "showOtherReviewsButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "rateUsefulnessAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "userLikes", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$UserLikesDTO;", "actionsFooter", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$ActionsFooterDTO;", "aspects", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "reviewCollapseThreshold", "mediaCentricHeader", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$MediaCentricHeaderDTO;", "mediaCentric", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$MediaCentricDTO;", "contextReviews", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$ContextReviewsDTO;", "tileReviewTracking", "reviewExpandTrackingInfo", "translateButton", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$TranslateButtonDTO;", ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.COMMENT_FOOTER_FIELD_NAME, "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$CommentFooterDTO;", "items", "mediaPreviewCornerRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "badgeText", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$BadgeTextDTO;", "mediaImageSticker", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$MediaImageStickerDTO;", "<init>", "(ILjava/lang/String;JLru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$HeaderDTO;Ljava/util/List;Ljava/util/List;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Ljava/util/Map;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$UserLikesDTO;Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$ActionsFooterDTO;Ljava/util/List;Ljava/lang/Integer;Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$MediaCentricHeaderDTO;Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$MediaCentricDTO;Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$ContextReviewsDTO;Ljava/util/Map;Ljava/util/Map;Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$TranslateButtonDTO;Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$CommentFooterDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/common/CornerRadius;Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$BadgeTextDTO;Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$MediaImageStickerDTO;)V", "getIndent", "()I", "getUuid", "()Ljava/lang/String;", "getProductId", "()J", "getHeader", "()Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$HeaderDTO;", "getPhotos", "()Ljava/util/List;", "getVideos", "getShowReviewGalleryButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "getContextQuestions", "getButtonBlocks", "getBodySections", "getShowOtherReviewsButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getTrackingInfo", "()Ljava/util/Map;", "getRateUsefulnessAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getUserLikes", "()Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$UserLikesDTO;", "getActionsFooter", "()Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$ActionsFooterDTO;", "getAspects", "getReviewCollapseThreshold", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMediaCentricHeader", "()Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$MediaCentricHeaderDTO;", "getMediaCentric", "()Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$MediaCentricDTO;", "getContextReviews", "()Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$ContextReviewsDTO;", "getTileReviewTracking", "getReviewExpandTrackingInfo", "getTranslateButton", "()Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$TranslateButtonDTO;", "getCommentFooter", "()Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$CommentFooterDTO;", "getItems", "getMediaPreviewCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "getBadgeText", "()Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$BadgeTextDTO;", "getMediaImageSticker", "()Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$MediaImageStickerDTO;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "copy", "(ILjava/lang/String;JLru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$HeaderDTO;Ljava/util/List;Ljava/util/List;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Ljava/util/Map;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$UserLikesDTO;Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$ActionsFooterDTO;Ljava/util/List;Ljava/lang/Integer;Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$MediaCentricHeaderDTO;Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$MediaCentricDTO;Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$ContextReviewsDTO;Ljava/util/Map;Ljava/util/Map;Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$TranslateButtonDTO;Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$CommentFooterDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/common/CornerRadius;Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$BadgeTextDTO;Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$MediaImageStickerDTO;)Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO;", "equals", "", "other", "hashCode", "toString", "HeaderDTO", "ButtonBlockDTO", "BodySectionDTO", "UserLikesDTO", "ActionsFooterDTO", "FooterControlDTO", "MediaCentricHeaderDTO", "ContextReviewsDTO", "MediaCentricDTO", "TranslateButtonDTO", "CommentFooterDTO", "BadgeTextDTO", "MediaImageStickerDTO", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class SingleReviewDTO {
    public static final int $stable = 8;
    private final ActionsFooterDTO actionsFooter;
    private final List<BadgeDTO> aspects;
    private final BadgeTextDTO badgeText;
    private final List<BodySectionDTO> bodySections;
    private final List<ButtonBlockDTO> buttonBlocks;
    private final CommentFooterDTO commentFooter;
    private final List<TextAtom> contextQuestions;
    private final ContextReviewsDTO contextReviews;
    private final HeaderDTO header;
    private final int indent;
    private final List<Object> items;
    private final MediaCentricDTO mediaCentric;
    private final MediaCentricHeaderDTO mediaCentricHeader;
    private final MediaImageStickerDTO mediaImageSticker;
    private final CornerRadius mediaPreviewCornerRadius;
    private final List<MediaDTO> photos;
    private final long productId;
    private final AtomActionDTO rateUsefulnessAction;
    private final Integer reviewCollapseThreshold;
    private final Map<String, TokenizedTrackingInfo> reviewExpandTrackingInfo;
    private final ButtonV3Atom.LargeButton showOtherReviewsButton;
    private final ButtonV3Atom.LargeBorderlessButton showReviewGalleryButton;
    private final Map<String, TokenizedTrackingInfo> tileReviewTracking;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;
    private final TranslateButtonDTO translateButton;
    private final UserLikesDTO userLikes;

    @NotNull
    private final String uuid;
    private final List<MediaDTO> videos;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J7\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$ActionsFooterDTO;", "", "hasSeparator", "", "leftButtons", "", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$FooterControlDTO;", "rightButtons", "<init>", "(ZLjava/util/List;Ljava/util/List;)V", "getHasSeparator", "()Z", "getLeftButtons", "()Ljava/util/List;", "getRightButtons", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ActionsFooterDTO {
        public static final int $stable = 8;
        private final boolean hasSeparator;
        private final List<FooterControlDTO> leftButtons;
        private final List<FooterControlDTO> rightButtons;

        public ActionsFooterDTO(boolean z11, List<FooterControlDTO> list, List<FooterControlDTO> list2) {
            this.hasSeparator = z11;
            this.leftButtons = list;
            this.rightButtons = list2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ActionsFooterDTO copy$default(ActionsFooterDTO actionsFooterDTO, boolean z11, List list, List list2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z11 = actionsFooterDTO.hasSeparator;
            }
            if ((i11 & 2) != 0) {
                list = actionsFooterDTO.leftButtons;
            }
            if ((i11 & 4) != 0) {
                list2 = actionsFooterDTO.rightButtons;
            }
            return actionsFooterDTO.copy(z11, list, list2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getHasSeparator() {
            return this.hasSeparator;
        }

        public final List<FooterControlDTO> component2() {
            return this.leftButtons;
        }

        public final List<FooterControlDTO> component3() {
            return this.rightButtons;
        }

        @NotNull
        public final ActionsFooterDTO copy(boolean hasSeparator, List<FooterControlDTO> leftButtons, List<FooterControlDTO> rightButtons) {
            return new ActionsFooterDTO(hasSeparator, leftButtons, rightButtons);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ActionsFooterDTO)) {
                return false;
            }
            ActionsFooterDTO actionsFooterDTO = (ActionsFooterDTO) other;
            return this.hasSeparator == actionsFooterDTO.hasSeparator && Intrinsics.d(this.leftButtons, actionsFooterDTO.leftButtons) && Intrinsics.d(this.rightButtons, actionsFooterDTO.rightButtons);
        }

        public final boolean getHasSeparator() {
            return this.hasSeparator;
        }

        public final List<FooterControlDTO> getLeftButtons() {
            return this.leftButtons;
        }

        public final List<FooterControlDTO> getRightButtons() {
            return this.rightButtons;
        }

        public int hashCode() {
            int hashCode = Boolean.hashCode(this.hasSeparator) * 31;
            List<FooterControlDTO> list = this.leftButtons;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            List<FooterControlDTO> list2 = this.rightButtons;
            return hashCode2 + (list2 != null ? list2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            boolean z11 = this.hasSeparator;
            List<FooterControlDTO> list = this.leftButtons;
            List<FooterControlDTO> list2 = this.rightButtons;
            StringBuilder sb2 = new StringBuilder("ActionsFooterDTO(hasSeparator=");
            sb2.append(z11);
            sb2.append(", leftButtons=");
            sb2.append(list);
            sb2.append(", rightButtons=");
            return C2618u.h(sb2, list2, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$BadgeTextDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "badge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BadgeTextDTO {
        public static final int $stable = 0;

        @NotNull
        private final BadgeDTO badge;
        private final TextDTO title;

        public BadgeTextDTO(TextDTO textDTO, @NotNull BadgeDTO badge) {
            Intrinsics.checkNotNullParameter(badge, "badge");
            this.title = textDTO;
            this.badge = badge;
        }

        public static /* synthetic */ BadgeTextDTO copy$default(BadgeTextDTO badgeTextDTO, TextDTO textDTO, BadgeDTO badgeDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = badgeTextDTO.title;
            }
            if ((i11 & 2) != 0) {
                badgeDTO = badgeTextDTO.badge;
            }
            return badgeTextDTO.copy(textDTO, badgeDTO);
        }

        /* renamed from: component1, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final BadgeDTO getBadge() {
            return this.badge;
        }

        @NotNull
        public final BadgeTextDTO copy(TextDTO title, @NotNull BadgeDTO badge) {
            Intrinsics.checkNotNullParameter(badge, "badge");
            return new BadgeTextDTO(title, badge);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BadgeTextDTO)) {
                return false;
            }
            BadgeTextDTO badgeTextDTO = (BadgeTextDTO) other;
            return Intrinsics.d(this.title, badgeTextDTO.title) && Intrinsics.d(this.badge, badgeTextDTO.badge);
        }

        @NotNull
        public final BadgeDTO getBadge() {
            return this.badge;
        }

        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            TextDTO textDTO = this.title;
            return this.badge.hashCode() + ((textDTO == null ? 0 : textDTO.hashCode()) * 31);
        }

        @NotNull
        public String toString() {
            return "BadgeTextDTO(title=" + this.title + ", badge=" + this.badge + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$BodySectionDTO;", "", "descriptionAtom", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "titleAtom", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "getDescriptionAtom", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitleAtom", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BodySectionDTO {
        public static final int $stable = TextAtom.$stable;
        private final TextAtom descriptionAtom;
        private final TextAtom titleAtom;

        public BodySectionDTO(TextAtom textAtom, TextAtom textAtom2) {
            this.descriptionAtom = textAtom;
            this.titleAtom = textAtom2;
        }

        public static /* synthetic */ BodySectionDTO copy$default(BodySectionDTO bodySectionDTO, TextAtom textAtom, TextAtom textAtom2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textAtom = bodySectionDTO.descriptionAtom;
            }
            if ((i11 & 2) != 0) {
                textAtom2 = bodySectionDTO.titleAtom;
            }
            return bodySectionDTO.copy(textAtom, textAtom2);
        }

        /* renamed from: component1, reason: from getter */
        public final TextAtom getDescriptionAtom() {
            return this.descriptionAtom;
        }

        /* renamed from: component2, reason: from getter */
        public final TextAtom getTitleAtom() {
            return this.titleAtom;
        }

        @NotNull
        public final BodySectionDTO copy(TextAtom descriptionAtom, TextAtom titleAtom) {
            return new BodySectionDTO(descriptionAtom, titleAtom);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BodySectionDTO)) {
                return false;
            }
            BodySectionDTO bodySectionDTO = (BodySectionDTO) other;
            return Intrinsics.d(this.descriptionAtom, bodySectionDTO.descriptionAtom) && Intrinsics.d(this.titleAtom, bodySectionDTO.titleAtom);
        }

        public final TextAtom getDescriptionAtom() {
            return this.descriptionAtom;
        }

        public final TextAtom getTitleAtom() {
            return this.titleAtom;
        }

        public int hashCode() {
            TextAtom textAtom = this.descriptionAtom;
            int hashCode = (textAtom == null ? 0 : textAtom.hashCode()) * 31;
            TextAtom textAtom2 = this.titleAtom;
            return hashCode + (textAtom2 != null ? textAtom2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return a.a("BodySectionDTO(descriptionAtom=", this.descriptionAtom, ", titleAtom=", this.titleAtom, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0012JJ\u0010\u0018\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012¨\u0006 "}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$ButtonBlockDTO;", "", "leftButtons", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "rightButtons", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "separator", "", "<init>", "(Ljava/util/List;Ljava/util/List;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/Boolean;)V", "getLeftButtons", "()Ljava/util/List;", "getRightButtons", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSeparator", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "copy", "(Ljava/util/List;Ljava/util/List;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/Boolean;)Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$ButtonBlockDTO;", "equals", "other", "hashCode", "", "toString", "", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ButtonBlockDTO {
        public static final int $stable = 8;
        private final List<AtomDTO> leftButtons;
        private final List<AtomDTO> rightButtons;
        private final Boolean separator;
        private final TextAtom title;

        /* JADX WARN: Multi-variable type inference failed */
        public ButtonBlockDTO(List<? extends AtomDTO> list, List<? extends AtomDTO> list2, TextAtom textAtom, Boolean bool) {
            this.leftButtons = list;
            this.rightButtons = list2;
            this.title = textAtom;
            this.separator = bool;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ButtonBlockDTO copy$default(ButtonBlockDTO buttonBlockDTO, List list, List list2, TextAtom textAtom, Boolean bool, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = buttonBlockDTO.leftButtons;
            }
            if ((i11 & 2) != 0) {
                list2 = buttonBlockDTO.rightButtons;
            }
            if ((i11 & 4) != 0) {
                textAtom = buttonBlockDTO.title;
            }
            if ((i11 & 8) != 0) {
                bool = buttonBlockDTO.separator;
            }
            return buttonBlockDTO.copy(list, list2, textAtom, bool);
        }

        public final List<AtomDTO> component1() {
            return this.leftButtons;
        }

        public final List<AtomDTO> component2() {
            return this.rightButtons;
        }

        /* renamed from: component3, reason: from getter */
        public final TextAtom getTitle() {
            return this.title;
        }

        /* renamed from: component4, reason: from getter */
        public final Boolean getSeparator() {
            return this.separator;
        }

        @NotNull
        public final ButtonBlockDTO copy(List<? extends AtomDTO> leftButtons, List<? extends AtomDTO> rightButtons, TextAtom title, Boolean separator) {
            return new ButtonBlockDTO(leftButtons, rightButtons, title, separator);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ButtonBlockDTO)) {
                return false;
            }
            ButtonBlockDTO buttonBlockDTO = (ButtonBlockDTO) other;
            return Intrinsics.d(this.leftButtons, buttonBlockDTO.leftButtons) && Intrinsics.d(this.rightButtons, buttonBlockDTO.rightButtons) && Intrinsics.d(this.title, buttonBlockDTO.title) && Intrinsics.d(this.separator, buttonBlockDTO.separator);
        }

        public final List<AtomDTO> getLeftButtons() {
            return this.leftButtons;
        }

        public final List<AtomDTO> getRightButtons() {
            return this.rightButtons;
        }

        public final Boolean getSeparator() {
            return this.separator;
        }

        public final TextAtom getTitle() {
            return this.title;
        }

        public int hashCode() {
            List<AtomDTO> list = this.leftButtons;
            int hashCode = (list == null ? 0 : list.hashCode()) * 31;
            List<AtomDTO> list2 = this.rightButtons;
            int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
            TextAtom textAtom = this.title;
            int hashCode3 = (hashCode2 + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
            Boolean bool = this.separator;
            return hashCode3 + (bool != null ? bool.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            List<AtomDTO> list = this.leftButtons;
            List<AtomDTO> list2 = this.rightButtons;
            TextAtom textAtom = this.title;
            Boolean bool = this.separator;
            StringBuilder d11 = c.d("ButtonBlockDTO(leftButtons=", list, ", rightButtons=", ", title=", list2);
            d11.append(textAtom);
            d11.append(", separator=");
            d11.append(bool);
            d11.append(")");
            return d11.toString();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010$\u001a\u00020\tHÆ\u0003J\t\u0010%\u001a\u00020\u000bHÆ\u0003J\u0017\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0010HÆ\u0003Ja\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u0006/"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$CommentFooterDTO;", "", "avatarIcon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "backgroundColor", "", "commentsButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "clickAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "cornerRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "<init>", "(Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Lru/ozon/uni/atoms/data/common/CornerRadius;)V", "getAvatarIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getBackgroundColor", "()Ljava/lang/String;", "getCommentsButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getClickAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CommentFooterDTO {
        public static final int $stable = 8;

        @NotNull
        private final IconDTO avatarIcon;
        private final String backgroundColor;

        @NotNull
        private final AtomActionDTO clickAction;

        @NotNull
        private final ButtonV3DTO commentsButton;
        private final CornerRadius cornerRadius;

        @NotNull
        private final TextDTO title;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public CommentFooterDTO(@NotNull IconDTO avatarIcon, @NotNull TextDTO title, String str, @NotNull ButtonV3DTO commentsButton, @NotNull AtomActionDTO clickAction, Map<String, TokenizedTrackingInfo> map, CornerRadius cornerRadius) {
            Intrinsics.checkNotNullParameter(avatarIcon, "avatarIcon");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(commentsButton, "commentsButton");
            Intrinsics.checkNotNullParameter(clickAction, "clickAction");
            this.avatarIcon = avatarIcon;
            this.title = title;
            this.backgroundColor = str;
            this.commentsButton = commentsButton;
            this.clickAction = clickAction;
            this.trackingInfo = map;
            this.cornerRadius = cornerRadius;
        }

        public static /* synthetic */ CommentFooterDTO copy$default(CommentFooterDTO commentFooterDTO, IconDTO iconDTO, TextDTO textDTO, String str, ButtonV3DTO buttonV3DTO, AtomActionDTO atomActionDTO, Map map, CornerRadius cornerRadius, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                iconDTO = commentFooterDTO.avatarIcon;
            }
            if ((i11 & 2) != 0) {
                textDTO = commentFooterDTO.title;
            }
            if ((i11 & 4) != 0) {
                str = commentFooterDTO.backgroundColor;
            }
            if ((i11 & 8) != 0) {
                buttonV3DTO = commentFooterDTO.commentsButton;
            }
            if ((i11 & 16) != 0) {
                atomActionDTO = commentFooterDTO.clickAction;
            }
            if ((i11 & 32) != 0) {
                map = commentFooterDTO.trackingInfo;
            }
            if ((i11 & 64) != 0) {
                cornerRadius = commentFooterDTO.cornerRadius;
            }
            Map map2 = map;
            CornerRadius cornerRadius2 = cornerRadius;
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            String str2 = str;
            return commentFooterDTO.copy(iconDTO, textDTO, str2, buttonV3DTO, atomActionDTO2, map2, cornerRadius2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final IconDTO getAvatarIcon() {
            return this.avatarIcon;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final ButtonV3DTO getCommentsButton() {
            return this.commentsButton;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final AtomActionDTO getClickAction() {
            return this.clickAction;
        }

        public final Map<String, TokenizedTrackingInfo> component6() {
            return this.trackingInfo;
        }

        /* renamed from: component7, reason: from getter */
        public final CornerRadius getCornerRadius() {
            return this.cornerRadius;
        }

        @NotNull
        public final CommentFooterDTO copy(@NotNull IconDTO avatarIcon, @NotNull TextDTO title, String backgroundColor, @NotNull ButtonV3DTO commentsButton, @NotNull AtomActionDTO clickAction, Map<String, TokenizedTrackingInfo> trackingInfo, CornerRadius cornerRadius) {
            Intrinsics.checkNotNullParameter(avatarIcon, "avatarIcon");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(commentsButton, "commentsButton");
            Intrinsics.checkNotNullParameter(clickAction, "clickAction");
            return new CommentFooterDTO(avatarIcon, title, backgroundColor, commentsButton, clickAction, trackingInfo, cornerRadius);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CommentFooterDTO)) {
                return false;
            }
            CommentFooterDTO commentFooterDTO = (CommentFooterDTO) other;
            return Intrinsics.d(this.avatarIcon, commentFooterDTO.avatarIcon) && Intrinsics.d(this.title, commentFooterDTO.title) && Intrinsics.d(this.backgroundColor, commentFooterDTO.backgroundColor) && Intrinsics.d(this.commentsButton, commentFooterDTO.commentsButton) && Intrinsics.d(this.clickAction, commentFooterDTO.clickAction) && Intrinsics.d(this.trackingInfo, commentFooterDTO.trackingInfo) && this.cornerRadius == commentFooterDTO.cornerRadius;
        }

        @NotNull
        public final IconDTO getAvatarIcon() {
            return this.avatarIcon;
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final AtomActionDTO getClickAction() {
            return this.clickAction;
        }

        @NotNull
        public final ButtonV3DTO getCommentsButton() {
            return this.commentsButton;
        }

        public final CornerRadius getCornerRadius() {
            return this.cornerRadius;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int a11 = b.a(this.title, this.avatarIcon.hashCode() * 31, 31);
            String str = this.backgroundColor;
            int b11 = Ih.a.b(this.clickAction, C2859b.c(this.commentsButton, (a11 + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            int hashCode = (b11 + (map == null ? 0 : map.hashCode())) * 31;
            CornerRadius cornerRadius = this.cornerRadius;
            return hashCode + (cornerRadius != null ? cornerRadius.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            IconDTO iconDTO = this.avatarIcon;
            TextDTO textDTO = this.title;
            String str = this.backgroundColor;
            ButtonV3DTO buttonV3DTO = this.commentsButton;
            AtomActionDTO atomActionDTO = this.clickAction;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            CornerRadius cornerRadius = this.cornerRadius;
            StringBuilder i11 = Bi.b.i("CommentFooterDTO(avatarIcon=", ", title=", ", backgroundColor=", iconDTO, textDTO);
            i11.append(str);
            i11.append(", commentsButton=");
            i11.append(buttonV3DTO);
            i11.append(", clickAction=");
            Sh.b.f(i11, atomActionDTO, ", trackingInfo=", map, ", cornerRadius=");
            i11.append(cornerRadius);
            i11.append(")");
            return i11.toString();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$ContextReviewsDTO;", "", "contextReviews", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "backgroundColor", "", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getContextReviews", "()Ljava/util/List;", "getBackgroundColor", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ContextReviewsDTO {
        public static final int $stable = 8;
        private final String backgroundColor;

        @NotNull
        private final List<TextDTO> contextReviews;

        public ContextReviewsDTO(@NotNull List<TextDTO> contextReviews, String str) {
            Intrinsics.checkNotNullParameter(contextReviews, "contextReviews");
            this.contextReviews = contextReviews;
            this.backgroundColor = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ContextReviewsDTO copy$default(ContextReviewsDTO contextReviewsDTO, List list, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = contextReviewsDTO.contextReviews;
            }
            if ((i11 & 2) != 0) {
                str = contextReviewsDTO.backgroundColor;
            }
            return contextReviewsDTO.copy(list, str);
        }

        @NotNull
        public final List<TextDTO> component1() {
            return this.contextReviews;
        }

        /* renamed from: component2, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final ContextReviewsDTO copy(@NotNull List<TextDTO> contextReviews, String backgroundColor) {
            Intrinsics.checkNotNullParameter(contextReviews, "contextReviews");
            return new ContextReviewsDTO(contextReviews, backgroundColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ContextReviewsDTO)) {
                return false;
            }
            ContextReviewsDTO contextReviewsDTO = (ContextReviewsDTO) other;
            return Intrinsics.d(this.contextReviews, contextReviewsDTO.contextReviews) && Intrinsics.d(this.backgroundColor, contextReviewsDTO.backgroundColor);
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final List<TextDTO> getContextReviews() {
            return this.contextReviews;
        }

        public int hashCode() {
            int hashCode = this.contextReviews.hashCode() * 31;
            String str = this.backgroundColor;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            return Bi.b.e("ContextReviewsDTO(contextReviews=", ", backgroundColor=", this.backgroundColor, ")", this.contextReviews);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$FooterControlDTO;", "", "isSelected", "", "normal", "Lru/ozon/uni/atoms/data/controls/button/ButtonsDTO;", "selected", "<init>", "(ZLru/ozon/uni/atoms/data/controls/button/ButtonsDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonsDTO;)V", "()Z", "getNormal", "()Lru/ozon/uni/atoms/data/controls/button/ButtonsDTO;", "getSelected", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FooterControlDTO {
        public static final int $stable = ButtonsDTO.$stable;
        private final boolean isSelected;

        @NotNull
        private final ButtonsDTO normal;
        private final ButtonsDTO selected;

        public FooterControlDTO(boolean z11, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "button", type = ButtonV3DTO.class), @ProtoOneOfSignature(name = "iconButton", type = IconButtonV3DTO.class)}) @NotNull @ProtoOneOf(label = "type") ButtonsDTO normal, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "button", type = ButtonV3DTO.class), @ProtoOneOfSignature(name = "iconButton", type = IconButtonV3DTO.class)}) @ProtoOneOf(label = "type") ButtonsDTO buttonsDTO) {
            Intrinsics.checkNotNullParameter(normal, "normal");
            this.isSelected = z11;
            this.normal = normal;
            this.selected = buttonsDTO;
        }

        public static /* synthetic */ FooterControlDTO copy$default(FooterControlDTO footerControlDTO, boolean z11, ButtonsDTO buttonsDTO, ButtonsDTO buttonsDTO2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z11 = footerControlDTO.isSelected;
            }
            if ((i11 & 2) != 0) {
                buttonsDTO = footerControlDTO.normal;
            }
            if ((i11 & 4) != 0) {
                buttonsDTO2 = footerControlDTO.selected;
            }
            return footerControlDTO.copy(z11, buttonsDTO, buttonsDTO2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final ButtonsDTO getNormal() {
            return this.normal;
        }

        /* renamed from: component3, reason: from getter */
        public final ButtonsDTO getSelected() {
            return this.selected;
        }

        @NotNull
        public final FooterControlDTO copy(boolean isSelected, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "button", type = ButtonV3DTO.class), @ProtoOneOfSignature(name = "iconButton", type = IconButtonV3DTO.class)}) @NotNull @ProtoOneOf(label = "type") ButtonsDTO normal, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "button", type = ButtonV3DTO.class), @ProtoOneOfSignature(name = "iconButton", type = IconButtonV3DTO.class)}) @ProtoOneOf(label = "type") ButtonsDTO selected) {
            Intrinsics.checkNotNullParameter(normal, "normal");
            return new FooterControlDTO(isSelected, normal, selected);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FooterControlDTO)) {
                return false;
            }
            FooterControlDTO footerControlDTO = (FooterControlDTO) other;
            return this.isSelected == footerControlDTO.isSelected && Intrinsics.d(this.normal, footerControlDTO.normal) && Intrinsics.d(this.selected, footerControlDTO.selected);
        }

        @NotNull
        public final ButtonsDTO getNormal() {
            return this.normal;
        }

        public final ButtonsDTO getSelected() {
            return this.selected;
        }

        public int hashCode() {
            int hashCode = (this.normal.hashCode() + (Boolean.hashCode(this.isSelected) * 31)) * 31;
            ButtonsDTO buttonsDTO = this.selected;
            return hashCode + (buttonsDTO == null ? 0 : buttonsDTO.hashCode());
        }

        public final boolean isSelected() {
            return this.isSelected;
        }

        @NotNull
        public String toString() {
            return "FooterControlDTO(isSelected=" + this.isSelected + ", normal=" + this.normal + ", selected=" + this.selected + ")";
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u00014Bo\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0010\b\u0001\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r¢\u0006\u0004\b\u0012\u0010\u0013J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0017J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0011\u0010*\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u0011\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\rHÆ\u0003J\u0086\u0001\u0010-\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0010\b\u0003\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010.J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u00020\u0005HÖ\u0001J\t\u00103\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0019\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b#\u0010 ¨\u00065"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$HeaderDTO;", "", "avatarUrl", "", "rating", "", "subtitle", SelectionItemFormDTO.TITLE_FIELD_NAME, "variantText", "Lru/ozon/uni/atoms/data/text/TextDTO;", "externalReview", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "badges", "", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "socialHeader", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$HeaderDTO$SocialHeader;", "badgeItems", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$HeaderDTO$SocialHeader;Ljava/util/List;)V", "getAvatarUrl", "()Ljava/lang/String;", "getRating", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSubtitle", "getTitle", "getVariantText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getExternalReview", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getBadges", "()Ljava/util/List;", "getSocialHeader", "()Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$HeaderDTO$SocialHeader;", "getBadgeItems", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$HeaderDTO$SocialHeader;Ljava/util/List;)Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$HeaderDTO;", "equals", "", "other", "hashCode", "toString", "SocialHeader", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class HeaderDTO {
        public static final int $stable = 8;
        private final String avatarUrl;
        private final List<Object> badgeItems;
        private final List<BadgeDTO> badges;
        private final TextAtom externalReview;
        private final Integer rating;
        private final SocialHeader socialHeader;
        private final String subtitle;
        private final String title;
        private final TextDTO variantText;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000eJ8\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\rR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0007\u0010\u000e¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$HeaderDTO$SocialHeader;", "", "subscribe", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "subscribed", "isSubscribed", "", "isTopAuthor", "<init>", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/uni/atoms/data/dsCell/CellDTO;ZLjava/lang/Boolean;)V", "getSubscribe", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getSubscribed", "()Z", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "copy", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/uni/atoms/data/dsCell/CellDTO;ZLjava/lang/Boolean;)Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$HeaderDTO$SocialHeader;", "equals", "other", "hashCode", "", "toString", "", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SocialHeader {
            public static final int $stable = CellDTO.$stable;
            private final boolean isSubscribed;
            private final Boolean isTopAuthor;

            @NotNull
            private final CellDTO subscribe;

            @NotNull
            private final CellDTO subscribed;

            public SocialHeader(@NotNull CellDTO subscribe, @NotNull CellDTO subscribed, boolean z11, Boolean bool) {
                Intrinsics.checkNotNullParameter(subscribe, "subscribe");
                Intrinsics.checkNotNullParameter(subscribed, "subscribed");
                this.subscribe = subscribe;
                this.subscribed = subscribed;
                this.isSubscribed = z11;
                this.isTopAuthor = bool;
            }

            public static /* synthetic */ SocialHeader copy$default(SocialHeader socialHeader, CellDTO cellDTO, CellDTO cellDTO2, boolean z11, Boolean bool, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    cellDTO = socialHeader.subscribe;
                }
                if ((i11 & 2) != 0) {
                    cellDTO2 = socialHeader.subscribed;
                }
                if ((i11 & 4) != 0) {
                    z11 = socialHeader.isSubscribed;
                }
                if ((i11 & 8) != 0) {
                    bool = socialHeader.isTopAuthor;
                }
                return socialHeader.copy(cellDTO, cellDTO2, z11, bool);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final CellDTO getSubscribe() {
                return this.subscribe;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final CellDTO getSubscribed() {
                return this.subscribed;
            }

            /* renamed from: component3, reason: from getter */
            public final boolean getIsSubscribed() {
                return this.isSubscribed;
            }

            /* renamed from: component4, reason: from getter */
            public final Boolean getIsTopAuthor() {
                return this.isTopAuthor;
            }

            @NotNull
            public final SocialHeader copy(@NotNull CellDTO subscribe, @NotNull CellDTO subscribed, boolean isSubscribed, Boolean isTopAuthor) {
                Intrinsics.checkNotNullParameter(subscribe, "subscribe");
                Intrinsics.checkNotNullParameter(subscribed, "subscribed");
                return new SocialHeader(subscribe, subscribed, isSubscribed, isTopAuthor);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SocialHeader)) {
                    return false;
                }
                SocialHeader socialHeader = (SocialHeader) other;
                return Intrinsics.d(this.subscribe, socialHeader.subscribe) && Intrinsics.d(this.subscribed, socialHeader.subscribed) && this.isSubscribed == socialHeader.isSubscribed && Intrinsics.d(this.isTopAuthor, socialHeader.isTopAuthor);
            }

            @NotNull
            public final CellDTO getSubscribe() {
                return this.subscribe;
            }

            @NotNull
            public final CellDTO getSubscribed() {
                return this.subscribed;
            }

            public int hashCode() {
                int a11 = C3532b.a(Bi.b.c(this.subscribed, this.subscribe.hashCode() * 31, 31), 31, this.isSubscribed);
                Boolean bool = this.isTopAuthor;
                return a11 + (bool == null ? 0 : bool.hashCode());
            }

            public final boolean isSubscribed() {
                return this.isSubscribed;
            }

            public final Boolean isTopAuthor() {
                return this.isTopAuthor;
            }

            @NotNull
            public String toString() {
                return "SocialHeader(subscribe=" + this.subscribe + ", subscribed=" + this.subscribed + ", isSubscribed=" + this.isSubscribed + ", isTopAuthor=" + this.isTopAuthor + ")";
            }
        }

        public HeaderDTO(String str, Integer num, String str2, String str3, TextDTO textDTO, TextAtom textAtom, List<BadgeDTO> list, SocialHeader socialHeader, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(fieldName = "badge", name = "BADGE", type = BadgeDTO.class), @ProtoOneOfSignature(fieldName = "timer", name = "TIMER", type = TimerDTO.class)}) @ProtoOneOf(label = "type") List<? extends Object> list2) {
            this.avatarUrl = str;
            this.rating = num;
            this.subtitle = str2;
            this.title = str3;
            this.variantText = textDTO;
            this.externalReview = textAtom;
            this.badges = list;
            this.socialHeader = socialHeader;
            this.badgeItems = list2;
        }

        public static /* synthetic */ HeaderDTO copy$default(HeaderDTO headerDTO, String str, Integer num, String str2, String str3, TextDTO textDTO, TextAtom textAtom, List list, SocialHeader socialHeader, List list2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = headerDTO.avatarUrl;
            }
            if ((i11 & 2) != 0) {
                num = headerDTO.rating;
            }
            if ((i11 & 4) != 0) {
                str2 = headerDTO.subtitle;
            }
            if ((i11 & 8) != 0) {
                str3 = headerDTO.title;
            }
            if ((i11 & 16) != 0) {
                textDTO = headerDTO.variantText;
            }
            if ((i11 & 32) != 0) {
                textAtom = headerDTO.externalReview;
            }
            if ((i11 & 64) != 0) {
                list = headerDTO.badges;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                socialHeader = headerDTO.socialHeader;
            }
            if ((i11 & 256) != 0) {
                list2 = headerDTO.badgeItems;
            }
            SocialHeader socialHeader2 = socialHeader;
            List list3 = list2;
            TextAtom textAtom2 = textAtom;
            List list4 = list;
            TextDTO textDTO2 = textDTO;
            String str4 = str2;
            return headerDTO.copy(str, num, str4, str3, textDTO2, textAtom2, list4, socialHeader2, list3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAvatarUrl() {
            return this.avatarUrl;
        }

        /* renamed from: component2, reason: from getter */
        public final Integer getRating() {
            return this.rating;
        }

        /* renamed from: component3, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component4, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component5, reason: from getter */
        public final TextDTO getVariantText() {
            return this.variantText;
        }

        /* renamed from: component6, reason: from getter */
        public final TextAtom getExternalReview() {
            return this.externalReview;
        }

        public final List<BadgeDTO> component7() {
            return this.badges;
        }

        /* renamed from: component8, reason: from getter */
        public final SocialHeader getSocialHeader() {
            return this.socialHeader;
        }

        public final List<Object> component9() {
            return this.badgeItems;
        }

        @NotNull
        public final HeaderDTO copy(String avatarUrl, Integer rating, String subtitle, String title, TextDTO variantText, TextAtom externalReview, List<BadgeDTO> badges, SocialHeader socialHeader, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(fieldName = "badge", name = "BADGE", type = BadgeDTO.class), @ProtoOneOfSignature(fieldName = "timer", name = "TIMER", type = TimerDTO.class)}) @ProtoOneOf(label = "type") List<? extends Object> badgeItems) {
            return new HeaderDTO(avatarUrl, rating, subtitle, title, variantText, externalReview, badges, socialHeader, badgeItems);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HeaderDTO)) {
                return false;
            }
            HeaderDTO headerDTO = (HeaderDTO) other;
            return Intrinsics.d(this.avatarUrl, headerDTO.avatarUrl) && Intrinsics.d(this.rating, headerDTO.rating) && Intrinsics.d(this.subtitle, headerDTO.subtitle) && Intrinsics.d(this.title, headerDTO.title) && Intrinsics.d(this.variantText, headerDTO.variantText) && Intrinsics.d(this.externalReview, headerDTO.externalReview) && Intrinsics.d(this.badges, headerDTO.badges) && Intrinsics.d(this.socialHeader, headerDTO.socialHeader) && Intrinsics.d(this.badgeItems, headerDTO.badgeItems);
        }

        public final String getAvatarUrl() {
            return this.avatarUrl;
        }

        public final List<Object> getBadgeItems() {
            return this.badgeItems;
        }

        public final List<BadgeDTO> getBadges() {
            return this.badges;
        }

        public final TextAtom getExternalReview() {
            return this.externalReview;
        }

        public final Integer getRating() {
            return this.rating;
        }

        public final SocialHeader getSocialHeader() {
            return this.socialHeader;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final String getTitle() {
            return this.title;
        }

        public final TextDTO getVariantText() {
            return this.variantText;
        }

        public int hashCode() {
            String str = this.avatarUrl;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.rating;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str2 = this.subtitle;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.title;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            TextDTO textDTO = this.variantText;
            int hashCode5 = (hashCode4 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            TextAtom textAtom = this.externalReview;
            int hashCode6 = (hashCode5 + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
            List<BadgeDTO> list = this.badges;
            int hashCode7 = (hashCode6 + (list == null ? 0 : list.hashCode())) * 31;
            SocialHeader socialHeader = this.socialHeader;
            int hashCode8 = (hashCode7 + (socialHeader == null ? 0 : socialHeader.hashCode())) * 31;
            List<Object> list2 = this.badgeItems;
            return hashCode8 + (list2 != null ? list2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.avatarUrl;
            Integer num = this.rating;
            String str2 = this.subtitle;
            String str3 = this.title;
            TextDTO textDTO = this.variantText;
            TextAtom textAtom = this.externalReview;
            List<BadgeDTO> list = this.badges;
            SocialHeader socialHeader = this.socialHeader;
            List<Object> list2 = this.badgeItems;
            StringBuilder b11 = P.b("HeaderDTO(avatarUrl=", str, num, ", rating=", ", subtitle=");
            Nh.a.h(b11, str2, ", title=", str3, ", variantText=");
            b11.append(textDTO);
            b11.append(", externalReview=");
            b11.append(textAtom);
            b11.append(", badges=");
            b11.append(list);
            b11.append(", socialHeader=");
            b11.append(socialHeader);
            b11.append(", badgeItems=");
            return C2618u.h(b11, list2, ")");
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002!\"B9\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003JA\u0010\u0019\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR$\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006#"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$MediaCentricDTO;", "", "mediaItems", "", "products", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewProductTile/ReviewProductTileDTO;", "aspectRatio", "Lru/ozon/uni/atoms/data/image/ImageAspectRatio;", "reviewViewAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "<init>", "(Ljava/util/List;Ljava/util/List;Lru/ozon/uni/atoms/data/image/ImageAspectRatio;Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "getMediaItems", "()Ljava/util/List;", "getProducts$annotations", "()V", "getProducts", "getAspectRatio", "()Lru/ozon/uni/atoms/data/image/ImageAspectRatio;", "getReviewViewAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Image", "Video", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class MediaCentricDTO {
        public static final int $stable = 8;

        @NotNull
        private final ImageAspectRatio aspectRatio;

        @NotNull
        private final List<Object> mediaItems;
        private final List<ReviewProductTileDTO> products;
        private final AtomActionDTO reviewViewAction;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u0017\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J5\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$MediaCentricDTO$Image;", "", ImagesContract.URL, "", "clickAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getUrl", "()Ljava/lang/String;", "getClickAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Image {
            public static final int $stable = 8;

            @NotNull
            private final AtomActionDTO clickAction;
            private final Map<String, TokenizedTrackingInfo> trackingInfo;

            @NotNull
            private final String url;

            public Image(@NotNull String url, @NotNull AtomActionDTO clickAction, Map<String, TokenizedTrackingInfo> map) {
                Intrinsics.checkNotNullParameter(url, "url");
                Intrinsics.checkNotNullParameter(clickAction, "clickAction");
                this.url = url;
                this.clickAction = clickAction;
                this.trackingInfo = map;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Image copy$default(Image image, String str, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = image.url;
                }
                if ((i11 & 2) != 0) {
                    atomActionDTO = image.clickAction;
                }
                if ((i11 & 4) != 0) {
                    map = image.trackingInfo;
                }
                return image.copy(str, atomActionDTO, map);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getUrl() {
                return this.url;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final AtomActionDTO getClickAction() {
                return this.clickAction;
            }

            public final Map<String, TokenizedTrackingInfo> component3() {
                return this.trackingInfo;
            }

            @NotNull
            public final Image copy(@NotNull String url, @NotNull AtomActionDTO clickAction, Map<String, TokenizedTrackingInfo> trackingInfo) {
                Intrinsics.checkNotNullParameter(url, "url");
                Intrinsics.checkNotNullParameter(clickAction, "clickAction");
                return new Image(url, clickAction, trackingInfo);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Image)) {
                    return false;
                }
                Image image = (Image) other;
                return Intrinsics.d(this.url, image.url) && Intrinsics.d(this.clickAction, image.clickAction) && Intrinsics.d(this.trackingInfo, image.trackingInfo);
            }

            @NotNull
            public final AtomActionDTO getClickAction() {
                return this.clickAction;
            }

            public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                return this.trackingInfo;
            }

            @NotNull
            public final String getUrl() {
                return this.url;
            }

            public int hashCode() {
                int b11 = Ih.a.b(this.clickAction, this.url.hashCode() * 31, 31);
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                return b11 + (map == null ? 0 : map.hashCode());
            }

            @NotNull
            public String toString() {
                String str = this.url;
                AtomActionDTO atomActionDTO = this.clickAction;
                return T7.P.f(Ql.c.c("Image(url=", str, ", clickAction=", atomActionDTO, ", trackingInfo="), this.trackingInfo, ")");
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0003J\u0017\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0003J\u0017\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0003J}\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001f\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u001f\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019¨\u0006*"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$MediaCentricDTO$Video;", "", "video", "Lru/ozon/app/android/video/preload/data/PreloadVideoInfo;", "clickAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "preview", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "fullVideoInfo", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "videoStartTrackingInfo", "videoEndTrackingInfo", "<init>", "(Lru/ozon/app/android/video/preload/data/PreloadVideoInfo;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/app/android/video/preload/data/PreloadVideoInfo;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V", "getVideo", "()Lru/ozon/app/android/video/preload/data/PreloadVideoInfo;", "getClickAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getPreview", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getFullVideoInfo", "getTrackingInfo", "()Ljava/util/Map;", "getVideoStartTrackingInfo", "getVideoEndTrackingInfo", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Video {
            public static final int $stable = 8;

            @NotNull
            private final AtomActionDTO clickAction;
            private final PreloadVideoInfo fullVideoInfo;
            private final ImageDTO preview;
            private final Map<String, TokenizedTrackingInfo> trackingInfo;

            @NotNull
            private final PreloadVideoInfo video;
            private final Map<String, TokenizedTrackingInfo> videoEndTrackingInfo;
            private final Map<String, TokenizedTrackingInfo> videoStartTrackingInfo;

            public Video(@NotNull PreloadVideoInfo video, @NotNull AtomActionDTO clickAction, ImageDTO imageDTO, PreloadVideoInfo preloadVideoInfo, Map<String, TokenizedTrackingInfo> map, Map<String, TokenizedTrackingInfo> map2, Map<String, TokenizedTrackingInfo> map3) {
                Intrinsics.checkNotNullParameter(video, "video");
                Intrinsics.checkNotNullParameter(clickAction, "clickAction");
                this.video = video;
                this.clickAction = clickAction;
                this.preview = imageDTO;
                this.fullVideoInfo = preloadVideoInfo;
                this.trackingInfo = map;
                this.videoStartTrackingInfo = map2;
                this.videoEndTrackingInfo = map3;
            }

            public static /* synthetic */ Video copy$default(Video video, PreloadVideoInfo preloadVideoInfo, AtomActionDTO atomActionDTO, ImageDTO imageDTO, PreloadVideoInfo preloadVideoInfo2, Map map, Map map2, Map map3, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    preloadVideoInfo = video.video;
                }
                if ((i11 & 2) != 0) {
                    atomActionDTO = video.clickAction;
                }
                if ((i11 & 4) != 0) {
                    imageDTO = video.preview;
                }
                if ((i11 & 8) != 0) {
                    preloadVideoInfo2 = video.fullVideoInfo;
                }
                if ((i11 & 16) != 0) {
                    map = video.trackingInfo;
                }
                if ((i11 & 32) != 0) {
                    map2 = video.videoStartTrackingInfo;
                }
                if ((i11 & 64) != 0) {
                    map3 = video.videoEndTrackingInfo;
                }
                Map map4 = map2;
                Map map5 = map3;
                Map map6 = map;
                ImageDTO imageDTO2 = imageDTO;
                return video.copy(preloadVideoInfo, atomActionDTO, imageDTO2, preloadVideoInfo2, map6, map4, map5);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final PreloadVideoInfo getVideo() {
                return this.video;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final AtomActionDTO getClickAction() {
                return this.clickAction;
            }

            /* renamed from: component3, reason: from getter */
            public final ImageDTO getPreview() {
                return this.preview;
            }

            /* renamed from: component4, reason: from getter */
            public final PreloadVideoInfo getFullVideoInfo() {
                return this.fullVideoInfo;
            }

            public final Map<String, TokenizedTrackingInfo> component5() {
                return this.trackingInfo;
            }

            public final Map<String, TokenizedTrackingInfo> component6() {
                return this.videoStartTrackingInfo;
            }

            public final Map<String, TokenizedTrackingInfo> component7() {
                return this.videoEndTrackingInfo;
            }

            @NotNull
            public final Video copy(@NotNull PreloadVideoInfo video, @NotNull AtomActionDTO clickAction, ImageDTO preview, PreloadVideoInfo fullVideoInfo, Map<String, TokenizedTrackingInfo> trackingInfo, Map<String, TokenizedTrackingInfo> videoStartTrackingInfo, Map<String, TokenizedTrackingInfo> videoEndTrackingInfo) {
                Intrinsics.checkNotNullParameter(video, "video");
                Intrinsics.checkNotNullParameter(clickAction, "clickAction");
                return new Video(video, clickAction, preview, fullVideoInfo, trackingInfo, videoStartTrackingInfo, videoEndTrackingInfo);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Video)) {
                    return false;
                }
                Video video = (Video) other;
                return Intrinsics.d(this.video, video.video) && Intrinsics.d(this.clickAction, video.clickAction) && Intrinsics.d(this.preview, video.preview) && Intrinsics.d(this.fullVideoInfo, video.fullVideoInfo) && Intrinsics.d(this.trackingInfo, video.trackingInfo) && Intrinsics.d(this.videoStartTrackingInfo, video.videoStartTrackingInfo) && Intrinsics.d(this.videoEndTrackingInfo, video.videoEndTrackingInfo);
            }

            @NotNull
            public final AtomActionDTO getClickAction() {
                return this.clickAction;
            }

            public final PreloadVideoInfo getFullVideoInfo() {
                return this.fullVideoInfo;
            }

            public final ImageDTO getPreview() {
                return this.preview;
            }

            public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                return this.trackingInfo;
            }

            @NotNull
            public final PreloadVideoInfo getVideo() {
                return this.video;
            }

            public final Map<String, TokenizedTrackingInfo> getVideoEndTrackingInfo() {
                return this.videoEndTrackingInfo;
            }

            public final Map<String, TokenizedTrackingInfo> getVideoStartTrackingInfo() {
                return this.videoStartTrackingInfo;
            }

            public int hashCode() {
                int b11 = Ih.a.b(this.clickAction, this.video.hashCode() * 31, 31);
                ImageDTO imageDTO = this.preview;
                int hashCode = (b11 + (imageDTO == null ? 0 : imageDTO.hashCode())) * 31;
                PreloadVideoInfo preloadVideoInfo = this.fullVideoInfo;
                int hashCode2 = (hashCode + (preloadVideoInfo == null ? 0 : preloadVideoInfo.hashCode())) * 31;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                int hashCode3 = (hashCode2 + (map == null ? 0 : map.hashCode())) * 31;
                Map<String, TokenizedTrackingInfo> map2 = this.videoStartTrackingInfo;
                int hashCode4 = (hashCode3 + (map2 == null ? 0 : map2.hashCode())) * 31;
                Map<String, TokenizedTrackingInfo> map3 = this.videoEndTrackingInfo;
                return hashCode4 + (map3 != null ? map3.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                PreloadVideoInfo preloadVideoInfo = this.video;
                AtomActionDTO atomActionDTO = this.clickAction;
                ImageDTO imageDTO = this.preview;
                PreloadVideoInfo preloadVideoInfo2 = this.fullVideoInfo;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                Map<String, TokenizedTrackingInfo> map2 = this.videoStartTrackingInfo;
                Map<String, TokenizedTrackingInfo> map3 = this.videoEndTrackingInfo;
                StringBuilder sb2 = new StringBuilder("Video(video=");
                sb2.append(preloadVideoInfo);
                sb2.append(", clickAction=");
                sb2.append(atomActionDTO);
                sb2.append(", preview=");
                sb2.append(imageDTO);
                sb2.append(", fullVideoInfo=");
                sb2.append(preloadVideoInfo2);
                sb2.append(", trackingInfo=");
                Tl.b.g(sb2, map, ", videoStartTrackingInfo=", map2, ", videoEndTrackingInfo=");
                return T7.P.f(sb2, map3, ")");
            }
        }

        public MediaCentricDTO(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "image", type = Image.class), @ProtoOneOfSignature(name = "video", type = Video.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends Object> mediaItems, List<ReviewProductTileDTO> list, @NotNull ImageAspectRatio aspectRatio, AtomActionDTO atomActionDTO) {
            Intrinsics.checkNotNullParameter(mediaItems, "mediaItems");
            Intrinsics.checkNotNullParameter(aspectRatio, "aspectRatio");
            this.mediaItems = mediaItems;
            this.products = list;
            this.aspectRatio = aspectRatio;
            this.reviewViewAction = atomActionDTO;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MediaCentricDTO copy$default(MediaCentricDTO mediaCentricDTO, List list, List list2, ImageAspectRatio imageAspectRatio, AtomActionDTO atomActionDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = mediaCentricDTO.mediaItems;
            }
            if ((i11 & 2) != 0) {
                list2 = mediaCentricDTO.products;
            }
            if ((i11 & 4) != 0) {
                imageAspectRatio = mediaCentricDTO.aspectRatio;
            }
            if ((i11 & 8) != 0) {
                atomActionDTO = mediaCentricDTO.reviewViewAction;
            }
            return mediaCentricDTO.copy(list, list2, imageAspectRatio, atomActionDTO);
        }

        @JsonCollectionDecoding
        public static /* synthetic */ void getProducts$annotations() {
        }

        @NotNull
        public final List<Object> component1() {
            return this.mediaItems;
        }

        public final List<ReviewProductTileDTO> component2() {
            return this.products;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final ImageAspectRatio getAspectRatio() {
            return this.aspectRatio;
        }

        /* renamed from: component4, reason: from getter */
        public final AtomActionDTO getReviewViewAction() {
            return this.reviewViewAction;
        }

        @NotNull
        public final MediaCentricDTO copy(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "image", type = Image.class), @ProtoOneOfSignature(name = "video", type = Video.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends Object> mediaItems, List<ReviewProductTileDTO> products, @NotNull ImageAspectRatio aspectRatio, AtomActionDTO reviewViewAction) {
            Intrinsics.checkNotNullParameter(mediaItems, "mediaItems");
            Intrinsics.checkNotNullParameter(aspectRatio, "aspectRatio");
            return new MediaCentricDTO(mediaItems, products, aspectRatio, reviewViewAction);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MediaCentricDTO)) {
                return false;
            }
            MediaCentricDTO mediaCentricDTO = (MediaCentricDTO) other;
            return Intrinsics.d(this.mediaItems, mediaCentricDTO.mediaItems) && Intrinsics.d(this.products, mediaCentricDTO.products) && this.aspectRatio == mediaCentricDTO.aspectRatio && Intrinsics.d(this.reviewViewAction, mediaCentricDTO.reviewViewAction);
        }

        @NotNull
        public final ImageAspectRatio getAspectRatio() {
            return this.aspectRatio;
        }

        @NotNull
        public final List<Object> getMediaItems() {
            return this.mediaItems;
        }

        public final List<ReviewProductTileDTO> getProducts() {
            return this.products;
        }

        public final AtomActionDTO getReviewViewAction() {
            return this.reviewViewAction;
        }

        public int hashCode() {
            int hashCode = this.mediaItems.hashCode() * 31;
            List<ReviewProductTileDTO> list = this.products;
            int hashCode2 = (this.aspectRatio.hashCode() + ((hashCode + (list == null ? 0 : list.hashCode())) * 31)) * 31;
            AtomActionDTO atomActionDTO = this.reviewViewAction;
            return hashCode2 + (atomActionDTO != null ? atomActionDTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            List<Object> list = this.mediaItems;
            List<ReviewProductTileDTO> list2 = this.products;
            ImageAspectRatio imageAspectRatio = this.aspectRatio;
            AtomActionDTO atomActionDTO = this.reviewViewAction;
            StringBuilder d11 = c.d("MediaCentricDTO(mediaItems=", list, ", products=", ", aspectRatio=", list2);
            d11.append(imageAspectRatio);
            d11.append(", reviewViewAction=");
            d11.append(atomActionDTO);
            d11.append(")");
            return d11.toString();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J7\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$MediaCentricHeaderDTO;", "", "ratingIcon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "ratingValue", "Lru/ozon/uni/atoms/data/text/TextDTO;", "separator", "date", "<init>", "(Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "getRatingIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getRatingValue", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSeparator", "getDate", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MediaCentricHeaderDTO {
        public static final int $stable = IconDTO.$stable;

        @NotNull
        private final TextDTO date;
        private final IconDTO ratingIcon;
        private final TextDTO ratingValue;
        private final TextDTO separator;

        public MediaCentricHeaderDTO(IconDTO iconDTO, TextDTO textDTO, TextDTO textDTO2, @NotNull TextDTO date) {
            Intrinsics.checkNotNullParameter(date, "date");
            this.ratingIcon = iconDTO;
            this.ratingValue = textDTO;
            this.separator = textDTO2;
            this.date = date;
        }

        public static /* synthetic */ MediaCentricHeaderDTO copy$default(MediaCentricHeaderDTO mediaCentricHeaderDTO, IconDTO iconDTO, TextDTO textDTO, TextDTO textDTO2, TextDTO textDTO3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                iconDTO = mediaCentricHeaderDTO.ratingIcon;
            }
            if ((i11 & 2) != 0) {
                textDTO = mediaCentricHeaderDTO.ratingValue;
            }
            if ((i11 & 4) != 0) {
                textDTO2 = mediaCentricHeaderDTO.separator;
            }
            if ((i11 & 8) != 0) {
                textDTO3 = mediaCentricHeaderDTO.date;
            }
            return mediaCentricHeaderDTO.copy(iconDTO, textDTO, textDTO2, textDTO3);
        }

        /* renamed from: component1, reason: from getter */
        public final IconDTO getRatingIcon() {
            return this.ratingIcon;
        }

        /* renamed from: component2, reason: from getter */
        public final TextDTO getRatingValue() {
            return this.ratingValue;
        }

        /* renamed from: component3, reason: from getter */
        public final TextDTO getSeparator() {
            return this.separator;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final TextDTO getDate() {
            return this.date;
        }

        @NotNull
        public final MediaCentricHeaderDTO copy(IconDTO ratingIcon, TextDTO ratingValue, TextDTO separator, @NotNull TextDTO date) {
            Intrinsics.checkNotNullParameter(date, "date");
            return new MediaCentricHeaderDTO(ratingIcon, ratingValue, separator, date);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MediaCentricHeaderDTO)) {
                return false;
            }
            MediaCentricHeaderDTO mediaCentricHeaderDTO = (MediaCentricHeaderDTO) other;
            return Intrinsics.d(this.ratingIcon, mediaCentricHeaderDTO.ratingIcon) && Intrinsics.d(this.ratingValue, mediaCentricHeaderDTO.ratingValue) && Intrinsics.d(this.separator, mediaCentricHeaderDTO.separator) && Intrinsics.d(this.date, mediaCentricHeaderDTO.date);
        }

        @NotNull
        public final TextDTO getDate() {
            return this.date;
        }

        public final IconDTO getRatingIcon() {
            return this.ratingIcon;
        }

        public final TextDTO getRatingValue() {
            return this.ratingValue;
        }

        public final TextDTO getSeparator() {
            return this.separator;
        }

        public int hashCode() {
            IconDTO iconDTO = this.ratingIcon;
            int hashCode = (iconDTO == null ? 0 : iconDTO.hashCode()) * 31;
            TextDTO textDTO = this.ratingValue;
            int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            TextDTO textDTO2 = this.separator;
            return this.date.hashCode() + ((hashCode2 + (textDTO2 != null ? textDTO2.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            IconDTO iconDTO = this.ratingIcon;
            TextDTO textDTO = this.ratingValue;
            TextDTO textDTO2 = this.separator;
            TextDTO textDTO3 = this.date;
            StringBuilder i11 = Bi.b.i("MediaCentricHeaderDTO(ratingIcon=", ", ratingValue=", ", separator=", iconDTO, textDTO);
            i11.append(textDTO2);
            i11.append(", date=");
            i11.append(textDTO3);
            i11.append(")");
            return i11.toString();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0017\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0003J7\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$MediaImageStickerDTO;", "", "image", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "clickAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "clickTracking", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getClickAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getClickTracking", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MediaImageStickerDTO {
        public static final int $stable = 8;
        private final AtomActionDTO clickAction;
        private final Map<String, TokenizedTrackingInfo> clickTracking;

        @NotNull
        private final ImageDTO image;

        public MediaImageStickerDTO(@NotNull ImageDTO image, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(image, "image");
            this.image = image;
            this.clickAction = atomActionDTO;
            this.clickTracking = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MediaImageStickerDTO copy$default(MediaImageStickerDTO mediaImageStickerDTO, ImageDTO imageDTO, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                imageDTO = mediaImageStickerDTO.image;
            }
            if ((i11 & 2) != 0) {
                atomActionDTO = mediaImageStickerDTO.clickAction;
            }
            if ((i11 & 4) != 0) {
                map = mediaImageStickerDTO.clickTracking;
            }
            return mediaImageStickerDTO.copy(imageDTO, atomActionDTO, map);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ImageDTO getImage() {
            return this.image;
        }

        /* renamed from: component2, reason: from getter */
        public final AtomActionDTO getClickAction() {
            return this.clickAction;
        }

        public final Map<String, TokenizedTrackingInfo> component3() {
            return this.clickTracking;
        }

        @NotNull
        public final MediaImageStickerDTO copy(@NotNull ImageDTO image, AtomActionDTO clickAction, Map<String, TokenizedTrackingInfo> clickTracking) {
            Intrinsics.checkNotNullParameter(image, "image");
            return new MediaImageStickerDTO(image, clickAction, clickTracking);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MediaImageStickerDTO)) {
                return false;
            }
            MediaImageStickerDTO mediaImageStickerDTO = (MediaImageStickerDTO) other;
            return Intrinsics.d(this.image, mediaImageStickerDTO.image) && Intrinsics.d(this.clickAction, mediaImageStickerDTO.clickAction) && Intrinsics.d(this.clickTracking, mediaImageStickerDTO.clickTracking);
        }

        public final AtomActionDTO getClickAction() {
            return this.clickAction;
        }

        public final Map<String, TokenizedTrackingInfo> getClickTracking() {
            return this.clickTracking;
        }

        @NotNull
        public final ImageDTO getImage() {
            return this.image;
        }

        public int hashCode() {
            int hashCode = this.image.hashCode() * 31;
            AtomActionDTO atomActionDTO = this.clickAction;
            int hashCode2 = (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.clickTracking;
            return hashCode2 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            ImageDTO imageDTO = this.image;
            AtomActionDTO atomActionDTO = this.clickAction;
            Map<String, TokenizedTrackingInfo> map = this.clickTracking;
            StringBuilder sb2 = new StringBuilder("MediaImageStickerDTO(image=");
            sb2.append(imageDTO);
            sb2.append(", clickAction=");
            sb2.append(atomActionDTO);
            sb2.append(", clickTracking=");
            return T7.P.f(sb2, map, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0003J\u0017\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0003JW\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00072\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012¨\u0006 "}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$TranslateButtonDTO;", "", "initialButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "inProgressButton", "finalButton", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "translateErrorTrackingInfo", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/util/Map;Ljava/util/Map;)V", "getInitialButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getInProgressButton", "getFinalButton", "getTrackingInfo", "()Ljava/util/Map;", "getTranslateErrorTrackingInfo", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TranslateButtonDTO {
        public static final int $stable = 8;

        @NotNull
        private final ButtonV3DTO finalButton;

        @NotNull
        private final ButtonV3DTO inProgressButton;

        @NotNull
        private final ButtonV3DTO initialButton;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;
        private final Map<String, TokenizedTrackingInfo> translateErrorTrackingInfo;

        public TranslateButtonDTO(@NotNull ButtonV3DTO initialButton, @NotNull ButtonV3DTO inProgressButton, @NotNull ButtonV3DTO finalButton, Map<String, TokenizedTrackingInfo> map, Map<String, TokenizedTrackingInfo> map2) {
            Intrinsics.checkNotNullParameter(initialButton, "initialButton");
            Intrinsics.checkNotNullParameter(inProgressButton, "inProgressButton");
            Intrinsics.checkNotNullParameter(finalButton, "finalButton");
            this.initialButton = initialButton;
            this.inProgressButton = inProgressButton;
            this.finalButton = finalButton;
            this.trackingInfo = map;
            this.translateErrorTrackingInfo = map2;
        }

        public static /* synthetic */ TranslateButtonDTO copy$default(TranslateButtonDTO translateButtonDTO, ButtonV3DTO buttonV3DTO, ButtonV3DTO buttonV3DTO2, ButtonV3DTO buttonV3DTO3, Map map, Map map2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                buttonV3DTO = translateButtonDTO.initialButton;
            }
            if ((i11 & 2) != 0) {
                buttonV3DTO2 = translateButtonDTO.inProgressButton;
            }
            if ((i11 & 4) != 0) {
                buttonV3DTO3 = translateButtonDTO.finalButton;
            }
            if ((i11 & 8) != 0) {
                map = translateButtonDTO.trackingInfo;
            }
            if ((i11 & 16) != 0) {
                map2 = translateButtonDTO.translateErrorTrackingInfo;
            }
            Map map3 = map2;
            ButtonV3DTO buttonV3DTO4 = buttonV3DTO3;
            return translateButtonDTO.copy(buttonV3DTO, buttonV3DTO2, buttonV3DTO4, map, map3);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ButtonV3DTO getInitialButton() {
            return this.initialButton;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final ButtonV3DTO getInProgressButton() {
            return this.inProgressButton;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final ButtonV3DTO getFinalButton() {
            return this.finalButton;
        }

        public final Map<String, TokenizedTrackingInfo> component4() {
            return this.trackingInfo;
        }

        public final Map<String, TokenizedTrackingInfo> component5() {
            return this.translateErrorTrackingInfo;
        }

        @NotNull
        public final TranslateButtonDTO copy(@NotNull ButtonV3DTO initialButton, @NotNull ButtonV3DTO inProgressButton, @NotNull ButtonV3DTO finalButton, Map<String, TokenizedTrackingInfo> trackingInfo, Map<String, TokenizedTrackingInfo> translateErrorTrackingInfo) {
            Intrinsics.checkNotNullParameter(initialButton, "initialButton");
            Intrinsics.checkNotNullParameter(inProgressButton, "inProgressButton");
            Intrinsics.checkNotNullParameter(finalButton, "finalButton");
            return new TranslateButtonDTO(initialButton, inProgressButton, finalButton, trackingInfo, translateErrorTrackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TranslateButtonDTO)) {
                return false;
            }
            TranslateButtonDTO translateButtonDTO = (TranslateButtonDTO) other;
            return Intrinsics.d(this.initialButton, translateButtonDTO.initialButton) && Intrinsics.d(this.inProgressButton, translateButtonDTO.inProgressButton) && Intrinsics.d(this.finalButton, translateButtonDTO.finalButton) && Intrinsics.d(this.trackingInfo, translateButtonDTO.trackingInfo) && Intrinsics.d(this.translateErrorTrackingInfo, translateButtonDTO.translateErrorTrackingInfo);
        }

        @NotNull
        public final ButtonV3DTO getFinalButton() {
            return this.finalButton;
        }

        @NotNull
        public final ButtonV3DTO getInProgressButton() {
            return this.inProgressButton;
        }

        @NotNull
        public final ButtonV3DTO getInitialButton() {
            return this.initialButton;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public final Map<String, TokenizedTrackingInfo> getTranslateErrorTrackingInfo() {
            return this.translateErrorTrackingInfo;
        }

        public int hashCode() {
            int c11 = C2859b.c(this.finalButton, C2859b.c(this.inProgressButton, this.initialButton.hashCode() * 31, 31), 31);
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            int hashCode = (c11 + (map == null ? 0 : map.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map2 = this.translateErrorTrackingInfo;
            return hashCode + (map2 != null ? map2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            ButtonV3DTO buttonV3DTO = this.initialButton;
            ButtonV3DTO buttonV3DTO2 = this.inProgressButton;
            ButtonV3DTO buttonV3DTO3 = this.finalButton;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            Map<String, TokenizedTrackingInfo> map2 = this.translateErrorTrackingInfo;
            StringBuilder sb2 = new StringBuilder("TranslateButtonDTO(initialButton=");
            sb2.append(buttonV3DTO);
            sb2.append(", inProgressButton=");
            sb2.append(buttonV3DTO2);
            sb2.append(", finalButton=");
            sb2.append(buttonV3DTO3);
            sb2.append(", trackingInfo=");
            sb2.append(map);
            sb2.append(", translateErrorTrackingInfo=");
            return T7.P.f(sb2, map2, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0017\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bHÆ\u0003JU\u0010\u001f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\fHÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006&"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$UserLikesDTO;", "", "avatars", "", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "text", "Lru/ozon/uni/atoms/data/text/TextDTO;", "icon", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getAvatars", "()Ljava/util/List;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UserLikesDTO {
        public static final int $stable = 8;
        private final AtomActionDTO action;
        private final List<IconDTO> avatars;
        private final IconDTO icon;

        @NotNull
        private final TextDTO text;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public UserLikesDTO(List<IconDTO> list, @NotNull TextDTO text, IconDTO iconDTO, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.avatars = list;
            this.text = text;
            this.icon = iconDTO;
            this.action = atomActionDTO;
            this.trackingInfo = map;
        }

        public static /* synthetic */ UserLikesDTO copy$default(UserLikesDTO userLikesDTO, List list, TextDTO textDTO, IconDTO iconDTO, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = userLikesDTO.avatars;
            }
            if ((i11 & 2) != 0) {
                textDTO = userLikesDTO.text;
            }
            if ((i11 & 4) != 0) {
                iconDTO = userLikesDTO.icon;
            }
            if ((i11 & 8) != 0) {
                atomActionDTO = userLikesDTO.action;
            }
            if ((i11 & 16) != 0) {
                map = userLikesDTO.trackingInfo;
            }
            Map map2 = map;
            IconDTO iconDTO2 = iconDTO;
            return userLikesDTO.copy(list, textDTO, iconDTO2, atomActionDTO, map2);
        }

        public final List<IconDTO> component1() {
            return this.avatars;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextDTO getText() {
            return this.text;
        }

        /* renamed from: component3, reason: from getter */
        public final IconDTO getIcon() {
            return this.icon;
        }

        /* renamed from: component4, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Map<String, TokenizedTrackingInfo> component5() {
            return this.trackingInfo;
        }

        @NotNull
        public final UserLikesDTO copy(List<IconDTO> avatars, @NotNull TextDTO text, IconDTO icon, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new UserLikesDTO(avatars, text, icon, action, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UserLikesDTO)) {
                return false;
            }
            UserLikesDTO userLikesDTO = (UserLikesDTO) other;
            return Intrinsics.d(this.avatars, userLikesDTO.avatars) && Intrinsics.d(this.text, userLikesDTO.text) && Intrinsics.d(this.icon, userLikesDTO.icon) && Intrinsics.d(this.action, userLikesDTO.action) && Intrinsics.d(this.trackingInfo, userLikesDTO.trackingInfo);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final List<IconDTO> getAvatars() {
            return this.avatars;
        }

        public final IconDTO getIcon() {
            return this.icon;
        }

        @NotNull
        public final TextDTO getText() {
            return this.text;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            List<IconDTO> list = this.avatars;
            int a11 = b.a(this.text, (list == null ? 0 : list.hashCode()) * 31, 31);
            IconDTO iconDTO = this.icon;
            int hashCode = (a11 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
            AtomActionDTO atomActionDTO = this.action;
            int hashCode2 = (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode2 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            List<IconDTO> list = this.avatars;
            TextDTO textDTO = this.text;
            IconDTO iconDTO = this.icon;
            AtomActionDTO atomActionDTO = this.action;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder sb2 = new StringBuilder("UserLikesDTO(avatars=");
            sb2.append(list);
            sb2.append(", text=");
            sb2.append(textDTO);
            sb2.append(", icon=");
            sb2.append(iconDTO);
            sb2.append(", action=");
            sb2.append(atomActionDTO);
            sb2.append(", trackingInfo=");
            return T7.P.f(sb2, map, ")");
        }
    }

    public SingleReviewDTO(int i11, @NotNull String uuid, long j11, HeaderDTO headerDTO, List<MediaDTO> list, List<MediaDTO> list2, ButtonV3Atom.LargeBorderlessButton largeBorderlessButton, List<TextAtom> list3, List<ButtonBlockDTO> list4, List<BodySectionDTO> list5, ButtonV3Atom.LargeButton largeButton, Map<String, TokenizedTrackingInfo> map, AtomActionDTO atomActionDTO, UserLikesDTO userLikesDTO, ActionsFooterDTO actionsFooterDTO, List<BadgeDTO> list6, Integer num, MediaCentricHeaderDTO mediaCentricHeaderDTO, MediaCentricDTO mediaCentricDTO, ContextReviewsDTO contextReviewsDTO, Map<String, TokenizedTrackingInfo> map2, Map<String, TokenizedTrackingInfo> map3, TranslateButtonDTO translateButtonDTO, CommentFooterDTO commentFooterDTO, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "buttonBlocks", type = ButtonBlockDTO.class), @ProtoOneOfSignature(name = "plainText", type = PlainTextDTO.class), @ProtoOneOfSignature(name = "actionsFooter", type = ActionsFooterDTO.class), @ProtoOneOfSignature(name = "commentFooter", type = CommentFooterDTO.class), @ProtoOneOfSignature(name = "separator", type = SeparatorDTO.class), @ProtoOneOfSignature(name = "button", type = ButtonWidgetDTO.class), @ProtoOneOfSignature(name = "islandSeparator", type = IslandSeparatorDTO.class)}) @ProtoOneOf(label = "type") List<? extends Object> list7, CornerRadius cornerRadius, BadgeTextDTO badgeTextDTO, MediaImageStickerDTO mediaImageStickerDTO) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        this.indent = i11;
        this.uuid = uuid;
        this.productId = j11;
        this.header = headerDTO;
        this.photos = list;
        this.videos = list2;
        this.showReviewGalleryButton = largeBorderlessButton;
        this.contextQuestions = list3;
        this.buttonBlocks = list4;
        this.bodySections = list5;
        this.showOtherReviewsButton = largeButton;
        this.trackingInfo = map;
        this.rateUsefulnessAction = atomActionDTO;
        this.userLikes = userLikesDTO;
        this.actionsFooter = actionsFooterDTO;
        this.aspects = list6;
        this.reviewCollapseThreshold = num;
        this.mediaCentricHeader = mediaCentricHeaderDTO;
        this.mediaCentric = mediaCentricDTO;
        this.contextReviews = contextReviewsDTO;
        this.tileReviewTracking = map2;
        this.reviewExpandTrackingInfo = map3;
        this.translateButton = translateButtonDTO;
        this.commentFooter = commentFooterDTO;
        this.items = list7;
        this.mediaPreviewCornerRadius = cornerRadius;
        this.badgeText = badgeTextDTO;
        this.mediaImageSticker = mediaImageStickerDTO;
    }

    public static /* synthetic */ SingleReviewDTO copy$default(SingleReviewDTO singleReviewDTO, int i11, String str, long j11, HeaderDTO headerDTO, List list, List list2, ButtonV3Atom.LargeBorderlessButton largeBorderlessButton, List list3, List list4, List list5, ButtonV3Atom.LargeButton largeButton, Map map, AtomActionDTO atomActionDTO, UserLikesDTO userLikesDTO, ActionsFooterDTO actionsFooterDTO, List list6, Integer num, MediaCentricHeaderDTO mediaCentricHeaderDTO, MediaCentricDTO mediaCentricDTO, ContextReviewsDTO contextReviewsDTO, Map map2, Map map3, TranslateButtonDTO translateButtonDTO, CommentFooterDTO commentFooterDTO, List list7, CornerRadius cornerRadius, BadgeTextDTO badgeTextDTO, MediaImageStickerDTO mediaImageStickerDTO, int i12, Object obj) {
        MediaImageStickerDTO mediaImageStickerDTO2;
        BadgeTextDTO badgeTextDTO2;
        int i13 = (i12 & 1) != 0 ? singleReviewDTO.indent : i11;
        String str2 = (i12 & 2) != 0 ? singleReviewDTO.uuid : str;
        long j12 = (i12 & 4) != 0 ? singleReviewDTO.productId : j11;
        HeaderDTO headerDTO2 = (i12 & 8) != 0 ? singleReviewDTO.header : headerDTO;
        List list8 = (i12 & 16) != 0 ? singleReviewDTO.photos : list;
        List list9 = (i12 & 32) != 0 ? singleReviewDTO.videos : list2;
        ButtonV3Atom.LargeBorderlessButton largeBorderlessButton2 = (i12 & 64) != 0 ? singleReviewDTO.showReviewGalleryButton : largeBorderlessButton;
        List list10 = (i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? singleReviewDTO.contextQuestions : list3;
        List list11 = (i12 & 256) != 0 ? singleReviewDTO.buttonBlocks : list4;
        List list12 = (i12 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? singleReviewDTO.bodySections : list5;
        ButtonV3Atom.LargeButton largeButton2 = (i12 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? singleReviewDTO.showOtherReviewsButton : largeButton;
        Map map4 = (i12 & 2048) != 0 ? singleReviewDTO.trackingInfo : map;
        AtomActionDTO atomActionDTO2 = (i12 & 4096) != 0 ? singleReviewDTO.rateUsefulnessAction : atomActionDTO;
        int i14 = i13;
        UserLikesDTO userLikesDTO2 = (i12 & 8192) != 0 ? singleReviewDTO.userLikes : userLikesDTO;
        ActionsFooterDTO actionsFooterDTO2 = (i12 & 16384) != 0 ? singleReviewDTO.actionsFooter : actionsFooterDTO;
        List list13 = (i12 & 32768) != 0 ? singleReviewDTO.aspects : list6;
        Integer num2 = (i12 & 65536) != 0 ? singleReviewDTO.reviewCollapseThreshold : num;
        MediaCentricHeaderDTO mediaCentricHeaderDTO2 = (i12 & 131072) != 0 ? singleReviewDTO.mediaCentricHeader : mediaCentricHeaderDTO;
        MediaCentricDTO mediaCentricDTO2 = (i12 & 262144) != 0 ? singleReviewDTO.mediaCentric : mediaCentricDTO;
        ContextReviewsDTO contextReviewsDTO2 = (i12 & 524288) != 0 ? singleReviewDTO.contextReviews : contextReviewsDTO;
        Map map5 = (i12 & 1048576) != 0 ? singleReviewDTO.tileReviewTracking : map2;
        Map map6 = (i12 & 2097152) != 0 ? singleReviewDTO.reviewExpandTrackingInfo : map3;
        TranslateButtonDTO translateButtonDTO2 = (i12 & 4194304) != 0 ? singleReviewDTO.translateButton : translateButtonDTO;
        CommentFooterDTO commentFooterDTO2 = (i12 & 8388608) != 0 ? singleReviewDTO.commentFooter : commentFooterDTO;
        List list14 = (i12 & 16777216) != 0 ? singleReviewDTO.items : list7;
        CornerRadius cornerRadius2 = (i12 & 33554432) != 0 ? singleReviewDTO.mediaPreviewCornerRadius : cornerRadius;
        BadgeTextDTO badgeTextDTO3 = (i12 & 67108864) != 0 ? singleReviewDTO.badgeText : badgeTextDTO;
        if ((i12 & 134217728) != 0) {
            badgeTextDTO2 = badgeTextDTO3;
            mediaImageStickerDTO2 = singleReviewDTO.mediaImageSticker;
        } else {
            mediaImageStickerDTO2 = mediaImageStickerDTO;
            badgeTextDTO2 = badgeTextDTO3;
        }
        return singleReviewDTO.copy(i14, str2, j12, headerDTO2, list8, list9, largeBorderlessButton2, list10, list11, list12, largeButton2, map4, atomActionDTO2, userLikesDTO2, actionsFooterDTO2, list13, num2, mediaCentricHeaderDTO2, mediaCentricDTO2, contextReviewsDTO2, map5, map6, translateButtonDTO2, commentFooterDTO2, list14, cornerRadius2, badgeTextDTO2, mediaImageStickerDTO2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getIndent() {
        return this.indent;
    }

    public final List<BodySectionDTO> component10() {
        return this.bodySections;
    }

    /* renamed from: component11, reason: from getter */
    public final ButtonV3Atom.LargeButton getShowOtherReviewsButton() {
        return this.showOtherReviewsButton;
    }

    public final Map<String, TokenizedTrackingInfo> component12() {
        return this.trackingInfo;
    }

    /* renamed from: component13, reason: from getter */
    public final AtomActionDTO getRateUsefulnessAction() {
        return this.rateUsefulnessAction;
    }

    /* renamed from: component14, reason: from getter */
    public final UserLikesDTO getUserLikes() {
        return this.userLikes;
    }

    /* renamed from: component15, reason: from getter */
    public final ActionsFooterDTO getActionsFooter() {
        return this.actionsFooter;
    }

    public final List<BadgeDTO> component16() {
        return this.aspects;
    }

    /* renamed from: component17, reason: from getter */
    public final Integer getReviewCollapseThreshold() {
        return this.reviewCollapseThreshold;
    }

    /* renamed from: component18, reason: from getter */
    public final MediaCentricHeaderDTO getMediaCentricHeader() {
        return this.mediaCentricHeader;
    }

    /* renamed from: component19, reason: from getter */
    public final MediaCentricDTO getMediaCentric() {
        return this.mediaCentric;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    /* renamed from: component20, reason: from getter */
    public final ContextReviewsDTO getContextReviews() {
        return this.contextReviews;
    }

    public final Map<String, TokenizedTrackingInfo> component21() {
        return this.tileReviewTracking;
    }

    public final Map<String, TokenizedTrackingInfo> component22() {
        return this.reviewExpandTrackingInfo;
    }

    /* renamed from: component23, reason: from getter */
    public final TranslateButtonDTO getTranslateButton() {
        return this.translateButton;
    }

    /* renamed from: component24, reason: from getter */
    public final CommentFooterDTO getCommentFooter() {
        return this.commentFooter;
    }

    public final List<Object> component25() {
        return this.items;
    }

    /* renamed from: component26, reason: from getter */
    public final CornerRadius getMediaPreviewCornerRadius() {
        return this.mediaPreviewCornerRadius;
    }

    /* renamed from: component27, reason: from getter */
    public final BadgeTextDTO getBadgeText() {
        return this.badgeText;
    }

    /* renamed from: component28, reason: from getter */
    public final MediaImageStickerDTO getMediaImageSticker() {
        return this.mediaImageSticker;
    }

    /* renamed from: component3, reason: from getter */
    public final long getProductId() {
        return this.productId;
    }

    /* renamed from: component4, reason: from getter */
    public final HeaderDTO getHeader() {
        return this.header;
    }

    public final List<MediaDTO> component5() {
        return this.photos;
    }

    public final List<MediaDTO> component6() {
        return this.videos;
    }

    /* renamed from: component7, reason: from getter */
    public final ButtonV3Atom.LargeBorderlessButton getShowReviewGalleryButton() {
        return this.showReviewGalleryButton;
    }

    public final List<TextAtom> component8() {
        return this.contextQuestions;
    }

    public final List<ButtonBlockDTO> component9() {
        return this.buttonBlocks;
    }

    @NotNull
    public final SingleReviewDTO copy(int indent, @NotNull String uuid, long productId, HeaderDTO header, List<MediaDTO> photos, List<MediaDTO> videos, ButtonV3Atom.LargeBorderlessButton showReviewGalleryButton, List<TextAtom> contextQuestions, List<ButtonBlockDTO> buttonBlocks, List<BodySectionDTO> bodySections, ButtonV3Atom.LargeButton showOtherReviewsButton, Map<String, TokenizedTrackingInfo> trackingInfo, AtomActionDTO rateUsefulnessAction, UserLikesDTO userLikes, ActionsFooterDTO actionsFooter, List<BadgeDTO> aspects, Integer reviewCollapseThreshold, MediaCentricHeaderDTO mediaCentricHeader, MediaCentricDTO mediaCentric, ContextReviewsDTO contextReviews, Map<String, TokenizedTrackingInfo> tileReviewTracking, Map<String, TokenizedTrackingInfo> reviewExpandTrackingInfo, TranslateButtonDTO translateButton, CommentFooterDTO commentFooter, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "buttonBlocks", type = ButtonBlockDTO.class), @ProtoOneOfSignature(name = "plainText", type = PlainTextDTO.class), @ProtoOneOfSignature(name = "actionsFooter", type = ActionsFooterDTO.class), @ProtoOneOfSignature(name = "commentFooter", type = CommentFooterDTO.class), @ProtoOneOfSignature(name = "separator", type = SeparatorDTO.class), @ProtoOneOfSignature(name = "button", type = ButtonWidgetDTO.class), @ProtoOneOfSignature(name = "islandSeparator", type = IslandSeparatorDTO.class)}) @ProtoOneOf(label = "type") List<? extends Object> items, CornerRadius mediaPreviewCornerRadius, BadgeTextDTO badgeText, MediaImageStickerDTO mediaImageSticker) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        return new SingleReviewDTO(indent, uuid, productId, header, photos, videos, showReviewGalleryButton, contextQuestions, buttonBlocks, bodySections, showOtherReviewsButton, trackingInfo, rateUsefulnessAction, userLikes, actionsFooter, aspects, reviewCollapseThreshold, mediaCentricHeader, mediaCentric, contextReviews, tileReviewTracking, reviewExpandTrackingInfo, translateButton, commentFooter, items, mediaPreviewCornerRadius, badgeText, mediaImageSticker);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SingleReviewDTO)) {
            return false;
        }
        SingleReviewDTO singleReviewDTO = (SingleReviewDTO) other;
        return this.indent == singleReviewDTO.indent && Intrinsics.d(this.uuid, singleReviewDTO.uuid) && this.productId == singleReviewDTO.productId && Intrinsics.d(this.header, singleReviewDTO.header) && Intrinsics.d(this.photos, singleReviewDTO.photos) && Intrinsics.d(this.videos, singleReviewDTO.videos) && Intrinsics.d(this.showReviewGalleryButton, singleReviewDTO.showReviewGalleryButton) && Intrinsics.d(this.contextQuestions, singleReviewDTO.contextQuestions) && Intrinsics.d(this.buttonBlocks, singleReviewDTO.buttonBlocks) && Intrinsics.d(this.bodySections, singleReviewDTO.bodySections) && Intrinsics.d(this.showOtherReviewsButton, singleReviewDTO.showOtherReviewsButton) && Intrinsics.d(this.trackingInfo, singleReviewDTO.trackingInfo) && Intrinsics.d(this.rateUsefulnessAction, singleReviewDTO.rateUsefulnessAction) && Intrinsics.d(this.userLikes, singleReviewDTO.userLikes) && Intrinsics.d(this.actionsFooter, singleReviewDTO.actionsFooter) && Intrinsics.d(this.aspects, singleReviewDTO.aspects) && Intrinsics.d(this.reviewCollapseThreshold, singleReviewDTO.reviewCollapseThreshold) && Intrinsics.d(this.mediaCentricHeader, singleReviewDTO.mediaCentricHeader) && Intrinsics.d(this.mediaCentric, singleReviewDTO.mediaCentric) && Intrinsics.d(this.contextReviews, singleReviewDTO.contextReviews) && Intrinsics.d(this.tileReviewTracking, singleReviewDTO.tileReviewTracking) && Intrinsics.d(this.reviewExpandTrackingInfo, singleReviewDTO.reviewExpandTrackingInfo) && Intrinsics.d(this.translateButton, singleReviewDTO.translateButton) && Intrinsics.d(this.commentFooter, singleReviewDTO.commentFooter) && Intrinsics.d(this.items, singleReviewDTO.items) && this.mediaPreviewCornerRadius == singleReviewDTO.mediaPreviewCornerRadius && Intrinsics.d(this.badgeText, singleReviewDTO.badgeText) && Intrinsics.d(this.mediaImageSticker, singleReviewDTO.mediaImageSticker);
    }

    public final ActionsFooterDTO getActionsFooter() {
        return this.actionsFooter;
    }

    public final List<BadgeDTO> getAspects() {
        return this.aspects;
    }

    public final BadgeTextDTO getBadgeText() {
        return this.badgeText;
    }

    public final List<BodySectionDTO> getBodySections() {
        return this.bodySections;
    }

    public final List<ButtonBlockDTO> getButtonBlocks() {
        return this.buttonBlocks;
    }

    public final CommentFooterDTO getCommentFooter() {
        return this.commentFooter;
    }

    public final List<TextAtom> getContextQuestions() {
        return this.contextQuestions;
    }

    public final ContextReviewsDTO getContextReviews() {
        return this.contextReviews;
    }

    public final HeaderDTO getHeader() {
        return this.header;
    }

    public final int getIndent() {
        return this.indent;
    }

    public final List<Object> getItems() {
        return this.items;
    }

    public final MediaCentricDTO getMediaCentric() {
        return this.mediaCentric;
    }

    public final MediaCentricHeaderDTO getMediaCentricHeader() {
        return this.mediaCentricHeader;
    }

    public final MediaImageStickerDTO getMediaImageSticker() {
        return this.mediaImageSticker;
    }

    public final CornerRadius getMediaPreviewCornerRadius() {
        return this.mediaPreviewCornerRadius;
    }

    public final List<MediaDTO> getPhotos() {
        return this.photos;
    }

    public final long getProductId() {
        return this.productId;
    }

    public final AtomActionDTO getRateUsefulnessAction() {
        return this.rateUsefulnessAction;
    }

    public final Integer getReviewCollapseThreshold() {
        return this.reviewCollapseThreshold;
    }

    public final Map<String, TokenizedTrackingInfo> getReviewExpandTrackingInfo() {
        return this.reviewExpandTrackingInfo;
    }

    public final ButtonV3Atom.LargeButton getShowOtherReviewsButton() {
        return this.showOtherReviewsButton;
    }

    public final ButtonV3Atom.LargeBorderlessButton getShowReviewGalleryButton() {
        return this.showReviewGalleryButton;
    }

    public final Map<String, TokenizedTrackingInfo> getTileReviewTracking() {
        return this.tileReviewTracking;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public final TranslateButtonDTO getTranslateButton() {
        return this.translateButton;
    }

    public final UserLikesDTO getUserLikes() {
        return this.userLikes;
    }

    @NotNull
    public final String getUuid() {
        return this.uuid;
    }

    public final List<MediaDTO> getVideos() {
        return this.videos;
    }

    public int hashCode() {
        int a11 = Pk0.c.a(g.a(Integer.hashCode(this.indent) * 31, 31, this.uuid), 31, this.productId);
        HeaderDTO headerDTO = this.header;
        int hashCode = (a11 + (headerDTO == null ? 0 : headerDTO.hashCode())) * 31;
        List<MediaDTO> list = this.photos;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<MediaDTO> list2 = this.videos;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        ButtonV3Atom.LargeBorderlessButton largeBorderlessButton = this.showReviewGalleryButton;
        int hashCode4 = (hashCode3 + (largeBorderlessButton == null ? 0 : largeBorderlessButton.hashCode())) * 31;
        List<TextAtom> list3 = this.contextQuestions;
        int hashCode5 = (hashCode4 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<ButtonBlockDTO> list4 = this.buttonBlocks;
        int hashCode6 = (hashCode5 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<BodySectionDTO> list5 = this.bodySections;
        int hashCode7 = (hashCode6 + (list5 == null ? 0 : list5.hashCode())) * 31;
        ButtonV3Atom.LargeButton largeButton = this.showOtherReviewsButton;
        int hashCode8 = (hashCode7 + (largeButton == null ? 0 : largeButton.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode9 = (hashCode8 + (map == null ? 0 : map.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.rateUsefulnessAction;
        int hashCode10 = (hashCode9 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        UserLikesDTO userLikesDTO = this.userLikes;
        int hashCode11 = (hashCode10 + (userLikesDTO == null ? 0 : userLikesDTO.hashCode())) * 31;
        ActionsFooterDTO actionsFooterDTO = this.actionsFooter;
        int hashCode12 = (hashCode11 + (actionsFooterDTO == null ? 0 : actionsFooterDTO.hashCode())) * 31;
        List<BadgeDTO> list6 = this.aspects;
        int hashCode13 = (hashCode12 + (list6 == null ? 0 : list6.hashCode())) * 31;
        Integer num = this.reviewCollapseThreshold;
        int hashCode14 = (hashCode13 + (num == null ? 0 : num.hashCode())) * 31;
        MediaCentricHeaderDTO mediaCentricHeaderDTO = this.mediaCentricHeader;
        int hashCode15 = (hashCode14 + (mediaCentricHeaderDTO == null ? 0 : mediaCentricHeaderDTO.hashCode())) * 31;
        MediaCentricDTO mediaCentricDTO = this.mediaCentric;
        int hashCode16 = (hashCode15 + (mediaCentricDTO == null ? 0 : mediaCentricDTO.hashCode())) * 31;
        ContextReviewsDTO contextReviewsDTO = this.contextReviews;
        int hashCode17 = (hashCode16 + (contextReviewsDTO == null ? 0 : contextReviewsDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map2 = this.tileReviewTracking;
        int hashCode18 = (hashCode17 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map3 = this.reviewExpandTrackingInfo;
        int hashCode19 = (hashCode18 + (map3 == null ? 0 : map3.hashCode())) * 31;
        TranslateButtonDTO translateButtonDTO = this.translateButton;
        int hashCode20 = (hashCode19 + (translateButtonDTO == null ? 0 : translateButtonDTO.hashCode())) * 31;
        CommentFooterDTO commentFooterDTO = this.commentFooter;
        int hashCode21 = (hashCode20 + (commentFooterDTO == null ? 0 : commentFooterDTO.hashCode())) * 31;
        List<Object> list7 = this.items;
        int hashCode22 = (hashCode21 + (list7 == null ? 0 : list7.hashCode())) * 31;
        CornerRadius cornerRadius = this.mediaPreviewCornerRadius;
        int hashCode23 = (hashCode22 + (cornerRadius == null ? 0 : cornerRadius.hashCode())) * 31;
        BadgeTextDTO badgeTextDTO = this.badgeText;
        int hashCode24 = (hashCode23 + (badgeTextDTO == null ? 0 : badgeTextDTO.hashCode())) * 31;
        MediaImageStickerDTO mediaImageStickerDTO = this.mediaImageSticker;
        return hashCode24 + (mediaImageStickerDTO != null ? mediaImageStickerDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i11 = this.indent;
        String str = this.uuid;
        long j11 = this.productId;
        HeaderDTO headerDTO = this.header;
        List<MediaDTO> list = this.photos;
        List<MediaDTO> list2 = this.videos;
        ButtonV3Atom.LargeBorderlessButton largeBorderlessButton = this.showReviewGalleryButton;
        List<TextAtom> list3 = this.contextQuestions;
        List<ButtonBlockDTO> list4 = this.buttonBlocks;
        List<BodySectionDTO> list5 = this.bodySections;
        ButtonV3Atom.LargeButton largeButton = this.showOtherReviewsButton;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        AtomActionDTO atomActionDTO = this.rateUsefulnessAction;
        UserLikesDTO userLikesDTO = this.userLikes;
        ActionsFooterDTO actionsFooterDTO = this.actionsFooter;
        List<BadgeDTO> list6 = this.aspects;
        Integer num = this.reviewCollapseThreshold;
        MediaCentricHeaderDTO mediaCentricHeaderDTO = this.mediaCentricHeader;
        MediaCentricDTO mediaCentricDTO = this.mediaCentric;
        ContextReviewsDTO contextReviewsDTO = this.contextReviews;
        Map<String, TokenizedTrackingInfo> map2 = this.tileReviewTracking;
        Map<String, TokenizedTrackingInfo> map3 = this.reviewExpandTrackingInfo;
        TranslateButtonDTO translateButtonDTO = this.translateButton;
        CommentFooterDTO commentFooterDTO = this.commentFooter;
        List<Object> list7 = this.items;
        CornerRadius cornerRadius = this.mediaPreviewCornerRadius;
        BadgeTextDTO badgeTextDTO = this.badgeText;
        MediaImageStickerDTO mediaImageStickerDTO = this.mediaImageSticker;
        StringBuilder g10 = e.g(i11, "SingleReviewDTO(indent=", ", uuid=", str, ", productId=");
        g10.append(j11);
        g10.append(", header=");
        g10.append(headerDTO);
        C2860c.g(", photos=", ", videos=", g10, list, list2);
        g10.append(", showReviewGalleryButton=");
        g10.append(largeBorderlessButton);
        g10.append(", contextQuestions=");
        g10.append(list3);
        C2860c.g(", buttonBlocks=", ", bodySections=", g10, list4, list5);
        g10.append(", showOtherReviewsButton=");
        g10.append(largeButton);
        g10.append(", trackingInfo=");
        g10.append(map);
        g10.append(", rateUsefulnessAction=");
        g10.append(atomActionDTO);
        g10.append(", userLikes=");
        g10.append(userLikesDTO);
        g10.append(", actionsFooter=");
        g10.append(actionsFooterDTO);
        g10.append(", aspects=");
        g10.append(list6);
        g10.append(", reviewCollapseThreshold=");
        g10.append(num);
        g10.append(", mediaCentricHeader=");
        g10.append(mediaCentricHeaderDTO);
        g10.append(", mediaCentric=");
        g10.append(mediaCentricDTO);
        g10.append(", contextReviews=");
        g10.append(contextReviewsDTO);
        g10.append(", tileReviewTracking=");
        g10.append(map2);
        g10.append(", reviewExpandTrackingInfo=");
        g10.append(map3);
        g10.append(", translateButton=");
        g10.append(translateButtonDTO);
        g10.append(", commentFooter=");
        g10.append(commentFooterDTO);
        g10.append(", items=");
        g10.append(list7);
        g10.append(", mediaPreviewCornerRadius=");
        g10.append(cornerRadius);
        g10.append(", badgeText=");
        g10.append(badgeTextDTO);
        g10.append(", mediaImageSticker=");
        g10.append(mediaImageStickerDTO);
        g10.append(")");
        return g10.toString();
    }
}
