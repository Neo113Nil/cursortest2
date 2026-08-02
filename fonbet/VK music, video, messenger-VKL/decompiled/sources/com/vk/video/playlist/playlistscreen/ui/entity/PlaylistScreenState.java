package com.vk.video.playlist.playlistscreen.ui.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.video.playlist.playlistscreen.domain.PlaylistButtonDo;
import com.vk.video.playlist.playlistscreen.domain.PlaylistDataDo;
import com.vk.video.playlist.playlistscreen.ui.entity.PlaylistScreenInfoDataState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bh10;
import xsna.bo;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.lm50;
import xsna.qoy;

/* compiled from: PlaylistScreenState.kt */
/* loaded from: classes6.dex */
public final class PlaylistScreenState implements lm50, Parcelable {
    public static final Parcelable.Creator<PlaylistScreenState> CREATOR = new a();
    public final int b;
    public final UserId c;
    public final PlaylistScreenInfoDataState d;
    public final String e;
    public final PlaylistScreenData f;
    public final NotificationsState g;
    public final boolean h;
    public final boolean i;
    public final List<PlaylistButtonDo> j;
    public final List<VideoFile> k;
    public final PlaylistDataDo l;

    /* compiled from: PlaylistScreenState.kt */
    public static final class a implements Parcelable.Creator<PlaylistScreenState> {
        @Override // android.os.Parcelable.Creator
        public final PlaylistScreenState createFromParcel(Parcel parcel) {
            PlaylistDataDo playlistDataDo;
            boolean z;
            UserId userId;
            PlaylistScreenData playlistScreenData;
            NotificationsState notificationsState;
            boolean z2;
            int readInt = parcel.readInt();
            UserId userId2 = (UserId) parcel.readParcelable(PlaylistScreenState.class.getClassLoader());
            PlaylistScreenInfoDataState playlistScreenInfoDataState = (PlaylistScreenInfoDataState) parcel.readParcelable(PlaylistScreenState.class.getClassLoader());
            String readString = parcel.readString();
            PlaylistScreenData createFromParcel = parcel.readInt() == 0 ? null : PlaylistScreenData.CREATOR.createFromParcel(parcel);
            NotificationsState valueOf = parcel.readInt() == 0 ? null : NotificationsState.valueOf(parcel.readString());
            if (parcel.readInt() != 0) {
                playlistDataDo = null;
                z = true;
            } else {
                playlistDataDo = null;
                z = false;
            }
            if (parcel.readInt() != 0) {
                userId = userId2;
                playlistScreenData = createFromParcel;
                notificationsState = valueOf;
                z2 = true;
            } else {
                userId = userId2;
                playlistScreenData = createFromParcel;
                notificationsState = valueOf;
                z2 = false;
            }
            int readInt2 = parcel.readInt();
            PlaylistDataDo playlistDataDo2 = playlistDataDo;
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = en.a(PlaylistButtonDo.CREATOR, parcel, arrayList, i, 1);
            }
            int readInt3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt3);
            int i2 = 0;
            while (i2 != readInt3) {
                i2 = bo.b(PlaylistScreenState.class, parcel, arrayList2, i2, 1);
            }
            if (parcel.readInt() != 0) {
                playlistDataDo2 = PlaylistDataDo.CREATOR.createFromParcel(parcel);
            }
            return new PlaylistScreenState(readInt, userId, playlistScreenInfoDataState, readString, playlistScreenData, notificationsState, z, z2, arrayList, arrayList2, playlistDataDo2);
        }

        @Override // android.os.Parcelable.Creator
        public final PlaylistScreenState[] newArray(int i) {
            return new PlaylistScreenState[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PlaylistScreenState(int i, UserId userId, PlaylistScreenInfoDataState playlistScreenInfoDataState, String str, PlaylistScreenData playlistScreenData, NotificationsState notificationsState, boolean z, boolean z2, List<PlaylistButtonDo> list, List<? extends VideoFile> list2, PlaylistDataDo playlistDataDo) {
        this.b = i;
        this.c = userId;
        this.d = playlistScreenInfoDataState;
        this.e = str;
        this.f = playlistScreenData;
        this.g = notificationsState;
        this.h = z;
        this.i = z2;
        this.j = list;
        this.k = list2;
        this.l = playlistDataDo;
    }

    public static PlaylistScreenState a(PlaylistScreenState playlistScreenState, PlaylistScreenInfoDataState playlistScreenInfoDataState, PlaylistScreenData playlistScreenData, boolean z, boolean z2, List list, List list2, PlaylistDataDo playlistDataDo, int i) {
        int i2 = playlistScreenState.b;
        UserId userId = playlistScreenState.c;
        if ((i & 4) != 0) {
            playlistScreenInfoDataState = playlistScreenState.d;
        }
        PlaylistScreenInfoDataState playlistScreenInfoDataState2 = playlistScreenInfoDataState;
        String str = playlistScreenState.e;
        if ((i & 16) != 0) {
            playlistScreenData = playlistScreenState.f;
        }
        PlaylistScreenData playlistScreenData2 = playlistScreenData;
        NotificationsState notificationsState = playlistScreenState.g;
        boolean z3 = (i & 64) != 0 ? playlistScreenState.h : z;
        boolean z4 = (i & 128) != 0 ? playlistScreenState.i : z2;
        List list3 = (i & 256) != 0 ? playlistScreenState.j : list;
        List list4 = (i & 512) != 0 ? playlistScreenState.k : list2;
        PlaylistDataDo playlistDataDo2 = (i & 1024) != 0 ? playlistScreenState.l : playlistDataDo;
        playlistScreenState.getClass();
        return new PlaylistScreenState(i2, userId, playlistScreenInfoDataState2, str, playlistScreenData2, notificationsState, z3, z4, list3, list4, playlistDataDo2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaylistScreenState)) {
            return false;
        }
        PlaylistScreenState playlistScreenState = (PlaylistScreenState) obj;
        return this.b == playlistScreenState.b && epx.f(this.c, playlistScreenState.c) && epx.f(this.d, playlistScreenState.d) && epx.f(this.e, playlistScreenState.e) && epx.f(this.f, playlistScreenState.f) && this.g == playlistScreenState.g && this.h == playlistScreenState.h && this.i == playlistScreenState.i && epx.f(this.j, playlistScreenState.j) && epx.f(this.k, playlistScreenState.k) && epx.f(this.l, playlistScreenState.l);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + bh10.a(Integer.hashCode(this.b) * 31, 31, this.c.b)) * 31;
        String str = this.e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        PlaylistScreenData playlistScreenData = this.f;
        int hashCode3 = (hashCode2 + (playlistScreenData == null ? 0 : playlistScreenData.hashCode())) * 31;
        NotificationsState notificationsState = this.g;
        int a2 = fw3.a(fw3.a(qoy.b(qoy.b((hashCode3 + (notificationsState == null ? 0 : notificationsState.hashCode())) * 31, 31, this.h), 31, this.i), 31, this.j), 31, this.k);
        PlaylistDataDo playlistDataDo = this.l;
        return a2 + (playlistDataDo != null ? playlistDataDo.hashCode() : 0);
    }

    public final PlaylistDataDo j() {
        PlaylistScreenInfoDataState playlistScreenInfoDataState = this.d;
        PlaylistScreenInfoDataState.Loaded loaded = playlistScreenInfoDataState instanceof PlaylistScreenInfoDataState.Loaded ? (PlaylistScreenInfoDataState.Loaded) playlistScreenInfoDataState : null;
        if (loaded != null) {
            return loaded.b;
        }
        return null;
    }

    public final String toString() {
        return "PlaylistScreenState(playlistId=" + this.b + ", ownerId=" + this.c + ", playlistInfoState=" + this.d + ", trackCode=" + this.e + ", sectionData=" + this.f + ", notificationsState=" + this.g + ", isUnsubscribeBottomSheetVisible=" + this.h + ", isRefreshing=" + this.i + ", buttons=" + this.j + ", videoFiles=" + this.k + ", catalogPlaylistInfoDo=" + this.l + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.d, i);
        parcel.writeString(this.e);
        PlaylistScreenData playlistScreenData = this.f;
        if (playlistScreenData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            playlistScreenData.writeToParcel(parcel, i);
        }
        NotificationsState notificationsState = this.g;
        if (notificationsState == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(notificationsState.name());
        }
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        Iterator a2 = ao.a(parcel, this.j);
        while (a2.hasNext()) {
            ((PlaylistButtonDo) a2.next()).writeToParcel(parcel, i);
        }
        Iterator a3 = ao.a(parcel, this.k);
        while (a3.hasNext()) {
            parcel.writeParcelable((Parcelable) a3.next(), i);
        }
        PlaylistDataDo playlistDataDo = this.l;
        if (playlistDataDo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            playlistDataDo.writeToParcel(parcel, i);
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public PlaylistScreenState(int r15, com.vk.dto.common.id.UserId r16, com.vk.video.playlist.playlistscreen.ui.entity.PlaylistScreenInfoDataState r17, java.lang.String r18, com.vk.video.playlist.playlistscreen.ui.entity.PlaylistScreenData r19, com.vk.video.playlist.playlistscreen.ui.entity.NotificationsState r20, boolean r21, boolean r22, java.util.List r23, java.util.List r24, com.vk.video.playlist.playlistscreen.domain.PlaylistDataDo r25, int r26, xsna.zcl r27) {
        /*
            r14 = this;
            r0 = r26
            r1 = r0 & 4
            if (r1 == 0) goto La
            com.vk.video.playlist.playlistscreen.ui.entity.PlaylistScreenInfoDataState$Loading r1 = com.vk.video.playlist.playlistscreen.ui.entity.PlaylistScreenInfoDataState.Loading.b
            r5 = r1
            goto Lc
        La:
            r5 = r17
        Lc:
            r1 = r0 & 8
            r2 = 0
            if (r1 == 0) goto L13
            r6 = r2
            goto L15
        L13:
            r6 = r18
        L15:
            r1 = r0 & 16
            if (r1 == 0) goto L1b
            r7 = r2
            goto L1d
        L1b:
            r7 = r19
        L1d:
            r1 = r0 & 32
            if (r1 == 0) goto L23
            r8 = r2
            goto L25
        L23:
            r8 = r20
        L25:
            r1 = r0 & 64
            r3 = 0
            if (r1 == 0) goto L2c
            r9 = r3
            goto L2e
        L2c:
            r9 = r21
        L2e:
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L34
            r10 = r3
            goto L36
        L34:
            r10 = r22
        L36:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L3e
            kotlin.collections.EmptyList r1 = kotlin.collections.EmptyList.b
            r11 = r1
            goto L40
        L3e:
            r11 = r23
        L40:
            r1 = r0 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto L48
            kotlin.collections.EmptyList r1 = kotlin.collections.EmptyList.b
            r12 = r1
            goto L4a
        L48:
            r12 = r24
        L4a:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L54
            r13 = r2
            r3 = r15
            r4 = r16
            r2 = r14
            goto L5a
        L54:
            r13 = r25
            r2 = r14
            r3 = r15
            r4 = r16
        L5a:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.video.playlist.playlistscreen.ui.entity.PlaylistScreenState.<init>(int, com.vk.dto.common.id.UserId, com.vk.video.playlist.playlistscreen.ui.entity.PlaylistScreenInfoDataState, java.lang.String, com.vk.video.playlist.playlistscreen.ui.entity.PlaylistScreenData, com.vk.video.playlist.playlistscreen.ui.entity.NotificationsState, boolean, boolean, java.util.List, java.util.List, com.vk.video.playlist.playlistscreen.domain.PlaylistDataDo, int, xsna.zcl):void");
    }
}
