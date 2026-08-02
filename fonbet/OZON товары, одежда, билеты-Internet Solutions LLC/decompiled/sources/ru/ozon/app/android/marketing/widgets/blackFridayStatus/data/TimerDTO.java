package ru.ozon.app.android.marketing.widgets.blackFridayStatus.data;

import G.g;
import I0.C3173b;
import N3.C3660k;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J5\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/marketing/widgets/blackFridayStatus/data/TimerDTO;", "", "serverTimestamp", "", "deadlineTimestamp", "textColor", "backgroundColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getServerTimestamp", "()Ljava/lang/String;", "getDeadlineTimestamp", "getTextColor", "getBackgroundColor", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class TimerDTO {
    public static final int $stable = 0;
    private final String backgroundColor;

    @NotNull
    private final String deadlineTimestamp;

    @NotNull
    private final String serverTimestamp;
    private final String textColor;

    public TimerDTO(@NotNull String serverTimestamp, @NotNull String deadlineTimestamp, String str, String str2) {
        Intrinsics.checkNotNullParameter(serverTimestamp, "serverTimestamp");
        Intrinsics.checkNotNullParameter(deadlineTimestamp, "deadlineTimestamp");
        this.serverTimestamp = serverTimestamp;
        this.deadlineTimestamp = deadlineTimestamp;
        this.textColor = str;
        this.backgroundColor = str2;
    }

    public static /* synthetic */ TimerDTO copy$default(TimerDTO timerDTO, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = timerDTO.serverTimestamp;
        }
        if ((i11 & 2) != 0) {
            str2 = timerDTO.deadlineTimestamp;
        }
        if ((i11 & 4) != 0) {
            str3 = timerDTO.textColor;
        }
        if ((i11 & 8) != 0) {
            str4 = timerDTO.backgroundColor;
        }
        return timerDTO.copy(str, str2, str3, str4);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getServerTimestamp() {
        return this.serverTimestamp;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getDeadlineTimestamp() {
        return this.deadlineTimestamp;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTextColor() {
        return this.textColor;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final TimerDTO copy(@NotNull String serverTimestamp, @NotNull String deadlineTimestamp, String textColor, String backgroundColor) {
        Intrinsics.checkNotNullParameter(serverTimestamp, "serverTimestamp");
        Intrinsics.checkNotNullParameter(deadlineTimestamp, "deadlineTimestamp");
        return new TimerDTO(serverTimestamp, deadlineTimestamp, textColor, backgroundColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimerDTO)) {
            return false;
        }
        TimerDTO timerDTO = (TimerDTO) other;
        return Intrinsics.d(this.serverTimestamp, timerDTO.serverTimestamp) && Intrinsics.d(this.deadlineTimestamp, timerDTO.deadlineTimestamp) && Intrinsics.d(this.textColor, timerDTO.textColor) && Intrinsics.d(this.backgroundColor, timerDTO.backgroundColor);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final String getDeadlineTimestamp() {
        return this.deadlineTimestamp;
    }

    @NotNull
    public final String getServerTimestamp() {
        return this.serverTimestamp;
    }

    public final String getTextColor() {
        return this.textColor;
    }

    public int hashCode() {
        int a11 = g.a(this.serverTimestamp.hashCode() * 31, 31, this.deadlineTimestamp);
        String str = this.textColor;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.backgroundColor;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.serverTimestamp;
        String str2 = this.deadlineTimestamp;
        return C3173b.c(C3660k.d("TimerDTO(serverTimestamp=", str, ", deadlineTimestamp=", str2, ", textColor="), this.textColor, ", backgroundColor=", this.backgroundColor, ")");
    }

    public /* synthetic */ TimerDTO(String str, String str2, String str3, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4);
    }
}
