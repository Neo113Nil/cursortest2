package ru.ozon.app.android.geo.addresseditconfirmbutton;

import A00.a;
import android.view.ViewGroup;
import j10.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l20.C7854a;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.FormBuilderBlockVO;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.updateevent.FormBuilderFieldUpdate;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.updateevent.FormDataUpdate;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.geo.addressEditForm.presentation.AddressEditFormVO;
import ru.ozon.app.android.utils.KeyboardUtilsKt;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ7\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u0015\u0010\u0016J=\u0010\u001b\u001a\u00020\u00142\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u00172\u0006\u0010\u000b\u001a\u00020\n2\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000f2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/geo/addresseditconfirmbutton/FormDataUpdateHelper;", "", "<init>", "()V", "LA00/a$J$a;", "update", "Lru/ozon/app/android/geo/addresseditconfirmbutton/AddressEditConfirmButtonVO;", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/geo/addresseditconfirmbutton/AddressEditConfirmButtonVO;)Lru/ozon/app/android/geo/addresseditconfirmbutton/AddressEditConfirmButtonVO;", "", "link", "Landroid/view/ViewGroup;", "composerRootView", "Ll10/b;", "Lru/ozon/app/android/composer/ComposerController;", "controller", "Lj10/h;", "Lru/ozon/composer/ui/widget/l;", "viewItemHelper", "", "handleClick", "(Ljava/lang/String;Landroid/view/ViewGroup;Ll10/b;Lj10/h;)V", "", "formInfo", "", "silent", "sendFormData", "(Ljava/util/Map;Ljava/lang/String;Ll10/b;Z)V", "Companion", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FormDataUpdateHelper {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/geo/addresseditconfirmbutton/FormDataUpdateHelper$Companion;", "", "<init>", "()V", "FORM_PARAM", "", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x003a, code lost:
    
        if (r0.isEmpty() == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void handleClick(@NotNull String link, @NotNull ViewGroup composerRootView, @NotNull InterfaceC7851b controller, @NotNull h<l> viewItemHelper) {
        Map<String, String> map;
        ArrayList arrayList;
        l lVar;
        l lVar2;
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(viewItemHelper, "viewItemHelper");
        ArrayList a11 = viewItemHelper.a(AddressEditConfirmButtonVO.class);
        Map<String, String> map2 = null;
        if (a11 != null && (lVar2 = (l) C7714v.M(a11)) != null) {
            c d11 = lVar2.d();
            Intrinsics.g(d11, "null cannot be cast to non-null type ru.ozon.app.android.geo.addresseditconfirmbutton.AddressEditConfirmButtonVO");
            map = ((AddressEditConfirmButtonVO) d11).getDataForSend();
            if (map != null) {
            }
        }
        map = null;
        Intrinsics.checkNotNullParameter(AddressEditFormVO.class, "clazz");
        List<l> c11 = viewItemHelper.c();
        if (c11 != null) {
            arrayList = new ArrayList();
            for (Object obj : c11) {
                if (((C7854a) obj).d().getClass().equals(AddressEditFormVO.class)) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null && (lVar = (l) C7714v.M(arrayList)) != null) {
            c d12 = lVar.d();
            Intrinsics.g(d12, "null cannot be cast to non-null type ru.ozon.app.android.geo.addressEditForm.presentation.AddressEditFormVO");
            Map<String, String> dataForSend = ((AddressEditFormVO) d12).getDataForSend();
            if (dataForSend != null && !dataForSend.isEmpty()) {
                map2 = dataForSend;
            }
        }
        if (map == null) {
            map = map2 == null ? U.c() : map2;
        }
        KeyboardUtilsKt.hideKeyboard(composerRootView);
        sendFormData(map, link, controller, false);
    }

    public final AddressEditConfirmButtonVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull AddressEditConfirmButtonVO oldItem) {
        AddressEditConfirmButtonVO addressEditConfirmButtonVO;
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Object obj = null;
        if (update instanceof FormDataUpdate) {
            FormDataUpdate formDataUpdate = (FormDataUpdate) update;
            AddressEditConfirmButtonVO addressEditConfirmButtonVO2 = !Intrinsics.d(oldItem.getDataForSend(), formDataUpdate.getFormData()) ? oldItem : null;
            if (addressEditConfirmButtonVO2 != null) {
                return AddressEditConfirmButtonVO.copy$default(addressEditConfirmButtonVO2, 0L, null, null, formDataUpdate.getFormData(), null, false, 55, null);
            }
            return null;
        }
        if (update instanceof FormBuilderFieldUpdate.FormBuilderSelectorFieldUpdate) {
            Map<String, String> dataForSend = oldItem.getDataForSend();
            if (dataForSend == null) {
                dataForSend = U.c();
            }
            FormBuilderFieldUpdate.FormBuilderSelectorFieldUpdate formBuilderSelectorFieldUpdate = (FormBuilderFieldUpdate.FormBuilderSelectorFieldUpdate) update;
            String fieldName = formBuilderSelectorFieldUpdate.getFieldName();
            FormBuilderBlockVO.Field.SelectorField.SelectOptions.Option selectedOption = formBuilderSelectorFieldUpdate.getSelectedOption();
            String value = selectedOption != null ? selectedOption.getValue() : null;
            return AddressEditConfirmButtonVO.copy$default(oldItem, 0L, null, null, U.n(dataForSend, new Pair(fieldName, value != null ? value : "")), null, false, 55, null);
        }
        if (update instanceof FormBuilderFieldUpdate.FormBuilderTextFieldUpdate) {
            Map<String, String> dataForSend2 = oldItem.getDataForSend();
            if (dataForSend2 == null) {
                dataForSend2 = U.c();
            }
            FormBuilderFieldUpdate.FormBuilderTextFieldUpdate formBuilderTextFieldUpdate = (FormBuilderFieldUpdate.FormBuilderTextFieldUpdate) update;
            return AddressEditConfirmButtonVO.copy$default(oldItem, 0L, null, null, U.n(dataForSend2, new Pair(formBuilderTextFieldUpdate.getFieldName(), formBuilderTextFieldUpdate.getText())), null, false, 55, null);
        }
        if (update instanceof FormBuilderFieldUpdate.FormBuilderYandexSearchFieldUpdate) {
            Map<String, String> dataForSend3 = oldItem.getDataForSend();
            if (dataForSend3 == null) {
                dataForSend3 = U.c();
            }
            FormBuilderFieldUpdate.FormBuilderYandexSearchFieldUpdate formBuilderYandexSearchFieldUpdate = (FormBuilderFieldUpdate.FormBuilderYandexSearchFieldUpdate) update;
            Map n11 = U.n(dataForSend3, new Pair(formBuilderYandexSearchFieldUpdate.getFieldName(), formBuilderYandexSearchFieldUpdate.getText()));
            if (update == null) {
                formBuilderYandexSearchFieldUpdate = null;
            }
            return AddressEditConfirmButtonVO.copy$default(oldItem, 0L, null, null, n11, formBuilderYandexSearchFieldUpdate != null ? formBuilderYandexSearchFieldUpdate.getUpdateLink() : null, false, 39, null);
        }
        if (!(update instanceof FormBuilderFieldUpdate.FormBuilderChipsFieldUpdate)) {
            return null;
        }
        FormDataUpdateHelper$handleUpdate$updatedData$1 formDataUpdateHelper$handleUpdate$updatedData$1 = new FormDataUpdateHelper$handleUpdate$updatedData$1(oldItem, update);
        List<FormBuilderBlockVO.Field.ChipsField.ChipsWithField.ChipItemMobile> chipsMobile = ((FormBuilderFieldUpdate.FormBuilderChipsFieldUpdate) update).getChipsWithField().getChipsMobile();
        if (chipsMobile != null) {
            Iterator<T> it = chipsMobile.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (Intrinsics.d(((FormBuilderBlockVO.Field.ChipsField.ChipsWithField.ChipItemMobile) next).getTagButton().isSelected(), Boolean.TRUE)) {
                    obj = next;
                    break;
                }
            }
            FormBuilderBlockVO.Field.ChipsField.ChipsWithField.ChipItemMobile chipItemMobile = (FormBuilderBlockVO.Field.ChipsField.ChipsWithField.ChipItemMobile) obj;
            if (chipItemMobile != null) {
                if (chipItemMobile.getHasTextField()) {
                    addressEditConfirmButtonVO = oldItem;
                } else {
                    String text = chipItemMobile.getTagButton().getText();
                    if (text == null) {
                        text = "";
                    }
                    addressEditConfirmButtonVO = AddressEditConfirmButtonVO.copy$default(oldItem, 0L, null, null, formDataUpdateHelper$handleUpdate$updatedData$1.invoke((FormDataUpdateHelper$handleUpdate$updatedData$1) text), null, false, 55, null);
                }
                if (addressEditConfirmButtonVO != null) {
                    return addressEditConfirmButtonVO;
                }
            }
        }
        return AddressEditConfirmButtonVO.copy$default(oldItem, 0L, null, null, formDataUpdateHelper$handleUpdate$updatedData$1.invoke((FormDataUpdateHelper$handleUpdate$updatedData$1) ""), null, false, 55, null);
    }

    public final void sendFormData(@NotNull Map<String, String> formInfo, @NotNull String link, @NotNull InterfaceC7851b controller, boolean silent) {
        Intrinsics.checkNotNullParameter(formInfo, "formInfo");
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(controller, "controller");
        Map i11 = U.i(new Pair(DynamicElementDTO.FORM, formInfo));
        if (silent) {
            InterfaceC7851b.a.e(controller, link, i11, null, 4);
        } else {
            InterfaceC7851b.a.a(controller, link, i11, null, null, 12);
        }
    }
}
