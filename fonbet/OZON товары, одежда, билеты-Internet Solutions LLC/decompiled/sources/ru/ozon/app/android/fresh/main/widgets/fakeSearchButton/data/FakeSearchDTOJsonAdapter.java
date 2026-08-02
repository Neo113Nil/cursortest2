package ru.ozon.app.android.fresh.main.widgets.fakeSearchButton.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.fresh.main.widgets.fakeSearchButton.data.FakeSearchDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R(\u0010&\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020%\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0019R\u001c\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0019R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0019R\u001e\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006."}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/fakeSearchButton/data/FakeSearchDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/fresh/main/widgets/fakeSearchButton/data/FakeSearchDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/fresh/main/widgets/fakeSearchButton/data/FakeSearchDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/fresh/main/widgets/fakeSearchButton/data/FakeSearchDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "textDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "iconDTOAdapter", "Lru/ozon/app/android/fresh/main/widgets/fakeSearchButton/data/FakeSearchDTO$PaddingsDTO;", "paddingsDTOAdapter", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "atomActionDTOAdapter", "Lru/ozon/app/android/fresh/main/widgets/fakeSearchButton/data/FakeSearchDTO$CornersDTO;", "cornersDTOAdapter", "stringAdapter", "nullableStringAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "nullableIconButtonV3DTOAdapter", "", "booleanAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FakeSearchDTOJsonAdapter extends JsonAdapter<FakeSearchDTO> {

    @NotNull
    private final JsonAdapter<AtomActionDTO> atomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<FakeSearchDTO> constructorRef;

    @NotNull
    private final JsonAdapter<FakeSearchDTO.CornersDTO> cornersDTOAdapter;

    @NotNull
    private final JsonAdapter<IconDTO> iconDTOAdapter;

    @NotNull
    private final JsonAdapter<IconButtonV3DTO> nullableIconButtonV3DTOAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<FakeSearchDTO.PaddingsDTO> paddingsDTOAdapter;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> textDTOAdapter;

    public FakeSearchDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(SelectionItemFormDTO.TITLE_FIELD_NAME, "icon", "paddings", "action", "roundedCorners", "stickyRoundingColor", "tintColor", "trackingInfo", "rightIconButton", "shouldSkipStickyAnimation");
        M m11 = M.f71699a;
        this.textDTOAdapter = moshi.f(TextDTO.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.iconDTOAdapter = moshi.f(IconDTO.class, m11, "icon");
        this.paddingsDTOAdapter = moshi.f(FakeSearchDTO.PaddingsDTO.class, m11, "paddings");
        this.atomActionDTOAdapter = moshi.f(AtomActionDTO.class, m11, "action");
        this.cornersDTOAdapter = moshi.f(FakeSearchDTO.CornersDTO.class, m11, "roundedCorners");
        this.stringAdapter = moshi.f(String.class, m11, "stickyRoundingColor");
        this.nullableStringAdapter = moshi.f(String.class, m11, "tintColor");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
        this.nullableIconButtonV3DTOAdapter = moshi.f(IconButtonV3DTO.class, m11, "rightIconButton");
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "shouldSkipStickyAnimation");
    }

    @NotNull
    public String toString() {
        return b.c(35, "GeneratedJsonAdapter(FakeSearchDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public FakeSearchDTO fromJson(@NotNull n reader) {
        FakeSearchDTO.CornersDTO cornersDTO;
        Intrinsics.checkNotNullParameter(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.beginObject();
        IconDTO iconDTO = null;
        Boolean bool2 = bool;
        TextDTO textDTO = null;
        AtomActionDTO atomActionDTO = null;
        FakeSearchDTO.CornersDTO cornersDTO2 = null;
        String str = null;
        String str2 = null;
        Map<String, TokenizedTrackingInfo> map = null;
        IconButtonV3DTO iconButtonV3DTO = null;
        int i11 = -1;
        FakeSearchDTO.PaddingsDTO paddingsDTO = null;
        while (true) {
            TextDTO textDTO2 = textDTO;
            IconDTO iconDTO2 = iconDTO;
            FakeSearchDTO.PaddingsDTO paddingsDTO2 = paddingsDTO;
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            if (!reader.hasNext()) {
                reader.endObject();
                if (i11 == -513) {
                    if (textDTO2 == null) {
                        throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    if (iconDTO2 == null) {
                        throw c.j("icon", "icon", reader);
                    }
                    if (paddingsDTO2 == null) {
                        throw c.j("paddings", "paddings", reader);
                    }
                    if (atomActionDTO2 == null) {
                        throw c.j("action", "action", reader);
                    }
                    if (cornersDTO2 == null) {
                        throw c.j("roundedCorners", "roundedCorners", reader);
                    }
                    if (str != null) {
                        return new FakeSearchDTO(textDTO2, iconDTO2, paddingsDTO2, atomActionDTO2, cornersDTO2, str, str2, map, iconButtonV3DTO, bool2.booleanValue());
                    }
                    throw c.j("stickyRoundingColor", "stickyRoundingColor", reader);
                }
                Constructor<FakeSearchDTO> constructor = this.constructorRef;
                if (constructor == null) {
                    cornersDTO = cornersDTO2;
                    constructor = FakeSearchDTO.class.getDeclaredConstructor(TextDTO.class, IconDTO.class, FakeSearchDTO.PaddingsDTO.class, AtomActionDTO.class, FakeSearchDTO.CornersDTO.class, String.class, String.class, Map.class, IconButtonV3DTO.class, Boolean.TYPE, Integer.TYPE, c.f34864d);
                    this.constructorRef = constructor;
                    Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
                } else {
                    cornersDTO = cornersDTO2;
                }
                if (textDTO2 == null) {
                    throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                }
                if (iconDTO2 == null) {
                    throw c.j("icon", "icon", reader);
                }
                if (paddingsDTO2 == null) {
                    throw c.j("paddings", "paddings", reader);
                }
                if (atomActionDTO2 == null) {
                    throw c.j("action", "action", reader);
                }
                if (cornersDTO == null) {
                    throw c.j("roundedCorners", "roundedCorners", reader);
                }
                if (str == null) {
                    throw c.j("stickyRoundingColor", "stickyRoundingColor", reader);
                }
                IconButtonV3DTO iconButtonV3DTO2 = iconButtonV3DTO;
                FakeSearchDTO newInstance = constructor.newInstance(textDTO2, iconDTO2, paddingsDTO2, atomActionDTO2, cornersDTO, str, str2, map, iconButtonV3DTO2, bool2, Integer.valueOf(i11), null);
                Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
                return newInstance;
            }
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    textDTO = textDTO2;
                    iconDTO = iconDTO2;
                    paddingsDTO = paddingsDTO2;
                    atomActionDTO = atomActionDTO2;
                case 0:
                    textDTO = this.textDTOAdapter.fromJson(reader);
                    if (textDTO == null) {
                        throw c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    iconDTO = iconDTO2;
                    paddingsDTO = paddingsDTO2;
                    atomActionDTO = atomActionDTO2;
                case 1:
                    iconDTO = this.iconDTOAdapter.fromJson(reader);
                    if (iconDTO == null) {
                        throw c.q("icon", "icon", reader);
                    }
                    textDTO = textDTO2;
                    paddingsDTO = paddingsDTO2;
                    atomActionDTO = atomActionDTO2;
                case 2:
                    paddingsDTO = this.paddingsDTOAdapter.fromJson(reader);
                    if (paddingsDTO == null) {
                        throw c.q("paddings", "paddings", reader);
                    }
                    textDTO = textDTO2;
                    iconDTO = iconDTO2;
                    atomActionDTO = atomActionDTO2;
                case 3:
                    atomActionDTO = this.atomActionDTOAdapter.fromJson(reader);
                    if (atomActionDTO == null) {
                        throw c.q("action", "action", reader);
                    }
                    textDTO = textDTO2;
                    iconDTO = iconDTO2;
                    paddingsDTO = paddingsDTO2;
                case 4:
                    cornersDTO2 = this.cornersDTOAdapter.fromJson(reader);
                    if (cornersDTO2 == null) {
                        throw c.q("roundedCorners", "roundedCorners", reader);
                    }
                    textDTO = textDTO2;
                    iconDTO = iconDTO2;
                    paddingsDTO = paddingsDTO2;
                    atomActionDTO = atomActionDTO2;
                case 5:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("stickyRoundingColor", "stickyRoundingColor", reader);
                    }
                    textDTO = textDTO2;
                    iconDTO = iconDTO2;
                    paddingsDTO = paddingsDTO2;
                    atomActionDTO = atomActionDTO2;
                case 6:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    textDTO = textDTO2;
                    iconDTO = iconDTO2;
                    paddingsDTO = paddingsDTO2;
                    atomActionDTO = atomActionDTO2;
                case 7:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    textDTO = textDTO2;
                    iconDTO = iconDTO2;
                    paddingsDTO = paddingsDTO2;
                    atomActionDTO = atomActionDTO2;
                case 8:
                    iconButtonV3DTO = this.nullableIconButtonV3DTOAdapter.fromJson(reader);
                    textDTO = textDTO2;
                    iconDTO = iconDTO2;
                    paddingsDTO = paddingsDTO2;
                    atomActionDTO = atomActionDTO2;
                case 9:
                    bool2 = this.booleanAdapter.fromJson(reader);
                    if (bool2 == null) {
                        throw c.q("shouldSkipStickyAnimation", "shouldSkipStickyAnimation", reader);
                    }
                    textDTO = textDTO2;
                    iconDTO = iconDTO2;
                    paddingsDTO = paddingsDTO2;
                    atomActionDTO = atomActionDTO2;
                    i11 = -513;
                default:
                    textDTO = textDTO2;
                    iconDTO = iconDTO2;
                    paddingsDTO = paddingsDTO2;
                    atomActionDTO = atomActionDTO2;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, FakeSearchDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.textDTOAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("icon");
        this.iconDTOAdapter.mo44toJson(writer, (x) value.getIcon());
        writer.w("paddings");
        this.paddingsDTOAdapter.mo44toJson(writer, (x) value.getPaddings());
        writer.w("action");
        this.atomActionDTOAdapter.mo44toJson(writer, (x) value.getAction());
        writer.w("roundedCorners");
        this.cornersDTOAdapter.mo44toJson(writer, (x) value.getRoundedCorners());
        writer.w("stickyRoundingColor");
        this.stringAdapter.mo44toJson(writer, (x) value.getStickyRoundingColor());
        writer.w("tintColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getTintColor());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.w("rightIconButton");
        this.nullableIconButtonV3DTOAdapter.mo44toJson(writer, (x) value.getRightIconButton());
        writer.w("shouldSkipStickyAnimation");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.getShouldSkipStickyAnimation()));
        writer.p();
    }
}
