package bo.app;

import androidx.exifinterface.media.ExifInterface;
import com.braze.Constants;
import com.braze.support.DateTimeUtils;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B3\b\u0017\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016R(\u0010\f\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lbo/app/n3;", "Lbo/app/m5;", "", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "", "toString", "", "value", "w", "()Ljava/lang/Double;", Constants.BRAZE_PUSH_CONTENT_KEY, "(Ljava/lang/Double;)V", SDKConstants.PARAM_END_TIME, "Lbo/app/o5;", JsonStorageKeyNames.SESSION_ID_KEY, "startTimeSeconds", "endTimeSeconds", "", "sealed", "<init>", "(Lbo/app/o5;DLjava/lang/Double;Z)V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public final class n3 extends m5 {
    public /* synthetic */ n3(o5 o5Var, double d, Double d2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? o5.d.a() : o5Var, (i & 2) != 0 ? DateTimeUtils.nowInSecondsPrecise() : d, (i & 4) != 0 ? null : d2, (i & 8) != 0 ? false : z);
    }

    public final void A() {
        a(true);
        a(Double.valueOf(DateTimeUtils.nowInSecondsPrecise()));
    }

    @Override // bo.app.m5
    public void a(Double d) {
        super.a(d);
    }

    @Override // bo.app.m5
    public String toString() {
        return "\nMutableSession(sessionId=" + getB() + ", startTime=" + getC() + ", endTime=" + getD() + ", isSealed=" + getE() + ", duration=" + v() + ')';
    }

    @Override // bo.app.m5
    /* renamed from: w */
    public Double getD() {
        return super.getD();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(o5 sessionId, double d, Double d2, boolean z) {
        super(sessionId, d, d2, z);
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
    }
}
