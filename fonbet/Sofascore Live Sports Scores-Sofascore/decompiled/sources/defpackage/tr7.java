package defpackage;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.sofascore.results.base.BaseActivity;
import com.sofascore.results.main.favorites.FavoriteEventsFragment;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class tr7 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FavoriteEventsFragment b;

    public /* synthetic */ tr7(FavoriteEventsFragment favoriteEventsFragment, int i) {
        this.a = i;
        this.b = favoriteEventsFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ws7 ws7Var;
        List list;
        List L0;
        ws7 ws7Var2;
        List list2;
        ws7 ws7Var3;
        List list3;
        List L02;
        ws7 ws7Var4;
        List list4;
        int i = this.a;
        int i2 = 0;
        FavoriteEventsFragment favoriteEventsFragment = this.b;
        switch (i) {
            case 0:
                zqb zqbVar = (zqb) favoriteEventsFragment.r.getValue();
                xw3.L(un0.z(zqbVar), null, null, new gjb(zqbVar, hwg.c, null, 4), 3);
                return Unit.a;
            case 1:
                int itemCount = favoriteEventsFragment.D().getItemCount();
                xs7 xs7Var = (xs7) favoriteEventsFragment.E().p.d();
                if (xs7Var != null && (ws7Var = xs7Var.b) != null && (list = ws7Var.a) != null && (L0 = CollectionsKt.L0(list, itemCount + 8)) != null) {
                    int size = L0.size();
                    xs7 xs7Var2 = (xs7) favoriteEventsFragment.E().p.d();
                    if (xs7Var2 != null && (ws7Var2 = xs7Var2.b) != null && (list2 = ws7Var2.a) != null) {
                        i2 = list2.size();
                    }
                    if (size < i2) {
                        favoriteEventsFragment.D().F(CollectionsKt.x0(L0, new us7()));
                    } else {
                        favoriteEventsFragment.D().F(L0);
                    }
                }
                return Unit.a;
            case 2:
                int itemCount2 = favoriteEventsFragment.C().getItemCount();
                xs7 xs7Var3 = (xs7) favoriteEventsFragment.E().p.d();
                if (xs7Var3 != null && (ws7Var3 = xs7Var3.b) != null && (list3 = ws7Var3.b) != null && (L02 = CollectionsKt.L0(list3, itemCount2 + 8)) != null) {
                    int size2 = L02.size();
                    xs7 xs7Var4 = (xs7) favoriteEventsFragment.E().p.d();
                    if (xs7Var4 != null && (ws7Var4 = xs7Var4.b) != null && (list4 = ws7Var4.b) != null) {
                        i2 = list4.size();
                    }
                    if (size2 < i2) {
                        favoriteEventsFragment.C().F(CollectionsKt.x0(L02, new us7()));
                    } else {
                        favoriteEventsFragment.C().F(L02);
                    }
                }
                return Unit.a;
            case 3:
                Context requireContext = favoriteEventsFragment.requireContext();
                requireContext.getClass();
                return new qs7(requireContext, hwg.c, new tr7(favoriteEventsFragment, i2));
            case 4:
                FragmentActivity requireActivity = favoriteEventsFragment.requireActivity();
                requireActivity.getClass();
                return new vs7((BaseActivity) requireActivity, hwg.d, new tr7(favoriteEventsFragment, 1));
            default:
                FragmentActivity requireActivity2 = favoriteEventsFragment.requireActivity();
                requireActivity2.getClass();
                return new vs7((BaseActivity) requireActivity2, hwg.f, new tr7(favoriteEventsFragment, 2));
        }
    }
}
