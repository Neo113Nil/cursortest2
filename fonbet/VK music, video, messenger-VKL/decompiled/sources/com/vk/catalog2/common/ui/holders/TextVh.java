package com.vk.catalog2.common.ui.holders;

import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.ironsource.X3;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockText;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vkontakte.android.R;
import xsna.bwt0;
import xsna.dhr0;
import xsna.epx;
import xsna.ey2;
import xsna.mn9;
import xsna.q3a;
import xsna.r8a;

/* compiled from: TextVh.kt */
/* loaded from: classes16.dex */
public final class TextVh implements CatalogViewHolder {
    public final r8a b;
    public final q3a c;
    public TextView d;
    public TextView e;
    public boolean f;
    public UIBlockText g;
    public final mn9 h = new mn9(this, 9);

    public TextVh(r8a r8aVar, q3a q3aVar) {
        this.b = r8aVar;
        this.c = q3aVar;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        if (uIBlock instanceof UIBlockText) {
            UIBlockText uIBlockText = this.g;
            String str = uIBlockText != null ? uIBlockText.y : null;
            UIBlockText uIBlockText2 = (UIBlockText) uIBlock;
            String str2 = uIBlockText2.z;
            String str3 = uIBlockText2.C;
            if (!epx.f(str, uIBlockText2.y)) {
                this.f = false;
            }
            this.g = uIBlockText2;
            TextView textView = this.d;
            if (textView == null) {
                textView = null;
            }
            ey2.i(textView, uIBlockText2.A);
            if (epx.f(str3, X3.i.Y) || epx.f(str3, "secondary_small")) {
                TextView textView2 = this.e;
                if (textView2 == null) {
                    textView2 = null;
                }
                textView2.setTextColor(dhr0.t.c(R.attr.vk_ui_text_secondary));
                TextView textView3 = this.e;
                if (textView3 == null) {
                    textView3 = null;
                }
                textView3.setTextSize(epx.f(str3, "secondary_small") ? 13.0f : 16.0f);
            } else {
                TextView textView4 = this.e;
                if (textView4 == null) {
                    textView4 = null;
                }
                textView4.setTextColor(dhr0.t.c(R.attr.vk_ui_text_primary));
                TextView textView5 = this.e;
                if (textView5 == null) {
                    textView5 = null;
                }
                textView5.setTextSize(15.0f);
            }
            if (str2 == null || str2.length() == 0) {
                TextView textView6 = this.e;
                bwt0.p0(textView6 != null ? textView6 : null, false);
                return;
            }
            r8a r8aVar = this.b;
            CharSequence a = r8aVar.a(str2);
            if (!this.f) {
                a = r8aVar.b(a, this.h, Math.min(1.0f, Math.abs(uIBlockText2.B) * 0.175f));
            }
            TextView textView7 = this.e;
            if (textView7 == null) {
                textView7 = null;
            }
            if (!TextUtils.equals(a, textView7.getText())) {
                TextView textView8 = this.e;
                if (textView8 == null) {
                    textView8 = null;
                }
                textView8.setText(a);
            }
            TextView textView9 = this.e;
            bwt0.p0(textView9 != null ? textView9 : null, true);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.catalog_text_banner, viewGroup, false);
        this.d = (TextView) viewGroup2.findViewById(R.id.text_block_header);
        this.e = (TextView) viewGroup2.findViewById(R.id.text_block_text);
        return viewGroup2;
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
