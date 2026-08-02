package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatableIntegerValue;
import com.airbnb.lottie.model.animatable.AnimatablePathValue;
import com.airbnb.lottie.model.animatable.AnimatableScaleValue;
import com.airbnb.lottie.model.animatable.AnimatableSplitDimensionPathValue;
import com.airbnb.lottie.model.animatable.AnimatableTransform;
import com.airbnb.lottie.model.animatable.AnimatableValue;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.value.Keyframe;
import com.airbnb.lottie.value.ScaleXY;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.io.IOException;

/* loaded from: classes4.dex */
public class AnimatableTransformParser {
    private static final JsonReader.Options NAMES = JsonReader.Options.of("a", "p", "s", "rz", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "o", "so", "eo", "sk", "sa");
    private static final JsonReader.Options ANIMATABLE_NAMES = JsonReader.Options.of(JWKParameterNames.OCT_KEY_VALUE);

    private AnimatableTransformParser() {
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static AnimatableTransform parse(JsonReader jsonReader, LottieComposition lottieComposition) throws IOException {
        AnimatableFloatValue parseFloat;
        LottieComposition lottieComposition2 = lottieComposition;
        boolean z = jsonReader.peek() == JsonReader.Token.BEGIN_OBJECT;
        if (z) {
            jsonReader.beginObject();
        }
        AnimatableFloatValue animatableFloatValue = null;
        AnimatablePathValue animatablePathValue = null;
        AnimatableValue<PointF, PointF> animatableValue = null;
        AnimatableScaleValue animatableScaleValue = null;
        AnimatableFloatValue animatableFloatValue2 = null;
        AnimatableFloatValue animatableFloatValue3 = null;
        AnimatableIntegerValue animatableIntegerValue = null;
        AnimatableFloatValue animatableFloatValue4 = null;
        AnimatableFloatValue animatableFloatValue5 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(NAMES)) {
                case 0:
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        if (jsonReader.selectName(ANIMATABLE_NAMES) == 0) {
                            animatablePathValue = AnimatablePathValueParser.parse(jsonReader, lottieComposition);
                        } else {
                            jsonReader.skipName();
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    lottieComposition2 = lottieComposition;
                    break;
                case 1:
                    animatableValue = AnimatablePathValueParser.parseSplitPath(jsonReader, lottieComposition);
                    lottieComposition2 = lottieComposition;
                    break;
                case 2:
                    animatableScaleValue = AnimatableValueParser.parseScale(jsonReader, lottieComposition);
                    lottieComposition2 = lottieComposition;
                    break;
                case 3:
                    lottieComposition2.addWarning("Lottie doesn't support 3D layers.");
                    parseFloat = AnimatableValueParser.parseFloat(jsonReader, lottieComposition2, false);
                    if (!parseFloat.getKeyframes().isEmpty()) {
                        parseFloat.getKeyframes().add(new Keyframe(lottieComposition2, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(lottieComposition2.getEndFrame())));
                    } else if (((Keyframe) parseFloat.getKeyframes().get(0)).startValue == 0) {
                        parseFloat.getKeyframes().set(0, new Keyframe(lottieComposition, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(lottieComposition.getEndFrame())));
                    }
                    lottieComposition2 = lottieComposition;
                    animatableFloatValue = parseFloat;
                    break;
                case 4:
                    parseFloat = AnimatableValueParser.parseFloat(jsonReader, lottieComposition2, false);
                    if (!parseFloat.getKeyframes().isEmpty()) {
                    }
                    lottieComposition2 = lottieComposition;
                    animatableFloatValue = parseFloat;
                    break;
                case 5:
                    animatableIntegerValue = AnimatableValueParser.parseInteger(jsonReader, lottieComposition);
                    break;
                case 6:
                    animatableFloatValue4 = AnimatableValueParser.parseFloat(jsonReader, lottieComposition2, false);
                    break;
                case 7:
                    animatableFloatValue5 = AnimatableValueParser.parseFloat(jsonReader, lottieComposition2, false);
                    break;
                case 8:
                    animatableFloatValue2 = AnimatableValueParser.parseFloat(jsonReader, lottieComposition2, false);
                    break;
                case 9:
                    animatableFloatValue3 = AnimatableValueParser.parseFloat(jsonReader, lottieComposition2, false);
                    break;
                default:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    lottieComposition2 = lottieComposition;
                    break;
            }
        }
        if (z) {
            jsonReader.endObject();
        }
        AnimatablePathValue animatablePathValue2 = isAnchorPointIdentity(animatablePathValue) ? null : animatablePathValue;
        if (isPositionIdentity(animatableValue)) {
            animatableValue = null;
        }
        return new AnimatableTransform(animatablePathValue2, animatableValue, isScaleIdentity(animatableScaleValue) ? null : animatableScaleValue, isRotationIdentity(animatableFloatValue) ? null : animatableFloatValue, animatableIntegerValue, animatableFloatValue4, animatableFloatValue5, isSkewIdentity(animatableFloatValue2) ? null : animatableFloatValue2, isSkewAngleIdentity(animatableFloatValue3) ? null : animatableFloatValue3);
    }

    private static boolean isAnchorPointIdentity(AnimatablePathValue animatablePathValue) {
        if (animatablePathValue != null) {
            return animatablePathValue.isStatic() && animatablePathValue.getKeyframes().get(0).startValue.equals(0.0f, 0.0f);
        }
        return true;
    }

    private static boolean isPositionIdentity(AnimatableValue<PointF, PointF> animatableValue) {
        if (animatableValue != null) {
            return !(animatableValue instanceof AnimatableSplitDimensionPathValue) && animatableValue.isStatic() && animatableValue.getKeyframes().get(0).startValue.equals(0.0f, 0.0f);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean isRotationIdentity(AnimatableFloatValue animatableFloatValue) {
        if (animatableFloatValue != null) {
            return animatableFloatValue.isStatic() && ((Float) ((Keyframe) animatableFloatValue.getKeyframes().get(0)).startValue).floatValue() == 0.0f;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean isScaleIdentity(AnimatableScaleValue animatableScaleValue) {
        if (animatableScaleValue != null) {
            return animatableScaleValue.isStatic() && ((ScaleXY) ((Keyframe) animatableScaleValue.getKeyframes().get(0)).startValue).equals(1.0f, 1.0f);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean isSkewIdentity(AnimatableFloatValue animatableFloatValue) {
        if (animatableFloatValue != null) {
            return animatableFloatValue.isStatic() && ((Float) ((Keyframe) animatableFloatValue.getKeyframes().get(0)).startValue).floatValue() == 0.0f;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean isSkewAngleIdentity(AnimatableFloatValue animatableFloatValue) {
        if (animatableFloatValue != null) {
            return animatableFloatValue.isStatic() && ((Float) ((Keyframe) animatableFloatValue.getKeyframes().get(0)).startValue).floatValue() == 0.0f;
        }
        return true;
    }
}
