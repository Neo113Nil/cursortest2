package dc0;

import android.accounts.AbstractAccountAuthenticator;
import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.os.Bundle;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: dc0.I, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6145I extends AbstractAccountAuthenticator {
    @Override // android.accounts.AbstractAccountAuthenticator
    public final Bundle addAccount(AccountAuthenticatorResponse accountAuthenticatorResponse, String str, String str2, String[] strArr, Bundle bundle) {
        return null;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public final Bundle confirmCredentials(@NotNull AccountAuthenticatorResponse response, Account account, Bundle bundle) {
        Intrinsics.checkNotNullParameter(response, "response");
        return null;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public final Bundle editProperties(@NotNull AccountAuthenticatorResponse response, String str) {
        Intrinsics.checkNotNullParameter(response, "response");
        return null;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    @NotNull
    public final Bundle getAccountRemovalAllowed(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account) {
        return androidx.core.os.d.b(new Pair("booleanResult", Boolean.FALSE));
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public final Bundle getAuthToken(@NotNull AccountAuthenticatorResponse response, @NotNull Account account, String str, Bundle bundle) {
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(account, "account");
        return null;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public final String getAuthTokenLabel(String str) {
        return null;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public final Bundle hasFeatures(@NotNull AccountAuthenticatorResponse response, Account account, String[] strArr) {
        Intrinsics.checkNotNullParameter(response, "response");
        return null;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public final Bundle updateCredentials(@NotNull AccountAuthenticatorResponse response, @NotNull Account account, String str, Bundle bundle) {
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(account, "account");
        return null;
    }
}
