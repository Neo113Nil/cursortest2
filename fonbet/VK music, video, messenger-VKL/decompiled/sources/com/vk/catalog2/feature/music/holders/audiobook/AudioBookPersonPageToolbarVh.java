package com.vk.catalog2.feature.music.holders.audiobook;

import android.content.Context;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.CatalogClickableViewHolder;
import com.vk.catalog2.feature.music.dto.ui.UIBlockAudioBookPerson;
import com.vk.dto.music.audiobook.AudioBookPersonRole;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.b5a;
import xsna.c98;
import xsna.f4m;
import xsna.h15;
import xsna.mba;
import xsna.too0;

/* compiled from: AudioBookPersonPageToolbarVh.kt */
/* loaded from: classes16.dex */
public final class AudioBookPersonPageToolbarVh extends CatalogClickableViewHolder implements too0, View.OnClickListener {
    public final h15 e;
    public ImageView f;
    public TextView g;
    public TextView h;

    /* compiled from: AudioBookPersonPageToolbarVh.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AudioBookPersonRole.values().length];
            try {
                iArr[AudioBookPersonRole.AUTHOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AudioBookPersonRole.NARRATOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AudioBookPersonPageToolbarVh(mba mbaVar, b5a b5aVar) {
        super(mbaVar, b5aVar);
        this.e = new h15();
    }

    @Override // xsna.too0
    public final void Ng() {
        this.e.Ng();
    }

    @Override // com.vk.catalog2.common.ui.holders.CatalogClickableViewHolder
    public final void b(UIBlock uIBlock) {
        int i;
        Context context;
        if (uIBlock instanceof UIBlockAudioBookPerson) {
            TextView textView = this.g;
            if (textView != null) {
                int i2 = a.$EnumSwitchMapping$0[((UIBlockAudioBookPerson) uIBlock).y.Ab().ordinal()];
                if (i2 == 1) {
                    i = R.string.audiobook_person_author_toolbar;
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = R.string.audiobook_person_narrator_toolbar;
                }
                TextView textView2 = this.g;
                textView.setText((textView2 == null || (context = textView2.getContext()) == null) ? null : context.getString(i));
            }
            TextView textView3 = this.h;
            if (textView3 != null) {
                textView3.setText(((UIBlockAudioBookPerson) uIBlock).y.c);
            }
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Toolbar toolbar = (Toolbar) layoutInflater.inflate(R.layout.catalog_audiobook_person_toolbar, viewGroup, false);
        this.g = (TextView) toolbar.findViewById(R.id.title);
        this.h = (TextView) toolbar.findViewById(R.id.subtitle);
        h15 h15Var = this.e;
        LayerDrawable layerDrawable = h15Var.e;
        TextView textView = this.g;
        if (textView != null) {
            f4m.r(layerDrawable.getIntrinsicWidth() * 2, textView);
        }
        TextView textView2 = this.h;
        if (textView2 != null) {
            f4m.r(layerDrawable.getIntrinsicWidth() * 2, textView2);
        }
        toolbar.setNavigationIcon(layerDrawable);
        toolbar.setNavigationContentDescription(R.string.vk_accessibility_back);
        ImageView imageView = (ImageView) toolbar.findViewById(R.id.icon_menu);
        this.f = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(h15Var.d);
        }
        ImageView imageView2 = this.f;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new c98(this, 1));
        }
        toolbar.setNavigationOnClickListener(new c98(this, 1));
        return toolbar;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
    }
}
