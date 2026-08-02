package ru.ozon.app.android.initializers.auth.commands;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.initializers.auth.commands.AuthPriority;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH'R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lru/ozon/app/android/initializers/auth/commands/AuthStateCommand;", "", "<init>", "()V", "priority", "Lru/ozon/app/android/initializers/auth/commands/AuthPriority;", "getPriority", "()Lru/ozon/app/android/initializers/auth/commands/AuthPriority;", "onChange", "", "isAuth", "", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class AuthStateCommand {

    @NotNull
    private final AuthPriority priority = AuthPriority.Medium.INSTANCE;

    @NotNull
    public AuthPriority getPriority() {
        return this.priority;
    }

    public abstract void onChange(boolean isAuth);
}
