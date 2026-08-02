package ru.ozon.app.android.uikit.view.shimmer;

import Ej.b;
import I0.C3173b;
import Sc.o;
import Xc.a;
import android.animation.TimeInterpolator;
import android.content.res.TypedArray;
import android.graphics.RectF;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import hd.C6915b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.uikit.R$styleable;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 U2\u00020\u0001:\u0006UVWXYZB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\u0003J\r\u0010\n\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u0003R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R$\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00048\u0006@BX\u0087\u000e¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR$\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00048\u0006@BX\u0087\u000e¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR$\u0010 \u001a\u00020\u001f2\u0006\u0010\u0018\u001a\u00020\u001f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R$\u0010%\u001a\u00020$2\u0006\u0010\u0018\u001a\u00020$8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R$\u0010)\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b)\u0010\u001a\u001a\u0004\b*\u0010\u001cR$\u0010+\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b+\u0010\u001a\u001a\u0004\b,\u0010\u001cR$\u0010.\u001a\u00020-2\u0006\u0010\u0018\u001a\u00020-8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R$\u00102\u001a\u00020-2\u0006\u0010\u0018\u001a\u00020-8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b2\u0010/\u001a\u0004\b3\u00101R$\u00104\u001a\u00020-2\u0006\u0010\u0018\u001a\u00020-8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b4\u0010/\u001a\u0004\b5\u00101R$\u00106\u001a\u00020-2\u0006\u0010\u0018\u001a\u00020-8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b6\u0010/\u001a\u0004\b7\u00101R$\u00108\u001a\u00020-2\u0006\u0010\u0018\u001a\u00020-8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b8\u0010/\u001a\u0004\b9\u00101R$\u0010;\u001a\u00020:2\u0006\u0010\u0018\u001a\u00020:8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R$\u0010?\u001a\u00020:2\u0006\u0010\u0018\u001a\u00020:8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b?\u0010<\u001a\u0004\b@\u0010>R$\u0010A\u001a\u00020:2\u0006\u0010\u0018\u001a\u00020:8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bA\u0010<\u001a\u0004\bB\u0010>R$\u0010C\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bC\u0010\u001a\u001a\u0004\bD\u0010\u001cR$\u0010E\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bE\u0010\u001a\u001a\u0004\bF\u0010\u001cR$\u0010H\u001a\u00020G2\u0006\u0010\u0018\u001a\u00020G8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR$\u0010L\u001a\u00020G2\u0006\u0010\u0018\u001a\u00020G8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bL\u0010I\u001a\u0004\bM\u0010KR$\u0010N\u001a\u00020G2\u0006\u0010\u0018\u001a\u00020G8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bN\u0010I\u001a\u0004\bO\u0010KR(\u0010Q\u001a\u0004\u0018\u00010P2\b\u0010\u0018\u001a\u0004\u0018\u00010P8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T¨\u0006["}, d2 = {"Lru/ozon/app/android/uikit/view/shimmer/Shimmer;", "", "<init>", "()V", "", "width", "(I)I", "height", "", "updateColors", "updatePositions", "Landroid/graphics/RectF;", "bounds", "Landroid/graphics/RectF;", "", "positions", "[F", "getPositions", "()[F", "", "colors", "[I", "getColors", "()[I", AppMeasurementSdk.ConditionalUserProperty.VALUE, "highlightColor", "I", "getHighlightColor", "()I", "baseColor", "getBaseColor", "Lru/ozon/app/android/uikit/view/shimmer/Shimmer$Direction;", "direction", "Lru/ozon/app/android/uikit/view/shimmer/Shimmer$Direction;", "getDirection", "()Lru/ozon/app/android/uikit/view/shimmer/Shimmer$Direction;", "Lru/ozon/app/android/uikit/view/shimmer/Shimmer$Shape;", "shape", "Lru/ozon/app/android/uikit/view/shimmer/Shimmer$Shape;", "getShape", "()Lru/ozon/app/android/uikit/view/shimmer/Shimmer$Shape;", "fixedWidth", "getFixedWidth", "fixedHeight", "getFixedHeight", "", "widthRatio", "F", "getWidthRatio", "()F", "heightRatio", "getHeightRatio", "intensity", "getIntensity", "dropoff", "getDropoff", "tilt", "getTilt", "", "clipToChildren", "Z", "getClipToChildren", "()Z", "autoStart", "getAutoStart", "alphaShimmer", "getAlphaShimmer", "repeatCount", "getRepeatCount", "repeatMode", "getRepeatMode", "", "animationDuration", "J", "getAnimationDuration", "()J", "repeatDelay", "getRepeatDelay", "startDelay", "getStartDelay", "Landroid/animation/TimeInterpolator;", "interpolator", "Landroid/animation/TimeInterpolator;", "getInterpolator", "()Landroid/animation/TimeInterpolator;", "Companion", "Builder", "AlphaHighlightBuilder", "ColorHighlightBuilder", "Shape", "Direction", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Shimmer {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private int fixedHeight;
    private int fixedWidth;
    private float intensity;
    private TimeInterpolator interpolator;
    private long repeatDelay;
    private long startDelay;

    @NotNull
    private final RectF bounds = new RectF();

    @NotNull
    private final float[] positions = new float[4];

    @NotNull
    private final int[] colors = new int[4];
    private int highlightColor = -1;
    private int baseColor = 1291845631;

    @NotNull
    private Direction direction = Direction.LEFT_TO_RIGHT;

    @NotNull
    private Shape shape = Shape.LINEAR;
    private float widthRatio = 1.0f;
    private float heightRatio = 1.0f;
    private float dropoff = 0.5f;
    private float tilt = 20.0f;
    private boolean clipToChildren = true;
    private boolean autoStart = true;
    private boolean alphaShimmer = true;
    private int repeatCount = -1;
    private int repeatMode = 1;
    private long animationDuration = 1000;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/uikit/view/shimmer/Shimmer$AlphaHighlightBuilder;", "Lru/ozon/app/android/uikit/view/shimmer/Shimmer$Builder;", "<init>", "()V", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AlphaHighlightBuilder extends Builder {
        public AlphaHighlightBuilder() {
            getShimmer().alphaShimmer = true;
        }
    }

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00002\b\b\u0001\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00002\b\b\u0001\u0010\u001a\u001a\u00020\u0016¢\u0006\u0004\b\u001b\u0010\u0019J\u0015\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0004¢\u0006\u0004\b \u0010\u001eJ\u0015\u0010\"\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0004¢\u0006\u0004\b\"\u0010\u001eJ\u0015\u0010$\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u0004¢\u0006\u0004\b$\u0010\u001eJ\u0015\u0010&\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u0004¢\u0006\u0004\b&\u0010\u001eJ\u0017\u0010(\u001a\u00020\u00002\b\b\u0001\u0010'\u001a\u00020\u0004¢\u0006\u0004\b(\u0010\u001eJ\u0017\u0010)\u001a\u00020\u00002\b\b\u0001\u0010'\u001a\u00020\u0004¢\u0006\u0004\b)\u0010\u001eJ\u0015\u0010,\u001a\u00020\u00002\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J\u0015\u0010.\u001a\u00020\u00002\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b.\u0010-J\u0015\u00100\u001a\u00020\u00002\u0006\u0010/\u001a\u00020\u0016¢\u0006\u0004\b0\u0010\u0019J\u0015\u00102\u001a\u00020\u00002\u0006\u00101\u001a\u00020\u0016¢\u0006\u0004\b2\u0010\u0019J\u0015\u00105\u001a\u00020\u00002\u0006\u00104\u001a\u000203¢\u0006\u0004\b5\u00106J\u0015\u00107\u001a\u00020\u00002\u0006\u00104\u001a\u000203¢\u0006\u0004\b7\u00106J\u0015\u00108\u001a\u00020\u00002\u0006\u00104\u001a\u000203¢\u0006\u0004\b8\u00106J\r\u0010:\u001a\u000209¢\u0006\u0004\b:\u0010;R\u0017\u0010<\u001a\u0002098\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010;¨\u0006?"}, d2 = {"Lru/ozon/app/android/uikit/view/shimmer/Shimmer$Builder;", "", "<init>", "()V", "", "min", "max", AppMeasurementSdk.ConditionalUserProperty.VALUE, "clamp", "(FFF)F", "Landroid/content/res/TypedArray;", "a", "consumeAttributes", "(Landroid/content/res/TypedArray;)Lru/ozon/app/android/uikit/view/shimmer/Shimmer$Builder;", "Lru/ozon/app/android/uikit/view/shimmer/Shimmer$Direction;", "direction", "setDirection", "(Lru/ozon/app/android/uikit/view/shimmer/Shimmer$Direction;)Lru/ozon/app/android/uikit/view/shimmer/Shimmer$Builder;", "Lru/ozon/app/android/uikit/view/shimmer/Shimmer$Shape;", "shape", "setShape", "(Lru/ozon/app/android/uikit/view/shimmer/Shimmer$Shape;)Lru/ozon/app/android/uikit/view/shimmer/Shimmer$Builder;", "", "fixedWidth", "setFixedWidth", "(I)Lru/ozon/app/android/uikit/view/shimmer/Shimmer$Builder;", "fixedHeight", "setFixedHeight", "widthRatio", "setWidthRatio", "(F)Lru/ozon/app/android/uikit/view/shimmer/Shimmer$Builder;", "heightRatio", "setHeightRatio", "intensity", "setIntensity", "dropoff", "setDropoff", "tilt", "setTilt", "alpha", "setBaseAlpha", "setHighlightAlpha", "", "status", "setClipToChildren", "(Z)Lru/ozon/app/android/uikit/view/shimmer/Shimmer$Builder;", "setAutoStart", "repeatCount", "setRepeatCount", "mode", "setRepeatMode", "", "millis", "setRepeatDelay", "(J)Lru/ozon/app/android/uikit/view/shimmer/Shimmer$Builder;", "setStartDelay", "setDuration", "Lru/ozon/app/android/uikit/view/shimmer/Shimmer;", "build", "()Lru/ozon/app/android/uikit/view/shimmer/Shimmer;", "shimmer", "Lru/ozon/app/android/uikit/view/shimmer/Shimmer;", "getShimmer", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Builder {

        @NotNull
        private final Shimmer shimmer = new Shimmer();

        private final float clamp(float min, float max, float value) {
            return Math.min(max, Math.max(min, value));
        }

        @NotNull
        public final Shimmer build() {
            this.shimmer.updateColors();
            this.shimmer.updatePositions();
            return this.shimmer;
        }

        @NotNull
        public Builder consumeAttributes(@NotNull TypedArray a11) {
            Intrinsics.checkNotNullParameter(a11, "a");
            if (a11.hasValue(R$styleable.ShimmerFrameLayout_shimmer_clip_to_children)) {
                setClipToChildren(a11.getBoolean(R$styleable.ShimmerFrameLayout_shimmer_clip_to_children, this.shimmer.getClipToChildren()));
            }
            if (a11.hasValue(R$styleable.ShimmerFrameLayout_shimmer_auto_start)) {
                setAutoStart(a11.getBoolean(R$styleable.ShimmerFrameLayout_shimmer_auto_start, this.shimmer.getAutoStart()));
            }
            if (a11.hasValue(R$styleable.ShimmerFrameLayout_shimmer_base_alpha)) {
                setBaseAlpha(a11.getFloat(R$styleable.ShimmerFrameLayout_shimmer_base_alpha, 0.3f));
            }
            if (a11.hasValue(R$styleable.ShimmerFrameLayout_shimmer_highlight_alpha)) {
                setHighlightAlpha(a11.getFloat(R$styleable.ShimmerFrameLayout_shimmer_highlight_alpha, 1.0f));
            }
            if (a11.hasValue(R$styleable.ShimmerFrameLayout_shimmer_duration)) {
                setDuration(a11.getInt(R$styleable.ShimmerFrameLayout_shimmer_duration, (int) this.shimmer.getAnimationDuration()));
            }
            if (a11.hasValue(R$styleable.ShimmerFrameLayout_shimmer_repeat_count)) {
                setRepeatCount(a11.getInt(R$styleable.ShimmerFrameLayout_shimmer_repeat_count, this.shimmer.getRepeatCount()));
            }
            if (a11.hasValue(R$styleable.ShimmerFrameLayout_shimmer_repeat_delay)) {
                setRepeatDelay(a11.getInt(R$styleable.ShimmerFrameLayout_shimmer_repeat_delay, (int) this.shimmer.getRepeatDelay()));
            }
            if (a11.hasValue(R$styleable.ShimmerFrameLayout_shimmer_repeat_mode)) {
                setRepeatMode(a11.getInt(R$styleable.ShimmerFrameLayout_shimmer_repeat_mode, this.shimmer.getRepeatMode()));
            }
            if (a11.hasValue(R$styleable.ShimmerFrameLayout_shimmer_start_delay)) {
                setStartDelay(a11.getInt(R$styleable.ShimmerFrameLayout_shimmer_start_delay, (int) this.shimmer.getStartDelay()));
            }
            if (a11.hasValue(R$styleable.ShimmerFrameLayout_shimmer_direction)) {
                int i11 = a11.getInt(R$styleable.ShimmerFrameLayout_shimmer_direction, this.shimmer.getDirection().ordinal());
                Direction direction = Direction.LEFT_TO_RIGHT;
                if (i11 == direction.ordinal()) {
                    setDirection(direction);
                } else {
                    Direction direction2 = Direction.TOP_TO_BOTTOM;
                    if (i11 == direction2.ordinal()) {
                        setDirection(direction2);
                    } else {
                        Direction direction3 = Direction.RIGHT_TO_LEFT;
                        if (i11 == direction3.ordinal()) {
                            setDirection(direction3);
                        } else {
                            Direction direction4 = Direction.BOTTOM_TO_TOP;
                            if (i11 == direction4.ordinal()) {
                                setDirection(direction4);
                            } else {
                                setDirection(direction);
                            }
                        }
                    }
                }
            }
            if (a11.hasValue(R$styleable.ShimmerFrameLayout_shimmer_shape)) {
                int i12 = a11.getInt(R$styleable.ShimmerFrameLayout_shimmer_shape, this.shimmer.getShape().ordinal());
                Shape shape = Shape.LINEAR;
                if (i12 == shape.ordinal()) {
                    setShape(shape);
                } else {
                    Shape shape2 = Shape.RADIAL;
                    if (i12 == shape2.ordinal()) {
                        setShape(shape2);
                    } else {
                        Shape shape3 = Shape.SOLID;
                        if (i12 == shape3.ordinal()) {
                            setShape(shape3);
                        } else {
                            setShape(shape);
                        }
                    }
                }
            }
            if (a11.hasValue(R$styleable.ShimmerFrameLayout_shimmer_dropoff)) {
                setDropoff(a11.getFloat(R$styleable.ShimmerFrameLayout_shimmer_dropoff, this.shimmer.getDropoff()));
            }
            if (a11.hasValue(R$styleable.ShimmerFrameLayout_shimmer_fixed_width)) {
                setFixedWidth(a11.getDimensionPixelSize(R$styleable.ShimmerFrameLayout_shimmer_fixed_width, this.shimmer.getFixedWidth()));
            }
            if (a11.hasValue(R$styleable.ShimmerFrameLayout_shimmer_fixed_height)) {
                setFixedHeight(a11.getDimensionPixelSize(R$styleable.ShimmerFrameLayout_shimmer_fixed_height, this.shimmer.getFixedHeight()));
            }
            if (a11.hasValue(R$styleable.ShimmerFrameLayout_shimmer_intensity)) {
                setIntensity(a11.getFloat(R$styleable.ShimmerFrameLayout_shimmer_intensity, this.shimmer.getIntensity()));
            }
            if (a11.hasValue(R$styleable.ShimmerFrameLayout_shimmer_width_ratio)) {
                setWidthRatio(a11.getFloat(R$styleable.ShimmerFrameLayout_shimmer_width_ratio, this.shimmer.getWidthRatio()));
            }
            if (a11.hasValue(R$styleable.ShimmerFrameLayout_shimmer_height_ratio)) {
                setHeightRatio(a11.getFloat(R$styleable.ShimmerFrameLayout_shimmer_height_ratio, this.shimmer.getHeightRatio()));
            }
            if (a11.hasValue(R$styleable.ShimmerFrameLayout_shimmer_tilt)) {
                setTilt(a11.getFloat(R$styleable.ShimmerFrameLayout_shimmer_tilt, this.shimmer.getTilt()));
            }
            return this;
        }

        @NotNull
        public final Shimmer getShimmer() {
            return this.shimmer;
        }

        @NotNull
        public final Builder setAutoStart(boolean status) {
            this.shimmer.autoStart = status;
            return this;
        }

        @NotNull
        public final Builder setBaseAlpha(float alpha) {
            int clamp = (int) (clamp(0.0f, 1.0f, alpha) * 255.0f);
            Shimmer shimmer = this.shimmer;
            shimmer.baseColor = (clamp << 24) | (shimmer.getBaseColor() & 16777215);
            return this;
        }

        @NotNull
        public final Builder setClipToChildren(boolean status) {
            this.shimmer.clipToChildren = status;
            return this;
        }

        @NotNull
        public final Builder setDirection(@NotNull Direction direction) {
            Intrinsics.checkNotNullParameter(direction, "direction");
            this.shimmer.direction = direction;
            return this;
        }

        @NotNull
        public final Builder setDropoff(float dropoff) {
            if (dropoff >= 0.0f) {
                this.shimmer.dropoff = dropoff;
                return this;
            }
            throw new IllegalArgumentException(("Given invalid dropoff value: " + dropoff).toString());
        }

        @NotNull
        public final Builder setDuration(long millis) {
            if (millis < 0) {
                throw new IllegalArgumentException(C3173b.b(millis, "Given a negative duration: ").toString());
            }
            this.shimmer.animationDuration = millis;
            return this;
        }

        @NotNull
        public final Builder setFixedHeight(int fixedHeight) {
            if (fixedHeight < 0) {
                throw new IllegalArgumentException(b.a(fixedHeight, "Given invalid height: ").toString());
            }
            this.shimmer.fixedHeight = fixedHeight;
            return this;
        }

        @NotNull
        public final Builder setFixedWidth(int fixedWidth) {
            if (fixedWidth < 0) {
                throw new IllegalArgumentException(b.a(fixedWidth, "Given invalid width: ").toString());
            }
            this.shimmer.fixedWidth = fixedWidth;
            return this;
        }

        @NotNull
        public final Builder setHeightRatio(float heightRatio) {
            if (heightRatio >= 0.0f) {
                this.shimmer.heightRatio = heightRatio;
                return this;
            }
            throw new IllegalArgumentException(("Given invalid height ratio: " + heightRatio).toString());
        }

        @NotNull
        public final Builder setHighlightAlpha(float alpha) {
            int clamp = (int) (clamp(0.0f, 1.0f, alpha) * 255.0f);
            Shimmer shimmer = this.shimmer;
            shimmer.highlightColor = (clamp << 24) | (shimmer.getHighlightColor() & 16777215);
            return this;
        }

        @NotNull
        public final Builder setIntensity(float intensity) {
            if (intensity >= 0.0f) {
                this.shimmer.intensity = intensity;
                return this;
            }
            throw new IllegalArgumentException(("Given invalid intensity value: " + intensity).toString());
        }

        @NotNull
        public final Builder setRepeatCount(int repeatCount) {
            this.shimmer.repeatCount = repeatCount;
            return this;
        }

        @NotNull
        public final Builder setRepeatDelay(long millis) {
            if (millis < 0) {
                throw new IllegalArgumentException(C3173b.b(millis, "Given a negative repeat delay: ").toString());
            }
            this.shimmer.repeatDelay = millis;
            return this;
        }

        @NotNull
        public final Builder setRepeatMode(int mode) {
            this.shimmer.repeatMode = mode;
            return this;
        }

        @NotNull
        public final Builder setShape(@NotNull Shape shape) {
            Intrinsics.checkNotNullParameter(shape, "shape");
            this.shimmer.shape = shape;
            return this;
        }

        @NotNull
        public final Builder setStartDelay(long millis) {
            if (millis < 0) {
                throw new IllegalArgumentException(C3173b.b(millis, "Given a negative start delay: ").toString());
            }
            this.shimmer.startDelay = millis;
            return this;
        }

        @NotNull
        public final Builder setTilt(float tilt) {
            this.shimmer.tilt = tilt;
            return this;
        }

        @NotNull
        public final Builder setWidthRatio(float widthRatio) {
            if (widthRatio >= 0.0f) {
                this.shimmer.widthRatio = widthRatio;
                return this;
            }
            throw new IllegalArgumentException(("Given invalid width ratio: " + widthRatio).toString());
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00002\b\b\u0001\u0010\b\u001a\u00020\tJ\u0010\u0010\n\u001a\u00020\u00002\b\b\u0001\u0010\b\u001a\u00020\t¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/uikit/view/shimmer/Shimmer$ColorHighlightBuilder;", "Lru/ozon/app/android/uikit/view/shimmer/Shimmer$Builder;", "<init>", "()V", "consumeAttributes", "a", "Landroid/content/res/TypedArray;", "setHighlightColor", "color", "", "setBaseColor", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ColorHighlightBuilder extends Builder {
        public ColorHighlightBuilder() {
            getShimmer().alphaShimmer = false;
        }

        @NotNull
        public final ColorHighlightBuilder setBaseColor(int color) {
            getShimmer().baseColor = (color & 16777215) | (getShimmer().getBaseColor() & (-16777216));
            return this;
        }

        @NotNull
        public final ColorHighlightBuilder setHighlightColor(int color) {
            getShimmer().highlightColor = color;
            return this;
        }

        @Override // ru.ozon.app.android.uikit.view.shimmer.Shimmer.Builder
        @NotNull
        public ColorHighlightBuilder consumeAttributes(@NotNull TypedArray a11) {
            Intrinsics.checkNotNullParameter(a11, "a");
            super.consumeAttributes(a11);
            if (a11.hasValue(R$styleable.ShimmerFrameLayout_shimmer_base_color)) {
                setBaseColor(a11.getColor(R$styleable.ShimmerFrameLayout_shimmer_base_color, getShimmer().getBaseColor()));
            }
            if (a11.hasValue(R$styleable.ShimmerFrameLayout_shimmer_highlight_color)) {
                setHighlightColor(a11.getColor(R$styleable.ShimmerFrameLayout_shimmer_highlight_color, getShimmer().getHighlightColor()));
            }
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/uikit/view/shimmer/Shimmer$Companion;", "", "<init>", "()V", "COMPONENT_COUNT", "", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/uikit/view/shimmer/Shimmer$Direction;", "", "<init>", "(Ljava/lang/String;I)V", "LEFT_TO_RIGHT", "TOP_TO_BOTTOM", "RIGHT_TO_LEFT", "BOTTOM_TO_TOP", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Direction {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Direction[] $VALUES;
        public static final Direction LEFT_TO_RIGHT = new Direction("LEFT_TO_RIGHT", 0);
        public static final Direction TOP_TO_BOTTOM = new Direction("TOP_TO_BOTTOM", 1);
        public static final Direction RIGHT_TO_LEFT = new Direction("RIGHT_TO_LEFT", 2);
        public static final Direction BOTTOM_TO_TOP = new Direction("BOTTOM_TO_TOP", 3);

        private static final /* synthetic */ Direction[] $values() {
            return new Direction[]{LEFT_TO_RIGHT, TOP_TO_BOTTOM, RIGHT_TO_LEFT, BOTTOM_TO_TOP};
        }

        static {
            Direction[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Xc.b.a($values);
        }

        private Direction(String str, int i11) {
        }

        public static Direction valueOf(String str) {
            return (Direction) Enum.valueOf(Direction.class, str);
        }

        public static Direction[] values() {
            return (Direction[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/uikit/view/shimmer/Shimmer$Shape;", "", "<init>", "(Ljava/lang/String;I)V", "LINEAR", "RADIAL", "SOLID", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Shape {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Shape[] $VALUES;
        public static final Shape LINEAR = new Shape("LINEAR", 0);
        public static final Shape RADIAL = new Shape("RADIAL", 1);
        public static final Shape SOLID = new Shape("SOLID", 2);

        private static final /* synthetic */ Shape[] $values() {
            return new Shape[]{LINEAR, RADIAL, SOLID};
        }

        static {
            Shape[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Xc.b.a($values);
        }

        private Shape(String str, int i11) {
        }

        public static Shape valueOf(String str) {
            return (Shape) Enum.valueOf(Shape.class, str);
        }

        public static Shape[] values() {
            return (Shape[]) $VALUES.clone();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Shape.values().length];
            try {
                iArr[Shape.LINEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Shape.RADIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Shape.SOLID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final boolean getAlphaShimmer() {
        return this.alphaShimmer;
    }

    public final long getAnimationDuration() {
        return this.animationDuration;
    }

    public final boolean getAutoStart() {
        return this.autoStart;
    }

    public final int getBaseColor() {
        return this.baseColor;
    }

    public final boolean getClipToChildren() {
        return this.clipToChildren;
    }

    @NotNull
    public final int[] getColors() {
        return this.colors;
    }

    @NotNull
    public final Direction getDirection() {
        return this.direction;
    }

    public final float getDropoff() {
        return this.dropoff;
    }

    public final int getFixedHeight() {
        return this.fixedHeight;
    }

    public final int getFixedWidth() {
        return this.fixedWidth;
    }

    public final float getHeightRatio() {
        return this.heightRatio;
    }

    public final int getHighlightColor() {
        return this.highlightColor;
    }

    public final float getIntensity() {
        return this.intensity;
    }

    public final TimeInterpolator getInterpolator() {
        return this.interpolator;
    }

    @NotNull
    public final float[] getPositions() {
        return this.positions;
    }

    public final int getRepeatCount() {
        return this.repeatCount;
    }

    public final long getRepeatDelay() {
        return this.repeatDelay;
    }

    public final int getRepeatMode() {
        return this.repeatMode;
    }

    @NotNull
    public final Shape getShape() {
        return this.shape;
    }

    public final long getStartDelay() {
        return this.startDelay;
    }

    public final float getTilt() {
        return this.tilt;
    }

    public final float getWidthRatio() {
        return this.widthRatio;
    }

    public final int height(int height) {
        int i11 = this.fixedHeight;
        return i11 > 0 ? i11 : C6915b.c(this.heightRatio * height);
    }

    public final void updateColors() {
        int i11 = WhenMappings.$EnumSwitchMapping$0[this.shape.ordinal()];
        if (i11 == 1) {
            int[] iArr = this.colors;
            int i12 = this.baseColor;
            iArr[0] = i12;
            int i13 = this.highlightColor;
            iArr[1] = i13;
            iArr[2] = i13;
            iArr[3] = i12;
            return;
        }
        if (i11 != 2) {
            if (i11 != 3) {
                throw new o();
            }
            return;
        }
        int[] iArr2 = this.colors;
        int i14 = this.highlightColor;
        iArr2[0] = i14;
        iArr2[1] = i14;
        int i15 = this.baseColor;
        iArr2[2] = i15;
        iArr2[3] = i15;
    }

    public final void updatePositions() {
        int i11 = WhenMappings.$EnumSwitchMapping$0[this.shape.ordinal()];
        if (i11 == 1) {
            this.positions[0] = Math.max(((1.0f - this.intensity) - this.dropoff) / 2.0f, 0.0f);
            this.positions[1] = Math.max(((1.0f - this.intensity) - 0.001f) / 2.0f, 0.0f);
            this.positions[2] = Math.min(((this.intensity + 1.0f) + 0.001f) / 2.0f, 1.0f);
            this.positions[3] = Math.min(((this.intensity + 1.0f) + this.dropoff) / 2.0f, 1.0f);
            return;
        }
        if (i11 != 2) {
            if (i11 != 3) {
                throw new o();
            }
            return;
        }
        float[] fArr = this.positions;
        fArr[0] = 0.0f;
        fArr[1] = Math.min(this.intensity, 1.0f);
        this.positions[2] = Math.min(this.intensity + this.dropoff, 1.0f);
        this.positions[3] = 1.0f;
    }

    public final int width(int width) {
        int i11 = this.fixedWidth;
        return i11 > 0 ? i11 : C6915b.c(this.widthRatio * width);
    }
}
