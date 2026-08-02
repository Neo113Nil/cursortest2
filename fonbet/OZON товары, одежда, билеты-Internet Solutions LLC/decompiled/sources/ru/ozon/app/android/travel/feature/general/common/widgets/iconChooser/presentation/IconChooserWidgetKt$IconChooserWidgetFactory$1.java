package ru.ozon.app.android.travel.feature.general.common.widgets.iconChooser.presentation;

import A00.a;
import Ek.a;
import S0.InterfaceC3967k;
import a00.h;
import a1.C4912a;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.B0;
import androidx.lifecycle.InterfaceC5431s;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import b00.f;
import d00.C6018d;
import f3.AbstractC6409a;
import fd.InterfaceC6512o;
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
import kotlin.jvm.internal.M;
import kotlin.jvm.internal.N;
import l20.d;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.travel.feature.general.common.configurators.IconChooserUpdate;
import ru.ozon.app.android.travel.feature.general.common.widgets.iconChooser.data.IconChooserDTO;
import ru.ozon.app.android.travel.feature.general.common.widgets.iconChooser.di.IconChooserComponent;
import ru.ozon.app.android.travel.feature.general.common.widgets.iconChooser.presentation.IconChooserVI;
import ru.ozon.composer.compose.widget.c;
import ru.ozon.composer.compose.widget.config.b;
import ru.ozon.composer.compose.widget.g;
import ru.ozon.composer.compose.widget.i;
import ru.ozon.composer.compose.widget.scrollable.j;
import ru.ozon.composer.compose.widget.scrollable.k;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld00/d;", "Lru/ozon/app/android/travel/feature/general/common/widgets/iconChooser/data/IconChooserDTO;", "", "invoke", "(Ld00/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class IconChooserWidgetKt$IconChooserWidgetFactory$1 extends AbstractC7737t implements Function1<C6018d<IconChooserDTO>, Unit> {
    final /* synthetic */ JsonParser $jsonDeserializer;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/config/b;", "Lru/ozon/app/android/travel/feature/general/common/widgets/iconChooser/data/IconChooserDTO;", "", "invoke", "(Lru/ozon/composer/compose/widget/config/b;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.travel.feature.general.common.widgets.iconChooser.presentation.IconChooserWidgetKt$IconChooserWidgetFactory$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<b<IconChooserDTO>, Unit> {
        final /* synthetic */ JsonParser $jsonDeserializer;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj20/b;", "it", "Lru/ozon/app/android/travel/feature/general/common/widgets/iconChooser/data/IconChooserDTO;", "invoke", "(Lj20/b;)Lru/ozon/app/android/travel/feature/general/common/widgets/iconChooser/data/IconChooserDTO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.travel.feature.general.common.widgets.iconChooser.presentation.IconChooserWidgetKt$IconChooserWidgetFactory$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes4.dex */
        static final class C19131 extends AbstractC7737t implements Function1<C7244b, IconChooserDTO> {
            final /* synthetic */ JsonParser $jsonDeserializer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C19131(JsonParser jsonParser) {
                super(1);
                this.$jsonDeserializer = jsonParser;
            }

            @Override // kotlin.jvm.functions.Function1
            public final IconChooserDTO invoke(C7244b it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return (IconChooserDTO) this.$jsonDeserializer.fromJson(it.b(), IconChooserDTO.class);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(JsonParser jsonParser) {
            super(1);
            this.$jsonDeserializer = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(b<IconChooserDTO> bVar) {
            invoke2(bVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(b<IconChooserDTO> config) {
            Intrinsics.checkNotNullParameter(config, "$this$config");
            b.j(config, null, new C19131(this.$jsonDeserializer), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/j;", "Lru/ozon/app/android/travel/feature/general/common/widgets/iconChooser/data/IconChooserDTO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/iconChooser/presentation/IconChooserVI;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/j;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.travel.feature.general.common.widgets.iconChooser.presentation.IconChooserWidgetKt$IconChooserWidgetFactory$1$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function1<j<IconChooserDTO, IconChooserVI>, Unit> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/iconChooser/data/IconChooserDTO;", "state", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "Lru/ozon/app/android/travel/feature/general/common/widgets/iconChooser/presentation/IconChooserVI;", "invoke", "(Lru/ozon/app/android/travel/feature/general/common/widgets/iconChooser/data/IconChooserDTO;Ll20/d;)Lru/ozon/app/android/travel/feature/general/common/widgets/iconChooser/presentation/IconChooserVI;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.travel.feature.general.common.widgets.iconChooser.presentation.IconChooserWidgetKt$IconChooserWidgetFactory$1$3$1, reason: invalid class name */
        /* loaded from: classes4.dex */
        static final class AnonymousClass1 extends AbstractC7737t implements Function2<IconChooserDTO, d, IconChooserVI> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            AnonymousClass1() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final IconChooserVI invoke(IconChooserDTO state, d info) {
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(info, "info");
                return IconChooserMapperKt.toVI$default(state, info.d(), null, 2, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/k;", "Lru/ozon/app/android/travel/feature/general/common/widgets/iconChooser/presentation/IconChooserVI;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/k;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.travel.feature.general.common.widgets.iconChooser.presentation.IconChooserWidgetKt$IconChooserWidgetFactory$1$3$2, reason: invalid class name */
        /* loaded from: classes4.dex */
        static final class AnonymousClass2 extends AbstractC7737t implements Function1<k<IconChooserVI>, Unit> {
            final /* synthetic */ M<IconChooserViewModel> $iconChooserViewModel;
            final /* synthetic */ IconChooserComponent $widgetComponent;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/travel/feature/general/common/widgets/iconChooser/presentation/IconChooserVI;", "Lru/ozon/composer/compose/widget/g$a;", "it", "", "invoke", "(Lru/ozon/composer/compose/widget/i;Lru/ozon/composer/compose/widget/g$a;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
            /* renamed from: ru.ozon.app.android.travel.feature.general.common.widgets.iconChooser.presentation.IconChooserWidgetKt$IconChooserWidgetFactory$1$3$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6512o<i<IconChooserVI>, g.a, InterfaceC3967k, Integer, Unit> {
                final /* synthetic */ M<IconChooserViewModel> $iconChooserViewModel;
                final /* synthetic */ IconChooserComponent $widgetComponent;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(M<IconChooserViewModel> m11, IconChooserComponent iconChooserComponent) {
                    super(4);
                    this.$iconChooserViewModel = m11;
                    this.$widgetComponent = iconChooserComponent;
                }

                @Override // fd.InterfaceC6512o
                public /* bridge */ /* synthetic */ Unit invoke(i<IconChooserVI> iVar, g.a aVar, InterfaceC3967k interfaceC3967k, Integer num) {
                    invoke(iVar, aVar, interfaceC3967k, num.intValue());
                    return Unit.f71690a;
                }

                /* JADX WARN: Type inference failed for: r9v13, types: [T, ru.ozon.app.android.travel.feature.general.common.widgets.iconChooser.presentation.IconChooserViewModel] */
                public final void invoke(i<IconChooserVI> content, g.a it, InterfaceC3967k interfaceC3967k, int i11) {
                    IconChooserVI.IconEnum currentAppIcon;
                    Intrinsics.checkNotNullParameter(content, "$this$content");
                    Intrinsics.checkNotNullParameter(it, "it");
                    if ((i11 & 6) == 0) {
                        i11 |= interfaceC3967k.n(content) ? 4 : 2;
                    }
                    if ((i11 & 131) == 130 && interfaceC3967k.b()) {
                        interfaceC3967k.j();
                        return;
                    }
                    h hVar = (h) interfaceC3967k.m(f.f());
                    M<IconChooserViewModel> m11 = this.$iconChooserViewModel;
                    interfaceC3967k.o(572866849);
                    B0 a11 = hVar.a();
                    z0.b viewModelFactory = this.$widgetComponent.getViewModelFactory();
                    interfaceC3967k.B(1729797275);
                    w0 a12 = C6617b.a(N.b(IconChooserViewModel.class), a11, null, viewModelFactory, a11 instanceof InterfaceC5431s ? ((InterfaceC5431s) a11).getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b, interfaceC3967k);
                    interfaceC3967k.K();
                    ?? r92 = (IconChooserViewModel) a12;
                    currentAppIcon = IconChooserWidgetKt.getCurrentAppIcon((Context) interfaceC3967k.m(AndroidCompositionLocals_androidKt.d()));
                    r92.bindData(currentAppIcon, content.b());
                    interfaceC3967k.k();
                    m11.f71787a = r92;
                    IconChooserViewModel iconChooserViewModel = this.$iconChooserViewModel.f71787a;
                    if (iconChooserViewModel == null) {
                        Intrinsics.n("iconChooserViewModel");
                        throw null;
                    }
                    IconChooserViewModel iconChooserViewModel2 = iconChooserViewModel;
                    interfaceC3967k.o(572877906);
                    boolean F11 = interfaceC3967k.F(this.$widgetComponent);
                    IconChooserComponent iconChooserComponent = this.$widgetComponent;
                    Object C11 = interfaceC3967k.C();
                    if (F11 || C11 == InterfaceC3967k.a.a()) {
                        C11 = new IconChooserWidgetKt$IconChooserWidgetFactory$1$3$2$1$2$1(iconChooserComponent);
                        interfaceC3967k.x(C11);
                    }
                    interfaceC3967k.k();
                    IconChooserContentKt.IconChooserContent(iconChooserViewModel2, (Function0) C11, interfaceC3967k, 0);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(M<IconChooserViewModel> m11, IconChooserComponent iconChooserComponent) {
                super(1);
                this.$iconChooserViewModel = m11;
                this.$widgetComponent = iconChooserComponent;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(k<IconChooserVI> kVar) {
                invoke2(kVar);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(k<IconChooserVI> widgetSpec) {
                Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
                widgetSpec.a(new C4912a(true, 1468681443, new AnonymousClass1(this.$iconChooserViewModel, this.$widgetComponent)));
            }
        }

        AnonymousClass3() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(j<IconChooserDTO, IconChooserVI> jVar) {
            invoke2(jVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(j<IconChooserDTO, IconChooserVI> jVar) {
            final IconChooserComponent iconChooserComponent = (IconChooserComponent) a.c(jVar, "$this$viewMapper", IconChooserComponent.class);
            final M m11 = new M();
            c.l(jVar, null, AnonymousClass1.INSTANCE, 1, null);
            jVar.G(new AnonymousClass2(m11, iconChooserComponent));
            jVar.c().put(IconChooserUpdate.class, new c.a() { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.iconChooser.presentation.IconChooserWidgetKt$IconChooserWidgetFactory$1$3$invoke$$inlined$update$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // ru.ozon.composer.compose.widget.c.a
                public final I handle(a.J.InterfaceC0007a update, I old) {
                    IconChooserVI.IconEnum currentAppIcon;
                    Intrinsics.checkNotNullParameter(update, "update");
                    Intrinsics.checkNotNullParameter(old, "old");
                    currentAppIcon = IconChooserWidgetKt.getCurrentAppIcon(IconChooserComponent.this.getContext());
                    IconChooserVI updateSelectedState = IconChooserMapperKt.updateSelectedState((IconChooserVI) old, currentAppIcon);
                    T t2 = m11.f71787a;
                    if (t2 != 0) {
                        ((IconChooserViewModel) t2).bindData(currentAppIcon, updateSelectedState);
                        return updateSelectedState;
                    }
                    Intrinsics.n("iconChooserViewModel");
                    throw null;
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IconChooserWidgetKt$IconChooserWidgetFactory$1(JsonParser jsonParser) {
        super(1);
        this.$jsonDeserializer = jsonParser;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C6018d<IconChooserDTO> c6018d) {
        invoke2(c6018d);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C6018d<IconChooserDTO> ComposeWidget) {
        Intrinsics.checkNotNullParameter(ComposeWidget, "$this$ComposeWidget");
        ComposeWidget.a(new AnonymousClass1(this.$jsonDeserializer));
        ComposeWidget.j().add(new C6018d.a() { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.iconChooser.presentation.IconChooserWidgetKt$IconChooserWidgetFactory$1$invoke$$inlined$widgetComponent$1
            @Override // d00.C6018d.a
            public final C7473e<? extends InterfaceC6958a> get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return IconChooserComponent.INSTANCE.getInstance(it);
            }
        });
        ComposeWidget.p(AnonymousClass3.INSTANCE);
    }
}
