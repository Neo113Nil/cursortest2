package ru.ozon.uni.android.flashbar.main;

import Sc.InterfaceC3999a;
import android.content.Context;
import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.flashbar.callback.OnDismissListener;
import ru.ozon.uni.android.flashbar.model.Action;
import ru.ozon.uni.android.flashbar.model.Restriction;
import ru.ozon.uni.android.flashbar.view.DismissEvent;
import ru.ozon.uni.android.flashbar.view.FlashbarContainerView;
import ru.ozon.uni.android.flashbar.view.FlashbarView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@InterfaceC3999a
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 ;2\u00020\u0001:\u0001;B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\bJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0016\u0010\u0017JÃ\u0001\u00103\u001a\u00020\u00062\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00192\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$2\u0016\b\u0002\u0010(\u001a\u0010\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u0006\u0018\u00010&2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u001cH\u0000¢\u0006\u0004\b1\u00102R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u00104R\u0016\u00106\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00109\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006<"}, d2 = {"Lru/ozon/uni/android/flashbar/main/Flashbar;", "", "Lru/ozon/uni/android/flashbar/main/Builder;", "builder", "<init>", "(Lru/ozon/uni/android/flashbar/main/Builder;)V", "", "initializeContainer", "()V", "initializeFlashbar", "show", "dismiss", "", "isShowing", "()Z", "isShown", "", "text", "setMessage", "(Ljava/lang/String;)V", "Lru/ozon/uni/android/flashbar/view/DismissEvent;", "event", "dismissInternal$uni_release", "(Lru/ozon/uni/android/flashbar/view/DismissEvent;)V", "dismissInternal", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", SelectionItemFormDTO.TITLE_FIELD_NAME, "message", "", "icon", "image", "imageTintColor", "", "duration", "Lru/ozon/uni/android/flashbar/model/Action;", "action", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom;", "atomActionButton", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "atomActionHandler", "Lru/ozon/uni/android/flashbar/callback/OnDismissListener;", "dismissListener", "Lru/ozon/uni/android/flashbar/model/Restriction$Progress;", "progressInfo", "Landroid/graphics/drawable/Drawable;", "background", "titleTextColor", "messageTextColor", "rebind$uni_release", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lru/ozon/uni/android/flashbar/model/Action;Lru/ozon/uni/atoms/data/button/ButtonV3Atom;Lkotlin/jvm/functions/Function1;Lru/ozon/uni/android/flashbar/callback/OnDismissListener;Lru/ozon/uni/android/flashbar/model/Restriction$Progress;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;Ljava/lang/Integer;)V", "rebind", "Lru/ozon/uni/android/flashbar/main/Builder;", "Lru/ozon/uni/android/flashbar/view/FlashbarContainerView;", "flashbarContainerView", "Lru/ozon/uni/android/flashbar/view/FlashbarContainerView;", "Lru/ozon/uni/android/flashbar/view/FlashbarView;", "flashbarView", "Lru/ozon/uni/android/flashbar/view/FlashbarView;", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Flashbar {

    @NotNull
    private Builder builder;

    @NotNull
    private FlashbarContainerView flashbarContainerView;

    @NotNull
    private FlashbarView flashbarView;
    public static final int $stable = 8;

    public Flashbar(@NotNull Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.builder = builder;
        Context context = this.builder.getRootView().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        FlashbarContainerView flashbarContainerView = new FlashbarContainerView(context);
        this.flashbarContainerView = flashbarContainerView;
        flashbarContainerView.addParent$uni_release(this);
        Context context2 = this.builder.getRootView().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        FlashbarView flashbarView = new FlashbarView(context2);
        this.flashbarView = flashbarView;
        this.flashbarContainerView.attach$uni_release(flashbarView);
        this.flashbarView.addParent$uni_release(this.flashbarContainerView);
        initializeContainer();
        initializeFlashbar();
        this.flashbarContainerView.addView(this.flashbarView);
    }

    private final void initializeContainer() {
        FlashbarContainerView flashbarContainerView = this.flashbarContainerView;
        flashbarContainerView.setDuration$uni_release(this.builder.getDuration());
        this.builder.getOnShowListener$uni_release();
        flashbarContainerView.setBarShowListener$uni_release(null);
        flashbarContainerView.setBarDismissListener$uni_release(this.builder.getOnDismissListener());
        flashbarContainerView.enableSwipeToDismiss$uni_release(this.builder.getEnableSwipeToDismiss());
    }

    private final void initializeFlashbar() {
        FlashbarView flashbarView = this.flashbarView;
        flashbarView.setTitle$uni_release(this.builder.getTitle());
        flashbarView.setMessage$uni_release(this.builder.getMessage());
        flashbarView.setIcon$uni_release(this.builder.getIconUrl(), this.builder.getIconDrawableRes(), this.builder.getImageTintColor());
        flashbarView.setActionText$uni_release(this.builder.getPositiveActionText());
        flashbarView.setActionTapListener$uni_release(this.builder.getOnActionTapListener$uni_release());
        flashbarView.setAtomActionButton$uni_release(this.builder.getAtomActionButton(), this.builder.getAtomActionHandler$uni_release());
        flashbarView.setProgressInfo(this.builder.getProgressInfo());
        flashbarView.setTitleColor$uni_release(this.builder.getTitleTextColor());
        flashbarView.setMessageColor$uni_release(this.builder.getMessageTextColor());
        Drawable background = this.builder.getBackground();
        if (background != null) {
            flashbarView.setBackground(background);
        }
    }

    public final void dismiss() {
        this.flashbarContainerView.dismiss$uni_release();
    }

    public final void dismissInternal$uni_release(@NotNull DismissEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.flashbarContainerView.dismissInternal$uni_release(event);
    }

    public final boolean isShowing() {
        return this.flashbarContainerView.getIsBarShowing();
    }

    public final boolean isShown() {
        return this.flashbarContainerView.getIsBarShown();
    }

    public final void rebind$uni_release(OzonSpannableString title, OzonSpannableString message, Integer icon, String image, String imageTintColor, Long duration, Action action, ButtonV3Atom atomActionButton, Function1<? super AtomAction, Unit> atomActionHandler, OnDismissListener dismissListener, Restriction.Progress progressInfo, Drawable background, Integer titleTextColor, Integer messageTextColor) {
        FlashbarView flashbarView = this.flashbarView;
        flashbarView.setTitle$uni_release(title);
        flashbarView.setMessage$uni_release(message);
        flashbarView.setIcon$uni_release(image, icon, imageTintColor);
        this.flashbarContainerView.setDuration$uni_release(duration != null ? duration.longValue() : 3000L);
        if (action != null) {
            flashbarView.setActionText$uni_release(action.getTitle());
            flashbarView.setActionTapListener$uni_release(new Flashbar$rebind$1$1$1(action));
        }
        flashbarView.setAtomActionButton$uni_release(atomActionButton, atomActionHandler);
        if (dismissListener != null) {
            this.flashbarContainerView.setBarDismissListener$uni_release(dismissListener);
        }
        flashbarView.setProgressInfo(progressInfo);
        flashbarView.setTitleColor$uni_release(titleTextColor);
        flashbarView.setMessageColor$uni_release(messageTextColor);
        if (background != null) {
            flashbarView.setBackground(background);
        }
    }

    @InterfaceC3999a
    public final void setMessage(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.flashbarView.setMessage$uni_release(OzonSpannableStringKt.toOzonSpannableString(text));
    }

    public final void show() {
        this.flashbarContainerView.show$uni_release(this.builder.getRootView());
    }
}
