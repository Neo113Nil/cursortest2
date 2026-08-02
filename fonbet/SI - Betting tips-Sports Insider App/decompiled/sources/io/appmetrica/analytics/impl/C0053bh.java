package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.bh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0053bh extends Rg {

    /* renamed from: b, reason: collision with root package name */
    public final C0581we f13448b;

    /* renamed from: c, reason: collision with root package name */
    public final ProtobufStateStorage f13449c;

    /* renamed from: d, reason: collision with root package name */
    public final C0619y2 f13450d;

    /* renamed from: e, reason: collision with root package name */
    public final C0064c2 f13451e;

    /* renamed from: f, reason: collision with root package name */
    public final C0444r2 f13452f;

    public C0053bh(X4 x42, C0581we c0581we) {
        this(x42, c0581we, ((Rm) Pm.a(T1.class)).create(x42.getContext()), new C0619y2(x42.getContext()), new C0064c2(), new C0444r2(x42.getContext()));
    }

    @Override // io.appmetrica.analytics.impl.Rg
    public final boolean a(@NonNull P5 p52) {
        X4 x42 = this.f12818a;
        x42.f13143b.toString();
        if (!x42.f13159t.c() || !x42.x()) {
            return false;
        }
        T1 t12 = (T1) this.f13449c.read();
        List list = t12.f12896a;
        C0594x2 c0594x2 = t12.f12897b;
        C0619y2 c0619y2 = this.f13450d;
        c0619y2.getClass();
        T1 t13 = null;
        C0594x2 a7 = AndroidUtils.isApiAchieved(28) ? C0519u2.a(c0619y2.f14944a, c0619y2.f14945b) : null;
        List list2 = t12.f12898c;
        List list3 = (List) SystemServiceUtils.accessSystemServiceSafelyOrDefault(this.f13452f.f14540a, "getting available providers", "location manager", Collections.EMPTY_LIST, new C0420q2());
        C0581we c0581we = this.f13448b;
        Context context = this.f12818a.f13142a;
        c0581we.getClass();
        ArrayList a10 = new Pi(context, new SafePackageManager()).a();
        if (CollectionUtils.areCollectionsEqual(a10, list)) {
            a10 = null;
        }
        if (a10 != null || !lo.a(c0594x2, a7) || !CollectionUtils.areCollectionsEqual(list2, list3)) {
            if (a10 != null) {
                list = a10;
            }
            t13 = new T1(list, a7, list3);
        }
        if (t13 != null) {
            C0277k9 c0277k9 = x42.f13154n;
            P5 a11 = P5.a(p52, t13.f12896a, t13.f12897b, this.f13451e, t13.f12898c);
            c0277k9.a(a11, Rk.a(c0277k9.f14108c.b(a11), a11.f12735i));
            long currentTimeSeconds = c0277k9.f14114i.currentTimeSeconds();
            c0277k9.f14115k = currentTimeSeconds;
            c0277k9.f14106a.a(currentTimeSeconds).b();
            this.f13449c.save(t13);
            return false;
        }
        if (!x42.A()) {
            return false;
        }
        C0277k9 c0277k92 = x42.f13154n;
        P5 a12 = P5.a(p52, t12.f12896a, t12.f12897b, this.f13451e, t12.f12898c);
        c0277k92.a(a12, Rk.a(c0277k92.f14108c.b(a12), a12.f12735i));
        long currentTimeSeconds2 = c0277k92.f14114i.currentTimeSeconds();
        c0277k92.f14115k = currentTimeSeconds2;
        c0277k92.f14106a.a(currentTimeSeconds2).b();
        return false;
    }

    public C0053bh(X4 x42, C0581we c0581we, ProtobufStateStorage protobufStateStorage, C0619y2 c0619y2, C0064c2 c0064c2, C0444r2 c0444r2) {
        super(x42);
        this.f13448b = c0581we;
        this.f13449c = protobufStateStorage;
        this.f13450d = c0619y2;
        this.f13451e = c0064c2;
        this.f13452f = c0444r2;
    }
}
