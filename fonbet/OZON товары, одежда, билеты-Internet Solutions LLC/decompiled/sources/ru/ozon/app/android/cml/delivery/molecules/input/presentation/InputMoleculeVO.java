package ru.ozon.app.android.cml.delivery.molecules.input.presentation;

import B0.C2454a;
import Bi.a;
import P4.f;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.uni.android.input.textinput.data.OzonTextInputLayoutModel;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b#\b\u0080\b\u0018\u00002\u00020\u0001:\u0001CB\u0093\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b)\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b*\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b+\u0010\u001dR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00105\u001a\u0004\b6\u0010\u001fR\u0017\u0010\u0011\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u00105\u001a\u0004\b7\u0010\u001fR\u0017\u0010\u0012\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0012\u00105\u001a\u0004\b8\u0010\u001fR\u0017\u0010\u0013\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0013\u00105\u001a\u0004\b9\u0010\u001fR\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010:\u001a\u0004\b;\u0010<R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010=\u001a\u0004\b>\u0010?R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010@\u001a\u0004\bA\u0010B¨\u0006D"}, d2 = {"Lru/ozon/app/android/cml/delivery/molecules/input/presentation/InputMoleculeVO;", "", "Lru/ozon/app/android/cml/delivery/molecules/input/presentation/InputMoleculeVO$InputConfig;", "config", "", "backgroundColor", AppMeasurementSdk.ConditionalUserProperty.VALUE, HammersV3BodyDTO.PLACEHOLDER, "message", "Lru/ozon/uni/core/UniColors;", "messageColor", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$State;", "state", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$Status;", "status", "", "topPadding", "rightPadding", "bottomPadding", "leftPadding", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "common", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "", "debounce", "<init>", "(Lru/ozon/app/android/cml/delivery/molecules/input/presentation/InputMoleculeVO$InputConfig;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/core/UniColors;Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$State;Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$Status;IIIILru/ozon/uni/atoms/data/controls/CommonControlSettings;Lru/ozon/uni/atoms/af/AtomAction;J)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/cml/delivery/molecules/input/presentation/InputMoleculeVO$InputConfig;", "getConfig", "()Lru/ozon/app/android/cml/delivery/molecules/input/presentation/InputMoleculeVO$InputConfig;", "Ljava/lang/String;", "getBackgroundColor", "getValue", "getPlaceholder", "getMessage", "Lru/ozon/uni/core/UniColors;", "getMessageColor", "()Lru/ozon/uni/core/UniColors;", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$State;", "getState", "()Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$State;", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$Status;", "getStatus", "()Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$Status;", "I", "getTopPadding", "getRightPadding", "getBottomPadding", "getLeftPadding", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "J", "getDebounce", "()J", "InputConfig", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class InputMoleculeVO {
    private final AtomAction action;
    private final String backgroundColor;
    private final int bottomPadding;

    @NotNull
    private final CommonControlSettings common;

    @NotNull
    private final InputConfig config;
    private final long debounce;
    private final int leftPadding;
    private final String message;

    @NotNull
    private final UniColors messageColor;
    private final String placeholder;
    private final int rightPadding;
    private final OzonTextInputLayoutModel.State state;

    @NotNull
    private final OzonTextInputLayoutModel.Status status;
    private final int topPadding;
    private final String value;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\r\u000e\u000fB\u001b\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0003\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/cml/delivery/molecules/input/presentation/InputMoleculeVO$InputConfig;", "", "keyboardType", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$KeyboardType;", "maxLength", "", "<init>", "(Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$KeyboardType;Ljava/lang/Integer;)V", "getKeyboardType", "()Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$KeyboardType;", "getMaxLength", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "Money", "RawText", "Digital", "Lru/ozon/app/android/cml/delivery/molecules/input/presentation/InputMoleculeVO$InputConfig$Digital;", "Lru/ozon/app/android/cml/delivery/molecules/input/presentation/InputMoleculeVO$InputConfig$Money;", "Lru/ozon/app/android/cml/delivery/molecules/input/presentation/InputMoleculeVO$InputConfig$RawText;", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class InputConfig {

        @NotNull
        private final OzonTextInputLayoutModel.KeyboardType keyboardType;
        private final Integer maxLength;

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\t¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/cml/delivery/molecules/input/presentation/InputMoleculeVO$InputConfig$Digital;", "Lru/ozon/app/android/cml/delivery/molecules/input/presentation/InputMoleculeVO$InputConfig;", "", "maxLength", "", FormPageDTO.Field.FIELD_TYPE_MASK, "<init>", "(Ljava/lang/Integer;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getMaxLength", "()Ljava/lang/Integer;", "Ljava/lang/String;", "getMask", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Digital extends InputConfig {
            private final String mask;
            private final Integer maxLength;

            public Digital(Integer num, String str) {
                super(OzonTextInputLayoutModel.KeyboardType.NUMBER, num, null);
                this.maxLength = num;
                this.mask = str;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Digital)) {
                    return false;
                }
                Digital digital = (Digital) other;
                return Intrinsics.d(this.maxLength, digital.maxLength) && Intrinsics.d(this.mask, digital.mask);
            }

            public final String getMask() {
                return this.mask;
            }

            @Override // ru.ozon.app.android.cml.delivery.molecules.input.presentation.InputMoleculeVO.InputConfig
            public Integer getMaxLength() {
                return this.maxLength;
            }

            public int hashCode() {
                Integer num = this.maxLength;
                int hashCode = (num == null ? 0 : num.hashCode()) * 31;
                String str = this.mask;
                return hashCode + (str != null ? str.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "Digital(maxLength=" + this.maxLength + ", mask=" + this.mask + ")";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/cml/delivery/molecules/input/presentation/InputMoleculeVO$InputConfig$Money;", "Lru/ozon/app/android/cml/delivery/molecules/input/presentation/InputMoleculeVO$InputConfig;", "", "maxLength", "<init>", "(Ljava/lang/Integer;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getMaxLength", "()Ljava/lang/Integer;", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Money extends InputConfig {
            private final Integer maxLength;

            public Money(Integer num) {
                super(OzonTextInputLayoutModel.KeyboardType.NUMBER, num, null);
                this.maxLength = num;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Money) && Intrinsics.d(this.maxLength, ((Money) other).maxLength);
            }

            @Override // ru.ozon.app.android.cml.delivery.molecules.input.presentation.InputMoleculeVO.InputConfig
            public Integer getMaxLength() {
                return this.maxLength;
            }

            public int hashCode() {
                Integer num = this.maxLength;
                if (num == null) {
                    return 0;
                }
                return num.hashCode();
            }

            @NotNull
            public String toString() {
                return "Money(maxLength=" + this.maxLength + ")";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/cml/delivery/molecules/input/presentation/InputMoleculeVO$InputConfig$RawText;", "Lru/ozon/app/android/cml/delivery/molecules/input/presentation/InputMoleculeVO$InputConfig;", "", "maxLength", "<init>", "(Ljava/lang/Integer;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getMaxLength", "()Ljava/lang/Integer;", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class RawText extends InputConfig {
            private final Integer maxLength;

            public RawText(Integer num) {
                super(OzonTextInputLayoutModel.KeyboardType.TEXT, num, null);
                this.maxLength = num;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof RawText) && Intrinsics.d(this.maxLength, ((RawText) other).maxLength);
            }

            @Override // ru.ozon.app.android.cml.delivery.molecules.input.presentation.InputMoleculeVO.InputConfig
            public Integer getMaxLength() {
                return this.maxLength;
            }

            public int hashCode() {
                Integer num = this.maxLength;
                if (num == null) {
                    return 0;
                }
                return num.hashCode();
            }

            @NotNull
            public String toString() {
                return "RawText(maxLength=" + this.maxLength + ")";
            }
        }

        public /* synthetic */ InputConfig(OzonTextInputLayoutModel.KeyboardType keyboardType, Integer num, DefaultConstructorMarker defaultConstructorMarker) {
            this(keyboardType, num);
        }

        @NotNull
        public final OzonTextInputLayoutModel.KeyboardType getKeyboardType() {
            return this.keyboardType;
        }

        public abstract Integer getMaxLength();

        private InputConfig(OzonTextInputLayoutModel.KeyboardType keyboardType, Integer num) {
            this.keyboardType = keyboardType;
            this.maxLength = num;
        }
    }

    public InputMoleculeVO(@NotNull InputConfig config, String str, String str2, String str3, String str4, @NotNull UniColors messageColor, OzonTextInputLayoutModel.State state, @NotNull OzonTextInputLayoutModel.Status status, int i11, int i12, int i13, int i14, @NotNull CommonControlSettings common, AtomAction atomAction, long j11) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(messageColor, "messageColor");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(common, "common");
        this.config = config;
        this.backgroundColor = str;
        this.value = str2;
        this.placeholder = str3;
        this.message = str4;
        this.messageColor = messageColor;
        this.state = state;
        this.status = status;
        this.topPadding = i11;
        this.rightPadding = i12;
        this.bottomPadding = i13;
        this.leftPadding = i14;
        this.common = common;
        this.action = atomAction;
        this.debounce = j11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InputMoleculeVO)) {
            return false;
        }
        InputMoleculeVO inputMoleculeVO = (InputMoleculeVO) other;
        return Intrinsics.d(this.config, inputMoleculeVO.config) && Intrinsics.d(this.backgroundColor, inputMoleculeVO.backgroundColor) && Intrinsics.d(this.value, inputMoleculeVO.value) && Intrinsics.d(this.placeholder, inputMoleculeVO.placeholder) && Intrinsics.d(this.message, inputMoleculeVO.message) && this.messageColor == inputMoleculeVO.messageColor && this.state == inputMoleculeVO.state && this.status == inputMoleculeVO.status && this.topPadding == inputMoleculeVO.topPadding && this.rightPadding == inputMoleculeVO.rightPadding && this.bottomPadding == inputMoleculeVO.bottomPadding && this.leftPadding == inputMoleculeVO.leftPadding && Intrinsics.d(this.common, inputMoleculeVO.common) && Intrinsics.d(this.action, inputMoleculeVO.action) && this.debounce == inputMoleculeVO.debounce;
    }

    public final AtomAction getAction() {
        return this.action;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final int getBottomPadding() {
        return this.bottomPadding;
    }

    @NotNull
    public final CommonControlSettings getCommon() {
        return this.common;
    }

    @NotNull
    public final InputConfig getConfig() {
        return this.config;
    }

    public final long getDebounce() {
        return this.debounce;
    }

    public final int getLeftPadding() {
        return this.leftPadding;
    }

    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final UniColors getMessageColor() {
        return this.messageColor;
    }

    public final String getPlaceholder() {
        return this.placeholder;
    }

    public final int getRightPadding() {
        return this.rightPadding;
    }

    public final OzonTextInputLayoutModel.State getState() {
        return this.state;
    }

    @NotNull
    public final OzonTextInputLayoutModel.Status getStatus() {
        return this.status;
    }

    public final int getTopPadding() {
        return this.topPadding;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int hashCode = this.config.hashCode() * 31;
        String str = this.backgroundColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.value;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.placeholder;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.message;
        int hashCode5 = (this.messageColor.hashCode() + ((hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31)) * 31;
        OzonTextInputLayoutModel.State state = this.state;
        int a11 = a.a(this.common, C2454a.a(this.leftPadding, C2454a.a(this.bottomPadding, C2454a.a(this.rightPadding, C2454a.a(this.topPadding, (this.status.hashCode() + ((hashCode5 + (state == null ? 0 : state.hashCode())) * 31)) * 31, 31), 31), 31), 31), 31);
        AtomAction atomAction = this.action;
        return Long.hashCode(this.debounce) + ((a11 + (atomAction != null ? atomAction.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        InputConfig inputConfig = this.config;
        String str = this.backgroundColor;
        String str2 = this.value;
        String str3 = this.placeholder;
        String str4 = this.message;
        UniColors uniColors = this.messageColor;
        OzonTextInputLayoutModel.State state = this.state;
        OzonTextInputLayoutModel.Status status = this.status;
        int i11 = this.topPadding;
        int i12 = this.rightPadding;
        int i13 = this.bottomPadding;
        int i14 = this.leftPadding;
        CommonControlSettings commonControlSettings = this.common;
        AtomAction atomAction = this.action;
        long j11 = this.debounce;
        StringBuilder sb2 = new StringBuilder("InputMoleculeVO(config=");
        sb2.append(inputConfig);
        sb2.append(", backgroundColor=");
        sb2.append(str);
        sb2.append(", value=");
        Nh.a.h(sb2, str2, ", placeholder=", str3, ", message=");
        sb2.append(str4);
        sb2.append(", messageColor=");
        sb2.append(uniColors);
        sb2.append(", state=");
        sb2.append(state);
        sb2.append(", status=");
        sb2.append(status);
        sb2.append(", topPadding=");
        Ek.a.f(i11, i12, ", rightPadding=", ", bottomPadding=", sb2);
        Ek.a.f(i13, i14, ", leftPadding=", ", common=", sb2);
        sb2.append(commonControlSettings);
        sb2.append(", action=");
        sb2.append(atomAction);
        sb2.append(", debounce=");
        return f.a(j11, ")", sb2);
    }
}
