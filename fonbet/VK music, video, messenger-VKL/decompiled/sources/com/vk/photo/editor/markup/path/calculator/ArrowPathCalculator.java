package com.vk.photo.editor.markup.path.calculator;

import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.eq90;
import xsna.glb0;
import xsna.zrp;

/* compiled from: ArrowPathCalculator.kt */
/* loaded from: classes4.dex */
public final class ArrowPathCalculator implements eq90 {
    public final float b;
    public final Position c;
    public final Path d;
    public final PathMeasure e;
    public final Matrix f;
    public final float g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ArrowPathCalculator.kt */
    public static final class Position {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Position[] $VALUES;
        public static final Position End;
        public static final Position Start;
        private final int direction;

        static {
            Position position = new Position("End", 0, 1);
            End = position;
            Position position2 = new Position("Start", 1, -1);
            Start = position2;
            Position[] positionArr = {position, position2};
            $VALUES = positionArr;
            $ENTRIES = new asp(positionArr);
        }

        public Position(String str, int i, int i2) {
            this.direction = i2;
        }

        public static Position valueOf(String str) {
            return (Position) Enum.valueOf(Position.class, str);
        }

        public static Position[] values() {
            return (Position[]) $VALUES.clone();
        }

        public final int h() {
            return this.direction;
        }
    }

    /* compiled from: ArrowPathCalculator.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Position.values().length];
            try {
                iArr[Position.End.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Position.Start.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ArrowPathCalculator(float f) {
        Position position = Position.End;
        this.b = f;
        this.c = position;
        this.d = new Path();
        this.e = new PathMeasure();
        this.f = new Matrix();
        this.g = 0.7853982f;
    }

    @Override // xsna.eq90
    public final void e(List<glb0> list, Path path, boolean z, boolean z2) {
        float length;
        if (list.size() > 2) {
            Position position = this.c;
            if ((z && position == Position.End) || position == Position.Start) {
                Path path2 = this.d;
                path2.rewind();
                PathMeasure pathMeasure = this.e;
                pathMeasure.setPath(path, false);
                float f = this.g;
                double d = 3.1415927f - f;
                float cos = (float) Math.cos(d);
                float f2 = this.b;
                float h = cos * f2 * position.h();
                float sin = ((float) Math.sin(d)) * f2 * position.h();
                double d2 = f + 3.1415927f;
                float cos2 = ((float) Math.cos(d2)) * f2 * position.h();
                float sin2 = f2 * ((float) Math.sin(d2)) * position.h();
                path2.moveTo(h, sin);
                float f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                path2.lineTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                path2.lineTo(cos2, sin2);
                int[] iArr = a.$EnumSwitchMapping$0;
                int i = iArr[position.ordinal()];
                if (i == 1) {
                    length = pathMeasure.getLength() - ((int) Math.floor(10 * Resources.getSystem().getDisplayMetrics().density));
                    if (length < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        length = 0.0f;
                    }
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    length = (int) Math.floor(10 * Resources.getSystem().getDisplayMetrics().density);
                    float length2 = pathMeasure.getLength();
                    if (length > length2) {
                        length = length2;
                    }
                }
                Matrix matrix = this.f;
                pathMeasure.getMatrix(length, matrix, 2);
                path2.transform(matrix);
                int i2 = iArr[position.ordinal()];
                if (i2 == 1) {
                    f3 = pathMeasure.getLength();
                } else if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                pathMeasure.getMatrix(f3, matrix, 1);
                path2.transform(matrix);
                if (z2) {
                    path.set(path2);
                } else {
                    path.addPath(path2);
                }
            }
        }
    }
}
