package com.vk.catalog2.common.dto.api.poll;

import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import xsna.aay;
import xsna.epx;
import xsna.ho8;

/* compiled from: UxPollData.kt */
/* loaded from: classes16.dex */
public final class UxPollData extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<UxPollData> CREATOR = new b();
    public static final a e = new a();
    public final Long b;
    public final Long c;
    public final String d;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<UxPollData> {
        @Override // xsna.aay
        public final UxPollData a(JSONObject jSONObject) {
            return new UxPollData(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<UxPollData> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UxPollData a(Serializer serializer) {
            return new UxPollData(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UxPollData[i];
        }
    }

    public UxPollData(Long l, Long l2, String str) {
        this.b = l;
        this.c = l2;
        this.d = str;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.b0(this.b);
        serializer.b0(this.c);
        serializer.m0(this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UxPollData)) {
            return false;
        }
        UxPollData uxPollData = (UxPollData) obj;
        return epx.f(this.b, uxPollData.b) && epx.f(this.c, uxPollData.c) && epx.f(this.d, uxPollData.d);
    }

    public final int hashCode() {
        Long l = this.b;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.c;
        int hashCode2 = (hashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.d;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UxPollData(videoOwnerId=");
        sb.append(this.b);
        sb.append(", videoId=");
        sb.append(this.c);
        sb.append(", trigger=");
        return ho8.a(sb, this.d, ')');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public UxPollData(JSONObject jSONObject) {
        this(r0, r1.longValue() == 0 ? null : r1, jSONObject.optString("poll_id"));
        Long valueOf = Long.valueOf(jSONObject.optLong("video_owner_id"));
        Long valueOf2 = Long.valueOf(jSONObject.optLong("video_id"));
    }

    public UxPollData(Serializer serializer) {
        this(serializer.x(), serializer.x(), serializer.I());
    }
}
