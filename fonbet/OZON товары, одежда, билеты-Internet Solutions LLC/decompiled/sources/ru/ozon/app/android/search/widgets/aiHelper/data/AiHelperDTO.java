package ru.ozon.app.android.search.widgets.aiHelper.data;

import D40.d;
import Ns.b;
import TY.a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001:\u0003<=>Bu\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0017\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fHÆ\u0003J\u0010\u00100\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010#J\u0010\u00101\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010#J\u000b\u00102\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u0090\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÆ\u0001¢\u0006\u0002\u00105J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020:HÖ\u0001J\t\u0010;\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010$\u001a\u0004\b%\u0010#R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)¨\u0006?"}, d2 = {"Lru/ozon/app/android/search/widgets/aiHelper/data/AiHelperDTO;", "", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/app/android/search/widgets/aiHelper/data/AiHelperDTO$Header;", "aiTextBlock", "Lru/ozon/app/android/search/widgets/aiHelper/data/AiHelperDTO$AiTextBlock;", CommentV3DTO.FOOTER_FIELD_NAME, "Lru/ozon/app/android/search/widgets/aiHelper/data/AiHelperDTO$Footer;", "pollingAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "stopAction", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "pollingIntervalMs", "", "maxRetries", "redirectUrl", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "<init>", "(Lru/ozon/app/android/search/widgets/aiHelper/data/AiHelperDTO$Header;Lru/ozon/app/android/search/widgets/aiHelper/data/AiHelperDTO$AiTextBlock;Lru/ozon/app/android/search/widgets/aiHelper/data/AiHelperDTO$Footer;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;)V", "getHeader", "()Lru/ozon/app/android/search/widgets/aiHelper/data/AiHelperDTO$Header;", "getAiTextBlock", "()Lru/ozon/app/android/search/widgets/aiHelper/data/AiHelperDTO$AiTextBlock;", "getFooter", "()Lru/ozon/app/android/search/widgets/aiHelper/data/AiHelperDTO$Footer;", "getPollingAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getStopAction", "getTrackingInfo", "()Ljava/util/Map;", "getPollingIntervalMs", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getMaxRetries", "getRedirectUrl", "()Ljava/lang/String;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Lru/ozon/app/android/search/widgets/aiHelper/data/AiHelperDTO$Header;Lru/ozon/app/android/search/widgets/aiHelper/data/AiHelperDTO$AiTextBlock;Lru/ozon/app/android/search/widgets/aiHelper/data/AiHelperDTO$Footer;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;)Lru/ozon/app/android/search/widgets/aiHelper/data/AiHelperDTO;", "equals", "", "other", "hashCode", "", "toString", "Header", "AiTextBlock", "Footer", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class AiHelperDTO {
    public static final int $stable = 8;
    private final AiTextBlock aiTextBlock;
    private final Footer footer;

    @NotNull
    private final Header header;
    private final Long maxRetries;
    private final AtomActionDTO pollingAction;
    private final Long pollingIntervalMs;
    private final String redirectUrl;
    private final AtomActionDTO stopAction;
    private final TestInfo testInfo;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J9\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/search/widgets/aiHelper/data/AiHelperDTO$AiTextBlock;", "", "aiText", "", "markupType", "Lru/ozon/app/android/search/widgets/aiHelper/data/MarkupType;", "expandControl", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/search/widgets/aiHelper/data/MarkupType;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/uni/atoms/data/TestInfo;)V", "getAiText", "()Ljava/lang/String;", "getMarkupType", "()Lru/ozon/app/android/search/widgets/aiHelper/data/MarkupType;", "getExpandControl", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AiTextBlock {
        public static final int $stable = TestInfo.$stable | CellDTO.$stable;
        private final String aiText;
        private final CellDTO expandControl;
        private final MarkupType markupType;
        private final TestInfo testInfo;

        public AiTextBlock(String str, MarkupType markupType, CellDTO cellDTO, TestInfo testInfo) {
            this.aiText = str;
            this.markupType = markupType;
            this.expandControl = cellDTO;
            this.testInfo = testInfo;
        }

        public static /* synthetic */ AiTextBlock copy$default(AiTextBlock aiTextBlock, String str, MarkupType markupType, CellDTO cellDTO, TestInfo testInfo, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = aiTextBlock.aiText;
            }
            if ((i11 & 2) != 0) {
                markupType = aiTextBlock.markupType;
            }
            if ((i11 & 4) != 0) {
                cellDTO = aiTextBlock.expandControl;
            }
            if ((i11 & 8) != 0) {
                testInfo = aiTextBlock.testInfo;
            }
            return aiTextBlock.copy(str, markupType, cellDTO, testInfo);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAiText() {
            return this.aiText;
        }

        /* renamed from: component2, reason: from getter */
        public final MarkupType getMarkupType() {
            return this.markupType;
        }

        /* renamed from: component3, reason: from getter */
        public final CellDTO getExpandControl() {
            return this.expandControl;
        }

        /* renamed from: component4, reason: from getter */
        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        @NotNull
        public final AiTextBlock copy(String aiText, MarkupType markupType, CellDTO expandControl, TestInfo testInfo) {
            return new AiTextBlock(aiText, markupType, expandControl, testInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AiTextBlock)) {
                return false;
            }
            AiTextBlock aiTextBlock = (AiTextBlock) other;
            return Intrinsics.d(this.aiText, aiTextBlock.aiText) && this.markupType == aiTextBlock.markupType && Intrinsics.d(this.expandControl, aiTextBlock.expandControl) && Intrinsics.d(this.testInfo, aiTextBlock.testInfo);
        }

        public final String getAiText() {
            return this.aiText;
        }

        public final CellDTO getExpandControl() {
            return this.expandControl;
        }

        public final MarkupType getMarkupType() {
            return this.markupType;
        }

        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        public int hashCode() {
            String str = this.aiText;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            MarkupType markupType = this.markupType;
            int hashCode2 = (hashCode + (markupType == null ? 0 : markupType.hashCode())) * 31;
            CellDTO cellDTO = this.expandControl;
            int hashCode3 = (hashCode2 + (cellDTO == null ? 0 : cellDTO.hashCode())) * 31;
            TestInfo testInfo = this.testInfo;
            return hashCode3 + (testInfo != null ? testInfo.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "AiTextBlock(aiText=" + this.aiText + ", markupType=" + this.markupType + ", expandControl=" + this.expandControl + ", testInfo=" + this.testInfo + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/search/widgets/aiHelper/data/AiHelperDTO$Footer;", "", "likeButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "dislikeButton", "restartButton", "infoButton", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;)V", "getLikeButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getDislikeButton", "getRestartButton", "getInfoButton", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Footer {
        public static final int $stable = IconButtonV3DTO.$stable;
        private final IconButtonV3DTO dislikeButton;
        private final IconButtonV3DTO infoButton;
        private final IconButtonV3DTO likeButton;
        private final IconButtonV3DTO restartButton;

        public Footer(IconButtonV3DTO iconButtonV3DTO, IconButtonV3DTO iconButtonV3DTO2, IconButtonV3DTO iconButtonV3DTO3, IconButtonV3DTO iconButtonV3DTO4) {
            this.likeButton = iconButtonV3DTO;
            this.dislikeButton = iconButtonV3DTO2;
            this.restartButton = iconButtonV3DTO3;
            this.infoButton = iconButtonV3DTO4;
        }

        public static /* synthetic */ Footer copy$default(Footer footer, IconButtonV3DTO iconButtonV3DTO, IconButtonV3DTO iconButtonV3DTO2, IconButtonV3DTO iconButtonV3DTO3, IconButtonV3DTO iconButtonV3DTO4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                iconButtonV3DTO = footer.likeButton;
            }
            if ((i11 & 2) != 0) {
                iconButtonV3DTO2 = footer.dislikeButton;
            }
            if ((i11 & 4) != 0) {
                iconButtonV3DTO3 = footer.restartButton;
            }
            if ((i11 & 8) != 0) {
                iconButtonV3DTO4 = footer.infoButton;
            }
            return footer.copy(iconButtonV3DTO, iconButtonV3DTO2, iconButtonV3DTO3, iconButtonV3DTO4);
        }

        /* renamed from: component1, reason: from getter */
        public final IconButtonV3DTO getLikeButton() {
            return this.likeButton;
        }

        /* renamed from: component2, reason: from getter */
        public final IconButtonV3DTO getDislikeButton() {
            return this.dislikeButton;
        }

        /* renamed from: component3, reason: from getter */
        public final IconButtonV3DTO getRestartButton() {
            return this.restartButton;
        }

        /* renamed from: component4, reason: from getter */
        public final IconButtonV3DTO getInfoButton() {
            return this.infoButton;
        }

        @NotNull
        public final Footer copy(IconButtonV3DTO likeButton, IconButtonV3DTO dislikeButton, IconButtonV3DTO restartButton, IconButtonV3DTO infoButton) {
            return new Footer(likeButton, dislikeButton, restartButton, infoButton);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Footer)) {
                return false;
            }
            Footer footer = (Footer) other;
            return Intrinsics.d(this.likeButton, footer.likeButton) && Intrinsics.d(this.dislikeButton, footer.dislikeButton) && Intrinsics.d(this.restartButton, footer.restartButton) && Intrinsics.d(this.infoButton, footer.infoButton);
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
            return "Footer(likeButton=" + this.likeButton + ", dislikeButton=" + this.dislikeButton + ", restartButton=" + this.restartButton + ", infoButton=" + this.infoButton + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003JY\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016¨\u0006'"}, d2 = {"Lru/ozon/app/android/search/widgets/aiHelper/data/AiHelperDTO$Header;", "", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "thinkingSubtitle", "stoppedSubtitle", "readySubtitle", "stopButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "restartButton", "<init>", "(Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;)V", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getThinkingSubtitle", "getStoppedSubtitle", "getReadySubtitle", "getStopButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getRestartButton", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Header {
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

        public Header(@NotNull IconDTO icon, @NotNull TextDTO title, TextDTO textDTO, TextDTO textDTO2, TextDTO textDTO3, IconButtonV3DTO iconButtonV3DTO, IconButtonV3DTO iconButtonV3DTO2) {
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

        public static /* synthetic */ Header copy$default(Header header, IconDTO iconDTO, TextDTO textDTO, TextDTO textDTO2, TextDTO textDTO3, TextDTO textDTO4, IconButtonV3DTO iconButtonV3DTO, IconButtonV3DTO iconButtonV3DTO2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                iconDTO = header.icon;
            }
            if ((i11 & 2) != 0) {
                textDTO = header.title;
            }
            if ((i11 & 4) != 0) {
                textDTO2 = header.thinkingSubtitle;
            }
            if ((i11 & 8) != 0) {
                textDTO3 = header.stoppedSubtitle;
            }
            if ((i11 & 16) != 0) {
                textDTO4 = header.readySubtitle;
            }
            if ((i11 & 32) != 0) {
                iconButtonV3DTO = header.stopButton;
            }
            if ((i11 & 64) != 0) {
                iconButtonV3DTO2 = header.restartButton;
            }
            IconButtonV3DTO iconButtonV3DTO3 = iconButtonV3DTO;
            IconButtonV3DTO iconButtonV3DTO4 = iconButtonV3DTO2;
            TextDTO textDTO5 = textDTO4;
            TextDTO textDTO6 = textDTO2;
            return header.copy(iconDTO, textDTO, textDTO6, textDTO3, textDTO5, iconButtonV3DTO3, iconButtonV3DTO4);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final IconDTO getIcon() {
            return this.icon;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final TextDTO getThinkingSubtitle() {
            return this.thinkingSubtitle;
        }

        /* renamed from: component4, reason: from getter */
        public final TextDTO getStoppedSubtitle() {
            return this.stoppedSubtitle;
        }

        /* renamed from: component5, reason: from getter */
        public final TextDTO getReadySubtitle() {
            return this.readySubtitle;
        }

        /* renamed from: component6, reason: from getter */
        public final IconButtonV3DTO getStopButton() {
            return this.stopButton;
        }

        /* renamed from: component7, reason: from getter */
        public final IconButtonV3DTO getRestartButton() {
            return this.restartButton;
        }

        @NotNull
        public final Header copy(@NotNull IconDTO icon, @NotNull TextDTO title, TextDTO thinkingSubtitle, TextDTO stoppedSubtitle, TextDTO readySubtitle, IconButtonV3DTO stopButton, IconButtonV3DTO restartButton) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(title, "title");
            return new Header(icon, title, thinkingSubtitle, stoppedSubtitle, readySubtitle, stopButton, restartButton);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Header)) {
                return false;
            }
            Header header = (Header) other;
            return Intrinsics.d(this.icon, header.icon) && Intrinsics.d(this.title, header.title) && Intrinsics.d(this.thinkingSubtitle, header.thinkingSubtitle) && Intrinsics.d(this.stoppedSubtitle, header.stoppedSubtitle) && Intrinsics.d(this.readySubtitle, header.readySubtitle) && Intrinsics.d(this.stopButton, header.stopButton) && Intrinsics.d(this.restartButton, header.restartButton);
        }

        @NotNull
        public final IconDTO getIcon() {
            return this.icon;
        }

        public final TextDTO getReadySubtitle() {
            return this.readySubtitle;
        }

        public final IconButtonV3DTO getRestartButton() {
            return this.restartButton;
        }

        public final IconButtonV3DTO getStopButton() {
            return this.stopButton;
        }

        public final TextDTO getStoppedSubtitle() {
            return this.stoppedSubtitle;
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
            StringBuilder i11 = Bi.b.i("Header(icon=", ", title=", ", thinkingSubtitle=", iconDTO, textDTO);
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

    public AiHelperDTO(@NotNull Header header, AiTextBlock aiTextBlock, Footer footer, AtomActionDTO atomActionDTO, AtomActionDTO atomActionDTO2, Map<String, TokenizedTrackingInfo> map, Long l11, Long l12, String str, TestInfo testInfo) {
        Intrinsics.checkNotNullParameter(header, "header");
        this.header = header;
        this.aiTextBlock = aiTextBlock;
        this.footer = footer;
        this.pollingAction = atomActionDTO;
        this.stopAction = atomActionDTO2;
        this.trackingInfo = map;
        this.pollingIntervalMs = l11;
        this.maxRetries = l12;
        this.redirectUrl = str;
        this.testInfo = testInfo;
    }

    public static /* synthetic */ AiHelperDTO copy$default(AiHelperDTO aiHelperDTO, Header header, AiTextBlock aiTextBlock, Footer footer, AtomActionDTO atomActionDTO, AtomActionDTO atomActionDTO2, Map map, Long l11, Long l12, String str, TestInfo testInfo, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            header = aiHelperDTO.header;
        }
        if ((i11 & 2) != 0) {
            aiTextBlock = aiHelperDTO.aiTextBlock;
        }
        if ((i11 & 4) != 0) {
            footer = aiHelperDTO.footer;
        }
        if ((i11 & 8) != 0) {
            atomActionDTO = aiHelperDTO.pollingAction;
        }
        if ((i11 & 16) != 0) {
            atomActionDTO2 = aiHelperDTO.stopAction;
        }
        if ((i11 & 32) != 0) {
            map = aiHelperDTO.trackingInfo;
        }
        if ((i11 & 64) != 0) {
            l11 = aiHelperDTO.pollingIntervalMs;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            l12 = aiHelperDTO.maxRetries;
        }
        if ((i11 & 256) != 0) {
            str = aiHelperDTO.redirectUrl;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            testInfo = aiHelperDTO.testInfo;
        }
        String str2 = str;
        TestInfo testInfo2 = testInfo;
        Long l13 = l11;
        Long l14 = l12;
        AtomActionDTO atomActionDTO3 = atomActionDTO2;
        Map map2 = map;
        return aiHelperDTO.copy(header, aiTextBlock, footer, atomActionDTO, atomActionDTO3, map2, l13, l14, str2, testInfo2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Header getHeader() {
        return this.header;
    }

    /* renamed from: component10, reason: from getter */
    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    /* renamed from: component2, reason: from getter */
    public final AiTextBlock getAiTextBlock() {
        return this.aiTextBlock;
    }

    /* renamed from: component3, reason: from getter */
    public final Footer getFooter() {
        return this.footer;
    }

    /* renamed from: component4, reason: from getter */
    public final AtomActionDTO getPollingAction() {
        return this.pollingAction;
    }

    /* renamed from: component5, reason: from getter */
    public final AtomActionDTO getStopAction() {
        return this.stopAction;
    }

    public final Map<String, TokenizedTrackingInfo> component6() {
        return this.trackingInfo;
    }

    /* renamed from: component7, reason: from getter */
    public final Long getPollingIntervalMs() {
        return this.pollingIntervalMs;
    }

    /* renamed from: component8, reason: from getter */
    public final Long getMaxRetries() {
        return this.maxRetries;
    }

    /* renamed from: component9, reason: from getter */
    public final String getRedirectUrl() {
        return this.redirectUrl;
    }

    @NotNull
    public final AiHelperDTO copy(@NotNull Header header, AiTextBlock aiTextBlock, Footer footer, AtomActionDTO pollingAction, AtomActionDTO stopAction, Map<String, TokenizedTrackingInfo> trackingInfo, Long pollingIntervalMs, Long maxRetries, String redirectUrl, TestInfo testInfo) {
        Intrinsics.checkNotNullParameter(header, "header");
        return new AiHelperDTO(header, aiTextBlock, footer, pollingAction, stopAction, trackingInfo, pollingIntervalMs, maxRetries, redirectUrl, testInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AiHelperDTO)) {
            return false;
        }
        AiHelperDTO aiHelperDTO = (AiHelperDTO) other;
        return Intrinsics.d(this.header, aiHelperDTO.header) && Intrinsics.d(this.aiTextBlock, aiHelperDTO.aiTextBlock) && Intrinsics.d(this.footer, aiHelperDTO.footer) && Intrinsics.d(this.pollingAction, aiHelperDTO.pollingAction) && Intrinsics.d(this.stopAction, aiHelperDTO.stopAction) && Intrinsics.d(this.trackingInfo, aiHelperDTO.trackingInfo) && Intrinsics.d(this.pollingIntervalMs, aiHelperDTO.pollingIntervalMs) && Intrinsics.d(this.maxRetries, aiHelperDTO.maxRetries) && Intrinsics.d(this.redirectUrl, aiHelperDTO.redirectUrl) && Intrinsics.d(this.testInfo, aiHelperDTO.testInfo);
    }

    public final AiTextBlock getAiTextBlock() {
        return this.aiTextBlock;
    }

    public final Footer getFooter() {
        return this.footer;
    }

    @NotNull
    public final Header getHeader() {
        return this.header;
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

    public final AtomActionDTO getStopAction() {
        return this.stopAction;
    }

    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.header.hashCode() * 31;
        AiTextBlock aiTextBlock = this.aiTextBlock;
        int hashCode2 = (hashCode + (aiTextBlock == null ? 0 : aiTextBlock.hashCode())) * 31;
        Footer footer = this.footer;
        int hashCode3 = (hashCode2 + (footer == null ? 0 : footer.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.pollingAction;
        int hashCode4 = (hashCode3 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        AtomActionDTO atomActionDTO2 = this.stopAction;
        int hashCode5 = (hashCode4 + (atomActionDTO2 == null ? 0 : atomActionDTO2.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode6 = (hashCode5 + (map == null ? 0 : map.hashCode())) * 31;
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
        Header header = this.header;
        AiTextBlock aiTextBlock = this.aiTextBlock;
        Footer footer = this.footer;
        AtomActionDTO atomActionDTO = this.pollingAction;
        AtomActionDTO atomActionDTO2 = this.stopAction;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        Long l11 = this.pollingIntervalMs;
        Long l12 = this.maxRetries;
        String str = this.redirectUrl;
        TestInfo testInfo = this.testInfo;
        StringBuilder sb2 = new StringBuilder("AiHelperDTO(header=");
        sb2.append(header);
        sb2.append(", aiTextBlock=");
        sb2.append(aiTextBlock);
        sb2.append(", footer=");
        sb2.append(footer);
        sb2.append(", pollingAction=");
        sb2.append(atomActionDTO);
        sb2.append(", stopAction=");
        Sh.b.f(sb2, atomActionDTO2, ", trackingInfo=", map, ", pollingIntervalMs=");
        a.e(sb2, l11, ", maxRetries=", l12, ", redirectUrl=");
        sb2.append(str);
        sb2.append(", testInfo=");
        sb2.append(testInfo);
        sb2.append(")");
        return sb2.toString();
    }
}
