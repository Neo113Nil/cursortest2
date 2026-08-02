package ru.ozon.app.android.storefront.stories.story.data;

import Y9.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R(\u0010\u0019\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001aR\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001aR\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001aR\"\u0010$\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020#\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u001a¨\u0006%"}, d2 = {"Lru/ozon/app/android/storefront/stories/story/data/StoryQuestionJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/storefront/stories/story/data/StoryQuestion;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/storefront/stories/story/data/StoryQuestion;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/storefront/stories/story/data/StoryQuestion;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "Lru/ozon/app/android/storefront/stories/story/data/StoryWithImage;", "nullableStoryWithImageAdapter", "Lru/ozon/app/android/storefront/stories/story/data/StoryText;", "nullableStoryTextAdapter", "Lru/ozon/app/android/storefront/stories/story/data/Direction;", "nullableDirectionAdapter", "", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "nullableListOfLargeButtonAdapter", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class StoryQuestionJsonAdapter extends JsonAdapter<StoryQuestion> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<Direction> nullableDirectionAdapter;

    @NotNull
    private final JsonAdapter<List<ButtonV3Atom.LargeButton>> nullableListOfLargeButtonAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<StoryText> nullableStoryTextAdapter;

    @NotNull
    private final JsonAdapter<StoryWithImage> nullableStoryWithImageAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    public StoryQuestionJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("trackingInfo", "backgroundColor", "image", "tagTitle", "text", "direction", "answers", "buttons", "next");
        b e11 = D.e(Map.class, String.class, TokenizedTrackingInfo.class);
        M m11 = M.f71699a;
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(e11, m11, "trackingInfo");
        this.nullableStringAdapter = moshi.f(String.class, m11, "backgroundColor");
        this.nullableStoryWithImageAdapter = moshi.f(StoryWithImage.class, m11, "image");
        this.nullableStoryTextAdapter = moshi.f(StoryText.class, m11, "text");
        this.nullableDirectionAdapter = moshi.f(Direction.class, m11, "direction");
        this.nullableListOfLargeButtonAdapter = moshi.f(D.e(List.class, ButtonV3Atom.LargeButton.class), m11, "answers");
    }

    @NotNull
    public String toString() {
        return Ak.b.c(35, "GeneratedJsonAdapter(StoryQuestion)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public StoryQuestion fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Map<String, TokenizedTrackingInfo> map = null;
        String str = null;
        StoryWithImage storyWithImage = null;
        String str2 = null;
        StoryText storyText = null;
        Direction direction = null;
        List<ButtonV3Atom.LargeButton> list = null;
        List<ButtonV3Atom.LargeButton> list2 = null;
        String str3 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
                case 1:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 2:
                    storyWithImage = this.nullableStoryWithImageAdapter.fromJson(reader);
                    break;
                case 3:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 4:
                    storyText = this.nullableStoryTextAdapter.fromJson(reader);
                    break;
                case 5:
                    direction = this.nullableDirectionAdapter.fromJson(reader);
                    break;
                case 6:
                    list = this.nullableListOfLargeButtonAdapter.fromJson(reader);
                    break;
                case 7:
                    list2 = this.nullableListOfLargeButtonAdapter.fromJson(reader);
                    break;
                case 8:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        return new StoryQuestion(map, str, storyWithImage, str2, storyText, direction, list, list2, str3);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, StoryQuestion value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.w("backgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBackgroundColor());
        writer.w("image");
        this.nullableStoryWithImageAdapter.mo44toJson(writer, (x) value.getImage());
        writer.w("tagTitle");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getTagTitle());
        writer.w("text");
        this.nullableStoryTextAdapter.mo44toJson(writer, (x) value.getText());
        writer.w("direction");
        this.nullableDirectionAdapter.mo44toJson(writer, (x) value.getDirection());
        writer.w("answers");
        this.nullableListOfLargeButtonAdapter.mo44toJson(writer, (x) value.getAnswers());
        writer.w("buttons");
        this.nullableListOfLargeButtonAdapter.mo44toJson(writer, (x) value.getButtons());
        writer.w("next");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getNext());
        writer.p();
    }
}
