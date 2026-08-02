package ru.ozon.android.messenger.framework.presentation.ai;

import Ae.C2399j;
import kotlin.collections.C7705l;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class K0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String[] f89279a = {ru.ozon.android.messenger.framework.navigation.action.d.AI_SEND_MESSAGE.a(), ru.ozon.android.messenger.framework.navigation.action.d.ON_CHAT_BUTTONS_CLICK.a()};

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Ae.x0<Boolean> f89280b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Ae.M0<Boolean> f89281c;

    public K0() {
        Ae.x0<Boolean> a11 = Ae.O0.a(Boolean.TRUE);
        this.f89280b = a11;
        this.f89281c = C2399j.b(a11);
    }

    public final void a() {
        this.f89280b.setValue(Boolean.FALSE);
    }

    @NotNull
    public final Ae.M0<Boolean> b() {
        return this.f89281c;
    }

    public final boolean c(String str) {
        if (C7705l.m(this.f89279a, str)) {
            return this.f89280b.b(Boolean.TRUE, Boolean.FALSE);
        }
        return true;
    }

    public final void d() {
        this.f89280b.setValue(Boolean.TRUE);
    }
}
