package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.cd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0075cd {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f13518a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0538ul f13519b;

    /* renamed from: c, reason: collision with root package name */
    public final String f13520c;

    /* renamed from: d, reason: collision with root package name */
    public final SystemTimeProvider f13521d;

    public C0075cd(IHandlerExecutor iHandlerExecutor, AbstractC0630yd abstractC0630yd, String str, SystemTimeProvider systemTimeProvider) {
        this.f13518a = iHandlerExecutor;
        this.f13519b = abstractC0630yd;
        this.f13520c = str;
        this.f13521d = systemTimeProvider;
    }

    public static final void a(C0075cd c0075cd, List list) {
        Qj qj = AbstractC0387oj.f14425a;
        C0126ed c0126ed = new C0126ed(c0075cd.f13519b, c0075cd.f13520c, c0075cd.f13521d, list);
        qj.getClass();
        qj.a(new Ej(c0126ed));
    }

    public final void a(ArrayList arrayList) {
        this.f13518a.execute(new androidx.appcompat.app.t(17, this, arrayList));
    }
}
