package com.sofascore.results.view.graph;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.inmobi.media.core.config.models.TelemetryConfig;
import com.ironsource.C4427z5;
import com.mbridge.msdk.foundation.same.report.j;
import com.mbridge.msdk.setting.i;
import com.sofascore.model.buzzer.BuzzerConfigResponseKt;
import com.sofascore.model.newNetwork.PlayerSummaryEvent;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import defpackage.ao2;
import defpackage.bi4;
import defpackage.dtg;
import defpackage.fc6;
import defpackage.hk4;
import defpackage.hkg;
import defpackage.joa;
import defpackage.k9f;
import defpackage.kpg;
import defpackage.laf;
import defpackage.xyg;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z1g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u00013J\u001b\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001d\u0010\r\u001a\u0004\u0018\u00010\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0015\u001a\u0004\u0018\u00010\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\n\u001a\u0004\b\u0014\u0010\fR\u001b\u0010\u0018\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\n\u001a\u0004\b\u0017\u0010\u0011R\u001b\u0010\u001b\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\n\u001a\u0004\b\u001a\u0010\u0011R#\u0010!\u001a\n \u001d*\u0004\u0018\u00010\u001c0\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\n\u001a\u0004\b\u001f\u0010 R#\u0010$\u001a\n \u001d*\u0004\u0018\u00010\u001c0\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\n\u001a\u0004\b#\u0010 R\"\u0010,\u001a\u00020%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0011\u00100\u001a\u00020-8F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0011\u00102\u001a\u00020-8F¢\u0006\u0006\u001a\u0004\b1\u0010/¨\u00064"}, d2 = {"Lcom/sofascore/results/view/graph/SeasonRatingGraph;", "Landroid/view/View;", "", "Lcom/sofascore/model/newNetwork/PlayerSummaryEvent;", "yearSummary", "", "setSummary", "(Ljava/util/List;)V", "Landroid/graphics/drawable/Drawable;", i.a, "Ljoa;", "getTransferDrawable", "()Landroid/graphics/drawable/Drawable;", "transferDrawable", "Landroid/graphics/Paint;", j.b, "getTransferLine", "()Landroid/graphics/Paint;", "transferLine", InneractiveMediationDefs.GENDER_MALE, "getInjuryDrawable", "injuryDrawable", C4427z5.q, "getInjuryPaint", "injuryPaint", "o", "getAverageLinePaint", "averageLinePaint", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "u", "getStartOfFirstMonth", "()Ljava/util/Calendar;", "startOfFirstMonth", "v", "getEndOfLastMonth", "endOfLastMonth", "", "A", "D", "getAverageRating", "()D", "setAverageRating", "(D)V", "averageRating", "", "getHasTransfers", "()Z", "hasTransfers", "getHasInjuries", "hasInjuries", "xyg", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SeasonRatingGraph extends View {
    public static final /* synthetic */ int B = 0;

    /* renamed from: A, reason: from kotlin metadata */
    public double averageRating;
    public final boolean a;
    public final float b;
    public final int c;
    public final List d;
    public final Paint e;
    public final Paint f;
    public final TextPaint g;
    public final TextPaint h;

    /* renamed from: i, reason: from kotlin metadata */
    public final joa transferDrawable;

    /* renamed from: j, reason: from kotlin metadata */
    public final joa transferLine;
    public final Path k;
    public final RectF l;

    /* renamed from: m, reason: from kotlin metadata */
    public final joa injuryDrawable;

    /* renamed from: n, reason: from kotlin metadata */
    public final joa injuryPaint;

    /* renamed from: o, reason: from kotlin metadata */
    public final joa averageLinePaint;
    public final float p;
    public final float q;
    public final int r;
    public final float s;
    public final RectF t;

    /* renamed from: u, reason: from kotlin metadata */
    public final joa startOfFirstMonth;

    /* renamed from: v, reason: from kotlin metadata */
    public final joa endOfLastMonth;
    public final LinkedHashMap w;
    public ArrayList x;
    public ArrayList y;
    public boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeasonRatingGraph(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Typeface typeface;
        Typeface typeface2;
        context.getClass();
        boolean c0 = hkg.c0(context);
        this.a = c0;
        this.b = c0 ? -1.0f : 1.0f;
        int color = context.getColor(R.color.rating_80);
        int color2 = context.getColor(R.color.rating_70);
        int color3 = context.getColor(R.color.rating_65);
        int color4 = context.getColor(R.color.rating_60);
        int color5 = context.getColor(R.color.rating_10);
        this.c = context.getColor(R.color.n_lv_3);
        this.d = b.j(new Pair(context.getString(R.string.number_8_player_rating_legend), Integer.valueOf(color)), new Pair(context.getString(R.string.number_7_player_rating_legend), Integer.valueOf(color2)), new Pair(null, Integer.valueOf(color3)), new Pair(context.getString(R.string.number_6_player_rating_legend), Integer.valueOf(color4)), new Pair(null, Integer.valueOf(color5)));
        Paint paint = new Paint();
        int i = 6;
        paint.setStrokeWidth(ao2.u(6, context));
        this.e = paint;
        Paint paint2 = new Paint();
        paint2.setStrokeWidth(ao2.u(20, context));
        this.f = paint2;
        TextPaint textPaint = new TextPaint();
        try {
            typeface = z1g.a(R.font.sofascore_sans_bold_condensed, context);
        } catch (Exception unused) {
            typeface = Typeface.DEFAULT;
        }
        textPaint.setTypeface(typeface);
        textPaint.setTextSize(ao2.u(12, context));
        this.g = textPaint;
        TextPaint textPaint2 = new TextPaint();
        try {
            typeface2 = z1g.a(R.font.sofascore_sans_medium, context);
        } catch (Exception unused2) {
            typeface2 = Typeface.DEFAULT;
        }
        textPaint2.setTypeface(typeface2);
        textPaint2.setTextSize(ao2.u(12, context));
        textPaint2.setColor(context.getColor(R.color.n_lv_3));
        textPaint2.setTextAlign(Paint.Align.CENTER);
        this.h = textPaint2;
        k9f k9fVar = new k9f(context, i);
        ysa ysaVar = ysa.c;
        this.transferDrawable = ypa.a(ysaVar, k9fVar);
        this.transferLine = ypa.a(ysaVar, new k9f(context, 7));
        this.k = new Path();
        this.l = new RectF();
        this.injuryDrawable = ypa.a(ysaVar, new k9f(context, 8));
        this.injuryPaint = ypa.a(ysaVar, new k9f(context, 9));
        this.averageLinePaint = ypa.a(ysaVar, new k9f(context, 10));
        this.p = ao2.u(16, context);
        this.q = ao2.u(8, context);
        this.r = ao2.s(2, context);
        this.s = ao2.u(2, context);
        this.t = new RectF();
        this.startOfFirstMonth = ypa.a(ysaVar, new dtg(22));
        this.endOfLastMonth = ypa.a(ysaVar, new dtg(23));
        this.w = new LinkedHashMap();
        this.z = true;
    }

    private final Paint getAverageLinePaint() {
        return (Paint) this.averageLinePaint.getValue();
    }

    private final Calendar getEndOfLastMonth() {
        return (Calendar) this.endOfLastMonth.getValue();
    }

    private final Drawable getInjuryDrawable() {
        return (Drawable) this.injuryDrawable.getValue();
    }

    private final Paint getInjuryPaint() {
        return (Paint) this.injuryPaint.getValue();
    }

    private final Calendar getStartOfFirstMonth() {
        return (Calendar) this.startOfFirstMonth.getValue();
    }

    private final Drawable getTransferDrawable() {
        return (Drawable) this.transferDrawable.getValue();
    }

    private final Paint getTransferLine() {
        return (Paint) this.transferLine.getValue();
    }

    public final double getAverageRating() {
        return this.averageRating;
    }

    public final boolean getHasInjuries() {
        ArrayList arrayList = this.y;
        return !(arrayList == null || arrayList.isEmpty());
    }

    public final boolean getHasTransfers() {
        ArrayList arrayList = this.x;
        return !(arrayList == null || arrayList.isEmpty());
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x02ee, code lost:
    
        if (r43 > 0) goto L103;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        float f;
        float width;
        float f2;
        long timeInMillis;
        long timestamp;
        Long l;
        RectF rectF;
        List list;
        String format;
        Canvas canvas2 = canvas;
        canvas2.getClass();
        super.onDraw(canvas);
        float f3 = this.q;
        float f4 = 2.0f;
        float f5 = f3 / 2.0f;
        float f6 = this.p;
        Paint paint = this.e;
        RectF rectF2 = this.t;
        rectF2.set(f3, f5 + f6, (getWidth() - f6) - paint.getStrokeWidth(), getHeight() - f6);
        float width2 = (getWidth() - paint.getStrokeWidth()) - f6;
        float height = rectF2.height() / 6.0f;
        canvas2.save();
        canvas2.translate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, rectF2.top);
        boolean z = this.a;
        float f7 = z ? f6 : width2;
        Paint.Align align = Paint.Align.LEFT;
        TextPaint textPaint = this.g;
        textPaint.setTextAlign(align);
        Iterator it = this.d.iterator();
        TextPaint textPaint2 = textPaint;
        float f8 = 0.0f;
        int i = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            f = f4;
            float f9 = this.b;
            if (!hasNext) {
                Paint paint2 = paint;
                float f10 = f5;
                TextPaint textPaint3 = textPaint2;
                canvas2.restore();
                Calendar calendar = Calendar.getInstance();
                calendar.add(2, -12);
                float width3 = (rectF2.width() / 12.0f) * f9;
                Paint paint3 = this.f;
                paint3.setStrokeWidth(Math.min(width3 - this.r, paint3.getStrokeWidth()));
                float width4 = z ? (getWidth() - f3) - (paint3.getStrokeWidth() / f) : (paint3.getStrokeWidth() / f) + f3;
                int i2 = 0;
                while (true) {
                    double d = 0.0d;
                    if (i2 >= 12) {
                        break;
                    }
                    calendar.add(2, 1);
                    List list2 = (List) this.w.get(Integer.valueOf(calendar.get(2)));
                    if (i2 % 2 == 1) {
                        long timeInMillis2 = calendar.getTimeInMillis() / 1000;
                        bi4 bi4Var = bi4.PATTERN_MM;
                        ConcurrentHashMap concurrentHashMap = hk4.a;
                        list = list2;
                        canvas2.drawText(fc6.i(timeInMillis2, hk4.a(bi4Var.d())), (i2 * width3) + width4, f6 - f10, this.h);
                    } else {
                        list = list2;
                    }
                    int size = list != null ? list.size() : 0;
                    if (list != null) {
                        Double valueOf = Double.valueOf(CollectionsKt.J0(list));
                        if (size <= 0) {
                            valueOf = null;
                        }
                        if (valueOf != null) {
                            d = valueOf.doubleValue() / size;
                        }
                    }
                    double d2 = d < 5.5d ? 5.5d : d;
                    float height2 = (float) (rectF2.height() * (((d2 <= 8.5d ? d2 : 8.5d) - 5.5d) / 3.0d));
                    if (d > 0.1d) {
                        Context context = getContext();
                        context.getClass();
                        float u = ao2.u(4, context);
                        if (height2 < u) {
                            height2 = u;
                        }
                    }
                    if (d < 0.001d) {
                        format = "-";
                    } else {
                        format = Math.abs(d - 10.0d) < 0.001d ? "10" : String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1));
                    }
                    Context context2 = getContext();
                    context2.getClass();
                    int v = kpg.v(context2, format);
                    paint3.setColor(v);
                    float f11 = (i2 * width3) + width4;
                    float f12 = height2;
                    float f13 = rectF2.bottom;
                    float f14 = f13 - f12;
                    Calendar calendar2 = calendar;
                    int i3 = size;
                    String str = format;
                    canvas2 = canvas;
                    canvas2.drawLine(f11, f13, f11, f14, paint3);
                    textPaint3.setTextAlign(Paint.Align.CENTER);
                    if (this.z) {
                        textPaint3.setColor(v);
                    } else {
                        textPaint3.setColor(this.c);
                        str = String.valueOf(i3);
                    }
                    if (i3 <= 0) {
                        str = null;
                    }
                    canvas2.drawText(str == null ? "-" : str, f11, getHeight(), textPaint3);
                    i2++;
                    calendar = calendar2;
                }
                width = rectF2.width() - f3;
                f2 = f10 + rectF2.top;
                canvas2.save();
                if (z) {
                    canvas2.scale(-1.0f, 1.0f, getWidth() / f, getHeight() / f);
                }
                canvas2.translate(f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                ArrayList arrayList = this.y;
                if (arrayList != null) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        PlayerSummaryEvent playerSummaryEvent = (PlayerSummaryEvent) it2.next();
                        timeInMillis = getEndOfLastMonth().getTimeInMillis() - getStartOfFirstMonth().getTimeInMillis();
                        timestamp = playerSummaryEvent.getTimestamp();
                        long timeInMillis3 = getStartOfFirstMonth().getTimeInMillis() / 1000;
                        if (timestamp < timeInMillis3) {
                            timestamp = timeInMillis3;
                        }
                        String value = playerSummaryEvent.getValue();
                        if (value != null) {
                            try {
                                long timeInMillis4 = (getStartOfFirstMonth().getTimeInMillis() / 1000) - playerSummaryEvent.getTimestamp();
                                Long valueOf2 = Long.valueOf(timeInMillis4);
                                if (timeInMillis4 <= 0) {
                                    valueOf2 = null;
                                }
                                long longValue = valueOf2 != null ? valueOf2.longValue() : 0L;
                                long parseLong = Long.parseLong(value);
                                long timeInMillis5 = (getEndOfLastMonth().getTimeInMillis() / 1000) - timestamp;
                                if (parseLong > timeInMillis5) {
                                    parseLong = timeInMillis5;
                                }
                                long j = parseLong - longValue;
                                l = Long.valueOf(j);
                            } catch (Exception unused) {
                            }
                        }
                        rectF = rectF2;
                        rectF2 = rectF;
                    }
                }
                RectF rectF3 = rectF2;
                canvas2.restore();
                Context context3 = getContext();
                context3.getClass();
                float u2 = ao2.u(18, context3);
                float f15 = f10 + rectF3.top;
                canvas2.save();
                if (z) {
                    canvas2.scale(-1.0f, 1.0f, getWidth() / f, getHeight() / f);
                }
                ArrayList arrayList2 = this.x;
                if (arrayList2 != null) {
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        float timestamp2 = ((((((PlayerSummaryEvent) it3.next()).getTimestamp() * 1000) - getStartOfFirstMonth().getTimeInMillis()) / (getEndOfLastMonth().getTimeInMillis() - getStartOfFirstMonth().getTimeInMillis())) * (rectF3.width() - f3)) + f3;
                        canvas2.save();
                        canvas2.translate(timestamp2, f15);
                        Drawable transferDrawable = getTransferDrawable();
                        if (transferDrawable != null) {
                            transferDrawable.draw(canvas2);
                        }
                        canvas2.drawLine(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, u2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, rectF3.bottom - f15, getTransferLine());
                        canvas.restore();
                        canvas2 = canvas;
                    }
                }
                canvas.restore();
                double d3 = this.averageRating;
                if (d3 == 0.0d) {
                    return;
                }
                if (d3 < 5.5d) {
                    d3 = 5.5d;
                }
                int height3 = (int) (rectF3.height() * (((d3 <= 8.5d ? d3 : 8.5d) - 5.5d) / 3.0d));
                if (this.averageRating > 0.1d) {
                    Context context4 = getContext();
                    context4.getClass();
                    int s = ao2.s(4, context4);
                    if (height3 < s) {
                        height3 = s;
                    }
                }
                Paint averageLinePaint = getAverageLinePaint();
                Context context5 = getContext();
                context5.getClass();
                averageLinePaint.setColor(kpg.u(context5, this.averageRating, null));
                float strokeWidth = z ? (3.0f * f3) + paint2.getStrokeWidth() : rectF3.left;
                float width5 = z ? getWidth() - f3 : rectF3.right;
                float f16 = rectF3.bottom - height3;
                canvas.drawLine(strokeWidth, f16, width5, f16, getAverageLinePaint());
                return;
            }
            Object next = it.next();
            int i4 = i + 1;
            if (i < 0) {
                b.q();
                throw null;
            }
            Pair pair = (Pair) next;
            String str2 = (String) pair.a;
            int intValue = ((Number) pair.b).intValue();
            paint.setColor(intValue);
            float f17 = ((i == 1 ? 2 : 1) * height) + f8;
            float strokeWidth2 = f7 + (paint.getStrokeWidth() / f);
            TextPaint textPaint4 = textPaint2;
            float f18 = f5;
            canvas2 = canvas;
            canvas2.drawLine(strokeWidth2, f8, strokeWidth2, f17, paint);
            Paint paint4 = paint;
            if (str2 != null) {
                textPaint4.setColor(intValue);
                canvas2.drawText(str2, (f3 * f9) + f7, f17, textPaint4);
            }
            f8 = f17;
            textPaint2 = textPaint4;
            f4 = f;
            i = i4;
            f5 = f18;
            paint = paint4;
        }
        l = null;
        if (l != null) {
            RectF rectF4 = rectF2;
            float timeInMillis6 = (((timestamp * 1000) - getStartOfFirstMonth().getTimeInMillis()) / timeInMillis) * width;
            float longValue2 = (l.longValue() / 3.1536E7f) * width;
            canvas2.save();
            canvas2.translate((longValue2 / f) + timeInMillis6, f2);
            Drawable injuryDrawable = getInjuryDrawable();
            if (injuryDrawable != null) {
                injuryDrawable.draw(canvas2);
            }
            canvas2.restore();
            float f19 = this.s;
            float[] fArr = {f19, f19, f19, f19, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};
            Path path = this.k;
            path.reset();
            rectF = rectF4;
            float f20 = rectF.bottom;
            RectF rectF5 = this.l;
            rectF5.set(timeInMillis6, rectF.top, longValue2 + timeInMillis6, f20);
            path.addRoundRect(rectF5, fArr, Path.Direction.CW);
            canvas2.drawPath(path, getInjuryPaint());
            rectF2 = rectF;
        }
        rectF = rectF2;
        rectF2 = rectF;
    }

    public final void setAverageRating(double d) {
        this.averageRating = d;
    }

    public final void setSummary(@NotNull List<PlayerSummaryEvent> yearSummary) {
        long j;
        yearSummary.getClass();
        List H0 = CollectionsKt.H0(yearSummary, new laf(18));
        Calendar calendar = Calendar.getInstance();
        ArrayList arrayList = new ArrayList();
        Iterator it = H0.iterator();
        while (true) {
            j = 1000;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            PlayerSummaryEvent playerSummaryEvent = (PlayerSummaryEvent) next;
            String type = playerSummaryEvent.getType();
            xyg[] xygVarArr = xyg.a;
            if (Intrinsics.c(type, BuzzerConfigResponseKt.TRANSFER)) {
                long timeInMillis = getStartOfFirstMonth().getTimeInMillis();
                long timeInMillis2 = getEndOfLastMonth().getTimeInMillis();
                long timestamp = playerSummaryEvent.getTimestamp() * 1000;
                if (timeInMillis <= timestamp && timestamp <= timeInMillis2) {
                    arrayList.add(next);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        int i = 0;
        int i2 = 0;
        for (Object obj : CollectionsKt.B0(arrayList2)) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                b.q();
                throw null;
            }
            PlayerSummaryEvent playerSummaryEvent2 = (PlayerSummaryEvent) obj;
            if (i2 < arrayList2.size() - 2 && playerSummaryEvent2.getTimestamp() - TelemetryConfig.DEFAULT_EVENT_TTL_SEC < ((PlayerSummaryEvent) arrayList2.get(i3)).getTimestamp()) {
                arrayList2.remove(playerSummaryEvent2);
            }
            i2 = i3;
        }
        this.x = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : H0) {
            PlayerSummaryEvent playerSummaryEvent3 = (PlayerSummaryEvent) obj2;
            String type2 = playerSummaryEvent3.getType();
            xyg[] xygVarArr2 = xyg.a;
            if (Intrinsics.c(type2, "injury") && getEndOfLastMonth().getTimeInMillis() / 1000 >= playerSummaryEvent3.getTimestamp()) {
                arrayList3.add(obj2);
            }
        }
        this.y = arrayList3;
        LinkedHashMap linkedHashMap = this.w;
        linkedHashMap.clear();
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : H0) {
            String type3 = ((PlayerSummaryEvent) obj3).getType();
            xyg[] xygVarArr3 = xyg.a;
            if (Intrinsics.c(type3, "event")) {
                arrayList4.add(obj3);
            }
        }
        Iterator it2 = arrayList4.iterator();
        double d = 0.0d;
        while (it2.hasNext()) {
            PlayerSummaryEvent playerSummaryEvent4 = (PlayerSummaryEvent) it2.next();
            String value = playerSummaryEvent4.getValue();
            if (value != null) {
                try {
                    double parseDouble = Double.parseDouble(value);
                    d += parseDouble;
                    i++;
                    Calendar calendar2 = Calendar.getInstance();
                    calendar2.setTimeInMillis(playerSummaryEvent4.getTimestamp() * j);
                    int i4 = calendar2.get(2);
                    int i5 = calendar2.get(1);
                    if (calendar.get(2) != i4 || calendar2.get(1) == i5) {
                        if (linkedHashMap.get(Integer.valueOf(i4)) != null) {
                            List list = (List) linkedHashMap.get(Integer.valueOf(i4));
                            if (list != null) {
                                list.add(Double.valueOf(parseDouble));
                            }
                        } else {
                            linkedHashMap.put(Integer.valueOf(i4), b.l(Double.valueOf(parseDouble)));
                        }
                    }
                } catch (Exception unused) {
                }
            }
            j = 1000;
        }
        if (i > 0) {
            this.averageRating = d / i;
        }
        invalidate();
    }
}
