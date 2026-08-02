package ru.ozon.app.android.commonwidgets.widgets.pixel.data;

import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/pixel/data/PixelDTO;", "", "viewEvents", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;)V", "getViewEvents", "()Ljava/util/List;", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PixelDTO {
    private final List<TokenizedTrackingInfo> viewEvents;

    public PixelDTO(List<TokenizedTrackingInfo> list) {
        this.viewEvents = list;
    }

    public final List<TokenizedTrackingInfo> getViewEvents() {
        return this.viewEvents;
    }
}
