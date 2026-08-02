package ru.ozon.app.android.returns.actionModal.presentation.viewModel;

import Ae.B0;
import Ae.C0;
import Ae.C2399j;
import Ae.E0;
import Lm0.a;
import Sc.o;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.actionModal.data.ReturnActionModalRepository;
import ru.ozon.app.android.returns.actionModal.data.dto.processReturnAction.ProcessReturnActionRequestDto;
import ru.ozon.app.android.returns.actionModal.data.dto.processReturnAction.ProcessReturnActionResponseDto;
import ru.ozon.app.android.returns.actionModal.presentation.viewObject.ReturnActionModalVO;
import ru.ozon.app.android.returns.ui.data.components.Component;
import ru.ozon.app.android.returns.ui.data.components.RmsImageLocation;
import ru.ozon.app.android.returns.ui.data.components.RmsInputDto;
import ru.ozon.app.android.returns.ui.data.components.RmsTextAreaDto;
import ru.ozon.app.android.returns.ui.data.components.RmsUploadPhotosDto;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.C10727i;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J3\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u00070\nj\b\u0012\u0004\u0012\u00020\u0007`\u000b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012*\u00020\bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0007*\u00020\bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001a\u001a\u00020\u0019*\u00020\u00182\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J\u001d\u0010(\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u0018¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010*R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020,0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001d\u00100\u001a\b\u0012\u0004\u0012\u00020,0/8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103¨\u00064"}, d2 = {"Lru/ozon/app/android/returns/actionModal/presentation/viewModel/ReturnActionModalViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/returns/actionModal/data/ReturnActionModalRepository;", "repository", "<init>", "(Lru/ozon/app/android/returns/actionModal/data/ReturnActionModalRepository;)V", "", "", "Lru/ozon/app/android/returns/actionModal/presentation/viewObject/ReturnActionModalVO$ActionComponent;", "mappedComponents", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "findNotFilledFieldKeys", "(Ljava/util/Map;)Ljava/util/HashSet;", "actionComponent", "", "requiredAndEmpty", "(Lru/ozon/app/android/returns/actionModal/presentation/viewObject/ReturnActionModalVO$ActionComponent;)Z", "", "Lru/ozon/app/android/returns/ui/data/components/RmsImageLocation;", "getImageLocations", "(Lru/ozon/app/android/returns/actionModal/presentation/viewObject/ReturnActionModalVO$ActionComponent;)Ljava/util/List;", "getText", "(Lru/ozon/app/android/returns/actionModal/presentation/viewObject/ReturnActionModalVO$ActionComponent;)Ljava/lang/String;", "Lru/ozon/app/android/returns/actionModal/presentation/viewObject/ReturnActionModalVO;", "Lru/ozon/app/android/returns/actionModal/data/dto/processReturnAction/ProcessReturnActionRequestDto;", "toRequest", "(Lru/ozon/app/android/returns/actionModal/presentation/viewObject/ReturnActionModalVO;Ljava/util/Map;)Lru/ozon/app/android/returns/actionModal/data/dto/processReturnAction/ProcessReturnActionRequestDto;", "Lru/ozon/app/android/returns/actionModal/data/dto/processReturnAction/ProcessReturnActionResponseDto;", "response", "", "onSuccessResponse", "(Lru/ozon/app/android/returns/actionModal/data/dto/processReturnAction/ProcessReturnActionResponseDto;)V", "", "exception", "onErrorResponse", "(Ljava/lang/Throwable;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "returnActionModal", "onSubmitButtonClicked", "(Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/returns/actionModal/presentation/viewObject/ReturnActionModalVO;)V", "Lru/ozon/app/android/returns/actionModal/data/ReturnActionModalRepository;", "LAe/w0;", "Lru/ozon/app/android/returns/actionModal/presentation/viewModel/ReturnActionEffect;", "_effects", "LAe/w0;", "LAe/B0;", "effects", "LAe/B0;", "getEffects", "()LAe/B0;", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnActionModalViewModel extends w0 {

    @NotNull
    private final Ae.w0<ReturnActionEffect> _effects;

    @NotNull
    private final B0<ReturnActionEffect> effects;

    @NotNull
    private final ReturnActionModalRepository repository;

    public ReturnActionModalViewModel(@NotNull ReturnActionModalRepository repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.repository = repository;
        C0 b11 = E0.b(0, 0, null, 7);
        this._effects = b11;
        this.effects = C2399j.a(b11);
    }

    private final HashSet<String> findNotFilledFieldKeys(Map<String, ReturnActionModalVO.ActionComponent> mappedComponents) {
        HashSet<String> hashSet = new HashSet<>();
        for (Map.Entry<String, ReturnActionModalVO.ActionComponent> entry : mappedComponents.entrySet()) {
            String key = entry.getKey();
            if (requiredAndEmpty(entry.getValue())) {
                hashSet.add(key);
            }
        }
        return hashSet;
    }

    private final List<RmsImageLocation> getImageLocations(ReturnActionModalVO.ActionComponent actionComponent) {
        Component component = actionComponent.getComponent();
        RmsUploadPhotosDto rmsUploadPhotosDto = component instanceof RmsUploadPhotosDto ? (RmsUploadPhotosDto) component : null;
        if (rmsUploadPhotosDto != null) {
            return rmsUploadPhotosDto.getImageLocations();
        }
        return null;
    }

    private final String getText(ReturnActionModalVO.ActionComponent actionComponent) {
        Component component = actionComponent.getComponent();
        if (component instanceof RmsInputDto) {
            return ((RmsInputDto) actionComponent.getComponent()).getValue();
        }
        if (component instanceof RmsTextAreaDto) {
            return ((RmsTextAreaDto) actionComponent.getComponent()).getValue();
        }
        if (component instanceof RmsUploadPhotosDto) {
            return null;
        }
        throw new o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onErrorResponse(Throwable exception) {
        a.f17149a.e(exception);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSuccessResponse(ProcessReturnActionResponseDto response) {
        if (response.getSuccess()) {
            C10727i.c(x0.a(this), null, null, new ReturnActionModalViewModel$onSuccessResponse$1(this, response, null), 3);
        } else {
            C10727i.c(x0.a(this), null, null, new ReturnActionModalViewModel$onSuccessResponse$2(this, response, null), 3);
        }
    }

    private final boolean requiredAndEmpty(ReturnActionModalVO.ActionComponent actionComponent) {
        Component component = actionComponent.getComponent();
        if (!component.isRequired()) {
            return false;
        }
        if (component instanceof RmsInputDto) {
            String value = ((RmsInputDto) component).getValue();
            return value == null || h.K(value);
        }
        if (component instanceof RmsTextAreaDto) {
            String value2 = ((RmsTextAreaDto) component).getValue();
            return value2 == null || h.K(value2);
        }
        if (!(component instanceof RmsUploadPhotosDto)) {
            throw new o();
        }
        List<String> value3 = ((RmsUploadPhotosDto) component).getValue();
        return value3 == null || value3.isEmpty();
    }

    private final ProcessReturnActionRequestDto toRequest(ReturnActionModalVO returnActionModalVO, Map<String, ReturnActionModalVO.ActionComponent> map) {
        ProcessReturnActionRequestDto.TrackingInfo trackingInfo;
        String text;
        ReturnActionModalVO.ActionComponent actionComponent = map.get("clientReturnDeliveryPrice");
        if (actionComponent == null || (text = getText(actionComponent)) == null) {
            trackingInfo = null;
        } else {
            ReturnActionModalVO.ActionComponent actionComponent2 = map.get("deliveryService");
            String text2 = actionComponent2 != null ? getText(actionComponent2) : null;
            ReturnActionModalVO.ActionComponent actionComponent3 = map.get("trackingNumber");
            trackingInfo = new ProcessReturnActionRequestDto.TrackingInfo(text, actionComponent3 != null ? getText(actionComponent3) : null, text2);
        }
        ReturnActionModalVO.ActionComponent actionComponent4 = map.get("comment");
        String text3 = actionComponent4 != null ? getText(actionComponent4) : null;
        String returnNumber = returnActionModalVO.getReturnNumber();
        Map<String, String> extraValues = returnActionModalVO.getExtraValues();
        String action = returnActionModalVO.getAction();
        ReturnActionModalVO.ActionComponent actionComponent5 = map.get("images");
        return new ProcessReturnActionRequestDto(returnNumber, action, text3, trackingInfo, extraValues, actionComponent5 != null ? getImageLocations(actionComponent5) : null);
    }

    @NotNull
    public final B0<ReturnActionEffect> getEffects() {
        return this.effects;
    }

    public final void onSubmitButtonClicked(@NotNull AtomAction action, @NotNull ReturnActionModalVO returnActionModal) {
        String actionName;
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(returnActionModal, "returnActionModal");
        List<ReturnActionModalVO.ActionComponent> components = returnActionModal.getComponents();
        if (components == null) {
            components = K.f71697a;
        }
        List<ReturnActionModalVO.ActionComponent> list = components;
        int h11 = U.h(C7714v.z(list, 10));
        if (h11 < 16) {
            h11 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(h11);
        for (Object obj : list) {
            linkedHashMap.put(((ReturnActionModalVO.ActionComponent) obj).getKey(), obj);
        }
        HashSet<String> findNotFilledFieldKeys = findNotFilledFieldKeys(linkedHashMap);
        if (!findNotFilledFieldKeys.isEmpty()) {
            C10727i.c(x0.a(this), null, null, new ReturnActionModalViewModel$onSubmitButtonClicked$1(this, findNotFilledFieldKeys, null), 3);
            return;
        }
        ProcessReturnActionRequestDto request = toRequest(returnActionModal, linkedHashMap);
        AtomAction.ComposerAction composerAction = action instanceof AtomAction.ComposerAction ? (AtomAction.ComposerAction) action : null;
        if (composerAction == null || (actionName = composerAction.getActionName()) == null) {
            return;
        }
        C10727i.c(x0.a(this), null, null, new ReturnActionModalViewModel$onSubmitButtonClicked$2(this, actionName, request, null), 3);
    }
}
