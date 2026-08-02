package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.ba, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0046ba implements Bo {

    /* renamed from: a, reason: collision with root package name */
    public final Context f13416a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13417b;

    public C0046ba(@NotNull Context context, @NotNull String str) {
        this.f13416a = context;
        this.f13417b = str;
    }

    @Override // io.appmetrica.analytics.impl.Bo
    @Nullable
    public final String a() {
        try {
            File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(this.f13416a, this.f13417b);
            if (fileFromSdkStorage == null) {
                return null;
            }
            fileFromSdkStorage.exists();
            File fileFromAppStorage = FileUtils.getFileFromAppStorage(this.f13416a, this.f13417b);
            if (fileFromAppStorage != null) {
                FileUtils.copyToNullable(fileFromAppStorage, fileFromSdkStorage);
            }
            return rf.l.a(fileFromSdkStorage);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // io.appmetrica.analytics.impl.Bo
    public final void a(@NotNull String str) {
        try {
            File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(this.f13416a, this.f13417b);
            if (fileFromSdkStorage != null) {
                rf.l.b(fileFromSdkStorage, str);
            }
        } catch (Throwable unused) {
        }
    }
}
