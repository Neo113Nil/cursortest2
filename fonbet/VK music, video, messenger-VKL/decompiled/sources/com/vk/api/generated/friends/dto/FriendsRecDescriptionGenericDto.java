package com.vk.api.generated.friends.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.vk.api.generated.base.dto.BaseImageDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.a9y;
import xsna.ao;
import xsna.b9y;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.hay;
import xsna.ms9;
import xsna.pmi0;
import xsna.x9y;
import xsna.z8y;
import xsna.zcl;

/* compiled from: FriendsRecDescriptionGenericDto.kt */
/* loaded from: classes14.dex */
public abstract class FriendsRecDescriptionGenericDto implements Parcelable {

    /* compiled from: FriendsRecDescriptionGenericDto.kt */
    public static final class Deserializer implements a9y<FriendsRecDescriptionGenericDto> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            if (b9yVar instanceof x9y) {
                return (FriendsRecDescriptionGenericDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, FriendsRecDescriptionDto.class);
            }
            hay i = b9yVar.i();
            if (i.b instanceof String) {
                return new StringWrapper(i.k());
            }
            throw new IllegalStateException("no primitive mapping");
        }
    }

    /* compiled from: FriendsRecDescriptionGenericDto.kt */
    public static final class FriendsRecDescriptionDto extends FriendsRecDescriptionGenericDto implements Parcelable {
        public static final Parcelable.Creator<FriendsRecDescriptionDto> CREATOR = new a();

        @pmi0("content_type")
        private final FriendsRecDescriptionContentTypeDto contentType;

        @pmi0("icon")
        private final FriendsRecDescriptionIconDto icon;

        @pmi0("images")
        private final List<List<BaseImageDto>> images;

        @pmi0("text")
        private final String text;

        /* compiled from: FriendsRecDescriptionGenericDto.kt */
        public static final class a implements Parcelable.Creator<FriendsRecDescriptionDto> {
            @Override // android.os.Parcelable.Creator
            public final FriendsRecDescriptionDto createFromParcel(Parcel parcel) {
                FriendsRecDescriptionContentTypeDto createFromParcel = FriendsRecDescriptionContentTypeDto.CREATOR.createFromParcel(parcel);
                ArrayList arrayList = null;
                FriendsRecDescriptionIconDto createFromParcel2 = parcel.readInt() == 0 ? null : FriendsRecDescriptionIconDto.CREATOR.createFromParcel(parcel);
                String readString = parcel.readString();
                if (parcel.readInt() != 0) {
                    int readInt = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt);
                    for (int i = 0; i != readInt; i++) {
                        int readInt2 = parcel.readInt();
                        ArrayList arrayList3 = new ArrayList(readInt2);
                        int i2 = 0;
                        while (i2 != readInt2) {
                            i2 = bo.b(FriendsRecDescriptionDto.class, parcel, arrayList3, i2, 1);
                        }
                        arrayList2.add(arrayList3);
                    }
                    arrayList = arrayList2;
                }
                return new FriendsRecDescriptionDto(createFromParcel, createFromParcel2, readString, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final FriendsRecDescriptionDto[] newArray(int i) {
                return new FriendsRecDescriptionDto[i];
            }
        }

        public /* synthetic */ FriendsRecDescriptionDto(FriendsRecDescriptionContentTypeDto friendsRecDescriptionContentTypeDto, FriendsRecDescriptionIconDto friendsRecDescriptionIconDto, String str, List list, int i, zcl zclVar) {
            this(friendsRecDescriptionContentTypeDto, (i & 2) != 0 ? null : friendsRecDescriptionIconDto, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : list);
        }

        public final FriendsRecDescriptionContentTypeDto d() {
            return this.contentType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final FriendsRecDescriptionIconDto e() {
            return this.icon;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FriendsRecDescriptionDto)) {
                return false;
            }
            FriendsRecDescriptionDto friendsRecDescriptionDto = (FriendsRecDescriptionDto) obj;
            return this.contentType == friendsRecDescriptionDto.contentType && this.icon == friendsRecDescriptionDto.icon && epx.f(this.text, friendsRecDescriptionDto.text) && epx.f(this.images, friendsRecDescriptionDto.images);
        }

        public final List<List<BaseImageDto>> f() {
            return this.images;
        }

        public final String g() {
            return this.text;
        }

        public final int hashCode() {
            int hashCode = this.contentType.hashCode() * 31;
            FriendsRecDescriptionIconDto friendsRecDescriptionIconDto = this.icon;
            int hashCode2 = (hashCode + (friendsRecDescriptionIconDto == null ? 0 : friendsRecDescriptionIconDto.hashCode())) * 31;
            String str = this.text;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            List<List<BaseImageDto>> list = this.images;
            return hashCode3 + (list != null ? list.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FriendsRecDescriptionDto(contentType=");
            sb.append(this.contentType);
            sb.append(", icon=");
            sb.append(this.icon);
            sb.append(", text=");
            sb.append(this.text);
            sb.append(", images=");
            return ms9.a(')', sb, this.images);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.contentType.writeToParcel(parcel, i);
            FriendsRecDescriptionIconDto friendsRecDescriptionIconDto = this.icon;
            if (friendsRecDescriptionIconDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                friendsRecDescriptionIconDto.writeToParcel(parcel, i);
            }
            parcel.writeString(this.text);
            List<List<BaseImageDto>> list = this.images;
            if (list == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                Iterator a2 = ao.a(parcel, (List) f.next());
                while (a2.hasNext()) {
                    parcel.writeParcelable((Parcelable) a2.next(), i);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public FriendsRecDescriptionDto(FriendsRecDescriptionContentTypeDto friendsRecDescriptionContentTypeDto, FriendsRecDescriptionIconDto friendsRecDescriptionIconDto, String str, List<? extends List<BaseImageDto>> list) {
            super(null);
            this.contentType = friendsRecDescriptionContentTypeDto;
            this.icon = friendsRecDescriptionIconDto;
            this.text = str;
            this.images = list;
        }
    }

    /* compiled from: FriendsRecDescriptionGenericDto.kt */
    public static final class StringWrapper extends FriendsRecDescriptionGenericDto implements Parcelable {
        public static final Parcelable.Creator<StringWrapper> CREATOR = new a();
        public final String b;

        /* compiled from: FriendsRecDescriptionGenericDto.kt */
        public static final class a implements Parcelable.Creator<StringWrapper> {
            @Override // android.os.Parcelable.Creator
            public final StringWrapper createFromParcel(Parcel parcel) {
                return new StringWrapper(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final StringWrapper[] newArray(int i) {
                return new StringWrapper[i];
            }
        }

        public StringWrapper(String str) {
            super(null);
            this.b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
        }
    }

    public /* synthetic */ FriendsRecDescriptionGenericDto(zcl zclVar) {
        this();
    }

    private FriendsRecDescriptionGenericDto() {
    }
}
