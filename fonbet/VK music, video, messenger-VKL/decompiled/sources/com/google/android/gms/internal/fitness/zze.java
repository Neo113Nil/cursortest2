package com.google.android.gms.internal.fitness;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.c;
import java.util.Set;
import xsna.e43;
import xsna.exc0;
import xsna.olc;
import xsna.u2u;
import xsna.ya01;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
public abstract class zze extends u2u {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zze(Context context, Looper looper, int i, c.b bVar, c.InterfaceC0114c interfaceC0114c, olc olcVar) {
        super(context, looper, i - 2, olcVar, bVar, interfaceC0114c);
        if (i == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    @Override // xsna.rd6
    public final Feature[] getApiFeatures() {
        return ya01.a;
    }

    @Override // xsna.rd6, com.google.android.gms.common.api.a.f
    public int getMinApkVersion() {
        return 12451000;
    }

    @Override // xsna.u2u, com.google.android.gms.common.api.a.f
    public final Set getScopesForConnectionlessNonSignIn() {
        return getScopes();
    }

    @Override // xsna.rd6
    public final boolean requiresAccount() {
        return true;
    }

    @Override // xsna.rd6, com.google.android.gms.common.api.a.f
    public final boolean requiresSignIn() {
        boolean z;
        if (getAccount() != null) {
            Account account = getAccount();
            exc0.i(account);
            if ("local_no_account".equals(account.name)) {
                z = true;
                return e43.i(getContext()) && !z;
            }
        }
        z = false;
        if (e43.i(getContext())) {
        }
    }
}
