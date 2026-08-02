package com.vk.libvideo.bottomsheet.about.delegate;

import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vkontakte.android.R;
import java.text.DecimalFormat;
import kotlin.LazyThreadSafetyMode;
import xsna.axj;
import xsna.hfz;
import xsna.jai;
import xsna.msy;
import xsna.mut0;
import xsna.p1u0;
import xsna.rl3;
import xsna.vfz;
import xsna.vxj;
import xsna.wh50;
import xsna.x5;
import xsna.y5;
import xsna.zak0;

/* compiled from: AboutVideoCounterVkUiDelegate.kt */
/* loaded from: classes2.dex */
public final class e extends p1u0<AboutVideoItem.d0> {
    public final boolean a;
    public final Object b = msy.a(LazyThreadSafetyMode.NONE, new x5(0));

    /* compiled from: AboutVideoCounterVkUiDelegate.kt */
    public final class a extends vfz<AboutVideoItem.d0> {
        public final wh50 l;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a(ViewGroup viewGroup) {
            super(r4);
            ComposeView composeView = new ComposeView(viewGroup.getContext(), null, 6);
            composeView.setViewCompositionStrategy(mut0.c.a);
            composeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            ComposeView composeView2 = (ComposeView) this.itemView;
            this.l = androidx.compose.runtime.k.b(null);
            composeView2.setContent(new jai(-407890849, new y5(this, 0), true));
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.vfz
        /* renamed from: W5 */
        public final void i6(AboutVideoItem.d0 d0Var) {
            int i;
            AboutVideoItem.d0 d0Var2 = d0Var;
            ?? r0 = e.this.b;
            AboutVideoItem.d0.a aVar = d0Var2.c;
            int i2 = d0Var2.b;
            AboutVideoItem.d0.b bVar = aVar.a;
            axj axjVar = null;
            AboutVideoItem.d0.b.C1216b c1216b = bVar instanceof AboutVideoItem.d0.b.C1216b ? (AboutVideoItem.d0.b.C1216b) bVar : null;
            Integer valueOf = (c1216b != null && (i = c1216b.a) >= 0) ? Integer.valueOf(i) : null;
            if (valueOf != null) {
                int intValue = valueOf.intValue();
                axjVar = new axj(((DecimalFormat) r0.getValue()).format(Integer.valueOf(intValue)), this.itemView.getResources().getQuantityString(R.plurals.likes, intValue, Integer.valueOf(intValue)));
            }
            ((zak0) this.l).setValue(new vxj(rl3.I(new axj[]{axjVar, new axj(((DecimalFormat) r0.getValue()).format(Integer.valueOf(i2)), this.itemView.getResources().getQuantityString(R.plurals.views, i2, Integer.valueOf(i2)))})));
        }
    }

    public e(boolean z) {
        this.a = z;
    }

    @Override // xsna.p1u0
    public final vfz<? extends AboutVideoItem.d0> b(ViewGroup viewGroup) {
        return new a(viewGroup);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return (hfzVar instanceof AboutVideoItem.d0) && this.a;
    }
}
