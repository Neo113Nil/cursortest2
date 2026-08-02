package com.vk.storycamera.builder;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.ClipStatStoryData;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.StoryMusicInfo;
import com.vk.dto.photo.Photo;
import com.vk.dto.stickers.ShareVmojiStoryParams;
import com.vk.dto.stories.entities.StoryCameraMode;
import com.vk.dto.stories.entities.StoryCameraTarget;
import com.vk.dto.stories.entities.StoryLocalPhotoSticker;
import com.vk.dto.stories.entities.StorySharingInfo;
import com.vk.dto.stories.entities.stat.StoryBackgroundType;
import com.vk.dto.stories.model.StoryAnswer;
import com.vk.dto.stories.model.StoryEntryExtended;
import com.vk.dto.stories.model.StoryQuestion;
import com.vk.stories.StoryPostInfo;
import com.vk.storycamera.entity.attach.StoryEditorPhotoAlbumAttachment;
import com.vk.storycamera.entity.attach.StoryEditorPollAttach;
import com.vk.superapp.api.dto.story.WebStoryBox;
import com.vkontakte.android.attachments.ChannelMessageAttachment;
import defpackage.q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.bh10;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.fkq0;
import xsna.ho8;
import xsna.nr;
import xsna.qoy;
import xsna.sn;
import xsna.urd0;
import xsna.zcl;

/* compiled from: StoryEditorCameraParams.kt */
/* loaded from: classes6.dex */
public final class StoryEditorCameraParams implements Parcelable {
    public static final Parcelable.Creator<StoryEditorCameraParams> CREATOR = new a();
    public final String b;
    public final String c;
    public final StoryEntryExtended d;
    public final WebStoryBox e;
    public final StorySharingInfo f;
    public final StoryCameraTarget g;
    public final long h;
    public final Integer i;
    public final ClipStatStoryData j;
    public final State k;
    public final Attaches l;
    public final PublishInfo m;

    /* compiled from: StoryEditorCameraParams.kt */
    public static final class Attaches implements Parcelable {
        public static final Parcelable.Creator<Attaches> CREATOR = new a();
        public final StoryPostInfo b;
        public final StoryEditorPollAttach c;
        public final Photo d;
        public final StoryLocalPhotoSticker e;
        public final StoryMusicInfo f;
        public final MusicTrack g;
        public final ShareVmojiStoryParams h;
        public final Playlist i;
        public final VideoFile j;
        public final List<StoryAnswer> k;
        public final StoryQuestion l;
        public final ChannelMessageAttachment m;
        public final StoryEditorPhotoAlbumAttachment n;

        /* compiled from: StoryEditorCameraParams.kt */
        public static final class a implements Parcelable.Creator<Attaches> {
            @Override // android.os.Parcelable.Creator
            public final Attaches createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                StoryPostInfo storyPostInfo = (StoryPostInfo) parcel.readParcelable(Attaches.class.getClassLoader());
                StoryEditorPollAttach createFromParcel = parcel.readInt() == 0 ? null : StoryEditorPollAttach.CREATOR.createFromParcel(parcel);
                Photo photo = (Photo) parcel.readParcelable(Attaches.class.getClassLoader());
                StoryLocalPhotoSticker storyLocalPhotoSticker = (StoryLocalPhotoSticker) parcel.readParcelable(Attaches.class.getClassLoader());
                StoryMusicInfo storyMusicInfo = (StoryMusicInfo) parcel.readParcelable(Attaches.class.getClassLoader());
                MusicTrack musicTrack = (MusicTrack) parcel.readParcelable(Attaches.class.getClassLoader());
                ShareVmojiStoryParams shareVmojiStoryParams = (ShareVmojiStoryParams) parcel.readParcelable(Attaches.class.getClassLoader());
                Playlist playlist = (Playlist) parcel.readParcelable(Attaches.class.getClassLoader());
                VideoFile videoFile = (VideoFile) parcel.readParcelable(Attaches.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    arrayList = new ArrayList(readInt);
                    int i = 0;
                    while (i != readInt) {
                        i = bo.b(Attaches.class, parcel, arrayList, i, 1);
                    }
                }
                return new Attaches(storyPostInfo, createFromParcel, photo, storyLocalPhotoSticker, storyMusicInfo, musicTrack, shareVmojiStoryParams, playlist, videoFile, arrayList, (StoryQuestion) parcel.readParcelable(Attaches.class.getClassLoader()), (ChannelMessageAttachment) parcel.readParcelable(Attaches.class.getClassLoader()), parcel.readInt() != 0 ? StoryEditorPhotoAlbumAttachment.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final Attaches[] newArray(int i) {
                return new Attaches[i];
            }
        }

        public Attaches() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Attaches)) {
                return false;
            }
            Attaches attaches = (Attaches) obj;
            return epx.f(this.b, attaches.b) && epx.f(this.c, attaches.c) && epx.f(this.d, attaches.d) && epx.f(this.e, attaches.e) && epx.f(this.f, attaches.f) && epx.f(this.g, attaches.g) && epx.f(this.h, attaches.h) && epx.f(this.i, attaches.i) && epx.f(this.j, attaches.j) && epx.f(this.k, attaches.k) && epx.f(this.l, attaches.l) && epx.f(this.m, attaches.m) && epx.f(this.n, attaches.n);
        }

        public final int hashCode() {
            StoryPostInfo storyPostInfo = this.b;
            int hashCode = (storyPostInfo == null ? 0 : storyPostInfo.b.hashCode()) * 31;
            StoryEditorPollAttach storyEditorPollAttach = this.c;
            int hashCode2 = (hashCode + (storyEditorPollAttach == null ? 0 : storyEditorPollAttach.hashCode())) * 31;
            Photo photo = this.d;
            int hashCode3 = (hashCode2 + (photo == null ? 0 : photo.hashCode())) * 31;
            StoryLocalPhotoSticker storyLocalPhotoSticker = this.e;
            int hashCode4 = (hashCode3 + (storyLocalPhotoSticker == null ? 0 : storyLocalPhotoSticker.hashCode())) * 31;
            StoryMusicInfo storyMusicInfo = this.f;
            int hashCode5 = (hashCode4 + (storyMusicInfo == null ? 0 : storyMusicInfo.hashCode())) * 31;
            MusicTrack musicTrack = this.g;
            int hashCode6 = (hashCode5 + (musicTrack == null ? 0 : musicTrack.hashCode())) * 31;
            ShareVmojiStoryParams shareVmojiStoryParams = this.h;
            int hashCode7 = (hashCode6 + (shareVmojiStoryParams == null ? 0 : shareVmojiStoryParams.hashCode())) * 31;
            Playlist playlist = this.i;
            int hashCode8 = (hashCode7 + (playlist == null ? 0 : playlist.hashCode())) * 31;
            VideoFile videoFile = this.j;
            int hashCode9 = (hashCode8 + (videoFile == null ? 0 : videoFile.hashCode())) * 31;
            List<StoryAnswer> list = this.k;
            int hashCode10 = (hashCode9 + (list == null ? 0 : list.hashCode())) * 31;
            StoryQuestion storyQuestion = this.l;
            int hashCode11 = (hashCode10 + (storyQuestion == null ? 0 : storyQuestion.hashCode())) * 31;
            ChannelMessageAttachment channelMessageAttachment = this.m;
            int hashCode12 = (hashCode11 + (channelMessageAttachment == null ? 0 : channelMessageAttachment.hashCode())) * 31;
            StoryEditorPhotoAlbumAttachment storyEditorPhotoAlbumAttachment = this.n;
            return hashCode12 + (storyEditorPhotoAlbumAttachment != null ? storyEditorPhotoAlbumAttachment.hashCode() : 0);
        }

        public final String toString() {
            return "Attaches(postInfo=" + this.b + ", poll=" + this.c + ", photoSticker=" + this.d + ", localPhotoSticker=" + this.e + ", musicInfo=" + this.f + ", musicSharingData=" + this.g + ", vmojiParams=" + this.h + ", playlistSharingData=" + this.i + ", shareVideo=" + this.j + ", answers=" + this.k + ", question=" + this.l + ", channelPostInfo=" + this.m + ", album=" + this.n + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.b, i);
            StoryEditorPollAttach storyEditorPollAttach = this.c;
            if (storyEditorPollAttach == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                Serializer.StreamParcelable.a.a(storyEditorPollAttach, parcel);
            }
            parcel.writeParcelable(this.d, i);
            parcel.writeParcelable(this.e, i);
            parcel.writeParcelable(this.f, i);
            parcel.writeParcelable(this.g, i);
            parcel.writeParcelable(this.h, i);
            parcel.writeParcelable(this.i, i);
            parcel.writeParcelable(this.j, i);
            List<StoryAnswer> list = this.k;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator f = dn.f(parcel, list, 1);
                while (f.hasNext()) {
                    parcel.writeParcelable((Parcelable) f.next(), i);
                }
            }
            parcel.writeParcelable(this.l, i);
            parcel.writeParcelable(this.m, i);
            StoryEditorPhotoAlbumAttachment storyEditorPhotoAlbumAttachment = this.n;
            if (storyEditorPhotoAlbumAttachment == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                Serializer.StreamParcelable.a.a(storyEditorPhotoAlbumAttachment, parcel);
            }
        }

        public Attaches(StoryPostInfo storyPostInfo, StoryEditorPollAttach storyEditorPollAttach, Photo photo, StoryLocalPhotoSticker storyLocalPhotoSticker, StoryMusicInfo storyMusicInfo, MusicTrack musicTrack, ShareVmojiStoryParams shareVmojiStoryParams, Playlist playlist, VideoFile videoFile, List<StoryAnswer> list, StoryQuestion storyQuestion, ChannelMessageAttachment channelMessageAttachment, StoryEditorPhotoAlbumAttachment storyEditorPhotoAlbumAttachment) {
            this.b = storyPostInfo;
            this.c = storyEditorPollAttach;
            this.d = photo;
            this.e = storyLocalPhotoSticker;
            this.f = storyMusicInfo;
            this.g = musicTrack;
            this.h = shareVmojiStoryParams;
            this.i = playlist;
            this.j = videoFile;
            this.k = list;
            this.l = storyQuestion;
            this.m = channelMessageAttachment;
            this.n = storyEditorPhotoAlbumAttachment;
        }

        public /* synthetic */ Attaches(StoryPostInfo storyPostInfo, StoryEditorPollAttach storyEditorPollAttach, Photo photo, StoryLocalPhotoSticker storyLocalPhotoSticker, StoryMusicInfo storyMusicInfo, MusicTrack musicTrack, ShareVmojiStoryParams shareVmojiStoryParams, Playlist playlist, VideoFile videoFile, List list, StoryQuestion storyQuestion, ChannelMessageAttachment channelMessageAttachment, StoryEditorPhotoAlbumAttachment storyEditorPhotoAlbumAttachment, int i, zcl zclVar) {
            this((i & 1) != 0 ? null : storyPostInfo, (i & 2) != 0 ? null : storyEditorPollAttach, (i & 4) != 0 ? null : photo, (i & 8) != 0 ? null : storyLocalPhotoSticker, (i & 16) != 0 ? null : storyMusicInfo, (i & 32) != 0 ? null : musicTrack, (i & 64) != 0 ? null : shareVmojiStoryParams, (i & 128) != 0 ? null : playlist, (i & 256) != 0 ? null : videoFile, (i & 512) != 0 ? null : list, (i & 1024) != 0 ? null : storyQuestion, (i & 2048) != 0 ? null : channelMessageAttachment, (i & 4096) != 0 ? null : storyEditorPhotoAlbumAttachment);
        }
    }

    /* compiled from: StoryEditorCameraParams.kt */
    public static final class ButtonsConfig implements Parcelable {
        public static final Parcelable.Creator<ButtonsConfig> CREATOR = new a();
        public final boolean b;
        public final boolean c;
        public final boolean d;
        public final boolean e;
        public final boolean f;
        public final boolean g;
        public final boolean h;
        public final boolean i;
        public final boolean j;
        public final Boolean k;
        public final Boolean l;
        public final boolean m;

        /* compiled from: StoryEditorCameraParams.kt */
        public static final class a implements Parcelable.Creator<ButtonsConfig> {
            @Override // android.os.Parcelable.Creator
            public final ButtonsConfig createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                boolean z3;
                boolean z4;
                boolean z5;
                boolean z6;
                boolean z7;
                boolean z8;
                Boolean valueOf;
                boolean z9;
                Boolean bool;
                boolean z10 = false;
                boolean z11 = true;
                boolean z12 = parcel.readInt() != 0;
                if (parcel.readInt() != 0) {
                    z = false;
                    z10 = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = true;
                    z11 = z;
                }
                if (parcel.readInt() != 0) {
                    z3 = z;
                    z = z2;
                } else {
                    z3 = z;
                }
                if (parcel.readInt() != 0) {
                    z4 = z2;
                } else {
                    z4 = z2;
                    z2 = z3;
                }
                if (parcel.readInt() != 0) {
                    z5 = z3;
                    z3 = z4;
                } else {
                    z5 = z3;
                }
                if (parcel.readInt() != 0) {
                    z6 = z4;
                } else {
                    z6 = z4;
                    z4 = z5;
                }
                if (parcel.readInt() != 0) {
                    z7 = z5;
                    z5 = z6;
                } else {
                    z7 = z5;
                }
                if (parcel.readInt() != 0) {
                    z8 = z6;
                } else {
                    z8 = z6;
                    z6 = z7;
                }
                Boolean bool2 = null;
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0 ? z8 : z7);
                }
                if (parcel.readInt() != 0) {
                    bool2 = Boolean.valueOf(parcel.readInt() != 0 ? z8 : z7);
                }
                if (parcel.readInt() != 0) {
                    bool = valueOf;
                    z9 = z8;
                } else {
                    Boolean bool3 = valueOf;
                    z9 = z7;
                    bool = bool3;
                }
                return new ButtonsConfig(z12, z10, z11, z, z2, z3, z4, z5, z6, bool, bool2, z9);
            }

            @Override // android.os.Parcelable.Creator
            public final ButtonsConfig[] newArray(int i) {
                return new ButtonsConfig[i];
            }
        }

        public ButtonsConfig() {
            this(false, false, false, false, false, false, false, false, false, null, null, false, 4095, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ButtonsConfig)) {
                return false;
            }
            ButtonsConfig buttonsConfig = (ButtonsConfig) obj;
            return this.b == buttonsConfig.b && this.c == buttonsConfig.c && this.d == buttonsConfig.d && this.e == buttonsConfig.e && this.f == buttonsConfig.f && this.g == buttonsConfig.g && this.h == buttonsConfig.h && this.i == buttonsConfig.i && this.j == buttonsConfig.j && epx.f(this.k, buttonsConfig.k) && epx.f(this.l, buttonsConfig.l) && this.m == buttonsConfig.m;
        }

        public final int hashCode() {
            int b = qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(Boolean.hashCode(this.b) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
            Boolean bool = this.k;
            int hashCode = (b + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.l;
            return Boolean.hashCode(this.m) + ((hashCode + (bool2 != null ? bool2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ButtonsConfig(isOpenCameraAvailable=");
            sb.append(this.b);
            sb.append(", isTextStickerAvailable=");
            sb.append(this.c);
            sb.append(", isStickersSelectionAvailable=");
            sb.append(this.d);
            sb.append(", isBackgroundChangeAvailable=");
            sb.append(this.e);
            sb.append(", isMusicAvailable=");
            sb.append(this.f);
            sb.append(", isDrawingAvailable=");
            sb.append(this.g);
            sb.append(", isAddFrameAvailable=");
            sb.append(this.h);
            sb.append(", isSaveToDeviceAvailable=");
            sb.append(this.i);
            sb.append(", isAdMarkAvailable=");
            sb.append(this.j);
            sb.append(", isReceiversSelectionAvailable=");
            sb.append(this.k);
            sb.append(", isPrivacyChangeAvailable=");
            sb.append(this.l);
            sb.append(", isPublishAvailable=");
            return q0.a(sb, this.m, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.b ? 1 : 0);
            parcel.writeInt(this.c ? 1 : 0);
            parcel.writeInt(this.d ? 1 : 0);
            parcel.writeInt(this.e ? 1 : 0);
            parcel.writeInt(this.f ? 1 : 0);
            parcel.writeInt(this.g ? 1 : 0);
            parcel.writeInt(this.h ? 1 : 0);
            parcel.writeInt(this.i ? 1 : 0);
            parcel.writeInt(this.j ? 1 : 0);
            Boolean bool = this.k;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool);
            }
            Boolean bool2 = this.l;
            if (bool2 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool2);
            }
            parcel.writeInt(this.m ? 1 : 0);
        }

        public ButtonsConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, Boolean bool, Boolean bool2, boolean z10) {
            this.b = z;
            this.c = z2;
            this.d = z3;
            this.e = z4;
            this.f = z5;
            this.g = z6;
            this.h = z7;
            this.i = z8;
            this.j = z9;
            this.k = bool;
            this.l = bool2;
            this.m = z10;
        }

        public /* synthetic */ ButtonsConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, Boolean bool, Boolean bool2, boolean z10, int i, zcl zclVar) {
            this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? true : z3, (i & 8) != 0 ? true : z4, (i & 16) != 0 ? true : z5, (i & 32) != 0 ? true : z6, (i & 64) != 0 ? true : z7, (i & 128) != 0 ? true : z8, (i & 256) != 0 ? true : z9, (i & 512) != 0 ? null : bool, (i & 1024) == 0 ? bool2 : null, (i & 2048) != 0 ? true : z10);
        }
    }

    /* compiled from: StoryEditorCameraParams.kt */
    public static final class PublishInfo implements Parcelable {
        public static final Parcelable.Creator<PublishInfo> CREATOR = new a();
        public final UserId b;
        public final String c;
        public final String d;
        public final Integer e;
        public final String f;
        public final String g;

        /* compiled from: StoryEditorCameraParams.kt */
        public static final class a implements Parcelable.Creator<PublishInfo> {
            @Override // android.os.Parcelable.Creator
            public final PublishInfo createFromParcel(Parcel parcel) {
                return new PublishInfo((UserId) parcel.readParcelable(PublishInfo.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final PublishInfo[] newArray(int i) {
                return new PublishInfo[i];
            }
        }

        public PublishInfo() {
            this(null, null, null, null, null, null, 63, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PublishInfo)) {
                return false;
            }
            PublishInfo publishInfo = (PublishInfo) obj;
            return epx.f(this.b, publishInfo.b) && epx.f(this.c, publishInfo.c) && epx.f(this.d, publishInfo.d) && epx.f(this.e, publishInfo.e) && epx.f(this.f, publishInfo.f) && epx.f(this.g, publishInfo.g);
        }

        public final int hashCode() {
            int hashCode = Long.hashCode(this.b.b) * 31;
            String str = this.c;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.d;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num = this.e;
            int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
            String str3 = this.f;
            int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.g;
            return hashCode5 + (str4 != null ? str4.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PublishInfo(publishFromId=");
            sb.append(this.b);
            sb.append(", publishFromName=");
            sb.append(this.c);
            sb.append(", publishFromPhoto=");
            sb.append(this.d);
            sb.append(", lifetime=");
            sb.append(this.e);
            sb.append(", memoryDate=");
            sb.append(this.f);
            sb.append(", memoryType=");
            return ho8.a(sb, this.g, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.b, i);
            parcel.writeString(this.c);
            parcel.writeString(this.d);
            Integer num = this.e;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num);
            }
            parcel.writeString(this.f);
            parcel.writeString(this.g);
        }

        public PublishInfo(UserId userId, String str, String str2, Integer num, String str3, String str4) {
            this.b = userId;
            this.c = str;
            this.d = str2;
            this.e = num;
            this.f = str3;
            this.g = str4;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ PublishInfo(com.vk.dto.common.id.UserId r2, java.lang.String r3, java.lang.String r4, java.lang.Integer r5, java.lang.String r6, java.lang.String r7, int r8, xsna.zcl r9) {
            /*
                r1 = this;
                r9 = r8 & 1
                if (r9 == 0) goto L6
                com.vk.dto.common.id.UserId r2 = com.vk.dto.common.id.UserId.d
            L6:
                r9 = r8 & 2
                r0 = 0
                if (r9 == 0) goto Lc
                r3 = r0
            Lc:
                r9 = r8 & 4
                if (r9 == 0) goto L11
                r4 = r0
            L11:
                r9 = r8 & 8
                if (r9 == 0) goto L16
                r5 = r0
            L16:
                r9 = r8 & 16
                if (r9 == 0) goto L1b
                r6 = r0
            L1b:
                r8 = r8 & 32
                if (r8 == 0) goto L27
                r9 = r0
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
                goto L2e
            L27:
                r9 = r7
                r8 = r6
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
            L2e:
                r3.<init>(r4, r5, r6, r7, r8, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.vk.storycamera.builder.StoryEditorCameraParams.PublishInfo.<init>(com.vk.dto.common.id.UserId, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, int, xsna.zcl):void");
        }
    }

    /* compiled from: StoryEditorCameraParams.kt */
    public static final class State implements Parcelable {
        public static final Parcelable.Creator<State> CREATOR = new a();
        public final StoryCameraMode b;
        public final StoryBackgroundType c;
        public final boolean d;
        public final boolean e;
        public final boolean f;
        public final boolean g;
        public final ButtonsConfig h;
        public final boolean i;
        public final boolean j;

        /* compiled from: StoryEditorCameraParams.kt */
        public static final class a implements Parcelable.Creator<State> {
            @Override // android.os.Parcelable.Creator
            public final State createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                boolean z3;
                boolean z4;
                ButtonsConfig buttonsConfig;
                boolean z5;
                StoryCameraMode valueOf = StoryCameraMode.valueOf(parcel.readString());
                StoryBackgroundType valueOf2 = parcel.readInt() == 0 ? null : StoryBackgroundType.valueOf(parcel.readString());
                boolean z6 = false;
                boolean z7 = true;
                boolean z8 = parcel.readInt() != 0;
                if (parcel.readInt() != 0) {
                    z = false;
                    z6 = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = true;
                    z7 = z;
                }
                if (parcel.readInt() != 0) {
                    z3 = z;
                    z = z2;
                } else {
                    z3 = z;
                }
                ButtonsConfig createFromParcel = ButtonsConfig.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() != 0) {
                    z4 = z3;
                    z3 = z2;
                } else {
                    z4 = z3;
                }
                if (parcel.readInt() != 0) {
                    z5 = z2;
                    buttonsConfig = createFromParcel;
                } else {
                    buttonsConfig = createFromParcel;
                    z5 = z4;
                }
                return new State(valueOf, valueOf2, z8, z6, z7, z, buttonsConfig, z3, z5);
            }

            @Override // android.os.Parcelable.Creator
            public final State[] newArray(int i) {
                return new State[i];
            }
        }

        public State() {
            this(null, null, false, false, false, false, null, false, false, ApiInvocationException.ErrorCodes.IDS_BLOCKED, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof State)) {
                return false;
            }
            State state = (State) obj;
            return this.b == state.b && this.c == state.c && this.d == state.d && this.e == state.e && this.f == state.f && this.g == state.g && epx.f(this.h, state.h) && this.i == state.i && this.j == state.j;
        }

        public final int hashCode() {
            int hashCode = this.b.hashCode() * 31;
            StoryBackgroundType storyBackgroundType = this.c;
            return Boolean.hashCode(this.j) + qoy.b((this.h.hashCode() + qoy.b(qoy.b(qoy.b(qoy.b((hashCode + (storyBackgroundType == null ? 0 : storyBackgroundType.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g)) * 31, 31, this.i);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("State(forcedState=");
            sb.append(this.b);
            sb.append(", backgroundType=");
            sb.append(this.c);
            sb.append(", isSaveToDeviceAfterPublish=");
            sb.append(this.d);
            sb.append(", onlyEditor=");
            sb.append(this.e);
            sb.append(", initWithEmptyContent=");
            sb.append(this.f);
            sb.append(", withTransitions=");
            sb.append(this.g);
            sb.append(", buttonsConfig=");
            sb.append(this.h);
            sb.append(", editFromStoryBox=");
            sb.append(this.i);
            sb.append(", isFromIdeas=");
            return q0.a(sb, this.j, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b.name());
            StoryBackgroundType storyBackgroundType = this.c;
            if (storyBackgroundType == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(storyBackgroundType.name());
            }
            parcel.writeInt(this.d ? 1 : 0);
            parcel.writeInt(this.e ? 1 : 0);
            parcel.writeInt(this.f ? 1 : 0);
            parcel.writeInt(this.g ? 1 : 0);
            this.h.writeToParcel(parcel, i);
            parcel.writeInt(this.i ? 1 : 0);
            parcel.writeInt(this.j ? 1 : 0);
        }

        public State(StoryCameraMode storyCameraMode, StoryBackgroundType storyBackgroundType, boolean z, boolean z2, boolean z3, boolean z4, ButtonsConfig buttonsConfig, boolean z5, boolean z6) {
            this.b = storyCameraMode;
            this.c = storyBackgroundType;
            this.d = z;
            this.e = z2;
            this.f = z3;
            this.g = z4;
            this.h = buttonsConfig;
            this.i = z5;
            this.j = z6;
        }

        public /* synthetic */ State(StoryCameraMode storyCameraMode, StoryBackgroundType storyBackgroundType, boolean z, boolean z2, boolean z3, boolean z4, ButtonsConfig buttonsConfig, boolean z5, boolean z6, int i, zcl zclVar) {
            this((i & 1) != 0 ? StoryCameraMode.STORY : storyCameraMode, (i & 2) != 0 ? null : storyBackgroundType, (i & 4) != 0 ? true : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? false : z3, (i & 32) != 0 ? false : z4, (i & 64) != 0 ? new ButtonsConfig(false, false, false, false, false, false, false, false, false, null, null, false, 4095, null) : buttonsConfig, (i & 128) != 0 ? false : z5, (i & 256) != 0 ? false : z6);
        }
    }

    /* compiled from: StoryEditorCameraParams.kt */
    public static final class a implements Parcelable.Creator<StoryEditorCameraParams> {
        @Override // android.os.Parcelable.Creator
        public final StoryEditorCameraParams createFromParcel(Parcel parcel) {
            return new StoryEditorCameraParams(parcel.readString(), parcel.readString(), (StoryEntryExtended) parcel.readParcelable(StoryEditorCameraParams.class.getClassLoader()), (WebStoryBox) parcel.readParcelable(StoryEditorCameraParams.class.getClassLoader()), (StorySharingInfo) parcel.readParcelable(StoryEditorCameraParams.class.getClassLoader()), StoryCameraTarget.valueOf(parcel.readString()), parcel.readLong(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (ClipStatStoryData) parcel.readParcelable(StoryEditorCameraParams.class.getClassLoader()), State.CREATOR.createFromParcel(parcel), Attaches.CREATOR.createFromParcel(parcel), PublishInfo.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final StoryEditorCameraParams[] newArray(int i) {
            return new StoryEditorCameraParams[i];
        }
    }

    /* compiled from: StoryEditorCameraParams.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StoryCameraTarget.values().length];
            try {
                iArr[StoryCameraTarget.PROFILE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StoryCameraTarget.GROUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StoryCameraTarget.IM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StoryCameraTarget.ME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public StoryEditorCameraParams() {
        this(null, null, null, null, null, null, 0L, null, null, null, null, null, 4095, null);
    }

    public final boolean d() {
        Boolean bool = this.k.h.l;
        return bool != null ? bool.booleanValue() : !e();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e() {
        Boolean bool = this.k.h.k;
        if (bool != null) {
            return !bool.booleanValue();
        }
        int i = b.$EnumSwitchMapping$0[this.g.ordinal()];
        if (i == 1) {
            return fkq0.c(this.m.b);
        }
        if (i != 2) {
            return (i == 3 || i == 4) && this.h != 0;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryEditorCameraParams)) {
            return false;
        }
        StoryEditorCameraParams storyEditorCameraParams = (StoryEditorCameraParams) obj;
        return epx.f(this.b, storyEditorCameraParams.b) && epx.f(this.c, storyEditorCameraParams.c) && epx.f(this.d, storyEditorCameraParams.d) && epx.f(this.e, storyEditorCameraParams.e) && epx.f(this.f, storyEditorCameraParams.f) && this.g == storyEditorCameraParams.g && this.h == storyEditorCameraParams.h && epx.f(this.i, storyEditorCameraParams.i) && epx.f(this.j, storyEditorCameraParams.j) && epx.f(this.k, storyEditorCameraParams.k) && epx.f(this.l, storyEditorCameraParams.l) && epx.f(this.m, storyEditorCameraParams.m);
    }

    public final int hashCode() {
        int a2 = urd0.a(this.b.hashCode() * 31, 31, this.c);
        StoryEntryExtended storyEntryExtended = this.d;
        int hashCode = (a2 + (storyEntryExtended == null ? 0 : storyEntryExtended.hashCode())) * 31;
        WebStoryBox webStoryBox = this.e;
        int hashCode2 = (hashCode + (webStoryBox == null ? 0 : webStoryBox.hashCode())) * 31;
        StorySharingInfo storySharingInfo = this.f;
        int a3 = bh10.a((this.g.hashCode() + ((hashCode2 + (storySharingInfo == null ? 0 : storySharingInfo.hashCode())) * 31)) * 31, 31, this.h);
        Integer num = this.i;
        int hashCode3 = (a3 + (num == null ? 0 : num.hashCode())) * 31;
        ClipStatStoryData clipStatStoryData = this.j;
        return this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + ((hashCode3 + (clipStatStoryData != null ? clipStatStoryData.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "StoryEditorCameraParams(ref=" + this.b + ", entryPoint=" + this.c + ", parentStory=" + this.d + ", storyBox=" + this.e + ", sharingInfo=" + this.f + ", cameraTarget=" + this.g + ", imDialogId=" + this.h + ", miniAppId=" + this.i + ", clipStat=" + this.j + ", state=" + this.k + ", attaches=" + this.l + ", publishInfo=" + this.m + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeParcelable(this.d, i);
        parcel.writeParcelable(this.e, i);
        parcel.writeParcelable(this.f, i);
        parcel.writeString(this.g.name());
        parcel.writeLong(this.h);
        Integer num = this.i;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeParcelable(this.j, i);
        this.k.writeToParcel(parcel, i);
        this.l.writeToParcel(parcel, i);
        this.m.writeToParcel(parcel, i);
    }

    public StoryEditorCameraParams(String str, String str2, StoryEntryExtended storyEntryExtended, WebStoryBox webStoryBox, StorySharingInfo storySharingInfo, StoryCameraTarget storyCameraTarget, long j, Integer num, ClipStatStoryData clipStatStoryData, State state, Attaches attaches, PublishInfo publishInfo) {
        this.b = str;
        this.c = str2;
        this.d = storyEntryExtended;
        this.e = webStoryBox;
        this.f = storySharingInfo;
        this.g = storyCameraTarget;
        this.h = j;
        this.i = num;
        this.j = clipStatStoryData;
        this.k = state;
        this.l = attaches;
        this.m = publishInfo;
    }

    public /* synthetic */ StoryEditorCameraParams(String str, String str2, StoryEntryExtended storyEntryExtended, WebStoryBox webStoryBox, StorySharingInfo storySharingInfo, StoryCameraTarget storyCameraTarget, long j, Integer num, ClipStatStoryData clipStatStoryData, State state, Attaches attaches, PublishInfo publishInfo, int i, zcl zclVar) {
        this((i & 1) != 0 ? "" : str, (i & 2) == 0 ? str2 : "", (i & 4) != 0 ? null : storyEntryExtended, (i & 8) != 0 ? null : webStoryBox, (i & 16) != 0 ? null : storySharingInfo, (i & 32) != 0 ? StoryCameraTarget.UNDEFINED : storyCameraTarget, (i & 64) != 0 ? 0L : j, (i & 128) != 0 ? null : num, (i & 256) == 0 ? clipStatStoryData : null, (i & 512) != 0 ? new State(null, null, false, false, false, false, null, false, false, ApiInvocationException.ErrorCodes.IDS_BLOCKED, null) : state, (i & 1024) != 0 ? new Attaches(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null) : attaches, (i & 2048) != 0 ? new PublishInfo(null, null, null, null, null, null, 63, null) : publishInfo);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public StoryEditorCameraParams(StoryCameraParams storyCameraParams) {
        this(storyCameraParams.b, storyCameraParams.c, storyCameraParams.n, storyCameraParams.u, storyCameraParams.f, storyCameraParams.o, storyCameraParams.q, storyCameraParams.y, storyCameraParams.w, new State(storyCameraParams.d, storyCameraParams.H, storyCameraParams.T, storyCameraParams.j0, storyCameraParams.k0, storyCameraParams.p0, new ButtonsConfig(storyCameraParams.S, false, false, false, storyCameraParams.u0, false, storyCameraParams.Q, storyCameraParams.R, false, storyCameraParams.Z, storyCameraParams.a0, false, 2350, null), r19, storyCameraParams.W, 128, null), new Attaches(storyCameraParams.v, storyCameraParams.x, storyCameraParams.F, storyCameraParams.G, storyCameraParams.J, storyCameraParams.h0, storyCameraParams.m0, storyCameraParams.n0, storyCameraParams.o0, storyCameraParams.L, storyCameraParams.f0, storyCameraParams.D0, storyCameraParams.z0), new PublishInfo(storyCameraParams.g, storyCameraParams.h, storyCameraParams.i, storyCameraParams.q0, storyCameraParams.r0, storyCameraParams.s0));
        boolean z = false;
    }
}
