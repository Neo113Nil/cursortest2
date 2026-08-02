package com.braze.models;

import com.braze.Constants;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import kotlin.Metadata;
import org.json.JSONObject;

@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u000f\bg\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0016\u0010\r\u001a\u0004\u0018\u00010\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, d2 = {"Lcom/braze/models/IBrazeLocation;", "Lcom/braze/models/IPutIntoJson;", "Lorg/json/JSONObject;", "", "getLatitude", "()D", IBrazeLocation.LATITUDE, "getLongitude", IBrazeLocation.LONGITUDE, "getAltitude", "()Ljava/lang/Double;", IBrazeLocation.ALTITUDE, "getAccuracy", "accuracy", "getVerticalAccuracy", "verticalAccuracy", k.M, Constants.BRAZE_PUSH_CONTENT_KEY, "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes7.dex */
public interface IBrazeLocation extends IPutIntoJson<JSONObject> {
    public static final String ACCURACY = "ll_accuracy";
    public static final String ALTITUDE = "altitude";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.a;
    public static final String LATITUDE = "latitude";
    public static final String LONGITUDE = "longitude";
    public static final String VERTICAL_ACCURACY = "alt_accuracy";

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/braze/models/IBrazeLocation$a;", "", "<init>", "()V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.braze.models.IBrazeLocation$a, reason: from kotlin metadata */
    public static final class Companion {
        static final /* synthetic */ Companion a = new Companion();

        private Companion() {
        }
    }

    Double getAccuracy();

    Double getAltitude();

    double getLatitude();

    double getLongitude();

    Double getVerticalAccuracy();
}
