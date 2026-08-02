package ru.ozon.app.android.geo.addresseditconfirmbutton.sticky;

import A00.a;
import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.RecyclerView;
import c20.r;
import d20.AbstractC6065b;
import j10.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.e;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.helper.FormBuilderHelper;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.updateevent.FormDataUpdate;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.R$id;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.geo.addresseditconfirmbutton.AddressEditConfirmButtonVO;
import ru.ozon.app.android.geo.addresseditconfirmbutton.AddressEditConfirmButtonView;
import ru.ozon.app.android.geo.addresseditconfirmbutton.FormDataUpdateHelper;
import ru.ozon.app.android.geo.addresseditconfirmbutton.data.AddressEditConfirmButtonDTO;
import ru.ozon.app.android.geo.addresseditconfirmbutton.di.AddressEditConfirmButtonWidgetComponent;
import ru.ozon.app.android.geo.mapupdater.MapUpdateProducer;
import ru.ozon.app.android.geo.pvzSearcher.PvzSearcherViewModelImpl;
import ru.ozon.app.android.utils.KeyboardUtilsKt;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0015\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u00182\u0006\u0010\t\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001d\u001a\u00020\u001c2\b\u0010\f\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R$\u0010&\u001a\u0010\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010)\u001a\u00020(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R(\u0010.\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00120-0\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101¨\u00062"}, d2 = {"Lru/ozon/app/android/geo/addresseditconfirmbutton/sticky/AddressEditConfirmButtonStickyViewMapper;", "Lc20/r;", "Lru/ozon/app/android/geo/addresseditconfirmbutton/data/AddressEditConfirmButtonDTO;", "Lru/ozon/app/android/geo/addresseditconfirmbutton/AddressEditConfirmButtonVO;", "Lru/ozon/app/android/geo/addresseditconfirmbutton/di/AddressEditConfirmButtonWidgetComponent;", "component", "<init>", "(Lru/ozon/app/android/geo/addresseditconfirmbutton/di/AddressEditConfirmButtonWidgetComponent;)V", "Landroid/view/ViewGroup;", "container", "findMap", "(Landroid/view/ViewGroup;)Landroid/view/ViewGroup;", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/geo/addresseditconfirmbutton/data/AddressEditConfirmButtonDTO;Ll20/d;)Ljava/util/List;", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/geo/addresseditconfirmbutton/AddressEditConfirmButtonVO;)Lru/ozon/app/android/geo/addresseditconfirmbutton/AddressEditConfirmButtonVO;", "Ll10/i;", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "", "", "canMap", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/geo/addresseditconfirmbutton/di/AddressEditConfirmButtonWidgetComponent;", "Lru/ozon/app/android/geo/addresseditconfirmbutton/FormDataUpdateHelper;", "formDataUpdateHelper", "Lru/ozon/app/android/geo/addresseditconfirmbutton/FormDataUpdateHelper;", "Lkotlin/Function1;", "", "", "onClick", "Lkotlin/jvm/functions/Function1;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "Ljava/lang/Class;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddressEditConfirmButtonStickyViewMapper extends r<AddressEditConfirmButtonDTO, AddressEditConfirmButtonVO> {

    @NotNull
    private final AddressEditConfirmButtonWidgetComponent component;

    @NotNull
    private final FormDataUpdateHelper formDataUpdateHelper;
    private Function1<? super String, Unit> onClick;

    @NotNull
    private final List<Class<? extends a.J.InterfaceC0007a>> supportedUpdates;

    @NotNull
    private final r.a viewType;

    public AddressEditConfirmButtonStickyViewMapper(@NotNull AddressEditConfirmButtonWidgetComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
        this.formDataUpdateHelper = new FormDataUpdateHelper();
        this.viewType = r.a.MULTIPLE;
        this.supportedUpdates = C7714v.q0(FormDataUpdate.class, FormBuilderHelper.Update.INSTANCE.getConsumeEvents());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ViewGroup findMap(ViewGroup container) {
        ViewGroup findParent = ViewExtKt.findParent(ComposerViewExtensionKt.composerContainer(container), AddressEditConfirmButtonStickyViewMapper$findMap$1.INSTANCE);
        if (findParent != null) {
            return (LinearLayout) ((LinearLayout) findParent).findViewById(R$id.addressEditMapDetailsBottomSheetStickyLinearContainer);
        }
        return null;
    }

    @Override // c20.r, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        AddressEditConfirmButtonDTO addressEditConfirmButtonDTO = state instanceof AddressEditConfirmButtonDTO ? (AddressEditConfirmButtonDTO) state : null;
        if (addressEditConfirmButtonDTO != null) {
            return Intrinsics.d(addressEditConfirmButtonDTO.isSticky(), Boolean.TRUE);
        }
        return false;
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<AddressEditConfirmButtonVO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        final ViewGroup Z11 = container.Z();
        ViewGroup composerContainer = ComposerViewExtensionKt.composerContainer(Z11);
        h.a<l> q11 = container.J().q();
        Context context = Z11.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        AddressEditConfirmButtonView addressEditConfirmButtonView = new AddressEditConfirmButtonView(context, null, 0, 0, 14, null);
        ViewGroup findMap = findMap(composerContainer);
        if (findMap != null) {
            findMap.addView(addressEditConfirmButtonView, new FrameLayout.LayoutParams(-1, -2));
        } else {
            ComposerViewExtensionKt.composerBottomContainer(composerContainer).addView(addressEditConfirmButtonView, new CoordinatorLayout.f(-1, -2));
        }
        this.onClick = new AddressEditConfirmButtonStickyViewMapper$createHolder$addressEditConfirmButtonView$1$1(this, Z11, container, q11);
        ComposerViewExtensionKt.composerRecyclerView(Z11).addOnItemTouchListener(new RecyclerView.y() { // from class: ru.ozon.app.android.geo.addresseditconfirmbutton.sticky.AddressEditConfirmButtonStickyViewMapper$createHolder$1
            @Override // androidx.recyclerview.widget.RecyclerView.s
            public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e11) {
                Intrinsics.checkNotNullParameter(rv, "rv");
                Intrinsics.checkNotNullParameter(e11, "e");
                if (e11.getAction() != 2) {
                    return false;
                }
                KeyboardUtilsKt.hideKeyboard(Z11);
                return false;
            }
        });
        e V11 = container.V();
        Intrinsics.g(V11, "null cannot be cast to non-null type ru.ozon.app.android.composer.ComposerReferences");
        ComposerReferences composerReferences = (ComposerReferences) V11;
        return new AddressEditConfirmButtonStickyViewHolder(addressEditConfirmButtonView, this.component.getCustomActionHandlersStoreFactory(), (PvzSearcherViewModelImpl) new z0(composerReferences.getViewModelOwnerProvider().a(), new z0.c() { // from class: ru.ozon.app.android.geo.addresseditconfirmbutton.sticky.AddressEditConfirmButtonStickyViewMapper$createHolder$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                AddressEditConfirmButtonWidgetComponent addressEditConfirmButtonWidgetComponent;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                addressEditConfirmButtonWidgetComponent = AddressEditConfirmButtonStickyViewMapper.this.component;
                PvzSearcherViewModelImpl pvzSearcherViewModel = addressEditConfirmButtonWidgetComponent.getPvzSearcherViewModel();
                Intrinsics.g(pvzSearcherViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return pvzSearcherViewModel;
            }
        }).a(PvzSearcherViewModelImpl.class), new AddressEditConfirmButtonStickyViewMapper$createHolder$3(this, container), new AddressEditConfirmButtonStickyViewMapper$createHolder$4(this, Z11), new AddressEditConfirmButtonStickyViewMapper$createHolder$5(this), composerReferences, q11, new MapUpdateProducer(this.component.getMapUpdateManager()));
    }

    @Override // c20.r, I00.d
    @NotNull
    public List<Class<? extends a.J.InterfaceC0007a>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // c20.r, I00.d
    public AddressEditConfirmButtonVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull AddressEditConfirmButtonVO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        return this.formDataUpdateHelper.handleUpdate(update, oldItem);
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<AddressEditConfirmButtonVO> map(@NotNull AddressEditConfirmButtonDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return this.component.getMapper().invoke(state, info);
    }
}
