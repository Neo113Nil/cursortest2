package defpackage;

import android.media.session.MediaSessionManager;
import android.text.TextUtils;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class ecc extends dcc {
    @Override // defpackage.dcc
    public final icc b() {
        MediaSessionManager.RemoteUserInfo currentControllerInfo = this.a.getCurrentControllerInfo();
        icc iccVar = new icc();
        String packageName = currentControllerInfo.getPackageName();
        if (packageName == null) {
            yhk.s("package shouldn't be null");
            return null;
        }
        if (TextUtils.isEmpty(packageName)) {
            a70.p("packageName should be nonempty");
            return null;
        }
        iccVar.a = new kcc(currentControllerInfo.getPackageName(), currentControllerInfo.getPid(), currentControllerInfo.getUid());
        return iccVar;
    }

    @Override // defpackage.dcc
    public final void d(icc iccVar) {
    }
}
