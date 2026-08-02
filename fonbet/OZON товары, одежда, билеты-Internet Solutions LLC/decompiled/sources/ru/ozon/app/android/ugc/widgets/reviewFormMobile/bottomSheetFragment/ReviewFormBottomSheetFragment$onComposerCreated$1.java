package ru.ozon.app.android.ugc.widgets.reviewFormMobile.bottomSheetFragment;

import Sc.s;
import Wc.a;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerFragmentController;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.ugc.widgets.reviewFormMobile.bottomSheetFragment.ReviewFormBottomSheetFragment$onComposerCreated$1", f = "ReviewFormBottomSheetFragment.kt", l = {165}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ReviewFormBottomSheetFragment$onComposerCreated$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ ComposerFragmentController $composer;
    int label;
    final /* synthetic */ ReviewFormBottomSheetFragment this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.ugc.widgets.reviewFormMobile.bottomSheetFragment.ReviewFormBottomSheetFragment$onComposerCreated$1$1", f = "ReviewFormBottomSheetFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.ugc.widgets.reviewFormMobile.bottomSheetFragment.ReviewFormBottomSheetFragment$onComposerCreated$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
        final /* synthetic */ ComposerFragmentController $composer;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ReviewFormBottomSheetFragment this$0;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
        @e(c = "ru.ozon.app.android.ugc.widgets.reviewFormMobile.bottomSheetFragment.ReviewFormBottomSheetFragment$onComposerCreated$1$1$1", f = "ReviewFormBottomSheetFragment.kt", l = {166}, m = "invokeSuspend")
        /* renamed from: ru.ozon.app.android.ugc.widgets.reviewFormMobile.bottomSheetFragment.ReviewFormBottomSheetFragment$onComposerCreated$1$1$1, reason: invalid class name and collision with other inner class name */
        static final class C19601 extends j implements Function2<M, d<? super Unit>, Object> {
            final /* synthetic */ ComposerFragmentController $composer;
            int label;
            final /* synthetic */ ReviewFormBottomSheetFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C19601(ReviewFormBottomSheetFragment reviewFormBottomSheetFragment, ComposerFragmentController composerFragmentController, d<? super C19601> dVar) {
                super(2, dVar);
                this.this$0 = reviewFormBottomSheetFragment;
                this.$composer = composerFragmentController;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d<Unit> create(Object obj, d<?> dVar) {
                return new C19601(this.this$0, this.$composer, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object observeComposerItems;
                a aVar = a.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 == 0) {
                    s.b(obj);
                    ReviewFormBottomSheetFragment reviewFormBottomSheetFragment = this.this$0;
                    ComposerFragmentController composerFragmentController = this.$composer;
                    this.label = 1;
                    observeComposerItems = reviewFormBottomSheetFragment.observeComposerItems(composerFragmentController, this);
                    if (observeComposerItems == aVar) {
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
                return ((C19601) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
        @e(c = "ru.ozon.app.android.ugc.widgets.reviewFormMobile.bottomSheetFragment.ReviewFormBottomSheetFragment$onComposerCreated$1$1$2", f = "ReviewFormBottomSheetFragment.kt", l = {167}, m = "invokeSuspend")
        /* renamed from: ru.ozon.app.android.ugc.widgets.reviewFormMobile.bottomSheetFragment.ReviewFormBottomSheetFragment$onComposerCreated$1$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends j implements Function2<M, d<? super Unit>, Object> {
            final /* synthetic */ ComposerFragmentController $composer;
            int label;
            final /* synthetic */ ReviewFormBottomSheetFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(ReviewFormBottomSheetFragment reviewFormBottomSheetFragment, ComposerFragmentController composerFragmentController, d<? super AnonymousClass2> dVar) {
                super(2, dVar);
                this.this$0 = reviewFormBottomSheetFragment;
                this.$composer = composerFragmentController;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d<Unit> create(Object obj, d<?> dVar) {
                return new AnonymousClass2(this.this$0, this.$composer, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object observeComposerEvents;
                a aVar = a.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 == 0) {
                    s.b(obj);
                    ReviewFormBottomSheetFragment reviewFormBottomSheetFragment = this.this$0;
                    ComposerFragmentController composerFragmentController = this.$composer;
                    this.label = 1;
                    observeComposerEvents = reviewFormBottomSheetFragment.observeComposerEvents(composerFragmentController, this);
                    if (observeComposerEvents == aVar) {
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
                return ((AnonymousClass2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ReviewFormBottomSheetFragment reviewFormBottomSheetFragment, ComposerFragmentController composerFragmentController, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = reviewFormBottomSheetFragment;
            this.$composer = composerFragmentController;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$composer, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            M m11 = (M) this.L$0;
            C10727i.c(m11, null, null, new C19601(this.this$0, this.$composer, null), 3);
            C10727i.c(m11, null, null, new AnonymousClass2(this.this$0, this.$composer, null), 3);
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewFormBottomSheetFragment$onComposerCreated$1(ReviewFormBottomSheetFragment reviewFormBottomSheetFragment, ComposerFragmentController composerFragmentController, d<? super ReviewFormBottomSheetFragment$onComposerCreated$1> dVar) {
        super(2, dVar);
        this.this$0 = reviewFormBottomSheetFragment;
        this.$composer = composerFragmentController;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ReviewFormBottomSheetFragment$onComposerCreated$1(this.this$0, this.$composer, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            J viewLifecycleOwner = this.this$0.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$composer, null);
            this.label = 1;
            if (C5412d0.b(viewLifecycleOwner, bVar, anonymousClass1, this) == aVar) {
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
        return ((ReviewFormBottomSheetFragment$onComposerCreated$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
