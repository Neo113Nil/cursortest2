package ru.ozon.app.android.storefront.stories.story.data;

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
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R(\u0010\u001c\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019R\u001e\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lru/ozon/app/android/storefront/stories/story/data/StoryItemJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/storefront/stories/story/data/StoryItem;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/storefront/stories/story/data/StoryItem;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/storefront/stories/story/data/StoryItem;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "nullableAtomActionDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "nullableStringAdapter", "Lru/ozon/app/android/storefront/stories/story/data/StoryItemAsset;", "storyItemAssetAdapter", "Lru/ozon/app/android/storefront/stories/story/data/StoryText;", "nullableStoryTextAdapter", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "nullableLargeButtonAdapter", "Lru/ozon/app/android/storefront/stories/story/data/StorySoundControlDTO;", "nullableStorySoundControlDTOAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class StoryItemJsonAdapter extends JsonAdapter<StoryItem> {
    public static final int $stable = 8;
    private volatile Constructor<StoryItem> constructorRef;

    @NotNull
    private final JsonAdapter<AtomActionDTO> nullableAtomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3Atom.LargeButton> nullableLargeButtonAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<StorySoundControlDTO> nullableStorySoundControlDTOAdapter;

    @NotNull
    private final JsonAdapter<StoryText> nullableStoryTextAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<StoryItemAsset> storyItemAssetAdapter;

    public StoryItemJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("action", "trackingInfo", "backgroundColor", "asset", "tagTitle", "text", "button", "soundControl");
        M m11 = M.f71699a;
        this.nullableAtomActionDTOAdapter = moshi.f(AtomActionDTO.class, m11, "action");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
        this.nullableStringAdapter = moshi.f(String.class, m11, "backgroundColor");
        this.storyItemAssetAdapter = moshi.f(StoryItemAsset.class, m11, "asset");
        this.nullableStoryTextAdapter = moshi.f(StoryText.class, m11, "text");
        this.nullableLargeButtonAdapter = moshi.f(ButtonV3Atom.LargeButton.class, m11, "button");
        this.nullableStorySoundControlDTOAdapter = moshi.f(StorySoundControlDTO.class, m11, "soundControl");
    }

    @NotNull
    public String toString() {
        return b.c(31, "GeneratedJsonAdapter(StoryItem)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public StoryItem fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        AtomActionDTO atomActionDTO = null;
        Map<String, TokenizedTrackingInfo> map = null;
        String str = null;
        StoryItemAsset storyItemAsset = null;
        String str2 = null;
        StoryText storyText = null;
        ButtonV3Atom.LargeButton largeButton = null;
        StorySoundControlDTO storySoundControlDTO = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    atomActionDTO = this.nullableAtomActionDTOAdapter.fromJson(reader);
                    break;
                case 1:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
                case 2:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 3:
                    storyItemAsset = this.storyItemAssetAdapter.fromJson(reader);
                    if (storyItemAsset == null) {
                        throw c.q("asset", "asset", reader);
                    }
                    break;
                case 4:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 5:
                    storyText = this.nullableStoryTextAdapter.fromJson(reader);
                    break;
                case 6:
                    largeButton = this.nullableLargeButtonAdapter.fromJson(reader);
                    break;
                case 7:
                    storySoundControlDTO = this.nullableStorySoundControlDTOAdapter.fromJson(reader);
                    i11 = -129;
                    break;
            }
        }
        reader.endObject();
        if (i11 == -129) {
            StorySoundControlDTO storySoundControlDTO2 = storySoundControlDTO;
            ButtonV3Atom.LargeButton largeButton2 = largeButton;
            StoryText storyText2 = storyText;
            String str3 = str2;
            StoryItemAsset storyItemAsset2 = storyItemAsset;
            String str4 = str;
            Map<String, TokenizedTrackingInfo> map2 = map;
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            if (storyItemAsset2 != null) {
                return new StoryItem(atomActionDTO2, map2, str4, storyItemAsset2, str3, storyText2, largeButton2, storySoundControlDTO2);
            }
            throw c.j("asset", "asset", reader);
        }
        StorySoundControlDTO storySoundControlDTO3 = storySoundControlDTO;
        ButtonV3Atom.LargeButton largeButton3 = largeButton;
        StoryText storyText3 = storyText;
        String str5 = str2;
        StoryItemAsset storyItemAsset3 = storyItemAsset;
        String str6 = str;
        Map<String, TokenizedTrackingInfo> map3 = map;
        AtomActionDTO atomActionDTO3 = atomActionDTO;
        Constructor<StoryItem> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = StoryItem.class.getDeclaredConstructor(AtomActionDTO.class, Map.class, String.class, StoryItemAsset.class, String.class, StoryText.class, ButtonV3Atom.LargeButton.class, StorySoundControlDTO.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (storyItemAsset3 == null) {
            throw c.j("asset", "asset", reader);
        }
        StoryItem newInstance = constructor.newInstance(atomActionDTO3, map3, str6, storyItemAsset3, str5, storyText3, largeButton3, storySoundControlDTO3, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, StoryItem value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("action");
        this.nullableAtomActionDTOAdapter.mo44toJson(writer, (x) value.getAction());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.w("backgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBackgroundColor());
        writer.w("asset");
        this.storyItemAssetAdapter.mo44toJson(writer, (x) value.getAsset());
        writer.w("tagTitle");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getTagTitle());
        writer.w("text");
        this.nullableStoryTextAdapter.mo44toJson(writer, (x) value.getText());
        writer.w("button");
        this.nullableLargeButtonAdapter.mo44toJson(writer, (x) value.getButton());
        writer.w("soundControl");
        this.nullableStorySoundControlDTOAdapter.mo44toJson(writer, (x) value.getSoundControl());
        writer.p();
    }
}
