package ru.ozon.app.android.analytics.startup.time;

import Qj0.K;
import Qj0.U;
import Qj0.x0;
import Sc.s;
import Wc.a;
import Xh0.c;
import com.google.protobuf.DescriptorProtos$FileOptions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.analytics.startup.CompilationProfileStatusDelegate;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.analytics.startup.time.ComposerPageLoadingListenerImpl$onPageLoaded$1", f = "ComposerPageLoadingListener.kt", l = {DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes6.dex */
final class ComposerPageLoadingListenerImpl$onPageLoaded$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $userToken;
    int label;
    final /* synthetic */ ComposerPageLoadingListenerImpl this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQj0/U;", "", "invoke", "(LQj0/U;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.analytics.startup.time.ComposerPageLoadingListenerImpl$onPageLoaded$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<U, Unit> {
        final /* synthetic */ String $compilationProfileStatus;
        final /* synthetic */ String $userToken;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(String str, String str2) {
            super(1);
            this.$userToken = str;
            this.$compilationProfileStatus = str2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(U u11) {
            invoke2(u11);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(U modifyTrace) {
            Intrinsics.checkNotNullParameter(modifyTrace, "$this$modifyTrace");
            String str = this.$userToken;
            if (str != null) {
                x0 x0Var = new x0(str);
                int i11 = U.f23535i;
                modifyTrace.n(x0Var, true);
            }
            String str2 = this.$compilationProfileStatus;
            if (str2 != null) {
                K k11 = new K(str2);
                int i12 = U.f23535i;
                modifyTrace.n(k11, true);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ComposerPageLoadingListenerImpl$onPageLoaded$1(ComposerPageLoadingListenerImpl composerPageLoadingListenerImpl, String str, d<? super ComposerPageLoadingListenerImpl$onPageLoaded$1> dVar) {
        super(2, dVar);
        this.this$0 = composerPageLoadingListenerImpl;
        this.$userToken = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ComposerPageLoadingListenerImpl$onPageLoaded$1(this.this$0, this.$userToken, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CompilationProfileStatusDelegate compilationProfileStatusDelegate;
        c cVar;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            compilationProfileStatusDelegate = this.this$0.compilationProfileStatusDelegate;
            this.label = 1;
            obj = compilationProfileStatusDelegate.getStatus(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        cVar = this.this$0.startupTimeTracker;
        cVar.b(new AnonymousClass1(this.$userToken, (String) obj));
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ComposerPageLoadingListenerImpl$onPageLoaded$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
