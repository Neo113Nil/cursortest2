package com.vk.catalog2.common.ui.holders.search;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.catalog2.common.dto.api.search.CatalogSearchEntityVideoPlaylist;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionPlayVideosFromBlock;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionToggleAlbumSubscription;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.feature.search.dto.ui.UIBlockSearchEntityVideoPlaylist;
import com.vk.core.serialize.Serializer;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.text.SquareExcerptTextView;
import com.vk.dto.common.Image;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.video.VideoAlbum;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import xsna.b5a;
import xsna.bh10;
import xsna.bn1;
import xsna.dhr0;
import xsna.e3m;
import xsna.epx;
import xsna.fxc0;
import xsna.g7s0;
import xsna.jwr0;
import xsna.k6p;
import xsna.l3a;
import xsna.m3a;
import xsna.mcc0;
import xsna.v9b;
import xsna.vu5;
import xsna.wjs0;

/* compiled from: SearchEntityVideoPlaylistAnswerVh.kt */
/* loaded from: classes16.dex */
public final class SearchEntityVideoPlaylistAnswerVh implements CatalogViewHolder {
    public final b5a b;
    public final m3a c;
    public final SearchStatInfoProvider d;
    public final mcc0 e;
    public final int f;
    public final g7s0 g;
    public TextView h;
    public TextView i;
    public View j;
    public VKImageView k;
    public VkButton l;
    public VkButton m;
    public UIBlockSearchEntityVideoPlaylist n;
    public io.reactivex.rxjava3.disposables.c o;

    /* compiled from: SearchEntityVideoPlaylistAnswerVh.kt */
    public static final class a implements l3a {
        public final UIBlockActionPlayVideosFromBlock a;
        public final UserId b;
        public final int c;

        public a(UIBlockActionPlayVideosFromBlock uIBlockActionPlayVideosFromBlock, UserId userId, int i) {
            this.a = uIBlockActionPlayVideosFromBlock;
            this.b = userId;
            this.c = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && this.c == aVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + bh10.a(this.a.hashCode() * 31, 31, this.b.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SearchEntityVideoPlaylistClickEvent(action=");
            sb.append(this.a);
            sb.append(", playlistOwnerId=");
            sb.append(this.b);
            sb.append(", playlistId=");
            return vu5.b(sb, this.c, ')');
        }
    }

    public SearchEntityVideoPlaylistAnswerVh(b5a b5aVar, m3a m3aVar, SearchStatInfoProvider searchStatInfoProvider, mcc0 mcc0Var) {
        g7s0 B = fxc0.B();
        this.b = b5aVar;
        this.c = m3aVar;
        this.d = searchStatInfoProvider;
        this.e = mcc0Var;
        this.f = R.layout.catalog_search_entity_video_playlist_item;
        this.g = B;
    }

    public static void a(VideoAlbum videoAlbum, boolean z) {
        wjs0.a(new jwr0(VideoAlbum.Ab(videoAlbum, z, null, 261119), videoAlbum.l ? "albums_subscribe" : "albums_unsubscribe"));
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        UIBlockSearchEntityVideoPlaylist uIBlockSearchEntityVideoPlaylist;
        Context context;
        if (uIBlock instanceof UIBlockSearchEntityVideoPlaylist) {
            UIBlockSearchEntityVideoPlaylist uIBlockSearchEntityVideoPlaylist2 = (UIBlockSearchEntityVideoPlaylist) uIBlock;
            VideoAlbum videoAlbum = uIBlockSearchEntityVideoPlaylist2.B;
            CatalogSearchEntityVideoPlaylist catalogSearchEntityVideoPlaylist = uIBlockSearchEntityVideoPlaylist2.y;
            this.n = uIBlockSearchEntityVideoPlaylist2;
            String str = catalogSearchEntityVideoPlaylist.i;
            String str2 = catalogSearchEntityVideoPlaylist.h;
            if (str == null) {
                TextView textView = this.i;
                str = (textView == null || (context = textView.getContext()) == null) ? null : context.getString(R.string.search_entity_video_playlist_description, catalogSearchEntityVideoPlaylist.k, catalogSearchEntityVideoPlaylist.j);
            }
            View view = this.j;
            if (view != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append(" ");
                sb.append(str == null ? "" : str);
                view.setContentDescription(sb.toString());
            }
            TextView textView2 = this.h;
            if (textView2 != null) {
                textView2.setText(str2);
            }
            TextView textView3 = this.h;
            SquareExcerptTextView squareExcerptTextView = textView3 instanceof SquareExcerptTextView ? (SquareExcerptTextView) textView3 : null;
            if (squareExcerptTextView != null) {
                squareExcerptTextView.requestLayout();
            }
            TextView textView4 = this.i;
            if (textView4 != null) {
                textView4.setVisibility(str != null ? 0 : 8);
            }
            TextView textView5 = this.i;
            if (textView5 != null) {
                textView5.setText(str);
            }
            VKImageView vKImageView = this.k;
            if (vKImageView != null) {
                Serializer.c<Owner> cVar = Owner.CREATOR;
                Image image = catalogSearchEntityVideoPlaylist.f;
                if (image == null) {
                    image = videoAlbum.h;
                }
                String a2 = Owner.a.a(e3m.a(R.dimen.catalog_search_entity_video_playlist_item_width, vKImageView.getContext()), image);
                if (a2 != null) {
                    vKImageView.setVisibility(0);
                    vKImageView.setPlaceholderColor(dhr0.t.c(R.attr.vk_ui_image_placeholder));
                    vKImageView.load(a2);
                } else {
                    vKImageView.setVisibility(8);
                }
            }
            VkButton vkButton = this.m;
            boolean z = (vkButton == null || uIBlockSearchEntityVideoPlaylist2.A == null) ? false : true;
            if (vkButton != null) {
                vkButton.setVisibility(z ? 0 : 8);
                if (z && (uIBlockSearchEntityVideoPlaylist = this.n) != null && uIBlockSearchEntityVideoPlaylist.A != null) {
                    vkButton.setText(R.string.search_entity_answer_play_video);
                    vkButton.a5(true, Integer.valueOf(R.drawable.vk_icon_play_16));
                }
            }
            VkButton vkButton2 = this.l;
            if (vkButton2 != null) {
                UIBlockActionToggleAlbumSubscription uIBlockActionToggleAlbumSubscription = uIBlockSearchEntityVideoPlaylist2.z;
                boolean z2 = videoAlbum.l;
                int i = z2 ? R.drawable.vk_icon_done_16 : R.drawable.vk_icon_add_16;
                int i2 = R.string.search_entity_answer_not_subscribed;
                int i3 = z2 ? R.string.search_entity_answer_subscribed : R.string.search_entity_answer_not_subscribed;
                if (z2) {
                    i2 = R.string.search_entity_answer_subscribed_accessibility;
                }
                vkButton2.setVisibility(uIBlockActionToggleAlbumSubscription != null ? 0 : 8);
                if (uIBlockActionToggleAlbumSubscription != null) {
                    Integer valueOf = Integer.valueOf(i);
                    int[] iArr = VkButton.W;
                    vkButton2.a5(true, valueOf);
                    vkButton2.setText(z ? null : vkButton2.getContext().getResources().getString(i3));
                    vkButton2.setContentDescription(vkButton2.getContext().getResources().getString(i2));
                    vkButton2.setOnClickListener(new v9b(this, 9));
                }
            }
            View view2 = this.j;
            if (view2 != null) {
                view2.setOnClickListener(new k6p(this, 6));
            }
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.f, viewGroup, false);
        TextView textView = (TextView) inflate.findViewById(R.id.title);
        this.h = textView;
        SquareExcerptTextView squareExcerptTextView = textView instanceof SquareExcerptTextView ? (SquareExcerptTextView) textView : null;
        if (squareExcerptTextView != null) {
            squareExcerptTextView.setShowMoreText("");
            squareExcerptTextView.setMaxExcerptLines(squareExcerptTextView.getMaxLines());
            squareExcerptTextView.setShouldTruncate(true);
            squareExcerptTextView.setEllipsize(TextUtils.TruncateAt.END);
        }
        this.i = (TextView) inflate.findViewById(R.id.subtitle);
        this.k = (VKImageView) inflate.findViewById(R.id.avatar);
        this.l = (VkButton) inflate.findViewById(R.id.follow_button);
        VkButton vkButton = (VkButton) inflate.findViewById(R.id.play_button);
        this.m = vkButton;
        this.j = inflate;
        if (vkButton != null) {
            vkButton.setOnClickListener(new bn1(this, 12));
        }
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
