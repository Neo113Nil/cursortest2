package ru.ozon.fintech.ui.textareaV22;

import De.C2860c;
import GZ.e;
import Kk.C3532b;
import androidx.annotation.Keep;
import com.detmir.recycli.adapters.RecyclerItem;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.fintech.ui.input.InputView;
import ru.ozon.fintech.ui.utils.Common;
import ru.ozon.fintech.ui.utils.WidgetState;

@Keep
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b2\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B¯\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0018\u0010\u0019J\b\u00101\u001a\u00020\u0006H\u0016J\t\u00102\u001a\u00020\u0004HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u00107\u001a\u00020\u000bHÆ\u0003J\t\u00108\u001a\u00020\rHÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010:\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010'J\u0010\u0010;\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010*J\u0010\u0010<\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010*J\u0010\u0010=\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010'J\u0010\u0010>\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010'J\t\u0010?\u001a\u00020\u0010HÆ\u0003J\u0010\u0010@\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010*Jº\u0001\u0010A\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0016\u001a\u00020\u00102\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0002\u0010BJ\u0013\u0010C\u001a\u00020\u00102\b\u0010D\u001a\u0004\u0018\u00010EHÖ\u0003J\t\u0010F\u001a\u00020\u0012HÖ\u0001J\t\u0010G\u001a\u00020\u0006HÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001dR\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010(\u001a\u0004\b&\u0010'R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u0010+\u001a\u0004\b)\u0010*R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u0010+\u001a\u0004\b,\u0010*R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010(\u001a\u0004\b\u0014\u0010'R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010(\u001a\u0004\b-\u0010'R\u0011\u0010\u0016\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u0010+\u001a\u0004\b0\u0010*¨\u0006H"}, d2 = {"Lru/ozon/fintech/ui/textareaV22/TextAreaV22State;", "Lcom/detmir/recycli/adapters/RecyclerItem;", "Lru/ozon/fintech/ui/utils/WidgetState;", "common", "Lru/ozon/fintech/ui/utils/Common;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", HammersV3BodyDTO.PLACEHOLDER, "caption", "captionColor", "status", "Lru/ozon/fintech/ui/input/InputView$Status;", "state", "Lru/ozon/fintech/ui/input/InputView$State;", "label", "bottomBar", "", "rows", "", "counter", "isResize", "disableClearButton", "hasInfoIcon", "versionStamp", "<init>", "(Lru/ozon/fintech/ui/utils/Common;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/fintech/ui/input/InputView$Status;Lru/ozon/fintech/ui/input/InputView$State;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;ZLjava/lang/Integer;)V", "getCommon", "()Lru/ozon/fintech/ui/utils/Common;", "getValue", "()Ljava/lang/String;", "getPlaceholder", "getCaption", "getCaptionColor", "getStatus", "()Lru/ozon/fintech/ui/input/InputView$Status;", "getState", "()Lru/ozon/fintech/ui/input/InputView$State;", "getLabel", "getBottomBar", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getRows", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCounter", "getDisableClearButton", "getHasInfoIcon", "()Z", "getVersionStamp", "provideId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "(Lru/ozon/fintech/ui/utils/Common;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/fintech/ui/input/InputView$Status;Lru/ozon/fintech/ui/input/InputView$State;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;ZLjava/lang/Integer;)Lru/ozon/fintech/ui/textareaV22/TextAreaV22State;", "equals", "other", "", "hashCode", "toString", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TextAreaV22State implements RecyclerItem, WidgetState {
    private final Boolean bottomBar;
    private final String caption;
    private final String captionColor;

    @NotNull
    private final Common common;
    private final Integer counter;
    private final Boolean disableClearButton;
    private final boolean hasInfoIcon;
    private final Boolean isResize;
    private final String label;
    private final String placeholder;
    private final Integer rows;

    @NotNull
    private final InputView.State state;

    @NotNull
    private final InputView.Status status;
    private final String value;
    private final Integer versionStamp;

    public TextAreaV22State(@NotNull Common common, String str, String str2, String str3, String str4, @NotNull InputView.Status status, @NotNull InputView.State state, String str5, Boolean bool, Integer num, Integer num2, Boolean bool2, Boolean bool3, boolean z11, Integer num3) {
        Intrinsics.checkNotNullParameter(common, "common");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(state, "state");
        this.common = common;
        this.value = str;
        this.placeholder = str2;
        this.caption = str3;
        this.captionColor = str4;
        this.status = status;
        this.state = state;
        this.label = str5;
        this.bottomBar = bool;
        this.rows = num;
        this.counter = num2;
        this.isResize = bool2;
        this.disableClearButton = bool3;
        this.hasInfoIcon = z11;
        this.versionStamp = num3;
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
    public final Integer getRows() {
        return this.rows;
    }

    /* renamed from: component11, reason: from getter */
    public final Integer getCounter() {
        return this.counter;
    }

    /* renamed from: component12, reason: from getter */
    public final Boolean getIsResize() {
        return this.isResize;
    }

    /* renamed from: component13, reason: from getter */
    public final Boolean getDisableClearButton() {
        return this.disableClearButton;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getHasInfoIcon() {
        return this.hasInfoIcon;
    }

    /* renamed from: component15, reason: from getter */
    public final Integer getVersionStamp() {
        return this.versionStamp;
    }

    /* renamed from: component2, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    /* renamed from: component4, reason: from getter */
    public final String getCaption() {
        return this.caption;
    }

    /* renamed from: component5, reason: from getter */
    public final String getCaptionColor() {
        return this.captionColor;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final InputView.Status getStatus() {
        return this.status;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final InputView.State getState() {
        return this.state;
    }

    /* renamed from: component8, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* renamed from: component9, reason: from getter */
    public final Boolean getBottomBar() {
        return this.bottomBar;
    }

    @NotNull
    public final TextAreaV22State copy(@NotNull Common common, String value, String placeholder, String caption, String captionColor, @NotNull InputView.Status status, @NotNull InputView.State state, String label, Boolean bottomBar, Integer rows, Integer counter, Boolean isResize, Boolean disableClearButton, boolean hasInfoIcon, Integer versionStamp) {
        Intrinsics.checkNotNullParameter(common, "common");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(state, "state");
        return new TextAreaV22State(common, value, placeholder, caption, captionColor, status, state, label, bottomBar, rows, counter, isResize, disableClearButton, hasInfoIcon, versionStamp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextAreaV22State)) {
            return false;
        }
        TextAreaV22State textAreaV22State = (TextAreaV22State) other;
        return Intrinsics.d(this.common, textAreaV22State.common) && Intrinsics.d(this.value, textAreaV22State.value) && Intrinsics.d(this.placeholder, textAreaV22State.placeholder) && Intrinsics.d(this.caption, textAreaV22State.caption) && Intrinsics.d(this.captionColor, textAreaV22State.captionColor) && this.status == textAreaV22State.status && this.state == textAreaV22State.state && Intrinsics.d(this.label, textAreaV22State.label) && Intrinsics.d(this.bottomBar, textAreaV22State.bottomBar) && Intrinsics.d(this.rows, textAreaV22State.rows) && Intrinsics.d(this.counter, textAreaV22State.counter) && Intrinsics.d(this.isResize, textAreaV22State.isResize) && Intrinsics.d(this.disableClearButton, textAreaV22State.disableClearButton) && this.hasInfoIcon == textAreaV22State.hasInfoIcon && Intrinsics.d(this.versionStamp, textAreaV22State.versionStamp);
    }

    public final Boolean getBottomBar() {
        return this.bottomBar;
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

    public final Integer getCounter() {
        return this.counter;
    }

    public final Boolean getDisableClearButton() {
        return this.disableClearButton;
    }

    public final boolean getHasInfoIcon() {
        return this.hasInfoIcon;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getPlaceholder() {
        return this.placeholder;
    }

    public final Integer getRows() {
        return this.rows;
    }

    @NotNull
    public final InputView.State getState() {
        return this.state;
    }

    @NotNull
    public final InputView.Status getStatus() {
        return this.status;
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
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.placeholder;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.caption;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.captionColor;
        int hashCode5 = (this.state.hashCode() + ((this.status.hashCode() + ((hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31)) * 31)) * 31;
        String str5 = this.label;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.bottomBar;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.rows;
        int hashCode8 = (hashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.counter;
        int hashCode9 = (hashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool2 = this.isResize;
        int hashCode10 = (hashCode9 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.disableClearButton;
        int a11 = C3532b.a((hashCode10 + (bool3 == null ? 0 : bool3.hashCode())) * 31, 31, this.hasInfoIcon);
        Integer num3 = this.versionStamp;
        return a11 + (num3 != null ? num3.hashCode() : 0);
    }

    public final Boolean isResize() {
        return this.isResize;
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
        String str2 = this.placeholder;
        String str3 = this.caption;
        String str4 = this.captionColor;
        InputView.Status status = this.status;
        InputView.State state = this.state;
        String str5 = this.label;
        Boolean bool = this.bottomBar;
        Integer num = this.rows;
        Integer num2 = this.counter;
        Boolean bool2 = this.isResize;
        Boolean bool3 = this.disableClearButton;
        boolean z11 = this.hasInfoIcon;
        Integer num3 = this.versionStamp;
        StringBuilder sb2 = new StringBuilder("TextAreaV22State(common=");
        sb2.append(common);
        sb2.append(", value=");
        sb2.append(str);
        sb2.append(", placeholder=");
        Nh.a.h(sb2, str2, ", caption=", str3, ", captionColor=");
        sb2.append(str4);
        sb2.append(", status=");
        sb2.append(status);
        sb2.append(", state=");
        sb2.append(state);
        sb2.append(", label=");
        sb2.append(str5);
        sb2.append(", bottomBar=");
        e.d(bool, num, ", rows=", ", counter=", sb2);
        C2860c.f(bool2, num2, ", isResize=", ", disableClearButton=", sb2);
        sb2.append(bool3);
        sb2.append(", hasInfoIcon=");
        sb2.append(z11);
        sb2.append(", versionStamp=");
        return Ep.a.c(sb2, num3, ")");
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    public Class<? extends Object> withView() {
        return null;
    }

    public /* synthetic */ TextAreaV22State(Common common, String str, String str2, String str3, String str4, InputView.Status status, InputView.State state, String str5, Boolean bool, Integer num, Integer num2, Boolean bool2, Boolean bool3, boolean z11, Integer num3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(common, str, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : str4, (i11 & 32) != 0 ? InputView.Status.NEUTRAL : status, (i11 & 64) != 0 ? InputView.State.DEFAULT : state, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : str5, (i11 & 256) != 0 ? Boolean.FALSE : bool, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : num, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : num2, (i11 & 2048) != 0 ? Boolean.FALSE : bool2, (i11 & 4096) != 0 ? Boolean.FALSE : bool3, (i11 & 8192) != 0 ? false : z11, (i11 & 16384) != 0 ? null : num3);
    }
}
