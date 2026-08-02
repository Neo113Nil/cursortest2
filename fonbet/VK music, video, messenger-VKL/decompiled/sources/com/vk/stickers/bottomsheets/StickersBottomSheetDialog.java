package com.vk.stickers.bottomsheets;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentManager;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.id.UserId;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.stickers.ContextUser;
import com.vk.stickers.bottomsheets.StickersBottomSheetDialog;
import com.vk.stickers.bridge.GiftData;
import com.vkontakte.android.R;
import xsna.a470;
import xsna.bpn0;
import xsna.bwt0;
import xsna.d790;
import xsna.dhr0;
import xsna.dw20;
import xsna.e3m;
import xsna.enj;
import xsna.ey50;
import xsna.fcn;
import xsna.is8;
import xsna.kp5;
import xsna.kt8;
import xsna.kyc;
import xsna.nw20;
import xsna.oz50;
import xsna.pod0;
import xsna.r3l0;
import xsna.rdf0;
import xsna.sdf0;
import xsna.sx3;
import xsna.t3l0;
import xsna.u2k0;
import xsna.u9l0;
import xsna.ucl0;
import xsna.ww50;
import xsna.xbj0;

/* compiled from: StickersBottomSheetDialog.kt */
/* loaded from: classes5.dex */
public final class StickersBottomSheetDialog extends FragmentImpl implements t3l0, r3l0, sdf0, dhr0.e {
    public static final /* synthetic */ int a0 = 0;
    public View O;
    public View P;
    public ImageView Q;
    public ContextUser T;
    public UserId U;
    public String V;
    public SearchStatsLoggingInfo W;
    public kt8 X;
    public u9l0 Y;
    public b Z;
    public final bpn0 N = new bpn0(new xbj0(2));
    public boolean R = true;
    public GiftData S = GiftData.d;

    /* compiled from: StickersBottomSheetDialog.kt */
    public static final class a extends oz50 {
    }

    /* compiled from: StickersBottomSheetDialog.kt */
    public final class b implements fcn {
        public final ww50<?> b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(Context context) {
            ey50 ey50Var = context instanceof ey50 ? (ey50) context : null;
            this.b = ey50Var != null ? ey50Var.Y() : null;
        }

        @Override // xsna.fcn
        public final boolean M4() {
            return true;
        }

        @Override // xsna.fcn
        public final boolean N8() {
            return false;
        }

        @Override // xsna.fcn
        public final void b(boolean z) {
            ww50<?> ww50Var;
            StickersBottomSheetDialog stickersBottomSheetDialog = StickersBottomSheetDialog.this;
            Dialog dialog = stickersBottomSheetDialog.s;
            if (dialog != null) {
                dialog.dismiss();
            }
            b bVar = stickersBottomSheetDialog.Z;
            if (bVar == null || (ww50Var = bVar.b) == null) {
                return;
            }
            ww50Var.H(bVar);
        }

        @Override // xsna.fcn
        public final void dismiss() {
            b(false);
        }

        @Override // xsna.fcn
        public final boolean v6() {
            return false;
        }
    }

    /* compiled from: StickersBottomSheetDialog.kt */
    public static final class c implements is8 {
        public c() {
        }

        @Override // xsna.is8
        public final void c() {
            int i = StickersBottomSheetDialog.a0;
            StickersBottomSheetDialog.this.fo();
        }
    }

    public StickersBottomSheetDialog() {
        dhr0.f(this);
    }

    @Override // xsna.r3l0
    public final void Dk(StickerStockItem stickerStockItem, SearchStatsLoggingInfo searchStatsLoggingInfo) {
        u9l0 u9l0Var = this.Y;
        if (u9l0Var != null) {
            u9l0Var.a(stickerStockItem, this.T, this.S, searchStatsLoggingInfo);
        }
        go();
    }

    @Override // xsna.t3l0
    public final void Oh(StickerStockItem stickerStockItem, d790 d790Var) {
        kt8 kt8Var = this.X;
        if (kt8Var != null) {
            kt8Var.Oh(stickerStockItem, d790Var);
        }
        View view = this.P;
        if (view != null) {
            view.post(new kyc(this, 8));
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        fo();
        return true;
    }

    public final void eo() {
        Dialog dialog;
        if (getActivity() == null || (dialog = this.s) == null) {
            return;
        }
        Display defaultDisplay = ((WindowManager) kn().getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        int i = displayMetrics.widthPixels;
        int i2 = dw20.e1;
        if (i >= i2) {
            i = i2;
        }
        if (dialog instanceof nw20) {
            ((nw20) dialog).v(i);
            return;
        }
        Window window = dialog.getWindow();
        if (window == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        window.setLayout(i, -1);
    }

    public final void fo() {
        ww50<?> ww50Var;
        u9l0 u9l0Var = this.Y;
        if (u9l0Var != null) {
            u9l0Var.b.getClass();
            UiTracker.i.g();
            FragmentManager fragmentManager = u9l0Var.a;
            if (fragmentManager.K() > 1) {
                fragmentManager.Y();
                go();
                return;
            }
            fragmentManager.Y();
        }
        Dialog dialog = this.s;
        if (dialog != null) {
            dialog.dismiss();
        }
        b bVar = this.Z;
        if (bVar == null || (ww50Var = bVar.b) == null) {
            return;
        }
        ww50Var.H(bVar);
    }

    public final void go() {
        ImageView imageView = this.Q;
        if (imageView != null) {
            u9l0 u9l0Var = this.Y;
            if ((u9l0Var != null ? u9l0Var.a.K() : 1) <= 1) {
                dhr0.a.l0(imageView, R.drawable.vk_icon_cancel_outline_28, R.attr.vk_ui_icon_accent_themed);
                bwt0.i0(imageView, new pod0(this, 10));
            } else {
                dhr0.a.l0(imageView, R.drawable.vk_icon_back_24, R.attr.vk_ui_icon_accent_themed);
                bwt0.i0(imageView, new u2k0(this, 3));
            }
        }
    }

    @Override // xsna.sdf0
    public final rdf0 ii() {
        return (rdf0) this.N.getValue();
    }

    @Override // xsna.t3l0
    public final void m6(StickerStockItem stickerStockItem, StickerStockItem stickerStockItem2) {
        kt8 kt8Var = this.X;
        if (kt8Var != null) {
            kt8Var.m6(stickerStockItem, stickerStockItem2);
        }
        View view = this.P;
        if (view != null) {
            view.post(new kyc(this, 8));
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        GiftData giftData;
        super.onAttach(context);
        Bundle arguments = getArguments();
        this.R = arguments != null ? arguments.getBoolean("key_show_catalog_button") : true;
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (giftData = (GiftData) arguments2.getParcelable("key_gift_data")) == null) {
            giftData = GiftData.d;
        }
        this.S = giftData;
        Bundle arguments3 = getArguments();
        this.T = arguments3 != null ? (ContextUser) arguments3.getParcelable("key_context_user") : null;
        Bundle arguments4 = getArguments();
        this.U = arguments4 != null ? (UserId) arguments4.getParcelable("key_current_user") : null;
        Bundle arguments5 = getArguments();
        this.V = arguments5 != null ? arguments5.getString("key_ref") : null;
        Bundle arguments6 = getArguments();
        this.W = arguments6 != null ? (SearchStatsLoggingInfo) arguments6.getParcelable("search_stats_logging_info") : null;
        this.Y = new u9l0(kn(), getChildFragmentManager());
    }

    @Override // androidx.fragment.app.d, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        ww50<?> ww50Var;
        b bVar = this.Z;
        if (bVar == null || (ww50Var = bVar.b) == null) {
            return;
        }
        ww50Var.H(bVar);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        eo();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.Q = null;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        eo();
    }

    @Override // androidx.fragment.app.d
    public final int vn() {
        return R.style.VkFullScreenBottomSheetTheme;
    }

    @Override // androidx.fragment.app.d
    public final Dialog yn(Bundle bundle) {
        String str;
        this.P = e3m.b(requireContext()).inflate(R.layout.sticker_details_bottom_container, (ViewGroup) null);
        Context requireContext = requireContext();
        bpn0 bpn0Var = enj.a;
        kt8 kt8Var = new kt8(e3m.h(requireContext), this.P, this.S, this.T, this.V, this.U);
        this.X = kt8Var;
        kt8Var.i = new c();
        nw20 nw20Var = new nw20(requireContext(), R.style.VkFullScreenBottomSheetTheme);
        nw20Var.u = requireContext().getString(R.string.stickers_title);
        nw20Var.R = R.attr.vk_ui_background_content;
        nw20Var.q0 = this.P;
        nw20Var.r0 = new a470();
        nw20Var.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: xsna.w8l0
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                int i2 = StickersBottomSheetDialog.a0;
                if (i != 4 || keyEvent.getAction() != 0) {
                    return false;
                }
                StickersBottomSheetDialog.this.fo();
                return true;
            }
        });
        nw20Var.l = false;
        if (this.R) {
            nw20Var.F = dhr0.t.b(R.drawable.vk_icon_storefront_outline_28, R.attr.vk_ui_icon_accent_themed);
            nw20Var.N = new kp5(26, this, nw20Var);
        }
        if (bundle == null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(requireContext()).inflate(R.layout.modal_bottom_sheet, (ViewGroup) null, false);
            LinearLayout linearLayout = (LinearLayout) viewGroup.findViewById(R.id.content);
            viewGroup.setPadding(0, 0, 0, 0);
            viewGroup.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
            linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            viewGroup.removeAllViews();
            View inflate = e3m.b(requireContext()).inflate(R.layout.sticker_details_fragment_container, (ViewGroup) null);
            this.O = inflate;
            viewGroup.addView(inflate);
            linearLayout.setClipToOutline(true);
            nw20Var.setContentView(viewGroup, layoutParams);
            this.Q = (ImageView) nw20Var.findViewById(R.id.ivClose);
            Bundle arguments = getArguments();
            StickerStockItem stickerStockItem = arguments != null ? (StickerStockItem) arguments.getParcelable("key_pack") : null;
            SearchStatsLoggingInfo searchStatsLoggingInfo = this.W;
            if (searchStatsLoggingInfo != null && (str = searchStatsLoggingInfo.f) != null) {
                ucl0 ucl0Var = new ucl0(str, stickerStockItem.b);
                kt8 kt8Var2 = this.X;
                if (kt8Var2 != null) {
                    kt8Var2.m = ucl0Var;
                }
            }
            Dk(stickerStockItem, searchStatsLoggingInfo);
        } else {
            new Handler(Looper.getMainLooper()).postDelayed(new sx3(this, 12), 100L);
        }
        b bVar = new b(requireContext());
        this.Z = bVar;
        ww50<?> ww50Var = bVar.b;
        if (ww50Var != null) {
            ww50Var.S(bVar);
        }
        return nw20Var;
    }
}
