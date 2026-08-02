package io.appmetrica.analytics.impl;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.ig, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0232ig implements Oa {

    /* renamed from: a, reason: collision with root package name */
    public final ICommonExecutor f13945a;

    /* renamed from: b, reason: collision with root package name */
    public final InstallReferrerClient f13946b;

    public C0232ig(@NotNull Context context, @NotNull ICommonExecutor iCommonExecutor) {
        this.f13945a = iCommonExecutor;
        this.f13946b = InstallReferrerClient.newBuilder(context).build();
    }

    public static final void b(InterfaceC0483sg interfaceC0483sg, Throwable th2) {
        interfaceC0483sg.a(th2);
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final void a(@NotNull InterfaceC0483sg interfaceC0483sg) throws Throwable {
        this.f13946b.startConnection(new C0207hg(this, interfaceC0483sg));
    }

    public final void a(InterfaceC0483sg interfaceC0483sg, Throwable th2) {
        this.f13945a.execute(new androidx.appcompat.app.t(19, interfaceC0483sg, th2));
    }
}
