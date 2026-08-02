package ru.ozon.android.messenger.framework.data.modules.atoms.timerbadge;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import ru.ozon.app.android.messenger.R$id;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003J7\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u0013J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0013HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006%"}, d2 = {"Lru/ozon/android/messenger/framework/data/modules/atoms/timerbadge/TimerBadge;", "Lru/ozon/uni/atoms/data/AtomDTO;", "expirationDate", "Lorg/joda/time/DateTime;", "textColor", "", "backgroundColor", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "<init>", "(Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "getExpirationDate", "()Lorg/joda/time/DateTime;", "getTextColor", "()Ljava/lang/String;", "getBackgroundColor", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getItemType", "", "component1", "component2", "component3", "component4", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class TimerBadge extends AtomDTO {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<TimerBadge> CREATOR = new a();
    private final AtomActionDTO action;
    private final String backgroundColor;

    @NotNull
    private final DateTime expirationDate;
    private final String textColor;

    public static final class a implements Parcelable.Creator<TimerBadge> {
        @Override // android.os.Parcelable.Creator
        public final TimerBadge createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TimerBadge((DateTime) parcel.readSerializable(), parcel.readString(), parcel.readString(), (AtomActionDTO) parcel.readParcelable(TimerBadge.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final TimerBadge[] newArray(int i11) {
            return new TimerBadge[i11];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimerBadge(@NotNull DateTime expirationDate, String str, String str2, AtomActionDTO atomActionDTO) {
        super(ru.ozon.android.messenger.framework.data.modules.atoms.a.TIMER_BADGE, null, null, null, 12, null);
        Intrinsics.checkNotNullParameter(expirationDate, "expirationDate");
        this.expirationDate = expirationDate;
        this.textColor = str;
        this.backgroundColor = str2;
        this.action = atomActionDTO;
    }

    public static /* synthetic */ TimerBadge copy$default(TimerBadge timerBadge, DateTime dateTime, String str, String str2, AtomActionDTO atomActionDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            dateTime = timerBadge.expirationDate;
        }
        if ((i11 & 2) != 0) {
            str = timerBadge.textColor;
        }
        if ((i11 & 4) != 0) {
            str2 = timerBadge.backgroundColor;
        }
        if ((i11 & 8) != 0) {
            atomActionDTO = timerBadge.action;
        }
        return timerBadge.copy(dateTime, str, str2, atomActionDTO);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final DateTime getExpirationDate() {
        return this.expirationDate;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTextColor() {
        return this.textColor;
    }

    /* renamed from: component3, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component4, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    @NotNull
    public final TimerBadge copy(@NotNull DateTime expirationDate, String textColor, String backgroundColor, AtomActionDTO action) {
        Intrinsics.checkNotNullParameter(expirationDate, "expirationDate");
        return new TimerBadge(expirationDate, textColor, backgroundColor, action);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimerBadge)) {
            return false;
        }
        TimerBadge timerBadge = (TimerBadge) other;
        return Intrinsics.d(this.expirationDate, timerBadge.expirationDate) && Intrinsics.d(this.textColor, timerBadge.textColor) && Intrinsics.d(this.backgroundColor, timerBadge.backgroundColor) && Intrinsics.d(this.action, timerBadge.action);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final DateTime getExpirationDate() {
        return this.expirationDate;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R$id.m_atom_type_timer_badge;
    }

    public final String getTextColor() {
        return this.textColor;
    }

    public int hashCode() {
        int hashCode = this.expirationDate.hashCode() * 31;
        String str = this.textColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.backgroundColor;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.action;
        return hashCode3 + (atomActionDTO != null ? atomActionDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TimerBadge(expirationDate=" + this.expirationDate + ", textColor=" + this.textColor + ", backgroundColor=" + this.backgroundColor + ", action=" + this.action + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.expirationDate);
        dest.writeString(this.textColor);
        dest.writeString(this.backgroundColor);
        dest.writeParcelable(this.action, flags);
    }
}
