package ru.ozon.app.android.returns.creation.widgets.photoPicker.core;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.delivery.common.AppTokensProvider;
import ru.ozon.app.android.returns.creation.widgets.itemInfo.data.ItemDTO;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.data.ButtonsDTO;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.data.PhotosDTO;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.data.ReturnCreationPhotoPickerDTO;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.data.TitleDTO;
import ru.ozon.app.android.returns.ui.data.parser.IslandSeparatorWidgetParser;
import ru.ozon.app.android.returns.ui.molecules.bottomEars.data.StickyBottomEarsDTO;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0001\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001B\u001d\b\u0007\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002R\u0012\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/photoPicker/core/ReturnCreationPhotoPickerParser;", "Lru/ozon/app/android/returns/ui/data/parser/IslandSeparatorWidgetParser;", "", "", "jsonDeserializer", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "appContext", "Landroid/content/Context;", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;Landroid/content/Context;)V", "invoke", "params", "", "state", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ReturnCreationPhotoPickerParser extends IslandSeparatorWidgetParser<List<? extends Object>> {

    @NotNull
    private final Context appContext;

    @NotNull
    private final JsonParser jsonDeserializer;

    public ReturnCreationPhotoPickerParser(@NotNull JsonParser jsonDeserializer, @NotNull Context appContext) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        this.jsonDeserializer = jsonDeserializer;
        this.appContext = appContext;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<Object> invoke(String params, String state) {
        if (state == null) {
            return K.f71697a;
        }
        ReturnCreationPhotoPickerDTO returnCreationPhotoPickerDTO = (ReturnCreationPhotoPickerDTO) this.jsonDeserializer.fromJson(state, ReturnCreationPhotoPickerDTO.class);
        ArrayList arrayList = new ArrayList();
        ItemDTO item = returnCreationPhotoPickerDTO.getItem();
        if (item != null) {
            arrayList.add(item);
        }
        if (AppTokensProvider.INSTANCE.isSelect(this.appContext)) {
            arrayList.add(new StickyBottomEarsDTO(createBeginIslandSeparator()));
        } else {
            arrayList.add(IslandSeparatorWidgetParser.createIslandSeparator$default(this, null, null, 3, null));
        }
        arrayList.add(new TitleDTO(returnCreationPhotoPickerDTO.getTitle(), returnCreationPhotoPickerDTO.getSubtitle()));
        arrayList.add(new PhotosDTO(returnCreationPhotoPickerDTO.getEmptyStateImage(), returnCreationPhotoPickerDTO.getExistingImages(), returnCreationPhotoPickerDTO.getMinimalLimit()));
        arrayList.add(new ButtonsDTO(returnCreationPhotoPickerDTO.getUploadImageAction(), returnCreationPhotoPickerDTO.getContinueButton(), returnCreationPhotoPickerDTO.getAddPhotoButton(), returnCreationPhotoPickerDTO.getAddMorePhotoButton(), returnCreationPhotoPickerDTO.getMinimalLimit(), returnCreationPhotoPickerDTO.getMaxCount()));
        return arrayList;
    }
}
