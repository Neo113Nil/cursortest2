package ru.ozon.app.android.cml.delivery.widgets.personalInfoVerification.presentation.buttons;

import A00.a;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import c20.r;
import d20.AbstractC6065b;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cml.delivery.molecules.button.presentation.CmlButtonView;
import ru.ozon.app.android.cml.delivery.widgets.personalInfoVerification.data.model.PersonalInfoVerificationStickyButtonModel;
import ru.ozon.app.android.cml.delivery.widgets.personalInfoVerification.di.PersonalInfoVerificationComponent;
import ru.ozon.app.android.cml.delivery.widgets.personalInfoVerification.presentation.PersonalInfoVerificationUpdate;
import ru.ozon.app.android.cml.delivery.widgets.personalInfoVerification.presentation.PersonalInfoVerificationViewModel;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\u00142\b\u0010\b\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u001a\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR(\u0010\u001e\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00170\u001d0\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/presentation/buttons/PersonalInfoVerificationStickyButtonViewMapper;", "Lc20/r;", "Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/data/model/PersonalInfoVerificationStickyButtonModel;", "Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/presentation/buttons/PersonalInfoVerificationStickyButtonVO;", "Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/di/PersonalInfoVerificationComponent;", "component", "<init>", "(Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/di/PersonalInfoVerificationComponent;)V", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/data/model/PersonalInfoVerificationStickyButtonModel;Ll20/d;)Ljava/util/List;", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "", "", "canMap", "(Ljava/lang/Object;)Z", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/presentation/buttons/PersonalInfoVerificationStickyButtonVO;)Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/presentation/buttons/PersonalInfoVerificationStickyButtonVO;", "Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/di/PersonalInfoVerificationComponent;", "Ljava/lang/Class;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "viewType", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PersonalInfoVerificationStickyButtonViewMapper extends r<PersonalInfoVerificationStickyButtonModel, PersonalInfoVerificationStickyButtonVO> {

    @NotNull
    private final PersonalInfoVerificationComponent component;

    @NotNull
    private final List<Class<? extends a.J.InterfaceC0007a>> supportedUpdates;

    public PersonalInfoVerificationStickyButtonViewMapper(@NotNull PersonalInfoVerificationComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
        this.supportedUpdates = C7714v.a0(PersonalInfoVerificationUpdate.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View createHolder$lambda$1(LinearLayout parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new CmlButtonView(context, null, 0, 6, null);
    }

    @Override // c20.r, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return state instanceof PersonalInfoVerificationStickyButtonModel;
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<PersonalInfoVerificationStickyButtonVO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return new PersonalInfoVerificationStickyButtonViewHolder(this.component.getActionHandlersStoreFactory(), this.component.getHandlersInhibitor(), container, (PersonalInfoVerificationViewModel) new z0(container.a0().a(), new z0.c() { // from class: ru.ozon.app.android.cml.delivery.widgets.personalInfoVerification.presentation.buttons.PersonalInfoVerificationStickyButtonViewMapper$createHolder$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                PersonalInfoVerificationComponent personalInfoVerificationComponent;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                personalInfoVerificationComponent = PersonalInfoVerificationStickyButtonViewMapper.this.component;
                PersonalInfoVerificationViewModel personalInfoVerificationViewModel = personalInfoVerificationComponent.getPersonalInfoVerificationViewModel();
                Intrinsics.g(personalInfoVerificationViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return personalInfoVerificationViewModel;
            }
        }).a(PersonalInfoVerificationViewModel.class), new WT.a(1));
    }

    @Override // c20.r, I00.d
    @NotNull
    public List<Class<? extends a.J.InterfaceC0007a>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return r.a.SINGLE;
    }

    @Override // c20.r, I00.d
    public PersonalInfoVerificationStickyButtonVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull PersonalInfoVerificationStickyButtonVO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (update instanceof PersonalInfoVerificationUpdate) {
            return ((PersonalInfoVerificationUpdate) update).getStickyButton();
        }
        return null;
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<PersonalInfoVerificationStickyButtonVO> map(@NotNull PersonalInfoVerificationStickyButtonModel state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return this.component.getStickyButtonMapper().invoke(state, info);
    }
}
