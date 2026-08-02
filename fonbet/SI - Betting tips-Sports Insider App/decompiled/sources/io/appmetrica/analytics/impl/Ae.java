package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Locale;
import java.util.UUID;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Ae {

    /* renamed from: a, reason: collision with root package name */
    public final Context f11996a;

    /* renamed from: b, reason: collision with root package name */
    public final oo f11997b;

    /* renamed from: c, reason: collision with root package name */
    public final po f11998c;

    public Ae(Context context) {
        this(context, new oo(), new po());
    }

    public final String a(String str) {
        try {
            this.f11998c.getClass();
            if (!po.a(str)) {
                this.f11997b.getClass();
                str = kotlin.text.z.m(UUID.randomUUID().toString(), "-", "").toLowerCase(Locale.US);
            }
            File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(this.f11996a, "uuid.dat");
            if (fileFromSdkStorage != null && str != null) {
                Ja.a(str, new FileOutputStream(fileFromSdkStorage));
            }
            return str;
        } catch (Throwable unused) {
            return null;
        }
    }

    public Ae(Context context, oo ooVar, po poVar) {
        this.f11996a = context;
        this.f11997b = ooVar;
        this.f11998c = poVar;
    }

    public final void a() {
        File fileFromAppStorage;
        File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(this.f11996a, "uuid.dat");
        if (fileFromSdkStorage == null || fileFromSdkStorage.exists() || (fileFromAppStorage = FileUtils.getFileFromAppStorage(this.f11996a, "uuid.dat")) == null || !fileFromAppStorage.exists()) {
            return;
        }
        FileUtils.copyToNullable(fileFromAppStorage, fileFromSdkStorage);
    }
}
