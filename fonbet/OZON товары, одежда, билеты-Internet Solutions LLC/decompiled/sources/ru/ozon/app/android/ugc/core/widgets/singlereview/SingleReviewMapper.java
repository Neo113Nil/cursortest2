package ru.ozon.app.android.ugc.core.widgets.singlereview;

import Tc.b;
import WZ.t;
import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.utils.CharSequenceExtensionKt;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewMedia.data.ReviewsMediaMapper;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewMedia.presentation.MediaViewType;
import ru.ozon.app.android.pdp.ui.configurators.ugc.singleReview.SingleReviewDTO;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.ugc.core.R$dimen;
import ru.ozon.app.android.ugc.core.R$string;
import ru.ozon.app.android.ugc.core.widgets.singlereview.SingleReviewVO;
import ru.ozon.app.android.ugc.core.widgets.singlereview.gallery.widgets.common.ext.SingleReviewGalleryType;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.v3.mappers.TextMapperKt;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u0000 12*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u00011B\u0019\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0010\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\r*\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0016\u001a\u00020\u0015*\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0016\u001a\u00020\u0019*\u00020\u0018H\u0002¢\u0006\u0004\b\u0016\u0010\u001aJ&\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ9\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020 0\u0004*\b\u0012\u0004\u0012\u00020\u001f0\u00042\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u00042\b\u0010#\u001a\u0004\u0018\u00010\"H\u0000¢\u0006\u0004\b$\u0010%J+\u0010)\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u0004*\b\u0012\u0004\u0012\u00020 0\u00042\b\u0010&\u001a\u0004\u0018\u00010\u000fH\u0000¢\u0006\u0004\b'\u0010(R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010*R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010+R\u0014\u0010,\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00062"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/SingleReviewMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/SingleReviewDO;", "Ll20/d;", "", "Lru/ozon/app/android/ugc/core/widgets/singlereview/SingleReviewVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/data/ReviewsMediaMapper;", "reviewsMediaMapper", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/data/ReviewsMediaMapper;)V", "", "hasItems", "", "getBottomMargin", "(Lru/ozon/app/android/ugc/core/widgets/singlereview/SingleReviewDO;Z)I", "hasFloor", "(Lru/ozon/app/android/ugc/core/widgets/singlereview/SingleReviewDO;)Z", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$HeaderDTO;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/SingleReviewVO$HeaderVO;", "toVO", "(Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$HeaderDTO;)Lru/ozon/app/android/ugc/core/widgets/singlereview/SingleReviewVO$HeaderVO;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$HeaderDTO$SocialHeader;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/SingleReviewVO$SocialHeaderVO;", "(Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$HeaderDTO$SocialHeader;)Lru/ozon/app/android/ugc/core/widgets/singlereview/SingleReviewVO$SocialHeaderVO;", "dto", "widgetInfo", "invoke", "(Lru/ozon/app/android/ugc/core/widgets/singlereview/SingleReviewDO;Ll20/d;)Ljava/util/List;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$BodySectionDTO;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "contextQuestions", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$MediaCentricHeaderDTO;", "mediaCentricHeader", "toVO$core_prodGoogleAllVendorsRelease", "(Ljava/util/List;Ljava/util/List;Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$MediaCentricHeaderDTO;)Ljava/util/List;", "reviewCollapseThreshold", "makeCollapsedMessage$core_prodGoogleAllVendorsRelease", "(Ljava/util/List;Ljava/lang/Integer;)Ljava/util/List;", "makeCollapsedMessage", "Landroid/content/Context;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/data/ReviewsMediaMapper;", "commentMargin", "I", "", "moreText", "Ljava/lang/String;", "Companion", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SingleReviewMapper implements Function2<SingleReviewDO, d, List<? extends SingleReviewVO>> {
    private static final int bottomMargin;
    private static final int topMargin;
    private final int commentMargin;

    @NotNull
    private final Context context;

    @NotNull
    private final String moreText;

    @NotNull
    private final ReviewsMediaMapper reviewsMediaMapper;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/SingleReviewMapper$Companion;", "", "<init>", "()V", "", "TEXT_DEFAULT_LIMIT", "I", "TEXT_LIMIT_INCREASE_THRESHOLD", "TEXT_LIMIT_INCREASE", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Dimens dimens = Dimens.INSTANCE;
        topMargin = dimens.getDP_12();
        bottomMargin = dimens.getDP_16();
    }

    public SingleReviewMapper(@NotNull Context context, @NotNull ReviewsMediaMapper reviewsMediaMapper) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(reviewsMediaMapper, "reviewsMediaMapper");
        this.context = context;
        this.reviewsMediaMapper = reviewsMediaMapper;
        this.commentMargin = context.getResources().getDimensionPixelOffset(R$dimen.comment_margin);
        String lowerCase = StringProvider.getString(R$string.common_more).toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        this.moreText = lowerCase;
    }

    private final int getBottomMargin(SingleReviewDO singleReviewDO, boolean z11) {
        if (singleReviewDO.getUserLikes() == null && singleReviewDO.getActionsFooter() != null) {
            return bottomMargin;
        }
        if (z11 || hasFloor(singleReviewDO) || singleReviewDO.getGalleryType() != SingleReviewGalleryType.EMPTY) {
            return 0;
        }
        return bottomMargin;
    }

    private final boolean hasFloor(SingleReviewDO singleReviewDO) {
        return (singleReviewDO.getButtonBlocks() == null && singleReviewDO.getShowOtherReviewsButton() == null && singleReviewDO.getUserLikes() == null && singleReviewDO.getAspects() == null && singleReviewDO.getContextReviews() == null) ? false : true;
    }

    private final SingleReviewVO.HeaderVO toVO(SingleReviewDTO.HeaderDTO headerDTO) {
        Integer rating = headerDTO.getRating();
        String title = headerDTO.getTitle();
        String subtitle = headerDTO.getSubtitle();
        String avatarUrl = headerDTO.getAvatarUrl();
        TextDTO variantText = headerDTO.getVariantText();
        TextDTO copy$default = variantText != null ? TextDTO.copy$default(variantText, null, null, null, null, null, null, null, null, null, null, null, null, null, true, null, null, null, null, null, 516095, null) : null;
        TextAtom externalReview = headerDTO.getExternalReview();
        TextDTO dsTextAtom$default = externalReview != null ? TextMapperKt.dsTextAtom$default(externalReview, null, null, null, null, null, null, null, null, null, null, null, true, 2047, null) : null;
        SingleReviewDTO.HeaderDTO.SocialHeader socialHeader = headerDTO.getSocialHeader();
        return new SingleReviewVO.HeaderVO(avatarUrl, rating, title, subtitle, copy$default, dsTextAtom$default, socialHeader != null ? toVO(socialHeader) : null, headerDTO.getBadges());
    }

    public final List<TextAtom> makeCollapsedMessage$core_prodGoogleAllVendorsRelease(@NotNull List<TextAtom> list, Integer num) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        int intValue = num != null ? num.intValue() : 400;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        boolean z11 = true;
        while (true) {
            TextAtom textAtom = null;
            if (!it.hasNext()) {
                break;
            }
            TextAtom textAtom2 = (TextAtom) it.next();
            if (z11) {
                if (textAtom2.getText().length() > intValue) {
                    textAtom = TextAtom.copy$default(textAtom2, CharSequenceExtensionKt.ellipsize(textAtom2.getText(), this.context, intValue, this.moreText), null, null, null, null, null, null, 126, null);
                    z11 = false;
                } else {
                    textAtom = textAtom2;
                }
                intValue -= textAtom2.getText().length();
                if (intValue < 10) {
                    intValue += 50;
                }
            }
            if (textAtom != null) {
                arrayList.add(textAtom);
            }
        }
        if (z11) {
            return null;
        }
        return arrayList;
    }

    @NotNull
    public final List<TextAtom> toVO$core_prodGoogleAllVendorsRelease(@NotNull List<SingleReviewDTO.BodySectionDTO> list, List<TextAtom> list2, SingleReviewDTO.MediaCentricHeaderDTO mediaCentricHeaderDTO) {
        OzonSpannableString text;
        TextAtom descriptionAtom;
        OzonSpannableString text2;
        Intrinsics.checkNotNullParameter(list, "<this>");
        b builder = new b(list.size() * 2);
        if (list2 != null) {
            builder.addAll(list2);
        }
        int i11 = 0;
        for (Object obj : list) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            SingleReviewDTO.BodySectionDTO bodySectionDTO = (SingleReviewDTO.BodySectionDTO) obj;
            TextAtom titleAtom = bodySectionDTO.getTitleAtom();
            if (titleAtom != null && (text = titleAtom.getText()) != null && (!h.K(text)) && (descriptionAtom = bodySectionDTO.getDescriptionAtom()) != null && (text2 = descriptionAtom.getText()) != null && (!h.K(text2))) {
                TextAtom titleAtom2 = bodySectionDTO.getTitleAtom();
                if (titleAtom2 != null) {
                    TextAtom copy$default = TextAtom.copy$default(titleAtom2, null, null, null, null, (mediaCentricHeaderDTO == null || i11 != 0) ? "bold" : "after_media_centric", null, null, 111, null);
                    if (copy$default != null) {
                        builder.add(copy$default);
                    }
                }
                TextAtom descriptionAtom2 = bodySectionDTO.getDescriptionAtom();
                if (descriptionAtom2 != null) {
                    builder.add(descriptionAtom2);
                }
            }
            i11 = i12;
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.B();
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<SingleReviewVO> invoke(@NotNull SingleReviewDO dto, @NotNull d widgetInfo) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        List<SingleReviewDTO.BodySectionDTO> bodySections = dto.getBodySections();
        List<TextAtom> vO$core_prodGoogleAllVendorsRelease = bodySections != null ? toVO$core_prodGoogleAllVendorsRelease(bodySections, dto.getContextQuestions(), dto.getMediaCentricHeader()) : null;
        if (vO$core_prodGoogleAllVendorsRelease == null) {
            vO$core_prodGoogleAllVendorsRelease = K.f71697a;
        }
        List<TextAtom> makeCollapsedMessage$core_prodGoogleAllVendorsRelease = makeCollapsedMessage$core_prodGoogleAllVendorsRelease(vO$core_prodGoogleAllVendorsRelease, dto.getReviewCollapseThreshold());
        long hashCode = dto.getUuid().hashCode();
        SingleReviewDTO.HeaderDTO header = dto.getHeader();
        SingleReviewVO.HeaderVO vo = header != null ? toVO(header) : null;
        List<TextAtom> list = vO$core_prodGoogleAllVendorsRelease;
        ArrayList arrayList2 = new ArrayList(C7714v.z(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(TextMapperKt.dsTextAtom$default((TextAtom) it.next(), null, null, null, null, null, null, null, null, null, null, null, true, 2047, null));
        }
        if (makeCollapsedMessage$core_prodGoogleAllVendorsRelease != null) {
            List<TextAtom> list2 = makeCollapsedMessage$core_prodGoogleAllVendorsRelease;
            ArrayList arrayList3 = new ArrayList(C7714v.z(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(TextMapperKt.dsTextAtom$default((TextAtom) it2.next(), null, null, null, null, null, null, null, null, null, null, null, true, 2047, null));
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        int i11 = dto.getIndent() == 0 ? 0 : this.commentMargin;
        int i12 = dto.getContextQuestions() != null ? topMargin : 0;
        int bottomMargin2 = getBottomMargin(dto, dto.getHasItems());
        K k11 = K.f71697a;
        MediaViewType mediaViewType = this.reviewsMediaMapper.getMediaViewType(dto.getPhotos(), dto.getVideos());
        ButtonV3Atom.LargeBorderlessButton showReviewGalleryButton = dto.getShowReviewGalleryButton();
        Integer reviewCollapseThreshold = dto.getReviewCollapseThreshold();
        List<TextAtom> contextQuestions = dto.getContextQuestions();
        SingleReviewDTO.MediaCentricHeaderDTO mediaCentricHeader = dto.getMediaCentricHeader();
        Map<String, TokenizedTrackingInfo> trackingInfo = dto.getTrackingInfo();
        t tokenizedEvent$default = trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null;
        Map<String, TokenizedTrackingInfo> tileReviewTracking = dto.getTileReviewTracking();
        t tokenizedEvent$default2 = tileReviewTracking != null ? TrackingInfoMapperKt.toTokenizedEvent$default(tileReviewTracking, Long.valueOf(hashCode), null, 2, null) : null;
        Map<String, TokenizedTrackingInfo> reviewExpandTrackingInfo = dto.getReviewExpandTrackingInfo();
        return C7714v.a0(new SingleReviewVO(hashCode, vo, arrayList2, arrayList, k11, showReviewGalleryButton, mediaViewType, i11, i12, bottomMargin2, reviewCollapseThreshold, contextQuestions, mediaCentricHeader, tokenizedEvent$default, tokenizedEvent$default2, reviewExpandTrackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(reviewExpandTrackingInfo, Long.valueOf(hashCode), null, 2, null) : null, dto.getMediaPreviewCornerRadius()));
    }

    private final SingleReviewVO.SocialHeaderVO toVO(SingleReviewDTO.HeaderDTO.SocialHeader socialHeader) {
        return new SingleReviewVO.SocialHeaderVO(socialHeader.getSubscribe(), socialHeader.getSubscribed(), socialHeader.isSubscribed());
    }
}
