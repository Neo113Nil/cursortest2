package io.radar.sdk.model;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;

/* compiled from: RadarRouteMatrix.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u001f\u0012\u0018\u0010\u0002\u001a\u0014\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0018\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bJ\u0006\u0010\r\u001a\u00020\u000eR%\u0010\u0002\u001a\u0014\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lio/radar/sdk/model/RadarRouteMatrix;", "", "matrix", "", "Lio/radar/sdk/model/RadarRoute;", "([[Lio/radar/sdk/model/RadarRoute;)V", "getMatrix", "()[[Lio/radar/sdk/model/RadarRoute;", "[[Lio/radar/sdk/model/RadarRoute;", "routeBetween", "originIndex", "", "destinationIndex", "toJson", "Lorg/json/JSONArray;", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class RadarRouteMatrix {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final RadarRoute[][] matrix;

    @JvmStatic
    public static final RadarRouteMatrix fromJson(JSONArray jSONArray) {
        return INSTANCE.fromJson(jSONArray);
    }

    public RadarRouteMatrix(RadarRoute[][] radarRouteArr) {
        this.matrix = radarRouteArr;
    }

    public final RadarRoute[][] getMatrix() {
        return this.matrix;
    }

    /* compiled from: RadarRouteMatrix.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lio/radar/sdk/model/RadarRouteMatrix$Companion;", "", "()V", "fromJson", "Lio/radar/sdk/model/RadarRouteMatrix;", "arr", "Lorg/json/JSONArray;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final RadarRouteMatrix fromJson(JSONArray arr) {
            if (arr == null) {
                return null;
            }
            RadarRoute[][] radarRouteArr = new RadarRoute[arr.length()][];
            int length = arr.length();
            for (int i = 0; i < length; i++) {
                JSONArray jSONArray = arr.getJSONArray(i);
                RadarRoute[] radarRouteArr2 = new RadarRoute[jSONArray.length()];
                int length2 = jSONArray.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    radarRouteArr2[i2] = RadarRoute.INSTANCE.fromJson(jSONArray.getJSONObject(i2));
                }
                radarRouteArr[i] = radarRouteArr2;
            }
            return new RadarRouteMatrix(radarRouteArr);
        }
    }

    public final RadarRoute routeBetween(int originIndex, int destinationIndex) {
        RadarRoute[] radarRouteArr;
        RadarRoute[][] radarRouteArr2 = this.matrix;
        if (radarRouteArr2 != null && originIndex < radarRouteArr2.length && (radarRouteArr = radarRouteArr2[originIndex]) != null && destinationIndex < radarRouteArr.length) {
            return radarRouteArr[destinationIndex];
        }
        return null;
    }

    public final JSONArray toJson() {
        JSONArray jSONArray = new JSONArray();
        RadarRoute[][] radarRouteArr = this.matrix;
        if (radarRouteArr != null) {
            RadarRoute[][] radarRouteArr2 = radarRouteArr;
            int length = radarRouteArr2.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                int i3 = i2 + 1;
                RadarRoute[] radarRouteArr3 = radarRouteArr2[i];
                JSONArray jSONArray2 = new JSONArray();
                if (radarRouteArr3 != null) {
                    int length2 = radarRouteArr3.length;
                    int i4 = 0;
                    int i5 = 0;
                    while (i4 < length2) {
                        RadarRoute radarRoute = radarRouteArr3[i4];
                        int i6 = i5 + 1;
                        jSONArray2.put(i5, radarRoute != null ? radarRoute.toJson() : null);
                        i4++;
                        i5 = i6;
                    }
                }
                jSONArray.put(i2, jSONArray2);
                i++;
                i2 = i3;
            }
        }
        return jSONArray;
    }
}
