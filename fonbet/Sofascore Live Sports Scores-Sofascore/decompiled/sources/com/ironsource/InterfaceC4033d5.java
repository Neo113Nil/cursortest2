package com.ironsource;

import com.ironsource.sdk.utils.IronSourceStorageUtils;
import defpackage.p2g;
import defpackage.u2g;
import defpackage.w2g;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.d5, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC4033d5<T> extends Nc {
    void b(@NotNull C4376w8 c4376w8);

    @NotNull
    String c();

    @NotNull
    V5 d();

    @NotNull
    Function1<w2g, Unit> i();

    default boolean j() {
        return k().exists();
    }

    @NotNull
    C4376w8 k();

    @NotNull
    InterfaceC4357v7 l();

    default void m() {
        l().a(this);
        if (k().exists()) {
            IronSourceStorageUtils.deleteFile(k());
        }
        try {
            l().a(k(), d().value(), 5, 5);
        } catch (Exception e) {
            C4157k4.d().a(e);
            Function1<w2g, Unit> i = i();
            p2g p2gVar = w2g.b;
            i.invoke(new w2g(new u2g(e)));
        }
    }
}
