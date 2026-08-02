package ru.ozon.uni.core.compose.graphics;

import P9.a;
import Sc.o;
import android.graphics.Shader;
import java.util.List;
import k1.C7459e;
import k1.C7464j;
import k1.C7465k;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l1.C7791I;
import l1.C7807Z;
import l1.F0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.core.models.UniGradientDirection;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B9\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0011\u001a\u00020\u0005*\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u001c\u001a\u00060\u0018j\u0002`\u00192\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001dR\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001dR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001eR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/uni/core/compose/graphics/DirectionalLinearGradient;", "Ll1/F0;", "", "Ll1/Z;", "colors", "", "stops", "Ll1/L0;", "tileMode", "Lru/ozon/uni/core/models/UniGradientDirection;", "direction", "<init>", "(Ljava/util/List;Ljava/util/List;ILru/ozon/uni/core/models/UniGradientDirection;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lk1/j;", "size", "toAngleInRadians-d16Qtg0", "(Lru/ozon/uni/core/models/UniGradientDirection;J)F", "toAngleInRadians", "angleInRadians", "Lkotlin/Pair;", "Lk1/e;", "getGradientCoordinates-d16Qtg0", "(FJ)Lkotlin/Pair;", "getGradientCoordinates", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "createShader-uvyYCjk", "(J)Landroid/graphics/Shader;", "createShader", "Ljava/util/List;", "I", "Lru/ozon/uni/core/models/UniGradientDirection;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class DirectionalLinearGradient extends F0 {

    @NotNull
    private final List<C7807Z> colors;

    @NotNull
    private final UniGradientDirection direction;
    private final List<Float> stops;
    private final int tileMode;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UniGradientDirection.values().length];
            try {
                iArr[UniGradientDirection.LeftRight.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UniGradientDirection.BottomLeftTopRight.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UniGradientDirection.BottomTop.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[UniGradientDirection.BottomRightTopLeft.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[UniGradientDirection.RightLeft.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[UniGradientDirection.TopRightBottomLeft.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[UniGradientDirection.TopBottom.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[UniGradientDirection.TopLeftBottomRight.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ DirectionalLinearGradient(List list, List list2, int i11, UniGradientDirection uniGradientDirection, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, i11, uniGradientDirection);
    }

    /* renamed from: getGradientCoordinates-d16Qtg0, reason: not valid java name */
    private final Pair<C7459e, C7459e> m1955getGradientCoordinatesd16Qtg0(float angleInRadians, long size) {
        double d11 = angleInRadians;
        double d12 = 1.5707963267948966d - d11;
        float abs = (float) ((Math.abs(Math.cos(d12) * C7464j.d(size)) + Math.abs(Math.sin(d12) * C7464j.f(size))) / 2);
        float cos = ((float) Math.cos(d11)) * abs;
        float sin = abs * ((float) Math.sin(d11));
        return new Pair<>(C7459e.a(C7459e.k(C7465k.b(size), a.a(-cos, sin))), C7459e.a(C7459e.k(C7465k.b(size), a.a(cos, -sin))));
    }

    /* renamed from: toAngleInRadians-d16Qtg0, reason: not valid java name */
    private final float m1956toAngleInRadiansd16Qtg0(UniGradientDirection uniGradientDirection, long j11) {
        Number number;
        switch (WhenMappings.$EnumSwitchMapping$0[uniGradientDirection.ordinal()]) {
            case 1:
                number = 0;
                break;
            case 2:
                number = Float.valueOf((float) Math.atan(C7464j.f(j11) / C7464j.d(j11)));
                break;
            case 3:
                number = Double.valueOf(1.5707963267948966d);
                break;
            case 4:
                number = Double.valueOf(3.141592653589793d - ((float) Math.atan(C7464j.f(j11) / C7464j.d(j11))));
                break;
            case 5:
                number = Double.valueOf(3.141592653589793d);
                break;
            case 6:
                number = Double.valueOf(((float) Math.atan(C7464j.f(j11) / C7464j.d(j11))) + 3.141592653589793d);
                break;
            case 7:
                number = Double.valueOf(4.71238898038469d);
                break;
            case 8:
                number = Double.valueOf(6.283185307179586d - ((float) Math.atan(C7464j.f(j11) / C7464j.d(j11))));
                break;
            default:
                throw new o();
        }
        return number.floatValue();
    }

    @Override // l1.F0
    @NotNull
    /* renamed from: createShader-uvyYCjk */
    public Shader mo70createShaderuvyYCjk(long size) {
        Pair<C7459e, C7459e> m1955getGradientCoordinatesd16Qtg0 = m1955getGradientCoordinatesd16Qtg0(m1956toAngleInRadiansd16Qtg0(this.direction, size), size);
        return C7791I.a(m1955getGradientCoordinatesd16Qtg0.a().n(), m1955getGradientCoordinatesd16Qtg0.b().n(), this.colors, this.stops, this.tileMode);
    }

    private DirectionalLinearGradient(List<C7807Z> colors, List<Float> list, int i11, UniGradientDirection direction) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        Intrinsics.checkNotNullParameter(direction, "direction");
        this.colors = colors;
        this.stops = list;
        this.tileMode = i11;
        this.direction = direction;
    }
}
