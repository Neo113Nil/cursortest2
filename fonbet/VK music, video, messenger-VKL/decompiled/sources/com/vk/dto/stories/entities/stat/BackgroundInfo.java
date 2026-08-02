package com.vk.dto.stories.entities.stat;

import com.vk.core.serialize.Serializer;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.epx;
import xsna.uqi;
import xsna.zcl;

/* compiled from: BackgroundInfo.kt */
/* loaded from: classes18.dex */
public final class BackgroundInfo extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<BackgroundInfo> CREATOR = new b();
    public final String b;
    public final StoryBackgroundType c;
    public final Integer d;

    /* compiled from: BackgroundInfo.kt */
    public static final class a {
        public static BackgroundInfo a() {
            return new BackgroundInfo(SignalingProtocol.KEY_CAMERA, StoryBackgroundType.BLUR, null, 4, null);
        }

        public static BackgroundInfo b() {
            return new BackgroundInfo("blur", StoryBackgroundType.BLUR, null, 4, null);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<BackgroundInfo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final BackgroundInfo a(Serializer serializer) {
            return new BackgroundInfo(serializer.H(), (StoryBackgroundType) serializer.C(), serializer.v());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BackgroundInfo[i];
        }
    }

    public /* synthetic */ BackgroundInfo(String str, StoryBackgroundType storyBackgroundType, Integer num, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : storyBackgroundType, (i & 4) != 0 ? null : num);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.g0(this.c);
        serializer.V(this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BackgroundInfo)) {
            return false;
        }
        BackgroundInfo backgroundInfo = (BackgroundInfo) obj;
        return epx.f(this.b, backgroundInfo.b) && this.c == backgroundInfo.c && epx.f(this.d, backgroundInfo.d);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        StoryBackgroundType storyBackgroundType = this.c;
        int hashCode2 = (hashCode + (storyBackgroundType == null ? 0 : storyBackgroundType.hashCode())) * 31;
        Integer num = this.d;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackgroundInfo(backgroundStatType=");
        sb.append(this.b);
        sb.append(", backgroundEditorType=");
        sb.append(this.c);
        sb.append(", backgroundId=");
        return uqi.b(sb, this.d, ')');
    }

    public BackgroundInfo(String str, StoryBackgroundType storyBackgroundType, Integer num) {
        this.b = str;
        this.c = storyBackgroundType;
        this.d = num;
    }
}
