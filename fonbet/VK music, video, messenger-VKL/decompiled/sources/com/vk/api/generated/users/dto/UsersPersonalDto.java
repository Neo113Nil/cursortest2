package com.vk.api.generated.users.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.api.generated.database.dto.DatabaseLanguageFullDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: UsersPersonalDto.kt */
/* loaded from: classes15.dex */
public final class UsersPersonalDto implements Parcelable {
    public static final Parcelable.Creator<UsersPersonalDto> CREATOR = new a();

    @pmi0("alcohol")
    private final Integer alcohol;

    @pmi0("inspired_by")
    private final String inspiredBy;

    @pmi0("langs")
    private final List<String> langs;

    @pmi0("langs_full")
    private final List<DatabaseLanguageFullDto> langsFull;

    @pmi0("life_main")
    private final Integer lifeMain;

    @pmi0("people_main")
    private final Integer peopleMain;

    @pmi0("political")
    private final Integer political;

    @pmi0("religion")
    private final String religion;

    @pmi0("religion_id")
    private final Integer religionId;

    @pmi0("smoking")
    private final Integer smoking;

    /* compiled from: UsersPersonalDto.kt */
    public static final class a implements Parcelable.Creator<UsersPersonalDto> {
        @Override // android.os.Parcelable.Creator
        public final UsersPersonalDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString = parcel.readString();
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(DatabaseLanguageFullDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new UsersPersonalDto(valueOf, readString, createStringArrayList, arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final UsersPersonalDto[] newArray(int i) {
            return new UsersPersonalDto[i];
        }
    }

    public UsersPersonalDto() {
        this(null, null, null, null, null, null, null, null, null, null, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, null);
    }

    public final Integer d() {
        return this.alcohol;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.inspiredBy;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UsersPersonalDto)) {
            return false;
        }
        UsersPersonalDto usersPersonalDto = (UsersPersonalDto) obj;
        return epx.f(this.alcohol, usersPersonalDto.alcohol) && epx.f(this.inspiredBy, usersPersonalDto.inspiredBy) && epx.f(this.langs, usersPersonalDto.langs) && epx.f(this.langsFull, usersPersonalDto.langsFull) && epx.f(this.lifeMain, usersPersonalDto.lifeMain) && epx.f(this.peopleMain, usersPersonalDto.peopleMain) && epx.f(this.political, usersPersonalDto.political) && epx.f(this.religion, usersPersonalDto.religion) && epx.f(this.religionId, usersPersonalDto.religionId) && epx.f(this.smoking, usersPersonalDto.smoking);
    }

    public final List<String> f() {
        return this.langs;
    }

    public final Integer g() {
        return this.lifeMain;
    }

    public final int hashCode() {
        Integer num = this.alcohol;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.inspiredBy;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.langs;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<DatabaseLanguageFullDto> list2 = this.langsFull;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num2 = this.lifeMain;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.peopleMain;
        int hashCode6 = (hashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.political;
        int hashCode7 = (hashCode6 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str2 = this.religion;
        int hashCode8 = (hashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num5 = this.religionId;
        int hashCode9 = (hashCode8 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.smoking;
        return hashCode9 + (num6 != null ? num6.hashCode() : 0);
    }

    public final Integer i() {
        return this.peopleMain;
    }

    public final Integer j() {
        return this.political;
    }

    public final String k() {
        return this.religion;
    }

    public final Integer l() {
        return this.smoking;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UsersPersonalDto(alcohol=");
        sb.append(this.alcohol);
        sb.append(", inspiredBy=");
        sb.append(this.inspiredBy);
        sb.append(", langs=");
        sb.append(this.langs);
        sb.append(", langsFull=");
        sb.append(this.langsFull);
        sb.append(", lifeMain=");
        sb.append(this.lifeMain);
        sb.append(", peopleMain=");
        sb.append(this.peopleMain);
        sb.append(", political=");
        sb.append(this.political);
        sb.append(", religion=");
        sb.append(this.religion);
        sb.append(", religionId=");
        sb.append(this.religionId);
        sb.append(", smoking=");
        return uqi.b(sb, this.smoking, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.alcohol;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.inspiredBy);
        parcel.writeStringList(this.langs);
        List<DatabaseLanguageFullDto> list = this.langsFull;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((DatabaseLanguageFullDto) f.next()).writeToParcel(parcel, i);
            }
        }
        Integer num2 = this.lifeMain;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Integer num3 = this.peopleMain;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        Integer num4 = this.political;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num4);
        }
        parcel.writeString(this.religion);
        Integer num5 = this.religionId;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num5);
        }
        Integer num6 = this.smoking;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num6);
        }
    }

    public UsersPersonalDto(Integer num, String str, List<String> list, List<DatabaseLanguageFullDto> list2, Integer num2, Integer num3, Integer num4, String str2, Integer num5, Integer num6) {
        this.alcohol = num;
        this.inspiredBy = str;
        this.langs = list;
        this.langsFull = list2;
        this.lifeMain = num2;
        this.peopleMain = num3;
        this.political = num4;
        this.religion = str2;
        this.religionId = num5;
        this.smoking = num6;
    }

    public /* synthetic */ UsersPersonalDto(Integer num, String str, List list, List list2, Integer num2, Integer num3, Integer num4, String str2, Integer num5, Integer num6, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : list2, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : num3, (i & 64) != 0 ? null : num4, (i & 128) != 0 ? null : str2, (i & 256) != 0 ? null : num5, (i & 512) != 0 ? null : num6);
    }
}
