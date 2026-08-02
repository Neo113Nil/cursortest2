package ru.ozon.app.android.geo.di;

import I00.d;
import hi.InterfaceC6958a;
import j20.InterfaceC7243a;
import java.util.Set;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import m20.InterfaceC8046a;
import n20.i;
import n20.j;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.di.ComposerWidgetComponentStorageKt;
import ru.ozon.app.android.geo.addressBookBar.data.AddressBookBarConfig;
import ru.ozon.app.android.geo.addressBookBar.di.AddressBookBarComponent;
import ru.ozon.app.android.geo.addressBookBar.presentation.AddressBookBarViewMapper;
import ru.ozon.app.android.geo.addressBookBarV2.core.AddressBookBarV2Config;
import ru.ozon.app.android.geo.addressBookBarV2.core.AddressBookBarV2ViewMapper;
import ru.ozon.app.android.geo.addressBookBarV2.di.AddressBookBarV2Component;
import ru.ozon.app.android.geo.addressBookLocationPicker.data.AddressBookLocationPickerConfig;
import ru.ozon.app.android.geo.addressBookLocationPicker.presentation.AddressBookLocationPickerViewMapper;
import ru.ozon.app.android.geo.addressChangeProcessor.data.AddressChangeProcessorConfig;
import ru.ozon.app.android.geo.addressChangeProcessor.di.AddressChangeProcessorWidgetComponent;
import ru.ozon.app.android.geo.addressChangeProcessor.presentation.AddressChangeProcessorViewMapper;
import ru.ozon.app.android.geo.addressEditDetail.AddressEditDetailConfig;
import ru.ozon.app.android.geo.addressEditDetail.AddressEditDetailViewMapper;
import ru.ozon.app.android.geo.addressEditDetail.di.AddressEditDetailWidgetComponent;
import ru.ozon.app.android.geo.addressEditDetailV2.data.AddressEditDetailV2Config;
import ru.ozon.app.android.geo.addressEditDetailV2.di.AddressEditDetailV2WidgetComponent;
import ru.ozon.app.android.geo.addressEditDetailV2.mapper.AddressEditDetailV2ViewMapper;
import ru.ozon.app.android.geo.addressEditForm.di.AddressEditFormWidgetComponent;
import ru.ozon.app.android.geo.addressEditForm.presentation.AddressEditFormConfig;
import ru.ozon.app.android.geo.addressEditForm.presentation.AddressEditFormViewMapper;
import ru.ozon.app.android.geo.addressbook.di.AddressBookWidgetComponent;
import ru.ozon.app.android.geo.addressbook.presentation.AddressBookAddressViewMapper;
import ru.ozon.app.android.geo.addressbook.presentation.AddressBookAnalyticsNoUiViewMapper;
import ru.ozon.app.android.geo.addressbook.presentation.AddressBookConfig;
import ru.ozon.app.android.geo.addresseditcarousel.data.AddressEditCarouselConfig;
import ru.ozon.app.android.geo.addresseditcarousel.di.AddressEditCarouselWidgetComponent;
import ru.ozon.app.android.geo.addresseditcarousel.presentation.AddressEditCarouselViewMapper;
import ru.ozon.app.android.geo.addresseditconfirmbutton.AddressEditConfirmButtonViewMapper;
import ru.ozon.app.android.geo.addresseditconfirmbutton.data.AddressEditConfirmButtonConfig;
import ru.ozon.app.android.geo.addresseditconfirmbutton.di.AddressEditConfirmButtonWidgetComponent;
import ru.ozon.app.android.geo.addresseditconfirmbutton.sticky.AddressEditConfirmButtonStickyViewMapper;
import ru.ozon.app.android.geo.addresseditformprompt.core.AddressEditFormPromptConfig;
import ru.ozon.app.android.geo.addresseditformprompt.core.AddressEditFormPromptViewMapper;
import ru.ozon.app.android.geo.addresseditformprompt.di.AddressEditFormPromptWidgetComponent;
import ru.ozon.app.android.geo.addresseditpickupdetailv2.AddressEditPickUpDetailConfig;
import ru.ozon.app.android.geo.addresseditpickupdetailv2.di.AddressEditPickupDetailWidgetComponent;
import ru.ozon.app.android.geo.addresseditpickupdetailv2.presentation.AddressEditPickUpDetailViewMapper;
import ru.ozon.app.android.geo.addresseditunavailable.data.AddressEditUnavailableConfig;
import ru.ozon.app.android.geo.addresseditunavailable.presentation.AddressEditUnavailableViewMapper;
import ru.ozon.app.android.geo.map.di.AddressEditMapComponent;
import ru.ozon.app.android.geo.map.presentation.AddressEditMapConfig;
import ru.ozon.app.android.geo.map.presentation.viewmapper.AddressEditMapViewMapper;
import ru.ozon.app.android.geo.mapPreview.data.MapPreviewConfig;
import ru.ozon.app.android.geo.mapPreview.di.MapPreviewComponent;
import ru.ozon.app.android.geo.mapPreview.presentation.MapPreviewViewMapper;
import ru.ozon.app.android.geo.splitShortInfoWidgetKey.SplitShortInfoConfig;
import ru.ozon.app.android.geo.splitShortInfoWidgetKey.SplitShortInfoViewMapper;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lru/ozon/app/android/geo/di/GeoWidget2Module;", "", "<init>", "()V", "", "Ln20/i;", "provideWidgets$geo_prodGoogleAllVendorsRelease", "()Ljava/util/Set;", "provideWidgets", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GeoWidget2Module {
    @NotNull
    public final Set<i> provideWidgets$geo_prodGoogleAllVendorsRelease() {
        AddressBookConfig.Companion companion = AddressBookConfig.INSTANCE;
        final String str = companion.getVERTICALS().get(0);
        final long[] b11 = j.b();
        final String str2 = "addressBook";
        i iVar = new i(str, str2, b11) { // from class: ru.ozon.app.android.geo.di.GeoWidget2Module$provideWidgets$$inlined$WidgetFactory$default$1
            @Override // n20.i
            public InterfaceC7243a<? extends Object> config(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new AddressBookConfig(ComposerWidgetComponentStorageKt.getJsonParser(storage));
            }

            @Override // n20.i
            public InterfaceC8046a<?, ? extends c>[] viewMappers(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                AddressBookWidgetComponent addressBookWidgetComponent = (AddressBookWidgetComponent) storage.getComponent(AddressBookWidgetComponent.class);
                return new d[]{new AddressBookAddressViewMapper(addressBookWidgetComponent), new AddressBookAnalyticsNoUiViewMapper(addressBookWidgetComponent)};
            }

            @Override // n20.i
            public C7473e<? extends InterfaceC6958a>[] widgetComponent(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new C7473e[]{AddressBookWidgetComponent.INSTANCE.create(storage)};
            }
        };
        final String str3 = companion.getVERTICALS().get(1);
        final long[] b12 = j.b();
        i iVar2 = new i(str3, str2, b12) { // from class: ru.ozon.app.android.geo.di.GeoWidget2Module$provideWidgets$$inlined$WidgetFactory$default$2
            @Override // n20.i
            public InterfaceC7243a<? extends Object> config(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new AddressBookConfig(ComposerWidgetComponentStorageKt.getJsonParser(storage));
            }

            @Override // n20.i
            public InterfaceC8046a<?, ? extends c>[] viewMappers(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                AddressBookWidgetComponent addressBookWidgetComponent = (AddressBookWidgetComponent) storage.getComponent(AddressBookWidgetComponent.class);
                return new d[]{new AddressBookAddressViewMapper(addressBookWidgetComponent), new AddressBookAnalyticsNoUiViewMapper(addressBookWidgetComponent)};
            }

            @Override // n20.i
            public C7473e<? extends InterfaceC6958a>[] widgetComponent(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new C7473e[]{AddressBookWidgetComponent.INSTANCE.create(storage)};
            }
        };
        final long[] b13 = j.b();
        final String str4 = "addressBookMap";
        final String str5 = "addressBookBar";
        i iVar3 = new i(str4, str5, b13) { // from class: ru.ozon.app.android.geo.di.GeoWidget2Module$provideWidgets$$inlined$WidgetFactory$default$3
            @Override // n20.i
            public InterfaceC7243a<? extends Object> config(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new AddressBookBarConfig(ComposerWidgetComponentStorageKt.getJsonParser(storage));
            }

            @Override // n20.i
            public InterfaceC8046a<?, ? extends c>[] viewMappers(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new AddressBookBarViewMapper[]{new AddressBookBarViewMapper((AddressBookBarComponent) storage.getComponent(AddressBookBarComponent.class))};
            }

            @Override // n20.i
            public C7473e<? extends InterfaceC6958a>[] widgetComponent(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new C7473e[]{AddressBookBarComponent.INSTANCE.create(storage)};
            }
        };
        final long[] b14 = j.b();
        final String str6 = "addressBookLocationPicker";
        i iVar4 = new i(str4, str6, b14) { // from class: ru.ozon.app.android.geo.di.GeoWidget2Module$provideWidgets$$inlined$WidgetFactory$default$4
            @Override // n20.i
            public InterfaceC7243a<? extends Object> config(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new AddressBookLocationPickerConfig(ComposerWidgetComponentStorageKt.getJsonParser(storage));
            }

            @Override // n20.i
            public InterfaceC8046a<?, ? extends c>[] viewMappers(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new AddressBookLocationPickerViewMapper[]{new AddressBookLocationPickerViewMapper()};
            }

            @Override // n20.i
            public C7473e<? extends InterfaceC6958a>[] widgetComponent(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return j.a();
            }
        };
        final long[] supported_versions = AddressBookBarV2Config.INSTANCE.getSUPPORTED_VERSIONS();
        i iVar5 = new i(str4, str5, supported_versions) { // from class: ru.ozon.app.android.geo.di.GeoWidget2Module$provideWidgets$$inlined$WidgetFactory$1
            @Override // n20.i
            public InterfaceC7243a<? extends Object> config(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new AddressBookBarV2Config(ComposerWidgetComponentStorageKt.getJsonParser(storage));
            }

            @Override // n20.i
            public InterfaceC8046a<?, ? extends c>[] viewMappers(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new AddressBookBarV2ViewMapper[]{new AddressBookBarV2ViewMapper((AddressBookBarV2Component) storage.getComponent(AddressBookBarV2Component.class))};
            }

            @Override // n20.i
            public C7473e<? extends InterfaceC6958a>[] widgetComponent(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new C7473e[]{AddressBookBarV2Component.INSTANCE.create(storage)};
            }
        };
        final long[] supported_versions2 = AddressEditCarouselConfig.INSTANCE.getSUPPORTED_VERSIONS();
        final String str7 = "checkoutFacade";
        final String str8 = "addressEditCarouselApp";
        i iVar6 = new i(str7, str8, supported_versions2) { // from class: ru.ozon.app.android.geo.di.GeoWidget2Module$provideWidgets$$inlined$WidgetFactory$2
            @Override // n20.i
            public InterfaceC7243a<? extends Object> config(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new AddressEditCarouselConfig(ComposerWidgetComponentStorageKt.getJsonParser(storage));
            }

            @Override // n20.i
            public InterfaceC8046a<?, ? extends c>[] viewMappers(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new AddressEditCarouselViewMapper[]{new AddressEditCarouselViewMapper((AddressEditCarouselWidgetComponent) storage.getComponent(AddressEditCarouselWidgetComponent.class))};
            }

            @Override // n20.i
            public C7473e<? extends InterfaceC6958a>[] widgetComponent(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new C7473e[]{AddressEditCarouselWidgetComponent.Companion.create(storage)};
            }
        };
        final long[] b15 = j.b();
        final String str9 = "addressEditDetail";
        i iVar7 = new i(str7, str9, b15) { // from class: ru.ozon.app.android.geo.di.GeoWidget2Module$provideWidgets$$inlined$WidgetFactory$default$5
            @Override // n20.i
            public InterfaceC7243a<? extends Object> config(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new AddressEditDetailConfig(ComposerWidgetComponentStorageKt.getJsonParser(storage));
            }

            @Override // n20.i
            public InterfaceC8046a<?, ? extends c>[] viewMappers(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new AddressEditDetailViewMapper[]{new AddressEditDetailViewMapper((AddressEditDetailWidgetComponent) storage.getComponent(AddressEditDetailWidgetComponent.class))};
            }

            @Override // n20.i
            public C7473e<? extends InterfaceC6958a>[] widgetComponent(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new C7473e[]{AddressEditDetailWidgetComponent.INSTANCE.create(storage)};
            }
        };
        final long[] supported_versions3 = AddressEditFormPromptConfig.INSTANCE.getSUPPORTED_VERSIONS();
        final String str10 = "addressEditFormPrompt";
        i iVar8 = new i(str7, str10, supported_versions3) { // from class: ru.ozon.app.android.geo.di.GeoWidget2Module$provideWidgets$$inlined$WidgetFactory$3
            @Override // n20.i
            public InterfaceC7243a<? extends Object> config(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new AddressEditFormPromptConfig(ComposerWidgetComponentStorageKt.getJsonParser(storage));
            }

            @Override // n20.i
            public InterfaceC8046a<?, ? extends c>[] viewMappers(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new AddressEditFormPromptViewMapper[]{new AddressEditFormPromptViewMapper((AddressEditFormPromptWidgetComponent) storage.getComponent(AddressEditFormPromptWidgetComponent.class))};
            }

            @Override // n20.i
            public C7473e<? extends InterfaceC6958a>[] widgetComponent(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new C7473e[]{AddressEditFormPromptWidgetComponent.INSTANCE.create(storage)};
            }
        };
        final long[] b16 = j.b();
        final String str11 = "addressEditMap";
        i iVar9 = new i(str7, str11, b16) { // from class: ru.ozon.app.android.geo.di.GeoWidget2Module$provideWidgets$$inlined$WidgetFactory$default$6
            @Override // n20.i
            public InterfaceC7243a<? extends Object> config(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new AddressEditMapConfig(ComposerWidgetComponentStorageKt.getJsonParser(storage));
            }

            @Override // n20.i
            public InterfaceC8046a<?, ? extends c>[] viewMappers(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new AddressEditMapViewMapper[]{new AddressEditMapViewMapper((AddressEditMapComponent) storage.getComponent(AddressEditMapComponent.class))};
            }

            @Override // n20.i
            public C7473e<? extends InterfaceC6958a>[] widgetComponent(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new C7473e[]{AddressEditMapComponent.INSTANCE.create(storage)};
            }
        };
        final long[] b17 = j.b();
        final String str12 = "splitShortInfo";
        i iVar10 = new i(str7, str12, b17) { // from class: ru.ozon.app.android.geo.di.GeoWidget2Module$provideWidgets$$inlined$WidgetFactory$default$7
            @Override // n20.i
            public InterfaceC7243a<? extends Object> config(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new SplitShortInfoConfig(ComposerWidgetComponentStorageKt.getJsonParser(storage));
            }

            @Override // n20.i
            public InterfaceC8046a<?, ? extends c>[] viewMappers(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new SplitShortInfoViewMapper[]{new SplitShortInfoViewMapper()};
            }

            @Override // n20.i
            public C7473e<? extends InterfaceC6958a>[] widgetComponent(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return j.a();
            }
        };
        final long[] b18 = j.b();
        final String str13 = "addressEditForm";
        i iVar11 = new i(str7, str13, b18) { // from class: ru.ozon.app.android.geo.di.GeoWidget2Module$provideWidgets$$inlined$WidgetFactory$default$8
            @Override // n20.i
            public InterfaceC7243a<? extends Object> config(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new AddressEditFormConfig(ComposerWidgetComponentStorageKt.getJsonParser(storage));
            }

            @Override // n20.i
            public InterfaceC8046a<?, ? extends c>[] viewMappers(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new AddressEditFormViewMapper[]{new AddressEditFormViewMapper((AddressEditFormWidgetComponent) storage.getComponent(AddressEditFormWidgetComponent.class))};
            }

            @Override // n20.i
            public C7473e<? extends InterfaceC6958a>[] widgetComponent(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new C7473e[]{AddressEditFormWidgetComponent.INSTANCE.create(storage)};
            }
        };
        final long[] b19 = j.b();
        final String str14 = "addressEditUnavailableItems";
        i iVar12 = new i(str7, str14, b19) { // from class: ru.ozon.app.android.geo.di.GeoWidget2Module$provideWidgets$$inlined$WidgetFactory$default$9
            @Override // n20.i
            public InterfaceC7243a<? extends Object> config(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new AddressEditUnavailableConfig(ComposerWidgetComponentStorageKt.getJsonParser(storage));
            }

            @Override // n20.i
            public InterfaceC8046a<?, ? extends c>[] viewMappers(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new AddressEditUnavailableViewMapper[]{new AddressEditUnavailableViewMapper()};
            }

            @Override // n20.i
            public C7473e<? extends InterfaceC6958a>[] widgetComponent(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return j.a();
            }
        };
        AddressEditPickUpDetailConfig.Companion companion2 = AddressEditPickUpDetailConfig.INSTANCE;
        final String str15 = companion2.getCOMPONENTS().get(0);
        final long[] supported_versions4 = companion2.getSUPPORTED_VERSIONS();
        i iVar13 = new i(str7, str15, supported_versions4) { // from class: ru.ozon.app.android.geo.di.GeoWidget2Module$provideWidgets$$inlined$WidgetFactory$4
            @Override // n20.i
            public InterfaceC7243a<? extends Object> config(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new AddressEditPickUpDetailConfig(ComposerWidgetComponentStorageKt.getJsonParser(storage));
            }

            @Override // n20.i
            public InterfaceC8046a<?, ? extends c>[] viewMappers(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new AddressEditPickUpDetailViewMapper[]{new AddressEditPickUpDetailViewMapper((AddressEditPickupDetailWidgetComponent) storage.getComponent(AddressEditPickupDetailWidgetComponent.class))};
            }

            @Override // n20.i
            public C7473e<? extends InterfaceC6958a>[] widgetComponent(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new C7473e[]{AddressEditPickupDetailWidgetComponent.INSTANCE.create(storage)};
            }
        };
        final String str16 = companion2.getCOMPONENTS().get(1);
        final long[] supported_versions5 = companion2.getSUPPORTED_VERSIONS();
        i iVar14 = new i(str7, str16, supported_versions5) { // from class: ru.ozon.app.android.geo.di.GeoWidget2Module$provideWidgets$$inlined$WidgetFactory$5
            @Override // n20.i
            public InterfaceC7243a<? extends Object> config(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new AddressEditPickUpDetailConfig(ComposerWidgetComponentStorageKt.getJsonParser(storage));
            }

            @Override // n20.i
            public InterfaceC8046a<?, ? extends c>[] viewMappers(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new AddressEditPickUpDetailViewMapper[]{new AddressEditPickUpDetailViewMapper((AddressEditPickupDetailWidgetComponent) storage.getComponent(AddressEditPickupDetailWidgetComponent.class))};
            }

            @Override // n20.i
            public C7473e<? extends InterfaceC6958a>[] widgetComponent(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new C7473e[]{AddressEditPickupDetailWidgetComponent.INSTANCE.create(storage)};
            }
        };
        final long[] b21 = j.b();
        final String str17 = "mapPreview";
        i iVar15 = new i(str4, str17, b21) { // from class: ru.ozon.app.android.geo.di.GeoWidget2Module$provideWidgets$$inlined$WidgetFactory$default$10
            @Override // n20.i
            public InterfaceC7243a<? extends Object> config(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new MapPreviewConfig(ComposerWidgetComponentStorageKt.getJsonParser(storage));
            }

            @Override // n20.i
            public InterfaceC8046a<?, ? extends c>[] viewMappers(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new MapPreviewViewMapper[]{new MapPreviewViewMapper((MapPreviewComponent) storage.getComponent(MapPreviewComponent.class))};
            }

            @Override // n20.i
            public C7473e<? extends InterfaceC6958a>[] widgetComponent(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new C7473e[]{MapPreviewComponent.INSTANCE.create(storage)};
            }
        };
        final long[] b22 = j.b();
        final String str18 = "addressEditConfirmButton";
        i iVar16 = new i(str7, str18, b22) { // from class: ru.ozon.app.android.geo.di.GeoWidget2Module$provideWidgets$$inlined$WidgetFactory$default$11
            @Override // n20.i
            public InterfaceC7243a<? extends Object> config(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new AddressEditConfirmButtonConfig(ComposerWidgetComponentStorageKt.getJsonParser(storage));
            }

            @Override // n20.i
            public InterfaceC8046a<?, ? extends c>[] viewMappers(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                AddressEditConfirmButtonWidgetComponent addressEditConfirmButtonWidgetComponent = (AddressEditConfirmButtonWidgetComponent) storage.getComponent(AddressEditConfirmButtonWidgetComponent.class);
                return new d[]{new AddressEditConfirmButtonViewMapper(addressEditConfirmButtonWidgetComponent), new AddressEditConfirmButtonStickyViewMapper(addressEditConfirmButtonWidgetComponent)};
            }

            @Override // n20.i
            public C7473e<? extends InterfaceC6958a>[] widgetComponent(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new C7473e[]{AddressEditConfirmButtonWidgetComponent.INSTANCE.create(storage)};
            }
        };
        final long[] b23 = j.b();
        final String str19 = "addressChangeProcessor";
        i iVar17 = new i(str4, str19, b23) { // from class: ru.ozon.app.android.geo.di.GeoWidget2Module$provideWidgets$$inlined$WidgetFactory$default$12
            @Override // n20.i
            public InterfaceC7243a<? extends Object> config(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new AddressChangeProcessorConfig(ComposerWidgetComponentStorageKt.getJsonParser(storage));
            }

            @Override // n20.i
            public InterfaceC8046a<?, ? extends c>[] viewMappers(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new AddressChangeProcessorViewMapper[]{new AddressChangeProcessorViewMapper((AddressChangeProcessorWidgetComponent) storage.getComponent(AddressChangeProcessorWidgetComponent.class))};
            }

            @Override // n20.i
            public C7473e<? extends InterfaceC6958a>[] widgetComponent(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new C7473e[]{AddressChangeProcessorWidgetComponent.INSTANCE.create(storage)};
            }
        };
        final long[] supported_versions6 = AddressEditDetailV2Config.INSTANCE.getSUPPORTED_VERSIONS();
        i[] elements = {iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9, iVar10, iVar11, iVar12, iVar13, iVar14, iVar15, iVar16, iVar17, new i(str7, str9, supported_versions6) { // from class: ru.ozon.app.android.geo.di.GeoWidget2Module$provideWidgets$$inlined$WidgetFactory$6
            @Override // n20.i
            public InterfaceC7243a<? extends Object> config(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new AddressEditDetailV2Config(ComposerWidgetComponentStorageKt.getJsonParser(storage));
            }

            @Override // n20.i
            public InterfaceC8046a<?, ? extends c>[] viewMappers(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new AddressEditDetailV2ViewMapper[]{new AddressEditDetailV2ViewMapper((AddressEditDetailV2WidgetComponent) storage.getComponent(AddressEditDetailV2WidgetComponent.class))};
            }

            @Override // n20.i
            public C7473e<? extends InterfaceC6958a>[] widgetComponent(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new C7473e[]{AddressEditDetailV2WidgetComponent.Companion.create(storage)};
            }
        }};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return C7705l.j0(elements);
    }
}
