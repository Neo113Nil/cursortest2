package com.vk.catalog.mvi.block.impl.albumauthor;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.CatalogBlockState;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import com.vk.catalog.mvi.section.domain.CatalogButtonDo;
import com.vk.dto.common.Image;
import com.vk.dto.common.id.UserId;
import io.reactivex.rxjava3.subjects.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bh10;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ho8;
import xsna.qoy;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: AlbumTitleSubtitleAvatar.kt */
/* loaded from: classes.dex */
public final class AlbumTitleSubtitleAvatar$State implements CatalogBlockState {
    public static final Parcelable.Creator<AlbumTitleSubtitleAvatar$State> CREATOR = new a();
    public final String b;
    public final CatalogBlockVariant c;
    public final String d;
    public final int e;
    public final Image f;
    public final boolean g;
    public final UserId h;
    public final List<CatalogButtonDo> i;
    public final String j;

    /* compiled from: AlbumTitleSubtitleAvatar.kt */
    /* loaded from: classes16.dex */
    public static final class a implements Parcelable.Creator<AlbumTitleSubtitleAvatar$State> {
        @Override // android.os.Parcelable.Creator
        public final AlbumTitleSubtitleAvatar$State createFromParcel(Parcel parcel) {
            int i;
            ArrayList arrayList;
            String str = ((BlockId.Simple) parcel.readParcelable(AlbumTitleSubtitleAvatar$State.class.getClassLoader())).b;
            CatalogBlockVariant valueOf = CatalogBlockVariant.valueOf(parcel.readString());
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            Image image = (Image) parcel.readParcelable(AlbumTitleSubtitleAvatar$State.class.getClassLoader());
            int i2 = 0;
            boolean z = true;
            if (parcel.readInt() != 0) {
                i = 1;
            } else {
                i = 1;
                z = false;
            }
            UserId userId = (UserId) parcel.readParcelable(AlbumTitleSubtitleAvatar$State.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt2);
                while (i2 != readInt2) {
                    i2 = bo.b(AlbumTitleSubtitleAvatar$State.class, parcel, arrayList2, i2, i);
                }
                arrayList = arrayList2;
            }
            return new AlbumTitleSubtitleAvatar$State(str, valueOf, readString, readInt, image, z, userId, arrayList, parcel.readString(), null);
        }

        @Override // android.os.Parcelable.Creator
        public final AlbumTitleSubtitleAvatar$State[] newArray(int i) {
            return new AlbumTitleSubtitleAvatar$State[i];
        }
    }

    public AlbumTitleSubtitleAvatar$State() {
        throw null;
    }

    public AlbumTitleSubtitleAvatar$State(String str, CatalogBlockVariant catalogBlockVariant, String str2, int i, Image image, boolean z, UserId userId, List list, String str3, zcl zclVar) {
        this.b = str;
        this.c = catalogBlockVariant;
        this.d = str2;
        this.e = i;
        this.f = image;
        this.g = z;
        this.h = userId;
        this.i = list;
        this.j = str3;
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
        if (!(obj instanceof AlbumTitleSubtitleAvatar$State)) {
            return false;
        }
        AlbumTitleSubtitleAvatar$State albumTitleSubtitleAvatar$State = (AlbumTitleSubtitleAvatar$State) obj;
        return BlockId.Simple.b(this.b, albumTitleSubtitleAvatar$State.b) && this.c == albumTitleSubtitleAvatar$State.c && epx.f(this.d, albumTitleSubtitleAvatar$State.d) && this.e == albumTitleSubtitleAvatar$State.e && epx.f(this.f, albumTitleSubtitleAvatar$State.f) && this.g == albumTitleSubtitleAvatar$State.g && epx.f(this.h, albumTitleSubtitleAvatar$State.h) && epx.f(this.i, albumTitleSubtitleAvatar$State.i) && epx.f(this.j, albumTitleSubtitleAvatar$State.j);
    }

    public final int hashCode() {
        int a2 = shy.a(this.e, urd0.a(b.b(this.c, BlockId.Simple.d(this.b) * 31, 31), 31, this.d), 31);
        Image image = this.f;
        int a3 = bh10.a(qoy.b((a2 + (image == null ? 0 : image.hashCode())) * 31, 31, this.g), 31, this.h.b);
        List<CatalogButtonDo> list = this.i;
        int hashCode = (a3 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.j;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("State(blockId=");
        io.reactivex.rxjava3.processors.b.b(sb, this.b, ", blockVariant=");
        sb.append(this.c);
        sb.append(", title=");
        sb.append(this.d);
        sb.append(", followersCount=");
        sb.append(this.e);
        sb.append(", image=");
        sb.append(this.f);
        sb.append(", isPublic=");
        sb.append(this.g);
        sb.append(", ownerId=");
        sb.append(this.h);
        sb.append(", buttons=");
        sb.append(this.i);
        sb.append(", trackCode=");
        return ho8.a(sb, this.j, ')');
    }

    @Override // com.vk.catalog.mvi.block.CatalogBlockState
    public final BlockId w() {
        return BlockId.Simple.a(this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(BlockId.Simple.a(this.b), i);
        parcel.writeString(this.c.name());
        parcel.writeString(this.d);
        parcel.writeInt(this.e);
        parcel.writeParcelable(this.f, i);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeParcelable(this.h, i);
        List<CatalogButtonDo> list = this.i;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        parcel.writeString(this.j);
    }
}
