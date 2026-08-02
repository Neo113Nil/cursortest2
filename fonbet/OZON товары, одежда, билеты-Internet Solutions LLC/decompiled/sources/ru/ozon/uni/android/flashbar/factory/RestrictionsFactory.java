package ru.ozon.uni.android.flashbar.factory;

import Sc.InterfaceC3999a;
import android.view.ViewGroup;
import androidx.lifecycle.J;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.session.deleteAccount.data.DeleteAccountApiResponse;
import ru.ozon.uni.R$drawable;
import ru.ozon.uni.android.flashbar.callback.OnActionClickListener;
import ru.ozon.uni.android.flashbar.callback.OnDismissListener;
import ru.ozon.uni.android.flashbar.model.Action;
import ru.ozon.uni.android.flashbar.model.Restriction;
import ru.ozon.uni.android.flashbar.view.DismissEvent;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@InterfaceC3999a
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u007f\u0010$\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001c2\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010 2\u0010\b\u0002\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010 2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/ozon/uni/android/flashbar/factory/RestrictionsFactory;", "", "<init>", "()V", "Lru/ozon/uni/android/flashbar/model/Restriction;", DeleteAccountApiResponse.Error.TYPE_RESTRICTION, "", "prepareIcon", "(Lru/ozon/uni/android/flashbar/model/Restriction;)Ljava/lang/Integer;", "Lru/ozon/uni/android/flashbar/callback/OnActionClickListener;", "onActionClickListener", "", "isRefreshParamsEnabled", "Lru/ozon/uni/android/flashbar/model/Action;", "prepareAction", "(Lru/ozon/uni/android/flashbar/model/Restriction;Lru/ozon/uni/android/flashbar/callback/OnActionClickListener;Ljava/lang/Boolean;)Lru/ozon/uni/android/flashbar/model/Action;", "Lru/ozon/uni/android/flashbar/model/Restriction$Progress;", "prepareProgressInfo", "(Lru/ozon/uni/android/flashbar/model/Restriction;)Lru/ozon/uni/android/flashbar/model/Restriction$Progress;", "", "prepareDuration", "(Lru/ozon/uni/android/flashbar/model/Restriction;)J", "Landroid/view/ViewGroup;", "rootView", "", "restrictions", "Landroidx/lifecycle/J;", "dismissOnExitOwner", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "atomActionHandler", "Lkotlin/Function0;", "onShowListener", "onDismissListener", "isRefreshParamsFeatureEnabled", "create", "(Landroid/view/ViewGroup;Ljava/util/List;Landroidx/lifecycle/J;Lru/ozon/uni/android/flashbar/callback/OnActionClickListener;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/Boolean;)V", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RestrictionsFactory {

    @NotNull
    public static final RestrictionsFactory INSTANCE = new RestrictionsFactory();

    private RestrictionsFactory() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void create$default(RestrictionsFactory restrictionsFactory, ViewGroup viewGroup, List list, J j11, OnActionClickListener onActionClickListener, Function1 function1, Function0 function0, Function0 function02, Boolean bool, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            onActionClickListener = null;
        }
        if ((i11 & 16) != 0) {
            function1 = null;
        }
        if ((i11 & 32) != 0) {
            function0 = null;
        }
        if ((i11 & 64) != 0) {
            function02 = null;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            bool = Boolean.FALSE;
        }
        restrictionsFactory.create(viewGroup, list, j11, onActionClickListener, function1, function0, function02, bool);
    }

    private final Action prepareAction(Restriction restriction, OnActionClickListener onActionClickListener, Boolean isRefreshParamsEnabled) {
        Restriction.Action readAction = restriction.readAction();
        if (readAction != null) {
            return new Action(readAction.getTitle(), true, new RestrictionsFactory$prepareAction$1$1(readAction, onActionClickListener, isRefreshParamsEnabled));
        }
        return null;
    }

    private final long prepareDuration(Restriction restriction) {
        String lifetime = restriction.getLifetime();
        if (Intrinsics.d(lifetime, Restriction.Lifetime.INFINITE.getValue())) {
            return 10000L;
        }
        return Intrinsics.d(lifetime, Restriction.Lifetime.LONG.getValue()) ? 6000L : 3000L;
    }

    private final Integer prepareIcon(Restriction restriction) {
        String type = restriction.getType();
        if (Intrinsics.d(type, Restriction.Type.WARNING.getValue())) {
            return Integer.valueOf(R$drawable.ic_warning);
        }
        if (Intrinsics.d(type, Restriction.Type.SUCCESS.getValue())) {
            return Integer.valueOf(R$drawable.ic_check_green);
        }
        return null;
    }

    private final Restriction.Progress prepareProgressInfo(Restriction restriction) {
        Restriction.Progress progress = restriction.getProgress();
        if (progress != null) {
            return new Restriction.Progress(progress.getText(), progress.getPercent(), progress.getProgressBarColor());
        }
        return null;
    }

    public final void create(@NotNull final ViewGroup rootView, @NotNull final List<Restriction> restrictions, @NotNull final J dismissOnExitOwner, final OnActionClickListener onActionClickListener, Function1<? super AtomAction, Unit> atomActionHandler, final Function0<Unit> onShowListener, final Function0<Unit> onDismissListener, Boolean isRefreshParamsFeatureEnabled) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(restrictions, "restrictions");
        Intrinsics.checkNotNullParameter(dismissOnExitOwner, "dismissOnExitOwner");
        Restriction restriction = (Restriction) C7714v.M(restrictions);
        if (restriction != null) {
            FlashbarFactory flashbarFactory = FlashbarFactory.INSTANCE;
            String title = restriction.getTitle();
            OzonSpannableString ozonSpannableString = title != null ? OzonSpannableStringKt.toOzonSpannableString(title) : null;
            OzonSpannableString ozonSpannableString2 = OzonSpannableStringKt.toOzonSpannableString(restriction.getMessage());
            String context = restriction.getContext();
            RestrictionsFactory restrictionsFactory = INSTANCE;
            Integer prepareIcon = restrictionsFactory.prepareIcon(restriction);
            String image = restriction.getImage();
            OzonSpannableString ozonSpannableString3 = ozonSpannableString;
            String imageTintColor = restriction.getImageTintColor();
            long prepareDuration = restrictionsFactory.prepareDuration(restriction);
            Restriction.Progress prepareProgressInfo = restrictionsFactory.prepareProgressInfo(restriction);
            Action prepareAction = restrictionsFactory.prepareAction(restriction, onActionClickListener, isRefreshParamsFeatureEnabled);
            Object button = restriction.getButton();
            FlashbarFactory.create$default(flashbarFactory, rootView, ozonSpannableString3, ozonSpannableString2, null, null, prepareIcon, image, imageTintColor, prepareProgressInfo, prepareAction, null, button instanceof ButtonV3Atom ? (ButtonV3Atom) button : null, atomActionHandler, Long.valueOf(prepareDuration), context, new OnDismissListener() { // from class: ru.ozon.uni.android.flashbar.factory.RestrictionsFactory$create$1$1
                @Override // ru.ozon.uni.android.flashbar.callback.OnDismissListener
                public void onDismissProgress(float f7) {
                    OnDismissListener.DefaultImpls.onDismissProgress(this, f7);
                }

                @Override // ru.ozon.uni.android.flashbar.callback.OnDismissListener
                public void onDismissed(DismissEvent event) {
                    Intrinsics.checkNotNullParameter(event, "event");
                    Function0<Unit> function0 = onDismissListener;
                    if (function0 != null) {
                        function0.invoke();
                    }
                    List<Restriction> list = restrictions;
                    if (event == DismissEvent.EXIT || list.isEmpty()) {
                        list = null;
                    }
                    if (list != null) {
                        List<Restriction> list2 = restrictions;
                        ViewGroup viewGroup = rootView;
                        J j11 = dismissOnExitOwner;
                        OnActionClickListener onActionClickListener2 = onActionClickListener;
                        Function0<Unit> function02 = onShowListener;
                        Function0<Unit> function03 = onDismissListener;
                        RestrictionsFactory restrictionsFactory2 = RestrictionsFactory.INSTANCE;
                        list2.remove(0);
                        RestrictionsFactory.create$default(restrictionsFactory2, viewGroup, list2, j11, onActionClickListener2, null, function02, function03, null, 144, null);
                    }
                }

                @Override // ru.ozon.uni.android.flashbar.callback.OnDismissListener
                public void onDismissing(boolean z11) {
                    OnDismissListener.DefaultImpls.onDismissing(this, z11);
                }
            }, dismissOnExitOwner, 1048, null).show();
            if (onShowListener != null) {
                onShowListener.invoke();
            }
        }
    }
}
