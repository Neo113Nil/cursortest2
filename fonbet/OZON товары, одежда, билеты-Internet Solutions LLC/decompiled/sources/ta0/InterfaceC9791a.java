package ta0;

import android.content.Intent;
import androidx.fragment.app.r;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.c;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.wallet.manager.domain.mpay.MirPayWalletException;
import sa0.C9646a;
import sa0.d;
import sa0.e;

/* renamed from: ta0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC9791a {
    @NotNull
    ArrayList a() throws MirPayWalletException;

    void b(@NotNull r rVar);

    void c(boolean z11);

    void closeConnection();

    void d(@NotNull String str, @NotNull Function1<? super d, Unit> function1);

    Serializable e(@NotNull c cVar) throws MirPayWalletException;

    boolean f();

    @NotNull
    e g() throws MirPayWalletException;

    void h(@NotNull r rVar, int i11, @NotNull String str) throws MirPayWalletException;

    boolean i();

    boolean j();

    @NotNull
    C9646a k(@NotNull Intent intent) throws MirPayWalletException;
}
