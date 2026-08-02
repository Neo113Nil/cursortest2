package com.vk.catalog2.common.dto.api;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.common.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.aay;
import xsna.epx;
import xsna.j5g;
import xsna.lq;

/* compiled from: CatalogVideo.kt */
/* loaded from: classes16.dex */
public final class CatalogVideo extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<CatalogVideo> CREATOR = new b();
    public final List<String> b;
    public final VideoFile c;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<CatalogVideo> {
        @Override // xsna.aay
        public final CatalogVideo a(JSONObject jSONObject) {
            return new CatalogVideo(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<CatalogVideo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogVideo a(Serializer serializer) {
            return new CatalogVideo(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogVideo[i];
        }
    }

    static {
        new a();
    }

    public CatalogVideo(List<String> list, VideoFile videoFile) {
        this.b = list;
        this.c = videoFile;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.h0(this.b);
        serializer.i0(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogVideo)) {
            return false;
        }
        CatalogVideo catalogVideo = (CatalogVideo) obj;
        return epx.f(this.b, catalogVideo.b) && epx.f(this.c, catalogVideo.c);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        VideoFile videoFile = this.c;
        return hashCode + (videoFile == null ? 0 : videoFile.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogVideo(snippetMarks=");
        sb.append(this.b);
        sb.append(", video=");
        return lq.a(sb, this.c, ')');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CatalogVideo(JSONObject jSONObject) {
        this(r0, r1);
        List list;
        JSONArray optJSONArray = jSONObject.optJSONArray("snippet_marks");
        VideoFileOld videoFileOld = null;
        if (optJSONArray != null) {
            ArrayList arrayList = new ArrayList(optJSONArray.length());
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                arrayList.add(optJSONArray.getJSONObject(i).getString("title"));
            }
            list = j5g.O0(arrayList);
        } else {
            list = null;
        }
        list = list == null ? EmptyList.b : list;
        JSONObject optJSONObject = jSONObject.optJSONObject("video");
        if (optJSONObject != null) {
            VideoFileOld.z1.getClass();
            videoFileOld = c.b(optJSONObject);
        }
    }

    public CatalogVideo(Serializer serializer) {
        this(serializer.D(), (VideoFile) serializer.G(VideoFile.class.getClassLoader()));
    }
}
