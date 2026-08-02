package io.intercom.android.sdk.m5.conversation.ui.components.row;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BubbleMessageRow.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001:\u0001!B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÂ\u0003J1\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0012\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\""}, d2 = {"Lio/intercom/android/sdk/m5/conversation/ui/components/row/MessageStyle;", "", "bubbleStyle", "Lio/intercom/android/sdk/m5/conversation/ui/components/row/MessageStyle$BubbleStyle;", "rowAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "rowPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "defaultContentShape", "Landroidx/compose/ui/graphics/Shape;", "<init>", "(Lio/intercom/android/sdk/m5/conversation/ui/components/row/MessageStyle$BubbleStyle;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/ui/graphics/Shape;)V", "getBubbleStyle", "()Lio/intercom/android/sdk/m5/conversation/ui/components/row/MessageStyle$BubbleStyle;", "getRowAlignment", "()Landroidx/compose/ui/Alignment$Horizontal;", "getRowPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "contentShape", "getContentShape", "()Landroidx/compose/ui/graphics/Shape;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "BubbleStyle", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
final /* data */ class MessageStyle {
    private final BubbleStyle bubbleStyle;
    private final Shape defaultContentShape;
    private final Alignment.Horizontal rowAlignment;
    private final PaddingValues rowPadding;

    /* renamed from: component4, reason: from getter */
    private final Shape getDefaultContentShape() {
        return this.defaultContentShape;
    }

    public static /* synthetic */ MessageStyle copy$default(MessageStyle messageStyle, BubbleStyle bubbleStyle, Alignment.Horizontal horizontal, PaddingValues paddingValues, Shape shape, int i, Object obj) {
        if ((i & 1) != 0) {
            bubbleStyle = messageStyle.bubbleStyle;
        }
        if ((i & 2) != 0) {
            horizontal = messageStyle.rowAlignment;
        }
        if ((i & 4) != 0) {
            paddingValues = messageStyle.rowPadding;
        }
        if ((i & 8) != 0) {
            shape = messageStyle.defaultContentShape;
        }
        return messageStyle.copy(bubbleStyle, horizontal, paddingValues, shape);
    }

    /* renamed from: component1, reason: from getter */
    public final BubbleStyle getBubbleStyle() {
        return this.bubbleStyle;
    }

    /* renamed from: component2, reason: from getter */
    public final Alignment.Horizontal getRowAlignment() {
        return this.rowAlignment;
    }

    /* renamed from: component3, reason: from getter */
    public final PaddingValues getRowPadding() {
        return this.rowPadding;
    }

    public final MessageStyle copy(BubbleStyle bubbleStyle, Alignment.Horizontal rowAlignment, PaddingValues rowPadding, Shape defaultContentShape) {
        Intrinsics.checkNotNullParameter(bubbleStyle, "bubbleStyle");
        Intrinsics.checkNotNullParameter(rowAlignment, "rowAlignment");
        Intrinsics.checkNotNullParameter(rowPadding, "rowPadding");
        Intrinsics.checkNotNullParameter(defaultContentShape, "defaultContentShape");
        return new MessageStyle(bubbleStyle, rowAlignment, rowPadding, defaultContentShape);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageStyle)) {
            return false;
        }
        MessageStyle messageStyle = (MessageStyle) other;
        return Intrinsics.areEqual(this.bubbleStyle, messageStyle.bubbleStyle) && Intrinsics.areEqual(this.rowAlignment, messageStyle.rowAlignment) && Intrinsics.areEqual(this.rowPadding, messageStyle.rowPadding) && Intrinsics.areEqual(this.defaultContentShape, messageStyle.defaultContentShape);
    }

    public int hashCode() {
        return (((((this.bubbleStyle.hashCode() * 31) + this.rowAlignment.hashCode()) * 31) + this.rowPadding.hashCode()) * 31) + this.defaultContentShape.hashCode();
    }

    public String toString() {
        return "MessageStyle(bubbleStyle=" + this.bubbleStyle + ", rowAlignment=" + this.rowAlignment + ", rowPadding=" + this.rowPadding + ", defaultContentShape=" + this.defaultContentShape + ')';
    }

    public MessageStyle(BubbleStyle bubbleStyle, Alignment.Horizontal rowAlignment, PaddingValues rowPadding, Shape defaultContentShape) {
        Intrinsics.checkNotNullParameter(bubbleStyle, "bubbleStyle");
        Intrinsics.checkNotNullParameter(rowAlignment, "rowAlignment");
        Intrinsics.checkNotNullParameter(rowPadding, "rowPadding");
        Intrinsics.checkNotNullParameter(defaultContentShape, "defaultContentShape");
        this.bubbleStyle = bubbleStyle;
        this.rowAlignment = rowAlignment;
        this.rowPadding = rowPadding;
        this.defaultContentShape = defaultContentShape;
    }

    public final BubbleStyle getBubbleStyle() {
        return this.bubbleStyle;
    }

    public final Alignment.Horizontal getRowAlignment() {
        return this.rowAlignment;
    }

    public final PaddingValues getRowPadding() {
        return this.rowPadding;
    }

    /* compiled from: BubbleMessageRow.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0015\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0016\u0010\rJ\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003J:\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÇ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010 \u001a\u00020!H×\u0001J\t\u0010\"\u001a\u00020#H×\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006$"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/ui/components/row/MessageStyle$BubbleStyle;", "", "color", "Landroidx/compose/ui/graphics/Color;", ViewProps.PADDING, "Landroidx/compose/foundation/layout/PaddingValues;", "shape", "Landroidx/compose/ui/graphics/Shape;", "borderStroke", "Landroidx/compose/foundation/BorderStroke;", "<init>", "(JLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/foundation/BorderStroke;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getColor-0d7_KjU", "()J", "J", "getPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "getShape", "()Landroidx/compose/ui/graphics/Shape;", "getBorderStroke", "()Landroidx/compose/foundation/BorderStroke;", "component1", "component1-0d7_KjU", "component2", "component3", "component4", "copy", "copy-Iv8Zu3U", "(JLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/foundation/BorderStroke;)Lio/intercom/android/sdk/m5/conversation/ui/components/row/MessageStyle$BubbleStyle;", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BubbleStyle {
        public static final int $stable = 0;
        private final BorderStroke borderStroke;
        private final long color;
        private final PaddingValues padding;
        private final Shape shape;

        public /* synthetic */ BubbleStyle(long j, PaddingValues paddingValues, Shape shape, BorderStroke borderStroke, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, paddingValues, shape, borderStroke);
        }

        /* renamed from: copy-Iv8Zu3U$default, reason: not valid java name */
        public static /* synthetic */ BubbleStyle m12384copyIv8Zu3U$default(BubbleStyle bubbleStyle, long j, PaddingValues paddingValues, Shape shape, BorderStroke borderStroke, int i, Object obj) {
            if ((i & 1) != 0) {
                j = bubbleStyle.color;
            }
            long j2 = j;
            if ((i & 2) != 0) {
                paddingValues = bubbleStyle.padding;
            }
            PaddingValues paddingValues2 = paddingValues;
            if ((i & 4) != 0) {
                shape = bubbleStyle.shape;
            }
            Shape shape2 = shape;
            if ((i & 8) != 0) {
                borderStroke = bubbleStyle.borderStroke;
            }
            return bubbleStyle.m12386copyIv8Zu3U(j2, paddingValues2, shape2, borderStroke);
        }

        /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
        public final long getColor() {
            return this.color;
        }

        /* renamed from: component2, reason: from getter */
        public final PaddingValues getPadding() {
            return this.padding;
        }

        /* renamed from: component3, reason: from getter */
        public final Shape getShape() {
            return this.shape;
        }

        /* renamed from: component4, reason: from getter */
        public final BorderStroke getBorderStroke() {
            return this.borderStroke;
        }

        /* renamed from: copy-Iv8Zu3U, reason: not valid java name */
        public final BubbleStyle m12386copyIv8Zu3U(long color, PaddingValues padding, Shape shape, BorderStroke borderStroke) {
            Intrinsics.checkNotNullParameter(padding, "padding");
            Intrinsics.checkNotNullParameter(shape, "shape");
            return new BubbleStyle(color, padding, shape, borderStroke, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BubbleStyle)) {
                return false;
            }
            BubbleStyle bubbleStyle = (BubbleStyle) other;
            return Color.m6040equalsimpl0(this.color, bubbleStyle.color) && Intrinsics.areEqual(this.padding, bubbleStyle.padding) && Intrinsics.areEqual(this.shape, bubbleStyle.shape) && Intrinsics.areEqual(this.borderStroke, bubbleStyle.borderStroke);
        }

        public int hashCode() {
            int m6046hashCodeimpl = ((((Color.m6046hashCodeimpl(this.color) * 31) + this.padding.hashCode()) * 31) + this.shape.hashCode()) * 31;
            BorderStroke borderStroke = this.borderStroke;
            return m6046hashCodeimpl + (borderStroke == null ? 0 : borderStroke.hashCode());
        }

        public String toString() {
            return "BubbleStyle(color=" + ((Object) Color.m6047toStringimpl(this.color)) + ", padding=" + this.padding + ", shape=" + this.shape + ", borderStroke=" + this.borderStroke + ')';
        }

        private BubbleStyle(long j, PaddingValues padding, Shape shape, BorderStroke borderStroke) {
            Intrinsics.checkNotNullParameter(padding, "padding");
            Intrinsics.checkNotNullParameter(shape, "shape");
            this.color = j;
            this.padding = padding;
            this.shape = shape;
            this.borderStroke = borderStroke;
        }

        /* renamed from: getColor-0d7_KjU, reason: not valid java name */
        public final long m12387getColor0d7_KjU() {
            return this.color;
        }

        public final PaddingValues getPadding() {
            return this.padding;
        }

        public final Shape getShape() {
            return this.shape;
        }

        public final BorderStroke getBorderStroke() {
            return this.borderStroke;
        }
    }

    public final Shape getContentShape() {
        return RoundedCornerShapeKt.m1522RoundedCornerShape0680j_4(Dp.m8798constructorimpl(8));
    }
}
