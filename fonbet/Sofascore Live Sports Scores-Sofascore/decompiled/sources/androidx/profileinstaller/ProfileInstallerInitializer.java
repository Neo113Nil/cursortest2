package androidx.profileinstaller;

import android.content.Context;
import android.view.Choreographer;
import defpackage.k3a;
import defpackage.x70;
import defpackage.y9f;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements k3a {
    @Override // defpackage.k3a
    public final Object create(Context context) {
        Choreographer.getInstance().postFrameCallback(new x70(this, context.getApplicationContext()));
        return new y9f(0);
    }

    @Override // defpackage.k3a
    public final List dependencies() {
        return Collections.EMPTY_LIST;
    }
}
