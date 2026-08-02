package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.fa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0149fa implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0332me f13729a;

    public C0149fa() {
        this(new Sl());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0464rm fromModel(@NonNull C0297l4 c0297l4) {
        C0464rm c0464rm = new C0464rm();
        c0464rm.f14583b = c0297l4.f14165b;
        c0464rm.f14582a = c0297l4.f14164a;
        c0464rm.f14584c = c0297l4.f14166c;
        c0464rm.f14585d = c0297l4.f14167d;
        c0464rm.f14586e = c0297l4.f14168e;
        c0464rm.f14587f = this.f13729a.a(c0297l4.f14169f);
        return c0464rm;
    }

    public C0149fa(Sl sl) {
        this.f13729a = sl;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0297l4 toModel(@NonNull C0464rm c0464rm) {
        C0246j4 c0246j4 = new C0246j4();
        c0246j4.f14002d = c0464rm.f14585d;
        c0246j4.f14001c = c0464rm.f14584c;
        c0246j4.f14000b = c0464rm.f14583b;
        c0246j4.f13999a = c0464rm.f14582a;
        c0246j4.f14003e = c0464rm.f14586e;
        c0246j4.f14004f = this.f13729a.a(c0464rm.f14587f);
        return new C0297l4(c0246j4);
    }
}
