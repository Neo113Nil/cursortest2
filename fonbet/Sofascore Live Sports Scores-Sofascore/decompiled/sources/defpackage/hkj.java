package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class hkj extends Drawable {
    public static final /* synthetic */ int n = 0;
    public final Context a;
    public final int b;
    public final int c;
    public final int d;
    public final Paint e;
    public Paint f;
    public final Paint g;
    public final Paint h;
    public final Paint i;
    public Bitmap j;
    public boolean k;
    public float l;
    public final float m;

    public hkj(Context context) {
        Paint paint;
        context.getClass();
        this.a = context;
        this.b = ao2.s(14, context);
        this.c = ao2.s(25, context);
        this.d = ao2.s(1, context);
        this.e = new Paint(1);
        Paint paint2 = new Paint(1);
        paint2.setColor(context.getColor(R.color.graphics_dark));
        this.g = paint2;
        Paint paint3 = new Paint(1);
        paint3.setColor(context.getColor(R.color.darken_overlay_3));
        this.h = paint3;
        if (y05.a(context)) {
            paint = new Paint(1);
            paint.setColor(context.getColor(R.color.primary_variant));
        } else {
            paint = null;
        }
        this.i = paint;
        this.l = 1.8f;
        this.m = ao2.s(16, context);
    }

    public static void b(hkj hkjVar, Object obj, List list, int i) {
        if ((i & 2) != 0) {
            list = a.c(new ty1(-16777216, 25.0f, 1.5f));
        }
        qaj qajVar = new qaj(11);
        Context context = hkjVar.a;
        ht9 ht9Var = new ht9(context);
        ht9Var.c = obj;
        st9.b(ht9Var, list);
        ht9Var.d = new sa0(hkjVar, qajVar);
        ajh.a(context).a(ht9Var.a());
    }

    public final void a(g6b g6bVar, Event event) {
        yy0 qy0Var;
        g6bVar.getClass();
        event.getClass();
        Set set = wyh.a;
        if (wyh.e(ok3.s(event)) || Intrinsics.c(ok3.s(event), Sports.MINI_FOOTBALL)) {
            UniqueTournament uniqueTournament = event.getTournament().getUniqueTournament();
            qy0Var = new qy0(uniqueTournament != null ? uniqueTournament.getId() : 0, event.getTournament().getId());
        } else {
            qy0Var = new my0(Event.getHomeTeam$default(event, null, 1, null).getId(), Event.getAwayTeam$default(event, null, 1, null).getId());
        }
        c(qy0Var, g6bVar);
    }

    public final void c(yy0 yy0Var, g6b g6bVar) {
        String str;
        boolean z = yy0Var instanceof py0;
        int i = 1;
        int i2 = 0;
        Paint paint = this.h;
        if (z) {
            paint.setColor(0);
            Paint paint2 = new Paint(1);
            paint2.setColor(((py0) yy0Var).a);
            this.f = paint2;
            invalidateSelf();
            return;
        }
        int i3 = 6;
        rq3 rq3Var = null;
        if (yy0Var instanceof vy0) {
            b(this, pco.R(((vy0) yy0Var).a), null, 6);
            return;
        }
        if (yy0Var instanceof my0) {
            this.l = 1.56f;
            if (g6bVar != null) {
                k6b x = wca.x(g6bVar);
                hs4 hs4Var = z45.a;
                xw3.L(x, hq4.c, null, new ajj(this, yy0Var, rq3Var, i), 2);
                return;
            }
            return;
        }
        if (yy0Var instanceof uy0) {
            b(this, fc6.n((Intrinsics.c(uaa.c, "api.sofascore.com/") ? "https://img.sofascore.com/" : dmi.q("https://", uaa.c)).concat("api/v1/"), "country/", ((uy0) yy0Var).a, "/flag"), null, 6);
            return;
        }
        if (yy0Var instanceof ty0) {
            b(this, vxd.j(((ty0) yy0Var).a, (Intrinsics.c(uaa.c, "api.sofascore.com/") ? "https://img.sofascore.com/" : dmi.q("https://", uaa.c)).concat("api/v1/"), "category/", "/image"), null, 6);
            return;
        }
        boolean z2 = yy0Var instanceof wy0;
        int i4 = 4;
        Context context = this.a;
        if (z2) {
            Paint paint3 = new Paint(1);
            joa joaVar = l5i.a;
            wy0 wy0Var = (wy0) yy0Var;
            String str2 = wy0Var.b;
            context.getClass();
            str2.getClass();
            Object obj = ((Map) l5i.b.getValue()).get(str2);
            if (obj == null) {
                obj = Integer.valueOf(R.color.stage_generic);
            }
            paint3.setColor(context.getColor(((Number) obj).intValue()));
            paint3.setAlpha(191);
            this.f = paint3;
            this.l = 1.0f;
            b(this, vxd.j(wy0Var.a, (Intrinsics.c(uaa.c, "api.sofascore.com/") ? "https://img.sofascore.com/" : dmi.q("https://", uaa.c)).concat("api/v1/"), "unique-stage/", "/image"), a.c(new h39()), 4);
            return;
        }
        if (yy0Var instanceof ry0) {
            Paint paint4 = new Paint(1);
            paint4.setColor(((ry0) yy0Var).a);
            paint4.setAlpha(191);
            this.f = paint4;
            this.l = 1.0f;
            b(this, Integer.valueOf(R.drawable.mma_event_card_bg), a.c(new ty1(2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i2, i3)), 4);
            return;
        }
        float f = 1.5f;
        float f2 = 25.0f;
        if (yy0Var instanceof qy0) {
            qy0 qy0Var = (qy0) yy0Var;
            int i5 = qy0Var.b;
            int i6 = qy0Var.a;
            if (i6 > 0 || i5 > 0) {
                b(this, pco.I(i5, Integer.valueOf(i6), hkg.b0(context)), a.c(new ty1(-16777216, 25.0f, 1.5f)), 4);
                return;
            }
            return;
        }
        if (yy0Var instanceof xy0) {
            this.l = 1.0f;
            paint.setColor(0);
            b(this, ((xy0) yy0Var).a, km5.a, 4);
            return;
        }
        if (yy0Var instanceof sy0) {
            this.g.setColor(hkg.X(context));
            paint.setColor(0);
            invalidateSelf();
            return;
        }
        if (yy0Var instanceof oy0) {
            b(this, Integer.valueOf(R.drawable.fantasy_elite_faceoff), a.c(new ty1(f2, f, i2, i4)), 4);
            return;
        }
        if (yy0Var instanceof ny0) {
            b(this, ((ny0) yy0Var).a, a.c(new ty1(f2, f, i2, i4)), 4);
            return;
        }
        if (yy0Var instanceof ky0) {
            paint.setColor(context.getColor(R.color.darken_overlay_2));
            ky0 ky0Var = (ky0) yy0Var;
            Integer num = ky0Var.a;
            Integer valueOf = Integer.valueOf(ky0Var.b);
            str = hkg.b0(context) ? "/dark" : "";
            StringBuilder sb = new StringBuilder((Intrinsics.c(uaa.c, "api.sofascore.com/") ? "https://img.sofascore.com/" : dmi.q("https://", uaa.c)).concat("api/v1/"));
            sb.append("branding/provider/");
            sb.append(num);
            sb.append("/unique-tournament/");
            sb.append(valueOf);
            b(this, mz1.o(sb, "/app-header", str), a.c(new ty1(f2, 2.5f, i2, i4)), 4);
            return;
        }
        if (yy0Var instanceof ly0) {
            paint.setColor(context.getColor(R.color.darken_overlay_2));
            ly0 ly0Var = (ly0) yy0Var;
            Integer num2 = ly0Var.a;
            Integer valueOf2 = Integer.valueOf(ly0Var.b);
            str = hkg.b0(context) ? "/dark" : "";
            StringBuilder sb2 = new StringBuilder((Intrinsics.c(uaa.c, "api.sofascore.com/") ? "https://img.sofascore.com/" : dmi.q("https://", uaa.c)).concat("api/v1/"));
            sb2.append("branding/provider/");
            sb2.append(num2);
            sb2.append("/team/");
            sb2.append(valueOf2);
            b(this, mz1.o(sb2, "/app-header", str), a.c(new ty1(f2, 2.5f, i2, i4)), 4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.getClass();
        if (this.k) {
            Path path = new Path();
            float width = getBounds().width();
            float height = getBounds().height();
            float f = this.m;
            path.addRoundRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, width, height, f, f, Path.Direction.CW);
            canvas.clipPath(path);
        }
        Paint paint = this.i;
        if (paint != null) {
            canvas.drawRect(getBounds(), paint);
            return;
        }
        canvas.drawRect(getBounds(), this.g);
        Bitmap bitmap = this.j;
        if (bitmap != null) {
            int width2 = getBounds().width();
            int height2 = getBounds().height();
            int save = canvas.save();
            try {
                float max = Math.max(getBounds().width() / bitmap.getWidth(), getBounds().height() / bitmap.getHeight());
                float width3 = bitmap.getWidth() * max;
                float height3 = bitmap.getHeight() * max;
                float f2 = width2;
                float f3 = (f2 - width3) / 2.0f;
                float f4 = height2;
                float f5 = (f4 - height3) / 2.0f;
                float f6 = this.l;
                canvas.scale(f6, f6, f2 / 2.0f, f4 / 2.0f);
                canvas.drawBitmap(bitmap, (Rect) null, new RectF(f3, f5, width3 + f3, height3 + f5), this.e);
            } finally {
                canvas.restoreToCount(save);
            }
        }
        Paint paint2 = this.f;
        if (paint2 != null) {
            canvas.drawRect(getBounds(), paint2);
        }
        canvas.drawRect(getBounds(), this.h);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
