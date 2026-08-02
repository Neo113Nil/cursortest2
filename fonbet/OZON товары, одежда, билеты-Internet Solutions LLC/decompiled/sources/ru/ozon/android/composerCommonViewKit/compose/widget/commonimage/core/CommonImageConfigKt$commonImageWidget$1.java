package ru.ozon.android.composerCommonViewKit.compose.widget.commonimage.core;

import d00.C6018d;
import j20.C7244b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import ru.ozon.android.composerCommonViewKit.compose.util.ParserKt;
import ru.ozon.android.composerCommonViewKit.compose.widget.commonimage.data.CommonImageDTO;
import ru.ozon.android.composerCommonViewKit.compose.widget.commonimage.presentation.CommonImageVO;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.composer.compose.widget.config.b;
import ru.ozon.composer.compose.widget.scrollable.j;
import ru.ozon.composer.compose.widget.scrollable.k;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld00/d;", "Lru/ozon/android/composerCommonViewKit/compose/widget/commonimage/data/CommonImageDTO;", "", "invoke", "(Ld00/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class CommonImageConfigKt$commonImageWidget$1 extends AbstractC7737t implements Function1<C6018d<CommonImageDTO>, Unit> {
    final /* synthetic */ JsonParser $deserializer;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/config/b;", "Lru/ozon/android/composerCommonViewKit/compose/widget/commonimage/data/CommonImageDTO;", "", "invoke", "(Lru/ozon/composer/compose/widget/config/b;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.android.composerCommonViewKit.compose.widget.commonimage.core.CommonImageConfigKt$commonImageWidget$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<b<CommonImageDTO>, Unit> {
        final /* synthetic */ JsonParser $deserializer;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.android.composerCommonViewKit.compose.widget.commonimage.core.CommonImageConfigKt$commonImageWidget$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes10.dex */
        /* synthetic */ class C14381 extends C7735q implements Function1<C7244b, CommonImageDTO> {
            C14381(Object obj) {
                super(1, obj, ParserKt.class, "defaultParse", "defaultParse(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;Lru/ozon/composer/widget/config/WidgetParsedState;)Ljava/lang/Object;", 1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final CommonImageDTO invoke(C7244b p02) {
                Intrinsics.checkNotNullParameter(p02, "p0");
                JsonParser jsonParser = (JsonParser) this.receiver;
                String b11 = p02.b();
                if (b11 != null) {
                    return (CommonImageDTO) jsonParser.fromJson(b11, CommonImageDTO.class);
                }
                throw new IllegalArgumentException("Required value was null.");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(JsonParser jsonParser) {
            super(1);
            this.$deserializer = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(b<CommonImageDTO> bVar) {
            invoke2(bVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(b<CommonImageDTO> config) {
            Intrinsics.checkNotNullParameter(config, "$this$config");
            b.j(config, null, new C14381(this.$deserializer), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/j;", "Lru/ozon/android/composerCommonViewKit/compose/widget/commonimage/data/CommonImageDTO;", "Lru/ozon/android/composerCommonViewKit/compose/widget/commonimage/presentation/CommonImageVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/j;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.android.composerCommonViewKit.compose.widget.commonimage.core.CommonImageConfigKt$commonImageWidget$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<j<CommonImageDTO, CommonImageVO>, Unit> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "state", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.android.composerCommonViewKit.compose.widget.commonimage.core.CommonImageConfigKt$commonImageWidget$1$2$1, reason: invalid class name */
        /* loaded from: classes10.dex */
        static final class AnonymousClass1 extends AbstractC7737t implements Function1<Object, Boolean> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            AnonymousClass1() {
                super(1);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof CommonImageDTO);
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/android/composerCommonViewKit/compose/widget/commonimage/data/CommonImageDTO;", "state", "Ll20/d;", "info", "Lru/ozon/android/composerCommonViewKit/compose/widget/commonimage/presentation/CommonImageVO;", "invoke", "(Lru/ozon/android/composerCommonViewKit/compose/widget/commonimage/data/CommonImageDTO;Ll20/d;)Lru/ozon/android/composerCommonViewKit/compose/widget/commonimage/presentation/CommonImageVO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.android.composerCommonViewKit.compose.widget.commonimage.core.CommonImageConfigKt$commonImageWidget$1$2$2, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes10.dex */
        static final class C14392 extends AbstractC7737t implements Function2<CommonImageDTO, d, CommonImageVO> {
            public static final C14392 INSTANCE = new C14392();

            C14392() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final CommonImageVO invoke(CommonImageDTO state, d info) {
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(info, "info");
                return CommonImageMapperKt.toVo(state, info);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/k;", "Lru/ozon/android/composerCommonViewKit/compose/widget/commonimage/presentation/CommonImageVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/k;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.android.composerCommonViewKit.compose.widget.commonimage.core.CommonImageConfigKt$commonImageWidget$1$2$3, reason: invalid class name */
        /* loaded from: classes10.dex */
        static final class AnonymousClass3 extends AbstractC7737t implements Function1<k<CommonImageVO>, Unit> {
            public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

            AnonymousClass3() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(k<CommonImageVO> kVar) {
                invoke2(kVar);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(k<CommonImageVO> widgetSpec) {
                Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
                widgetSpec.a(ComposableSingletons$CommonImageConfigKt.INSTANCE.m447getLambda1$common_view_kit_release());
            }
        }

        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(j<CommonImageDTO, CommonImageVO> jVar) {
            invoke2(jVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(j<CommonImageDTO, CommonImageVO> viewMapper) {
            Intrinsics.checkNotNullParameter(viewMapper, "$this$viewMapper");
            viewMapper.k(AnonymousClass1.INSTANCE, C14392.INSTANCE);
            viewMapper.G(AnonymousClass3.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommonImageConfigKt$commonImageWidget$1(JsonParser jsonParser) {
        super(1);
        this.$deserializer = jsonParser;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C6018d<CommonImageDTO> c6018d) {
        invoke2(c6018d);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C6018d<CommonImageDTO> ComposeWidget) {
        Intrinsics.checkNotNullParameter(ComposeWidget, "$this$ComposeWidget");
        ComposeWidget.a(new AnonymousClass1(this.$deserializer));
        ComposeWidget.p(AnonymousClass2.INSTANCE);
    }
}
