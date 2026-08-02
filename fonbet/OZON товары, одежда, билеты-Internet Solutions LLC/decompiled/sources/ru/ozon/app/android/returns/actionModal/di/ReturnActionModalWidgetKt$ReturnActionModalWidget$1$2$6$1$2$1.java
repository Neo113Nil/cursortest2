package ru.ozon.app.android.returns.actionModal.di;

import Ae.C2399j;
import Ae.w0;
import Hi.g;
import Sc.InterfaceC4008j;
import Sc.o;
import Sc.s;
import Wc.a;
import a00.C4911f;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.returns.actionModal.di.ReturnActionModalWidgetKt$ReturnActionModalWidget$1;
import ru.ozon.app.android.uploadPhotos.delegate.UploadPhotosDelegateCompose;
import ru.ozon.app.android.uploadPhotos.model.UploadPhotoEffect;
import ru.ozon.app.android.uploadPhotos.viewmodel.UploadPhotosViewModelComposeImpl;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.returns.actionModal.di.ReturnActionModalWidgetKt$ReturnActionModalWidget$1$2$6$1$2$1", f = "ReturnActionModalWidget.kt", l = {123}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class ReturnActionModalWidgetKt$ReturnActionModalWidget$1$2$6$1$2$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ InterfaceC4008j<ReturnActionModalComposeComponent> $component$delegate;
    final /* synthetic */ C4911f $currentContainer;
    final /* synthetic */ UploadPhotosDelegateCompose $delegate;
    final /* synthetic */ UploadPhotosViewModelComposeImpl $photosViewModel;
    final /* synthetic */ ViewGroup $rootView;
    int label;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "effect", "Lru/ozon/app/android/uploadPhotos/model/UploadPhotoEffect;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "ru.ozon.app.android.returns.actionModal.di.ReturnActionModalWidgetKt$ReturnActionModalWidget$1$2$6$1$2$1$1", f = "ReturnActionModalWidget.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.returns.actionModal.di.ReturnActionModalWidgetKt$ReturnActionModalWidget$1$2$6$1$2$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<UploadPhotoEffect, d<? super Unit>, Object> {
        final /* synthetic */ InterfaceC4008j<ReturnActionModalComposeComponent> $component$delegate;
        final /* synthetic */ C4911f $currentContainer;
        final /* synthetic */ UploadPhotosDelegateCompose $delegate;
        final /* synthetic */ UploadPhotosViewModelComposeImpl $photosViewModel;
        final /* synthetic */ ViewGroup $rootView;
        /* synthetic */ Object L$0;
        int label;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LHi/g;", "it", "", "invoke", "(LHi/g;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.returns.actionModal.di.ReturnActionModalWidgetKt$ReturnActionModalWidget$1$2$6$1$2$1$1$1, reason: invalid class name and collision with other inner class name */
        static final class C18501 extends AbstractC7737t implements Function1<g, Unit> {
            final /* synthetic */ UploadPhotosViewModelComposeImpl $photosViewModel;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C18501(UploadPhotosViewModelComposeImpl uploadPhotosViewModelComposeImpl) {
                super(1);
                this.$photosViewModel = uploadPhotosViewModelComposeImpl;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(g gVar) {
                invoke2(gVar);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                this.$photosViewModel.handleGalleryResult(it);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(ViewGroup viewGroup, C4911f c4911f, UploadPhotosDelegateCompose uploadPhotosDelegateCompose, InterfaceC4008j<? extends ReturnActionModalComposeComponent> interfaceC4008j, UploadPhotosViewModelComposeImpl uploadPhotosViewModelComposeImpl, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$rootView = viewGroup;
            this.$currentContainer = c4911f;
            this.$delegate = uploadPhotosDelegateCompose;
            this.$component$delegate = interfaceC4008j;
            this.$photosViewModel = uploadPhotosViewModelComposeImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$rootView, this.$currentContainer, this.$delegate, this.$component$delegate, this.$photosViewModel, dVar);
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
            UploadPhotoEffect uploadPhotoEffect = (UploadPhotoEffect) this.L$0;
            if (uploadPhotoEffect instanceof UploadPhotoEffect.Message) {
                ReturnActionModalWidgetKt.showMessageRestriction(this.$rootView, this.$currentContainer.g(), ((UploadPhotoEffect.Message) uploadPhotoEffect).getString());
            } else if (uploadPhotoEffect instanceof UploadPhotoEffect.Error) {
                ReturnActionModalWidgetKt.showErrorRestriction(this.$rootView, this.$currentContainer.g(), ((UploadPhotoEffect.Error) uploadPhotoEffect).getString());
            } else {
                if (!(uploadPhotoEffect instanceof UploadPhotoEffect.OpenPickScreen)) {
                    throw new o();
                }
                this.$delegate.openImagePicker(((UploadPhotoEffect.OpenPickScreen) uploadPhotoEffect).getLimit(), ReturnActionModalWidgetKt$ReturnActionModalWidget$1.AnonymousClass2.invoke$lambda$0(this.$component$delegate).getGalleryLauncher(), new C18501(this.$photosViewModel));
            }
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(UploadPhotoEffect uploadPhotoEffect, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(uploadPhotoEffect, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ReturnActionModalWidgetKt$ReturnActionModalWidget$1$2$6$1$2$1(UploadPhotosViewModelComposeImpl uploadPhotosViewModelComposeImpl, ViewGroup viewGroup, C4911f c4911f, UploadPhotosDelegateCompose uploadPhotosDelegateCompose, InterfaceC4008j<? extends ReturnActionModalComposeComponent> interfaceC4008j, d<? super ReturnActionModalWidgetKt$ReturnActionModalWidget$1$2$6$1$2$1> dVar) {
        super(2, dVar);
        this.$photosViewModel = uploadPhotosViewModelComposeImpl;
        this.$rootView = viewGroup;
        this.$currentContainer = c4911f;
        this.$delegate = uploadPhotosDelegateCompose;
        this.$component$delegate = interfaceC4008j;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ReturnActionModalWidgetKt$ReturnActionModalWidget$1$2$6$1$2$1(this.$photosViewModel, this.$rootView, this.$currentContainer, this.$delegate, this.$component$delegate, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            w0<UploadPhotoEffect> effects = this.$photosViewModel.getEffects();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$rootView, this.$currentContainer, this.$delegate, this.$component$delegate, this.$photosViewModel, null);
            this.label = 1;
            if (C2399j.h(effects, anonymousClass1, this) == aVar) {
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
        return ((ReturnActionModalWidgetKt$ReturnActionModalWidget$1$2$6$1$2$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
