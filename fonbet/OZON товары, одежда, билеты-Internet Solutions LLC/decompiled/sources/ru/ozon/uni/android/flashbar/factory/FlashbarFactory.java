package ru.ozon.uni.android.flashbar.factory;

import Sc.InterfaceC3999a;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.R$drawable;
import ru.ozon.uni.R$string;
import ru.ozon.uni.android.flashbar.callback.OnDismissListener;
import ru.ozon.uni.android.flashbar.main.Builder;
import ru.ozon.uni.android.flashbar.main.Flashbar;
import ru.ozon.uni.android.flashbar.model.Action;
import ru.ozon.uni.android.flashbar.model.Restriction;
import ru.ozon.uni.android.flashbar.view.DismissEvent;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@InterfaceC3999a
@Metadata(d1 = {"\u0000\u0095\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\b\u0005*\u0001P\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n*\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000e\u001a\u00020\n*\u00020\u00072\u0006\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u001d\u0010\u000f\u001a\u00020\n*\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0015\u001a\u00020\n*\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0018\u001a\u00020\n*\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001c\u001a\u00020\n*\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010 \u001a\u00020\n*\u00020\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b \u0010!J)\u0010%\u001a\u00020\n*\u00020\u00072\u0014\u0010$\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\n\u0018\u00010\"H\u0002¢\u0006\u0004\b%\u0010&J\u001d\u0010)\u001a\u00020\n*\u00020\u00072\b\u0010(\u001a\u0004\u0018\u00010'H\u0002¢\u0006\u0004\b)\u0010*J\u001d\u0010-\u001a\u00020\n*\u00020\u00072\b\u0010,\u001a\u0004\u0018\u00010+H\u0002¢\u0006\u0004\b-\u0010.J\u001d\u00101\u001a\u00020\u0007*\u00020\u00072\b\u00100\u001a\u0004\u0018\u00010/H\u0002¢\u0006\u0004\b1\u00102J\u001d\u00104\u001a\u00020\u0007*\u00020\u00072\b\u00103\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b4\u00105J\u001d\u00106\u001a\u00020\u0007*\u00020\u00072\b\u00103\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b6\u00105JÙ\u0001\u0010B\u001a\u00020A2\u0006\u00108\u001a\u0002072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\b2\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u00132\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u00100\u001a\u0004\u0018\u00010/2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u001e2\u0016\b\u0002\u0010=\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\n\u0018\u00010\"2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+2\u0006\u0010@\u001a\u00020?¢\u0006\u0004\bB\u0010CJY\u0010E\u001a\u00020A2\u0006\u00108\u001a\u0002072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010D2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010D2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+2\u0006\u0010@\u001a\u00020?¢\u0006\u0004\bE\u0010FR\"\u0010H\u001a\u00020G8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u0018\u0010N\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010Q\u001a\u00020P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0018\u0010>\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010S¨\u0006T"}, d2 = {"Lru/ozon/uni/android/flashbar/factory/FlashbarFactory;", "", "<init>", "()V", "", "duration", "(Ljava/lang/Long;)Ljava/lang/Long;", "Lru/ozon/uni/android/flashbar/main/Builder;", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "setTitle", "(Lru/ozon/uni/android/flashbar/main/Builder;Lru/ozon/uni/atoms/utils/OzonSpannableString;)V", "message", "setMessage", "setDuration", "(Lru/ozon/uni/android/flashbar/main/Builder;Ljava/lang/Long;)V", "", "imageUrl", "", "icon", "setImage", "(Lru/ozon/uni/android/flashbar/main/Builder;Ljava/lang/String;Ljava/lang/Integer;)V", "tint", "setTint", "(Lru/ozon/uni/android/flashbar/main/Builder;Ljava/lang/String;)V", "Lru/ozon/uni/android/flashbar/model/Action;", "action", "setAction", "(Lru/ozon/uni/android/flashbar/main/Builder;Lru/ozon/uni/android/flashbar/model/Action;)V", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom;", "dto", "setAtomActionButton", "(Lru/ozon/uni/android/flashbar/main/Builder;Lru/ozon/uni/atoms/data/button/ButtonV3Atom;)V", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "setAtomActionHandler", "(Lru/ozon/uni/android/flashbar/main/Builder;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/uni/android/flashbar/model/Restriction$Progress;", "progressInfo", "setProgressInfo", "(Lru/ozon/uni/android/flashbar/main/Builder;Lru/ozon/uni/android/flashbar/model/Restriction$Progress;)V", "Lru/ozon/uni/android/flashbar/callback/OnDismissListener;", "dismissListener", "setDismissListener", "(Lru/ozon/uni/android/flashbar/main/Builder;Lru/ozon/uni/android/flashbar/callback/OnDismissListener;)V", "Landroid/graphics/drawable/Drawable;", "background", "setBackground", "(Lru/ozon/uni/android/flashbar/main/Builder;Landroid/graphics/drawable/Drawable;)Lru/ozon/uni/android/flashbar/main/Builder;", "color", "setMessageTextColor", "(Lru/ozon/uni/android/flashbar/main/Builder;Ljava/lang/Integer;)Lru/ozon/uni/android/flashbar/main/Builder;", "setTitleTextColor", "Landroid/view/ViewGroup;", "rootView", "titleTextColor", "messageTextColor", "imageTintColor", "atomActionButton", "atomActionHandler", "context", "Landroidx/lifecycle/J;", "dismissOnExitOwner", "Lru/ozon/uni/android/flashbar/main/Flashbar;", "create", "(Landroid/view/ViewGroup;Lru/ozon/uni/atoms/utils/OzonSpannableString;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/android/flashbar/model/Restriction$Progress;Lru/ozon/uni/android/flashbar/model/Action;Landroid/graphics/drawable/Drawable;Lru/ozon/uni/atoms/data/button/ButtonV3Atom;Lkotlin/jvm/functions/Function1;Ljava/lang/Long;Ljava/lang/String;Lru/ozon/uni/android/flashbar/callback/OnDismissListener;Landroidx/lifecycle/J;)Lru/ozon/uni/android/flashbar/main/Flashbar;", "", "createDefaultError", "(Landroid/view/ViewGroup;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lru/ozon/uni/android/flashbar/model/Action;Ljava/lang/Long;Lru/ozon/uni/android/flashbar/callback/OnDismissListener;Landroidx/lifecycle/J;)Lru/ozon/uni/android/flashbar/main/Flashbar;", "Lru/ozon/uni/android/flashbar/factory/FlashBarConfig;", "config", "Lru/ozon/uni/android/flashbar/factory/FlashBarConfig;", "getConfig", "()Lru/ozon/uni/android/flashbar/factory/FlashBarConfig;", "setConfig", "(Lru/ozon/uni/android/flashbar/factory/FlashBarConfig;)V", "flashbar", "Lru/ozon/uni/android/flashbar/main/Flashbar;", "ru/ozon/uni/android/flashbar/factory/FlashbarFactory$flashbarObserver$1", "flashbarObserver", "Lru/ozon/uni/android/flashbar/factory/FlashbarFactory$flashbarObserver$1;", "Ljava/lang/String;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FlashbarFactory {
    private static String context;
    private static Flashbar flashbar;

    @NotNull
    public static final FlashbarFactory INSTANCE = new FlashbarFactory();

    @NotNull
    private static FlashBarConfig config = new FlashBarConfig(false, 1, null);

    @NotNull
    private static FlashbarFactory$flashbarObserver$1 flashbarObserver = new DefaultLifecycleObserver() { // from class: ru.ozon.uni.android.flashbar.factory.FlashbarFactory$flashbarObserver$1
        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onDestroy(J owner) {
            Flashbar flashbar2;
            Intrinsics.checkNotNullParameter(owner, "owner");
            flashbar2 = FlashbarFactory.flashbar;
            if (flashbar2 != null) {
                flashbar2.dismissInternal$uni_release(DismissEvent.EXIT);
            }
            FlashbarFactory.flashbar = null;
        }
    };
    public static final int $stable = 8;

    private FlashbarFactory() {
    }

    public static /* synthetic */ Flashbar create$default(FlashbarFactory flashbarFactory, ViewGroup viewGroup, OzonSpannableString ozonSpannableString, OzonSpannableString ozonSpannableString2, Integer num, Integer num2, Integer num3, String str, String str2, Restriction.Progress progress, Action action, Drawable drawable, ButtonV3Atom buttonV3Atom, Function1 function1, Long l11, String str3, OnDismissListener onDismissListener, J j11, int i11, Object obj) {
        return flashbarFactory.create(viewGroup, (i11 & 2) != 0 ? null : ozonSpannableString, ozonSpannableString2, (i11 & 8) != 0 ? null : num, (i11 & 16) != 0 ? null : num2, (i11 & 32) != 0 ? null : num3, (i11 & 64) != 0 ? null : str, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : str2, (i11 & 256) != 0 ? null : progress, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : action, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : drawable, (i11 & 2048) != 0 ? null : buttonV3Atom, (i11 & 4096) != 0 ? null : function1, (i11 & 8192) != 0 ? null : l11, (i11 & 16384) != 0 ? null : str3, (i11 & 32768) != 0 ? null : onDismissListener, j11);
    }

    public static /* synthetic */ Flashbar createDefaultError$default(FlashbarFactory flashbarFactory, ViewGroup viewGroup, CharSequence charSequence, CharSequence charSequence2, Action action, Long l11, OnDismissListener onDismissListener, J j11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            charSequence = null;
        }
        if ((i11 & 4) != 0) {
            charSequence2 = null;
        }
        if ((i11 & 8) != 0) {
            action = null;
        }
        if ((i11 & 16) != 0) {
            l11 = 3000L;
        }
        if ((i11 & 32) != 0) {
            onDismissListener = null;
        }
        return flashbarFactory.createDefaultError(viewGroup, charSequence, charSequence2, action, l11, onDismissListener, j11);
    }

    private final Long duration(Long duration) {
        if (config.getIsIndefinite()) {
            return 100000L;
        }
        return duration;
    }

    private final void setAction(Builder builder, Action action) {
        if (action != null) {
            builder.actionButtonText(action.getTitle());
            builder.actionButtonTapListener(new FlashbarFactory$setAction$1(action));
        }
    }

    private final void setAtomActionButton(Builder builder, ButtonV3Atom buttonV3Atom) {
        if (buttonV3Atom != null) {
            builder.atomActionButton(buttonV3Atom);
        }
    }

    private final void setAtomActionHandler(Builder builder, Function1<? super AtomAction, Unit> function1) {
        builder.atomActionHandler(function1);
    }

    private final Builder setBackground(Builder builder, Drawable drawable) {
        return builder.background(drawable);
    }

    private final void setDismissListener(Builder builder, OnDismissListener onDismissListener) {
        if (onDismissListener != null) {
            builder.dismissListener(onDismissListener);
        }
    }

    private final void setDuration(Builder builder, Long l11) {
        if (l11 == null || l11.longValue() == -1) {
            return;
        }
        builder.duration(l11.longValue());
    }

    private final void setImage(Builder builder, String str, Integer num) {
        if ((str == null || builder.icon(str) == null) && num != null) {
            builder.icon(num.intValue());
        }
    }

    private final void setMessage(Builder builder, OzonSpannableString ozonSpannableString) {
        builder.message(ozonSpannableString);
    }

    private final Builder setMessageTextColor(Builder builder, Integer num) {
        return builder.messageTextColor(num);
    }

    private final void setProgressInfo(Builder builder, Restriction.Progress progress) {
        if (progress != null) {
            builder.progressInfo(progress);
        }
    }

    private final void setTint(Builder builder, String str) {
        builder.imageTintColor(str);
    }

    private final void setTitle(Builder builder, OzonSpannableString ozonSpannableString) {
        if (ozonSpannableString != null) {
            builder.title(ozonSpannableString);
        }
    }

    private final Builder setTitleTextColor(Builder builder, Integer num) {
        return builder.titleTextColor(num);
    }

    @NotNull
    public final Flashbar create(@NotNull ViewGroup rootView, OzonSpannableString title, @NotNull OzonSpannableString message, Integer titleTextColor, Integer messageTextColor, Integer icon, String imageUrl, String imageTintColor, Restriction.Progress progressInfo, Action action, Drawable background, ButtonV3Atom atomActionButton, Function1<? super AtomAction, Unit> atomActionHandler, Long duration, String context2, OnDismissListener dismissListener, @NotNull J dismissOnExitOwner) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(dismissOnExitOwner, "dismissOnExitOwner");
        dismissOnExitOwner.getLifecycle().e(flashbarObserver);
        dismissOnExitOwner.getLifecycle().a(flashbarObserver);
        Flashbar flashbar2 = flashbar;
        boolean z11 = false;
        boolean z12 = flashbar2 != null;
        if ((flashbar2 != null && flashbar2.isShown()) || (flashbar2 != null && flashbar2.isShowing())) {
            z11 = true;
        }
        boolean d11 = Intrinsics.d(context, context2);
        if (!z12 || !z11 || !d11) {
            Builder builder = new Builder(rootView);
            builder.enableSwipeToDismiss();
            FlashbarFactory flashbarFactory = INSTANCE;
            flashbarFactory.setTitle(builder, title);
            flashbarFactory.setMessage(builder, message);
            flashbarFactory.setDuration(builder, flashbarFactory.duration(duration));
            flashbarFactory.setImage(builder, imageUrl, icon);
            flashbarFactory.setTint(builder, imageTintColor);
            flashbarFactory.setAction(builder, action);
            flashbarFactory.setAtomActionButton(builder, atomActionButton);
            flashbarFactory.setAtomActionHandler(builder, atomActionHandler);
            flashbarFactory.setProgressInfo(builder, progressInfo);
            flashbarFactory.setDismissListener(builder, dismissListener);
            flashbarFactory.setBackground(builder, background);
            flashbarFactory.setMessageTextColor(builder, messageTextColor);
            flashbarFactory.setTitleTextColor(builder, titleTextColor);
            context = context2;
            flashbar2 = builder.build();
            flashbar = flashbar2;
        } else if (flashbar2 != null) {
            flashbar2.rebind$uni_release((r30 & 1) != 0 ? null : title, (r30 & 2) != 0 ? null : message, (r30 & 4) != 0 ? null : icon, (r30 & 8) != 0 ? null : imageUrl, (r30 & 16) != 0 ? null : imageTintColor, (r30 & 32) != 0 ? null : duration(duration), (r30 & 64) != 0 ? null : action, (r30 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : atomActionButton, (r30 & 256) != 0 ? null : null, (r30 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : null, (r30 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : progressInfo, (r30 & 2048) != 0 ? null : null, (r30 & 4096) != 0 ? null : titleTextColor, (r30 & 8192) != 0 ? null : messageTextColor);
        }
        if (flashbar2 != null) {
            return flashbar2;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @NotNull
    public final Flashbar createDefaultError(@NotNull ViewGroup rootView, CharSequence title, CharSequence message, Action action, Long duration, OnDismissListener dismissListener, @NotNull J dismissOnExitOwner) {
        CharSequence charSequence;
        long longValue;
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(dismissOnExitOwner, "dismissOnExitOwner");
        OzonSpannableString ozonSpannableString = title != null ? OzonSpannableStringKt.toOzonSpannableString(title) : null;
        if (message == null) {
            charSequence = rootView.getContext().getString(R$string.error_flashbar_universal_network_error);
            Intrinsics.checkNotNullExpressionValue(charSequence, "getString(...)");
        } else {
            charSequence = message;
        }
        OzonSpannableString ozonSpannableString2 = OzonSpannableStringKt.toOzonSpannableString(charSequence);
        int i11 = R$drawable.ic_warning;
        if (duration != null) {
            longValue = duration.longValue();
        } else {
            Long l11 = action != null ? 10000L : null;
            longValue = l11 != null ? l11.longValue() : 3000L;
        }
        return create$default(this, rootView, ozonSpannableString, ozonSpannableString2, null, null, Integer.valueOf(i11), null, null, null, action, null, null, null, duration(Long.valueOf(longValue)), null, dismissListener, dismissOnExitOwner, 24024, null);
    }

    @NotNull
    public final FlashBarConfig getConfig() {
        return config;
    }

    public final void setConfig(@NotNull FlashBarConfig flashBarConfig) {
        Intrinsics.checkNotNullParameter(flashBarConfig, "<set-?>");
        config = flashBarConfig;
    }
}
