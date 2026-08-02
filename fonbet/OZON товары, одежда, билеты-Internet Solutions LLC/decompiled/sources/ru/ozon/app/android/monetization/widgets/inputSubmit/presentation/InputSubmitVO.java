package ru.ozon.app.android.monetization.widgets.inputSubmit.presentation;

import C.o0;
import De.C2859b;
import G.g;
import N3.C3660k;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0081\b\u0018\u00002\u00020\u0001:\u0001)B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"R\u001f\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t8\u0006¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lru/ozon/app/android/monetization/widgets/inputSubmit/presentation/InputSubmitVO;", "Ll20/c;", "", "id", "Lru/ozon/app/android/monetization/widgets/inputSubmit/presentation/InputSubmitVO$TextArea;", SelectionItemFormDTO.TEXT_AREA_FIELD_NAME, "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "button", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "Lru/ozon/uni/atoms/data/TestInfo;", "testInfo", "<init>", "(JLru/ozon/app/android/monetization/widgets/inputSubmit/presentation/InputSubmitVO$TextArea;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;LWZ/t;Lru/ozon/uni/atoms/data/TestInfo;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/monetization/widgets/inputSubmit/presentation/InputSubmitVO$TextArea;", "getTextArea", "()Lru/ozon/app/android/monetization/widgets/inputSubmit/presentation/InputSubmitVO$TextArea;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Lru/ozon/uni/atoms/data/TestInfo;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "TextArea", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class InputSubmitVO implements c {

    @NotNull
    private final ButtonV3DTO button;
    private final long id;
    private final TestInfo testInfo;

    @NotNull
    private final TextArea textArea;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0014\u0010\t¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/monetization/widgets/inputSubmit/presentation/InputSubmitVO$TextArea;", "", "", "uploadKey", HammersV3BodyDTO.PLACEHOLDER, "errorRequiredText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUploadKey", "getPlaceholder", "getErrorRequiredText", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TextArea {

        @NotNull
        private final String errorRequiredText;

        @NotNull
        private final String placeholder;

        @NotNull
        private final String uploadKey;

        public TextArea(@NotNull String uploadKey, @NotNull String placeholder, @NotNull String errorRequiredText) {
            Intrinsics.checkNotNullParameter(uploadKey, "uploadKey");
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            Intrinsics.checkNotNullParameter(errorRequiredText, "errorRequiredText");
            this.uploadKey = uploadKey;
            this.placeholder = placeholder;
            this.errorRequiredText = errorRequiredText;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TextArea)) {
                return false;
            }
            TextArea textArea = (TextArea) other;
            return Intrinsics.d(this.uploadKey, textArea.uploadKey) && Intrinsics.d(this.placeholder, textArea.placeholder) && Intrinsics.d(this.errorRequiredText, textArea.errorRequiredText);
        }

        @NotNull
        public final String getErrorRequiredText() {
            return this.errorRequiredText;
        }

        @NotNull
        public final String getPlaceholder() {
            return this.placeholder;
        }

        @NotNull
        public final String getUploadKey() {
            return this.uploadKey;
        }

        public int hashCode() {
            return this.errorRequiredText.hashCode() + g.a(this.uploadKey.hashCode() * 31, 31, this.placeholder);
        }

        @NotNull
        public String toString() {
            String str = this.uploadKey;
            String str2 = this.placeholder;
            return o0.c(C3660k.d("TextArea(uploadKey=", str, ", placeholder=", str2, ", errorRequiredText="), this.errorRequiredText, ")");
        }
    }

    public InputSubmitVO(long j11, @NotNull TextArea textArea, @NotNull ButtonV3DTO button, t tVar, TestInfo testInfo) {
        Intrinsics.checkNotNullParameter(textArea, "textArea");
        Intrinsics.checkNotNullParameter(button, "button");
        this.id = j11;
        this.textArea = textArea;
        this.button = button;
        this.tokenizedEvent = tVar;
        this.testInfo = testInfo;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InputSubmitVO)) {
            return false;
        }
        InputSubmitVO inputSubmitVO = (InputSubmitVO) other;
        return this.id == inputSubmitVO.id && Intrinsics.d(this.textArea, inputSubmitVO.textArea) && Intrinsics.d(this.button, inputSubmitVO.button) && Intrinsics.d(this.tokenizedEvent, inputSubmitVO.tokenizedEvent) && Intrinsics.d(this.testInfo, inputSubmitVO.testInfo);
    }

    @NotNull
    public final ButtonV3DTO getButton() {
        return this.button;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    @NotNull
    public final TextArea getTextArea() {
        return this.textArea;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int c11 = C2859b.c(this.button, (this.textArea.hashCode() + (Long.hashCode(this.id) * 31)) * 31, 31);
        t tVar = this.tokenizedEvent;
        int hashCode = (c11 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        return hashCode + (testInfo != null ? testInfo.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "InputSubmitVO(id=" + this.id + ", textArea=" + this.textArea + ", button=" + this.button + ", tokenizedEvent=" + this.tokenizedEvent + ", testInfo=" + this.testInfo + ")";
    }
}
