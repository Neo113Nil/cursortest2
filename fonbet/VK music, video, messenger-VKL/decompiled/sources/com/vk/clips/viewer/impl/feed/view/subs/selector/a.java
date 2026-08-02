package com.vk.clips.viewer.impl.feed.view.subs.selector;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.clips.viewer.impl.feed.view.subs.selector.ClipsAutoSubtitlesBottomSheet;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.dhr0;
import xsna.hkp;
import xsna.s770;

/* compiled from: ClipsAutoSubtitlesBottomSheet.kt */
/* loaded from: classes17.dex */
public final class a extends s770 {
    public final /* synthetic */ Context c;

    public a(Context context) {
        this.c = context;
    }

    @Override // xsna.s770
    public final void m(hkp hkpVar, Object obj, int i) {
        String string;
        ClipsAutoSubtitlesBottomSheet.a aVar = (ClipsAutoSubtitlesBottomSheet.a) obj;
        TextView textView = (TextView) hkpVar.f(R.id.action_text);
        int i2 = ClipsAutoSubtitlesBottomSheet.a.C0711a.$EnumSwitchMapping$0[aVar.a.ordinal()];
        Context context = this.c;
        if (i2 == 1) {
            string = context.getString(R.string.clips_auto_subtitles_setting_enabled);
        } else if (i2 == 2) {
            string = context.getString(R.string.clips_auto_subtitles_setting_disabled);
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            string = context.getString(R.string.clips_auto_subtitles_setting_mute_only);
        }
        textView.setText(string);
        ((ImageView) hkpVar.f(R.id.action_check_icon)).setVisibility(aVar.b ? 0 : 8);
    }

    @Override // xsna.s770
    public final hkp p(View view) {
        hkp hkpVar = new hkp(7);
        hkpVar.d(view.findViewById(R.id.action_text));
        View findViewById = view.findViewById(R.id.action_check_icon);
        ImageView imageView = (ImageView) findViewById;
        imageView.setImageResource(R.drawable.vk_icon_check_circle_on_24);
        imageView.setColorFilter(dhr0.Y(R.attr.vk_ui_icon_accent, view.getContext()));
        hkpVar.d(findViewById);
        return hkpVar;
    }
}
