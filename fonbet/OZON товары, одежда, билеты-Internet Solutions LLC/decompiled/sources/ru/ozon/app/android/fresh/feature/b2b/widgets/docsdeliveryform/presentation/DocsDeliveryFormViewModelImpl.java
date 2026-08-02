package ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.presentation;

import Bc.i;
import Bc.k;
import Bc.m;
import Bc.q;
import Fy.C3065c;
import Xc.a;
import Xc.b;
import androidx.lifecycle.V;
import androidx.lifecycle.w0;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import io.reactivex.C;
import io.reactivex.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.I;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import mc.C8125a;
import nc.C8486a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import qc.InterfaceC9019a;
import ru.ozon.app.android.fresh.feature.b2b.R$string;
import ru.ozon.app.android.fresh.feature.b2b.domain.DocsDeliveryAddressResponse;
import ru.ozon.app.android.fresh.feature.b2b.domain.DocsDeliveryRepository;
import ru.ozon.app.android.fresh.feature.b2b.domain.DocsDeliveryRequest;
import ru.ozon.app.android.fresh.feature.b2b.domain.DocsDeliveryResponse;
import ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.presentation.DocsDeliveryFormVO;
import ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.presentation.DocsDeliveryFormViewModel;
import ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.presentation.DocsDeliveryFormViewModelImpl;
import ru.ozon.app.android.location.AreaLocalStore;
import ru.ozon.app.android.mapcommon.ozongeoproxyclient.OzonGeoProxyClient;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.app.android.utils.rx.RxExtKt;

@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 Q2\u00020\u00012\u00020\u0002:\u0002QRB!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ%\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u00132\b\u0010\u001c\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010 \u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\"\u0010#J%\u0010&\u001a\u00020\u00102\u0014\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00130$H\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u001fH\u0002¢\u0006\u0004\b(\u0010)J#\u0010,\u001a\u00020\u00102\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0*H\u0002¢\u0006\u0004\b,\u0010-J\u0013\u0010.\u001a\u00020\u001f*\u00020\u000bH\u0002¢\u0006\u0004\b.\u0010/J\u0013\u00100\u001a\u00020\u001f*\u00020\u000bH\u0002¢\u0006\u0004\b0\u0010/J\u001d\u00103\u001a\b\u0012\u0004\u0012\u000202012\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b3\u00104J\u0019\u00106\u001a\u0004\u0018\u0001052\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b6\u00107J\u0019\u0010:\u001a\u0004\u0018\u00010\u00132\u0006\u00109\u001a\u000208H\u0002¢\u0006\u0004\b:\u0010;J\u0019\u0010<\u001a\u0004\u0018\u00010\u001f2\u0006\u00109\u001a\u000208H\u0002¢\u0006\u0004\b<\u0010=R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010>R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010?R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010@R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0A8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010B\u001a\u0004\bC\u0010DR&\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0A8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010B\u001a\u0004\bE\u0010DR \u0010G\u001a\b\u0012\u0004\u0012\u00020\u001f0F8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR \u0010L\u001a\b\u0012\u0004\u0012\u00020K0F8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bL\u0010H\u001a\u0004\bM\u0010JR\u0014\u0010O\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010P¨\u0006S"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/DocsDeliveryFormViewModelImpl;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/DocsDeliveryFormViewModel;", "Lru/ozon/app/android/fresh/feature/b2b/domain/DocsDeliveryRepository;", "docsDeliveryRepository", "Lru/ozon/app/android/mapcommon/ozongeoproxyclient/OzonGeoProxyClient;", "ozonGeoProxyClient", "Lru/ozon/app/android/location/AreaLocalStore;", "areaLocalStore", "<init>", "(Lru/ozon/app/android/fresh/feature/b2b/domain/DocsDeliveryRepository;Lru/ozon/app/android/mapcommon/ozongeoproxyclient/OzonGeoProxyClient;Lru/ozon/app/android/location/AreaLocalStore;)V", "Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/DocsDeliveryFormVO$Input$TextInput;", "addressInput", "", "Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/DocsDeliveryFormVO$Input;", "inputs", "", "bindInputs", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/DocsDeliveryFormVO$Input$TextInput;Ljava/util/List;)V", "", FormPageDTO.Field.FIELD_TYPE_ADDRESS, "updateAddress", "(Ljava/lang/String;)V", "Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/DocsDeliveryFormViewModel$DeliveryFormData;", "deliveryFormData", "onDeliverySubmitted", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/DocsDeliveryFormViewModel$DeliveryFormData;)V", "fieldName", "newValue", "onTextInputChanged", "(Ljava/lang/String;Ljava/lang/String;)V", "", "onCheckedChanged", "(Ljava/lang/String;Z)V", "onCleared", "()V", "", "errors", "setFieldsErrors", "(Ljava/util/Map;)V", "validateInputs", "()Z", "Lkotlin/Function1;", "transform", "postInputsUpdate", "(Lkotlin/jvm/functions/Function1;)V", "isNoSatisfiedByMask", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/DocsDeliveryFormVO$Input$TextInput;)Z", "postIndexInvalid", "Lio/reactivex/y;", "Lru/ozon/app/android/fresh/feature/b2b/domain/DocsDeliveryResponse;", "requestDelivery", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/DocsDeliveryFormViewModel$DeliveryFormData;)Lio/reactivex/y;", "Lru/ozon/app/android/fresh/feature/b2b/domain/DocsDeliveryRequest;", "getDeliveryRequest", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/DocsDeliveryFormViewModel$DeliveryFormData;)Lru/ozon/app/android/fresh/feature/b2b/domain/DocsDeliveryRequest;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/DocsDeliveryFormViewModelImpl$FormField;", "field", "getTextInputValue", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/DocsDeliveryFormViewModelImpl$FormField;)Ljava/lang/String;", "getCheckBoxValue", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/DocsDeliveryFormViewModelImpl$FormField;)Ljava/lang/Boolean;", "Lru/ozon/app/android/fresh/feature/b2b/domain/DocsDeliveryRepository;", "Lru/ozon/app/android/mapcommon/ozongeoproxyclient/OzonGeoProxyClient;", "Lru/ozon/app/android/location/AreaLocalStore;", "Landroidx/lifecycle/V;", "Landroidx/lifecycle/V;", "getAddressInput", "()Landroidx/lifecycle/V;", "getInputs", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "loadingState", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "getLoadingState", "()Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/DocsDeliveryFormViewModel$Action;", "action", "getAction", "Lnc/a;", "compositeDisposable", "Lnc/a;", "Companion", "FormField", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DocsDeliveryFormViewModelImpl extends w0 implements DocsDeliveryFormViewModel {

    @NotNull
    private final SingleLiveEvent<DocsDeliveryFormViewModel.Action> action;

    @NotNull
    private final V<DocsDeliveryFormVO.Input.TextInput> addressInput;

    @NotNull
    private final AreaLocalStore areaLocalStore;

    @NotNull
    private final C8486a compositeDisposable;

    @NotNull
    private final DocsDeliveryRepository docsDeliveryRepository;

    @NotNull
    private final V<List<DocsDeliveryFormVO.Input>> inputs;

    @NotNull
    private final SingleLiveEvent<Boolean> loadingState;

    @NotNull
    private final OzonGeoProxyClient ozonGeoProxyClient;
    public static final int $stable = 8;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/DocsDeliveryFormViewModelImpl$FormField;", "", "fieldName", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getFieldName", "()Ljava/lang/String;", "ADDRESS", "FIRST_NAME", "LAST_NAME", "PATRONYMIC", "PHONE", "INDEX", "DISABLE_PATRONYMIC", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FormField {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ FormField[] $VALUES;

        @NotNull
        private final String fieldName;
        public static final FormField ADDRESS = new FormField("ADDRESS", 0, FormPageDTO.Field.FIELD_TYPE_ADDRESS);
        public static final FormField FIRST_NAME = new FormField("FIRST_NAME", 1, "firstName");
        public static final FormField LAST_NAME = new FormField("LAST_NAME", 2, "lastName");
        public static final FormField PATRONYMIC = new FormField("PATRONYMIC", 3, "patronymic");
        public static final FormField PHONE = new FormField("PHONE", 4, "phone");
        public static final FormField INDEX = new FormField("INDEX", 5, "index");
        public static final FormField DISABLE_PATRONYMIC = new FormField("DISABLE_PATRONYMIC", 6, "disablePatronymic");

        private static final /* synthetic */ FormField[] $values() {
            return new FormField[]{ADDRESS, FIRST_NAME, LAST_NAME, PATRONYMIC, PHONE, INDEX, DISABLE_PATRONYMIC};
        }

        static {
            FormField[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private FormField(String str, int i11, String str2) {
            this.fieldName = str2;
        }

        public static FormField valueOf(String str) {
            return (FormField) Enum.valueOf(FormField.class, str);
        }

        public static FormField[] values() {
            return (FormField[]) $VALUES.clone();
        }

        @NotNull
        public final String getFieldName() {
            return this.fieldName;
        }
    }

    public DocsDeliveryFormViewModelImpl(@NotNull DocsDeliveryRepository docsDeliveryRepository, @NotNull OzonGeoProxyClient ozonGeoProxyClient, @NotNull AreaLocalStore areaLocalStore) {
        Intrinsics.checkNotNullParameter(docsDeliveryRepository, "docsDeliveryRepository");
        Intrinsics.checkNotNullParameter(ozonGeoProxyClient, "ozonGeoProxyClient");
        Intrinsics.checkNotNullParameter(areaLocalStore, "areaLocalStore");
        this.docsDeliveryRepository = docsDeliveryRepository;
        this.ozonGeoProxyClient = ozonGeoProxyClient;
        this.areaLocalStore = areaLocalStore;
        this.addressInput = new V<>();
        this.inputs = new V<>();
        this.loadingState = new SingleLiveEvent<>();
        this.action = new SingleLiveEvent<>();
        this.compositeDisposable = new C8486a();
        ozonGeoProxyClient.setAppName("b2b-bx-android", areaLocalStore.getLocationUid());
    }

    private final Boolean getCheckBoxValue(FormField field) {
        Object obj;
        List<DocsDeliveryFormVO.Input> value = getInputs().getValue();
        if (value != null) {
            Iterator<T> it = value.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.d(((DocsDeliveryFormVO.Input) obj).getName(), field.getFieldName())) {
                    break;
                }
            }
            DocsDeliveryFormVO.Input input = (DocsDeliveryFormVO.Input) obj;
            if (input != null) {
                DocsDeliveryFormVO.Input.CheckBoxInput checkBoxInput = input instanceof DocsDeliveryFormVO.Input.CheckBoxInput ? (DocsDeliveryFormVO.Input.CheckBoxInput) input : null;
                if (checkBoxInput != null) {
                    return Boolean.valueOf(checkBoxInput.getChecked());
                }
            }
        }
        return null;
    }

    private final DocsDeliveryRequest getDeliveryRequest(DocsDeliveryFormViewModel.DeliveryFormData deliveryFormData) {
        Integer w02;
        String value;
        String orderId = deliveryFormData.getOrderId();
        String deliveryVariantId = deliveryFormData.getDeliveryVariantId();
        DocsDeliveryFormVO.Input.TextInput value2 = getAddressInput().getValue();
        String str = (value2 == null || (value = value2.getValue()) == null) ? "" : value;
        String textInputValue = getTextInputValue(FormField.PHONE);
        String str2 = textInputValue == null ? "" : textInputValue;
        String textInputValue2 = getTextInputValue(FormField.FIRST_NAME);
        String str3 = textInputValue2 == null ? "" : textInputValue2;
        String textInputValue3 = getTextInputValue(FormField.LAST_NAME);
        String str4 = textInputValue3 == null ? "" : textInputValue3;
        String textInputValue4 = getTextInputValue(FormField.PATRONYMIC);
        String textInputValue5 = getTextInputValue(FormField.INDEX);
        if (textInputValue5 == null || (w02 = h.w0(textInputValue5)) == null) {
            return null;
        }
        int intValue = w02.intValue();
        Boolean checkBoxValue = getCheckBoxValue(FormField.DISABLE_PATRONYMIC);
        return new DocsDeliveryRequest(orderId, deliveryVariantId, str, str2, str3, str4, checkBoxValue != null ? checkBoxValue.booleanValue() : false, intValue, textInputValue4, null, UserVerificationMethods.USER_VERIFY_NONE, null);
    }

    private final String getTextInputValue(FormField field) {
        Object obj;
        List<DocsDeliveryFormVO.Input> value = getInputs().getValue();
        if (value != null) {
            Iterator<T> it = value.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.d(((DocsDeliveryFormVO.Input) obj).getName(), field.getFieldName())) {
                    break;
                }
            }
            DocsDeliveryFormVO.Input input = (DocsDeliveryFormVO.Input) obj;
            if (input != null) {
                DocsDeliveryFormVO.Input.TextInput textInput = input instanceof DocsDeliveryFormVO.Input.TextInput ? (DocsDeliveryFormVO.Input.TextInput) input : null;
                if (textInput != null) {
                    return textInput.getValue();
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isNoSatisfiedByMask(DocsDeliveryFormVO.Input.TextInput textInput) {
        String value = textInput.getValue();
        if (value == null || h.K(value)) {
            return true;
        }
        return (textInput.getMask() == null || textInput.getMask().length() == textInput.getValue().length()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C onDeliverySubmitted$lambda$5$lambda$0(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (C) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onDeliverySubmitted$lambda$5$lambda$2(DocsDeliveryFormViewModelImpl docsDeliveryFormViewModelImpl) {
        docsDeliveryFormViewModelImpl.getLoadingState().setValue(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean postIndexInvalid(DocsDeliveryFormVO.Input.TextInput textInput) {
        String value;
        Character F11;
        return Intrinsics.d(textInput.getName(), FormField.INDEX.getFieldName()) && (value = textInput.getValue()) != null && (F11 = h.F(value)) != null && F11.charValue() == '0';
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void postInputsUpdate(Function1<? super DocsDeliveryFormVO.Input, ? extends DocsDeliveryFormVO.Input> transform) {
        V<List<DocsDeliveryFormVO.Input>> inputs = getInputs();
        List<DocsDeliveryFormVO.Input> value = inputs.getValue();
        if (value != null) {
            List<DocsDeliveryFormVO.Input> list = value;
            ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(transform.invoke(it.next()));
            }
            inputs.postValue(arrayList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final y<DocsDeliveryResponse> requestDelivery(DocsDeliveryFormViewModel.DeliveryFormData deliveryFormData) {
        y<DocsDeliveryResponse> requestDocsDelivery;
        DocsDeliveryRequest deliveryRequest = getDeliveryRequest(deliveryFormData);
        if (deliveryRequest != null && (requestDocsDelivery = this.docsDeliveryRepository.requestDocsDelivery(deliveryRequest)) != null) {
            return requestDocsDelivery;
        }
        q f7 = y.f(new DocsDeliveryResponse(false, null, null));
        Intrinsics.checkNotNullExpressionValue(f7, "just(...)");
        return f7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setFieldsErrors(Map<String, String> errors) {
        FormField formField = FormField.ADDRESS;
        if (errors.containsKey(formField.getFieldName())) {
            V<DocsDeliveryFormVO.Input.TextInput> addressInput = getAddressInput();
            DocsDeliveryFormVO.Input.TextInput value = getAddressInput().getValue();
            addressInput.setValue(value != null ? DocsDeliveryFormVO.Input.TextInput.copy$default(value, null, null, false, null, null, errors.get(formField.getFieldName()), false, 95, null) : null);
        }
        postInputsUpdate(new DocsDeliveryFormViewModelImpl$setFieldsErrors$1(errors));
    }

    private final boolean validateInputs() {
        I i11 = new I();
        i11.f71783a = true;
        DocsDeliveryFormVO.Input.TextInput value = getAddressInput().getValue();
        String value2 = value != null ? value.getValue() : null;
        if (value2 == null || value2.length() == 0) {
            V<DocsDeliveryFormVO.Input.TextInput> addressInput = getAddressInput();
            DocsDeliveryFormVO.Input.TextInput value3 = getAddressInput().getValue();
            addressInput.setValue(value3 != null ? DocsDeliveryFormVO.Input.TextInput.copy$default(value3, null, null, false, null, null, StringProvider.getString(R$string.error_docs_delivery_empty_field_android), false, 95, null) : null);
            i11.f71783a = false;
        }
        postInputsUpdate(new DocsDeliveryFormViewModelImpl$validateInputs$1(this, i11));
        return i11.f71783a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.presentation.DocsDeliveryFormViewModel
    public void bindInputs(@NotNull DocsDeliveryFormVO.Input.TextInput addressInput, @NotNull List<? extends DocsDeliveryFormVO.Input> inputs) {
        Intrinsics.checkNotNullParameter(addressInput, "addressInput");
        Intrinsics.checkNotNullParameter(inputs, "inputs");
        getAddressInput().setValue(addressInput);
        getInputs().postValue(inputs);
    }

    @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.presentation.DocsDeliveryFormViewModel
    public void onCheckedChanged(@NotNull String fieldName, boolean newValue) {
        Intrinsics.checkNotNullParameter(fieldName, "fieldName");
        postInputsUpdate(new DocsDeliveryFormViewModelImpl$onCheckedChanged$1(fieldName, newValue));
    }

    @Override // androidx.lifecycle.w0
    protected void onCleared() {
        this.ozonGeoProxyClient.setAppName("ozonapp_android", this.areaLocalStore.getLocationUid());
    }

    @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.presentation.DocsDeliveryFormViewModel
    public void onDeliverySubmitted(@NotNull DocsDeliveryFormViewModel.DeliveryFormData deliveryFormData) {
        DocsDeliveryFormVO.Input.TextInput value;
        String value2;
        Intrinsics.checkNotNullParameter(deliveryFormData, "deliveryFormData");
        if (!validateInputs() || (value = getAddressInput().getValue()) == null || (value2 = value.getValue()) == null) {
            return;
        }
        C8486a c8486a = this.compositeDisposable;
        y<DocsDeliveryAddressResponse> checkDocsDeliveryAddress = this.docsDeliveryRepository.checkDocsDeliveryAddress(value2);
        DM.h hVar = new DM.h(new DocsDeliveryFormViewModelImpl$onDeliverySubmitted$1$1(this, deliveryFormData), 2);
        checkDocsDeliveryAddress.getClass();
        InterfaceC8487b h11 = new k(new i(new m(checkDocsDeliveryAddress, hVar).j(Mc.a.b()).g(C8125a.a()), new GH.a(new DocsDeliveryFormViewModelImpl$onDeliverySubmitted$1$2(this), 3)), new InterfaceC9019a() { // from class: Nu.b
            @Override // qc.InterfaceC9019a
            public final void run() {
                DocsDeliveryFormViewModelImpl.onDeliverySubmitted$lambda$5$lambda$2(DocsDeliveryFormViewModelImpl.this);
            }
        }).h(new GH.b(new DocsDeliveryFormViewModelImpl$onDeliverySubmitted$1$4(this), 3), new C3065c(new DocsDeliveryFormViewModelImpl$onDeliverySubmitted$1$5(this), 2));
        Intrinsics.checkNotNullExpressionValue(h11, "subscribe(...)");
        RxExtKt.plusAssign(c8486a, h11);
    }

    @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.presentation.DocsDeliveryFormViewModel
    public void onTextInputChanged(@NotNull String fieldName, String newValue) {
        Intrinsics.checkNotNullParameter(fieldName, "fieldName");
        postInputsUpdate(new DocsDeliveryFormViewModelImpl$onTextInputChanged$1(fieldName, newValue));
    }

    @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.presentation.DocsDeliveryFormViewModel
    public void updateAddress(@NotNull String address) {
        Intrinsics.checkNotNullParameter(address, "address");
        V<DocsDeliveryFormVO.Input.TextInput> addressInput = getAddressInput();
        DocsDeliveryFormVO.Input.TextInput value = getAddressInput().getValue();
        addressInput.setValue(value != null ? DocsDeliveryFormVO.Input.TextInput.copy$default(value, null, null, false, address, null, null, false, 87, null) : null);
    }

    @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.presentation.DocsDeliveryFormViewModel
    @NotNull
    public SingleLiveEvent<DocsDeliveryFormViewModel.Action> getAction() {
        return this.action;
    }

    @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.presentation.DocsDeliveryFormViewModel
    @NotNull
    public V<DocsDeliveryFormVO.Input.TextInput> getAddressInput() {
        return this.addressInput;
    }

    @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.presentation.DocsDeliveryFormViewModel
    @NotNull
    public V<List<DocsDeliveryFormVO.Input>> getInputs() {
        return this.inputs;
    }

    @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.presentation.DocsDeliveryFormViewModel
    @NotNull
    public SingleLiveEvent<Boolean> getLoadingState() {
        return this.loadingState;
    }
}
