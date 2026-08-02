package com.vk.api.generated.newsfeed.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;

/* compiled from: NewsfeedNewsfeedItemCaptionDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedNewsfeedItemCaptionDto implements Parcelable {
    public static final Parcelable.Creator<NewsfeedNewsfeedItemCaptionDto> CREATOR = new a();

    @pmi0("action_title")
    private final String actionTitle;

    @pmi0("action_url")
    private final String actionUrl;

    @pmi0("can_hide_post")
    private final Boolean canHidePost;

    @pmi0("hide_button_title")
    private final String hideButtonTitle;

    @pmi0("icon")
    private final String icon;

    @pmi0("images")
    private final List<List<BaseImageDto>> images;

    @pmi0("source_id")
    private final UserId sourceId;

    @pmi0("target")
    private final String target;

    @pmi0("text")
    private final String text;

    @pmi0("track_code")
    private final String trackCode;

    @pmi0("type")
    private final String type;

    /* compiled from: NewsfeedNewsfeedItemCaptionDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedNewsfeedItemCaptionDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedNewsfeedItemCaptionDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            UserId userId = (UserId) parcel.readParcelable(NewsfeedNewsfeedItemCaptionDto.class.getClassLoader());
            String readString4 = parcel.readString();
            ArrayList arrayList = null;
            Boolean valueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            String readString5 = parcel.readString();
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    int readInt2 = parcel.readInt();
                    ArrayList arrayList3 = new ArrayList(readInt2);
                    int i2 = 0;
                    while (i2 != readInt2) {
                        i2 = bo.b(NewsfeedNewsfeedItemCaptionDto.class, parcel, arrayList3, i2, 1);
                    }
                    arrayList2.add(arrayList3);
                }
                arrayList = arrayList2;
            }
            return new NewsfeedNewsfeedItemCaptionDto(readString, readString2, readString3, userId, readString4, valueOf, readString5, arrayList, parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedNewsfeedItemCaptionDto[] newArray(int i) {
            return new NewsfeedNewsfeedItemCaptionDto[i];
        }
    }

    public NewsfeedNewsfeedItemCaptionDto() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    public final String d() {
        return this.actionTitle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.actionUrl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedNewsfeedItemCaptionDto)) {
            return false;
        }
        NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = (NewsfeedNewsfeedItemCaptionDto) obj;
        return epx.f(this.actionTitle, newsfeedNewsfeedItemCaptionDto.actionTitle) && epx.f(this.actionUrl, newsfeedNewsfeedItemCaptionDto.actionUrl) && epx.f(this.hideButtonTitle, newsfeedNewsfeedItemCaptionDto.hideButtonTitle) && epx.f(this.sourceId, newsfeedNewsfeedItemCaptionDto.sourceId) && epx.f(this.text, newsfeedNewsfeedItemCaptionDto.text) && epx.f(this.canHidePost, newsfeedNewsfeedItemCaptionDto.canHidePost) && epx.f(this.type, newsfeedNewsfeedItemCaptionDto.type) && epx.f(this.images, newsfeedNewsfeedItemCaptionDto.images) && epx.f(this.trackCode, newsfeedNewsfeedItemCaptionDto.trackCode) && epx.f(this.icon, newsfeedNewsfeedItemCaptionDto.icon) && epx.f(this.target, newsfeedNewsfeedItemCaptionDto.target);
    }

    public final String f() {
        return this.hideButtonTitle;
    }

    public final String g() {
        return this.icon;
    }

    public final String getType() {
        return this.type;
    }

    public final int hashCode() {
        String str = this.actionTitle;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.actionUrl;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.hideButtonTitle;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        UserId userId = this.sourceId;
        int hashCode4 = (hashCode3 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        String str4 = this.text;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.canHidePost;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str5 = this.type;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<List<BaseImageDto>> list = this.images;
        int hashCode8 = (hashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        String str6 = this.trackCode;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.icon;
        int hashCode10 = (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.target;
        return hashCode10 + (str8 != null ? str8.hashCode() : 0);
    }

    public final List<List<BaseImageDto>> i() {
        return this.images;
    }

    public final UserId j() {
        return this.sourceId;
    }

    public final String k() {
        return this.target;
    }

    public final String l() {
        return this.text;
    }

    public final String r() {
        return this.trackCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewsfeedNewsfeedItemCaptionDto(actionTitle=");
        sb.append(this.actionTitle);
        sb.append(", actionUrl=");
        sb.append(this.actionUrl);
        sb.append(", hideButtonTitle=");
        sb.append(this.hideButtonTitle);
        sb.append(", sourceId=");
        sb.append(this.sourceId);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", canHidePost=");
        sb.append(this.canHidePost);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", images=");
        sb.append(this.images);
        sb.append(", trackCode=");
        sb.append(this.trackCode);
        sb.append(", icon=");
        sb.append(this.icon);
        sb.append(", target=");
        return ho8.a(sb, this.target, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.actionTitle);
        parcel.writeString(this.actionUrl);
        parcel.writeString(this.hideButtonTitle);
        parcel.writeParcelable(this.sourceId, i);
        parcel.writeString(this.text);
        Boolean bool = this.canHidePost;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        parcel.writeString(this.type);
        List<List<BaseImageDto>> list = this.images;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                Iterator a2 = ao.a(parcel, (List) f.next());
                while (a2.hasNext()) {
                    parcel.writeParcelable((Parcelable) a2.next(), i);
                }
            }
        }
        parcel.writeString(this.trackCode);
        parcel.writeString(this.icon);
        parcel.writeString(this.target);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NewsfeedNewsfeedItemCaptionDto(String str, String str2, String str3, UserId userId, String str4, Boolean bool, String str5, List<? extends List<BaseImageDto>> list, String str6, String str7, String str8) {
        this.actionTitle = str;
        this.actionUrl = str2;
        this.hideButtonTitle = str3;
        this.sourceId = userId;
        this.text = str4;
        this.canHidePost = bool;
        this.type = str5;
        this.images = list;
        this.trackCode = str6;
        this.icon = str7;
        this.target = str8;
    }

    public /* synthetic */ NewsfeedNewsfeedItemCaptionDto(String str, String str2, String str3, UserId userId, String str4, Boolean bool, String str5, List list, String str6, String str7, String str8, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : userId, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : list, (i & 256) != 0 ? null : str6, (i & 512) != 0 ? null : str7, (i & 1024) != 0 ? null : str8);
    }
}
