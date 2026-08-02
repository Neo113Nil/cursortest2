package ru.ozon.app.android.initializers.auth.commands;

import Ib.a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.push.OzonPushManager;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/initializers/auth/commands/OzonPushAuthStateCommand;", "Lru/ozon/app/android/initializers/auth/commands/AuthStateCommand;", "LIb/a;", "Lru/ozon/app/android/push/OzonPushManager;", "ozonPushManager", "<init>", "(LIb/a;)V", "", "isAuth", "", "onChange", "(Z)V", "LIb/a;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OzonPushAuthStateCommand extends AuthStateCommand {

    @NotNull
    private final a<OzonPushManager> ozonPushManager;

    public OzonPushAuthStateCommand(@NotNull a<OzonPushManager> ozonPushManager) {
        Intrinsics.checkNotNullParameter(ozonPushManager, "ozonPushManager");
        this.ozonPushManager = ozonPushManager;
    }

    @Override // ru.ozon.app.android.initializers.auth.commands.AuthStateCommand
    public void onChange(boolean isAuth) {
        OzonPushManager ozonPushManager = this.ozonPushManager.get();
        List<Pair<String, String>> pushTokens = ozonPushManager.getPushTokens();
        if ((pushTokens instanceof Collection) && pushTokens.isEmpty()) {
            return;
        }
        Iterator<T> it = pushTokens.iterator();
        while (it.hasNext()) {
            if (((CharSequence) ((Pair) it.next()).f()).length() > 0) {
                if (isAuth) {
                    ozonPushManager.onLogin();
                    return;
                } else {
                    ozonPushManager.onLogout();
                    return;
                }
            }
        }
    }
}
