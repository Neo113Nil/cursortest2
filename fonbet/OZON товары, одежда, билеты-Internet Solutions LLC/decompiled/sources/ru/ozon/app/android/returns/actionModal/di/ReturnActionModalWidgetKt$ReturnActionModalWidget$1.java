package ru.ozon.app.android.returns.actionModal.di;

import A00.a;
import S0.A1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.Q;
import Sc.InterfaceC4008j;
import Vg.e;
import a00.C4911f;
import a00.h;
import a1.C4912a;
import android.view.ViewGroup;
import androidx.lifecycle.B0;
import androidx.lifecycle.InterfaceC5431s;
import androidx.lifecycle.w0;
import b00.f;
import d00.C6018d;
import e3.C6285b;
import f3.AbstractC6409a;
import fd.InterfaceC6512o;
import g3.C6617b;
import hi.InterfaceC6958a;
import j20.C7244b;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l10.InterfaceC7851b;
import l20.d;
import ru.ozon.app.android.action.WidgetActionHandlerBuilder;
import ru.ozon.app.android.action.WidgetActionHandlerKt;
import ru.ozon.app.android.returns.actionModal.data.dto.ReturnActionModalDto;
import ru.ozon.app.android.returns.actionModal.presentation.viewModel.ReturnActionModalViewModel;
import ru.ozon.app.android.returns.actionModal.presentation.viewModel.ReturnActionModalViewModelFactory;
import ru.ozon.app.android.returns.actionModal.presentation.viewObject.ReturnActionModalVO;
import ru.ozon.app.android.returns.actionModal.viewMapper.update.MarkRequiredFields;
import ru.ozon.app.android.returns.actionModal.viewMapper.update.PhotoUrlsUpdated;
import ru.ozon.app.android.returns.actionModal.viewMapper.update.TextUpdated;
import ru.ozon.app.android.returns.compose.ReturnActionModalComposableKt;
import ru.ozon.app.android.returns.ui.data.components.RmsUploadPhotosDto;
import ru.ozon.app.android.uploadPhotos.delegate.UploadPhotosDelegateCompose;
import ru.ozon.app.android.uploadPhotos.di.viewModelFactory.UploadPhotosViewModelFactory;
import ru.ozon.app.android.uploadPhotos.model.ViewState;
import ru.ozon.app.android.uploadPhotos.viewmodel.UploadPhotosViewModelComposeImpl;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.composer.compose.widget.c;
import ru.ozon.composer.compose.widget.config.b;
import ru.ozon.composer.compose.widget.g;
import ru.ozon.composer.compose.widget.i;
import ru.ozon.composer.compose.widget.scrollable.j;
import ru.ozon.composer.compose.widget.scrollable.k;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld00/d;", "Lru/ozon/app/android/returns/actionModal/data/dto/ReturnActionModalDto;", "", "invoke", "(Ld00/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class ReturnActionModalWidgetKt$ReturnActionModalWidget$1 extends AbstractC7737t implements Function1<C6018d<ReturnActionModalDto>, Unit> {
    public static final ReturnActionModalWidgetKt$ReturnActionModalWidget$1 INSTANCE = new ReturnActionModalWidgetKt$ReturnActionModalWidget$1();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/config/b;", "Lru/ozon/app/android/returns/actionModal/data/dto/ReturnActionModalDto;", "", "invoke", "(Lru/ozon/composer/compose/widget/config/b;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.returns.actionModal.di.ReturnActionModalWidgetKt$ReturnActionModalWidget$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<b<ReturnActionModalDto>, Unit> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj20/b;", "state", "Lru/ozon/app/android/returns/actionModal/data/dto/ReturnActionModalDto;", "invoke", "(Lj20/b;)Lru/ozon/app/android/returns/actionModal/data/dto/ReturnActionModalDto;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.returns.actionModal.di.ReturnActionModalWidgetKt$ReturnActionModalWidget$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes13.dex */
        static final class C18491 extends AbstractC7737t implements Function1<C7244b, ReturnActionModalDto> {
            final /* synthetic */ ReturnActionModalComposeComponent $component;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C18491(ReturnActionModalComposeComponent returnActionModalComposeComponent) {
                super(1);
                this.$component = returnActionModalComposeComponent;
            }

            @Override // kotlin.jvm.functions.Function1
            public final ReturnActionModalDto invoke(C7244b state) {
                Intrinsics.checkNotNullParameter(state, "state");
                return this.$component.getParser().invoke(state.b());
            }
        }

        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(b<ReturnActionModalDto> bVar) {
            invoke2(bVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(b<ReturnActionModalDto> config) {
            Intrinsics.checkNotNullParameter(config, "$this$config");
            b.j(config, null, new C18491((ReturnActionModalComposeComponent) config.getWidgetComponentStorage().getComponent(ReturnActionModalComposeComponent.class)), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/j;", "Lru/ozon/app/android/returns/actionModal/data/dto/ReturnActionModalDto;", "Lru/ozon/app/android/returns/actionModal/presentation/viewObject/ReturnActionModalVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/j;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.returns.actionModal.di.ReturnActionModalWidgetKt$ReturnActionModalWidget$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<j<ReturnActionModalDto, ReturnActionModalVO>, Unit> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.returns.actionModal.di.ReturnActionModalWidgetKt$ReturnActionModalWidget$1$2$4, reason: invalid class name */
        /* loaded from: classes13.dex */
        static final class AnonymousClass4 extends AbstractC7737t implements Function1<Object, Boolean> {
            public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

            AnonymousClass4() {
                super(1);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof ReturnActionModalDto);
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/app/android/returns/actionModal/data/dto/ReturnActionModalDto;", "state", "Ll20/d;", "info", "Lru/ozon/app/android/returns/actionModal/presentation/viewObject/ReturnActionModalVO;", "invoke", "(Lru/ozon/app/android/returns/actionModal/data/dto/ReturnActionModalDto;Ll20/d;)Lru/ozon/app/android/returns/actionModal/presentation/viewObject/ReturnActionModalVO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.returns.actionModal.di.ReturnActionModalWidgetKt$ReturnActionModalWidget$1$2$5, reason: invalid class name */
        /* loaded from: classes13.dex */
        static final class AnonymousClass5 extends AbstractC7737t implements Function2<ReturnActionModalDto, d, ReturnActionModalVO> {
            final /* synthetic */ InterfaceC4008j<ReturnActionModalComposeComponent> $component$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass5(InterfaceC4008j<? extends ReturnActionModalComposeComponent> interfaceC4008j) {
                super(2);
                this.$component$delegate = interfaceC4008j;
            }

            @Override // kotlin.jvm.functions.Function2
            public final ReturnActionModalVO invoke(ReturnActionModalDto state, d info) {
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(info, "info");
                return AnonymousClass2.invoke$lambda$0(this.$component$delegate).getMapper().invoke(state, info);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/k;", "Lru/ozon/app/android/returns/actionModal/presentation/viewObject/ReturnActionModalVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/k;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.returns.actionModal.di.ReturnActionModalWidgetKt$ReturnActionModalWidget$1$2$6, reason: invalid class name */
        /* loaded from: classes13.dex */
        static final class AnonymousClass6 extends AbstractC7737t implements Function1<k<ReturnActionModalVO>, Unit> {
            final /* synthetic */ InterfaceC4008j<ReturnActionModalComposeComponent> $component$delegate;
            final /* synthetic */ j<ReturnActionModalDto, ReturnActionModalVO> $this_viewMapper;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/returns/actionModal/presentation/viewObject/ReturnActionModalVO;", "Lru/ozon/composer/compose/widget/g$a;", "it", "", "invoke", "(Lru/ozon/composer/compose/widget/i;Lru/ozon/composer/compose/widget/g$a;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
            /* renamed from: ru.ozon.app.android.returns.actionModal.di.ReturnActionModalWidgetKt$ReturnActionModalWidget$1$2$6$1, reason: invalid class name */
            static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6512o<i<ReturnActionModalVO>, g.a, InterfaceC3967k, Integer, Unit> {
                final /* synthetic */ InterfaceC4008j<ReturnActionModalComposeComponent> $component$delegate;
                final /* synthetic */ j<ReturnActionModalDto, ReturnActionModalVO> $this_viewMapper;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass1(j<ReturnActionModalDto, ReturnActionModalVO> jVar, InterfaceC4008j<? extends ReturnActionModalComposeComponent> interfaceC4008j) {
                    super(4);
                    this.$this_viewMapper = jVar;
                    this.$component$delegate = interfaceC4008j;
                }

                private static final ViewState invoke$lambda$2(A1<ViewState> a12) {
                    return a12.getValue();
                }

                @Override // fd.InterfaceC6512o
                public /* bridge */ /* synthetic */ Unit invoke(i<ReturnActionModalVO> iVar, g.a aVar, InterfaceC3967k interfaceC3967k, Integer num) {
                    invoke(iVar, aVar, interfaceC3967k, num.intValue());
                    return Unit.f71690a;
                }

                public final void invoke(i<ReturnActionModalVO> content, g.a it, InterfaceC3967k interfaceC3967k, int i11) {
                    UploadPhotosViewModelComposeImpl uploadPhotosViewModelComposeImpl;
                    ViewGroup viewGroup;
                    Function1<Tg.b, Unit> function1;
                    InterfaceC7851b interfaceC7851b;
                    Intrinsics.checkNotNullParameter(content, "$this$content");
                    Intrinsics.checkNotNullParameter(it, "it");
                    int i12 = (i11 & 6) == 0 ? i11 | (interfaceC3967k.n(content) ? 4 : 2) : i11;
                    if ((i12 & 131) == 130 && interfaceC3967k.b()) {
                        interfaceC3967k.j();
                        return;
                    }
                    B0 a11 = ((h) interfaceC3967k.m(f.f())).a();
                    ReturnActionModalViewModelFactory returnActionModalViewModelFactory = AnonymousClass2.invoke$lambda$0(this.$component$delegate).getReturnActionModalViewModelFactory();
                    interfaceC3967k.B(1729797275);
                    w0 a12 = C6617b.a(N.b(ReturnActionModalViewModel.class), a11, null, returnActionModalViewModelFactory, a11 instanceof InterfaceC5431s ? ((InterfaceC5431s) a11).getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b, interfaceC3967k);
                    interfaceC3967k.K();
                    ReturnActionModalViewModel returnActionModalViewModel = (ReturnActionModalViewModel) a12;
                    B0 a13 = ((h) interfaceC3967k.m(f.f())).a();
                    UploadPhotosViewModelFactory uploadPhotosViewModelFactory = AnonymousClass2.invoke$lambda$0(this.$component$delegate).getUploadPhotosViewModelFactory();
                    interfaceC3967k.B(1729797275);
                    w0 a14 = C6617b.a(N.b(UploadPhotosViewModelComposeImpl.class), a13, null, uploadPhotosViewModelFactory, a13 instanceof InterfaceC5431s ? ((InterfaceC5431s) a13).getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b, interfaceC3967k);
                    interfaceC3967k.K();
                    UploadPhotosViewModelComposeImpl uploadPhotosViewModelComposeImpl2 = (UploadPhotosViewModelComposeImpl) a14;
                    InterfaceC7851b interfaceC7851b2 = (InterfaceC7851b) interfaceC3967k.m(f.c());
                    C4911f c4911f = (C4911f) interfaceC3967k.m(f.d());
                    int i13 = i12 & 14;
                    e.a widgetActionHandlerBuilder = WidgetActionHandlerKt.widgetActionHandlerBuilder(content, this.$this_viewMapper.getWidgetComponentStorage(), null, null, null, interfaceC3967k, i13, 14);
                    interfaceC3967k.o(454016069);
                    boolean F11 = (i13 == 4) | interfaceC3967k.F(returnActionModalViewModel);
                    Object C11 = interfaceC3967k.C();
                    if (F11 || C11 == InterfaceC3967k.a.a()) {
                        C11 = new ReturnActionModalWidgetKt$ReturnActionModalWidget$1$2$6$1$actionHandler$1$1(returnActionModalViewModel, content);
                        interfaceC3967k.x(C11);
                    }
                    interfaceC3967k.k();
                    Function1<Tg.b, Unit> m470buildHandlerimpl = WidgetActionHandlerBuilder.m470buildHandlerimpl(WidgetActionHandlerBuilder.m476onPreProcessDnHbjWo(widgetActionHandlerBuilder, (Function1) C11));
                    List<ReturnActionModalVO.ActionComponent> components = content.b().getComponents();
                    if (components != null) {
                        for (ReturnActionModalVO.ActionComponent actionComponent : components) {
                            if (actionComponent.getComponent() instanceof RmsUploadPhotosDto) {
                                Integer limit = ((RmsUploadPhotosDto) actionComponent.getComponent()).getLimit();
                                uploadPhotosViewModelComposeImpl2.setImagesLimit(limit != null ? limit.intValue() : 0);
                                Integer limit2 = ((RmsUploadPhotosDto) actionComponent.getComponent()).getLimit();
                                uploadPhotosViewModelComposeImpl2.setPickImagesLimit(limit2 != null ? limit2.intValue() : 0);
                            }
                        }
                    }
                    InterfaceC3978p0 c11 = C6285b.c(uploadPhotosViewModelComposeImpl2.getState(), interfaceC3967k, 0);
                    ViewGroup rootView = ContextExtKt.getRootView(c4911f.c());
                    UploadPhotosDelegateCompose uploadPhotosDelegateCompose = new UploadPhotosDelegateCompose(AnonymousClass2.invoke$lambda$0(this.$component$delegate).getAppType() == AppType.SELECT);
                    Unit unit = Unit.f71690a;
                    interfaceC3967k.o(454049605);
                    boolean F12 = interfaceC3967k.F(uploadPhotosViewModelComposeImpl2) | interfaceC3967k.F(rootView) | interfaceC3967k.F(c4911f) | interfaceC3967k.F(uploadPhotosDelegateCompose) | interfaceC3967k.F(this.$component$delegate);
                    InterfaceC4008j<ReturnActionModalComposeComponent> interfaceC4008j = this.$component$delegate;
                    Object C12 = interfaceC3967k.C();
                    if (F12 || C12 == InterfaceC3967k.a.a()) {
                        Object returnActionModalWidgetKt$ReturnActionModalWidget$1$2$6$1$2$1 = new ReturnActionModalWidgetKt$ReturnActionModalWidget$1$2$6$1$2$1(uploadPhotosViewModelComposeImpl2, rootView, c4911f, uploadPhotosDelegateCompose, interfaceC4008j, null);
                        uploadPhotosViewModelComposeImpl = uploadPhotosViewModelComposeImpl2;
                        viewGroup = rootView;
                        c4911f = c4911f;
                        interfaceC3967k.x(returnActionModalWidgetKt$ReturnActionModalWidget$1$2$6$1$2$1);
                        C12 = returnActionModalWidgetKt$ReturnActionModalWidget$1$2$6$1$2$1;
                    } else {
                        viewGroup = rootView;
                        uploadPhotosViewModelComposeImpl = uploadPhotosViewModelComposeImpl2;
                    }
                    interfaceC3967k.k();
                    Q.e(interfaceC3967k, unit, (Function2) C12);
                    interfaceC3967k.o(454087310);
                    boolean F13 = interfaceC3967k.F(returnActionModalViewModel) | interfaceC3967k.F(interfaceC7851b2) | interfaceC3967k.F(viewGroup) | interfaceC3967k.F(c4911f) | interfaceC3967k.n(m470buildHandlerimpl);
                    Object C13 = interfaceC3967k.C();
                    if (F13 || C13 == InterfaceC3967k.a.a()) {
                        function1 = m470buildHandlerimpl;
                        interfaceC7851b = interfaceC7851b2;
                        Object returnActionModalWidgetKt$ReturnActionModalWidget$1$2$6$1$3$1 = new ReturnActionModalWidgetKt$ReturnActionModalWidget$1$2$6$1$3$1(returnActionModalViewModel, interfaceC7851b, viewGroup, c4911f, function1, null);
                        interfaceC3967k.x(returnActionModalWidgetKt$ReturnActionModalWidget$1$2$6$1$3$1);
                        C13 = returnActionModalWidgetKt$ReturnActionModalWidget$1$2$6$1$3$1;
                    } else {
                        function1 = m470buildHandlerimpl;
                        interfaceC7851b = interfaceC7851b2;
                    }
                    interfaceC3967k.k();
                    Q.e(interfaceC3967k, unit, (Function2) C13);
                    ReturnActionModalVO b11 = content.b();
                    ViewState invoke$lambda$2 = invoke$lambda$2(c11);
                    interfaceC3967k.o(454146674);
                    boolean F14 = interfaceC3967k.F(uploadPhotosViewModelComposeImpl);
                    Object C14 = interfaceC3967k.C();
                    if (F14 || C14 == InterfaceC3967k.a.a()) {
                        C14 = new ReturnActionModalWidgetKt$ReturnActionModalWidget$1$2$6$1$4$1(uploadPhotosViewModelComposeImpl);
                        interfaceC3967k.x(C14);
                    }
                    Function1 function12 = (Function1) C14;
                    interfaceC3967k.k();
                    interfaceC3967k.o(454150588);
                    boolean F15 = interfaceC3967k.F(uploadPhotosViewModelComposeImpl);
                    Object C15 = interfaceC3967k.C();
                    if (F15 || C15 == InterfaceC3967k.a.a()) {
                        C15 = new ReturnActionModalWidgetKt$ReturnActionModalWidget$1$2$6$1$5$1(uploadPhotosViewModelComposeImpl);
                        interfaceC3967k.x(C15);
                    }
                    Function1 function13 = (Function1) C15;
                    interfaceC3967k.k();
                    interfaceC3967k.o(454159193);
                    boolean F16 = interfaceC3967k.F(uploadPhotosViewModelComposeImpl);
                    Object C16 = interfaceC3967k.C();
                    if (F16 || C16 == InterfaceC3967k.a.a()) {
                        C16 = new ReturnActionModalWidgetKt$ReturnActionModalWidget$1$2$6$1$6$1(uploadPhotosViewModelComposeImpl);
                        interfaceC3967k.x(C16);
                    }
                    Function1 function14 = (Function1) C16;
                    interfaceC3967k.k();
                    interfaceC3967k.o(454163320);
                    boolean F17 = interfaceC3967k.F(interfaceC7851b);
                    Object C17 = interfaceC3967k.C();
                    if (F17 || C17 == InterfaceC3967k.a.a()) {
                        C17 = new ReturnActionModalWidgetKt$ReturnActionModalWidget$1$2$6$1$7$1(interfaceC7851b);
                        interfaceC3967k.x(C17);
                    }
                    Function2 function2 = (Function2) C17;
                    interfaceC3967k.k();
                    interfaceC3967k.o(454174543);
                    boolean F18 = interfaceC3967k.F(interfaceC7851b);
                    Object C18 = interfaceC3967k.C();
                    if (F18 || C18 == InterfaceC3967k.a.a()) {
                        C18 = new ReturnActionModalWidgetKt$ReturnActionModalWidget$1$2$6$1$8$1(interfaceC7851b);
                        interfaceC3967k.x(C18);
                    }
                    Function2 function22 = (Function2) C18;
                    interfaceC3967k.k();
                    interfaceC3967k.o(454154849);
                    boolean F19 = interfaceC3967k.F(uploadPhotosViewModelComposeImpl);
                    Object C19 = interfaceC3967k.C();
                    if (F19 || C19 == InterfaceC3967k.a.a()) {
                        C19 = new ReturnActionModalWidgetKt$ReturnActionModalWidget$1$2$6$1$9$1(uploadPhotosViewModelComposeImpl);
                        interfaceC3967k.x(C19);
                    }
                    interfaceC3967k.k();
                    ReturnActionModalComposableKt.ReturnActionModalComposable(b11, invoke$lambda$2, function12, function13, function14, function2, function22, (Function1) C19, function1, interfaceC3967k, 0);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass6(j<ReturnActionModalDto, ReturnActionModalVO> jVar, InterfaceC4008j<? extends ReturnActionModalComposeComponent> interfaceC4008j) {
                super(1);
                this.$this_viewMapper = jVar;
                this.$component$delegate = interfaceC4008j;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(k<ReturnActionModalVO> kVar) {
                invoke2(kVar);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(k<ReturnActionModalVO> widgetSpec) {
                Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
                widgetSpec.a(new C4912a(true, 1328636707, new AnonymousClass1(this.$this_viewMapper, this.$component$delegate)));
            }
        }

        AnonymousClass2() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ReturnActionModalComposeComponent invoke$lambda$0(InterfaceC4008j<? extends ReturnActionModalComposeComponent> interfaceC4008j) {
            return interfaceC4008j.getValue();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(j<ReturnActionModalDto, ReturnActionModalVO> jVar) {
            invoke2(jVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(j<ReturnActionModalDto, ReturnActionModalVO> viewMapper) {
            Intrinsics.checkNotNullParameter(viewMapper, "$this$viewMapper");
            InterfaceC4008j b11 = Sc.k.b(new ReturnActionModalWidgetKt$ReturnActionModalWidget$1$2$component$2(viewMapper));
            viewMapper.c().put(TextUpdated.class, new c.a() { // from class: ru.ozon.app.android.returns.actionModal.di.ReturnActionModalWidgetKt$ReturnActionModalWidget$1$2$invoke$$inlined$update$1
                @Override // ru.ozon.composer.compose.widget.c.a
                public final I handle(a.J.InterfaceC0007a update, I old) {
                    ReturnActionModalVO updateText;
                    Intrinsics.checkNotNullParameter(update, "update");
                    Intrinsics.checkNotNullParameter(old, "old");
                    updateText = ReturnActionModalWidgetKt.updateText((ReturnActionModalVO) old, (TextUpdated) update);
                    return updateText;
                }
            });
            viewMapper.c().put(PhotoUrlsUpdated.class, new c.a() { // from class: ru.ozon.app.android.returns.actionModal.di.ReturnActionModalWidgetKt$ReturnActionModalWidget$1$2$invoke$$inlined$update$2
                @Override // ru.ozon.composer.compose.widget.c.a
                public final I handle(a.J.InterfaceC0007a update, I old) {
                    ReturnActionModalVO updatePhotoUrls;
                    Intrinsics.checkNotNullParameter(update, "update");
                    Intrinsics.checkNotNullParameter(old, "old");
                    updatePhotoUrls = ReturnActionModalWidgetKt.updatePhotoUrls((ReturnActionModalVO) old, (PhotoUrlsUpdated) update);
                    return updatePhotoUrls;
                }
            });
            viewMapper.c().put(MarkRequiredFields.class, new c.a() { // from class: ru.ozon.app.android.returns.actionModal.di.ReturnActionModalWidgetKt$ReturnActionModalWidget$1$2$invoke$$inlined$update$3
                @Override // ru.ozon.composer.compose.widget.c.a
                public final I handle(a.J.InterfaceC0007a update, I old) {
                    ReturnActionModalVO updateRequiredFields;
                    Intrinsics.checkNotNullParameter(update, "update");
                    Intrinsics.checkNotNullParameter(old, "old");
                    updateRequiredFields = ReturnActionModalWidgetKt.updateRequiredFields((ReturnActionModalVO) old, (MarkRequiredFields) update);
                    return updateRequiredFields;
                }
            });
            viewMapper.k(AnonymousClass4.INSTANCE, new AnonymousClass5(b11));
            viewMapper.G(new AnonymousClass6(viewMapper, b11));
        }
    }

    ReturnActionModalWidgetKt$ReturnActionModalWidget$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C6018d<ReturnActionModalDto> c6018d) {
        invoke2(c6018d);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C6018d<ReturnActionModalDto> ComposeWidget) {
        Intrinsics.checkNotNullParameter(ComposeWidget, "$this$ComposeWidget");
        ComposeWidget.a(AnonymousClass1.INSTANCE);
        ComposeWidget.p(AnonymousClass2.INSTANCE);
        ComposeWidget.j().add(new C6018d.a() { // from class: ru.ozon.app.android.returns.actionModal.di.ReturnActionModalWidgetKt$ReturnActionModalWidget$1$invoke$$inlined$widgetComponent$1
            @Override // d00.C6018d.a
            public final C7473e<? extends InterfaceC6958a> get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return ReturnActionModalComposeComponent.INSTANCE.create(it);
            }
        });
    }
}
