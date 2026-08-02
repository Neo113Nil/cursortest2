package com.facebook.react.uimanager.style;

import androidx.core.graphics.AbstractC2074d;
import com.facebook.react.uimanager.FloatUtil;
import com.facebook.react.uimanager.LengthPercentage;
import com.facebook.react.uimanager.LengthPercentageType;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ViewProps;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\u0006\u0010\t\u001a\u00020\nJ!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\rH\u0002¢\u0006\u0002\u0010\u000eJ!\u0010\u000f\u001a\u0004\u0018\u00010\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\t\u001a\u00020\nH\u0002¢\u0006\u0002\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/facebook/react/uimanager/style/ColorStopUtils;", "", "<init>", "()V", "getFixedColorStops", "", "Lcom/facebook/react/uimanager/style/ProcessedColorStop;", "colorStops", "Lcom/facebook/react/uimanager/style/ColorStop;", "gradientLineLength", "", "processColorTransitionHints", "originalStops", "", "([Lcom/facebook/react/uimanager/style/ProcessedColorStop;)Ljava/util/List;", "resolveColorStopPosition", ViewProps.POSITION, "Lcom/facebook/react/uimanager/LengthPercentage;", "(Lcom/facebook/react/uimanager/LengthPercentage;F)Ljava/lang/Float;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nColorStop.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorStop.kt\ncom/facebook/react/uimanager/style/ColorStopUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,209:1\n1#2:210\n*E\n"})
/* loaded from: classes2.dex */
public final class ColorStopUtils {

    @NotNull
    public static final ColorStopUtils INSTANCE = new ColorStopUtils();

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LengthPercentageType.values().length];
            try {
                iArr[LengthPercentageType.POINT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LengthPercentageType.PERCENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private ColorStopUtils() {
    }

    private final List<ProcessedColorStop> processColorTransitionHints(ProcessedColorStop[] originalStops) {
        int i10;
        int i11;
        ProcessedColorStop[] processedColorStopArr = originalStops;
        List<ProcessedColorStop> mutableList = ArraysKt.toMutableList(processedColorStopArr);
        int i12 = 1;
        int length = processedColorStopArr.length - 1;
        int i13 = 1;
        int i14 = 0;
        while (i13 < length) {
            if (processedColorStopArr[i13].getColor() == null && (i11 = i13 + i14) >= i12) {
                int i15 = i11 - 1;
                Float position = mutableList.get(i15).getPosition();
                int i16 = i11 + 1;
                Float position2 = mutableList.get(i16).getPosition();
                Float position3 = mutableList.get(i11).getPosition();
                if (position != null && position2 != null && position3 != null) {
                    float floatValue = position3.floatValue() - position.floatValue();
                    float floatValue2 = position2.floatValue() - position3.floatValue();
                    float floatValue3 = position2.floatValue() - position.floatValue();
                    Integer color = mutableList.get(i15).getColor();
                    Integer color2 = mutableList.get(i16).getColor();
                    if (FloatUtil.floatsEqual(floatValue, floatValue2)) {
                        mutableList.remove(i11);
                        i14--;
                    } else if (FloatUtil.floatsEqual(floatValue, 0.0f)) {
                        mutableList.get(i11).setColor(color2);
                    } else if (FloatUtil.floatsEqual(floatValue2, 0.0f)) {
                        mutableList.get(i11).setColor(color);
                    } else {
                        ArrayList arrayList = new ArrayList(9);
                        if (floatValue > floatValue2) {
                            int i17 = 0;
                            while (i17 < 7) {
                                arrayList.add(new ProcessedColorStop(null, Float.valueOf(position.floatValue() + (((i17 + 7.0f) / 13.0f) * floatValue))));
                                i17++;
                                length = length;
                            }
                            i10 = length;
                            arrayList.add(new ProcessedColorStop(null, Float.valueOf(position3.floatValue() + (0.33333334f * floatValue2))));
                            arrayList.add(new ProcessedColorStop(null, Float.valueOf(position3.floatValue() + (floatValue2 * 0.6666667f))));
                        } else {
                            i10 = length;
                            arrayList.add(new ProcessedColorStop(null, Float.valueOf(position.floatValue() + (0.33333334f * floatValue))));
                            arrayList.add(new ProcessedColorStop(null, Float.valueOf(position.floatValue() + (0.6666667f * floatValue))));
                            for (int i18 = 0; i18 < 7; i18++) {
                                arrayList.add(new ProcessedColorStop(null, Float.valueOf(position3.floatValue() + ((i18 / 13.0f) * floatValue2))));
                            }
                        }
                        double log = Math.log(0.5d) / ((float) Math.log(floatValue / floatValue3));
                        Iterator it = arrayList.iterator();
                        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
                        while (it.hasNext()) {
                            Object next = it.next();
                            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
                            ProcessedColorStop processedColorStop = (ProcessedColorStop) next;
                            if (processedColorStop.getPosition() != null) {
                                float pow = (float) Math.pow((processedColorStop.getPosition().floatValue() - position.floatValue()) / floatValue3, log);
                                if (Math.abs(pow) <= Float.MAX_VALUE && !Float.isNaN(pow) && color != null) {
                                    int intValue = color.intValue();
                                    if (color2 != null) {
                                        processedColorStop.setColor(Integer.valueOf(AbstractC2074d.c(intValue, color2.intValue(), pow)));
                                    }
                                }
                            }
                        }
                        mutableList.remove(i11);
                        mutableList.addAll(i11, arrayList);
                        i14 += 8;
                        i13++;
                        processedColorStopArr = originalStops;
                        length = i10;
                        i12 = 1;
                    }
                }
            }
            i10 = length;
            i13++;
            processedColorStopArr = originalStops;
            length = i10;
            i12 = 1;
        }
        return mutableList;
    }

    private final Float resolveColorStopPosition(LengthPercentage position, float gradientLineLength) {
        if (position == null) {
            return null;
        }
        int i10 = WhenMappings.$EnumSwitchMapping$0[position.getType().ordinal()];
        if (i10 == 1) {
            return Float.valueOf(PixelUtil.toPixelFromDIP(position.resolve(0.0f)) / gradientLineLength);
        }
        if (i10 == 2) {
            return Float.valueOf(position.resolve(1.0f));
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public final List<ProcessedColorStop> getFixedColorStops(@NotNull List<ColorStop> colorStops, float gradientLineLength) {
        Intrinsics.checkNotNullParameter(colorStops, "colorStops");
        int size = colorStops.size();
        ProcessedColorStop[] processedColorStopArr = new ProcessedColorStop[size];
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            processedColorStopArr[i11] = new ProcessedColorStop(null, null, 3, null);
        }
        Float resolveColorStopPosition = resolveColorStopPosition(colorStops.get(0).getPosition(), gradientLineLength);
        float floatValue = resolveColorStopPosition != null ? resolveColorStopPosition.floatValue() : 0.0f;
        int size2 = colorStops.size();
        int i12 = 0;
        boolean z10 = false;
        while (i12 < size2) {
            ColorStop colorStop = colorStops.get(i12);
            Float resolveColorStopPosition2 = resolveColorStopPosition(colorStop.getPosition(), gradientLineLength);
            if (resolveColorStopPosition2 == null) {
                resolveColorStopPosition2 = i12 == 0 ? Float.valueOf(0.0f) : i12 == colorStops.size() - 1 ? Float.valueOf(1.0f) : null;
            }
            if (resolveColorStopPosition2 != null) {
                floatValue = Math.max(resolveColorStopPosition2.floatValue(), floatValue);
                processedColorStopArr[i12] = new ProcessedColorStop(colorStop.getColor(), Float.valueOf(floatValue));
            } else {
                z10 = true;
            }
            i12++;
        }
        if (z10) {
            for (int i13 = 1; i13 < size; i13++) {
                Float position = processedColorStopArr[i13].getPosition();
                Float position2 = processedColorStopArr[i10].getPosition();
                int i14 = i13 - i10;
                int i15 = i14 - 1;
                if (position != null && position2 != null && i15 > 0) {
                    float floatValue2 = (position.floatValue() - position2.floatValue()) / i14;
                    if (1 <= i15) {
                        int i16 = 1;
                        while (true) {
                            int i17 = i10 + i16;
                            processedColorStopArr[i17] = new ProcessedColorStop(colorStops.get(i17).getColor(), Float.valueOf(position2.floatValue() + (i16 * floatValue2)));
                            if (i16 == i15) {
                                break;
                            }
                            i16++;
                        }
                    }
                    i10 = i13;
                }
            }
        }
        return processColorTransitionHints(processedColorStopArr);
    }
}
