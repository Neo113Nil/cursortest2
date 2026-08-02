package com.sofascore.results.view.graph;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import com.bykv.vk.openvk.preload.falconx.statistic.StatisticData;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.C4427z5;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.h;
import com.mbridge.msdk.foundation.same.report.j;
import com.mbridge.msdk.setting.i;
import com.sofascore.model.newNetwork.ShotActionArea;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.task.g;
import defpackage.ao2;
import defpackage.fc6;
import defpackage.fs1;
import defpackage.joa;
import defpackage.k13;
import defpackage.km5;
import defpackage.ph0;
import defpackage.se5;
import defpackage.td4;
import defpackage.tol;
import defpackage.tub;
import defpackage.u6h;
import defpackage.vn1;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z1g;
import defpackage.zve;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001a\u0010\u0010\u001a\u00020\u000b8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\u00020\u00118\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0015R\u001a\u0010\u001d\u001a\u00020\u00118\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u0015R\u001a\u0010 \u001a\u00020\u00118\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\u0015R\u001a\u0010#\u001a\u00020\u00118\u0014X\u0094\u0004¢\u0006\f\n\u0004\b!\u0010\u0018\u001a\u0004\b\"\u0010\u0015R\u001a\u0010&\u001a\u00020\u00118\u0014X\u0094\u0004¢\u0006\f\n\u0004\b$\u0010\u0018\u001a\u0004\b%\u0010\u0015R\u001a\u0010)\u001a\u00020\u00118\u0014X\u0094\u0004¢\u0006\f\n\u0004\b'\u0010\u0018\u001a\u0004\b(\u0010\u0015R\"\u00101\u001a\u00020*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100¨\u00062"}, d2 = {"Lcom/sofascore/results/view/graph/BasketballShotmapPlayAreasGraph;", "Landroid/view/View;", "", "a", "F", "getLineSpace", "()F", "lineSpace", "b", "getTextVerticalOffset", "textVerticalOffset", "Landroid/graphics/Paint;", "d", "Landroid/graphics/Paint;", "getTextPaint", "()Landroid/graphics/Paint;", "textPaint", "Landroid/graphics/Bitmap;", InneractiveMediationDefs.GENDER_FEMALE, "Ljoa;", "getEmptyBitmap", "()Landroid/graphics/Bitmap;", "emptyBitmap", g.e, "Landroid/graphics/Bitmap;", "getLeftUpOutside", "leftUpOutside", h.b, "getLeftUpInside", "leftUpInside", i.a, "getTopMiddle", "topMiddle", j.b, "getCenterMiddle", "centerMiddle", CampaignEx.JSON_KEY_AD_K, "getLeftDown", "leftDown", "l", "getBottomMiddle", "bottomMiddle", "", C4427z5.q, "Z", "getHasEmptyLabels", "()Z", "setHasEmptyLabels", "(Z)V", "hasEmptyLabels", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public class BasketballShotmapPlayAreasGraph extends View {
    public static final /* synthetic */ int o = 0;

    /* renamed from: a, reason: from kotlin metadata */
    public final float lineSpace;

    /* renamed from: b, reason: from kotlin metadata */
    public final float textVerticalOffset;
    public final float c;

    /* renamed from: d, reason: from kotlin metadata */
    public final Paint textPaint;
    public final LinkedHashMap e;

    /* renamed from: f, reason: from kotlin metadata */
    public final joa emptyBitmap;

    /* renamed from: g, reason: from kotlin metadata */
    public final Bitmap leftUpOutside;

    /* renamed from: h, reason: from kotlin metadata */
    public final Bitmap leftUpInside;

    /* renamed from: i, reason: from kotlin metadata */
    public final Bitmap topMiddle;

    /* renamed from: j, reason: from kotlin metadata */
    public final Bitmap centerMiddle;

    /* renamed from: k, reason: from kotlin metadata */
    public final Bitmap leftDown;

    /* renamed from: l, reason: from kotlin metadata */
    public final Bitmap bottomMiddle;
    public final ArrayList m;

    /* renamed from: n, reason: from kotlin metadata */
    public boolean hasEmptyLabels;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasketballShotmapPlayAreasGraph(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        context.getClass();
        this.lineSpace = TypedValue.applyDimension(1, 1.2f, context.getResources().getDisplayMetrics());
        this.textVerticalOffset = ao2.u(16, context);
        this.c = ao2.u(4, context);
        Paint paint = new Paint(2);
        paint.setTypeface(z1g.a(R.font.sofascore_sans_bold, context));
        paint.setTextSize(ao2.u(14, context));
        paint.setColor(context.getColor(R.color.on_color_primary));
        paint.setLetterSpacing(0.01f);
        this.textPaint = paint;
        this.e = tub.g(new Pair("topLeftOutside", new Paint(2)), new Pair("topRightOutside", new Paint(2)), new Pair("bottomLeft", new Paint(2)), new Pair("bottomMiddle", new Paint(2)), new Pair("bottomRight", new Paint(2)), new Pair("topLeftInside", new Paint(2)), new Pair("topMiddle", new Paint(2)), new Pair("topRightInside", new Paint(2)), new Pair("centerMiddle", new Paint(2)));
        this.emptyBitmap = ypa.a(ysa.c, new vn1(10));
        this.leftUpOutside = a(R.drawable.basketball_tile_1_left_up_outside);
        this.leftUpInside = a(R.drawable.basketball_tile_2_left_up_inside);
        this.topMiddle = a(R.drawable.basketball_tile_3_center_up);
        this.centerMiddle = a(R.drawable.basketball_tile_6_center_middle);
        this.leftDown = a(R.drawable.basketball_tile_7_left_down);
        this.bottomMiddle = a(R.drawable.basketball_tile_8_center_down);
        this.m = b.l("", "", "", "", "", "", "", "", "");
        setBackgroundColor(context.getColor(R.color.graphics_dark));
    }

    private final Bitmap getEmptyBitmap() {
        Object value = this.emptyBitmap.getValue();
        value.getClass();
        return (Bitmap) value;
    }

    public final Bitmap a(int i) {
        Drawable d0 = td4.d0(i, getContext());
        return d0 != null ? u6h.U(d0, 0, 0, 7) : getEmptyBitmap();
    }

    public final void b(zve zveVar, se5 se5Var, boolean z) {
        int[] iArr;
        int i = 0;
        if (zveVar == null || se5Var == null) {
            iArr = new int[0];
        } else {
            iArr = new int[9];
            for (int i2 = 0; i2 < 9; i2++) {
                fs1 fs1Var = (fs1) zveVar.a.get(i2);
                int i3 = fs1Var.a;
                int i4 = fs1Var.b;
                if (i3 + i4 == 0) {
                    iArr[i2] = R.color.rating_00;
                } else {
                    double d = i3 == 0 ? 0.0d : i3 / (i3 + i4);
                    if (!z) {
                        iArr[i2] = tol.v(d * 100.0d, se5Var.a(i2 + 1));
                    } else if (i3 + i4 >= 5) {
                        iArr[i2] = tol.v(d * 100.0d, se5Var.a(i2 + 1));
                    } else {
                        iArr[i2] = R.color.rating_00;
                    }
                }
            }
        }
        Collection values = this.e.values();
        values.getClass();
        for (Object obj : values) {
            int i5 = i + 1;
            if (i < 0) {
                b.q();
                throw null;
            }
            Paint paint = (Paint) obj;
            Integer E = ph0.E(i, iArr);
            if (E != null) {
                paint.setColorFilter(new PorterDuffColorFilter(getContext().getColor(E.intValue()), PorterDuff.Mode.SRC_IN));
            }
            i = i5;
        }
        invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(zve zveVar, se5 se5Var, int i, boolean z) {
        int i2;
        km5 km5Var;
        String str;
        int i3;
        int i4;
        String format;
        Context context = getContext();
        context.getClass();
        boolean z2 = 1;
        int i5 = 1;
        if (zveVar == null || se5Var == null) {
            i2 = 0;
            km5Var = km5.a;
        } else {
            ArrayList arrayList = zveVar.a;
            arrayList.getClass();
            ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
            Iterator it = arrayList.iterator();
            int i6 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i7 = i6 + 1;
                if (i6 < 0) {
                    b.q();
                    throw null;
                }
                fs1 fs1Var = (fs1) next;
                int i8 = fs1Var.a;
                int i9 = fs1Var.b + i8;
                int i10 = i5;
                if (i9 > 0) {
                    i10 = i5;
                    if (!z || i9 >= 5) {
                        if (i == i5) {
                            str = String.format("%.1f", Arrays.copyOf(new Object[]{Double.valueOf((i8 / i9) * 100.0d)}, i5 == true ? 1 : 0)).concat("%");
                            i3 = i5;
                        } else if (i != 2) {
                            if (i == 3) {
                                str = fc6.g(i8, i9, "/");
                            } else if (i == 4) {
                                int i11 = i6 < 5 ? i8 * 3 : i8 * 2;
                                String string = context.getString(R.string.basketball_points_short);
                                string.getClass();
                                Locale locale = Locale.getDefault();
                                locale.getClass();
                                String lowerCase = string.toLowerCase(locale);
                                lowerCase.getClass();
                                str = i11 + " " + lowerCase;
                            } else if (i != 5) {
                                i10 = 1;
                            } else {
                                str = String.valueOf(i9);
                            }
                            i3 = 1;
                        } else {
                            ShotActionArea a = se5Var.a(i7);
                            double p3 = a != null ? a.getP3() : 0.0d;
                            double d = (fs1Var.a / i9) * 100.0d;
                            if (d >= p3) {
                                i4 = 1;
                                format = String.format("+%.1f", Arrays.copyOf(new Object[]{Double.valueOf(d - p3)}, 1));
                            } else {
                                i4 = 1;
                                format = String.format("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(d - p3)}, 1));
                            }
                            str = format.concat("%");
                            i3 = i4;
                        }
                        if (str.length() != 0) {
                            str = "-";
                        } else if (StringsKt.J(str, "100.0", false)) {
                            str = c.r(str, "100.0", StatisticData.ERROR_CODE_NOT_FOUND, false);
                        }
                        arrayList2.add(str);
                        i6 = i7;
                        i5 = i3;
                    }
                }
                str = "";
                i3 = i10;
                if (str.length() != 0) {
                }
                arrayList2.add(str);
                i6 = i7;
                i5 = i3;
            }
            i2 = 0;
            z2 = i5;
            km5Var = arrayList2;
        }
        if (km5Var == null || !km5Var.isEmpty()) {
            Iterator<E> it2 = km5Var.iterator();
            while (it2.hasNext()) {
                if (Intrinsics.c((String) it2.next(), "-")) {
                    break;
                }
            }
        }
        z2 = i2;
        this.hasEmptyLabels = z2;
        for (int i12 = i2; i12 < 10; i12++) {
            String str2 = (String) CollectionsKt.a0(i12, km5Var);
            if (str2 != null) {
                this.m.set(i12, str2);
            }
        }
        invalidate();
    }

    @NotNull
    public Bitmap getBottomMiddle() {
        return this.bottomMiddle;
    }

    @NotNull
    public Bitmap getCenterMiddle() {
        return this.centerMiddle;
    }

    public final boolean getHasEmptyLabels() {
        return this.hasEmptyLabels;
    }

    @NotNull
    public Bitmap getLeftDown() {
        return this.leftDown;
    }

    @NotNull
    public Bitmap getLeftUpInside() {
        return this.leftUpInside;
    }

    @NotNull
    public Bitmap getLeftUpOutside() {
        return this.leftUpOutside;
    }

    public float getLineSpace() {
        return this.lineSpace;
    }

    @NotNull
    public Paint getTextPaint() {
        return this.textPaint;
    }

    public float getTextVerticalOffset() {
        return this.textVerticalOffset;
    }

    @NotNull
    public Bitmap getTopMiddle() {
        return this.topMiddle;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        canvas.translate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getLineSpace());
        canvas.save();
        canvas.translate(getLineSpace(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        Bitmap leftUpOutside = getLeftUpOutside();
        LinkedHashMap linkedHashMap = this.e;
        canvas.drawBitmap(leftUpOutside, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (Paint) linkedHashMap.get("topLeftOutside"));
        canvas.drawBitmap(getLeftDown(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getLineSpace() + getLeftUpOutside().getHeight(), (Paint) linkedHashMap.get("bottomLeft"));
        canvas.translate(getLeftUpOutside().getWidth(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        canvas.drawBitmap(getLeftUpInside(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (Paint) linkedHashMap.get("topLeftInside"));
        canvas.translate(getLineSpace() + getLeftUpInside().getWidth(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        canvas.drawBitmap(getTopMiddle(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (Paint) linkedHashMap.get("topMiddle"));
        canvas.translate(getLineSpace() + getTopMiddle().getWidth(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        canvas.restore();
        canvas.save();
        canvas.scale(-1.0f, 1.0f, getWidth() / 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        canvas.translate(getLineSpace(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        canvas.drawBitmap(getLeftUpOutside(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (Paint) linkedHashMap.get("topRightOutside"));
        canvas.drawBitmap(getLeftDown(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getLineSpace() + getLeftUpOutside().getHeight(), (Paint) linkedHashMap.get("bottomRight"));
        canvas.translate(getLeftUpOutside().getWidth(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        canvas.drawBitmap(getLeftUpInside(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (Paint) linkedHashMap.get("topRightInside"));
        canvas.restore();
        canvas.drawBitmap(getCenterMiddle(), (getWidth() / 2.0f) - (getCenterMiddle().getWidth() / 2.0f), getLineSpace() + getTopMiddle().getHeight(), (Paint) linkedHashMap.get("centerMiddle"));
        canvas.drawBitmap(getBottomMiddle(), (getWidth() / 2.0f) - (getBottomMiddle().getWidth() / 2.0f), getLineSpace() + ((getLeftDown().getHeight() + getLeftUpOutside().getHeight()) - getBottomMiddle().getHeight()), (Paint) linkedHashMap.get("bottomMiddle"));
        float textSize = getTextPaint().getTextSize() + getTextVerticalOffset();
        getTextPaint().setTextAlign(Paint.Align.LEFT);
        ArrayList arrayList = this.m;
        String str = (String) arrayList.get(0);
        Paint textPaint = getTextPaint();
        float f = this.c;
        canvas.drawText(str, f, textSize, textPaint);
        getTextPaint().setTextAlign(Paint.Align.RIGHT);
        canvas.drawText((String) arrayList.get(1), getWidth() - f, textSize, getTextPaint());
        float width = getLeftDown().getWidth() / 2.0f;
        float height = (getHeight() - 16.0f) - getTextPaint().getTextSize();
        getTextPaint().setTextAlign(Paint.Align.CENTER);
        canvas.drawText((String) arrayList.get(2), width, height, getTextPaint());
        canvas.drawText((String) arrayList.get(3), getWidth() / 2.0f, height, getTextPaint());
        canvas.drawText((String) arrayList.get(4), (getLineSpace() * 2.0f) + (width * 3.0f) + getBottomMiddle().getWidth(), height, getTextPaint());
        float width2 = (getLeftUpInside().getWidth() / 2.0f) + getLeftUpOutside().getWidth();
        float height2 = (3.0f * f) + getCenterMiddle().getHeight();
        canvas.drawText((String) arrayList.get(5), width2, height2, getTextPaint());
        canvas.drawText((String) arrayList.get(6), getWidth() / 2.0f, height2, getTextPaint());
        canvas.drawText((String) arrayList.get(7), getWidth() - width2, height2, getTextPaint());
        canvas.drawText((String) arrayList.get(8), getWidth() / 2.0f, (getCenterMiddle().getHeight() + getTopMiddle().getHeight()) - f, getTextPaint());
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension((((int) getLineSpace()) * 4) + getTopMiddle().getWidth() + (getLeftUpOutside().getWidth() * 2) + (getLeftUpInside().getWidth() * 2), (((int) getLineSpace()) * 3) + getLeftDown().getHeight() + getLeftUpOutside().getHeight());
    }

    public final void setHasEmptyLabels(boolean z) {
        this.hasEmptyLabels = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BasketballShotmapPlayAreasGraph(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    public /* synthetic */ BasketballShotmapPlayAreasGraph(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
