package ru.ozon.app.android.geo.addressEditForm.presentation;

import A00.a;
import Sc.InterfaceC4008j;
import android.view.View;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.data.FormBuilderDTO;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.helper.FormBuilderHelper;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.FormBuilderBlockVO;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.updateevent.FormDataUpdate;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.WidgetViewMapper;
import ru.ozon.app.android.geo.R$layout;
import ru.ozon.app.android.geo.addressEditForm.di.AddressEditFormWidgetComponent;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00128VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0019\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR2\u0010!\u001a\u001a\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030 0\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R(\u0010'\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0&0%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lru/ozon/app/android/geo/addressEditForm/presentation/AddressEditFormViewMapper;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewMapper;", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO;", "Lru/ozon/app/android/geo/addressEditForm/presentation/AddressEditFormVO;", "Lru/ozon/app/android/geo/addressEditForm/di/AddressEditFormWidgetComponent;", "component", "<init>", "(Lru/ozon/app/android/geo/addressEditForm/di/AddressEditFormWidgetComponent;)V", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/geo/addressEditForm/presentation/AddressEditFormVO;)Lru/ozon/app/android/geo/addressEditForm/presentation/AddressEditFormVO;", "newItem", "", "getPayload", "(Lru/ozon/app/android/geo/addressEditForm/presentation/AddressEditFormVO;Lru/ozon/app/android/geo/addressEditForm/presentation/AddressEditFormVO;)Ljava/lang/Object;", "Lru/ozon/app/android/geo/addressEditForm/di/AddressEditFormWidgetComponent;", "Lru/ozon/app/android/geo/addressEditForm/presentation/AddressEditFormMapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/geo/addressEditForm/presentation/AddressEditFormMapper;", "mapper", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "", "Ljava/lang/Class;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddressEditFormViewMapper extends WidgetViewMapper<FormBuilderDTO, AddressEditFormVO> {

    @NotNull
    private final AddressEditFormWidgetComponent component;

    @NotNull
    private final Function2<View, ComposerReferences, k<AddressEditFormVO>> holderProducer;
    private final int layout;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j mapper;

    @NotNull
    private final List<Class<? extends a.J.InterfaceC0007a>> supportedUpdates;

    public AddressEditFormViewMapper(@NotNull AddressEditFormWidgetComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
        this.mapper = Sc.k.b(AddressEditFormViewMapper$mapper$2.INSTANCE);
        this.layout = R$layout.widget_address_edit_form;
        this.holderProducer = new AddressEditFormViewMapper$holderProducer$1(this);
        this.supportedUpdates = C7714v.q0(FormDataUpdate.class, FormBuilderHelper.Update.INSTANCE.getConsumeEvents());
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<AddressEditFormVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<? extends a.J.InterfaceC0007a>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<FormBuilderDTO, d, List<AddressEditFormVO>> getMapper() {
        return (AddressEditFormMapper) this.mapper.getValue();
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Object getPayload(@NotNull AddressEditFormVO oldItem, @NotNull AddressEditFormVO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Unit.f71690a;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    public AddressEditFormVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull AddressEditFormVO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        FormBuilderHelper.Update update2 = FormBuilderHelper.Update.INSTANCE;
        if (!update2.checkChangeFieldPossibility(update, oldItem.getFormBlocks())) {
            if (update instanceof FormDataUpdate) {
                return AddressEditFormVO.copy$default(oldItem, 0L, null, null, 0L, false, 15, null);
            }
            return null;
        }
        List<FormBuilderBlockVO> changeFormByUpdate = update2.changeFormByUpdate(update, oldItem.getFormBlocks());
        if (changeFormByUpdate != null) {
            return AddressEditFormVO.copy$default(oldItem, 0L, changeFormByUpdate, null, 0L, false, 29, null);
        }
        return null;
    }
}
