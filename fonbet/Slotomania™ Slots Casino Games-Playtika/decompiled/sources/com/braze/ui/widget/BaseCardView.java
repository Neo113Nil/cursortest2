package com.braze.ui.widget;

import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.braze.Braze;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.BrazeViewBounds;
import com.braze.images.IBrazeImageLoader;
import com.braze.models.cards.Card;
import com.braze.support.BrazeLogger;
import com.braze.ui.BrazeDeeplinkHandler;
import com.braze.ui.R;
import com.braze.ui.actions.IAction;
import com.braze.ui.actions.UriAction;
import com.braze.ui.feed.BrazeImageSwitcher;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: BaseCardView.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 &*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0001&B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\"\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0004J\"\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H$J\u0018\u0010\u001b\u001a\u00020\u00172\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\b\u001a\u00020\u0002J&\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020!2\u0006\u0010\b\u001a\u00020\u0002J\u0018\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u000bR\u0010\u0010\u0007\u001a\u00020\u00058\u0004X\u0085\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\u0004\u0018\u00018\u00008\u0004@\u0004X\u0085\u000e¢\u0006\u0004\n\u0002\u0010\tR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000f8\u0004@\u0004X\u0085\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0014\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006'"}, d2 = {"Lcom/braze/ui/widget/BaseCardView;", "T", "Lcom/braze/models/cards/Card;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "applicationContext", "card", "Lcom/braze/models/cards/Card;", "classLogTag", "", "getClassLogTag", "()Ljava/lang/String;", "configurationProvider", "Lcom/braze/configuration/BrazeConfigurationProvider;", "imageSwitcher", "Lcom/braze/ui/feed/BrazeImageSwitcher;", "isUnreadCardVisualIndicatorEnabled", "", "isUnreadIndicatorEnabled", "()Z", "handleCardClick", "", "cardAction", "Lcom/braze/ui/actions/IAction;", "isClickHandled", "setCardViewedIndicator", "setImageViewToUrl", "imageView", "Landroid/widget/ImageView;", "imageUrl", "placeholderAspectRatio", "", "setOptionalTextView", ViewHierarchyConstants.VIEW_KEY, "Landroid/widget/TextView;", "text", k.M, "android-sdk-ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class BaseCardView<T extends Card> extends RelativeLayout {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String ICON_READ_TAG = "icon_read";
    private static final String ICON_UNREAD_TAG = "icon_unread";
    protected final Context applicationContext;
    protected T card;
    private final String classLogTag;
    protected BrazeConfigurationProvider configurationProvider;
    public BrazeImageSwitcher imageSwitcher;
    private final boolean isUnreadCardVisualIndicatorEnabled;

    @JvmStatic
    protected static final UriAction getUriActionForCard(Card card) {
        return INSTANCE.getUriActionForCard(card);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch("com.appboy", this, me2);
        return super.dispatchTouchEvent(me2);
    }

    protected abstract boolean isClickHandled(Context context, Card card, IAction cardAction);

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseCardView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        this.applicationContext = applicationContext;
        this.classLogTag = BrazeLogger.getBrazeLogTag(getClass());
        BrazeConfigurationProvider brazeConfigurationProvider = new BrazeConfigurationProvider(context);
        this.configurationProvider = brazeConfigurationProvider;
        this.isUnreadCardVisualIndicatorEnabled = brazeConfigurationProvider.isNewsfeedVisualIndicatorOn();
    }

    public final String getClassLogTag() {
        return this.classLogTag;
    }

    /* renamed from: isUnreadIndicatorEnabled, reason: from getter */
    public final boolean getIsUnreadCardVisualIndicatorEnabled() {
        return this.isUnreadCardVisualIndicatorEnabled;
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
        Intrinsics.checkNotNullExpressionValue(context, "context");
        IBrazeImageLoader imageLoader = companion.getInstance(context).getImageLoader();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        imageLoader.renderUrlIntoCardView(context2, card, imageUrl, imageView, BrazeViewBounds.BASE_CARD_VIEW);
        imageView.setTag(R.string.com_braze_image_resize_tag_key, imageUrl);
    }

    public final void setCardViewedIndicator(BrazeImageSwitcher imageSwitcher, Card card) {
        Intrinsics.checkNotNullParameter(card, "card");
        if (imageSwitcher == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.widget.BaseCardView$setCardViewedIndicator$1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "imageSwitcher is null. Can't set card viewed indicator.";
                }
            }, 2, (Object) null);
            return;
        }
        Object tag = imageSwitcher.getTag(R.string.com_braze_image_is_read_tag_key);
        if (tag == null) {
            tag = "";
        }
        if (card.getIsIndicatorHighlightedInternal()) {
            if (Intrinsics.areEqual(tag, ICON_READ_TAG)) {
                return;
            }
            if (imageSwitcher.getReadIcon() != null) {
                imageSwitcher.setImageDrawable(imageSwitcher.getReadIcon());
            } else {
                imageSwitcher.setImageResource(R.drawable.com_braze_content_card_icon_read);
            }
            imageSwitcher.setTag(R.string.com_braze_image_is_read_tag_key, ICON_READ_TAG);
            return;
        }
        if (Intrinsics.areEqual(tag, ICON_UNREAD_TAG)) {
            return;
        }
        if (imageSwitcher.getUnReadIcon() != null) {
            imageSwitcher.setImageDrawable(imageSwitcher.getUnReadIcon());
        } else {
            imageSwitcher.setImageResource(R.drawable.com_braze_content_card_icon_unread);
        }
        imageSwitcher.setTag(R.string.com_braze_image_is_read_tag_key, ICON_UNREAD_TAG);
    }

    protected final void handleCardClick(Context context, final Card card, IAction cardAction) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(card, "card");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.widget.BaseCardView$handleCardClick$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return Intrinsics.stringPlus("Handling card click for card: ", Card.this);
            }
        }, 2, (Object) null);
        card.setIndicatorHighlighted(true);
        if (isClickHandled(context, card, cardAction)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.widget.BaseCardView$handleCardClick$5
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return Intrinsics.stringPlus("Card click was handled by custom listener on card: ", Card.this.getId());
                }
            }, 3, (Object) null);
            card.logClick();
        } else {
            if (cardAction != null) {
                card.logClick();
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.widget.BaseCardView$handleCardClick$2
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return Intrinsics.stringPlus("Card action is non-null. Attempting to perform action on card: ", Card.this.getId());
                    }
                }, 2, (Object) null);
                if (cardAction instanceof UriAction) {
                    BrazeDeeplinkHandler.INSTANCE.getInstance().gotoUri(context, (UriAction) cardAction);
                    return;
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.widget.BaseCardView$handleCardClick$3
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final String invoke() {
                            return Intrinsics.stringPlus("Executing non uri action for click on card: ", Card.this.getId());
                        }
                    }, 3, (Object) null);
                    cardAction.execute(context);
                    return;
                }
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.widget.BaseCardView$handleCardClick$4
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return Intrinsics.stringPlus("Card action is null. Not performing any click action on card: ", Card.this.getId());
                }
            }, 2, (Object) null);
        }
    }

    /* compiled from: BaseCardView.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0005R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/braze/ui/widget/BaseCardView$Companion;", "", "()V", "ICON_READ_TAG", "", "ICON_UNREAD_TAG", "getUriActionForCard", "Lcom/braze/ui/actions/UriAction;", "card", "Lcom/braze/models/cards/Card;", "android-sdk-ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        protected final UriAction getUriActionForCard(Card card) {
            Intrinsics.checkNotNullParameter(card, "card");
            Bundle bundle = new Bundle();
            for (String str : card.getExtras().keySet()) {
                bundle.putString(str, card.getExtras().get(str));
            }
            String url = card.getUrl();
            if (url == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.widget.BaseCardView$Companion$getUriActionForCard$1
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Card URL is null, returning null for getUriActionForCard";
                    }
                }, 2, (Object) null);
                return null;
            }
            return BrazeDeeplinkHandler.INSTANCE.getInstance().createUriActionFromUrlString(url, bundle, card.getOpenUriInWebView(), card.getChannel());
        }
    }
}
