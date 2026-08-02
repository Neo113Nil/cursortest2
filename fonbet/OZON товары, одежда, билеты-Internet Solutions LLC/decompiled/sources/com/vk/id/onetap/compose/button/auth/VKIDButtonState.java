package com.vk.id.onetap.compose.button.auth;

import S0.C3991w0;
import S0.D1;
import S0.InterfaceC3978p0;
import S0.n1;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b:\b\u0011\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR+\u0010\u0014\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R+\u0010\u001a\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00048B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R+\u0010\u001e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00048B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u000f\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019R/\u0010\"\u001a\u0004\u0018\u00010\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u00048B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010\u000f\u001a\u0004\b \u0010\u0017\"\u0004\b!\u0010\u0019R+\u0010&\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010\u000f\u001a\u0004\b$\u0010\u0011\"\u0004\b%\u0010\u0013R+\u0010*\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b'\u0010\u000f\u001a\u0004\b(\u0010\u0011\"\u0004\b)\u0010\u0013R+\u0010.\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b+\u0010\u000f\u001a\u0004\b,\u0010\u0011\"\u0004\b-\u0010\u0013R$\u0010\u0003\u001a\u00020\u00022\u0006\u0010/\u001a\u00020\u00028@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b0\u0010\u0011\"\u0004\b1\u0010\u0013R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\u00048@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b2\u0010\u0017\"\u0004\b3\u0010\u0019R$\u0010\u0006\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\u00048@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b4\u0010\u0017\"\u0004\b5\u0010\u0019R(\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010/\u001a\u0004\u0018\u00010\u00048@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b6\u0010\u0017\"\u0004\b7\u0010\u0019R$\u0010\b\u001a\u00020\u00022\u0006\u0010/\u001a\u00020\u00028@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b8\u0010\u0011\"\u0004\b9\u0010\u0013R$\u0010\t\u001a\u00020\u00022\u0006\u0010/\u001a\u00020\u00028@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b:\u0010\u0011\"\u0004\b;\u0010\u0013R$\u0010\n\u001a\u00020\u00022\u0006\u0010/\u001a\u00020\u00028@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b<\u0010\u0011\"\u0004\b=\u0010\u0013¨\u0006>"}, d2 = {"Lcom/vk/id/onetap/compose/button/auth/VKIDButtonState;", "", "", "inProgress", "", "text", "shortText", "userIconUrl", "textVisible", "rightIconVisible", "userLoadFailed", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)V", "<set-?>", "_inProgress$delegate", "LS0/p0;", "get_inProgress", "()Z", "set_inProgress", "(Z)V", "_inProgress", "_text$delegate", "get_text", "()Ljava/lang/String;", "set_text", "(Ljava/lang/String;)V", "_text", "_shortText$delegate", "get_shortText", "set_shortText", "_shortText", "_userIconUrl$delegate", "get_userIconUrl", "set_userIconUrl", "_userIconUrl", "_textVisible$delegate", "get_textVisible", "set_textVisible", "_textVisible", "_rightIconVisible$delegate", "get_rightIconVisible", "set_rightIconVisible", "_rightIconVisible", "_userLoadFailed$delegate", "get_userLoadFailed", "set_userLoadFailed", "_userLoadFailed", AppMeasurementSdk.ConditionalUserProperty.VALUE, "getInProgress$onetap_compose_release", "setInProgress$onetap_compose_release", "getText$onetap_compose_release", "setText$onetap_compose_release", "getShortText$onetap_compose_release", "setShortText$onetap_compose_release", "getUserIconUrl$onetap_compose_release", "setUserIconUrl$onetap_compose_release", "getTextVisible$onetap_compose_release", "setTextVisible$onetap_compose_release", "getRightIconVisible$onetap_compose_release", "setRightIconVisible$onetap_compose_release", "getUserLoadFailed$onetap_compose_release", "setUserLoadFailed$onetap_compose_release", "onetap-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public class VKIDButtonState {

    /* renamed from: _inProgress$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC3978p0 _inProgress;

    /* renamed from: _rightIconVisible$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC3978p0 _rightIconVisible;

    /* renamed from: _shortText$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC3978p0 _shortText;

    /* renamed from: _text$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC3978p0 _text;

    /* renamed from: _textVisible$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC3978p0 _textVisible;

    /* renamed from: _userIconUrl$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC3978p0 _userIconUrl;

    /* renamed from: _userLoadFailed$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC3978p0 _userLoadFailed;

    public VKIDButtonState(boolean z11, @NotNull String text, @NotNull String shortText, String str, boolean z12, boolean z13, boolean z14) {
        C3991w0 f7;
        C3991w0 f11;
        C3991w0 f12;
        C3991w0 f13;
        C3991w0 f14;
        C3991w0 f15;
        C3991w0 f16;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(shortText, "shortText");
        f7 = n1.f(Boolean.valueOf(z11), D1.f25195a);
        this._inProgress = f7;
        f11 = n1.f(text, D1.f25195a);
        this._text = f11;
        f12 = n1.f(shortText, D1.f25195a);
        this._shortText = f12;
        f13 = n1.f(str, D1.f25195a);
        this._userIconUrl = f13;
        f14 = n1.f(Boolean.valueOf(z12), D1.f25195a);
        this._textVisible = f14;
        f15 = n1.f(Boolean.valueOf(z13), D1.f25195a);
        this._rightIconVisible = f15;
        f16 = n1.f(Boolean.valueOf(z14), D1.f25195a);
        this._userLoadFailed = f16;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean get_inProgress() {
        return ((Boolean) this._inProgress.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean get_rightIconVisible() {
        return ((Boolean) this._rightIconVisible.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final String get_shortText() {
        return (String) this._shortText.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final String get_text() {
        return (String) this._text.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean get_textVisible() {
        return ((Boolean) this._textVisible.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final String get_userIconUrl() {
        return (String) this._userIconUrl.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean get_userLoadFailed() {
        return ((Boolean) this._userLoadFailed.getValue()).booleanValue();
    }

    private final void set_inProgress(boolean z11) {
        this._inProgress.setValue(Boolean.valueOf(z11));
    }

    private final void set_rightIconVisible(boolean z11) {
        this._rightIconVisible.setValue(Boolean.valueOf(z11));
    }

    private final void set_shortText(String str) {
        this._shortText.setValue(str);
    }

    private final void set_text(String str) {
        this._text.setValue(str);
    }

    private final void set_textVisible(boolean z11) {
        this._textVisible.setValue(Boolean.valueOf(z11));
    }

    private final void set_userIconUrl(String str) {
        this._userIconUrl.setValue(str);
    }

    private final void set_userLoadFailed(boolean z11) {
        this._userLoadFailed.setValue(Boolean.valueOf(z11));
    }

    public final boolean getInProgress$onetap_compose_release() {
        return get_inProgress();
    }

    public final boolean getRightIconVisible$onetap_compose_release() {
        return get_rightIconVisible();
    }

    @NotNull
    public final String getShortText$onetap_compose_release() {
        return get_shortText();
    }

    @NotNull
    public final String getText$onetap_compose_release() {
        return get_text();
    }

    public final boolean getTextVisible$onetap_compose_release() {
        return get_textVisible();
    }

    public final String getUserIconUrl$onetap_compose_release() {
        return get_userIconUrl();
    }

    public final boolean getUserLoadFailed$onetap_compose_release() {
        return get_userLoadFailed();
    }

    public final void setInProgress$onetap_compose_release(boolean z11) {
        if (z11 != get_inProgress()) {
            set_inProgress(z11);
        }
    }

    public final void setRightIconVisible$onetap_compose_release(boolean z11) {
        if (z11 != get_rightIconVisible()) {
            set_rightIconVisible(z11);
        }
    }

    public final void setShortText$onetap_compose_release(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (Intrinsics.d(value, get_shortText())) {
            return;
        }
        set_shortText(value);
    }

    public final void setText$onetap_compose_release(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (Intrinsics.d(value, get_text())) {
            return;
        }
        set_text(value);
    }

    public final void setTextVisible$onetap_compose_release(boolean z11) {
        if (z11 != get_textVisible()) {
            set_textVisible(z11);
        }
    }

    public final void setUserIconUrl$onetap_compose_release(String str) {
        if (Intrinsics.d(str, get_userIconUrl())) {
            return;
        }
        set_userIconUrl(str);
    }

    public final void setUserLoadFailed$onetap_compose_release(boolean z11) {
        if (z11 != get_userLoadFailed()) {
            set_userLoadFailed(z11);
        }
    }

    public /* synthetic */ VKIDButtonState(boolean z11, String str, String str2, String str3, boolean z12, boolean z13, boolean z14, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(z11, (i11 & 2) != 0 ? "" : str, (i11 & 4) != 0 ? "" : str2, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? true : z12, (i11 & 32) != 0 ? false : z13, (i11 & 64) != 0 ? false : z14);
    }
}
