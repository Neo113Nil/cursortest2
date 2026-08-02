package ru.ozon.app.android.search.widgets.aiHelper.presentation;

import D40.d;
import Ns.b;
import Pk0.h;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\"\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0003?@ABw\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010/\u001a\u0004\b2\u00101R\u001f\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u00106\u001a\u0004\b7\u00108R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u00106\u001a\u0004\b9\u00108R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010:\u001a\u0004\b;\u0010\u001aR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010<\u001a\u0004\b=\u0010>¨\u0006B"}, d2 = {"Lru/ozon/app/android/search/widgets/aiHelper/presentation/AiHelperVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/search/widgets/aiHelper/presentation/AiHelperVO$HeaderVO;", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/app/android/search/widgets/aiHelper/presentation/AiHelperVO$AiTextBlockVO;", "aiTextBlock", "Lru/ozon/app/android/search/widgets/aiHelper/presentation/AiHelperVO$FooterVO;", CommentV3DTO.FOOTER_FIELD_NAME, "Lru/ozon/uni/atoms/data/AtomActionDTO;", "pollingAction", "stopAction", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "pollingIntervalMs", "maxRetries", "", "redirectUrl", "Lru/ozon/uni/atoms/data/TestInfo;", "testInfo", "<init>", "(JLru/ozon/app/android/search/widgets/aiHelper/presentation/AiHelperVO$HeaderVO;Lru/ozon/app/android/search/widgets/aiHelper/presentation/AiHelperVO$AiTextBlockVO;Lru/ozon/app/android/search/widgets/aiHelper/presentation/AiHelperVO$FooterVO;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;LWZ/t;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/search/widgets/aiHelper/presentation/AiHelperVO$HeaderVO;", "getHeader", "()Lru/ozon/app/android/search/widgets/aiHelper/presentation/AiHelperVO$HeaderVO;", "Lru/ozon/app/android/search/widgets/aiHelper/presentation/AiHelperVO$AiTextBlockVO;", "getAiTextBlock", "()Lru/ozon/app/android/search/widgets/aiHelper/presentation/AiHelperVO$AiTextBlockVO;", "Lru/ozon/app/android/search/widgets/aiHelper/presentation/AiHelperVO$FooterVO;", "getFooter", "()Lru/ozon/app/android/search/widgets/aiHelper/presentation/AiHelperVO$FooterVO;", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getPollingAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getStopAction", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Ljava/lang/Long;", "getPollingIntervalMs", "()Ljava/lang/Long;", "getMaxRetries", "Ljava/lang/String;", "getRedirectUrl", "Lru/ozon/uni/atoms/data/TestInfo;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "HeaderVO", "AiTextBlockVO", "FooterVO", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class AiHelperVO implements c {
    private final AiTextBlockVO aiTextBlock;
    private final FooterVO footer;

    @NotNull
    private final HeaderVO header;
    private final long id;
    private final Long maxRetries;
    private final AtomActionDTO pollingAction;
    private final Long pollingIntervalMs;
    private final String redirectUrl;
    private final AtomActionDTO stopAction;
    private final TestInfo testInfo;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/search/widgets/aiHelper/presentation/AiHelperVO$AiTextBlockVO;", "", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "aiText", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "expandControl", "Lru/ozon/uni/atoms/data/TestInfo;", "testInfo", "<init>", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/uni/atoms/data/TestInfo;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getAiText", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getExpandControl", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "Lru/ozon/uni/atoms/data/TestInfo;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AiTextBlockVO {
        public static final int $stable = (TestInfo.$stable | CellDTO.$stable) | OzonSpannableString.$stable;
        private final OzonSpannableString aiText;
        private final CellDTO expandControl;
        private final TestInfo testInfo;

        public AiTextBlockVO(OzonSpannableString ozonSpannableString, CellDTO cellDTO, TestInfo testInfo) {
            this.aiText = ozonSpannableString;
            this.expandControl = cellDTO;
            this.testInfo = testInfo;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AiTextBlockVO)) {
                return false;
            }
            AiTextBlockVO aiTextBlockVO = (AiTextBlockVO) other;
            return Intrinsics.d(this.aiText, aiTextBlockVO.aiText) && Intrinsics.d(this.expandControl, aiTextBlockVO.expandControl) && Intrinsics.d(this.testInfo, aiTextBlockVO.testInfo);
        }

        public final OzonSpannableString getAiText() {
            return this.aiText;
        }

        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        public int hashCode() {
            OzonSpannableString ozonSpannableString = this.aiText;
            int hashCode = (ozonSpannableString == null ? 0 : ozonSpannableString.hashCode()) * 31;
            CellDTO cellDTO = this.expandControl;
            int hashCode2 = (hashCode + (cellDTO == null ? 0 : cellDTO.hashCode())) * 31;
            TestInfo testInfo = this.testInfo;
            return hashCode2 + (testInfo != null ? testInfo.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            OzonSpannableString ozonSpannableString = this.aiText;
            CellDTO cellDTO = this.expandControl;
            TestInfo testInfo = this.testInfo;
            StringBuilder sb2 = new StringBuilder("AiTextBlockVO(aiText=");
            sb2.append((Object) ozonSpannableString);
            sb2.append(", expandControl=");
            sb2.append(cellDTO);
            sb2.append(", testInfo=");
            return h.c(sb2, testInfo, ")");
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/search/widgets/aiHelper/presentation/AiHelperVO$FooterVO;", "", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "likeButton", "dislikeButton", "restartButton", "infoButton", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getLikeButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getDislikeButton", "getRestartButton", "getInfoButton", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FooterVO {
        public static final int $stable = IconButtonV3DTO.$stable;
        private final IconButtonV3DTO dislikeButton;
        private final IconButtonV3DTO infoButton;
        private final IconButtonV3DTO likeButton;
        private final IconButtonV3DTO restartButton;

        public FooterVO(IconButtonV3DTO iconButtonV3DTO, IconButtonV3DTO iconButtonV3DTO2, IconButtonV3DTO iconButtonV3DTO3, IconButtonV3DTO iconButtonV3DTO4) {
            this.likeButton = iconButtonV3DTO;
            this.dislikeButton = iconButtonV3DTO2;
            this.restartButton = iconButtonV3DTO3;
            this.infoButton = iconButtonV3DTO4;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FooterVO)) {
                return false;
            }
            FooterVO footerVO = (FooterVO) other;
            return Intrinsics.d(this.likeButton, footerVO.likeButton) && Intrinsics.d(this.dislikeButton, footerVO.dislikeButton) && Intrinsics.d(this.restartButton, footerVO.restartButton) && Intrinsics.d(this.infoButton, footerVO.infoButton);
        }

        public final IconButtonV3DTO getDislikeButton() {
            return this.dislikeButton;
        }

        public final IconButtonV3DTO getInfoButton() {
            return this.infoButton;
        }

        public final IconButtonV3DTO getLikeButton() {
            return this.likeButton;
        }

        public final IconButtonV3DTO getRestartButton() {
            return this.restartButton;
        }

        public int hashCode() {
            IconButtonV3DTO iconButtonV3DTO = this.likeButton;
            int hashCode = (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode()) * 31;
            IconButtonV3DTO iconButtonV3DTO2 = this.dislikeButton;
            int hashCode2 = (hashCode + (iconButtonV3DTO2 == null ? 0 : iconButtonV3DTO2.hashCode())) * 31;
            IconButtonV3DTO iconButtonV3DTO3 = this.restartButton;
            int hashCode3 = (hashCode2 + (iconButtonV3DTO3 == null ? 0 : iconButtonV3DTO3.hashCode())) * 31;
            IconButtonV3DTO iconButtonV3DTO4 = this.infoButton;
            return hashCode3 + (iconButtonV3DTO4 != null ? iconButtonV3DTO4.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "FooterVO(likeButton=" + this.likeButton + ", dislikeButton=" + this.dislikeButton + ", restartButton=" + this.restartButton + ", infoButton=" + this.infoButton + ")";
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b \u0010\u001dR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b$\u0010#¨\u0006%"}, d2 = {"Lru/ozon/app/android/search/widgets/aiHelper/presentation/AiHelperVO$HeaderVO;", "", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icon", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "thinkingSubtitle", "stoppedSubtitle", "readySubtitle", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "stopButton", "restartButton", "<init>", "(Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getThinkingSubtitle", "getStoppedSubtitle", "getReadySubtitle", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getStopButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getRestartButton", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class HeaderVO {
        public static final int $stable = IconButtonV3DTO.$stable | IconDTO.$stable;

        @NotNull
        private final IconDTO icon;
        private final TextDTO readySubtitle;
        private final IconButtonV3DTO restartButton;
        private final IconButtonV3DTO stopButton;
        private final TextDTO stoppedSubtitle;
        private final TextDTO thinkingSubtitle;

        @NotNull
        private final TextDTO title;

        public HeaderVO(@NotNull IconDTO icon, @NotNull TextDTO title, TextDTO textDTO, TextDTO textDTO2, TextDTO textDTO3, IconButtonV3DTO iconButtonV3DTO, IconButtonV3DTO iconButtonV3DTO2) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(title, "title");
            this.icon = icon;
            this.title = title;
            this.thinkingSubtitle = textDTO;
            this.stoppedSubtitle = textDTO2;
            this.readySubtitle = textDTO3;
            this.stopButton = iconButtonV3DTO;
            this.restartButton = iconButtonV3DTO2;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HeaderVO)) {
                return false;
            }
            HeaderVO headerVO = (HeaderVO) other;
            return Intrinsics.d(this.icon, headerVO.icon) && Intrinsics.d(this.title, headerVO.title) && Intrinsics.d(this.thinkingSubtitle, headerVO.thinkingSubtitle) && Intrinsics.d(this.stoppedSubtitle, headerVO.stoppedSubtitle) && Intrinsics.d(this.readySubtitle, headerVO.readySubtitle) && Intrinsics.d(this.stopButton, headerVO.stopButton) && Intrinsics.d(this.restartButton, headerVO.restartButton);
        }

        @NotNull
        public final IconDTO getIcon() {
            return this.icon;
        }

        public final TextDTO getReadySubtitle() {
            return this.readySubtitle;
        }

        public final TextDTO getThinkingSubtitle() {
            return this.thinkingSubtitle;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            int a11 = b.a(this.title, this.icon.hashCode() * 31, 31);
            TextDTO textDTO = this.thinkingSubtitle;
            int hashCode = (a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            TextDTO textDTO2 = this.stoppedSubtitle;
            int hashCode2 = (hashCode + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
            TextDTO textDTO3 = this.readySubtitle;
            int hashCode3 = (hashCode2 + (textDTO3 == null ? 0 : textDTO3.hashCode())) * 31;
            IconButtonV3DTO iconButtonV3DTO = this.stopButton;
            int hashCode4 = (hashCode3 + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31;
            IconButtonV3DTO iconButtonV3DTO2 = this.restartButton;
            return hashCode4 + (iconButtonV3DTO2 != null ? iconButtonV3DTO2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            IconDTO iconDTO = this.icon;
            TextDTO textDTO = this.title;
            TextDTO textDTO2 = this.thinkingSubtitle;
            TextDTO textDTO3 = this.stoppedSubtitle;
            TextDTO textDTO4 = this.readySubtitle;
            IconButtonV3DTO iconButtonV3DTO = this.stopButton;
            IconButtonV3DTO iconButtonV3DTO2 = this.restartButton;
            StringBuilder i11 = Bi.b.i("HeaderVO(icon=", ", title=", ", thinkingSubtitle=", iconDTO, textDTO);
            d.e(", stoppedSubtitle=", ", readySubtitle=", i11, textDTO2, textDTO3);
            i11.append(textDTO4);
            i11.append(", stopButton=");
            i11.append(iconButtonV3DTO);
            i11.append(", restartButton=");
            i11.append(iconButtonV3DTO2);
            i11.append(")");
            return i11.toString();
        }
    }

    public AiHelperVO(long j11, @NotNull HeaderVO header, AiTextBlockVO aiTextBlockVO, FooterVO footerVO, AtomActionDTO atomActionDTO, AtomActionDTO atomActionDTO2, t tVar, Long l11, Long l12, String str, TestInfo testInfo) {
        Intrinsics.checkNotNullParameter(header, "header");
        this.id = j11;
        this.header = header;
        this.aiTextBlock = aiTextBlockVO;
        this.footer = footerVO;
        this.pollingAction = atomActionDTO;
        this.stopAction = atomActionDTO2;
        this.tokenizedEvent = tVar;
        this.pollingIntervalMs = l11;
        this.maxRetries = l12;
        this.redirectUrl = str;
        this.testInfo = testInfo;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AiHelperVO)) {
            return false;
        }
        AiHelperVO aiHelperVO = (AiHelperVO) other;
        return this.id == aiHelperVO.id && Intrinsics.d(this.header, aiHelperVO.header) && Intrinsics.d(this.aiTextBlock, aiHelperVO.aiTextBlock) && Intrinsics.d(this.footer, aiHelperVO.footer) && Intrinsics.d(this.pollingAction, aiHelperVO.pollingAction) && Intrinsics.d(this.stopAction, aiHelperVO.stopAction) && Intrinsics.d(this.tokenizedEvent, aiHelperVO.tokenizedEvent) && Intrinsics.d(this.pollingIntervalMs, aiHelperVO.pollingIntervalMs) && Intrinsics.d(this.maxRetries, aiHelperVO.maxRetries) && Intrinsics.d(this.redirectUrl, aiHelperVO.redirectUrl) && Intrinsics.d(this.testInfo, aiHelperVO.testInfo);
    }

    public final AiTextBlockVO getAiTextBlock() {
        return this.aiTextBlock;
    }

    public final FooterVO getFooter() {
        return this.footer;
    }

    @NotNull
    public final HeaderVO getHeader() {
        return this.header;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final Long getMaxRetries() {
        return this.maxRetries;
    }

    public final AtomActionDTO getPollingAction() {
        return this.pollingAction;
    }

    public final Long getPollingIntervalMs() {
        return this.pollingIntervalMs;
    }

    public final String getRedirectUrl() {
        return this.redirectUrl;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final AtomActionDTO getStopAction() {
        return this.stopAction;
    }

    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.header.hashCode() + (Long.hashCode(this.id) * 31)) * 31;
        AiTextBlockVO aiTextBlockVO = this.aiTextBlock;
        int hashCode2 = (hashCode + (aiTextBlockVO == null ? 0 : aiTextBlockVO.hashCode())) * 31;
        FooterVO footerVO = this.footer;
        int hashCode3 = (hashCode2 + (footerVO == null ? 0 : footerVO.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.pollingAction;
        int hashCode4 = (hashCode3 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        AtomActionDTO atomActionDTO2 = this.stopAction;
        int hashCode5 = (hashCode4 + (atomActionDTO2 == null ? 0 : atomActionDTO2.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        int hashCode6 = (hashCode5 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        Long l11 = this.pollingIntervalMs;
        int hashCode7 = (hashCode6 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.maxRetries;
        int hashCode8 = (hashCode7 + (l12 == null ? 0 : l12.hashCode())) * 31;
        String str = this.redirectUrl;
        int hashCode9 = (hashCode8 + (str == null ? 0 : str.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        return hashCode9 + (testInfo != null ? testInfo.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AiHelperVO(id=" + this.id + ", header=" + this.header + ", aiTextBlock=" + this.aiTextBlock + ", footer=" + this.footer + ", pollingAction=" + this.pollingAction + ", stopAction=" + this.stopAction + ", tokenizedEvent=" + this.tokenizedEvent + ", pollingIntervalMs=" + this.pollingIntervalMs + ", maxRetries=" + this.maxRetries + ", redirectUrl=" + this.redirectUrl + ", testInfo=" + this.testInfo + ")";
    }
}
