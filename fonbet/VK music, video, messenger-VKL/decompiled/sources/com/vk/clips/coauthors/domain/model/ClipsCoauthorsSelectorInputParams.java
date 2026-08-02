package com.vk.clips.coauthors.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import xsna.bh10;
import xsna.epx;
import xsna.fw3;
import xsna.nr;
import xsna.qoy;
import xsna.uqi;
import xsna.urd0;
import xsna.vu5;
import xsna.zcl;

/* compiled from: ClipsCoauthorsSelectorInputParams.kt */
/* loaded from: classes16.dex */
public final class ClipsCoauthorsSelectorInputParams implements Parcelable {
    public static final Parcelable.Creator<ClipsCoauthorsSelectorInputParams> CREATOR = new a();
    public final boolean b;
    public final Set<ClipsCoauthorsSelectInputModel> c;
    public final String d;
    public final String e;
    public final UserId f;
    public final boolean g;
    public final ImmediateSave h;
    public final OpenFrom i;

    /* compiled from: ClipsCoauthorsSelectorInputParams.kt */
    public interface ImmediateSave extends Parcelable {

        /* compiled from: ClipsCoauthorsSelectorInputParams.kt */
        public static final class Disabled implements ImmediateSave {
            public static final Disabled b = new Disabled();
            public static final Parcelable.Creator<Disabled> CREATOR = new a();

            /* compiled from: ClipsCoauthorsSelectorInputParams.kt */
            public static final class a implements Parcelable.Creator<Disabled> {
                @Override // android.os.Parcelable.Creator
                public final Disabled createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return Disabled.b;
                }

                @Override // android.os.Parcelable.Creator
                public final Disabled[] newArray(int i) {
                    return new Disabled[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: ClipsCoauthorsSelectorInputParams.kt */
        public static final class Enabled implements ImmediateSave {
            public static final Parcelable.Creator<Enabled> CREATOR = new a();
            public final int b;

            /* compiled from: ClipsCoauthorsSelectorInputParams.kt */
            public static final class a implements Parcelable.Creator<Enabled> {
                @Override // android.os.Parcelable.Creator
                public final Enabled createFromParcel(Parcel parcel) {
                    return new Enabled(parcel.readInt());
                }

                @Override // android.os.Parcelable.Creator
                public final Enabled[] newArray(int i) {
                    return new Enabled[i];
                }
            }

            public Enabled(int i) {
                this.b = i;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Enabled) && this.b == ((Enabled) obj).b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.b);
            }

            public final String toString() {
                return vu5.b(new StringBuilder("Enabled(videoId="), this.b, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.b);
            }
        }
    }

    /* compiled from: ClipsCoauthorsSelectorInputParams.kt */
    public interface OpenFrom extends Parcelable {

        /* compiled from: ClipsCoauthorsSelectorInputParams.kt */
        public static final class Clips implements OpenFrom {
            public static final Parcelable.Creator<Clips> CREATOR = new a();
            public final Integer b;

            /* compiled from: ClipsCoauthorsSelectorInputParams.kt */
            public static final class a implements Parcelable.Creator<Clips> {
                @Override // android.os.Parcelable.Creator
                public final Clips createFromParcel(Parcel parcel) {
                    return new Clips(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
                }

                @Override // android.os.Parcelable.Creator
                public final Clips[] newArray(int i) {
                    return new Clips[i];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Clips() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Clips) && epx.f(this.b, ((Clips) obj).b);
            }

            public final int hashCode() {
                Integer num = this.b;
                if (num == null) {
                    return 0;
                }
                return num.hashCode();
            }

            public final String toString() {
                return uqi.b(new StringBuilder("Clips(videoId="), this.b, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                Integer num = this.b;
                if (num == null) {
                    parcel.writeInt(0);
                } else {
                    nr.a(parcel, 1, num);
                }
            }

            public Clips(Integer num) {
                this.b = num;
            }

            public /* synthetic */ Clips(Integer num, int i, zcl zclVar) {
                this((i & 1) != 0 ? null : num);
            }
        }

        /* compiled from: ClipsCoauthorsSelectorInputParams.kt */
        public static final class Posting implements OpenFrom {
            public static final Posting b = new Posting();
            public static final Parcelable.Creator<Posting> CREATOR = new a();

            /* compiled from: ClipsCoauthorsSelectorInputParams.kt */
            public static final class a implements Parcelable.Creator<Posting> {
                @Override // android.os.Parcelable.Creator
                public final Posting createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return Posting.b;
                }

                @Override // android.os.Parcelable.Creator
                public final Posting[] newArray(int i) {
                    return new Posting[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }
        }
    }

    /* compiled from: ClipsCoauthorsSelectorInputParams.kt */
    public static final class a implements Parcelable.Creator<ClipsCoauthorsSelectorInputParams> {
        @Override // android.os.Parcelable.Creator
        public final ClipsCoauthorsSelectorInputParams createFromParcel(Parcel parcel) {
            boolean z = parcel.readInt() != 0;
            int readInt = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
            for (int i = 0; i != readInt; i++) {
                linkedHashSet.add(ClipsCoauthorsSelectInputModel.CREATOR.createFromParcel(parcel));
            }
            return new ClipsCoauthorsSelectorInputParams(z, linkedHashSet, parcel.readString(), parcel.readString(), (UserId) parcel.readParcelable(ClipsCoauthorsSelectorInputParams.class.getClassLoader()), parcel.readInt() != 0, (ImmediateSave) parcel.readParcelable(ClipsCoauthorsSelectorInputParams.class.getClassLoader()), (OpenFrom) parcel.readParcelable(ClipsCoauthorsSelectorInputParams.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ClipsCoauthorsSelectorInputParams[] newArray(int i) {
            return new ClipsCoauthorsSelectorInputParams[i];
        }
    }

    public ClipsCoauthorsSelectorInputParams(boolean z, Set<ClipsCoauthorsSelectInputModel> set, String str, String str2, UserId userId, boolean z2, ImmediateSave immediateSave, OpenFrom openFrom) {
        this.b = z;
        this.c = set;
        this.d = str;
        this.e = str2;
        this.f = userId;
        this.g = z2;
        this.h = immediateSave;
        this.i = openFrom;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClipsCoauthorsSelectorInputParams)) {
            return false;
        }
        ClipsCoauthorsSelectorInputParams clipsCoauthorsSelectorInputParams = (ClipsCoauthorsSelectorInputParams) obj;
        return this.b == clipsCoauthorsSelectorInputParams.b && epx.f(this.c, clipsCoauthorsSelectorInputParams.c) && epx.f(this.d, clipsCoauthorsSelectorInputParams.d) && epx.f(this.e, clipsCoauthorsSelectorInputParams.e) && epx.f(this.f, clipsCoauthorsSelectorInputParams.f) && this.g == clipsCoauthorsSelectorInputParams.g && epx.f(this.h, clipsCoauthorsSelectorInputParams.h) && epx.f(this.i, clipsCoauthorsSelectorInputParams.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + ((this.h.hashCode() + qoy.b(bh10.a(urd0.a(urd0.a(fw3.b(Boolean.hashCode(this.b) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f.b), 31, this.g)) * 31);
    }

    public final String toString() {
        return "ClipsCoauthorsSelectorInputParams(forceDarkTheme=" + this.b + ", preselectedIds=" + this.c + ", requestKey=" + this.d + ", resultSelectedBundleKey=" + this.e + ", authorId=" + this.f + ", canDelete=" + this.g + ", saveImmediately=" + this.h + ", openFrom=" + this.i + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b ? 1 : 0);
        Set<ClipsCoauthorsSelectInputModel> set = this.c;
        parcel.writeInt(set.size());
        Iterator<ClipsCoauthorsSelectInputModel> it = set.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeParcelable(this.f, i);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeParcelable(this.h, i);
        parcel.writeParcelable(this.i, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ClipsCoauthorsSelectorInputParams(boolean z, Set set, String str, String str2, UserId userId, boolean z2, ImmediateSave immediateSave, OpenFrom openFrom, int i, zcl zclVar) {
        this(z, set, str, str2, userId, r8, r9, r10);
        OpenFrom openFrom2;
        boolean z3 = (i & 32) != 0 ? false : z2;
        ImmediateSave immediateSave2 = (i & 64) != 0 ? ImmediateSave.Disabled.b : immediateSave;
        if ((i & 128) != 0) {
            openFrom2 = new OpenFrom.Clips(null, 1, 0 == true ? 1 : 0);
        } else {
            openFrom2 = openFrom;
        }
    }
}
