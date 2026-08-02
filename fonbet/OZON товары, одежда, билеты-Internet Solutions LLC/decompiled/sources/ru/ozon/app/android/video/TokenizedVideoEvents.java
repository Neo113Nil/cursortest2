package ru.ozon.app.android.video;

import Tl.b;
import WZ.t;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0010J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001e\u0010\u001c¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/video/TokenizedVideoEvents;", "Landroid/os/Parcelable;", "LWZ/t;", "openVideoEvent", "startVideoEvent", "endVideoEvent", "<init>", "(LWZ/t;LWZ/t;LWZ/t;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "LWZ/t;", "getOpenVideoEvent", "()LWZ/t;", "getStartVideoEvent", "getEndVideoEvent", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class TokenizedVideoEvents implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<TokenizedVideoEvents> CREATOR = new Creator();
    private final t endVideoEvent;
    private final t openVideoEvent;
    private final t startVideoEvent;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TokenizedVideoEvents> {
        @Override // android.os.Parcelable.Creator
        public final TokenizedVideoEvents createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TokenizedVideoEvents((t) parcel.readParcelable(TokenizedVideoEvents.class.getClassLoader()), (t) parcel.readParcelable(TokenizedVideoEvents.class.getClassLoader()), (t) parcel.readParcelable(TokenizedVideoEvents.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final TokenizedVideoEvents[] newArray(int i11) {
            return new TokenizedVideoEvents[i11];
        }
    }

    public TokenizedVideoEvents(t tVar, t tVar2, t tVar3) {
        this.openVideoEvent = tVar;
        this.startVideoEvent = tVar2;
        this.endVideoEvent = tVar3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TokenizedVideoEvents)) {
            return false;
        }
        TokenizedVideoEvents tokenizedVideoEvents = (TokenizedVideoEvents) other;
        return Intrinsics.d(this.openVideoEvent, tokenizedVideoEvents.openVideoEvent) && Intrinsics.d(this.startVideoEvent, tokenizedVideoEvents.startVideoEvent) && Intrinsics.d(this.endVideoEvent, tokenizedVideoEvents.endVideoEvent);
    }

    public final t getEndVideoEvent() {
        return this.endVideoEvent;
    }

    public final t getOpenVideoEvent() {
        return this.openVideoEvent;
    }

    public final t getStartVideoEvent() {
        return this.startVideoEvent;
    }

    public int hashCode() {
        t tVar = this.openVideoEvent;
        int hashCode = (tVar == null ? 0 : tVar.hashCode()) * 31;
        t tVar2 = this.startVideoEvent;
        int hashCode2 = (hashCode + (tVar2 == null ? 0 : tVar2.hashCode())) * 31;
        t tVar3 = this.endVideoEvent;
        return hashCode2 + (tVar3 != null ? tVar3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        t tVar = this.openVideoEvent;
        t tVar2 = this.startVideoEvent;
        t tVar3 = this.endVideoEvent;
        StringBuilder sb2 = new StringBuilder("TokenizedVideoEvents(openVideoEvent=");
        sb2.append(tVar);
        sb2.append(", startVideoEvent=");
        sb2.append(tVar2);
        sb2.append(", endVideoEvent=");
        return b.d(sb2, tVar3, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.openVideoEvent, flags);
        dest.writeParcelable(this.startVideoEvent, flags);
        dest.writeParcelable(this.endVideoEvent, flags);
    }
}
