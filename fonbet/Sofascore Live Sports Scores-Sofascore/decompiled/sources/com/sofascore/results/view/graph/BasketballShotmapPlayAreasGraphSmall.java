package com.sofascore.results.view.graph;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.util.AttributeSet;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.sofascore.results.R;
import defpackage.ao2;
import defpackage.z1g;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001a\u0010\u0010\u001a\u00020\u000b8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u000b8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000fR\u001a\u0010\u0016\u001a\u00020\u000b8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0015\u0010\u000fR\u001a\u0010\u0019\u001a\u00020\u000b8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0018\u0010\u000fR\u001a\u0010\u001c\u001a\u00020\u000b8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001a\u0010\r\u001a\u0004\b\u001b\u0010\u000fR\u001a\u0010\u001f\u001a\u00020\u000b8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001d\u0010\r\u001a\u0004\b\u001e\u0010\u000fR\u001a\u0010%\u001a\u00020 8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lcom/sofascore/results/view/graph/BasketballShotmapPlayAreasGraphSmall;", "Lcom/sofascore/results/view/graph/BasketballShotmapPlayAreasGraph;", "", TtmlNode.TAG_P, "F", "getLineSpace", "()F", "lineSpace", CampaignEx.JSON_KEY_AD_Q, "getTextVerticalOffset", "textVerticalOffset", "Landroid/graphics/Bitmap;", "r", "Landroid/graphics/Bitmap;", "getLeftUpOutside", "()Landroid/graphics/Bitmap;", "leftUpOutside", "s", "getLeftUpInside", "leftUpInside", "t", "getTopMiddle", "topMiddle", "u", "getCenterMiddle", "centerMiddle", "v", "getLeftDown", "leftDown", "w", "getBottomMiddle", "bottomMiddle", "Landroid/graphics/Paint;", "x", "Landroid/graphics/Paint;", "getTextPaint", "()Landroid/graphics/Paint;", "textPaint", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public class BasketballShotmapPlayAreasGraphSmall extends BasketballShotmapPlayAreasGraph {

    /* renamed from: p, reason: from kotlin metadata */
    public final float lineSpace;

    /* renamed from: q, reason: from kotlin metadata */
    public final float textVerticalOffset;

    /* renamed from: r, reason: from kotlin metadata */
    public final Bitmap leftUpOutside;

    /* renamed from: s, reason: from kotlin metadata */
    public final Bitmap leftUpInside;

    /* renamed from: t, reason: from kotlin metadata */
    public final Bitmap topMiddle;

    /* renamed from: u, reason: from kotlin metadata */
    public final Bitmap centerMiddle;

    /* renamed from: v, reason: from kotlin metadata */
    public final Bitmap leftDown;

    /* renamed from: w, reason: from kotlin metadata */
    public final Bitmap bottomMiddle;

    /* renamed from: x, reason: from kotlin metadata */
    public final Paint textPaint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasketballShotmapPlayAreasGraphSmall(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        context.getClass();
        this.lineSpace = ao2.u(1, context);
        this.textVerticalOffset = ao2.u(8, context);
        this.leftUpOutside = a(R.drawable.basketball_tile_1_left_up_outside_compact);
        this.leftUpInside = a(R.drawable.basketball_tile_2_left_up_inside_compact);
        this.topMiddle = a(R.drawable.basketball_tile_3_center_up_compact);
        this.centerMiddle = a(R.drawable.basketball_tile_6_center_middle_compact);
        this.leftDown = a(R.drawable.basketball_tile_7_left_down_compact);
        this.bottomMiddle = a(R.drawable.basketball_tile_8_center_down_compact);
        Paint paint = new Paint(2);
        paint.setTypeface(z1g.a(R.font.sofascore_sans_bold, context));
        paint.setTextSize(ao2.u(12, context));
        paint.setColor(context.getColor(R.color.on_color_primary));
        paint.setLetterSpacing(0.01f);
        this.textPaint = paint;
    }

    @Override // com.sofascore.results.view.graph.BasketballShotmapPlayAreasGraph
    @NotNull
    public Bitmap getBottomMiddle() {
        return this.bottomMiddle;
    }

    @Override // com.sofascore.results.view.graph.BasketballShotmapPlayAreasGraph
    @NotNull
    public Bitmap getCenterMiddle() {
        return this.centerMiddle;
    }

    @Override // com.sofascore.results.view.graph.BasketballShotmapPlayAreasGraph
    @NotNull
    public Bitmap getLeftDown() {
        return this.leftDown;
    }

    @Override // com.sofascore.results.view.graph.BasketballShotmapPlayAreasGraph
    @NotNull
    public Bitmap getLeftUpInside() {
        return this.leftUpInside;
    }

    @Override // com.sofascore.results.view.graph.BasketballShotmapPlayAreasGraph
    @NotNull
    public Bitmap getLeftUpOutside() {
        return this.leftUpOutside;
    }

    @Override // com.sofascore.results.view.graph.BasketballShotmapPlayAreasGraph
    public float getLineSpace() {
        return this.lineSpace;
    }

    @Override // com.sofascore.results.view.graph.BasketballShotmapPlayAreasGraph
    @NotNull
    public Paint getTextPaint() {
        return this.textPaint;
    }

    @Override // com.sofascore.results.view.graph.BasketballShotmapPlayAreasGraph
    public float getTextVerticalOffset() {
        return this.textVerticalOffset;
    }

    @Override // com.sofascore.results.view.graph.BasketballShotmapPlayAreasGraph
    @NotNull
    public Bitmap getTopMiddle() {
        return this.topMiddle;
    }
}
