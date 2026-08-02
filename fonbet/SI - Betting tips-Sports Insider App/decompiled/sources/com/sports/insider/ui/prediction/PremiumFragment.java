package com.sports.insider.ui.prediction;

import ag.c;
import android.os.Bundle;
import com.sports.insider.MyApp;
import eg.c0;
import eg.m0;
import gf.k;
import gf.t;
import i3.i;
import java.lang.reflect.Method;
import java.util.Arrays;
import jg.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import lg.e;
import me.a;
import me.d0;
import me.e0;
import me.f0;
import me.g0;
import u6.h;
import y1.j;
import y1.r;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sports/insider/ui/prediction/PremiumFragment;", "Lcom/sports/insider/ui/prediction/PredictionFragment;", "<init>", "()V", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPremiumFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PremiumFragment.kt\ncom/sports/insider/ui/prediction/PremiumFragment\n+ 2 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n*L\n1#1,40:1\n42#2,3:41\n*S KotlinDebug\n*F\n+ 1 PremiumFragment.kt\ncom/sports/insider/ui/prediction/PremiumFragment\n*L\n17#1:41,3\n*E\n"})
/* loaded from: classes.dex */
public final class PremiumFragment extends PredictionFragment {
    public final t F = k.b(new a(2, this));

    @Override // com.sports.insider.ui.prediction.PredictionFragment
    public final void M() {
        try {
            r r5 = a.a.r(this);
            e0 e0Var = new e0();
            e0Var.f20647a.put("destination", "Responsible");
            Intrinsics.checkNotNullExpressionValue(e0Var, "setDestination(...)");
            r5.d(e0Var);
        } catch (Exception ex) {
            Intrinsics.checkNotNullParameter(ex, "ex");
            d dVar = MyApp.f6830c;
            e eVar = m0.f9201a;
            c0.t(dVar, lg.d.f20063c, null, new q4.r(ex, null, 18), 2);
        }
    }

    @Override // com.sports.insider.ui.prediction.PredictionFragment
    public final int O() {
        c navArgsClass = Reflection.getOrCreateKotlinClass(d0.class);
        i argumentProducer = new i(11, this);
        Intrinsics.checkNotNullParameter(navArgsClass, "navArgsClass");
        Intrinsics.checkNotNullParameter(argumentProducer, "argumentProducer");
        Bundle bundle = (Bundle) argumentProducer.invoke();
        s.e eVar = j.f25572b;
        Method method = (Method) eVar.get(navArgsClass);
        if (method == null) {
            method = h.k(navArgsClass).getMethod("fromBundle", (Class[]) Arrays.copyOf(j.f25571a, 1));
            eVar.put(navArgsClass, method);
            Intrinsics.checkNotNullExpressionValue(method, "also(...)");
        }
        Object invoke = method.invoke(null, bundle);
        Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type Args of androidx.navigation.NavArgsLazy");
        return ((d0) ((y1.i) invoke)).a();
    }

    @Override // com.sports.insider.ui.prediction.PredictionFragment
    public final me.c0 P() {
        return (g0) this.F.getValue();
    }

    @Override // com.sports.insider.ui.prediction.PredictionFragment
    /* renamed from: U */
    public final boolean getF7006w() {
        return false;
    }

    @Override // com.sports.insider.ui.prediction.PredictionFragment, pe.g
    public final void x(String betText) {
        Intrinsics.checkNotNullParameter(betText, "betText");
        try {
            if (betText.length() <= 0 || StringsKt.H(betText)) {
                return;
            }
            r r5 = a.a.r(this);
            f0 f0Var = new f0();
            f0Var.f20649a.put("searchBet", betText);
            Intrinsics.checkNotNullExpressionValue(f0Var, "setSearchBet(...)");
            r5.d(f0Var);
        } catch (Exception ex) {
            Intrinsics.checkNotNullParameter(ex, "ex");
            d dVar = MyApp.f6830c;
            e eVar = m0.f9201a;
            c0.t(dVar, lg.d.f20063c, null, new q4.r(ex, null, 18), 2);
        }
    }
}
