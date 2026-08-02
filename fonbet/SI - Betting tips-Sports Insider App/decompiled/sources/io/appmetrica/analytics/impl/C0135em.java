package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.em, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0135em {

    /* renamed from: a, reason: collision with root package name */
    public final ProtobufStateStorage f13707a;

    /* renamed from: b, reason: collision with root package name */
    public final wo f13708b;

    public C0135em(ProtobufStateStorage protobufStateStorage, wo woVar) {
        this.f13707a = protobufStateStorage;
        this.f13708b = woVar;
    }

    public C0135em(Context context) {
        this(((Rm) Pm.a(C0264jm.class)).create(context), C0353na.k().D().a());
    }
}
