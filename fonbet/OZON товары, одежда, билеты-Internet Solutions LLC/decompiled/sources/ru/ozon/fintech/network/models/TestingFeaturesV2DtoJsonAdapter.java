package ru.ozon.fintech.network.models;

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

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R&\u0010\u001c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001b0\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/fintech/network/models/TestingFeaturesV2DtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/fintech/network/models/TestingFeaturesV2Dto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/fintech/network/models/TestingFeaturesV2Dto;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/fintech/network/models/TestingFeaturesV2Dto;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/fintech/network/models/TestingFeaturesV2DeleteDto;", "testingFeaturesV2DeleteDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "", "mapOfStringAnyAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "fintech-network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TestingFeaturesV2DtoJsonAdapter extends JsonAdapter<TestingFeaturesV2Dto> {
    private volatile Constructor<TestingFeaturesV2Dto> constructorRef;

    @NotNull
    private final JsonAdapter<Map<String, Object>> mapOfStringAnyAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<TestingFeaturesV2DeleteDto> testingFeaturesV2DeleteDtoAdapter;

    public TestingFeaturesV2DtoJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("delete", "edit");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<TestingFeaturesV2DeleteDto> f7 = moshi.f(TestingFeaturesV2DeleteDto.class, m11, "delete");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.testingFeaturesV2DeleteDtoAdapter = f7;
        JsonAdapter<Map<String, Object>> f11 = moshi.f(D.e(Map.class, String.class, Object.class), m11, "edit");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.mapOfStringAnyAdapter = f11;
    }

    @NotNull
    public String toString() {
        return Ak.b.c(42, "GeneratedJsonAdapter(TestingFeaturesV2Dto)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public TestingFeaturesV2Dto fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        TestingFeaturesV2DeleteDto testingFeaturesV2DeleteDto = null;
        Map<String, Object> map = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                testingFeaturesV2DeleteDto = this.testingFeaturesV2DeleteDtoAdapter.fromJson(reader);
                if (testingFeaturesV2DeleteDto == null) {
                    throw Y9.c.q("delete", "delete", reader);
                }
                i11 &= -2;
            } else if (v11 == 1) {
                map = this.mapOfStringAnyAdapter.fromJson(reader);
                if (map == null) {
                    throw Y9.c.q("edit", "edit", reader);
                }
                i11 &= -3;
            } else {
                continue;
            }
        }
        reader.endObject();
        if (i11 == -4) {
            Intrinsics.g(testingFeaturesV2DeleteDto, "null cannot be cast to non-null type ru.ozon.fintech.network.models.TestingFeaturesV2DeleteDto");
            Intrinsics.g(map, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
            return new TestingFeaturesV2Dto(testingFeaturesV2DeleteDto, map);
        }
        Constructor<TestingFeaturesV2Dto> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = TestingFeaturesV2Dto.class.getDeclaredConstructor(TestingFeaturesV2DeleteDto.class, Map.class, Integer.TYPE, Y9.c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        TestingFeaturesV2Dto newInstance = constructor.newInstance(testingFeaturesV2DeleteDto, map, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, TestingFeaturesV2Dto value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("delete");
        this.testingFeaturesV2DeleteDtoAdapter.mo44toJson(writer, (x) value_.getDelete());
        writer.w("edit");
        this.mapOfStringAnyAdapter.mo44toJson(writer, (x) value_.getEdit());
        writer.p();
    }
}
