package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import java.io.File;
import kotlin.Unit;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.ca, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0072ca {

    /* renamed from: a, reason: collision with root package name */
    public volatile Boolean f13509a;

    public final void a(Context context) {
        if (this.f13509a == null) {
            synchronized (this) {
                try {
                    if (this.f13509a == null) {
                        boolean z5 = false;
                        try {
                            File fileFromAppStorage = FileUtils.getFileFromAppStorage(context, "uuid.dat");
                            boolean exists = fileFromAppStorage != null ? fileFromAppStorage.exists() : false;
                            File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(context, "uuid.dat");
                            boolean exists2 = fileFromSdkStorage != null ? fileFromSdkStorage.exists() : false;
                            if (exists || exists2) {
                                z5 = true;
                            }
                        } catch (Throwable unused) {
                        }
                        this.f13509a = Boolean.valueOf(z5);
                    }
                    Unit unit = Unit.f19194a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
