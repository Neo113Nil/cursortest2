package com.braze.ui.contentcards.handlers;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;
import com.braze.enums.CardType;
import com.braze.models.cards.Card;
import com.braze.ui.contentcards.view.BannerImageContentCardView;
import com.braze.ui.contentcards.view.BaseContentCardView;
import com.braze.ui.contentcards.view.CaptionedImageContentCardView;
import com.braze.ui.contentcards.view.ContentCardViewHolder;
import com.braze.ui.contentcards.view.DefaultContentCardView;
import com.braze.ui.contentcards.view.ShortNewsContentCardView;
import com.braze.ui.contentcards.view.TextAnnouncementContentCardView;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DefaultContentCardsViewBindingHandler.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0016J\u001c\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005H\u0007J&\u0010\r\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\bH\u0016J.\u0010\u0012\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\bH\u0016J.\u0010\u0016\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\bH\u0016J\u0018\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\bH\u0016R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/braze/ui/contentcards/handlers/DefaultContentCardsViewBindingHandler;", "Lcom/braze/ui/contentcards/handlers/IContentCardsViewBindingHandler;", "()V", "contentCardViewCache", "", "Lcom/braze/enums/CardType;", "Lcom/braze/ui/contentcards/view/BaseContentCardView;", "describeContents", "", "getContentCardsViewFromCache", "context", "Landroid/content/Context;", "cardType", "getItemViewType", "cards", "", "Lcom/braze/models/cards/Card;", "adapterPosition", "onBindViewHolder", "", "viewHolder", "Lcom/braze/ui/contentcards/view/ContentCardViewHolder;", "onCreateViewHolder", "viewGroup", "Landroid/view/ViewGroup;", "viewType", "writeToParcel", "dest", "Landroid/os/Parcel;", "flags", k.M, "android-sdk-ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes7.dex */
public class DefaultContentCardsViewBindingHandler implements IContentCardsViewBindingHandler {
    private final Map<CardType, BaseContentCardView<?>> contentCardViewCache = new LinkedHashMap();
    public static final Parcelable.Creator<DefaultContentCardsViewBindingHandler> CREATOR = new Parcelable.Creator<DefaultContentCardsViewBindingHandler>() { // from class: com.braze.ui.contentcards.handlers.DefaultContentCardsViewBindingHandler$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DefaultContentCardsViewBindingHandler createFromParcel(Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new DefaultContentCardsViewBindingHandler();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DefaultContentCardsViewBindingHandler[] newArray(int size) {
            return new DefaultContentCardsViewBindingHandler[size];
        }
    };

    /* compiled from: DefaultContentCardsViewBindingHandler.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CardType.values().length];
            iArr[CardType.BANNER.ordinal()] = 1;
            iArr[CardType.CAPTIONED_IMAGE.ordinal()] = 2;
            iArr[CardType.SHORT_NEWS.ordinal()] = 3;
            iArr[CardType.TEXT_ANNOUNCEMENT.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
    }

    @Override // com.braze.ui.contentcards.handlers.IContentCardsViewBindingHandler
    public ContentCardViewHolder onCreateViewHolder(Context context, List<? extends Card> cards, ViewGroup viewGroup, int viewType) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cards, "cards");
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        return getContentCardsViewFromCache(context, CardType.INSTANCE.fromValue(viewType)).createViewHolder(viewGroup);
    }

    @Override // com.braze.ui.contentcards.handlers.IContentCardsViewBindingHandler
    public void onBindViewHolder(Context context, List<? extends Card> cards, ContentCardViewHolder viewHolder, int adapterPosition) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cards, "cards");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        if (adapterPosition < 0 || adapterPosition >= cards.size()) {
            return;
        }
        Card card = cards.get(adapterPosition);
        getContentCardsViewFromCache(context, card.getCardType()).bindViewHolder(viewHolder, card);
    }

    @Override // com.braze.ui.contentcards.handlers.IContentCardsViewBindingHandler
    public int getItemViewType(Context context, List<? extends Card> cards, int adapterPosition) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cards, "cards");
        if (adapterPosition < 0 || adapterPosition >= cards.size()) {
            return -1;
        }
        return cards.get(adapterPosition).getCardType().getValue();
    }

    public final BaseContentCardView<?> getContentCardsViewFromCache(Context context, CardType cardType) {
        BannerImageContentCardView bannerImageContentCardView;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cardType, "cardType");
        if (!this.contentCardViewCache.containsKey(cardType) || this.contentCardViewCache.get(cardType) == null) {
            int i = WhenMappings.$EnumSwitchMapping$0[cardType.ordinal()];
            if (i == 1) {
                bannerImageContentCardView = new BannerImageContentCardView(context);
            } else if (i == 2) {
                bannerImageContentCardView = new CaptionedImageContentCardView(context);
            } else if (i == 3) {
                bannerImageContentCardView = new ShortNewsContentCardView(context);
            } else if (i == 4) {
                bannerImageContentCardView = new TextAnnouncementContentCardView(context);
            } else {
                bannerImageContentCardView = new DefaultContentCardView(context);
            }
            this.contentCardViewCache.put(cardType, bannerImageContentCardView);
        }
        BaseContentCardView<?> baseContentCardView = this.contentCardViewCache.get(cardType);
        return baseContentCardView == null ? new DefaultContentCardView(context) : baseContentCardView;
    }
}
