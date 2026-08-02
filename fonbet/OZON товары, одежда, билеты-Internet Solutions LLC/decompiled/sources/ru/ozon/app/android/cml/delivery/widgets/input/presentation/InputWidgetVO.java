package ru.ozon.app.android.cml.delivery.widgets.input.presentation;

import GR.b;
import Nh.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.uni.android.input.textinput.data.OzonTextInputLayoutModel;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b$\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001GB\u0089\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u0018\u001a\u00020\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b.\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b/\u0010\u001eR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b0\u0010\u001eR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u0010-\u001a\u0004\b1\u0010\u001eR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u00102\u001a\u0004\b3\u00104R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00105\u001a\u0004\b6\u00107R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00108\u001a\u0004\b9\u0010:R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010\u0016\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0016\u0010>\u001a\u0004\bA\u0010@R\u0017\u0010\u0017\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0017\u0010>\u001a\u0004\bB\u0010@R\u0017\u0010\u0018\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0018\u0010>\u001a\u0004\bC\u0010@R\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010D\u001a\u0004\bE\u0010F¨\u0006H"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/input/presentation/InputWidgetVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/cml/delivery/widgets/input/presentation/InputWidgetVO$InputConfig;", "config", "", "backgroundColor", AppMeasurementSdk.ConditionalUserProperty.VALUE, HammersV3BodyDTO.PLACEHOLDER, "message", "Lru/ozon/uni/core/UniColors;", "messageColor", "Lru/ozon/uni/atoms/af/AtomAction;", "tooltipAction", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$State;", "state", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$Status;", "status", "Lru/ozon/uni/atoms/data/common/Paddings;", "topPadding", "rightPadding", "bottomPadding", "leftPadding", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "common", "<init>", "(JLru/ozon/app/android/cml/delivery/widgets/input/presentation/InputWidgetVO$InputConfig;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/core/UniColors;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$State;Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$Status;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/cml/delivery/widgets/input/presentation/InputWidgetVO$InputConfig;", "getConfig", "()Lru/ozon/app/android/cml/delivery/widgets/input/presentation/InputWidgetVO$InputConfig;", "Ljava/lang/String;", "getBackgroundColor", "getValue", "getPlaceholder", "getMessage", "Lru/ozon/uni/core/UniColors;", "getMessageColor", "()Lru/ozon/uni/core/UniColors;", "Lru/ozon/uni/atoms/af/AtomAction;", "getTooltipAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$State;", "getState", "()Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$State;", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$Status;", "getStatus", "()Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$Status;", "Lru/ozon/uni/atoms/data/common/Paddings;", "getTopPadding", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getRightPadding", "getBottomPadding", "getLeftPadding", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "InputConfig", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class InputWidgetVO implements c {
    private final String backgroundColor;

    @NotNull
    private final Paddings bottomPadding;

    @NotNull
    private final CommonControlSettings common;

    @NotNull
    private final InputConfig config;
    private final long id;

    @NotNull
    private final Paddings leftPadding;
    private final String message;

    @NotNull
    private final UniColors messageColor;
    private final String placeholder;

    @NotNull
    private final Paddings rightPadding;

    @NotNull
    private final OzonTextInputLayoutModel.State state;

    @NotNull
    private final OzonTextInputLayoutModel.Status status;
    private final AtomAction tooltipAction;

    @NotNull
    private final Paddings topPadding;
    private final String value;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\r\u000eB\u001b\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0002\u000f\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/input/presentation/InputWidgetVO$InputConfig;", "", "keyboardType", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$KeyboardType;", "maxLength", "", "<init>", "(Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$KeyboardType;Ljava/lang/Integer;)V", "getKeyboardType", "()Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$KeyboardType;", "getMaxLength", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "Money", "RawText", "Lru/ozon/app/android/cml/delivery/widgets/input/presentation/InputWidgetVO$InputConfig$Money;", "Lru/ozon/app/android/cml/delivery/widgets/input/presentation/InputWidgetVO$InputConfig$RawText;", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class InputConfig {

        @NotNull
        private final OzonTextInputLayoutModel.KeyboardType keyboardType;
        private final Integer maxLength;

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/input/presentation/InputWidgetVO$InputConfig$Money;", "Lru/ozon/app/android/cml/delivery/widgets/input/presentation/InputWidgetVO$InputConfig;", "", "maxLength", "<init>", "(Ljava/lang/Integer;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getMaxLength", "()Ljava/lang/Integer;", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

            @Override // ru.ozon.app.android.cml.delivery.widgets.input.presentation.InputWidgetVO.InputConfig
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

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/input/presentation/InputWidgetVO$InputConfig$RawText;", "Lru/ozon/app/android/cml/delivery/widgets/input/presentation/InputWidgetVO$InputConfig;", "", "maxLength", "<init>", "(Ljava/lang/Integer;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getMaxLength", "()Ljava/lang/Integer;", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

            @Override // ru.ozon.app.android.cml.delivery.widgets.input.presentation.InputWidgetVO.InputConfig
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

    public InputWidgetVO(long j11, @NotNull InputConfig config, String str, String str2, String str3, String str4, @NotNull UniColors messageColor, AtomAction atomAction, @NotNull OzonTextInputLayoutModel.State state, @NotNull OzonTextInputLayoutModel.Status status, @NotNull Paddings topPadding, @NotNull Paddings rightPadding, @NotNull Paddings bottomPadding, @NotNull Paddings leftPadding, @NotNull CommonControlSettings common) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(messageColor, "messageColor");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(topPadding, "topPadding");
        Intrinsics.checkNotNullParameter(rightPadding, "rightPadding");
        Intrinsics.checkNotNullParameter(bottomPadding, "bottomPadding");
        Intrinsics.checkNotNullParameter(leftPadding, "leftPadding");
        Intrinsics.checkNotNullParameter(common, "common");
        this.id = j11;
        this.config = config;
        this.backgroundColor = str;
        this.value = str2;
        this.placeholder = str3;
        this.message = str4;
        this.messageColor = messageColor;
        this.tooltipAction = atomAction;
        this.state = state;
        this.status = status;
        this.topPadding = topPadding;
        this.rightPadding = rightPadding;
        this.bottomPadding = bottomPadding;
        this.leftPadding = leftPadding;
        this.common = common;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InputWidgetVO)) {
            return false;
        }
        InputWidgetVO inputWidgetVO = (InputWidgetVO) other;
        return this.id == inputWidgetVO.id && Intrinsics.d(this.config, inputWidgetVO.config) && Intrinsics.d(this.backgroundColor, inputWidgetVO.backgroundColor) && Intrinsics.d(this.value, inputWidgetVO.value) && Intrinsics.d(this.placeholder, inputWidgetVO.placeholder) && Intrinsics.d(this.message, inputWidgetVO.message) && this.messageColor == inputWidgetVO.messageColor && Intrinsics.d(this.tooltipAction, inputWidgetVO.tooltipAction) && this.state == inputWidgetVO.state && this.status == inputWidgetVO.status && this.topPadding == inputWidgetVO.topPadding && this.rightPadding == inputWidgetVO.rightPadding && this.bottomPadding == inputWidgetVO.bottomPadding && this.leftPadding == inputWidgetVO.leftPadding && Intrinsics.d(this.common, inputWidgetVO.common);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final Paddings getBottomPadding() {
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

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final Paddings getLeftPadding() {
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

    @NotNull
    public final Paddings getRightPadding() {
        return this.rightPadding;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final OzonTextInputLayoutModel.State getState() {
        return this.state;
    }

    @NotNull
    public final OzonTextInputLayoutModel.Status getStatus() {
        return this.status;
    }

    public final AtomAction getTooltipAction() {
        return this.tooltipAction;
    }

    @NotNull
    public final Paddings getTopPadding() {
        return this.topPadding;
    }

    public final String getValue() {
        return this.value;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.config.hashCode() + (Long.hashCode(this.id) * 31)) * 31;
        String str = this.backgroundColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.value;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.placeholder;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.message;
        int hashCode5 = (this.messageColor.hashCode() + ((hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31)) * 31;
        AtomAction atomAction = this.tooltipAction;
        return this.common.hashCode() + b.b(this.leftPadding, b.b(this.bottomPadding, b.b(this.rightPadding, b.b(this.topPadding, (this.status.hashCode() + ((this.state.hashCode() + ((hashCode5 + (atomAction != null ? atomAction.hashCode() : 0)) * 31)) * 31)) * 31, 31), 31), 31), 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        InputConfig inputConfig = this.config;
        String str = this.backgroundColor;
        String str2 = this.value;
        String str3 = this.placeholder;
        String str4 = this.message;
        UniColors uniColors = this.messageColor;
        AtomAction atomAction = this.tooltipAction;
        OzonTextInputLayoutModel.State state = this.state;
        OzonTextInputLayoutModel.Status status = this.status;
        Paddings paddings = this.topPadding;
        Paddings paddings2 = this.rightPadding;
        Paddings paddings3 = this.bottomPadding;
        Paddings paddings4 = this.leftPadding;
        CommonControlSettings commonControlSettings = this.common;
        StringBuilder sb2 = new StringBuilder("InputWidgetVO(id=");
        sb2.append(j11);
        sb2.append(", config=");
        sb2.append(inputConfig);
        a.h(sb2, ", backgroundColor=", str, ", value=", str2);
        a.h(sb2, ", placeholder=", str3, ", message=", str4);
        sb2.append(", messageColor=");
        sb2.append(uniColors);
        sb2.append(", tooltipAction=");
        sb2.append(atomAction);
        sb2.append(", state=");
        sb2.append(state);
        sb2.append(", status=");
        sb2.append(status);
        sb2.append(", topPadding=");
        sb2.append(paddings);
        sb2.append(", rightPadding=");
        sb2.append(paddings2);
        sb2.append(", bottomPadding=");
        sb2.append(paddings3);
        sb2.append(", leftPadding=");
        sb2.append(paddings4);
        sb2.append(", common=");
        sb2.append(commonControlSettings);
        sb2.append(")");
        return sb2.toString();
    }
}
