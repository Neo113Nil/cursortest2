package ru.ozon.cdn.chooser.internal.data.dto;

import Y9.b;
import Y9.c;
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
import ru.ozon.cdn.chooser.internal.data.dto.CdnConfigResponse;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\"\u0010\u001e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001aR\u001e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/cdn/chooser/internal/data/dto/CdnConfigResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/cdn/chooser/internal/data/dto/CdnConfigResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/cdn/chooser/internal/data/dto/CdnConfigResponse;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/cdn/chooser/internal/data/dto/CdnConfigResponse;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "Lru/ozon/cdn/chooser/internal/data/dto/CdnConfigResponse$ImageRuleDto;", "listOfImageRuleDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/cdn/chooser/internal/data/dto/CdnConfigResponse$VideoRuleDto;", "listOfVideoRuleDtoAdapter", "Lru/ozon/cdn/chooser/internal/data/dto/CdnConfigResponse$ImageWarmUpDataDto;", "nullableListOfImageWarmUpDataDtoAdapter", "Lru/ozon/cdn/chooser/internal/data/dto/CdnConfigResponse$PopsConfigDto;", "nullablePopsConfigDtoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "cdn-chooser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CdnConfigResponseJsonAdapter extends JsonAdapter<CdnConfigResponse> {
    private volatile Constructor<CdnConfigResponse> constructorRef;

    @NotNull
    private final JsonAdapter<List<CdnConfigResponse.ImageRuleDto>> listOfImageRuleDtoAdapter;

    @NotNull
    private final JsonAdapter<List<CdnConfigResponse.VideoRuleDto>> listOfVideoRuleDtoAdapter;

    @NotNull
    private final JsonAdapter<List<CdnConfigResponse.ImageWarmUpDataDto>> nullableListOfImageWarmUpDataDtoAdapter;

    @NotNull
    private final JsonAdapter<CdnConfigResponse.PopsConfigDto> nullablePopsConfigDtoAdapter;

    @NotNull
    private final n.a options;

    public CdnConfigResponseJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("imageRules", "videoRules", "imageWarmupList", "popStatsConfig");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        b e11 = D.e(List.class, CdnConfigResponse.ImageRuleDto.class);
        M m11 = M.f71699a;
        JsonAdapter<List<CdnConfigResponse.ImageRuleDto>> f7 = moshi.f(e11, m11, "imageRules");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.listOfImageRuleDtoAdapter = f7;
        JsonAdapter<List<CdnConfigResponse.VideoRuleDto>> f11 = moshi.f(D.e(List.class, CdnConfigResponse.VideoRuleDto.class), m11, "videoRules");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.listOfVideoRuleDtoAdapter = f11;
        JsonAdapter<List<CdnConfigResponse.ImageWarmUpDataDto>> f12 = moshi.f(D.e(List.class, CdnConfigResponse.ImageWarmUpDataDto.class), m11, "imageWarmupList");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableListOfImageWarmUpDataDtoAdapter = f12;
        JsonAdapter<CdnConfigResponse.PopsConfigDto> f13 = moshi.f(CdnConfigResponse.PopsConfigDto.class, m11, "popStatsConfig");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullablePopsConfigDtoAdapter = f13;
    }

    @NotNull
    public String toString() {
        return Ak.b.c(39, "GeneratedJsonAdapter(CdnConfigResponse)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public CdnConfigResponse fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        List<CdnConfigResponse.ImageRuleDto> list = null;
        List<CdnConfigResponse.VideoRuleDto> list2 = null;
        List<CdnConfigResponse.ImageWarmUpDataDto> list3 = null;
        CdnConfigResponse.PopsConfigDto popsConfigDto = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                list = this.listOfImageRuleDtoAdapter.fromJson(reader);
                if (list == null) {
                    throw c.q("imageRules", "imageRules", reader);
                }
            } else if (v11 == 1) {
                list2 = this.listOfVideoRuleDtoAdapter.fromJson(reader);
                if (list2 == null) {
                    throw c.q("videoRules", "videoRules", reader);
                }
            } else if (v11 == 2) {
                list3 = this.nullableListOfImageWarmUpDataDtoAdapter.fromJson(reader);
            } else if (v11 == 3) {
                popsConfigDto = this.nullablePopsConfigDtoAdapter.fromJson(reader);
                i11 = -9;
            }
        }
        reader.endObject();
        if (i11 == -9) {
            if (list == null) {
                throw c.j("imageRules", "imageRules", reader);
            }
            if (list2 != null) {
                return new CdnConfigResponse(list, list2, list3, popsConfigDto);
            }
            throw c.j("videoRules", "videoRules", reader);
        }
        Constructor<CdnConfigResponse> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = CdnConfigResponse.class.getDeclaredConstructor(List.class, List.class, List.class, CdnConfigResponse.PopsConfigDto.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (list == null) {
            throw c.j("imageRules", "imageRules", reader);
        }
        if (list2 == null) {
            throw c.j("videoRules", "videoRules", reader);
        }
        CdnConfigResponse newInstance = constructor.newInstance(list, list2, list3, popsConfigDto, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, CdnConfigResponse value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("imageRules");
        this.listOfImageRuleDtoAdapter.mo44toJson(writer, (x) value_.getImageRules());
        writer.w("videoRules");
        this.listOfVideoRuleDtoAdapter.mo44toJson(writer, (x) value_.getVideoRules());
        writer.w("imageWarmupList");
        this.nullableListOfImageWarmUpDataDtoAdapter.mo44toJson(writer, (x) value_.getImageWarmupList());
        writer.w("popStatsConfig");
        this.nullablePopsConfigDtoAdapter.mo44toJson(writer, (x) value_.getPopStatsConfig());
        writer.p();
    }
}
