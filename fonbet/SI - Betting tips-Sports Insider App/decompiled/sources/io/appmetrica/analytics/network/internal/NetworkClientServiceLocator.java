package io.appmetrica.analytics.network.internal;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class NetworkClientServiceLocator {

    /* renamed from: b, reason: collision with root package name */
    private static volatile NetworkClientServiceLocator f15133b;

    /* renamed from: a, reason: collision with root package name */
    private final Bundle f15134a;

    public NetworkClientServiceLocator(Bundle bundle) {
        this.f15134a = bundle;
    }

    @NonNull
    public static NetworkClientServiceLocator getInstance() {
        return f15133b;
    }

    public static void init(@NonNull Context context) {
        init(context, new SafePackageManager());
    }

    public Bundle getApplicationMetaData() {
        return this.f15134a;
    }

    public static void init(@NonNull Context context, @NonNull SafePackageManager safePackageManager) {
        if (f15133b == null) {
            synchronized (NetworkClientServiceLocator.class) {
                try {
                    if (f15133b == null) {
                        f15133b = new NetworkClientServiceLocator(safePackageManager.getApplicationMetaData(context));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
