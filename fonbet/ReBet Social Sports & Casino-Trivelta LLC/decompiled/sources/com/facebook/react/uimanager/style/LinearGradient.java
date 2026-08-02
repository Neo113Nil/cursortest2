package com.facebook.react.uimanager.style;

import android.content.Context;
import android.graphics.Shader;
import com.BV.LinearGradient.LinearGradientManager;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.LengthPercentage;
import com.facebook.react.uimanager.ViewProps;
import com.twilio.voice.EventKeys;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0002\b\u0004\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0002\u001a\u001bB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J \u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u0013H\u0002J,\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001c"}, d2 = {"Lcom/facebook/react/uimanager/style/LinearGradient;", "Lcom/facebook/react/uimanager/style/Gradient;", EventKeys.DIRECTION_KEY, "Lcom/facebook/react/uimanager/style/LinearGradient$Direction;", "colorStops", "", "Lcom/facebook/react/uimanager/style/ColorStop;", "<init>", "(Lcom/facebook/react/uimanager/style/LinearGradient$Direction;Ljava/util/List;)V", "getDirection", "()Lcom/facebook/react/uimanager/style/LinearGradient$Direction;", "getColorStops", "()Ljava/util/List;", "getShader", "Landroid/graphics/Shader;", "width", "", "height", "getAngleForKeyword", "", "keyword", "Lcom/facebook/react/uimanager/style/LinearGradient$Direction$KeywordType;", "endPointsFromAngle", "Lkotlin/Pair;", "", LinearGradientManager.PROP_ANGLE, "Companion", "Direction", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLinearGradient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinearGradient.kt\ncom/facebook/react/uimanager/style/LinearGradient\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,191:1\n1878#2,3:192\n*S KotlinDebug\n*F\n+ 1 LinearGradient.kt\ncom/facebook/react/uimanager/style/LinearGradient\n*L\n111#1:192,3\n*E\n"})
/* loaded from: classes2.dex */
public final class LinearGradient implements Gradient {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final List<ColorStop> colorStops;

    @NotNull
    private final Direction direction;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lcom/facebook/react/uimanager/style/LinearGradient$Companion;", "", "<init>", "()V", "parse", "Lcom/facebook/react/uimanager/style/Gradient;", "gradientMap", "Lcom/facebook/react/bridge/ReadableMap;", "context", "Landroid/content/Context;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nLinearGradient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinearGradient.kt\ncom/facebook/react/uimanager/style/LinearGradient$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,191:1\n1#2:192\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00c2  */
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Gradient parse(@NotNull ReadableMap gradientMap, @NotNull Context context) {
            Direction direction;
            ArrayList arrayList;
            Direction.KeywordType fromString;
            Intrinsics.checkNotNullParameter(gradientMap, "gradientMap");
            Intrinsics.checkNotNullParameter(context, "context");
            ReadableMap readableMap = gradientMap.hasKey(EventKeys.DIRECTION_KEY) ? gradientMap : null;
            if (readableMap != null) {
                ReadableMap map = readableMap.getMap(EventKeys.DIRECTION_KEY);
                if (map == null) {
                    return null;
                }
                String string = map.getString("type");
                if (Intrinsics.areEqual(string, LinearGradientManager.PROP_ANGLE)) {
                    direction = new Direction.Angle(map.getDouble(EventKeys.VALUE_KEY));
                } else if (Intrinsics.areEqual(string, "keyword") && (fromString = Direction.KeywordType.INSTANCE.fromString(map.getString(EventKeys.VALUE_KEY))) != null) {
                    direction = new Direction.Keyword(fromString);
                }
                if (!gradientMap.hasKey("colorStops")) {
                    gradientMap = null;
                }
                if (gradientMap == null) {
                    ReadableArray array = gradientMap.getArray("colorStops");
                    if (array == null) {
                        return null;
                    }
                    arrayList = new ArrayList(array.size());
                    int size = array.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ReadableMap map2 = array.getMap(i10);
                        if (map2 != null) {
                            arrayList.add(new ColorStop((!map2.hasKey(ViewProps.COLOR) || map2.isNull(ViewProps.COLOR)) ? null : map2.getType(ViewProps.COLOR) == ReadableType.Map ? ColorPropConverter.getColor(map2.getMap(ViewProps.COLOR), context) : Integer.valueOf(map2.getInt(ViewProps.COLOR)), LengthPercentage.Companion.setFromDynamic$default(LengthPercentage.INSTANCE, map2.getDynamic(ViewProps.POSITION), false, 2, null)));
                        }
                    }
                } else {
                    arrayList = null;
                }
                if (direction != null || arrayList == null) {
                    return null;
                }
                return new LinearGradient(direction, arrayList);
            }
            direction = null;
            if (!gradientMap.hasKey("colorStops")) {
            }
            if (gradientMap == null) {
            }
            if (direction != null) {
            }
            return null;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/facebook/react/uimanager/style/LinearGradient$Direction;", "", "<init>", "()V", "Angle", "Keyword", "KeywordType", "Lcom/facebook/react/uimanager/style/LinearGradient$Direction$Angle;", "Lcom/facebook/react/uimanager/style/LinearGradient$Direction$Keyword;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Direction {

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/facebook/react/uimanager/style/LinearGradient$Direction$Angle;", "Lcom/facebook/react/uimanager/style/LinearGradient$Direction;", LinearGradientManager.PROP_ANGLE, "", "<init>", "(D)V", "getAngle", "()D", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Angle extends Direction {
            private final double angle;

            public Angle(double d10) {
                super(null);
                this.angle = d10;
            }

            public final double getAngle() {
                return this.angle;
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/facebook/react/uimanager/style/LinearGradient$Direction$Keyword;", "Lcom/facebook/react/uimanager/style/LinearGradient$Direction;", "keyword", "Lcom/facebook/react/uimanager/style/LinearGradient$Direction$KeywordType;", "<init>", "(Lcom/facebook/react/uimanager/style/LinearGradient$Direction$KeywordType;)V", "getKeyword", "()Lcom/facebook/react/uimanager/style/LinearGradient$Direction$KeywordType;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Keyword extends Direction {

            @NotNull
            private final KeywordType keyword;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Keyword(@NotNull KeywordType keyword) {
                super(null);
                Intrinsics.checkNotNullParameter(keyword, "keyword");
                this.keyword = keyword;
            }

            @NotNull
            public final KeywordType getKeyword() {
                return this.keyword;
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/facebook/react/uimanager/style/LinearGradient$Direction$KeywordType;", "", EventKeys.VALUE_KEY, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "TO_TOP_RIGHT", "TO_BOTTOM_RIGHT", "TO_TOP_LEFT", "TO_BOTTOM_LEFT", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class KeywordType {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ KeywordType[] $VALUES;

            /* renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE;

            @NotNull
            private final String value;
            public static final KeywordType TO_TOP_RIGHT = new KeywordType("TO_TOP_RIGHT", 0, "to top right");
            public static final KeywordType TO_BOTTOM_RIGHT = new KeywordType("TO_BOTTOM_RIGHT", 1, "to bottom right");
            public static final KeywordType TO_TOP_LEFT = new KeywordType("TO_TOP_LEFT", 2, "to top left");
            public static final KeywordType TO_BOTTOM_LEFT = new KeywordType("TO_BOTTOM_LEFT", 3, "to bottom left");

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lcom/facebook/react/uimanager/style/LinearGradient$Direction$KeywordType$Companion;", "", "<init>", "()V", "fromString", "Lcom/facebook/react/uimanager/style/LinearGradient$Direction$KeywordType;", EventKeys.VALUE_KEY, "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension({"SMAP\nLinearGradient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinearGradient.kt\ncom/facebook/react/uimanager/style/LinearGradient$Direction$KeywordType$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,191:1\n1#2:192\n*E\n"})
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                @Nullable
                public final KeywordType fromString(@Nullable String value) {
                    for (KeywordType keywordType : KeywordType.values()) {
                        if (Intrinsics.areEqual(keywordType.getValue(), value)) {
                            return keywordType;
                        }
                    }
                    return null;
                }

                private Companion() {
                }
            }

            private static final /* synthetic */ KeywordType[] $values() {
                return new KeywordType[]{TO_TOP_RIGHT, TO_BOTTOM_RIGHT, TO_TOP_LEFT, TO_BOTTOM_LEFT};
            }

            static {
                KeywordType[] $values = $values();
                $VALUES = $values;
                $ENTRIES = EnumEntriesKt.enumEntries($values);
                INSTANCE = new Companion(null);
            }

            private KeywordType(String str, int i10, String str2) {
                this.value = str2;
            }

            @NotNull
            public static EnumEntries<KeywordType> getEntries() {
                return $ENTRIES;
            }

            public static KeywordType valueOf(String str) {
                return (KeywordType) Enum.valueOf(KeywordType.class, str);
            }

            public static KeywordType[] values() {
                return (KeywordType[]) $VALUES.clone();
            }

            @NotNull
            public final String getValue() {
                return this.value;
            }
        }

        public /* synthetic */ Direction(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Direction() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Direction.KeywordType.values().length];
            try {
                iArr[Direction.KeywordType.TO_TOP_RIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Direction.KeywordType.TO_BOTTOM_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Direction.KeywordType.TO_TOP_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Direction.KeywordType.TO_BOTTOM_LEFT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public LinearGradient(@NotNull Direction direction, @NotNull List<ColorStop> colorStops) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(colorStops, "colorStops");
        this.direction = direction;
        this.colorStops = colorStops;
    }

    private final Pair<float[], float[]> endPointsFromAngle(double angle, float height, float width) {
        double d10 = 360;
        double d11 = angle % d10;
        if (d11 < 0.0d) {
            d11 += d10;
        }
        if (d11 == 0.0d) {
            return new Pair<>(new float[]{0.0f, height}, new float[]{0.0f, 0.0f});
        }
        if (d11 == 90.0d) {
            return new Pair<>(new float[]{0.0f, 0.0f}, new float[]{width, 0.0f});
        }
        if (d11 == 180.0d) {
            return new Pair<>(new float[]{0.0f, 0.0f}, new float[]{0.0f, height});
        }
        if (d11 == 270.0d) {
            return new Pair<>(new float[]{width, 0.0f}, new float[]{0.0f, 0.0f});
        }
        float tan = (float) Math.tan(Math.toRadians(90 - d11));
        float f10 = (-1) / tan;
        float f11 = 2;
        float f12 = height / f11;
        float f13 = width / f11;
        float[] fArr = d11 < 90.0d ? new float[]{f13, f12} : d11 < 180.0d ? new float[]{f13, -f12} : d11 < 270.0d ? new float[]{-f13, -f12} : new float[]{-f13, f12};
        float f14 = fArr[1] - (fArr[0] * f10);
        float f15 = f14 / (tan - f10);
        float f16 = (f10 * f15) + f14;
        return new Pair<>(new float[]{f13 - f15, f12 + f16}, new float[]{f13 + f15, f12 - f16});
    }

    private final double getAngleForKeyword(Direction.KeywordType keyword, double width, double height) {
        double degrees;
        double d10;
        int i10;
        int i11 = WhenMappings.$EnumSwitchMapping$0[keyword.ordinal()];
        if (i11 == 1) {
            return 90 - Math.toDegrees(Math.atan(width / height));
        }
        if (i11 != 2) {
            if (i11 == 3) {
                degrees = Math.toDegrees(Math.atan(width / height));
                i10 = 270;
            } else {
                if (i11 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                degrees = Math.toDegrees(Math.atan(height / width));
                i10 = 180;
            }
            d10 = i10;
        } else {
            degrees = Math.toDegrees(Math.atan(width / height));
            d10 = 90;
        }
        return degrees + d10;
    }

    @NotNull
    public final List<ColorStop> getColorStops() {
        return this.colorStops;
    }

    @NotNull
    public final Direction getDirection() {
        return this.direction;
    }

    @Override // com.facebook.react.uimanager.style.Gradient
    @NotNull
    public Shader getShader(float width, float height) {
        LinearGradient linearGradient;
        double angleForKeyword;
        Direction direction = this.direction;
        if (direction instanceof Direction.Angle) {
            angleForKeyword = ((Direction.Angle) direction).getAngle();
            linearGradient = this;
        } else {
            if (!(direction instanceof Direction.Keyword)) {
                throw new NoWhenBranchMatchedException();
            }
            linearGradient = this;
            angleForKeyword = linearGradient.getAngleForKeyword(((Direction.Keyword) direction).getKeyword(), width, height);
        }
        Pair<float[], float[]> endPointsFromAngle = endPointsFromAngle(angleForKeyword, height, width);
        float[] component1 = endPointsFromAngle.component1();
        float[] component2 = endPointsFromAngle.component2();
        float f10 = component2[0] - component1[0];
        float f11 = component2[1] - component1[1];
        List<ProcessedColorStop> fixedColorStops = ColorStopUtils.INSTANCE.getFixedColorStops(linearGradient.colorStops, (float) Math.sqrt((f10 * f10) + (f11 * f11)));
        int[] iArr = new int[fixedColorStops.size()];
        float[] fArr = new float[fixedColorStops.size()];
        int i10 = 0;
        for (Object obj : fixedColorStops) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            ProcessedColorStop processedColorStop = (ProcessedColorStop) obj;
            Integer color = processedColorStop.getColor();
            if (color != null && processedColorStop.getPosition() != null) {
                iArr[i10] = color.intValue();
                fArr[i10] = processedColorStop.getPosition().floatValue();
            }
            i10 = i11;
        }
        return new android.graphics.LinearGradient(component1[0], component1[1], component2[0], component2[1], iArr, fArr, Shader.TileMode.CLAMP);
    }
}
