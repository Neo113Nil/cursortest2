package com.vk.music.offline.api.model.moosic;

import android.content.Context;
import android.net.Uri;
import android.util.SparseArray;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.PlaylistPermissions;
import com.vk.dto.music.Thumb;
import defpackage.q0;
import java.io.File;
import java.util.List;
import xsna.asp;
import xsna.bh10;
import xsna.e43;
import xsna.epx;
import xsna.fw3;
import xsna.ozl;
import xsna.shy;
import xsna.urd0;
import xsna.zrp;

/* compiled from: VkMusicOldPlaylistEntity.kt */
/* loaded from: classes3.dex */
public final class VkMusicOldPlaylistEntity {
    public final int a;
    public final int b;
    public final String c;
    public final int d;
    public final long e;
    public final String f;
    public final String g;
    public final List<Integer> h;
    public final boolean i;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkMusicOldPlaylistEntity.kt */
    public static final class Flags {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Flags[] $VALUES;
        public static final Flags ADDED;
        public static final Flags CAN_PARSE_LINKS;
        public static final Flags CELEBRITY_PLAYLIST;
        public static final Flags DEFAULT;
        public static final Flags DELETED;
        public static final Flags DOWNLOADS;
        public static final Flags DOWNLOAD_IN_PROGRESS;

        @ozl
        public static final Flags ENHANCED;
        public static final Flags FAVORITE;
        public static final Flags LIKED;
        public static final Flags LOADING_COMPLETE;
        public static final Flags MIX_CAPABLE;
        public static final Flags OLD_BOOM;
        public static final Flags TRACKLIST_FIRST_BATCH_READY;
        public static final Flags TRACKLIST_OUTDATED;
        public static final Flags TRACKLIST_READY;

        static {
            Flags flags = new Flags("LIKED", 0);
            LIKED = flags;
            Flags flags2 = new Flags("TRACKLIST_READY", 1);
            TRACKLIST_READY = flags2;
            Flags flags3 = new Flags("TRACKLIST_FIRST_BATCH_READY", 2);
            TRACKLIST_FIRST_BATCH_READY = flags3;
            Flags flags4 = new Flags("TRACKLIST_OUTDATED", 3);
            TRACKLIST_OUTDATED = flags4;
            Flags flags5 = new Flags("DEFAULT", 4);
            DEFAULT = flags5;
            Flags flags6 = new Flags("DOWNLOADS", 5);
            DOWNLOADS = flags6;
            Flags flags7 = new Flags("FAVORITE", 6);
            FAVORITE = flags7;
            Flags flags8 = new Flags("DOWNLOAD_IN_PROGRESS", 7);
            DOWNLOAD_IN_PROGRESS = flags8;
            Flags flags9 = new Flags("LOADING_COMPLETE", 8);
            LOADING_COMPLETE = flags9;
            Flags flags10 = new Flags("OLD_BOOM", 9);
            OLD_BOOM = flags10;
            Flags flags11 = new Flags("DELETED", 10);
            DELETED = flags11;
            Flags flags12 = new Flags("MIX_CAPABLE", 11);
            MIX_CAPABLE = flags12;
            Flags flags13 = new Flags("ENHANCED", 12);
            ENHANCED = flags13;
            Flags flags14 = new Flags("CAN_PARSE_LINKS", 13);
            CAN_PARSE_LINKS = flags14;
            Flags flags15 = new Flags("CELEBRITY_PLAYLIST", 14);
            CELEBRITY_PLAYLIST = flags15;
            Flags flags16 = new Flags("ADDED", 15);
            ADDED = flags16;
            Flags[] flagsArr = {flags, flags2, flags3, flags4, flags5, flags6, flags7, flags8, flags9, flags10, flags11, flags12, flags13, flags14, flags15, flags16};
            $VALUES = flagsArr;
            $ENTRIES = new asp(flagsArr);
        }

        public Flags() {
            throw null;
        }

        public static Flags valueOf(String str) {
            return (Flags) Enum.valueOf(Flags.class, str);
        }

        public static Flags[] values() {
            return (Flags[]) $VALUES.clone();
        }
    }

    /* compiled from: VkMusicOldPlaylistEntity.kt */
    public static final class a {
        public static Playlist a(VkMusicOldPlaylistEntity vkMusicOldPlaylistEntity, UserId userId) {
            Thumb thumb;
            SparseArray sparseArray = new SparseArray();
            String str = vkMusicOldPlaylistEntity.g;
            if (str != null) {
                Context context = e43.a;
                sparseArray.append(200, Uri.fromFile(new File((context != null ? context : null).getFilesDir(), str)));
                thumb = new Thumb(String.valueOf(vkMusicOldPlaylistEntity.b), 200, 200, sparseArray);
            } else {
                thumb = null;
            }
            return new Playlist(vkMusicOldPlaylistEntity.b, userId, vkMusicOldPlaylistEntity.i ? 1 : 0, null, null, null, vkMusicOldPlaylistEntity.c, null, null, false, 0, thumb, null, null, null, null, null, null, true, 0, vkMusicOldPlaylistEntity.d, vkMusicOldPlaylistEntity.e / 1000, null, null, null, null, new PlaylistPermissions(true, false, false, false, false, true, false), false, false, false, null, null, DownloadingState.Downloaded.b, 0, false, null, null, false, null, 0, -70518856, 254, null);
        }
    }

    public VkMusicOldPlaylistEntity(int i, int i2, String str, int i3, long j, String str2, String str3, List<Integer> list, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = i3;
        this.e = j;
        this.f = str2;
        this.g = str3;
        this.h = list;
        this.i = z;
    }

    public final String a() {
        return this.f;
    }

    public final String b() {
        return this.g;
    }

    public final String c() {
        return this.c;
    }

    public final int d() {
        return this.b;
    }

    public final List<Integer> e() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkMusicOldPlaylistEntity)) {
            return false;
        }
        VkMusicOldPlaylistEntity vkMusicOldPlaylistEntity = (VkMusicOldPlaylistEntity) obj;
        return this.a == vkMusicOldPlaylistEntity.a && this.b == vkMusicOldPlaylistEntity.b && this.c.equals(vkMusicOldPlaylistEntity.c) && this.d == vkMusicOldPlaylistEntity.d && this.e == vkMusicOldPlaylistEntity.e && epx.f(this.f, vkMusicOldPlaylistEntity.f) && epx.f(this.g, vkMusicOldPlaylistEntity.g) && epx.f(this.h, vkMusicOldPlaylistEntity.h) && this.i == vkMusicOldPlaylistEntity.i;
    }

    public final boolean f() {
        return this.i;
    }

    public final int hashCode() {
        int a2 = bh10.a(shy.a(this.d, urd0.a(shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c), 31), 31, this.e);
        String str = this.f;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        return Boolean.hashCode(this.i) + fw3.a((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkMusicOldPlaylistEntity(id=");
        sb.append(this.a);
        sb.append(", serverId=");
        sb.append(this.b);
        sb.append(", name=");
        sb.append(this.c);
        sb.append(", tracksCount=");
        sb.append(this.d);
        sb.append(", updatedAt=");
        sb.append(this.e);
        sb.append(", coverId=");
        sb.append(this.f);
        sb.append(", coverPath=");
        sb.append(this.g);
        sb.append(", tracksIds=");
        sb.append(this.h);
        sb.append(", isAlbum=");
        return q0.a(sb, this.i, ')');
    }
}
