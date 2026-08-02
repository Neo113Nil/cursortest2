package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import com.sofascore.results.R;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class xve extends t2 {
    public final mqi j;
    public final joa k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xve(Context context) {
        super(context);
        context.getClass();
        this.j = ypa.b(new nzd(context, 18));
        this.k = ypa.a(ysa.c, new boe(22));
        setVisibility(8);
        Integer valueOf = Integer.valueOf(R.drawable.football_terrain_icon_horizontal);
        FrameLayout frameLayout = getHeatmapContainer().a;
        frameLayout.getClass();
        t2.j(this, R.string.season_heat_map, valueOf, 0, frameLayout, false, "FOOTBALL_PLAYER_SEASON_HEATMAP", null, new ord(22, this, context), 138);
        setBottomDividerVisibility(false);
        setTopDividerVisibility(false);
        o8.d(this, 0, 7);
    }

    private final f99 getHeatmapContainer() {
        return (f99) this.j.getValue();
    }

    private final i99 getHeatmapImageGenerator() {
        return (i99) this.k.getValue();
    }

    public final void setHeatMapData(@Nullable ryg rygVar) {
        if (rygVar == null) {
            return;
        }
        setVisibility(0);
        i99 heatmapImageGenerator = getHeatmapImageGenerator();
        Context context = getContext();
        context.getClass();
        getHeatmapContainer().c.setImageBitmap(heatmapImageGenerator.a(context, rygVar.b, rygVar.a, false, 1));
    }
}
