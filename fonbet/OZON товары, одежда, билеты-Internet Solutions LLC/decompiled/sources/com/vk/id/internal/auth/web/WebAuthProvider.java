package com.vk.id.internal.auth.web;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import com.vk.id.internal.auth.AuthEventBridge;
import com.vk.id.internal.auth.AuthOptions;
import com.vk.id.internal.auth.AuthOptionsKt;
import com.vk.id.internal.auth.AuthResult;
import com.vk.id.internal.auth.VKIDAuthProvider;
import com.vk.id.internal.context.InternalVKIDActivityStarter;
import com.vk.id.internal.context.InternalVKIDPackageManager;
import com.vk.id.logger.InternalVKIDLog;
import com.vk.id.logger.InternalVKIDLogger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import s.C9557e;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0012\u0010\u000e\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/vk/id/internal/auth/web/WebAuthProvider;", "Lcom/vk/id/internal/auth/VKIDAuthProvider;", "context", "Lcom/vk/id/internal/context/InternalVKIDPackageManager;", "starter", "Lcom/vk/id/internal/context/InternalVKIDActivityStarter;", "<init>", "(Lcom/vk/id/internal/context/InternalVKIDPackageManager;Lcom/vk/id/internal/context/InternalVKIDActivityStarter;)V", "logger", "Lcom/vk/id/logger/InternalVKIDLogger;", "auth", "", "authOptions", "Lcom/vk/id/internal/auth/AuthOptions;", "sendNoBrowserAuthEvent", "throwable", "", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class WebAuthProvider implements VKIDAuthProvider {

    @NotNull
    private final InternalVKIDPackageManager context;

    @NotNull
    private final InternalVKIDLogger logger;

    @NotNull
    private final InternalVKIDActivityStarter starter;

    public WebAuthProvider(@NotNull InternalVKIDPackageManager context, @NotNull InternalVKIDActivityStarter starter) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(starter, "starter");
        this.context = context;
        this.starter = starter;
        InternalVKIDLog internalVKIDLog = InternalVKIDLog.INSTANCE;
        Intrinsics.checkNotNullExpressionValue("WebAuthProvider", "getSimpleName(...)");
        this.logger = internalVKIDLog.createLoggerForTag("WebAuthProvider");
    }

    private final void sendNoBrowserAuthEvent(Throwable throwable) {
        this.logger.error("Can't start browser to auth", throwable);
        AuthEventBridge.INSTANCE.onAuthResult$vkid_release(new AuthResult.NoBrowserAvailable("Error. Make sure you have a browser installed.", throwable));
    }

    @Override // com.vk.id.internal.auth.VKIDAuthProvider
    public void auth(@NotNull AuthOptions authOptions) {
        Intrinsics.checkNotNullParameter(authOptions, "authOptions");
        Uri authUriBrowser = AuthOptionsKt.toAuthUriBrowser(authOptions);
        BrowserDescriptor selectBestBrowser = WhiteListedBrowserHelper.INSTANCE.selectBestBrowser(this.context);
        if (selectBestBrowser == null) {
            sendNoBrowserAuthEvent(null);
            return;
        }
        this.logger.debug("Auth with browser " + selectBestBrowser.getPackageName());
        Intent addCategory = selectBestBrowser.getUseCustomTab() ? new C9557e.a().b().f98031a : new Intent("android.intent.action.VIEW").addCategory("android.intent.category.BROWSABLE");
        Intrinsics.f(addCategory);
        addCategory.setData(authUriBrowser);
        addCategory.setPackage(selectBestBrowser.getPackageName());
        try {
            this.starter.startActivity(addCategory);
        } catch (ActivityNotFoundException e11) {
            sendNoBrowserAuthEvent(e11);
        }
    }
}
