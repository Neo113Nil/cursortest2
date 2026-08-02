package ru.ozon.app.android.di.provider.component;

import android.app.Application;
import android.content.Context;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "Lhi/a;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Landroid/app/Application;", "getApplication", "()Landroid/app/Application;", "di-provider_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ContextComponentDependencies extends InterfaceC6958a {
    @NotNull
    Application getApplication();

    @NotNull
    Context getContext();
}
