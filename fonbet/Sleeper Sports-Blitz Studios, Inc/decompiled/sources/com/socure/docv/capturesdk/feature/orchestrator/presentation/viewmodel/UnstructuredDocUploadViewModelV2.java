package com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel;

import androidx.lifecycle.ViewModel;
import com.socure.docv.capturesdk.common.analytics.AnalyticsConstantsKt;
import com.socure.docv.capturesdk.common.analytics.MixPanelAgent;
import com.socure.docv.capturesdk.feature.orchestrator.LaunchCameraUseCase;
import com.socure.docv.capturesdk.feature.orchestrator.OpenFilePickerUseCase;
import com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.IUnstructuredDocUploadViewModel;
import com.socure.docv.capturesdk.models.UnstructuredModuleModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: UnstructuredDocUploadViewModelV2.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/socure/docv/capturesdk/feature/orchestrator/presentation/viewmodel/UnstructuredDocUploadViewModelV2;", "Landroidx/lifecycle/ViewModel;", "Lcom/socure/docv/capturesdk/feature/orchestrator/presentation/viewmodel/IUnstructuredDocUploadViewModel;", "model", "Lcom/socure/docv/capturesdk/models/UnstructuredModuleModel;", "openFilePickerUseCase", "Lcom/socure/docv/capturesdk/feature/orchestrator/OpenFilePickerUseCase;", "launchCameraUseCase", "Lcom/socure/docv/capturesdk/feature/orchestrator/LaunchCameraUseCase;", "mixPanelAgent", "Lcom/socure/docv/capturesdk/common/analytics/MixPanelAgent;", "(Lcom/socure/docv/capturesdk/models/UnstructuredModuleModel;Lcom/socure/docv/capturesdk/feature/orchestrator/OpenFilePickerUseCase;Lcom/socure/docv/capturesdk/feature/orchestrator/LaunchCameraUseCase;Lcom/socure/docv/capturesdk/common/analytics/MixPanelAgent;)V", "_state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/socure/docv/capturesdk/feature/orchestrator/presentation/viewmodel/IUnstructuredDocUploadViewModel$State;", "state", "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "onEvent", "", "event", "Lcom/socure/docv/capturesdk/feature/orchestrator/presentation/viewmodel/UnstructuredDocUploadEvent;", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class UnstructuredDocUploadViewModelV2 extends ViewModel implements IUnstructuredDocUploadViewModel {
    private final MutableStateFlow<IUnstructuredDocUploadViewModel.State> _state;
    private final LaunchCameraUseCase launchCameraUseCase;
    private final MixPanelAgent mixPanelAgent;
    private final OpenFilePickerUseCase openFilePickerUseCase;
    private final StateFlow<IUnstructuredDocUploadViewModel.State> state;

    /* compiled from: UnstructuredDocUploadViewModelV2.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UnstructuredDocUploadEvent.values().length];
            try {
                iArr[UnstructuredDocUploadEvent.UPLOAD_BUTTON_CLICKED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UnstructuredDocUploadEvent.SCAN_BUTTON_CLICKED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public UnstructuredDocUploadViewModelV2(UnstructuredModuleModel model, OpenFilePickerUseCase openFilePickerUseCase, LaunchCameraUseCase launchCameraUseCase, MixPanelAgent mixPanelAgent) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(openFilePickerUseCase, "openFilePickerUseCase");
        Intrinsics.checkNotNullParameter(launchCameraUseCase, "launchCameraUseCase");
        Intrinsics.checkNotNullParameter(mixPanelAgent, "mixPanelAgent");
        this.openFilePickerUseCase = openFilePickerUseCase;
        this.launchCameraUseCase = launchCameraUseCase;
        this.mixPanelAgent = mixPanelAgent;
        List<String> collectionMethods = model.getCollectionMethods();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collectionMethods, 10));
        Iterator<T> it = collectionMethods.iterator();
        while (it.hasNext()) {
            String lowerCase = ((String) it.next()).toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            arrayList.add(lowerCase);
        }
        boolean z = arrayList.contains(UnstructuredDocViewModelExtKt.UPLOAD);
        List<String> collectionMethods2 = model.getCollectionMethods();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(collectionMethods2, 10));
        Iterator<T> it2 = collectionMethods2.iterator();
        while (it2.hasNext()) {
            String lowerCase2 = ((String) it2.next()).toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
            arrayList2.add(lowerCase2);
        }
        boolean z2 = arrayList2.contains(UnstructuredDocViewModelExtKt.CAPTURE);
        List<String> uploadFileTypes = model.getUploadFileTypes();
        Integer currentVerificationCount = model.getCurrentVerificationCount();
        int intValue = currentVerificationCount != null ? currentVerificationCount.intValue() : 1;
        Integer totalVerificationCount = model.getTotalVerificationCount();
        int intValue2 = totalVerificationCount != null ? totalVerificationCount.intValue() : 1;
        String currentDocument = model.getCurrentDocument();
        String transitionHeaderText = model.getTransitionHeaderText();
        String documentUploadCounter = model.getDocumentUploadCounter();
        String transitionInstructionsPrimaryText = model.getTransitionInstructionsPrimaryText();
        UnstructuredModuleModel.MobileLabels mobile = model.getMobile();
        String documentDescription = mobile != null ? mobile.getDocumentDescription() : null;
        UnstructuredModuleModel.MobileLabels mobile2 = model.getMobile();
        String optionsFileSize = mobile2 != null ? mobile2.getOptionsFileSize() : null;
        String str = documentDescription + " " + (optionsFileSize == null ? "" : optionsFileSize);
        UnstructuredModuleModel.MobileLabels mobile3 = model.getMobile();
        String optionsFileSize2 = mobile3 != null ? mobile3.getOptionsFileSize() : null;
        String str2 = optionsFileSize2 == null ? "" : optionsFileSize2;
        UnstructuredModuleModel.MobileLabels mobile4 = model.getMobile();
        String uploadDocumentButton = mobile4 != null ? mobile4.getUploadDocumentButton() : null;
        UnstructuredModuleModel.MobileLabels mobile5 = model.getMobile();
        MutableStateFlow<IUnstructuredDocUploadViewModel.State> MutableStateFlow = StateFlowKt.MutableStateFlow(new IUnstructuredDocUploadViewModel.State(false, z, z2, uploadFileTypes, intValue, intValue2, new IUnstructuredDocUploadViewModel.State.Labels(currentDocument, transitionHeaderText, documentUploadCounter, transitionInstructionsPrimaryText, str, str2, uploadDocumentButton, mobile5 != null ? mobile5.getScanDocumentButton() : null), 1, null));
        this._state = MutableStateFlow;
        this.state = MutableStateFlow;
    }

    @Override // com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.IUnstructuredDocUploadViewModel
    public StateFlow<IUnstructuredDocUploadViewModel.State> getState() {
        return this.state;
    }

    @Override // com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.IUnstructuredDocUploadViewModel
    public void onEvent(UnstructuredDocUploadEvent event) {
        String[] strArr;
        List list;
        Intrinsics.checkNotNullParameter(event, "event");
        int i = WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            this.mixPanelAgent.sendEvent(AnalyticsConstantsKt.KEY_TAKE_PHOTO_BUTTON_CLICK, new Pair[0]);
            this.launchCameraUseCase.invoke();
            return;
        }
        this.mixPanelAgent.sendEvent(AnalyticsConstantsKt.KEY_UPLOAD_BUTTON_CLICK, new Pair[0]);
        String[] mimeTypes = UnstructuredDocViewModelExtKt.toMimeTypes(this._state.getValue());
        if (mimeTypes == null || (list = ArraysKt.toList(mimeTypes)) == null || (strArr = (String[]) list.toArray(new String[0])) == null) {
            strArr = new String[0];
        }
        this.openFilePickerUseCase.invoke(strArr);
    }
}
