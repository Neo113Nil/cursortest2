package ru.ozon.app.android.storefront.widgets.cms.banner.core;

import Ek.a;
import S0.InterfaceC3967k;
import WZ.t;
import a1.C4912a;
import android.view.View;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import d00.C6018d;
import fd.InterfaceC6512o;
import hi.InterfaceC6958a;
import j20.C7244b;
import j20.InterfaceC7243a;
import java.util.Map;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l20.c;
import l20.d;
import m20.InterfaceC8046a;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.WidgetActionHandlerBuilder;
import ru.ozon.app.android.action.WidgetActionHandlerKt;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.domain.flags.CmsBannerComposeEnabledFlag;
import ru.ozon.app.android.storefront.widgets.cms.banner.BannerDTO;
import ru.ozon.app.android.storefront.widgets.cms.banner.presentation.BannerComposableKt;
import ru.ozon.app.android.storefront.widgets.cms.banner.presentation.BannerVI;
import ru.ozon.app.android.storefront.widgets.cms.di.BannerComponent;
import ru.ozon.composer.compose.widget.config.b;
import ru.ozon.composer.compose.widget.g;
import ru.ozon.composer.compose.widget.i;
import ru.ozon.composer.compose.widget.scrollable.j;
import ru.ozon.composer.compose.widget.scrollable.k;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld00/d;", "Lru/ozon/app/android/storefront/widgets/cms/banner/BannerDTO;", "", "invoke", "(Ld00/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class BannerComposeWidgetKt$bannerComposeWidget$1 extends AbstractC7737t implements Function1<C6018d<BannerDTO>, Unit> {
    final /* synthetic */ JsonParser $jsonDeserializer;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/config/b;", "Lru/ozon/app/android/storefront/widgets/cms/banner/BannerDTO;", "", "invoke", "(Lru/ozon/composer/compose/widget/config/b;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.storefront.widgets.cms.banner.core.BannerComposeWidgetKt$bannerComposeWidget$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<b<BannerDTO>, Unit> {
        final /* synthetic */ JsonParser $jsonDeserializer;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj20/b;", "it", "Lru/ozon/app/android/storefront/widgets/cms/banner/BannerDTO;", "invoke", "(Lj20/b;)Lru/ozon/app/android/storefront/widgets/cms/banner/BannerDTO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.storefront.widgets.cms.banner.core.BannerComposeWidgetKt$bannerComposeWidget$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes2.dex */
        static final class C18731 extends AbstractC7737t implements Function1<C7244b, BannerDTO> {
            final /* synthetic */ JsonParser $jsonDeserializer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C18731(JsonParser jsonParser) {
                super(1);
                this.$jsonDeserializer = jsonParser;
            }

            @Override // kotlin.jvm.functions.Function1
            public final BannerDTO invoke(C7244b it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return (BannerDTO) this.$jsonDeserializer.fromJson(it.b(), BannerDTO.class);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(JsonParser jsonParser) {
            super(1);
            this.$jsonDeserializer = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(b<BannerDTO> bVar) {
            invoke2(bVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(b<BannerDTO> config) {
            Intrinsics.checkNotNullParameter(config, "$this$config");
            b.j(config, null, new C18731(this.$jsonDeserializer), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/j;", "Lru/ozon/app/android/storefront/widgets/cms/banner/BannerDTO;", "Lru/ozon/app/android/storefront/widgets/cms/banner/presentation/BannerVI;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/j;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.storefront.widgets.cms.banner.core.BannerComposeWidgetKt$bannerComposeWidget$1$5, reason: invalid class name */
    static final class AnonymousClass5 extends AbstractC7737t implements Function1<j<BannerDTO, BannerVI>, Unit> {
        public static final AnonymousClass5 INSTANCE = new AnonymousClass5();

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "state", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.storefront.widgets.cms.banner.core.BannerComposeWidgetKt$bannerComposeWidget$1$5$1, reason: invalid class name */
        static final class AnonymousClass1 extends AbstractC7737t implements Function1<Object, Boolean> {
            final /* synthetic */ BannerComponent $component;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(BannerComponent bannerComponent) {
                super(1);
                this.$component = bannerComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf((obj instanceof BannerDTO) && this.$component.getFeatureChecker().isEnabled(CmsBannerComposeEnabledFlag.INSTANCE));
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/app/android/storefront/widgets/cms/banner/BannerDTO;", "dto", "Ll20/d;", "info", "Lru/ozon/app/android/storefront/widgets/cms/banner/presentation/BannerVI;", "invoke", "(Lru/ozon/app/android/storefront/widgets/cms/banner/BannerDTO;Ll20/d;)Lru/ozon/app/android/storefront/widgets/cms/banner/presentation/BannerVI;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.storefront.widgets.cms.banner.core.BannerComposeWidgetKt$bannerComposeWidget$1$5$2, reason: invalid class name */
        static final class AnonymousClass2 extends AbstractC7737t implements Function2<BannerDTO, d, BannerVI> {
            public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

            AnonymousClass2() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final BannerVI invoke(BannerDTO dto, d info) {
                float ratio;
                Intrinsics.checkNotNullParameter(dto, "dto");
                Intrinsics.checkNotNullParameter(info, "info");
                long hashCode = (dto.getItem().getImage() + "." + dto.getWidth() + "." + dto.getHeight()).hashCode();
                String image = dto.getItem().getImage();
                Map<String, TokenizedTrackingInfo> trackingInfo = dto.getItem().getTrackingInfo();
                t tokenizedEvent$default = trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null;
                ratio = BannerComposeWidgetKt.getRatio(dto.getHeight(), dto.getWidth());
                String deeplink = dto.getItem().getDeeplink();
                String str = (deeplink == null || h.K(deeplink)) ? null : deeplink;
                BadgeDTO adBadge = dto.getItem().getAdBadge();
                String backgroundColor = dto.getItem().getBackgroundColor();
                boolean isRounded = dto.isRounded();
                boolean disableVerticalMargins = dto.getDisableVerticalMargins();
                AtomActionDTO action = dto.getItem().getAction();
                return new BannerVI(hashCode, tokenizedEvent$default, str, ratio, image, isRounded, disableVerticalMargins, adBadge, backgroundColor, action != null ? AtomActionMapperKt.toAtomAction(action, dto.getItem().getTrackingInfo()) : null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/k;", "Lru/ozon/app/android/storefront/widgets/cms/banner/presentation/BannerVI;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/k;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.storefront.widgets.cms.banner.core.BannerComposeWidgetKt$bannerComposeWidget$1$5$3, reason: invalid class name */
        static final class AnonymousClass3 extends AbstractC7737t implements Function1<k<BannerVI>, Unit> {
            final /* synthetic */ BannerComponent $component;
            final /* synthetic */ j<BannerDTO, BannerVI> $this_viewMapper;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/storefront/widgets/cms/banner/presentation/BannerVI;", "Lru/ozon/composer/compose/widget/g$a;", "it", "", "invoke", "(Lru/ozon/composer/compose/widget/i;Lru/ozon/composer/compose/widget/g$a;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
            /* renamed from: ru.ozon.app.android.storefront.widgets.cms.banner.core.BannerComposeWidgetKt$bannerComposeWidget$1$5$3$1, reason: invalid class name */
            /* loaded from: classes2.dex */
            static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6512o<i<BannerVI>, g.a, InterfaceC3967k, Integer, Unit> {
                final /* synthetic */ BannerComponent $component;
                final /* synthetic */ j<BannerDTO, BannerVI> $this_viewMapper;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(j<BannerDTO, BannerVI> jVar, BannerComponent bannerComponent) {
                    super(4);
                    this.$this_viewMapper = jVar;
                    this.$component = bannerComponent;
                }

                @Override // fd.InterfaceC6512o
                public /* bridge */ /* synthetic */ Unit invoke(i<BannerVI> iVar, g.a aVar, InterfaceC3967k interfaceC3967k, Integer num) {
                    invoke(iVar, aVar, interfaceC3967k, num.intValue());
                    return Unit.f71690a;
                }

                public final void invoke(i<BannerVI> content, g.a it, InterfaceC3967k interfaceC3967k, int i11) {
                    Intrinsics.checkNotNullParameter(content, "$this$content");
                    Intrinsics.checkNotNullParameter(it, "it");
                    if ((i11 & 6) == 0) {
                        i11 |= interfaceC3967k.n(content) ? 4 : 2;
                    }
                    if ((i11 & 131) == 130 && interfaceC3967k.b()) {
                        interfaceC3967k.j();
                        return;
                    }
                    Object parent = ((View) interfaceC3967k.m(AndroidCompositionLocals_androidKt.h())).getParent();
                    Intrinsics.g(parent, "null cannot be cast to non-null type android.view.View");
                    ((View) parent).setBackground(null);
                    BannerComposableKt.BannerComposable(content.b(), this.$component.getRouter(), WidgetActionHandlerBuilder.m470buildHandlerimpl(WidgetActionHandlerKt.widgetActionHandlerBuilder(content, this.$this_viewMapper.getWidgetComponentStorage(), null, null, null, interfaceC3967k, i11 & 14, 14)), e.f40358c0, interfaceC3967k, 3072, 0);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(j<BannerDTO, BannerVI> jVar, BannerComponent bannerComponent) {
                super(1);
                this.$this_viewMapper = jVar;
                this.$component = bannerComponent;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(k<BannerVI> kVar) {
                invoke2(kVar);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(k<BannerVI> widgetSpec) {
                Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
                widgetSpec.a(new C4912a(true, 1565240172, new AnonymousClass1(this.$this_viewMapper, this.$component)));
            }
        }

        AnonymousClass5() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(j<BannerDTO, BannerVI> jVar) {
            invoke2(jVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(j<BannerDTO, BannerVI> jVar) {
            BannerComponent bannerComponent = (BannerComponent) a.c(jVar, "$this$viewMapper", BannerComponent.class);
            jVar.k(new AnonymousClass1(bannerComponent), AnonymousClass2.INSTANCE);
            jVar.G(new AnonymousClass3(jVar, bannerComponent));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BannerComposeWidgetKt$bannerComposeWidget$1(JsonParser jsonParser) {
        super(1);
        this.$jsonDeserializer = jsonParser;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C6018d<BannerDTO> c6018d) {
        invoke2(c6018d);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C6018d<BannerDTO> ComposeWidget) {
        Intrinsics.checkNotNullParameter(ComposeWidget, "$this$ComposeWidget");
        ComposeWidget.a(new AnonymousClass1(this.$jsonDeserializer));
        ComposeWidget.j().add(new C6018d.a() { // from class: ru.ozon.app.android.storefront.widgets.cms.banner.core.BannerComposeWidgetKt$bannerComposeWidget$1$invoke$$inlined$widgetComponent$1
            @Override // d00.C6018d.a
            public final C7473e<? extends InterfaceC6958a> get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return BannerComponent.INSTANCE.create(it);
            }
        });
        final JsonParser jsonParser = this.$jsonDeserializer;
        ComposeWidget.o(new C6018d.a() { // from class: ru.ozon.app.android.storefront.widgets.cms.banner.core.BannerComposeWidgetKt$bannerComposeWidget$1$invoke$$inlined$rawConfig$1
            @Override // d00.C6018d.a
            public final InterfaceC7243a<? extends Object> get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new BannerConfig(JsonParser.this);
            }
        });
        ComposeWidget.g().add(new C6018d.a() { // from class: ru.ozon.app.android.storefront.widgets.cms.banner.core.BannerComposeWidgetKt$bannerComposeWidget$1$invoke$$inlined$rawViewMapper$1
            @Override // d00.C6018d.a
            public final InterfaceC8046a<? extends Object, ? extends c> get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                BannerViewMapper bannerViewMapper = new BannerViewMapper();
                bannerViewMapper.setComponent(it.getComponent(BannerComponent.class));
                return bannerViewMapper;
            }
        });
        ComposeWidget.p(AnonymousClass5.INSTANCE);
    }
}
