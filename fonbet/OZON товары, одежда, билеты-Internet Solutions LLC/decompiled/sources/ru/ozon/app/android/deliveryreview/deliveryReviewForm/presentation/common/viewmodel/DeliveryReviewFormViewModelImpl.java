package ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.common.viewmodel;

import Ae.O0;
import Ae.x0;
import androidx.lifecycle.V;
import androidx.lifecycle.w0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.C7748h;
import kotlin.sequences.l;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.OrderChangePreferences;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.data.mapper.SendDeliveryReviewFormRequestMapper;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.common.model.ControllingToggleState;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.common.validator.BaseDeliveryReviewValidator;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.common.validator.CheckboxAndTextareaValidator;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.common.validator.DeliveryReviewComponentValidator;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.common.validator.DeliveryReviewFormValidator;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.common.validator.DeliveryReviewGroupValidator;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.common.viewmodel.DeliveryReviewFormViewModel;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.ComponentVO;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.ElementVO;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.item.DeliveryReviewItemVO;
import ru.ozon.app.android.session.deleteAccount.data.DeleteAccountApiResponse;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.uni.atoms.data.text.TextDTO;
import xe.C10727i;

@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010$\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0007\b\u0000\u0018\u0000 `2\u00020\u00012\u00020\u0002:\u0001`BA\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u001c\u001a\u00020\u001b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u001a\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J%\u0010)\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020&2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020&0\u0017H\u0016¢\u0006\u0004\b)\u0010*J'\u0010.\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020&2\u0006\u0010,\u001a\u00020&2\u0006\u0010-\u001a\u00020\u0013H\u0016¢\u0006\u0004\b.\u0010/J-\u00103\u001a\u00020\u001b2\u0006\u00100\u001a\u00020&2\u0014\u00102\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020&\u0018\u000101H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u001bH\u0016¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u001bH\u0016¢\u0006\u0004\b7\u00106J\u0017\u00109\u001a\u00020\u001b2\u0006\u00108\u001a\u00020&H\u0016¢\u0006\u0004\b9\u0010:R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010;R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010<R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010=R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010>R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010?R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010@R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010AR \u0010D\u001a\b\u0012\u0004\u0012\u00020C0B8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR \u0010I\u001a\b\u0012\u0004\u0012\u00020\u00130H8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR \u0010N\u001a\b\u0012\u0004\u0012\u00020M0H8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bN\u0010J\u001a\u0004\bO\u0010LR \u0010P\u001a\b\u0012\u0004\u0012\u00020\"0B8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bP\u0010E\u001a\u0004\bQ\u0010GR \u0010S\u001a\b\u0012\u0004\u0012\u00020R0B8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bS\u0010E\u001a\u0004\bT\u0010GR&\u0010V\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170U8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR \u0010[\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u001e0Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0016\u0010#\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010]R\u0016\u0010^\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_¨\u0006a"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/viewmodel/DeliveryReviewFormViewModelImpl;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/viewmodel/DeliveryReviewFormViewModel;", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/validator/DeliveryReviewComponentValidator;", "componentValidator", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/validator/DeliveryReviewFormValidator;", "formValidator", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/validator/DeliveryReviewGroupValidator;", "groupValidator", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/validator/CheckboxAndTextareaValidator;", "customCheckboxAndTextareaValidator", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "repository", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/mapper/SendDeliveryReviewFormRequestMapper;", "requestMapper", "Lru/ozon/app/android/account/orders/OrderChangePreferences;", "orderChangePreferences", "<init>", "(Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/validator/DeliveryReviewComponentValidator;Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/validator/DeliveryReviewFormValidator;Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/validator/DeliveryReviewGroupValidator;Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/validator/CheckboxAndTextareaValidator;Lru/ozon/app/android/action/v2/ActionV2Repository;Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/mapper/SendDeliveryReviewFormRequestMapper;Lru/ozon/app/android/account/orders/OrderChangePreferences;)V", "", "needToScroll", "validate", "(Z)Z", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "list", "isChecked", "", "updateInformersList", "(Ljava/util/List;Z)V", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/item/DeliveryReviewItemVO;", "group", "updateGroup", "(Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/item/DeliveryReviewItemVO;)V", "", "rating", "updateRating", "(I)V", "", "componentId", "photos", "updatePhotos", "(Ljava/lang/String;Ljava/util/List;)V", "dependedComponentId", "selectControllingComponentId", "checked", "updateToggleSelection", "(Ljava/lang/String;Ljava/lang/String;Z)V", "actionName", "", "params", "sendForm", "(Ljava/lang/String;Ljava/util/Map;)V", "checkValidationIfNeed", "()V", "resetValidation", "text", "updateAnnotationAfterUseTextArea", "(Ljava/lang/String;)V", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/validator/DeliveryReviewComponentValidator;", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/validator/DeliveryReviewFormValidator;", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/validator/DeliveryReviewGroupValidator;", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/validator/CheckboxAndTextareaValidator;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/mapper/SendDeliveryReviewFormRequestMapper;", "Lru/ozon/app/android/account/orders/OrderChangePreferences;", "Landroidx/lifecycle/V;", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/validator/BaseDeliveryReviewValidator$ValidationResult;", DeleteAccountApiResponse.Error.TYPE_VALIDATION, "Landroidx/lifecycle/V;", "getValidation", "()Landroidx/lifecycle/V;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "loadingState", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "getLoadingState", "()Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/viewmodel/DeliveryReviewFormViewModel$Action;", "action", "getAction", "scroll", "getScroll", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/model/ControllingToggleState;", "controllingToggleState", "getControllingToggleState", "LAe/x0;", "informerList", "LAe/x0;", "getInformerList", "()LAe/x0;", "", "groups", "Ljava/util/Map;", "I", "lastValidationSuccess", "Z", "Companion", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DeliveryReviewFormViewModelImpl extends w0 implements DeliveryReviewFormViewModel {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final SingleLiveEvent<DeliveryReviewFormViewModel.Action> action;

    @NotNull
    private final DeliveryReviewComponentValidator componentValidator;

    @NotNull
    private final V<ControllingToggleState> controllingToggleState;

    @NotNull
    private final CheckboxAndTextareaValidator customCheckboxAndTextareaValidator;

    @NotNull
    private final DeliveryReviewFormValidator formValidator;

    @NotNull
    private final DeliveryReviewGroupValidator groupValidator;

    @NotNull
    private final Map<Integer, DeliveryReviewItemVO> groups;

    @NotNull
    private final x0<List<TextDTO>> informerList;
    private boolean lastValidationSuccess;

    @NotNull
    private final SingleLiveEvent<Boolean> loadingState;

    @NotNull
    private final OrderChangePreferences orderChangePreferences;
    private int rating;

    @NotNull
    private final ActionV2Repository repository;

    @NotNull
    private final SendDeliveryReviewFormRequestMapper requestMapper;

    @NotNull
    private final V<Integer> scroll;

    @NotNull
    private final V<BaseDeliveryReviewValidator.ValidationResult> validation;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/viewmodel/DeliveryReviewFormViewModelImpl$Companion;", "", "<init>", "()V", "SCROLL_TO_OFFSET", "", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public DeliveryReviewFormViewModelImpl(@NotNull DeliveryReviewComponentValidator componentValidator, @NotNull DeliveryReviewFormValidator formValidator, @NotNull DeliveryReviewGroupValidator groupValidator, @NotNull CheckboxAndTextareaValidator customCheckboxAndTextareaValidator, @NotNull ActionV2Repository repository, @NotNull SendDeliveryReviewFormRequestMapper requestMapper, @NotNull OrderChangePreferences orderChangePreferences) {
        Intrinsics.checkNotNullParameter(componentValidator, "componentValidator");
        Intrinsics.checkNotNullParameter(formValidator, "formValidator");
        Intrinsics.checkNotNullParameter(groupValidator, "groupValidator");
        Intrinsics.checkNotNullParameter(customCheckboxAndTextareaValidator, "customCheckboxAndTextareaValidator");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(requestMapper, "requestMapper");
        Intrinsics.checkNotNullParameter(orderChangePreferences, "orderChangePreferences");
        this.componentValidator = componentValidator;
        this.formValidator = formValidator;
        this.groupValidator = groupValidator;
        this.customCheckboxAndTextareaValidator = customCheckboxAndTextareaValidator;
        this.repository = repository;
        this.requestMapper = requestMapper;
        this.orderChangePreferences = orderChangePreferences;
        this.validation = new V<>();
        this.loadingState = new SingleLiveEvent<>();
        this.action = new SingleLiveEvent<>();
        this.scroll = new V<>();
        this.controllingToggleState = new V<>();
        this.informerList = O0.a(K.f71697a);
        this.groups = new LinkedHashMap();
        this.lastValidationSuccess = true;
    }

    private final boolean validate(boolean needToScroll) {
        Integer position;
        Iterator it = C7714v.b0(this.customCheckboxAndTextareaValidator, this.componentValidator, this.groupValidator, this.formValidator).iterator();
        while (it.hasNext()) {
            BaseDeliveryReviewValidator.ValidationResult validate = ((BaseDeliveryReviewValidator) it.next()).validate(C7714v.U0(this.groups.values()));
            if (validate instanceof BaseDeliveryReviewValidator.ValidationResult.EmptyWithCheckboxError) {
                getValidation().setValue(validate);
                return false;
            }
            if (validate instanceof BaseDeliveryReviewValidator.ValidationResult.Error) {
                getValidation().setValue(validate);
                if (needToScroll && (position = ((BaseDeliveryReviewValidator.ValidationResult.Error) validate).getPosition()) != null) {
                    getScroll().setValue(Integer.valueOf(position.intValue() + 3));
                }
                this.lastValidationSuccess = false;
                return false;
            }
        }
        this.lastValidationSuccess = true;
        getValidation().setValue(BaseDeliveryReviewValidator.ValidationResult.Success.INSTANCE);
        return true;
    }

    public void checkValidationIfNeed() {
        if (this.lastValidationSuccess) {
            return;
        }
        validate(false);
    }

    @Override // ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.common.viewmodel.DeliveryReviewFormViewModel
    public void resetValidation() {
        getValidation().setValue(BaseDeliveryReviewValidator.ValidationResult.Success.INSTANCE);
    }

    @Override // ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.common.viewmodel.DeliveryReviewFormViewModel
    public void sendForm(@NotNull String actionName, Map<String, String> params) {
        Intrinsics.checkNotNullParameter(actionName, "actionName");
        if (validate(true)) {
            C10727i.c(androidx.lifecycle.x0.a(this), null, null, new DeliveryReviewFormViewModelImpl$sendForm$1(this, params, actionName, null), 3);
        }
    }

    @Override // ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.common.viewmodel.DeliveryReviewFormViewModel
    public void updateAnnotationAfterUseTextArea(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        if (text.length() >= 5) {
            resetValidation();
        }
    }

    @Override // ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.common.viewmodel.DeliveryReviewFormViewModel
    public void updateGroup(@NotNull DeliveryReviewItemVO group) {
        Intrinsics.checkNotNullParameter(group, "group");
        this.groups.put(Integer.valueOf(group.getGroupId()), group);
    }

    @Override // ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.common.viewmodel.DeliveryReviewFormViewModel
    public void updateInformersList(@NotNull List<TextDTO> list, boolean isChecked) {
        List<TextDTO> value;
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(list, "list");
        x0<List<TextDTO>> informerList = getInformerList();
        do {
            value = informerList.getValue();
            List<TextDTO> list2 = value;
            if (isChecked) {
                arrayList = C7714v.p0(list, list2);
            } else {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : list2) {
                    if (!list.contains((TextDTO) obj)) {
                        arrayList2.add(obj);
                    }
                }
                arrayList = arrayList2;
            }
        } while (!informerList.b(value, arrayList));
    }

    @Override // ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.common.viewmodel.DeliveryReviewFormViewModel
    public void updatePhotos(@NotNull String componentId, @NotNull List<String> photos) {
        Object obj;
        Intrinsics.checkNotNullParameter(componentId, "componentId");
        Intrinsics.checkNotNullParameter(photos, "photos");
        Iterator it = l.n(C7714v.w(this.groups.values()), DeliveryReviewFormViewModelImpl$updatePhotos$1.INSTANCE).iterator();
        while (true) {
            C7748h.a aVar = (C7748h.a) it;
            if (!aVar.hasNext()) {
                obj = null;
                break;
            } else {
                obj = aVar.next();
                if (Intrinsics.d(((ComponentVO) obj).getId(), componentId)) {
                    break;
                }
            }
        }
        ComponentVO componentVO = (ComponentVO) obj;
        Object element = componentVO != null ? componentVO.getElement() : null;
        ElementVO.UploadPhotos uploadPhotos = element instanceof ElementVO.UploadPhotos ? (ElementVO.UploadPhotos) element : null;
        if (uploadPhotos != null) {
            uploadPhotos.setValues(photos);
        }
        checkValidationIfNeed();
    }

    @Override // ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.common.viewmodel.DeliveryReviewFormViewModel
    public void updateRating(int rating) {
        this.rating = rating;
        this.groups.clear();
        getValidation().setValue(BaseDeliveryReviewValidator.ValidationResult.Success.INSTANCE);
        this.lastValidationSuccess = true;
        x0<List<TextDTO>> informerList = getInformerList();
        while (!informerList.b(informerList.getValue(), K.f71697a)) {
        }
    }

    @Override // ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.common.viewmodel.DeliveryReviewFormViewModel
    public void updateToggleSelection(@NotNull String dependedComponentId, @NotNull String selectControllingComponentId, boolean checked) {
        Object obj;
        Map<String, Boolean> linkedHashMap;
        Intrinsics.checkNotNullParameter(dependedComponentId, "dependedComponentId");
        Intrinsics.checkNotNullParameter(selectControllingComponentId, "selectControllingComponentId");
        Iterator it = l.n(C7714v.w(this.groups.values()), DeliveryReviewFormViewModelImpl$updateToggleSelection$1.INSTANCE).iterator();
        while (true) {
            C7748h.a aVar = (C7748h.a) it;
            if (!aVar.hasNext()) {
                obj = null;
                break;
            } else {
                obj = aVar.next();
                if (Intrinsics.d(((ComponentVO) obj).getId(), selectControllingComponentId)) {
                    break;
                }
            }
        }
        ComponentVO componentVO = (ComponentVO) obj;
        Object element = componentVO != null ? componentVO.getElement() : null;
        ElementVO.Toggle toggle = element instanceof ElementVO.Toggle ? (ElementVO.Toggle) element : null;
        if (toggle != null && toggle.getByUserSelected() == null) {
            V<ControllingToggleState> controllingToggleState = getControllingToggleState();
            String id2 = componentVO.getId();
            ControllingToggleState value = getControllingToggleState().getValue();
            if (value == null || (linkedHashMap = value.getDependedComponents()) == null) {
                linkedHashMap = new LinkedHashMap<>();
            }
            linkedHashMap.put(dependedComponentId, Boolean.valueOf(checked));
            Unit unit = Unit.f71690a;
            controllingToggleState.setValue(new ControllingToggleState(id2, linkedHashMap));
            ControllingToggleState value2 = getControllingToggleState().getValue();
            toggle.setSelected(value2 != null ? value2.anyDependedComponentSelected() : false);
        }
    }

    @Override // ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.common.viewmodel.DeliveryReviewFormViewModel
    @NotNull
    public SingleLiveEvent<DeliveryReviewFormViewModel.Action> getAction() {
        return this.action;
    }

    @Override // ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.common.viewmodel.DeliveryReviewFormViewModel
    @NotNull
    public V<ControllingToggleState> getControllingToggleState() {
        return this.controllingToggleState;
    }

    @Override // ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.common.viewmodel.DeliveryReviewFormViewModel
    @NotNull
    public x0<List<TextDTO>> getInformerList() {
        return this.informerList;
    }

    @Override // ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.common.viewmodel.DeliveryReviewFormViewModel
    @NotNull
    public SingleLiveEvent<Boolean> getLoadingState() {
        return this.loadingState;
    }

    @Override // ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.common.viewmodel.DeliveryReviewFormViewModel
    @NotNull
    public V<Integer> getScroll() {
        return this.scroll;
    }

    @Override // ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.common.viewmodel.DeliveryReviewFormViewModel
    @NotNull
    public V<BaseDeliveryReviewValidator.ValidationResult> getValidation() {
        return this.validation;
    }
}
