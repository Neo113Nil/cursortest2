package com.vk.video.ui.upload.api.router;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.movika.sdk.base.logic.processor.actions.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.bo;
import xsna.bpn0;
import xsna.dn;
import xsna.epx;
import xsna.nr;
import xsna.qoy;
import xsna.zrp;

/* compiled from: AttachedClipsArguments.kt */
/* loaded from: classes7.dex */
public final class AttachedClipsArguments implements Parcelable {
    public static final Parcelable.Creator<AttachedClipsArguments> CREATOR = new a();
    public final UserId b;
    public final Integer c;
    public final List<VideoFile> d;
    public final boolean e;
    public final EntryPoint f;
    public final bpn0 g = new bpn0(new h(this, 3));

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AttachedClipsArguments.kt */
    public static final class EntryPoint {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EntryPoint[] $VALUES;
        public static final EntryPoint FROM_CHANNEL;
        public static final EntryPoint FROM_EDIT;
        public static final EntryPoint FROM_UPLOAD;

        static {
            EntryPoint entryPoint = new EntryPoint("FROM_CHANNEL", 0);
            FROM_CHANNEL = entryPoint;
            EntryPoint entryPoint2 = new EntryPoint("FROM_UPLOAD", 1);
            FROM_UPLOAD = entryPoint2;
            EntryPoint entryPoint3 = new EntryPoint("FROM_EDIT", 2);
            FROM_EDIT = entryPoint3;
            EntryPoint[] entryPointArr = {entryPoint, entryPoint2, entryPoint3};
            $VALUES = entryPointArr;
            $ENTRIES = new asp(entryPointArr);
        }

        public EntryPoint() {
            throw null;
        }

        public static EntryPoint valueOf(String str) {
            return (EntryPoint) Enum.valueOf(EntryPoint.class, str);
        }

        public static EntryPoint[] values() {
            return (EntryPoint[]) $VALUES.clone();
        }
    }

    /* compiled from: AttachedClipsArguments.kt */
    public static final class a implements Parcelable.Creator<AttachedClipsArguments> {
        @Override // android.os.Parcelable.Creator
        public final AttachedClipsArguments createFromParcel(Parcel parcel) {
            UserId userId = (UserId) parcel.readParcelable(AttachedClipsArguments.class.getClassLoader());
            ArrayList arrayList = null;
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(AttachedClipsArguments.class, parcel, arrayList, i, 1);
                }
            }
            return new AttachedClipsArguments(userId, valueOf, arrayList, parcel.readInt() != 0, EntryPoint.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final AttachedClipsArguments[] newArray(int i) {
            return new AttachedClipsArguments[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AttachedClipsArguments(UserId userId, Integer num, List<? extends VideoFile> list, boolean z, EntryPoint entryPoint) {
        this.b = userId;
        this.c = num;
        this.d = list;
        this.e = z;
        this.f = entryPoint;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AttachedClipsArguments)) {
            return false;
        }
        AttachedClipsArguments attachedClipsArguments = (AttachedClipsArguments) obj;
        return epx.f(this.b, attachedClipsArguments.b) && epx.f(this.c, attachedClipsArguments.c) && epx.f(this.d, attachedClipsArguments.d) && this.e == attachedClipsArguments.e && this.f == attachedClipsArguments.f;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.b.b) * 31;
        Integer num = this.c;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        List<VideoFile> list = this.d;
        return this.f.hashCode() + qoy.b((hashCode2 + (list != null ? list.hashCode() : 0)) * 31, 31, this.e);
    }

    public final String toString() {
        return "AttachedClipsArguments(ownerId=" + this.b + ", videoId=" + this.c + ", attachedClips=" + this.d + ", shouldSaveItself=" + this.e + ", entryPoint=" + this.f + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        Integer num = this.c;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        List<VideoFile> list = this.d;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeString(this.f.name());
    }
}
