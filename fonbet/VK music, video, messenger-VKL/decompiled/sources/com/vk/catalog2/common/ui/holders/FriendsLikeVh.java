package com.vk.catalog2.common.ui.holders;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockFriendsLiked;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.feature.music.holders.PodcastSliderItemRoundBackgroundVh;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.PhotoStackView;
import com.vk.dto.common.FriendsLiked;
import com.vk.dto.podcast.FriendsLikedEpisode;
import com.vk.dto.user.UserProfile;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.c5g;
import xsna.e43;
import xsna.e7b0;
import xsna.ey2;
import xsna.j5g;

/* compiled from: FriendsLikeVh.kt */
/* loaded from: classes16.dex */
public final class FriendsLikeVh implements CatalogViewHolder {
    public final PodcastSliderItemRoundBackgroundVh b;
    public final e7b0 c;
    public TextView d;
    public TextView e;
    public PhotoStackView f;

    public FriendsLikeVh(PodcastSliderItemRoundBackgroundVh podcastSliderItemRoundBackgroundVh, e7b0 e7b0Var) {
        this.b = podcastSliderItemRoundBackgroundVh;
        this.c = e7b0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v4, types: [com.vk.core.view.PhotoStackView] */
    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        ?? r2;
        List<? extends UserProfile> list;
        int size;
        if (uIBlock instanceof UIBlockFriendsLiked) {
            UIBlockFriendsLiked uIBlockFriendsLiked = (UIBlockFriendsLiked) uIBlock;
            FriendsLiked friendsLiked = uIBlockFriendsLiked.z;
            List<? extends UserProfile> list2 = friendsLiked.c;
            if (list2 != null) {
                List<? extends UserProfile> list3 = list2;
                r2 = new ArrayList(c5g.u(list3, 10));
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    r2.add(((UserProfile) it.next()).h);
                }
            } else {
                r2 = EmptyList.b;
            }
            this.b.N6(uIBlockFriendsLiked.y);
            PhotoStackView photoStackView = this.f;
            String str = null;
            str = null;
            str = null;
            ?? r8 = photoStackView;
            if (photoStackView == null) {
                r8 = 0;
            }
            PhotoStackView.b bVar = PhotoStackView.M;
            r8.r(-1, r2);
            TextView textView = this.d;
            if (textView == null) {
                textView = null;
            }
            textView.setText(R.string.friends_liked_title);
            TextView textView2 = this.e;
            if (textView2 == null) {
                textView2 = null;
            }
            this.c.getClass();
            if ((friendsLiked instanceof FriendsLikedEpisode) && (list = ((FriendsLikedEpisode) friendsLiked).c) != null && (size = list.size()) != 0) {
                if (size == 1) {
                    Context context = e43.a;
                    str = (context != null ? context : null).getString(R.string.episode_liked_one, ((UserProfile) j5g.Y(list)).e);
                } else if (size != 2) {
                    Context context2 = e43.a;
                    if (context2 == null) {
                        context2 = null;
                    }
                    String str2 = list.get(0).d;
                    String str3 = list.get(1).d;
                    Context context3 = e43.a;
                    str = context2.getString(R.string.episode_liked_two_more, str2, str3, (context3 != null ? context3 : null).getResources().getQuantityString(R.plurals.episode_liked_friends, list.size() - 2, Integer.valueOf(list.size() - 2)));
                } else {
                    Context context4 = e43.a;
                    str = (context4 != null ? context4 : null).getString(R.string.episode_liked_two, list.get(0).d, list.get(1).d);
                }
            }
            ey2.i(textView2, str);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog_friends_like_list, viewGroup, false);
        this.d = (TextView) inflate.findViewById(R.id.catalog_friends_like_title);
        this.e = (TextView) inflate.findViewById(R.id.catalog_friends_like_text);
        PhotoStackView photoStackView = (PhotoStackView) inflate.findViewById(R.id.catalog_friends_like_avatars);
        photoStackView.setOverlapOffset(0.8f);
        photoStackView.setMarginBetweenImages(2.0f);
        this.f = photoStackView;
        FrameLayout frameLayout = (FrameLayout) inflate.findViewById(R.id.catalog_friends_like_container);
        frameLayout.addView(this.b.k5(layoutInflater, frameLayout, bundle));
        return inflate;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
        N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return false;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
