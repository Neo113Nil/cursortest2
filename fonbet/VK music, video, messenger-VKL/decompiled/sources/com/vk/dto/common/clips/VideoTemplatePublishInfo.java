package com.vk.dto.common.clips;

import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import xsna.aay;
import xsna.bxx;
import xsna.epx;
import xsna.iq;
import xsna.s3q0;
import xsna.w9y;
import xsna.zcl;

/* compiled from: VideoTemplatePublishInfo.kt */
/* loaded from: classes18.dex */
public final class VideoTemplatePublishInfo extends Serializer.StreamParcelableAdapter implements bxx {
    public static final Serializer.c<VideoTemplatePublishInfo> CREATOR = new b();
    public final String b;
    public final Integer c;
    public final Long d;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<VideoTemplatePublishInfo> {
        @Override // xsna.aay
        public final VideoTemplatePublishInfo a(JSONObject jSONObject) {
            return new VideoTemplatePublishInfo(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<VideoTemplatePublishInfo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final VideoTemplatePublishInfo a(Serializer serializer) {
            return new VideoTemplatePublishInfo(serializer.I(), serializer.v(), serializer.x());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VideoTemplatePublishInfo[i];
        }
    }

    static {
        new a();
    }

    public VideoTemplatePublishInfo() {
        this(null, null, null, 7, null);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.m0(this.b);
        serializer.V(this.c);
        serializer.b0(this.d);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        w9y w9yVar = new w9y();
        w9yVar.e(this.b, "template_raw_id");
        w9yVar.c(this.c, "statistics_template_id");
        w9yVar.d(this.d, "owner_id");
        s3q0 s3q0Var = s3q0.a;
        return w9yVar.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoTemplatePublishInfo)) {
            return false;
        }
        VideoTemplatePublishInfo videoTemplatePublishInfo = (VideoTemplatePublishInfo) obj;
        return epx.f(this.b, videoTemplatePublishInfo.b) && epx.f(this.c, videoTemplatePublishInfo.c) && epx.f(this.d, videoTemplatePublishInfo.d);
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.c;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.d;
        return hashCode2 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoTemplatePublishInfo(templateRawId=");
        sb.append(this.b);
        sb.append(", statisticsTemplateId=");
        sb.append(this.c);
        sb.append(", ownerId=");
        return iq.b(sb, this.d, ')');
    }

    public /* synthetic */ VideoTemplatePublishInfo(String str, Integer num, Long l, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : l);
    }

    public VideoTemplatePublishInfo(String str, Integer num, Long l) {
        this.b = str;
        this.c = num;
        this.d = l;
    }

    public VideoTemplatePublishInfo(JSONObject jSONObject) {
        this(jSONObject.optString("template_raw_id"), Integer.valueOf(jSONObject.optInt("statistics_template_id")), Long.valueOf(jSONObject.optLong("owner_id")));
    }
}
