package ru.ozon.fintech.ui.input;

import B0.C2454a;
import androidx.annotation.Keep;
import com.detmir.recycli.adapters.RecyclerItem;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.fintech.ui.input.InputView;
import ru.ozon.fintech.ui.utils.Common;
import ru.ozon.fintech.ui.utils.WidgetState;

@Keep
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b3\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B¿\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u001b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010:\u001a\u00020\u0006H\u0016J\t\u0010;\u001a\u00020\u0004HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010=\u001a\u00020\bHÆ\u0003J\t\u0010>\u001a\u00020\nHÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010B\u001a\u00020\u000fHÆ\u0003J\t\u0010C\u001a\u00020\u0011HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010F\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u00101J\u000b\u0010G\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010H\u001a\u00020\u0018HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010J\u001a\u00020\u001bHÆ\u0003J\u0010\u0010K\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u00101JÌ\u0001\u0010L\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0015HÆ\u0001¢\u0006\u0002\u0010MJ\u0013\u0010N\u001a\u00020O2\b\u0010P\u001a\u0004\u0018\u00010QHÖ\u0003J\t\u0010R\u001a\u00020\u0015HÖ\u0001J\t\u0010S\u001a\u00020\u0006HÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\"R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\"R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\"R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\"R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\"R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\n\n\u0002\u00102\u001a\u0004\b0\u00101R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\"R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\"R\u0011\u0010\u001a\u001a\u00020\u001b¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0015\u0010\u001c\u001a\u0004\u0018\u00010\u0015¢\u0006\n\n\u0002\u00102\u001a\u0004\b9\u00101¨\u0006T"}, d2 = {"Lru/ozon/fintech/ui/input/FinInputState;", "Lcom/detmir/recycli/adapters/RecyclerItem;", "Lru/ozon/fintech/ui/utils/WidgetState;", "common", "Lru/ozon/fintech/ui/utils/Common;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "size", "Lru/ozon/fintech/ui/input/InputView$Size;", "theme", "Lru/ozon/fintech/ui/input/InputView$Theme;", HammersV3BodyDTO.PLACEHOLDER, "caption", "captionColor", "status", "Lru/ozon/fintech/ui/input/InputView$Status;", "state", "Lru/ozon/fintech/ui/input/InputView$State;", "firstIcon", "secondIcon", "maxLength", "", "label", "labelPosition", "Lru/ozon/fintech/ui/input/InputView$LabelPosition;", "inputMask", "inputMode", "Lru/ozon/fintech/ui/input/InputView$InputMode;", "versionStamp", "<init>", "(Lru/ozon/fintech/ui/utils/Common;Ljava/lang/String;Lru/ozon/fintech/ui/input/InputView$Size;Lru/ozon/fintech/ui/input/InputView$Theme;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/fintech/ui/input/InputView$Status;Lru/ozon/fintech/ui/input/InputView$State;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lru/ozon/fintech/ui/input/InputView$LabelPosition;Ljava/lang/String;Lru/ozon/fintech/ui/input/InputView$InputMode;Ljava/lang/Integer;)V", "getCommon", "()Lru/ozon/fintech/ui/utils/Common;", "getValue", "()Ljava/lang/String;", "getSize", "()Lru/ozon/fintech/ui/input/InputView$Size;", "getTheme", "()Lru/ozon/fintech/ui/input/InputView$Theme;", "getPlaceholder", "getCaption", "getCaptionColor", "getStatus", "()Lru/ozon/fintech/ui/input/InputView$Status;", "getState", "()Lru/ozon/fintech/ui/input/InputView$State;", "getFirstIcon", "getSecondIcon", "getMaxLength", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLabel", "getLabelPosition", "()Lru/ozon/fintech/ui/input/InputView$LabelPosition;", "getInputMask", "getInputMode", "()Lru/ozon/fintech/ui/input/InputView$InputMode;", "getVersionStamp", "provideId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "copy", "(Lru/ozon/fintech/ui/utils/Common;Ljava/lang/String;Lru/ozon/fintech/ui/input/InputView$Size;Lru/ozon/fintech/ui/input/InputView$Theme;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/fintech/ui/input/InputView$Status;Lru/ozon/fintech/ui/input/InputView$State;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lru/ozon/fintech/ui/input/InputView$LabelPosition;Ljava/lang/String;Lru/ozon/fintech/ui/input/InputView$InputMode;Ljava/lang/Integer;)Lru/ozon/fintech/ui/input/FinInputState;", "equals", "", "other", "", "hashCode", "toString", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FinInputState implements RecyclerItem, WidgetState {
    private final String caption;
    private final String captionColor;

    @NotNull
    private final Common common;
    private final String firstIcon;
    private final String inputMask;

    @NotNull
    private final InputView.InputMode inputMode;
    private final String label;

    @NotNull
    private final InputView.LabelPosition labelPosition;
    private final Integer maxLength;
    private final String placeholder;
    private final String secondIcon;

    @NotNull
    private final InputView.Size size;

    @NotNull
    private final InputView.State state;

    @NotNull
    private final InputView.Status status;

    @NotNull
    private final InputView.Theme theme;
    private final String value;
    private final Integer versionStamp;

    public FinInputState(@NotNull Common common, String str, @NotNull InputView.Size size, @NotNull InputView.Theme theme, String str2, String str3, String str4, @NotNull InputView.Status status, @NotNull InputView.State state, String str5, String str6, Integer num, String str7, @NotNull InputView.LabelPosition labelPosition, String str8, @NotNull InputView.InputMode inputMode, Integer num2) {
        Intrinsics.checkNotNullParameter(common, "common");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(theme, "theme");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(labelPosition, "labelPosition");
        Intrinsics.checkNotNullParameter(inputMode, "inputMode");
        this.common = common;
        this.value = str;
        this.size = size;
        this.theme = theme;
        this.placeholder = str2;
        this.caption = str3;
        this.captionColor = str4;
        this.status = status;
        this.state = state;
        this.firstIcon = str5;
        this.secondIcon = str6;
        this.maxLength = num;
        this.label = str7;
        this.labelPosition = labelPosition;
        this.inputMask = str8;
        this.inputMode = inputMode;
        this.versionStamp = num2;
    }

    public static /* synthetic */ FinInputState copy$default(FinInputState finInputState, Common common, String str, InputView.Size size, InputView.Theme theme, String str2, String str3, String str4, InputView.Status status, InputView.State state, String str5, String str6, Integer num, String str7, InputView.LabelPosition labelPosition, String str8, InputView.InputMode inputMode, Integer num2, int i11, Object obj) {
        Integer num3;
        InputView.InputMode inputMode2;
        Common common2;
        FinInputState finInputState2;
        String str9;
        String str10;
        InputView.Size size2;
        InputView.Theme theme2;
        String str11;
        String str12;
        String str13;
        InputView.Status status2;
        InputView.State state2;
        String str14;
        String str15;
        Integer num4;
        String str16;
        InputView.LabelPosition labelPosition2;
        Common common3 = (i11 & 1) != 0 ? finInputState.common : common;
        String str17 = (i11 & 2) != 0 ? finInputState.value : str;
        InputView.Size size3 = (i11 & 4) != 0 ? finInputState.size : size;
        InputView.Theme theme3 = (i11 & 8) != 0 ? finInputState.theme : theme;
        String str18 = (i11 & 16) != 0 ? finInputState.placeholder : str2;
        String str19 = (i11 & 32) != 0 ? finInputState.caption : str3;
        String str20 = (i11 & 64) != 0 ? finInputState.captionColor : str4;
        InputView.Status status3 = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? finInputState.status : status;
        InputView.State state3 = (i11 & 256) != 0 ? finInputState.state : state;
        String str21 = (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? finInputState.firstIcon : str5;
        String str22 = (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? finInputState.secondIcon : str6;
        Integer num5 = (i11 & 2048) != 0 ? finInputState.maxLength : num;
        String str23 = (i11 & 4096) != 0 ? finInputState.label : str7;
        InputView.LabelPosition labelPosition3 = (i11 & 8192) != 0 ? finInputState.labelPosition : labelPosition;
        Common common4 = common3;
        String str24 = (i11 & 16384) != 0 ? finInputState.inputMask : str8;
        InputView.InputMode inputMode3 = (i11 & 32768) != 0 ? finInputState.inputMode : inputMode;
        if ((i11 & 65536) != 0) {
            inputMode2 = inputMode3;
            num3 = finInputState.versionStamp;
            str9 = str24;
            str10 = str17;
            size2 = size3;
            theme2 = theme3;
            str11 = str18;
            str12 = str19;
            str13 = str20;
            status2 = status3;
            state2 = state3;
            str14 = str21;
            str15 = str22;
            num4 = num5;
            str16 = str23;
            labelPosition2 = labelPosition3;
            common2 = common4;
            finInputState2 = finInputState;
        } else {
            num3 = num2;
            inputMode2 = inputMode3;
            common2 = common4;
            finInputState2 = finInputState;
            str9 = str24;
            str10 = str17;
            size2 = size3;
            theme2 = theme3;
            str11 = str18;
            str12 = str19;
            str13 = str20;
            status2 = status3;
            state2 = state3;
            str14 = str21;
            str15 = str22;
            num4 = num5;
            str16 = str23;
            labelPosition2 = labelPosition3;
        }
        return finInputState2.copy(common2, str10, size2, theme2, str11, str12, str13, status2, state2, str14, str15, num4, str16, labelPosition2, str9, inputMode2, num3);
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    public boolean areContentsTheSame(@NotNull RecyclerItem recyclerItem) {
        return RecyclerItem.a.a(this, recyclerItem);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Common getCommon() {
        return this.common;
    }

    /* renamed from: component10, reason: from getter */
    public final String getFirstIcon() {
        return this.firstIcon;
    }

    /* renamed from: component11, reason: from getter */
    public final String getSecondIcon() {
        return this.secondIcon;
    }

    /* renamed from: component12, reason: from getter */
    public final Integer getMaxLength() {
        return this.maxLength;
    }

    /* renamed from: component13, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    @NotNull
    /* renamed from: component14, reason: from getter */
    public final InputView.LabelPosition getLabelPosition() {
        return this.labelPosition;
    }

    /* renamed from: component15, reason: from getter */
    public final String getInputMask() {
        return this.inputMask;
    }

    @NotNull
    /* renamed from: component16, reason: from getter */
    public final InputView.InputMode getInputMode() {
        return this.inputMode;
    }

    /* renamed from: component17, reason: from getter */
    public final Integer getVersionStamp() {
        return this.versionStamp;
    }

    /* renamed from: component2, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final InputView.Size getSize() {
        return this.size;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final InputView.Theme getTheme() {
        return this.theme;
    }

    /* renamed from: component5, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    /* renamed from: component6, reason: from getter */
    public final String getCaption() {
        return this.caption;
    }

    /* renamed from: component7, reason: from getter */
    public final String getCaptionColor() {
        return this.captionColor;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final InputView.Status getStatus() {
        return this.status;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final InputView.State getState() {
        return this.state;
    }

    @NotNull
    public final FinInputState copy(@NotNull Common common, String value, @NotNull InputView.Size size, @NotNull InputView.Theme theme, String placeholder, String caption, String captionColor, @NotNull InputView.Status status, @NotNull InputView.State state, String firstIcon, String secondIcon, Integer maxLength, String label, @NotNull InputView.LabelPosition labelPosition, String inputMask, @NotNull InputView.InputMode inputMode, Integer versionStamp) {
        Intrinsics.checkNotNullParameter(common, "common");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(theme, "theme");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(labelPosition, "labelPosition");
        Intrinsics.checkNotNullParameter(inputMode, "inputMode");
        return new FinInputState(common, value, size, theme, placeholder, caption, captionColor, status, state, firstIcon, secondIcon, maxLength, label, labelPosition, inputMask, inputMode, versionStamp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FinInputState)) {
            return false;
        }
        FinInputState finInputState = (FinInputState) other;
        return Intrinsics.d(this.common, finInputState.common) && Intrinsics.d(this.value, finInputState.value) && this.size == finInputState.size && this.theme == finInputState.theme && Intrinsics.d(this.placeholder, finInputState.placeholder) && Intrinsics.d(this.caption, finInputState.caption) && Intrinsics.d(this.captionColor, finInputState.captionColor) && this.status == finInputState.status && this.state == finInputState.state && Intrinsics.d(this.firstIcon, finInputState.firstIcon) && Intrinsics.d(this.secondIcon, finInputState.secondIcon) && Intrinsics.d(this.maxLength, finInputState.maxLength) && Intrinsics.d(this.label, finInputState.label) && this.labelPosition == finInputState.labelPosition && Intrinsics.d(this.inputMask, finInputState.inputMask) && this.inputMode == finInputState.inputMode && Intrinsics.d(this.versionStamp, finInputState.versionStamp);
    }

    public final String getCaption() {
        return this.caption;
    }

    public final String getCaptionColor() {
        return this.captionColor;
    }

    @Override // ru.ozon.fintech.ui.utils.WidgetState
    @NotNull
    public Common getCommon() {
        return this.common;
    }

    public final String getFirstIcon() {
        return this.firstIcon;
    }

    public final String getInputMask() {
        return this.inputMask;
    }

    @NotNull
    public final InputView.InputMode getInputMode() {
        return this.inputMode;
    }

    public final String getLabel() {
        return this.label;
    }

    @NotNull
    public final InputView.LabelPosition getLabelPosition() {
        return this.labelPosition;
    }

    public final Integer getMaxLength() {
        return this.maxLength;
    }

    public final String getPlaceholder() {
        return this.placeholder;
    }

    public final String getSecondIcon() {
        return this.secondIcon;
    }

    @NotNull
    public final InputView.Size getSize() {
        return this.size;
    }

    @NotNull
    public final InputView.State getState() {
        return this.state;
    }

    @NotNull
    public final InputView.Status getStatus() {
        return this.status;
    }

    @NotNull
    public final InputView.Theme getTheme() {
        return this.theme;
    }

    public final String getValue() {
        return this.value;
    }

    public final Integer getVersionStamp() {
        return this.versionStamp;
    }

    public int hashCode() {
        int hashCode = this.common.hashCode() * 31;
        String str = this.value;
        int hashCode2 = (this.theme.hashCode() + ((this.size.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31;
        String str2 = this.placeholder;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.caption;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.captionColor;
        int hashCode5 = (this.state.hashCode() + ((this.status.hashCode() + ((hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31)) * 31)) * 31;
        String str5 = this.firstIcon;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.secondIcon;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num = this.maxLength;
        int hashCode8 = (hashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        String str7 = this.label;
        int hashCode9 = (this.labelPosition.hashCode() + ((hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31)) * 31;
        String str8 = this.inputMask;
        int hashCode10 = (this.inputMode.hashCode() + ((hashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31)) * 31;
        Integer num2 = this.versionStamp;
        return hashCode10 + (num2 != null ? num2.hashCode() : 0);
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    @NotNull
    public String provideId() {
        return getCommon().getWidgetId();
    }

    @NotNull
    public String toString() {
        Common common = this.common;
        String str = this.value;
        InputView.Size size = this.size;
        InputView.Theme theme = this.theme;
        String str2 = this.placeholder;
        String str3 = this.caption;
        String str4 = this.captionColor;
        InputView.Status status = this.status;
        InputView.State state = this.state;
        String str5 = this.firstIcon;
        String str6 = this.secondIcon;
        Integer num = this.maxLength;
        String str7 = this.label;
        InputView.LabelPosition labelPosition = this.labelPosition;
        String str8 = this.inputMask;
        InputView.InputMode inputMode = this.inputMode;
        Integer num2 = this.versionStamp;
        StringBuilder sb2 = new StringBuilder("FinInputState(common=");
        sb2.append(common);
        sb2.append(", value=");
        sb2.append(str);
        sb2.append(", size=");
        sb2.append(size);
        sb2.append(", theme=");
        sb2.append(theme);
        sb2.append(", placeholder=");
        Nh.a.h(sb2, str2, ", caption=", str3, ", captionColor=");
        sb2.append(str4);
        sb2.append(", status=");
        sb2.append(status);
        sb2.append(", state=");
        sb2.append(state);
        sb2.append(", firstIcon=");
        sb2.append(str5);
        sb2.append(", secondIcon=");
        C2454a.f(num, str6, ", maxLength=", ", label=", sb2);
        sb2.append(str7);
        sb2.append(", labelPosition=");
        sb2.append(labelPosition);
        sb2.append(", inputMask=");
        sb2.append(str8);
        sb2.append(", inputMode=");
        sb2.append(inputMode);
        sb2.append(", versionStamp=");
        return Ep.a.c(sb2, num2, ")");
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    public Class<? extends Object> withView() {
        return null;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ FinInputState(ru.ozon.fintech.ui.utils.Common r21, java.lang.String r22, ru.ozon.fintech.ui.input.InputView.Size r23, ru.ozon.fintech.ui.input.InputView.Theme r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, ru.ozon.fintech.ui.input.InputView.Status r28, ru.ozon.fintech.ui.input.InputView.State r29, java.lang.String r30, java.lang.String r31, java.lang.Integer r32, java.lang.String r33, ru.ozon.fintech.ui.input.InputView.LabelPosition r34, java.lang.String r35, ru.ozon.fintech.ui.input.InputView.InputMode r36, java.lang.Integer r37, int r38, kotlin.jvm.internal.DefaultConstructorMarker r39) {
        /*
            r20 = this;
            r0 = r38
            r1 = r0 & 4
            if (r1 == 0) goto La
            ru.ozon.fintech.ui.input.InputView$Size r1 = ru.ozon.fintech.ui.input.InputView.Size.SIZE_600
            r5 = r1
            goto Lc
        La:
            r5 = r23
        Lc:
            r1 = r0 & 8
            if (r1 == 0) goto L14
            ru.ozon.fintech.ui.input.InputView$Theme r1 = ru.ozon.fintech.ui.input.InputView.Theme.SOLID
            r6 = r1
            goto L16
        L14:
            r6 = r24
        L16:
            r1 = r0 & 16
            r2 = 0
            if (r1 == 0) goto L1d
            r7 = r2
            goto L1f
        L1d:
            r7 = r25
        L1f:
            r1 = r0 & 32
            if (r1 == 0) goto L25
            r8 = r2
            goto L27
        L25:
            r8 = r26
        L27:
            r1 = r0 & 64
            if (r1 == 0) goto L2d
            r9 = r2
            goto L2f
        L2d:
            r9 = r27
        L2f:
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L37
            ru.ozon.fintech.ui.input.InputView$Status r1 = ru.ozon.fintech.ui.input.InputView.Status.NEUTRAL
            r10 = r1
            goto L39
        L37:
            r10 = r28
        L39:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L41
            ru.ozon.fintech.ui.input.InputView$State r1 = ru.ozon.fintech.ui.input.InputView.State.DEFAULT
            r11 = r1
            goto L43
        L41:
            r11 = r29
        L43:
            r1 = r0 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto L49
            r12 = r2
            goto L4b
        L49:
            r12 = r30
        L4b:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L51
            r13 = r2
            goto L53
        L51:
            r13 = r31
        L53:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L59
            r14 = r2
            goto L5b
        L59:
            r14 = r32
        L5b:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L61
            r15 = r2
            goto L63
        L61:
            r15 = r33
        L63:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L6a
            r17 = r2
            goto L6c
        L6a:
            r17 = r35
        L6c:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L77
            ru.ozon.fintech.ui.input.InputView$InputMode r1 = ru.ozon.fintech.ui.input.InputView.InputMode.TEXT
            r18 = r1
            goto L79
        L77:
            r18 = r36
        L79:
            r1 = 65536(0x10000, float:9.1835E-41)
            r0 = r0 & r1
            if (r0 == 0) goto L89
            r19 = r2
            r3 = r21
            r4 = r22
            r16 = r34
            r2 = r20
            goto L93
        L89:
            r19 = r37
            r2 = r20
            r3 = r21
            r4 = r22
            r16 = r34
        L93:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ozon.fintech.ui.input.FinInputState.<init>(ru.ozon.fintech.ui.utils.Common, java.lang.String, ru.ozon.fintech.ui.input.InputView$Size, ru.ozon.fintech.ui.input.InputView$Theme, java.lang.String, java.lang.String, java.lang.String, ru.ozon.fintech.ui.input.InputView$Status, ru.ozon.fintech.ui.input.InputView$State, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, ru.ozon.fintech.ui.input.InputView$LabelPosition, java.lang.String, ru.ozon.fintech.ui.input.InputView$InputMode, java.lang.Integer, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
