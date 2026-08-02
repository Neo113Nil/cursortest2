package com.vk.catalog2.common.ui.mvp.holder.clip;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.huawei.hms.framework.common.BundleUtil;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.catalog2.common.dto.api.link.CatalogLink;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockLink;
import com.vk.catalog2.common.ui.holders.ActionVh;
import com.vk.catalog2.common.ui.holders.analytics.MusicAnalyticsInfo;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicPlaylist;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.imageloader.view.VKImageView;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vkontakte.android.R;
import java.util.ArrayList;
import xsna.bwt0;
import xsna.c98;
import xsna.cfp0;
import xsna.drm0;
import xsna.j5g;
import xsna.nda;
import xsna.u4a;
import xsna.xe9;

/* compiled from: ClipsMusicSelectorCatalogCategoriesVh.kt */
/* loaded from: classes16.dex */
public final class ClipsMusicSelectorCatalogCategoriesVh extends ActionVh {
    public final u4a b;
    public UIBlockLink c;
    public VKImageView d;
    public TextView e;

    public ClipsMusicSelectorCatalogCategoriesVh(u4a u4aVar) {
        this.b = u4aVar;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        if (uIBlock instanceof UIBlockLink) {
            UIBlockLink uIBlockLink = (UIBlockLink) uIBlock;
            CatalogLink catalogLink = uIBlockLink.y;
            this.c = uIBlockLink;
            Image image = catalogLink.f;
            VKImageView vKImageView = this.d;
            if (vKImageView != null) {
                bwt0.L(vKImageView, image);
            }
            TextView textView = this.e;
            if (textView != null) {
                textView.setText(catalogLink.c);
            }
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog_music_categories_button, viewGroup, false);
        this.d = (VKImageView) inflate.findViewById(android.R.id.icon);
        this.e = (TextView) inflate.findViewById(android.R.id.text1);
        inflate.setOnClickListener(new c98(this, 1));
        return inflate;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Context context;
        UIBlockLink uIBlockLink = this.c;
        if (uIBlockLink == null) {
            return;
        }
        CatalogLink catalogLink = uIBlockLink.y;
        if (view == null || (context = view.getContext()) == null) {
            return;
        }
        u4a u4aVar = this.b;
        u4a.a aVar = u4aVar.b;
        u4a.a aVar2 = u4aVar.b;
        SearchStatInfoProvider searchStatInfoProvider = aVar.m;
        SchemeStat$EventItem.Type type = SchemeStat$EventItem.Type.PLAYLIST;
        String r = uIBlockLink.r();
        if (r == null) {
            r = "";
        }
        SearchStatsLoggingInfo b = searchStatInfoProvider.b(type, r, true);
        aVar2.f.a(new cfp0(uIBlockLink, null));
        String str = catalogLink.e;
        String str2 = catalogLink.e;
        String str3 = catalogLink.c;
        if (drm0.D(str, "audio_clips?section=", false)) {
            aVar2.f.a(new cfp0(uIBlockLink, new MusicAnalyticsInfo(MusicAnalyticsInfo.ClickTarget.Open)));
            nda ndaVar = aVar2.b;
            CatalogConfiguration catalogConfiguration = aVar2.s;
            Serializer.c<UIBlockMusicPlaylist> cVar = UIBlockMusicPlaylist.CREATOR;
            StringBuilder a = xe9.a("synthetic_clips_audio_playlist_blockId=", uIBlockLink.b, "_title=", str3, "_url=");
            a.append(str2);
            nda.e(ndaVar, context, catalogConfiguration, a.toString(), catalogLink.c, null, b, null, PsExtractor.AUDIO_STREAM);
            return;
        }
        String str4 = (String) j5g.k0(drm0.b0(str2, new char[]{'/'}, 0, 6));
        if (str4 != null) {
            ArrayList arrayList = new ArrayList(drm0.c0(str4, new String[]{BundleUtil.UNDERLINE_TAG}, 0, 6));
            String str5 = (String) j5g.a0(arrayList);
            arrayList.remove(0);
            String str6 = (String) j5g.a0(arrayList);
            arrayList.remove(0);
            String str7 = (String) j5g.a0(arrayList);
            arrayList.remove(0);
            aVar2.f.a(new cfp0(uIBlockLink, new MusicAnalyticsInfo(MusicAnalyticsInfo.ClickTarget.Open)));
            String str8 = str5;
            nda ndaVar2 = aVar2.b;
            CatalogConfiguration catalogConfiguration2 = aVar2.s;
            Serializer.c<UIBlockMusicPlaylist> cVar2 = UIBlockMusicPlaylist.CREATOR;
            StringBuilder sb = new StringBuilder("synthetic_playlist");
            if (str8 == null) {
                str8 = "";
            }
            sb.append(str8);
            sb.append('_');
            if (str6 == null) {
                str6 = "";
            }
            sb.append(str6);
            sb.append('_');
            if (str7 == null) {
                str7 = "";
            }
            sb.append(str7);
            sb.append('_');
            sb.append(str3 != null ? str3 : "");
            nda.e(ndaVar2, context, catalogConfiguration2, sb.toString(), catalogLink.c, null, b, null, PsExtractor.AUDIO_STREAM);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
    }
}
