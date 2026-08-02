package defpackage;

import com.blaze.blazesdk.features.shared.models.shared_models.ThumbnailDto;
import com.blaze.blazesdk.features.shared.models.shared_models.ThumbnailModelTypeDto;
import com.blaze.blazesdk.features.shared.models.shared_models.c;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemImageStyle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class ohm {
    public static final List a(List list) {
        if (list == null) {
            return km5.a;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ThumbnailDto thumbnailDto = (ThumbnailDto) it.next();
            xvm b = thumbnailDto != null ? b(thumbnailDto) : null;
            if (b != null) {
                arrayList.add(b);
            }
        }
        return arrayList;
    }

    public static final xvm b(ThumbnailDto thumbnailDto) {
        List a = c.a(thumbnailDto != null ? thumbnailDto.getRenditions() : null);
        if (a.isEmpty()) {
            a = a.c(c.b(thumbnailDto != null ? thumbnailDto.getRendition() : null));
        }
        ThumbnailModelTypeDto type = thumbnailDto != null ? thumbnailDto.getType() : null;
        int i = type == null ? -1 : mfm.a[type.ordinal()];
        return new xvm(a, i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? BlazeWidgetItemImageStyle.BlazeThumbnailType.VERTICAL_TWO_BY_THREE : BlazeWidgetItemImageStyle.BlazeThumbnailType.ANIMATED_THUMBNAIL_POSTER : BlazeWidgetItemImageStyle.BlazeThumbnailType.GIF : BlazeWidgetItemImageStyle.BlazeThumbnailType.CUSTOM : BlazeWidgetItemImageStyle.BlazeThumbnailType.SQUARE_ICON : BlazeWidgetItemImageStyle.BlazeThumbnailType.VERTICAL_TWO_BY_THREE);
    }
}
