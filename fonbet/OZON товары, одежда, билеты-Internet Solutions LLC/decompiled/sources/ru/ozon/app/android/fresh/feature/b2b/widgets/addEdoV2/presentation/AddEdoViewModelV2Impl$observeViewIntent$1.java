package ru.ozon.app.android.fresh.feature.b2b.widgets.addEdoV2.presentation;

import Ae.InterfaceC2397i;
import Ae.w0;
import Sc.C4005g;
import Sc.o;
import Sc.s;
import Wc.a;
import androidx.lifecycle.x0;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import com.google.protobuf.DescriptorProtos$MethodOptions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.fresh.feature.b2b.widgets.addEdoV2.data.AddEdoRepositoryV2;
import ru.ozon.app.android.fresh.feature.b2b.widgets.addEdoV2.data.AddEdoStatusStorage;
import ru.ozon.app.android.fresh.feature.b2b.widgets.addEdoV2.data.api.AddEdoResponseV2;
import ru.ozon.app.android.fresh.feature.b2b.widgets.addEdoV2.presentation.AddEdoViewModelV2;
import ru.ozon.app.android.utils.Result;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.feature.b2b.widgets.addEdoV2.presentation.AddEdoViewModelV2Impl$observeViewIntent$1", f = "AddEdoViewModelV2Impl.kt", l = {DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class AddEdoViewModelV2Impl$observeViewIntent$1 extends j implements Function2<M, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ AddEdoViewModelV2Impl this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/presentation/AddEdoViewModelV2$ViewIntent;", "event", "", "emit", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/presentation/AddEdoViewModelV2$ViewIntent;Lkotlin/coroutines/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.fresh.feature.b2b.widgets.addEdoV2.presentation.AddEdoViewModelV2Impl$observeViewIntent$1$1, reason: invalid class name */
    static final class AnonymousClass1<T> implements InterfaceC2397i {
        final /* synthetic */ AddEdoViewModelV2Impl this$0;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
        @e(c = "ru.ozon.app.android.fresh.feature.b2b.widgets.addEdoV2.presentation.AddEdoViewModelV2Impl$observeViewIntent$1$1$1", f = "AddEdoViewModelV2Impl.kt", l = {46, 56, 59, RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH}, m = "invokeSuspend")
        /* renamed from: ru.ozon.app.android.fresh.feature.b2b.widgets.addEdoV2.presentation.AddEdoViewModelV2Impl$observeViewIntent$1$1$1, reason: invalid class name and collision with other inner class name */
        static final class C17751 extends j implements Function2<M, d<? super Unit>, Object> {
            final /* synthetic */ AddEdoViewModelV2.ViewIntent $event;
            int label;
            final /* synthetic */ AddEdoViewModelV2Impl this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C17751(AddEdoViewModelV2Impl addEdoViewModelV2Impl, AddEdoViewModelV2.ViewIntent viewIntent, d<? super C17751> dVar) {
                super(2, dVar);
                this.this$0 = addEdoViewModelV2Impl;
                this.$event = viewIntent;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d<Unit> create(Object obj, d<?> dVar) {
                return new C17751(this.this$0, this.$event, dVar);
            }

            /* JADX WARN: Code restructure failed: missing block: B:19:0x0084, code lost:
            
                if (r1.emit(r9, r8) == r0) goto L32;
             */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x00ca, code lost:
            
                return r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:24:0x00a4, code lost:
            
                if (r1.emit(r2, r8) == r0) goto L32;
             */
            /* JADX WARN: Code restructure failed: missing block: B:28:0x00c8, code lost:
            
                if (r9.emit(r1, r8) == r0) goto L32;
             */
            /* JADX WARN: Code restructure failed: missing block: B:32:0x004b, code lost:
            
                if (r9 == r0) goto L32;
             */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                AddEdoRepositoryV2 addEdoRepositoryV2;
                AddEdoViewModelV2.SingleEvent action;
                AddEdoStatusStorage addEdoStatusStorage;
                a aVar = a.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 == 0) {
                    s.b(obj);
                    addEdoRepositoryV2 = this.this$0.repository;
                    String actionName = ((AddEdoViewModelV2.ViewIntent.AddEdo) this.$event).getActionName();
                    String clientId = ((AddEdoViewModelV2.ViewIntent.AddEdo) this.$event).getClientId();
                    String edoId = ((AddEdoViewModelV2.ViewIntent.AddEdo) this.$event).getEdoId();
                    this.label = 1;
                    obj = addEdoRepositoryV2.addEdo(actionName, clientId, edoId, this);
                } else {
                    if (i11 != 1) {
                        if (i11 != 2 && i11 != 3 && i11 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj);
                        return Unit.f71690a;
                    }
                    s.b(obj);
                }
                Result result = (Result) obj;
                if (result instanceof Result.Success) {
                    Result.Success success = (Result.Success) result;
                    if (!((AddEdoResponseV2) success.getValue()).isSuccess()) {
                        String error = ((AddEdoResponseV2) success.getValue()).getError();
                        if (error != null) {
                            w0<AddEdoViewModelV2.SingleEvent> singleEvent = this.this$0.getSingleEvent();
                            AddEdoViewModelV2.SingleEvent.ShowError showError = new AddEdoViewModelV2.SingleEvent.ShowError(error);
                            this.label = 3;
                        }
                        return Unit.f71690a;
                    }
                    action = this.this$0.toAction((AddEdoResponseV2) success.getValue());
                    addEdoStatusStorage = this.this$0.addEdoStatusStorage;
                    addEdoStatusStorage.updateStatusEdo();
                    w0<AddEdoViewModelV2.SingleEvent> singleEvent2 = this.this$0.getSingleEvent();
                    this.label = 2;
                } else {
                    if (!(result instanceof Result.Failure)) {
                        throw new o();
                    }
                    Lm0.a.f17149a.e(((Result.Failure) result).getThrowable());
                    w0<AddEdoViewModelV2.SingleEvent> singleEvent3 = this.this$0.getSingleEvent();
                    AddEdoViewModelV2.SingleEvent.ShowError showError2 = new AddEdoViewModelV2.SingleEvent.ShowError(null, 1, null);
                    this.label = 4;
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, d<? super Unit> dVar) {
                return ((C17751) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }
        }

        AnonymousClass1(AddEdoViewModelV2Impl addEdoViewModelV2Impl) {
            this.this$0 = addEdoViewModelV2Impl;
        }

        @Override // Ae.InterfaceC2397i
        public /* bridge */ /* synthetic */ Object emit(Object obj, d dVar) {
            return emit((AddEdoViewModelV2.ViewIntent) obj, (d<? super Unit>) dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
        
            if (r7.emit(r2, r0) == r1) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0089, code lost:
        
            if (r7.emit(r2, r0) == r1) goto L29;
         */
        /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(AddEdoViewModelV2.ViewIntent viewIntent, d<? super Unit> dVar) {
            AddEdoViewModelV2Impl$observeViewIntent$1$1$emit$1 addEdoViewModelV2Impl$observeViewIntent$1$1$emit$1;
            int i11;
            AnonymousClass1<T> anonymousClass1;
            if (dVar instanceof AddEdoViewModelV2Impl$observeViewIntent$1$1$emit$1) {
                addEdoViewModelV2Impl$observeViewIntent$1$1$emit$1 = (AddEdoViewModelV2Impl$observeViewIntent$1$1$emit$1) dVar;
                int i12 = addEdoViewModelV2Impl$observeViewIntent$1$1$emit$1.label;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    addEdoViewModelV2Impl$observeViewIntent$1$1$emit$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = addEdoViewModelV2Impl$observeViewIntent$1$1$emit$1.result;
                    a aVar = a.COROUTINE_SUSPENDED;
                    i11 = addEdoViewModelV2Impl$observeViewIntent$1$1$emit$1.label;
                    if (i11 == 0) {
                        if (i11 == 1) {
                            s.b(obj);
                            return Unit.f71690a;
                        }
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        viewIntent = (AddEdoViewModelV2.ViewIntent) addEdoViewModelV2Impl$observeViewIntent$1$1$emit$1.L$1;
                        anonymousClass1 = (AnonymousClass1) addEdoViewModelV2Impl$observeViewIntent$1$1$emit$1.L$0;
                        s.b(obj);
                        C10727i.c(x0.a(anonymousClass1.this$0), null, null, new C17751(anonymousClass1.this$0, viewIntent, null), 3);
                        return Unit.f71690a;
                    }
                    s.b(obj);
                    if (!(viewIntent instanceof AddEdoViewModelV2.ViewIntent.OnContinueButtonClick)) {
                        if (!(viewIntent instanceof AddEdoViewModelV2.ViewIntent.AddEdo)) {
                            throw new o();
                        }
                        if (((AddEdoViewModelV2.ViewIntent.AddEdo) viewIntent).getEdoId().length() > 0) {
                            w0<AddEdoViewModelV2.SingleEvent> singleEvent = this.this$0.getSingleEvent();
                            AddEdoViewModelV2.SingleEvent.ShowLoader showLoader = AddEdoViewModelV2.SingleEvent.ShowLoader.INSTANCE;
                            addEdoViewModelV2Impl$observeViewIntent$1$1$emit$1.L$0 = this;
                            addEdoViewModelV2Impl$observeViewIntent$1$1$emit$1.L$1 = viewIntent;
                            addEdoViewModelV2Impl$observeViewIntent$1$1$emit$1.label = 2;
                        }
                        anonymousClass1 = this;
                        C10727i.c(x0.a(anonymousClass1.this$0), null, null, new C17751(anonymousClass1.this$0, viewIntent, null), 3);
                        return Unit.f71690a;
                    }
                    w0<AddEdoViewModelV2.SingleEvent> singleEvent2 = this.this$0.getSingleEvent();
                    AddEdoViewModelV2.ViewIntent.OnContinueButtonClick onContinueButtonClick = (AddEdoViewModelV2.ViewIntent.OnContinueButtonClick) viewIntent;
                    AddEdoViewModelV2.SingleEvent.GetInputAfterButtonClick getInputAfterButtonClick = new AddEdoViewModelV2.SingleEvent.GetInputAfterButtonClick(onContinueButtonClick.getActionName(), onContinueButtonClick.getClientId());
                    addEdoViewModelV2Impl$observeViewIntent$1$1$emit$1.label = 1;
                    return aVar;
                }
            }
            addEdoViewModelV2Impl$observeViewIntent$1$1$emit$1 = new AddEdoViewModelV2Impl$observeViewIntent$1$1$emit$1(this, dVar);
            Object obj2 = addEdoViewModelV2Impl$observeViewIntent$1$1$emit$1.result;
            a aVar2 = a.COROUTINE_SUSPENDED;
            i11 = addEdoViewModelV2Impl$observeViewIntent$1$1$emit$1.label;
            if (i11 == 0) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddEdoViewModelV2Impl$observeViewIntent$1(AddEdoViewModelV2Impl addEdoViewModelV2Impl, d<? super AddEdoViewModelV2Impl$observeViewIntent$1> dVar) {
        super(2, dVar);
        this.this$0 = addEdoViewModelV2Impl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new AddEdoViewModelV2Impl$observeViewIntent$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        w0 w0Var;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            w0Var = this.this$0.viewIntents;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0);
            this.label = 1;
            if (w0Var.collect(anonymousClass1, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        throw new C4005g();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((AddEdoViewModelV2Impl$observeViewIntent$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
