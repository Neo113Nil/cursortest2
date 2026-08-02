package ru.ozon.app.android.geo.addresseditconfirmbutton;

import A00.a;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import j10.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.helper.FormBuilderHelper;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.updateevent.FormDataUpdate;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.WidgetViewMapper;
import ru.ozon.app.android.geo.addresseditconfirmbutton.data.AddressEditConfirmButtonDTO;
import ru.ozon.app.android.geo.addresseditconfirmbutton.di.AddressEditConfirmButtonWidgetComponent;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J5\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R$\u0010$\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u0010\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001c\u0010*\u001a\u0004\u0018\u00010)8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R(\u00100\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u001c0/0.8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R,\u00106\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u000205048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0014\u0010=\u001a\u00020:8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<¨\u0006>"}, d2 = {"Lru/ozon/app/android/geo/addresseditconfirmbutton/AddressEditConfirmButtonViewMapper;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewMapper;", "Lru/ozon/app/android/geo/addresseditconfirmbutton/data/AddressEditConfirmButtonDTO;", "Lru/ozon/app/android/geo/addresseditconfirmbutton/AddressEditConfirmButtonVO;", "Lru/ozon/app/android/geo/addresseditconfirmbutton/di/AddressEditConfirmButtonWidgetComponent;", "component", "<init>", "(Lru/ozon/app/android/geo/addresseditconfirmbutton/di/AddressEditConfirmButtonWidgetComponent;)V", "Landroid/view/ViewGroup;", "composerRootView", "Lru/ozon/composer/ui/widget/l;", "viewObject", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lj10/h;", "viewItemHelper", "", "constructLayout", "(Landroid/view/ViewGroup;Lru/ozon/composer/ui/widget/l;Lru/ozon/app/android/composer/ComposerReferences;Lj10/h;)V", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/geo/addresseditconfirmbutton/AddressEditConfirmButtonVO;)Lru/ozon/app/android/geo/addresseditconfirmbutton/AddressEditConfirmButtonVO;", "Lru/ozon/app/android/geo/addresseditconfirmbutton/di/AddressEditConfirmButtonWidgetComponent;", "Lkotlin/Function1;", "", "onClick", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/geo/addresseditconfirmbutton/FormDataUpdateHelper;", "formDataUpdateHelper", "Lru/ozon/app/android/geo/addresseditconfirmbutton/FormDataUpdateHelper;", "", "layout", "Ljava/lang/Void;", "getLayout", "()Ljava/lang/Void;", "", "Ljava/lang/Class;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Lkotlin/Function2;", "Lru/ozon/app/android/geo/addresseditconfirmbutton/AddressEditConfirmButtonViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Lru/ozon/app/android/geo/addresseditconfirmbutton/AddressEditConfirmButtonMapper;", "getMapper", "()Lru/ozon/app/android/geo/addresseditconfirmbutton/AddressEditConfirmButtonMapper;", "mapper", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddressEditConfirmButtonViewMapper extends WidgetViewMapper<AddressEditConfirmButtonDTO, AddressEditConfirmButtonVO> {

    @NotNull
    private final AddressEditConfirmButtonWidgetComponent component;

    @NotNull
    private final FormDataUpdateHelper formDataUpdateHelper;

    @NotNull
    private final Function2<View, ComposerReferences, AddressEditConfirmButtonViewHolder> holderProducer;
    private final Void layout;
    private Function1<? super String, Unit> onClick;

    @NotNull
    private final List<Class<? extends a.J.InterfaceC0007a>> supportedUpdates;

    public AddressEditConfirmButtonViewMapper(@NotNull AddressEditConfirmButtonWidgetComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
        this.formDataUpdateHelper = new FormDataUpdateHelper();
        this.supportedUpdates = C7714v.q0(FormDataUpdate.class, FormBuilderHelper.Update.INSTANCE.getConsumeEvents());
        this.holderProducer = new AddressEditConfirmButtonViewMapper$holderProducer$1(this);
    }

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return !((state instanceof AddressEditConfirmButtonDTO ? (AddressEditConfirmButtonDTO) state : null) != null ? Intrinsics.d(r2.isSticky(), Boolean.TRUE) : false);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    public void constructLayout(@NotNull ViewGroup composerRootView, @NotNull l viewObject, @NotNull ComposerReferences references, @NotNull h<l> viewItemHelper) {
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(viewItemHelper, "viewItemHelper");
        this.onClick = new AddressEditConfirmButtonViewMapper$constructLayout$1(this, composerRootView, references, viewItemHelper);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        AddressEditConfirmButtonView addressEditConfirmButtonView = new AddressEditConfirmButtonView(context, null, 0, 0, 14, null);
        addressEditConfirmButtonView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return addressEditConfirmButtonView;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<AddressEditConfirmButtonVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    public /* bridge */ /* synthetic */ Integer getLayout() {
        return (Integer) getLayout();
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<? extends a.J.InterfaceC0007a>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    public Void getLayout() {
        return this.layout;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<AddressEditConfirmButtonDTO, d, List<AddressEditConfirmButtonVO>> getMapper() {
        return this.component.getMapper();
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    public AddressEditConfirmButtonVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull AddressEditConfirmButtonVO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        return this.formDataUpdateHelper.handleUpdate(update, oldItem);
    }
}
