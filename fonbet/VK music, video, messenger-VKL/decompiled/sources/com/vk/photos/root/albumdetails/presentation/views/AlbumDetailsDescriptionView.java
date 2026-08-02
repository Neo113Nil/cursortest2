package com.vk.photos.root.albumdetails.presentation.views;

import android.content.Context;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import android.text.style.TextAppearanceSpan;
import android.util.AttributeSet;
import android.view.View;
import com.vk.core.view.links.LinkedTextView;
import com.vk.movika.sdk.base.ui.t;
import com.vkontakte.android.R;
import xsna.bpn0;
import xsna.drm0;
import xsna.epx;
import xsna.lfo0;
import xsna.qaz;
import xsna.qdz;
import xsna.w8i;

/* compiled from: AlbumDetailsDescriptionView.kt */
/* loaded from: classes4.dex */
public final class AlbumDetailsDescriptionView extends LinkedTextView implements w8i {
    public static final /* synthetic */ int q = 0;
    public final String k;
    public final lfo0 l;
    public boolean m;
    public CharSequence n;
    public final bpn0 o;
    public a p;

    /* compiled from: AlbumDetailsDescriptionView.kt */
    public interface a {
        void a();
    }

    /* compiled from: AlbumDetailsDescriptionView.kt */
    public static final class b extends qaz {
        public b() {
            super("", 0);
        }

        @Override // xsna.qaz, xsna.rku0
        public final void f(Context context, View view) {
            a showMoreClickListener = AlbumDetailsDescriptionView.this.getShowMoreClickListener();
            if (showMoreClickListener != null) {
                showMoreClickListener.a();
            }
        }
    }

    public AlbumDetailsDescriptionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        String string = context.getString(R.string.album_details_description_show_more);
        this.k = string;
        lfo0 lfo0Var = new lfo0(this);
        lfo0Var.c = string;
        this.l = lfo0Var;
        this.o = new bpn0(new t(this, 2));
    }

    private final qdz getLinksBridge() {
        return (qdz) this.o.getValue();
    }

    private final void setSpansTo(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length() - drm0.p0(this.k).toString().length();
        int length2 = spannableStringBuilder.length();
        b bVar = new b();
        spannableStringBuilder.setSpan(new TextAppearanceSpan(getContext(), R.style.PhotosRoot_AlbumDescriptionShowMoreTextAppearance), length, length2, 33);
        spannableStringBuilder.setSpan(bVar, length, length2, 33);
    }

    public final void b(int i) {
        lfo0 lfo0Var = this.l;
        boolean z = (lfo0Var.e == i && epx.f(this.n, lfo0Var.b)) ? false : true;
        if (i <= 0 || !z) {
            return;
        }
        CharSequence b2 = lfo0.b(lfo0Var, i, 0, 6);
        if ((b2 instanceof SpannableStringBuilder) && drm0.F(b2, this.k)) {
            this.m = true;
            setSpansTo((SpannableStringBuilder) b2);
        } else {
            this.m = false;
            b2 = lfo0Var.b;
        }
        setText(b2);
        this.n = lfo0Var.b;
    }

    public final a getShowMoreClickListener() {
        return this.p;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        b(View.MeasureSpec.getSize(i));
        super.onMeasure(i, i2);
    }

    public final void setDescription(String str) {
        this.l.b = getLinksBridge().a().m(str);
        b(getWidth());
    }

    public final void setShowMoreClickListener(a aVar) {
        this.p = aVar;
    }

    @Override // com.vk.core.view.components.text.links.VkLinkedText, com.vk.core.view.components.text.links.a.InterfaceC0867a
    public View getView() {
        return this;
    }

    @Override // com.vk.core.view.components.text.links.VkLinkedText, com.vk.core.view.components.text.links.a.InterfaceC0867a
    public final void a(RectF rectF, float f) {
    }
}
