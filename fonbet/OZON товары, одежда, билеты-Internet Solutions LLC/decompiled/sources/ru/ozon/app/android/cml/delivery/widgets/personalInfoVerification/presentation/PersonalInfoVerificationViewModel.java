package ru.ozon.app.android.cml.delivery.widgets.personalInfoVerification.presentation;

import Ae.C2399j;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import He.b;
import T00.m;
import Wc.a;
import androidx.lifecycle.w0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import h3.C6788a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cml.delivery.widgets.personalInfoVerification.data.PersonalInfoVerificationDTO;
import ru.ozon.app.android.cml.delivery.widgets.personalInfoVerification.data.mapper.PersonalInfoVerificationAsyncUpdateMapper;
import ru.ozon.app.android.cml.delivery.widgets.personalInfoVerification.presentation.PersonalInfoAsyncUpdateUiState;
import ru.ozon.app.android.composer.widgets.async.data.ComposerAsyncWidgetRepository;
import ru.ozon.app.android.composer.widgets.async.data.api.ComposerAsyncWidgetResponse;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 42\u00020\u0001:\u00014B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0082@¢\u0006\u0004\b\f\u0010\rJ1\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u001c\u001a\u00020\u000b2\n\u0010\u0019\u001a\u00060\u0017j\u0002`\u00182\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010 \u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u000f¢\u0006\u0004\b \u0010!J\u0015\u0010$\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J#\u0010&\u001a\u00020\u000b2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010(R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010)R\u001e\u0010\u0019\u001a\n\u0018\u00010\u0017j\u0004\u0018\u0001`\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010*R\u0018\u0010+\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010-\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010,R\u0018\u0010.\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010,R\u0018\u0010/\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010,R\u0018\u00100\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010,R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u00101R\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0014028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u00103¨\u00065"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/presentation/PersonalInfoVerificationViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;", "asyncWidgetRepository", "Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/data/mapper/PersonalInfoVerificationAsyncUpdateMapper;", "asyncUpdateMapper", "<init>", "(Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/data/mapper/PersonalInfoVerificationAsyncUpdateMapper;)V", "Lru/ozon/app/android/composer/widgets/async/data/api/ComposerAsyncWidgetResponse;", "Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/data/PersonalInfoVerificationDTO;", "response", "", "handleAsyncUpdate", "(Lru/ozon/app/android/composer/widgets/async/data/api/ComposerAsyncWidgetResponse;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "", "actionParams", "createPersonalInfoParamsMap", "(Ljava/util/Map;)Ljava/util/Map;", "LAe/M0;", "Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/presentation/PersonalInfoAsyncUpdateUiState;", "uiStateFlow", "()LAe/M0;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "", "isPatronymicCheckBoxSelected", "setWidgetInfo", "(Ll20/d;Z)V", "inputType", "inputValue", "onInputValueChange", "(Ljava/lang/String;Ljava/lang/String;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "handleAction", "(Lru/ozon/uni/atoms/af/AtomAction;)Lru/ozon/uni/atoms/af/AtomAction;", "updateWidget", "(Ljava/util/Map;)V", "Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;", "Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/data/mapper/PersonalInfoVerificationAsyncUpdateMapper;", "Ll20/d;", "surname", "Ljava/lang/String;", AppMeasurementSdk.ConditionalUserProperty.NAME, "patronymic", "birthDate", "passport", "Z", "LAe/x0;", "LAe/x0;", "Companion", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PersonalInfoVerificationViewModel extends w0 {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final PersonalInfoVerificationAsyncUpdateMapper asyncUpdateMapper;

    @NotNull
    private final ComposerAsyncWidgetRepository asyncWidgetRepository;
    private String birthDate;
    private boolean isPatronymicCheckBoxSelected;
    private String name;
    private String passport;
    private String patronymic;
    private String surname;

    @NotNull
    private final x0<PersonalInfoAsyncUpdateUiState> uiStateFlow;
    private d widgetInfo;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/presentation/PersonalInfoVerificationViewModel$Companion;", "", "<init>", "()V", "VALIDATE_PASSPORT_ACTION", "", "KEY_SURNAME", "KEY_NAME", "KEY_PATRONYMIC", "KEY_PATRONYMIC_CHECKBOX_SELECTED", "KEY_BIRTH_DATE", "KEY_PASSPORT", "EXTRA_BODY_PARAMS", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public PersonalInfoVerificationViewModel(@NotNull ComposerAsyncWidgetRepository asyncWidgetRepository, @NotNull PersonalInfoVerificationAsyncUpdateMapper asyncUpdateMapper) {
        Intrinsics.checkNotNullParameter(asyncWidgetRepository, "asyncWidgetRepository");
        Intrinsics.checkNotNullParameter(asyncUpdateMapper, "asyncUpdateMapper");
        this.asyncWidgetRepository = asyncWidgetRepository;
        this.asyncUpdateMapper = asyncUpdateMapper;
        this.isPatronymicCheckBoxSelected = true;
        this.uiStateFlow = O0.a(null);
    }

    private final Map<String, String> createPersonalInfoParamsMap(Map<String, String> actionParams) {
        Tc.d builder = new Tc.d();
        if (actionParams != null) {
            builder.putAll(actionParams);
        }
        String str = this.surname;
        if (str == null) {
            str = "";
        }
        builder.put("surname", str);
        String str2 = this.name;
        if (str2 == null) {
            str2 = "";
        }
        builder.put(AppMeasurementSdk.ConditionalUserProperty.NAME, str2);
        if (!this.isPatronymicCheckBoxSelected) {
            String str3 = this.patronymic;
            if (str3 == null) {
                str3 = "";
            }
            builder.put("middlename", str3);
        }
        builder.put("middlenameCheckbox", String.valueOf(this.isPatronymicCheckBoxSelected));
        String str4 = this.birthDate;
        if (str4 == null) {
            str4 = "";
        }
        builder.put("birthday", str4);
        String str5 = this.passport;
        builder.put("passportSeriesAndNumber", str5 != null ? str5 : "");
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object handleAsyncUpdate(ComposerAsyncWidgetResponse<PersonalInfoVerificationDTO> composerAsyncWidgetResponse, kotlin.coroutines.d<? super Unit> dVar) {
        d dVar2 = this.widgetInfo;
        if (dVar2 == null) {
            return Unit.f71690a;
        }
        PersonalInfoVerificationUpdate personalInfoVerificationUpdate = (PersonalInfoVerificationUpdate) C7714v.M(this.asyncUpdateMapper.invoke(composerAsyncWidgetResponse.getState(), dVar2));
        if (personalInfoVerificationUpdate != null) {
            Object emit = this.uiStateFlow.emit(new PersonalInfoAsyncUpdateUiState.Loaded(personalInfoVerificationUpdate, composerAsyncWidgetResponse.getTrackingPayloads()), dVar);
            if (emit == a.COROUTINE_SUSPENDED) {
                return emit;
            }
        }
        return Unit.f71690a;
    }

    @NotNull
    public final AtomAction handleAction(@NotNull AtomAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (!(action instanceof AtomAction.ComposerAction)) {
            return action;
        }
        AtomAction.ComposerAction composerAction = (AtomAction.ComposerAction) action;
        return Intrinsics.d(composerAction.getId(), "cmlValidatePassport") ? AtomAction.ComposerAction.copy$default(composerAction, null, null, createPersonalInfoParamsMap(composerAction.getParams()), null, null, 27, null) : action;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    public final void onInputValueChange(@NotNull String inputType, @NotNull String inputValue) {
        Intrinsics.checkNotNullParameter(inputType, "inputType");
        Intrinsics.checkNotNullParameter(inputValue, "inputValue");
        switch (inputType.hashCode()) {
            case -1874309881:
                if (inputType.equals("INPUT_PASSPORT")) {
                    this.passport = inputValue;
                    break;
                }
                break;
            case -1514039549:
                if (inputType.equals("INPUT_BIRTH_DATE")) {
                    this.birthDate = inputValue;
                    break;
                }
                break;
            case -794540495:
                if (inputType.equals("INPUT_PATRONYMIC")) {
                    this.patronymic = inputValue;
                    break;
                }
                break;
            case -290137818:
                if (inputType.equals("INPUT_SURNAME")) {
                    this.surname = inputValue;
                    break;
                }
                break;
            case 1901135360:
                if (inputType.equals("INPUT_NAME")) {
                    this.name = inputValue;
                    break;
                }
                break;
        }
    }

    public final void setWidgetInfo(@NotNull d widgetInfo, boolean isPatronymicCheckBoxSelected) {
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        this.widgetInfo = widgetInfo;
        this.isPatronymicCheckBoxSelected = isPatronymicCheckBoxSelected;
    }

    @NotNull
    public final M0<PersonalInfoAsyncUpdateUiState> uiStateFlow() {
        return C2399j.b(this.uiStateFlow);
    }

    public final void updateWidget(Map<String, String> actionParams) {
        m c11;
        String a11;
        d dVar = this.widgetInfo;
        if (dVar == null || (c11 = dVar.c()) == null || (a11 = c11.a()) == null) {
            return;
        }
        C6788a a12 = androidx.lifecycle.x0.a(this);
        C10720e0 c10720e0 = C10720e0.f105451a;
        C10727i.c(a12, b.f10879b, null, new PersonalInfoVerificationViewModel$updateWidget$1(this, a11, actionParams, null), 2);
    }
}
