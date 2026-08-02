package com.vk.video.playlist.playlistscreen.catalog;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.CatalogBlockState;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import defpackage.q0;
import xsna.epx;
import xsna.qoy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: PlaylistHeaderView.kt */
/* loaded from: classes6.dex */
final class PlaylistHeaderView$State implements CatalogBlockState {
    public static final Parcelable.Creator<PlaylistHeaderView$State> CREATOR = new a();
    public final String b;
    public final CatalogBlockVariant c;
    public final String d;
    public final String e;
    public final boolean f;
    public final boolean g;

    /* compiled from: PlaylistHeaderView.kt */
    public static final class a implements Parcelable.Creator<PlaylistHeaderView$State> {
        @Override // android.os.Parcelable.Creator
        public final PlaylistHeaderView$State createFromParcel(Parcel parcel) {
            return new PlaylistHeaderView$State(((BlockId.Simple) parcel.readParcelable(PlaylistHeaderView$State.class.getClassLoader())).b, CatalogBlockVariant.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, null);
        }

        @Override // android.os.Parcelable.Creator
        public final PlaylistHeaderView$State[] newArray(int i) {
            return new PlaylistHeaderView$State[i];
        }
    }

    public PlaylistHeaderView$State(String str, CatalogBlockVariant catalogBlockVariant, String str2, String str3, boolean z, boolean z2, zcl zclVar) {
        this.b = str;
        this.c = catalogBlockVariant;
        this.d = str2;
        this.e = str3;
        this.f = z;
        this.g = z2;
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
        if (!(obj instanceof PlaylistHeaderView$State)) {
            return false;
        }
        PlaylistHeaderView$State playlistHeaderView$State = (PlaylistHeaderView$State) obj;
        return epx.f(this.b, playlistHeaderView$State.b) && this.c == playlistHeaderView$State.c && epx.f(this.d, playlistHeaderView$State.d) && epx.f(this.e, playlistHeaderView$State.e) && this.f == playlistHeaderView$State.f && this.g == playlistHeaderView$State.g;
    }

    public final int hashCode() {
        int a2 = urd0.a(io.reactivex.rxjava3.subjects.b.b(this.c, this.b.hashCode() * 31, 31), 31, this.d);
        String str = this.e;
        return Boolean.hashCode(this.g) + qoy.b((a2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("State(blockId=");
        io.reactivex.rxjava3.processors.b.b(sb, this.b, ", blockVariant=");
        sb.append(this.c);
        sb.append(", title=");
        sb.append(this.d);
        sb.append(", counter=");
        sb.append(this.e);
        sb.append(", canSort=");
        sb.append(this.f);
        sb.append(", sortDisabled=");
        return q0.a(sb, this.g, ')');
    }

    @Override // com.vk.catalog.mvi.block.CatalogBlockState
    public final BlockId w() {
        return new BlockId.Simple(this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(new BlockId.Simple(this.b), i);
        parcel.writeString(this.c.name());
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
    }
}
