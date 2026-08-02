package com.vk.content.design.view.photo.albums;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.vk.movika.sdk.base.logic.interactor.p;
import com.vkontakte.android.R;
import xsna.bn1;
import xsna.bwt0;
import xsna.cn70;

/* compiled from: AlbumsHeaderView.kt */
/* loaded from: classes17.dex */
public final class AlbumsHeaderView extends LinearLayout {
    public final View b;
    public final View c;
    public a d;

    /* compiled from: AlbumsHeaderView.kt */
    public interface a {
        void a();

        void b();
    }

    public AlbumsHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        View.inflate(context, R.layout.albums_header_view, this);
        setGravity(16);
        setPadding(cn70.b(0), cn70.b(0), cn70.b(8), cn70.b(0));
        View findViewById = findViewById(R.id.tv_add_album);
        this.b = findViewById;
        View findViewById2 = findViewById(R.id.iv_settings);
        this.c = findViewById2;
        bwt0.p0(findViewById, true);
        bwt0.i0(findViewById, new p(this, 3));
        findViewById2.setOnClickListener(new bn1(this, 0));
    }

    public final a getListener() {
        return this.d;
    }

    public final void setListener(a aVar) {
        this.d = aVar;
    }
}
