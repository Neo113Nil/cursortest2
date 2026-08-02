package com.vk.dto.common;

import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import xsna.aay;
import xsna.bxx;
import xsna.epx;
import xsna.ho8;
import xsna.qoy;
import xsna.s3q0;
import xsna.w9y;
import xsna.zcl;

/* compiled from: VideoDownloadDto.kt */
/* loaded from: classes18.dex */
public final class VideoDownloadDto extends Serializer.StreamParcelableAdapter implements bxx {
    public static final Serializer.c<VideoDownloadDto> CREATOR = new b();
    public static final a e = new a();
    public final boolean b;
    public final boolean c;
    public final String d;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<VideoDownloadDto> {
        @Override // xsna.aay
        public final VideoDownloadDto a(JSONObject jSONObject) {
            return new VideoDownloadDto(jSONObject, (zcl) null);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<VideoDownloadDto> {
        @Override // com.vk.core.serialize.Serializer.c
        public final VideoDownloadDto a(Serializer serializer) {
            return new VideoDownloadDto(serializer, (zcl) null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VideoDownloadDto[i];
        }
    }

    public VideoDownloadDto(boolean z, boolean z2, String str) {
        this.b = z;
        this.c = z2;
        this.d = str;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.L(this.b ? (byte) 1 : (byte) 0);
        serializer.L(this.c ? (byte) 1 : (byte) 0);
        serializer.j0(this.d);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        w9y w9yVar = new w9y();
        w9yVar.b(Boolean.valueOf(this.b), "can_download_for_offline_view");
        w9yVar.b(Boolean.valueOf(this.c), "can_download_to_device");
        w9yVar.e(this.d, "unavailable_for_offline_view");
        s3q0 s3q0Var = s3q0.a;
        return w9yVar.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoDownloadDto)) {
            return false;
        }
        VideoDownloadDto videoDownloadDto = (VideoDownloadDto) obj;
        return this.b == videoDownloadDto.b && this.c == videoDownloadDto.c && epx.f(this.d, videoDownloadDto.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + qoy.b(Boolean.hashCode(this.b) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoDownloadDto(canDownloadForOfflineView=");
        sb.append(this.b);
        sb.append(", canDownloadToDevice=");
        sb.append(this.c);
        sb.append(", downloadRestrictionReasonDescription=");
        return ho8.a(sb, this.d, ')');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VideoDownloadDto(Serializer serializer, zcl zclVar) {
        this(r3, r0, r2 == null ? "" : r2);
        boolean m = serializer.m();
        boolean m2 = serializer.m();
        String H = serializer.H();
    }

    public VideoDownloadDto(JSONObject jSONObject, zcl zclVar) {
        this(jSONObject.optBoolean("can_download_for_offline_view"), jSONObject.optBoolean("can_download_to_device"), jSONObject.optString("unavailable_for_offline_view"));
    }
}
