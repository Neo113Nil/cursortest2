package com.google.android.play.core.install;

import D7.n;
import android.content.Intent;
import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
public abstract class InstallState {
    public static InstallState f(@NonNull Intent intent, @NonNull n nVar) {
        nVar.a("List of extras in received intent needed by fromUpdateIntent:", new Object[0]);
        nVar.a("Key: %s; value: %s", "install.status", Integer.valueOf(intent.getIntExtra("install.status", 0)));
        nVar.a("Key: %s; value: %s", "error.code", Integer.valueOf(intent.getIntExtra("error.code", 0)));
        return new a(intent.getIntExtra("install.status", 0), intent.getStringExtra("package.name"), intent.getLongExtra("bytes.downloaded", 0L), intent.getLongExtra("total.bytes.to.download", 0L), intent.getIntExtra("error.code", 0));
    }

    public abstract long a();

    public abstract int b();

    public abstract int c();

    public abstract String d();

    public abstract long e();
}
