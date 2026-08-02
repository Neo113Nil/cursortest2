package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import m8.InterfaceC8103a;
import m8.InterfaceC8104b;
import m8.InterfaceC8105c;
import m8.InterfaceC8106d;
import n8.C8451a;

@SuppressLint({"ThreadPoolCreation"})
/* loaded from: classes.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* renamed from: a, reason: collision with root package name */
    static final n8.r<ScheduledExecutorService> f59497a = new n8.r<>(new q());

    /* renamed from: b, reason: collision with root package name */
    static final n8.r<ScheduledExecutorService> f59498b = new n8.r<>(new r());

    /* renamed from: c, reason: collision with root package name */
    static final n8.r<ScheduledExecutorService> f59499c = new n8.r<>(new s());

    /* renamed from: d, reason: collision with root package name */
    static final n8.r<ScheduledExecutorService> f59500d = new n8.r<>(new t());

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<C8451a<?>> getComponents() {
        C8451a.C1292a d11 = C8451a.d(new n8.w(InterfaceC8103a.class, ScheduledExecutorService.class), new n8.w(InterfaceC8103a.class, ExecutorService.class), new n8.w(InterfaceC8103a.class, Executor.class));
        d11.f(new u());
        C8451a d12 = d11.d();
        C8451a.C1292a d13 = C8451a.d(new n8.w(InterfaceC8104b.class, ScheduledExecutorService.class), new n8.w(InterfaceC8104b.class, ExecutorService.class), new n8.w(InterfaceC8104b.class, Executor.class));
        d13.f(new v());
        C8451a d14 = d13.d();
        C8451a.C1292a d15 = C8451a.d(new n8.w(InterfaceC8105c.class, ScheduledExecutorService.class), new n8.w(InterfaceC8105c.class, ExecutorService.class), new n8.w(InterfaceC8105c.class, Executor.class));
        d15.f(new w());
        C8451a d16 = d15.d();
        C8451a.C1292a c11 = C8451a.c(new n8.w(InterfaceC8106d.class, Executor.class));
        c11.f(new x());
        return Arrays.asList(d12, d14, d16, c11.d());
    }
}
