package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.coreutils.internal.toggle.ConjunctiveCompositeThreadSafeToggle;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Kn {

    /* renamed from: a, reason: collision with root package name */
    public final E3 f12488a;

    /* renamed from: b, reason: collision with root package name */
    public final Do f12489b;

    /* renamed from: c, reason: collision with root package name */
    public final ConjunctiveCompositeThreadSafeToggle f12490c;

    public Kn(Toggle toggle) {
        E3 e32 = new E3(C0353na.k().y());
        this.f12488a = e32;
        Do r12 = new Do();
        this.f12489b = r12;
        this.f12490c = new ConjunctiveCompositeThreadSafeToggle(kotlin.collections.u.f(e32, r12, toggle == null ? new vo() : toggle), "loc-def");
    }
}
