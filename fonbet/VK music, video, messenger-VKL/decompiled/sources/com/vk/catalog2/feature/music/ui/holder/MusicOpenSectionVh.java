package com.vk.catalog2.feature.music.ui.holder;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenSection;
import com.vk.catalog2.common.ui.holders.SimpleTextIconButtonVh;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.feature.music.configuration.b;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vkontakte.android.R;
import xsna.b5a;
import xsna.bwt0;
import xsna.cfp0;
import xsna.nda;

/* compiled from: MusicOpenSectionVh.kt */
/* loaded from: classes16.dex */
public final class MusicOpenSectionVh extends SimpleTextIconButtonVh {
    public final b i;
    public final nda j;
    public final b5a k;
    public final SearchStatInfoProvider l;

    public MusicOpenSectionVh(b bVar, nda ndaVar, b5a b5aVar, SearchStatInfoProvider searchStatInfoProvider, int i) {
        super(i, R.layout.catalog_music_action_big_btn, 10);
        this.i = bVar;
        this.j = ndaVar;
        this.k = b5aVar;
        this.l = searchStatInfoProvider;
    }

    @Override // com.vk.catalog2.common.ui.holders.SimpleTextIconButtonVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        super.N6(uIBlock);
        TextView textView = this.f;
        if (textView == null) {
            textView = null;
        }
        UIBlockActionOpenSection uIBlockActionOpenSection = uIBlock instanceof UIBlockActionOpenSection ? (UIBlockActionOpenSection) uIBlock : null;
        textView.setText(uIBlockActionOpenSection != null ? uIBlockActionOpenSection.z : null);
        TextView textView2 = this.f;
        bwt0.Q(textView2 != null ? textView2 : null, R.id.catalog_ui_test_add_radio_station, uIBlock.b);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Context context;
        if (view == null || (context = view.getContext()) == null) {
            return;
        }
        UIBlockAction uIBlockAction = this.h;
        UIBlockActionOpenSection uIBlockActionOpenSection = uIBlockAction instanceof UIBlockActionOpenSection ? (UIBlockActionOpenSection) uIBlockAction : null;
        if (uIBlockActionOpenSection != null) {
            SearchStatsLoggingInfo b = this.l.b(SchemeStat$EventItem.Type.CATALOG_ITEM, "", true);
            this.k.a(new cfp0(uIBlockActionOpenSection, null));
            nda.e(this.j, context, this.i, uIBlockActionOpenSection.B, uIBlockActionOpenSection.z, null, b, null, PsExtractor.AUDIO_STREAM);
        }
    }
}
