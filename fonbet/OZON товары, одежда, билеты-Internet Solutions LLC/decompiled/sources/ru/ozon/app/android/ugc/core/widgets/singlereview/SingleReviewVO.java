package ru.ozon.app.android.ugc.core.widgets.singlereview;

import B0.A0;
import B0.C2454a;
import B3.p;
import Bi.b;
import D40.d;
import De.C2860c;
import G.g;
import J0.P;
import Nh.a;
import WZ.t;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import m10.InterfaceC8039a;
import m10.m;
import m10.o;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewMedia.presentation.MediaVO;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewMedia.presentation.MediaViewType;
import ru.ozon.app.android.pdp.ui.configurators.ugc.singleReview.SingleReviewDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b,\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0002XYBÁ\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0001\u0010\u0016\u001a\u00020\u0014\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0014\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0014\u0012\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\n\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001d\u0012\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b#\u0010$Jæ\u0001\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\n2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0003\u0010\u0015\u001a\u00020\u00142\b\b\u0003\u0010\u0016\u001a\u00020\u00142\b\b\u0003\u0010\u0017\u001a\u00020\u00142\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00142\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\n2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b/\u00100R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b2\u00103R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b5\u00106R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\f\u00107\u001a\u0004\b8\u00109R\u001f\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\r\u00107\u001a\u0004\b:\u00109R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\n8\u0006¢\u0006\f\n\u0004\b\u000f\u00107\u001a\u0004\b;\u00109R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010<\u001a\u0004\b=\u0010>R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010B\u001a\u0004\bC\u0010+R\u0017\u0010\u0016\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0016\u0010B\u001a\u0004\bD\u0010+R\u0017\u0010\u0017\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0017\u0010B\u001a\u0004\bE\u0010+R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0018\u0010F\u001a\u0004\bG\u0010HR\u001f\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u001a\u00107\u001a\u0004\bI\u00109R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010J\u001a\u0004\bK\u0010LR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010M\u001a\u0004\bN\u0010OR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\b\u001f\u0010M\u001a\u0004\bP\u0010OR\u0019\u0010 \u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\b \u0010M\u001a\u0004\bQ\u0010OR\u0019\u0010\"\u001a\u0004\u0018\u00010!8\u0006¢\u0006\f\n\u0004\b\"\u0010R\u001a\u0004\bS\u0010TR\u001a\u0010U\u001a\u00020'8\u0016X\u0096D¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010)¨\u0006Z"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/SingleReviewVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "Lm10/a;", "Lm10/m;", "Lm10/o;", "", "id", "Lru/ozon/app/android/ugc/core/widgets/singlereview/SingleReviewVO$HeaderVO;", CommentV3DTO.HEADER_FIELD_NAME, "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "bodyAtoms", "bodyCollapsedAtoms", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/presentation/MediaVO;", "mediaList", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "showMoreButton", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/presentation/MediaViewType;", "viewType", "", "leftMargin", "topMargin", "bottomMargin", "reviewCollapseThreshold", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "contextQuestions", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$MediaCentricHeaderDTO;", "mediaCentricHeader", "LWZ/t;", "tokenizedEvent", "tileReviewTokenizedEvent", "reviewExpandTokenizedEvent", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "mediaPreviewCornerRadius", "<init>", "(JLru/ozon/app/android/ugc/core/widgets/singlereview/SingleReviewVO$HeaderVO;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/presentation/MediaViewType;IIILjava/lang/Integer;Ljava/util/List;Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$MediaCentricHeaderDTO;LWZ/t;LWZ/t;LWZ/t;Lru/ozon/uni/atoms/data/common/CornerRadius;)V", "copy", "(JLru/ozon/app/android/ugc/core/widgets/singlereview/SingleReviewVO$HeaderVO;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/presentation/MediaViewType;IIILjava/lang/Integer;Ljava/util/List;Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$MediaCentricHeaderDTO;LWZ/t;LWZ/t;LWZ/t;Lru/ozon/uni/atoms/data/common/CornerRadius;)Lru/ozon/app/android/ugc/core/widgets/singlereview/SingleReviewVO;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/ugc/core/widgets/singlereview/SingleReviewVO$HeaderVO;", "getHeader", "()Lru/ozon/app/android/ugc/core/widgets/singlereview/SingleReviewVO$HeaderVO;", "Ljava/util/List;", "getBodyAtoms", "()Ljava/util/List;", "getBodyCollapsedAtoms", "getMediaList", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "getShowMoreButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/presentation/MediaViewType;", "getViewType", "()Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/presentation/MediaViewType;", "I", "getLeftMargin", "getTopMargin", "getBottomMargin", "Ljava/lang/Integer;", "getReviewCollapseThreshold", "()Ljava/lang/Integer;", "getContextQuestions", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$MediaCentricHeaderDTO;", "getMediaCentricHeader", "()Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$MediaCentricHeaderDTO;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "getTileReviewTokenizedEvent", "getReviewExpandTokenizedEvent", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "getMediaPreviewCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "widgetName", "Ljava/lang/String;", "getWidgetName", "HeaderVO", "SocialHeaderVO", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SingleReviewVO implements c, InterfaceC8039a, m, o {

    @NotNull
    private final List<TextDTO> bodyAtoms;
    private final List<TextDTO> bodyCollapsedAtoms;
    private final int bottomMargin;
    private final List<TextAtom> contextQuestions;
    private final HeaderVO header;
    private final long id;
    private final int leftMargin;
    private final SingleReviewDTO.MediaCentricHeaderDTO mediaCentricHeader;

    @NotNull
    private final List<MediaVO> mediaList;
    private final CornerRadius mediaPreviewCornerRadius;
    private final Integer reviewCollapseThreshold;
    private final t reviewExpandTokenizedEvent;
    private final ButtonV3Atom.LargeBorderlessButton showMoreButton;
    private final t tileReviewTokenizedEvent;
    private final t tokenizedEvent;
    private final int topMargin;

    @NotNull
    private final MediaViewType viewType;

    @NotNull
    private final String widgetName;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001f\u0010\u0013R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b \u0010\u0013R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b$\u0010#R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b&\u0010'R\u001f\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/SingleReviewVO$HeaderVO;", "", "", "avatarUrl", "", "rating", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "Lru/ozon/uni/atoms/data/text/TextDTO;", "variantText", "externalReview", "Lru/ozon/app/android/ugc/core/widgets/singlereview/SingleReviewVO$SocialHeaderVO;", "socialHeader", "", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badges", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/ugc/core/widgets/singlereview/SingleReviewVO$SocialHeaderVO;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAvatarUrl", "Ljava/lang/Integer;", "getRating", "()Ljava/lang/Integer;", "getTitle", "getSubtitle", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getVariantText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getExternalReview", "Lru/ozon/app/android/ugc/core/widgets/singlereview/SingleReviewVO$SocialHeaderVO;", "getSocialHeader", "()Lru/ozon/app/android/ugc/core/widgets/singlereview/SingleReviewVO$SocialHeaderVO;", "Ljava/util/List;", "getBadges", "()Ljava/util/List;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class HeaderVO {
        private final String avatarUrl;
        private final List<BadgeDTO> badges;
        private final TextDTO externalReview;
        private final Integer rating;
        private final SocialHeaderVO socialHeader;
        private final String subtitle;
        private final String title;
        private final TextDTO variantText;

        public HeaderVO(String str, Integer num, String str2, String str3, TextDTO textDTO, TextDTO textDTO2, SocialHeaderVO socialHeaderVO, List<BadgeDTO> list) {
            this.avatarUrl = str;
            this.rating = num;
            this.title = str2;
            this.subtitle = str3;
            this.variantText = textDTO;
            this.externalReview = textDTO2;
            this.socialHeader = socialHeaderVO;
            this.badges = list;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HeaderVO)) {
                return false;
            }
            HeaderVO headerVO = (HeaderVO) other;
            return Intrinsics.d(this.avatarUrl, headerVO.avatarUrl) && Intrinsics.d(this.rating, headerVO.rating) && Intrinsics.d(this.title, headerVO.title) && Intrinsics.d(this.subtitle, headerVO.subtitle) && Intrinsics.d(this.variantText, headerVO.variantText) && Intrinsics.d(this.externalReview, headerVO.externalReview) && Intrinsics.d(this.socialHeader, headerVO.socialHeader) && Intrinsics.d(this.badges, headerVO.badges);
        }

        public int hashCode() {
            String str = this.avatarUrl;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.rating;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str2 = this.title;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.subtitle;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            TextDTO textDTO = this.variantText;
            int hashCode5 = (hashCode4 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            TextDTO textDTO2 = this.externalReview;
            int hashCode6 = (hashCode5 + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
            SocialHeaderVO socialHeaderVO = this.socialHeader;
            int hashCode7 = (hashCode6 + (socialHeaderVO == null ? 0 : socialHeaderVO.hashCode())) * 31;
            List<BadgeDTO> list = this.badges;
            return hashCode7 + (list != null ? list.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.avatarUrl;
            Integer num = this.rating;
            String str2 = this.title;
            String str3 = this.subtitle;
            TextDTO textDTO = this.variantText;
            TextDTO textDTO2 = this.externalReview;
            SocialHeaderVO socialHeaderVO = this.socialHeader;
            List<BadgeDTO> list = this.badges;
            StringBuilder b11 = P.b("HeaderVO(avatarUrl=", str, num, ", rating=", ", title=");
            a.h(b11, str2, ", subtitle=", str3, ", variantText=");
            d.e(", externalReview=", ", socialHeader=", b11, textDTO, textDTO2);
            b11.append(socialHeaderVO);
            b11.append(", badges=");
            b11.append(list);
            b11.append(")");
            return b11.toString();
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0006\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/SingleReviewVO$SocialHeaderVO;", "", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "subscribe", "subscribed", "", "isSubscribed", "<init>", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getSubscribe", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getSubscribed", "Z", "()Z", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SocialHeaderVO {
        public static final int $stable = CellDTO.$stable;
        private final boolean isSubscribed;

        @NotNull
        private final CellDTO subscribe;

        @NotNull
        private final CellDTO subscribed;

        public SocialHeaderVO(@NotNull CellDTO subscribe, @NotNull CellDTO subscribed, boolean z11) {
            Intrinsics.checkNotNullParameter(subscribe, "subscribe");
            Intrinsics.checkNotNullParameter(subscribed, "subscribed");
            this.subscribe = subscribe;
            this.subscribed = subscribed;
            this.isSubscribed = z11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SocialHeaderVO)) {
                return false;
            }
            SocialHeaderVO socialHeaderVO = (SocialHeaderVO) other;
            return Intrinsics.d(this.subscribe, socialHeaderVO.subscribe) && Intrinsics.d(this.subscribed, socialHeaderVO.subscribed) && this.isSubscribed == socialHeaderVO.isSubscribed;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isSubscribed) + b.c(this.subscribed, this.subscribe.hashCode() * 31, 31);
        }

        @NotNull
        public String toString() {
            CellDTO cellDTO = this.subscribe;
            CellDTO cellDTO2 = this.subscribed;
            boolean z11 = this.isSubscribed;
            StringBuilder sb2 = new StringBuilder("SocialHeaderVO(subscribe=");
            sb2.append(cellDTO);
            sb2.append(", subscribed=");
            sb2.append(cellDTO2);
            sb2.append(", isSubscribed=");
            return Pk0.a.a(")", sb2, z11);
        }
    }

    public SingleReviewVO(long j11, HeaderVO headerVO, @NotNull List<TextDTO> bodyAtoms, List<TextDTO> list, @NotNull List<MediaVO> mediaList, ButtonV3Atom.LargeBorderlessButton largeBorderlessButton, @NotNull MediaViewType viewType, int i11, int i12, int i13, Integer num, List<TextAtom> list2, SingleReviewDTO.MediaCentricHeaderDTO mediaCentricHeaderDTO, t tVar, t tVar2, t tVar3, CornerRadius cornerRadius) {
        Intrinsics.checkNotNullParameter(bodyAtoms, "bodyAtoms");
        Intrinsics.checkNotNullParameter(mediaList, "mediaList");
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        this.id = j11;
        this.header = headerVO;
        this.bodyAtoms = bodyAtoms;
        this.bodyCollapsedAtoms = list;
        this.mediaList = mediaList;
        this.showMoreButton = largeBorderlessButton;
        this.viewType = viewType;
        this.leftMargin = i11;
        this.topMargin = i12;
        this.bottomMargin = i13;
        this.reviewCollapseThreshold = num;
        this.contextQuestions = list2;
        this.mediaCentricHeader = mediaCentricHeaderDTO;
        this.tokenizedEvent = tVar;
        this.tileReviewTokenizedEvent = tVar2;
        this.reviewExpandTokenizedEvent = tVar3;
        this.mediaPreviewCornerRadius = cornerRadius;
        this.widgetName = "review";
    }

    public static /* synthetic */ SingleReviewVO copy$default(SingleReviewVO singleReviewVO, long j11, HeaderVO headerVO, List list, List list2, List list3, ButtonV3Atom.LargeBorderlessButton largeBorderlessButton, MediaViewType mediaViewType, int i11, int i12, int i13, Integer num, List list4, SingleReviewDTO.MediaCentricHeaderDTO mediaCentricHeaderDTO, t tVar, t tVar2, t tVar3, CornerRadius cornerRadius, int i14, Object obj) {
        CornerRadius cornerRadius2;
        t tVar4;
        long j12 = (i14 & 1) != 0 ? singleReviewVO.id : j11;
        HeaderVO headerVO2 = (i14 & 2) != 0 ? singleReviewVO.header : headerVO;
        List list5 = (i14 & 4) != 0 ? singleReviewVO.bodyAtoms : list;
        List list6 = (i14 & 8) != 0 ? singleReviewVO.bodyCollapsedAtoms : list2;
        List list7 = (i14 & 16) != 0 ? singleReviewVO.mediaList : list3;
        ButtonV3Atom.LargeBorderlessButton largeBorderlessButton2 = (i14 & 32) != 0 ? singleReviewVO.showMoreButton : largeBorderlessButton;
        MediaViewType mediaViewType2 = (i14 & 64) != 0 ? singleReviewVO.viewType : mediaViewType;
        int i15 = (i14 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? singleReviewVO.leftMargin : i11;
        int i16 = (i14 & 256) != 0 ? singleReviewVO.topMargin : i12;
        int i17 = (i14 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? singleReviewVO.bottomMargin : i13;
        Integer num2 = (i14 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? singleReviewVO.reviewCollapseThreshold : num;
        List list8 = (i14 & 2048) != 0 ? singleReviewVO.contextQuestions : list4;
        SingleReviewDTO.MediaCentricHeaderDTO mediaCentricHeaderDTO2 = (i14 & 4096) != 0 ? singleReviewVO.mediaCentricHeader : mediaCentricHeaderDTO;
        long j13 = j12;
        t tVar5 = (i14 & 8192) != 0 ? singleReviewVO.tokenizedEvent : tVar;
        t tVar6 = (i14 & 16384) != 0 ? singleReviewVO.tileReviewTokenizedEvent : tVar2;
        t tVar7 = (i14 & 32768) != 0 ? singleReviewVO.reviewExpandTokenizedEvent : tVar3;
        if ((i14 & 65536) != 0) {
            tVar4 = tVar7;
            cornerRadius2 = singleReviewVO.mediaPreviewCornerRadius;
        } else {
            cornerRadius2 = cornerRadius;
            tVar4 = tVar7;
        }
        return singleReviewVO.copy(j13, headerVO2, list5, list6, list7, largeBorderlessButton2, mediaViewType2, i15, i16, i17, num2, list8, mediaCentricHeaderDTO2, tVar5, tVar6, tVar4, cornerRadius2);
    }

    @NotNull
    public final SingleReviewVO copy(long id2, HeaderVO header, @NotNull List<TextDTO> bodyAtoms, List<TextDTO> bodyCollapsedAtoms, @NotNull List<MediaVO> mediaList, ButtonV3Atom.LargeBorderlessButton showMoreButton, @NotNull MediaViewType viewType, int leftMargin, int topMargin, int bottomMargin, Integer reviewCollapseThreshold, List<TextAtom> contextQuestions, SingleReviewDTO.MediaCentricHeaderDTO mediaCentricHeader, t tokenizedEvent, t tileReviewTokenizedEvent, t reviewExpandTokenizedEvent, CornerRadius mediaPreviewCornerRadius) {
        Intrinsics.checkNotNullParameter(bodyAtoms, "bodyAtoms");
        Intrinsics.checkNotNullParameter(mediaList, "mediaList");
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        return new SingleReviewVO(id2, header, bodyAtoms, bodyCollapsedAtoms, mediaList, showMoreButton, viewType, leftMargin, topMargin, bottomMargin, reviewCollapseThreshold, contextQuestions, mediaCentricHeader, tokenizedEvent, tileReviewTokenizedEvent, reviewExpandTokenizedEvent, mediaPreviewCornerRadius);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SingleReviewVO)) {
            return false;
        }
        SingleReviewVO singleReviewVO = (SingleReviewVO) other;
        return this.id == singleReviewVO.id && Intrinsics.d(this.header, singleReviewVO.header) && Intrinsics.d(this.bodyAtoms, singleReviewVO.bodyAtoms) && Intrinsics.d(this.bodyCollapsedAtoms, singleReviewVO.bodyCollapsedAtoms) && Intrinsics.d(this.mediaList, singleReviewVO.mediaList) && Intrinsics.d(this.showMoreButton, singleReviewVO.showMoreButton) && this.viewType == singleReviewVO.viewType && this.leftMargin == singleReviewVO.leftMargin && this.topMargin == singleReviewVO.topMargin && this.bottomMargin == singleReviewVO.bottomMargin && Intrinsics.d(this.reviewCollapseThreshold, singleReviewVO.reviewCollapseThreshold) && Intrinsics.d(this.contextQuestions, singleReviewVO.contextQuestions) && Intrinsics.d(this.mediaCentricHeader, singleReviewVO.mediaCentricHeader) && Intrinsics.d(this.tokenizedEvent, singleReviewVO.tokenizedEvent) && Intrinsics.d(this.tileReviewTokenizedEvent, singleReviewVO.tileReviewTokenizedEvent) && Intrinsics.d(this.reviewExpandTokenizedEvent, singleReviewVO.reviewExpandTokenizedEvent) && this.mediaPreviewCornerRadius == singleReviewVO.mediaPreviewCornerRadius;
    }

    @NotNull
    public final List<TextDTO> getBodyAtoms() {
        return this.bodyAtoms;
    }

    public final List<TextDTO> getBodyCollapsedAtoms() {
        return this.bodyCollapsedAtoms;
    }

    public final int getBottomMargin() {
        return this.bottomMargin;
    }

    public final List<TextAtom> getContextQuestions() {
        return this.contextQuestions;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final int getLeftMargin() {
        return this.leftMargin;
    }

    public final SingleReviewDTO.MediaCentricHeaderDTO getMediaCentricHeader() {
        return this.mediaCentricHeader;
    }

    public final Integer getReviewCollapseThreshold() {
        return this.reviewCollapseThreshold;
    }

    public final t getReviewExpandTokenizedEvent() {
        return this.reviewExpandTokenizedEvent;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final int getTopMargin() {
        return this.topMargin;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    @Override // m10.o
    @NotNull
    public String getWidgetName() {
        return this.widgetName;
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        HeaderVO headerVO = this.header;
        int b11 = g.b((hashCode + (headerVO == null ? 0 : headerVO.hashCode())) * 31, 31, this.bodyAtoms);
        List<TextDTO> list = this.bodyCollapsedAtoms;
        int b12 = g.b((b11 + (list == null ? 0 : list.hashCode())) * 31, 31, this.mediaList);
        ButtonV3Atom.LargeBorderlessButton largeBorderlessButton = this.showMoreButton;
        int a11 = C2454a.a(this.bottomMargin, C2454a.a(this.topMargin, C2454a.a(this.leftMargin, (this.viewType.hashCode() + ((b12 + (largeBorderlessButton == null ? 0 : largeBorderlessButton.hashCode())) * 31)) * 31, 31), 31), 31);
        Integer num = this.reviewCollapseThreshold;
        int hashCode2 = (a11 + (num == null ? 0 : num.hashCode())) * 31;
        List<TextAtom> list2 = this.contextQuestions;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        SingleReviewDTO.MediaCentricHeaderDTO mediaCentricHeaderDTO = this.mediaCentricHeader;
        int hashCode4 = (hashCode3 + (mediaCentricHeaderDTO == null ? 0 : mediaCentricHeaderDTO.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        int hashCode5 = (hashCode4 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        t tVar2 = this.tileReviewTokenizedEvent;
        int hashCode6 = (hashCode5 + (tVar2 == null ? 0 : tVar2.hashCode())) * 31;
        t tVar3 = this.reviewExpandTokenizedEvent;
        int hashCode7 = (hashCode6 + (tVar3 == null ? 0 : tVar3.hashCode())) * 31;
        CornerRadius cornerRadius = this.mediaPreviewCornerRadius;
        return hashCode7 + (cornerRadius != null ? cornerRadius.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        HeaderVO headerVO = this.header;
        List<TextDTO> list = this.bodyAtoms;
        List<TextDTO> list2 = this.bodyCollapsedAtoms;
        List<MediaVO> list3 = this.mediaList;
        ButtonV3Atom.LargeBorderlessButton largeBorderlessButton = this.showMoreButton;
        MediaViewType mediaViewType = this.viewType;
        int i11 = this.leftMargin;
        int i12 = this.topMargin;
        int i13 = this.bottomMargin;
        Integer num = this.reviewCollapseThreshold;
        List<TextAtom> list4 = this.contextQuestions;
        SingleReviewDTO.MediaCentricHeaderDTO mediaCentricHeaderDTO = this.mediaCentricHeader;
        t tVar = this.tokenizedEvent;
        t tVar2 = this.tileReviewTokenizedEvent;
        t tVar3 = this.reviewExpandTokenizedEvent;
        CornerRadius cornerRadius = this.mediaPreviewCornerRadius;
        StringBuilder sb2 = new StringBuilder("SingleReviewVO(id=");
        sb2.append(j11);
        sb2.append(", header=");
        sb2.append(headerVO);
        C2860c.g(", bodyAtoms=", ", bodyCollapsedAtoms=", sb2, list, list2);
        sb2.append(", mediaList=");
        sb2.append(list3);
        sb2.append(", showMoreButton=");
        sb2.append(largeBorderlessButton);
        sb2.append(", viewType=");
        sb2.append(mediaViewType);
        sb2.append(", leftMargin=");
        sb2.append(i11);
        A0.c(i12, i13, ", topMargin=", ", bottomMargin=", sb2);
        sb2.append(", reviewCollapseThreshold=");
        sb2.append(num);
        sb2.append(", contextQuestions=");
        sb2.append(list4);
        sb2.append(", mediaCentricHeader=");
        sb2.append(mediaCentricHeaderDTO);
        sb2.append(", tokenizedEvent=");
        sb2.append(tVar);
        p.d(sb2, ", tileReviewTokenizedEvent=", tVar2, ", reviewExpandTokenizedEvent=", tVar3);
        sb2.append(", mediaPreviewCornerRadius=");
        sb2.append(cornerRadius);
        sb2.append(")");
        return sb2.toString();
    }
}
