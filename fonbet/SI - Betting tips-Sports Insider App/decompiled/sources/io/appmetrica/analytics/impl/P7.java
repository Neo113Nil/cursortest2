package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class P7 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f12742a;

    /* renamed from: b, reason: collision with root package name */
    public final ProtobufStateStorage f12743b;

    /* renamed from: c, reason: collision with root package name */
    public final R7 f12744c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0060bo f12745d;

    /* renamed from: e, reason: collision with root package name */
    public final Im f12746e;

    /* renamed from: f, reason: collision with root package name */
    public final Ui f12747f;

    /* renamed from: g, reason: collision with root package name */
    public final Si f12748g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC0648z6 f12749h;

    /* renamed from: i, reason: collision with root package name */
    public Q7 f12750i;

    public P7(Context context, ProtobufStateStorage protobufStateStorage, R7 r72, InterfaceC0060bo interfaceC0060bo, Im im, Ui ui, Si si, InterfaceC0648z6 interfaceC0648z6, Q7 q72) {
        this.f12742a = context;
        this.f12743b = protobufStateStorage;
        this.f12744c = r72;
        this.f12745d = interfaceC0060bo;
        this.f12746e = im;
        this.f12747f = ui;
        this.f12748g = si;
        this.f12749h = interfaceC0648z6;
        this.f12750i = q72;
    }

    @NotNull
    public final synchronized Q7 a() {
        return this.f12750i;
    }

    public final synchronized boolean b(@NotNull T7 t72) {
        boolean z5;
        try {
            if (t72.a() == S7.f12861b) {
                return false;
            }
            if (Intrinsics.areEqual(t72, this.f12750i.b())) {
                return false;
            }
            List list = (List) this.f12745d.invoke(this.f12750i.a(), t72);
            boolean z7 = list != null;
            if (list == null) {
                list = this.f12750i.a();
            }
            if (this.f12744c.a(t72, this.f12750i.b())) {
                z5 = true;
            } else {
                t72 = (T7) this.f12750i.b();
                z5 = false;
            }
            if (z5 || z7) {
                Q7 q72 = this.f12750i;
                Q7 q73 = (Q7) this.f12746e.invoke(t72, list);
                this.f12750i = q73;
                this.f12743b.save(q73);
                AbstractC0158fj.a("Update distribution data: %s -> %s", q72, this.f12750i);
            }
            return z5;
        } finally {
        }
    }

    public final synchronized T7 c() {
        try {
            if (!this.f12748g.a()) {
                T7 t72 = (T7) this.f12747f.invoke();
                this.f12748g.b();
                if (t72 != null) {
                    b(t72);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (T7) this.f12750i.b();
    }

    @NotNull
    public final T7 a(@NotNull T7 t72) {
        T7 c2;
        this.f12749h.a(this.f12742a);
        synchronized (this) {
            b(t72);
            c2 = c();
        }
        return c2;
    }

    @NotNull
    public final T7 b() {
        this.f12749h.a(this.f12742a);
        return c();
    }
}
