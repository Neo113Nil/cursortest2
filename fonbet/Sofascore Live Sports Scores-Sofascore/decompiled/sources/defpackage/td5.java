package defpackage;

import android.media.MediaDrmException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class td5 implements rf6 {
    @Override // defpackage.rf6
    public final int b() {
        return 1;
    }

    @Override // defpackage.rf6
    public final nr8 d(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // defpackage.rf6
    public final pf6 e(byte[] bArr, List list, int i, HashMap hashMap) {
        throw new IllegalStateException();
    }

    @Override // defpackage.rf6
    public final boolean f(String str, byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // defpackage.rf6
    public final qf6 getProvisionRequest() {
        throw new IllegalStateException();
    }

    @Override // defpackage.rf6
    public final byte[] openSession() {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override // defpackage.rf6
    public final byte[] provideKeyResponse(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // defpackage.rf6
    public final void provideProvisionResponse(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // defpackage.rf6
    public final Map queryKeyStatus(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // defpackage.rf6
    public final void restoreKeys(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // defpackage.rf6
    public final void release() {
    }

    @Override // defpackage.rf6
    public final void a(de0 de0Var) {
    }

    @Override // defpackage.rf6
    public final void closeSession(byte[] bArr) {
    }
}
