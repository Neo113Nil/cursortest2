package com.braze.reactbridge;

import com.braze.models.cards.CaptionedImageCard;
import com.braze.models.cards.Card;
import com.braze.models.cards.ControlCard;
import com.braze.models.cards.ImageOnlyCard;
import com.braze.models.cards.ShortNewsCard;
import com.braze.models.cards.TextAnnouncementCard;
import com.braze.reactbridge.util.MapFactoryKt;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.modules.dialog.DialogModule;
import com.twilio.voice.EventKeys;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u001a\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004\u001a\n\u0010\b\u001a\u00020\u0006*\u00020\t\u001a\n\u0010\b\u001a\u00020\u0006*\u00020\n\u001a\n\u0010\b\u001a\u00020\u0006*\u00020\u000b\u001a\n\u0010\b\u001a\u00020\u0006*\u00020\f\u001a\u0006\u0010\r\u001a\u00020\u0006¨\u0006\u000e"}, d2 = {"mapContentCards", "Lcom/facebook/react/bridge/WritableArray;", "cardsList", "", "Lcom/braze/models/cards/Card;", "mapContentCard", "Lcom/facebook/react/bridge/WritableMap;", "card", "toWritableMap", "Lcom/braze/models/cards/CaptionedImageCard;", "Lcom/braze/models/cards/ShortNewsCard;", "Lcom/braze/models/cards/TextAnnouncementCard;", "Lcom/braze/models/cards/ImageOnlyCard;", "controlCardToWritableMap", "braze_react-native-sdk_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nContentCardUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentCardUtil.kt\ncom/braze/reactbridge/ContentCardUtilKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,94:1\n1803#2,2:95\n1805#2:98\n1#3:97\n*S KotlinDebug\n*F\n+ 1 ContentCardUtil.kt\ncom/braze/reactbridge/ContentCardUtilKt\n*L\n15#1:95,2\n15#1:98\n*E\n"})
/* loaded from: classes.dex */
public abstract class ContentCardUtilKt {
    @NotNull
    public static final WritableMap controlCardToWritableMap() {
        WritableMap mutableMap = MapFactoryKt.getMutableMap();
        mutableMap.putString("type", "Control");
        return mutableMap;
    }

    @NotNull
    public static final WritableMap mapContentCard(@NotNull Card card) {
        Intrinsics.checkNotNullParameter(card, "card");
        WritableMap mutableMap = MapFactoryKt.getMutableMap();
        mutableMap.putString(StackTraceHelper.ID_KEY, card.getId());
        mutableMap.putDouble("created", card.getCreated());
        mutableMap.putDouble("expiresAt", card.getExpiresAt());
        mutableMap.putBoolean("viewed", card.getWasViewedInternal());
        mutableMap.putBoolean("clicked", card.getIsClicked());
        mutableMap.putBoolean("pinned", card.getIsPinned());
        mutableMap.putBoolean(DialogModule.ACTION_DISMISSED, card.getIsDismissedInternal());
        mutableMap.putBoolean("dismissible", card.getIsDismissibleByUser());
        mutableMap.putString(EventKeys.URL, card.getUrl());
        mutableMap.putBoolean("openURLInWebView", card.getOpenUriInWebView());
        mutableMap.putBoolean("isControl", card.isControl());
        WritableMap mutableMap2 = MapFactoryKt.getMutableMap();
        for (Map.Entry<String, String> entry : card.getExtras().entrySet()) {
            mutableMap2.putString(entry.getKey(), entry.getValue());
        }
        mutableMap.putMap("extras", mutableMap2);
        if (card instanceof ImageOnlyCard) {
            mutableMap.merge(toWritableMap((ImageOnlyCard) card));
            return mutableMap;
        }
        if (card instanceof CaptionedImageCard) {
            mutableMap.merge(toWritableMap((CaptionedImageCard) card));
            return mutableMap;
        }
        if (card instanceof ShortNewsCard) {
            mutableMap.merge(toWritableMap((ShortNewsCard) card));
            return mutableMap;
        }
        if (card instanceof TextAnnouncementCard) {
            mutableMap.merge(toWritableMap((TextAnnouncementCard) card));
            return mutableMap;
        }
        if (card instanceof ControlCard) {
            mutableMap.merge(controlCardToWritableMap());
        }
        return mutableMap;
    }

    @NotNull
    public static final WritableArray mapContentCards(@NotNull List<? extends Card> cardsList) {
        Intrinsics.checkNotNullParameter(cardsList, "cardsList");
        WritableArray mutableArray = MapFactoryKt.getMutableArray();
        Iterator<T> it = cardsList.iterator();
        while (it.hasNext()) {
            mutableArray.pushMap(mapContentCard((Card) it.next()));
        }
        return mutableArray;
    }

    @NotNull
    public static final WritableMap toWritableMap(@NotNull CaptionedImageCard captionedImageCard) {
        Intrinsics.checkNotNullParameter(captionedImageCard, "<this>");
        WritableMap mutableMap = MapFactoryKt.getMutableMap();
        mutableMap.putString("image", captionedImageCard.getImageUrl());
        mutableMap.putDouble("imageAspectRatio", captionedImageCard.getAspectRatio());
        mutableMap.putString("title", captionedImageCard.getTitle());
        mutableMap.putString("cardDescription", captionedImageCard.getDescription());
        mutableMap.putString("domain", captionedImageCard.getDomain());
        mutableMap.putString("type", "Captioned");
        return mutableMap;
    }

    @NotNull
    public static final WritableMap toWritableMap(@NotNull ShortNewsCard shortNewsCard) {
        Intrinsics.checkNotNullParameter(shortNewsCard, "<this>");
        WritableMap mutableMap = MapFactoryKt.getMutableMap();
        mutableMap.putString("image", shortNewsCard.getImageUrl());
        mutableMap.putString("title", shortNewsCard.getTitle());
        mutableMap.putString("cardDescription", shortNewsCard.getDescription());
        mutableMap.putString("domain", shortNewsCard.getDomain());
        mutableMap.putString("type", "Classic");
        return mutableMap;
    }

    @NotNull
    public static final WritableMap toWritableMap(@NotNull TextAnnouncementCard textAnnouncementCard) {
        Intrinsics.checkNotNullParameter(textAnnouncementCard, "<this>");
        WritableMap mutableMap = MapFactoryKt.getMutableMap();
        mutableMap.putString("title", textAnnouncementCard.getTitle());
        mutableMap.putString("cardDescription", textAnnouncementCard.getDescription());
        mutableMap.putString("domain", textAnnouncementCard.getDomain());
        mutableMap.putString("type", "Classic");
        return mutableMap;
    }

    @NotNull
    public static final WritableMap toWritableMap(@NotNull ImageOnlyCard imageOnlyCard) {
        Intrinsics.checkNotNullParameter(imageOnlyCard, "<this>");
        WritableMap mutableMap = MapFactoryKt.getMutableMap();
        mutableMap.putString("image", imageOnlyCard.getImageUrl());
        mutableMap.putDouble("imageAspectRatio", imageOnlyCard.getAspectRatio());
        mutableMap.putString("type", "ImageOnly");
        return mutableMap;
    }
}
