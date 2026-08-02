package ru.ozon.app.android.ugc.widgets.newquestionform.data;

import B0.C2454a;
import Bl.C2639a;
import N3.C3660k;
import Tl.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u00029:Bi\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0019J\t\u0010*\u001a\u00020\u0006HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010,\u001a\u00020\tHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u0010/\u001a\u00020\u000fHÆ\u0003J\u0017\u00100\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011HÆ\u0003J~\u00101\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011HÆ\u0001¢\u0006\u0002\u00102J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u000207HÖ\u0001J\t\u00108\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u001f\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u0006;"}, d2 = {"Lru/ozon/app/android/ugc/widgets/newquestionform/data/NewQuestionFormDTO;", "", "productId", "", "questionId", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/app/android/ugc/widgets/newquestionform/data/NewQuestionFormDTO$Header;", "secondHeader", "input", "Lru/ozon/app/android/ugc/widgets/newquestionform/data/NewQuestionFormDTO$Input;", "anonymousCell", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleToggle;", "policyRulesButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "sendButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(JLjava/lang/Long;Lru/ozon/app/android/ugc/widgets/newquestionform/data/NewQuestionFormDTO$Header;Lru/ozon/app/android/ugc/widgets/newquestionform/data/NewQuestionFormDTO$Header;Lru/ozon/app/android/ugc/widgets/newquestionform/data/NewQuestionFormDTO$Input;Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleToggle;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Ljava/util/Map;)V", "getProductId", "()J", "getQuestionId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getHeader", "()Lru/ozon/app/android/ugc/widgets/newquestionform/data/NewQuestionFormDTO$Header;", "getSecondHeader", "getInput", "()Lru/ozon/app/android/ugc/widgets/newquestionform/data/NewQuestionFormDTO$Input;", "getAnonymousCell", "()Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleToggle;", "getPolicyRulesButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "getSendButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(JLjava/lang/Long;Lru/ozon/app/android/ugc/widgets/newquestionform/data/NewQuestionFormDTO$Header;Lru/ozon/app/android/ugc/widgets/newquestionform/data/NewQuestionFormDTO$Header;Lru/ozon/app/android/ugc/widgets/newquestionform/data/NewQuestionFormDTO$Input;Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleToggle;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Ljava/util/Map;)Lru/ozon/app/android/ugc/widgets/newquestionform/data/NewQuestionFormDTO;", "equals", "", "other", "hashCode", "", "toString", "Header", "Input", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NewQuestionFormDTO {
    public static final int $stable = 8;
    private final CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggle anonymousCell;

    @NotNull
    private final Header header;

    @NotNull
    private final Input input;
    private final ButtonV3Atom.LargeBorderlessButton policyRulesButton;
    private final long productId;
    private final Long questionId;
    private final Header secondHeader;

    @NotNull
    private final ButtonV3Atom.LargeButton sendButton;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/ugc/widgets/newquestionform/data/NewQuestionFormDTO$Header;", "", "image", "", "text", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "getImage", "()Ljava/lang/String;", "getText", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Header {
        public static final int $stable = TextAtom.$stable;
        private final String image;

        @NotNull
        private final TextAtom text;

        public Header(String str, @NotNull TextAtom text) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.image = str;
            this.text = text;
        }

        public static /* synthetic */ Header copy$default(Header header, String str, TextAtom textAtom, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = header.image;
            }
            if ((i11 & 2) != 0) {
                textAtom = header.text;
            }
            return header.copy(str, textAtom);
        }

        /* renamed from: component1, reason: from getter */
        public final String getImage() {
            return this.image;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextAtom getText() {
            return this.text;
        }

        @NotNull
        public final Header copy(String image, @NotNull TextAtom text) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new Header(image, text);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Header)) {
                return false;
            }
            Header header = (Header) other;
            return Intrinsics.d(this.image, header.image) && Intrinsics.d(this.text, header.text);
        }

        public final String getImage() {
            return this.image;
        }

        @NotNull
        public final TextAtom getText() {
            return this.text;
        }

        public int hashCode() {
            String str = this.image;
            return this.text.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @NotNull
        public String toString() {
            return "Header(image=" + this.image + ", text=" + this.text + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/ugc/widgets/newquestionform/data/NewQuestionFormDTO$Input;", "", HammersV3BodyDTO.PLACEHOLDER, "", "minLength", "", "maxLength", "invalidLengthError", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "getPlaceholder", "()Ljava/lang/String;", "getMinLength", "()I", "getMaxLength", "getInvalidLengthError", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Input {
        public static final int $stable = 0;

        @NotNull
        private final String invalidLengthError;
        private final int maxLength;
        private final int minLength;

        @NotNull
        private final String placeholder;

        public Input(@NotNull String placeholder, int i11, int i12, @NotNull String invalidLengthError) {
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            Intrinsics.checkNotNullParameter(invalidLengthError, "invalidLengthError");
            this.placeholder = placeholder;
            this.minLength = i11;
            this.maxLength = i12;
            this.invalidLengthError = invalidLengthError;
        }

        public static /* synthetic */ Input copy$default(Input input, String str, int i11, int i12, String str2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = input.placeholder;
            }
            if ((i13 & 2) != 0) {
                i11 = input.minLength;
            }
            if ((i13 & 4) != 0) {
                i12 = input.maxLength;
            }
            if ((i13 & 8) != 0) {
                str2 = input.invalidLengthError;
            }
            return input.copy(str, i11, i12, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getPlaceholder() {
            return this.placeholder;
        }

        /* renamed from: component2, reason: from getter */
        public final int getMinLength() {
            return this.minLength;
        }

        /* renamed from: component3, reason: from getter */
        public final int getMaxLength() {
            return this.maxLength;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final String getInvalidLengthError() {
            return this.invalidLengthError;
        }

        @NotNull
        public final Input copy(@NotNull String placeholder, int minLength, int maxLength, @NotNull String invalidLengthError) {
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            Intrinsics.checkNotNullParameter(invalidLengthError, "invalidLengthError");
            return new Input(placeholder, minLength, maxLength, invalidLengthError);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Input)) {
                return false;
            }
            Input input = (Input) other;
            return Intrinsics.d(this.placeholder, input.placeholder) && this.minLength == input.minLength && this.maxLength == input.maxLength && Intrinsics.d(this.invalidLengthError, input.invalidLengthError);
        }

        @NotNull
        public final String getInvalidLengthError() {
            return this.invalidLengthError;
        }

        public final int getMaxLength() {
            return this.maxLength;
        }

        public final int getMinLength() {
            return this.minLength;
        }

        @NotNull
        public final String getPlaceholder() {
            return this.placeholder;
        }

        public int hashCode() {
            return this.invalidLengthError.hashCode() + C2454a.a(this.maxLength, C2454a.a(this.minLength, this.placeholder.hashCode() * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            String str = this.placeholder;
            int i11 = this.minLength;
            int i12 = this.maxLength;
            String str2 = this.invalidLengthError;
            StringBuilder c11 = C3660k.c(i11, "Input(placeholder=", str, ", minLength=", ", maxLength=");
            c11.append(i12);
            c11.append(", invalidLengthError=");
            c11.append(str2);
            c11.append(")");
            return c11.toString();
        }
    }

    public NewQuestionFormDTO(@i(name = "productID") long j11, @i(name = "questionID") Long l11, @NotNull Header header, Header header2, @NotNull Input input, CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggle cellWithSubtitleToggle, ButtonV3Atom.LargeBorderlessButton largeBorderlessButton, @NotNull ButtonV3Atom.LargeButton sendButton, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(sendButton, "sendButton");
        this.productId = j11;
        this.questionId = l11;
        this.header = header;
        this.secondHeader = header2;
        this.input = input;
        this.anonymousCell = cellWithSubtitleToggle;
        this.policyRulesButton = largeBorderlessButton;
        this.sendButton = sendButton;
        this.trackingInfo = map;
    }

    public static /* synthetic */ NewQuestionFormDTO copy$default(NewQuestionFormDTO newQuestionFormDTO, long j11, Long l11, Header header, Header header2, Input input, CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggle cellWithSubtitleToggle, ButtonV3Atom.LargeBorderlessButton largeBorderlessButton, ButtonV3Atom.LargeButton largeButton, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = newQuestionFormDTO.productId;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            l11 = newQuestionFormDTO.questionId;
        }
        Long l12 = l11;
        if ((i11 & 4) != 0) {
            header = newQuestionFormDTO.header;
        }
        return newQuestionFormDTO.copy(j12, l12, header, (i11 & 8) != 0 ? newQuestionFormDTO.secondHeader : header2, (i11 & 16) != 0 ? newQuestionFormDTO.input : input, (i11 & 32) != 0 ? newQuestionFormDTO.anonymousCell : cellWithSubtitleToggle, (i11 & 64) != 0 ? newQuestionFormDTO.policyRulesButton : largeBorderlessButton, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? newQuestionFormDTO.sendButton : largeButton, (i11 & 256) != 0 ? newQuestionFormDTO.trackingInfo : map);
    }

    /* renamed from: component1, reason: from getter */
    public final long getProductId() {
        return this.productId;
    }

    /* renamed from: component2, reason: from getter */
    public final Long getQuestionId() {
        return this.questionId;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final Header getHeader() {
        return this.header;
    }

    /* renamed from: component4, reason: from getter */
    public final Header getSecondHeader() {
        return this.secondHeader;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final Input getInput() {
        return this.input;
    }

    /* renamed from: component6, reason: from getter */
    public final CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggle getAnonymousCell() {
        return this.anonymousCell;
    }

    /* renamed from: component7, reason: from getter */
    public final ButtonV3Atom.LargeBorderlessButton getPolicyRulesButton() {
        return this.policyRulesButton;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final ButtonV3Atom.LargeButton getSendButton() {
        return this.sendButton;
    }

    public final Map<String, TokenizedTrackingInfo> component9() {
        return this.trackingInfo;
    }

    @NotNull
    public final NewQuestionFormDTO copy(@i(name = "productID") long productId, @i(name = "questionID") Long questionId, @NotNull Header header, Header secondHeader, @NotNull Input input, CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggle anonymousCell, ButtonV3Atom.LargeBorderlessButton policyRulesButton, @NotNull ButtonV3Atom.LargeButton sendButton, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(sendButton, "sendButton");
        return new NewQuestionFormDTO(productId, questionId, header, secondHeader, input, anonymousCell, policyRulesButton, sendButton, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewQuestionFormDTO)) {
            return false;
        }
        NewQuestionFormDTO newQuestionFormDTO = (NewQuestionFormDTO) other;
        return this.productId == newQuestionFormDTO.productId && Intrinsics.d(this.questionId, newQuestionFormDTO.questionId) && Intrinsics.d(this.header, newQuestionFormDTO.header) && Intrinsics.d(this.secondHeader, newQuestionFormDTO.secondHeader) && Intrinsics.d(this.input, newQuestionFormDTO.input) && Intrinsics.d(this.anonymousCell, newQuestionFormDTO.anonymousCell) && Intrinsics.d(this.policyRulesButton, newQuestionFormDTO.policyRulesButton) && Intrinsics.d(this.sendButton, newQuestionFormDTO.sendButton) && Intrinsics.d(this.trackingInfo, newQuestionFormDTO.trackingInfo);
    }

    public final CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggle getAnonymousCell() {
        return this.anonymousCell;
    }

    @NotNull
    public final Header getHeader() {
        return this.header;
    }

    @NotNull
    public final Input getInput() {
        return this.input;
    }

    public final ButtonV3Atom.LargeBorderlessButton getPolicyRulesButton() {
        return this.policyRulesButton;
    }

    public final long getProductId() {
        return this.productId;
    }

    public final Long getQuestionId() {
        return this.questionId;
    }

    public final Header getSecondHeader() {
        return this.secondHeader;
    }

    @NotNull
    public final ButtonV3Atom.LargeButton getSendButton() {
        return this.sendButton;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.productId) * 31;
        Long l11 = this.questionId;
        int hashCode2 = (this.header.hashCode() + ((hashCode + (l11 == null ? 0 : l11.hashCode())) * 31)) * 31;
        Header header = this.secondHeader;
        int hashCode3 = (this.input.hashCode() + ((hashCode2 + (header == null ? 0 : header.hashCode())) * 31)) * 31;
        CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggle cellWithSubtitleToggle = this.anonymousCell;
        int hashCode4 = (hashCode3 + (cellWithSubtitleToggle == null ? 0 : cellWithSubtitleToggle.hashCode())) * 31;
        ButtonV3Atom.LargeBorderlessButton largeBorderlessButton = this.policyRulesButton;
        int a11 = b.a(this.sendButton, (hashCode4 + (largeBorderlessButton == null ? 0 : largeBorderlessButton.hashCode())) * 31, 31);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return a11 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.productId;
        Long l11 = this.questionId;
        Header header = this.header;
        Header header2 = this.secondHeader;
        Input input = this.input;
        CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggle cellWithSubtitleToggle = this.anonymousCell;
        ButtonV3Atom.LargeBorderlessButton largeBorderlessButton = this.policyRulesButton;
        ButtonV3Atom.LargeButton largeButton = this.sendButton;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("NewQuestionFormDTO(productId=");
        sb2.append(j11);
        sb2.append(", questionId=");
        sb2.append(l11);
        sb2.append(", header=");
        sb2.append(header);
        sb2.append(", secondHeader=");
        sb2.append(header2);
        sb2.append(", input=");
        sb2.append(input);
        sb2.append(", anonymousCell=");
        sb2.append(cellWithSubtitleToggle);
        sb2.append(", policyRulesButton=");
        sb2.append(largeBorderlessButton);
        sb2.append(", sendButton=");
        sb2.append(largeButton);
        return C2639a.b(sb2, ", trackingInfo=", map, ")");
    }
}
