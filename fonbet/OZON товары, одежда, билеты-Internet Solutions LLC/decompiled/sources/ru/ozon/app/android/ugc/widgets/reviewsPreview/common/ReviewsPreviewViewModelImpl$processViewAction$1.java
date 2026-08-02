package ru.ozon.app.android.ugc.widgets.reviewsPreview.common;

import Bc.h;
import Bc.i;
import Ge.f;
import Sc.s;
import io.reactivex.y;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import nc.InterfaceC8487b;
import qc.g;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.ugc.widgets.reviewsPreview.common.ReviewsPreviewViewModelImpl$processViewAction$1", f = "ReviewsPreviewViewModel.kt", l = {48}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ReviewsPreviewViewModelImpl$processViewAction$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $actionId;
    final /* synthetic */ AtomAction.ComposerAction $atomAction;
    int label;
    final /* synthetic */ ReviewsPreviewViewModelImpl this$0;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lnc/b;", "kotlin.jvm.PlatformType", "it", "", "invoke", "(Lnc/b;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.ugc.widgets.reviewsPreview.common.ReviewsPreviewViewModelImpl$processViewAction$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<InterfaceC8487b, Unit> {
        final /* synthetic */ ReviewsPreviewViewModelImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ReviewsPreviewViewModelImpl reviewsPreviewViewModelImpl) {
            super(1);
            this.this$0 = reviewsPreviewViewModelImpl;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC8487b interfaceC8487b) {
            invoke2(interfaceC8487b);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(InterfaceC8487b interfaceC8487b) {
            this.this$0.isViewActionSent = true;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.ugc.widgets.reviewsPreview.common.ReviewsPreviewViewModelImpl$processViewAction$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<Throwable, Unit> {
        final /* synthetic */ ReviewsPreviewViewModelImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(ReviewsPreviewViewModelImpl reviewsPreviewViewModelImpl) {
            super(1);
            this.this$0 = reviewsPreviewViewModelImpl;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            invoke2(th2);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th2) {
            this.this$0.isViewActionSent = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewsPreviewViewModelImpl$processViewAction$1(ReviewsPreviewViewModelImpl reviewsPreviewViewModelImpl, AtomAction.ComposerAction composerAction, String str, d<? super ReviewsPreviewViewModelImpl$processViewAction$1> dVar) {
        super(2, dVar);
        this.this$0 = reviewsPreviewViewModelImpl;
        this.$atomAction = composerAction;
        this.$actionId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ReviewsPreviewViewModelImpl$processViewAction$1(this.this$0, this.$atomAction, this.$actionId, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ActionV2Repository actionV2Repository;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            actionV2Repository = this.this$0.actionV2Repository;
            y callAction = actionV2Repository.callAction(new ActionV2Request(this.$atomAction.getParams(), this.$actionId, false, 4, null), Object.class);
            final AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0);
            g gVar = new g() { // from class: ru.ozon.app.android.ugc.widgets.reviewsPreview.common.a
                @Override // qc.g
                public final void accept(Object obj2) {
                    Function1.this.invoke(obj2);
                }
            };
            callAction.getClass();
            i iVar = new i(callAction, gVar);
            final AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0);
            h hVar = new h(iVar, new g() { // from class: ru.ozon.app.android.ugc.widgets.reviewsPreview.common.b
                @Override // qc.g
                public final void accept(Object obj2) {
                    Function1.this.invoke(obj2);
                }
            });
            Intrinsics.checkNotNullExpressionValue(hVar, "doOnError(...)");
            this.label = 1;
            if (f.b(hVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ReviewsPreviewViewModelImpl$processViewAction$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
