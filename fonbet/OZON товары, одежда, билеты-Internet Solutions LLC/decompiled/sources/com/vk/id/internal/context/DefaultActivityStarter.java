package com.vk.id.internal.context;

import android.content.Context;
import android.content.Intent;
import com.vk.id.internal.auth.AuthActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/vk/id/internal/context/DefaultActivityStarter;", "Lcom/vk/id/internal/context/InternalVKIDActivityStarter;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "startActivity", "", "intent", "Landroid/content/Intent;", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class DefaultActivityStarter implements InternalVKIDActivityStarter {

    @NotNull
    private final Context context;

    public DefaultActivityStarter(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    @Override // com.vk.id.internal.context.InternalVKIDActivityStarter
    public void startActivity(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        AuthActivity.INSTANCE.startForAuth$vkid_release(this.context, intent);
    }
}
