package bo.app;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.braze.Constants;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\"\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&J \u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH&J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0005\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\tH&R\u0014\u0010\u0010\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0001"}, d2 = {"Lbo/app/m2;", "", "Lbo/app/h2;", "internalPublisher", "", Constants.BRAZE_PUSH_CONTENT_KEY, "externalPublisher", "Lbo/app/d;", "apiResponse", "Lbo/app/o2;", "responseError", "b", "", "Lbo/app/w1;", "m", "()Lbo/app/w1;", "backoffStateProvider", "Lbo/app/a5;", "h", "()Lbo/app/a5;", TypedValues.AttributesType.S_TARGET, "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public interface m2 {
    void a(h2 internalPublisher);

    void a(h2 internalPublisher, h2 externalPublisher, d apiResponse);

    void a(h2 internalPublisher, h2 externalPublisher, o2 responseError);

    boolean a(o2 responseError);

    void b(h2 internalPublisher);

    a5 h();

    w1 m();
}
