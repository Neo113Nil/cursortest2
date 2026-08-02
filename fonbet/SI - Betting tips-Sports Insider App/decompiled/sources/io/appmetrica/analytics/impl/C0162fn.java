package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.fn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0162fn implements InterfaceC0491t {

    /* renamed from: b, reason: collision with root package name */
    public final C0541v f13778b;

    /* renamed from: a, reason: collision with root package name */
    public final C0516u f13777a = new C0516u();

    /* renamed from: c, reason: collision with root package name */
    public final gf.i f13779c = gf.k.b(new C0136en(this));

    public C0162fn(@NotNull Context context) {
        this.f13778b = new C0541v(context);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0491t
    @NotNull
    public final Map<String, String> a(@NotNull Map<String, String> map) {
        map.putAll((Map) this.f13779c.getValue());
        return map;
    }
}
