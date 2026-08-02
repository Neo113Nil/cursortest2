package ru.ozon.app.android.atoms.data.rating;

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
import ru.ozon.app.android.atoms.data.rating.Rating;
import ru.ozon.uni.atoms.data.TestInfo;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R(\u0010\u001d\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0018R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0018R\u001e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/ozon/app/android/atoms/data/rating/RatingJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/atoms/data/rating/Rating;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/atoms/data/rating/Rating;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/atoms/data/rating/Rating;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/TestInfo;", "nullableTestInfoAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "", "floatAdapter", "", "nullableIntAdapter", "Lru/ozon/app/android/atoms/data/rating/Rating$ReviewsCountType;", "reviewsCountTypeAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class RatingJsonAdapter extends JsonAdapter<Rating> {
    private volatile Constructor<Rating> constructorRef;

    @NotNull
    private final JsonAdapter<Float> floatAdapter;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<TestInfo> nullableTestInfoAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<Rating.ReviewsCountType> reviewsCountTypeAdapter;

    public RatingJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("context", "testInfo", "trackingInfo", "rating", "reviewsCount", "reviewsCountType");
        M m11 = M.f71699a;
        this.nullableStringAdapter = moshi.f(String.class, m11, "context");
        this.nullableTestInfoAdapter = moshi.f(TestInfo.class, m11, "testInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
        this.floatAdapter = moshi.f(Float.TYPE, m11, "rating");
        this.nullableIntAdapter = moshi.f(Integer.class, m11, "reviewsCount");
        this.reviewsCountTypeAdapter = moshi.f(Rating.ReviewsCountType.class, m11, "reviewsCountType");
    }

    @NotNull
    public String toString() {
        return b.c(28, "GeneratedJsonAdapter(Rating)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public Rating fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        String str = null;
        TestInfo testInfo = null;
        Map<String, TokenizedTrackingInfo> map = null;
        Float f7 = null;
        Integer num = null;
        Rating.ReviewsCountType reviewsCountType = null;
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
                    testInfo = this.nullableTestInfoAdapter.fromJson(reader);
                    i11 &= -3;
                    break;
                case 2:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    i11 &= -5;
                    break;
                case 3:
                    f7 = this.floatAdapter.fromJson(reader);
                    if (f7 == null) {
                        throw c.q("rating", "rating", reader);
                    }
                    break;
                case 4:
                    num = this.nullableIntAdapter.fromJson(reader);
                    i11 &= -17;
                    break;
                case 5:
                    reviewsCountType = this.reviewsCountTypeAdapter.fromJson(reader);
                    if (reviewsCountType == null) {
                        throw c.q("reviewsCountType", "reviewsCountType", reader);
                    }
                    i11 &= -33;
                    break;
            }
        }
        reader.endObject();
        if (i11 == -56) {
            Float f11 = f7;
            Map<String, TokenizedTrackingInfo> map2 = map;
            TestInfo testInfo2 = testInfo;
            String str2 = str;
            if (f11 == null) {
                throw c.j("rating", "rating", reader);
            }
            Integer num2 = num;
            float floatValue = f11.floatValue();
            Intrinsics.g(reviewsCountType, "null cannot be cast to non-null type ru.ozon.app.android.atoms.data.rating.Rating.ReviewsCountType");
            return new Rating(str2, testInfo2, map2, floatValue, num2, reviewsCountType);
        }
        Float f12 = f7;
        Map<String, TokenizedTrackingInfo> map3 = map;
        TestInfo testInfo3 = testInfo;
        String str3 = str;
        Constructor<Rating> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = Rating.class.getDeclaredConstructor(String.class, TestInfo.class, Map.class, Float.TYPE, Integer.class, Rating.ReviewsCountType.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        Constructor<Rating> constructor2 = constructor;
        if (f12 == null) {
            throw c.j("rating", "rating", reader);
        }
        Rating newInstance = constructor2.newInstance(str3, testInfo3, map3, f12, num, reviewsCountType, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, Rating value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("context");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getContext());
        writer.w("testInfo");
        this.nullableTestInfoAdapter.mo44toJson(writer, (x) value.getTestInfo());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.w("rating");
        this.floatAdapter.mo44toJson(writer, (x) Float.valueOf(value.getRating()));
        writer.w("reviewsCount");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getReviewsCount());
        writer.w("reviewsCountType");
        this.reviewsCountTypeAdapter.mo44toJson(writer, (x) value.getReviewsCountType());
        writer.p();
    }
}
