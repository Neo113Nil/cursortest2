package ru.ozon.app.android.ugc.widgets.newquestionform.presentation;

import B0.C2454a;
import C.C2702w;
import G.g;
import Tl.b;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b!\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001BBy\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u009c\u0001\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\n2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b(\u0010'R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b/\u0010.R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00100\u001a\u0004\b1\u0010\u001dR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u00102\u001a\u0004\b3\u0010\u001fR\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u000e\u00102\u001a\u0004\b4\u0010\u001fR\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000f\u00100\u001a\u0004\b5\u0010\u001dR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00106\u001a\u0004\b7\u00108R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u00109\u001a\u0004\b:\u0010;R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010<\u001a\u0004\b=\u0010>R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010?\u001a\u0004\b@\u0010A¨\u0006C"}, d2 = {"Lru/ozon/app/android/ugc/widgets/newquestionform/presentation/NewQuestionFormVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "productId", "questionId", "Lru/ozon/app/android/ugc/widgets/newquestionform/presentation/NewQuestionFormVO$Header;", CommentV3DTO.HEADER_FIELD_NAME, "secondHeader", "", "inputPlaceholder", "", "inputMinLength", "inputMaxLength", "invalidLengthError", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleToggle;", "anonymousCell", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "policyRulesButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "sendButton", "LWZ/t;", "viewEvent", "<init>", "(JJLjava/lang/Long;Lru/ozon/app/android/ugc/widgets/newquestionform/presentation/NewQuestionFormVO$Header;Lru/ozon/app/android/ugc/widgets/newquestionform/presentation/NewQuestionFormVO$Header;Ljava/lang/String;IILjava/lang/String;Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleToggle;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;LWZ/t;)V", "copy", "(JJLjava/lang/Long;Lru/ozon/app/android/ugc/widgets/newquestionform/presentation/NewQuestionFormVO$Header;Lru/ozon/app/android/ugc/widgets/newquestionform/presentation/NewQuestionFormVO$Header;Ljava/lang/String;IILjava/lang/String;Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleToggle;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;LWZ/t;)Lru/ozon/app/android/ugc/widgets/newquestionform/presentation/NewQuestionFormVO;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "getProductId", "Ljava/lang/Long;", "getQuestionId", "()Ljava/lang/Long;", "Lru/ozon/app/android/ugc/widgets/newquestionform/presentation/NewQuestionFormVO$Header;", "getHeader", "()Lru/ozon/app/android/ugc/widgets/newquestionform/presentation/NewQuestionFormVO$Header;", "getSecondHeader", "Ljava/lang/String;", "getInputPlaceholder", "I", "getInputMinLength", "getInputMaxLength", "getInvalidLengthError", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleToggle;", "getAnonymousCell", "()Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleToggle;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "getPolicyRulesButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getSendButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "LWZ/t;", "getViewEvent", "()LWZ/t;", "Header", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NewQuestionFormVO implements c {
    private final CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggle anonymousCell;

    @NotNull
    private final Header header;
    private final long id;
    private final int inputMaxLength;
    private final int inputMinLength;

    @NotNull
    private final String inputPlaceholder;

    @NotNull
    private final String invalidLengthError;
    private final ButtonV3Atom.LargeBorderlessButton policyRulesButton;
    private final long productId;
    private final Long questionId;
    private final Header secondHeader;

    @NotNull
    private final ButtonV3Atom.LargeButton sendButton;
    private final t viewEvent;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/ugc/widgets/newquestionform/presentation/NewQuestionFormVO$Header;", "", "", "image", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getImage", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Header {
        private final String image;

        @NotNull
        private final TextDTO text;

        public Header(String str, @NotNull TextDTO text) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.image = str;
            this.text = text;
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
        public final TextDTO getText() {
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

    public NewQuestionFormVO(long j11, long j12, Long l11, @NotNull Header header, Header header2, @NotNull String inputPlaceholder, int i11, int i12, @NotNull String invalidLengthError, CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggle cellWithSubtitleToggle, ButtonV3Atom.LargeBorderlessButton largeBorderlessButton, @NotNull ButtonV3Atom.LargeButton sendButton, t tVar) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(inputPlaceholder, "inputPlaceholder");
        Intrinsics.checkNotNullParameter(invalidLengthError, "invalidLengthError");
        Intrinsics.checkNotNullParameter(sendButton, "sendButton");
        this.id = j11;
        this.productId = j12;
        this.questionId = l11;
        this.header = header;
        this.secondHeader = header2;
        this.inputPlaceholder = inputPlaceholder;
        this.inputMinLength = i11;
        this.inputMaxLength = i12;
        this.invalidLengthError = invalidLengthError;
        this.anonymousCell = cellWithSubtitleToggle;
        this.policyRulesButton = largeBorderlessButton;
        this.sendButton = sendButton;
        this.viewEvent = tVar;
    }

    @NotNull
    public final NewQuestionFormVO copy(long id2, long productId, Long questionId, @NotNull Header header, Header secondHeader, @NotNull String inputPlaceholder, int inputMinLength, int inputMaxLength, @NotNull String invalidLengthError, CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggle anonymousCell, ButtonV3Atom.LargeBorderlessButton policyRulesButton, @NotNull ButtonV3Atom.LargeButton sendButton, t viewEvent) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(inputPlaceholder, "inputPlaceholder");
        Intrinsics.checkNotNullParameter(invalidLengthError, "invalidLengthError");
        Intrinsics.checkNotNullParameter(sendButton, "sendButton");
        return new NewQuestionFormVO(id2, productId, questionId, header, secondHeader, inputPlaceholder, inputMinLength, inputMaxLength, invalidLengthError, anonymousCell, policyRulesButton, sendButton, viewEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewQuestionFormVO)) {
            return false;
        }
        NewQuestionFormVO newQuestionFormVO = (NewQuestionFormVO) other;
        return this.id == newQuestionFormVO.id && this.productId == newQuestionFormVO.productId && Intrinsics.d(this.questionId, newQuestionFormVO.questionId) && Intrinsics.d(this.header, newQuestionFormVO.header) && Intrinsics.d(this.secondHeader, newQuestionFormVO.secondHeader) && Intrinsics.d(this.inputPlaceholder, newQuestionFormVO.inputPlaceholder) && this.inputMinLength == newQuestionFormVO.inputMinLength && this.inputMaxLength == newQuestionFormVO.inputMaxLength && Intrinsics.d(this.invalidLengthError, newQuestionFormVO.invalidLengthError) && Intrinsics.d(this.anonymousCell, newQuestionFormVO.anonymousCell) && Intrinsics.d(this.policyRulesButton, newQuestionFormVO.policyRulesButton) && Intrinsics.d(this.sendButton, newQuestionFormVO.sendButton) && Intrinsics.d(this.viewEvent, newQuestionFormVO.viewEvent);
    }

    public final CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggle getAnonymousCell() {
        return this.anonymousCell;
    }

    @NotNull
    public final Header getHeader() {
        return this.header;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final int getInputMaxLength() {
        return this.inputMaxLength;
    }

    public final int getInputMinLength() {
        return this.inputMinLength;
    }

    @NotNull
    public final String getInputPlaceholder() {
        return this.inputPlaceholder;
    }

    @NotNull
    public final String getInvalidLengthError() {
        return this.invalidLengthError;
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

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final Header getSecondHeader() {
        return this.secondHeader;
    }

    @NotNull
    public final ButtonV3Atom.LargeButton getSendButton() {
        return this.sendButton;
    }

    public final t getViewEvent() {
        return this.viewEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = Pk0.c.a(Long.hashCode(this.id) * 31, 31, this.productId);
        Long l11 = this.questionId;
        int hashCode = (this.header.hashCode() + ((a11 + (l11 == null ? 0 : l11.hashCode())) * 31)) * 31;
        Header header = this.secondHeader;
        int a12 = g.a(C2454a.a(this.inputMaxLength, C2454a.a(this.inputMinLength, g.a((hashCode + (header == null ? 0 : header.hashCode())) * 31, 31, this.inputPlaceholder), 31), 31), 31, this.invalidLengthError);
        CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggle cellWithSubtitleToggle = this.anonymousCell;
        int hashCode2 = (a12 + (cellWithSubtitleToggle == null ? 0 : cellWithSubtitleToggle.hashCode())) * 31;
        ButtonV3Atom.LargeBorderlessButton largeBorderlessButton = this.policyRulesButton;
        int a13 = b.a(this.sendButton, (hashCode2 + (largeBorderlessButton == null ? 0 : largeBorderlessButton.hashCode())) * 31, 31);
        t tVar = this.viewEvent;
        return a13 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        long j12 = this.productId;
        Long l11 = this.questionId;
        Header header = this.header;
        Header header2 = this.secondHeader;
        String str = this.inputPlaceholder;
        int i11 = this.inputMinLength;
        int i12 = this.inputMaxLength;
        String str2 = this.invalidLengthError;
        CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggle cellWithSubtitleToggle = this.anonymousCell;
        ButtonV3Atom.LargeBorderlessButton largeBorderlessButton = this.policyRulesButton;
        ButtonV3Atom.LargeButton largeButton = this.sendButton;
        t tVar = this.viewEvent;
        StringBuilder d11 = C2702w.d(j11, "NewQuestionFormVO(id=", ", productId=");
        d11.append(j12);
        d11.append(", questionId=");
        d11.append(l11);
        d11.append(", header=");
        d11.append(header);
        d11.append(", secondHeader=");
        d11.append(header2);
        d11.append(", inputPlaceholder=");
        d11.append(str);
        d11.append(", inputMinLength=");
        d11.append(i11);
        d11.append(", inputMaxLength=");
        d11.append(i12);
        d11.append(", invalidLengthError=");
        d11.append(str2);
        d11.append(", anonymousCell=");
        d11.append(cellWithSubtitleToggle);
        d11.append(", policyRulesButton=");
        d11.append(largeBorderlessButton);
        d11.append(", sendButton=");
        d11.append(largeButton);
        d11.append(", viewEvent=");
        d11.append(tVar);
        d11.append(")");
        return d11.toString();
    }
}
