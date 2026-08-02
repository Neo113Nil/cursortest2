package ru.ozon.app.android.account.orders.recipientWidget.presentation;

import V.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0081\b\u0018\u00002\u00020\u0001:\u0001'B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJP\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b \u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0011R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b#\u0010\u0011R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Lru/ozon/app/android/account/orders/recipientWidget/presentation/RecipientVO;", "Ll20/c;", "", "id", "Lru/ozon/app/android/account/orders/recipientWidget/presentation/RecipientVO$TextInput;", "nameInput", "phoneInput", "", "regularId", "orderNumber", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "saveButton", "<init>", "(JLru/ozon/app/android/account/orders/recipientWidget/presentation/RecipientVO$TextInput;Lru/ozon/app/android/account/orders/recipientWidget/presentation/RecipientVO$TextInput;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)V", "copy", "(JLru/ozon/app/android/account/orders/recipientWidget/presentation/RecipientVO$TextInput;Lru/ozon/app/android/account/orders/recipientWidget/presentation/RecipientVO$TextInput;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)Lru/ozon/app/android/account/orders/recipientWidget/presentation/RecipientVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/account/orders/recipientWidget/presentation/RecipientVO$TextInput;", "getNameInput", "()Lru/ozon/app/android/account/orders/recipientWidget/presentation/RecipientVO$TextInput;", "getPhoneInput", "Ljava/lang/String;", "getRegularId", "getOrderNumber", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getSaveButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "TextInput", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class RecipientVO implements c {
    private final long id;

    @NotNull
    private final TextInput nameInput;
    private final String orderNumber;

    @NotNull
    private final TextInput phoneInput;
    private final String regularId;

    @NotNull
    private final ButtonV3DTO saveButton;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0012\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/account/orders/recipientWidget/presentation/RecipientVO$TextInput;", "", "", "hint", "text", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getHint", "getText", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TextInput {
        private final String hint;

        @NotNull
        private final String text;

        public TextInput(String str, @NotNull String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.hint = str;
            this.text = text;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TextInput)) {
                return false;
            }
            TextInput textInput = (TextInput) other;
            return Intrinsics.d(this.hint, textInput.hint) && Intrinsics.d(this.text, textInput.text);
        }

        public final String getHint() {
            return this.hint;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            String str = this.hint;
            return this.text.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @NotNull
        public String toString() {
            return e.a("TextInput(hint=", this.hint, ", text=", this.text, ")");
        }
    }

    public RecipientVO(long j11, @NotNull TextInput nameInput, @NotNull TextInput phoneInput, String str, String str2, @NotNull ButtonV3DTO saveButton) {
        Intrinsics.checkNotNullParameter(nameInput, "nameInput");
        Intrinsics.checkNotNullParameter(phoneInput, "phoneInput");
        Intrinsics.checkNotNullParameter(saveButton, "saveButton");
        this.id = j11;
        this.nameInput = nameInput;
        this.phoneInput = phoneInput;
        this.regularId = str;
        this.orderNumber = str2;
        this.saveButton = saveButton;
    }

    public static /* synthetic */ RecipientVO copy$default(RecipientVO recipientVO, long j11, TextInput textInput, TextInput textInput2, String str, String str2, ButtonV3DTO buttonV3DTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = recipientVO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            textInput = recipientVO.nameInput;
        }
        TextInput textInput3 = textInput;
        if ((i11 & 4) != 0) {
            textInput2 = recipientVO.phoneInput;
        }
        TextInput textInput4 = textInput2;
        if ((i11 & 8) != 0) {
            str = recipientVO.regularId;
        }
        String str3 = str;
        if ((i11 & 16) != 0) {
            str2 = recipientVO.orderNumber;
        }
        String str4 = str2;
        if ((i11 & 32) != 0) {
            buttonV3DTO = recipientVO.saveButton;
        }
        return recipientVO.copy(j12, textInput3, textInput4, str3, str4, buttonV3DTO);
    }

    @NotNull
    public final RecipientVO copy(long id2, @NotNull TextInput nameInput, @NotNull TextInput phoneInput, String regularId, String orderNumber, @NotNull ButtonV3DTO saveButton) {
        Intrinsics.checkNotNullParameter(nameInput, "nameInput");
        Intrinsics.checkNotNullParameter(phoneInput, "phoneInput");
        Intrinsics.checkNotNullParameter(saveButton, "saveButton");
        return new RecipientVO(id2, nameInput, phoneInput, regularId, orderNumber, saveButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecipientVO)) {
            return false;
        }
        RecipientVO recipientVO = (RecipientVO) other;
        return this.id == recipientVO.id && Intrinsics.d(this.nameInput, recipientVO.nameInput) && Intrinsics.d(this.phoneInput, recipientVO.phoneInput) && Intrinsics.d(this.regularId, recipientVO.regularId) && Intrinsics.d(this.orderNumber, recipientVO.orderNumber) && Intrinsics.d(this.saveButton, recipientVO.saveButton);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final TextInput getNameInput() {
        return this.nameInput;
    }

    public final String getOrderNumber() {
        return this.orderNumber;
    }

    @NotNull
    public final TextInput getPhoneInput() {
        return this.phoneInput;
    }

    public final String getRegularId() {
        return this.regularId;
    }

    @NotNull
    public final ButtonV3DTO getSaveButton() {
        return this.saveButton;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.phoneInput.hashCode() + ((this.nameInput.hashCode() + (Long.hashCode(this.id) * 31)) * 31)) * 31;
        String str = this.regularId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.orderNumber;
        return this.saveButton.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        return "RecipientVO(id=" + this.id + ", nameInput=" + this.nameInput + ", phoneInput=" + this.phoneInput + ", regularId=" + this.regularId + ", orderNumber=" + this.orderNumber + ", saveButton=" + this.saveButton + ")";
    }
}
