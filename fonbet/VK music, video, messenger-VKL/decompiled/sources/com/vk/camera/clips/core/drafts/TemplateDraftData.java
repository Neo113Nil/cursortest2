package com.vk.camera.clips.core.drafts;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.clips.ClipAudioTemplate;
import com.vk.log.L;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.aay;
import xsna.bxx;
import xsna.epx;
import xsna.f370;
import xsna.ms9;
import xsna.s3q0;
import xsna.w9y;

/* compiled from: TemplateDraftData.kt */
/* loaded from: classes14.dex */
public final class TemplateDraftData implements Serializer.StreamParcelable, bxx {
    public static final Serializer.c<TemplateDraftData> CREATOR = new b();
    public static final a d = new a();
    public final ClipAudioTemplate b;
    public final List<Integer> c;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<TemplateDraftData> {
        @Override // xsna.aay
        public final TemplateDraftData a(JSONObject jSONObject) {
            return new TemplateDraftData(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<TemplateDraftData> {
        @Override // com.vk.core.serialize.Serializer.c
        public final TemplateDraftData a(Serializer serializer) {
            ClipAudioTemplate clipAudioTemplate = (ClipAudioTemplate) serializer.G(ClipAudioTemplate.class.getClassLoader());
            List d = serializer.d();
            if (d == null) {
                d = EmptyList.b;
            }
            return new TemplateDraftData(clipAudioTemplate, d);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TemplateDraftData[i];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TemplateDraftData(JSONObject jSONObject) {
        this(r0 != null ? r0 : r1, f370.J(jSONObject.getJSONArray("video_positions")));
        ClipAudioTemplate clipAudioTemplate;
        ClipAudioTemplate.a aVar = ClipAudioTemplate.c;
        ClipAudioTemplate clipAudioTemplate2 = new ClipAudioTemplate("");
        if (jSONObject.has("audio_template")) {
            try {
                JSONObject jSONObject2 = jSONObject.getJSONObject("audio_template");
                aVar.getClass();
                clipAudioTemplate = new ClipAudioTemplate(jSONObject2);
            } catch (JSONException e) {
                L.i(e);
            }
        }
        clipAudioTemplate = null;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.b);
        serializer.U(this.c);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        w9y w9yVar = new w9y();
        w9yVar.g("audio_template", this.b);
        w9yVar.e(this.c, "video_positions");
        s3q0 s3q0Var = s3q0.a;
        return w9yVar.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TemplateDraftData)) {
            return false;
        }
        TemplateDraftData templateDraftData = (TemplateDraftData) obj;
        return epx.f(this.b, templateDraftData.b) && epx.f(this.c, templateDraftData.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TemplateDraftData(audioTemplate=");
        sb.append(this.b);
        sb.append(", videoPositions=");
        return ms9.a(')', sb, this.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    public TemplateDraftData(ClipAudioTemplate clipAudioTemplate, List<Integer> list) {
        this.b = clipAudioTemplate;
        this.c = list;
    }
}
