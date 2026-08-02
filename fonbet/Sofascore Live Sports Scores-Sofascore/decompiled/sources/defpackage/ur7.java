package defpackage;

import com.sofascore.results.main.favorites.FavoriteEventsFragment;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ur7 implements b98 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FavoriteEventsFragment b;
    public final /* synthetic */ FavoriteEventsFragment c;

    public /* synthetic */ ur7(FavoriteEventsFragment favoriteEventsFragment, FavoriteEventsFragment favoriteEventsFragment2, int i) {
        this.a = i;
        this.b = favoriteEventsFragment;
        this.c = favoriteEventsFragment2;
    }

    @Override // defpackage.b98
    public final Object emit(Object obj, rq3 rq3Var) {
        cs7 cs7Var;
        int i = this.a;
        FavoriteEventsFragment favoriteEventsFragment = this.b;
        FavoriteEventsFragment favoriteEventsFragment2 = this.c;
        switch (i) {
            case 0:
                j52 j52Var = (j52) obj;
                if (j52Var instanceof i42) {
                    if (Intrinsics.c(favoriteEventsFragment.toString(), ((i42) j52Var).a)) {
                    }
                    return Unit.a;
                }
                if (j52Var == null) {
                    yhk.s("null cannot be cast to non-null type com.sofascore.common.broadcastUtil.BroadcastEvent.ScrollToTop");
                    return null;
                }
                krk krkVar = favoriteEventsFragment2.l;
                krkVar.getClass();
                ((go8) krkVar).c.stopScroll();
                favoriteEventsFragment2.G();
                return Unit.a;
            case 1:
                j52 j52Var2 = (j52) obj;
                if (j52Var2 instanceof i42) {
                    if (Intrinsics.c(favoriteEventsFragment.toString(), ((i42) j52Var2).a)) {
                        cs7Var = favoriteEventsFragment2.u;
                        if (cs7Var == null) {
                            Intrinsics.i("eventsAdapter");
                            throw null;
                        }
                    }
                    return Unit.a;
                }
                if (j52Var2 == null) {
                    yhk.s("null cannot be cast to non-null type com.sofascore.common.broadcastUtil.BroadcastEvent.RefreshFavorites");
                    return null;
                }
                cs7Var = favoriteEventsFragment2.u;
                if (cs7Var == null) {
                    Intrinsics.i("eventsAdapter");
                    throw null;
                }
                cs7Var.U();
                favoriteEventsFragment2.E().m(true);
                return Unit.a;
            default:
                j52 j52Var3 = (j52) obj;
                if (j52Var3 instanceof i42) {
                    if (Intrinsics.c(favoriteEventsFragment.toString(), ((i42) j52Var3).a)) {
                    }
                    return Unit.a;
                }
                if (j52Var3 == null) {
                    yhk.s("null cannot be cast to non-null type com.sofascore.common.broadcastUtil.BroadcastEvent.RefreshDetailsBellButton");
                    return null;
                }
                favoriteEventsFragment2.E().m(true);
                return Unit.a;
        }
    }
}
