package com.vk.api.generated.owners.dto;

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
import xsna.zcl;

/* compiled from: OwnersGetContentSectionsResponseDto.kt */
/* loaded from: classes15.dex */
public final class OwnersGetContentSectionsResponseDto implements Parcelable {
    public static final Parcelable.Creator<OwnersGetContentSectionsResponseDto> CREATOR = new a();

    @pmi0("sections_list")
    private final List<OwnersContentSectionItemDto> sectionsList;

    /* compiled from: OwnersGetContentSectionsResponseDto.kt */
    public static final class a implements Parcelable.Creator<OwnersGetContentSectionsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final OwnersGetContentSectionsResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(OwnersContentSectionItemDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new OwnersGetContentSectionsResponseDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final OwnersGetContentSectionsResponseDto[] newArray(int i) {
            return new OwnersGetContentSectionsResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OwnersGetContentSectionsResponseDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final List<OwnersContentSectionItemDto> d() {
        return this.sectionsList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OwnersGetContentSectionsResponseDto) && epx.f(this.sectionsList, ((OwnersGetContentSectionsResponseDto) obj).sectionsList);
    }

    public final int hashCode() {
        List<OwnersContentSectionItemDto> list = this.sectionsList;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("OwnersGetContentSectionsResponseDto(sectionsList="), this.sectionsList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<OwnersContentSectionItemDto> list = this.sectionsList;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((OwnersContentSectionItemDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public OwnersGetContentSectionsResponseDto(List<OwnersContentSectionItemDto> list) {
        this.sectionsList = list;
    }

    public /* synthetic */ OwnersGetContentSectionsResponseDto(List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list);
    }
}
