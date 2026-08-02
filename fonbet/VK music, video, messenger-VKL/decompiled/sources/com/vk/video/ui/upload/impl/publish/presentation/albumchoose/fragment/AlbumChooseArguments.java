package com.vk.video.ui.upload.impl.publish.presentation.albumchoose.fragment;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.asp;
import xsna.bh10;
import xsna.epx;
import xsna.pm0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: AlbumChooseArguments.kt */
/* loaded from: classes7.dex */
public abstract class AlbumChooseArguments implements Parcelable {
    public final UserId b;
    public final EntryPoint c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AlbumChooseArguments.kt */
    public static final class EntryPoint {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EntryPoint[] $VALUES;
        public static final EntryPoint VIDEO_EDIT;
        public static final EntryPoint VIDEO_UPLOAD;

        static {
            EntryPoint entryPoint = new EntryPoint("VIDEO_UPLOAD", 0);
            VIDEO_UPLOAD = entryPoint;
            EntryPoint entryPoint2 = new EntryPoint("VIDEO_EDIT", 1);
            VIDEO_EDIT = entryPoint2;
            EntryPoint[] entryPointArr = {entryPoint, entryPoint2};
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

    /* compiled from: AlbumChooseArguments.kt */
    public static final class NoInitialAlbums extends AlbumChooseArguments {
        public static final Parcelable.Creator<NoInitialAlbums> CREATOR = new a();
        public final int d;
        public final UserId e;
        public final UserId f;
        public final EntryPoint g;

        /* compiled from: AlbumChooseArguments.kt */
        public static final class a implements Parcelable.Creator<NoInitialAlbums> {
            @Override // android.os.Parcelable.Creator
            public final NoInitialAlbums createFromParcel(Parcel parcel) {
                return new NoInitialAlbums(parcel.readInt(), (UserId) parcel.readParcelable(NoInitialAlbums.class.getClassLoader()), (UserId) parcel.readParcelable(NoInitialAlbums.class.getClassLoader()), EntryPoint.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final NoInitialAlbums[] newArray(int i) {
                return new NoInitialAlbums[i];
            }
        }

        public NoInitialAlbums(int i, UserId userId, UserId userId2, EntryPoint entryPoint) {
            super(userId2, entryPoint, null);
            this.d = i;
            this.e = userId;
            this.f = userId2;
            this.g = entryPoint;
        }

        @Override // com.vk.video.ui.upload.impl.publish.presentation.albumchoose.fragment.AlbumChooseArguments
        public final EntryPoint d() {
            return this.g;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NoInitialAlbums)) {
                return false;
            }
            NoInitialAlbums noInitialAlbums = (NoInitialAlbums) obj;
            return this.d == noInitialAlbums.d && epx.f(this.e, noInitialAlbums.e) && epx.f(this.f, noInitialAlbums.f) && this.g == noInitialAlbums.g;
        }

        public final int hashCode() {
            int hashCode = Integer.hashCode(this.d) * 31;
            UserId userId = this.e;
            return this.g.hashCode() + bh10.a((hashCode + (userId == null ? 0 : Long.hashCode(userId.b))) * 31, 31, this.f.b);
        }

        @Override // com.vk.video.ui.upload.impl.publish.presentation.albumchoose.fragment.AlbumChooseArguments
        public final UserId q() {
            return this.f;
        }

        public final String toString() {
            return "NoInitialAlbums(videoId=" + this.d + ", targetId=" + this.e + ", ownerId=" + this.f + ", entryPoint=" + this.g + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.d);
            parcel.writeParcelable(this.e, i);
            parcel.writeParcelable(this.f, i);
            parcel.writeString(this.g.name());
        }
    }

    /* compiled from: AlbumChooseArguments.kt */
    public static final class WithInitialAlbums extends AlbumChooseArguments {
        public static final Parcelable.Creator<WithInitialAlbums> CREATOR = new a();
        public final List<Integer> d;
        public final UserId e;
        public final EntryPoint f;

        /* compiled from: AlbumChooseArguments.kt */
        public static final class a implements Parcelable.Creator<WithInitialAlbums> {
            @Override // android.os.Parcelable.Creator
            public final WithInitialAlbums createFromParcel(Parcel parcel) {
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = pm0.b(parcel, arrayList, i, 1);
                }
                return new WithInitialAlbums(arrayList, (UserId) parcel.readParcelable(WithInitialAlbums.class.getClassLoader()), EntryPoint.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final WithInitialAlbums[] newArray(int i) {
                return new WithInitialAlbums[i];
            }
        }

        public WithInitialAlbums(List<Integer> list, UserId userId, EntryPoint entryPoint) {
            super(userId, entryPoint, null);
            this.d = list;
            this.e = userId;
            this.f = entryPoint;
        }

        @Override // com.vk.video.ui.upload.impl.publish.presentation.albumchoose.fragment.AlbumChooseArguments
        public final EntryPoint d() {
            return this.f;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WithInitialAlbums)) {
                return false;
            }
            WithInitialAlbums withInitialAlbums = (WithInitialAlbums) obj;
            return epx.f(this.d, withInitialAlbums.d) && epx.f(this.e, withInitialAlbums.e) && this.f == withInitialAlbums.f;
        }

        public final int hashCode() {
            return this.f.hashCode() + bh10.a(this.d.hashCode() * 31, 31, this.e.b);
        }

        @Override // com.vk.video.ui.upload.impl.publish.presentation.albumchoose.fragment.AlbumChooseArguments
        public final UserId q() {
            return this.e;
        }

        public final String toString() {
            return "WithInitialAlbums(initialSelectedAlbumIdList=" + this.d + ", ownerId=" + this.e + ", entryPoint=" + this.f + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Iterator a2 = ao.a(parcel, this.d);
            while (a2.hasNext()) {
                parcel.writeInt(((Number) a2.next()).intValue());
            }
            parcel.writeParcelable(this.e, i);
            parcel.writeString(this.f.name());
        }
    }

    public AlbumChooseArguments(UserId userId, EntryPoint entryPoint, zcl zclVar) {
        this.b = userId;
        this.c = entryPoint;
    }

    public EntryPoint d() {
        return this.c;
    }

    public UserId q() {
        return this.b;
    }
}
