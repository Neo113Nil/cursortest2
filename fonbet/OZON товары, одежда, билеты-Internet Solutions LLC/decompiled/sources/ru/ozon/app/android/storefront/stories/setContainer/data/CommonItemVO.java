package ru.ozon.app.android.storefront.stories.setContainer.data;

import WZ.t;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u001c\u0010\u0007\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0010\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/storefront/stories/setContainer/data/CommonItemVO;", "", "", "getHideFrame", "()Z", "setHideFrame", "(Z)V", "hideFrame", "Lru/ozon/app/android/storefront/stories/setContainer/data/SetType;", "getItemType", "()Lru/ozon/app/android/storefront/stories/setContainer/data/SetType;", "itemType", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "getTokenizedEvent", "()LWZ/t;", "tokenizedEvent", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface CommonItemVO {
    @NotNull
    SetType getItemType();

    t getTokenizedEvent();

    void setHideFrame(boolean z11);
}
