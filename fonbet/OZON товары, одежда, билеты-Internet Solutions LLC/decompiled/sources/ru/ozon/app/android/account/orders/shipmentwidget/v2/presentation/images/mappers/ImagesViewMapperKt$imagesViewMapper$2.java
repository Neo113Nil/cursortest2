package ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.images.mappers;

import Ek.a;
import S0.InterfaceC3967k;
import S0.Q;
import a1.C4912a;
import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.K0;
import fd.InterfaceC6512o;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import ru.ozon.app.android.account.adult.presenter.AdultListDelegate;
import ru.ozon.app.android.account.orders.shipmentwidget.v2.di.ShipmentWidgetV2ComponentV2;
import ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.images.viewItem.ImagesVO;
import ru.ozon.app.android.action.WidgetActionHandlerBuilder;
import ru.ozon.app.android.action.WidgetActionHandlerKt;
import ru.ozon.app.android.cscore.orderdetails.molecule.imagesCompose.data.ComposableImagesDTO;
import ru.ozon.app.android.cscore.orderdetails.molecule.imagesCompose.presentation.ComposableImageVO;
import ru.ozon.app.android.cscore.orderdetails.molecule.imagesCompose.presentation.ComposableImagesVO;
import ru.ozon.app.android.cscore.orderdetails.molecule.imagesCompose.presentation.compose.ImagesComposableKt;
import ru.ozon.app.android.cscore.padding.HorizontalPadding;
import ru.ozon.app.android.platform.customActionHandlers.composerActionWithAction.ComposerActionWithActionHandler;
import ru.ozon.composer.compose.widget.g;
import ru.ozon.composer.compose.widget.i;
import ru.ozon.composer.compose.widget.scrollable.j;
import ru.ozon.composer.compose.widget.scrollable.k;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.productMedia.ProductMediaDTO;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/j;", "", "Lru/ozon/app/android/account/orders/shipmentwidget/v2/presentation/images/viewItem/ImagesVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/j;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes11.dex */
final class ImagesViewMapperKt$imagesViewMapper$2 extends AbstractC7737t implements Function1<j<Object, ImagesVO>, Unit> {
    public static final ImagesViewMapperKt$imagesViewMapper$2 INSTANCE = new ImagesViewMapperKt$imagesViewMapper$2();

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.images.mappers.ImagesViewMapperKt$imagesViewMapper$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<Object, Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof ComposableImagesDTO);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "state", "Ll20/d;", "info", "", "Lru/ozon/app/android/account/orders/shipmentwidget/v2/presentation/images/viewItem/ImagesVO;", "invoke", "(Ljava/lang/Object;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.images.mappers.ImagesViewMapperKt$imagesViewMapper$2$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function2<Object, d, List<? extends ImagesVO>> {
        final /* synthetic */ ShipmentWidgetV2ComponentV2 $component;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(ShipmentWidgetV2ComponentV2 shipmentWidgetV2ComponentV2) {
            super(2);
            this.$component = shipmentWidgetV2ComponentV2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final List<ImagesVO> invoke(Object state, d info) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(info, "info");
            return this.$component.getImagesMapper().invoke((ComposableImagesDTO) state, info);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/k;", "Lru/ozon/app/android/account/orders/shipmentwidget/v2/presentation/images/viewItem/ImagesVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/k;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.images.mappers.ImagesViewMapperKt$imagesViewMapper$2$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function1<k<ImagesVO>, Unit> {
        final /* synthetic */ ShipmentWidgetV2ComponentV2 $component;
        final /* synthetic */ j<Object, ImagesVO> $this_viewMapper;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/account/orders/shipmentwidget/v2/presentation/images/viewItem/ImagesVO;", "Lru/ozon/composer/compose/widget/g$a;", "it", "", "invoke", "(Lru/ozon/composer/compose/widget/i;Lru/ozon/composer/compose/widget/g$a;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.images.mappers.ImagesViewMapperKt$imagesViewMapper$2$3$1, reason: invalid class name */
        static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6512o<i<ImagesVO>, g.a, InterfaceC3967k, Integer, Unit> {
            final /* synthetic */ ShipmentWidgetV2ComponentV2 $component;
            final /* synthetic */ j<Object, ImagesVO> $this_viewMapper;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(j<Object, ImagesVO> jVar, ShipmentWidgetV2ComponentV2 shipmentWidgetV2ComponentV2) {
                super(4);
                this.$this_viewMapper = jVar;
                this.$component = shipmentWidgetV2ComponentV2;
            }

            @Override // fd.InterfaceC6512o
            public /* bridge */ /* synthetic */ Unit invoke(i<ImagesVO> iVar, g.a aVar, InterfaceC3967k interfaceC3967k, Integer num) {
                invoke(iVar, aVar, interfaceC3967k, num.intValue());
                return Unit.f71690a;
            }

            public final void invoke(i<ImagesVO> content, g.a it, InterfaceC3967k interfaceC3967k, int i11) {
                int i12;
                ProductMediaDTO productMedia;
                ProductMediaDTO.Width width;
                Intrinsics.checkNotNullParameter(content, "$this$content");
                Intrinsics.checkNotNullParameter(it, "it");
                if ((i11 & 6) == 0) {
                    i12 = i11 | (interfaceC3967k.n(content) ? 4 : 2);
                } else {
                    i12 = i11;
                }
                if ((i12 & 131) == 130 && interfaceC3967k.b()) {
                    interfaceC3967k.j();
                    return;
                }
                Configuration configuration = (Configuration) interfaceC3967k.m(AndroidCompositionLocals_androidKt.c());
                Z1.d dVar = (Z1.d) interfaceC3967k.m(K0.e());
                float v12 = dVar.v1(configuration.screenWidthDp);
                ComposableImageVO composableImageVO = (ComposableImageVO) C7714v.M(content.b().getImages().getImages());
                int px = (composableImageVO == null || (productMedia = composableImageVO.getProductMedia()) == null || (width = productMedia.getWidth()) == null) ? 64 : UiExtKt.toPx(width.getDp());
                interfaceC3967k.o(1631471879);
                ShipmentWidgetV2ComponentV2 shipmentWidgetV2ComponentV2 = this.$component;
                Object C11 = interfaceC3967k.C();
                if (C11 == InterfaceC3967k.a.a()) {
                    C11 = shipmentWidgetV2ComponentV2.getAdultListDelegateProvider().get();
                    interfaceC3967k.x(C11);
                }
                AdultListDelegate adultListDelegate = (AdultListDelegate) C11;
                interfaceC3967k.k();
                List<ComposableImageVO> images = content.b().getImages().getImages();
                interfaceC3967k.o(1631476533);
                int i13 = i12 & 14;
                boolean F11 = (i13 == 4) | interfaceC3967k.F(adultListDelegate);
                Object C12 = interfaceC3967k.C();
                if (F11 || C12 == InterfaceC3967k.a.a()) {
                    C12 = new ImagesViewMapperKt$imagesViewMapper$2$3$1$1$1(adultListDelegate, content, null);
                    interfaceC3967k.x(C12);
                }
                interfaceC3967k.k();
                Q.g(adultListDelegate, images, (Function2) C12, interfaceC3967k);
                ComposableImagesVO images2 = content.b().getImages();
                HorizontalPadding horizontalPadding = content.b().getHorizontalPadding();
                interfaceC3967k.o(1631486731);
                boolean n11 = interfaceC3967k.n(dVar);
                Object C13 = interfaceC3967k.C();
                if (n11 || C13 == InterfaceC3967k.a.a()) {
                    C13 = Integer.valueOf((int) ((v12 - UiExtKt.toPx(32)) / (UiExtKt.toPx(6) + px)));
                    interfaceC3967k.x(C13);
                }
                int intValue = ((Number) C13).intValue();
                interfaceC3967k.k();
                ImagesComposableKt.ImagesComposable(images2, horizontalPadding, adultListDelegate, intValue, WidgetActionHandlerBuilder.m470buildHandlerimpl(WidgetActionHandlerBuilder.m473handlersStoreDnHbjWo(WidgetActionHandlerKt.widgetActionHandlerBuilder(content, this.$this_viewMapper.getWidgetComponentStorage(), null, null, null, interfaceC3967k, i13, 14), this.$component.getCustomActionHandlersStoreFactory().create(e0.h(ComposerActionWithActionHandler.class)))), interfaceC3967k, ComposableImagesVO.$stable | (HorizontalPadding.$stable << 3));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(j<Object, ImagesVO> jVar, ShipmentWidgetV2ComponentV2 shipmentWidgetV2ComponentV2) {
            super(1);
            this.$this_viewMapper = jVar;
            this.$component = shipmentWidgetV2ComponentV2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(k<ImagesVO> kVar) {
            invoke2(kVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(k<ImagesVO> widgetSpec) {
            Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
            widgetSpec.a(new C4912a(true, -326274426, new AnonymousClass1(this.$this_viewMapper, this.$component)));
        }
    }

    ImagesViewMapperKt$imagesViewMapper$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(j<Object, ImagesVO> jVar) {
        invoke2(jVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(j<Object, ImagesVO> jVar) {
        ShipmentWidgetV2ComponentV2 shipmentWidgetV2ComponentV2 = (ShipmentWidgetV2ComponentV2) a.c(jVar, "$this$viewMapper", ShipmentWidgetV2ComponentV2.class);
        jVar.i(AnonymousClass1.INSTANCE, new AnonymousClass2(shipmentWidgetV2ComponentV2));
        jVar.G(new AnonymousClass3(jVar, shipmentWidgetV2ComponentV2));
    }
}
