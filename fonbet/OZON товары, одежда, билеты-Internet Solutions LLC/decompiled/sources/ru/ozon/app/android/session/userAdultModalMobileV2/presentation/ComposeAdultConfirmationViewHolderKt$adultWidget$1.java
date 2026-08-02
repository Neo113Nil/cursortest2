package ru.ozon.app.android.session.userAdultModalMobileV2.presentation;

import S0.A1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.Q;
import S0.n1;
import Sc.InterfaceC4008j;
import a1.C4912a;
import androidx.lifecycle.B0;
import androidx.lifecycle.InterfaceC5431s;
import androidx.lifecycle.w0;
import d00.C6018d;
import f3.AbstractC6409a;
import fd.InterfaceC6511n;
import g3.C6616a;
import g3.C6617b;
import hi.InterfaceC6958a;
import j20.C7244b;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l20.d;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.action.WidgetActionHandlerBuilder;
import ru.ozon.app.android.action.WidgetActionHandlerKt;
import ru.ozon.app.android.session.userAdultModalMobileV2.data.models.UserAdultModalV2DTO;
import ru.ozon.app.android.session.userAdultModalMobileV2.di.UserAdultComponent;
import ru.ozon.app.android.session.userAdultModalMobileV2.presentation.BirthdateStateUi;
import ru.ozon.app.android.session.userAdultModalMobileV2.presentation.models.UserAdultModalV2VO;
import ru.ozon.composer.compose.widget.c;
import ru.ozon.composer.compose.widget.config.b;
import ru.ozon.composer.compose.widget.i;
import ru.ozon.composer.compose.widget.overlay.d;
import ru.ozon.composer.compose.widget.overlay.e;
import ru.ozon.composer.compose.widget.overlay.f;
import ru.ozon.composer.compose.widget.scrollable.j;
import ru.ozon.composer.compose.widget.scrollable.k;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld00/d;", "Lru/ozon/app/android/session/userAdultModalMobileV2/data/models/UserAdultModalV2DTO;", "", "invoke", "(Ld00/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class ComposeAdultConfirmationViewHolderKt$adultWidget$1 extends AbstractC7737t implements Function1<C6018d<UserAdultModalV2DTO>, Unit> {
    final /* synthetic */ JsonParser $jsonSerializer;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/config/b;", "Lru/ozon/app/android/session/userAdultModalMobileV2/data/models/UserAdultModalV2DTO;", "", "invoke", "(Lru/ozon/composer/compose/widget/config/b;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.session.userAdultModalMobileV2.presentation.ComposeAdultConfirmationViewHolderKt$adultWidget$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<b<UserAdultModalV2DTO>, Unit> {
        final /* synthetic */ JsonParser $jsonSerializer;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj20/b;", "it", "Lru/ozon/app/android/session/userAdultModalMobileV2/data/models/UserAdultModalV2DTO;", "invoke", "(Lj20/b;)Lru/ozon/app/android/session/userAdultModalMobileV2/data/models/UserAdultModalV2DTO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.session.userAdultModalMobileV2.presentation.ComposeAdultConfirmationViewHolderKt$adultWidget$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes2.dex */
        static final class C18661 extends AbstractC7737t implements Function1<C7244b, UserAdultModalV2DTO> {
            final /* synthetic */ JsonParser $jsonSerializer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C18661(JsonParser jsonParser) {
                super(1);
                this.$jsonSerializer = jsonParser;
            }

            @Override // kotlin.jvm.functions.Function1
            public final UserAdultModalV2DTO invoke(C7244b it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return (UserAdultModalV2DTO) this.$jsonSerializer.fromJson(it.b(), UserAdultModalV2DTO.class);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(JsonParser jsonParser) {
            super(1);
            this.$jsonSerializer = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(b<UserAdultModalV2DTO> bVar) {
            invoke2(bVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(b<UserAdultModalV2DTO> config) {
            Intrinsics.checkNotNullParameter(config, "$this$config");
            b.j(config, null, new C18661(this.$jsonSerializer), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/j;", "Lru/ozon/app/android/session/userAdultModalMobileV2/data/models/UserAdultModalV2DTO;", "Lru/ozon/app/android/session/userAdultModalMobileV2/presentation/models/UserAdultModalV2VO;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/j;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.session.userAdultModalMobileV2.presentation.ComposeAdultConfirmationViewHolderKt$adultWidget$1$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function1<j<UserAdultModalV2DTO, UserAdultModalV2VO>, Unit> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/session/userAdultModalMobileV2/data/models/UserAdultModalV2DTO;", "state", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "Lru/ozon/app/android/session/userAdultModalMobileV2/presentation/models/UserAdultModalV2VO;", "invoke", "(Lru/ozon/app/android/session/userAdultModalMobileV2/data/models/UserAdultModalV2DTO;Ll20/d;)Lru/ozon/app/android/session/userAdultModalMobileV2/presentation/models/UserAdultModalV2VO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.session.userAdultModalMobileV2.presentation.ComposeAdultConfirmationViewHolderKt$adultWidget$1$3$1, reason: invalid class name */
        /* loaded from: classes2.dex */
        static final class AnonymousClass1 extends AbstractC7737t implements Function2<UserAdultModalV2DTO, d, UserAdultModalV2VO> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            AnonymousClass1() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final UserAdultModalV2VO invoke(UserAdultModalV2DTO state, d info) {
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(info, "info");
                return new UserAdultModalV2VO(info.d().hashCode(), state.getTitle(), state.getSubtitle(), state.getInput(), state.getPrimaryButton(), state.getSecondaryButton(), state.getTrackingInfo());
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/k;", "Lru/ozon/app/android/session/userAdultModalMobileV2/presentation/models/UserAdultModalV2VO;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/k;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.session.userAdultModalMobileV2.presentation.ComposeAdultConfirmationViewHolderKt$adultWidget$1$3$2, reason: invalid class name */
        /* loaded from: classes2.dex */
        static final class AnonymousClass2 extends AbstractC7737t implements Function1<k<UserAdultModalV2VO>, Unit> {
            public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

            AnonymousClass2() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(k<UserAdultModalV2VO> kVar) {
                invoke2(kVar);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(k<UserAdultModalV2VO> widgetSpec) {
                Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
                widgetSpec.a(ComposableSingletons$ComposeAdultConfirmationViewHolderKt.INSTANCE.m1003getLambda1$session_prodGoogleAllVendorsRelease());
            }
        }

        AnonymousClass3() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(j<UserAdultModalV2DTO, UserAdultModalV2VO> jVar) {
            invoke2(jVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(j<UserAdultModalV2DTO, UserAdultModalV2VO> viewMapper) {
            Intrinsics.checkNotNullParameter(viewMapper, "$this$viewMapper");
            c.l(viewMapper, null, AnonymousClass1.INSTANCE, 1, null);
            viewMapper.G(AnonymousClass2.INSTANCE);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/overlay/e;", "Lru/ozon/app/android/session/userAdultModalMobileV2/data/models/UserAdultModalV2DTO;", "Lru/ozon/app/android/session/userAdultModalMobileV2/presentation/models/UserAdultModalV2VO;", "", "invoke", "(Lru/ozon/composer/compose/widget/overlay/e;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.session.userAdultModalMobileV2.presentation.ComposeAdultConfirmationViewHolderKt$adultWidget$1$4, reason: invalid class name */
    static final class AnonymousClass4 extends AbstractC7737t implements Function1<e<UserAdultModalV2DTO, UserAdultModalV2VO>, Unit> {
        public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/session/userAdultModalMobileV2/data/models/UserAdultModalV2DTO;", "state", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "Lru/ozon/app/android/session/userAdultModalMobileV2/presentation/models/UserAdultModalV2VO;", "invoke", "(Lru/ozon/app/android/session/userAdultModalMobileV2/data/models/UserAdultModalV2DTO;Ll20/d;)Lru/ozon/app/android/session/userAdultModalMobileV2/presentation/models/UserAdultModalV2VO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.session.userAdultModalMobileV2.presentation.ComposeAdultConfirmationViewHolderKt$adultWidget$1$4$1, reason: invalid class name */
        /* loaded from: classes2.dex */
        static final class AnonymousClass1 extends AbstractC7737t implements Function2<UserAdultModalV2DTO, d, UserAdultModalV2VO> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            AnonymousClass1() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final UserAdultModalV2VO invoke(UserAdultModalV2DTO state, d info) {
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(info, "info");
                return new UserAdultModalV2VO(info.d().hashCode(), state.getTitle(), state.getSubtitle(), state.getInput(), state.getPrimaryButton(), state.getSecondaryButton(), state.getTrackingInfo());
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/overlay/f;", "Lru/ozon/app/android/session/userAdultModalMobileV2/presentation/models/UserAdultModalV2VO;", "", "invoke", "(Lru/ozon/composer/compose/widget/overlay/f;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.session.userAdultModalMobileV2.presentation.ComposeAdultConfirmationViewHolderKt$adultWidget$1$4$2, reason: invalid class name */
        /* loaded from: classes2.dex */
        static final class AnonymousClass2 extends AbstractC7737t implements Function1<f<UserAdultModalV2VO>, Unit> {
            final /* synthetic */ InterfaceC4008j<Vg.c> $defaultActionHandlers$delegate;
            final /* synthetic */ e<UserAdultModalV2DTO, UserAdultModalV2VO> $this_overlayViewMapper;

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/session/userAdultModalMobileV2/presentation/models/UserAdultModalV2VO;", "", "invoke", "(Lru/ozon/composer/compose/widget/i;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
            /* renamed from: ru.ozon.app.android.session.userAdultModalMobileV2.presentation.ComposeAdultConfirmationViewHolderKt$adultWidget$1$4$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6511n<i<UserAdultModalV2VO>, InterfaceC3967k, Integer, Unit> {
                final /* synthetic */ InterfaceC4008j<Vg.c> $defaultActionHandlers$delegate;
                final /* synthetic */ e<UserAdultModalV2DTO, UserAdultModalV2VO> $this_overlayViewMapper;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass1(e<UserAdultModalV2DTO, UserAdultModalV2VO> eVar, InterfaceC4008j<? extends Vg.c> interfaceC4008j) {
                    super(3);
                    this.$this_overlayViewMapper = eVar;
                    this.$defaultActionHandlers$delegate = interfaceC4008j;
                }

                private static final BirthdateStateUi invoke$lambda$1(A1<? extends BirthdateStateUi> a12) {
                    return a12.getValue();
                }

                @Override // fd.InterfaceC6511n
                public /* bridge */ /* synthetic */ Unit invoke(i<UserAdultModalV2VO> iVar, InterfaceC3967k interfaceC3967k, Integer num) {
                    invoke(iVar, interfaceC3967k, num.intValue());
                    return Unit.f71690a;
                }

                public final void invoke(i<UserAdultModalV2VO> content, InterfaceC3967k interfaceC3967k, int i11) {
                    Intrinsics.checkNotNullParameter(content, "$this$content");
                    if ((i11 & 6) == 0) {
                        i11 |= interfaceC3967k.n(content) ? 4 : 2;
                    }
                    if ((i11 & 19) == 18 && interfaceC3967k.b()) {
                        interfaceC3967k.j();
                        return;
                    }
                    int i12 = i11 & 14;
                    Function1<Tg.b, Unit> m470buildHandlerimpl = WidgetActionHandlerBuilder.m470buildHandlerimpl(WidgetActionHandlerBuilder.m473handlersStoreDnHbjWo(WidgetActionHandlerKt.widgetActionHandlerBuilder(content, this.$this_overlayViewMapper.getWidgetComponentStorage(), null, null, null, interfaceC3967k, i12, 14), AnonymousClass4.invoke$lambda$0(this.$defaultActionHandlers$delegate)));
                    interfaceC3967k.B(1729797275);
                    B0 a11 = C6616a.a(interfaceC3967k);
                    if (a11 == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    w0 a12 = C6617b.a(N.b(AdultConfirmationViewModelV2.class), a11, null, null, a11 instanceof InterfaceC5431s ? ((InterfaceC5431s) a11).getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b, interfaceC3967k);
                    interfaceC3967k.K();
                    AdultConfirmationViewModelV2 adultConfirmationViewModelV2 = (AdultConfirmationViewModelV2) a12;
                    UserAdultModalV2VO b11 = content.b();
                    UserAdultModalV2VO userAdultModalV2VO = b11 instanceof UserAdultModalV2VO ? b11 : null;
                    interfaceC3967k.o(311072654);
                    boolean F11 = (i12 == 4) | interfaceC3967k.F(adultConfirmationViewModelV2);
                    Object C11 = interfaceC3967k.C();
                    if (F11 || C11 == InterfaceC3967k.a.a()) {
                        C11 = new ComposeAdultConfirmationViewHolderKt$adultWidget$1$4$2$1$1$1(adultConfirmationViewModelV2, content, null);
                        interfaceC3967k.x(C11);
                    }
                    interfaceC3967k.k();
                    Q.e(interfaceC3967k, userAdultModalV2VO, (Function2) C11);
                    InterfaceC3978p0 b12 = n1.b(adultConfirmationViewModelV2.getUiStateScreen(), interfaceC3967k);
                    if (invoke$lambda$1(b12) instanceof BirthdateStateUi.ConfirmBirthdate) {
                        BirthdateStateUi invoke$lambda$1 = invoke$lambda$1(b12);
                        Intrinsics.g(invoke$lambda$1, "null cannot be cast to non-null type ru.ozon.app.android.session.userAdultModalMobileV2.presentation.BirthdateStateUi.ConfirmBirthdate");
                        BirthdateStateUi.ConfirmBirthdate confirmBirthdate = (BirthdateStateUi.ConfirmBirthdate) invoke$lambda$1;
                        UserAdultModalV2VO b13 = content.b();
                        interfaceC3967k.o(311088267);
                        boolean F12 = interfaceC3967k.F(adultConfirmationViewModelV2);
                        Object C12 = interfaceC3967k.C();
                        if (F12 || C12 == InterfaceC3967k.a.a()) {
                            C12 = new ComposeAdultConfirmationViewHolderKt$adultWidget$1$4$2$1$2$1(adultConfirmationViewModelV2);
                            interfaceC3967k.x(C12);
                        }
                        interfaceC3967k.k();
                        ComposeAdultConfirmationViewHolderKt.AdultOverlayButtonContent(confirmBirthdate, b13, m470buildHandlerimpl, (Function0) C12, interfaceC3967k, 0, 0);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass2(e<UserAdultModalV2DTO, UserAdultModalV2VO> eVar, InterfaceC4008j<? extends Vg.c> interfaceC4008j) {
                super(1);
                this.$this_overlayViewMapper = eVar;
                this.$defaultActionHandlers$delegate = interfaceC4008j;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(f<UserAdultModalV2VO> fVar) {
                invoke2(fVar);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(f<UserAdultModalV2VO> widgetSpec) {
                Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
                widgetSpec.a(new C4912a(true, 1692313921, new AnonymousClass1(this.$this_overlayViewMapper, this.$defaultActionHandlers$delegate)));
            }
        }

        AnonymousClass4() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Vg.c invoke$lambda$0(InterfaceC4008j<? extends Vg.c> interfaceC4008j) {
            return interfaceC4008j.getValue();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(e<UserAdultModalV2DTO, UserAdultModalV2VO> eVar) {
            invoke2(eVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(e<UserAdultModalV2DTO, UserAdultModalV2VO> overlayViewMapper) {
            Intrinsics.checkNotNullParameter(overlayViewMapper, "$this$overlayViewMapper");
            c.l(overlayViewMapper, null, AnonymousClass1.INSTANCE, 1, null);
            overlayViewMapper.s(d.a.f94674b, new AnonymousClass2(overlayViewMapper, Sc.k.b(new ComposeAdultConfirmationViewHolderKt$adultWidget$1$4$defaultActionHandlers$2(overlayViewMapper))));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ComposeAdultConfirmationViewHolderKt$adultWidget$1(JsonParser jsonParser) {
        super(1);
        this.$jsonSerializer = jsonParser;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C6018d<UserAdultModalV2DTO> c6018d) {
        invoke2(c6018d);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C6018d<UserAdultModalV2DTO> ComposeWidget) {
        Intrinsics.checkNotNullParameter(ComposeWidget, "$this$ComposeWidget");
        ComposeWidget.a(new AnonymousClass1(this.$jsonSerializer));
        ComposeWidget.j().add(new C6018d.a() { // from class: ru.ozon.app.android.session.userAdultModalMobileV2.presentation.ComposeAdultConfirmationViewHolderKt$adultWidget$1$invoke$$inlined$widgetComponent$1
            @Override // d00.C6018d.a
            public final C7473e<? extends InterfaceC6958a> get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return UserAdultComponent.INSTANCE.create(it);
            }
        });
        ComposeWidget.p(AnonymousClass3.INSTANCE);
        ComposeWidget.l(AnonymousClass4.INSTANCE);
    }
}
