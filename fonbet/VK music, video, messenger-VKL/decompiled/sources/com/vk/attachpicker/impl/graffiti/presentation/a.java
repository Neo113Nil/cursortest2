package com.vk.attachpicker.impl.graffiti.presentation;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.vk.imageloader.view.VKImageView;
import com.vk.pending.PendingGraffitiAttachment;
import com.vkontakte.android.R;
import kotlin.Pair;
import xsna.b780;
import xsna.cn70;
import xsna.cpo;
import xsna.dw20;
import xsna.e3m;
import xsna.enj;
import xsna.f1j;
import xsna.f4m;
import xsna.f5h0;
import xsna.hz20;
import xsna.nw20;
import xsna.tzp0;
import xsna.yfb;

/* compiled from: GraffitiPreviewBottomSheet.kt */
/* loaded from: classes15.dex */
public final class a extends dw20 {
    public static final /* synthetic */ int f1 = 0;

    /* compiled from: GraffitiPreviewBottomSheet.kt */
    /* renamed from: com.vk.attachpicker.impl.graffiti.presentation.a$a, reason: collision with other inner class name */
    public static final class C0385a extends dw20.b {
        public final PendingGraffitiAttachment e;

        public C0385a(Context context, PendingGraffitiAttachment pendingGraffitiAttachment) {
            super(context, tzp0.a(null, 3));
            this.e = pendingGraffitiAttachment;
            l(e3m.f(R.attr.vk_ui_background_modal, context));
            this.d.w0 = cn70.b(8);
            F(enj.e(R.drawable.vk_icon_cancel_20, R.attr.vk_ui_icon_secondary, context), context.getString(R.string.graffiti_cancel));
            B(cn70.b(12), true, true);
            c(new cpo(false, 0, 7));
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            a aVar = new a();
            aVar.setArguments(yfb.b(new Pair("IMAGE_GRAFFITI_ATTACH", this.e)));
            return aVar;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        f1j f1jVar = new f1j(this, 17);
        Dialog dialog = this.s;
        nw20 nw20Var = dialog instanceof nw20 ? (nw20) dialog : null;
        if (nw20Var != null) {
            nw20Var.N = f1jVar;
        }
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // xsna.dw20, xsna.c33, androidx.fragment.app.d
    public final Dialog yn(Bundle bundle) {
        VKImageView vKImageView = new VKImageView(requireContext(), null, 6, 0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        vKImageView.setLayoutParams(layoutParams);
        vKImageView.setActualScaleType(f5h0.g.a);
        vKImageView.setOnLoadCallback(new b(vKImageView));
        dw20.Rn(this, vKImageView, 6);
        Bundle arguments = getArguments();
        final PendingGraffitiAttachment pendingGraffitiAttachment = arguments != null ? (PendingGraffitiAttachment) arguments.getParcelable("IMAGE_GRAFFITI_ATTACH") : null;
        vKImageView.o0(pendingGraffitiAttachment != null ? pendingGraffitiAttachment.h : null, null);
        this.V = getResources().getString(R.string.picker_send);
        this.W = new hz20() { // from class: xsna.scu
            @Override // xsna.hz20
            public final void a(int i) {
                FragmentManager supportFragmentManager;
                int i2 = com.vk.attachpicker.impl.graffiti.presentation.a.f1;
                FragmentActivity activity = com.vk.attachpicker.impl.graffiti.presentation.a.this.getActivity();
                if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) {
                    return;
                }
                supportFragmentManager.k0(yfb.b(new Pair("GRAFFITI_PREVIEW_ATTACH", pendingGraffitiAttachment)), "GRAFFITI_PREVIEW_SAVE_KEY");
            }
        };
        return super.yn(bundle);
    }

    /* compiled from: GraffitiPreviewBottomSheet.kt */
    public static final class b implements b780 {
        public final /* synthetic */ VKImageView b;

        public b(VKImageView vKImageView) {
            this.b = vKImageView;
        }

        @Override // xsna.b780
        public final void t(int i, int i2, String str) {
            f4m.k(i2, this.b);
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
}
