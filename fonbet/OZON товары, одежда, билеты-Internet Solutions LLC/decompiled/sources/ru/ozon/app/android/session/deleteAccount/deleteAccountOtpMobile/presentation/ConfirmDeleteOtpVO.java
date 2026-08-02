package ru.ozon.app.android.session.deleteAccount.deleteAccountOtpMobile.presentation;

import Ak.C2436a;
import G.g;
import Nh.a;
import V.e;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.session.deleteAccount.deleteAccountOtpMobile.data.ConfirmDeleteOtpDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002./BO\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b!\u0010\u0014R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b\"\u0010\u0014R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010,\u001a\u0004\b-\u0010\u0016¨\u00060"}, d2 = {"Lru/ozon/app/android/session/deleteAccount/deleteAccountOtpMobile/presentation/ConfirmDeleteOtpVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "text", "action", "Lru/ozon/app/android/session/deleteAccount/deleteAccountOtpMobile/presentation/ConfirmDeleteOtpVO$Input;", "input", "Lru/ozon/app/android/session/deleteAccount/deleteAccountOtpMobile/data/ConfirmDeleteOtpDTO$Timer;", DynamicElementDTO.TIMER, "Lru/ozon/app/android/session/deleteAccount/deleteAccountOtpMobile/presentation/ConfirmDeleteOtpVO$Button;", "button", "", "otpLength", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/session/deleteAccount/deleteAccountOtpMobile/presentation/ConfirmDeleteOtpVO$Input;Lru/ozon/app/android/session/deleteAccount/deleteAccountOtpMobile/data/ConfirmDeleteOtpDTO$Timer;Lru/ozon/app/android/session/deleteAccount/deleteAccountOtpMobile/presentation/ConfirmDeleteOtpVO$Button;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getTitle", "getText", "getAction", "Lru/ozon/app/android/session/deleteAccount/deleteAccountOtpMobile/presentation/ConfirmDeleteOtpVO$Input;", "getInput", "()Lru/ozon/app/android/session/deleteAccount/deleteAccountOtpMobile/presentation/ConfirmDeleteOtpVO$Input;", "Lru/ozon/app/android/session/deleteAccount/deleteAccountOtpMobile/data/ConfirmDeleteOtpDTO$Timer;", "getTimer", "()Lru/ozon/app/android/session/deleteAccount/deleteAccountOtpMobile/data/ConfirmDeleteOtpDTO$Timer;", "Lru/ozon/app/android/session/deleteAccount/deleteAccountOtpMobile/presentation/ConfirmDeleteOtpVO$Button;", "getButton", "()Lru/ozon/app/android/session/deleteAccount/deleteAccountOtpMobile/presentation/ConfirmDeleteOtpVO$Button;", "I", "getOtpLength", "Input", "Button", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ConfirmDeleteOtpVO implements c {
    private final String action;
    private final Button button;
    private final long id;
    private final Input input;
    private final int otpLength;

    @NotNull
    private final String text;
    private final ConfirmDeleteOtpDTO.Timer timer;

    @NotNull
    private final String title;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0012\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/session/deleteAccount/deleteAccountOtpMobile/presentation/ConfirmDeleteOtpVO$Button;", "", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "action", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getAction", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Button {

        @NotNull
        private final String action;

        @NotNull
        private final String title;

        public Button(@NotNull String title, @NotNull String action) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(action, "action");
            this.title = title;
            this.action = action;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Button)) {
                return false;
            }
            Button button = (Button) other;
            return Intrinsics.d(this.title, button.title) && Intrinsics.d(this.action, button.action);
        }

        @NotNull
        public final String getAction() {
            return this.action;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.action.hashCode() + (this.title.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return e.a("Button(title=", this.title, ", action=", this.action, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\t¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/session/deleteAccount/deleteAccountOtpMobile/presentation/ConfirmDeleteOtpVO$Input;", "", "", "inputType", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "<init>", "(Ljava/lang/Integer;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getInputType", "()Ljava/lang/Integer;", "Ljava/lang/String;", "getName", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Input {
        private final Integer inputType;

        @NotNull
        private final String name;

        public Input(Integer num, @NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.inputType = num;
            this.name = name;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Input)) {
                return false;
            }
            Input input = (Input) other;
            return Intrinsics.d(this.inputType, input.inputType) && Intrinsics.d(this.name, input.name);
        }

        public final Integer getInputType() {
            return this.inputType;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            Integer num = this.inputType;
            return this.name.hashCode() + ((num == null ? 0 : num.hashCode()) * 31);
        }

        @NotNull
        public String toString() {
            return "Input(inputType=" + this.inputType + ", name=" + this.name + ")";
        }
    }

    public ConfirmDeleteOtpVO(long j11, @NotNull String title, @NotNull String text, String str, Input input, ConfirmDeleteOtpDTO.Timer timer, Button button, int i11) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(text, "text");
        this.id = j11;
        this.title = title;
        this.text = text;
        this.action = str;
        this.input = input;
        this.timer = timer;
        this.button = button;
        this.otpLength = i11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConfirmDeleteOtpVO)) {
            return false;
        }
        ConfirmDeleteOtpVO confirmDeleteOtpVO = (ConfirmDeleteOtpVO) other;
        return this.id == confirmDeleteOtpVO.id && Intrinsics.d(this.title, confirmDeleteOtpVO.title) && Intrinsics.d(this.text, confirmDeleteOtpVO.text) && Intrinsics.d(this.action, confirmDeleteOtpVO.action) && Intrinsics.d(this.input, confirmDeleteOtpVO.input) && Intrinsics.d(this.timer, confirmDeleteOtpVO.timer) && Intrinsics.d(this.button, confirmDeleteOtpVO.button) && this.otpLength == confirmDeleteOtpVO.otpLength;
    }

    public final String getAction() {
        return this.action;
    }

    public final Button getButton() {
        return this.button;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final Input getInput() {
        return this.input;
    }

    public final int getOtpLength() {
        return this.otpLength;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public final ConfirmDeleteOtpDTO.Timer getTimer() {
        return this.timer;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = g.a(g.a(Long.hashCode(this.id) * 31, 31, this.title), 31, this.text);
        String str = this.action;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        Input input = this.input;
        int hashCode2 = (hashCode + (input == null ? 0 : input.hashCode())) * 31;
        ConfirmDeleteOtpDTO.Timer timer = this.timer;
        int hashCode3 = (hashCode2 + (timer == null ? 0 : timer.hashCode())) * 31;
        Button button = this.button;
        return Integer.hashCode(this.otpLength) + ((hashCode3 + (button != null ? button.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.title;
        String str2 = this.text;
        String str3 = this.action;
        Input input = this.input;
        ConfirmDeleteOtpDTO.Timer timer = this.timer;
        Button button = this.button;
        int i11 = this.otpLength;
        StringBuilder c11 = C2436a.c(j11, "ConfirmDeleteOtpVO(id=", ", title=", str);
        a.h(c11, ", text=", str2, ", action=", str3);
        c11.append(", input=");
        c11.append(input);
        c11.append(", timer=");
        c11.append(timer);
        c11.append(", button=");
        c11.append(button);
        c11.append(", otpLength=");
        c11.append(i11);
        c11.append(")");
        return c11.toString();
    }
}
