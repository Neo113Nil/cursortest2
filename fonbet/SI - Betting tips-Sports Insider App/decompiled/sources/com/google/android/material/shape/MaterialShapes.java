package com.google.android.material.shape;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.PathShape;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.measurement.d5;
import com.google.android.gms.internal.measurement.y3;
import hf.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p1.b;
import p1.c;
import p1.o;
import p1.p;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class MaterialShapes {
    private static final b CORNER_ROUND_15 = new b(0.15f, 0.0f);
    private static final b CORNER_ROUND_20 = new b(0.2f, 0.0f);
    private static final b CORNER_ROUND_30 = new b(0.3f, 0.0f);
    private static final b CORNER_ROUND_50 = new b(0.5f, 0.0f);
    private static final b CORNER_ROUND_100 = new b(1.0f, 0.0f);
    public static final o CIRCLE = normalize(getCircle(), true);
    public static final o SQUARE = normalize(getSquare(), true);
    public static final o SLANTED_SQUARE = normalize(getSlantedSquare(), true);
    public static final o ARCH = normalize(getArch(), true);
    public static final o FAN = normalize(getFan(), true);
    public static final o ARROW = normalize(getArrow(), true);
    public static final o SEMI_CIRCLE = normalize(getSemiCircle(), true);
    public static final o OVAL = normalize(getOval(-45.0f), true);
    public static final o PILL = normalize(getPill(), true);
    public static final o TRIANGLE = normalize(getTriangle(-90.0f), true);
    public static final o DIAMOND = normalize(getDiamond(), true);
    public static final o CLAM_SHELL = normalize(getClamShell(), true);
    public static final o PENTAGON = normalize(getPentagon(), true);
    public static final o GEM = normalize(getGem(-90.0f), true);
    public static final o SUNNY = normalize(getSunny(), true);
    public static final o VERY_SUNNY = normalize(getVerySunny(), true);
    public static final o COOKIE_4 = normalize(getCookie4(), true);
    public static final o COOKIE_6 = normalize(getCookie6(), true);
    public static final o COOKIE_7 = normalize(getCookie7(), true);
    public static final o COOKIE_9 = normalize(getCookie9(), true);
    public static final o COOKIE_12 = normalize(getCookie12(), true);
    public static final o GHOSTISH = normalize(getGhostish(), true);
    public static final o CLOVER_4 = normalize(getClover4(), true);
    public static final o CLOVER_8 = normalize(getClover8(), true);
    public static final o BURST = normalize(getBurst(), true);
    public static final o SOFT_BURST = normalize(getSoftBurst(), true);
    public static final o BOOM = normalize(getBoom(), true);
    public static final o SOFT_BOOM = normalize(getSoftBoom(), true);
    public static final o FLOWER = normalize(getFlower(), true);
    public static final o PUFFY = normalize(getPuffy(), true);
    public static final o PUFFY_DIAMOND = normalize(getPuffyDiamond(), true);
    public static final o PIXEL_CIRCLE = normalize(getPixelCircle(), true);
    public static final o PIXEL_TRIANGLE = normalize(getPixelTriangle(), true);
    public static final o BUN = normalize(getBun(), true);
    public static final o HEART = normalize(getHeart(), true);

    private MaterialShapes() {
    }

    @NonNull
    public static Matrix createRotationMatrix(float f6) {
        Matrix matrix = new Matrix();
        matrix.setRotate(f6);
        return matrix;
    }

    @NonNull
    public static Matrix createScaleMatrix(float f6, float f10) {
        Matrix matrix = new Matrix();
        matrix.setScale(f6, f10);
        return matrix;
    }

    @NonNull
    public static ShapeDrawable createShapeDrawable(@NonNull o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        Path path = new Path();
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        Intrinsics.checkNotNullParameter(path, "path");
        com.google.android.play.core.appupdate.b.C(path, oVar.f21442d);
        return new ShapeDrawable(new PathShape(path, 1.0f, 1.0f));
    }

    @NonNull
    public static Matrix createSkewMatrix(float f6, float f10) {
        Matrix matrix = new Matrix();
        matrix.setSkew(f6, f10);
        return matrix;
    }

    @NonNull
    private static o customPolygon(@NonNull List<VertexAndRounding> list, int i5, float f6, float f10, boolean z5) {
        ArrayList arrayList = new ArrayList();
        repeatAroundCenter(list, arrayList, i5, f6, f10, z5);
        return y3.b(toVerticesXyArray(arrayList), b.f21407c, toRoundingsList(arrayList), f6, f10);
    }

    @NonNull
    private static o getArch() {
        b bVar = b.f21407c;
        b bVar2 = CORNER_ROUND_100;
        b bVar3 = CORNER_ROUND_20;
        return com.google.android.play.core.appupdate.b.H(y3.a(4, 1.0f, bVar, Arrays.asList(bVar2, bVar2, bVar3, bVar3)), createRotationMatrix(-135.0f));
    }

    @NonNull
    private static o getArrow() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new VertexAndRounding(new PointF(0.5f, 0.892f), new b(0.313f, 0.0f)));
        arrayList.add(new VertexAndRounding(new PointF(-0.216f, 1.05f), new b(0.207f, 0.0f)));
        arrayList.add(new VertexAndRounding(new PointF(0.499f, -0.16f), new b(0.215f, 1.0f)));
        arrayList.add(new VertexAndRounding(new PointF(1.225f, 1.06f), new b(0.211f, 0.0f)));
        return customPolygon(arrayList, 1, 0.5f, 0.5f, false);
    }

    @NonNull
    private static o getBoom() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new VertexAndRounding(new PointF(0.457f, 0.296f), new b(0.007f, 0.0f)));
        arrayList.add(new VertexAndRounding(new PointF(0.5f, -0.051f), new b(0.007f, 0.0f)));
        return customPolygon(arrayList, 15, 0.5f, 0.5f, false);
    }

    @NonNull
    private static o getBun() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new VertexAndRounding(new PointF(0.796f, 0.5f)));
        PointF pointF = new PointF(0.853f, 0.518f);
        b bVar = CORNER_ROUND_100;
        arrayList.add(new VertexAndRounding(pointF, bVar));
        arrayList.add(new VertexAndRounding(new PointF(0.992f, 0.631f), bVar));
        arrayList.add(new VertexAndRounding(new PointF(0.968f, 1.0f), bVar));
        return customPolygon(arrayList, 2, 0.5f, 0.5f, true);
    }

    @NonNull
    private static o getBurst() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new VertexAndRounding(new PointF(0.5f, -0.006f), new b(0.006f, 0.0f)));
        arrayList.add(new VertexAndRounding(new PointF(0.592f, 0.158f), new b(0.006f, 0.0f)));
        return customPolygon(arrayList, 12, 0.5f, 0.5f, false);
    }

    @NonNull
    private static o getCircle() {
        Intrinsics.checkNotNullParameter(o.f21438e, "<this>");
        return d5.i(14);
    }

    @NonNull
    private static o getClamShell() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new VertexAndRounding(new PointF(0.171f, 0.841f), new b(0.159f, 0.0f)));
        arrayList.add(new VertexAndRounding(new PointF(-0.02f, 0.5f), new b(0.14f, 0.0f)));
        arrayList.add(new VertexAndRounding(new PointF(0.17f, 0.159f), new b(0.159f, 0.0f)));
        return customPolygon(arrayList, 2, 0.5f, 0.5f, false);
    }

    @NonNull
    private static o getClover4() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new VertexAndRounding(new PointF(0.5f, 0.074f)));
        arrayList.add(new VertexAndRounding(new PointF(0.725f, -0.099f), new b(0.476f, 0.0f)));
        return customPolygon(arrayList, 4, 0.5f, 0.5f, true);
    }

    @NonNull
    private static o getClover8() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new VertexAndRounding(new PointF(0.5f, 0.036f)));
        arrayList.add(new VertexAndRounding(new PointF(0.758f, -0.101f), new b(0.209f, 0.0f)));
        return customPolygon(arrayList, 8, 0.5f, 0.5f, false);
    }

    @NonNull
    private static o getCookie12() {
        return com.google.android.play.core.appupdate.b.H(d5.T(12, 0.8f, CORNER_ROUND_50), createRotationMatrix(-90.0f));
    }

    @NonNull
    private static o getCookie4() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new VertexAndRounding(new PointF(1.237f, 1.236f), new b(0.258f, 0.0f)));
        arrayList.add(new VertexAndRounding(new PointF(0.5f, 0.918f), new b(0.233f, 0.0f)));
        return customPolygon(arrayList, 4, 0.5f, 0.5f, false);
    }

    @NonNull
    private static o getCookie6() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new VertexAndRounding(new PointF(0.723f, 0.884f), new b(0.394f, 0.0f)));
        arrayList.add(new VertexAndRounding(new PointF(0.5f, 1.099f), new b(0.398f, 0.0f)));
        return customPolygon(arrayList, 6, 0.5f, 0.5f, false);
    }

    @NonNull
    private static o getCookie7() {
        return com.google.android.play.core.appupdate.b.H(d5.T(7, 0.75f, CORNER_ROUND_50), createRotationMatrix(-90.0f));
    }

    @NonNull
    private static o getCookie9() {
        return com.google.android.play.core.appupdate.b.H(d5.T(9, 0.8f, CORNER_ROUND_50), createRotationMatrix(-90.0f));
    }

    @NonNull
    private static o getDiamond() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new VertexAndRounding(new PointF(0.5f, 1.096f), new b(0.151f, 0.524f)));
        arrayList.add(new VertexAndRounding(new PointF(0.04f, 0.5f), new b(0.159f, 0.0f)));
        return customPolygon(arrayList, 2, 0.5f, 0.5f, false);
    }

    @NonNull
    private static o getFan() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new VertexAndRounding(new PointF(1.0f, 1.0f), new b(0.148f, 0.417f)));
        arrayList.add(new VertexAndRounding(new PointF(0.0f, 1.0f), new b(0.151f, 0.0f)));
        arrayList.add(new VertexAndRounding(new PointF(0.0f, 0.0f), new b(0.148f, 0.0f)));
        arrayList.add(new VertexAndRounding(new PointF(0.978f, 0.02f), new b(0.803f, 0.0f)));
        return customPolygon(arrayList, 1, 0.5f, 0.5f, false);
    }

    @NonNull
    private static o getFlower() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new VertexAndRounding(new PointF(0.37f, 0.187f)));
        arrayList.add(new VertexAndRounding(new PointF(0.416f, 0.049f), new b(0.381f, 0.0f)));
        arrayList.add(new VertexAndRounding(new PointF(0.479f, 0.0f), new b(0.095f, 0.0f)));
        return customPolygon(arrayList, 8, 0.5f, 0.5f, true);
    }

    @NonNull
    private static o getGem() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new VertexAndRounding(new PointF(0.499f, 1.023f), new b(0.241f, 0.778f)));
        arrayList.add(new VertexAndRounding(new PointF(-0.005f, 0.792f), new b(0.208f, 0.0f)));
        arrayList.add(new VertexAndRounding(new PointF(0.073f, 0.258f), new b(0.228f, 0.0f)));
        arrayList.add(new VertexAndRounding(new PointF(0.433f, -0.0f), new b(0.491f, 0.0f)));
        return customPolygon(arrayList, 1, 0.5f, 0.5f, true);
    }

    @NonNull
    private static o getGhostish() {
        ArrayList arrayList = new ArrayList();
        PointF pointF = new PointF(0.5f, 0.0f);
        b bVar = CORNER_ROUND_100;
        arrayList.add(new VertexAndRounding(pointF, bVar));
        arrayList.add(new VertexAndRounding(new PointF(1.0f, 0.0f), bVar));
        arrayList.add(new VertexAndRounding(new PointF(1.0f, 1.14f), new b(0.254f, 0.106f)));
        arrayList.add(new VertexAndRounding(new PointF(0.575f, 0.906f), new b(0.253f, 0.0f)));
        return customPolygon(arrayList, 1, 0.5f, 0.5f, true);
    }

    @NonNull
    private static o getHeart() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new VertexAndRounding(new PointF(0.5f, 0.268f), new b(0.016f, 0.0f)));
        arrayList.add(new VertexAndRounding(new PointF(0.792f, -0.066f), new b(0.958f, 0.0f)));
        arrayList.add(new VertexAndRounding(new PointF(1.064f, 0.276f), CORNER_ROUND_100));
        arrayList.add(new VertexAndRounding(new PointF(0.501f, 0.946f), new b(0.129f, 0.0f)));
        return customPolygon(arrayList, 1, 0.5f, 0.5f, true);
    }

    @NonNull
    private static o getOval() {
        Intrinsics.checkNotNullParameter(o.f21438e, "<this>");
        return com.google.android.play.core.appupdate.b.H(d5.i(15), createScaleMatrix(1.0f, 0.64f));
    }

    @NonNull
    private static o getPentagon() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new VertexAndRounding(new PointF(0.5f, -0.009f), new b(0.172f, 0.0f)));
        return customPolygon(arrayList, 5, 0.5f, 0.5f, false);
    }

    @NonNull
    private static o getPill() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new VertexAndRounding(new PointF(0.961f, 0.039f), new b(0.426f, 0.0f)));
        arrayList.add(new VertexAndRounding(new PointF(1.001f, 0.428f)));
        arrayList.add(new VertexAndRounding(new PointF(1.0f, 0.609f), CORNER_ROUND_100));
        return customPolygon(arrayList, 2, 0.5f, 0.5f, true);
    }

    @NonNull
    private static o getPixelCircle() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new VertexAndRounding(new PointF(0.5f, 0.0f)));
        arrayList.add(new VertexAndRounding(new PointF(0.704f, 0.0f)));
        arrayList.add(new VertexAndRounding(new PointF(0.704f, 0.065f)));
        arrayList.add(new VertexAndRounding(new PointF(0.843f, 0.065f)));
        arrayList.add(new VertexAndRounding(new PointF(0.843f, 0.148f)));
        arrayList.add(new VertexAndRounding(new PointF(0.926f, 0.148f)));
        arrayList.add(new VertexAndRounding(new PointF(0.926f, 0.296f)));
        arrayList.add(new VertexAndRounding(new PointF(1.0f, 0.296f)));
        return customPolygon(arrayList, 2, 0.5f, 0.5f, true);
    }

    @NonNull
    private static o getPixelTriangle() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new VertexAndRounding(new PointF(0.11f, 0.5f)));
        arrayList.add(new VertexAndRounding(new PointF(0.113f, 0.0f)));
        arrayList.add(new VertexAndRounding(new PointF(0.287f, 0.0f)));
        arrayList.add(new VertexAndRounding(new PointF(0.287f, 0.087f)));
        arrayList.add(new VertexAndRounding(new PointF(0.421f, 0.087f)));
        arrayList.add(new VertexAndRounding(new PointF(0.421f, 0.17f)));
        arrayList.add(new VertexAndRounding(new PointF(0.56f, 0.17f)));
        arrayList.add(new VertexAndRounding(new PointF(0.56f, 0.265f)));
        arrayList.add(new VertexAndRounding(new PointF(0.674f, 0.265f)));
        arrayList.add(new VertexAndRounding(new PointF(0.675f, 0.344f)));
        arrayList.add(new VertexAndRounding(new PointF(0.789f, 0.344f)));
        arrayList.add(new VertexAndRounding(new PointF(0.789f, 0.439f)));
        arrayList.add(new VertexAndRounding(new PointF(0.888f, 0.439f)));
        return customPolygon(arrayList, 1, 0.5f, 0.5f, true);
    }

    @NonNull
    private static o getPuffy() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new VertexAndRounding(new PointF(0.5f, 0.053f)));
        arrayList.add(new VertexAndRounding(new PointF(0.545f, -0.04f), new b(0.405f, 0.0f)));
        arrayList.add(new VertexAndRounding(new PointF(0.67f, -0.035f), new b(0.426f, 0.0f)));
        arrayList.add(new VertexAndRounding(new PointF(0.717f, 0.066f), new b(0.574f, 0.0f)));
        arrayList.add(new VertexAndRounding(new PointF(0.722f, 0.128f)));
        arrayList.add(new VertexAndRounding(new PointF(0.777f, 0.002f), new b(0.36f, 0.0f)));
        arrayList.add(new VertexAndRounding(new PointF(0.914f, 0.149f), new b(0.66f, 0.0f)));
        arrayList.add(new VertexAndRounding(new PointF(0.926f, 0.289f), new b(0.66f, 0.0f)));
        arrayList.add(new VertexAndRounding(new PointF(0.881f, 0.346f)));
        arrayList.add(new VertexAndRounding(new PointF(0.94f, 0.344f), new b(0.126f, 0.0f)));
        arrayList.add(new VertexAndRounding(new PointF(1.003f, 0.437f), new b(0.255f, 0.0f)));
        return com.google.android.play.core.appupdate.b.H(customPolygon(arrayList, 2, 0.5f, 0.5f, true), createScaleMatrix(1.0f, 0.742f));
    }

    @NonNull
    private static o getPuffyDiamond() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new VertexAndRounding(new PointF(0.87f, 0.13f), new b(0.146f, 0.0f)));
        arrayList.add(new VertexAndRounding(new PointF(0.818f, 0.357f)));
        arrayList.add(new VertexAndRounding(new PointF(1.0f, 0.332f), new b(0.853f, 0.0f)));
        return customPolygon(arrayList, 4, 0.5f, 0.5f, true);
    }

    @NonNull
    private static o getSemiCircle() {
        b bVar = b.f21407c;
        b bVar2 = CORNER_ROUND_20;
        b bVar3 = CORNER_ROUND_100;
        return d5.K(1.6f, bVar, Arrays.asList(bVar2, bVar2, bVar3, bVar3));
    }

    @NonNull
    private static o getSlantedSquare() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new VertexAndRounding(new PointF(0.926f, 0.97f), new b(0.189f, 0.811f)));
        arrayList.add(new VertexAndRounding(new PointF(-0.021f, 0.967f), new b(0.187f, 0.057f)));
        return customPolygon(arrayList, 2, 0.5f, 0.5f, false);
    }

    @NonNull
    private static o getSoftBoom() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new VertexAndRounding(new PointF(0.733f, 0.454f)));
        arrayList.add(new VertexAndRounding(new PointF(0.839f, 0.437f), new b(0.532f, 0.0f)));
        arrayList.add(new VertexAndRounding(new PointF(0.949f, 0.449f), new b(0.439f, 1.0f)));
        arrayList.add(new VertexAndRounding(new PointF(0.998f, 0.478f), new b(0.174f, 0.0f)));
        return customPolygon(arrayList, 16, 0.5f, 0.5f, true);
    }

    @NonNull
    private static o getSoftBurst() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new VertexAndRounding(new PointF(0.193f, 0.277f), new b(0.053f, 0.0f)));
        arrayList.add(new VertexAndRounding(new PointF(0.176f, 0.055f), new b(0.053f, 0.0f)));
        return customPolygon(arrayList, 10, 0.5f, 0.5f, false);
    }

    @NonNull
    private static o getSquare() {
        return d5.K(1.0f, CORNER_ROUND_30, null);
    }

    @NonNull
    private static o getSunny() {
        return d5.T(8, 0.8f, CORNER_ROUND_15);
    }

    @NonNull
    private static o getTriangle() {
        b rounding = CORNER_ROUND_20;
        Intrinsics.checkNotNullParameter(rounding, "rounding");
        return y3.a(3, 1.0f, rounding, null);
    }

    @NonNull
    private static o getVerySunny() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new VertexAndRounding(new PointF(0.5f, 1.08f), new b(0.085f, 0.0f)));
        arrayList.add(new VertexAndRounding(new PointF(0.358f, 0.843f), new b(0.085f, 0.0f)));
        return customPolygon(arrayList, 8, 0.5f, 0.5f, false);
    }

    @NonNull
    public static o normalize(@NonNull o oVar, boolean z5, @NonNull RectF rectF) {
        char c2;
        char c8;
        char c10;
        char c11;
        char c12;
        char c13;
        char c14;
        char c15;
        char c16 = 4;
        float[] bounds = new float[4];
        char c17 = 3;
        char c18 = 2;
        char c19 = 0;
        char c20 = 1;
        if (z5) {
            e eVar = oVar.f21442d;
            float f6 = oVar.f21441c;
            float f10 = oVar.f21440b;
            Intrinsics.checkNotNullParameter(bounds, "bounds");
            int a7 = eVar.a();
            float f11 = 0.0f;
            for (int i5 = 0; i5 < a7; i5++) {
                c cVar = (c) eVar.get(i5);
                float[] fArr = cVar.f21410a;
                float f12 = fArr[0] - f10;
                float f13 = fArr[1] - f6;
                float f14 = p.f21444b;
                float f15 = (f13 * f13) + (f12 * f12);
                long c21 = cVar.c(0.5f);
                float y5 = ci.c.y(c21) - f10;
                float z7 = ci.c.z(c21) - f6;
                f11 = Math.max(f11, Math.max(f15, (z7 * z7) + (y5 * y5)));
            }
            float sqrt = (float) Math.sqrt(f11);
            bounds[0] = f10 - sqrt;
            bounds[1] = f6 - sqrt;
            bounds[2] = f10 + sqrt;
            bounds[3] = f6 + sqrt;
            c2 = 3;
            c8 = 2;
            c10 = 0;
            c11 = 1;
        } else {
            oVar.getClass();
            Intrinsics.checkNotNullParameter(bounds, "bounds");
            e eVar2 = oVar.f21442d;
            Intrinsics.checkNotNullParameter(bounds, "bounds");
            int a10 = eVar2.a();
            float f16 = Float.MIN_VALUE;
            int i10 = 0;
            float f17 = Float.MAX_VALUE;
            float f18 = Float.MAX_VALUE;
            float f19 = Float.MIN_VALUE;
            while (i10 < a10) {
                c cVar2 = (c) eVar2.get(i10);
                char c22 = c16;
                float[] fArr2 = cVar2.f21410a;
                Intrinsics.checkNotNullParameter(bounds, "bounds");
                if (cVar2.f()) {
                    bounds[c19] = fArr2[c19];
                    bounds[c20] = fArr2[c20];
                    bounds[c18] = fArr2[c19];
                    bounds[c17] = fArr2[c20];
                    c12 = c17;
                    c13 = c18;
                    c14 = c19;
                    c15 = c20;
                } else {
                    c12 = c17;
                    c13 = c18;
                    float min = Math.min(fArr2[c19], cVar2.a());
                    c14 = c19;
                    float min2 = Math.min(fArr2[c20], cVar2.b());
                    c15 = c20;
                    float max = Math.max(fArr2[c14], cVar2.a());
                    float max2 = Math.max(fArr2[c15], cVar2.b());
                    bounds[c14] = Math.min(min, Math.min(fArr2[c13], fArr2[c22]));
                    bounds[c15] = Math.min(min2, Math.min(fArr2[c12], fArr2[5]));
                    bounds[c13] = Math.max(max, Math.max(fArr2[c13], fArr2[c22]));
                    bounds[c12] = Math.max(max2, Math.max(fArr2[c12], fArr2[5]));
                }
                f17 = Math.min(f17, bounds[c14]);
                f18 = Math.min(f18, bounds[c15]);
                f16 = Math.max(f16, bounds[c13]);
                f19 = Math.max(f19, bounds[c12]);
                i10++;
                c16 = c22;
                c17 = c12;
                c18 = c13;
                c19 = c14;
                c20 = c15;
            }
            c2 = c17;
            c8 = c18;
            c10 = c19;
            c11 = c20;
            bounds[c10] = f17;
            bounds[c11] = f18;
            bounds[c8] = f16;
            bounds[c2] = f19;
        }
        RectF rectF2 = new RectF(bounds[c10], bounds[c11], bounds[c8], bounds[c2]);
        float min3 = Math.min(rectF.width() / rectF2.width(), rectF.height() / rectF2.height());
        Matrix createScaleMatrix = createScaleMatrix(min3, min3);
        createScaleMatrix.preTranslate(-rectF2.centerX(), -rectF2.centerY());
        createScaleMatrix.postTranslate(rectF.centerX(), rectF.centerY());
        return com.google.android.play.core.appupdate.b.H(oVar, createScaleMatrix);
    }

    private static void repeatAroundCenter(@NonNull List<VertexAndRounding> list, @NonNull List<VertexAndRounding> list2, int i5, float f6, float f10, boolean z5) {
        list2.clear();
        toRadial(list, f6, f10);
        float f11 = (float) (6.283185307179586d / i5);
        if (z5) {
            int i10 = i5 * 2;
            float f12 = f11 / 2.0f;
            for (int i11 = 0; i11 < i10; i11++) {
                for (int i12 = 0; i12 < list.size(); i12++) {
                    boolean z7 = i11 % 2 != 0;
                    int size = z7 ? (list.size() - 1) - i12 : i12;
                    VertexAndRounding vertexAndRounding = list.get(size);
                    if (size > 0 || !z7) {
                        list2.add(new VertexAndRounding(new PointF((i11 * f12) + (z7 ? (list.get(0).vertex.x * 2.0f) + (f12 - vertexAndRounding.vertex.x) : vertexAndRounding.vertex.x), vertexAndRounding.vertex.y), vertexAndRounding.rounding));
                    }
                }
            }
        } else {
            for (int i13 = 0; i13 < i5; i13++) {
                for (VertexAndRounding vertexAndRounding2 : list) {
                    list2.add(new VertexAndRounding(new PointF((i13 * f11) + vertexAndRounding2.vertex.x, vertexAndRounding2.vertex.y), vertexAndRounding2.rounding));
                }
            }
        }
        toCartesian(list2, f6, f10);
    }

    private static void toCartesian(@NonNull List<VertexAndRounding> list, float f6, float f10) {
        Iterator<VertexAndRounding> it = list.iterator();
        while (it.hasNext()) {
            it.next().toCartesian(f6, f10);
        }
    }

    private static void toRadial(@NonNull List<VertexAndRounding> list, float f6, float f10) {
        Iterator<VertexAndRounding> it = list.iterator();
        while (it.hasNext()) {
            it.next().toRadial(f6, f10);
        }
    }

    @NonNull
    private static List<b> toRoundingsList(@NonNull List<VertexAndRounding> list) {
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < list.size(); i5++) {
            arrayList.add(list.get(i5).rounding);
        }
        return arrayList;
    }

    @NonNull
    private static float[] toVerticesXyArray(@NonNull List<VertexAndRounding> list) {
        float[] fArr = new float[list.size() * 2];
        for (int i5 = 0; i5 < list.size(); i5++) {
            int i10 = i5 * 2;
            fArr[i10] = list.get(i5).vertex.x;
            fArr[i10 + 1] = list.get(i5).vertex.y;
        }
        return fArr;
    }

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public static class VertexAndRounding {
        private b rounding;
        private PointF vertex;

        /* JADX INFO: Access modifiers changed from: private */
        public void toCartesian(float f6, float f10) {
            PointF pointF = this.vertex;
            float cos = (float) ((Math.cos(pointF.x) * pointF.y) + f6);
            PointF pointF2 = this.vertex;
            float sin = (float) ((Math.sin(pointF2.x) * pointF2.y) + f10);
            PointF pointF3 = this.vertex;
            pointF3.x = cos;
            pointF3.y = sin;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void toRadial(float f6, float f10) {
            this.vertex.offset(-f6, -f10);
            PointF pointF = this.vertex;
            float atan2 = (float) Math.atan2(pointF.y, pointF.x);
            PointF pointF2 = this.vertex;
            float hypot = (float) Math.hypot(pointF2.x, pointF2.y);
            PointF pointF3 = this.vertex;
            pointF3.x = atan2;
            pointF3.y = hypot;
        }

        private VertexAndRounding(@NonNull PointF pointF) {
            this(pointF, b.f21407c);
        }

        private VertexAndRounding(@NonNull PointF pointF, @NonNull b bVar) {
            this.vertex = pointF;
            this.rounding = bVar;
        }
    }

    @NonNull
    private static o getTriangle(float f6) {
        return com.google.android.play.core.appupdate.b.H(getTriangle(), createRotationMatrix(f6));
    }

    @NonNull
    private static o getOval(float f6) {
        return com.google.android.play.core.appupdate.b.H(getOval(), createRotationMatrix(f6));
    }

    @NonNull
    private static o getGem(float f6) {
        return com.google.android.play.core.appupdate.b.H(getGem(), createRotationMatrix(f6));
    }

    @NonNull
    public static o normalize(@NonNull o oVar, boolean z5) {
        return normalize(oVar, z5, new RectF(0.0f, 0.0f, 1.0f, 1.0f));
    }
}
