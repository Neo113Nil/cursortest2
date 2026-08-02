package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.Iterator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class F2 {

    /* renamed from: a, reason: collision with root package name */
    public final Ff f12216a;

    /* renamed from: b, reason: collision with root package name */
    public final Ea f12217b;

    public F2(Ff ff2, Ea ea2) {
        this.f12216a = ff2;
        this.f12217b = ea2;
    }

    public final boolean a(@NonNull P5 p52, @NonNull E2 e22) {
        Iterator it = ((V8) this.f12216a.a(p52.f12730d)).f13029a.iterator();
        while (it.hasNext()) {
            if (e22.a(it.next(), p52)) {
                return true;
            }
        }
        return false;
    }

    public final Ff b() {
        return this.f12216a;
    }

    public final Ea a() {
        return this.f12217b;
    }
}
