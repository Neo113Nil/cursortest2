package com.facebook.react.uimanager.style;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Shader;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.FloatUtil;
import com.facebook.react.uimanager.LengthPercentage;
import com.facebook.react.uimanager.LengthPercentageType;
import com.facebook.react.uimanager.PixelUtil;
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
import lb.C5444x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 &2\u00020\u0001:\u0004&'()B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J<\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180\u001b2\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J,\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180\u001b2\u0006\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u0018H\u0002J<\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180\u001b2\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J4\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180\u001b2\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006*"}, d2 = {"Lcom/facebook/react/uimanager/style/RadialGradient;", "Lcom/facebook/react/uimanager/style/Gradient;", "shape", "Lcom/facebook/react/uimanager/style/RadialGradient$Shape;", "size", "Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize;", ViewProps.POSITION, "Lcom/facebook/react/uimanager/style/RadialGradient$Position;", "colorStops", "", "Lcom/facebook/react/uimanager/style/ColorStop;", "<init>", "(Lcom/facebook/react/uimanager/style/RadialGradient$Shape;Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize;Lcom/facebook/react/uimanager/style/RadialGradient$Position;Ljava/util/List;)V", "getShape", "()Lcom/facebook/react/uimanager/style/RadialGradient$Shape;", "getSize", "()Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize;", "getPosition", "()Lcom/facebook/react/uimanager/style/RadialGradient$Position;", "getColorStops", "()Ljava/util/List;", "getShader", "Landroid/graphics/Shader;", "width", "", "height", "radiusToSide", "Lkotlin/Pair;", "centerX", "centerY", "sizeKeyword", "Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize$KeywordType;", "calculateEllipseRadius", "offsetX", "offsetY", ViewProps.ASPECT_RATIO, "radiusToCorner", "calculateRadius", "Companion", "Shape", "GradientSize", "Position", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRadialGradient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RadialGradient.kt\ncom/facebook/react/uimanager/style/RadialGradient\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,383:1\n1878#2,3:384\n*S KotlinDebug\n*F\n+ 1 RadialGradient.kt\ncom/facebook/react/uimanager/style/RadialGradient\n*L\n202#1:384,3\n*E\n"})
/* loaded from: classes2.dex */
public final class RadialGradient implements Gradient {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final List<ColorStop> colorStops;

    @NotNull
    private final Position position;

    @NotNull
    private final Shape shape;

    @NotNull
    private final GradientSize size;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lcom/facebook/react/uimanager/style/RadialGradient$Companion;", "", "<init>", "()V", "parse", "Lcom/facebook/react/uimanager/style/Gradient;", "gradientMap", "Lcom/facebook/react/bridge/ReadableMap;", "context", "Landroid/content/Context;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nRadialGradient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RadialGradient.kt\ncom/facebook/react/uimanager/style/RadialGradient$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,383:1\n1#2:384\n*E\n"})
    public static final class Companion {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ReadableType.values().length];
                try {
                    iArr[ReadableType.String.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ReadableType.Map.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00a2  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x010a  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x010d  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x016a  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x0100  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x009f  */
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Gradient parse(@NotNull ReadableMap gradientMap, @NotNull Context context) {
            GradientSize gradientSize;
            ReadableMap readableMap;
            Position position;
            ArrayList arrayList;
            LengthPercentage fromDynamic$default;
            LengthPercentage lengthPercentage;
            LengthPercentage fromDynamic$default2;
            LengthPercentage lengthPercentage2;
            ReadableMap map;
            String string;
            ReadableMap gradientMap2 = gradientMap;
            Intrinsics.checkNotNullParameter(gradientMap2, "gradientMap");
            Intrinsics.checkNotNullParameter(context, "context");
            ReadableMap readableMap2 = gradientMap2.hasKey("shape") ? gradientMap2 : null;
            Shape fromString = (readableMap2 == null || (string = readableMap2.getString("shape")) == null) ? null : Shape.INSTANCE.fromString(string);
            ReadableMap readableMap3 = gradientMap2.hasKey("size") ? gradientMap2 : null;
            if (readableMap3 != null) {
                int i10 = WhenMappings.$EnumSwitchMapping$0[readableMap3.getType("size").ordinal()];
                if (i10 == 1) {
                    GradientSize.KeywordType fromString2 = GradientSize.KeywordType.INSTANCE.fromString(readableMap3.getString("size"));
                    if (fromString2 != null) {
                        gradientSize = new GradientSize.Keyword(fromString2);
                    }
                } else if (i10 == 2 && (map = readableMap3.getMap("size")) != null) {
                    if (!map.hasKey(C5444x.f55808b) || !map.hasKey("y")) {
                        map = null;
                    }
                    if (map != null) {
                        LengthPercentage.Companion companion = LengthPercentage.INSTANCE;
                        LengthPercentage fromDynamic$default3 = LengthPercentage.Companion.setFromDynamic$default(companion, map.getDynamic(C5444x.f55808b), false, 2, null);
                        LengthPercentage fromDynamic$default4 = LengthPercentage.Companion.setFromDynamic$default(companion, map.getDynamic("y"), false, 2, null);
                        if (fromDynamic$default3 != null && fromDynamic$default4 != null) {
                            gradientSize = new GradientSize.Dimensions(fromDynamic$default3, fromDynamic$default4);
                        }
                    }
                }
                readableMap = !gradientMap2.hasKey(ViewProps.POSITION) ? gradientMap2 : null;
                if (readableMap == null) {
                    ReadableMap map2 = readableMap.getMap(ViewProps.POSITION);
                    if (map2 == null) {
                        return null;
                    }
                    if (!map2.hasKey(ViewProps.TOP)) {
                        if (map2.hasKey(ViewProps.BOTTOM)) {
                            fromDynamic$default = LengthPercentage.Companion.setFromDynamic$default(LengthPercentage.INSTANCE, map2.getDynamic(ViewProps.BOTTOM), false, 2, null);
                            lengthPercentage = null;
                        }
                        return null;
                    }
                    lengthPercentage = LengthPercentage.Companion.setFromDynamic$default(LengthPercentage.INSTANCE, map2.getDynamic(ViewProps.TOP), false, 2, null);
                    fromDynamic$default = null;
                    if (!map2.hasKey(ViewProps.LEFT)) {
                        if (map2.hasKey(ViewProps.RIGHT)) {
                            fromDynamic$default2 = LengthPercentage.Companion.setFromDynamic$default(LengthPercentage.INSTANCE, map2.getDynamic(ViewProps.RIGHT), false, 2, null);
                            lengthPercentage2 = null;
                        }
                        return null;
                    }
                    lengthPercentage2 = LengthPercentage.Companion.setFromDynamic$default(LengthPercentage.INSTANCE, map2.getDynamic(ViewProps.LEFT), false, 2, null);
                    fromDynamic$default2 = null;
                    position = new Position(lengthPercentage, lengthPercentage2, fromDynamic$default2, fromDynamic$default);
                } else {
                    position = null;
                }
                if (!gradientMap2.hasKey("colorStops")) {
                    gradientMap2 = null;
                }
                if (gradientMap2 == null) {
                    ReadableArray array = gradientMap2.getArray("colorStops");
                    if (array == null) {
                        return null;
                    }
                    arrayList = new ArrayList(array.size());
                    int size = array.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        ReadableMap map3 = array.getMap(i11);
                        if (map3 != null) {
                            arrayList.add(new ColorStop((!map3.hasKey(ViewProps.COLOR) || map3.isNull(ViewProps.COLOR)) ? null : map3.getType(ViewProps.COLOR) == ReadableType.Map ? ColorPropConverter.getColor(map3.getMap(ViewProps.COLOR), context) : Integer.valueOf(map3.getInt(ViewProps.COLOR)), LengthPercentage.Companion.setFromDynamic$default(LengthPercentage.INSTANCE, map3.getDynamic(ViewProps.POSITION), false, 2, null)));
                        }
                    }
                } else {
                    arrayList = null;
                }
                if (fromString != null || gradientSize == null || position == null || arrayList == null) {
                    return null;
                }
                return new RadialGradient(fromString, gradientSize, position, arrayList);
            }
            gradientSize = null;
            if (!gradientMap2.hasKey(ViewProps.POSITION)) {
            }
            if (readableMap == null) {
            }
            if (!gradientMap2.hasKey("colorStops")) {
            }
            if (gradientMap2 == null) {
            }
            if (fromString != null) {
            }
            return null;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize;", "", "<init>", "()V", "Keyword", "Dimensions", "KeywordType", "Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize$Dimensions;", "Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize$Keyword;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class GradientSize {

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize$Dimensions;", "Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize;", C5444x.f55808b, "Lcom/facebook/react/uimanager/LengthPercentage;", "y", "<init>", "(Lcom/facebook/react/uimanager/LengthPercentage;Lcom/facebook/react/uimanager/LengthPercentage;)V", "getX", "()Lcom/facebook/react/uimanager/LengthPercentage;", "getY", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Dimensions extends GradientSize {

            @NotNull
            private final LengthPercentage x;

            @NotNull
            private final LengthPercentage y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Dimensions(@NotNull LengthPercentage x10, @NotNull LengthPercentage y10) {
                super(null);
                Intrinsics.checkNotNullParameter(x10, "x");
                Intrinsics.checkNotNullParameter(y10, "y");
                this.x = x10;
                this.y = y10;
            }

            @NotNull
            public final LengthPercentage getX() {
                return this.x;
            }

            @NotNull
            public final LengthPercentage getY() {
                return this.y;
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize$Keyword;", "Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize;", "keyword", "Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize$KeywordType;", "<init>", "(Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize$KeywordType;)V", "getKeyword", "()Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize$KeywordType;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Keyword extends GradientSize {

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
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize$KeywordType;", "", EventKeys.VALUE_KEY, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "CLOSEST_SIDE", "FARTHEST_SIDE", "CLOSEST_CORNER", "FARTHEST_CORNER", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class KeywordType {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ KeywordType[] $VALUES;

            /* renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE;

            @NotNull
            private final String value;
            public static final KeywordType CLOSEST_SIDE = new KeywordType("CLOSEST_SIDE", 0, "closest-side");
            public static final KeywordType FARTHEST_SIDE = new KeywordType("FARTHEST_SIDE", 1, "farthest-side");
            public static final KeywordType CLOSEST_CORNER = new KeywordType("CLOSEST_CORNER", 2, "closest-corner");
            public static final KeywordType FARTHEST_CORNER = new KeywordType("FARTHEST_CORNER", 3, "farthest-corner");

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize$KeywordType$Companion;", "", "<init>", "()V", "fromString", "Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize$KeywordType;", EventKeys.VALUE_KEY, "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension({"SMAP\nRadialGradient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RadialGradient.kt\ncom/facebook/react/uimanager/style/RadialGradient$GradientSize$KeywordType$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,383:1\n1#2:384\n*E\n"})
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
                return new KeywordType[]{CLOSEST_SIDE, FARTHEST_SIDE, CLOSEST_CORNER, FARTHEST_CORNER};
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

        public /* synthetic */ GradientSize(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private GradientSize() {
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/facebook/react/uimanager/style/RadialGradient$Position;", "", ViewProps.TOP, "Lcom/facebook/react/uimanager/LengthPercentage;", ViewProps.LEFT, ViewProps.RIGHT, ViewProps.BOTTOM, "<init>", "(Lcom/facebook/react/uimanager/LengthPercentage;Lcom/facebook/react/uimanager/LengthPercentage;Lcom/facebook/react/uimanager/LengthPercentage;Lcom/facebook/react/uimanager/LengthPercentage;)V", "getTop", "()Lcom/facebook/react/uimanager/LengthPercentage;", "getLeft", "getRight", "getBottom", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Position {

        @Nullable
        private final LengthPercentage bottom;

        @Nullable
        private final LengthPercentage left;

        @Nullable
        private final LengthPercentage right;

        @Nullable
        private final LengthPercentage top;

        public Position() {
            this(null, null, null, null, 15, null);
        }

        @Nullable
        public final LengthPercentage getBottom() {
            return this.bottom;
        }

        @Nullable
        public final LengthPercentage getLeft() {
            return this.left;
        }

        @Nullable
        public final LengthPercentage getRight() {
            return this.right;
        }

        @Nullable
        public final LengthPercentage getTop() {
            return this.top;
        }

        public Position(@Nullable LengthPercentage lengthPercentage, @Nullable LengthPercentage lengthPercentage2, @Nullable LengthPercentage lengthPercentage3, @Nullable LengthPercentage lengthPercentage4) {
            this.top = lengthPercentage;
            this.left = lengthPercentage2;
            this.right = lengthPercentage3;
            this.bottom = lengthPercentage4;
        }

        public /* synthetic */ Position(LengthPercentage lengthPercentage, LengthPercentage lengthPercentage2, LengthPercentage lengthPercentage3, LengthPercentage lengthPercentage4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : lengthPercentage, (i10 & 2) != 0 ? null : lengthPercentage2, (i10 & 4) != 0 ? null : lengthPercentage3, (i10 & 8) != 0 ? null : lengthPercentage4);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, d2 = {"Lcom/facebook/react/uimanager/style/RadialGradient$Shape;", "", "<init>", "(Ljava/lang/String;I)V", "CIRCLE", "ELLIPSE", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Shape {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Shape[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE;
        public static final Shape CIRCLE = new Shape("CIRCLE", 0);
        public static final Shape ELLIPSE = new Shape("ELLIPSE", 1);

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/facebook/react/uimanager/style/RadialGradient$Shape$Companion;", "", "<init>", "()V", "fromString", "Lcom/facebook/react/uimanager/style/RadialGradient$Shape;", EventKeys.VALUE_KEY, "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Nullable
            public final Shape fromString(@NotNull String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                if (Intrinsics.areEqual(value, "circle")) {
                    return Shape.CIRCLE;
                }
                if (Intrinsics.areEqual(value, "ellipse")) {
                    return Shape.ELLIPSE;
                }
                return null;
            }

            private Companion() {
            }
        }

        private static final /* synthetic */ Shape[] $values() {
            return new Shape[]{CIRCLE, ELLIPSE};
        }

        static {
            Shape[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
            INSTANCE = new Companion(null);
        }

        private Shape(String str, int i10) {
        }

        @NotNull
        public static EnumEntries<Shape> getEntries() {
            return $ENTRIES;
        }

        public static Shape valueOf(String str) {
            return (Shape) Enum.valueOf(Shape.class, str);
        }

        public static Shape[] values() {
            return (Shape[]) $VALUES.clone();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GradientSize.KeywordType.values().length];
            try {
                iArr[GradientSize.KeywordType.CLOSEST_SIDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GradientSize.KeywordType.FARTHEST_SIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GradientSize.KeywordType.CLOSEST_CORNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GradientSize.KeywordType.FARTHEST_CORNER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public RadialGradient(@NotNull Shape shape, @NotNull GradientSize size, @NotNull Position position, @NotNull List<ColorStop> colorStops) {
        Intrinsics.checkNotNullParameter(shape, "shape");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(colorStops, "colorStops");
        this.shape = shape;
        this.size = size;
        this.position = position;
        this.colorStops = colorStops;
    }

    private final Pair<Float, Float> calculateEllipseRadius(float offsetX, float offsetY, float aspectRatio) {
        Float valueOf = Float.valueOf(0.0f);
        if (aspectRatio == 0.0f || Math.abs(aspectRatio) > Float.MAX_VALUE) {
            return new Pair<>(valueOf, valueOf);
        }
        float sqrt = (float) Math.sqrt((offsetX * offsetX) + (offsetY * offsetY * aspectRatio * aspectRatio));
        return new Pair<>(Float.valueOf(sqrt), Float.valueOf(sqrt / aspectRatio));
    }

    private final Pair<Float, Float> calculateRadius(float centerX, float centerY, float width, float height) {
        GradientSize gradientSize = this.size;
        if (gradientSize instanceof GradientSize.Keyword) {
            GradientSize.KeywordType keyword = ((GradientSize.Keyword) gradientSize).getKeyword();
            int i10 = WhenMappings.$EnumSwitchMapping$0[keyword.ordinal()];
            if (i10 == 1 || i10 == 2) {
                return radiusToSide(centerX, centerY, width, height, keyword);
            }
            if (i10 == 3 || i10 == 4) {
                return radiusToCorner(centerX, centerY, width, height, keyword);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!(gradientSize instanceof GradientSize.Dimensions)) {
            return radiusToCorner(centerX, centerY, width, height, GradientSize.KeywordType.FARTHEST_CORNER);
        }
        LengthPercentageType type = ((GradientSize.Dimensions) gradientSize).getX().getType();
        LengthPercentageType lengthPercentageType = LengthPercentageType.PERCENT;
        float resolve = type == lengthPercentageType ? ((GradientSize.Dimensions) this.size).getX().resolve(width) : PixelUtil.INSTANCE.dpToPx(((GradientSize.Dimensions) this.size).getX().resolve(width));
        float resolve2 = ((GradientSize.Dimensions) this.size).getY().getType() == lengthPercentageType ? ((GradientSize.Dimensions) this.size).getY().resolve(height) : PixelUtil.INSTANCE.dpToPx(((GradientSize.Dimensions) this.size).getY().resolve(height));
        if (this.shape != Shape.CIRCLE) {
            return new Pair<>(Float.valueOf(resolve), Float.valueOf(resolve2));
        }
        float max = Math.max(resolve, resolve2);
        return new Pair<>(Float.valueOf(max), Float.valueOf(max));
    }

    private final Pair<Float, Float> radiusToCorner(float centerX, float centerY, float width, float height, GradientSize.KeywordType sizeKeyword) {
        int i10;
        Float valueOf = Float.valueOf(0.0f);
        Pair[] pairArr = {new Pair(valueOf, valueOf), new Pair(Float.valueOf(width), valueOf), new Pair(Float.valueOf(width), Float.valueOf(height)), new Pair(valueOf, Float.valueOf(height))};
        int i11 = 0;
        double d10 = 2;
        float sqrt = (float) Math.sqrt(((float) Math.pow(centerX - ((Number) pairArr[0].getFirst()).floatValue(), d10)) + ((float) Math.pow(centerY - ((Number) pairArr[0].getSecond()).floatValue(), d10)));
        boolean z10 = sizeKeyword == GradientSize.KeywordType.CLOSEST_CORNER;
        while (i10 < 4) {
            float sqrt2 = (float) Math.sqrt(((float) Math.pow(centerX - ((Number) pairArr[i10].getFirst()).floatValue(), d10)) + ((float) Math.pow(centerY - ((Number) pairArr[i10].getSecond()).floatValue(), d10)));
            if (z10) {
                i10 = sqrt2 >= sqrt ? i10 + 1 : 1;
                sqrt = sqrt2;
                i11 = i10;
            } else {
                if (sqrt2 <= sqrt) {
                }
                sqrt = sqrt2;
                i11 = i10;
            }
        }
        if (this.shape == Shape.CIRCLE) {
            return new Pair<>(Float.valueOf(sqrt), Float.valueOf(sqrt));
        }
        Pair<Float, Float> radiusToSide = radiusToSide(centerX, centerY, width, height, z10 ? GradientSize.KeywordType.CLOSEST_SIDE : GradientSize.KeywordType.FARTHEST_SIDE);
        return calculateEllipseRadius(((Number) pairArr[i11].getFirst()).floatValue() - centerX, ((Number) pairArr[i11].getSecond()).floatValue() - centerY, radiusToSide.getFirst().floatValue() / radiusToSide.getSecond().floatValue());
    }

    private final Pair<Float, Float> radiusToSide(float centerX, float centerY, float width, float height, GradientSize.KeywordType sizeKeyword) {
        float max;
        float max2;
        float f10 = width - centerX;
        float f11 = height - centerY;
        GradientSize.KeywordType keywordType = GradientSize.KeywordType.CLOSEST_SIDE;
        if (sizeKeyword == keywordType) {
            max = Math.min(centerX, f10);
            max2 = Math.min(centerY, f11);
        } else {
            max = Math.max(centerX, f10);
            max2 = Math.max(centerY, f11);
        }
        if (this.shape != Shape.CIRCLE) {
            return new Pair<>(Float.valueOf(max), Float.valueOf(max2));
        }
        float min = sizeKeyword == keywordType ? Math.min(max, max2) : Math.max(max, max2);
        return new Pair<>(Float.valueOf(min), Float.valueOf(min));
    }

    @NotNull
    public final List<ColorStop> getColorStops() {
        return this.colorStops;
    }

    @NotNull
    public final Position getPosition() {
        return this.position;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0152 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0153  */
    @Override // com.facebook.react.uimanager.style.Gradient
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Shader getShader(float width, float height) {
        float resolve;
        float f10 = width / 2.0f;
        float f11 = height / 2.0f;
        if (this.position.getTop() != null) {
            f11 = this.position.getTop().getType() == LengthPercentageType.PERCENT ? this.position.getTop().resolve(height) : PixelUtil.INSTANCE.dpToPx(this.position.getTop().resolve(height));
        } else if (this.position.getBottom() != null) {
            f11 = height - (this.position.getBottom().getType() == LengthPercentageType.PERCENT ? this.position.getBottom().resolve(height) : PixelUtil.INSTANCE.dpToPx(this.position.getBottom().resolve(height)));
        }
        float f12 = f11;
        if (this.position.getLeft() == null) {
            if (this.position.getRight() != null) {
                resolve = width - (this.position.getRight().getType() == LengthPercentageType.PERCENT ? this.position.getRight().resolve(width) : PixelUtil.INSTANCE.dpToPx(this.position.getRight().resolve(width)));
            }
            float f13 = f10;
            Pair<Float, Float> calculateRadius = calculateRadius(f13, f12, width, height);
            float floatValue = calculateRadius.component1().floatValue();
            float floatValue2 = calculateRadius.component2().floatValue();
            List<ProcessedColorStop> fixedColorStops = ColorStopUtils.INSTANCE.getFixedColorStops(this.colorStops, Math.max(floatValue, floatValue2));
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
            android.graphics.RadialGradient radialGradient = new android.graphics.RadialGradient(f13, f12, Math.max(floatValue, 1.0E-5f), iArr, fArr, Shader.TileMode.CLAMP);
            if (this.shape != Shape.CIRCLE) {
                return radialGradient;
            }
            if (!FloatUtil.floatsEqual(floatValue, floatValue2)) {
                Matrix matrix = new Matrix();
                matrix.setScale(1.0f, floatValue2 / floatValue, f13, f12);
                radialGradient.setLocalMatrix(matrix);
            }
            return radialGradient;
        }
        resolve = this.position.getLeft().getType() == LengthPercentageType.PERCENT ? this.position.getLeft().resolve(width) : PixelUtil.INSTANCE.dpToPx(this.position.getLeft().resolve(width));
        f10 = resolve;
        float f132 = f10;
        Pair<Float, Float> calculateRadius2 = calculateRadius(f132, f12, width, height);
        float floatValue3 = calculateRadius2.component1().floatValue();
        float floatValue22 = calculateRadius2.component2().floatValue();
        List<ProcessedColorStop> fixedColorStops2 = ColorStopUtils.INSTANCE.getFixedColorStops(this.colorStops, Math.max(floatValue3, floatValue22));
        int[] iArr2 = new int[fixedColorStops2.size()];
        float[] fArr2 = new float[fixedColorStops2.size()];
        int i102 = 0;
        while (r0.hasNext()) {
        }
        android.graphics.RadialGradient radialGradient2 = new android.graphics.RadialGradient(f132, f12, Math.max(floatValue3, 1.0E-5f), iArr2, fArr2, Shader.TileMode.CLAMP);
        if (this.shape != Shape.CIRCLE) {
        }
    }

    @NotNull
    public final Shape getShape() {
        return this.shape;
    }

    @NotNull
    public final GradientSize getSize() {
        return this.size;
    }
}
