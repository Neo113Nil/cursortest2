package androidx.media;

import android.content.Context;
import android.media.session.MediaSessionManager;
import androidx.media.MediaSessionManager;
import androidx.media.MediaSessionManagerImplBase;
import androidx.media3.common.util.Util$$ExternalSyntheticApiModelOutline0;

/* loaded from: classes5.dex */
class MediaSessionManagerImplApi28 extends MediaSessionManagerImplApi21 {
    android.media.session.MediaSessionManager mObject;

    MediaSessionManagerImplApi28(Context context) {
        super(context);
        this.mObject = (android.media.session.MediaSessionManager) context.getSystemService("media_session");
    }

    @Override // androidx.media.MediaSessionManagerImplApi21, androidx.media.MediaSessionManagerImplBase, androidx.media.MediaSessionManager.MediaSessionManagerImpl
    public boolean isTrustedForMediaControl(MediaSessionManager.RemoteUserInfoImpl remoteUserInfoImpl) {
        return super.isTrustedForMediaControl(remoteUserInfoImpl);
    }

    static final class RemoteUserInfoImplApi28 extends MediaSessionManagerImplBase.RemoteUserInfoImplBase {
        final MediaSessionManager.RemoteUserInfo mObject;

        RemoteUserInfoImplApi28(String str, int i, int i2) {
            super(str, i, i2);
            this.mObject = Util$$ExternalSyntheticApiModelOutline0.m(str, i, i2);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        RemoteUserInfoImplApi28(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
            super(r0, r1, r2);
            String packageName;
            int pid;
            int uid;
            packageName = remoteUserInfo.getPackageName();
            pid = remoteUserInfo.getPid();
            uid = remoteUserInfo.getUid();
            this.mObject = remoteUserInfo;
        }

        static String getPackageName(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
            String packageName;
            packageName = remoteUserInfo.getPackageName();
            return packageName;
        }
    }
}
