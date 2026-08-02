package io.intercom.android.sdk.ui.component;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.OutlinedTextFieldKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.react.uimanager.ViewProps;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IntercomCard.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0015B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003JK\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0010\u0010\u0011JA\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lio/intercom/android/sdk/ui/component/IntercomCardStyle;", "", "<init>", "()V", "defaultStyle", "Lio/intercom/android/sdk/ui/component/IntercomCardStyle$Style;", "shape", "Landroidx/compose/ui/graphics/Shape;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "elevation", "Landroidx/compose/ui/unit/Dp;", OutlinedTextFieldKt.BorderId, "Landroidx/compose/foundation/BorderStroke;", ViewProps.SHADOW_COLOR, "defaultStyle-qUnfpCA", "(Landroidx/compose/ui/graphics/Shape;JJFLandroidx/compose/foundation/BorderStroke;JLandroidx/compose/runtime/Composer;II)Lio/intercom/android/sdk/ui/component/IntercomCardStyle$Style;", "conversationCardStyle", "conversationCardStyle-PEIptTM", "(Landroidx/compose/ui/graphics/Shape;JJFLandroidx/compose/foundation/BorderStroke;Landroidx/compose/runtime/Composer;II)Lio/intercom/android/sdk/ui/component/IntercomCardStyle$Style;", "Style", "intercom-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class IntercomCardStyle {
    public static final int $stable = 0;
    public static final IntercomCardStyle INSTANCE = new IntercomCardStyle();

    private IntercomCardStyle() {
    }

    /* compiled from: IntercomCard.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001c\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0011J\u0010\u0010\u001e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0011J\u0010\u0010 \u001a\u00020\bHÆ\u0003¢\u0006\u0004\b!\u0010\u0015J\t\u0010\"\u001a\u00020\nHÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\b$JN\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÇ\u0001¢\u0006\u0004\b&\u0010'J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010+\u001a\u00020,H×\u0001J\t\u0010-\u001a\u00020.H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\u0007\u001a\u00020\b¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006/"}, d2 = {"Lio/intercom/android/sdk/ui/component/IntercomCardStyle$Style;", "", "shape", "Landroidx/compose/ui/graphics/Shape;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "elevation", "Landroidx/compose/ui/unit/Dp;", OutlinedTextFieldKt.BorderId, "Landroidx/compose/foundation/BorderStroke;", ViewProps.SHADOW_COLOR, "<init>", "(Landroidx/compose/ui/graphics/Shape;JJFLandroidx/compose/foundation/BorderStroke;Landroidx/compose/ui/graphics/Color;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getShape", "()Landroidx/compose/ui/graphics/Shape;", "getBackgroundColor-0d7_KjU", "()J", "J", "getContentColor-0d7_KjU", "getElevation-D9Ej5fM", "()F", "F", "getBorder", "()Landroidx/compose/foundation/BorderStroke;", "getShadowColor-QN2ZGVo", "()Landroidx/compose/ui/graphics/Color;", "component1", "component2", "component2-0d7_KjU", "component3", "component3-0d7_KjU", "component4", "component4-D9Ej5fM", "component5", "component6", "component6-QN2ZGVo", "copy", "copy-UBuVVS8", "(Landroidx/compose/ui/graphics/Shape;JJFLandroidx/compose/foundation/BorderStroke;Landroidx/compose/ui/graphics/Color;)Lio/intercom/android/sdk/ui/component/IntercomCardStyle$Style;", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Style {
        public static final int $stable = 0;
        private final long backgroundColor;
        private final BorderStroke border;
        private final long contentColor;
        private final float elevation;
        private final Color shadowColor;
        private final Shape shape;

        public /* synthetic */ Style(Shape shape, long j, long j2, float f, BorderStroke borderStroke, Color color, DefaultConstructorMarker defaultConstructorMarker) {
            this(shape, j, j2, f, borderStroke, color);
        }

        /* renamed from: copy-UBuVVS8$default, reason: not valid java name */
        public static /* synthetic */ Style m12919copyUBuVVS8$default(Style style, Shape shape, long j, long j2, float f, BorderStroke borderStroke, Color color, int i, Object obj) {
            if ((i & 1) != 0) {
                shape = style.shape;
            }
            if ((i & 2) != 0) {
                j = style.backgroundColor;
            }
            if ((i & 4) != 0) {
                j2 = style.contentColor;
            }
            if ((i & 8) != 0) {
                f = style.elevation;
            }
            if ((i & 16) != 0) {
                borderStroke = style.border;
            }
            if ((i & 32) != 0) {
                color = style.shadowColor;
            }
            Color color2 = color;
            float f2 = f;
            long j3 = j2;
            return style.m12924copyUBuVVS8(shape, j, j3, f2, borderStroke, color2);
        }

        /* renamed from: component1, reason: from getter */
        public final Shape getShape() {
            return this.shape;
        }

        /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
        public final long getBackgroundColor() {
            return this.backgroundColor;
        }

        /* renamed from: component3-0d7_KjU, reason: not valid java name and from getter */
        public final long getContentColor() {
            return this.contentColor;
        }

        /* renamed from: component4-D9Ej5fM, reason: not valid java name and from getter */
        public final float getElevation() {
            return this.elevation;
        }

        /* renamed from: component5, reason: from getter */
        public final BorderStroke getBorder() {
            return this.border;
        }

        /* renamed from: component6-QN2ZGVo, reason: not valid java name and from getter */
        public final Color getShadowColor() {
            return this.shadowColor;
        }

        /* renamed from: copy-UBuVVS8, reason: not valid java name */
        public final Style m12924copyUBuVVS8(Shape shape, long backgroundColor, long contentColor, float elevation, BorderStroke border, Color shadowColor) {
            Intrinsics.checkNotNullParameter(shape, "shape");
            Intrinsics.checkNotNullParameter(border, "border");
            return new Style(shape, backgroundColor, contentColor, elevation, border, shadowColor, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Style)) {
                return false;
            }
            Style style = (Style) other;
            return Intrinsics.areEqual(this.shape, style.shape) && Color.m6040equalsimpl0(this.backgroundColor, style.backgroundColor) && Color.m6040equalsimpl0(this.contentColor, style.contentColor) && Dp.m8803equalsimpl0(this.elevation, style.elevation) && Intrinsics.areEqual(this.border, style.border) && Intrinsics.areEqual(this.shadowColor, style.shadowColor);
        }

        public int hashCode() {
            int hashCode = ((((((((this.shape.hashCode() * 31) + Color.m6046hashCodeimpl(this.backgroundColor)) * 31) + Color.m6046hashCodeimpl(this.contentColor)) * 31) + Dp.m8804hashCodeimpl(this.elevation)) * 31) + this.border.hashCode()) * 31;
            Color color = this.shadowColor;
            return hashCode + (color == null ? 0 : Color.m6046hashCodeimpl(color.m6049unboximpl()));
        }

        public String toString() {
            return "Style(shape=" + this.shape + ", backgroundColor=" + ((Object) Color.m6047toStringimpl(this.backgroundColor)) + ", contentColor=" + ((Object) Color.m6047toStringimpl(this.contentColor)) + ", elevation=" + ((Object) Dp.m8809toStringimpl(this.elevation)) + ", border=" + this.border + ", shadowColor=" + this.shadowColor + ')';
        }

        private Style(Shape shape, long j, long j2, float f, BorderStroke border, Color color) {
            Intrinsics.checkNotNullParameter(shape, "shape");
            Intrinsics.checkNotNullParameter(border, "border");
            this.shape = shape;
            this.backgroundColor = j;
            this.contentColor = j2;
            this.elevation = f;
            this.border = border;
            this.shadowColor = color;
        }

        public final Shape getShape() {
            return this.shape;
        }

        /* renamed from: getBackgroundColor-0d7_KjU, reason: not valid java name */
        public final long m12925getBackgroundColor0d7_KjU() {
            return this.backgroundColor;
        }

        /* renamed from: getContentColor-0d7_KjU, reason: not valid java name */
        public final long m12926getContentColor0d7_KjU() {
            return this.contentColor;
        }

        /* renamed from: getElevation-D9Ej5fM, reason: not valid java name */
        public final float m12927getElevationD9Ej5fM() {
            return this.elevation;
        }

        public final BorderStroke getBorder() {
            return this.border;
        }

        /* renamed from: getShadowColor-QN2ZGVo, reason: not valid java name */
        public final Color m12928getShadowColorQN2ZGVo() {
            return this.shadowColor;
        }
    }

    /* renamed from: defaultStyle-qUnfpCA, reason: not valid java name */
    public final Style m12918defaultStyleqUnfpCA(Shape shape, long j, long j2, float f, BorderStroke borderStroke, long j3, Composer composer, int i, int i2) {
        composer.startReplaceGroup(-952876659);
        Style style = new Style((i2 & 1) != 0 ? IntercomTheme.INSTANCE.getShapes(composer, 6).getMedium() : shape, (i2 & 2) != 0 ? IntercomTheme.INSTANCE.getColors(composer, 6).m13094getBackground0d7_KjU() : j, (i2 & 4) != 0 ? IntercomTheme.INSTANCE.getColors(composer, 6).m13116getPrimaryText0d7_KjU() : j2, (i2 & 8) != 0 ? Dp.m8798constructorimpl(6) : f, (i2 & 16) != 0 ? BorderStrokeKt.m612BorderStrokecXLIe8U(Dp.m8798constructorimpl(1), Color.m6038copywmQWz5c$default(IntercomTheme.INSTANCE.getColors(composer, 6).m13096getBorder0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null)) : borderStroke, Color.m6029boximpl((i2 & 32) != 0 ? IntercomTheme.INSTANCE.getColors(composer, 6).m13119getShadow0d7_KjU() : j3), null);
        composer.endReplaceGroup();
        return style;
    }

    /* renamed from: conversationCardStyle-PEIptTM, reason: not valid java name */
    public final Style m12917conversationCardStylePEIptTM(Shape shape, long j, long j2, float f, BorderStroke borderStroke, Composer composer, int i, int i2) {
        composer.startReplaceGroup(-1707188824);
        if ((i2 & 1) != 0) {
            shape = RoundedCornerShapeKt.m1522RoundedCornerShape0680j_4(Dp.m8798constructorimpl(20));
        }
        Shape shape2 = shape;
        if ((i2 & 2) != 0) {
            j = IntercomTheme.INSTANCE.getColors(composer, 6).m13094getBackground0d7_KjU();
        }
        Style style = new Style(shape2, j, (i2 & 4) != 0 ? IntercomTheme.INSTANCE.getColors(composer, 6).m13116getPrimaryText0d7_KjU() : j2, (i2 & 8) != 0 ? Dp.m8798constructorimpl(0) : f, (i2 & 16) != 0 ? BorderStrokeKt.m612BorderStrokecXLIe8U(Dp.m8798constructorimpl(1), IntercomTheme.INSTANCE.getColors(composer, 6).m13096getBorder0d7_KjU()) : borderStroke, null, null);
        composer.endReplaceGroup();
        return style;
    }
}
