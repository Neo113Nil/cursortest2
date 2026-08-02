package ru.ozon.app.android.storefront.stories.playstoriesv3.data.dto;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;

@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "image", type = StoryV3WithImageDTO.class), @ProtoOneOfSignature(name = "video", type = StoryV3WithVideoDTO.class)})
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/storefront/stories/playstoriesv3/data/dto/StoryV3ItemAssetDTO;", "", "<init>", "()V", "Lru/ozon/app/android/storefront/stories/playstoriesv3/data/dto/StoryV3WithImageDTO;", "Lru/ozon/app/android/storefront/stories/playstoriesv3/data/dto/StoryV3WithVideoDTO;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ProtoOneOf(label = "type")
/* loaded from: classes2.dex */
public abstract class StoryV3ItemAssetDTO {
    public static final int $stable = 0;

    public /* synthetic */ StoryV3ItemAssetDTO(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private StoryV3ItemAssetDTO() {
    }
}
