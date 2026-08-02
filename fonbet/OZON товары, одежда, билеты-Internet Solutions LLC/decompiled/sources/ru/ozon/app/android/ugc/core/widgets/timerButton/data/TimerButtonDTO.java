package ru.ozon.app.android.ugc.core.widgets.timerButton.data;

import B0.C2454a;
import De.C2859b;
import Pk0.i;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0017\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003JW\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u0006HÖ\u0001J\t\u0010&\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006'"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/timerButton/data/TimerButtonDTO;", "", "initialState", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "finalState", "secondsCountdown", "", "backgroundColor", "", "cornerRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "tracking", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;ILjava/lang/String;Lru/ozon/uni/atoms/data/common/CornerRadius;Ljava/util/Map;)V", "getInitialState", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getFinalState", "getSecondsCountdown", "()I", "getBackgroundColor", "()Ljava/lang/String;", "getCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "getTracking", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class TimerButtonDTO {
    public static final int $stable = 8;
    private final String backgroundColor;
    private final CornerRadius cornerRadius;

    @NotNull
    private final ButtonV3DTO finalState;

    @NotNull
    private final ButtonV3DTO initialState;
    private final int secondsCountdown;
    private final Map<String, TokenizedTrackingInfo> tracking;

    public TimerButtonDTO(@NotNull ButtonV3DTO initialState, @NotNull ButtonV3DTO finalState, int i11, String str, CornerRadius cornerRadius, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(finalState, "finalState");
        this.initialState = initialState;
        this.finalState = finalState;
        this.secondsCountdown = i11;
        this.backgroundColor = str;
        this.cornerRadius = cornerRadius;
        this.tracking = map;
    }

    public static /* synthetic */ TimerButtonDTO copy$default(TimerButtonDTO timerButtonDTO, ButtonV3DTO buttonV3DTO, ButtonV3DTO buttonV3DTO2, int i11, String str, CornerRadius cornerRadius, Map map, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            buttonV3DTO = timerButtonDTO.initialState;
        }
        if ((i12 & 2) != 0) {
            buttonV3DTO2 = timerButtonDTO.finalState;
        }
        if ((i12 & 4) != 0) {
            i11 = timerButtonDTO.secondsCountdown;
        }
        if ((i12 & 8) != 0) {
            str = timerButtonDTO.backgroundColor;
        }
        if ((i12 & 16) != 0) {
            cornerRadius = timerButtonDTO.cornerRadius;
        }
        if ((i12 & 32) != 0) {
            map = timerButtonDTO.tracking;
        }
        CornerRadius cornerRadius2 = cornerRadius;
        Map map2 = map;
        return timerButtonDTO.copy(buttonV3DTO, buttonV3DTO2, i11, str, cornerRadius2, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ButtonV3DTO getInitialState() {
        return this.initialState;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final ButtonV3DTO getFinalState() {
        return this.finalState;
    }

    /* renamed from: component3, reason: from getter */
    public final int getSecondsCountdown() {
        return this.secondsCountdown;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component5, reason: from getter */
    public final CornerRadius getCornerRadius() {
        return this.cornerRadius;
    }

    public final Map<String, TokenizedTrackingInfo> component6() {
        return this.tracking;
    }

    @NotNull
    public final TimerButtonDTO copy(@NotNull ButtonV3DTO initialState, @NotNull ButtonV3DTO finalState, int secondsCountdown, String backgroundColor, CornerRadius cornerRadius, Map<String, TokenizedTrackingInfo> tracking) {
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(finalState, "finalState");
        return new TimerButtonDTO(initialState, finalState, secondsCountdown, backgroundColor, cornerRadius, tracking);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimerButtonDTO)) {
            return false;
        }
        TimerButtonDTO timerButtonDTO = (TimerButtonDTO) other;
        return Intrinsics.d(this.initialState, timerButtonDTO.initialState) && Intrinsics.d(this.finalState, timerButtonDTO.finalState) && this.secondsCountdown == timerButtonDTO.secondsCountdown && Intrinsics.d(this.backgroundColor, timerButtonDTO.backgroundColor) && this.cornerRadius == timerButtonDTO.cornerRadius && Intrinsics.d(this.tracking, timerButtonDTO.tracking);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final CornerRadius getCornerRadius() {
        return this.cornerRadius;
    }

    @NotNull
    public final ButtonV3DTO getFinalState() {
        return this.finalState;
    }

    @NotNull
    public final ButtonV3DTO getInitialState() {
        return this.initialState;
    }

    public final int getSecondsCountdown() {
        return this.secondsCountdown;
    }

    public final Map<String, TokenizedTrackingInfo> getTracking() {
        return this.tracking;
    }

    public int hashCode() {
        int a11 = C2454a.a(this.secondsCountdown, C2859b.c(this.finalState, this.initialState.hashCode() * 31, 31), 31);
        String str = this.backgroundColor;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        CornerRadius cornerRadius = this.cornerRadius;
        int hashCode2 = (hashCode + (cornerRadius == null ? 0 : cornerRadius.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.tracking;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        ButtonV3DTO buttonV3DTO = this.initialState;
        ButtonV3DTO buttonV3DTO2 = this.finalState;
        int i11 = this.secondsCountdown;
        String str = this.backgroundColor;
        CornerRadius cornerRadius = this.cornerRadius;
        Map<String, TokenizedTrackingInfo> map = this.tracking;
        StringBuilder sb2 = new StringBuilder("TimerButtonDTO(initialState=");
        sb2.append(buttonV3DTO);
        sb2.append(", finalState=");
        sb2.append(buttonV3DTO2);
        sb2.append(", secondsCountdown=");
        i.c(i11, ", backgroundColor=", str, ", cornerRadius=", sb2);
        sb2.append(cornerRadius);
        sb2.append(", tracking=");
        sb2.append(map);
        sb2.append(")");
        return sb2.toString();
    }
}
