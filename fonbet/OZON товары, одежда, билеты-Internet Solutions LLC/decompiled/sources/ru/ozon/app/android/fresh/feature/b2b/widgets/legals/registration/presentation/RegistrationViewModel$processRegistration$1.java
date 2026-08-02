package ru.ozon.app.android.fresh.feature.b2b.widgets.legals.registration.presentation;

import Ae.w0;
import Sc.s;
import Wc.a;
import com.google.protobuf.DescriptorProtos$FileOptions;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.checkLegalInfo.data.AddLegalRepository;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.checkLegalInfo.data.AddLegalResponse;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.checkLegalInfo.data.ProcessRegistrationResponse;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.registration.presentation.RegistrationViewModel;
import ru.ozon.app.android.utils.Result;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.feature.b2b.widgets.legals.registration.presentation.RegistrationViewModel$processRegistration$1", f = "RegistrationViewModel.kt", l = {DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER, 50, 53}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class RegistrationViewModel$processRegistration$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $action;
    final /* synthetic */ Map<String, InputData> $inputs;
    final /* synthetic */ Map<String, String> $postData;
    final /* synthetic */ RegistrationVI $registrationVI;
    int label;
    final /* synthetic */ RegistrationViewModel this$0;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lru/ozon/app/android/utils/Result;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/data/ProcessRegistrationResponse;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "ru.ozon.app.android.fresh.feature.b2b.widgets.legals.registration.presentation.RegistrationViewModel$processRegistration$1$1", f = "RegistrationViewModel.kt", l = {46}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.fresh.feature.b2b.widgets.legals.registration.presentation.RegistrationViewModel$processRegistration$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function1<d<? super Result<ProcessRegistrationResponse>>, Object> {
        final /* synthetic */ String $action;
        final /* synthetic */ JSONObject $jsonPostData;
        int label;
        final /* synthetic */ RegistrationViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(RegistrationViewModel registrationViewModel, String str, JSONObject jSONObject, d<? super AnonymousClass1> dVar) {
            super(1, dVar);
            this.this$0 = registrationViewModel;
            this.$action = str;
            this.$jsonPostData = jSONObject;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(d<?> dVar) {
            return new AnonymousClass1(this.this$0, this.$action, this.$jsonPostData, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AddLegalRepository addLegalRepository;
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return obj;
            }
            s.b(obj);
            addLegalRepository = this.this$0.repository;
            String str = this.$action;
            String jSONObject = this.$jsonPostData.toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
            this.label = 1;
            Object processRegistration = addLegalRepository.processRegistration(str, jSONObject, this);
            return processRegistration == aVar ? aVar : processRegistration;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(d<? super Result<ProcessRegistrationResponse>> dVar) {
            return ((AnonymousClass1) create(dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/presentation/RegistrationViewModel$OperationResult;", "it", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/data/ProcessRegistrationResponse;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.fresh.feature.b2b.widgets.legals.registration.presentation.RegistrationViewModel$processRegistration$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<ProcessRegistrationResponse, RegistrationViewModel.OperationResult> {
        final /* synthetic */ RegistrationViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(RegistrationViewModel registrationViewModel) {
            super(1);
            this.this$0 = registrationViewModel;
        }

        @Override // kotlin.jvm.functions.Function1
        public final RegistrationViewModel.OperationResult invoke(ProcessRegistrationResponse processRegistrationResponse) {
            RegistrationViewModel.OperationResult state;
            state = this.this$0.toState(processRegistrationResponse);
            return state;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lru/ozon/app/android/utils/Result;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/data/AddLegalResponse;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "ru.ozon.app.android.fresh.feature.b2b.widgets.legals.registration.presentation.RegistrationViewModel$processRegistration$1$3", f = "RegistrationViewModel.kt", l = {54}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.fresh.feature.b2b.widgets.legals.registration.presentation.RegistrationViewModel$processRegistration$1$3, reason: invalid class name */
    static final class AnonymousClass3 extends j implements Function1<d<? super Result<AddLegalResponse>>, Object> {
        final /* synthetic */ String $action;
        final /* synthetic */ JSONObject $jsonPostData;
        int label;
        final /* synthetic */ RegistrationViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(RegistrationViewModel registrationViewModel, String str, JSONObject jSONObject, d<? super AnonymousClass3> dVar) {
            super(1, dVar);
            this.this$0 = registrationViewModel;
            this.$action = str;
            this.$jsonPostData = jSONObject;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(d<?> dVar) {
            return new AnonymousClass3(this.this$0, this.$action, this.$jsonPostData, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AddLegalRepository addLegalRepository;
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return obj;
            }
            s.b(obj);
            addLegalRepository = this.this$0.repository;
            String str = this.$action;
            String jSONObject = this.$jsonPostData.toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
            this.label = 1;
            Object addLegalMobile = addLegalRepository.addLegalMobile(str, jSONObject, this);
            return addLegalMobile == aVar ? aVar : addLegalMobile;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(d<? super Result<AddLegalResponse>> dVar) {
            return ((AnonymousClass3) create(dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/presentation/RegistrationViewModel$OperationResult;", "it", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/data/AddLegalResponse;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.fresh.feature.b2b.widgets.legals.registration.presentation.RegistrationViewModel$processRegistration$1$4, reason: invalid class name */
    static final class AnonymousClass4 extends AbstractC7737t implements Function1<AddLegalResponse, RegistrationViewModel.OperationResult> {
        final /* synthetic */ RegistrationViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(RegistrationViewModel registrationViewModel) {
            super(1);
            this.this$0 = registrationViewModel;
        }

        @Override // kotlin.jvm.functions.Function1
        public final RegistrationViewModel.OperationResult invoke(AddLegalResponse addLegalResponse) {
            RegistrationViewModel.OperationResult state;
            state = this.this$0.toState(addLegalResponse);
            return state;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RegistrationViewModel$processRegistration$1(Map<String, String> map, String str, RegistrationViewModel registrationViewModel, Map<String, InputData> map2, RegistrationVI registrationVI, d<? super RegistrationViewModel$processRegistration$1> dVar) {
        super(2, dVar);
        this.$postData = map;
        this.$action = str;
        this.this$0 = registrationViewModel;
        this.$inputs = map2;
        this.$registrationVI = registrationVI;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new RegistrationViewModel$processRegistration$1(this.$postData, this.$action, this.this$0, this.$inputs, this.$registrationVI, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
    
        if (r8 == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:
    
        if (r1.emit(r2, r7) == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008b, code lost:
    
        if (r8 == r0) goto L27;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object executeRepositoryOperation;
        Map validateAndBuildJson;
        w0 w0Var;
        Object executeRepositoryOperation2;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            Map<String, String> map = this.$postData;
            JSONObject jSONObject = map != null ? new JSONObject(map) : new JSONObject();
            if (Intrinsics.d(this.$action, "b2bProcessRegistrationStepChecking")) {
                validateAndBuildJson = this.this$0.validateAndBuildJson(this.$inputs, this.$registrationVI, jSONObject);
                if (validateAndBuildJson.isEmpty()) {
                    RegistrationViewModel registrationViewModel = this.this$0;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(registrationViewModel, this.$action, jSONObject, null);
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0);
                    this.label = 1;
                    executeRepositoryOperation2 = registrationViewModel.executeRepositoryOperation(anonymousClass1, anonymousClass2, this);
                } else {
                    w0Var = this.this$0._events;
                    RegistrationViewModel.UIEvent.InputsError inputsError = new RegistrationViewModel.UIEvent.InputsError(validateAndBuildJson);
                    this.label = 2;
                }
            } else {
                RegistrationViewModel registrationViewModel2 = this.this$0;
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(registrationViewModel2, this.$action, jSONObject, null);
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0);
                this.label = 3;
                executeRepositoryOperation = registrationViewModel2.executeRepositoryOperation(anonymousClass3, anonymousClass4, this);
            }
        } else {
            if (i11 != 1 && i11 != 2 && i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((RegistrationViewModel$processRegistration$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
