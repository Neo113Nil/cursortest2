package defpackage;

import com.sofascore.results.main.favorites.FavoriteEntitiesFragment;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class vq7 extends r9 {
    public final /* synthetic */ FavoriteEntitiesFragment c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vq7(FavoriteEntitiesFragment favoriteEntitiesFragment) {
        super(5, false);
        this.c = favoriteEntitiesFragment;
    }

    @Override // defpackage.r9
    public final int o(int i) {
        mqi mqiVar = this.c.r;
        return (i < ((qs7) mqiVar.getValue()).g.size() || i >= ((qs7) mqiVar.getValue()).getItemCount() || ((qs7) mqiVar.getValue()).i.size() <= 3) ? 2 : 1;
    }
}
