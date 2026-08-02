package com.braze.ui.contentcards.handlers;

import android.os.Parcel;
import android.os.Parcelable;
import com.braze.events.ContentCardsUpdatedEvent;
import com.braze.models.cards.Card;
import com.braze.ui.actions.brazeactions.BrazeActionUtils;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DefaultContentCardsUpdateHandler.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0004H\u0016¨\u0006\u0010"}, d2 = {"Lcom/braze/ui/contentcards/handlers/DefaultContentCardsUpdateHandler;", "Lcom/braze/ui/contentcards/handlers/IContentCardsUpdateHandler;", "()V", "describeContents", "", "handleCardUpdate", "", "Lcom/braze/models/cards/Card;", "event", "Lcom/braze/events/ContentCardsUpdatedEvent;", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", k.M, "android-sdk-ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes6.dex */
public class DefaultContentCardsUpdateHandler implements IContentCardsUpdateHandler {
    public static final Parcelable.Creator<DefaultContentCardsUpdateHandler> CREATOR = new Parcelable.Creator<DefaultContentCardsUpdateHandler>() { // from class: com.braze.ui.contentcards.handlers.DefaultContentCardsUpdateHandler$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DefaultContentCardsUpdateHandler createFromParcel(Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new DefaultContentCardsUpdateHandler();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DefaultContentCardsUpdateHandler[] newArray(int size) {
            return new DefaultContentCardsUpdateHandler[size];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleCardUpdate$lambda-0, reason: not valid java name */
    public static final int m5210handleCardUpdate$lambda0(Card cardA, Card cardB) {
        Intrinsics.checkNotNullParameter(cardA, "cardA");
        Intrinsics.checkNotNullParameter(cardB, "cardB");
        if (cardA.getIsPinned() && !cardB.getIsPinned()) {
            return -1;
        }
        if (!cardA.getIsPinned() && cardB.getIsPinned()) {
            return 1;
        }
        if (cardA.getCreated() > cardB.getCreated()) {
            return -1;
        }
        return cardA.getCreated() < cardB.getCreated() ? 1 : 0;
    }

    @Override // com.braze.ui.contentcards.handlers.IContentCardsUpdateHandler
    public List<Card> handleCardUpdate(ContentCardsUpdatedEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Comparator comparator = new Comparator() { // from class: com.braze.ui.contentcards.handlers.DefaultContentCardsUpdateHandler$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m5210handleCardUpdate$lambda0;
                m5210handleCardUpdate$lambda0 = DefaultContentCardsUpdateHandler.m5210handleCardUpdate$lambda0((Card) obj, (Card) obj2);
                return m5210handleCardUpdate$lambda0;
            }
        };
        List<Card> allCards = event.getAllCards();
        ArrayList arrayList = new ArrayList();
        for (Object obj : allCards) {
            if (!BrazeActionUtils.containsInvalidBrazeAction((Card) obj)) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt.sortedWith(arrayList, comparator);
    }
}
