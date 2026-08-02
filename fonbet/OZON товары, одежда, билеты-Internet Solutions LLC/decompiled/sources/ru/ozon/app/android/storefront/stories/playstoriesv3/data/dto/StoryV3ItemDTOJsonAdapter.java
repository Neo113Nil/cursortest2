package ru.ozon.app.android.storefront.stories.playstoriesv3.data.dto;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.storefront.core.socialAtoms.productList.container.SocialProductListDTO;
import ru.ozon.app.android.storefront.stories.story.data.StorySoundControlDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonDTO;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R(\u0010\u001c\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0019R\u001c\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0019¨\u0006)"}, d2 = {"Lru/ozon/app/android/storefront/stories/playstoriesv3/data/dto/StoryV3ItemDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/storefront/stories/playstoriesv3/data/dto/StoryV3ItemDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/storefront/stories/playstoriesv3/data/dto/StoryV3ItemDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/storefront/stories/playstoriesv3/data/dto/StoryV3ItemDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "nullableAtomActionDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Lru/ozon/app/android/storefront/stories/playstoriesv3/data/dto/StoryV3ItemAssetDTO;", "storyV3ItemAssetDTOAdapter", "Lru/ozon/app/android/storefront/stories/playstoriesv3/data/dto/StoryV3ContentDTO;", "nullableStoryV3ContentDTOAdapter", "Lru/ozon/uni/atoms/data/controls/button/ButtonDTO;", "nullableButtonDTOAdapter", "Lru/ozon/app/android/storefront/core/socialAtoms/productList/container/SocialProductListDTO;", "nullableSocialProductListDTOAdapter", "Lru/ozon/app/android/storefront/stories/playstoriesv3/data/dto/StoryV3TabBarDTO;", "storyV3TabBarDTOAdapter", "Lru/ozon/app/android/storefront/stories/story/data/StorySoundControlDTO;", "nullableStorySoundControlDTOAdapter", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class StoryV3ItemDTOJsonAdapter extends JsonAdapter<StoryV3ItemDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<AtomActionDTO> nullableAtomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<ButtonDTO> nullableButtonDTOAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<SocialProductListDTO> nullableSocialProductListDTOAdapter;

    @NotNull
    private final JsonAdapter<StorySoundControlDTO> nullableStorySoundControlDTOAdapter;

    @NotNull
    private final JsonAdapter<StoryV3ContentDTO> nullableStoryV3ContentDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<StoryV3ItemAssetDTO> storyV3ItemAssetDTOAdapter;

    @NotNull
    private final JsonAdapter<StoryV3TabBarDTO> storyV3TabBarDTOAdapter;

    public StoryV3ItemDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("action", "trackingInfo", "asset", "content", "button", "productsList", "tabBar", "soundControl");
        M m11 = M.f71699a;
        this.nullableAtomActionDTOAdapter = moshi.f(AtomActionDTO.class, m11, "action");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
        this.storyV3ItemAssetDTOAdapter = moshi.f(StoryV3ItemAssetDTO.class, m11, "asset");
        this.nullableStoryV3ContentDTOAdapter = moshi.f(StoryV3ContentDTO.class, m11, "content");
        this.nullableButtonDTOAdapter = moshi.f(ButtonDTO.class, m11, "button");
        this.nullableSocialProductListDTOAdapter = moshi.f(SocialProductListDTO.class, m11, "productsList");
        this.storyV3TabBarDTOAdapter = moshi.f(StoryV3TabBarDTO.class, m11, "tabBar");
        this.nullableStorySoundControlDTOAdapter = moshi.f(StorySoundControlDTO.class, m11, "soundControl");
    }

    @NotNull
    public String toString() {
        return b.c(36, "GeneratedJsonAdapter(StoryV3ItemDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public StoryV3ItemDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        AtomActionDTO atomActionDTO = null;
        Map<String, TokenizedTrackingInfo> map = null;
        StoryV3ItemAssetDTO storyV3ItemAssetDTO = null;
        StoryV3ContentDTO storyV3ContentDTO = null;
        ButtonDTO buttonDTO = null;
        SocialProductListDTO socialProductListDTO = null;
        StoryV3TabBarDTO storyV3TabBarDTO = null;
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
                    storyV3ItemAssetDTO = this.storyV3ItemAssetDTOAdapter.fromJson(reader);
                    if (storyV3ItemAssetDTO == null) {
                        throw c.q("asset", "asset", reader);
                    }
                    break;
                case 3:
                    storyV3ContentDTO = this.nullableStoryV3ContentDTOAdapter.fromJson(reader);
                    break;
                case 4:
                    buttonDTO = this.nullableButtonDTOAdapter.fromJson(reader);
                    break;
                case 5:
                    socialProductListDTO = this.nullableSocialProductListDTOAdapter.fromJson(reader);
                    break;
                case 6:
                    storyV3TabBarDTO = this.storyV3TabBarDTOAdapter.fromJson(reader);
                    if (storyV3TabBarDTO == null) {
                        throw c.q("tabBar", "tabBar", reader);
                    }
                    break;
                case 7:
                    storySoundControlDTO = this.nullableStorySoundControlDTOAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (storyV3ItemAssetDTO == null) {
            throw c.j("asset", "asset", reader);
        }
        if (storyV3TabBarDTO != null) {
            return new StoryV3ItemDTO(atomActionDTO, map, storyV3ItemAssetDTO, storyV3ContentDTO, buttonDTO, socialProductListDTO, storyV3TabBarDTO, storySoundControlDTO);
        }
        throw c.j("tabBar", "tabBar", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, StoryV3ItemDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("action");
        this.nullableAtomActionDTOAdapter.mo44toJson(writer, (x) value.getAction());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.w("asset");
        this.storyV3ItemAssetDTOAdapter.mo44toJson(writer, (x) value.getAsset());
        writer.w("content");
        this.nullableStoryV3ContentDTOAdapter.mo44toJson(writer, (x) value.getContent());
        writer.w("button");
        this.nullableButtonDTOAdapter.mo44toJson(writer, (x) value.getButton());
        writer.w("productsList");
        this.nullableSocialProductListDTOAdapter.mo44toJson(writer, (x) value.getProductsList());
        writer.w("tabBar");
        this.storyV3TabBarDTOAdapter.mo44toJson(writer, (x) value.getTabBar());
        writer.w("soundControl");
        this.nullableStorySoundControlDTOAdapter.mo44toJson(writer, (x) value.getSoundControl());
        writer.p();
    }
}
