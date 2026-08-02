package com.vk.superapp.vkclient.js.bridge.api.events;

import com.ironsource.X3;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.bd6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AudioPaused.kt */
/* loaded from: classes6.dex */
public final class AudioPaused$Response implements bd6 {

    @pmi0("data")
    private final Data data;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("type")
    private final String type;

    public AudioPaused$Response(String str, Data data, String str2) {
        this.type = str;
        this.data = data;
        this.requestId = str2;
    }

    @Override // xsna.bd6
    public final bd6 a(String str) {
        return new AudioPaused$Response(this.type, this.data, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioPaused$Response)) {
            return false;
        }
        AudioPaused$Response audioPaused$Response = (AudioPaused$Response) obj;
        return epx.f(this.type, audioPaused$Response.type) && epx.f(this.data, audioPaused$Response.data) && epx.f(this.requestId, audioPaused$Response.requestId);
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

    /* compiled from: AudioPaused.kt */
    public static final class Data {

        @pmi0("id")
        private final String id;

        @pmi0(X3.i.L)
        private final Integer position;

        @pmi0(CommonUrlParts.REQUEST_ID)
        private final String requestId;

        @pmi0("type")
        private final String type;

        public Data(String str, Integer num, String str2, String str3) {
            this.type = str;
            this.position = num;
            this.id = str2;
            this.requestId = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return epx.f(this.type, data.type) && epx.f(this.position, data.position) && epx.f(this.id, data.id) && epx.f(this.requestId, data.requestId);
        }

        public final int hashCode() {
            String str = this.type;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.position;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str2 = this.id;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.requestId;
            return hashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Data(type=");
            sb.append(this.type);
            sb.append(", position=");
            sb.append(this.position);
            sb.append(", id=");
            sb.append(this.id);
            sb.append(", requestId=");
            return ho8.a(sb, this.requestId, ')');
        }

        public /* synthetic */ Data(String str, Integer num, String str2, String str3, int i, zcl zclVar) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2, str3);
        }
    }

    public /* synthetic */ AudioPaused$Response(String str, Data data, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? "VKWebAppAudioPaused" : str, data, str2);
    }
}
