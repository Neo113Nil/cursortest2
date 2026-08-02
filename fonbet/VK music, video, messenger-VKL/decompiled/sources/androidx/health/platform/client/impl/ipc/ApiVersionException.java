package androidx.health.platform.client.impl.ipc;

import java.util.concurrent.ExecutionException;
import xsna.efz;

/* loaded from: classes12.dex */
public class ApiVersionException extends ExecutionException {
    private final int mMinVersion;
    private final int mRemoteVersion;

    public ApiVersionException(int i, int i2) {
        super(efz.a(i, i2, "Version requirements for calling the method was not met, remoteVersion: ", ", minVersion: "));
        this.mRemoteVersion = i;
        this.mMinVersion = i2;
    }
}
