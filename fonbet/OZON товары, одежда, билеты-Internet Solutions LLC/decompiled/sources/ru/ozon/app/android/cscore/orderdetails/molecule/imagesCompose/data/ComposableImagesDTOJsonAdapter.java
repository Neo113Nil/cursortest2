package ru.ozon.app.android.cscore.orderdetails.molecule.imagesCompose.data;

import Y9.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cscore.padding.HorizontalPadding;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\"\u0010\u0019\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001aR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001aR\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u001aR\u001e\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/ozon/app/android/cscore/orderdetails/molecule/imagesCompose/data/ComposableImagesDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/cscore/orderdetails/molecule/imagesCompose/data/ComposableImagesDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/cscore/orderdetails/molecule/imagesCompose/data/ComposableImagesDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/cscore/orderdetails/molecule/imagesCompose/data/ComposableImagesDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "Lru/ozon/app/android/cscore/orderdetails/molecule/imagesCompose/data/ComposableImageDTO;", "nullableListOfComposableImageDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "nullableAtomActionDTOAdapter", "Lru/ozon/uni/atoms/data/text/TextDTO;", "nullableTextDTOAdapter", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "nullableCommonControlSettingsAdapter", "Lru/ozon/app/android/cscore/padding/HorizontalPadding;", "horizontalPaddingAdapter", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "nullableLayoutPaddingAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "csma_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ComposableImagesDTOJsonAdapter extends JsonAdapter<ComposableImagesDTO> {
    public static final int $stable = 8;
    private volatile Constructor<ComposableImagesDTO> constructorRef;

    @NotNull
    private final JsonAdapter<HorizontalPadding> horizontalPaddingAdapter;

    @NotNull
    private final JsonAdapter<AtomActionDTO> nullableAtomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<CommonControlSettings> nullableCommonControlSettingsAdapter;

    @NotNull
    private final JsonAdapter<CommonCellSettings.LayoutPadding> nullableLayoutPaddingAdapter;

    @NotNull
    private final JsonAdapter<List<ComposableImageDTO>> nullableListOfComposableImageDTOAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> nullableTextDTOAdapter;

    @NotNull
    private final n.a options;

    public ComposableImagesDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("images", "action", SelectionItemFormDTO.TITLE_FIELD_NAME, "common", "horizontalPadding", "spaceBetween");
        b e11 = D.e(List.class, ComposableImageDTO.class);
        M m11 = M.f71699a;
        this.nullableListOfComposableImageDTOAdapter = moshi.f(e11, m11, "images");
        this.nullableAtomActionDTOAdapter = moshi.f(AtomActionDTO.class, m11, "action");
        this.nullableTextDTOAdapter = moshi.f(TextDTO.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableCommonControlSettingsAdapter = moshi.f(CommonControlSettings.class, m11, "common");
        this.horizontalPaddingAdapter = moshi.f(HorizontalPadding.class, m11, "horizontalPadding");
        this.nullableLayoutPaddingAdapter = moshi.f(CommonCellSettings.LayoutPadding.class, m11, "spaceBetween");
    }

    @NotNull
    public String toString() {
        return Ak.b.c(41, "GeneratedJsonAdapter(ComposableImagesDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ComposableImagesDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        List<ComposableImageDTO> list = null;
        AtomActionDTO atomActionDTO = null;
        TextDTO textDTO = null;
        CommonControlSettings commonControlSettings = null;
        HorizontalPadding horizontalPadding = null;
        CommonCellSettings.LayoutPadding layoutPadding = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    list = this.nullableListOfComposableImageDTOAdapter.fromJson(reader);
                    break;
                case 1:
                    atomActionDTO = this.nullableAtomActionDTOAdapter.fromJson(reader);
                    break;
                case 2:
                    textDTO = this.nullableTextDTOAdapter.fromJson(reader);
                    break;
                case 3:
                    commonControlSettings = this.nullableCommonControlSettingsAdapter.fromJson(reader);
                    break;
                case 4:
                    horizontalPadding = this.horizontalPaddingAdapter.fromJson(reader);
                    if (horizontalPadding == null) {
                        throw c.q("horizontalPadding", "horizontalPadding", reader);
                    }
                    i11 &= -33;
                    break;
                case 5:
                    layoutPadding = this.nullableLayoutPaddingAdapter.fromJson(reader);
                    i11 &= -65;
                    break;
            }
        }
        reader.endObject();
        if (i11 == -97) {
            Intrinsics.g(horizontalPadding, "null cannot be cast to non-null type ru.ozon.app.android.cscore.padding.HorizontalPadding");
            CommonCellSettings.LayoutPadding layoutPadding2 = layoutPadding;
            HorizontalPadding horizontalPadding2 = horizontalPadding;
            CommonControlSettings commonControlSettings2 = commonControlSettings;
            return new ComposableImagesDTO(null, list, atomActionDTO, textDTO, commonControlSettings2, horizontalPadding2, layoutPadding2, 1, null);
        }
        CommonCellSettings.LayoutPadding layoutPadding3 = layoutPadding;
        HorizontalPadding horizontalPadding3 = horizontalPadding;
        CommonControlSettings commonControlSettings3 = commonControlSettings;
        TextDTO textDTO2 = textDTO;
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        List<ComposableImageDTO> list2 = list;
        Constructor<ComposableImagesDTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = ComposableImagesDTO.class.getDeclaredConstructor(String.class, List.class, AtomActionDTO.class, TextDTO.class, CommonControlSettings.class, HorizontalPadding.class, CommonCellSettings.LayoutPadding.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        ComposableImagesDTO newInstance = constructor.newInstance(null, list2, atomActionDTO2, textDTO2, commonControlSettings3, horizontalPadding3, layoutPadding3, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ComposableImagesDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("images");
        this.nullableListOfComposableImageDTOAdapter.mo44toJson(writer, (x) value.getImages());
        writer.w("action");
        this.nullableAtomActionDTOAdapter.mo44toJson(writer, (x) value.getAction());
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("common");
        this.nullableCommonControlSettingsAdapter.mo44toJson(writer, (x) value.getCommon());
        writer.w("horizontalPadding");
        this.horizontalPaddingAdapter.mo44toJson(writer, (x) value.getHorizontalPadding());
        writer.w("spaceBetween");
        this.nullableLayoutPaddingAdapter.mo44toJson(writer, (x) value.getSpaceBetween());
        writer.p();
    }
}
