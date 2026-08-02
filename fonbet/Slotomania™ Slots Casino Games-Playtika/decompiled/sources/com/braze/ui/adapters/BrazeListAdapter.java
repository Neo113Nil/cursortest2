package com.braze.ui.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.braze.models.cards.BannerImageCard;
import com.braze.models.cards.CaptionedImageCard;
import com.braze.models.cards.Card;
import com.braze.models.cards.ShortNewsCard;
import com.braze.models.cards.TextAnnouncementCard;
import com.braze.support.BrazeLogger;
import com.braze.ui.feed.view.BaseFeedCardView;
import com.braze.ui.widget.BannerImageCardView;
import com.braze.ui.widget.CaptionedImageCardView;
import com.braze.ui.widget.DefaultCardView;
import com.braze.ui.widget.ShortNewsCardView;
import com.braze.ui.widget.TextAnnouncementCardView;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes5.dex */
public class BrazeListAdapter extends ArrayAdapter<Card> {
    private static final String TAG = BrazeLogger.getBrazeLogTag((Class<?>) BrazeListAdapter.class);
    private final Set<String> mCardIdImpressions;
    private final Context mContext;

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 5;
    }

    public BrazeListAdapter(Context context, int i, List<Card> list) {
        super(context, i, list);
        this.mContext = context;
        this.mCardIdImpressions = new HashSet();
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i) {
        Card item = getItem(i);
        if (item instanceof BannerImageCard) {
            return 1;
        }
        if (item instanceof CaptionedImageCard) {
            return 2;
        }
        if (item instanceof ShortNewsCard) {
            return 3;
        }
        return item instanceof TextAnnouncementCard ? 4 : 0;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        BaseFeedCardView baseFeedCardView;
        Card item = getItem(i);
        if (view == null) {
            if (item instanceof BannerImageCard) {
                baseFeedCardView = new BannerImageCardView(this.mContext);
            } else if (item instanceof CaptionedImageCard) {
                baseFeedCardView = new CaptionedImageCardView(this.mContext);
            } else if (item instanceof ShortNewsCard) {
                baseFeedCardView = new ShortNewsCardView(this.mContext);
            } else if (item instanceof TextAnnouncementCard) {
                baseFeedCardView = new TextAnnouncementCardView(this.mContext);
            } else {
                baseFeedCardView = new DefaultCardView(this.mContext);
            }
        } else {
            BrazeLogger.v(TAG, "Reusing convertView for rendering of item " + i);
            baseFeedCardView = (BaseFeedCardView) view;
        }
        BrazeLogger.v(TAG, "Using view of type: " + baseFeedCardView.getClass().getName() + " for card at position " + i + ": " + item.toString());
        baseFeedCardView.setCard(item);
        logCardImpression(item);
        return baseFeedCardView;
    }

    public synchronized void replaceFeed(List<Card> list) {
        int i = 0;
        setNotifyOnChange(false);
        if (list == null) {
            clear();
            notifyDataSetChanged();
            return;
        }
        BrazeLogger.d(TAG, "Replacing existing feed of " + getCount() + " cards with new feed containing " + list.size() + " cards.");
        int size = list.size();
        int i2 = 0;
        while (i < getCount()) {
            Card item = getItem(i);
            Card card = i2 < size ? list.get(i2) : null;
            if (card == null || !card.equals(item)) {
                remove(item);
            } else {
                i++;
                i2++;
            }
        }
        super.addAll(list.subList(i2, size));
        notifyDataSetChanged();
    }

    @Override // android.widget.ArrayAdapter
    public synchronized void add(Card card) {
        super.add((BrazeListAdapter) card);
    }

    public void resetCardImpressionTracker() {
        this.mCardIdImpressions.clear();
    }

    private void logCardImpression(Card card) {
        String id = card.getId();
        if (!this.mCardIdImpressions.contains(id)) {
            this.mCardIdImpressions.add(id);
            card.logImpression();
            BrazeLogger.v(TAG, "Logged impression for card " + id);
        } else {
            BrazeLogger.v(TAG, "Already counted impression for card " + id);
        }
        if (card.getWasViewedInternal()) {
            return;
        }
        card.setViewed(true);
    }

    public void batchSetCardsToRead(int i, int i2) {
        if (getCount() == 0) {
            BrazeLogger.d(TAG, "mAdapter is empty in setting some cards to viewed.");
            return;
        }
        int min = Math.min(getCount(), i2);
        for (int max = Math.max(0, i); max < min; max++) {
            Card item = getItem(max);
            if (item == null) {
                BrazeLogger.d(TAG, "Card was null in setting some cards to viewed.");
                return;
            } else {
                if (!item.getIsIndicatorHighlightedInternal()) {
                    item.setIndicatorHighlighted(true);
                }
            }
        }
    }
}
