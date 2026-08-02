package ru.ozon.app.android.returns.list.data.dto;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.common.data.dto.ReturnStatusDto;
import ru.ozon.app.android.returns.common.data.dto.ReturnTotalDto;
import ru.ozon.app.android.returns.list.data.dto.ReturnPreviewDto;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019¨\u0006%"}, d2 = {"Lru/ozon/app/android/returns/list/data/dto/ReturnPreviewDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/returns/list/data/dto/ReturnPreviewDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/returns/list/data/dto/ReturnPreviewDto;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/returns/list/data/dto/ReturnPreviewDto;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/returns/list/data/dto/ReturnPreviewDto$Header;", "headerAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/returns/common/data/dto/ReturnStatusDto;", "returnStatusDtoAdapter", "Lru/ozon/app/android/returns/common/data/dto/ReturnTotalDto;", "returnTotalDtoAdapter", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "nullableButtonV3DTOAdapter", "nullableStringAdapter", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "nullableCommonControlSettingsAdapter", "", "intAdapter", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnPreviewDtoJsonAdapter extends JsonAdapter<ReturnPreviewDto> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<ReturnPreviewDto.Header> headerAdapter;

    @NotNull
    private final JsonAdapter<Integer> intAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3DTO> nullableButtonV3DTOAdapter;

    @NotNull
    private final JsonAdapter<CommonControlSettings> nullableCommonControlSettingsAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<ReturnStatusDto> returnStatusDtoAdapter;

    @NotNull
    private final JsonAdapter<ReturnTotalDto> returnTotalDtoAdapter;

    public ReturnPreviewDtoJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(CommentV3DTO.HEADER_FIELD_NAME, "status", "total", "action", "backgroundColor", "common", "index");
        M m11 = M.f71699a;
        this.headerAdapter = moshi.f(ReturnPreviewDto.Header.class, m11, CommentV3DTO.HEADER_FIELD_NAME);
        this.returnStatusDtoAdapter = moshi.f(ReturnStatusDto.class, m11, "status");
        this.returnTotalDtoAdapter = moshi.f(ReturnTotalDto.class, m11, "total");
        this.nullableButtonV3DTOAdapter = moshi.f(ButtonV3DTO.class, m11, "action");
        this.nullableStringAdapter = moshi.f(String.class, m11, "backgroundColor");
        this.nullableCommonControlSettingsAdapter = moshi.f(CommonControlSettings.class, m11, "common");
        this.intAdapter = moshi.f(Integer.TYPE, m11, "index");
    }

    @NotNull
    public String toString() {
        return b.c(38, "GeneratedJsonAdapter(ReturnPreviewDto)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ReturnPreviewDto fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Integer num = null;
        ReturnPreviewDto.Header header = null;
        ReturnStatusDto returnStatusDto = null;
        ReturnTotalDto returnTotalDto = null;
        ButtonV3DTO buttonV3DTO = null;
        String str = null;
        CommonControlSettings commonControlSettings = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    header = this.headerAdapter.fromJson(reader);
                    if (header == null) {
                        throw c.q("header_", CommentV3DTO.HEADER_FIELD_NAME, reader);
                    }
                    break;
                case 1:
                    returnStatusDto = this.returnStatusDtoAdapter.fromJson(reader);
                    if (returnStatusDto == null) {
                        throw c.q("status", "status", reader);
                    }
                    break;
                case 2:
                    returnTotalDto = this.returnTotalDtoAdapter.fromJson(reader);
                    if (returnTotalDto == null) {
                        throw c.q("total", "total", reader);
                    }
                    break;
                case 3:
                    buttonV3DTO = this.nullableButtonV3DTOAdapter.fromJson(reader);
                    break;
                case 4:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 5:
                    commonControlSettings = this.nullableCommonControlSettingsAdapter.fromJson(reader);
                    break;
                case 6:
                    num = this.intAdapter.fromJson(reader);
                    if (num == null) {
                        throw c.q("index", "index", reader);
                    }
                    break;
            }
        }
        reader.endObject();
        if (header == null) {
            throw c.j("header_", CommentV3DTO.HEADER_FIELD_NAME, reader);
        }
        if (returnStatusDto == null) {
            throw c.j("status", "status", reader);
        }
        if (returnTotalDto == null) {
            throw c.j("total", "total", reader);
        }
        ReturnPreviewDto returnPreviewDto = new ReturnPreviewDto(header, returnStatusDto, returnTotalDto, buttonV3DTO, str, commonControlSettings);
        returnPreviewDto.setIndex(num != null ? num.intValue() : returnPreviewDto.getIndex());
        return returnPreviewDto;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ReturnPreviewDto value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(CommentV3DTO.HEADER_FIELD_NAME);
        this.headerAdapter.mo44toJson(writer, (x) value.getHeader());
        writer.w("status");
        this.returnStatusDtoAdapter.mo44toJson(writer, (x) value.getStatus());
        writer.w("total");
        this.returnTotalDtoAdapter.mo44toJson(writer, (x) value.getTotal());
        writer.w("action");
        this.nullableButtonV3DTOAdapter.mo44toJson(writer, (x) value.getAction());
        writer.w("backgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBackgroundColor());
        writer.w("common");
        this.nullableCommonControlSettingsAdapter.mo44toJson(writer, (x) value.getCommon());
        writer.w("index");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getIndex()));
        writer.p();
    }
}
