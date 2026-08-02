package ru.ozon.app.android.session.editCredential.otp.presentation;

import N3.C3660k;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0014\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/session/editCredential/otp/presentation/TimerAction;", "", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "", "timeLeft", "", "allowResend", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Z)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getSubtitle", "Ljava/lang/Integer;", "getTimeLeft", "()Ljava/lang/Integer;", "Z", "getAllowResend", "()Z", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class TimerAction {
    private final boolean allowResend;
    private final String subtitle;
    private final Integer timeLeft;

    @NotNull
    private final String title;

    public TimerAction(@NotNull String title, String str, Integer num, boolean z11) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
        this.subtitle = str;
        this.timeLeft = num;
        this.allowResend = z11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimerAction)) {
            return false;
        }
        TimerAction timerAction = (TimerAction) other;
        return Intrinsics.d(this.title, timerAction.title) && Intrinsics.d(this.subtitle, timerAction.subtitle) && Intrinsics.d(this.timeLeft, timerAction.timeLeft) && this.allowResend == timerAction.allowResend;
    }

    public final boolean getAllowResend() {
        return this.allowResend;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final Integer getTimeLeft() {
        return this.timeLeft;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.timeLeft;
        return Boolean.hashCode(this.allowResend) + ((hashCode2 + (num != null ? num.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        Integer num = this.timeLeft;
        boolean z11 = this.allowResend;
        StringBuilder d11 = C3660k.d("TimerAction(title=", str, ", subtitle=", str2, ", timeLeft=");
        d11.append(num);
        d11.append(", allowResend=");
        d11.append(z11);
        d11.append(")");
        return d11.toString();
    }

    public /* synthetic */ TimerAction(String str, String str2, Integer num, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : num, (i11 & 8) != 0 ? false : z11);
    }
}
