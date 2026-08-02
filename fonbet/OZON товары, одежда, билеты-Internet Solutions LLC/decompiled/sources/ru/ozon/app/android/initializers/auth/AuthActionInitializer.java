package ru.ozon.app.android.initializers.auth;

import Fl.b;
import Fl.c;
import Vc.a;
import android.annotation.SuppressLint;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.initializers.auth.commands.AuthStateCommand;
import ru.ozon.app.android.startup.initializers.ActionInitializer;
import ru.ozon.app.android.storage.auth.AuthStateStorage;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/initializers/auth/AuthActionInitializer;", "Lru/ozon/app/android/startup/initializers/ActionInitializer;", "Lru/ozon/app/android/storage/auth/AuthStateStorage;", "authStateStorage", "", "Lru/ozon/app/android/initializers/auth/commands/AuthStateCommand;", "commands", "<init>", "(Lru/ozon/app/android/storage/auth/AuthStateStorage;Ljava/util/Set;)V", "", "init", "()V", "Lru/ozon/app/android/storage/auth/AuthStateStorage;", "", "prioritizedCommands", "Ljava/util/List;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AuthActionInitializer implements ActionInitializer {

    @NotNull
    private final AuthStateStorage authStateStorage;

    @NotNull
    private final List<AuthStateCommand> prioritizedCommands;

    public AuthActionInitializer(@NotNull AuthStateStorage authStateStorage, @NotNull Set<AuthStateCommand> commands) {
        Intrinsics.checkNotNullParameter(authStateStorage, "authStateStorage");
        Intrinsics.checkNotNullParameter(commands, "commands");
        this.authStateStorage = authStateStorage;
        this.prioritizedCommands = C7714v.I0(new Comparator() { // from class: ru.ozon.app.android.initializers.auth.AuthActionInitializer$special$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t2, T t11) {
                return a.b(Integer.valueOf(((AuthStateCommand) t2).getPriority().getSort()), Integer.valueOf(((AuthStateCommand) t11).getPriority().getSort()));
            }
        }, commands);
    }

    @Override // ru.ozon.app.android.startup.initializers.ActionInitializer
    @SuppressLint({"CheckResult"})
    public void init() {
        this.authStateStorage.getAuthState().subscribe(new b(new AuthActionInitializer$init$1(this), 1), new c(AuthActionInitializer$init$2.INSTANCE, 2));
    }
}
