package bo.app;

import com.braze.Constants;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ(\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0007¨\u0006\n"}, d2 = {"Lbo/app/i3;", "", "", "lat1", "lon1", "lat2", "lon2", Constants.BRAZE_PUSH_CONTENT_KEY, "<init>", "()V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public final class i3 {
    public static final i3 a = new i3();

    private i3() {
    }

    @JvmStatic
    public static final double a(double lat1, double lon1, double lat2, double lon2) {
        double radians = Math.toRadians(lat2 - lat1);
        double radians2 = Math.toRadians(lon2 - lon1);
        double d = 2;
        return 6371000.0d * d * Math.asin(Math.sqrt(Math.pow(Math.sin(radians / d), 2.0d) + (Math.pow(Math.sin(radians2 / d), 2.0d) * Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)))));
    }
}
