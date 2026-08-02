package io.appmetrica.analytics.impl;

import android.content.Context;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Id {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f12382a;

    public Id(Nd nd) {
        this.f12382a = nd;
    }

    public final Jd a(Context context, Sg sg2) {
        return new Jd(context, sg2, this.f12382a, new com.google.firebase.messaging.k(29), EnumC0047bb.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF, "actual");
    }

    public final Jd b(Context context, Sg sg2) {
        return new Jd(context, sg2, this.f12382a, new ap(0), EnumC0047bb.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF, "prev session");
    }

    public static final InterfaceC0031al a(G0 g02) {
        return new Gd(g02.f12250f.f12296d);
    }

    public static final InterfaceC0031al b(G0 g02) {
        return new X();
    }
}
