package com.vk.libvideo.upload.impl;

import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.api.video.VideoSave;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.entities.OrdData;
import com.vk.libvideo.upload.api.VideoUpload;
import com.vk.upload.impl.tasks.VideoUploadTaskNew;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.bh10;
import xsna.bpn0;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.hvr0;
import xsna.qoy;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: VideoPersistedUpload.kt */
/* loaded from: classes3.dex */
public final class VideoPersistedUpload extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<VideoPersistedUpload> CREATOR = new a();
    public final String b;
    public final String c;
    public final String d;
    public final VideoSave.Target e;
    public final UserId f;
    public final String g;
    public final String h;
    public final boolean i;
    public final List<Integer> j;
    public final String k;
    public final String l;
    public final State m;
    public final OrdData n;
    public final List<VideoFile> o;
    public final int p;
    public final long q;
    public final String r;
    public final boolean s;
    public final Long t;
    public final boolean u;
    public final String v;
    public final transient VideoUploadTaskNew w;
    public final bpn0 x;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoPersistedUpload.kt */
    public static final class State {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State CANCELLED;
        public static final State CREATED;
        public static final State DONE;
        public static final State FAILED;

        static {
            State state = new State("CREATED", 0);
            CREATED = state;
            State state2 = new State(SignalingProtocol.HUNGUP_REASON_FAILED, 1);
            FAILED = state2;
            State state3 = new State("CANCELLED", 2);
            CANCELLED = state3;
            State state4 = new State("DONE", 3);
            DONE = state4;
            State[] stateArr = {state, state2, state3, state4};
            $VALUES = stateArr;
            $ENTRIES = new asp(stateArr);
        }

        public State() {
            throw null;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    /* compiled from: VideoPersistedUpload.kt */
    public static final class a extends Serializer.c<VideoPersistedUpload> {
        @Override // com.vk.core.serialize.Serializer.c
        public final VideoPersistedUpload a(Serializer serializer) {
            Serializer.c<VideoPersistedUpload> cVar = VideoPersistedUpload.CREATOR;
            return new VideoPersistedUpload(serializer.H(), serializer.H(), serializer.H(), VideoSave.Target.a(serializer.H()), (UserId) serializer.A(UserId.class.getClassLoader()), serializer.H(), serializer.I(), serializer.m(), serializer.D(), serializer.H(), serializer.H(), State.values()[serializer.u()], (OrdData) serializer.A(OrdData.class.getClassLoader()), serializer.B(VideoFile.class.getClassLoader()), serializer.u(), serializer.w(), null, serializer.m(), serializer.x(), serializer.m(), serializer.I(), 65536, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            VideoPersistedUpload[] videoPersistedUploadArr = new VideoPersistedUpload[i];
            for (int i2 = 0; i2 < i; i2++) {
                videoPersistedUploadArr[i2] = null;
            }
            return videoPersistedUploadArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VideoPersistedUpload(String str, String str2, String str3, VideoSave.Target target, UserId userId, String str4, String str5, boolean z, List<Integer> list, String str6, String str7, State state, OrdData ordData, List<? extends VideoFile> list2, int i, long j, String str8, boolean z2, Long l, boolean z3, String str9) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = target;
        this.f = userId;
        this.g = str4;
        this.h = str5;
        this.i = z;
        this.j = list;
        this.k = str6;
        this.l = str7;
        this.m = state;
        this.n = ordData;
        this.o = list2;
        this.p = i;
        this.q = j;
        this.r = str8;
        this.s = z2;
        this.t = l;
        this.u = z3;
        this.v = str9;
        this.w = new VideoUploadTaskNew(str, str2, str3, target, userId, str4, str5, z, list, str6, str7, ordData, list2, Integer.valueOf(i), j, str8, z2, false, z3, 131072);
        this.x = new bpn0(new hvr0(this, 8));
    }

    public static VideoPersistedUpload zb(VideoPersistedUpload videoPersistedUpload, State state) {
        return new VideoPersistedUpload(videoPersistedUpload.b, videoPersistedUpload.c, videoPersistedUpload.d, videoPersistedUpload.e, videoPersistedUpload.f, videoPersistedUpload.g, videoPersistedUpload.h, videoPersistedUpload.i, videoPersistedUpload.j, videoPersistedUpload.k, videoPersistedUpload.l, state, videoPersistedUpload.n, videoPersistedUpload.o, videoPersistedUpload.p, videoPersistedUpload.q, videoPersistedUpload.r, videoPersistedUpload.s, videoPersistedUpload.t, videoPersistedUpload.u, videoPersistedUpload.v);
    }

    public final State Ab() {
        return this.m;
    }

    public final VideoUploadTaskNew Bb() {
        return this.w;
    }

    public final VideoUpload Cb() {
        return (VideoUpload) this.x.getValue();
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e.h());
        serializer.e0(this.f);
        serializer.m0(this.h);
        serializer.L(this.i ? (byte) 1 : (byte) 0);
        serializer.U(this.j);
        serializer.j0(this.k);
        serializer.j0(this.l);
        serializer.S(this.m.ordinal());
        serializer.e0(this.n);
        serializer.f0(this.o);
        serializer.S(this.p);
        serializer.Y(this.q);
        serializer.L(this.s ? (byte) 1 : (byte) 0);
        serializer.b0(this.t);
        serializer.L(this.u ? (byte) 1 : (byte) 0);
        serializer.m0(this.v);
        serializer.j0(this.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoPersistedUpload)) {
            return false;
        }
        VideoPersistedUpload videoPersistedUpload = (VideoPersistedUpload) obj;
        return epx.f(this.b, videoPersistedUpload.b) && epx.f(this.c, videoPersistedUpload.c) && epx.f(this.d, videoPersistedUpload.d) && this.e == videoPersistedUpload.e && epx.f(this.f, videoPersistedUpload.f) && epx.f(this.g, videoPersistedUpload.g) && epx.f(this.h, videoPersistedUpload.h) && this.i == videoPersistedUpload.i && epx.f(this.j, videoPersistedUpload.j) && epx.f(this.k, videoPersistedUpload.k) && epx.f(this.l, videoPersistedUpload.l) && this.m == videoPersistedUpload.m && epx.f(this.n, videoPersistedUpload.n) && epx.f(this.o, videoPersistedUpload.o) && this.p == videoPersistedUpload.p && this.q == videoPersistedUpload.q && epx.f(this.r, videoPersistedUpload.r) && this.s == videoPersistedUpload.s && epx.f(this.t, videoPersistedUpload.t) && this.u == videoPersistedUpload.u && epx.f(this.v, videoPersistedUpload.v);
    }

    public final String getFileName() {
        return this.b;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int a2 = urd0.a(bh10.a((this.e.hashCode() + ((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31, 31, this.f.b), 31, this.g);
        String str3 = this.h;
        int hashCode3 = (this.m.hashCode() + urd0.a(urd0.a(fw3.a(qoy.b((a2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.i), 31, this.j), 31, this.k), 31, this.l)) * 31;
        OrdData ordData = this.n;
        int a3 = bh10.a(shy.a(this.p, fw3.a((hashCode3 + (ordData == null ? 0 : ordData.hashCode())) * 31, 31, this.o), 31), 31, this.q);
        String str4 = this.r;
        int b = qoy.b((a3 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.s);
        Long l = this.t;
        int b2 = qoy.b((b + (l == null ? 0 : l.hashCode())) * 31, 31, this.u);
        String str5 = this.v;
        return b2 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoPersistedUpload(fileName=");
        sb.append(this.b);
        sb.append(", name=");
        sb.append(this.c);
        sb.append(", description=");
        sb.append(this.d);
        sb.append(", target=");
        sb.append(this.e);
        sb.append(", ownerID=");
        sb.append(this.f);
        sb.append(", from=");
        sb.append(this.g);
        sb.append(", creationEntryPoint=");
        sb.append(this.h);
        sb.append(", showNotification=");
        sb.append(this.i);
        sb.append(", albumsIds=");
        sb.append(this.j);
        sb.append(", privacyView=");
        sb.append(this.k);
        sb.append(", privacyComment=");
        sb.append(this.l);
        sb.append(", state=");
        sb.append(this.m);
        sb.append(", ordInfo=");
        sb.append(this.n);
        sb.append(", attachedClips=");
        sb.append(this.o);
        sb.append(", donutLevelId=");
        sb.append(this.p);
        sb.append(", publicationDate=");
        sb.append(this.q);
        sb.append(", coverPath=");
        sb.append(this.r);
        sb.append(", isVideoUploadInProgressEnabled=");
        sb.append(this.s);
        sb.append(", durationMs=");
        sb.append(this.t);
        sb.append(", postToWall=");
        sb.append(this.u);
        sb.append(", ownerName=");
        return ho8.a(sb, this.v, ')');
    }

    public VideoPersistedUpload(String str, String str2, String str3, VideoSave.Target target, UserId userId, String str4, String str5, boolean z, List list, String str6, String str7, State state, OrdData ordData, List list2, int i, long j, String str8, boolean z2, Long l, boolean z3, String str9, int i2, zcl zclVar) {
        this(str, str2, str3, target, userId, str4, (i2 & 64) != 0 ? null : str5, (i2 & 128) != 0 ? false : z, (i2 & 256) != 0 ? EmptyList.b : list, (i2 & 512) != 0 ? "" : str6, (i2 & 1024) != 0 ? "" : str7, (i2 & 2048) != 0 ? State.CREATED : state, ordData, list2, (i2 & 16384) != 0 ? -1 : i, (32768 & i2) != 0 ? 0L : j, (65536 & i2) != 0 ? null : str8, (131072 & i2) != 0 ? false : z2, (262144 & i2) != 0 ? null : l, (524288 & i2) != 0 ? false : z3, (i2 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : str9);
    }
}
