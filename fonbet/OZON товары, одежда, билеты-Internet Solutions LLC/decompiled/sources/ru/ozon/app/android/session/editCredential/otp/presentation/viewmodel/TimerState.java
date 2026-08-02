package ru.ozon.app.android.session.editCredential.otp.presentation.viewmodel;

import B90.C2618u;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\r¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/session/editCredential/otp/presentation/viewmodel/TimerState;", "", "", "action", "", "duration", "<init>", "(Ljava/lang/String;I)V", "copy", "(Ljava/lang/String;I)Lru/ozon/app/android/session/editCredential/otp/presentation/viewmodel/TimerState;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAction", "I", "getDuration", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class TimerState {
    private final String action;
    private final int duration;

    /* JADX WARN: Multi-variable type inference failed */
    public TimerState() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    @NotNull
    public final TimerState copy(String action, int duration) {
        return new TimerState(action, duration);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimerState)) {
            return false;
        }
        TimerState timerState = (TimerState) other;
        return Intrinsics.d(this.action, timerState.action) && this.duration == timerState.duration;
    }

    public final String getAction() {
        return this.action;
    }

    public final int getDuration() {
        return this.duration;
    }

    public int hashCode() {
        String str = this.action;
        return Integer.hashCode(this.duration) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @NotNull
    public String toString() {
        return C2618u.f(this.duration, "TimerState(action=", this.action, ", duration=", ")");
    }

    public TimerState(String str, int i11) {
        this.action = str;
        this.duration = i11;
    }

    public /* synthetic */ TimerState(String str, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? -1 : i11);
    }
}
