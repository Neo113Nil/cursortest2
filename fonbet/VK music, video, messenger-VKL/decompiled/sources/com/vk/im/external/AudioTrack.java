package com.vk.im.external;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attaches.AttachAudio;
import com.vk.dto.music.MusicTrack;
import io.reactivex.rxjava3.subjects.b;
import xsna.epx;
import xsna.ho8;
import xsna.qoy;
import xsna.zcl;

/* compiled from: AudioTrack.kt */
/* loaded from: classes2.dex */
public final class AudioTrack extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<AudioTrack> CREATOR = new a();
    public final MusicTrack b;
    public boolean c;
    public boolean d;
    public float e;
    public float f;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<AudioTrack> {
        @Override // com.vk.core.serialize.Serializer.c
        public final AudioTrack a(Serializer serializer) {
            return new AudioTrack(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AudioTrack[i];
        }
    }

    public AudioTrack(AttachAudio attachAudio) {
        this(attachAudio.b, false, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 30, null);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.b);
        serializer.L(this.c ? (byte) 1 : (byte) 0);
        serializer.L(this.d ? (byte) 1 : (byte) 0);
        serializer.P(this.e);
        serializer.P(this.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioTrack)) {
            return false;
        }
        AudioTrack audioTrack = (AudioTrack) obj;
        return epx.f(this.b, audioTrack.b) && this.c == audioTrack.c && this.d == audioTrack.d && Float.compare(this.e, audioTrack.e) == 0 && Float.compare(this.f, audioTrack.f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + b.a(this.e, qoy.b(qoy.b(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioTrack(vkId=");
        MusicTrack musicTrack = this.b;
        sb.append(musicTrack.b);
        sb.append(", ownerId=");
        sb.append(musicTrack.c);
        sb.append(", artist='");
        String str = musicTrack.h;
        if (str == null) {
            str = "";
        }
        sb.append(str);
        sb.append("', title='");
        String str2 = musicTrack.d;
        if (str2 == null) {
            str2 = "";
        }
        sb.append(str2);
        sb.append("', duration=");
        sb.append(musicTrack.f);
        sb.append(", remoteFileUri='");
        String str3 = musicTrack.i;
        if (str3 == null) {
            str3 = "";
        }
        sb.append(str3);
        sb.append("', accessKey='");
        String str4 = musicTrack.r;
        sb.append(str4 != null ? str4 : "");
        sb.append("', isLoading=");
        sb.append(this.c);
        sb.append(", loadProgress=");
        sb.append(this.e);
        sb.append(", isPlaying=");
        sb.append(this.d);
        sb.append(", playProgress=");
        sb.append(this.f);
        sb.append(", contentRestriction=");
        int i = musicTrack.g;
        return ho8.a(sb, i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 5 ? i != 6 ? i != 8 ? i != 11 ? i != 24 ? GrsBaseInfo.CountryCodeSource.UNKNOWN : "RESTRICTION_KIDS_SUBSCRIPTION_NOT_PAID" : "RESTRICTION_DONUT" : "RESTRICTION_SUBSCRIPTION_NOT_PAID" : "RESTRICTION_LOCATION_CURRENT" : "RESTRICTION_TIME" : "RESTRICTION_EXCLUSIVE" : "RESTRICTION_LOCATION" : "RESTRICTION_WITHDRAWN" : "NONE", ')');
    }

    public /* synthetic */ AudioTrack(MusicTrack musicTrack, boolean z, boolean z2, float f, float f2, int i, zcl zclVar) {
        this(musicTrack, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? 0.0f : f, (i & 16) != 0 ? 0.0f : f2);
    }

    public AudioTrack(MusicTrack musicTrack, boolean z, boolean z2, float f, float f2) {
        this.b = musicTrack;
        this.c = z;
        this.d = z2;
        this.e = f;
        this.f = f2;
    }

    public AudioTrack(AudioTrack audioTrack) {
        this(audioTrack.b, false, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 30, null);
    }

    public AudioTrack(Serializer serializer) {
        this((MusicTrack) serializer.G(MusicTrack.class.getClassLoader()), serializer.m(), serializer.m(), serializer.s(), serializer.s());
    }
}
