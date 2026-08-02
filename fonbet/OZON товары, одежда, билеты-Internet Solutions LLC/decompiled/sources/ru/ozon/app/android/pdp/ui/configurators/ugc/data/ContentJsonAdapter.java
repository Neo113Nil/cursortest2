package ru.ozon.app.android.pdp.ui.configurators.ugc.data;

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
import ru.ozon.app.android.pdp.ui.configurators.ugc.data.Content;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\"\u0010\u001d\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\"\u0010\u001f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R(\u0010\"\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020!\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0018R\u001e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/data/ContentJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/data/Content;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/pdp/ui/configurators/ugc/data/Content;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/pdp/ui/configurators/ugc/data/Content;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableIntAdapter", "", "Lru/ozon/app/android/pdp/ui/configurators/ugc/data/Content$Photo;", "nullableListOfPhotoAdapter", "Lru/ozon/app/android/pdp/ui/configurators/ugc/data/Content$Video;", "nullableListOfVideoAdapter", "", "", "nullableMapOfStringAnyAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ContentJsonAdapter extends JsonAdapter<Content> {
    public static final int $stable = 8;
    private volatile Constructor<Content> constructorRef;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<List<Content.Photo>> nullableListOfPhotoAdapter;

    @NotNull
    private final JsonAdapter<List<Content.Video>> nullableListOfVideoAdapter;

    @NotNull
    private final JsonAdapter<Map<String, Object>> nullableMapOfStringAnyAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    public ContentJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("comment", "negative", "positive", "score", "photos", "videos", "context_questions_answers", "picker_values");
        M m11 = M.f71699a;
        this.nullableStringAdapter = moshi.f(String.class, m11, "comment");
        this.nullableIntAdapter = moshi.f(Integer.class, m11, "score");
        this.nullableListOfPhotoAdapter = moshi.f(D.e(List.class, Content.Photo.class), m11, "photos");
        this.nullableListOfVideoAdapter = moshi.f(D.e(List.class, Content.Video.class), m11, "videos");
        this.nullableMapOfStringAnyAdapter = moshi.f(D.e(Map.class, String.class, Object.class), m11, "contextQuestionsAnswers");
    }

    @NotNull
    public String toString() {
        return b.c(29, "GeneratedJsonAdapter(Content)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public Content fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        Integer num = null;
        List<Content.Photo> list = null;
        List<Content.Video> list2 = null;
        Map<String, Object> map = null;
        Map<String, Object> map2 = null;
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
                    num = this.nullableIntAdapter.fromJson(reader);
                    break;
                case 4:
                    list = this.nullableListOfPhotoAdapter.fromJson(reader);
                    break;
                case 5:
                    list2 = this.nullableListOfVideoAdapter.fromJson(reader);
                    break;
                case 6:
                    map = this.nullableMapOfStringAnyAdapter.fromJson(reader);
                    break;
                case 7:
                    map2 = this.nullableMapOfStringAnyAdapter.fromJson(reader);
                    i11 = -129;
                    break;
            }
        }
        reader.endObject();
        if (i11 == -129) {
            Map<String, Object> map3 = map2;
            Map<String, Object> map4 = map;
            List<Content.Video> list3 = list2;
            List<Content.Photo> list4 = list;
            Integer num2 = num;
            return new Content(str, str2, str3, num2, list4, list3, map4, map3);
        }
        Map<String, Object> map5 = map2;
        Map<String, Object> map6 = map;
        List<Content.Video> list5 = list2;
        List<Content.Photo> list6 = list;
        Integer num3 = num;
        String str4 = str3;
        String str5 = str2;
        String str6 = str;
        Constructor<Content> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = Content.class.getDeclaredConstructor(String.class, String.class, String.class, Integer.class, List.class, List.class, Map.class, Map.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        Content newInstance = constructor.newInstance(str6, str5, str4, num3, list6, list5, map6, map5, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, Content value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("comment");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getComment());
        writer.w("negative");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getNegative());
        writer.w("positive");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getPositive());
        writer.w("score");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getScore());
        writer.w("photos");
        this.nullableListOfPhotoAdapter.mo44toJson(writer, (x) value.getPhotos());
        writer.w("videos");
        this.nullableListOfVideoAdapter.mo44toJson(writer, (x) value.getVideos());
        writer.w("context_questions_answers");
        this.nullableMapOfStringAnyAdapter.mo44toJson(writer, (x) value.getContextQuestionsAnswers());
        writer.w("picker_values");
        this.nullableMapOfStringAnyAdapter.mo44toJson(writer, (x) value.getPickerValues());
        writer.p();
    }
}
