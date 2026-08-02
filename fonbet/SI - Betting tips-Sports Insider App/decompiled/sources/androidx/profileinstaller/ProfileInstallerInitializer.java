package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import android.view.Choreographer;
import androidx.dynamicanimation.animation.c;
import java.util.Collections;
import java.util.List;
import m3.f;
import x2.b;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements b {
    @Override // x2.b
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // x2.b
    public final Object create(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return new f(18);
        }
        Choreographer.getInstance().postFrameCallback(new c(this, context.getApplicationContext()));
        return new f(18);
    }
}
