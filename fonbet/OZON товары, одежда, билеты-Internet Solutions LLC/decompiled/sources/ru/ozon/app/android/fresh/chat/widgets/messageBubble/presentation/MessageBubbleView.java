package ru.ozon.app.android.fresh.chat.widgets.messageBubble.presentation;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.core.content.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.chat.utils.ViewExtensionsKt;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B'\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/fresh/chat/widgets/messageBubble/presentation/MessageBubbleView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "textAtomView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "bind", "", "state", "Lru/ozon/app/android/fresh/chat/widgets/messageBubble/presentation/MessageBubbleVO;", "Companion", "chat_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MessageBubbleView extends FrameLayout {
    private static final float bottomRightBubbleRadius;
    private static final float defaultBubbleRadius;
    private static final int horizontalPadding;
    private static final int leftMargin;
    private static final int rightMargin;
    private static final int verticalMargin;
    private static final int verticalPadding;

    @NotNull
    private final TextAtomV2View textAtomView;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = TextAtomV2View.$stable;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/fresh/chat/widgets/messageBubble/presentation/MessageBubbleView$Companion;", "", "<init>", "()V", "verticalMargin", "", "leftMargin", "rightMargin", "verticalPadding", "horizontalPadding", "defaultBubbleRadius", "", "bottomRightBubbleRadius", "create", "Lru/ozon/app/android/fresh/chat/widgets/messageBubble/presentation/MessageBubbleView;", "context", "Landroid/content/Context;", "chat_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final MessageBubbleView create(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            MessageBubbleView messageBubbleView = new MessageBubbleView(context, null, 0, 6, null);
            messageBubbleView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            messageBubbleView.setPadding(MessageBubbleView.leftMargin, MessageBubbleView.verticalMargin, MessageBubbleView.rightMargin, MessageBubbleView.verticalMargin);
            return messageBubbleView;
        }

        private Companion() {
        }
    }

    static {
        Paddings paddings = Paddings.PADDING_300;
        verticalMargin = UiExtKt.toPx(paddings.getPx());
        leftMargin = UiExtKt.toPx(Paddings.PADDING_800.getPx());
        Paddings paddings2 = Paddings.PADDING_400;
        rightMargin = UiExtKt.toPx(paddings2.getPx());
        verticalPadding = UiExtKt.toPx(paddings.getPx());
        horizontalPadding = UiExtKt.toPx(paddings2.getPx());
        defaultBubbleRadius = UiExtKt.toPx(CornerRadius.RADIUS_550.getPx());
        bottomRightBubbleRadius = UiExtKt.toPx(CornerRadius.RADIUS_200.getPx());
    }

    /* synthetic */ MessageBubbleView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    public final void bind(@NotNull MessageBubbleVO state) {
        Intrinsics.checkNotNullParameter(state, "state");
        TextHolderKt.bind$default(this.textAtomView, state.getText(), null, 2, null);
        TextAtomV2View textAtomV2View = this.textAtomView;
        int i11 = horizontalPadding;
        int i12 = verticalPadding;
        textAtomV2View.setPadding(i11, i12, i11, i12);
    }

    private MessageBubbleView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388613;
        textAtomV2View.setLayoutParams(layoutParams);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(a.getColor(context, UniColors.BG_FRESH_SECONDARY.getResId()));
        float f7 = defaultBubbleRadius;
        ViewExtensionsKt.setCornerRadius(gradientDrawable, f7, f7, f7, bottomRightBubbleRadius);
        textAtomV2View.setBackground(gradientDrawable);
        addView(textAtomV2View);
        this.textAtomView = textAtomV2View;
    }
}
