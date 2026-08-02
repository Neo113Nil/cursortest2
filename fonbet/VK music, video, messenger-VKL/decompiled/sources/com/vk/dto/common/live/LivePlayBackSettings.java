package com.vk.dto.common.live;

import androidx.annotation.NonNull;
import com.vk.core.serialize.Serializer;
import org.json.JSONObject;

/* loaded from: classes18.dex */
public class LivePlayBackSettings extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<LivePlayBackSettings> CREATOR = new a();
    public boolean b;
    public boolean c;
    public boolean d;
    public long e;
    public LiveLayoutSettings f;

    public class a extends Serializer.c<LivePlayBackSettings> {
        @Override // com.vk.core.serialize.Serializer.c
        public final LivePlayBackSettings a(Serializer serializer) {
            LivePlayBackSettings livePlayBackSettings = new LivePlayBackSettings();
            livePlayBackSettings.b = serializer.p() != 0;
            livePlayBackSettings.c = serializer.p() != 0;
            livePlayBackSettings.d = serializer.p() != 0;
            livePlayBackSettings.e = serializer.w();
            livePlayBackSettings.f = (LiveLayoutSettings) serializer.G(LiveLayoutSettings.class.getClassLoader());
            return livePlayBackSettings;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LivePlayBackSettings[i];
        }
    }

    public LivePlayBackSettings(boolean z, boolean z2, boolean z3, long j, LiveLayoutSettings liveLayoutSettings) {
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = j;
        this.f = liveLayoutSettings;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.L(this.b ? (byte) 1 : (byte) 0);
        serializer.L(this.c ? (byte) 1 : (byte) 0);
        serializer.L(this.d ? (byte) 1 : (byte) 0);
        serializer.Y(this.e);
        serializer.i0(this.f);
    }

    public LivePlayBackSettings(@NonNull JSONObject jSONObject) {
        this.e = jSONObject.optLong("playback_duration") * 1000;
        this.c = jSONObject.optLong("max_rewind_duration") != 0;
        this.b = jSONObject.optInt("is_endless") != 0;
        this.d = jSONObject.optInt("is_clips_live") != 0;
        JSONObject optJSONObject = jSONObject.optJSONObject("layout_settings");
        if (optJSONObject != null) {
            this.f = new LiveLayoutSettings(optJSONObject);
        }
    }
}
