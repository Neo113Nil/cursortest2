package ru.ozon.uni.ozi.components.icon.presets;

import A0.h;
import Xc.a;
import Xc.b;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import l1.AbstractC7799Q;
import l1.C7807Z;
import l1.J0;
import l1.K0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.ozi.components.icon.presets.squircle.AbsoluteSmoothCornerShapeKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u000ej\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/uni/ozi/components/icon/presets/OziIconShape;", "", "<init>", "(Ljava/lang/String;I)V", "LZ1/h;", "cornerRadius", "Ll1/J0;", "getShape-0680j_4$uni_release", "(F)Ll1/J0;", "getShape", "Ll1/Z;", "color", "Ll1/Q;", "getBorderBrush-8_81llA$uni_release", "(J)Ll1/Q;", "getBorderBrush", "Circle", "Squircle", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OziIconShape {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ OziIconShape[] $VALUES;
    public static final OziIconShape Circle = new OziIconShape("Circle", 0);
    public static final OziIconShape Squircle = new OziIconShape("Squircle", 1);

    private static final /* synthetic */ OziIconShape[] $values() {
        return new OziIconShape[]{Circle, Squircle};
    }

    static {
        OziIconShape[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private OziIconShape(String str, int i11) {
    }

    public static OziIconShape valueOf(String str) {
        return (OziIconShape) Enum.valueOf(OziIconShape.class, str);
    }

    public static OziIconShape[] values() {
        return (OziIconShape[]) $VALUES.clone();
    }

    @NotNull
    /* renamed from: getBorderBrush-8_81llA$uni_release, reason: not valid java name */
    public final AbstractC7799Q m3088getBorderBrush8_81llA$uni_release(long color) {
        return this == Circle ? new K0(color) : AbstractC7799Q.a.d(AbstractC7799Q.Companion, C7714v.b0(C7807Z.m(color), C7807Z.m(color)), 0L, 0L, 14);
    }

    @NotNull
    /* renamed from: getShape-0680j_4$uni_release, reason: not valid java name */
    public final J0 m3089getShape0680j_4$uni_release(float cornerRadius) {
        return this == Circle ? h.e() : AbsoluteSmoothCornerShapeKt.m3095AbsoluteSmoothCornerShapeD5KLDUw(cornerRadius, 100);
    }
}
