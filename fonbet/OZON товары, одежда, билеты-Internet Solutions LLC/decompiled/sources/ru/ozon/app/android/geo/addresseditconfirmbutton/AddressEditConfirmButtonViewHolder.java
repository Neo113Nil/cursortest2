package ru.ozon.app.android.geo.addresseditconfirmbutton;

import Vg.d;
import androidx.lifecycle.J;
import fd.InterfaceC6511n;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.geo.mapupdater.MapUpdateProducer;
import ru.ozon.app.android.geo.pvzSearcher.PvzSearcherActionObserver;
import ru.ozon.app.android.geo.pvzSearcher.PvzSearcherViewModel;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001Bw\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012*\u0010\u000f\u001a&\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\n\u0012\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00022\n\u0010\u001b\u001a\u00060\u0019j\u0002`\u001aH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0014¢\u0006\u0004\b \u0010!R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\"R\u0018\u0010\u0007\u001a\u00060\u0005j\u0002`\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010#R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010$R8\u0010\u000f\u001a&\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010%R\"\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010&R \u0010(\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u000e0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010&R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lru/ozon/app/android/geo/addresseditconfirmbutton/AddressEditConfirmButtonViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/geo/addresseditconfirmbutton/AddressEditConfirmButtonVO;", "Lru/ozon/app/android/geo/addresseditconfirmbutton/AddressEditConfirmButtonView;", "mainView", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/geo/pvzSearcher/PvzSearcherViewModel;", "viewModel", "Lkotlin/Function3;", "", "", "", "", "onBind", "Lkotlin/Function1;", "onClick", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lru/ozon/app/android/geo/mapupdater/MapUpdateProducer;", "mapUpdateProducer", "<init>", "(Lru/ozon/app/android/geo/addresseditconfirmbutton/AddressEditConfirmButtonView;LVg/d;Lru/ozon/app/android/geo/pvzSearcher/PvzSearcherViewModel;Lfd/n;Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/geo/mapupdater/MapUpdateProducer;)V", "item", "Ll20/d;", "Lru/ozon/composer/network/widget/item/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/geo/addresseditconfirmbutton/AddressEditConfirmButtonVO;Ll20/d;)V", "Landroidx/lifecycle/J;", "lifecycle", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "Lru/ozon/app/android/geo/addresseditconfirmbutton/AddressEditConfirmButtonView;", "LVg/d;", "Lru/ozon/app/android/geo/pvzSearcher/PvzSearcherViewModel;", "Lfd/n;", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lru/ozon/app/android/geo/pvzSearcher/PvzSearcherActionObserver;", "pvzSearcherActionObserver", "Lru/ozon/app/android/geo/pvzSearcher/PvzSearcherActionObserver;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddressEditConfirmButtonViewHolder extends k<AddressEditConfirmButtonVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final d customActionHandlersStoreFactory;

    @NotNull
    private final AddressEditConfirmButtonView mainView;

    @NotNull
    private final InterfaceC6511n<Map<String, String>, String, Boolean, Unit> onBind;
    private final Function1<String, Unit> onClick;

    @NotNull
    private final PvzSearcherActionObserver pvzSearcherActionObserver;

    @NotNull
    private final PvzSearcherViewModel viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AddressEditConfirmButtonViewHolder(@NotNull AddressEditConfirmButtonView mainView, @NotNull d customActionHandlersStoreFactory, @NotNull PvzSearcherViewModel viewModel, @NotNull InterfaceC6511n<? super Map<String, String>, ? super String, ? super Boolean, Unit> onBind, Function1<? super String, Unit> function1, @NotNull ComposerReferences references, @NotNull MapUpdateProducer mapUpdateProducer) {
        super(mainView);
        Intrinsics.checkNotNullParameter(mainView, "mainView");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(onBind, "onBind");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(mapUpdateProducer, "mapUpdateProducer");
        this.mainView = mainView;
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
        this.viewModel = viewModel;
        this.onBind = onBind;
        this.onClick = function1;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(references, this).customActionHandlers(new AddressEditConfirmButtonViewHolder$actionHandler$1(this)).onClick(new AddressEditConfirmButtonViewHolder$actionHandler$2(this)).onComposerAction(new AddressEditConfirmButtonViewHolder$actionHandler$3(this)).buildHandler();
        this.actionHandler = buildHandler;
        AddressEditConfirmButtonVO boundData = getBoundData();
        this.pvzSearcherActionObserver = new PvzSearcherActionObserver(references, mapUpdateProducer, null, buildHandler, boundData != null ? Long.valueOf(boundData.getId()) : null, 4, null);
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        this.viewModel.getActions().observe(lifecycle, new AddressEditConfirmButtonViewHolder$sam$androidx_lifecycle_Observer$0(new AddressEditConfirmButtonViewHolder$onAttachViewModel$1(this)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull AddressEditConfirmButtonVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.mainView.bind(item.getButton(), item.getSharingButton(), this.actionHandler);
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
