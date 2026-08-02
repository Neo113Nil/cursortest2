package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.results.main.favorites.FavoriteEventsFragment;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class sr7 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FavoriteEventsFragment b;

    public /* synthetic */ sr7(FavoriteEventsFragment favoriteEventsFragment, int i) {
        this.a = i;
        this.b = favoriteEventsFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        int i;
        krk krkVar;
        int s;
        int i2 = this.a;
        int i3 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        FavoriteEventsFragment favoriteEventsFragment = this.b;
        switch (i2) {
            case 0:
                View view = (View) obj;
                view.getClass();
                int height = view.getHeight();
                Context requireContext = favoriteEventsFragment.requireContext();
                requireContext.getClass();
                int s2 = ao2.s(24, requireContext) + height;
                go8 go8Var = (go8) favoriteEventsFragment.l;
                if (go8Var != null) {
                    ExtendedFloatingActionButton extendedFloatingActionButton = go8Var.b;
                    ViewGroup.LayoutParams layoutParams = extendedFloatingActionButton.getLayoutParams();
                    if (layoutParams == null) {
                        yhk.s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        return null;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.bottomMargin = s2;
                    extendedFloatingActionButton.setLayoutParams(marginLayoutParams);
                }
                return Unit.a;
            case 1:
                List list = (List) obj;
                su suVar = favoriteEventsFragment.i;
                Integer num = suVar.e;
                if (num == null) {
                    num = Integer.valueOf(list.size());
                }
                suVar.e = num;
                List c = a.c("");
                list.getClass();
                ArrayList w0 = CollectionsKt.w0(list, c);
                int size = w0.size();
                krk krkVar2 = favoriteEventsFragment.l;
                krkVar2.getClass();
                Object[] objArr3 = size != ((go8) krkVar2).e.getHeaderTypes().size();
                int size2 = w0.size();
                krk krkVar3 = favoriteEventsFragment.l;
                krkVar3.getClass();
                if (size2 < ((go8) krkVar3).e.getHeaderTypes().size()) {
                    w0.size();
                }
                if (objArr3 != false) {
                    is7 E = favoriteEventsFragment.E();
                    iz2 z = un0.z(E);
                    hs4 hs4Var = z45.a;
                    xw3.L(z, hq4.c, null, new l0(E, w0, objArr == true ? 1 : 0, 23), 2);
                }
                int size3 = w0.size();
                krk krkVar4 = favoriteEventsFragment.l;
                if (size3 > 2) {
                    krkVar4.getClass();
                    ((go8) krkVar4).e.setVisibility(0);
                    krk krkVar5 = favoriteEventsFragment.l;
                    krkVar5.getClass();
                    RecyclerView recyclerView = ((go8) krkVar5).c;
                    Context requireContext2 = favoriteEventsFragment.requireContext();
                    requireContext2.getClass();
                    recyclerView.setPaddingRelative(recyclerView.getPaddingStart(), ao2.s(52, requireContext2), recyclerView.getPaddingEnd(), recyclerView.getPaddingBottom());
                } else {
                    krkVar4.getClass();
                    ((go8) krkVar4).e.setVisibility(8);
                    krk krkVar6 = favoriteEventsFragment.l;
                    krkVar6.getClass();
                    RecyclerView recyclerView2 = ((go8) krkVar6).c;
                    Context requireContext3 = favoriteEventsFragment.requireContext();
                    requireContext3.getClass();
                    recyclerView2.setPaddingRelative(recyclerView2.getPaddingStart(), ao2.s(4, requireContext3), recyclerView2.getPaddingEnd(), recyclerView2.getPaddingBottom());
                }
                return Unit.a;
            case 2:
                xs7 xs7Var = (xs7) obj;
                Calendar calendar = ke0.a;
                Context requireContext4 = favoriteEventsFragment.requireContext();
                requireContext4.getClass();
                Map o = wv8.o(SearchResponseKt.SPORT_ENTITY, ke0.b(requireContext4));
                cs7 cs7Var = favoriteEventsFragment.u;
                if (cs7Var == null) {
                    Intrinsics.i("eventsAdapter");
                    throw null;
                }
                cs7Var.K(favoriteEventsFragment, o, true);
                if (favoriteEventsFragment.isAdded()) {
                    kda.p(wca.x(favoriteEventsFragment.getLifecycle()), new n50(favoriteEventsFragment, xs7Var, objArr2 == true ? 1 : 0, 6), new w47(21, favoriteEventsFragment, xs7Var));
                }
                return Unit.a;
            default:
                ((View) obj).getClass();
                krk krkVar7 = favoriteEventsFragment.l;
                krkVar7.getClass();
                n layoutManager = ((go8) krkVar7).c.getLayoutManager();
                LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                if (linearLayoutManager != null) {
                    if ((i = favoriteEventsFragment.A) == -1) {
                        i3 = i;
                        krkVar = favoriteEventsFragment.l;
                        krkVar.getClass();
                        if (((go8) krkVar).e.getVisibility() != 0) {
                        }
                        linearLayoutManager.scrollToPositionWithOffset(i3, s);
                        break;
                    } else {
                        i3 = i;
                        krkVar = favoriteEventsFragment.l;
                        krkVar.getClass();
                        if (((go8) krkVar).e.getVisibility() != 0) {
                            Context requireContext5 = favoriteEventsFragment.requireContext();
                            requireContext5.getClass();
                            s = ao2.s(4, requireContext5);
                        } else {
                            Context requireContext6 = favoriteEventsFragment.requireContext();
                            requireContext6.getClass();
                            s = ao2.s(56, requireContext6);
                        }
                        linearLayoutManager.scrollToPositionWithOffset(i3, s);
                    }
                }
                return Unit.a;
        }
    }
}
