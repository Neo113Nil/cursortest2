package ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.presentation.adapter.viewHolders;

import Sc.InterfaceC4008j;
import Sc.k;
import Ve.Lq;
import WZ.t;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.domain.NotificationCarouselV2VO;
import ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.domain.NotificationCarouselV2VO.NotificationCarouselItemVO;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u0000 \u001c*\n\b\u0000\u0010\u0002 \u0000*\u00020\u00012\u00020\u0003:\u0001\u001cBK\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\"\u0010\u000b\u001a\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\f\u0012\n\u0018\u00010\bj\u0004\u0018\u0001`\t\u0012\u0004\u0012\u00020\n0\u0006\u0012\u0016\u0010\r\u001a\u0012\u0012\b\u0012\u00060\bj\u0002`\t\u0012\u0004\u0012\u00020\n0\f¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00028\u0000H\u0017¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R0\u0010\u000b\u001a\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\f\u0012\n\u0018\u00010\bj\u0004\u0018\u0001`\t\u0012\u0004\u0012\u00020\n0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016R$\u0010\r\u001a\u0012\u0012\b\u0012\u00060\bj\u0002`\t\u0012\u0004\u0012\u00020\n0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0017R\u0018\u0010\u0012\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/presentation/adapter/viewHolders/NotificationCarouselV2BaseItemViewHolder;", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2VO$NotificationCarouselItemVO;", "T", "Landroidx/recyclerview/widget/RecyclerView$C;", "Landroid/view/View;", "contentView", "Lkotlin/Function2;", "Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "", "clickEventsHandler", "Lkotlin/Function1;", "viewEventsHandler", "<init>", "(Landroid/view/View;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V", "onViewed", "()V", "item", "bind", "(Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2VO$NotificationCarouselItemVO;)V", "Landroid/view/View;", "Lkotlin/jvm/functions/Function2;", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2VO$NotificationCarouselItemVO;", "Landroid/graphics/drawable/GradientDrawable;", "roundedBackground", "Landroid/graphics/drawable/GradientDrawable;", "Companion", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class NotificationCarouselV2BaseItemViewHolder<T extends NotificationCarouselV2VO.NotificationCarouselItemVO> extends RecyclerView.C {

    @NotNull
    private final Function2<AtomAction, t, Unit> clickEventsHandler;

    @NotNull
    private final View contentView;
    private T item;

    @NotNull
    private final GradientDrawable roundedBackground;

    @NotNull
    private final Function1<t, Unit> viewEventsHandler;

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final float CORNER_RADIUS = UiExtKt.toPxF(24);

    @NotNull
    private static final InterfaceC4008j<float[]> ROUNDED_CORNERS$delegate = k.b(NotificationCarouselV2BaseItemViewHolder$Companion$ROUNDED_CORNERS$2.INSTANCE);

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000e\u001a\u00020\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/presentation/adapter/viewHolders/NotificationCarouselV2BaseItemViewHolder$Companion;", "", "<init>", "()V", "", "CORNER_RADIUS", "F", "getCORNER_RADIUS", "()F", "", "ROUNDED_CORNERS$delegate", "LSc/j;", "getROUNDED_CORNERS", "()[F", "ROUNDED_CORNERS", "", "NOTIFICATION_CAROUSEL_BASE_ITEM", "Ljava/lang/String;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float getCORNER_RADIUS() {
            return NotificationCarouselV2BaseItemViewHolder.CORNER_RADIUS;
        }

        @NotNull
        public final float[] getROUNDED_CORNERS() {
            return (float[]) NotificationCarouselV2BaseItemViewHolder.ROUNDED_CORNERS$delegate.getValue();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NotificationCarouselV2BaseItemViewHolder(@NotNull View contentView, @NotNull Function2<? super AtomAction, ? super t, Unit> clickEventsHandler, @NotNull Function1<? super t, Unit> viewEventsHandler) {
        super(contentView);
        Intrinsics.checkNotNullParameter(contentView, "contentView");
        Intrinsics.checkNotNullParameter(clickEventsHandler, "clickEventsHandler");
        Intrinsics.checkNotNullParameter(viewEventsHandler, "viewEventsHandler");
        this.contentView = contentView;
        this.clickEventsHandler = clickEventsHandler;
        this.viewEventsHandler = viewEventsHandler;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadii(Companion.getROUNDED_CORNERS());
        this.roundedBackground = gradientDrawable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$1(NotificationCarouselV2BaseItemViewHolder notificationCarouselV2BaseItemViewHolder, NotificationCarouselV2VO.NotificationCarouselItemVO notificationCarouselItemVO, View view) {
        notificationCarouselV2BaseItemViewHolder.clickEventsHandler.invoke(notificationCarouselItemVO.getClickAction(), notificationCarouselItemVO.getTokenizedEvent());
    }

    public void bind(@NotNull T item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.item = item;
        GradientDrawable gradientDrawable = this.roundedBackground;
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = this.contentView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        gradientDrawable.setColor(styleParser.parseColor(context, item.getBackgroundColor(), UniColors.LAYER_FLOOR_1.getResId()));
        this.contentView.setContentDescription("notificationCarouselV2BaseItem");
        this.contentView.setBackground(this.roundedBackground);
        this.contentView.setOnClickListener(new Lq(5, this, item));
    }

    public final void onViewed() {
        t tokenizedEvent;
        T t2 = this.item;
        if (t2 == null || (tokenizedEvent = t2.getTokenizedEvent()) == null) {
            return;
        }
        this.viewEventsHandler.invoke(tokenizedEvent);
    }
}
