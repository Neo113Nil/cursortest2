package com.vk.clips.playlists;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.clips.playlists.model.PlaylistRawId;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.ho8;
import xsna.ur;

/* compiled from: ClipsPlaylistsFolderLaunchParams.kt */
/* loaded from: classes16.dex */
public final class ClipsPlaylistsFolderLaunchParams implements Parcelable {
    public static final Parcelable.Creator<ClipsPlaylistsFolderLaunchParams> CREATOR = new a();
    public final FoldersLaunchType b;
    public final boolean c;
    public final String d;
    public final List<UserId> e;

    /* compiled from: ClipsPlaylistsFolderLaunchParams.kt */
    public interface FoldersLaunchType extends Parcelable {

        /* compiled from: ClipsPlaylistsFolderLaunchParams.kt */
        public static final class MultiPick implements FoldersLaunchType {
            public static final Parcelable.Creator<MultiPick> CREATOR = new a();
            public final String b;

            /* compiled from: ClipsPlaylistsFolderLaunchParams.kt */
            public static final class a implements Parcelable.Creator<MultiPick> {
                @Override // android.os.Parcelable.Creator
                public final MultiPick createFromParcel(Parcel parcel) {
                    return new MultiPick(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final MultiPick[] newArray(int i) {
                    return new MultiPick[i];
                }
            }

            public MultiPick(String str) {
                this.b = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof MultiPick) && epx.f(this.b, ((MultiPick) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("MultiPick(videoId="), this.b, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(this.b);
            }
        }

        /* compiled from: ClipsPlaylistsFolderLaunchParams.kt */
        public static final class Reorder implements FoldersLaunchType {
            public static final Reorder b = new Reorder();
            public static final Parcelable.Creator<Reorder> CREATOR = new a();

            /* compiled from: ClipsPlaylistsFolderLaunchParams.kt */
            public static final class a implements Parcelable.Creator<Reorder> {
                @Override // android.os.Parcelable.Creator
                public final Reorder createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return Reorder.b;
                }

                @Override // android.os.Parcelable.Creator
                public final Reorder[] newArray(int i) {
                    return new Reorder[i];
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

        /* compiled from: ClipsPlaylistsFolderLaunchParams.kt */
        public static final class SinglePick implements FoldersLaunchType {
            public static final Parcelable.Creator<SinglePick> CREATOR = new a();
            public final String b;
            public final Set<PlaylistRawId> c;

            /* compiled from: ClipsPlaylistsFolderLaunchParams.kt */
            public static final class a implements Parcelable.Creator<SinglePick> {
                @Override // android.os.Parcelable.Creator
                public final SinglePick createFromParcel(Parcel parcel) {
                    LinkedHashSet linkedHashSet;
                    String readString = parcel.readString();
                    if (parcel.readInt() == 0) {
                        linkedHashSet = null;
                    } else {
                        int readInt = parcel.readInt();
                        LinkedHashSet linkedHashSet2 = new LinkedHashSet(readInt);
                        for (int i = 0; i != readInt; i++) {
                            linkedHashSet2.add(PlaylistRawId.CREATOR.createFromParcel(parcel));
                        }
                        linkedHashSet = linkedHashSet2;
                    }
                    return new SinglePick(readString, linkedHashSet);
                }

                @Override // android.os.Parcelable.Creator
                public final SinglePick[] newArray(int i) {
                    return new SinglePick[i];
                }
            }

            public SinglePick(String str, Set<PlaylistRawId> set) {
                this.b = str;
                this.c = set;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SinglePick)) {
                    return false;
                }
                SinglePick singlePick = (SinglePick) obj;
                return epx.f(this.b, singlePick.b) && epx.f(this.c, singlePick.c);
            }

            public final int hashCode() {
                String str = this.b;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                Set<PlaylistRawId> set = this.c;
                return hashCode + (set != null ? set.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("SinglePick(videoId=");
                sb.append(this.b);
                sb.append(", preselectedRawIds=");
                return ur.c(sb, this.c, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(this.b);
                Set<PlaylistRawId> set = this.c;
                if (set == null) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(1);
                parcel.writeInt(set.size());
                Iterator<PlaylistRawId> it = set.iterator();
                while (it.hasNext()) {
                    it.next().writeToParcel(parcel, i);
                }
            }
        }
    }

    /* compiled from: ClipsPlaylistsFolderLaunchParams.kt */
    public static final class a implements Parcelable.Creator<ClipsPlaylistsFolderLaunchParams> {
        @Override // android.os.Parcelable.Creator
        public final ClipsPlaylistsFolderLaunchParams createFromParcel(Parcel parcel) {
            FoldersLaunchType foldersLaunchType = (FoldersLaunchType) parcel.readParcelable(ClipsPlaylistsFolderLaunchParams.class.getClassLoader());
            int i = 0;
            boolean z = parcel.readInt() != 0;
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (i != readInt) {
                i = bo.b(ClipsPlaylistsFolderLaunchParams.class, parcel, arrayList, i, 1);
            }
            return new ClipsPlaylistsFolderLaunchParams(foldersLaunchType, z, readString, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ClipsPlaylistsFolderLaunchParams[] newArray(int i) {
            return new ClipsPlaylistsFolderLaunchParams[i];
        }
    }

    public ClipsPlaylistsFolderLaunchParams(FoldersLaunchType foldersLaunchType, boolean z, String str, List<UserId> list) {
        this.b = foldersLaunchType;
        this.c = z;
        this.d = str;
        this.e = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeString(this.d);
        Iterator a2 = ao.a(parcel, this.e);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
    }
}
