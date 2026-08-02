package ru.ozon.app.android.storefront.widgets.profileIconButton.presentation.compose;

import A00.a;
import Ek.a;
import S0.InterfaceC3967k;
import a1.C4912a;
import android.content.SharedPreferences;
import b00.f;
import d00.C6018d;
import fd.InterfaceC6512o;
import hi.InterfaceC6958a;
import j20.C7244b;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l20.d;
import m20.InterfaceC8046a;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.action.WidgetActionHandlerBuilder;
import ru.ozon.app.android.action.WidgetActionHandlerKt;
import ru.ozon.app.android.common.actionHandlers.CopyTextActionHandler;
import ru.ozon.app.android.common.actionHandlers.shareLink.ShareLinkActionHandler;
import ru.ozon.app.android.domain.flags.ProfileIconButtonComposeWidgetEnabled;
import ru.ozon.app.android.domain.flags.TooltipRichAnimationEnabled;
import ru.ozon.app.android.platform.customActionHandlers.composerActionAndRedirect.handler.ComposerActionAndRedirectActionHandler;
import ru.ozon.app.android.platform.customActionHandlers.composerActionWithAction.ComposerActionWithActionHandler;
import ru.ozon.app.android.storefront.actionHandlers.PopAndRedirectActionHandler;
import ru.ozon.app.android.storefront.widgets.profileIconButton.data.ProfileIconButtonDTO;
import ru.ozon.app.android.storefront.widgets.profileIconButton.di.ProfileIconButtonComponent;
import ru.ozon.app.android.storefront.widgets.profileIconButton.presentation.ProfileIconButtonVO;
import ru.ozon.app.android.storefront.widgets.profileIconButton.presentation.ProfileIconButtonViewMapper;
import ru.ozon.app.android.storefront.widgets.profileIconButton.presentation.compose.presentation.ProfileIconButtonKt;
import ru.ozon.composer.compose.widget.c;
import ru.ozon.composer.compose.widget.config.b;
import ru.ozon.composer.compose.widget.g;
import ru.ozon.composer.compose.widget.i;
import ru.ozon.composer.compose.widget.scrollable.j;
import ru.ozon.composer.compose.widget.scrollable.k;
import ru.ozon.uni.atoms.data.common.TooltipDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld00/d;", "Lru/ozon/app/android/storefront/widgets/profileIconButton/data/ProfileIconButtonDTO;", "", "invoke", "(Ld00/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class ProfileIconButtonComposeWidgetKt$profileIconButtonComposeWidget$1 extends AbstractC7737t implements Function1<C6018d<ProfileIconButtonDTO>, Unit> {
    final /* synthetic */ JsonParser $jsonDeserializer;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/config/b;", "Lru/ozon/app/android/storefront/widgets/profileIconButton/data/ProfileIconButtonDTO;", "", "invoke", "(Lru/ozon/composer/compose/widget/config/b;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.storefront.widgets.profileIconButton.presentation.compose.ProfileIconButtonComposeWidgetKt$profileIconButtonComposeWidget$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<b<ProfileIconButtonDTO>, Unit> {
        final /* synthetic */ JsonParser $jsonDeserializer;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj20/b;", "it", "Lru/ozon/app/android/storefront/widgets/profileIconButton/data/ProfileIconButtonDTO;", "invoke", "(Lj20/b;)Lru/ozon/app/android/storefront/widgets/profileIconButton/data/ProfileIconButtonDTO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.storefront.widgets.profileIconButton.presentation.compose.ProfileIconButtonComposeWidgetKt$profileIconButtonComposeWidget$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes2.dex */
        static final class C18781 extends AbstractC7737t implements Function1<C7244b, ProfileIconButtonDTO> {
            final /* synthetic */ JsonParser $jsonDeserializer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C18781(JsonParser jsonParser) {
                super(1);
                this.$jsonDeserializer = jsonParser;
            }

            @Override // kotlin.jvm.functions.Function1
            public final ProfileIconButtonDTO invoke(C7244b it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return (ProfileIconButtonDTO) this.$jsonDeserializer.fromJson(it.b(), ProfileIconButtonDTO.class);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(JsonParser jsonParser) {
            super(1);
            this.$jsonDeserializer = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(b<ProfileIconButtonDTO> bVar) {
            invoke2(bVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(b<ProfileIconButtonDTO> config) {
            Intrinsics.checkNotNullParameter(config, "$this$config");
            b.j(config, null, new C18781(this.$jsonDeserializer), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/j;", "Lru/ozon/app/android/storefront/widgets/profileIconButton/data/ProfileIconButtonDTO;", "Lru/ozon/app/android/storefront/widgets/profileIconButton/presentation/ProfileIconButtonVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/j;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.storefront.widgets.profileIconButton.presentation.compose.ProfileIconButtonComposeWidgetKt$profileIconButtonComposeWidget$1$4, reason: invalid class name */
    static final class AnonymousClass4 extends AbstractC7737t implements Function1<j<ProfileIconButtonDTO, ProfileIconButtonVO>, Unit> {
        public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.storefront.widgets.profileIconButton.presentation.compose.ProfileIconButtonComposeWidgetKt$profileIconButtonComposeWidget$1$4$1, reason: invalid class name */
        /* loaded from: classes2.dex */
        static final class AnonymousClass1 extends AbstractC7737t implements Function1<Object, Boolean> {
            final /* synthetic */ ProfileIconButtonComponent $component;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ProfileIconButtonComponent profileIconButtonComponent) {
                super(1);
                this.$component = profileIconButtonComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf((obj instanceof ProfileIconButtonDTO) && this.$component.getFeatureChecker().isEnabled(ProfileIconButtonComposeWidgetEnabled.INSTANCE));
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/ozon/app/android/storefront/widgets/profileIconButton/data/ProfileIconButtonDTO;", "state", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "Lru/ozon/app/android/storefront/widgets/profileIconButton/presentation/ProfileIconButtonVO;", "invoke", "(Lru/ozon/app/android/storefront/widgets/profileIconButton/data/ProfileIconButtonDTO;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.storefront.widgets.profileIconButton.presentation.compose.ProfileIconButtonComposeWidgetKt$profileIconButtonComposeWidget$1$4$2, reason: invalid class name */
        /* loaded from: classes2.dex */
        static final class AnonymousClass2 extends AbstractC7737t implements Function2<ProfileIconButtonDTO, d, List<? extends ProfileIconButtonVO>> {
            final /* synthetic */ ProfileIconButtonComponent $component;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(ProfileIconButtonComponent profileIconButtonComponent) {
                super(2);
                this.$component = profileIconButtonComponent;
            }

            @Override // kotlin.jvm.functions.Function2
            public final List<ProfileIconButtonVO> invoke(ProfileIconButtonDTO state, d info) {
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(info, "info");
                return this.$component.getMapper().invoke(state, info);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/k;", "Lru/ozon/app/android/storefront/widgets/profileIconButton/presentation/ProfileIconButtonVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/k;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.storefront.widgets.profileIconButton.presentation.compose.ProfileIconButtonComposeWidgetKt$profileIconButtonComposeWidget$1$4$4, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes2.dex */
        static final class C18794 extends AbstractC7737t implements Function1<k<ProfileIconButtonVO>, Unit> {
            final /* synthetic */ ProfileIconButtonComponent $component;
            final /* synthetic */ SharedPreferences $sharedPreferences;
            final /* synthetic */ j<ProfileIconButtonDTO, ProfileIconButtonVO> $this_viewMapper;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/storefront/widgets/profileIconButton/presentation/ProfileIconButtonVO;", "Lru/ozon/composer/compose/widget/g$a;", "it", "", "invoke", "(Lru/ozon/composer/compose/widget/i;Lru/ozon/composer/compose/widget/g$a;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
            /* renamed from: ru.ozon.app.android.storefront.widgets.profileIconButton.presentation.compose.ProfileIconButtonComposeWidgetKt$profileIconButtonComposeWidget$1$4$4$1, reason: invalid class name */
            static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6512o<i<ProfileIconButtonVO>, g.a, InterfaceC3967k, Integer, Unit> {
                final /* synthetic */ ProfileIconButtonComponent $component;
                final /* synthetic */ SharedPreferences $sharedPreferences;
                final /* synthetic */ j<ProfileIconButtonDTO, ProfileIconButtonVO> $this_viewMapper;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(j<ProfileIconButtonDTO, ProfileIconButtonVO> jVar, ProfileIconButtonComponent profileIconButtonComponent, SharedPreferences sharedPreferences) {
                    super(4);
                    this.$this_viewMapper = jVar;
                    this.$component = profileIconButtonComponent;
                    this.$sharedPreferences = sharedPreferences;
                }

                @Override // fd.InterfaceC6512o
                public /* bridge */ /* synthetic */ Unit invoke(i<ProfileIconButtonVO> iVar, g.a aVar, InterfaceC3967k interfaceC3967k, Integer num) {
                    invoke(iVar, aVar, interfaceC3967k, num.intValue());
                    return Unit.f71690a;
                }

                public final void invoke(i<ProfileIconButtonVO> content, g.a it, InterfaceC3967k interfaceC3967k, int i11) {
                    Intrinsics.checkNotNullParameter(content, "$this$content");
                    Intrinsics.checkNotNullParameter(it, "it");
                    if ((i11 & 6) == 0) {
                        i11 |= interfaceC3967k.n(content) ? 4 : 2;
                    }
                    if ((i11 & 131) == 130 && interfaceC3967k.b()) {
                        interfaceC3967k.j();
                        return;
                    }
                    InterfaceC7851b interfaceC7851b = (InterfaceC7851b) interfaceC3967k.m(f.c());
                    int i12 = i11 & 14;
                    Function1<Tg.b, Unit> m470buildHandlerimpl = WidgetActionHandlerBuilder.m470buildHandlerimpl(WidgetActionHandlerBuilder.m473handlersStoreDnHbjWo(WidgetActionHandlerKt.widgetActionHandlerBuilder(content, this.$this_viewMapper.getWidgetComponentStorage(), null, null, null, interfaceC3967k, i12, 14), this.$component.getCustomActionHandlersStoreFactory().create(ShareLinkActionHandler.class, ComposerActionWithActionHandler.class, ComposerActionAndRedirectActionHandler.class, PopAndRedirectActionHandler.class, CopyTextActionHandler.class)));
                    interfaceC3967k.o(1314136138);
                    boolean F11 = (i12 == 4) | interfaceC3967k.F(this.$sharedPreferences);
                    SharedPreferences sharedPreferences = this.$sharedPreferences;
                    Object C11 = interfaceC3967k.C();
                    if (F11 || C11 == InterfaceC3967k.a.a()) {
                        C11 = new ProfileIconButtonComposeWidgetKt$profileIconButtonComposeWidget$1$4$4$1$onTooltipShown$1$1(content, sharedPreferences);
                        interfaceC3967k.x(C11);
                    }
                    Function1 function1 = (Function1) C11;
                    interfaceC3967k.k();
                    interfaceC3967k.o(1314145629);
                    boolean F12 = (i12 == 4) | interfaceC3967k.F(interfaceC7851b);
                    Object C12 = interfaceC3967k.C();
                    if (F12 || C12 == InterfaceC3967k.a.a()) {
                        C12 = new ProfileIconButtonComposeWidgetKt$profileIconButtonComposeWidget$1$4$4$1$onTooltipDismiss$1$1(content, interfaceC7851b);
                        interfaceC3967k.x(C12);
                    }
                    Function0 function0 = (Function0) C12;
                    interfaceC3967k.k();
                    boolean isEnabled = this.$component.getFeatureChecker().isEnabled(TooltipRichAnimationEnabled.INSTANCE);
                    ProfileIconButtonVO b11 = content.b();
                    interfaceC3967k.o(1314163958);
                    boolean F13 = (i12 == 4) | interfaceC3967k.F(this.$sharedPreferences);
                    SharedPreferences sharedPreferences2 = this.$sharedPreferences;
                    Object C13 = interfaceC3967k.C();
                    if (F13 || C13 == InterfaceC3967k.a.a()) {
                        C13 = new ProfileIconButtonComposeWidgetKt$profileIconButtonComposeWidget$1$4$4$1$1$1(content, sharedPreferences2);
                        interfaceC3967k.x(C13);
                    }
                    interfaceC3967k.k();
                    ProfileIconButtonKt.ProfileIconButton(b11, isEnabled, m470buildHandlerimpl, (Function1) C13, function1, function0, interfaceC3967k, IconButtonV3DTO.$stable | TooltipDTO.$stable);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C18794(j<ProfileIconButtonDTO, ProfileIconButtonVO> jVar, ProfileIconButtonComponent profileIconButtonComponent, SharedPreferences sharedPreferences) {
                super(1);
                this.$this_viewMapper = jVar;
                this.$component = profileIconButtonComponent;
                this.$sharedPreferences = sharedPreferences;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(k<ProfileIconButtonVO> kVar) {
                invoke2(kVar);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(k<ProfileIconButtonVO> widgetSpec) {
                Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
                widgetSpec.a(new C4912a(true, 868477390, new AnonymousClass1(this.$this_viewMapper, this.$component, this.$sharedPreferences)));
            }
        }

        AnonymousClass4() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(j<ProfileIconButtonDTO, ProfileIconButtonVO> jVar) {
            invoke2(jVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(j<ProfileIconButtonDTO, ProfileIconButtonVO> jVar) {
            ProfileIconButtonComponent profileIconButtonComponent = (ProfileIconButtonComponent) a.c(jVar, "$this$viewMapper", ProfileIconButtonComponent.class);
            SharedPreferences sharedPreferences = profileIconButtonComponent.getSharedPreferences();
            jVar.i(new AnonymousClass1(profileIconButtonComponent), new AnonymousClass2(profileIconButtonComponent));
            jVar.c().put(TooltipCloseUpdateKey.class, new c.a() { // from class: ru.ozon.app.android.storefront.widgets.profileIconButton.presentation.compose.ProfileIconButtonComposeWidgetKt$profileIconButtonComposeWidget$1$4$invoke$$inlined$update$1
                @Override // ru.ozon.composer.compose.widget.c.a
                public final I handle(a.J.InterfaceC0007a update, I old) {
                    Intrinsics.checkNotNullParameter(update, "update");
                    Intrinsics.checkNotNullParameter(old, "old");
                    ProfileIconButtonVO profileIconButtonVO = (ProfileIconButtonVO) old;
                    return ((TooltipCloseUpdateKey) update).getWidgetId() == profileIconButtonVO.getId() ? ProfileIconButtonVO.copy$default(profileIconButtonVO, 0L, null, null, null, null, null, true, 63, null) : profileIconButtonVO;
                }
            });
            jVar.G(new C18794(jVar, profileIconButtonComponent, sharedPreferences));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProfileIconButtonComposeWidgetKt$profileIconButtonComposeWidget$1(JsonParser jsonParser) {
        super(1);
        this.$jsonDeserializer = jsonParser;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C6018d<ProfileIconButtonDTO> c6018d) {
        invoke2(c6018d);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C6018d<ProfileIconButtonDTO> ComposeWidget) {
        Intrinsics.checkNotNullParameter(ComposeWidget, "$this$ComposeWidget");
        ComposeWidget.a(new AnonymousClass1(this.$jsonDeserializer));
        ComposeWidget.j().add(new C6018d.a() { // from class: ru.ozon.app.android.storefront.widgets.profileIconButton.presentation.compose.ProfileIconButtonComposeWidgetKt$profileIconButtonComposeWidget$1$invoke$$inlined$widgetComponent$1
            @Override // d00.C6018d.a
            public final C7473e<? extends InterfaceC6958a> get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return ProfileIconButtonComponent.INSTANCE.create(it);
            }
        });
        ComposeWidget.g().add(new C6018d.a() { // from class: ru.ozon.app.android.storefront.widgets.profileIconButton.presentation.compose.ProfileIconButtonComposeWidgetKt$profileIconButtonComposeWidget$1$invoke$$inlined$rawViewMapper$1
            @Override // d00.C6018d.a
            public final InterfaceC8046a<? extends Object, ? extends l20.c> get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new ProfileIconButtonViewMapper((ProfileIconButtonComponent) it.getComponent(ProfileIconButtonComponent.class));
            }
        });
        ComposeWidget.p(AnonymousClass4.INSTANCE);
    }
}
