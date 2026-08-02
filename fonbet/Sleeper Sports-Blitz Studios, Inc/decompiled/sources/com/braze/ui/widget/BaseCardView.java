package com.braze.ui.widget;

import android.content.Context;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.exifinterface.media.ExifInterface;
import com.braze.Braze;
import com.braze.BrazeInternal;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.BrazeViewBounds;
import com.braze.images.IBrazeImageLoader;
import com.braze.models.cards.Card;
import com.braze.support.BrazeLogger;
import com.braze.ui.BrazeDeeplinkHandler;
import com.braze.ui.R;
import com.braze.ui.actions.IAction;
import com.braze.ui.actions.UriAction;
import com.braze.ui.contentcards.BrazeContentCardUtils;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: BaseCardView.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 #*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0001#B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\nJ&\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\r\u001a\u00020\u0002J\"\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00022\b\u0010 \u001a\u0004\u0018\u00010!H\u0004J\"\u0010\"\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00022\b\u0010 \u001a\u0004\u0018\u00010!H$R\u0010\u0010\b\u001a\u00020\u00058\u0004X\u0085\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u0004\u0018\u00018\u00008\u0004@\u0004X\u0085\u000e¢\u0006\u0004\n\u0002\u0010\u000eR\u0012\u0010\u000f\u001a\u00020\u00108\u0004@\u0004X\u0085\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0011\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0013¨\u0006$"}, d2 = {"Lcom/braze/ui/widget/BaseCardView;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/braze/models/cards/Card;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "applicationContext", "classLogTag", "", "getClassLogTag", "()Ljava/lang/String;", "card", "Lcom/braze/models/cards/Card;", "configurationProvider", "Lcom/braze/configuration/BrazeConfigurationProvider;", "isUnreadIndicatorEnabled", "", "()Z", "setOptionalTextView", "", ViewHierarchyConstants.VIEW_KEY, "Landroid/widget/TextView;", "text", "setImageViewToUrl", "imageView", "Landroid/widget/ImageView;", "imageUrl", "placeholderAspectRatio", "", "handleCardClick", "cardAction", "Lcom/braze/ui/actions/IAction;", "isClickHandled", "Companion", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class BaseCardView<T extends Card> extends RelativeLayout {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    protected final Context applicationContext;
    protected T card;
    private final String classLogTag;
    protected BrazeConfigurationProvider configurationProvider;

    @JvmStatic
    protected static final UriAction getUriActionForCard(Card card) {
        return INSTANCE.getUriActionForCard(card);
    }

    protected abstract boolean isClickHandled(Context context, Card card, IAction cardAction);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseCardView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.applicationContext = applicationContext;
        this.classLogTag = BrazeLogger.getBrazeLogTag(getClass());
        this.configurationProvider = BrazeInternal.INSTANCE.getConfigurationProvider(context);
    }

    public final String getClassLogTag() {
        return this.classLogTag;
    }

    public final boolean isUnreadIndicatorEnabled() {
        return this.configurationProvider.isContentCardsUnreadVisualIndicatorEnabled();
    }

    public final void setOptionalTextView(TextView view, String text) {
        Intrinsics.checkNotNullParameter(view, "view");
        String str = text;
        if (str != null && !StringsKt.isBlank(str)) {
            view.setText(str);
            view.setVisibility(0);
        } else {
            view.setText("");
            view.setVisibility(8);
        }
    }

    public final void setImageViewToUrl(final ImageView imageView, String imageUrl, final float placeholderAspectRatio, Card card) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(card, "card");
        if (Intrinsics.areEqual(imageUrl, imageView.getTag(R.string.com_braze_image_resize_tag_key))) {
            return;
        }
        if (placeholderAspectRatio != 0.0f) {
            ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.braze.ui.widget.BaseCardView$setImageViewToUrl$1
                    @Override // android.view.ViewTreeObserver.OnPreDrawListener
                    public boolean onPreDraw() {
                        imageView.getViewTreeObserver().removeOnPreDrawListener(this);
                        int width = imageView.getWidth();
                        imageView.setLayoutParams(new RelativeLayout.LayoutParams(width, (int) (width / placeholderAspectRatio)));
                        return true;
                    }
                });
            }
        }
        imageView.setImageResource(android.R.color.transparent);
        Braze.Companion companion = Braze.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        IBrazeImageLoader imageLoader = companion.getInstance(context).getImageLoader();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        imageLoader.renderUrlIntoCardView(context2, card, imageUrl, imageView, BrazeViewBounds.BASE_CARD_VIEW);
        imageView.setTag(R.string.com_braze_image_resize_tag_key, imageUrl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleCardClick$lambda$0(Card card) {
        return "Handling card click for card: " + card;
    }

    protected final void handleCardClick(Context context, final Card card, IAction cardAction) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(card, "card");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.ui.widget.BaseCardView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String handleCardClick$lambda$0;
                handleCardClick$lambda$0 = BaseCardView.handleCardClick$lambda$0(Card.this);
                return handleCardClick$lambda$0;
            }
        }, 6, (Object) null);
        card.setIndicatorHighlighted(true);
        if (isClickHandled(context, card, cardAction)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.ui.widget.BaseCardView$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String handleCardClick$lambda$4;
                    handleCardClick$lambda$4 = BaseCardView.handleCardClick$lambda$4(Card.this);
                    return handleCardClick$lambda$4;
                }
            }, 7, (Object) null);
            card.logClick();
        } else {
            if (cardAction != null) {
                card.logClick();
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.ui.widget.BaseCardView$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String handleCardClick$lambda$1;
                        handleCardClick$lambda$1 = BaseCardView.handleCardClick$lambda$1(Card.this);
                        return handleCardClick$lambda$1;
                    }
                }, 6, (Object) null);
                if (cardAction instanceof UriAction) {
                    BrazeDeeplinkHandler.INSTANCE.getInstance().gotoUri(context, (UriAction) cardAction);
                    return;
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.ui.widget.BaseCardView$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String handleCardClick$lambda$2;
                            handleCardClick$lambda$2 = BaseCardView.handleCardClick$lambda$2(Card.this);
                            return handleCardClick$lambda$2;
                        }
                    }, 7, (Object) null);
                    cardAction.execute(context);
                    return;
                }
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.ui.widget.BaseCardView$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String handleCardClick$lambda$3;
                    handleCardClick$lambda$3 = BaseCardView.handleCardClick$lambda$3(Card.this);
                    return handleCardClick$lambda$3;
                }
            }, 6, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleCardClick$lambda$1(Card card) {
        return "Card action is non-null. Attempting to perform action on card: " + card.getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleCardClick$lambda$2(Card card) {
        return "Executing non uri action for click on card: " + card.getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleCardClick$lambda$3(Card card) {
        return "Card action is null. Not performing any click action on card: " + card.getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleCardClick$lambda$4(Card card) {
        return "Card click was handled by custom listener on card: " + card.getId();
    }

    /* compiled from: BaseCardView.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0005¨\u0006\b"}, d2 = {"Lcom/braze/ui/widget/BaseCardView$Companion;", "", "<init>", "()V", "getUriActionForCard", "Lcom/braze/ui/actions/UriAction;", "card", "Lcom/braze/models/cards/Card;", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        protected final UriAction getUriActionForCard(Card card) {
            Intrinsics.checkNotNullParameter(card, "card");
            return BrazeContentCardUtils.INSTANCE.getUriActionForCard(card);
        }
    }
}
