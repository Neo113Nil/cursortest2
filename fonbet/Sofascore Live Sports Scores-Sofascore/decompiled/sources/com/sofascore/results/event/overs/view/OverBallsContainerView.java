package com.sofascore.results.event.overs.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.sofascore.model.mvvm.model.Incident;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import defpackage.ao2;
import defpackage.llf;
import defpackage.v6a;
import defpackage.yhk;
import defpackage.yp8;
import defpackage.yxd;
import defpackage.z1g;
import defpackage.zzl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\bJ\u001b\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/sofascore/results/event/overs/view/OverBallsContainerView;", "Landroid/view/View;", "", "Lcom/sofascore/model/mvvm/model/Incident$CricketIncident;", "data", "", "setup", "(Ljava/util/List;)V", "yxd", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class OverBallsContainerView extends View {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final float h;
    public final float i;
    public final float j;
    public final float k;
    public final float l;
    public final float m;
    public final Paint n;
    public final TextPaint o;
    public int p;
    public int q;
    public final ArrayList r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverBallsContainerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Typeface typeface;
        context.getClass();
        this.a = context.getColor(R.color.cricket_neutral);
        this.b = context.getColor(R.color.cricket_single_runs);
        this.c = context.getColor(R.color.cricket_4s);
        this.d = context.getColor(R.color.cricket_6s);
        this.e = context.getColor(R.color.cricket_wickets);
        this.f = context.getColor(R.color.cricket_drs);
        this.g = context.getColor(R.color.cricket_errors);
        this.h = ao2.s(2, context);
        this.i = ao2.s(4, context);
        this.j = ao2.s(8, context);
        this.k = ao2.s(16, context);
        this.l = ao2.s(20, context);
        this.m = ao2.s(32, context);
        this.n = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        try {
            typeface = z1g.a(R.font.sofascore_sans_bold_condensed, context);
        } catch (Exception unused) {
            typeface = Typeface.DEFAULT;
        }
        textPaint.setTypeface(typeface);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTextSize(ao2.s(12, context));
        textPaint.setColor(context.getColor(R.color.on_color_primary));
        this.o = textPaint;
        this.r = new ArrayList();
        setWillNotDraw(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupContainerParams$lambda$0(OverBallsContainerView overBallsContainerView) {
        overBallsContainerView.q = llf.c(overBallsContainerView.getWidth() / ((int) ((2.0f * overBallsContainerView.h) + overBallsContainerView.m)), 1, 6);
        overBallsContainerView.p = (int) Math.ceil(overBallsContainerView.r.size() / overBallsContainerView.q);
        ViewGroup.LayoutParams layoutParams = overBallsContainerView.getLayoutParams();
        if (layoutParams == null) {
            yhk.s("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            return;
        }
        layoutParams.height = overBallsContainerView.p * ((int) overBallsContainerView.l);
        overBallsContainerView.setLayoutParams(layoutParams);
        overBallsContainerView.invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Integer[] numArr;
        int i;
        int i2;
        float f;
        int i3;
        canvas.getClass();
        super.onDraw(canvas);
        if (this.p == 0) {
            return;
        }
        float f2 = 2.0f;
        float width = getWidth() / 2.0f;
        ArrayList Q = CollectionsKt.Q(this.q, this.r);
        int i4 = this.p;
        int i5 = 0;
        int i6 = 0;
        while (i6 < i4) {
            List list = (List) Q.get(i6);
            float f3 = list.size() % 2 == 0 ? this.h : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            int i7 = 1;
            if (list.size() % 2 == 0) {
                numArr = new Integer[2];
                numArr[i5] = Integer.valueOf((int) Math.floor((list.size() - 1) / f2));
                numArr[1] = Integer.valueOf((int) Math.ceil((list.size() - 1) / f2));
            } else {
                numArr = new Integer[1];
                numArr[i5] = Integer.valueOf((list.size() - 1) / 2);
            }
            v6a it = llf.i(2, llf.j(-list.size(), list.size())).iterator();
            int i8 = i5;
            while (it.c) {
                int nextInt = it.nextInt();
                int i9 = i8 + 1;
                Object obj = null;
                if (i8 < 0) {
                    b.q();
                    throw null;
                }
                Incident.CricketIncident cricketIncident = (Incident.CricketIncident) list.get(i8);
                String incidentClassColor = cricketIncident.getIncidentClassColor();
                float f4 = f2;
                String str = incidentClassColor == null ? "" : incidentClassColor;
                yxd.b.getClass();
                Iterator<E> it2 = yxd.e.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Object next = it2.next();
                        i = i5;
                        if (((yxd) next).a.equals(str)) {
                            obj = next;
                        } else {
                            i5 = i;
                        }
                    } else {
                        i = i5;
                    }
                }
                yxd yxdVar = (yxd) obj;
                if (yxdVar == null) {
                    yxdVar = yxd.c;
                }
                switch (yxdVar.ordinal()) {
                    case 0:
                        i2 = this.a;
                        break;
                    case 1:
                        i2 = this.b;
                        break;
                    case 2:
                        i2 = this.c;
                        break;
                    case 3:
                        i2 = this.d;
                        break;
                    case 4:
                        i2 = this.e;
                        break;
                    case 5:
                        i2 = this.g;
                        break;
                    case 6:
                        i2 = this.f;
                        break;
                    default:
                        zzl.b();
                        return;
                }
                Paint paint = this.n;
                paint.setColor(i2);
                float f5 = nextInt >= 0 ? i7 : -1;
                if (numArr.length == 0) {
                    yhk.d();
                    return;
                }
                int abs = Math.abs(numArr[i].intValue() - i8);
                float f6 = width;
                int length = numArr.length - i7;
                if (i7 <= length) {
                    i3 = i7;
                    while (true) {
                        f = f5;
                        int abs2 = Math.abs(numArr[i7].intValue() - i8);
                        if (abs > abs2) {
                            abs = abs2;
                        }
                        if (i7 != length) {
                            i7++;
                            f5 = f;
                        }
                    }
                } else {
                    f = f5;
                    i3 = i7;
                }
                float f7 = ((abs * this.i) + f3) * f;
                float height = getHeight() - (((this.p - i6) - 1) * this.l);
                float f8 = this.m;
                float f9 = ((f8 / f4) * nextInt) + f6 + f7;
                float f10 = this.k;
                float f11 = height - f10;
                float f12 = f9 + f8;
                String incidentClassLabel = cricketIncident.getIncidentClassLabel();
                if (incidentClassLabel == null) {
                    incidentClassLabel = "";
                }
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                TextPaint textPaint = this.o;
                CharSequence ellipsize = TextUtils.ellipsize(incidentClassLabel, textPaint, f8, truncateAt);
                float ascent = (height - this.j) - ((textPaint.ascent() + textPaint.descent()) / f4);
                float f13 = this.h;
                canvas.drawRoundRect(f9, f11, f12, height, f13, f13, paint);
                canvas.drawText(ellipsize.toString(), f9 + f10, ascent, textPaint);
                i8 = i9;
                width = f6;
                f2 = f4;
                i7 = i3;
                i5 = i;
            }
            i6++;
            i5 = i5;
        }
    }

    public final void setup(@NotNull List<Incident.CricketIncident> data) {
        data.getClass();
        ArrayList arrayList = this.r;
        arrayList.clear();
        arrayList.addAll(data);
        this.p = 0;
        post(new yp8(this, 23));
    }
}
