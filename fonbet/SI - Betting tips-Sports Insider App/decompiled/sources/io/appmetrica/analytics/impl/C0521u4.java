package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.u4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0521u4 implements InterfaceC0143f4 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f14698a;

    /* renamed from: b, reason: collision with root package name */
    public final C0596x4 f14699b;

    /* renamed from: c, reason: collision with root package name */
    public final ResultReceiver f14700c;

    public C0521u4(@NonNull Context context, @NonNull C0596x4 c0596x4, @NonNull C0397p4 c0397p4) {
        this.f14698a = context;
        this.f14699b = c0596x4;
        this.f14700c = c0397p4.f14457c;
        c0596x4.a(this);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0143f4
    public final void a(@NonNull P5 p52, @NonNull C0397p4 c0397p4) {
        this.f14699b.a(c0397p4.f14456b);
        this.f14699b.a(p52, this);
    }

    @NonNull
    public final C0596x4 b() {
        return this.f14699b;
    }

    @NonNull
    public final Context c() {
        return this.f14698a;
    }

    @NonNull
    public final ResultReceiver d() {
        return this.f14700c;
    }

    public final void a(@NonNull S3 s32) {
        B6.a(this.f14700c, s32);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0143f4
    public final void a() {
        this.f14699b.b(this);
    }
}
