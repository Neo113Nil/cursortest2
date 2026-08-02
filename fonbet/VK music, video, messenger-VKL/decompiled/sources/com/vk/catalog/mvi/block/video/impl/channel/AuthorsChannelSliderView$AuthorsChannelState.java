package com.vk.catalog.mvi.block.video.impl.channel;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.CatalogBlockState;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import com.vk.dto.common.id.UserId;
import defpackage.q0;
import io.reactivex.rxjava3.subjects.b;
import xsna.bh10;
import xsna.epx;
import xsna.qoy;
import xsna.shy;
import xsna.urd0;

/* compiled from: AuthorsChannelSliderView.kt */
/* loaded from: classes.dex */
public final class AuthorsChannelSliderView$AuthorsChannelState implements CatalogBlockState {
    public static final Parcelable.Creator<AuthorsChannelSliderView$AuthorsChannelState> CREATOR = new a();
    public final BlockId.CompositeId b;
    public final CatalogBlockVariant c;
    public final UserId d;
    public final String e;
    public final boolean f;
    public final String g;
    public final int h;
    public final boolean i;

    /* compiled from: AuthorsChannelSliderView.kt */
    /* loaded from: classes16.dex */
    public static final class a implements Parcelable.Creator<AuthorsChannelSliderView$AuthorsChannelState> {
        @Override // android.os.Parcelable.Creator
        public final AuthorsChannelSliderView$AuthorsChannelState createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            UserId userId;
            BlockId.CompositeId compositeId;
            CatalogBlockVariant catalogBlockVariant;
            BlockId.CompositeId compositeId2 = (BlockId.CompositeId) parcel.readParcelable(AuthorsChannelSliderView$AuthorsChannelState.class.getClassLoader());
            CatalogBlockVariant valueOf = CatalogBlockVariant.valueOf(parcel.readString());
            UserId userId2 = (UserId) parcel.readParcelable(AuthorsChannelSliderView$AuthorsChannelState.class.getClassLoader());
            String readString = parcel.readString();
            if (parcel.readInt() != 0) {
                z2 = false;
                z = true;
            } else {
                z = false;
                z2 = false;
            }
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            if (parcel.readInt() != 0) {
                userId = userId2;
                compositeId = compositeId2;
                catalogBlockVariant = valueOf;
                z2 = true;
            } else {
                userId = userId2;
                compositeId = compositeId2;
                catalogBlockVariant = valueOf;
            }
            return new AuthorsChannelSliderView$AuthorsChannelState(compositeId, catalogBlockVariant, userId, readString, z, readString2, readInt, z2);
        }

        @Override // android.os.Parcelable.Creator
        public final AuthorsChannelSliderView$AuthorsChannelState[] newArray(int i) {
            return new AuthorsChannelSliderView$AuthorsChannelState[i];
        }
    }

    public AuthorsChannelSliderView$AuthorsChannelState(BlockId.CompositeId compositeId, CatalogBlockVariant catalogBlockVariant, UserId userId, String str, boolean z, String str2, int i, boolean z2) {
        this.b = compositeId;
        this.c = catalogBlockVariant;
        this.d = userId;
        this.e = str;
        this.f = z;
        this.g = str2;
        this.h = i;
        this.i = z2;
    }

    public static AuthorsChannelSliderView$AuthorsChannelState a(AuthorsChannelSliderView$AuthorsChannelState authorsChannelSliderView$AuthorsChannelState, boolean z) {
        BlockId.CompositeId compositeId = authorsChannelSliderView$AuthorsChannelState.b;
        CatalogBlockVariant catalogBlockVariant = authorsChannelSliderView$AuthorsChannelState.c;
        UserId userId = authorsChannelSliderView$AuthorsChannelState.d;
        String str = authorsChannelSliderView$AuthorsChannelState.e;
        String str2 = authorsChannelSliderView$AuthorsChannelState.g;
        int i = authorsChannelSliderView$AuthorsChannelState.h;
        boolean z2 = authorsChannelSliderView$AuthorsChannelState.i;
        authorsChannelSliderView$AuthorsChannelState.getClass();
        return new AuthorsChannelSliderView$AuthorsChannelState(compositeId, catalogBlockVariant, userId, str, z, str2, i, z2);
    }

    @Override // com.vk.catalog.mvi.block.CatalogBlockState
    public final CatalogBlockVariant M7() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthorsChannelSliderView$AuthorsChannelState)) {
            return false;
        }
        AuthorsChannelSliderView$AuthorsChannelState authorsChannelSliderView$AuthorsChannelState = (AuthorsChannelSliderView$AuthorsChannelState) obj;
        return epx.f(this.b, authorsChannelSliderView$AuthorsChannelState.b) && this.c == authorsChannelSliderView$AuthorsChannelState.c && epx.f(this.d, authorsChannelSliderView$AuthorsChannelState.d) && epx.f(this.e, authorsChannelSliderView$AuthorsChannelState.e) && this.f == authorsChannelSliderView$AuthorsChannelState.f && epx.f(this.g, authorsChannelSliderView$AuthorsChannelState.g) && this.h == authorsChannelSliderView$AuthorsChannelState.h && this.i == authorsChannelSliderView$AuthorsChannelState.i;
    }

    public final int hashCode() {
        int a2 = bh10.a(b.b(this.c, this.b.hashCode() * 31, 31), 31, this.d.b);
        String str = this.e;
        return Boolean.hashCode(this.i) + shy.a(this.h, urd0.a(qoy.b((a2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f), 31, this.g), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthorsChannelState(blockId=");
        sb.append(this.b);
        sb.append(", blockVariant=");
        sb.append(this.c);
        sb.append(", channelId=");
        sb.append(this.d);
        sb.append(", imageUrl=");
        sb.append(this.e);
        sb.append(", isSubscribed=");
        sb.append(this.f);
        sb.append(", title=");
        sb.append(this.g);
        sb.append(", membersCount=");
        sb.append(this.h);
        sb.append(", isVerified=");
        return q0.a(sb, this.i, ')');
    }

    @Override // com.vk.catalog.mvi.block.CatalogBlockState
    public final BlockId w() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c.name());
        parcel.writeParcelable(this.d, i);
        parcel.writeString(this.e);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeString(this.g);
        parcel.writeInt(this.h);
        parcel.writeInt(this.i ? 1 : 0);
    }
}
