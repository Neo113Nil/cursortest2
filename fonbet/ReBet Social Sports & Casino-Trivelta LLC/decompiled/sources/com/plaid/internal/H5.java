package com.plaid.internal;

import android.content.Context;
import java.io.File;
import kotlin.Deprecated;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Deprecated(message = "Stores everything in the root of the host app, which is discouraged.Use [PlaidDirectoryStorage] instead")
/* loaded from: classes3.dex */
public final class H5 {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f39272b = new a();

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    public static volatile H5 f39273c;

    /* renamed from: a, reason: collision with root package name */
    public final Context f39274a;

    @SourceDebugExtension({"SMAP\nPlaidRootStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlaidRootStorage.kt\ncom/plaid/core/storage/PlaidRootStorage$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,51:1\n1#2:52\n*E\n"})
    public static final class a {
    }

    public H5(@NotNull Context app) {
        Intrinsics.checkNotNullParameter(app, "app");
        this.f39274a = app.getApplicationContext();
    }

    public final void a(@NotNull String fileName, @NotNull String data) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(data, "data");
        File parentDirectory = this.f39274a.getFilesDir();
        Intrinsics.checkNotNullExpressionValue(parentDirectory, "getFilesDir(...)");
        Intrinsics.checkNotNullParameter(parentDirectory, "parentDirectory");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        if (!parentDirectory.exists()) {
            parentDirectory.mkdirs();
        }
        File file = new File(parentDirectory, fileName);
        if (file.exists()) {
            file.delete();
            file.createNewFile();
        } else {
            file.createNewFile();
        }
        FilesKt.writeText$default(file, data, null, 2, null);
    }

    public final void a() {
        Intrinsics.checkNotNullParameter("plaid_link_state", "fileName");
        File file = new File(this.f39274a.getFilesDir().toString(), "plaid_link_state");
        if (file.exists()) {
            file.delete();
        }
    }
}
