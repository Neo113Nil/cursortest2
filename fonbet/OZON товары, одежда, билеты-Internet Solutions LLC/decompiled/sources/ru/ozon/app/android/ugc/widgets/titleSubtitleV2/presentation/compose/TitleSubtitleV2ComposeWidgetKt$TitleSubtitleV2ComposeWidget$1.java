package ru.ozon.app.android.ugc.widgets.titleSubtitleV2.presentation.compose;

import Ek.a;
import d00.C6018d;
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
import l20.c;
import l20.d;
import m20.InterfaceC8046a;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.ugc.flags.TitleSubtitleV2ComposeWidgetEnabled;
import ru.ozon.app.android.ugc.widgets.titleSubtitleV2.core.TitleSubtitleV2ViewMapper;
import ru.ozon.app.android.ugc.widgets.titleSubtitleV2.data.TitleSubtitleV2DTO;
import ru.ozon.app.android.ugc.widgets.titleSubtitleV2.di.TitleSubtitleV2Component;
import ru.ozon.app.android.ugc.widgets.titleSubtitleV2.presentation.TitleSubtitleVO;
import ru.ozon.composer.compose.widget.config.b;
import ru.ozon.composer.compose.widget.scrollable.j;
import ru.ozon.composer.compose.widget.scrollable.k;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld00/d;", "Lru/ozon/app/android/ugc/widgets/titleSubtitleV2/data/TitleSubtitleV2DTO;", "", "invoke", "(Ld00/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class TitleSubtitleV2ComposeWidgetKt$TitleSubtitleV2ComposeWidget$1 extends AbstractC7737t implements Function1<C6018d<TitleSubtitleV2DTO>, Unit> {
    final /* synthetic */ JsonParser $jsonDeserializer;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/config/b;", "Lru/ozon/app/android/ugc/widgets/titleSubtitleV2/data/TitleSubtitleV2DTO;", "", "invoke", "(Lru/ozon/composer/compose/widget/config/b;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.ugc.widgets.titleSubtitleV2.presentation.compose.TitleSubtitleV2ComposeWidgetKt$TitleSubtitleV2ComposeWidget$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<b<TitleSubtitleV2DTO>, Unit> {
        final /* synthetic */ JsonParser $jsonDeserializer;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj20/b;", "it", "Lru/ozon/app/android/ugc/widgets/titleSubtitleV2/data/TitleSubtitleV2DTO;", "invoke", "(Lj20/b;)Lru/ozon/app/android/ugc/widgets/titleSubtitleV2/data/TitleSubtitleV2DTO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.ugc.widgets.titleSubtitleV2.presentation.compose.TitleSubtitleV2ComposeWidgetKt$TitleSubtitleV2ComposeWidget$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes2.dex */
        static final class C19631 extends AbstractC7737t implements Function1<C7244b, TitleSubtitleV2DTO> {
            final /* synthetic */ JsonParser $jsonDeserializer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C19631(JsonParser jsonParser) {
                super(1);
                this.$jsonDeserializer = jsonParser;
            }

            @Override // kotlin.jvm.functions.Function1
            public final TitleSubtitleV2DTO invoke(C7244b it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return (TitleSubtitleV2DTO) this.$jsonDeserializer.fromJson(it.b(), TitleSubtitleV2DTO.class);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(JsonParser jsonParser) {
            super(1);
            this.$jsonDeserializer = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(b<TitleSubtitleV2DTO> bVar) {
            invoke2(bVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(b<TitleSubtitleV2DTO> config) {
            Intrinsics.checkNotNullParameter(config, "$this$config");
            b.j(config, null, new C19631(this.$jsonDeserializer), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/j;", "Lru/ozon/app/android/ugc/widgets/titleSubtitleV2/data/TitleSubtitleV2DTO;", "Lru/ozon/app/android/ugc/widgets/titleSubtitleV2/presentation/TitleSubtitleVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/j;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.ugc.widgets.titleSubtitleV2.presentation.compose.TitleSubtitleV2ComposeWidgetKt$TitleSubtitleV2ComposeWidget$1$4, reason: invalid class name */
    static final class AnonymousClass4 extends AbstractC7737t implements Function1<j<TitleSubtitleV2DTO, TitleSubtitleVO>, Unit> {
        public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.ugc.widgets.titleSubtitleV2.presentation.compose.TitleSubtitleV2ComposeWidgetKt$TitleSubtitleV2ComposeWidget$1$4$1, reason: invalid class name */
        /* loaded from: classes2.dex */
        static final class AnonymousClass1 extends AbstractC7737t implements Function1<Object, Boolean> {
            final /* synthetic */ TitleSubtitleV2Component $component;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(TitleSubtitleV2Component titleSubtitleV2Component) {
                super(1);
                this.$component = titleSubtitleV2Component;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf((obj instanceof TitleSubtitleV2DTO) && this.$component.getFeatureChecker().isEnabled(TitleSubtitleV2ComposeWidgetEnabled.INSTANCE));
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/ugc/widgets/titleSubtitleV2/data/TitleSubtitleV2DTO;", "state", "Ll20/d;", "info", "", "Lru/ozon/app/android/ugc/widgets/titleSubtitleV2/presentation/TitleSubtitleVO;", "invoke", "(Lru/ozon/app/android/ugc/widgets/titleSubtitleV2/data/TitleSubtitleV2DTO;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.ugc.widgets.titleSubtitleV2.presentation.compose.TitleSubtitleV2ComposeWidgetKt$TitleSubtitleV2ComposeWidget$1$4$2, reason: invalid class name */
        /* loaded from: classes2.dex */
        static final class AnonymousClass2 extends AbstractC7737t implements Function2<TitleSubtitleV2DTO, d, List<? extends TitleSubtitleVO>> {
            final /* synthetic */ TitleSubtitleV2Component $component;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(TitleSubtitleV2Component titleSubtitleV2Component) {
                super(2);
                this.$component = titleSubtitleV2Component;
            }

            @Override // kotlin.jvm.functions.Function2
            public final List<TitleSubtitleVO> invoke(TitleSubtitleV2DTO state, d info) {
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(info, "info");
                return this.$component.getMapper().invoke(state, info);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/k;", "Lru/ozon/app/android/ugc/widgets/titleSubtitleV2/presentation/TitleSubtitleVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/k;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.ugc.widgets.titleSubtitleV2.presentation.compose.TitleSubtitleV2ComposeWidgetKt$TitleSubtitleV2ComposeWidget$1$4$3, reason: invalid class name */
        /* loaded from: classes2.dex */
        static final class AnonymousClass3 extends AbstractC7737t implements Function1<k<TitleSubtitleVO>, Unit> {
            public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

            AnonymousClass3() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(k<TitleSubtitleVO> kVar) {
                invoke2(kVar);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(k<TitleSubtitleVO> widgetSpec) {
                Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
                widgetSpec.a(ComposableSingletons$TitleSubtitleV2ComposeWidgetKt.INSTANCE.m1533getLambda1$ugc_prodGoogleAllVendorsRelease());
            }
        }

        AnonymousClass4() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(j<TitleSubtitleV2DTO, TitleSubtitleVO> jVar) {
            invoke2(jVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(j<TitleSubtitleV2DTO, TitleSubtitleVO> jVar) {
            TitleSubtitleV2Component titleSubtitleV2Component = (TitleSubtitleV2Component) a.c(jVar, "$this$viewMapper", TitleSubtitleV2Component.class);
            jVar.i(new AnonymousClass1(titleSubtitleV2Component), new AnonymousClass2(titleSubtitleV2Component));
            jVar.G(AnonymousClass3.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TitleSubtitleV2ComposeWidgetKt$TitleSubtitleV2ComposeWidget$1(JsonParser jsonParser) {
        super(1);
        this.$jsonDeserializer = jsonParser;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C6018d<TitleSubtitleV2DTO> c6018d) {
        invoke2(c6018d);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C6018d<TitleSubtitleV2DTO> ComposeWidget) {
        Intrinsics.checkNotNullParameter(ComposeWidget, "$this$ComposeWidget");
        ComposeWidget.a(new AnonymousClass1(this.$jsonDeserializer));
        ComposeWidget.j().add(new C6018d.a() { // from class: ru.ozon.app.android.ugc.widgets.titleSubtitleV2.presentation.compose.TitleSubtitleV2ComposeWidgetKt$TitleSubtitleV2ComposeWidget$1$invoke$$inlined$widgetComponent$1
            @Override // d00.C6018d.a
            public final C7473e<? extends InterfaceC6958a> get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return TitleSubtitleV2Component.INSTANCE.getInstance(it);
            }
        });
        ComposeWidget.g().add(new C6018d.a() { // from class: ru.ozon.app.android.ugc.widgets.titleSubtitleV2.presentation.compose.TitleSubtitleV2ComposeWidgetKt$TitleSubtitleV2ComposeWidget$1$invoke$$inlined$rawViewMapper$1
            @Override // d00.C6018d.a
            public final InterfaceC8046a<? extends Object, ? extends c> get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new TitleSubtitleV2ViewMapper((TitleSubtitleV2Component) it.getComponent(TitleSubtitleV2Component.class));
            }
        });
        ComposeWidget.p(AnonymousClass4.INSTANCE);
    }
}
