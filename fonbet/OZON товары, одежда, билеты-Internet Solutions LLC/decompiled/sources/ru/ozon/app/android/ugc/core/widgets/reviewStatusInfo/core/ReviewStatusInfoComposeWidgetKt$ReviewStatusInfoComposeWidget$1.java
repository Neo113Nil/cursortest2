package ru.ozon.app.android.ugc.core.widgets.reviewStatusInfo.core;

import d00.C6018d;
import hi.InterfaceC6958a;
import j20.C7244b;
import java.util.List;
import java.util.Map;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import m20.InterfaceC8046a;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.common.buttonwidget.core.ButtonV3ViewMapper;
import ru.ozon.app.android.common.buttonwidget.di.ButtonWidgetComponent;
import ru.ozon.app.android.common.cellList.v2.core.CellListV2ViewMapper;
import ru.ozon.app.android.common.cellList.v2.core.CellListWidgetComponent;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.islandSeparator.core.CommonIslandSeparatorViewMapper2;
import ru.ozon.app.android.pdp.ui.configurators.ComposeWidgetExtKt;
import ru.ozon.app.android.separator.core.SeparatorViewMapper;
import ru.ozon.app.android.ugc.core.widgets.reviewStatusInfo.data.ReviewStatusInfoDTO;
import ru.ozon.app.android.ugc.core.widgets.reviewStatusInfo.dateText.DateTextVO;
import ru.ozon.app.android.ugc.core.widgets.reviewStatusInfo.dateText.DateTextWidgetKt;
import ru.ozon.app.android.ugc.core.widgets.reviewStatusInfo.di.ReviewStatusInfoComponent;
import ru.ozon.app.android.ugc.core.widgets.reviewStatusInfo.image.CommonImageSubwidgetKt;
import ru.ozon.app.android.ugc.core.widgets.reviewStatusInfo.image.CommonImageVO;
import ru.ozon.app.android.ugc.core.widgets.reviewStatusInfo.noui.ReviewStatusInfoNoUiVO;
import ru.ozon.app.android.ugc.core.widgets.reviewStatusInfo.noui.ReviewStatusInfoNoUiViewMapper;
import ru.ozon.app.android.widgets.plainText.core.PlainTextViewMapper2;
import ru.ozon.composer.compose.widget.config.b;
import ru.ozon.composer.compose.widget.scrollable.j;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld00/d;", "", "", "invoke", "(Ld00/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class ReviewStatusInfoComposeWidgetKt$ReviewStatusInfoComposeWidget$1 extends AbstractC7737t implements Function1<C6018d<Object>, Unit> {
    final /* synthetic */ ButtonV3ViewMapper $buttonV3ViewMapper;
    final /* synthetic */ CellListV2ViewMapper $cellListV2ViewMapper;
    final /* synthetic */ CommonIslandSeparatorViewMapper2 $islandSeparatorViewMapper;
    final /* synthetic */ JsonParser $jsonDeserializer;
    final /* synthetic */ PlainTextViewMapper2 $plainTextViewMapper2;
    final /* synthetic */ SeparatorViewMapper $separatorViewMapper;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/config/b;", "", "", "invoke", "(Lru/ozon/composer/compose/widget/config/b;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.ugc.core.widgets.reviewStatusInfo.core.ReviewStatusInfoComposeWidgetKt$ReviewStatusInfoComposeWidget$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<b<Object>, Unit> {
        final /* synthetic */ JsonParser $jsonDeserializer;

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lj20/b;", "it", "", "", "invoke", "(Lj20/b;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.ugc.core.widgets.reviewStatusInfo.core.ReviewStatusInfoComposeWidgetKt$ReviewStatusInfoComposeWidget$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes2.dex */
        static final class C19481 extends AbstractC7737t implements Function1<C7244b, List<? extends Object>> {
            final /* synthetic */ JsonParser $jsonDeserializer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C19481(JsonParser jsonParser) {
                super(1);
                this.$jsonDeserializer = jsonParser;
            }

            @Override // kotlin.jvm.functions.Function1
            public final List<Object> invoke(C7244b it) {
                Intrinsics.checkNotNullParameter(it, "it");
                ReviewStatusInfoDTO reviewStatusInfoDTO = (ReviewStatusInfoDTO) this.$jsonDeserializer.fromJson(it.b(), ReviewStatusInfoDTO.class);
                Map<String, TokenizedTrackingInfo> tracking = reviewStatusInfoDTO.getTracking();
                if (tracking == null) {
                    return reviewStatusInfoDTO.getItems();
                }
                long hashCode = reviewStatusInfoDTO.hashCode();
                return C7714v.q0(new ReviewStatusInfoNoUiVO(hashCode, TrackingInfoMapperKt.mapToTokenizedEvent$default(tracking, Long.valueOf(hashCode), null, 2, null)), reviewStatusInfoDTO.getItems());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(JsonParser jsonParser) {
            super(1);
            this.$jsonDeserializer = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(b<Object> bVar) {
            invoke2(bVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(b<Object> config) {
            Intrinsics.checkNotNullParameter(config, "$this$config");
            b.h(config, null, new C19481(this.$jsonDeserializer), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/j;", "", "Lru/ozon/app/android/ugc/core/widgets/reviewStatusInfo/dateText/DateTextVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/j;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.ugc.core.widgets.reviewStatusInfo.core.ReviewStatusInfoComposeWidgetKt$ReviewStatusInfoComposeWidget$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<j<Object, DateTextVO>, Unit> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(j<Object, DateTextVO> jVar) {
            invoke2(jVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(j<Object, DateTextVO> viewMapper) {
            Intrinsics.checkNotNullParameter(viewMapper, "$this$viewMapper");
            DateTextWidgetKt.dateTextWidget(viewMapper);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/j;", "", "Lru/ozon/app/android/ugc/core/widgets/reviewStatusInfo/image/CommonImageVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/j;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.ugc.core.widgets.reviewStatusInfo.core.ReviewStatusInfoComposeWidgetKt$ReviewStatusInfoComposeWidget$1$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function1<j<Object, CommonImageVO>, Unit> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        AnonymousClass3() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(j<Object, CommonImageVO> jVar) {
            invoke2(jVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(j<Object, CommonImageVO> viewMapper) {
            Intrinsics.checkNotNullParameter(viewMapper, "$this$viewMapper");
            CommonImageSubwidgetKt.commonImageElement(viewMapper);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewStatusInfoComposeWidgetKt$ReviewStatusInfoComposeWidget$1(PlainTextViewMapper2 plainTextViewMapper2, SeparatorViewMapper separatorViewMapper, CommonIslandSeparatorViewMapper2 commonIslandSeparatorViewMapper2, CellListV2ViewMapper cellListV2ViewMapper, ButtonV3ViewMapper buttonV3ViewMapper, JsonParser jsonParser) {
        super(1);
        this.$plainTextViewMapper2 = plainTextViewMapper2;
        this.$separatorViewMapper = separatorViewMapper;
        this.$islandSeparatorViewMapper = commonIslandSeparatorViewMapper2;
        this.$cellListV2ViewMapper = cellListV2ViewMapper;
        this.$buttonV3ViewMapper = buttonV3ViewMapper;
        this.$jsonDeserializer = jsonParser;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C6018d<Object> c6018d) {
        invoke2(c6018d);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C6018d<Object> ComposeWidget) {
        Intrinsics.checkNotNullParameter(ComposeWidget, "$this$ComposeWidget");
        ComposeWidget.a(new AnonymousClass1(this.$jsonDeserializer));
        ComposeWidgetExtKt.rawViewMappers(ComposeWidget, this.$plainTextViewMapper2, this.$separatorViewMapper, this.$islandSeparatorViewMapper);
        final ViewMapper2 viewMapper2 = new ViewMapper2[]{this.$cellListV2ViewMapper}[0];
        ComposeWidget.g().add(new C6018d.a() { // from class: ru.ozon.app.android.ugc.core.widgets.reviewStatusInfo.core.ReviewStatusInfoComposeWidgetKt$ReviewStatusInfoComposeWidget$1$invoke$$inlined$rawComponentMappers$1
            @Override // d00.C6018d.a
            public final InterfaceC8046a<? extends Object, ? extends c> get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                ViewMapper2.this.setComponent(it.getComponent(CellListWidgetComponent.class));
                Intrinsics.g(ViewMapper2.this, "null cannot be cast to non-null type ru.ozon.composer.widget.mapper.ViewItemMapper<S of ru.ozon.app.android.pdp.ui.configurators.ComposeWidgetExtKt.rawComponentMappers, ru.ozon.composer.widget.item.ViewItem>");
                return ViewMapper2.this;
            }
        });
        final ViewMapper2 viewMapper22 = new ViewMapper2[]{this.$buttonV3ViewMapper}[0];
        ComposeWidget.g().add(new C6018d.a() { // from class: ru.ozon.app.android.ugc.core.widgets.reviewStatusInfo.core.ReviewStatusInfoComposeWidgetKt$ReviewStatusInfoComposeWidget$1$invoke$$inlined$rawComponentMappers$2
            @Override // d00.C6018d.a
            public final InterfaceC8046a<? extends Object, ? extends c> get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                ViewMapper2.this.setComponent(it.getComponent(ButtonWidgetComponent.class));
                Intrinsics.g(ViewMapper2.this, "null cannot be cast to non-null type ru.ozon.composer.widget.mapper.ViewItemMapper<S of ru.ozon.app.android.pdp.ui.configurators.ComposeWidgetExtKt.rawComponentMappers, ru.ozon.composer.widget.item.ViewItem>");
                return ViewMapper2.this;
            }
        });
        final ViewMapper2 viewMapper23 = new ViewMapper2[]{new ReviewStatusInfoNoUiViewMapper()}[0];
        ComposeWidget.g().add(new C6018d.a() { // from class: ru.ozon.app.android.ugc.core.widgets.reviewStatusInfo.core.ReviewStatusInfoComposeWidgetKt$ReviewStatusInfoComposeWidget$1$invoke$$inlined$rawComponentMappers$3
            @Override // d00.C6018d.a
            public final InterfaceC8046a<? extends Object, ? extends c> get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                ViewMapper2.this.setComponent(it.getComponent(ReviewStatusInfoComponent.class));
                Intrinsics.g(ViewMapper2.this, "null cannot be cast to non-null type ru.ozon.composer.widget.mapper.ViewItemMapper<S of ru.ozon.app.android.pdp.ui.configurators.ComposeWidgetExtKt.rawComponentMappers, ru.ozon.composer.widget.item.ViewItem>");
                return ViewMapper2.this;
            }
        });
        ComposeWidget.p(AnonymousClass2.INSTANCE);
        ComposeWidget.p(AnonymousClass3.INSTANCE);
        ComposeWidget.j().add(new C6018d.a() { // from class: ru.ozon.app.android.ugc.core.widgets.reviewStatusInfo.core.ReviewStatusInfoComposeWidgetKt$ReviewStatusInfoComposeWidget$1$invoke$$inlined$widgetComponent$1
            @Override // d00.C6018d.a
            public final C7473e<? extends InterfaceC6958a> get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return ReviewStatusInfoComponent.INSTANCE.create(it);
            }
        });
    }
}
