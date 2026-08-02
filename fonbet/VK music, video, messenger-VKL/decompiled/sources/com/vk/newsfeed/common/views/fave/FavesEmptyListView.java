package com.vk.newsfeed.common.views.fave;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.core.view.links.LinkedTextView;
import com.vkontakte.android.R;
import xsna.iah0;
import xsna.phl;

/* compiled from: FavesEmptyListView.kt */
/* loaded from: classes4.dex */
public final class FavesEmptyListView extends phl {
    public FavesEmptyListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // xsna.phl
    public final void a(Context context) {
        setOrientation(1);
        setGravity(1);
        LayoutInflater.from(context).inflate(R.layout.fave_empty_footer_view, (ViewGroup) this, true);
        int a = iah0.a(64);
        setPaddingRelative(0, a, 0, a);
        this.b = (TextView) findViewById(R.id.tv_empty_list_title);
        this.c = (TextView) findViewById(R.id.tv_empty_list_button);
    }

    public final LinkedTextView getTitleView() {
        return (LinkedTextView) this.b;
    }
}
