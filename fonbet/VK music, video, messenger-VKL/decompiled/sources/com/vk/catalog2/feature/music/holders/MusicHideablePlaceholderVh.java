package com.vk.catalog2.feature.music.holders;

import android.graphics.Rect;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockPlaceholder;
import com.vk.catalog2.common.dto.ui.actions.UIBlockHideBlockButton;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.disposables.c;
import java.util.Iterator;
import kotlin.LazyThreadSafetyMode;
import xsna.c98;
import xsna.itg0;
import xsna.msy;
import xsna.q3a;
import xsna.rsg0;
import xsna.sv0;
import xsna.wga;
import xsna.xxf0;
import xsna.yfb;

/* compiled from: MusicHideablePlaceholderVh.kt */
/* loaded from: classes16.dex */
public final class MusicHideablePlaceholderVh implements CatalogViewHolder, View.OnClickListener {
    public final q3a b;
    public final Object c = msy.a(LazyThreadSafetyMode.NONE, new sv0(26));
    public View d;
    public TextView e;
    public TextView f;
    public TextView g;
    public UIBlockPlaceholder h;
    public c i;

    public MusicHideablePlaceholderVh(q3a q3aVar) {
        this.b = q3aVar;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        c cVar = this.i;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        if (uIBlock instanceof UIBlockPlaceholder) {
            UIBlockPlaceholder uIBlockPlaceholder = (UIBlockPlaceholder) uIBlock;
            this.h = uIBlockPlaceholder;
            TextView textView = this.e;
            if (textView == null) {
                textView = null;
            }
            textView.setText(uIBlockPlaceholder.I);
            TextView textView2 = this.f;
            if (textView2 == null) {
                textView2 = null;
            }
            textView2.setText(uIBlockPlaceholder.A);
            TextView textView3 = this.g;
            if (textView3 == null) {
                textView3 = null;
            }
            String str = uIBlockPlaceholder.D;
            textView3.setText(str != null ? Html.fromHtml(str, 0) : null);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog2_music_hideable_placeholder, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.music_hideable_placeholder_image_hide);
        findViewById.setOnClickListener(new c98(this, 1));
        this.d = findViewById;
        this.e = (TextView) inflate.findViewById(R.id.music_hideable_placeholder_text_emoji);
        this.f = (TextView) inflate.findViewById(R.id.music_hideable_placeholder_text_title);
        this.g = (TextView) inflate.findViewById(R.id.music_hideable_placeholder_text_description);
        return inflate;
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj;
        UIBlockPlaceholder uIBlockPlaceholder = this.h;
        if (uIBlockPlaceholder == null || view == null || view.getId() != R.id.music_hideable_placeholder_image_hide) {
            return;
        }
        Iterator<T> it = uIBlockPlaceholder.G.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (obj instanceof UIBlockHideBlockButton) {
                    break;
                }
            }
        }
        if (!(obj instanceof UIBlockHideBlockButton)) {
            obj = null;
        }
        UIBlockHideBlockButton uIBlockHideBlockButton = (UIBlockHideBlockButton) obj;
        if (uIBlockHideBlockButton != null) {
            this.i = itg0.m(rsg0.y0(yfb.x(((wga) this.c.getValue()).m(uIBlockHideBlockButton.A, null)), null, null, 3));
            this.b.b(new xxf0(uIBlockPlaceholder.z), false);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
        N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return false;
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
