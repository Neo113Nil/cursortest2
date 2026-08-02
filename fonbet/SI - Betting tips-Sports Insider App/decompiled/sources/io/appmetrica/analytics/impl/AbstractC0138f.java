package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0138f implements InterfaceC0143f4 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f13710a;

    /* renamed from: b, reason: collision with root package name */
    public final Bg f13711b;

    public AbstractC0138f(@NonNull Context context, @NonNull Bg bg2) {
        this.f13710a = context.getApplicationContext();
        this.f13711b = bg2;
        bg2.a(this);
        C0353na.k().n().b(this);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0143f4
    public final void a(@NonNull P5 p52, @NonNull C0397p4 c0397p4) {
        b(p52, c0397p4);
    }

    @NonNull
    public final Bg b() {
        return this.f13711b;
    }

    public abstract void b(@NonNull P5 p52, @NonNull C0397p4 c0397p4);

    @NonNull
    public final Context c() {
        return this.f13710a;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0143f4
    public final void a() {
        this.f13711b.b(this);
        C0353na.I.m().a(this);
    }
}
