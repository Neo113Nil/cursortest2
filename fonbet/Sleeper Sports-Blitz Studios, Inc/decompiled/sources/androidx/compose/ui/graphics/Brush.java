package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import com.braze.models.BrazeGeofence;
import com.rnlineargradient.LinearGradientManager;
import io.sentry.rrweb.RRWebVideoEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: Brush.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH&¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\u0013\u0014¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/graphics/Brush;", "", "<init>", "()V", "intrinsicSize", "Landroidx/compose/ui/geometry/Size;", "getIntrinsicSize-NH-jbRc", "()J", "J", "applyTo", "", RRWebVideoEvent.JsonKeys.SIZE, "p", "Landroidx/compose/ui/graphics/Paint;", "alpha", "", "applyTo-Pq9zytI", "(JLandroidx/compose/ui/graphics/Paint;F)V", "Companion", "Landroidx/compose/ui/graphics/ShaderBrush;", "Landroidx/compose/ui/graphics/SolidColor;", "ui-graphics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class Brush {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final long intrinsicSize;

    public /* synthetic */ Brush(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: applyTo-Pq9zytI, reason: not valid java name */
    public abstract void mo5985applyToPq9zytI(long size, Paint p, float alpha);

    private Brush() {
        this.intrinsicSize = Size.INSTANCE.m5848getUnspecifiedNHjbRc();
    }

    /* renamed from: getIntrinsicSize-NH-jbRc, reason: not valid java name and from getter */
    public long getIntrinsicSize() {
        return this.intrinsicSize;
    }

    /* compiled from: Brush.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JY\u0010\u0004\u001a\u00020\u00052*\u0010\u0006\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b0\u0007\"\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J;\u0010\u0004\u001a\u00020\u00052\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u00132\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0014J;\u0010\u0015\u001a\u00020\u00052\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u00132\b\b\u0002\u0010\u0016\u001a\u00020\t2\b\b\u0002\u0010\u0017\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0018\u0010\u0019JY\u0010\u0015\u001a\u00020\u00052*\u0010\u0006\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b0\u0007\"\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\b\b\u0002\u0010\u0016\u001a\u00020\t2\b\b\u0002\u0010\u0017\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0018\u0010\u001aJ;\u0010\u001b\u001a\u00020\u00052\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u00132\b\b\u0002\u0010\u001c\u001a\u00020\t2\b\b\u0002\u0010\u001d\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u001e\u0010\u0019JY\u0010\u001b\u001a\u00020\u00052*\u0010\u0006\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b0\u0007\"\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\b\b\u0002\u0010\u001c\u001a\u00020\t2\b\b\u0002\u0010\u001d\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u001e\u0010\u001aJY\u0010\u001f\u001a\u00020\u00052*\u0010\u0006\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b0\u0007\"\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\b\b\u0002\u0010 \u001a\u00020\f2\b\b\u0002\u0010!\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\"\u0010#J;\u0010\u001f\u001a\u00020\u00052\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u00132\b\b\u0002\u0010 \u001a\u00020\f2\b\b\u0002\u0010!\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\"\u0010$JE\u0010%\u001a\u00020\u00052*\u0010\u0006\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b0\u0007\"\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\b\b\u0002\u0010 \u001a\u00020\fH\u0007¢\u0006\u0004\b&\u0010'J'\u0010%\u001a\u00020\u00052\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u00132\b\b\u0002\u0010 \u001a\u00020\fH\u0007¢\u0006\u0004\b&\u0010(J'\u0010)\u001a\u00020\u00052\u0006\u0010*\u001a\u00020\u00052\u0006\u0010+\u001a\u00020\u00052\u0006\u0010,\u001a\u00020-H\u0007¢\u0006\u0004\b.\u0010/¨\u00060"}, d2 = {"Landroidx/compose/ui/graphics/Brush$Companion;", "", "<init>", "()V", "linearGradient", "Landroidx/compose/ui/graphics/Brush;", "colorStops", "", "Lkotlin/Pair;", "", "Landroidx/compose/ui/graphics/Color;", "start", "Landroidx/compose/ui/geometry/Offset;", "end", "tileMode", "Landroidx/compose/ui/graphics/TileMode;", "linearGradient-mHitzGk", "([Lkotlin/Pair;JJI)Landroidx/compose/ui/graphics/Brush;", LinearGradientManager.PROP_COLORS, "", "(Ljava/util/List;JJI)Landroidx/compose/ui/graphics/Brush;", "horizontalGradient", "startX", "endX", "horizontalGradient-8A-3gB4", "(Ljava/util/List;FFI)Landroidx/compose/ui/graphics/Brush;", "([Lkotlin/Pair;FFI)Landroidx/compose/ui/graphics/Brush;", "verticalGradient", "startY", "endY", "verticalGradient-8A-3gB4", "radialGradient", "center", BrazeGeofence.RADIUS_METERS, "radialGradient-P_Vx-Ks", "([Lkotlin/Pair;JFI)Landroidx/compose/ui/graphics/Brush;", "(Ljava/util/List;JFI)Landroidx/compose/ui/graphics/Brush;", "sweepGradient", "sweepGradient-Uv8p0NA", "([Lkotlin/Pair;J)Landroidx/compose/ui/graphics/Brush;", "(Ljava/util/List;J)Landroidx/compose/ui/graphics/Brush;", "composite", "dstBrush", "srcBrush", "blendMode", "Landroidx/compose/ui/graphics/BlendMode;", "composite-7EN7VTw", "(Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Brush;I)Landroidx/compose/ui/graphics/Brush;", "ui-graphics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* renamed from: linearGradient-mHitzGk$default, reason: not valid java name */
        public static /* synthetic */ Brush m5990linearGradientmHitzGk$default(Companion companion, Pair[] pairArr, long j, long j2, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                j = Offset.INSTANCE.m5787getZeroF1C5BW0();
            }
            long j3 = j;
            if ((i2 & 4) != 0) {
                j2 = Offset.INSTANCE.m5785getInfiniteF1C5BW0();
            }
            long j4 = j2;
            if ((i2 & 8) != 0) {
                i = TileMode.INSTANCE.m6429getClamp3opZhB0();
            }
            return companion.m6001linearGradientmHitzGk((Pair<Float, Color>[]) pairArr, j3, j4, i);
        }

        /* renamed from: linearGradient-mHitzGk, reason: not valid java name */
        public final Brush m6001linearGradientmHitzGk(Pair<Float, Color>[] colorStops, long start, long end, int tileMode) {
            ArrayList arrayList = new ArrayList(colorStops.length);
            for (Pair<Float, Color> pair : colorStops) {
                arrayList.add(Color.m6029boximpl(pair.getSecond().m6049unboximpl()));
            }
            ArrayList arrayList2 = arrayList;
            ArrayList arrayList3 = new ArrayList(colorStops.length);
            for (Pair<Float, Color> pair2 : colorStops) {
                arrayList3.add(Float.valueOf(pair2.getFirst().floatValue()));
            }
            return new LinearGradient(arrayList2, arrayList3, start, end, tileMode, null);
        }

        /* renamed from: linearGradient-mHitzGk$default, reason: not valid java name */
        public static /* synthetic */ Brush m5989linearGradientmHitzGk$default(Companion companion, List list, long j, long j2, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                j = Offset.INSTANCE.m5787getZeroF1C5BW0();
            }
            long j3 = j;
            if ((i2 & 4) != 0) {
                j2 = Offset.INSTANCE.m5785getInfiniteF1C5BW0();
            }
            long j4 = j2;
            if ((i2 & 8) != 0) {
                i = TileMode.INSTANCE.m6429getClamp3opZhB0();
            }
            return companion.m6000linearGradientmHitzGk((List<Color>) list, j3, j4, i);
        }

        /* renamed from: linearGradient-mHitzGk, reason: not valid java name */
        public final Brush m6000linearGradientmHitzGk(List<Color> colors, long start, long end, int tileMode) {
            return new LinearGradient(colors, null, start, end, tileMode, null);
        }

        /* renamed from: horizontalGradient-8A-3gB4$default, reason: not valid java name */
        public static /* synthetic */ Brush m5987horizontalGradient8A3gB4$default(Companion companion, List list, float f, float f2, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                f = 0.0f;
            }
            if ((i2 & 4) != 0) {
                f2 = Float.POSITIVE_INFINITY;
            }
            if ((i2 & 8) != 0) {
                i = TileMode.INSTANCE.m6429getClamp3opZhB0();
            }
            return companion.m5998horizontalGradient8A3gB4((List<Color>) list, f, f2, i);
        }

        /* renamed from: horizontalGradient-8A-3gB4$default, reason: not valid java name */
        public static /* synthetic */ Brush m5988horizontalGradient8A3gB4$default(Companion companion, Pair[] pairArr, float f, float f2, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                f = 0.0f;
            }
            if ((i2 & 4) != 0) {
                f2 = Float.POSITIVE_INFINITY;
            }
            if ((i2 & 8) != 0) {
                i = TileMode.INSTANCE.m6429getClamp3opZhB0();
            }
            return companion.m5999horizontalGradient8A3gB4((Pair<Float, Color>[]) pairArr, f, f2, i);
        }

        /* renamed from: horizontalGradient-8A-3gB4, reason: not valid java name */
        public final Brush m5999horizontalGradient8A3gB4(Pair<Float, Color>[] colorStops, float startX, float endX, int tileMode) {
            return m6001linearGradientmHitzGk((Pair<Float, Color>[]) Arrays.copyOf(colorStops, colorStops.length), Offset.m5763constructorimpl((Float.floatToRawIntBits(startX) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L)), Offset.m5763constructorimpl((Float.floatToRawIntBits(endX) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L)), tileMode);
        }

        /* renamed from: verticalGradient-8A-3gB4$default, reason: not valid java name */
        public static /* synthetic */ Brush m5995verticalGradient8A3gB4$default(Companion companion, List list, float f, float f2, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                f = 0.0f;
            }
            if ((i2 & 4) != 0) {
                f2 = Float.POSITIVE_INFINITY;
            }
            if ((i2 & 8) != 0) {
                i = TileMode.INSTANCE.m6429getClamp3opZhB0();
            }
            return companion.m6006verticalGradient8A3gB4((List<Color>) list, f, f2, i);
        }

        /* renamed from: verticalGradient-8A-3gB4$default, reason: not valid java name */
        public static /* synthetic */ Brush m5996verticalGradient8A3gB4$default(Companion companion, Pair[] pairArr, float f, float f2, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                f = 0.0f;
            }
            if ((i2 & 4) != 0) {
                f2 = Float.POSITIVE_INFINITY;
            }
            if ((i2 & 8) != 0) {
                i = TileMode.INSTANCE.m6429getClamp3opZhB0();
            }
            return companion.m6007verticalGradient8A3gB4((Pair<Float, Color>[]) pairArr, f, f2, i);
        }

        /* renamed from: verticalGradient-8A-3gB4, reason: not valid java name */
        public final Brush m6007verticalGradient8A3gB4(Pair<Float, Color>[] colorStops, float startY, float endY, int tileMode) {
            return m6001linearGradientmHitzGk((Pair<Float, Color>[]) Arrays.copyOf(colorStops, colorStops.length), Offset.m5763constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(startY) & 4294967295L)), Offset.m5763constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(endY) & 4294967295L)), tileMode);
        }

        /* renamed from: radialGradient-P_Vx-Ks$default, reason: not valid java name */
        public static /* synthetic */ Brush m5992radialGradientP_VxKs$default(Companion companion, Pair[] pairArr, long j, float f, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                j = Offset.INSTANCE.m5786getUnspecifiedF1C5BW0();
            }
            long j2 = j;
            if ((i2 & 4) != 0) {
                f = Float.POSITIVE_INFINITY;
            }
            float f2 = f;
            if ((i2 & 8) != 0) {
                i = TileMode.INSTANCE.m6429getClamp3opZhB0();
            }
            return companion.m6003radialGradientP_VxKs((Pair<Float, Color>[]) pairArr, j2, f2, i);
        }

        /* renamed from: radialGradient-P_Vx-Ks, reason: not valid java name */
        public final Brush m6003radialGradientP_VxKs(Pair<Float, Color>[] colorStops, long center, float radius, int tileMode) {
            ArrayList arrayList = new ArrayList(colorStops.length);
            for (Pair<Float, Color> pair : colorStops) {
                arrayList.add(Color.m6029boximpl(pair.getSecond().m6049unboximpl()));
            }
            ArrayList arrayList2 = arrayList;
            ArrayList arrayList3 = new ArrayList(colorStops.length);
            for (Pair<Float, Color> pair2 : colorStops) {
                arrayList3.add(Float.valueOf(pair2.getFirst().floatValue()));
            }
            return new RadialGradient(arrayList2, arrayList3, center, radius, tileMode, null);
        }

        /* renamed from: radialGradient-P_Vx-Ks$default, reason: not valid java name */
        public static /* synthetic */ Brush m5991radialGradientP_VxKs$default(Companion companion, List list, long j, float f, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                j = Offset.INSTANCE.m5786getUnspecifiedF1C5BW0();
            }
            long j2 = j;
            if ((i2 & 4) != 0) {
                f = Float.POSITIVE_INFINITY;
            }
            float f2 = f;
            if ((i2 & 8) != 0) {
                i = TileMode.INSTANCE.m6429getClamp3opZhB0();
            }
            return companion.m6002radialGradientP_VxKs((List<Color>) list, j2, f2, i);
        }

        /* renamed from: radialGradient-P_Vx-Ks, reason: not valid java name */
        public final Brush m6002radialGradientP_VxKs(List<Color> colors, long center, float radius, int tileMode) {
            return new RadialGradient(colors, null, center, radius, tileMode, null);
        }

        /* renamed from: sweepGradient-Uv8p0NA$default, reason: not valid java name */
        public static /* synthetic */ Brush m5994sweepGradientUv8p0NA$default(Companion companion, Pair[] pairArr, long j, int i, Object obj) {
            if ((i & 2) != 0) {
                j = Offset.INSTANCE.m5786getUnspecifiedF1C5BW0();
            }
            return companion.m6005sweepGradientUv8p0NA((Pair<Float, Color>[]) pairArr, j);
        }

        /* renamed from: sweepGradient-Uv8p0NA, reason: not valid java name */
        public final Brush m6005sweepGradientUv8p0NA(Pair<Float, Color>[] colorStops, long center) {
            ArrayList arrayList = new ArrayList(colorStops.length);
            for (Pair<Float, Color> pair : colorStops) {
                arrayList.add(Color.m6029boximpl(pair.getSecond().m6049unboximpl()));
            }
            ArrayList arrayList2 = arrayList;
            ArrayList arrayList3 = new ArrayList(colorStops.length);
            for (Pair<Float, Color> pair2 : colorStops) {
                arrayList3.add(Float.valueOf(pair2.getFirst().floatValue()));
            }
            return new SweepGradient(center, arrayList2, arrayList3, null);
        }

        /* renamed from: sweepGradient-Uv8p0NA$default, reason: not valid java name */
        public static /* synthetic */ Brush m5993sweepGradientUv8p0NA$default(Companion companion, List list, long j, int i, Object obj) {
            if ((i & 2) != 0) {
                j = Offset.INSTANCE.m5786getUnspecifiedF1C5BW0();
            }
            return companion.m6004sweepGradientUv8p0NA((List<Color>) list, j);
        }

        /* renamed from: sweepGradient-Uv8p0NA, reason: not valid java name */
        public final Brush m6004sweepGradientUv8p0NA(List<Color> colors, long center) {
            return new SweepGradient(center, colors, null, null);
        }

        /* renamed from: composite-7EN7VTw, reason: not valid java name */
        public final Brush m5997composite7EN7VTw(Brush dstBrush, Brush srcBrush, int blendMode) {
            return new CompositeShaderBrush(BrushKt.toShaderBrush(dstBrush), BrushKt.toShaderBrush(srcBrush), blendMode, null);
        }

        /* renamed from: horizontalGradient-8A-3gB4, reason: not valid java name */
        public final Brush m5998horizontalGradient8A3gB4(List<Color> colors, float startX, float endX, int tileMode) {
            return m6000linearGradientmHitzGk(colors, Offset.m5763constructorimpl((Float.floatToRawIntBits(startX) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L)), Offset.m5763constructorimpl((Float.floatToRawIntBits(endX) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L)), tileMode);
        }

        /* renamed from: verticalGradient-8A-3gB4, reason: not valid java name */
        public final Brush m6006verticalGradient8A3gB4(List<Color> colors, float startY, float endY, int tileMode) {
            return m6000linearGradientmHitzGk(colors, Offset.m5763constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(startY) & 4294967295L)), Offset.m5763constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(endY) & 4294967295L)), tileMode);
        }
    }
}
