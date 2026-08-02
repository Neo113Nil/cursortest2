package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.C3117a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.internal.InterfaceC3128f;
import com.google.android.gms.common.api.internal.InterfaceC3146o;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.common.internal.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3181e extends AbstractC3179c implements C3117a.f, F {
    private static volatile Executor zaa;
    private final C3180d zab;
    private final Set zac;
    private final Account zad;

    public AbstractC3181e(Context context, Looper looper, int i10, C3180d c3180d, f.b bVar, f.c cVar) {
        this(context, looper, i10, c3180d, (InterfaceC3128f) bVar, (InterfaceC3146o) cVar);
    }

    public final Set f(Set set) {
        Set<Scope> validateScopes = validateScopes(set);
        Iterator<Scope> it = validateScopes.iterator();
        while (it.hasNext()) {
            if (!set.contains(it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return validateScopes;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3179c
    public final Account getAccount() {
        return this.zad;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3179c
    public Executor getBindServiceExecutor() {
        return null;
    }

    @NonNull
    public final C3180d getClientSettings() {
        return this.zab;
    }

    @NonNull
    public Feature[] getRequiredFeatures() {
        return new Feature[0];
    }

    @Override // com.google.android.gms.common.internal.AbstractC3179c
    @NonNull
    public final Set<Scope> getScopes() {
        return this.zac;
    }

    @Override // com.google.android.gms.common.api.C3117a.f
    @NonNull
    public Set<Scope> getScopesForConnectionlessNonSignIn() {
        return requiresSignIn() ? this.zac : Collections.EMPTY_SET;
    }

    @NonNull
    public Set<Scope> validateScopes(@NonNull Set<Scope> set) {
        return set;
    }

    public AbstractC3181e(Context context, Looper looper, int i10, C3180d c3180d, InterfaceC3128f interfaceC3128f, InterfaceC3146o interfaceC3146o) {
        this(context, looper, AbstractC3182f.b(context), GoogleApiAvailability.r(), i10, c3180d, (InterfaceC3128f) AbstractC3191o.m(interfaceC3128f), (InterfaceC3146o) AbstractC3191o.m(interfaceC3146o));
    }

    public AbstractC3181e(Context context, Looper looper, AbstractC3182f abstractC3182f, GoogleApiAvailability googleApiAvailability, int i10, C3180d c3180d, InterfaceC3128f interfaceC3128f, InterfaceC3146o interfaceC3146o) {
        super(context, looper, abstractC3182f, googleApiAvailability, i10, interfaceC3128f == null ? null : new D(interfaceC3128f), interfaceC3146o != null ? new E(interfaceC3146o) : null, c3180d.j());
        this.zab = c3180d;
        this.zad = c3180d.a();
        this.zac = f(c3180d.d());
    }
}
