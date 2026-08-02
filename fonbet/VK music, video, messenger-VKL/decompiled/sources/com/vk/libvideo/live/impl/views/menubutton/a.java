package com.vk.libvideo.live.impl.views.menubutton;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.libvideo.live.impl.views.menubutton.MenuButtonNewView;
import com.vkontakte.android.R;
import xsna.dhr0;
import xsna.e3m;
import xsna.hkp;
import xsna.s770;

/* compiled from: MenuButtonNewView.kt */
/* loaded from: classes3.dex */
public final class a extends s770 {
    public final /* synthetic */ Context c;

    public a(Context context) {
        this.c = context;
    }

    @Override // xsna.s770
    public final void m(hkp hkpVar, Object obj, int i) {
        MenuButtonNewView.a aVar = (MenuButtonNewView.a) obj;
        ((TextView) hkpVar.f(R.id.action_text)).setText(aVar.j());
        CharSequence k = aVar.k();
        if (k != null) {
            SpannableString spannableString = new SpannableString(" (" + k + ")");
            dhr0.a.getClass();
            spannableString.setSpan(new ForegroundColorSpan(e3m.f(R.attr.vk_ui_text_secondary, dhr0.s())), 0, spannableString.length(), 33);
            ((TextView) hkpVar.f(R.id.action_text)).append(spannableString);
        }
        ((ImageView) hkpVar.f(R.id.action_icon)).setImageResource(aVar.h());
    }

    @Override // xsna.s770
    public final hkp p(View view) {
        hkp hkpVar = new hkp(7);
        hkpVar.d(view.findViewById(R.id.action_text));
        View findViewById = view.findViewById(R.id.action_icon);
        ImageView imageView = (ImageView) findViewById;
        imageView.setColorFilter(e3m.f(R.attr.vk_ui_action_sheet_text, this.c));
        imageView.setVisibility(0);
        hkpVar.d(findViewById);
        return hkpVar;
    }
}
