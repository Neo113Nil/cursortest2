package com.google.android.gms.wallet;

import Ej.b;
import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.wallet.wobs.WalletObjects;
import java.util.Locale;

/* loaded from: classes.dex */
public final class Wallet {
    public static final Api<WalletOptions> API;
    private static final Api.ClientKey<com.google.android.gms.internal.wallet.zzaa> CLIENT_KEY;
    private static final Api.AbstractClientBuilder<com.google.android.gms.internal.wallet.zzaa, WalletOptions> zzei;

    @Deprecated
    private static final zzaa zzej;
    private static final WalletObjects zzek;

    @ShowFirstParty
    private static final com.google.android.gms.internal.wallet.zzm zzel;

    public static final class WalletOptions implements Api.ApiOptions.HasAccountOptions {

        @ShowFirstParty
        private final Account account;
        public final int environment;
        public final int theme;
        final boolean zzem;

        public static final class Builder {
            private int environment = 3;
            private int theme = 1;
            private boolean zzem = true;

            public final WalletOptions build() {
                return new WalletOptions(this, null);
            }

            public final Builder setEnvironment(int i11) {
                if (i11 == 0 || i11 == 0 || i11 == 2 || i11 == 1 || i11 == 23 || i11 == 3) {
                    this.environment = i11;
                    return this;
                }
                Locale locale = Locale.US;
                throw new IllegalArgumentException(b.a(i11, "Invalid environment value "));
            }

            public final Builder setTheme(int i11) {
                if (i11 == 0 || i11 == 1 || i11 == 2 || i11 == 3) {
                    this.theme = i11;
                    return this;
                }
                Locale locale = Locale.US;
                throw new IllegalArgumentException(b.a(i11, "Invalid theme value "));
            }

            @Deprecated
            public final Builder useGoogleWallet() {
                this.zzem = false;
                return this;
            }
        }

        private WalletOptions() {
            this(new Builder());
        }

        public final boolean equals(Object obj) {
            if (obj instanceof WalletOptions) {
                WalletOptions walletOptions = (WalletOptions) obj;
                if (Objects.equal(Integer.valueOf(this.environment), Integer.valueOf(walletOptions.environment)) && Objects.equal(Integer.valueOf(this.theme), Integer.valueOf(walletOptions.theme)) && Objects.equal(null, null) && Objects.equal(Boolean.valueOf(this.zzem), Boolean.valueOf(walletOptions.zzem))) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.android.gms.common.api.Api.ApiOptions.HasAccountOptions
        public final Account getAccount() {
            return null;
        }

        public final int hashCode() {
            return Objects.hashCode(Integer.valueOf(this.environment), Integer.valueOf(this.theme), null, Boolean.valueOf(this.zzem));
        }

        private WalletOptions(Builder builder) {
            this.environment = builder.environment;
            this.theme = builder.theme;
            this.zzem = builder.zzem;
            this.account = null;
        }

        /* synthetic */ WalletOptions(Builder builder, zzaj zzajVar) {
            this(builder);
        }

        /* synthetic */ WalletOptions(zzaj zzajVar) {
            this();
        }
    }

    /* loaded from: classes9.dex */
    public static abstract class zza<R extends Result> extends BaseImplementation.ApiMethodImpl<R, com.google.android.gms.internal.wallet.zzaa> {
        public zza(GoogleApiClient googleApiClient) {
            super(Wallet.API, googleApiClient);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
        /* renamed from: zza, reason: merged with bridge method [inline-methods] */
        public abstract void doExecute(com.google.android.gms.internal.wallet.zzaa zzaaVar) throws RemoteException;
    }

    /* loaded from: classes9.dex */
    public static abstract class zzb extends zza<Status> {
        public zzb(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        @Override // com.google.android.gms.common.api.internal.BasePendingResult
        protected /* synthetic */ Result createFailedResult(Status status) {
            return status;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.wallet.zzx, com.google.android.gms.wallet.zzaa] */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.gms.internal.wallet.zzag, com.google.android.gms.internal.wallet.zzm] */
    static {
        Api.ClientKey<com.google.android.gms.internal.wallet.zzaa> clientKey = new Api.ClientKey<>();
        CLIENT_KEY = clientKey;
        zzaj zzajVar = new zzaj();
        zzei = zzajVar;
        API = new Api<>("Wallet.API", zzajVar, clientKey);
        zzej = new com.google.android.gms.internal.wallet.zzx();
        zzek = new com.google.android.gms.internal.wallet.zzaf();
        zzel = new com.google.android.gms.internal.wallet.zzag();
    }

    private Wallet() {
    }

    public static PaymentsClient getPaymentsClient(@NonNull Activity activity, @NonNull WalletOptions walletOptions) {
        return new PaymentsClient(activity, walletOptions);
    }

    public static WalletObjectsClient getWalletObjectsClient(@NonNull Activity activity, WalletOptions walletOptions) {
        return new WalletObjectsClient(activity, walletOptions);
    }

    public static PaymentsClient getPaymentsClient(@NonNull Context context, @NonNull WalletOptions walletOptions) {
        return new PaymentsClient(context, walletOptions);
    }
}
