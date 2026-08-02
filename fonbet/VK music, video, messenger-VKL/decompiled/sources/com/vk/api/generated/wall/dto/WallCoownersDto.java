package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.qoy;
import xsna.zcl;

/* compiled from: WallCoownersDto.kt */
/* loaded from: classes15.dex */
public final class WallCoownersDto implements Parcelable {
    public static final Parcelable.Creator<WallCoownersDto> CREATOR = new a();

    @pmi0("coowner_post_id")
    private final WallPostIdDto coownerPostId;

    @pmi0("is_coowner")
    private final boolean isCoowner;

    @pmi0("is_owner")
    private final boolean isOwner;

    @pmi0("list")
    private final List<WallCoownerDto> list;

    @pmi0("requests")
    private final List<WallCoownerRequestDto> requests;

    /* compiled from: WallCoownersDto.kt */
    public static final class a implements Parcelable.Creator<WallCoownersDto> {
        @Override // android.os.Parcelable.Creator
        public final WallCoownersDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int i = 0;
            boolean z = parcel.readInt() != 0;
            boolean z2 = parcel.readInt() != 0;
            ArrayList arrayList2 = null;
            WallPostIdDto createFromParcel = parcel.readInt() == 0 ? null : WallPostIdDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = en.a(WallCoownerDto.CREATOR, parcel, arrayList, i2, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                while (i != readInt2) {
                    i = en.a(WallCoownerRequestDto.CREATOR, parcel, arrayList2, i, 1);
                }
            }
            return new WallCoownersDto(z, z2, createFromParcel, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final WallCoownersDto[] newArray(int i) {
            return new WallCoownersDto[i];
        }
    }

    public WallCoownersDto(boolean z, boolean z2, WallPostIdDto wallPostIdDto, List<WallCoownerDto> list, List<WallCoownerRequestDto> list2) {
        this.isOwner = z;
        this.isCoowner = z2;
        this.coownerPostId = wallPostIdDto;
        this.list = list;
        this.requests = list2;
    }

    public final WallPostIdDto d() {
        return this.coownerPostId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<WallCoownerDto> e() {
        return this.list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallCoownersDto)) {
            return false;
        }
        WallCoownersDto wallCoownersDto = (WallCoownersDto) obj;
        return this.isOwner == wallCoownersDto.isOwner && this.isCoowner == wallCoownersDto.isCoowner && epx.f(this.coownerPostId, wallCoownersDto.coownerPostId) && epx.f(this.list, wallCoownersDto.list) && epx.f(this.requests, wallCoownersDto.requests);
    }

    public final List<WallCoownerRequestDto> f() {
        return this.requests;
    }

    public final boolean g() {
        return this.isCoowner;
    }

    public final int hashCode() {
        int b = qoy.b(Boolean.hashCode(this.isOwner) * 31, 31, this.isCoowner);
        WallPostIdDto wallPostIdDto = this.coownerPostId;
        int hashCode = (b + (wallPostIdDto == null ? 0 : wallPostIdDto.hashCode())) * 31;
        List<WallCoownerDto> list = this.list;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<WallCoownerRequestDto> list2 = this.requests;
        return hashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public final boolean i() {
        return this.isOwner;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WallCoownersDto(isOwner=");
        sb.append(this.isOwner);
        sb.append(", isCoowner=");
        sb.append(this.isCoowner);
        sb.append(", coownerPostId=");
        sb.append(this.coownerPostId);
        sb.append(", list=");
        sb.append(this.list);
        sb.append(", requests=");
        return ms9.a(')', sb, this.requests);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isOwner ? 1 : 0);
        parcel.writeInt(this.isCoowner ? 1 : 0);
        WallPostIdDto wallPostIdDto = this.coownerPostId;
        if (wallPostIdDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            wallPostIdDto.writeToParcel(parcel, i);
        }
        List<WallCoownerDto> list = this.list;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((WallCoownerDto) f.next()).writeToParcel(parcel, i);
            }
        }
        List<WallCoownerRequestDto> list2 = this.requests;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f2 = dn.f(parcel, list2, 1);
        while (f2.hasNext()) {
            ((WallCoownerRequestDto) f2.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ WallCoownersDto(boolean z, boolean z2, WallPostIdDto wallPostIdDto, List list, List list2, int i, zcl zclVar) {
        this(z, z2, (i & 4) != 0 ? null : wallPostIdDto, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : list2);
    }
}
