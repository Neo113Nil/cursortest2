package com.bytedance.adsdk.sf.vj;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import android.util.SparseArray;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
class lo {
    private static final Interpolator pcc = new LinearInterpolator();
    private static SparseArray<WeakReference<Interpolator>> sf;

    private static <T> com.bytedance.adsdk.sf.qf.pcc<T> pcc(com.bytedance.adsdk.sf.qf qfVar, JsonReader jsonReader, float f, lrr<T> lrrVar) throws IOException {
        Interpolator pcc2;
        jsonReader.beginObject();
        PointF pointF = null;
        T t = null;
        T t2 = null;
        PointF pointF2 = null;
        PointF pointF3 = null;
        float f2 = 0.0f;
        boolean z = false;
        PointF pointF4 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName) {
                case "e":
                    t = lrrVar.sf(jsonReader, f);
                    break;
                case "h":
                    if (jsonReader.nextInt() != 1) {
                        z = false;
                        break;
                    } else {
                        z = true;
                        break;
                    }
                case "i":
                    pointF4 = gpj.sf(jsonReader, 1.0f);
                    break;
                case "o":
                    pointF = gpj.sf(jsonReader, 1.0f);
                    break;
                case "s":
                    t2 = lrrVar.sf(jsonReader, f);
                    break;
                case "t":
                    f2 = (float) jsonReader.nextDouble();
                    break;
                case "ti":
                    pointF3 = gpj.sf(jsonReader, f);
                    break;
                case "to":
                    pointF2 = gpj.sf(jsonReader, f);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        if (z) {
            t = t2;
        } else if (pointF != null && pointF4 != null) {
            pcc2 = pcc(pointF, pointF4);
            com.bytedance.adsdk.sf.qf.pcc<T> pccVar = new com.bytedance.adsdk.sf.qf.pcc<>(qfVar, t2, t, pcc2, f2, null);
            pccVar.kj = pointF2;
            pccVar.vy = pointF3;
            return pccVar;
        }
        pcc2 = pcc;
        com.bytedance.adsdk.sf.qf.pcc<T> pccVar2 = new com.bytedance.adsdk.sf.qf.pcc<>(qfVar, t2, t, pcc2, f2, null);
        pccVar2.kj = pointF2;
        pccVar2.vy = pointF3;
        return pccVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:151:0x0263 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static <T> com.bytedance.adsdk.sf.qf.pcc<T> sf(com.bytedance.adsdk.sf.qf qfVar, JsonReader jsonReader, float f, lrr<T> lrrVar) throws IOException {
        Interpolator pcc2;
        Interpolator pcc3;
        T t;
        Interpolator interpolator;
        Interpolator pcc4;
        PointF pointF;
        PointF pointF2;
        com.bytedance.adsdk.sf.qf.pcc<T> pccVar;
        T t2;
        PointF pointF3;
        PointF pointF4;
        PointF pointF5;
        PointF pointF6;
        jsonReader.beginObject();
        boolean z = false;
        PointF pointF7 = null;
        PointF pointF8 = null;
        PointF pointF9 = null;
        T t3 = null;
        PointF pointF10 = null;
        PointF pointF11 = null;
        PointF pointF12 = null;
        PointF pointF13 = null;
        PointF pointF14 = null;
        float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        T t4 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName) {
                case "e":
                    t4 = lrrVar.sf(jsonReader, f);
                    continue;
                case "h":
                    t2 = t3;
                    pointF3 = pointF13;
                    pointF4 = pointF14;
                    if (jsonReader.nextInt() != 1) {
                        z = false;
                        break;
                    } else {
                        z = true;
                        break;
                    }
                case "i":
                    boolean z2 = z;
                    t2 = t3;
                    pointF3 = pointF13;
                    pointF4 = pointF14;
                    if (jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                        jsonReader.beginObject();
                        float f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        float f4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        float f5 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        float f6 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        while (jsonReader.hasNext()) {
                            String nextName2 = jsonReader.nextName();
                            nextName2.getClass();
                            if (nextName2.equals("x")) {
                                JsonToken peek = jsonReader.peek();
                                JsonToken jsonToken = JsonToken.NUMBER;
                                if (peek == jsonToken) {
                                    f5 = (float) jsonReader.nextDouble();
                                    f3 = f5;
                                } else {
                                    jsonReader.beginArray();
                                    f3 = (float) jsonReader.nextDouble();
                                    f5 = jsonReader.peek() == jsonToken ? (float) jsonReader.nextDouble() : f3;
                                    jsonReader.endArray();
                                }
                            } else if (nextName2.equals("y")) {
                                JsonToken peek2 = jsonReader.peek();
                                JsonToken jsonToken2 = JsonToken.NUMBER;
                                if (peek2 == jsonToken2) {
                                    f6 = (float) jsonReader.nextDouble();
                                    f4 = f6;
                                } else {
                                    jsonReader.beginArray();
                                    f4 = (float) jsonReader.nextDouble();
                                    f6 = jsonReader.peek() == jsonToken2 ? (float) jsonReader.nextDouble() : f4;
                                    jsonReader.endArray();
                                }
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                        PointF pointF15 = new PointF(f3, f4);
                        pointF12 = new PointF(f5, f6);
                        jsonReader.endObject();
                        pointF11 = pointF15;
                    } else {
                        pointF8 = gpj.sf(jsonReader, f);
                    }
                    z = z2;
                    break;
                case "o":
                    boolean z3 = z;
                    if (jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                        jsonReader.beginObject();
                        float f7 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        float f8 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        float f9 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        float f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        while (jsonReader.hasNext()) {
                            T t5 = t3;
                            String nextName3 = jsonReader.nextName();
                            nextName3.getClass();
                            if (nextName3.equals("x")) {
                                pointF5 = pointF13;
                                pointF6 = pointF14;
                                JsonToken peek3 = jsonReader.peek();
                                JsonToken jsonToken3 = JsonToken.NUMBER;
                                if (peek3 == jsonToken3) {
                                    f9 = (float) jsonReader.nextDouble();
                                    f7 = f9;
                                } else {
                                    jsonReader.beginArray();
                                    f7 = (float) jsonReader.nextDouble();
                                    f9 = jsonReader.peek() == jsonToken3 ? (float) jsonReader.nextDouble() : f7;
                                    jsonReader.endArray();
                                }
                            } else {
                                if (nextName3.equals("y")) {
                                    JsonToken peek4 = jsonReader.peek();
                                    JsonToken jsonToken4 = JsonToken.NUMBER;
                                    if (peek4 == jsonToken4) {
                                        f10 = (float) jsonReader.nextDouble();
                                        f8 = f10;
                                    } else {
                                        jsonReader.beginArray();
                                        pointF5 = pointF13;
                                        pointF6 = pointF14;
                                        f8 = (float) jsonReader.nextDouble();
                                        f10 = jsonReader.peek() == jsonToken4 ? (float) jsonReader.nextDouble() : f8;
                                        jsonReader.endArray();
                                    }
                                } else {
                                    jsonReader.skipValue();
                                }
                                t3 = t5;
                            }
                            t3 = t5;
                            pointF13 = pointF5;
                            pointF14 = pointF6;
                        }
                        PointF pointF16 = new PointF(f7, f8);
                        PointF pointF17 = new PointF(f9, f10);
                        jsonReader.endObject();
                        pointF9 = pointF16;
                        pointF10 = pointF17;
                    } else {
                        pointF7 = gpj.sf(jsonReader, f);
                    }
                    z = z3;
                    continue;
                case "s":
                    t3 = lrrVar.sf(jsonReader, f);
                    continue;
                case "t":
                    f2 = (float) jsonReader.nextDouble();
                    continue;
                case "ti":
                    pointF14 = gpj.sf(jsonReader, f);
                    continue;
                case "to":
                    pointF13 = gpj.sf(jsonReader, f);
                    continue;
                default:
                    jsonReader.skipValue();
                    continue;
            }
            t3 = t2;
            pointF13 = pointF3;
            pointF14 = pointF4;
        }
        boolean z4 = z;
        T t6 = t3;
        PointF pointF18 = pointF13;
        PointF pointF19 = pointF14;
        jsonReader.endObject();
        if (z4) {
            t4 = t6;
        } else {
            if (pointF7 != null && pointF8 != null) {
                pcc4 = pcc(pointF7, pointF8);
                interpolator = pcc4;
                t = t4;
                pcc2 = null;
                pcc3 = null;
                if (pcc2 != null) {
                }
                pointF = pointF18;
                pointF2 = pointF19;
                pccVar = new com.bytedance.adsdk.sf.qf.pcc<>(qfVar, t6, t, interpolator, f2, null);
                pccVar.kj = pointF;
                pccVar.vy = pointF2;
                return pccVar;
            }
            if (pointF9 != null && pointF10 != null && pointF11 != null && pointF12 != null) {
                pcc2 = pcc(pointF9, pointF11);
                pcc3 = pcc(pointF10, pointF12);
                t = t4;
                interpolator = null;
                if (pcc2 != null || pcc3 == null) {
                    pointF = pointF18;
                    pointF2 = pointF19;
                    pccVar = new com.bytedance.adsdk.sf.qf.pcc<>(qfVar, t6, t, interpolator, f2, null);
                } else {
                    pointF = pointF18;
                    pointF2 = pointF19;
                    pccVar = new com.bytedance.adsdk.sf.qf.pcc<>(qfVar, t6, t, pcc2, pcc3, f2, null);
                }
                pccVar.kj = pointF;
                pccVar.vy = pointF2;
                return pccVar;
            }
        }
        pcc4 = pcc;
        interpolator = pcc4;
        t = t4;
        pcc2 = null;
        pcc3 = null;
        if (pcc2 != null) {
        }
        pointF = pointF18;
        pointF2 = pointF19;
        pccVar = new com.bytedance.adsdk.sf.qf.pcc<>(qfVar, t6, t, interpolator, f2, null);
        pccVar.kj = pointF;
        pccVar.vy = pointF2;
        return pccVar;
    }

    private static WeakReference<Interpolator> pcc(int i) {
        WeakReference<Interpolator> weakReference;
        synchronized (lo.class) {
            weakReference = pcc().get(i);
        }
        return weakReference;
    }

    private static void pcc(int i, WeakReference<Interpolator> weakReference) {
        synchronized (lo.class) {
            sf.put(i, weakReference);
        }
    }

    public static <T> com.bytedance.adsdk.sf.qf.pcc<T> pcc(JsonReader jsonReader, com.bytedance.adsdk.sf.qf qfVar, float f, lrr<T> lrrVar, boolean z, boolean z2) throws IOException {
        if (z && z2) {
            return sf(qfVar, jsonReader, f, lrrVar);
        }
        if (z) {
            return pcc(qfVar, jsonReader, f, lrrVar);
        }
        return pcc(jsonReader, f, lrrVar);
    }

    private static SparseArray<WeakReference<Interpolator>> pcc() {
        SparseArray<WeakReference<Interpolator>> sparseArray = sf;
        if (sparseArray != null) {
            return sparseArray;
        }
        SparseArray<WeakReference<Interpolator>> sparseArray2 = new SparseArray<>();
        sf = sparseArray2;
        return sparseArray2;
    }

    private static Interpolator pcc(PointF pointF, PointF pointF2) {
        Interpolator linearInterpolator;
        pointF.x = com.bytedance.adsdk.sf.wh.vj.sf(pointF.x, -1.0f, 1.0f);
        pointF.y = com.bytedance.adsdk.sf.wh.vj.sf(pointF.y, -100.0f, 100.0f);
        pointF2.x = com.bytedance.adsdk.sf.wh.vj.sf(pointF2.x, -1.0f, 1.0f);
        float sf2 = com.bytedance.adsdk.sf.wh.vj.sf(pointF2.y, -100.0f, 100.0f);
        pointF2.y = sf2;
        int pcc2 = com.bytedance.adsdk.sf.wh.wh.pcc(pointF.x, pointF.y, pointF2.x, sf2);
        WeakReference<Interpolator> pcc3 = com.bytedance.adsdk.sf.vj.pcc() ? null : pcc(pcc2);
        Interpolator interpolator = pcc3 != null ? pcc3.get() : null;
        if (pcc3 != null && interpolator != null) {
            return interpolator;
        }
        try {
            linearInterpolator = com.bytedance.adsdk.sf.nac.pcc(pointF.x, pointF.y, pointF2.x, pointF2.y);
        } catch (IllegalArgumentException e) {
            if ("The Path cannot loop back on itself.".equals(e.getMessage())) {
                linearInterpolator = com.bytedance.adsdk.sf.nac.pcc(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), pointF2.y);
            } else {
                linearInterpolator = new LinearInterpolator();
            }
        }
        if (!com.bytedance.adsdk.sf.vj.pcc()) {
            try {
                pcc(pcc2, (WeakReference<Interpolator>) new WeakReference(linearInterpolator));
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return linearInterpolator;
    }

    private static <T> com.bytedance.adsdk.sf.qf.pcc<T> pcc(JsonReader jsonReader, float f, lrr<T> lrrVar) throws IOException {
        return new com.bytedance.adsdk.sf.qf.pcc<>(lrrVar.sf(jsonReader, f));
    }
}
