package com.plaid.internal;

import android.net.ConnectivityManager;
import android.net.Network;
import com.plaid.internal.AbstractC3782w7;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.SafeContinuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class K extends ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ L f39317a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f39318b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SafeContinuation f39319c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ConnectivityManager f39320d;

    public K(L l10, String str, SafeContinuation safeContinuation, ConnectivityManager connectivityManager) {
        this.f39317a = l10;
        this.f39318b = str;
        this.f39319c = safeContinuation;
        this.f39320d = connectivityManager;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(@NotNull Network network) {
        Intrinsics.checkNotNullParameter(network, "network");
        try {
            try {
                this.f39319c.resumeWith(Result.m147constructorimpl(this.f39317a.f39329b.a(this.f39318b, network)));
            } catch (AbstractC3782w7.c e10) {
                SafeContinuation safeContinuation = this.f39319c;
                Result.Companion companion = Result.INSTANCE;
                safeContinuation.resumeWith(Result.m147constructorimpl(ResultKt.createFailure(e10)));
            }
        } finally {
            this.f39320d.unregisterNetworkCallback(this);
        }
    }
}
