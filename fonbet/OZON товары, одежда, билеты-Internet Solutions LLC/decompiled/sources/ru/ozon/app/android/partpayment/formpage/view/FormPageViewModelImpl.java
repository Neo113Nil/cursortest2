package ru.ozon.app.android.partpayment.formpage.view;

import BT.b;
import Bc.f;
import Bc.i;
import Cw.c;
import Dp.C2877a;
import Lm0.a;
import Lz.C3602a;
import Lz.d;
import Nc.C3667a;
import Sc.o;
import android.content.Intent;
import androidx.lifecycle.w0;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.reactivex.k;
import io.reactivex.p;
import io.reactivex.x;
import io.reactivex.y;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import mc.C8125a;
import nc.C8486a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import qc.InterfaceC9019a;
import ru.ozon.app.android.partpayment.formpage.data.autocomplete.MaskAutocompleteDTO;
import ru.ozon.app.android.partpayment.formpage.data.autocomplete.MaskAutocompleteRepository;
import ru.ozon.app.android.partpayment.formpage.data.photo.PhotoRepository;
import ru.ozon.app.android.partpayment.formpage.data.validation.PassFormRepository;
import ru.ozon.app.android.partpayment.formpage.view.FormPageViewModel;
import ru.ozon.app.android.partpayment.formpage.view.FormPageViewModelImpl;
import ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO;
import ru.ozon.app.android.partpayment.formpage.view.vo.PassFormVO;
import ru.ozon.app.android.utils.WhenExtKt;
import ru.ozon.app.android.utils.livedata.BroadcastSingleLiveEvent;
import ru.ozon.app.android.utils.rx.RxExtKt;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import sc.C9653a;
import xc.C10699b;

@Metadata(d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00140\u00130\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001f\u0010\u001eJ'\u0010$\u001a\u00020\r2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 2\u0006\u0010#\u001a\u00020 H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\r2\u0006\u0010&\u001a\u00020 H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\r2\u0006\u0010&\u001a\u00020 H\u0016¢\u0006\u0004\b)\u0010(J\u0017\u0010*\u001a\u00020\r2\u0006\u0010&\u001a\u00020 H\u0016¢\u0006\u0004\b*\u0010(J\u0017\u0010+\u001a\u00020\r2\u0006\u0010&\u001a\u00020 H\u0016¢\u0006\u0004\b+\u0010(J\u0017\u0010.\u001a\u00020\r2\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/J!\u00104\u001a\u00020\r2\u0006\u00101\u001a\u0002002\b\u00103\u001a\u0004\u0018\u000102H\u0016¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\rH\u0016¢\u0006\u0004\b6\u0010\u0011J\u000f\u00107\u001a\u00020\rH\u0014¢\u0006\u0004\b7\u0010\u0011J\r\u00108\u001a\u00020\r¢\u0006\u0004\b8\u0010\u0011J\u0017\u0010:\u001a\u00020\r2\u0006\u0010\u001c\u001a\u000209H\u0002¢\u0006\u0004\b:\u0010;J\u0017\u0010=\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020<H\u0002¢\u0006\u0004\b=\u0010>J#\u0010A\u001a\u00020\r2\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020 0?H\u0002¢\u0006\u0004\bA\u0010BJ\u001f\u0010D\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020<2\u0006\u0010C\u001a\u00020 H\u0002¢\u0006\u0004\bD\u0010EJ\u001f\u0010G\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020F2\u0006\u00103\u001a\u000202H\u0002¢\u0006\u0004\bG\u0010HJ1\u0010N\u001a\u00020\r2\u0006\u0010J\u001a\u00020I2\u0006\u0010K\u001a\u00020\u00142\u0010\b\u0002\u0010M\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010LH\u0002¢\u0006\u0004\bN\u0010OJ\u0019\u0010Q\u001a\u00020\r2\b\b\u0002\u0010P\u001a\u00020\u0014H\u0002¢\u0006\u0004\bQ\u0010RJ\u001d\u0010U\u001a\u00020\r2\f\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00170SH\u0002¢\u0006\u0004\bU\u0010VR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010WR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010XR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010YR \u0010\\\u001a\b\u0012\u0004\u0012\u00020[0Z8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_R \u0010b\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020a0`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010e\u001a\u00020d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0016\u0010g\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u001a\u0010j\u001a\b\u0012\u0004\u0012\u00020\u00140i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\f\u0010lR \u0010n\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00170m8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u0018\u0010p\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010qR\u0018\u0010r\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010s¨\u0006t"}, d2 = {"Lru/ozon/app/android/partpayment/formpage/view/FormPageViewModelImpl;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/partpayment/formpage/view/FormPageViewModel;", "Lru/ozon/app/android/partpayment/formpage/data/validation/PassFormRepository;", "passFormRepository", "Lru/ozon/app/android/partpayment/formpage/data/autocomplete/MaskAutocompleteRepository;", "autocompleteRepository", "Lru/ozon/app/android/partpayment/formpage/data/photo/PhotoRepository;", "photoRepository", "<init>", "(Lru/ozon/app/android/partpayment/formpage/data/validation/PassFormRepository;Lru/ozon/app/android/partpayment/formpage/data/autocomplete/MaskAutocompleteRepository;Lru/ozon/app/android/partpayment/formpage/data/photo/PhotoRepository;)V", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO;", "page", "", "bind", "(Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO;)V", "releaseBindLock", "()V", "Lio/reactivex/p;", "Lkotlin/Pair;", "", "pageSource", "()Lio/reactivex/p;", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "force", "onFieldChanged", "(Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field;Z)V", "field", "onPickerClick", "(Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field;)V", "onButtonClick", "", AppMeasurementSdk.ConditionalUserProperty.NAME, ImagesContract.URL, SearchIntents.EXTRA_QUERY, "onAutocompleteRequested", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "deeplink", "onNewPaymentMethodSelected", "(Ljava/lang/String;)V", "onEditFormClicked", "onActionClicked", "onReportErrorClicked", "Lru/ozon/app/android/partpayment/formpage/view/FormPageViewModel$RetryInfo;", "retryInfo", "onRetryClick", "(Lru/ozon/app/android/partpayment/formpage/view/FormPageViewModel$RetryInfo;)V", "", "requestCode", "Landroid/content/Intent;", "data", "onActivityResult", "(ILandroid/content/Intent;)V", "onStart", "onCleared", "onSummaryRefreshTimer", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$ValidateButton;", "passForm", "(Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$ValidateButton;)V", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$UploadPhotoButton;", "processUpload", "(Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$UploadPhotoButton;)V", "", "errors", "setErrors", "(Ljava/util/Map;)V", "photoFilePath", "sendPhoto", "(Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$UploadPhotoButton;Ljava/lang/String;)V", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Picker;", "extractModalPickerValue", "(Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Picker;Landroid/content/Intent;)V", "Lru/ozon/app/android/partpayment/formpage/view/vo/PassFormVO;", "it", "returnBack", "Lkotlin/Function0;", "successCallback", "processPassFormResult", "(Lru/ozon/app/android/partpayment/formpage/view/vo/PassFormVO;ZLkotlin/jvm/functions/Function0;)V", "silent", "postChanges", "(Z)V", "", "fields", "extractValues", "(Ljava/util/List;)V", "Lru/ozon/app/android/partpayment/formpage/data/validation/PassFormRepository;", "Lru/ozon/app/android/partpayment/formpage/data/autocomplete/MaskAutocompleteRepository;", "Lru/ozon/app/android/partpayment/formpage/data/photo/PhotoRepository;", "Lru/ozon/app/android/utils/livedata/BroadcastSingleLiveEvent;", "Lru/ozon/app/android/partpayment/formpage/view/FormPageViewModel$Action;", "action", "Lru/ozon/app/android/utils/livedata/BroadcastSingleLiveEvent;", "getAction", "()Lru/ozon/app/android/utils/livedata/BroadcastSingleLiveEvent;", "", "Lnc/b;", "autocompleteDisposables", "Ljava/util/Map;", "Lnc/a;", "disposables", "Lnc/a;", "isInitialized", "Z", "LNc/a;", "subject", "LNc/a;", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO;", "Ljava/util/concurrent/ConcurrentHashMap;", "changedValues", "Ljava/util/concurrent/ConcurrentHashMap;", "uploadPhotoTargetField", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$UploadPhotoButton;", "modalPickerTargetField", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Picker;", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FormPageViewModelImpl extends w0 implements FormPageViewModel {

    @NotNull
    private final BroadcastSingleLiveEvent<FormPageViewModel.Action> action;

    @NotNull
    private final Map<String, InterfaceC8487b> autocompleteDisposables;

    @NotNull
    private final MaskAutocompleteRepository autocompleteRepository;

    @NotNull
    private final ConcurrentHashMap<String, FormPageVO.Field> changedValues;

    @NotNull
    private final C8486a disposables;
    private boolean isInitialized;
    private FormPageVO.Field.Picker modalPickerTargetField;
    private FormPageVO page;

    @NotNull
    private final PassFormRepository passFormRepository;

    @NotNull
    private final PhotoRepository photoRepository;

    @NotNull
    private final C3667a<Boolean> subject;
    private FormPageVO.Field.UploadPhotoButton uploadPhotoTargetField;

    public FormPageViewModelImpl(@NotNull PassFormRepository passFormRepository, @NotNull MaskAutocompleteRepository autocompleteRepository, @NotNull PhotoRepository photoRepository) {
        Intrinsics.checkNotNullParameter(passFormRepository, "passFormRepository");
        Intrinsics.checkNotNullParameter(autocompleteRepository, "autocompleteRepository");
        Intrinsics.checkNotNullParameter(photoRepository, "photoRepository");
        this.passFormRepository = passFormRepository;
        this.autocompleteRepository = autocompleteRepository;
        this.photoRepository = photoRepository;
        this.action = new BroadcastSingleLiveEvent<>();
        this.autocompleteDisposables = new LinkedHashMap();
        this.disposables = new C8486a();
        C3667a<Boolean> d11 = C3667a.d();
        Intrinsics.checkNotNullExpressionValue(d11, "create(...)");
        this.subject = d11;
        this.changedValues = new ConcurrentHashMap<>();
    }

    private final void extractModalPickerValue(FormPageVO.Field.Picker field, Intent data) {
        FormPageVO.Field field2;
        FormPageVO.Field copyWithValue$default;
        FormPageVO.Field.Options.Picker picker = (FormPageVO.Field.Options.Picker) data.getParcelableExtra("EXTRA_SELECTED_OPTION");
        if (picker == null || (field2 = this.changedValues.get(field.getName())) == null || (copyWithValue$default = FormPageVO.Field.copyWithValue$default(field2, picker.getValue(), picker.getDisplayValue(), null, 4, null)) == null) {
            return;
        }
        this.changedValues.put(field.getName(), copyWithValue$default);
        postChanges$default(this, false, 1, null);
    }

    private final void extractValues(List<? extends FormPageVO.Field> fields) {
        this.changedValues.clear();
        for (FormPageVO.Field field : fields) {
            if (!h.K(field.getName())) {
                this.changedValues.put(field.getName(), field);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair pageSource$lambda$0(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (Pair) function1.invoke(p02);
    }

    private final void passForm(FormPageVO.Field.ValidateButton field) {
        C8486a c8486a = this.disposables;
        PassFormRepository passFormRepository = this.passFormRepository;
        String validationURL = field.getValidationURL();
        ConcurrentHashMap<String, FormPageVO.Field> concurrentHashMap = this.changedValues;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, FormPageVO.Field> entry : concurrentHashMap.entrySet()) {
            if (entry.getKey().length() > 0) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(U.h(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key = entry2.getKey();
            String value = ((FormPageVO.Field) entry2.getValue()).getValue();
            if (value == null) {
                value = "";
            }
            linkedHashMap2.put(key, value);
        }
        y<PassFormVO> passForm = passFormRepository.passForm(validationURL, linkedHashMap2);
        b bVar = new b(new FormPageViewModelImpl$passForm$3(this), 3);
        passForm.getClass();
        InterfaceC8487b h11 = new f(new i(passForm, bVar).g(C8125a.a()), new InterfaceC9019a() { // from class: WB.d
            @Override // qc.InterfaceC9019a
            public final void run() {
                FormPageViewModelImpl.passForm$lambda$12(FormPageViewModelImpl.this);
            }
        }).h(new d(new FormPageViewModelImpl$passForm$5(this, field), 1), new C2877a(new FormPageViewModelImpl$passForm$6(this), 4));
        Intrinsics.checkNotNullExpressionValue(h11, "subscribe(...)");
        RxExtKt.plusAssign(c8486a, h11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void passForm$lambda$12(FormPageViewModelImpl formPageViewModelImpl) {
        formPageViewModelImpl.getAction().setValue(new FormPageViewModel.Action.Loading(false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void postChanges(boolean silent) {
        this.subject.onNext(Boolean.valueOf(silent));
    }

    static /* synthetic */ void postChanges$default(FormPageViewModelImpl formPageViewModelImpl, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        formPageViewModelImpl.postChanges(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void processPassFormResult(PassFormVO it, boolean returnBack, Function0<Unit> successCallback) {
        FormPageViewModel.Action alert;
        String deeplink = it.getDeeplink();
        if (deeplink == null || deeplink.length() == 0 || !returnBack) {
            String deeplink2 = it.getDeeplink();
            if (deeplink2 == null || deeplink2.length() == 0) {
                String message = it.getMessage();
                alert = (message == null || message.length() == 0) ? null : new FormPageViewModel.Action.Alert(it.getMessage(), null, 2, 0 == true ? 1 : 0);
            } else {
                alert = new FormPageViewModel.Action.ShowPage(it.getDeeplink(), true);
                if (successCallback != null) {
                    successCallback.invoke();
                }
            }
        } else {
            alert = FormPageViewModel.Action.GoBack.INSTANCE;
        }
        Map<String, String> fields = it.getFields();
        if (fields != null && !fields.isEmpty()) {
            setErrors(it.getFields());
            postChanges(false);
        }
        if (alert != null) {
            getAction().setValue(alert);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void processPassFormResult$default(FormPageViewModelImpl formPageViewModelImpl, PassFormVO passFormVO, boolean z11, Function0 function0, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            function0 = null;
        }
        formPageViewModelImpl.processPassFormResult(passFormVO, z11, function0);
    }

    private final void processUpload(FormPageVO.Field.UploadPhotoButton field) {
        this.uploadPhotoTargetField = field;
        BroadcastSingleLiveEvent<FormPageViewModel.Action> action = getAction();
        OzonSpannableString description = field.getDescription();
        action.setValue(new FormPageViewModel.Action.ShowCameraScreen(description != null ? description.toString() : null, field.getBorderRatio(), Boolean.valueOf(field.getUploadFromGallery())));
    }

    private final void sendPhoto(FormPageVO.Field.UploadPhotoButton field, String photoFilePath) {
        C8486a c8486a = this.disposables;
        y<PassFormVO> uploadPhoto = this.photoRepository.uploadPhoto(field.getUploadUrl(), photoFilePath);
        C3602a c3602a = new C3602a(new FormPageViewModelImpl$sendPhoto$1(this), 3);
        uploadPhoto.getClass();
        InterfaceC8487b h11 = new f(new i(uploadPhoto, c3602a).g(C8125a.a()), new InterfaceC9019a() { // from class: WB.c
            @Override // qc.InterfaceC9019a
            public final void run() {
                FormPageViewModelImpl.sendPhoto$lambda$17(FormPageViewModelImpl.this);
            }
        }).h(new AA.d(new FormPageViewModelImpl$sendPhoto$3(this, field), 6), new c(new FormPageViewModelImpl$sendPhoto$4(this, field, photoFilePath), 6));
        Intrinsics.checkNotNullExpressionValue(h11, "subscribe(...)");
        RxExtKt.plusAssign(c8486a, h11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendPhoto$lambda$17(FormPageViewModelImpl formPageViewModelImpl) {
        formPageViewModelImpl.getAction().setValue(new FormPageViewModel.Action.Loading(false));
    }

    private final void setErrors(Map<String, String> errors) {
        for (Map.Entry<String, FormPageVO.Field> entry : this.changedValues.entrySet()) {
            String key = entry.getKey();
            FormPageVO.Field value = entry.getValue();
            this.changedValues.put(key, value.copyWithValue(value.getValue(), value.getDisplayValue(), errors.get(key)));
        }
    }

    public void bind(@NotNull FormPageVO page) {
        Intrinsics.checkNotNullParameter(page, "page");
        if (this.isInitialized) {
            return;
        }
        this.isInitialized = true;
        this.page = page;
        extractValues(page.getFields());
        postChanges$default(this, false, 1, null);
    }

    @Override // ru.ozon.app.android.partpayment.formpage.view.FormPageViewModel
    public void onActionClicked(@NotNull String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        getAction().setValue(new FormPageViewModel.Action.ShowPage(deeplink, false, 2, null));
    }

    @Override // ru.ozon.app.android.partpayment.formpage.view.FormPageViewModel
    public void onActivityResult(int requestCode, Intent data) {
        FormPageVO.Field.Picker picker;
        if (requestCode != 205) {
            if (requestCode != 206) {
                a.f17149a.e(String.valueOf(data), new Object[0]);
                return;
            } else {
                getAction().setValue(FormPageViewModel.Action.Refresh.INSTANCE);
                return;
            }
        }
        if (data == null || (picker = this.modalPickerTargetField) == null) {
            return;
        }
        extractModalPickerValue(picker, data);
    }

    @Override // ru.ozon.app.android.partpayment.formpage.view.FormPageViewModel
    public void onAutocompleteRequested(@NotNull String name, @NotNull String url, @NotNull String query) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(query, "query");
        FormPageVO.Field field = this.changedValues.get(name);
        if (Intrinsics.d(field != null ? field.getDisplayValue() : null, query)) {
            return;
        }
        k<List<MaskAutocompleteDTO.Value>> autocompleteSuggest = this.autocompleteRepository.getAutocompleteSuggest(url, query);
        x a11 = C8125a.a();
        autocompleteSuggest.getClass();
        xc.k kVar = new xc.k(autocompleteSuggest, a11);
        C10699b c10699b = new C10699b(new IJ.a(new FormPageViewModelImpl$onAutocompleteRequested$disposable$1(this), 2), new AA.a(new FormPageViewModelImpl$onAutocompleteRequested$disposable$2(a.f17149a), 4), C9653a.f98523c);
        kVar.a(c10699b);
        InterfaceC8487b interfaceC8487b = this.autocompleteDisposables.get(url);
        if (interfaceC8487b != null) {
            interfaceC8487b.dispose();
        }
        this.autocompleteDisposables.put(url, c10699b);
        RxExtKt.plusAssign(this.disposables, c10699b);
    }

    @Override // ru.ozon.app.android.partpayment.formpage.view.FormPageViewModel
    public void onButtonClick(@NotNull FormPageVO.Field field) {
        Intrinsics.checkNotNullParameter(field, "field");
        if (field instanceof FormPageVO.Field.ValidateButton) {
            passForm((FormPageVO.Field.ValidateButton) field);
            return;
        }
        if (field instanceof FormPageVO.Field.UploadPhotoButton) {
            processUpload((FormPageVO.Field.UploadPhotoButton) field);
            return;
        }
        boolean z11 = false;
        if (!(field instanceof FormPageVO.Field.ApproveButton)) {
            a.f17149a.e("Unsupported action btn", new Object[0]);
            return;
        }
        FormPageVO.Field.ApproveButton approveButton = (FormPageVO.Field.ApproveButton) field;
        if (approveButton.getDeeplink() != null) {
            getAction().setValue(new FormPageViewModel.Action.ShowPage(approveButton.getDeeplink(), z11, 2, null));
        }
    }

    @Override // androidx.lifecycle.w0
    protected void onCleared() {
        this.autocompleteDisposables.clear();
        this.disposables.d();
        super.onCleared();
    }

    @Override // ru.ozon.app.android.partpayment.formpage.view.FormPageViewModel
    public void onEditFormClicked(@NotNull String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        getAction().setValue(new FormPageViewModel.Action.ShowPage(deeplink, true));
    }

    @Override // ru.ozon.app.android.partpayment.formpage.view.FormPageViewModel
    public void onFieldChanged(@NotNull FormPageVO.Field value, boolean force) {
        FormPageVO.Field copyWithValue$default;
        Intrinsics.checkNotNullParameter(value, "value");
        FormPageVO.Field field = this.changedValues.get(value.getName());
        if (field != null && (copyWithValue$default = FormPageVO.Field.copyWithValue$default(field, value.getValue(), value.getDisplayValue(), null, 4, null)) != null) {
            this.changedValues.put(value.getName(), copyWithValue$default);
        }
        postChanges(!force);
    }

    @Override // ru.ozon.app.android.partpayment.formpage.view.FormPageViewModel
    public void onNewPaymentMethodSelected(@NotNull String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        getAction().setValue(new FormPageViewModel.Action.ShowPage(deeplink, false, 2, null));
    }

    @Override // ru.ozon.app.android.partpayment.formpage.view.FormPageViewModel
    public void onPickerClick(@NotNull FormPageVO.Field field) {
        Intrinsics.checkNotNullParameter(field, "field");
        FormPageVO.Field.Picker picker = (FormPageVO.Field.Picker) field;
        this.modalPickerTargetField = picker;
        getAction().setValue(new FormPageViewModel.Action.ShowPickerScreen(picker));
    }

    @Override // ru.ozon.app.android.partpayment.formpage.view.FormPageViewModel
    public void onReportErrorClicked(@NotNull String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        getAction().setValue(new FormPageViewModel.Action.ShowPage(deeplink, false, 2, null));
    }

    @Override // ru.ozon.app.android.partpayment.formpage.view.FormPageViewModel
    public void onRetryClick(@NotNull FormPageViewModel.RetryInfo retryInfo) {
        Intrinsics.checkNotNullParameter(retryInfo, "retryInfo");
        if (!(retryInfo instanceof FormPageViewModel.RetryInfo.UploadPhoto)) {
            throw new o();
        }
        FormPageViewModel.RetryInfo.UploadPhoto uploadPhoto = (FormPageViewModel.RetryInfo.UploadPhoto) retryInfo;
        sendPhoto(uploadPhoto.getField(), uploadPhoto.getPhotoFilePath());
        WhenExtKt.getExhaustive(Unit.f71690a);
    }

    @Override // ru.ozon.app.android.partpayment.formpage.view.FormPageViewModel
    public void onStart() {
        if (this.isInitialized) {
            FormPageVO formPageVO = this.page;
            if (formPageVO == null) {
                Intrinsics.n("page");
                throw null;
            }
            if (formPageVO.getRefreshOnBack()) {
                getAction().setValue(FormPageViewModel.Action.Refresh.INSTANCE);
            }
        }
    }

    public final void onSummaryRefreshTimer() {
        FormPageVO formPageVO = this.page;
        Object obj = null;
        if (formPageVO == null) {
            Intrinsics.n("page");
            throw null;
        }
        Iterator<T> it = formPageVO.getFields().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((FormPageVO.Field) next) instanceof FormPageVO.Field.Summary) {
                obj = next;
                break;
            }
        }
        FormPageVO.Field field = (FormPageVO.Field) obj;
        if (field == null || !((FormPageVO.Field.Summary) field).getShowLoader()) {
            return;
        }
        getAction().setValue(FormPageViewModel.Action.Refresh.INSTANCE);
    }

    @Override // ru.ozon.app.android.partpayment.formpage.view.FormPageViewModel
    @NotNull
    public p<Pair<FormPageVO, Boolean>> pageSource() {
        p map = this.subject.map(new HX.a(new FormPageViewModelImpl$pageSource$1(this), 3));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public void releaseBindLock() {
        this.isInitialized = false;
    }

    @Override // ru.ozon.app.android.partpayment.formpage.view.FormPageViewModel
    @NotNull
    public BroadcastSingleLiveEvent<FormPageViewModel.Action> getAction() {
        return this.action;
    }
}
