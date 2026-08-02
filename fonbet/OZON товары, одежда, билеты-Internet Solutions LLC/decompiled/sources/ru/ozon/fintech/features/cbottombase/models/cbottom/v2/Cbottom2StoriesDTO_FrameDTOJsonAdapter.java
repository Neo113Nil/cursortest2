package ru.ozon.fintech.features.cbottombase.models.cbottom.v2;

import Ak.b;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.cbottombase.models.cbottom.v2.Cbottom2StoriesDTO;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\"\u0010\u001f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018¨\u0006 "}, d2 = {"Lru/ozon/fintech/features/cbottombase/models/cbottom/v2/Cbottom2StoriesDTO_FrameDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/fintech/features/cbottombase/models/cbottom/v2/Cbottom2StoriesDTO$FrameDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/fintech/features/cbottombase/models/cbottom/v2/Cbottom2StoriesDTO$FrameDTO;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/fintech/features/cbottombase/models/cbottom/v2/Cbottom2StoriesDTO$FrameDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableLongAdapter", "", "nullableBooleanAdapter", "", "LF40/a;", "nullableListOfCbottomWidget2DTOAdapter", "cbottom-base_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Cbottom2StoriesDTO_FrameDTOJsonAdapter extends JsonAdapter<Cbottom2StoriesDTO.FrameDTO> {

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<List<F40.a>> nullableListOfCbottomWidget2DTOAdapter;

    @NotNull
    private final JsonAdapter<Long> nullableLongAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    public Cbottom2StoriesDTO_FrameDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("id", "videoUrl", "imageUrl", "background", "duration", "autoplay", "topWidgets", "bottomWidgets", "centerWidgets");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<String> f7 = moshi.f(String.class, m11, "id");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.nullableStringAdapter = f7;
        JsonAdapter<Long> f11 = moshi.f(Long.class, m11, "duration");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableLongAdapter = f11;
        JsonAdapter<Boolean> f12 = moshi.f(Boolean.class, m11, "autoplay");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableBooleanAdapter = f12;
        JsonAdapter<List<F40.a>> f13 = moshi.f(D.e(List.class, F40.a.class), m11, "topWidgets");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableListOfCbottomWidget2DTOAdapter = f13;
    }

    @NotNull
    public String toString() {
        return b.c(49, "GeneratedJsonAdapter(Cbottom2StoriesDTO.FrameDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public Cbottom2StoriesDTO.FrameDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Long l11 = null;
        Boolean bool = null;
        List<F40.a> list = null;
        List<F40.a> list2 = null;
        List<F40.a> list3 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 1:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 2:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 3:
                    str4 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 4:
                    l11 = this.nullableLongAdapter.fromJson(reader);
                    break;
                case 5:
                    bool = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 6:
                    list = this.nullableListOfCbottomWidget2DTOAdapter.fromJson(reader);
                    break;
                case 7:
                    list2 = this.nullableListOfCbottomWidget2DTOAdapter.fromJson(reader);
                    break;
                case 8:
                    list3 = this.nullableListOfCbottomWidget2DTOAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        return new Cbottom2StoriesDTO.FrameDTO(str, str2, str3, str4, l11, bool, list, list2, list3);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, Cbottom2StoriesDTO.FrameDTO value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("id");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getId());
        writer.w("videoUrl");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getVideoUrl());
        writer.w("imageUrl");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getImageUrl());
        writer.w("background");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getBackground());
        writer.w("duration");
        this.nullableLongAdapter.mo44toJson(writer, (x) value_.getDuration());
        writer.w("autoplay");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.getAutoplay());
        writer.w("topWidgets");
        this.nullableListOfCbottomWidget2DTOAdapter.mo44toJson(writer, (x) value_.getTopWidgets());
        writer.w("bottomWidgets");
        this.nullableListOfCbottomWidget2DTOAdapter.mo44toJson(writer, (x) value_.getBottomWidgets());
        writer.w("centerWidgets");
        this.nullableListOfCbottomWidget2DTOAdapter.mo44toJson(writer, (x) value_.getCenterWidgets());
        writer.p();
    }
}
