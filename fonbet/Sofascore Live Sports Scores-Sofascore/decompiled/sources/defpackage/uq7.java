package defpackage;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.sofascore.results.base.BaseActivity;
import com.sofascore.results.main.favorites.FavoriteEntitiesFragment;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class uq7 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FavoriteEntitiesFragment b;

    public /* synthetic */ uq7(FavoriteEntitiesFragment favoriteEntitiesFragment, int i) {
        this.a = i;
        this.b = favoriteEntitiesFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        int i2 = 3;
        rq3 rq3Var = null;
        FavoriteEntitiesFragment favoriteEntitiesFragment = this.b;
        switch (i) {
            case 0:
                Context requireContext = favoriteEntitiesFragment.requireContext();
                requireContext.getClass();
                return new qs7(requireContext, ((ct7) favoriteEntitiesFragment.w.getValue()).b, new uq7(favoriteEntitiesFragment, i2));
            case 1:
                FragmentActivity requireActivity = favoriteEntitiesFragment.requireActivity();
                requireActivity.getClass();
                return new vs7((BaseActivity) requireActivity, ((ct7) favoriteEntitiesFragment.w.getValue()).b, null);
            case 2:
                Bundle requireArguments = favoriteEntitiesFragment.requireArguments();
                requireArguments.getClass();
                Serializable M = gz8.M(requireArguments, "FAVORITES_TAB_TYPE", ct7.class);
                if (M != null) {
                    return (ct7) M;
                }
                a70.p("Serializable FAVORITES_TAB_TYPE not found");
                return null;
            default:
                zqb zqbVar = (zqb) favoriteEntitiesFragment.t.getValue();
                xw3.L(un0.z(zqbVar), null, null, new gjb(zqbVar, ((ct7) favoriteEntitiesFragment.w.getValue()).b, rq3Var, 4), 3);
                return Unit.a;
        }
    }
}
