package ru.ozon.app.android.storefront.widgets.videoScroll.data;

import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/storefront/widgets/videoScroll/data/VideoScrollDTO;", "", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/app/android/storefront/widgets/videoScroll/data/HeaderDTO;", "items", "", "Lru/ozon/app/android/storefront/widgets/videoScroll/data/ItemDTO;", "<init>", "(Lru/ozon/app/android/storefront/widgets/videoScroll/data/HeaderDTO;Ljava/util/List;)V", "getHeader", "()Lru/ozon/app/android/storefront/widgets/videoScroll/data/HeaderDTO;", "getItems", "()Ljava/util/List;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VideoScrollDTO {
    public static final int $stable = 8;
    private final HeaderDTO header;

    @NotNull
    private final List<ItemDTO> items;

    public VideoScrollDTO(HeaderDTO headerDTO, @NotNull List<ItemDTO> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.header = headerDTO;
        this.items = items;
    }

    public final HeaderDTO getHeader() {
        return this.header;
    }

    @NotNull
    public final List<ItemDTO> getItems() {
        return this.items;
    }
}
