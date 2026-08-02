package com.vk.clips.entrypoints.params;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.StoryMusicInfo;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsCreateContext;
import xsna.epx;
import xsna.qoy;
import xsna.zcl;

/* compiled from: ClipsEntryPointsParams.kt */
/* loaded from: classes16.dex */
public final class ClipsEntryPointsParams implements Parcelable {
    public static final Parcelable.Creator<ClipsEntryPointsParams> CREATOR = new a();
    public final MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint b;
    public final StoryMusicInfo c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final UserId g;
    public final boolean h;
    public final ClipsMediaPickerTab i;

    /* compiled from: ClipsEntryPointsParams.kt */
    public static final class a implements Parcelable.Creator<ClipsEntryPointsParams> {
        @Override // android.os.Parcelable.Creator
        public final ClipsEntryPointsParams createFromParcel(Parcel parcel) {
            Class cls;
            boolean z;
            Class cls2;
            boolean z2;
            MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint valueOf = MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint.valueOf(parcel.readString());
            StoryMusicInfo storyMusicInfo = (StoryMusicInfo) parcel.readParcelable(ClipsEntryPointsParams.class.getClassLoader());
            String readString = parcel.readString();
            if (parcel.readInt() != 0) {
                cls = ClipsEntryPointsParams.class;
                z = true;
            } else {
                cls = ClipsEntryPointsParams.class;
                z = false;
            }
            if (parcel.readInt() != 0) {
                cls2 = cls;
                z2 = true;
            } else {
                cls2 = cls;
                z2 = false;
            }
            return new ClipsEntryPointsParams(valueOf, storyMusicInfo, readString, z, z2, (UserId) parcel.readParcelable(cls2.getClassLoader()), parcel.readInt() != 0, ClipsMediaPickerTab.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final ClipsEntryPointsParams[] newArray(int i) {
            return new ClipsEntryPointsParams[i];
        }
    }

    public ClipsEntryPointsParams(MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint creationEntryPoint, StoryMusicInfo storyMusicInfo, String str, boolean z, boolean z2, UserId userId, boolean z3, ClipsMediaPickerTab clipsMediaPickerTab) {
        this.b = creationEntryPoint;
        this.c = storyMusicInfo;
        this.d = str;
        this.e = z;
        this.f = z2;
        this.g = userId;
        this.h = z3;
        this.i = clipsMediaPickerTab;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClipsEntryPointsParams)) {
            return false;
        }
        ClipsEntryPointsParams clipsEntryPointsParams = (ClipsEntryPointsParams) obj;
        return this.b == clipsEntryPointsParams.b && epx.f(this.c, clipsEntryPointsParams.c) && epx.f(this.d, clipsEntryPointsParams.d) && this.e == clipsEntryPointsParams.e && this.f == clipsEntryPointsParams.f && epx.f(this.g, clipsEntryPointsParams.g) && this.h == clipsEntryPointsParams.h && this.i == clipsEntryPointsParams.i;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        StoryMusicInfo storyMusicInfo = this.c;
        int hashCode2 = (hashCode + (storyMusicInfo == null ? 0 : storyMusicInfo.hashCode())) * 31;
        String str = this.d;
        int b = qoy.b(qoy.b((hashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.e), 31, this.f);
        UserId userId = this.g;
        return this.i.hashCode() + qoy.b((b + (userId != null ? Long.hashCode(userId.b) : 0)) * 31, 31, this.h);
    }

    public final String toString() {
        return "ClipsEntryPointsParams(entryPoint=" + this.b + ", storyMusicInfo=" + this.c + ", hashTag=" + this.d + ", enableTemplatesUI=" + this.e + ", enableDraftsUI=" + this.f + ", preselectAuthor=" + this.g + ", doNotOpenClipsTabOnFinish=" + this.h + ", defaultTab=" + this.i + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b.name());
        parcel.writeParcelable(this.c, i);
        parcel.writeString(this.d);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeParcelable(this.g, i);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeString(this.i.name());
    }

    public /* synthetic */ ClipsEntryPointsParams(MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint creationEntryPoint, StoryMusicInfo storyMusicInfo, String str, boolean z, boolean z2, UserId userId, boolean z3, ClipsMediaPickerTab clipsMediaPickerTab, int i, zcl zclVar) {
        this(creationEntryPoint, (i & 2) != 0 ? null : storyMusicInfo, (i & 4) != 0 ? null : str, (i & 8) != 0 ? true : z, (i & 16) != 0 ? true : z2, (i & 32) != 0 ? null : userId, (i & 64) != 0 ? false : z3, (i & 128) != 0 ? ClipsMediaPickerTab.Gallery : clipsMediaPickerTab);
    }
}
