package ru.ozon.app.android.partpayment.smssign.data;

import B0.C2454a;
import C.o0;
import G.g;
import N3.C3660k;
import T7.P;
import Ul.C4070a;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001'BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u0017\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003JS\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u0005HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006("}, d2 = {"Lru/ozon/app/android/partpayment/smssign/data/SmsSignDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "codeLength", "", "hint", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", DynamicElementDTO.TIMER, "Lru/ozon/app/android/partpayment/smssign/data/SmsSignDTO$Timer;", "approveUrl", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;ILru/ozon/uni/atoms/utils/OzonSpannableString;Lru/ozon/app/android/partpayment/smssign/data/SmsSignDTO$Timer;Ljava/lang/String;Ljava/util/Map;)V", "getTitle", "()Ljava/lang/String;", "getCodeLength", "()I", "getHint", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getTimer", "()Lru/ozon/app/android/partpayment/smssign/data/SmsSignDTO$Timer;", "getApproveUrl", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "Timer", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SmsSignDTO {

    @NotNull
    private final String approveUrl;
    private final int codeLength;

    @NotNull
    private final OzonSpannableString hint;

    @NotNull
    private final Timer timer;

    @NotNull
    private final String title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/partpayment/smssign/data/SmsSignDTO$Timer;", "", "description", "", "duration", "", "repeatBtn", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getDuration", "()I", "getRepeatBtn", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

        public static /* synthetic */ Timer copy$default(Timer timer, String str, int i11, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = timer.description;
            }
            if ((i12 & 2) != 0) {
                i11 = timer.duration;
            }
            if ((i12 & 4) != 0) {
                str2 = timer.repeatBtn;
            }
            return timer.copy(str, i11, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* renamed from: component2, reason: from getter */
        public final int getDuration() {
            return this.duration;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getRepeatBtn() {
            return this.repeatBtn;
        }

        @NotNull
        public final Timer copy(@NotNull String description, int duration, @NotNull String repeatBtn) {
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(repeatBtn, "repeatBtn");
            return new Timer(description, duration, repeatBtn);
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

        @NotNull
        public final String getDescription() {
            return this.description;
        }

        public final int getDuration() {
            return this.duration;
        }

        @NotNull
        public final String getRepeatBtn() {
            return this.repeatBtn;
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

    public SmsSignDTO(@NotNull String title, int i11, @NotNull OzonSpannableString hint, @NotNull Timer timer, @NotNull String approveUrl, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(hint, "hint");
        Intrinsics.checkNotNullParameter(timer, "timer");
        Intrinsics.checkNotNullParameter(approveUrl, "approveUrl");
        this.title = title;
        this.codeLength = i11;
        this.hint = hint;
        this.timer = timer;
        this.approveUrl = approveUrl;
        this.trackingInfo = map;
    }

    public static /* synthetic */ SmsSignDTO copy$default(SmsSignDTO smsSignDTO, String str, int i11, OzonSpannableString ozonSpannableString, Timer timer, String str2, Map map, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = smsSignDTO.title;
        }
        if ((i12 & 2) != 0) {
            i11 = smsSignDTO.codeLength;
        }
        if ((i12 & 4) != 0) {
            ozonSpannableString = smsSignDTO.hint;
        }
        if ((i12 & 8) != 0) {
            timer = smsSignDTO.timer;
        }
        if ((i12 & 16) != 0) {
            str2 = smsSignDTO.approveUrl;
        }
        if ((i12 & 32) != 0) {
            map = smsSignDTO.trackingInfo;
        }
        String str3 = str2;
        Map map2 = map;
        return smsSignDTO.copy(str, i11, ozonSpannableString, timer, str3, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final int getCodeLength() {
        return this.codeLength;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final OzonSpannableString getHint() {
        return this.hint;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final Timer getTimer() {
        return this.timer;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getApproveUrl() {
        return this.approveUrl;
    }

    public final Map<String, TokenizedTrackingInfo> component6() {
        return this.trackingInfo;
    }

    @NotNull
    public final SmsSignDTO copy(@NotNull String title, int codeLength, @NotNull OzonSpannableString hint, @NotNull Timer timer, @NotNull String approveUrl, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(hint, "hint");
        Intrinsics.checkNotNullParameter(timer, "timer");
        Intrinsics.checkNotNullParameter(approveUrl, "approveUrl");
        return new SmsSignDTO(title, codeLength, hint, timer, approveUrl, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SmsSignDTO)) {
            return false;
        }
        SmsSignDTO smsSignDTO = (SmsSignDTO) other;
        return Intrinsics.d(this.title, smsSignDTO.title) && this.codeLength == smsSignDTO.codeLength && Intrinsics.d(this.hint, smsSignDTO.hint) && Intrinsics.d(this.timer, smsSignDTO.timer) && Intrinsics.d(this.approveUrl, smsSignDTO.approveUrl) && Intrinsics.d(this.trackingInfo, smsSignDTO.trackingInfo);
    }

    @NotNull
    public final String getApproveUrl() {
        return this.approveUrl;
    }

    public final int getCodeLength() {
        return this.codeLength;
    }

    @NotNull
    public final OzonSpannableString getHint() {
        return this.hint;
    }

    @NotNull
    public final Timer getTimer() {
        return this.timer;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int a11 = g.a((this.timer.hashCode() + P.c(this.hint, C2454a.a(this.codeLength, this.title.hashCode() * 31, 31), 31)) * 31, 31, this.approveUrl);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return a11 + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.title;
        int i11 = this.codeLength;
        OzonSpannableString ozonSpannableString = this.hint;
        Timer timer = this.timer;
        String str2 = this.approveUrl;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder c11 = C3660k.c(i11, "SmsSignDTO(title=", str, ", codeLength=", ", hint=");
        c11.append((Object) ozonSpannableString);
        c11.append(", timer=");
        c11.append(timer);
        c11.append(", approveUrl=");
        return C4070a.a(c11, str2, ", trackingInfo=", map, ")");
    }

    public /* synthetic */ SmsSignDTO(String str, int i11, OzonSpannableString ozonSpannableString, Timer timer, String str2, Map map, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i11, ozonSpannableString, timer, str2, (i12 & 32) != 0 ? null : map);
    }
}
