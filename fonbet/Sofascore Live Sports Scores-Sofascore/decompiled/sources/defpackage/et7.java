package defpackage;

import androidx.fragment.app.Fragment;
import com.sofascore.results.main.favorites.FavoriteEntitiesFragment;
import com.sofascore.results.main.favorites.FavoriteEventsFragment;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class et7 extends s8 {
    @Override // defpackage.d41
    public final Fragment C(Enum r2) {
        ct7 ct7Var = (ct7) r2;
        ct7Var.getClass();
        if (dt7.a[ct7Var.ordinal()] == 1) {
            return new FavoriteEventsFragment();
        }
        FavoriteEntitiesFragment favoriteEntitiesFragment = new FavoriteEntitiesFragment();
        favoriteEntitiesFragment.setArguments(fz8.C(fz8.G("FAVORITES_TAB_TYPE", ct7Var)));
        return favoriteEntitiesFragment;
    }

    @Override // defpackage.s8
    public final String H(Enum r1) {
        ct7 ct7Var = (ct7) r1;
        ct7Var.getClass();
        String string = y().getString(ct7Var.a);
        string.getClass();
        return string;
    }
}
