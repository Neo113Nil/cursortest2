package com.vk.channels.impl.channel_screen.footer;

import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatTextView;
import com.pnikosis.materialishprogress.ProgressWheel;
import com.vk.channels.impl.channel_screen.footer.k;
import com.vk.channels.impl.channel_screen.footer.l;
import com.vk.core.view.components.button.VkButton;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.ao50;
import xsna.aza;
import xsna.epx;
import xsna.jjc;
import xsna.k00;
import xsna.o9;
import xsna.on;
import xsna.yya;

/* compiled from: ChannelFooterViewControllerOld.kt */
/* loaded from: classes16.dex */
public final class i extends com.vk.channels.impl.channel_screen.footer.a {
    public a l;

    /* compiled from: ChannelFooterViewControllerOld.kt */
    public static final class a {
        public final View a;
        public final ProgressWheel b;
        public final AppCompatTextView c;
        public final AppCompatImageButton d;
        public final AppCompatTextView e;
        public final VkButton f;

        public a(View view) {
            this.a = view;
            this.b = (ProgressWheel) view.findViewById(R.id.footer_progress);
            this.c = (AppCompatTextView) view.findViewById(R.id.footer_button);
            this.d = (AppCompatImageButton) view.findViewById(R.id.postponed_post_button);
            this.e = (AppCompatTextView) view.findViewById(R.id.ban_msg);
            this.f = (VkButton) view.findViewById(R.id.ban_reason_button);
        }
    }

    @Override // xsna.fi6
    public final void Q(View view) {
        this.l = new a(view);
        this.h.e(view, new aza(this, 0));
    }

    @Override // xsna.wn50
    public final void l(ao50 ao50Var) {
        k kVar = (k) ao50Var;
        a aVar = this.l;
        if (aVar == null) {
            aVar = null;
        }
        aVar.a.setVisibility(0);
        if (kVar.equals(k.c.a)) {
            a aVar2 = this.l;
            if (aVar2 == null) {
                aVar2 = null;
            }
            aVar2.a.setVisibility(0);
            a aVar3 = this.l;
            if (aVar3 == null) {
                aVar3 = null;
            }
            aVar3.c.setVisibility(8);
            a aVar4 = this.l;
            if (aVar4 == null) {
                aVar4 = null;
            }
            aVar4.b.setVisibility(8);
            a aVar5 = this.l;
            if (aVar5 == null) {
                aVar5 = null;
            }
            aVar5.d.setVisibility(8);
            a aVar6 = this.l;
            if (aVar6 == null) {
                aVar6 = null;
            }
            aVar6.e.setVisibility(8);
            a aVar7 = this.l;
            (aVar7 != null ? aVar7 : null).f.setVisibility(8);
            return;
        }
        if (kVar instanceof k.a) {
            k.a aVar8 = (k.a) kVar;
            a aVar9 = this.l;
            if (aVar9 == null) {
                aVar9 = null;
            }
            aVar9.a.setVisibility(0);
            a aVar10 = this.l;
            if (aVar10 == null) {
                aVar10 = null;
            }
            aVar10.c.setVisibility(8);
            a aVar11 = this.l;
            if (aVar11 == null) {
                aVar11 = null;
            }
            aVar11.b.setVisibility(8);
            a aVar12 = this.l;
            if (aVar12 == null) {
                aVar12 = null;
            }
            aVar12.d.setVisibility(8);
            a aVar13 = this.l;
            if (aVar13 == null) {
                aVar13 = null;
            }
            aVar13.e.setVisibility(0);
            int i = aVar8.b;
            boolean z = aVar8.c;
            int i2 = aVar8.a;
            Context context = this.f;
            String string = i != 0 ? context.getString(i2, yya.a(i)) : context.getString(i2);
            a aVar14 = this.l;
            if (aVar14 == null) {
                aVar14 = null;
            }
            aVar14.e.setText(string);
            a aVar15 = this.l;
            if (aVar15 == null) {
                aVar15 = null;
            }
            aVar15.f.setVisibility(z ? 0 : 8);
            if (z) {
                a aVar16 = this.l;
                jjc.g((aVar16 != null ? aVar16 : null).f, new on(this, 12));
                return;
            }
            return;
        }
        if (!(kVar instanceof k.d)) {
            if (!kVar.equals(k.b.a) && !kVar.equals(k.e.a)) {
                throw new NoWhenBranchMatchedException();
            }
            a aVar17 = this.l;
            (aVar17 != null ? aVar17 : null).a.setVisibility(8);
            return;
        }
        k.d dVar = (k.d) kVar;
        a aVar18 = this.l;
        if (aVar18 == null) {
            aVar18 = null;
        }
        aVar18.a.setVisibility(0);
        a aVar19 = this.l;
        if (aVar19 == null) {
            aVar19 = null;
        }
        AppCompatImageButton appCompatImageButton = aVar19.d;
        boolean z2 = dVar.b;
        l lVar = dVar.a;
        appCompatImageButton.setVisibility(z2 ? 0 : 8);
        jjc.g(appCompatImageButton, new k00(this, 17));
        l.a aVar20 = lVar.b;
        if (epx.f(aVar20, l.a.C0529a.a)) {
            a aVar21 = this.l;
            if (aVar21 == null) {
                aVar21 = null;
            }
            aVar21.c.setVisibility(8);
            a aVar22 = this.l;
            if (aVar22 == null) {
                aVar22 = null;
            }
            aVar22.b.setVisibility(0);
        } else {
            if (!(aVar20 instanceof l.a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            a aVar23 = this.l;
            if (aVar23 == null) {
                aVar23 = null;
            }
            AppCompatTextView appCompatTextView = aVar23.c;
            appCompatTextView.setVisibility(0);
            appCompatTextView.setText(((l.a.b) lVar.b).a);
            jjc.g(appCompatTextView, new o9(7, this, dVar));
            a aVar24 = this.l;
            if (aVar24 == null) {
                aVar24 = null;
            }
            aVar24.b.setVisibility(8);
        }
        a aVar25 = this.l;
        if (aVar25 == null) {
            aVar25 = null;
        }
        aVar25.e.setVisibility(8);
        a aVar26 = this.l;
        (aVar26 != null ? aVar26 : null).f.setVisibility(8);
    }
}
