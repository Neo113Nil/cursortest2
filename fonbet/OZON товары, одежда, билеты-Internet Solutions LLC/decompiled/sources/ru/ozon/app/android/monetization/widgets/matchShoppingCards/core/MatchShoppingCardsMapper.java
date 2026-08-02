package ru.ozon.app.android.monetization.widgets.matchShoppingCards.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.monetization.widgets.matchShoppingCards.data.MatchShoppingCardsDTO;
import ru.ozon.app.android.monetization.widgets.matchShoppingCards.presentation.MatchShoppingCardsVI;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.core.UniColors;
import ru.ozon.uni.core.models.GradientDirection;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000b\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000b\u0010\u000fJ\u0013\u0010\u000b\u001a\u00020\u0011*\u00020\u0010H\u0002¢\u0006\u0004\b\u000b\u0010\u0012J\u0013\u0010\u000b\u001a\u00020\u0014*\u00020\u0013H\u0002¢\u0006\u0004\b\u000b\u0010\u0015J\u0013\u0010\u000b\u001a\u00020\u0017*\u00020\u0016H\u0002¢\u0006\u0004\b\u000b\u0010\u0018J&\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u000b\u001a\u00020\u001e*\u00020\u001d¢\u0006\u0004\b\u000b\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/monetization/widgets/matchShoppingCards/core/MatchShoppingCardsMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/monetization/widgets/matchShoppingCards/data/MatchShoppingCardsDTO;", "Ll20/d;", "", "Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsVI;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/monetization/widgets/matchShoppingCards/data/MatchShoppingCardsDTO$Header;", "Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsVI$Header;", "toVI", "(Lru/ozon/app/android/monetization/widgets/matchShoppingCards/data/MatchShoppingCardsDTO$Header;)Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsVI$Header;", "Lru/ozon/app/android/monetization/widgets/matchShoppingCards/data/MatchShoppingCardsDTO$ProductInfo;", "Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsVI$ProductInfo;", "(Lru/ozon/app/android/monetization/widgets/matchShoppingCards/data/MatchShoppingCardsDTO$ProductInfo;)Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsVI$ProductInfo;", "Lru/ozon/app/android/monetization/widgets/matchShoppingCards/data/MatchShoppingCardsDTO$Card$TrackingInfo;", "Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsVI$Card$TrackingInfo;", "(Lru/ozon/app/android/monetization/widgets/matchShoppingCards/data/MatchShoppingCardsDTO$Card$TrackingInfo;)Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsVI$Card$TrackingInfo;", "Lru/ozon/app/android/monetization/widgets/matchShoppingCards/data/MatchShoppingCardsDTO$ReactionButton;", "Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsVI$ReactionButton;", "(Lru/ozon/app/android/monetization/widgets/matchShoppingCards/data/MatchShoppingCardsDTO$ReactionButton;)Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsVI$ReactionButton;", "Lru/ozon/app/android/monetization/widgets/matchShoppingCards/data/MatchShoppingCardsDTO$Gradient;", "Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsVI$Gradient;", "(Lru/ozon/app/android/monetization/widgets/matchShoppingCards/data/MatchShoppingCardsDTO$Gradient;)Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsVI$Gradient;", "state", "info", "invoke", "(Lru/ozon/app/android/monetization/widgets/matchShoppingCards/data/MatchShoppingCardsDTO;Ll20/d;)Ljava/util/List;", "Lru/ozon/app/android/monetization/widgets/matchShoppingCards/data/MatchShoppingCardsDTO$Card;", "Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsVI$Card;", "(Lru/ozon/app/android/monetization/widgets/matchShoppingCards/data/MatchShoppingCardsDTO$Card;)Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsVI$Card;", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MatchShoppingCardsMapper implements Function2<MatchShoppingCardsDTO, d, List<? extends MatchShoppingCardsVI>> {
    @NotNull
    public final MatchShoppingCardsVI.Card toVI(@NotNull MatchShoppingCardsDTO.Card card) {
        Intrinsics.checkNotNullParameter(card, "<this>");
        MatchShoppingCardsVI.ProductInfo vi2 = toVI(card.getProductInfo());
        AtomActionDTO likeAction = card.getLikeAction();
        AtomActionDTO dislikeAction = card.getDislikeAction();
        AtomActionDTO shareAction = card.getShareAction();
        MatchShoppingCardsDTO.Card.TrackingInfo trackingInfo = card.getTrackingInfo();
        return new MatchShoppingCardsVI.Card(vi2, likeAction, dislikeAction, shareAction, trackingInfo != null ? toVI(trackingInfo) : null, card.getTestInfo());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<MatchShoppingCardsVI> invoke(@NotNull MatchShoppingCardsDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        long hashCode = info.d().hashCode();
        MatchShoppingCardsVI.Header vi2 = toVI(state.getHeader());
        List<MatchShoppingCardsDTO.Card> cards = state.getCards();
        ArrayList arrayList = new ArrayList(C7714v.z(cards, 10));
        Iterator<T> it = cards.iterator();
        while (it.hasNext()) {
            arrayList.add(toVI((MatchShoppingCardsDTO.Card) it.next()));
        }
        return C7714v.a0(new MatchShoppingCardsVI(hashCode, vi2, arrayList, state.getRequestCardsAction(), state.getRefreshAction(), toVI(state.getLikeButton()), toVI(state.getDislikeButton())));
    }

    private final MatchShoppingCardsVI.Header toVI(MatchShoppingCardsDTO.Header header) {
        BadgeDTO badge = header.getBadge();
        Boolean deferredBadge = header.getDeferredBadge();
        return new MatchShoppingCardsVI.Header(badge, deferredBadge != null ? deferredBadge.booleanValue() : false, header.getLeftIcon(), header.getRightIcon(), header.getTestInfo());
    }

    private final MatchShoppingCardsVI.ProductInfo toVI(MatchShoppingCardsDTO.ProductInfo productInfo) {
        return new MatchShoppingCardsVI.ProductInfo(productInfo.getImage(), productInfo.getTitleCell());
    }

    private final MatchShoppingCardsVI.Card.TrackingInfo toVI(MatchShoppingCardsDTO.Card.TrackingInfo trackingInfo) {
        return new MatchShoppingCardsVI.Card.TrackingInfo(trackingInfo.getClick(), trackingInfo.getView(), trackingInfo.getLike(), trackingInfo.getDislike(), trackingInfo.getSwipeLeft(), trackingInfo.getSwipeRight(), trackingInfo.getShare());
    }

    private final MatchShoppingCardsVI.ReactionButton toVI(MatchShoppingCardsDTO.ReactionButton reactionButton) {
        String iconUrl = reactionButton.getIconUrl();
        MatchShoppingCardsDTO.Gradient background = reactionButton.getBackground();
        MatchShoppingCardsVI.Gradient vi2 = background != null ? toVI(background) : null;
        MatchShoppingCardsDTO.Gradient defaultStroke = reactionButton.getDefaultStroke();
        MatchShoppingCardsVI.Gradient vi3 = defaultStroke != null ? toVI(defaultStroke) : null;
        MatchShoppingCardsDTO.Gradient pressedStroke = reactionButton.getPressedStroke();
        return new MatchShoppingCardsVI.ReactionButton(iconUrl, vi2, vi3, pressedStroke != null ? toVI(pressedStroke) : null, reactionButton.getLightColor(), reactionButton.getTestInfo());
    }

    private final MatchShoppingCardsVI.Gradient toVI(MatchShoppingCardsDTO.Gradient gradient) {
        GradientDirection direction = gradient.getDirection();
        List<MatchShoppingCardsDTO.Gradient.Stop> stops = gradient.getStops();
        ArrayList arrayList = new ArrayList(C7714v.z(stops, 10));
        for (MatchShoppingCardsDTO.Gradient.Stop stop : stops) {
            String color = stop.getColor();
            Float position = stop.getPosition();
            if (color == null) {
                color = UniColors.CLEAR_LIGHT_KEY_0.getToken();
            }
            arrayList.add(new MatchShoppingCardsVI.Gradient.Stop(color, position != null ? position.floatValue() : 0.0f));
        }
        return new MatchShoppingCardsVI.Gradient(direction, arrayList);
    }
}
