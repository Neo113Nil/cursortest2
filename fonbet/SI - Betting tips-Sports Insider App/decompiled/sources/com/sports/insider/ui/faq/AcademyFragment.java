package com.sports.insider.ui.faq;

import androidx.lifecycle.m1;
import androidx.lifecycle.o1;
import com.google.android.gms.internal.measurement.d5;
import com.google.firebase.messaging.x;
import com.sports.insider.MyApp;
import eg.c0;
import eg.m0;
import fe.a;
import fe.c;
import jg.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import lg.e;
import y1.r;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sports/insider/ui/faq/AcademyFragment;", "Lcom/sports/insider/ui/faq/FaqFragment;", "<init>", "()V", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AcademyFragment extends FaqFragment {
    @Override // com.sports.insider.ui.faq.FaqFragment
    public final c G() {
        Intrinsics.checkNotNullParameter(this, "fragment");
        Intrinsics.checkNotNullParameter(this, "owner");
        o1 store = getViewModelStore();
        Intrinsics.checkNotNullParameter(this, "owner");
        m1 factory = getDefaultViewModelProviderFactory();
        Intrinsics.checkNotNullParameter(this, "owner");
        t1.c defaultCreationExtras = getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        x xVar = new x(store, factory, defaultCreationExtras);
        Intrinsics.checkNotNullParameter(a.class, "modelClass");
        Intrinsics.checkNotNullParameter(a.class, "<this>");
        ag.c modelClass = Reflection.getOrCreateKotlinClass(a.class);
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        String r5 = d5.r(modelClass);
        if (r5 != null) {
            return (a) xVar.x(modelClass, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r5));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // com.sports.insider.ui.faq.FaqFragment, ud.a
    public final void c(String str) {
        try {
            r r5 = a.a.r(this);
            td.a aVar = new td.a();
            aVar.f23854a.put("destination", str);
            Intrinsics.checkNotNullExpressionValue(aVar, "setDestination(...)");
            r5.d(aVar);
        } catch (Exception ex) {
            Intrinsics.checkNotNullParameter(ex, "ex");
            d dVar = MyApp.f6830c;
            e eVar = m0.f9201a;
            c0.t(dVar, lg.d.f20063c, null, new q4.r(ex, null, 18), 2);
        }
    }
}
