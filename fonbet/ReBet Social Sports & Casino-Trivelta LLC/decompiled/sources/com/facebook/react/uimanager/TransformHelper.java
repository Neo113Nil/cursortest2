package com.facebook.react.uimanager;

import com.facebook.react.bridge.NativeArray;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.common.ReactConstants;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0013\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0006H\u0007J2\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0010H\u0007J:\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0016\u001a\u00020\u0017H\u0007J\u0018\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\bH\u0002J,\u0010\u001b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J3\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u001d2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u001dH\u0083 R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/facebook/react/uimanager/TransformHelper;", "", "<init>", "()V", "helperMatrix", "Ljava/lang/ThreadLocal;", "", "convertToRadians", "", "transformMap", "Lcom/facebook/react/bridge/ReadableMap;", "key", "", "processTransform", "", "transforms", "Lcom/facebook/react/bridge/ReadableArray;", "result", "viewWidth", "", "viewHeight", ViewProps.TRANSFORM_ORIGIN, "allowPercentageResolution", "", "parseTranslateValue", "stringValue", "dimension", "getTranslateForTransformOrigin", "nativeProcessTransform", "Lcom/facebook/react/bridge/NativeArray;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TransformHelper {

    @NotNull
    public static final TransformHelper INSTANCE = new TransformHelper();

    @NotNull
    private static final ThreadLocal<double[]> helperMatrix = new ThreadLocal<double[]>() { // from class: com.facebook.react.uimanager.TransformHelper$helperMatrix$1
        @Override // java.lang.ThreadLocal
        public double[] initialValue() {
            return new double[16];
        }
    };

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ReadableType.values().length];
            try {
                iArr[ReadableType.Number.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReadableType.String.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private TransformHelper() {
    }

    private final double convertToRadians(ReadableMap transformMap, String key) {
        double d10;
        boolean z10 = true;
        if (transformMap.getType(key) == ReadableType.String) {
            String string = transformMap.getString(key);
            Intrinsics.checkNotNull(string);
            if (StringsKt.endsWith$default(string, "rad", false, 2, (Object) null)) {
                string = StringsKt.dropLast(string, 3);
            } else if (StringsKt.endsWith$default(string, "deg", false, 2, (Object) null)) {
                string = StringsKt.dropLast(string, 3);
                z10 = false;
            }
            d10 = Double.parseDouble(string);
        } else {
            d10 = transformMap.getDouble(key);
        }
        return z10 ? d10 : MatrixMathHelper.degreesToRadians(d10);
    }

    private final double[] getTranslateForTransformOrigin(float viewWidth, float viewHeight, ReadableArray transformOrigin, boolean allowPercentageResolution) {
        boolean z10;
        int i10;
        if (transformOrigin == null || (viewHeight == 0.0f && viewWidth == 0.0f)) {
            return null;
        }
        double d10 = viewWidth / 2.0d;
        double d11 = viewHeight / 2.0d;
        double[] dArr = new double[3];
        boolean z11 = false;
        dArr[0] = d10;
        int i11 = 1;
        dArr[1] = d11;
        dArr[2] = 0.0d;
        int min = Math.min(transformOrigin.size(), 3);
        int i12 = 0;
        while (i12 < min) {
            int i13 = WhenMappings.$EnumSwitchMapping$0[transformOrigin.getType(i12).ordinal()];
            if (i13 != i11) {
                if (i13 == 2 && allowPercentageResolution) {
                    String string = transformOrigin.getString(i12);
                    Intrinsics.checkNotNull(string);
                    if (StringsKt.endsWith$default(string, "%", z11, 2, (Object) null)) {
                        double parseDouble = Double.parseDouble(StringsKt.dropLast(string, i11));
                        z10 = z11;
                        i10 = i11;
                        dArr[i12] = ((i12 == 0 ? viewWidth : viewHeight) * parseDouble) / 100.0d;
                    }
                }
                z10 = z11;
                i10 = i11;
            } else {
                z10 = z11;
                i10 = i11;
                dArr[i12] = transformOrigin.getDouble(i12);
            }
            i12++;
            z11 = z10;
            i11 = i10;
        }
        boolean z12 = z11;
        int i14 = i11;
        double d12 = (-d10) + dArr[z12 ? 1 : 0];
        double d13 = (-d11) + dArr[i14];
        double d14 = dArr[2];
        double[] dArr2 = new double[3];
        dArr2[z12 ? 1 : 0] = d12;
        dArr2[i14] = d13;
        dArr2[2] = d14;
        return dArr2;
    }

    @JvmStatic
    private static final native void nativeProcessTransform(NativeArray transforms, double[] result, float viewWidth, float viewHeight, NativeArray transformOrigin);

    private final double parseTranslateValue(String stringValue, double dimension) {
        try {
            return StringsKt.endsWith$default(stringValue, "%", false, 2, (Object) null) ? (Double.parseDouble(StringsKt.dropLast(stringValue, 1)) * dimension) / 100.0d : Double.parseDouble(stringValue);
        } catch (NumberFormatException unused) {
            E6.a.K(ReactConstants.TAG, "Invalid translate value: " + stringValue);
            return 0.0d;
        }
    }

    @Deprecated(message = "Use processTransform(ReadableArray, DoubleArray, Float, Float, ReadableArray, Boolean) instead", replaceWith = @ReplaceWith(expression = "processTransform(...)", imports = {}))
    @JvmStatic
    public static final void processTransform(@NotNull ReadableArray transforms, @NotNull double[] result) {
        Intrinsics.checkNotNullParameter(transforms, "transforms");
        Intrinsics.checkNotNullParameter(result, "result");
        processTransform(transforms, result, 0.0f, 0.0f, null, false);
    }

    @Deprecated(message = "Use processTransform(ReadableArray, DoubleArray, Float, Float, ReadableArray, Boolean) instead", replaceWith = @ReplaceWith(expression = "processTransform(...)", imports = {}))
    @JvmStatic
    public static final void processTransform(@NotNull ReadableArray transforms, @NotNull double[] result, float viewWidth, float viewHeight, @Nullable ReadableArray transformOrigin) {
        Intrinsics.checkNotNullParameter(transforms, "transforms");
        Intrinsics.checkNotNullParameter(result, "result");
        processTransform(transforms, result, viewWidth, viewHeight, transformOrigin, false);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01db, code lost:
    
        if (r13.equals("rotate") == false) goto L106;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void processTransform(@NotNull ReadableArray transforms, @NotNull double[] result, float viewWidth, float viewHeight, @Nullable ReadableArray transformOrigin, boolean allowPercentageResolution) {
        int i10;
        char c10;
        double d10;
        double d11;
        double[] dArr;
        double d12;
        double d13;
        double d14;
        Intrinsics.checkNotNullParameter(transforms, "transforms");
        Intrinsics.checkNotNullParameter(result, "result");
        int i11 = 1;
        if (allowPercentageResolution && (transforms instanceof NativeArray)) {
            if (transformOrigin == 0 ? true : transformOrigin instanceof NativeArray) {
                nativeProcessTransform((NativeArray) transforms, result, viewWidth, viewHeight, (NativeArray) transformOrigin);
                return;
            }
        }
        double[] dArr2 = helperMatrix.get();
        Intrinsics.checkNotNull(dArr2);
        double[] dArr3 = dArr2;
        MatrixMathHelper.resetIdentityMatrix(result);
        double[] translateForTransformOrigin = INSTANCE.getTranslateForTransformOrigin(viewWidth, viewHeight, transformOrigin, allowPercentageResolution);
        if (translateForTransformOrigin != null) {
            MatrixMathHelper.resetIdentityMatrix(dArr3);
            MatrixMathHelper.applyTranslate3D(dArr3, translateForTransformOrigin[0], translateForTransformOrigin[1], translateForTransformOrigin[2]);
            MatrixMathHelper.multiplyInto(result, result, dArr3);
        }
        if (transforms.size() == 16 && transforms.getType(0) == ReadableType.Number) {
            MatrixMathHelper.resetIdentityMatrix(dArr3);
            int size = transforms.size();
            for (int i12 = 0; i12 < size; i12++) {
                dArr3[i12] = transforms.getDouble(i12);
            }
            MatrixMathHelper.multiplyInto(result, result, dArr3);
        } else {
            int size2 = transforms.size();
            int i13 = 0;
            while (i13 < size2) {
                ReadableMap map = transforms.getMap(i13);
                Intrinsics.checkNotNull(map);
                String nextKey = map.keySetIterator().nextKey();
                MatrixMathHelper.resetIdentityMatrix(dArr3);
                int i14 = i13;
                switch (nextKey.hashCode()) {
                    case -1721943862:
                        i10 = size2;
                        c10 = 16;
                        if (nextKey.equals(ViewProps.TRANSLATE_X)) {
                            if (map.getType(nextKey) == ReadableType.String && allowPercentageResolution) {
                                TransformHelper transformHelper = INSTANCE;
                                String string = map.getString(nextKey);
                                Intrinsics.checkNotNull(string);
                                d10 = transformHelper.parseTranslateValue(string, viewWidth);
                            } else {
                                d10 = map.getDouble(nextKey);
                            }
                            MatrixMathHelper.applyTranslate2D(dArr3, d10, 0.0d);
                            break;
                        }
                        E6.a.K(ReactConstants.TAG, "Unsupported transform type: " + nextKey);
                        break;
                    case -1721943861:
                        i10 = size2;
                        c10 = 16;
                        if (nextKey.equals(ViewProps.TRANSLATE_Y)) {
                            if (map.getType(nextKey) == ReadableType.String && allowPercentageResolution) {
                                TransformHelper transformHelper2 = INSTANCE;
                                String string2 = map.getString(nextKey);
                                Intrinsics.checkNotNull(string2);
                                d11 = transformHelper2.parseTranslateValue(string2, viewHeight);
                            } else {
                                d11 = map.getDouble(nextKey);
                            }
                            MatrixMathHelper.applyTranslate2D(dArr3, 0.0d, d11);
                            break;
                        }
                        E6.a.K(ReactConstants.TAG, "Unsupported transform type: " + nextKey);
                        break;
                    case -1081239615:
                        i10 = size2;
                        c10 = 16;
                        if (nextKey.equals("matrix")) {
                            ReadableArray array = map.getArray(nextKey);
                            Intrinsics.checkNotNull(array);
                            for (int i15 = 0; i15 < 16; i15++) {
                                dArr3[i15] = array.getDouble(i15);
                            }
                            break;
                        }
                        E6.a.K(ReactConstants.TAG, "Unsupported transform type: " + nextKey);
                        break;
                    case -925180581:
                        i10 = size2;
                        c10 = 16;
                        break;
                    case -908189618:
                        i10 = size2;
                        c10 = 16;
                        if (nextKey.equals(ViewProps.SCALE_X)) {
                            MatrixMathHelper.applyScaleX(dArr3, map.getDouble(nextKey));
                            break;
                        }
                        E6.a.K(ReactConstants.TAG, "Unsupported transform type: " + nextKey);
                        break;
                    case -908189617:
                        i10 = size2;
                        c10 = 16;
                        if (nextKey.equals(ViewProps.SCALE_Y)) {
                            MatrixMathHelper.applyScaleY(dArr3, map.getDouble(nextKey));
                            break;
                        }
                        E6.a.K(ReactConstants.TAG, "Unsupported transform type: " + nextKey);
                        break;
                    case 109250890:
                        i10 = size2;
                        c10 = 16;
                        if (nextKey.equals("scale")) {
                            double d15 = map.getDouble(nextKey);
                            MatrixMathHelper.applyScaleX(dArr3, d15);
                            MatrixMathHelper.applyScaleY(dArr3, d15);
                            break;
                        }
                        E6.a.K(ReactConstants.TAG, "Unsupported transform type: " + nextKey);
                        break;
                    case 109493390:
                        i10 = size2;
                        c10 = 16;
                        if (nextKey.equals("skewX")) {
                            MatrixMathHelper.applySkewX(dArr3, INSTANCE.convertToRadians(map, nextKey));
                            break;
                        }
                        E6.a.K(ReactConstants.TAG, "Unsupported transform type: " + nextKey);
                        break;
                    case 109493391:
                        i10 = size2;
                        c10 = 16;
                        if (nextKey.equals("skewY")) {
                            MatrixMathHelper.applySkewY(dArr3, INSTANCE.convertToRadians(map, nextKey));
                            break;
                        }
                        E6.a.K(ReactConstants.TAG, "Unsupported transform type: " + nextKey);
                        break;
                    case 207960636:
                        i10 = size2;
                        c10 = 16;
                        if (nextKey.equals("perspective")) {
                            MatrixMathHelper.applyPerspective(dArr3, map.getDouble(nextKey));
                            break;
                        }
                        E6.a.K(ReactConstants.TAG, "Unsupported transform type: " + nextKey);
                        break;
                    case 1052832078:
                        if (nextKey.equals("translate")) {
                            ReadableArray array2 = map.getArray(nextKey);
                            Intrinsics.checkNotNull(array2);
                            ReadableType type = array2.getType(0);
                            ReadableType readableType = ReadableType.String;
                            if (type == readableType && allowPercentageResolution) {
                                TransformHelper transformHelper3 = INSTANCE;
                                String string3 = array2.getString(0);
                                Intrinsics.checkNotNull(string3);
                                dArr = dArr3;
                                d12 = transformHelper3.parseTranslateValue(string3, viewWidth);
                            } else {
                                dArr = dArr3;
                                d12 = array2.getDouble(0);
                            }
                            if (array2.getType(i11) == readableType && allowPercentageResolution) {
                                TransformHelper transformHelper4 = INSTANCE;
                                String string4 = array2.getString(i11);
                                Intrinsics.checkNotNull(string4);
                                d13 = d12;
                                d14 = transformHelper4.parseTranslateValue(string4, viewHeight);
                            } else {
                                d13 = d12;
                                d14 = array2.getDouble(i11);
                            }
                            dArr3 = dArr;
                            double d16 = d14;
                            i10 = size2;
                            c10 = 16;
                            MatrixMathHelper.applyTranslate3D(dArr3, d13, d16, array2.size() > 2 ? array2.getDouble(2) : 0.0d);
                            break;
                        }
                        i10 = size2;
                        c10 = 16;
                        E6.a.K(ReactConstants.TAG, "Unsupported transform type: " + nextKey);
                        break;
                    case 1384173149:
                        if (nextKey.equals("rotateX")) {
                            MatrixMathHelper.applyRotateX(dArr3, INSTANCE.convertToRadians(map, nextKey));
                            i10 = size2;
                            c10 = 16;
                            break;
                        }
                        i10 = size2;
                        c10 = 16;
                        E6.a.K(ReactConstants.TAG, "Unsupported transform type: " + nextKey);
                        break;
                    case 1384173150:
                        if (nextKey.equals("rotateY")) {
                            MatrixMathHelper.applyRotateY(dArr3, INSTANCE.convertToRadians(map, nextKey));
                            i10 = size2;
                            c10 = 16;
                            break;
                        }
                        i10 = size2;
                        c10 = 16;
                        E6.a.K(ReactConstants.TAG, "Unsupported transform type: " + nextKey);
                        break;
                    case 1384173151:
                        if (nextKey.equals("rotateZ")) {
                            i10 = size2;
                            c10 = 16;
                            MatrixMathHelper.applyRotateZ(dArr3, INSTANCE.convertToRadians(map, nextKey));
                            break;
                        }
                        i10 = size2;
                        c10 = 16;
                        E6.a.K(ReactConstants.TAG, "Unsupported transform type: " + nextKey);
                        break;
                    default:
                        i10 = size2;
                        c10 = 16;
                        E6.a.K(ReactConstants.TAG, "Unsupported transform type: " + nextKey);
                        break;
                }
                MatrixMathHelper.multiplyInto(result, result, dArr3);
                i13 = i14 + 1;
                size2 = i10;
                i11 = 1;
            }
        }
        if (translateForTransformOrigin != null) {
            MatrixMathHelper.resetIdentityMatrix(dArr3);
            MatrixMathHelper.applyTranslate3D(dArr3, -translateForTransformOrigin[0], -translateForTransformOrigin[1], -translateForTransformOrigin[2]);
            MatrixMathHelper.multiplyInto(result, result, dArr3);
        }
    }
}
