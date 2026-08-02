package ru.ozon.app.android.partpayment.smssign.view;

import B0.C2454a;
import C.o0;
import Ds.C2880a;
import G.g;
import Kk.C3532b;
import N3.C3660k;
import T7.P;
import WZ.t;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0014\n\u0002\u0010\t\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u00014BU\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010¢\u0006\u0004\b\u0012\u0010\u0013Jh\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\u0010\b\u0002\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b\u001f\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u000b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001e\u001a\u0004\b(\u0010\u0017R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010)\u001a\u0004\b\r\u0010*R\u0017\u0010\u000e\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001e\u001a\u0004\b+\u0010\u0017R\u001f\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010,\u001a\u0004\b-\u0010.R\u001a\u00100\u001a\u00020/8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103¨\u00065"}, d2 = {"Lru/ozon/app/android/partpayment/smssign/view/SmsSignVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "codeLength", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "hint", "Lru/ozon/app/android/partpayment/smssign/view/SmsSignVO$Timer;", DynamicElementDTO.TIMER, "approveUrl", "", "isTimerStarted", "pin", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "event", "<init>", "(Ljava/lang/String;ILru/ozon/uni/atoms/utils/OzonSpannableString;Lru/ozon/app/android/partpayment/smssign/view/SmsSignVO$Timer;Ljava/lang/String;ZLjava/lang/String;LWZ/t;)V", "copy", "(Ljava/lang/String;ILru/ozon/uni/atoms/utils/OzonSpannableString;Lru/ozon/app/android/partpayment/smssign/view/SmsSignVO$Timer;Ljava/lang/String;ZLjava/lang/String;LWZ/t;)Lru/ozon/app/android/partpayment/smssign/view/SmsSignVO;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "I", "getCodeLength", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getHint", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "Lru/ozon/app/android/partpayment/smssign/view/SmsSignVO$Timer;", "getTimer", "()Lru/ozon/app/android/partpayment/smssign/view/SmsSignVO$Timer;", "getApproveUrl", "Z", "()Z", "getPin", "LWZ/t;", "getEvent", "()LWZ/t;", "", "id", "J", "getId", "()J", "Timer", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SmsSignVO implements c {

    @NotNull
    private final String approveUrl;
    private final int codeLength;
    private final t event;

    @NotNull
    private final OzonSpannableString hint;
    private final long id;
    private final boolean isTimerStarted;

    @NotNull
    private final String pin;

    @NotNull
    private final Timer timer;

    @NotNull
    private final String title;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0015\u0010\n¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/partpayment/smssign/view/SmsSignVO$Timer;", "", "", "description", "", "duration", "repeatBtn", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDescription", "I", "getDuration", "getRepeatBtn", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Timer {

        @NotNull
        private final String description;
        private final int duration;

        @NotNull
        private final String repeatBtn;

        public Timer(@NotNull String description, int i11, @NotNull String repeatBtn) {
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(repeatBtn, "repeatBtn");
            this.description = description;
            this.duration = i11;
            this.repeatBtn = repeatBtn;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Timer)) {
                return false;
            }
            Timer timer = (Timer) other;
            return Intrinsics.d(this.description, timer.description) && this.duration == timer.duration && Intrinsics.d(this.repeatBtn, timer.repeatBtn);
        }

        public final int getDuration() {
            return this.duration;
        }

        public int hashCode() {
            return this.repeatBtn.hashCode() + C2454a.a(this.duration, this.description.hashCode() * 31, 31);
        }

        @NotNull
        public String toString() {
            String str = this.description;
            int i11 = this.duration;
            return o0.c(C3660k.c(i11, "Timer(description=", str, ", duration=", ", repeatBtn="), this.repeatBtn, ")");
        }
    }

    public SmsSignVO(@NotNull String title, int i11, @NotNull OzonSpannableString hint, @NotNull Timer timer, @NotNull String approveUrl, boolean z11, @NotNull String pin, t tVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(hint, "hint");
        Intrinsics.checkNotNullParameter(timer, "timer");
        Intrinsics.checkNotNullParameter(approveUrl, "approveUrl");
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.title = title;
        this.codeLength = i11;
        this.hint = hint;
        this.timer = timer;
        this.approveUrl = approveUrl;
        this.isTimerStarted = z11;
        this.pin = pin;
        this.event = tVar;
        this.id = -1541992534;
    }

    public static /* synthetic */ SmsSignVO copy$default(SmsSignVO smsSignVO, String str, int i11, OzonSpannableString ozonSpannableString, Timer timer, String str2, boolean z11, String str3, t tVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = smsSignVO.title;
        }
        if ((i12 & 2) != 0) {
            i11 = smsSignVO.codeLength;
        }
        if ((i12 & 4) != 0) {
            ozonSpannableString = smsSignVO.hint;
        }
        if ((i12 & 8) != 0) {
            timer = smsSignVO.timer;
        }
        if ((i12 & 16) != 0) {
            str2 = smsSignVO.approveUrl;
        }
        if ((i12 & 32) != 0) {
            z11 = smsSignVO.isTimerStarted;
        }
        if ((i12 & 64) != 0) {
            str3 = smsSignVO.pin;
        }
        if ((i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            tVar = smsSignVO.event;
        }
        String str4 = str3;
        t tVar2 = tVar;
        String str5 = str2;
        boolean z12 = z11;
        return smsSignVO.copy(str, i11, ozonSpannableString, timer, str5, z12, str4, tVar2);
    }

    @NotNull
    public final SmsSignVO copy(@NotNull String title, int codeLength, @NotNull OzonSpannableString hint, @NotNull Timer timer, @NotNull String approveUrl, boolean isTimerStarted, @NotNull String pin, t event) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(hint, "hint");
        Intrinsics.checkNotNullParameter(timer, "timer");
        Intrinsics.checkNotNullParameter(approveUrl, "approveUrl");
        Intrinsics.checkNotNullParameter(pin, "pin");
        return new SmsSignVO(title, codeLength, hint, timer, approveUrl, isTimerStarted, pin, event);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SmsSignVO)) {
            return false;
        }
        SmsSignVO smsSignVO = (SmsSignVO) other;
        return Intrinsics.d(this.title, smsSignVO.title) && this.codeLength == smsSignVO.codeLength && Intrinsics.d(this.hint, smsSignVO.hint) && Intrinsics.d(this.timer, smsSignVO.timer) && Intrinsics.d(this.approveUrl, smsSignVO.approveUrl) && this.isTimerStarted == smsSignVO.isTimerStarted && Intrinsics.d(this.pin, smsSignVO.pin) && Intrinsics.d(this.event, smsSignVO.event);
    }

    @NotNull
    public final String getApproveUrl() {
        return this.approveUrl;
    }

    public final int getCodeLength() {
        return this.codeLength;
    }

    public final t getEvent() {
        return this.event;
    }

    @NotNull
    public final OzonSpannableString getHint() {
        return this.hint;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final String getPin() {
        return this.pin;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final Timer getTimer() {
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
        int a11 = g.a(C3532b.a(g.a((this.timer.hashCode() + P.c(this.hint, C2454a.a(this.codeLength, this.title.hashCode() * 31, 31), 31)) * 31, 31, this.approveUrl), 31, this.isTimerStarted), 31, this.pin);
        t tVar = this.event;
        return a11 + (tVar == null ? 0 : tVar.hashCode());
    }

    /* renamed from: isTimerStarted, reason: from getter */
    public final boolean getIsTimerStarted() {
        return this.isTimerStarted;
    }

    @NotNull
    public String toString() {
        String str = this.title;
        int i11 = this.codeLength;
        OzonSpannableString ozonSpannableString = this.hint;
        Timer timer = this.timer;
        String str2 = this.approveUrl;
        boolean z11 = this.isTimerStarted;
        String str3 = this.pin;
        t tVar = this.event;
        StringBuilder c11 = C3660k.c(i11, "SmsSignVO(title=", str, ", codeLength=", ", hint=");
        c11.append((Object) ozonSpannableString);
        c11.append(", timer=");
        c11.append(timer);
        c11.append(", approveUrl=");
        C2880a.c(str2, ", isTimerStarted=", ", pin=", c11, z11);
        c11.append(str3);
        c11.append(", event=");
        c11.append(tVar);
        c11.append(")");
        return c11.toString();
    }

    public /* synthetic */ SmsSignVO(String str, int i11, OzonSpannableString ozonSpannableString, Timer timer, String str2, boolean z11, String str3, t tVar, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i11, ozonSpannableString, timer, str2, (i12 & 32) != 0 ? false : z11, (i12 & 64) != 0 ? "" : str3, (i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : tVar);
    }
}
