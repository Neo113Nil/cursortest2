package com.vk.newsfeed.posting.music_picker.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.newsfeed.posting.music_picker.presentation.view.MusicPickerLoadingState;
import defpackage.q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.fw3;
import xsna.shy;
import xsna.urd0;
import xsna.vu5;

/* compiled from: MusicPickerState.kt */
/* loaded from: classes4.dex */
public interface MusicPickerList extends Parcelable {

    /* compiled from: MusicPickerState.kt */
    public static final class Playlists implements MusicPickerList {
        public static final Parcelable.Creator<Playlists> CREATOR = new a();
        public final UUID b;
        public final String c;
        public final List<Playlist> d;
        public final MusicPickerLoadingState e;
        public final int f;
        public final int g;
        public final boolean h;

        /* compiled from: MusicPickerState.kt */
        public static final class a implements Parcelable.Creator<Playlists> {
            @Override // android.os.Parcelable.Creator
            public final Playlists createFromParcel(Parcel parcel) {
                UUID uuid = (UUID) parcel.readSerializable();
                String readString = parcel.readString();
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(Playlists.class, parcel, arrayList, i, 1);
                }
                return new Playlists(uuid, readString, arrayList, MusicPickerLoadingState.valueOf(parcel.readString()), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Playlists[] newArray(int i) {
                return new Playlists[i];
            }
        }

        public Playlists() {
            this(null, null, null, null, 0, 0, false, 127, null);
        }

        public static Playlists a(Playlists playlists, String str, List list, MusicPickerLoadingState musicPickerLoadingState, int i, int i2, boolean z, int i3) {
            String str2 = str;
            UUID uuid = playlists.b;
            if ((i3 & 2) != 0) {
                str2 = playlists.c;
            }
            if ((i3 & 4) != 0) {
                list = playlists.d;
            }
            if ((i3 & 8) != 0) {
                musicPickerLoadingState = playlists.e;
            }
            if ((i3 & 16) != 0) {
                i = playlists.f;
            }
            if ((i3 & 32) != 0) {
                i2 = playlists.g;
            }
            if ((i3 & 64) != 0) {
                z = playlists.h;
            }
            boolean z2 = z;
            playlists.getClass();
            int i4 = i2;
            int i5 = i;
            MusicPickerLoadingState musicPickerLoadingState2 = musicPickerLoadingState;
            return new Playlists(uuid, str2, list, musicPickerLoadingState2, i5, i4, z2);
        }

        @Override // com.vk.newsfeed.posting.music_picker.domain.model.MusicPickerList
        public final UUID Y0() {
            return this.b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Playlists)) {
                return false;
            }
            Playlists playlists = (Playlists) obj;
            return epx.f(this.b, playlists.b) && epx.f(this.c, playlists.c) && epx.f(this.d, playlists.d) && this.e == playlists.e && this.f == playlists.f && this.g == playlists.g && this.h == playlists.h;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.h) + shy.a(this.g, shy.a(this.f, (this.e.hashCode() + fw3.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d)) * 31, 31), 31);
        }

        @Override // com.vk.newsfeed.posting.music_picker.domain.model.MusicPickerList
        public final MusicPickerLoadingState l7() {
            return this.e;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Playlists(uuid=");
            sb.append(this.b);
            sb.append(", searchQuery=");
            sb.append(this.c);
            sb.append(", playlists=");
            sb.append(this.d);
            sb.append(", loadingState=");
            sb.append(this.e);
            sb.append(", offset=");
            sb.append(this.f);
            sb.append(", total=");
            sb.append(this.g);
            sb.append(", isSearching=");
            return q0.a(sb, this.h, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeSerializable(this.b);
            parcel.writeString(this.c);
            Iterator a2 = ao.a(parcel, this.d);
            while (a2.hasNext()) {
                parcel.writeParcelable((Parcelable) a2.next(), i);
            }
            parcel.writeString(this.e.name());
            parcel.writeInt(this.f);
            parcel.writeInt(this.g);
            parcel.writeInt(this.h ? 1 : 0);
        }

        public Playlists(UUID uuid, String str, List<Playlist> list, MusicPickerLoadingState musicPickerLoadingState, int i, int i2, boolean z) {
            this.b = uuid;
            this.c = str;
            this.d = list;
            this.e = musicPickerLoadingState;
            this.f = i;
            this.g = i2;
            this.h = z;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public Playlists(java.util.UUID r2, java.lang.String r3, java.util.List r4, com.vk.newsfeed.posting.music_picker.presentation.view.MusicPickerLoadingState r5, int r6, int r7, boolean r8, int r9, xsna.zcl r10) {
            /*
                r1 = this;
                r10 = r9 & 1
                if (r10 == 0) goto L8
                java.util.UUID r2 = java.util.UUID.randomUUID()
            L8:
                r10 = r9 & 2
                if (r10 == 0) goto Le
                java.lang.String r3 = ""
            Le:
                r10 = r9 & 4
                if (r10 == 0) goto L14
                kotlin.collections.EmptyList r4 = kotlin.collections.EmptyList.b
            L14:
                r10 = r9 & 8
                if (r10 == 0) goto L1a
                com.vk.newsfeed.posting.music_picker.presentation.view.MusicPickerLoadingState r5 = com.vk.newsfeed.posting.music_picker.presentation.view.MusicPickerLoadingState.None
            L1a:
                r10 = r9 & 16
                r0 = 0
                if (r10 == 0) goto L20
                r6 = r0
            L20:
                r10 = r9 & 32
                if (r10 == 0) goto L25
                r7 = r0
            L25:
                r9 = r9 & 64
                if (r9 == 0) goto L32
                r10 = r0
                r8 = r6
                r9 = r7
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
                goto L3a
            L32:
                r10 = r8
                r9 = r7
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
            L3a:
                r3.<init>(r4, r5, r6, r7, r8, r9, r10)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.vk.newsfeed.posting.music_picker.domain.model.MusicPickerList.Playlists.<init>(java.util.UUID, java.lang.String, java.util.List, com.vk.newsfeed.posting.music_picker.presentation.view.MusicPickerLoadingState, int, int, boolean, int, xsna.zcl):void");
        }
    }

    /* compiled from: MusicPickerState.kt */
    public static final class Tracks implements MusicPickerList {
        public static final Parcelable.Creator<Tracks> CREATOR = new a();
        public final UUID b;
        public final String c;
        public final List<MusicTrack> d;
        public final MusicPickerLoadingState e;
        public final int f;
        public final int g;
        public final boolean h;

        /* compiled from: MusicPickerState.kt */
        public static final class a implements Parcelable.Creator<Tracks> {
            @Override // android.os.Parcelable.Creator
            public final Tracks createFromParcel(Parcel parcel) {
                UUID uuid = (UUID) parcel.readSerializable();
                String readString = parcel.readString();
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(Tracks.class, parcel, arrayList, i, 1);
                }
                return new Tracks(uuid, readString, arrayList, MusicPickerLoadingState.valueOf(parcel.readString()), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Tracks[] newArray(int i) {
                return new Tracks[i];
            }
        }

        public Tracks() {
            this(null, null, null, null, 0, 0, false, 127, null);
        }

        public static Tracks a(Tracks tracks, String str, List list, MusicPickerLoadingState musicPickerLoadingState, int i, int i2, boolean z, int i3) {
            String str2 = str;
            UUID uuid = tracks.b;
            if ((i3 & 2) != 0) {
                str2 = tracks.c;
            }
            if ((i3 & 4) != 0) {
                list = tracks.d;
            }
            if ((i3 & 8) != 0) {
                musicPickerLoadingState = tracks.e;
            }
            if ((i3 & 16) != 0) {
                i = tracks.f;
            }
            if ((i3 & 32) != 0) {
                i2 = tracks.g;
            }
            if ((i3 & 64) != 0) {
                z = tracks.h;
            }
            boolean z2 = z;
            tracks.getClass();
            int i4 = i2;
            int i5 = i;
            MusicPickerLoadingState musicPickerLoadingState2 = musicPickerLoadingState;
            return new Tracks(uuid, str2, list, musicPickerLoadingState2, i5, i4, z2);
        }

        @Override // com.vk.newsfeed.posting.music_picker.domain.model.MusicPickerList
        public final UUID Y0() {
            return this.b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Tracks)) {
                return false;
            }
            Tracks tracks = (Tracks) obj;
            return epx.f(this.b, tracks.b) && epx.f(this.c, tracks.c) && epx.f(this.d, tracks.d) && this.e == tracks.e && this.f == tracks.f && this.g == tracks.g && this.h == tracks.h;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.h) + shy.a(this.g, shy.a(this.f, (this.e.hashCode() + fw3.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d)) * 31, 31), 31);
        }

        @Override // com.vk.newsfeed.posting.music_picker.domain.model.MusicPickerList
        public final MusicPickerLoadingState l7() {
            return this.e;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Tracks(uuid=");
            sb.append(this.b);
            sb.append(", searchQuery=");
            sb.append(this.c);
            sb.append(", tracks=");
            sb.append(this.d);
            sb.append(", loadingState=");
            sb.append(this.e);
            sb.append(", offset=");
            sb.append(this.f);
            sb.append(", total=");
            sb.append(this.g);
            sb.append(", isSearching=");
            return q0.a(sb, this.h, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeSerializable(this.b);
            parcel.writeString(this.c);
            Iterator a2 = ao.a(parcel, this.d);
            while (a2.hasNext()) {
                parcel.writeParcelable((Parcelable) a2.next(), i);
            }
            parcel.writeString(this.e.name());
            parcel.writeInt(this.f);
            parcel.writeInt(this.g);
            parcel.writeInt(this.h ? 1 : 0);
        }

        public Tracks(UUID uuid, String str, List<MusicTrack> list, MusicPickerLoadingState musicPickerLoadingState, int i, int i2, boolean z) {
            this.b = uuid;
            this.c = str;
            this.d = list;
            this.e = musicPickerLoadingState;
            this.f = i;
            this.g = i2;
            this.h = z;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public Tracks(java.util.UUID r2, java.lang.String r3, java.util.List r4, com.vk.newsfeed.posting.music_picker.presentation.view.MusicPickerLoadingState r5, int r6, int r7, boolean r8, int r9, xsna.zcl r10) {
            /*
                r1 = this;
                r10 = r9 & 1
                if (r10 == 0) goto L8
                java.util.UUID r2 = java.util.UUID.randomUUID()
            L8:
                r10 = r9 & 2
                if (r10 == 0) goto Le
                java.lang.String r3 = ""
            Le:
                r10 = r9 & 4
                if (r10 == 0) goto L14
                kotlin.collections.EmptyList r4 = kotlin.collections.EmptyList.b
            L14:
                r10 = r9 & 8
                if (r10 == 0) goto L1a
                com.vk.newsfeed.posting.music_picker.presentation.view.MusicPickerLoadingState r5 = com.vk.newsfeed.posting.music_picker.presentation.view.MusicPickerLoadingState.None
            L1a:
                r10 = r9 & 16
                r0 = 0
                if (r10 == 0) goto L20
                r6 = r0
            L20:
                r10 = r9 & 32
                if (r10 == 0) goto L25
                r7 = r0
            L25:
                r9 = r9 & 64
                if (r9 == 0) goto L32
                r10 = r0
                r8 = r6
                r9 = r7
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
                goto L3a
            L32:
                r10 = r8
                r9 = r7
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
            L3a:
                r3.<init>(r4, r5, r6, r7, r8, r9, r10)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.vk.newsfeed.posting.music_picker.domain.model.MusicPickerList.Tracks.<init>(java.util.UUID, java.lang.String, java.util.List, com.vk.newsfeed.posting.music_picker.presentation.view.MusicPickerLoadingState, int, int, boolean, int, xsna.zcl):void");
        }
    }

    UUID Y0();

    MusicPickerLoadingState l7();

    /* compiled from: MusicPickerState.kt */
    public static final class SelectedPlaylist implements MusicPickerList {
        public static final Parcelable.Creator<SelectedPlaylist> CREATOR = new a();
        public final UUID b;
        public final Playlist c;
        public final List<MusicTrack> d;
        public final MusicPickerLoadingState e;
        public final int f;
        public final int g;

        /* compiled from: MusicPickerState.kt */
        public static final class a implements Parcelable.Creator<SelectedPlaylist> {
            @Override // android.os.Parcelable.Creator
            public final SelectedPlaylist createFromParcel(Parcel parcel) {
                UUID uuid = (UUID) parcel.readSerializable();
                Playlist playlist = (Playlist) parcel.readParcelable(SelectedPlaylist.class.getClassLoader());
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(SelectedPlaylist.class, parcel, arrayList, i, 1);
                }
                return new SelectedPlaylist(uuid, playlist, arrayList, MusicPickerLoadingState.valueOf(parcel.readString()), parcel.readInt(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final SelectedPlaylist[] newArray(int i) {
                return new SelectedPlaylist[i];
            }
        }

        public SelectedPlaylist(UUID uuid, Playlist playlist, List<MusicTrack> list, MusicPickerLoadingState musicPickerLoadingState, int i, int i2) {
            this.b = uuid;
            this.c = playlist;
            this.d = list;
            this.e = musicPickerLoadingState;
            this.f = i;
            this.g = i2;
        }

        public static SelectedPlaylist a(SelectedPlaylist selectedPlaylist, List list, MusicPickerLoadingState musicPickerLoadingState, int i, int i2, int i3) {
            UUID uuid = selectedPlaylist.b;
            Playlist playlist = selectedPlaylist.c;
            if ((i3 & 4) != 0) {
                list = selectedPlaylist.d;
            }
            List list2 = list;
            if ((i3 & 16) != 0) {
                i = selectedPlaylist.f;
            }
            int i4 = i;
            if ((i3 & 32) != 0) {
                i2 = selectedPlaylist.g;
            }
            selectedPlaylist.getClass();
            return new SelectedPlaylist(uuid, playlist, list2, musicPickerLoadingState, i4, i2);
        }

        @Override // com.vk.newsfeed.posting.music_picker.domain.model.MusicPickerList
        public final UUID Y0() {
            return this.b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SelectedPlaylist)) {
                return false;
            }
            SelectedPlaylist selectedPlaylist = (SelectedPlaylist) obj;
            return epx.f(this.b, selectedPlaylist.b) && epx.f(this.c, selectedPlaylist.c) && epx.f(this.d, selectedPlaylist.d) && this.e == selectedPlaylist.e && this.f == selectedPlaylist.f && this.g == selectedPlaylist.g;
        }

        public final int hashCode() {
            return Integer.hashCode(this.g) + shy.a(this.f, (this.e.hashCode() + fw3.a((this.c.hashCode() + (this.b.hashCode() * 31)) * 31, 31, this.d)) * 31, 31);
        }

        @Override // com.vk.newsfeed.posting.music_picker.domain.model.MusicPickerList
        public final MusicPickerLoadingState l7() {
            return this.e;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SelectedPlaylist(uuid=");
            sb.append(this.b);
            sb.append(", playlist=");
            sb.append(this.c);
            sb.append(", tracks=");
            sb.append(this.d);
            sb.append(", loadingState=");
            sb.append(this.e);
            sb.append(", offset=");
            sb.append(this.f);
            sb.append(", total=");
            return vu5.b(sb, this.g, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeSerializable(this.b);
            parcel.writeParcelable(this.c, i);
            Iterator a2 = ao.a(parcel, this.d);
            while (a2.hasNext()) {
                parcel.writeParcelable((Parcelable) a2.next(), i);
            }
            parcel.writeString(this.e.name());
            parcel.writeInt(this.f);
            parcel.writeInt(this.g);
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public SelectedPlaylist(java.util.UUID r2, com.vk.dto.music.Playlist r3, java.util.List r4, com.vk.newsfeed.posting.music_picker.presentation.view.MusicPickerLoadingState r5, int r6, int r7, int r8, xsna.zcl r9) {
            /*
                r1 = this;
                r9 = r8 & 1
                if (r9 == 0) goto L8
                java.util.UUID r2 = java.util.UUID.randomUUID()
            L8:
                r9 = r8 & 4
                if (r9 == 0) goto Le
                kotlin.collections.EmptyList r4 = kotlin.collections.EmptyList.b
            Le:
                r9 = r8 & 8
                if (r9 == 0) goto L14
                com.vk.newsfeed.posting.music_picker.presentation.view.MusicPickerLoadingState r5 = com.vk.newsfeed.posting.music_picker.presentation.view.MusicPickerLoadingState.None
            L14:
                r9 = r8 & 16
                r0 = 0
                if (r9 == 0) goto L1a
                r6 = r0
            L1a:
                r8 = r8 & 32
                if (r8 == 0) goto L26
                r9 = r0
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
                goto L2d
            L26:
                r9 = r7
                r8 = r6
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
            L2d:
                r3.<init>(r4, r5, r6, r7, r8, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.vk.newsfeed.posting.music_picker.domain.model.MusicPickerList.SelectedPlaylist.<init>(java.util.UUID, com.vk.dto.music.Playlist, java.util.List, com.vk.newsfeed.posting.music_picker.presentation.view.MusicPickerLoadingState, int, int, int, xsna.zcl):void");
        }
    }
}
