package ru.ozon.app.android.search.widgets.separatorBadge.core;

import WZ.x;
import d00.C6018d;
import j20.C7244b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.search.widgets.separatorBadge.data.SeparatorBadgeDTO;
import ru.ozon.app.android.search.widgets.separatorBadge.presentation.SeparatorBadgeVI;
import ru.ozon.composer.compose.widget.c;
import ru.ozon.composer.compose.widget.config.b;
import ru.ozon.composer.compose.widget.scrollable.j;
import ru.ozon.composer.compose.widget.scrollable.k;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld00/d;", "Lru/ozon/app/android/search/widgets/separatorBadge/data/SeparatorBadgeDTO;", "", "invoke", "(Ld00/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class SeparatorBadgeWidgetConfigKt$separatorBadgeWidget$1 extends AbstractC7737t implements Function1<C6018d<SeparatorBadgeDTO>, Unit> {
    final /* synthetic */ JsonParser $jsonDeserializer;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/config/b;", "Lru/ozon/app/android/search/widgets/separatorBadge/data/SeparatorBadgeDTO;", "", "invoke", "(Lru/ozon/composer/compose/widget/config/b;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.search.widgets.separatorBadge.core.SeparatorBadgeWidgetConfigKt$separatorBadgeWidget$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<b<SeparatorBadgeDTO>, Unit> {
        final /* synthetic */ JsonParser $jsonDeserializer;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj20/b;", "it", "Lru/ozon/app/android/search/widgets/separatorBadge/data/SeparatorBadgeDTO;", "invoke", "(Lj20/b;)Lru/ozon/app/android/search/widgets/separatorBadge/data/SeparatorBadgeDTO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.search.widgets.separatorBadge.core.SeparatorBadgeWidgetConfigKt$separatorBadgeWidget$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes13.dex */
        static final class C18641 extends AbstractC7737t implements Function1<C7244b, SeparatorBadgeDTO> {
            final /* synthetic */ JsonParser $jsonDeserializer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C18641(JsonParser jsonParser) {
                super(1);
                this.$jsonDeserializer = jsonParser;
            }

            @Override // kotlin.jvm.functions.Function1
            public final SeparatorBadgeDTO invoke(C7244b it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return (SeparatorBadgeDTO) this.$jsonDeserializer.fromJson(it.b(), SeparatorBadgeDTO.class);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(JsonParser jsonParser) {
            super(1);
            this.$jsonDeserializer = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(b<SeparatorBadgeDTO> bVar) {
            invoke2(bVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(b<SeparatorBadgeDTO> config) {
            Intrinsics.checkNotNullParameter(config, "$this$config");
            b.j(config, null, new C18641(this.$jsonDeserializer), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/j;", "Lru/ozon/app/android/search/widgets/separatorBadge/data/SeparatorBadgeDTO;", "Lru/ozon/app/android/search/widgets/separatorBadge/presentation/SeparatorBadgeVI;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/j;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.search.widgets.separatorBadge.core.SeparatorBadgeWidgetConfigKt$separatorBadgeWidget$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<j<SeparatorBadgeDTO, SeparatorBadgeVI>, Unit> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/search/widgets/separatorBadge/data/SeparatorBadgeDTO;", "state", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "Lru/ozon/app/android/search/widgets/separatorBadge/presentation/SeparatorBadgeVI;", "invoke", "(Lru/ozon/app/android/search/widgets/separatorBadge/data/SeparatorBadgeDTO;Ll20/d;)Lru/ozon/app/android/search/widgets/separatorBadge/presentation/SeparatorBadgeVI;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.search.widgets.separatorBadge.core.SeparatorBadgeWidgetConfigKt$separatorBadgeWidget$1$2$1, reason: invalid class name */
        /* loaded from: classes13.dex */
        static final class AnonymousClass1 extends AbstractC7737t implements Function2<SeparatorBadgeDTO, d, SeparatorBadgeVI> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            AnonymousClass1() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final SeparatorBadgeVI invoke(SeparatorBadgeDTO state, d info) {
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(info, "info");
                long hashCode = info.d().hashCode();
                BadgeDTO badge = state.getBadge();
                String backgroundColor = state.getBackgroundColor();
                Paddings horizontalPadding = state.getHorizontalPadding();
                Paddings topPadding = state.getTopPadding();
                Paddings bottomPadding = state.getBottomPadding();
                SeparatorBadgeDTO.SeparatorSettingsDTO separator = state.getSeparator();
                Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
                return new SeparatorBadgeVI(hashCode, badge, backgroundColor, horizontalPadding, topPadding, bottomPadding, separator, trackingInfo != null ? x.b(trackingInfo, Long.valueOf(hashCode), null) : null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/k;", "Lru/ozon/app/android/search/widgets/separatorBadge/presentation/SeparatorBadgeVI;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/k;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.search.widgets.separatorBadge.core.SeparatorBadgeWidgetConfigKt$separatorBadgeWidget$1$2$2, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes13.dex */
        static final class C18652 extends AbstractC7737t implements Function1<k<SeparatorBadgeVI>, Unit> {
            public static final C18652 INSTANCE = new C18652();

            C18652() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(k<SeparatorBadgeVI> kVar) {
                invoke2(kVar);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(k<SeparatorBadgeVI> widgetSpec) {
                Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
                widgetSpec.a(ComposableSingletons$SeparatorBadgeWidgetConfigKt.INSTANCE.m988getLambda1$search_prodGoogleAllVendorsRelease());
            }
        }

        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(j<SeparatorBadgeDTO, SeparatorBadgeVI> jVar) {
            invoke2(jVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(j<SeparatorBadgeDTO, SeparatorBadgeVI> viewMapper) {
            Intrinsics.checkNotNullParameter(viewMapper, "$this$viewMapper");
            c.l(viewMapper, null, AnonymousClass1.INSTANCE, 1, null);
            viewMapper.G(C18652.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SeparatorBadgeWidgetConfigKt$separatorBadgeWidget$1(JsonParser jsonParser) {
        super(1);
        this.$jsonDeserializer = jsonParser;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C6018d<SeparatorBadgeDTO> c6018d) {
        invoke2(c6018d);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C6018d<SeparatorBadgeDTO> ComposeWidget) {
        Intrinsics.checkNotNullParameter(ComposeWidget, "$this$ComposeWidget");
        ComposeWidget.a(new AnonymousClass1(this.$jsonDeserializer));
        ComposeWidget.p(AnonymousClass2.INSTANCE);
    }
}
