package ru.ozon.app.android.pdp.widgets.richContent.core;

import Sc.o;
import kotlin.Metadata;
import ru.ozon.app.android.pdp.widgets.richContent.data.RichContentDTO;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\u001a&\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¨\u0006\b"}, d2 = {"copy", "Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$Content;", "tabGroupId", "", "isExpanded", "", "position", "", "pdp_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class RichContentConfigKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final RichContentDTO.Content copy(RichContentDTO.Content content, String str, boolean z11, int i11) {
        if (content instanceof RichContentDTO.Content.BillboardDTO) {
            return RichContentDTO.Content.BillboardDTO.copy$default((RichContentDTO.Content.BillboardDTO) content, null, null, null, 0.0d, null, null, str, Boolean.valueOf(z11), Integer.valueOf(i11), 63, null);
        }
        if (content instanceof RichContentDTO.Content.TextDTO) {
            return RichContentDTO.Content.TextDTO.copy$default((RichContentDTO.Content.TextDTO) content, null, null, str, Boolean.valueOf(z11), Integer.valueOf(i11), 3, null);
        }
        if (content instanceof RichContentDTO.Content.SpacerDTO) {
            return RichContentDTO.Content.SpacerDTO.copy$default((RichContentDTO.Content.SpacerDTO) content, 0, null, str, Boolean.valueOf(z11), Integer.valueOf(i11), 3, null);
        }
        if (content instanceof RichContentDTO.Content.ListItemDTO) {
            return RichContentDTO.Content.ListItemDTO.copy$default((RichContentDTO.Content.ListItemDTO) content, null, null, null, null, null, null, str, Boolean.valueOf(z11), Integer.valueOf(i11), 63, null);
        }
        if (content instanceof RichContentDTO.Content.DoubleTileDTO) {
            return RichContentDTO.Content.DoubleTileDTO.copy$default((RichContentDTO.Content.DoubleTileDTO) content, null, null, str, Boolean.valueOf(z11), Integer.valueOf(i11), 3, null);
        }
        throw new o();
    }
}
