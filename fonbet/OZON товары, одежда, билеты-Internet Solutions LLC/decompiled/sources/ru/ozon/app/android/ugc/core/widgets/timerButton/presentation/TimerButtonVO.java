package ru.ozon.app.android.ugc.core.widgets.timerButton.presentation;

import B0.C2454a;
import De.C2859b;
import F3.G;
import Lh.a;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0081\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b!\u0010 R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010\u0015R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b%\u0010\u0013R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b'\u0010(R\u001f\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010)\u001a\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/timerButton/presentation/TimerButtonVO;", "Ll20/c;", "", "id", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "initialState", "finalState", "", "secondsCountdown", "", "backgroundColor", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "cornerRadius", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JLru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;ILjava/lang/String;Lru/ozon/uni/atoms/data/common/CornerRadius;LWZ/t;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getInitialState", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getFinalState", "I", "getSecondsCountdown", "Ljava/lang/String;", "getBackgroundColor", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "getCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class TimerButtonVO implements c {
    private final String backgroundColor;
    private final CornerRadius cornerRadius;

    @NotNull
    private final ButtonV3DTO finalState;
    private final long id;

    @NotNull
    private final ButtonV3DTO initialState;
    private final int secondsCountdown;
    private final t tokenizedEvent;

    public TimerButtonVO(long j11, @NotNull ButtonV3DTO initialState, @NotNull ButtonV3DTO finalState, int i11, String str, CornerRadius cornerRadius, t tVar) {
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(finalState, "finalState");
        this.id = j11;
        this.initialState = initialState;
        this.finalState = finalState;
        this.secondsCountdown = i11;
        this.backgroundColor = str;
        this.cornerRadius = cornerRadius;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimerButtonVO)) {
            return false;
        }
        TimerButtonVO timerButtonVO = (TimerButtonVO) other;
        return this.id == timerButtonVO.id && Intrinsics.d(this.initialState, timerButtonVO.initialState) && Intrinsics.d(this.finalState, timerButtonVO.finalState) && this.secondsCountdown == timerButtonVO.secondsCountdown && Intrinsics.d(this.backgroundColor, timerButtonVO.backgroundColor) && this.cornerRadius == timerButtonVO.cornerRadius && Intrinsics.d(this.tokenizedEvent, timerButtonVO.tokenizedEvent);
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

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final ButtonV3DTO getInitialState() {
        return this.initialState;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final int getSecondsCountdown() {
        return this.secondsCountdown;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = C2454a.a(this.secondsCountdown, C2859b.c(this.finalState, C2859b.c(this.initialState, Long.hashCode(this.id) * 31, 31), 31), 31);
        String str = this.backgroundColor;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        CornerRadius cornerRadius = this.cornerRadius;
        int hashCode2 = (hashCode + (cornerRadius == null ? 0 : cornerRadius.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode2 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        ButtonV3DTO buttonV3DTO = this.initialState;
        ButtonV3DTO buttonV3DTO2 = this.finalState;
        int i11 = this.secondsCountdown;
        String str = this.backgroundColor;
        CornerRadius cornerRadius = this.cornerRadius;
        t tVar = this.tokenizedEvent;
        StringBuilder c11 = G.c("TimerButtonVO(id=", j11, ", initialState=", buttonV3DTO);
        c11.append(", finalState=");
        c11.append(buttonV3DTO2);
        c11.append(", secondsCountdown=");
        c11.append(i11);
        c11.append(", backgroundColor=");
        c11.append(str);
        c11.append(", cornerRadius=");
        c11.append(cornerRadius);
        return a.b(c11, ", tokenizedEvent=", tVar, ")");
    }
}
