package ai.verisoul.sdk.helpers.sensor.accelerometer;

import Gb.c;
import androidx.annotation.Keep;
import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003J;\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\nHÖ\u0001J\t\u0010!\u001a\u00020\u0007HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0016¨\u0006\""}, d2 = {"Lai/verisoul/sdk/helpers/sensor/accelerometer/AccelerometerSensorData;", "", "accelerometer", "Lai/verisoul/sdk/helpers/sensor/accelerometer/AccelerometerRequestData;", "eventData", "Lai/verisoul/sdk/helpers/sensor/accelerometer/MotionEventData;", "sessionId", "", "projectId", "sampleNumber", "", "(Lai/verisoul/sdk/helpers/sensor/accelerometer/AccelerometerRequestData;Lai/verisoul/sdk/helpers/sensor/accelerometer/MotionEventData;Ljava/lang/String;Ljava/lang/String;I)V", "getAccelerometer", "()Lai/verisoul/sdk/helpers/sensor/accelerometer/AccelerometerRequestData;", "getEventData", "()Lai/verisoul/sdk/helpers/sensor/accelerometer/MotionEventData;", "getProjectId", "()Ljava/lang/String;", "getSampleNumber", "()I", "getSessionId", "setSessionId", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class AccelerometerSensorData {

    @c("accelerometer")
    @NotNull
    private final AccelerometerRequestData accelerometer;

    @c(PointerEventHelper.POINTER_TYPE_TOUCH)
    @NotNull
    private final MotionEventData eventData;

    @c("project_id")
    @NotNull
    private final String projectId;

    @c("sample_number")
    private final int sampleNumber;

    @c("session_id")
    @NotNull
    private String sessionId;

    public AccelerometerSensorData(@NotNull AccelerometerRequestData accelerometer, @NotNull MotionEventData eventData, @NotNull String sessionId, @NotNull String projectId, int i10) {
        Intrinsics.checkNotNullParameter(accelerometer, "accelerometer");
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(projectId, "projectId");
        this.accelerometer = accelerometer;
        this.eventData = eventData;
        this.sessionId = sessionId;
        this.projectId = projectId;
        this.sampleNumber = i10;
    }

    public static /* synthetic */ AccelerometerSensorData copy$default(AccelerometerSensorData accelerometerSensorData, AccelerometerRequestData accelerometerRequestData, MotionEventData motionEventData, String str, String str2, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            accelerometerRequestData = accelerometerSensorData.accelerometer;
        }
        if ((i11 & 2) != 0) {
            motionEventData = accelerometerSensorData.eventData;
        }
        if ((i11 & 4) != 0) {
            str = accelerometerSensorData.sessionId;
        }
        if ((i11 & 8) != 0) {
            str2 = accelerometerSensorData.projectId;
        }
        if ((i11 & 16) != 0) {
            i10 = accelerometerSensorData.sampleNumber;
        }
        int i12 = i10;
        String str3 = str;
        return accelerometerSensorData.copy(accelerometerRequestData, motionEventData, str3, str2, i12);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final AccelerometerRequestData getAccelerometer() {
        return this.accelerometer;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final MotionEventData getEventData() {
        return this.eventData;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getProjectId() {
        return this.projectId;
    }

    /* renamed from: component5, reason: from getter */
    public final int getSampleNumber() {
        return this.sampleNumber;
    }

    @NotNull
    public final AccelerometerSensorData copy(@NotNull AccelerometerRequestData accelerometer, @NotNull MotionEventData eventData, @NotNull String sessionId, @NotNull String projectId, int sampleNumber) {
        Intrinsics.checkNotNullParameter(accelerometer, "accelerometer");
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(projectId, "projectId");
        return new AccelerometerSensorData(accelerometer, eventData, sessionId, projectId, sampleNumber);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccelerometerSensorData)) {
            return false;
        }
        AccelerometerSensorData accelerometerSensorData = (AccelerometerSensorData) other;
        return Intrinsics.areEqual(this.accelerometer, accelerometerSensorData.accelerometer) && Intrinsics.areEqual(this.eventData, accelerometerSensorData.eventData) && Intrinsics.areEqual(this.sessionId, accelerometerSensorData.sessionId) && Intrinsics.areEqual(this.projectId, accelerometerSensorData.projectId) && this.sampleNumber == accelerometerSensorData.sampleNumber;
    }

    @NotNull
    public final AccelerometerRequestData getAccelerometer() {
        return this.accelerometer;
    }

    @NotNull
    public final MotionEventData getEventData() {
        return this.eventData;
    }

    @NotNull
    public final String getProjectId() {
        return this.projectId;
    }

    public final int getSampleNumber() {
        return this.sampleNumber;
    }

    @NotNull
    public final String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        return (((((((this.accelerometer.hashCode() * 31) + this.eventData.hashCode()) * 31) + this.sessionId.hashCode()) * 31) + this.projectId.hashCode()) * 31) + Integer.hashCode(this.sampleNumber);
    }

    public final void setSessionId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sessionId = str;
    }

    @NotNull
    public String toString() {
        return "AccelerometerSensorData(accelerometer=" + this.accelerometer + ", eventData=" + this.eventData + ", sessionId=" + this.sessionId + ", projectId=" + this.projectId + ", sampleNumber=" + this.sampleNumber + ")";
    }
}
