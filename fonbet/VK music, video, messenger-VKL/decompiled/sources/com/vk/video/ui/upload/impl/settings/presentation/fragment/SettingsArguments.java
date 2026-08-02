package com.vk.video.ui.upload.impl.settings.presentation.fragment;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.entities.OrdData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bh10;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.lq;
import xsna.qoy;
import xsna.sn;

/* compiled from: SettingsArguments.kt */
/* loaded from: classes7.dex */
public final class SettingsArguments implements Parcelable {
    public static final Parcelable.Creator<SettingsArguments> CREATOR = new a();
    public final List<VideoFile> b;
    public final boolean c;
    public final Boolean d;
    public final Boolean e;
    public final Boolean f;
    public final OrdData g;
    public final UserId h;
    public final VideoFile i;

    /* compiled from: SettingsArguments.kt */
    public static final class a implements Parcelable.Creator<SettingsArguments> {
        @Override // android.os.Parcelable.Creator
        public final SettingsArguments createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Boolean valueOf;
            Boolean valueOf2;
            Boolean bool = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(SettingsArguments.class, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            boolean z = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new SettingsArguments(arrayList, z, valueOf, valueOf2, bool, (OrdData) parcel.readParcelable(SettingsArguments.class.getClassLoader()), (UserId) parcel.readParcelable(SettingsArguments.class.getClassLoader()), (VideoFile) parcel.readParcelable(SettingsArguments.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final SettingsArguments[] newArray(int i) {
            return new SettingsArguments[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SettingsArguments(List<? extends VideoFile> list, boolean z, Boolean bool, Boolean bool2, Boolean bool3, OrdData ordData, UserId userId, VideoFile videoFile) {
        this.b = list;
        this.c = z;
        this.d = bool;
        this.e = bool2;
        this.f = bool3;
        this.g = ordData;
        this.h = userId;
        this.i = videoFile;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SettingsArguments)) {
            return false;
        }
        SettingsArguments settingsArguments = (SettingsArguments) obj;
        return epx.f(this.b, settingsArguments.b) && this.c == settingsArguments.c && epx.f(this.d, settingsArguments.d) && epx.f(this.e, settingsArguments.e) && epx.f(this.f, settingsArguments.f) && epx.f(this.g, settingsArguments.g) && epx.f(this.h, settingsArguments.h) && epx.f(this.i, settingsArguments.i);
    }

    public final int hashCode() {
        List<VideoFile> list = this.b;
        int b = qoy.b((list == null ? 0 : list.hashCode()) * 31, 31, this.c);
        Boolean bool = this.d;
        int hashCode = (b + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.e;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f;
        int hashCode3 = (hashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        OrdData ordData = this.g;
        int a2 = bh10.a((hashCode3 + (ordData == null ? 0 : ordData.hashCode())) * 31, 31, this.h.b);
        VideoFile videoFile = this.i;
        return a2 + (videoFile != null ? videoFile.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SettingsArguments(attachedClips=");
        sb.append(this.b);
        sb.append(", hasAttachedClipsInitial=");
        sb.append(this.c);
        sb.append(", isVideoCompressionEnabled=");
        sb.append(this.d);
        sb.append(", isCommunityPostEnabled=");
        sb.append(this.e);
        sb.append(", isUserPostEnabled=");
        sb.append(this.f);
        sb.append(", ordData=");
        sb.append(this.g);
        sb.append(", ownerId=");
        sb.append(this.h);
        sb.append(", videoFile=");
        return lq.a(sb, this.i, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<VideoFile> list = this.b;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        parcel.writeInt(this.c ? 1 : 0);
        Boolean bool = this.d;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.e;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Boolean bool3 = this.f;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        parcel.writeParcelable(this.g, i);
        parcel.writeParcelable(this.h, i);
        parcel.writeParcelable(this.i, i);
    }
}
