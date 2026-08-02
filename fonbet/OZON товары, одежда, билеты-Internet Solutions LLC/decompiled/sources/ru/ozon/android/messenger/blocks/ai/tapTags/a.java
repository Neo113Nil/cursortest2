package ru.ozon.android.messenger.blocks.ai.tapTags;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.blocks.ai.tapTags.TapTagsDTO;
import ru.ozon.android.messenger.blocks.ai.tapTags.presentation.a;
import ru.ozon.android.messenger.blocks.ai.tapTags.presentation.b;
import ru.ozon.android.messenger.framework.presentation.models.c;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

/* loaded from: classes10.dex */
public final class a implements Function2<TapTagsDTO, c, List<? extends ru.ozon.android.messenger.blocks.ai.tapTags.presentation.c>> {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [ru.ozon.android.messenger.blocks.ai.tapTags.presentation.b$a] */
    @Override // kotlin.jvm.functions.Function2
    public final List<? extends ru.ozon.android.messenger.blocks.ai.tapTags.presentation.c> invoke(TapTagsDTO tapTagsDTO, c cVar) {
        TagButtonDTO tagButtonItem;
        TapTagsDTO state = tapTagsDTO;
        c blockId = cVar;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        TextDTO title = state.getTitle();
        List<TapTagsDTO.TagItemDTO> tagsItems = state.getTagsItems();
        ArrayList arrayList = new ArrayList(C7714v.z(tagsItems, 10));
        Iterator it = tagsItems.iterator();
        while (true) {
            ru.ozon.android.messenger.blocks.ai.tapTags.presentation.a aVar = null;
            r6 = null;
            r6 = null;
            b.C1465b c1465b = null;
            if (!it.hasNext()) {
                ButtonV3DTO titleRightButton = state.getTitleRightButton();
                TapTagsDTO.PresentationSettingsDTO presentationSettings = state.getPresentationSettings();
                if (presentationSettings != null) {
                    ButtonV3DTO showMoreButton = presentationSettings.getShowMoreButton();
                    b.a aVar2 = showMoreButton != null ? new b.a(Double.hashCode(Math.random()), showMoreButton) : null;
                    Boolean hasMoreItems = presentationSettings.getHasMoreItems();
                    boolean booleanValue = hasMoreItems != null ? hasMoreItems.booleanValue() : false;
                    Integer collapsedMaxRows = presentationSettings.getCollapsedMaxRows();
                    int intValue = collapsedMaxRows != null ? collapsedMaxRows.intValue() : 2;
                    Integer lastItemMinWidth = presentationSettings.getLastItemMinWidth();
                    int px = ResourceExtKt.toPx(lastItemMinWidth != null ? lastItemMinWidth.intValue() : 80);
                    Paddings paddingTop = presentationSettings.getPaddingTop();
                    if (paddingTop == null) {
                        paddingTop = Paddings.NONE;
                    }
                    int px2 = ResourceExtKt.toPx(paddingTop.getPx());
                    Paddings paddingRight = presentationSettings.getPaddingRight();
                    if (paddingRight == null) {
                        paddingRight = Paddings.PADDING_500;
                    }
                    int px3 = ResourceExtKt.toPx(paddingRight.getPx());
                    Paddings paddingBottom = presentationSettings.getPaddingBottom();
                    if (paddingBottom == null) {
                        paddingBottom = Paddings.PADDING_500;
                    }
                    int px4 = ResourceExtKt.toPx(paddingBottom.getPx());
                    Paddings paddingLeft = presentationSettings.getPaddingLeft();
                    if (paddingLeft == null) {
                        paddingLeft = Paddings.PADDING_500;
                    }
                    int px5 = ResourceExtKt.toPx(paddingLeft.getPx());
                    Paddings rowGap = presentationSettings.getRowGap();
                    if (rowGap == null) {
                        rowGap = Paddings.PADDING_300;
                    }
                    int px6 = ResourceExtKt.toPx(rowGap.getPx()) / 2;
                    Paddings columnGap = presentationSettings.getColumnGap();
                    if (columnGap == null) {
                        columnGap = Paddings.PADDING_300;
                    }
                    a.C1464a c1464a = new a.C1464a(px2, px3, px4, px5, px6, ResourceExtKt.toPx(columnGap.getPx()) / 2);
                    String backgroundColor = presentationSettings.getBackgroundColor();
                    Float itemsMaxPercentWidth = presentationSettings.getItemsMaxPercentWidth();
                    Boolean pinToBottom = presentationSettings.getPinToBottom();
                    aVar = new ru.ozon.android.messenger.blocks.ai.tapTags.presentation.a(aVar2, booleanValue, intValue, px, c1464a, backgroundColor, itemsMaxPercentWidth, pinToBottom != null ? pinToBottom.booleanValue() : false);
                }
                return C7714v.a0(new ru.ozon.android.messenger.blocks.ai.tapTags.presentation.c(blockId, title, arrayList, titleRightButton, aVar));
            }
            TapTagsDTO.TagItemDTO tagItemDTO = (TapTagsDTO.TagItemDTO) it.next();
            String type = tagItemDTO.getType();
            if (Intrinsics.d(type, ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductItemContentDTO.BUTTON_ITEM_FIELD_NAME)) {
                ButtonV3DTO buttonItem = tagItemDTO.getButtonItem();
                if (buttonItem != null) {
                    c1465b = new b.a(Double.hashCode(Math.random()), buttonItem);
                }
            } else if (Intrinsics.d(type, "tagButtonItem") && (tagButtonItem = tagItemDTO.getTagButtonItem()) != null) {
                c1465b = new b.C1465b(Double.hashCode(Math.random()), tagButtonItem);
            }
            if (c1465b == null) {
                throw new IllegalArgumentException(Nk.a.b("unsupported history type: ", tagItemDTO.getType()));
            }
            arrayList.add(c1465b);
        }
    }
}
