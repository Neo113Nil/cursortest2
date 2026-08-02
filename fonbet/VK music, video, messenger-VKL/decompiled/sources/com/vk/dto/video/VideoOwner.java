package com.vk.dto.video;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.framework.common.BundleUtil;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.live.LiveEventModel;
import com.vk.dto.user.UserProfile;
import java.util.ArrayList;
import java.util.List;
import xsna.h330;
import xsna.t230;

/* loaded from: classes18.dex */
public class VideoOwner extends t230 implements Parcelable {
    public static final Parcelable.Creator<VideoOwner> CREATOR = new a();
    public String c;
    public int d;
    public UserId e;
    public VideoFile f;
    public UserProfile g;
    public Group h;
    public final String i;
    public final String j;
    public final List<LiveEventModel> k;
    public final List<LiveEventModel> l;

    public class a implements Parcelable.Creator<VideoOwner> {
        @Override // android.os.Parcelable.Creator
        public final VideoOwner createFromParcel(Parcel parcel) {
            return new VideoOwner(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoOwner[] newArray(int i) {
            return new VideoOwner[i];
        }
    }

    public VideoOwner(int i, UserId userId) {
        this(null, null, null, i, userId, new ArrayList(), new ArrayList(), null);
    }

    public static String d(int i, UserId userId) {
        return "" + userId.b + BundleUtil.UNDERLINE_TAG + i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "videoFile " + this.f + " userProfile " + this.g + " group " + this.h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeInt(this.d);
        parcel.writeParcelable(this.e, 0);
        parcel.writeParcelable(this.f, 0);
        parcel.writeParcelable(this.g, 0);
        parcel.writeParcelable(this.h, 0);
        h330.c(parcel, this.k);
        h330.c(parcel, this.l);
        parcel.writeString(this.i);
        parcel.writeString(this.j);
    }

    public VideoOwner(VideoFile videoFile, int i, UserId userId) {
        this(videoFile, null, null, i, userId, new ArrayList(), new ArrayList(), null);
    }

    public VideoOwner(VideoFile videoFile, int i, UserId userId, String str, String str2) {
        this(videoFile, null, null, i, userId, new ArrayList(), new ArrayList(), str, str2);
    }

    public VideoOwner(VideoFile videoFile, UserProfile userProfile, Group group) {
        this(videoFile, userProfile, group, videoFile.o0(), videoFile.I0(), new ArrayList(), new ArrayList(), null, null);
    }

    public VideoOwner(VideoFile videoFile, UserProfile userProfile, Group group, List<LiveEventModel> list, List<LiveEventModel> list2) {
        this(videoFile, userProfile, group, videoFile.o0(), videoFile.I0(), list, list2, null, null);
    }

    public VideoOwner(VideoFile videoFile, UserProfile userProfile, Group group, int i, UserId userId, List<LiveEventModel> list, List<LiveEventModel> list2) {
        this(videoFile, userProfile, group, i, userId, list, list2, null, null);
    }

    public VideoOwner(VideoFile videoFile, UserProfile userProfile, Group group, int i, UserId userId, List<LiveEventModel> list, List<LiveEventModel> list2, String str) {
        this(videoFile, userProfile, group, i, userId, list, list2, str, null);
    }

    public VideoOwner(VideoFile videoFile, UserProfile userProfile, Group group, int i, UserId userId, List<LiveEventModel> list, List<LiveEventModel> list2, String str, String str2) {
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.c = d(i, userId);
        this.d = i;
        this.e = userId;
        this.g = userProfile;
        this.f = videoFile;
        this.h = group;
        this.k = list;
        this.l = list2;
        this.i = str;
        this.j = str2;
    }

    public VideoOwner(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        this.k = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.l = arrayList2;
        this.c = parcel.readString();
        this.d = parcel.readInt();
        this.e = (UserId) parcel.readParcelable(UserId.class.getClassLoader());
        this.f = (VideoFile) parcel.readParcelable(VideoFile.class.getClassLoader());
        this.g = (UserProfile) parcel.readParcelable(UserProfile.class.getClassLoader());
        this.h = (Group) parcel.readParcelable(Group.class.getClassLoader());
        h330.a(parcel, arrayList, LiveEventModel.class);
        h330.a(parcel, arrayList2, LiveEventModel.class);
        this.i = parcel.readString();
        this.j = parcel.readString();
    }
}
