package ru.ozon.app.android.initializers.auth.commands;

import He.b;
import Ib.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.lib.FintechCoreLib;
import xe.C10720e0;
import xe.C10727i;
import xe.J;
import xe.M;
import xe.N;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/initializers/auth/commands/OzonBankStateCommand;", "Lru/ozon/app/android/initializers/auth/commands/AuthStateCommand;", "LIb/a;", "Lru/ozon/fintech/lib/FintechCoreLib;", "fintechLib", "<init>", "(LIb/a;)V", "", "isAuth", "", "onChange", "(Z)V", "LIb/a;", "Lxe/J;", "coroutineExceptionHandler", "Lxe/J;", "Lxe/M;", "coroutineScope", "Lxe/M;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OzonBankStateCommand extends AuthStateCommand {

    @NotNull
    private final J coroutineExceptionHandler;

    @NotNull
    private final M coroutineScope;

    @NotNull
    private final a<FintechCoreLib> fintechLib;

    public OzonBankStateCommand(@NotNull a<FintechCoreLib> fintechLib) {
        Intrinsics.checkNotNullParameter(fintechLib, "fintechLib");
        this.fintechLib = fintechLib;
        OzonBankStateCommand$special$$inlined$CoroutineExceptionHandler$1 ozonBankStateCommand$special$$inlined$CoroutineExceptionHandler$1 = new OzonBankStateCommand$special$$inlined$CoroutineExceptionHandler$1(J.f105405n0);
        this.coroutineExceptionHandler = ozonBankStateCommand$special$$inlined$CoroutineExceptionHandler$1;
        C10720e0 c10720e0 = C10720e0.f105451a;
        this.coroutineScope = N.a(b.f10879b.plus(ozonBankStateCommand$special$$inlined$CoroutineExceptionHandler$1));
    }

    @Override // ru.ozon.app.android.initializers.auth.commands.AuthStateCommand
    public void onChange(boolean isAuth) {
        if (isAuth) {
            return;
        }
        C10727i.c(this.coroutineScope, null, null, new OzonBankStateCommand$onChange$1(this, null), 3);
    }
}
