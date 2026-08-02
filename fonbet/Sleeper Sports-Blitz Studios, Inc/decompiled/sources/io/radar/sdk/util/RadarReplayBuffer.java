package io.radar.sdk.util;

import io.radar.sdk.model.RadarReplay;
import kotlin.Metadata;
import org.json.JSONObject;

/* compiled from: RadarReplayBuffer.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, d2 = {"Lio/radar/sdk/util/RadarReplayBuffer;", "", "getFlushableReplaysStash", "Lio/radar/sdk/util/Flushable;", "Lio/radar/sdk/model/RadarReplay;", "getSize", "", "loadFromSharedPreferences", "", "write", "replayParams", "Lorg/json/JSONObject;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface RadarReplayBuffer {
    Flushable<RadarReplay> getFlushableReplaysStash();

    int getSize();

    void loadFromSharedPreferences();

    void write(JSONObject replayParams);
}
