package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.hm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0213hm implements InterfaceC0290km {

    /* renamed from: a, reason: collision with root package name */
    public volatile C0161fm f13905a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f13906b = new CopyOnWriteArrayList();

    @Override // io.appmetrica.analytics.impl.InterfaceC0290km
    public final void a(@NotNull C0161fm c0161fm) {
        this.f13905a = c0161fm;
        Iterator it = this.f13906b.iterator();
        while (it.hasNext()) {
            ((InterfaceC0290km) it.next()).a(c0161fm);
        }
    }

    @NotNull
    public final C0161fm b() {
        C0161fm c0161fm = this.f13905a;
        if (c0161fm != null) {
            return c0161fm;
        }
        Intrinsics.throwUninitializedPropertyAccessException("startupState");
        return null;
    }

    public final void b(@NotNull InterfaceC0290km interfaceC0290km) {
        this.f13906b.remove(interfaceC0290km);
    }

    public final void a(@NotNull InterfaceC0290km interfaceC0290km) {
        this.f13906b.add(interfaceC0290km);
        if (this.f13905a != null) {
            C0161fm c0161fm = this.f13905a;
            if (c0161fm == null) {
                Intrinsics.throwUninitializedPropertyAccessException("startupState");
                c0161fm = null;
            }
            interfaceC0290km.a(c0161fm);
        }
    }

    public final void a(@NotNull Context context) {
        String optStringOrNull;
        ProtobufStateStorage<Object> create = ((Rm) Pm.a(C0264jm.class)).create(context);
        wo a7 = C0353na.k().D().a();
        synchronized (a7) {
            optStringOrNull = JsonUtils.optStringOrNull(a7.f14882a.a(), "device_id");
        }
        a(new C0161fm(optStringOrNull, a7.a(), (C0264jm) create.read()));
    }
}
