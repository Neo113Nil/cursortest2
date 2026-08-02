package ru.ozon.app.android.session.deleteAccount.deleteAccountOtpMobile.data;

import C.o0;
import G.g;
import K00.b;
import N3.C3660k;
import V.e;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001:\u0003)*+BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010\"\u001a\u00020\rHÆ\u0003JW\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\rHÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006,"}, d2 = {"Lru/ozon/app/android/session/deleteAccount/deleteAccountOtpMobile/data/ConfirmDeleteOtpDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "text", "action", "input", "Lru/ozon/app/android/session/deleteAccount/deleteAccountOtpMobile/data/ConfirmDeleteOtpDTO$Input;", DynamicElementDTO.TIMER, "Lru/ozon/app/android/session/deleteAccount/deleteAccountOtpMobile/data/ConfirmDeleteOtpDTO$Timer;", "submitButton", "Lru/ozon/app/android/session/deleteAccount/deleteAccountOtpMobile/data/ConfirmDeleteOtpDTO$Button;", "otpLength", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/session/deleteAccount/deleteAccountOtpMobile/data/ConfirmDeleteOtpDTO$Input;Lru/ozon/app/android/session/deleteAccount/deleteAccountOtpMobile/data/ConfirmDeleteOtpDTO$Timer;Lru/ozon/app/android/session/deleteAccount/deleteAccountOtpMobile/data/ConfirmDeleteOtpDTO$Button;I)V", "getTitle", "()Ljava/lang/String;", "getText", "getAction", "getInput", "()Lru/ozon/app/android/session/deleteAccount/deleteAccountOtpMobile/data/ConfirmDeleteOtpDTO$Input;", "getTimer", "()Lru/ozon/app/android/session/deleteAccount/deleteAccountOtpMobile/data/ConfirmDeleteOtpDTO$Timer;", "getSubmitButton", "()Lru/ozon/app/android/session/deleteAccount/deleteAccountOtpMobile/data/ConfirmDeleteOtpDTO$Button;", "getOtpLength", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "Input", "Timer", "Button", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ConfirmDeleteOtpDTO {
    public static final int $stable = 0;
    private final String action;
    private final Input input;
    private final int otpLength;
    private final Button submitButton;

    @NotNull
    private final String text;
    private final Timer timer;

    @NotNull
    private final String title;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/session/deleteAccount/deleteAccountOtpMobile/data/ConfirmDeleteOtpDTO$Button;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "action", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getAction", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Button {
        public static final int $stable = 0;

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

        public static /* synthetic */ Button copy$default(Button button, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = button.title;
            }
            if ((i11 & 2) != 0) {
                str2 = button.action;
            }
            return button.copy(str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getAction() {
            return this.action;
        }

        @NotNull
        public final Button copy(@NotNull String title, @NotNull String action) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(action, "action");
            return new Button(title, action);
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

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/session/deleteAccount/deleteAccountOtpMobile/data/ConfirmDeleteOtpDTO$Input;", "", "type", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "getName", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Input {
        public static final int $stable = 0;

        @NotNull
        private final String name;

        @NotNull
        private final String type;

        public Input(@NotNull String type, @NotNull String name) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(name, "name");
            this.type = type;
            this.name = name;
        }

        public static /* synthetic */ Input copy$default(Input input, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = input.type;
            }
            if ((i11 & 2) != 0) {
                str2 = input.name;
            }
            return input.copy(str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getType() {
            return this.type;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final Input copy(@NotNull String type, @NotNull String name) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(name, "name");
            return new Input(type, name);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Input)) {
                return false;
            }
            Input input = (Input) other;
            return Intrinsics.d(this.type, input.type) && Intrinsics.d(this.name, input.name);
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            return this.name.hashCode() + (this.type.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return e.a("Input(type=", this.type, ", name=", this.name, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/session/deleteAccount/deleteAccountOtpMobile/data/ConfirmDeleteOtpDTO$Timer;", "", "duration", "", "messageFormat", "", "repeatMsg", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "getDuration", "()I", "getMessageFormat", "()Ljava/lang/String;", "getRepeatMsg", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Timer {
        public static final int $stable = 0;
        private final int duration;

        @NotNull
        private final String messageFormat;

        @NotNull
        private final String repeatMsg;

        public Timer(int i11, @NotNull String messageFormat, @NotNull String repeatMsg) {
            Intrinsics.checkNotNullParameter(messageFormat, "messageFormat");
            Intrinsics.checkNotNullParameter(repeatMsg, "repeatMsg");
            this.duration = i11;
            this.messageFormat = messageFormat;
            this.repeatMsg = repeatMsg;
        }

        public static /* synthetic */ Timer copy$default(Timer timer, int i11, String str, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = timer.duration;
            }
            if ((i12 & 2) != 0) {
                str = timer.messageFormat;
            }
            if ((i12 & 4) != 0) {
                str2 = timer.repeatMsg;
            }
            return timer.copy(i11, str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final int getDuration() {
            return this.duration;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getMessageFormat() {
            return this.messageFormat;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getRepeatMsg() {
            return this.repeatMsg;
        }

        @NotNull
        public final Timer copy(int duration, @NotNull String messageFormat, @NotNull String repeatMsg) {
            Intrinsics.checkNotNullParameter(messageFormat, "messageFormat");
            Intrinsics.checkNotNullParameter(repeatMsg, "repeatMsg");
            return new Timer(duration, messageFormat, repeatMsg);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Timer)) {
                return false;
            }
            Timer timer = (Timer) other;
            return this.duration == timer.duration && Intrinsics.d(this.messageFormat, timer.messageFormat) && Intrinsics.d(this.repeatMsg, timer.repeatMsg);
        }

        public final int getDuration() {
            return this.duration;
        }

        @NotNull
        public final String getMessageFormat() {
            return this.messageFormat;
        }

        @NotNull
        public final String getRepeatMsg() {
            return this.repeatMsg;
        }

        public int hashCode() {
            return this.repeatMsg.hashCode() + g.a(Integer.hashCode(this.duration) * 31, 31, this.messageFormat);
        }

        @NotNull
        public String toString() {
            int i11 = this.duration;
            String str = this.messageFormat;
            return o0.c(Cm.e.g(i11, "Timer(duration=", ", messageFormat=", str, ", repeatMsg="), this.repeatMsg, ")");
        }
    }

    public ConfirmDeleteOtpDTO(@NotNull String title, @NotNull String text, String str, Input input, Timer timer, Button button, int i11) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(text, "text");
        this.title = title;
        this.text = text;
        this.action = str;
        this.input = input;
        this.timer = timer;
        this.submitButton = button;
        this.otpLength = i11;
    }

    public static /* synthetic */ ConfirmDeleteOtpDTO copy$default(ConfirmDeleteOtpDTO confirmDeleteOtpDTO, String str, String str2, String str3, Input input, Timer timer, Button button, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = confirmDeleteOtpDTO.title;
        }
        if ((i12 & 2) != 0) {
            str2 = confirmDeleteOtpDTO.text;
        }
        if ((i12 & 4) != 0) {
            str3 = confirmDeleteOtpDTO.action;
        }
        if ((i12 & 8) != 0) {
            input = confirmDeleteOtpDTO.input;
        }
        if ((i12 & 16) != 0) {
            timer = confirmDeleteOtpDTO.timer;
        }
        if ((i12 & 32) != 0) {
            button = confirmDeleteOtpDTO.submitButton;
        }
        if ((i12 & 64) != 0) {
            i11 = confirmDeleteOtpDTO.otpLength;
        }
        Button button2 = button;
        int i13 = i11;
        Timer timer2 = timer;
        String str4 = str3;
        return confirmDeleteOtpDTO.copy(str, str2, str4, input, timer2, button2, i13);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    /* renamed from: component4, reason: from getter */
    public final Input getInput() {
        return this.input;
    }

    /* renamed from: component5, reason: from getter */
    public final Timer getTimer() {
        return this.timer;
    }

    /* renamed from: component6, reason: from getter */
    public final Button getSubmitButton() {
        return this.submitButton;
    }

    /* renamed from: component7, reason: from getter */
    public final int getOtpLength() {
        return this.otpLength;
    }

    @NotNull
    public final ConfirmDeleteOtpDTO copy(@NotNull String title, @NotNull String text, String action, Input input, Timer timer, Button submitButton, int otpLength) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(text, "text");
        return new ConfirmDeleteOtpDTO(title, text, action, input, timer, submitButton, otpLength);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConfirmDeleteOtpDTO)) {
            return false;
        }
        ConfirmDeleteOtpDTO confirmDeleteOtpDTO = (ConfirmDeleteOtpDTO) other;
        return Intrinsics.d(this.title, confirmDeleteOtpDTO.title) && Intrinsics.d(this.text, confirmDeleteOtpDTO.text) && Intrinsics.d(this.action, confirmDeleteOtpDTO.action) && Intrinsics.d(this.input, confirmDeleteOtpDTO.input) && Intrinsics.d(this.timer, confirmDeleteOtpDTO.timer) && Intrinsics.d(this.submitButton, confirmDeleteOtpDTO.submitButton) && this.otpLength == confirmDeleteOtpDTO.otpLength;
    }

    public final String getAction() {
        return this.action;
    }

    public final Input getInput() {
        return this.input;
    }

    public final int getOtpLength() {
        return this.otpLength;
    }

    public final Button getSubmitButton() {
        return this.submitButton;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public final Timer getTimer() {
        return this.timer;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int a11 = g.a(this.title.hashCode() * 31, 31, this.text);
        String str = this.action;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        Input input = this.input;
        int hashCode2 = (hashCode + (input == null ? 0 : input.hashCode())) * 31;
        Timer timer = this.timer;
        int hashCode3 = (hashCode2 + (timer == null ? 0 : timer.hashCode())) * 31;
        Button button = this.submitButton;
        return Integer.hashCode(this.otpLength) + ((hashCode3 + (button != null ? button.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.text;
        String str3 = this.action;
        Input input = this.input;
        Timer timer = this.timer;
        Button button = this.submitButton;
        int i11 = this.otpLength;
        StringBuilder d11 = C3660k.d("ConfirmDeleteOtpDTO(title=", str, ", text=", str2, ", action=");
        d11.append(str3);
        d11.append(", input=");
        d11.append(input);
        d11.append(", timer=");
        d11.append(timer);
        d11.append(", submitButton=");
        d11.append(button);
        d11.append(", otpLength=");
        return b.e(i11, ")", d11);
    }
}
