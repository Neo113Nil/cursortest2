package ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm;

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
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.ReviewFormData;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\"\u0010\u001b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R(\u0010\u001f\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R\u001e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/ReviewFormDataJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/ReviewFormData;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/ReviewFormData;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/ReviewFormData;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/ReviewFormData$CachedMedia;", "nullableListOfCachedMediaAdapter", "", "nullableBooleanAdapter", "", "nullableMapOfStringStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReviewFormDataJsonAdapter extends JsonAdapter<ReviewFormData> {
    public static final int $stable = 8;
    private volatile Constructor<ReviewFormData> constructorRef;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<List<ReviewFormData.CachedMedia>> nullableListOfCachedMediaAdapter;

    @NotNull
    private final JsonAdapter<Map<String, String>> nullableMapOfStringStringAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    public ReviewFormDataJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("rating", "medias", "comment", "anonymous", "questions", "variantId");
        M m11 = M.f71699a;
        this.nullableStringAdapter = moshi.f(String.class, m11, "rating");
        this.nullableListOfCachedMediaAdapter = moshi.f(D.e(List.class, ReviewFormData.CachedMedia.class), m11, "medias");
        this.nullableBooleanAdapter = moshi.f(Boolean.class, m11, "anonymous");
        this.nullableMapOfStringStringAdapter = moshi.f(D.e(Map.class, String.class, String.class), m11, "questions");
    }

    @NotNull
    public String toString() {
        return b.c(36, "GeneratedJsonAdapter(ReviewFormData)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ReviewFormData fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        String str = null;
        List<ReviewFormData.CachedMedia> list = null;
        String str2 = null;
        Boolean bool = null;
        Map<String, String> map = null;
        String str3 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    str = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -2;
                    break;
                case 1:
                    list = this.nullableListOfCachedMediaAdapter.fromJson(reader);
                    i11 &= -3;
                    break;
                case 2:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -5;
                    break;
                case 3:
                    bool = this.nullableBooleanAdapter.fromJson(reader);
                    i11 &= -9;
                    break;
                case 4:
                    map = this.nullableMapOfStringStringAdapter.fromJson(reader);
                    i11 &= -17;
                    break;
                case 5:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -33;
                    break;
            }
        }
        reader.endObject();
        if (i11 == -64) {
            String str4 = str3;
            Map<String, String> map2 = map;
            Boolean bool2 = bool;
            return new ReviewFormData(str, list, str2, bool2, map2, str4);
        }
        String str5 = str3;
        Map<String, String> map3 = map;
        Boolean bool3 = bool;
        String str6 = str2;
        List<ReviewFormData.CachedMedia> list2 = list;
        String str7 = str;
        Constructor<ReviewFormData> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = ReviewFormData.class.getDeclaredConstructor(String.class, List.class, String.class, Boolean.class, Map.class, String.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        ReviewFormData newInstance = constructor.newInstance(str7, list2, str6, bool3, map3, str5, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ReviewFormData value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("rating");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getRating());
        writer.w("medias");
        this.nullableListOfCachedMediaAdapter.mo44toJson(writer, (x) value.getMedias());
        writer.w("comment");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getComment());
        writer.w("anonymous");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.getAnonymous());
        writer.w("questions");
        this.nullableMapOfStringStringAdapter.mo44toJson(writer, (x) value.getQuestions());
        writer.w("variantId");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getVariantId());
        writer.p();
    }
}
