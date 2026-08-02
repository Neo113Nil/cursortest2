package com.vk.dto.common;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.VideoEditForbiddenReason;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.aay;
import xsna.epx;
import xsna.ms9;

/* compiled from: VideoAccessInfo.kt */
/* loaded from: classes18.dex */
public final class VideoAccessInfo extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<VideoAccessInfo> CREATOR = new c();
    public static final b c = new b();
    public final List<VideoEditForbiddenReason> b;

    /* compiled from: VideoAccessInfo.kt */
    public static final class a {
        public static b a() {
            return VideoAccessInfo.c;
        }
    }

    /* compiled from: JsonParser.kt */
    public static final class b extends aay<VideoAccessInfo> {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.collections.EmptyList] */
        /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList] */
        @Override // xsna.aay
        public final VideoAccessInfo a(JSONObject jSONObject) {
            ?? r0;
            try {
                JSONArray optJSONArray = jSONObject.optJSONArray("edit_forbidden_reasons");
                if (optJSONArray != null) {
                    r0 = new ArrayList();
                    int length = optJSONArray.length();
                    for (int i = 0; i < length; i++) {
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                        VideoEditForbiddenReason.Y6.getClass();
                        VideoEditForbiddenReason videoEditForbiddenReason = (VideoEditForbiddenReason) VideoEditForbiddenReason.a.b.a(jSONObject2);
                        if (videoEditForbiddenReason != null) {
                            r0.add(videoEditForbiddenReason);
                        }
                    }
                } else {
                    r0 = EmptyList.b;
                }
                return new VideoAccessInfo(r0);
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    /* compiled from: Serializer.kt */
    public static final class c extends Serializer.c<VideoAccessInfo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final VideoAccessInfo a(Serializer serializer) {
            return new VideoAccessInfo(serializer.B(VideoEditForbiddenReason.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VideoAccessInfo[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VideoAccessInfo(List<? extends VideoEditForbiddenReason> list) {
        this.b = list;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.f0(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VideoAccessInfo) && epx.f(this.b, ((VideoAccessInfo) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("VideoAccessInfo(editForbiddenReasons="), this.b);
    }
}
