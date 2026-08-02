package ru.ozon.app.android.cart.ui.performTwoActions;

import Sc.s;
import W10.c;
import Wc.a;
import com.google.protobuf.DescriptorProtos$FileOptions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.cart.ui.performTwoActions.PerformTwoActionsHandler;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import xe.C10727i;
import xe.I;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.cart.ui.performTwoActions.PerformTwoActionsHandler$processAction$2", f = "PerformTwoActionsHandler.kt", l = {DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class PerformTwoActionsHandler$processAction$2 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $firstActionJson;
    final /* synthetic */ CustomActionHandler.HandlerReferences $handlerRefs;
    final /* synthetic */ String $secondActionJson;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ PerformTwoActionsHandler this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.cart.ui.performTwoActions.PerformTwoActionsHandler$processAction$2$1", f = "PerformTwoActionsHandler.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.cart.ui.performTwoActions.PerformTwoActionsHandler$processAction$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
        final /* synthetic */ kotlin.jvm.internal.M<Function1<AtomAction, Unit>> $actionHandler;
        final /* synthetic */ kotlin.jvm.internal.M<AtomAction> $firstAction;
        final /* synthetic */ String $firstActionJson;
        final /* synthetic */ CustomActionHandler.HandlerReferences $handlerRefs;
        final /* synthetic */ kotlin.jvm.internal.M<AtomAction> $secondAction;
        final /* synthetic */ String $secondActionJson;
        int label;
        final /* synthetic */ PerformTwoActionsHandler this$0;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "invoke", "()LW10/c;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.cart.ui.performTwoActions.PerformTwoActionsHandler$processAction$2$1$1, reason: invalid class name and collision with other inner class name */
        static final class C17411 extends AbstractC7737t implements Function0<c> {
            final /* synthetic */ CustomActionHandler.HandlerReferences $handlerRefs;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C17411(CustomActionHandler.HandlerReferences handlerReferences) {
                super(0);
                this.$handlerRefs = handlerReferences;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final c invoke() {
                return this.$handlerRefs.getTrackingData();
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lru/ozon/composer/ui/widget/l;", "invoke", "()Lru/ozon/composer/ui/widget/l;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.cart.ui.performTwoActions.PerformTwoActionsHandler$processAction$2$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends AbstractC7737t implements Function0<l> {
            final /* synthetic */ CustomActionHandler.HandlerReferences $handlerRefs;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(CustomActionHandler.HandlerReferences handlerReferences) {
                super(0);
                this.$handlerRefs = handlerReferences;
            }

            @Override // kotlin.jvm.functions.Function0
            public final l invoke() {
                return this.$handlerRefs.getViewItem();
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LVg/c;", "invoke", "()LVg/c;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.cart.ui.performTwoActions.PerformTwoActionsHandler$processAction$2$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends AbstractC7737t implements Function0<Vg.c> {
            final /* synthetic */ PerformTwoActionsHandler this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(PerformTwoActionsHandler performTwoActionsHandler) {
                super(0);
                this.this$0 = performTwoActionsHandler;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Vg.c invoke() {
                Vg.d dVar;
                PerformTwoActionsHandler.Companion companion;
                dVar = this.this$0.customActionHandlersStoreFactory;
                companion = PerformTwoActionsHandler.Companion;
                return dVar.create(companion.getSupportedCustomActionHandlers());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(kotlin.jvm.internal.M<AtomAction> m11, PerformTwoActionsHandler performTwoActionsHandler, String str, kotlin.jvm.internal.M<AtomAction> m12, String str2, kotlin.jvm.internal.M<Function1<AtomAction, Unit>> m13, CustomActionHandler.HandlerReferences handlerReferences, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$firstAction = m11;
            this.this$0 = performTwoActionsHandler;
            this.$firstActionJson = str;
            this.$secondAction = m12;
            this.$secondActionJson = str2;
            this.$actionHandler = m13;
            this.$handlerRefs = handlerReferences;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.$firstAction, this.this$0, this.$firstActionJson, this.$secondAction, this.$secondActionJson, this.$actionHandler, this.$handlerRefs, dVar);
        }

        /* JADX WARN: Type inference failed for: r0v12, types: [T, ru.ozon.uni.atoms.af.AtomAction] */
        /* JADX WARN: Type inference failed for: r0v15, types: [T, kotlin.jvm.functions.Function1] */
        /* JADX WARN: Type inference failed for: r0v7, types: [T, ru.ozon.uni.atoms.af.AtomAction] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            JsonParser jsonParser;
            JsonParser jsonParser2;
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            kotlin.jvm.internal.M<AtomAction> m11 = this.$firstAction;
            jsonParser = this.this$0.jsonDeserializer;
            m11.f71787a = AtomActionMapperKt.toAtomAction((AtomActionDTO) jsonParser.fromJson(this.$firstActionJson, AtomActionDTO.class), null);
            kotlin.jvm.internal.M<AtomAction> m12 = this.$secondAction;
            jsonParser2 = this.this$0.jsonDeserializer;
            m12.f71787a = AtomActionMapperKt.toAtomAction((AtomActionDTO) jsonParser2.fromJson(this.$secondActionJson, AtomActionDTO.class), null);
            this.$actionHandler.f71787a = new ActionHandler.Builder(this.$handlerRefs.getRefs(), this.$handlerRefs.getNestedPagesProvider(), new C17411(this.$handlerRefs), new AnonymousClass2(this.$handlerRefs)).customActionHandlers(new AnonymousClass3(this.this$0)).buildHandler();
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PerformTwoActionsHandler$processAction$2(PerformTwoActionsHandler performTwoActionsHandler, String str, String str2, CustomActionHandler.HandlerReferences handlerReferences, d<? super PerformTwoActionsHandler$processAction$2> dVar) {
        super(2, dVar);
        this.this$0 = performTwoActionsHandler;
        this.$firstActionJson = str;
        this.$secondActionJson = str2;
        this.$handlerRefs = handlerReferences;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new PerformTwoActionsHandler$processAction$2(this.this$0, this.$firstActionJson, this.$secondActionJson, this.$handlerRefs, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineDispatcherProvider coroutineDispatcherProvider;
        kotlin.jvm.internal.M m11;
        kotlin.jvm.internal.M m12;
        kotlin.jvm.internal.M m13;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            kotlin.jvm.internal.M m14 = new kotlin.jvm.internal.M();
            kotlin.jvm.internal.M m15 = new kotlin.jvm.internal.M();
            kotlin.jvm.internal.M m16 = new kotlin.jvm.internal.M();
            coroutineDispatcherProvider = this.this$0.dispatcherProvider;
            I io2 = coroutineDispatcherProvider.getIO();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(m14, this.this$0, this.$firstActionJson, m15, this.$secondActionJson, m16, this.$handlerRefs, null);
            this.L$0 = m14;
            this.L$1 = m15;
            this.L$2 = m16;
            this.label = 1;
            if (C10727i.f(io2, anonymousClass1, this) == aVar) {
                return aVar;
            }
            m11 = m14;
            m12 = m15;
            m13 = m16;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            m13 = (kotlin.jvm.internal.M) this.L$2;
            m12 = (kotlin.jvm.internal.M) this.L$1;
            m11 = (kotlin.jvm.internal.M) this.L$0;
            s.b(obj);
        }
        ((Function1) m13.f71787a).invoke(m11.f71787a);
        ((Function1) m13.f71787a).invoke(m12.f71787a);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((PerformTwoActionsHandler$processAction$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
