package io.appmetrica.analytics.impl;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.x5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0597x5 implements F8, S8 {

    /* renamed from: a, reason: collision with root package name */
    public final L6 f14905a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f14906b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicLong f14907c;

    public C0597x5(@NotNull L6 l6) {
        this.f14905a = l6;
        Integer[] elements = {Integer.valueOf(EnumC0047bb.EVENT_CLIENT_EXTERNAL_ATTRIBUTION.a()), Integer.valueOf(EnumC0047bb.EVENT_TYPE_APP_UPDATE.a()), Integer.valueOf(EnumC0047bb.EVENT_TYPE_FIRST_ACTIVATION.a()), Integer.valueOf(EnumC0047bb.EVENT_TYPE_INIT.a()), Integer.valueOf(EnumC0047bb.EVENT_TYPE_SEND_AD_REVENUE_EVENT.a()), Integer.valueOf(EnumC0047bb.EVENT_TYPE_SEND_ECOMMERCE_EVENT.a()), Integer.valueOf(EnumC0047bb.EVENT_TYPE_SEND_REFERRER.a()), Integer.valueOf(EnumC0047bb.EVENT_TYPE_SEND_REVENUE_EVENT.a())};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Set B = kotlin.collections.p.B(elements);
        this.f14906b = B;
        this.f14907c = new AtomicLong(l6.a(B));
        l6.a(this);
    }

    @Override // io.appmetrica.analytics.impl.S8
    public final void a() {
        this.f14907c.set(this.f14905a.a(this.f14906b));
    }

    @Override // io.appmetrica.analytics.impl.F8
    public final boolean b() {
        return this.f14907c.get() > 0;
    }

    @Override // io.appmetrica.analytics.impl.S8
    public final void b(@NotNull List<Integer> list) {
        int i5 = 0;
        if (list == null || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (this.f14906b.contains(Integer.valueOf(((Number) it.next()).intValue())) && (i5 = i5 + 1) < 0) {
                    kotlin.collections.u.i();
                    throw null;
                }
            }
        }
        this.f14907c.addAndGet(-i5);
    }

    @Override // io.appmetrica.analytics.impl.S8
    public final void a(@NotNull List<Integer> list) {
        int i5 = 0;
        if (list == null || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (this.f14906b.contains(Integer.valueOf(((Number) it.next()).intValue())) && (i5 = i5 + 1) < 0) {
                    kotlin.collections.u.i();
                    throw null;
                }
            }
        }
        this.f14907c.addAndGet(i5);
    }
}
