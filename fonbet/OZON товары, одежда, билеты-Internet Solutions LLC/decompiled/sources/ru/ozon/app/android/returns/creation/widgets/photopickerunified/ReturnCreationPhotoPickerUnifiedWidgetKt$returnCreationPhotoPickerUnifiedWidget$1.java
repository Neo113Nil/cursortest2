package ru.ozon.app.android.returns.creation.widgets.photopickerunified;

import d00.C6018d;
import hi.InterfaceC6958a;
import j20.C7244b;
import java.util.ArrayList;
import k20.C7473e;
import k20.C7475g;
import k20.InterfaceC7469a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l20.c;
import m20.InterfaceC8046a;
import ru.ozon.android.composerCommonViewKit.islandSeparator.core.CommonIslandSeparatorViewMapper;
import ru.ozon.android.composerCommonViewKit.islandSeparator.data.IslandSeparatorDTO;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.common.cellList.v2.core.CellListV2ViewMapper;
import ru.ozon.app.android.common.cellList.v2.core.CellListWidgetComponent;
import ru.ozon.app.android.delivery.common.AppTokensProvider;
import ru.ozon.app.android.returns.creation.widgets.photopickerunified.data.ButtonsModel;
import ru.ozon.app.android.returns.creation.widgets.photopickerunified.data.PhotosModel;
import ru.ozon.app.android.returns.creation.widgets.photopickerunified.data.ReturnCreationPhotoPickerUnifiedDTO;
import ru.ozon.app.android.returns.creation.widgets.photopickerunified.presentation.buttons.ButtonsViewMapperKt;
import ru.ozon.app.android.returns.creation.widgets.photopickerunified.presentation.header.HeaderViewMapperKt;
import ru.ozon.app.android.returns.creation.widgets.photopickerunified.presentation.photos.PhotosViewMapperKt;
import ru.ozon.composer.compose.widget.config.b;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld00/d;", "", "", "invoke", "(Ld00/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class ReturnCreationPhotoPickerUnifiedWidgetKt$returnCreationPhotoPickerUnifiedWidget$1 extends AbstractC7737t implements Function1<C6018d<Object>, Unit> {
    final /* synthetic */ JsonParser $jsonDeserializer;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/config/b;", "", "", "invoke", "(Lru/ozon/composer/compose/widget/config/b;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.returns.creation.widgets.photopickerunified.ReturnCreationPhotoPickerUnifiedWidgetKt$returnCreationPhotoPickerUnifiedWidget$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<b<Object>, Unit> {
        final /* synthetic */ JsonParser $jsonDeserializer;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj20/b;", "it", "", "invoke", "(Lj20/b;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.returns.creation.widgets.photopickerunified.ReturnCreationPhotoPickerUnifiedWidgetKt$returnCreationPhotoPickerUnifiedWidget$1$2$1, reason: invalid class name */
        /* loaded from: classes13.dex */
        static final class AnonymousClass1 extends AbstractC7737t implements Function1<C7244b, Object> {
            final /* synthetic */ JsonParser $jsonDeserializer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(JsonParser jsonParser) {
                super(1);
                this.$jsonDeserializer = jsonParser;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(C7244b it) {
                Intrinsics.checkNotNullParameter(it, "it");
                ArrayList arrayList = new ArrayList();
                ReturnCreationPhotoPickerUnifiedDTO returnCreationPhotoPickerUnifiedDTO = (ReturnCreationPhotoPickerUnifiedDTO) this.$jsonDeserializer.fromJson(it.b(), ReturnCreationPhotoPickerUnifiedDTO.class);
                int hashCode = returnCreationPhotoPickerUnifiedDTO.getExistingImages().hashCode();
                Integer valueOf = Integer.valueOf(AppTokensProvider.IslandSeparatorHeight.INSTANCE.between());
                String id2 = UniTheme.INSTANCE.getColorTokens().getLayerFloor0().getId();
                IslandSeparatorDTO.Configuration configuration = IslandSeparatorDTO.Configuration.BETWEEN_SECTIONS;
                Boolean bool = Boolean.FALSE;
                arrayList.add(new IslandSeparatorDTO(valueOf, id2, configuration, bool, null, bool));
                arrayList.add(returnCreationPhotoPickerUnifiedDTO.getCell());
                arrayList.add(returnCreationPhotoPickerUnifiedDTO.getCellList());
                arrayList.add(new PhotosModel(returnCreationPhotoPickerUnifiedDTO.getExistingImages(), hashCode));
                arrayList.add(new ButtonsModel(returnCreationPhotoPickerUnifiedDTO.getContinueButton(), returnCreationPhotoPickerUnifiedDTO.getAddPhotoButton(), returnCreationPhotoPickerUnifiedDTO.getAddMorePhotoButton(), returnCreationPhotoPickerUnifiedDTO.getUploadImageAction(), returnCreationPhotoPickerUnifiedDTO.getSettings(), returnCreationPhotoPickerUnifiedDTO.getNotifications(), hashCode));
                return arrayList;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(JsonParser jsonParser) {
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
            b.j(config, null, new AnonymousClass1(this.$jsonDeserializer), 1, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReturnCreationPhotoPickerUnifiedWidgetKt$returnCreationPhotoPickerUnifiedWidget$1(JsonParser jsonParser) {
        super(1);
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
        ComposeWidget.j().add(new C6018d.a() { // from class: ru.ozon.app.android.returns.creation.widgets.photopickerunified.ReturnCreationPhotoPickerUnifiedWidgetKt$returnCreationPhotoPickerUnifiedWidget$1$invoke$$inlined$widgetComponent$1
            @Override // d00.C6018d.a
            public final C7473e<? extends InterfaceC6958a> get(final C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new C7473e<>(N.b(ReturnCreationPhotoPickerUnifiedComponent.class), new InterfaceC7469a() { // from class: ru.ozon.app.android.returns.creation.widgets.photopickerunified.ReturnCreationPhotoPickerUnifiedWidgetKt$returnCreationPhotoPickerUnifiedWidget$1$1$1
                    @Override // k20.InterfaceC7469a
                    public final ReturnCreationPhotoPickerUnifiedComponent component() {
                        return ReturnCreationPhotoPickerUnifiedComponent.Companion.create(C7475g.this);
                    }
                });
            }
        });
        ComposeWidget.a(new AnonymousClass2(this.$jsonDeserializer));
        ComposeWidget.g().add(new C6018d.a() { // from class: ru.ozon.app.android.returns.creation.widgets.photopickerunified.ReturnCreationPhotoPickerUnifiedWidgetKt$returnCreationPhotoPickerUnifiedWidget$1$invoke$$inlined$rawViewMapper$1
            @Override // d00.C6018d.a
            public final InterfaceC8046a<? extends Object, ? extends c> get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new CommonIslandSeparatorViewMapper();
            }
        });
        ComposeWidget.g().add(new C6018d.a() { // from class: ru.ozon.app.android.returns.creation.widgets.photopickerunified.ReturnCreationPhotoPickerUnifiedWidgetKt$returnCreationPhotoPickerUnifiedWidget$1$invoke$$inlined$rawViewMapper$2
            @Override // d00.C6018d.a
            public final InterfaceC8046a<? extends Object, ? extends c> get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                CellListV2ViewMapper cellListV2ViewMapper = new CellListV2ViewMapper();
                cellListV2ViewMapper.setComponent(it.getComponent(CellListWidgetComponent.class));
                return cellListV2ViewMapper;
            }
        });
        HeaderViewMapperKt.headerViewMapper(ComposeWidget);
        PhotosViewMapperKt.photosViewMapper(ComposeWidget);
        ButtonsViewMapperKt.buttonsViewMapper(ComposeWidget);
    }
}
