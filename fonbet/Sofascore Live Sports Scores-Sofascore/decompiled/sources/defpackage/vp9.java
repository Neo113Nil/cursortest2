package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.results.R;
import com.sofascore.results.view.typeheader.TypeHeaderView;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class vp9 extends yve {
    public final up9 j;
    public int k;
    public List l;
    public int m;
    public final joa n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vp9(Context context) {
        super(context);
        context.getClass();
        View inflate = LayoutInflater.from(context).inflate(R.layout.ice_hockey_player_season_shot_map, (ViewGroup) getBinding().a, false);
        int i = R.id.arrow_image;
        if (((ImageView) nq8.B(R.id.arrow_image, inflate)) != null) {
            i = R.id.logo_image;
            if (((ImageView) nq8.B(R.id.logo_image, inflate)) != null) {
                i = R.id.shot_map_header;
                TypeHeaderView typeHeaderView = (TypeHeaderView) nq8.B(R.id.shot_map_header, inflate);
                if (typeHeaderView != null) {
                    i = R.id.shot_map_image;
                    ImageView imageView = (ImageView) nq8.B(R.id.shot_map_image, inflate);
                    if (imageView != null) {
                        i = R.id.shot_map_surface;
                        if (((ImageView) nq8.B(R.id.shot_map_surface, inflate)) != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                            this.j = new up9(constraintLayout, typeHeaderView, imageView);
                            this.k = 1;
                            this.l = km5.a;
                            this.n = ypa.a(ysa.c, new fc9(11));
                            Integer valueOf = Integer.valueOf(R.drawable.hockey_shotmap_icon);
                            constraintLayout.getClass();
                            t2.j(this, R.string.hockey_shot_heatmap, valueOf, 0, constraintLayout, true, "HOCKEY_PLAYER_SEASON_SHOTMAP", null, null, 394);
                            List j = b.j(context.getString(R.string.goals), context.getString(R.string.total), context.getString(R.string.shotmap_missed));
                            g5k g5kVar = new g5k(typeHeaderView);
                            g5kVar.c = (String) j.get(1);
                            g5kVar.a = j;
                            g5kVar.m = new ur1(this, 11);
                            g5kVar.b();
                            setTopDividerVisibility(false);
                            setBottomDividerVisibility(false);
                            o8.d(this, 0, 7);
                            return;
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        throw null;
    }

    private final i99 getHeatmapImageGenerator() {
        return (i99) this.n.getValue();
    }

    public final void n() {
        int i = this.k;
        List list = this.l;
        nh0 nh0Var = new nh0(i5h.n(i != 0 ? i != 2 ? CollectionsKt.N(list) : i5h.g(CollectionsKt.N(list), new yo9(3)) : i5h.g(CollectionsKt.N(list), new yo9(2)), new yo9(4)), 3);
        ImageView imageView = this.j.c;
        i99 heatmapImageGenerator = getHeatmapImageGenerator();
        Context context = getContext();
        context.getClass();
        imageView.setImageBitmap(i99.b(heatmapImageGenerator, context, nh0Var, this.m, false, false, false, 48));
    }

    @Override // defpackage.yve
    public void setShotMapData(@NotNull dzg dzgVar) {
        dzgVar.getClass();
        setVisibility(0);
        this.l = dzgVar.b;
        this.m = dzgVar.a;
        n();
    }
}
