package com.vk.narratives.impl.highlights;

import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.imageloader.view.VKImageView;
import com.vk.narratives.impl.highlights.HighlightChooseCoverFragment;
import xsna.b780;

/* compiled from: HighlightChooseCoverFragment.kt */
/* loaded from: classes3.dex */
public final class a implements b780 {
    public final /* synthetic */ HighlightChooseCoverFragment.a b;

    public a(HighlightChooseCoverFragment.a aVar) {
        this.b = aVar;
    }

    @Override // xsna.b780
    public final void t(int i, int i2, String str) {
        VKImageView vKImageView = this.b.o;
        ViewGroup.LayoutParams layoutParams = vKImageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(':');
        sb.append(i2);
        bVar.G = sb.toString();
        vKImageView.setLayoutParams(bVar);
    }

    @Override // xsna.b780
    public final void g(String str) {
    }

    @Override // xsna.b780
    public final void onCancel(String str) {
    }

    @Override // xsna.b780
    public final void b(String str, Throwable th) {
    }
}
