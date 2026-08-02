package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import java.util.HashSet;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.h2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0193h2 extends Rg {

    /* renamed from: b, reason: collision with root package name */
    public final xo f13865b;

    /* renamed from: c, reason: collision with root package name */
    public final Xj f13866c;

    public C0193h2(@NonNull X4 x42) {
        this(x42, x42.u(), Xj.c());
    }

    @Override // io.appmetrica.analytics.impl.Rg
    public final boolean a(@NonNull P5 p52) {
        X4 x42 = this.f12818a;
        if (!this.f13865b.c() && !this.f13865b.d()) {
            if (((C0285kh) x42.f13151k.a()).f14126e) {
                this.f13866c.b();
            }
            M8 m82 = this.f12818a.f13152l;
            if (m82.f12575c == null) {
                m82.a();
            }
            O8 o82 = m82.f12575c;
            o82.getClass();
            o82.f12683b = new HashSet();
            o82.f12685d = 0;
            O8 o83 = m82.f12575c;
            o83.f12682a = true;
            R8 r82 = m82.f12574b;
            IBinaryDataHelper iBinaryDataHelper = r82.f12810c;
            Q8 q82 = r82.f12809b;
            r82.f12808a.getClass();
            iBinaryDataHelper.insert("event_hashes", q82.toByteArray((Q8) P8.a(o83)));
        }
        return false;
    }

    public C0193h2(X4 x42, xo xoVar, Xj xj) {
        super(x42);
        this.f13865b = xoVar;
        this.f13866c = xj;
    }
}
