package com.vk.accountmanager.domain.interactor;

import android.accounts.AbstractAccountAuthenticator;
import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import com.vk.dto.common.id.UserId;
import java.util.Iterator;
import xsna.bpn0;
import xsna.dkq;
import xsna.epx;
import xsna.hp;
import xsna.j3r;
import xsna.kp;
import xsna.m5o0;
import xsna.mp;

/* compiled from: VkAccountAuthenticatorService.kt */
/* loaded from: classes14.dex */
public final class VkAccountAuthenticatorService extends Service {
    public static final /* synthetic */ int c = 0;
    public final bpn0 b = new bpn0(new m5o0(this, 11));

    /* compiled from: VkAccountAuthenticatorService.kt */
    public static final class a extends AbstractAccountAuthenticator {
        public final bpn0 a;
        public final bpn0 b;

        public a(Context context) {
            super(context);
            this.a = new bpn0(new j3r(context, 2));
            this.b = new bpn0(new dkq(context, 1));
        }

        public final kp a() {
            return (kp) this.b.getValue();
        }

        @Override // android.accounts.AbstractAccountAuthenticator
        public final Bundle addAccount(AccountAuthenticatorResponse accountAuthenticatorResponse, String str, String str2, String[] strArr, Bundle bundle) {
            return a().a(accountAuthenticatorResponse);
        }

        @Override // android.accounts.AbstractAccountAuthenticator
        public final Bundle confirmCredentials(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, Bundle bundle) {
            a().getClass();
            return null;
        }

        @Override // android.accounts.AbstractAccountAuthenticator
        public final Bundle editProperties(AccountAuthenticatorResponse accountAuthenticatorResponse, String str) {
            a().getClass();
            return null;
        }

        @Override // android.accounts.AbstractAccountAuthenticator
        public final Bundle getAccountRemovalAllowed(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account) {
            Object obj;
            UserId userId;
            Iterator<T> it = ((mp) this.a.getValue()).b().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (epx.f(((hp) next).b, account != null ? account.name : null)) {
                    obj = next;
                    break;
                }
            }
            hp hpVar = (hp) obj;
            if (hpVar == null || (userId = hpVar.a) == null) {
                userId = UserId.d;
            }
            Bundle accountRemovalAllowed = super.getAccountRemovalAllowed(accountAuthenticatorResponse, account);
            if (accountRemovalAllowed.getBoolean("booleanResult", false)) {
                a().b(userId);
            }
            return accountRemovalAllowed;
        }

        @Override // android.accounts.AbstractAccountAuthenticator
        public final Bundle getAuthToken(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String str, Bundle bundle) {
            a().getClass();
            return null;
        }

        @Override // android.accounts.AbstractAccountAuthenticator
        public final String getAuthTokenLabel(String str) {
            a().getClass();
            return null;
        }

        @Override // android.accounts.AbstractAccountAuthenticator
        public final Bundle hasFeatures(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String[] strArr) {
            a().getClass();
            return null;
        }

        @Override // android.accounts.AbstractAccountAuthenticator
        public final Bundle updateCredentials(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String str, Bundle bundle) {
            a().getClass();
            return null;
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        if (epx.f(intent != null ? intent.getAction() : null, "android.accounts.AccountAuthenticator")) {
            return ((AbstractAccountAuthenticator) this.b.getValue()).getIBinder();
        }
        return null;
    }
}
