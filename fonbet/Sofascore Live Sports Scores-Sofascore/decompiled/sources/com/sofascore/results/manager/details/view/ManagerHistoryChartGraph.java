package com.sofascore.results.manager.details.view;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import defpackage.a70;
import defpackage.ajh;
import defpackage.ao2;
import defpackage.apf;
import defpackage.fsf;
import defpackage.ht9;
import defpackage.jrg;
import defpackage.km5;
import defpackage.lu3;
import defpackage.nt9;
import defpackage.pco;
import defpackage.qsb;
import defpackage.rfo;
import defpackage.sq3;
import defpackage.ssb;
import defpackage.wt9;
import defpackage.x6k;
import defpackage.y6a;
import defpackage.z1g;
import defpackage.z8e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0006\u0007R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/sofascore/results/manager/details/view/ManagerHistoryChartGraph;", "Landroid/view/View;", "Lwt9;", "getResult", "()Lwt9;", "result", "rsb", "qsb", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ManagerHistoryChartGraph extends View {
    public static final /* synthetic */ int A = 0;
    public final ArrayList a;
    public List b;
    public final boolean c;
    public final float d;
    public final float e;
    public final float f;
    public final int g;
    public final int h;
    public float i;
    public final ArrayList j;
    public final Paint k;
    public final Paint l;
    public final Paint m;
    public final Paint n;
    public final float[] o;
    public final RectF p;
    public final Rect q;
    public float r;
    public float s;
    public String t;
    public String u;
    public final Path v;
    public final Path w;
    public final ArrayList x;
    public final LinkedHashMap y;
    public final ArrayList z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManagerHistoryChartGraph(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Typeface typeface;
        context.getClass();
        this.a = new ArrayList();
        this.b = km5.a;
        boolean z = getResources().getConfiguration().getLayoutDirection() == 1;
        this.c = z;
        this.d = ao2.u(1, context);
        this.e = ao2.u(2, context);
        float u = ao2.u(4, context);
        this.f = u;
        this.g = ao2.s(128, context);
        float t = ao2.t(context, 1.5f);
        this.h = ao2.s(20, context);
        this.j = new ArrayList();
        Paint paint = new Paint(1);
        paint.setColor(context.getColor(R.color.surface_2));
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.k = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(context.getColor(R.color.secondary_default));
        paint2.setStyle(style);
        this.l = paint2;
        Paint paint3 = new Paint(1);
        paint3.setColor(context.getColor(R.color.error));
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(t);
        paint3.setPathEffect(new DashPathEffect(new float[]{u, u}, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        this.m = paint3;
        Paint paint4 = new Paint(1);
        paint4.setColor(context.getColor(R.color.n_lv_3));
        paint4.setTextAlign(z ? Paint.Align.RIGHT : Paint.Align.LEFT);
        paint4.setStyle(style);
        paint4.setTextSize(ao2.H(12, context));
        try {
            typeface = z1g.a(R.font.sofascore_sans_medium, context);
        } catch (Exception unused) {
            typeface = Typeface.DEFAULT;
        }
        paint4.setTypeface(typeface);
        this.n = paint4;
        float f = this.e;
        this.o = new float[]{f, f, f, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};
        this.p = new RectF();
        int i = this.h;
        this.q = new Rect(0, 0, i, i);
        this.t = "";
        this.u = "";
        this.v = new Path();
        this.w = new Path();
        this.x = new ArrayList();
        this.y = new LinkedHashMap();
        this.z = new ArrayList();
    }

    private final wt9 getResult() {
        return rfo.I(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Integer num, sq3 sq3Var) {
        ssb ssbVar;
        int i;
        fsf fsfVar;
        nt9 a;
        if (sq3Var instanceof ssb) {
            ssbVar = (ssb) sq3Var;
            int i2 = ssbVar.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ssbVar.u = i2 - Integer.MIN_VALUE;
                Object obj = ssbVar.s;
                lu3 lu3Var = lu3.a;
                i = ssbVar.u;
                String str = null;
                if (i != 0) {
                    y6a.M(obj);
                    if (num == null) {
                        return null;
                    }
                    fsf fsfVar2 = new fsf();
                    Context context = getContext();
                    context.getClass();
                    ht9 ht9Var = new ht9(context);
                    ht9Var.c = pco.R(num.intValue());
                    ht9Var.q = jrg.b;
                    ht9Var.f = pco.R(num.intValue());
                    ht9Var.c(pco.R(num.intValue()));
                    Context context2 = getContext();
                    context2.getClass();
                    wt9 result = getResult();
                    if (result != null && (a = result.a()) != null) {
                        str = a.e;
                    }
                    z8e.Q(ht9Var, context2, R.drawable.team_logo_placeholder, str, new Integer(R.color.neutral_default));
                    ht9Var.d = new x6k(12, fsfVar2, this, fsfVar2);
                    Context context3 = getContext();
                    context3.getClass();
                    apf a2 = ajh.a(context3);
                    nt9 a3 = ht9Var.a();
                    ssbVar.r = fsfVar2;
                    ssbVar.u = 1;
                    if (a2.c(a3, ssbVar) == lu3Var) {
                        return lu3Var;
                    }
                    fsfVar = fsfVar2;
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fsfVar = ssbVar.r;
                    y6a.M(obj);
                }
                return fsfVar.a;
            }
        }
        ssbVar = new ssb(this, sq3Var);
        Object obj2 = ssbVar.s;
        lu3 lu3Var2 = lu3.a;
        i = ssbVar.u;
        String str2 = null;
        if (i != 0) {
        }
        return fsfVar.a;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        ArrayList arrayList = this.z;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            animator.removeAllListeners();
            animator.cancel();
        }
        arrayList.clear();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        if (this.a.isEmpty()) {
            return;
        }
        canvas.drawPath(this.v, this.k);
        Iterator it = this.x.iterator();
        int i = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            int i2 = this.g;
            if (!hasNext) {
                float f2 = i2;
                canvas.drawLine(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (1.0f - this.i) * f2, getWidth(), (1.0f - this.i) * f2, this.m);
                boolean z = this.c;
                if (z) {
                    f = getWidth();
                }
                float f3 = this.r;
                float width = z ? f3 * getWidth() : (1.0f - f3) * getWidth();
                String str = this.t;
                float height = getHeight();
                Paint paint = this.n;
                canvas.drawText(str, f, height, paint);
                canvas.drawText(this.u, width, getHeight(), paint);
                Iterator it2 = this.j.iterator();
                while (it2.hasNext()) {
                    qsb qsbVar = (qsb) it2.next();
                    Bitmap bitmap = qsbVar.a;
                    RectF rectF = qsbVar.b;
                    if (qsbVar.c && bitmap != null) {
                        canvas.drawBitmap(bitmap, this.q, rectF, (Paint) null);
                    }
                }
                return;
            }
            Object next = it.next();
            int i3 = i + 1;
            if (i < 0) {
                b.q();
                throw null;
            }
            RectF rectF2 = (RectF) next;
            Path path = this.w;
            path.reset();
            float f4 = i2;
            Object obj = this.y.get(Integer.valueOf(i));
            if (obj == null) {
                obj = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            rectF2.top = f4 - ((Number) obj).floatValue();
            path.addRoundRect(rectF2, this.o, Path.Direction.CW);
            canvas.drawPath(path, this.l);
            i = i3;
        }
    }
}
