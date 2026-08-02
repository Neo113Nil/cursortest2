package ru.ozon.app.android.partpayment.formpage.view;

import GZ.g;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.Q;
import androidx.fragment.app.r;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.partpayment.formpage.view.modalpickerfragment.ModalPickerFragment;
import ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.utils.KeyboardUtils;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\nJ\u0015\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0014\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00062\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/partpayment/formpage/view/FormPageRouter;", "", "LGZ/g;", "ozonRouter", "<init>", "(LGZ/g;)V", "", "deeplink", "", "openDeeplink", "(Ljava/lang/String;)V", "openDeeplinkForBackWithRefresh", "Landroidx/fragment/app/m;", "currentFragment", "backToPreviousPage", "(Landroidx/fragment/app/m;)V", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Options$Picker;", "options", "showPickerScreen", "(Landroidx/fragment/app/m;Ljava/lang/String;Ljava/util/List;)V", "LGZ/g;", "Companion", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FormPageRouter {

    @NotNull
    private final g ozonRouter;

    public FormPageRouter(@NotNull g ozonRouter) {
        Intrinsics.checkNotNullParameter(ozonRouter, "ozonRouter");
        this.ozonRouter = ozonRouter;
    }

    public final void backToPreviousPage(@NotNull ComponentCallbacksC5392m currentFragment) {
        Intrinsics.checkNotNullParameter(currentFragment, "currentFragment");
        r activity = currentFragment.getActivity();
        if (activity != null) {
            KeyboardUtils.INSTANCE.hideKeyboard(activity);
        }
        currentFragment.getChildFragmentManager().P0();
    }

    public final void openDeeplink(String deeplink) {
        if (deeplink != null) {
            g.a.a(this.ozonRouter, deeplink, null, null, 6);
        }
    }

    public final void openDeeplinkForBackWithRefresh(String deeplink) {
        if (deeplink != null) {
            this.ozonRouter.b(deeplink, 206, U.c());
        }
    }

    public final void showPickerScreen(@NotNull ComponentCallbacksC5392m currentFragment, @NotNull String title, @NotNull List<FormPageVO.Field.Options.Picker> options) {
        Intrinsics.checkNotNullParameter(currentFragment, "currentFragment");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(options, "options");
        r activity = currentFragment.getActivity();
        if (activity != null) {
            KeyboardUtils.INSTANCE.hideKeyboard(activity);
        }
        ModalPickerFragment newInstance = ModalPickerFragment.INSTANCE.newInstance(title, options);
        newInstance.setTargetFragment(currentFragment, 205);
        Q p11 = currentFragment.getParentFragmentManager().p();
        p11.r(currentFragment.getId(), newInstance, "FRAGMENT_TAG_MODAL_PICKER_SCREEN");
        p11.v(newInstance);
        p11.g(null);
        p11.j();
    }
}
