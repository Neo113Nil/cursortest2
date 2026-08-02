package com.vk.superapp.vkclient.js.bridge.api.events;

import com.ironsource.X3;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.bd6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AudioTrackChanged.kt */
/* loaded from: classes6.dex */
public final class AudioTrackChanged$Response implements bd6 {

    @pmi0("data")
    private final Data data;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("type")
    private final String type;

    public AudioTrackChanged$Response(String str, Data data, String str2) {
        this.type = str;
        this.data = data;
        this.requestId = str2;
    }

    @Override // xsna.bd6
    public final bd6 a(String str) {
        return new AudioTrackChanged$Response(this.type, this.data, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioTrackChanged$Response)) {
            return false;
        }
        AudioTrackChanged$Response audioTrackChanged$Response = (AudioTrackChanged$Response) obj;
        return epx.f(this.type, audioTrackChanged$Response.type) && epx.f(this.data, audioTrackChanged$Response.data) && epx.f(this.requestId, audioTrackChanged$Response.requestId);
    }

    public final int hashCode() {
        int hashCode = (this.data.hashCode() + (this.type.hashCode() * 31)) * 31;
        String str = this.requestId;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Response(type=");
        sb.append(this.type);
        sb.append(", data=");
        sb.append(this.data);
        sb.append(", requestId=");
        return ho8.a(sb, this.requestId, ')');
    }

    /* compiled from: AudioTrackChanged.kt */
    public static final class Data {

        @pmi0("audio_track")
        private final AudioTrack audioTrack;

        @pmi0(CommonUrlParts.REQUEST_ID)
        private final String requestId;

        /* compiled from: AudioTrackChanged.kt */
        public static final class AudioTrack {

            @pmi0("id")
            private final String id;

            @pmi0("type")
            private final String type;

            /* JADX WARN: Multi-variable type inference failed */
            public AudioTrack() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AudioTrack)) {
                    return false;
                }
                AudioTrack audioTrack = (AudioTrack) obj;
                return epx.f(this.type, audioTrack.type) && epx.f(this.id, audioTrack.id);
            }

            public final int hashCode() {
                String str = this.type;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.id;
                return hashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("AudioTrack(type=");
                sb.append(this.type);
                sb.append(", id=");
                return ho8.a(sb, this.id, ')');
            }

            public AudioTrack(String str, String str2) {
                this.type = str;
                this.id = str2;
            }

            public /* synthetic */ AudioTrack(String str, String str2, int i, zcl zclVar) {
                this((i & 1) != 0 ? X3.i.b : str, (i & 2) != 0 ? null : str2);
            }
        }

        public Data(AudioTrack audioTrack, String str) {
            this.audioTrack = audioTrack;
            this.requestId = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return epx.f(this.audioTrack, data.audioTrack) && epx.f(this.requestId, data.requestId);
        }

        public final int hashCode() {
            AudioTrack audioTrack = this.audioTrack;
            int hashCode = (audioTrack == null ? 0 : audioTrack.hashCode()) * 31;
            String str = this.requestId;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Data(audioTrack=");
            sb.append(this.audioTrack);
            sb.append(", requestId=");
            return ho8.a(sb, this.requestId, ')');
        }

        public /* synthetic */ Data(AudioTrack audioTrack, String str, int i, zcl zclVar) {
            this((i & 1) != 0 ? null : audioTrack, str);
        }
    }

    public /* synthetic */ AudioTrackChanged$Response(String str, Data data, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? "VKWebAppAudioTrackChanged" : str, data, str2);
    }
}
