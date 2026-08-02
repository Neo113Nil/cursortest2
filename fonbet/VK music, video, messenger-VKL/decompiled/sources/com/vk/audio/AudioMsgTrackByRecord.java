package com.vk.audio;

import com.unity3d.services.UnityAdsConstants;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import ru.ok.android.webrtc.mediarecord.VideoRecord;
import xsna.bh10;
import xsna.epx;
import xsna.urd0;
import xsna.xq;
import xsna.zcl;

/* compiled from: AudioMsgTrackByRecord.kt */
/* loaded from: classes15.dex */
public final class AudioMsgTrackByRecord extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<AudioMsgTrackByRecord> CREATOR = new a();
    public final int b;
    public final int c;
    public final UserId d;
    public String e;
    public final String f;
    public int g;
    public byte[] h;
    public final boolean i;
    public final boolean j;
    public final float k;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<AudioMsgTrackByRecord> {
        @Override // com.vk.core.serialize.Serializer.c
        public final AudioMsgTrackByRecord a(Serializer serializer) {
            return new AudioMsgTrackByRecord(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AudioMsgTrackByRecord[i];
        }
    }

    public AudioMsgTrackByRecord(int i, int i2, UserId userId, int i3, String str, byte[] bArr) {
        this(i, i2, userId, i3, str, bArr, null, false, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, VideoRecord.DEFAULT_MAX_DIMENSION, null);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.S(this.c);
        serializer.e0(this.d);
        serializer.j0(this.e);
        serializer.M(this.h);
        serializer.j0(this.f);
        serializer.S(this.g);
        serializer.L(this.i ? (byte) 1 : (byte) 0);
        serializer.L(this.j ? (byte) 1 : (byte) 0);
        serializer.P(this.k);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioMsgTrackByRecord)) {
            return false;
        }
        AudioMsgTrackByRecord audioMsgTrackByRecord = (AudioMsgTrackByRecord) obj;
        return this.b == audioMsgTrackByRecord.b && this.c == audioMsgTrackByRecord.c && epx.f(this.d, audioMsgTrackByRecord.d) && epx.f(this.e, audioMsgTrackByRecord.e) && epx.f(this.f, audioMsgTrackByRecord.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + urd0.a(bh10.a(((this.b * 31) + this.c) * 31, 31, this.d.b), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioMsgTrack(localId=");
        sb.append(this.b);
        sb.append(", vkId=");
        sb.append(this.c);
        sb.append(", ownerId=");
        sb.append(this.d);
        sb.append(", localFileUri='");
        sb.append(this.e);
        sb.append("', remoteFileUri='");
        sb.append(this.f);
        sb.append("', duration=");
        sb.append(this.g);
        sb.append(", isLoading=");
        sb.append(this.i);
        sb.append(", isPlaying=");
        sb.append(this.j);
        sb.append(", playProgress=");
        return xq.c(')', this.k, sb);
    }

    public AudioMsgTrackByRecord() {
        this.d = UserId.d;
        this.e = "";
        this.f = "";
        this.h = new byte[0];
    }

    public /* synthetic */ AudioMsgTrackByRecord(int i, int i2, UserId userId, int i3, String str, byte[] bArr, String str2, boolean z, boolean z2, float f, int i4, zcl zclVar) {
        this(i, i2, userId, i3, str, bArr, (i4 & 64) != 0 ? "" : str2, (i4 & 128) != 0 ? false : z, (i4 & 256) != 0 ? false : z2, (i4 & 512) != 0 ? 0.0f : f);
    }

    public AudioMsgTrackByRecord(int i, int i2, UserId userId, int i3, String str, byte[] bArr, String str2, boolean z, boolean z2, float f) {
        UserId.b bVar = UserId.c;
        this.b = i;
        this.c = i2;
        this.d = userId;
        this.e = str;
        this.h = bArr;
        this.f = str2;
        this.g = i3;
        this.i = z;
        this.j = z2;
        this.k = f;
    }

    public AudioMsgTrackByRecord(Serializer serializer) {
        this.d = UserId.d;
        this.e = "";
        this.f = "";
        this.h = new byte[0];
        this.b = serializer.u();
        this.c = serializer.u();
        this.d = (UserId) serializer.A(UserId.class.getClassLoader());
        this.e = serializer.H();
        this.h = serializer.a();
        this.f = serializer.H();
        this.g = serializer.u();
        this.i = serializer.m();
        this.j = serializer.m();
        this.k = serializer.s();
    }
}
