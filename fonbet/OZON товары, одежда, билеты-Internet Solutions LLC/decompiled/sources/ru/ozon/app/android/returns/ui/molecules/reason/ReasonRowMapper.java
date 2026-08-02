package ru.ozon.app.android.returns.ui.molecules.reason;

import Sc.r;
import Sc.s;
import Tc.b;
import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.ui.molecules.textarea.viewMapper.TextAreaMapper;
import ru.ozon.app.android.returns.ui.molecules.textarea.viewObject.ReasonRow;
import ru.ozon.app.android.returns.ui.presentation.flexImages.ImageVI;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\nJ\u0017\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/returns/ui/molecules/reason/ReasonRowMapper;", "", "textAreaMapper", "Lru/ozon/app/android/returns/ui/molecules/textarea/viewMapper/TextAreaMapper;", "<init>", "(Lru/ozon/app/android/returns/ui/molecules/textarea/viewMapper/TextAreaMapper;)V", "mapToReasonRow", "Lru/ozon/app/android/returns/ui/molecules/textarea/viewObject/ReasonRow;", "model", "stateId", "", "getIdFromImage", "", "image", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "(Lru/ozon/uni/atoms/data/icon/IconDTO;)Ljava/lang/Long;", "returns_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReasonRowMapper {

    @NotNull
    private final TextAreaMapper textAreaMapper;

    public ReasonRowMapper(@NotNull TextAreaMapper textAreaMapper) {
        Intrinsics.checkNotNullParameter(textAreaMapper, "textAreaMapper");
        this.textAreaMapper = textAreaMapper;
    }

    private final Long getIdFromImage(IconDTO image) {
        Object a11;
        try {
            r.Companion companion = r.INSTANCE;
            a11 = Long.valueOf(Uri.parse(image.getBackgroundImage()).getLastPathSegment() != null ? r3.hashCode() : 0);
        } catch (Throwable th2) {
            r.Companion companion2 = r.INSTANCE;
            a11 = s.a(th2);
        }
        if (a11 instanceof r.b) {
            a11 = null;
        }
        return (Long) a11;
    }

    public final ReasonRow mapToReasonRow(@NotNull Object model, @NotNull String stateId) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(stateId, "stateId");
        if (model instanceof CellDTO) {
            long hashCode = (hashCode() + "_" + stateId).hashCode();
            CellDTO cellDTO = (CellDTO) model;
            CellDTO.Settings settings = cellDTO.getSettings();
            return new ReasonRow.CellRow(hashCode, CellDTO.copy$default(cellDTO, null, settings != null ? CellDTO.Settings.copy$default(settings, null, null, null, null, null, null, null, null, null, Boolean.TRUE, null, 1535, null) : null, null, null, null, 29, null));
        }
        if (model instanceof InputDTO) {
            int hashCode2 = hashCode();
            InputDTO inputDTO = (InputDTO) model;
            return new ReasonRow.InputRow((hashCode2 + "_" + stateId).hashCode(), this.textAreaMapper.invoke(inputDTO.getTextArea()), inputDTO.getAction(), inputDTO.getShowValidationBorder(), inputDTO.getValidationBorderColor());
        }
        if (!(model instanceof PickedImagesDTO)) {
            return null;
        }
        long hashCode3 = stateId.hashCode();
        b builder = C7714v.B();
        int hashCode4 = builder.hashCode();
        PickedImagesDTO pickedImagesDTO = (PickedImagesDTO) model;
        builder.add(new ImageVI.Simple((hashCode4 + "_" + stateId).hashCode(), pickedImagesDTO.getAddPhotoButton().getIcon(), pickedImagesDTO.getAddPhotoButton().getCommon()));
        List<ImageDTO> images = pickedImagesDTO.getImages();
        if (images != null) {
            List<ImageDTO> list = images;
            ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
            int i11 = 0;
            for (Object obj : list) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    C7714v.O0();
                    throw null;
                }
                ImageDTO imageDTO = (ImageDTO) obj;
                Long idFromImage = getIdFromImage(imageDTO.getImage());
                arrayList.add(new ImageVI.Deletable(idFromImage != null ? idFromImage.longValue() : Lh.b.a(i11, stateId, "_"), imageDTO.getImage(), null, imageDTO.getDeleteButton(), 4, null));
                i11 = i12;
            }
            builder.addAll(arrayList);
        }
        Unit unit = Unit.f71690a;
        Intrinsics.checkNotNullParameter(builder, "builder");
        return new ReasonRow.PickedImagesRow(hashCode3, builder.B());
    }
}
