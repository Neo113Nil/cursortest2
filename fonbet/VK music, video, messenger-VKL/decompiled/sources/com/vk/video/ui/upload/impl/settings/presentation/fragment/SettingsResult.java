package com.vk.video.ui.upload.impl.settings.presentation.fragment;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.VideoFile;
import com.vk.dto.stories.entities.OrdData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.sn;

/* compiled from: SettingsArguments.kt */
/* loaded from: classes7.dex */
public final class SettingsResult implements Parcelable {
    public static final Parcelable.Creator<SettingsResult> CREATOR = new a();
    public final List<VideoFile> b;
    public final Boolean c;
    public final Boolean d;
    public final Boolean e;
    public final OrdData f;

    /* compiled from: SettingsArguments.kt */
    public static final class a implements Parcelable.Creator<SettingsResult> {
        @Override // android.os.Parcelable.Creator
        public final SettingsResult createFromParcel(Parcel parcel) {
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
                    i = bo.b(SettingsResult.class, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
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
            return new SettingsResult(arrayList, valueOf, valueOf2, bool, (OrdData) parcel.readParcelable(SettingsResult.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final SettingsResult[] newArray(int i) {
            return new SettingsResult[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SettingsResult(List<? extends VideoFile> list, Boolean bool, Boolean bool2, Boolean bool3, OrdData ordData) {
        this.b = list;
        this.c = bool;
        this.d = bool2;
        this.e = bool3;
        this.f = ordData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SettingsResult)) {
            return false;
        }
        SettingsResult settingsResult = (SettingsResult) obj;
        return epx.f(this.b, settingsResult.b) && epx.f(this.c, settingsResult.c) && epx.f(this.d, settingsResult.d) && epx.f(this.e, settingsResult.e) && epx.f(this.f, settingsResult.f);
    }

    public final int hashCode() {
        List<VideoFile> list = this.b;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Boolean bool = this.c;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.d;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.e;
        int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        OrdData ordData = this.f;
        return hashCode4 + (ordData != null ? ordData.hashCode() : 0);
    }

    public final String toString() {
        return "SettingsResult(attachedClips=" + this.b + ", isVideoCompressionEnabled=" + this.c + ", isCommunityPostEnabled=" + this.d + ", isUserPostEnabled=" + this.e + ", ordData=" + this.f + ')';
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
        Boolean bool = this.c;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.d;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Boolean bool3 = this.e;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        parcel.writeParcelable(this.f, i);
    }
}
