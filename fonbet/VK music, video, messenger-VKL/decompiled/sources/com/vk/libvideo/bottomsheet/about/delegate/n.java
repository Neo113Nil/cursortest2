package com.vk.libvideo.bottomsheet.about.delegate;

import android.text.method.LinkMovementMethod;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vkontakte.android.R;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.arm0;
import xsna.bwt0;
import xsna.c4;
import xsna.drm0;
import xsna.hfz;
import xsna.j5g;
import xsna.lfo0;
import xsna.p1u0;
import xsna.vfz;
import xsna.z6;

/* compiled from: AboutVideoInfoDelegate.kt */
/* loaded from: classes2.dex */
public final class n extends p1u0<AboutVideoItem.o> {
    public final c4 a;
    public final boolean b;
    public final boolean c;

    /* compiled from: AboutVideoInfoDelegate.kt */
    public static final class a extends vfz<AboutVideoItem.o> {
        public final c4 l;
        public final boolean m;
        public final boolean n;
        public final TextView o;
        public final lfo0 p;

        public a(ViewGroup viewGroup, c4 c4Var, boolean z, boolean z2) {
            super(bwt0.I(R.layout.video_about_info, viewGroup, false));
            this.l = c4Var;
            this.m = z;
            this.n = z2;
            TextView textView = (TextView) this.itemView.findViewById(R.id.text);
            this.o = textView;
            this.p = new lfo0(textView);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            textView.setHighlightColor(0);
        }

        public static int h6(String str) {
            List c0 = drm0.c0(str, new String[]{StringUtils.PROCESS_POSTFIX_DELIMITER}, 0, 6);
            ArrayList arrayList = new ArrayList();
            Iterator it = c0.iterator();
            while (it.hasNext()) {
                Integer m = arm0.m(10, (String) it.next());
                if (m != null) {
                    arrayList.add(m);
                }
            }
            List y0 = j5g.y0(arrayList);
            Integer num = (Integer) j5g.b0(0, y0);
            int intValue = num != null ? num.intValue() : 0;
            Integer num2 = (Integer) j5g.b0(1, y0);
            int intValue2 = num2 != null ? num2.intValue() : 0;
            Integer num3 = (Integer) j5g.b0(2, y0);
            return ((num3 != null ? num3.intValue() : 0) * 3600) + (intValue2 * 60) + intValue;
        }

        @Override // xsna.vfz
        public final void W5(AboutVideoItem.o oVar) {
            this.itemView.post(new z6(0, this, oVar));
        }
    }

    public n(c4 c4Var, boolean z, boolean z2) {
        this.a = c4Var;
        this.b = z;
        this.c = z2;
    }

    @Override // xsna.p1u0
    public final vfz<? extends AboutVideoItem.o> b(ViewGroup viewGroup) {
        return new a(viewGroup, this.a, this.c, this.b);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return (hfzVar instanceof AboutVideoItem.o) && !this.c;
    }
}
