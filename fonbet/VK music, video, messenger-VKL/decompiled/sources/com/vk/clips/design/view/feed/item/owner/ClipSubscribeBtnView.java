package com.vk.clips.design.view.feed.item.owner;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.View;
import com.vk.core.view.components.text.VkText;
import com.vk.movika.sdk.base.observable.o;
import com.vk.movika.sdk.base.observable.p;
import com.vkontakte.android.R;
import xsna.bwt0;
import xsna.h3d;
import xsna.j8;
import xsna.mgz;
import xsna.ucd;
import xsna.vcd;
import xsna.wcd;
import xsna.xcd;

/* compiled from: ClipSubscribeBtnView.kt */
/* loaded from: classes16.dex */
public final class ClipSubscribeBtnView extends VkText implements vcd {
    public static final /* synthetic */ int c = 0;
    public ucd b;

    public ClipSubscribeBtnView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBackgroundTintMode(PorterDuff.Mode.DST_OVER);
        bwt0.i0(this, new o(this, 18));
    }

    @Override // xsna.rr6
    public Context getViewContext() {
        return getContext();
    }

    @Override // xsna.vcd
    public final void n3(boolean z) {
        setText(getContext().getString(R.string.clips_subscribe));
        p pVar = z ? new p(this, 24) : null;
        bwt0.h0(pVar != null ? new wcd(pVar, 0) : null, this);
        setVisibility(z ? 0 : 8);
    }

    @Override // xsna.rr6
    public ucd getPresenter() {
        return this.b;
    }

    @Override // xsna.rr6
    public void setPresenter(ucd ucdVar) {
        this.b = ucdVar;
    }

    /* compiled from: ClipSubscribeBtnView.kt */
    public static final class a implements ucd {
        public final h3d b;
        public final vcd c;
        public mgz d;

        public a(h3d h3dVar, vcd vcdVar) {
            this.b = h3dVar;
            this.c = vcdVar;
        }

        @Override // xsna.ucd
        public final void V() {
            Context context;
            h3d h3dVar = this.b;
            if ((h3dVar == null || (context = h3dVar.getContext()) == null || !j8.d(context)) && h3dVar != null) {
                h3dVar.Bd(new xcd(this, 0));
            }
        }

        @Override // xsna.pk6
        public final void start() {
        }
    }

    @Override // xsna.rr6
    public View getView() {
        return this;
    }

    @Override // xsna.rr6
    public final void pause() {
    }

    @Override // xsna.rr6
    public final void release() {
    }

    @Override // xsna.rr6
    public final void resume() {
    }
}
