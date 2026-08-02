package ru.ozon.app.android.travel.feature.avia.widgets.directFlightsDropdown.v1.data;

import Ak.b;
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
import ru.ozon.app.android.travel.feature.avia.widgets.directFlightsDropdown.v1.data.DirectFlightsDropdownDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/directFlightsDropdown/v1/data/DirectFlightsDropdownDTO_ItemDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/avia/widgets/directFlightsDropdown/v1/data/DirectFlightsDropdownDTO$ItemDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/avia/widgets/directFlightsDropdown/v1/data/DirectFlightsDropdownDTO$ItemDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/avia/widgets/directFlightsDropdown/v1/data/DirectFlightsDropdownDTO$ItemDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/travel/feature/avia/widgets/directFlightsDropdown/v1/data/DirectFlightsDropdownDTO$HeaderDTO;", "headerDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "listOfTextDTOAdapter", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "commonControlSettingsAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DirectFlightsDropdownDTO_ItemDTOJsonAdapter extends JsonAdapter<DirectFlightsDropdownDTO.ItemDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<CommonControlSettings> commonControlSettingsAdapter;
    private volatile Constructor<DirectFlightsDropdownDTO.ItemDTO> constructorRef;

    @NotNull
    private final JsonAdapter<DirectFlightsDropdownDTO.HeaderDTO> headerDTOAdapter;

    @NotNull
    private final JsonAdapter<List<TextDTO>> listOfTextDTOAdapter;

    @NotNull
    private final n.a options;

    public DirectFlightsDropdownDTO_ItemDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(CommentV3DTO.HEADER_FIELD_NAME, "textItems", "common");
        M m11 = M.f71699a;
        this.headerDTOAdapter = moshi.f(DirectFlightsDropdownDTO.HeaderDTO.class, m11, CommentV3DTO.HEADER_FIELD_NAME);
        this.listOfTextDTOAdapter = moshi.f(D.e(List.class, TextDTO.class), m11, "textItems");
        this.commonControlSettingsAdapter = moshi.f(CommonControlSettings.class, m11, "common");
    }

    @NotNull
    public String toString() {
        return b.c(54, "GeneratedJsonAdapter(DirectFlightsDropdownDTO.ItemDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public DirectFlightsDropdownDTO.ItemDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        DirectFlightsDropdownDTO.HeaderDTO headerDTO = null;
        List<TextDTO> list = null;
        CommonControlSettings commonControlSettings = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                headerDTO = this.headerDTOAdapter.fromJson(reader);
                if (headerDTO == null) {
                    throw c.q("header_", CommentV3DTO.HEADER_FIELD_NAME, reader);
                }
            } else if (v11 == 1) {
                list = this.listOfTextDTOAdapter.fromJson(reader);
                if (list == null) {
                    throw c.q("textItems", "textItems", reader);
                }
                i11 = -3;
            } else if (v11 == 2 && (commonControlSettings = this.commonControlSettingsAdapter.fromJson(reader)) == null) {
                throw c.q("common", "common", reader);
            }
        }
        reader.endObject();
        if (i11 == -3) {
            if (headerDTO == null) {
                throw c.j("header_", CommentV3DTO.HEADER_FIELD_NAME, reader);
            }
            Intrinsics.g(list, "null cannot be cast to non-null type kotlin.collections.List<ru.ozon.uni.atoms.data.text.TextDTO>");
            if (commonControlSettings != null) {
                return new DirectFlightsDropdownDTO.ItemDTO(headerDTO, list, commonControlSettings);
            }
            throw c.j("common", "common", reader);
        }
        Constructor<DirectFlightsDropdownDTO.ItemDTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = DirectFlightsDropdownDTO.ItemDTO.class.getDeclaredConstructor(DirectFlightsDropdownDTO.HeaderDTO.class, List.class, CommonControlSettings.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (headerDTO == null) {
            throw c.j("header_", CommentV3DTO.HEADER_FIELD_NAME, reader);
        }
        if (commonControlSettings == null) {
            throw c.j("common", "common", reader);
        }
        DirectFlightsDropdownDTO.ItemDTO newInstance = constructor.newInstance(headerDTO, list, commonControlSettings, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, DirectFlightsDropdownDTO.ItemDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(CommentV3DTO.HEADER_FIELD_NAME);
        this.headerDTOAdapter.mo44toJson(writer, (x) value.getHeader());
        writer.w("textItems");
        this.listOfTextDTOAdapter.mo44toJson(writer, (x) value.getTextItems());
        writer.w("common");
        this.commonControlSettingsAdapter.mo44toJson(writer, (x) value.getCommon());
        writer.p();
    }
}
