package ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormComment;

import Ak.C2436a;
import B0.A0;
import B0.C2454a;
import Bi.b;
import Cm.e;
import G.g;
import Kk.C3532b;
import Nh.a;
import WZ.t;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.app.android.search.widgets.suggestion.data.SuggestionDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\"\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002DEB\u0097\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u000e\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ¾\u0001\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\u0010\b\u0002\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u00172\b\b\u0002\u0010\u001b\u001a\u00020\u0017HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020\u00172\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b,\u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b-\u0010!R$\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010+\u001a\u0004\b.\u0010!\"\u0004\b/\u00100R\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u00101\u001a\u0004\b2\u00103R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u00104\u001a\u0004\b5\u00106R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00107\u001a\u0004\b8\u0010#R\u0017\u0010\u0010\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u00107\u001a\u0004\b9\u0010#R\u0017\u0010\u0011\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0011\u00107\u001a\u0004\b:\u0010#R\u001f\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010A\u001a\u0004\b\u0018\u0010BR\u0017\u0010\u0019\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0019\u0010A\u001a\u0004\b\u0019\u0010BR\u0017\u0010\u001a\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u001a\u0010A\u001a\u0004\b\u001a\u0010BR\u0017\u0010\u001b\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u001b\u0010A\u001a\u0004\b\u001b\u0010BR\u0011\u0010C\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\bC\u0010B¨\u0006F"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormComment/ReviewFormCommentVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "uploadKey", HammersV3BodyDTO.PLACEHOLDER, AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormComment/ReviewFormCommentVO$HintVO;", "hints", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormComment/ReviewFormCommentVO$SuggestsVO;", SuggestionDTO.TYPE_SUGGEST, "", "maxLines", "minLines", "maxInputLength", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "clickTokenizedEvent", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "mediaPickerButton", "", "isFooterSticky", "isExpanded", "isModal", "isPickerButtonVisible", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormComment/ReviewFormCommentVO$SuggestsVO;IIILWZ/t;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;ZZZZ)V", "copy", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormComment/ReviewFormCommentVO$SuggestsVO;IIILWZ/t;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;ZZZZ)Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormComment/ReviewFormCommentVO;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getUploadKey", "getPlaceholder", "getValue", "setValue", "(Ljava/lang/String;)V", "Ljava/util/List;", "getHints", "()Ljava/util/List;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormComment/ReviewFormCommentVO$SuggestsVO;", "getSuggests", "()Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormComment/ReviewFormCommentVO$SuggestsVO;", "I", "getMaxLines", "getMinLines", "getMaxInputLength", "LWZ/t;", "getClickTokenizedEvent", "()LWZ/t;", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getMediaPickerButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "Z", "()Z", "isPickerButtonShown", "HintVO", "SuggestsVO", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ReviewFormCommentVO implements c {
    private final t clickTokenizedEvent;
    private final List<HintVO> hints;
    private final long id;
    private final boolean isExpanded;
    private final boolean isFooterSticky;
    private final boolean isModal;
    private final boolean isPickerButtonVisible;
    private final int maxInputLength;
    private final int maxLines;
    private final IconButtonV3DTO mediaPickerButton;
    private final int minLines;
    private final String placeholder;
    private final SuggestsVO suggests;

    @NotNull
    private final String uploadKey;
    private String value;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u000e\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0018\u0010\rR\u001f\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormComment/ReviewFormCommentVO$HintVO;", "", "", "minInputLength", "", "caption", "captionColor", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "hintEvent", "<init>", "(ILjava/lang/String;Ljava/lang/String;LWZ/t;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getMinInputLength", "Ljava/lang/String;", "getCaption", "getCaptionColor", "LWZ/t;", "getHintEvent", "()LWZ/t;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class HintVO {

        @NotNull
        private final String caption;

        @NotNull
        private final String captionColor;
        private final t hintEvent;
        private final int minInputLength;

        public HintVO(int i11, @NotNull String caption, @NotNull String captionColor, t tVar) {
            Intrinsics.checkNotNullParameter(caption, "caption");
            Intrinsics.checkNotNullParameter(captionColor, "captionColor");
            this.minInputLength = i11;
            this.caption = caption;
            this.captionColor = captionColor;
            this.hintEvent = tVar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HintVO)) {
                return false;
            }
            HintVO hintVO = (HintVO) other;
            return this.minInputLength == hintVO.minInputLength && Intrinsics.d(this.caption, hintVO.caption) && Intrinsics.d(this.captionColor, hintVO.captionColor) && Intrinsics.d(this.hintEvent, hintVO.hintEvent);
        }

        @NotNull
        public final String getCaption() {
            return this.caption;
        }

        @NotNull
        public final String getCaptionColor() {
            return this.captionColor;
        }

        public final t getHintEvent() {
            return this.hintEvent;
        }

        public final int getMinInputLength() {
            return this.minInputLength;
        }

        public int hashCode() {
            int a11 = g.a(g.a(Integer.hashCode(this.minInputLength) * 31, 31, this.caption), 31, this.captionColor);
            t tVar = this.hintEvent;
            return a11 + (tVar == null ? 0 : tVar.hashCode());
        }

        @NotNull
        public String toString() {
            int i11 = this.minInputLength;
            String str = this.caption;
            String str2 = this.captionColor;
            t tVar = this.hintEvent;
            StringBuilder g10 = e.g(i11, "HintVO(minInputLength=", ", caption=", str, ", captionColor=");
            g10.append(str2);
            g10.append(", hintEvent=");
            g10.append(tVar);
            g10.append(")");
            return g10.toString();
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\f¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormComment/ReviewFormCommentVO$SuggestsVO;", "", "", "", "placeholders", "", "delay", "<init>", "(Ljava/util/List;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getPlaceholders", "()Ljava/util/List;", "I", "getDelay", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SuggestsVO {
        private final int delay;

        @NotNull
        private final List<String> placeholders;

        public SuggestsVO(@NotNull List<String> placeholders, int i11) {
            Intrinsics.checkNotNullParameter(placeholders, "placeholders");
            this.placeholders = placeholders;
            this.delay = i11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SuggestsVO)) {
                return false;
            }
            SuggestsVO suggestsVO = (SuggestsVO) other;
            return Intrinsics.d(this.placeholders, suggestsVO.placeholders) && this.delay == suggestsVO.delay;
        }

        public final int getDelay() {
            return this.delay;
        }

        @NotNull
        public final List<String> getPlaceholders() {
            return this.placeholders;
        }

        public int hashCode() {
            return Integer.hashCode(this.delay) + (this.placeholders.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "SuggestsVO(placeholders=" + this.placeholders + ", delay=" + this.delay + ")";
        }
    }

    public ReviewFormCommentVO(long j11, @NotNull String uploadKey, String str, String str2, List<HintVO> list, SuggestsVO suggestsVO, int i11, int i12, int i13, t tVar, IconButtonV3DTO iconButtonV3DTO, boolean z11, boolean z12, boolean z13, boolean z14) {
        Intrinsics.checkNotNullParameter(uploadKey, "uploadKey");
        this.id = j11;
        this.uploadKey = uploadKey;
        this.placeholder = str;
        this.value = str2;
        this.hints = list;
        this.suggests = suggestsVO;
        this.maxLines = i11;
        this.minLines = i12;
        this.maxInputLength = i13;
        this.clickTokenizedEvent = tVar;
        this.mediaPickerButton = iconButtonV3DTO;
        this.isFooterSticky = z11;
        this.isExpanded = z12;
        this.isModal = z13;
        this.isPickerButtonVisible = z14;
    }

    @NotNull
    public final ReviewFormCommentVO copy(long id2, @NotNull String uploadKey, String placeholder, String value, List<HintVO> hints, SuggestsVO suggests, int maxLines, int minLines, int maxInputLength, t clickTokenizedEvent, IconButtonV3DTO mediaPickerButton, boolean isFooterSticky, boolean isExpanded, boolean isModal, boolean isPickerButtonVisible) {
        Intrinsics.checkNotNullParameter(uploadKey, "uploadKey");
        return new ReviewFormCommentVO(id2, uploadKey, placeholder, value, hints, suggests, maxLines, minLines, maxInputLength, clickTokenizedEvent, mediaPickerButton, isFooterSticky, isExpanded, isModal, isPickerButtonVisible);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReviewFormCommentVO)) {
            return false;
        }
        ReviewFormCommentVO reviewFormCommentVO = (ReviewFormCommentVO) other;
        return this.id == reviewFormCommentVO.id && Intrinsics.d(this.uploadKey, reviewFormCommentVO.uploadKey) && Intrinsics.d(this.placeholder, reviewFormCommentVO.placeholder) && Intrinsics.d(this.value, reviewFormCommentVO.value) && Intrinsics.d(this.hints, reviewFormCommentVO.hints) && Intrinsics.d(this.suggests, reviewFormCommentVO.suggests) && this.maxLines == reviewFormCommentVO.maxLines && this.minLines == reviewFormCommentVO.minLines && this.maxInputLength == reviewFormCommentVO.maxInputLength && Intrinsics.d(this.clickTokenizedEvent, reviewFormCommentVO.clickTokenizedEvent) && Intrinsics.d(this.mediaPickerButton, reviewFormCommentVO.mediaPickerButton) && this.isFooterSticky == reviewFormCommentVO.isFooterSticky && this.isExpanded == reviewFormCommentVO.isExpanded && this.isModal == reviewFormCommentVO.isModal && this.isPickerButtonVisible == reviewFormCommentVO.isPickerButtonVisible;
    }

    public final t getClickTokenizedEvent() {
        return this.clickTokenizedEvent;
    }

    public final List<HintVO> getHints() {
        return this.hints;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final int getMaxInputLength() {
        return this.maxInputLength;
    }

    public final int getMaxLines() {
        return this.maxLines;
    }

    public final IconButtonV3DTO getMediaPickerButton() {
        return this.mediaPickerButton;
    }

    public final int getMinLines() {
        return this.minLines;
    }

    public final String getPlaceholder() {
        return this.placeholder;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final SuggestsVO getSuggests() {
        return this.suggests;
    }

    @NotNull
    public final String getUploadKey() {
        return this.uploadKey;
    }

    public final String getValue() {
        return this.value;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = g.a(Long.hashCode(this.id) * 31, 31, this.uploadKey);
        String str = this.placeholder;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.value;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<HintVO> list = this.hints;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        SuggestsVO suggestsVO = this.suggests;
        int a12 = C2454a.a(this.maxInputLength, C2454a.a(this.minLines, C2454a.a(this.maxLines, (hashCode3 + (suggestsVO == null ? 0 : suggestsVO.hashCode())) * 31, 31), 31), 31);
        t tVar = this.clickTokenizedEvent;
        int hashCode4 = (a12 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        IconButtonV3DTO iconButtonV3DTO = this.mediaPickerButton;
        return Boolean.hashCode(this.isPickerButtonVisible) + C3532b.a(C3532b.a(C3532b.a((hashCode4 + (iconButtonV3DTO != null ? iconButtonV3DTO.hashCode() : 0)) * 31, 31, this.isFooterSticky), 31, this.isExpanded), 31, this.isModal);
    }

    /* renamed from: isExpanded, reason: from getter */
    public final boolean getIsExpanded() {
        return this.isExpanded;
    }

    /* renamed from: isFooterSticky, reason: from getter */
    public final boolean getIsFooterSticky() {
        return this.isFooterSticky;
    }

    /* renamed from: isModal, reason: from getter */
    public final boolean getIsModal() {
        return this.isModal;
    }

    public final boolean isPickerButtonShown() {
        return (this.mediaPickerButton == null || this.isExpanded || !this.isPickerButtonVisible) ? false : true;
    }

    /* renamed from: isPickerButtonVisible, reason: from getter */
    public final boolean getIsPickerButtonVisible() {
        return this.isPickerButtonVisible;
    }

    public final void setValue(String str) {
        this.value = str;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.uploadKey;
        String str2 = this.placeholder;
        String str3 = this.value;
        List<HintVO> list = this.hints;
        SuggestsVO suggestsVO = this.suggests;
        int i11 = this.maxLines;
        int i12 = this.minLines;
        int i13 = this.maxInputLength;
        t tVar = this.clickTokenizedEvent;
        IconButtonV3DTO iconButtonV3DTO = this.mediaPickerButton;
        boolean z11 = this.isFooterSticky;
        boolean z12 = this.isExpanded;
        boolean z13 = this.isModal;
        boolean z14 = this.isPickerButtonVisible;
        StringBuilder c11 = C2436a.c(j11, "ReviewFormCommentVO(id=", ", uploadKey=", str);
        a.h(c11, ", placeholder=", str2, ", value=", str3);
        c11.append(", hints=");
        c11.append(list);
        c11.append(", suggests=");
        c11.append(suggestsVO);
        A0.c(i11, i12, ", maxLines=", ", minLines=", c11);
        c11.append(", maxInputLength=");
        c11.append(i13);
        c11.append(", clickTokenizedEvent=");
        c11.append(tVar);
        c11.append(", mediaPickerButton=");
        c11.append(iconButtonV3DTO);
        c11.append(", isFooterSticky=");
        c11.append(z11);
        C2436a.e(", isExpanded=", ", isModal=", c11, z12, z13);
        return b.f(c11, ", isPickerButtonVisible=", z14, ")");
    }
}
