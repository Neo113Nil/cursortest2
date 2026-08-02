package com.bytedance.adsdk.sf.gm.gm;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.LongSparseArray;
import com.bytedance.adsdk.sf.gm.pcc.vh;
import com.bytedance.adsdk.sf.gm.sf;
import com.bytedance.adsdk.sf.gm.sf.dax;
import com.bytedance.adsdk.sf.lo;
import com.bytedance.adsdk.sf.pcc.sf.jr;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class vy extends com.bytedance.adsdk.sf.gm.gm.pcc {
    private final com.bytedance.adsdk.sf.vy dax;
    private com.bytedance.adsdk.sf.pcc.sf.pcc<Integer, Integer> fum;
    private final List<pcc> gbb;
    private com.bytedance.adsdk.sf.pcc.sf.pcc<Integer, Integer> gpj;
    private final LongSparseArray<String> hc;
    private final jr jr;
    private com.bytedance.adsdk.sf.pcc.sf.pcc<Float, Float> jsj;
    private final RectF kj;
    private com.bytedance.adsdk.sf.pcc.sf.pcc<Integer, Integer> lo;
    private com.bytedance.adsdk.sf.pcc.sf.pcc<Integer, Integer> lu;
    private final com.bytedance.adsdk.sf.qf nac;
    private com.bytedance.adsdk.sf.pcc.sf.pcc<Float, Float> of;
    private final Paint ork;
    private final StringBuilder qf;
    private com.bytedance.adsdk.sf.pcc.sf.pcc<Float, Float> qy;
    private final Map<com.bytedance.adsdk.sf.gm.oo, List<com.bytedance.adsdk.sf.pcc.pcc.oo>> tmg;
    private com.bytedance.adsdk.sf.pcc.sf.pcc<Typeface, Typeface> tsz;
    private com.bytedance.adsdk.sf.pcc.sf.pcc<Float, Float> tz;
    private final Paint vh;
    private final Matrix vy;
    private com.bytedance.adsdk.sf.pcc.sf.pcc<Float, Float> yt;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.bytedance.adsdk.sf.gm.gm.vy$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] pcc;

        static {
            int[] iArr = new int[sf.pcc.values().length];
            pcc = iArr;
            try {
                iArr[sf.pcc.LEFT_ALIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                pcc[sf.pcc.RIGHT_ALIGN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                pcc[sf.pcc.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public vy(com.bytedance.adsdk.sf.vy vyVar, vj vjVar) {
        super(vyVar, vjVar);
        com.bytedance.adsdk.sf.gm.pcc.sf sfVar;
        com.bytedance.adsdk.sf.gm.pcc.sf sfVar2;
        com.bytedance.adsdk.sf.gm.pcc.pcc pccVar;
        com.bytedance.adsdk.sf.gm.pcc.pcc pccVar2;
        this.qf = new StringBuilder(2);
        this.kj = new RectF();
        this.vy = new Matrix();
        int i = 1;
        this.ork = new Paint(i) { // from class: com.bytedance.adsdk.sf.gm.gm.vy.1
            {
                setStyle(Paint.Style.FILL);
            }
        };
        this.vh = new Paint(i) { // from class: com.bytedance.adsdk.sf.gm.gm.vy.2
            {
                setStyle(Paint.Style.STROKE);
            }
        };
        this.tmg = new HashMap();
        this.hc = new LongSparseArray<>();
        this.gbb = new ArrayList();
        this.dax = vyVar;
        this.nac = vjVar.pcc();
        jr pcc2 = vjVar.gpj().pcc();
        this.jr = pcc2;
        pcc2.pcc(this);
        pcc(pcc2);
        vh lo = vjVar.lo();
        if (lo != null && (pccVar2 = lo.pcc) != null) {
            com.bytedance.adsdk.sf.pcc.sf.pcc<Integer, Integer> pcc3 = pccVar2.pcc();
            this.lu = pcc3;
            pcc3.pcc(this);
            pcc(this.lu);
        }
        if (lo != null && (pccVar = lo.sf) != null) {
            com.bytedance.adsdk.sf.pcc.sf.pcc<Integer, Integer> pcc4 = pccVar.pcc();
            this.lo = pcc4;
            pcc4.pcc(this);
            pcc(this.lo);
        }
        if (lo != null && (sfVar2 = lo.gm) != null) {
            com.bytedance.adsdk.sf.pcc.sf.pcc<Float, Float> pcc5 = sfVar2.pcc();
            this.tz = pcc5;
            pcc5.pcc(this);
            pcc(this.tz);
        }
        if (lo == null || (sfVar = lo.oo) == null) {
            return;
        }
        com.bytedance.adsdk.sf.pcc.sf.pcc<Float, Float> pcc6 = sfVar.pcc();
        this.yt = pcc6;
        pcc6.pcc(this);
        pcc(this.yt);
    }

    private boolean gm(int i) {
        return Character.getType(i) == 16 || Character.getType(i) == 27 || Character.getType(i) == 6 || Character.getType(i) == 28 || Character.getType(i) == 8 || Character.getType(i) == 19;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void pcc(com.bytedance.adsdk.sf.gm.sf sfVar, com.bytedance.adsdk.sf.gm.gm gmVar, Canvas canvas) {
        float floatValue;
        int size;
        int i;
        Typeface pcc2 = pcc(gmVar);
        if (pcc2 == null) {
            return;
        }
        String str = sfVar.pcc;
        lo yt = this.dax.yt();
        if (yt != null) {
            str = yt.sf(vy(), str);
        }
        this.ork.setTypeface(pcc2);
        com.bytedance.adsdk.sf.pcc.sf.pcc<Float, Float> pccVar = this.jsj;
        float floatValue2 = pccVar != null ? pccVar.qf().floatValue() : sfVar.gm;
        this.ork.setTextSize(com.bytedance.adsdk.sf.wh.wh.pcc() * floatValue2);
        this.vh.setTypeface(this.ork.getTypeface());
        this.vh.setTextSize(this.ork.getTextSize());
        float f = sfVar.vj / 10.0f;
        com.bytedance.adsdk.sf.pcc.sf.pcc<Float, Float> pccVar2 = this.qy;
        if (pccVar2 == null) {
            com.bytedance.adsdk.sf.pcc.sf.pcc<Float, Float> pccVar3 = this.yt;
            if (pccVar3 != null) {
                floatValue = pccVar3.qf().floatValue();
            }
            float pcc3 = ((com.bytedance.adsdk.sf.wh.wh.pcc() * f) * floatValue2) / 100.0f;
            List<String> pcc4 = pcc(str);
            size = pcc4.size();
            int i2 = -1;
            i = 0;
            while (i < size) {
                String str2 = pcc4.get(i);
                PointF pointF = sfVar.hc;
                float f2 = pointF == null ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : pointF.x;
                vy vyVar = this;
                com.bytedance.adsdk.sf.gm.gm gmVar2 = gmVar;
                List<pcc> pcc5 = vyVar.pcc(str2, f2, gmVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, pcc3, false);
                for (int i3 = 0; i3 < pcc5.size(); i3++) {
                    pcc pccVar4 = pcc5.get(i3);
                    i2++;
                    canvas.save();
                    vyVar.pcc(canvas, sfVar, i2, pccVar4.sf);
                    vyVar.pcc(pccVar4.pcc, sfVar, canvas, pcc3);
                    canvas.restore();
                }
                i++;
                this = vyVar;
                gmVar = gmVar2;
            }
        }
        floatValue = pccVar2.qf().floatValue();
        f += floatValue;
        float pcc32 = ((com.bytedance.adsdk.sf.wh.wh.pcc() * f) * floatValue2) / 100.0f;
        List<String> pcc42 = pcc(str);
        size = pcc42.size();
        int i22 = -1;
        i = 0;
        while (i < size) {
        }
    }

    @Override // com.bytedance.adsdk.sf.gm.gm.pcc
    public void sf(Canvas canvas, Matrix matrix, int i) {
        super.sf(canvas, matrix, i);
        com.bytedance.adsdk.sf.gm.sf qf = this.jr.qf();
        com.bytedance.adsdk.sf.gm.gm gmVar = this.nac.jr().get(qf.sf);
        if (gmVar == null) {
            return;
        }
        canvas.save();
        canvas.concat(matrix);
        pcc(qf, matrix);
        if (this.dax.qy()) {
            pcc(qf, matrix, gmVar, canvas);
        } else {
            pcc(qf, gmVar, canvas);
        }
        canvas.restore();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class pcc {
        private String pcc;
        private float sf;

        private pcc() {
            this.pcc = "";
            this.sf = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }

        public void pcc(String str, float f) {
            this.pcc = str;
            this.sf = f;
        }
    }

    private pcc sf(int i) {
        int size = this.gbb.size();
        while (true) {
            List<pcc> list = this.gbb;
            if (size < i) {
                list.add(new pcc());
                size++;
            } else {
                return list.get(i - 1);
            }
        }
    }

    private void pcc(com.bytedance.adsdk.sf.gm.sf sfVar, Matrix matrix) {
        com.bytedance.adsdk.sf.pcc.sf.pcc<Integer, Integer> pccVar = this.gpj;
        if (pccVar != null) {
            this.ork.setColor(pccVar.qf().intValue());
        } else {
            com.bytedance.adsdk.sf.pcc.sf.pcc<Integer, Integer> pccVar2 = this.lu;
            Paint paint = this.ork;
            if (pccVar2 != null) {
                paint.setColor(pccVar2.qf().intValue());
            } else {
                paint.setColor(sfVar.kj);
            }
        }
        com.bytedance.adsdk.sf.pcc.sf.pcc<Integer, Integer> pccVar3 = this.fum;
        if (pccVar3 != null) {
            this.vh.setColor(pccVar3.qf().intValue());
        } else {
            com.bytedance.adsdk.sf.pcc.sf.pcc<Integer, Integer> pccVar4 = this.lo;
            Paint paint2 = this.vh;
            if (pccVar4 != null) {
                paint2.setColor(pccVar4.qf().intValue());
            } else {
                paint2.setColor(sfVar.vy);
            }
        }
        int intValue = ((this.oo.pcc() == null ? 100 : this.oo.pcc().qf().intValue()) * 255) / 100;
        this.ork.setAlpha(intValue);
        this.vh.setAlpha(intValue);
        com.bytedance.adsdk.sf.pcc.sf.pcc<Float, Float> pccVar5 = this.of;
        if (pccVar5 != null) {
            this.vh.setStrokeWidth(pccVar5.qf().floatValue());
            return;
        }
        com.bytedance.adsdk.sf.pcc.sf.pcc<Float, Float> pccVar6 = this.tz;
        Paint paint3 = this.vh;
        if (pccVar6 != null) {
            paint3.setStrokeWidth(pccVar6.qf().floatValue());
        } else {
            paint3.setStrokeWidth(com.bytedance.adsdk.sf.wh.wh.pcc() * sfVar.ork);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void pcc(com.bytedance.adsdk.sf.gm.sf sfVar, Matrix matrix, com.bytedance.adsdk.sf.gm.gm gmVar, Canvas canvas) {
        float f;
        float floatValue;
        int i;
        vy vyVar = this;
        com.bytedance.adsdk.sf.gm.sf sfVar2 = sfVar;
        com.bytedance.adsdk.sf.pcc.sf.pcc<Float, Float> pccVar = vyVar.jsj;
        if (pccVar != null) {
            f = pccVar.qf().floatValue();
        } else {
            f = sfVar2.gm;
        }
        float f2 = f / 100.0f;
        float pcc2 = com.bytedance.adsdk.sf.wh.wh.pcc(matrix);
        List<String> pcc3 = vyVar.pcc(sfVar2.pcc);
        int size = pcc3.size();
        float f3 = sfVar2.vj / 10.0f;
        com.bytedance.adsdk.sf.pcc.sf.pcc<Float, Float> pccVar2 = vyVar.qy;
        if (pccVar2 != null) {
            floatValue = pccVar2.qf().floatValue();
        } else {
            com.bytedance.adsdk.sf.pcc.sf.pcc<Float, Float> pccVar3 = vyVar.yt;
            if (pccVar3 != null) {
                floatValue = pccVar3.qf().floatValue();
            }
            float f4 = f3;
            int i2 = -1;
            i = 0;
            while (i < size) {
                String str = pcc3.get(i);
                PointF pointF = sfVar2.hc;
                List<pcc> pcc4 = vyVar.pcc(str, pointF == null ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : pointF.x, gmVar, f2, f4, true);
                int i3 = 0;
                while (i3 < pcc4.size()) {
                    pcc pccVar4 = pcc4.get(i3);
                    i2++;
                    canvas.save();
                    vyVar.pcc(canvas, sfVar2, i2, pccVar4.sf);
                    float f5 = f2;
                    com.bytedance.adsdk.sf.gm.sf sfVar3 = sfVar2;
                    float f6 = f4;
                    vyVar.pcc(pccVar4.pcc, sfVar3, gmVar, canvas, pcc2, f5, f6);
                    f2 = f5;
                    canvas.restore();
                    i3++;
                    vyVar = this;
                    f4 = f6;
                    sfVar2 = sfVar;
                }
                i++;
                vyVar = this;
                f4 = f4;
                sfVar2 = sfVar;
            }
        }
        f3 += floatValue;
        float f42 = f3;
        int i22 = -1;
        i = 0;
        while (i < size) {
        }
    }

    private void pcc(String str, com.bytedance.adsdk.sf.gm.sf sfVar, com.bytedance.adsdk.sf.gm.gm gmVar, Canvas canvas, float f, float f2, float f3) {
        for (int i = 0; i < str.length(); i++) {
            com.bytedance.adsdk.sf.gm.oo ooVar = this.nac.gbb().get(com.bytedance.adsdk.sf.gm.oo.pcc(str.charAt(i), gmVar.pcc(), gmVar.gm()));
            if (ooVar != null) {
                pcc(ooVar, f2, sfVar, canvas);
                canvas.translate((com.bytedance.adsdk.sf.wh.wh.pcc() * ((float) ooVar.sf()) * f2) + f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
        }
    }

    @Override // com.bytedance.adsdk.sf.gm.gm.pcc, com.bytedance.adsdk.sf.pcc.pcc.vj
    public void pcc(RectF rectF, Matrix matrix, boolean z) {
        super.pcc(rectF, matrix, z);
        rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.nac.oo().width(), this.nac.oo().height());
    }

    private void pcc(Canvas canvas, com.bytedance.adsdk.sf.gm.sf sfVar, int i, float f) {
        PointF pointF = sfVar.tmg;
        PointF pointF2 = sfVar.hc;
        float pcc2 = com.bytedance.adsdk.sf.wh.wh.pcc();
        float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f3 = (i * sfVar.wh * pcc2) + (pointF == null ? 0.0f : (sfVar.wh * 0.6f * pcc2) + pointF.y);
        float f4 = pointF == null ? 0.0f : pointF.x;
        if (pointF2 != null) {
            f2 = pointF2.x;
        }
        int i2 = AnonymousClass3.pcc[sfVar.oo.ordinal()];
        if (i2 == 1) {
            canvas.translate(f4, f3);
        } else if (i2 == 2) {
            canvas.translate((f4 + f2) - f, f3);
        } else {
            if (i2 != 3) {
                return;
            }
            canvas.translate(((f2 / 2.0f) + f4) - (f / 2.0f), f3);
        }
    }

    private Typeface pcc(com.bytedance.adsdk.sf.gm.gm gmVar) {
        Typeface qf;
        com.bytedance.adsdk.sf.pcc.sf.pcc<Typeface, Typeface> pccVar = this.tsz;
        if (pccVar != null && (qf = pccVar.qf()) != null) {
            return qf;
        }
        Typeface pcc2 = this.dax.pcc(gmVar);
        return pcc2 != null ? pcc2 : gmVar.oo();
    }

    private List<String> pcc(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll("\n", "\r").split("\r"));
    }

    private void pcc(String str, com.bytedance.adsdk.sf.gm.sf sfVar, Canvas canvas, float f) {
        int i = 0;
        while (i < str.length()) {
            String pcc2 = pcc(str, i);
            i += pcc2.length();
            pcc(pcc2, sfVar, canvas);
            canvas.translate(this.ork.measureText(pcc2) + f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    private List<pcc> pcc(String str, float f, com.bytedance.adsdk.sf.gm.gm gmVar, float f2, float f3, boolean z) {
        float measureText;
        int i = 0;
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i4 = 0; i4 < str.length(); i4++) {
            char charAt = str.charAt(i4);
            if (z) {
                com.bytedance.adsdk.sf.gm.oo ooVar = this.nac.gbb().get(com.bytedance.adsdk.sf.gm.oo.pcc(charAt, gmVar.pcc(), gmVar.gm()));
                if (ooVar != null) {
                    measureText = (com.bytedance.adsdk.sf.wh.wh.pcc() * ((float) ooVar.sf()) * f2) + f3;
                }
            } else {
                measureText = this.ork.measureText(str.substring(i4, i4 + 1)) + f3;
            }
            if (charAt == ' ') {
                z2 = true;
                f6 = measureText;
            } else if (z2) {
                z2 = false;
                i3 = i4;
                f5 = measureText;
            } else {
                f5 += measureText;
            }
            f4 += measureText;
            if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f4 >= f && charAt != ' ') {
                i++;
                pcc sf = sf(i);
                if (i3 == i2) {
                    sf.pcc(str.substring(i2, i4).trim(), (f4 - measureText) - ((r9.length() - r7.length()) * f6));
                    i2 = i4;
                    i3 = i2;
                    f4 = measureText;
                    f5 = f4;
                } else {
                    sf.pcc(str.substring(i2, i3 - 1).trim(), ((f4 - f5) - ((r7.length() - r13.length()) * f6)) - f6);
                    f4 = f5;
                    i2 = i3;
                }
            }
        }
        if (f4 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            i++;
            sf(i).pcc(str.substring(i2), f4);
        }
        return this.gbb.subList(0, i);
    }

    private void pcc(com.bytedance.adsdk.sf.gm.oo ooVar, float f, com.bytedance.adsdk.sf.gm.sf sfVar, Canvas canvas) {
        List<com.bytedance.adsdk.sf.pcc.pcc.oo> pcc2 = pcc(ooVar);
        for (int i = 0; i < pcc2.size(); i++) {
            Path oo = pcc2.get(i).oo();
            oo.computeBounds(this.kj, false);
            this.vy.reset();
            this.vy.preTranslate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, com.bytedance.adsdk.sf.wh.wh.pcc() * (-sfVar.qf));
            this.vy.preScale(f, f);
            oo.transform(this.vy);
            if (sfVar.vh) {
                pcc(oo, this.ork, canvas);
                pcc(oo, this.vh, canvas);
            } else {
                pcc(oo, this.vh, canvas);
                pcc(oo, this.ork, canvas);
            }
        }
    }

    private void pcc(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    private void pcc(String str, com.bytedance.adsdk.sf.gm.sf sfVar, Canvas canvas) {
        if (sfVar.vh) {
            pcc(str, this.ork, canvas);
            pcc(str, this.vh, canvas);
        } else {
            pcc(str, this.vh, canvas);
            pcc(str, this.ork, canvas);
        }
    }

    private void pcc(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        canvas.drawText(str, 0, str.length(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, paint);
    }

    private List<com.bytedance.adsdk.sf.pcc.pcc.oo> pcc(com.bytedance.adsdk.sf.gm.oo ooVar) {
        if (this.tmg.containsKey(ooVar)) {
            return this.tmg.get(ooVar);
        }
        List<dax> pcc2 = ooVar.pcc();
        int size = pcc2.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(new com.bytedance.adsdk.sf.pcc.pcc.oo(this.dax, this, pcc2.get(i), this.nac));
        }
        this.tmg.put(ooVar, arrayList);
        return arrayList;
    }

    private String pcc(String str, int i) {
        int codePointAt = str.codePointAt(i);
        int charCount = Character.charCount(codePointAt) + i;
        while (charCount < str.length()) {
            int codePointAt2 = str.codePointAt(charCount);
            if (!gm(codePointAt2)) {
                break;
            }
            charCount += Character.charCount(codePointAt2);
            codePointAt = (codePointAt * 31) + codePointAt2;
        }
        long j = codePointAt;
        if (this.hc.indexOfKey(j) >= 0) {
            return this.hc.get(j);
        }
        this.qf.setLength(0);
        while (i < charCount) {
            int codePointAt3 = str.codePointAt(i);
            this.qf.appendCodePoint(codePointAt3);
            i += Character.charCount(codePointAt3);
        }
        String sb = this.qf.toString();
        this.hc.put(j, sb);
        return sb;
    }
}
