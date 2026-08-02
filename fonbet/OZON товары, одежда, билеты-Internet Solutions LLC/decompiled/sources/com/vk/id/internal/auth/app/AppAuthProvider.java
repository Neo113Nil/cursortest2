package com.vk.id.internal.auth.app;

import android.content.Intent;
import com.vk.id.internal.auth.AuthOptions;
import com.vk.id.internal.auth.AuthOptionsKt;
import com.vk.id.internal.auth.VKIDAuthProvider;
import com.vk.id.internal.context.InternalVKIDActivityStarter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/vk/id/internal/auth/app/AppAuthProvider;", "Lcom/vk/id/internal/auth/VKIDAuthProvider;", "starter", "Lcom/vk/id/internal/context/InternalVKIDActivityStarter;", "appPackage", "", "<init>", "(Lcom/vk/id/internal/context/InternalVKIDActivityStarter;Ljava/lang/String;)V", "auth", "", "authOptions", "Lcom/vk/id/internal/auth/AuthOptions;", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class AppAuthProvider implements VKIDAuthProvider {

    @NotNull
    private final String appPackage;

    @NotNull
    private final InternalVKIDActivityStarter starter;

    public AppAuthProvider(@NotNull InternalVKIDActivityStarter starter, @NotNull String appPackage) {
        Intrinsics.checkNotNullParameter(starter, "starter");
        Intrinsics.checkNotNullParameter(appPackage, "appPackage");
        this.starter = starter;
        this.appPackage = appPackage;
    }

    @Override // com.vk.id.internal.auth.VKIDAuthProvider
    public void auth(@NotNull AuthOptions authOptions) {
        Intrinsics.checkNotNullParameter(authOptions, "authOptions");
        this.starter.startActivity(new Intent("android.intent.action.VIEW", AuthOptionsKt.toAuthUriCodeFlow(authOptions, this.appPackage)));
    }
}
