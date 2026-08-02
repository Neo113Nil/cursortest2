package ru.ozon.app.android.session.auth.presentation.viewmodel;

import AJ.d;
import Bc.e;
import Bc.i;
import DM.f;
import Fy.C3065c;
import L9.b;
import Lm0.a;
import Sc.InterfaceC3999a;
import Sc.o;
import W10.c;
import android.net.Uri;
import android.os.Build;
import android.util.Patterns;
import androidx.lifecycle.w0;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.fido.u2f.api.common.ClientData;
import io.reactivex.p;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import mc.C8125a;
import nc.C8486a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import qc.InterfaceC9019a;
import ru.ozon.app.android.domain.session.api.auth.models.Field;
import ru.ozon.app.android.domain.session.api.auth.models.Response;
import ru.ozon.app.android.domain.session.interactors.AuthInteractor;
import ru.ozon.app.android.domain.session.interactors.BiometryInteractor;
import ru.ozon.app.android.domain.session.interactors.SberIdInteractor;
import ru.ozon.app.android.domain.session.receiver.AuthDeeplinkReceiver;
import ru.ozon.app.android.domain.session.repository.mappers.AuthFlowMapper;
import ru.ozon.app.android.domain.session.state.AuthState;
import ru.ozon.app.android.session.R$string;
import ru.ozon.app.android.session.auth.data.Action;
import ru.ozon.app.android.session.auth.data.AuthDTO;
import ru.ozon.app.android.session.auth.data.AuthVO;
import ru.ozon.app.android.session.auth.data.FieldAction;
import ru.ozon.app.android.session.auth.data.alertentry.AlertEntryInteractorKt;
import ru.ozon.app.android.session.auth.data.alertentry.AlertEntryVO;
import ru.ozon.app.android.session.auth.presentation.viewmodel.AuthViewModel;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.utils.PhoneNumberUtilsKt;
import ru.ozon.app.android.utils.StringExtKt;
import ru.ozon.app.android.utils.WhenExtKt;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.app.android.utils.rx.RxExtKt;
import vc.l;

@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0018\u001a\u00020\u000e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001d\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001c0\u001b0\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u000e¢\u0006\u0004\b\u001f\u0010\u0010J\u0015\u0010!\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020 ¢\u0006\u0004\b!\u0010\"J\u0019\u0010$\u001a\u00020\u000e2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u000eH\u0007¢\u0006\u0004\b&\u0010\u0010J\u0015\u0010'\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b'\u0010%J\u001d\u0010)\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010(\u001a\u00020\u0015¢\u0006\u0004\b)\u0010\u0019J\r\u0010*\u001a\u00020\u000e¢\u0006\u0004\b*\u0010\u0010J\u0019\u0010-\u001a\u00020\u000e2\b\u0010,\u001a\u0004\u0018\u00010+H\u0002¢\u0006\u0004\b-\u0010.J\u001d\u00101\u001a\u00020\u000e2\f\u00100\u001a\b\u0012\u0004\u0012\u00020+0/H\u0002¢\u0006\u0004\b1\u00102J\u0019\u00104\u001a\u00020\u000e2\b\b\u0002\u00103\u001a\u00020\u001cH\u0002¢\u0006\u0004\b4\u00105J\u0017\u00108\u001a\u00020\u000e2\u0006\u00107\u001a\u000206H\u0002¢\u0006\u0004\b8\u00109J\u0017\u0010;\u001a\u00020\u000e2\u0006\u0010:\u001a\u00020\u0015H\u0002¢\u0006\u0004\b;\u0010%J!\u0010?\u001a\u0004\u0018\u00010\u00152\u0006\u0010<\u001a\u00020+2\u0006\u0010>\u001a\u00020=H\u0002¢\u0006\u0004\b?\u0010@J\u001f\u0010B\u001a\u00020\u00152\u0006\u0010A\u001a\u00020+2\u0006\u0010>\u001a\u00020=H\u0002¢\u0006\u0004\bB\u0010@J\u0017\u0010C\u001a\u00020\u001c2\u0006\u0010A\u001a\u00020+H\u0002¢\u0006\u0004\bC\u0010DJ\u0017\u0010E\u001a\u00020\u001c2\u0006\u0010A\u001a\u00020+H\u0002¢\u0006\u0004\bE\u0010DJ\u0019\u0010G\u001a\u00020\u001c2\b\u0010F\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\bG\u0010HJ\u0017\u0010K\u001a\u00020\u000e2\u0006\u0010J\u001a\u00020IH\u0002¢\u0006\u0004\bK\u0010LJ\u0017\u0010O\u001a\u00020\u000e2\u0006\u0010N\u001a\u00020MH\u0002¢\u0006\u0004\bO\u0010PJ\u001f\u0010R\u001a\u00020\u000e2\u000e\u00100\u001a\n\u0012\u0004\u0012\u00020Q\u0018\u00010/H\u0002¢\u0006\u0004\bR\u00102R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010SR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010TR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010UR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010VR*\u0010Y\u001a\n\u0018\u00010Wj\u0004\u0018\u0001`X8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\u0017\u0010`\u001a\u00020_8\u0006¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bb\u0010cR\u001d\u0010f\u001a\b\u0012\u0004\u0012\u00020e0d8\u0006¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010iR\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010jR \u0010l\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020+0k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u001a\u0010o\u001a\b\u0012\u0004\u0012\u00020\u001c0n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010p¨\u0006q"}, d2 = {"Lru/ozon/app/android/session/auth/presentation/viewmodel/AuthViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/domain/session/interactors/AuthInteractor;", "interactor", "Lru/ozon/app/android/domain/session/repository/mappers/AuthFlowMapper;", "authFlowMapper", "Lru/ozon/app/android/domain/session/interactors/BiometryInteractor;", "biometryInteractor", "Lru/ozon/app/android/domain/session/interactors/SberIdInteractor;", "sberIdInteractor", "Lru/ozon/app/android/domain/session/receiver/AuthDeeplinkReceiver;", "deeplinkReceiver", "<init>", "(Lru/ozon/app/android/domain/session/interactors/AuthInteractor;Lru/ozon/app/android/domain/session/repository/mappers/AuthFlowMapper;Lru/ozon/app/android/domain/session/interactors/BiometryInteractor;Lru/ozon/app/android/domain/session/interactors/SberIdInteractor;Lru/ozon/app/android/domain/session/receiver/AuthDeeplinkReceiver;)V", "", "onCleared", "()V", "Lru/ozon/app/android/session/auth/data/AuthVO;", "page", "bind", "(Lru/ozon/app/android/session/auth/data/AuthVO;)V", "", "action", ClientData.KEY_CHALLENGE, "tryShowAuthDialog", "(Ljava/lang/String;Ljava/lang/String;)V", "Lio/reactivex/p;", "Lkotlin/Pair;", "", "pageSource", "()Lio/reactivex/p;", "onSubmitButtonClicked", "Lru/ozon/app/android/session/auth/data/FieldAction;", "onFieldAction", "(Lru/ozon/app/android/session/auth/data/FieldAction;)V", "deeplink", "completeAuthorization", "(Ljava/lang/String;)V", "authBySberId", "onActionClick", "signed", "authByBiometry", "deleteKey", "Lru/ozon/app/android/session/auth/data/AuthVO$Input;", "newFocus", "updateFocusInfo", "(Lru/ozon/app/android/session/auth/data/AuthVO$Input;)V", "", "fields", "extractValues", "(Ljava/util/List;)V", "silent", "postChanges", "(Z)V", "Landroid/net/Uri;", "uri", "onSberDeeplinkReceive", "(Landroid/net/Uri;)V", "fieldName", "validateField", "field", "Lru/ozon/app/android/session/auth/data/AuthDTO$TranslationLexemes$ValidationLexemes;", "lexemes", "getValidationError", "(Lru/ozon/app/android/session/auth/data/AuthVO$Input;Lru/ozon/app/android/session/auth/data/AuthDTO$TranslationLexemes$ValidationLexemes;)Ljava/lang/String;", "input", "getEmptyFieldErrorText", "isInvalidEmail", "(Lru/ozon/app/android/session/auth/data/AuthVO$Input;)Z", "isInvalidPhone", "inputPhone", "preValidatePhone", "(Ljava/lang/String;)Z", "Lru/ozon/app/android/domain/session/api/auth/models/Response;", "response", "processResponse", "(Lru/ozon/app/android/domain/session/api/auth/models/Response;)V", "Lru/ozon/app/android/domain/session/state/AuthState;", "state", "processState", "(Lru/ozon/app/android/domain/session/state/AuthState;)V", "Lru/ozon/app/android/domain/session/api/auth/models/Field;", "processServerValidationError", "Lru/ozon/app/android/domain/session/interactors/AuthInteractor;", "Lru/ozon/app/android/domain/session/repository/mappers/AuthFlowMapper;", "Lru/ozon/app/android/domain/session/interactors/BiometryInteractor;", "Lru/ozon/app/android/domain/session/interactors/SberIdInteractor;", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "LW10/c;", "getTrackingData", "()LW10/c;", "setTrackingData", "(LW10/c;)V", "Lnc/a;", "disposables", "Lnc/a;", "getDisposables", "()Lnc/a;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/session/auth/data/Action;", "actionLiveData", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "getActionLiveData", "()Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/session/auth/data/AuthVO;", "Ljava/util/concurrent/ConcurrentHashMap;", "changedValues", "Ljava/util/concurrent/ConcurrentHashMap;", "LL9/b;", "subject", "LL9/b;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AuthViewModel extends w0 {

    @NotNull
    private final SingleLiveEvent<Action> actionLiveData;

    @NotNull
    private final AuthFlowMapper authFlowMapper;

    @NotNull
    private final BiometryInteractor biometryInteractor;

    @NotNull
    private final ConcurrentHashMap<String, AuthVO.Input> changedValues;

    @NotNull
    private final C8486a disposables;

    @NotNull
    private final AuthInteractor interactor;
    private AuthVO page;

    @NotNull
    private final SberIdInteractor sberIdInteractor;

    @NotNull
    private final b<Boolean> subject;
    private c trackingData;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/net/Uri;", "kotlin.jvm.PlatformType", "invoke", "(Landroid/net/Uri;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.session.auth.presentation.viewmodel.AuthViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<Uri, Unit> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Uri uri) {
            invoke2(uri);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Uri uri) {
            AuthViewModel authViewModel = AuthViewModel.this;
            Intrinsics.f(uri);
            authViewModel.onSberDeeplinkReceive(uri);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.session.auth.presentation.viewmodel.AuthViewModel$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<Throwable, Unit> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            invoke2(th2);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th2) {
            a.f17149a.d(th2);
        }
    }

    public AuthViewModel(@NotNull AuthInteractor interactor, @NotNull AuthFlowMapper authFlowMapper, @NotNull BiometryInteractor biometryInteractor, @NotNull SberIdInteractor sberIdInteractor, @NotNull AuthDeeplinkReceiver deeplinkReceiver) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(authFlowMapper, "authFlowMapper");
        Intrinsics.checkNotNullParameter(biometryInteractor, "biometryInteractor");
        Intrinsics.checkNotNullParameter(sberIdInteractor, "sberIdInteractor");
        Intrinsics.checkNotNullParameter(deeplinkReceiver, "deeplinkReceiver");
        this.interactor = interactor;
        this.authFlowMapper = authFlowMapper;
        this.biometryInteractor = biometryInteractor;
        this.sberIdInteractor = sberIdInteractor;
        C8486a c8486a = new C8486a();
        this.disposables = c8486a;
        this.actionLiveData = new SingleLiveEvent<>();
        this.changedValues = new ConcurrentHashMap<>();
        b<Boolean> c11 = b.c();
        Intrinsics.checkNotNullExpressionValue(c11, "create(...)");
        this.subject = c11;
        InterfaceC8487b subscribe = deeplinkReceiver.observe().observeOn(C8125a.a()).subscribe(new BF.a(new AnonymousClass1(), 8), new DM.b(AnonymousClass2.INSTANCE, 8));
        Intrinsics.checkNotNullExpressionValue(subscribe, "subscribe(...)");
        RxExtKt.plusAssign(c8486a, subscribe);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void authByBiometry$lambda$30(AuthViewModel authViewModel) {
        authViewModel.actionLiveData.setValue(Action.Progress.Hide.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void authBySberId$lambda$22(AuthViewModel authViewModel) {
        authViewModel.actionLiveData.setValue(Action.Progress.Hide.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void deleteKey$lambda$33(AuthViewModel authViewModel) {
        authViewModel.actionLiveData.postValue(Action.SilentReload.INSTANCE);
    }

    private final void extractValues(List<AuthVO.Input> fields) {
        Object obj;
        String str;
        List<AuthVO.Input> list = fields;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            AuthVO.Input input = (AuthVO.Input) it.next();
            if (!h.K(input.getName())) {
                AuthVO.Input input2 = this.changedValues.get(input.getName());
                String value = input2 != null ? input2.getValue() : null;
                String value2 = input.getValue();
                if (value2 != null) {
                    String str2 = value2.length() > 0 ? value2 : null;
                    if (str2 != null) {
                        str = str2;
                        this.changedValues.put(input.getName(), AuthVO.Input.copy$default(input, null, null, null, null, str, null, false, 0, false, 495, null));
                    }
                }
                str = value;
                this.changedValues.put(input.getName(), AuthVO.Input.copy$default(input, null, null, null, null, str, null, false, 0, false, 495, null));
            }
        }
        for (Map.Entry<String, AuthVO.Input> entry : this.changedValues.entrySet()) {
            String key = entry.getKey();
            AuthVO.Input value3 = entry.getValue();
            Iterator<T> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj = it2.next();
                    if (Intrinsics.d(((AuthVO.Input) obj).getName(), key)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            this.changedValues.put(value3.getName(), AuthVO.Input.copy$default(value3, null, null, null, null, null, null, false, 0, obj != null, 255, null));
        }
    }

    private final String getEmptyFieldErrorText(AuthVO.Input input, AuthDTO.TranslationLexemes.ValidationLexemes lexemes) {
        String str = lexemes.isEmpty().get(input.getName());
        if (str == null) {
            str = StringProvider.getString(R$string.error_cabinet_input_empty_android);
        }
        return str;
    }

    private final String getValidationError(AuthVO.Input field, AuthDTO.TranslationLexemes.ValidationLexemes lexemes) {
        Set set;
        String value;
        set = AuthViewModelKt.requireNotEmptyFields;
        if (set.contains(field.getType()) && ((value = field.getValue()) == null || value.length() == 0)) {
            return getEmptyFieldErrorText(field, lexemes);
        }
        if (isInvalidEmail(field)) {
            return lexemes.isInvalid().getEmail();
        }
        if (isInvalidPhone(field)) {
            return lexemes.isInvalid().getPhone();
        }
        return null;
    }

    private final boolean isInvalidEmail(AuthVO.Input input) {
        if (!Intrinsics.d(input.getType(), Scopes.EMAIL)) {
            return false;
        }
        Pattern pattern = Patterns.EMAIL_ADDRESS;
        String value = input.getValue();
        if (value == null) {
            value = "";
        }
        return !pattern.matcher(value).matches();
    }

    private final boolean isInvalidPhone(AuthVO.Input input) {
        return Intrinsics.d(input.getType(), "phone") && preValidatePhone(input.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onActionClick$lambda$26(AuthViewModel authViewModel) {
        authViewModel.actionLiveData.setValue(Action.Progress.Hide.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void onSberDeeplinkReceive(Uri uri) {
        AuthVO authVO = this.page;
        String str = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (authVO == null) {
            Intrinsics.n("page");
            throw null;
        }
        AuthVO.SberButtonVO loginBySberIdButton = authVO.getLoginBySberIdButton();
        String redirectUriAction = loginBySberIdButton != null ? loginBySberIdButton.getRedirectUriAction() : null;
        int i11 = 1;
        if (redirectUriAction == null || !(!h.K(redirectUriAction))) {
            this.actionLiveData.setValue(new Action.Error(objArr2 == true ? 1 : 0, i11, objArr == true ? 1 : 0));
            return;
        }
        AuthVO authVO2 = this.page;
        if (authVO2 == null) {
            Intrinsics.n("page");
            throw null;
        }
        String origin = authVO2.getOrigin();
        if (origin == null) {
            AuthVO authVO3 = this.page;
            if (authVO3 == null) {
                Intrinsics.n("page");
                throw null;
            }
            AuthVO.SberButtonVO loginBySberIdButton2 = authVO3.getLoginBySberIdButton();
            if (loginBySberIdButton2 != null) {
                str = loginBySberIdButton2.getOrigin();
            }
        } else {
            str = origin;
        }
        C8486a c8486a = this.disposables;
        InterfaceC8487b h11 = new e(new i(this.sberIdInteractor.auth(uri, redirectUriAction, str).j(Mc.a.b()).g(C8125a.a()), new DM.c(new AuthViewModel$onSberDeeplinkReceive$1(this), 8)), new InterfaceC9019a() { // from class: qJ.c
            @Override // qc.InterfaceC9019a
            public final void run() {
                AuthViewModel.onSberDeeplinkReceive$lambda$41(AuthViewModel.this);
            }
        }).h(new DM.e(new AuthViewModel$onSberDeeplinkReceive$3(this), 8), new f(new AuthViewModel$onSberDeeplinkReceive$4(this), 5));
        Intrinsics.checkNotNullExpressionValue(h11, "subscribe(...)");
        RxExtKt.plusAssign(c8486a, h11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onSberDeeplinkReceive$lambda$41(AuthViewModel authViewModel) {
        authViewModel.actionLiveData.setValue(Action.Progress.Hide.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onSubmitButtonClicked$lambda$17$lambda$14(AuthViewModel authViewModel) {
        authViewModel.actionLiveData.setValue(Action.Progress.Hide.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair pageSource$lambda$4(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (Pair) function1.invoke(p02);
    }

    private final void postChanges(boolean silent) {
        this.subject.accept(Boolean.valueOf(silent));
    }

    static /* synthetic */ void postChanges$default(AuthViewModel authViewModel, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        authViewModel.postChanges(z11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000d, code lost:
    
        if (r0 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean preValidatePhone(String inputPhone) {
        String b11;
        if (inputPhone != null) {
            b11 = h.E(inputPhone) == '+' ? inputPhone : null;
        }
        b11 = Nk.a.b("+", inputPhone);
        return !PhoneNumberUtilsKt.isValidPhoneNumber(b11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processResponse(Response response) {
        AuthState mapToState = this.authFlowMapper.mapToState(response);
        if (mapToState == null) {
            return;
        }
        processState(mapToState);
    }

    private final void processServerValidationError(List<Field> fields) {
        AuthVO.Input copy$default;
        if (fields != null) {
            for (Field field : fields) {
                AuthVO.Input input = this.changedValues.get(field.getName());
                if (input != null && (copy$default = AuthVO.Input.copy$default(input, null, null, null, null, null, field.getMessage(), false, 0, false, 479, null)) != null) {
                    this.changedValues.put(field.getName(), copy$default);
                }
            }
        }
    }

    private final void processState(AuthState state) {
        if (state instanceof AuthState.Complete) {
            this.actionLiveData.setValue(new Action.Completed(((AuthState.Complete) state).getDeeplink()));
        } else if (state instanceof AuthState.BiometricDialog) {
            this.actionLiveData.setValue(new Action.BiometryDialog(((AuthState.BiometricDialog) state).getConfig()));
        } else if (state instanceof AuthState.Redirect) {
            AuthState.Redirect redirect = (AuthState.Redirect) state;
            this.actionLiveData.setValue(new Action.Redirect(redirect.getDeeplink(), redirect.getPostData()));
        } else if (state instanceof AuthState.ValidationError) {
            processServerValidationError(((AuthState.ValidationError) state).getErrors());
            postChanges$default(this, false, 1, null);
        } else if (state instanceof AuthState.Restriction) {
            this.actionLiveData.setValue(new Action.Error(((AuthState.Restriction) state).getMessage()));
        } else if (state instanceof AuthState.Reload) {
            AuthState.Reload reload = (AuthState.Reload) state;
            this.actionLiveData.setValue(new Action.Reload(reload.getDeeplink(), reload.getMessage(), reload.getPostData()));
        } else {
            if (!(state instanceof AuthState.SequentialDialog)) {
                throw new o();
            }
            AuthState.SequentialDialog sequentialDialog = (AuthState.SequentialDialog) state;
            this.actionLiveData.setValue(new Action.SequentialDialog(sequentialDialog.getAction(), sequentialDialog.getConfig()));
        }
        WhenExtKt.getExhaustive(Unit.f71690a);
    }

    private final void updateFocusInfo(AuthVO.Input newFocus) {
        Iterator<Map.Entry<String, AuthVO.Input>> it = this.changedValues.entrySet().iterator();
        while (it.hasNext()) {
            AuthVO.Input value = it.next().getValue();
            this.changedValues.put(value.getName(), AuthVO.Input.copy$default(value, null, null, null, null, null, null, Intrinsics.d(value.getName(), newFocus != null ? newFocus.getName() : null), 0, false, 447, null));
        }
    }

    private final void validateField(String fieldName) {
        AuthVO.Input input = this.changedValues.get(fieldName);
        if (input == null) {
            return;
        }
        AuthVO authVO = this.page;
        if (authVO == null) {
            Intrinsics.n("page");
            throw null;
        }
        this.changedValues.put(fieldName, AuthVO.Input.copy$default(input, null, null, null, null, null, getValidationError(input, authVO.getTranslationLexemes().getValidationLexemes()), false, 0, false, 479, null));
    }

    public final void authByBiometry(@NotNull String action, @NotNull String signed) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(signed, "signed");
        C8486a c8486a = this.disposables;
        BiometryInteractor biometryInteractor = this.biometryInteractor;
        c cVar = this.trackingData;
        if (cVar == null) {
            cVar = new c(null, null, null);
        }
        InterfaceC8487b h11 = new e(new i(biometryInteractor.auth(action, signed, cVar).j(Mc.a.b()).g(C8125a.a()), new Hs.e(new AuthViewModel$authByBiometry$1(this), 8)), new InterfaceC9019a() { // from class: qJ.b
            @Override // qc.InterfaceC9019a
            public final void run() {
                AuthViewModel.authByBiometry$lambda$30(AuthViewModel.this);
            }
        }).h(new CJ.a(new AuthViewModel$authByBiometry$3(this), 6), new CJ.b(new AuthViewModel$authByBiometry$4(this), 8));
        Intrinsics.checkNotNullExpressionValue(h11, "subscribe(...)");
        RxExtKt.plusAssign(c8486a, h11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC3999a
    public final void authBySberId() {
        AuthVO authVO = this.page;
        String str = null;
        Object[] objArr = 0;
        if (authVO == null) {
            Intrinsics.n("page");
            throw null;
        }
        AuthVO.SberButtonVO loginBySberIdButton = authVO.getLoginBySberIdButton();
        String authUriAction = loginBySberIdButton != null ? loginBySberIdButton.getAuthUriAction() : null;
        int i11 = 1;
        if (authUriAction == null || !(!h.K(authUriAction))) {
            this.actionLiveData.setValue(new Action.Error(str, i11, objArr == true ? 1 : 0));
            return;
        }
        C8486a c8486a = this.disposables;
        InterfaceC8487b h11 = new e(new i(SberIdInteractor.DefaultImpls.getUrl$default(this.sberIdInteractor, authUriAction, null, 2, null).j(Mc.a.b()).g(C8125a.a()), new BF.b(new AuthViewModel$authBySberId$1(this), 12)), new InterfaceC9019a() { // from class: qJ.d
            @Override // qc.InterfaceC9019a
            public final void run() {
                AuthViewModel.authBySberId$lambda$22(AuthViewModel.this);
            }
        }).h(new DM.h(new AuthViewModel$authBySberId$3(this), 8), new GH.a(new AuthViewModel$authBySberId$4(this), 14));
        Intrinsics.checkNotNullExpressionValue(h11, "subscribe(...)");
        RxExtKt.plusAssign(c8486a, h11);
    }

    public final void bind(@NotNull AuthVO page) {
        Object obj;
        Action actionByAlertEntry;
        Intrinsics.checkNotNullParameter(page, "page");
        this.page = page;
        extractValues(page.getInputs());
        AuthVO.Advertisement advertisement = page.getAdvertisement();
        boolean z11 = false;
        if (advertisement != null && advertisement.getIsLocalUpdate()) {
            z11 = true;
        }
        postChanges(z11);
        Iterator<T> it = page.getInputs().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((AuthVO.Input) obj).getRequestFocus()) {
                    break;
                }
            }
        }
        updateFocusInfo((AuthVO.Input) obj);
        AlertEntryVO alertEntry = page.getAlertEntry();
        if (alertEntry == null || (actionByAlertEntry = AlertEntryInteractorKt.getActionByAlertEntry(alertEntry)) == null) {
            return;
        }
        this.actionLiveData.postValue(actionByAlertEntry);
    }

    public final void completeAuthorization(String deeplink) {
        this.actionLiveData.setValue(new Action.Completed(deeplink));
    }

    public final void deleteKey() {
        C8486a c8486a = this.disposables;
        l lVar = new l(this.biometryInteractor.deleteKey().k(Mc.a.b()), C8125a.a());
        uc.i iVar = new uc.i(new d(AuthViewModel$deleteKey$2.INSTANCE, 8), new InterfaceC9019a() { // from class: qJ.f
            @Override // qc.InterfaceC9019a
            public final void run() {
                AuthViewModel.deleteKey$lambda$33(AuthViewModel.this);
            }
        });
        lVar.a(iVar);
        Intrinsics.checkNotNullExpressionValue(iVar, "subscribe(...)");
        RxExtKt.plusAssign(c8486a, iVar);
    }

    @NotNull
    public final SingleLiveEvent<Action> getActionLiveData() {
        return this.actionLiveData;
    }

    public final void onActionClick(@NotNull String action) {
        Intrinsics.checkNotNullParameter(action, "action");
        C8486a c8486a = this.disposables;
        AuthInteractor authInteractor = this.interactor;
        c cVar = this.trackingData;
        if (cVar == null) {
            cVar = new c(null, null, null);
        }
        InterfaceC8487b h11 = new e(new i(AuthInteractor.DefaultImpls.callActionWithTracking$default(authInteractor, action, cVar, null, 4, null).j(Mc.a.b()).g(C8125a.a()), new DM.i(new AuthViewModel$onActionClick$1(this), 14)), new InterfaceC9019a() { // from class: qJ.e
            @Override // qc.InterfaceC9019a
            public final void run() {
                AuthViewModel.onActionClick$lambda$26(AuthViewModel.this);
            }
        }).h(new C3065c(new AuthViewModel$onActionClick$3(this), 15), new Gy.a(new AuthViewModel$onActionClick$4(this), 11));
        Intrinsics.checkNotNullExpressionValue(h11, "subscribe(...)");
        RxExtKt.plusAssign(c8486a, h11);
    }

    @Override // androidx.lifecycle.w0
    protected void onCleared() {
        this.disposables.d();
    }

    public final void onFieldAction(@NotNull FieldAction action) {
        String name;
        AuthVO.Input copy$default;
        Intrinsics.checkNotNullParameter(action, "action");
        Object obj = null;
        if (action instanceof FieldAction.TextChanged) {
            FieldAction.TextChanged textChanged = (FieldAction.TextChanged) action;
            AuthVO.Input input = this.changedValues.get(textChanged.getField().getName());
            if (input != null && (copy$default = AuthVO.Input.copy$default(input, null, null, null, null, textChanged.getText(), null, false, 0, false, 463, null)) != null) {
                this.changedValues.put(textChanged.getField().getName(), copy$default);
                obj = Unit.f71690a;
            }
        } else if (action instanceof FieldAction.SetFocus) {
            Collection<AuthVO.Input> values = this.changedValues.values();
            Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
            Iterator<T> it = values.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                AuthVO.Input input2 = (AuthVO.Input) next;
                if (input2.getRequestFocus() && !Intrinsics.d(input2.getName(), ((FieldAction.SetFocus) action).getField().getName())) {
                    obj = next;
                    break;
                }
            }
            AuthVO.Input input3 = (AuthVO.Input) obj;
            updateFocusInfo(((FieldAction.SetFocus) action).getField());
            if (input3 != null && (name = input3.getName()) != null) {
                validateField(name);
            }
            postChanges(input3 == null);
            obj = Unit.f71690a;
        } else {
            if (!(action instanceof FieldAction.Submit)) {
                throw new o();
            }
            onSubmitButtonClicked();
            obj = Unit.f71690a;
        }
        WhenExtKt.getExhaustive(obj);
    }

    public final void onSubmitButtonClicked() {
        AuthVO authVO = this.page;
        if (authVO == null) {
            Intrinsics.n("page");
            throw null;
        }
        AuthDTO.SubmitButton submitButton = authVO.getSubmitButton();
        if (submitButton != null) {
            String action = submitButton.getAction();
            ConcurrentHashMap<String, AuthVO.Input> concurrentHashMap = this.changedValues;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, AuthVO.Input> entry : concurrentHashMap.entrySet()) {
                if (entry.getValue().getIsVisible()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                validateField(((AuthVO.Input) ((Map.Entry) it.next()).getValue()).getName());
            }
            ConcurrentHashMap<String, AuthVO.Input> concurrentHashMap2 = this.changedValues;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry<String, AuthVO.Input> entry2 : concurrentHashMap2.entrySet()) {
                AuthVO.Input value = entry2.getValue();
                if (value.getIsVisible() && value.getError() != null) {
                    linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                }
            }
            if (!linkedHashMap2.isEmpty()) {
                postChanges$default(this, false, 1, null);
                return;
            }
            Tc.d builder = new Tc.d();
            ConcurrentHashMap<String, AuthVO.Input> concurrentHashMap3 = this.changedValues;
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            for (Map.Entry<String, AuthVO.Input> entry3 : concurrentHashMap3.entrySet()) {
                if (entry3.getValue().getIsVisible()) {
                    linkedHashMap3.put(entry3.getKey(), entry3.getValue());
                }
            }
            LinkedHashMap linkedHashMap4 = new LinkedHashMap(U.h(linkedHashMap3.size()));
            for (Map.Entry entry4 : linkedHashMap3.entrySet()) {
                Object key = entry4.getKey();
                AuthVO.Input input = (AuthVO.Input) entry4.getValue();
                String value2 = input.getValue();
                if (value2 == null) {
                    value2 = "";
                }
                if (Intrinsics.d(input.getType(), "phone")) {
                    value2 = StringExtKt.getDigits(value2);
                }
                linkedHashMap4.put(key, value2);
            }
            builder.putAll(linkedHashMap4);
            Map<String, Object> data = submitButton.getData();
            if (data != null) {
                builder.putAll(data);
            }
            AuthVO authVO2 = this.page;
            if (authVO2 == null) {
                Intrinsics.n("page");
                throw null;
            }
            AuthVO.Advertisement advertisement = authVO2.getAdvertisement();
            if (advertisement != null) {
                builder.put(advertisement.getParamKey(), Boolean.valueOf(advertisement.getAtom().isSelected()));
            }
            builder.put("model", Build.MODEL);
            Intrinsics.checkNotNullParameter(builder, "builder");
            Tc.d u11 = builder.u();
            C8486a c8486a = this.disposables;
            AuthInteractor authInteractor = this.interactor;
            c cVar = this.trackingData;
            if (cVar == null) {
                cVar = new c(null, null, null);
            }
            InterfaceC8487b h11 = new e(new i(authInteractor.callActionWithTracking(action, cVar, u11).j(Mc.a.b()).g(C8125a.a()), new DJ.e(new AuthViewModel$onSubmitButtonClicked$1$3(this), 11)), new InterfaceC9019a() { // from class: qJ.a
                @Override // qc.InterfaceC9019a
                public final void run() {
                    AuthViewModel.onSubmitButtonClicked$lambda$17$lambda$14(AuthViewModel.this);
                }
            }).h(new Hs.c(new AuthViewModel$onSubmitButtonClicked$1$5(this), 12), new Hs.d(new AuthViewModel$onSubmitButtonClicked$1$6(this), 10));
            Intrinsics.checkNotNullExpressionValue(h11, "subscribe(...)");
            RxExtKt.plusAssign(c8486a, h11);
        }
    }

    @NotNull
    public final p<Pair<AuthVO, Boolean>> pageSource() {
        p<Pair<AuthVO, Boolean>> observeOn = this.subject.map(new AJ.c(new AuthViewModel$pageSource$1(this), 8)).debounce(50L, TimeUnit.MILLISECONDS).observeOn(C8125a.a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "observeOn(...)");
        return observeOn;
    }

    public final void setTrackingData(c cVar) {
        this.trackingData = cVar;
    }

    public final void tryShowAuthDialog(String action, String challenge) {
        if (action == null || !(!h.K(action)) || challenge == null || !(!h.K(challenge))) {
            return;
        }
        this.actionLiveData.postValue(new Action.AuthDialog(action, challenge));
    }
}
