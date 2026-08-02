package io.radar.sdk.model;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: RadarReplay.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\b\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0016B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0000H\u0096\u0002J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\t\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\bHÖ\u0001J\u0006\u0010\u0010\u001a\u00020\u0003J\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00000\u0012J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0017"}, d2 = {"Lio/radar/sdk/model/RadarReplay;", "", RadarReplay.REPLAY_PARAMS, "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "getReplayParams", "()Lorg/json/JSONObject;", "compareTo", "", "other", "component1", "copy", "equals", "", "", "hashCode", "toJson", "toListofJson", "", "replays", InAppPurchaseConstants.METHOD_TO_STRING, "", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class RadarReplay implements Comparable<RadarReplay> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String REPLAY_PARAMS = "replayParams";
    private final JSONObject replayParams;

    public static /* synthetic */ RadarReplay copy$default(RadarReplay radarReplay, JSONObject jSONObject, int i, Object obj) {
        if ((i & 1) != 0) {
            jSONObject = radarReplay.replayParams;
        }
        return radarReplay.copy(jSONObject);
    }

    @JvmStatic
    public static final RadarReplay fromJson(JSONObject jSONObject) {
        return INSTANCE.fromJson(jSONObject);
    }

    /* renamed from: component1, reason: from getter */
    public final JSONObject getReplayParams() {
        return this.replayParams;
    }

    public final RadarReplay copy(JSONObject replayParams) {
        Intrinsics.checkNotNullParameter(replayParams, "replayParams");
        return new RadarReplay(replayParams);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RadarReplay) && Intrinsics.areEqual(this.replayParams, ((RadarReplay) other).replayParams);
    }

    public int hashCode() {
        return this.replayParams.hashCode();
    }

    public String toString() {
        return "RadarReplay(replayParams=" + this.replayParams + ')';
    }

    public RadarReplay(JSONObject replayParams) {
        Intrinsics.checkNotNullParameter(replayParams, "replayParams");
        this.replayParams = replayParams;
    }

    public final JSONObject getReplayParams() {
        return this.replayParams;
    }

    /* compiled from: RadarReplay.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lio/radar/sdk/model/RadarReplay$Companion;", "", "()V", "REPLAY_PARAMS", "", "fromJson", "Lio/radar/sdk/model/RadarReplay;", "json", "Lorg/json/JSONObject;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final RadarReplay fromJson(JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            JSONObject optJSONObject = json.optJSONObject(RadarReplay.REPLAY_PARAMS);
            Intrinsics.checkNotNullExpressionValue(optJSONObject, "optJSONObject(...)");
            return new RadarReplay(optJSONObject);
        }
    }

    public final JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt(REPLAY_PARAMS, this.replayParams);
        return jSONObject;
    }

    public final List<JSONObject> toListofJson(List<RadarReplay> replays) {
        Intrinsics.checkNotNullParameter(replays, "replays");
        ArrayList arrayList = new ArrayList();
        Iterator<RadarReplay> it = replays.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().toJson());
        }
        return arrayList;
    }

    @Override // java.lang.Comparable
    public int compareTo(RadarReplay other) {
        Intrinsics.checkNotNullParameter(other, "other");
        String jSONObject = this.replayParams.toString();
        String jSONObject2 = other.replayParams.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
        return jSONObject.compareTo(jSONObject2);
    }
}
