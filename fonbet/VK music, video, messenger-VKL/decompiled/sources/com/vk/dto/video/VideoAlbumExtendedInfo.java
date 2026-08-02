package com.vk.dto.video;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.VideoFile;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.epx;
import xsna.f370;
import xsna.fw3;
import xsna.ho8;
import xsna.izs;
import xsna.j5g;
import xsna.urd0;

/* compiled from: VideoAlbumExtendedInfo.kt */
/* loaded from: classes18.dex */
public final class VideoAlbumExtendedInfo extends Serializer.StreamParcelableAdapter {
    public final String b;
    public final VideoFile c;
    public final String d;
    public final List<VideoFile> e;
    public final String f;
    public final String g;

    /* JADX WARN: Multi-variable type inference failed */
    public VideoAlbumExtendedInfo(String str, VideoFile videoFile, String str2, List<? extends VideoFile> list, String str3, String str4) {
        this.b = str;
        this.c = videoFile;
        this.d = str2;
        this.e = list;
        this.f = str3;
        this.g = str4;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.e0(this.c);
        serializer.j0(this.d);
        serializer.W(this.e);
        serializer.j0(this.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoAlbumExtendedInfo)) {
            return false;
        }
        VideoAlbumExtendedInfo videoAlbumExtendedInfo = (VideoAlbumExtendedInfo) obj;
        return epx.f(this.b, videoAlbumExtendedInfo.b) && epx.f(this.c, videoAlbumExtendedInfo.c) && epx.f(this.d, videoAlbumExtendedInfo.d) && epx.f(this.e, videoAlbumExtendedInfo.e) && epx.f(this.f, videoAlbumExtendedInfo.f) && epx.f(this.g, videoAlbumExtendedInfo.g);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        VideoFile videoFile = this.c;
        int a = urd0.a(fw3.a(urd0.a((hashCode + (videoFile == null ? 0 : videoFile.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f);
        String str = this.g;
        return a + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoAlbumExtendedInfo(id=");
        sb.append(this.b);
        sb.append(", firstVideo=");
        sb.append(this.c);
        sb.append(", averageCoverColor=");
        sb.append(this.d);
        sb.append(", videos=");
        sb.append(this.e);
        sb.append(", badgeText=");
        sb.append(this.f);
        sb.append(", listInteractionTrackCode=");
        return ho8.a(sb, this.g, ')');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VideoAlbumExtendedInfo(JSONObject jSONObject, izs<? super String, ? extends VideoFile> izsVar) {
        this(r2, r3, r4, j5g.O0(j5g.V(r1)), jSONObject.getString("badge"), f370.D(jSONObject, "toggle_track_code"));
        String string = jSONObject.getString("id");
        VideoFile invoke = izsVar.invoke(jSONObject.getString("first_video_id"));
        String string2 = jSONObject.getString("avg_pixel");
        JSONArray jSONArray = jSONObject.getJSONArray("linked_to_playlist_videos");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            arrayList.add(izsVar.invoke(jSONArray.getString(i)));
        }
    }
}
