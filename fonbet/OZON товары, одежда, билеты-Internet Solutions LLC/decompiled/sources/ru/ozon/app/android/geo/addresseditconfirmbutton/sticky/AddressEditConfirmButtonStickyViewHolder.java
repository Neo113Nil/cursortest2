package ru.ozon.app.android.geo.addresseditconfirmbutton.sticky;

import Vg.d;
import android.view.View;
import d20.AbstractC6065b;
import fd.InterfaceC6511n;
import j10.h;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.geo.addresseditconfirmbutton.AddressEditConfirmButtonVO;
import ru.ozon.app.android.geo.addresseditconfirmbutton.AddressEditConfirmButtonView;
import ru.ozon.app.android.geo.mapupdater.MapUpdateProducer;
import ru.ozon.app.android.geo.pvzSearcher.PvzSearcherActionObserver;
import ru.ozon.app.android.geo.pvzSearcher.PvzSearcherViewModel;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u009f\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012*\u0010\u000f\u001a&\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\n\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\u0010\u0012\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0010\u0010\u0018\u001a\f\u0012\u0004\u0012\u00020\u00160\u0015j\u0002`\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010 R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010!R\u0018\u0010\u0007\u001a\u00060\u0005j\u0002`\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\"R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010#R8\u0010\u000f\u001a&\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010$R \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010%R\"\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010%R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010*\u001a\u0004\u0018\u00010)8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R \u0010/\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u000e0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010%R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102¨\u00063"}, d2 = {"Lru/ozon/app/android/geo/addresseditconfirmbutton/sticky/AddressEditConfirmButtonStickyViewHolder;", "Ld20/b;", "Lru/ozon/app/android/geo/addresseditconfirmbutton/AddressEditConfirmButtonVO;", "Lru/ozon/app/android/geo/addresseditconfirmbutton/AddressEditConfirmButtonView;", "addressEditConfirmButtonView", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/geo/pvzSearcher/PvzSearcherViewModel;", "viewModel", "Lkotlin/Function3;", "", "", "", "", "onBind", "Lkotlin/Function1;", "onWidgetDestroyed", "onClick", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lj10/h;", "Lru/ozon/composer/ui/widget/l;", "Lru/ozon/app/android/composer/viewmodel/ComposerVoHelper;", "voHelper", "Lru/ozon/app/android/geo/mapupdater/MapUpdateProducer;", "mapUpdateProducer", "<init>", "(Lru/ozon/app/android/geo/addresseditconfirmbutton/AddressEditConfirmButtonView;LVg/d;Lru/ozon/app/android/geo/pvzSearcher/PvzSearcherViewModel;Lfd/n;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/composer/ComposerReferences;Lj10/h;Lru/ozon/app/android/geo/mapupdater/MapUpdateProducer;)V", "item", "bind", "(Lru/ozon/app/android/geo/addresseditconfirmbutton/AddressEditConfirmButtonVO;)V", "()V", "Lru/ozon/app/android/geo/addresseditconfirmbutton/AddressEditConfirmButtonView;", "LVg/d;", "Lru/ozon/app/android/geo/pvzSearcher/PvzSearcherViewModel;", "Lfd/n;", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/composer/ComposerReferences;", "getReferences", "()Lru/ozon/app/android/composer/ComposerReferences;", "Landroid/view/View;", "metricView", "Landroid/view/View;", "getMetricView", "()Landroid/view/View;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lru/ozon/app/android/geo/pvzSearcher/PvzSearcherActionObserver;", "pvzSearcherActionObserver", "Lru/ozon/app/android/geo/pvzSearcher/PvzSearcherActionObserver;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddressEditConfirmButtonStickyViewHolder extends AbstractC6065b<AddressEditConfirmButtonVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private final AddressEditConfirmButtonView addressEditConfirmButtonView;

    @NotNull
    private final d customActionHandlersStoreFactory;
    private final View metricView;

    @NotNull
    private final InterfaceC6511n<Map<String, String>, String, Boolean, Unit> onBind;
    private final Function1<String, Unit> onClick;

    @NotNull
    private final Function1<AddressEditConfirmButtonView, Unit> onWidgetDestroyed;

    @NotNull
    private final PvzSearcherActionObserver pvzSearcherActionObserver;

    @NotNull
    private final ComposerReferences references;

    @NotNull
    private final PvzSearcherViewModel viewModel;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/geo/pvzSearcher/PvzSearcherViewModel$Action;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/geo/pvzSearcher/PvzSearcherViewModel$Action;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.geo.addresseditconfirmbutton.sticky.AddressEditConfirmButtonStickyViewHolder$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<PvzSearcherViewModel.Action, Unit> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PvzSearcherViewModel.Action action) {
            invoke2(action);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PvzSearcherViewModel.Action action) {
            PvzSearcherActionObserver pvzSearcherActionObserver = AddressEditConfirmButtonStickyViewHolder.this.pvzSearcherActionObserver;
            Intrinsics.f(action);
            pvzSearcherActionObserver.handleAction(action);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AddressEditConfirmButtonStickyViewHolder(AddressEditConfirmButtonView addressEditConfirmButtonView, @NotNull d customActionHandlersStoreFactory, @NotNull PvzSearcherViewModel viewModel, @NotNull InterfaceC6511n<? super Map<String, String>, ? super String, ? super Boolean, Unit> onBind, @NotNull Function1<? super AddressEditConfirmButtonView, Unit> onWidgetDestroyed, Function1<? super String, Unit> function1, @NotNull ComposerReferences references, @NotNull h<l> voHelper, @NotNull MapUpdateProducer mapUpdateProducer) {
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(onBind, "onBind");
        Intrinsics.checkNotNullParameter(onWidgetDestroyed, "onWidgetDestroyed");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(voHelper, "voHelper");
        Intrinsics.checkNotNullParameter(mapUpdateProducer, "mapUpdateProducer");
        this.addressEditConfirmButtonView = addressEditConfirmButtonView;
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
        this.viewModel = viewModel;
        this.onBind = onBind;
        this.onWidgetDestroyed = onWidgetDestroyed;
        this.onClick = function1;
        this.references = references;
        this.metricView = addressEditConfirmButtonView;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(references, voHelper, AddressEditConfirmButtonVO.class).customActionHandlers(new AddressEditConfirmButtonStickyViewHolder$actionHandler$1(this)).onClick(new AddressEditConfirmButtonStickyViewHolder$actionHandler$2(this)).onComposerAction(new AddressEditConfirmButtonStickyViewHolder$actionHandler$3(this)).buildHandler();
        this.actionHandler = buildHandler;
        AddressEditConfirmButtonVO boundData = getBoundData();
        this.pvzSearcherActionObserver = new PvzSearcherActionObserver(references, mapUpdateProducer, null, buildHandler, boundData != null ? Long.valueOf(boundData.getId()) : null, 4, null);
        viewModel.getActions().observe(references.getContainer().g(), new AddressEditConfirmButtonStickyViewHolder$sam$androidx_lifecycle_Observer$0(new AnonymousClass1()));
    }

    @Override // d20.AbstractC6065b
    public View getMetricView() {
        return this.metricView;
    }

    @Override // d20.AbstractC6065b
    public void onWidgetDestroyed() {
        super.onWidgetDestroyed();
        AddressEditConfirmButtonView addressEditConfirmButtonView = this.addressEditConfirmButtonView;
        if (addressEditConfirmButtonView == null) {
            return;
        }
        this.onWidgetDestroyed.invoke(addressEditConfirmButtonView);
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull AddressEditConfirmButtonVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        AddressEditConfirmButtonView addressEditConfirmButtonView = this.addressEditConfirmButtonView;
        if (addressEditConfirmButtonView != null) {
            addressEditConfirmButtonView.bind(item.getButton(), item.getSharingButton(), this.actionHandler);
        }
        String updateLink = item.getUpdateLink();
        if (updateLink != null) {
            InterfaceC6511n<Map<String, String>, String, Boolean, Unit> interfaceC6511n = this.onBind;
            Map<String, String> dataForSend = item.getDataForSend();
            if (dataForSend == null) {
                dataForSend = U.c();
            }
            interfaceC6511n.invoke(dataForSend, updateLink, Boolean.TRUE);
        }
    }
}
