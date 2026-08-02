package defpackage;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n;
import com.sofascore.results.main.favorites.FavoriteEntitiesFragment;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class bn1 implements View.OnScrollChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bn1(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnScrollChangeListener
    public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
        HashMap hashMap;
        HashMap hashMap2;
        int i5 = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i5) {
            case 0:
                m22 m22Var = ((zm1) obj).m;
                yzc yzcVar = ((cn1) obj2).c;
                hf9 hf9Var = (hf9) yzcVar.d();
                if (hf9Var == null || (hashMap = hf9Var.d) == null) {
                    hashMap = new HashMap();
                }
                hashMap.put(m22Var.a, Integer.valueOf(i));
                yzcVar.j(((hf9) yzcVar.d()) != null ? new hf9(i, i3, m22Var, hashMap) : null);
                break;
            case 1:
                FavoriteEntitiesFragment favoriteEntitiesFragment = (FavoriteEntitiesFragment) obj2;
                RecyclerView recyclerView = (RecyclerView) obj;
                krk krkVar = favoriteEntitiesFragment.l;
                krkVar.getClass();
                if (((ho8) krkVar).d.getVisibility() == 0 && recyclerView.computeVerticalScrollOffset() == 0) {
                    n layoutManager = recyclerView.getLayoutManager();
                    GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
                    if (gridLayoutManager != null) {
                        Context requireContext = favoriteEntitiesFragment.requireContext();
                        requireContext.getClass();
                        gridLayoutManager.scrollToPositionWithOffset(0, -ao2.s(1, requireContext));
                        break;
                    }
                }
                break;
            default:
                m22 m22Var2 = ((i22) obj).m;
                yzc yzcVar2 = ((dse) obj2).f;
                hf9 hf9Var2 = (hf9) yzcVar2.d();
                if (hf9Var2 == null || (hashMap2 = hf9Var2.d) == null) {
                    hashMap2 = new HashMap();
                }
                hashMap2.put(m22Var2.a, Integer.valueOf(i));
                yzcVar2.j(((hf9) yzcVar2.d()) != null ? new hf9(i, i3, m22Var2, hashMap2) : null);
                break;
        }
    }
}
