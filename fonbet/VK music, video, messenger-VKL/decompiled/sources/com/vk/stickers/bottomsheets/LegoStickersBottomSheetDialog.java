package com.vk.stickers.bottomsheets;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.content.res.TypedArray;
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
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.tool.view.vkblur.VkBlurContentView;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.view.components.bottombar.VkBottomBar;
import com.vk.dto.common.id.UserId;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.stickers.ContextUser;
import com.vk.stickers.bottomsheets.LegoStickersBottomSheetDialog;
import com.vk.stickers.bridge.GiftData;
import com.vkontakte.android.R;
import java.util.HashSet;
import xsna.a470;
import xsna.abg0;
import xsna.aj6;
import xsna.awt0;
import xsna.bpn0;
import xsna.cm1;
import xsna.ctn;
import xsna.d790;
import xsna.dhr0;
import xsna.dw20;
import xsna.dwg;
import xsna.e3m;
import xsna.enj;
import xsna.ey50;
import xsna.fcn;
import xsna.fnj;
import xsna.hbh0;
import xsna.iah0;
import xsna.lpj;
import xsna.nd1;
import xsna.nhj;
import xsna.nw20;
import xsna.pu5;
import xsna.qd1;
import xsna.r3l0;
import xsna.rdf0;
import xsna.sdf0;
import xsna.sp;
import xsna.t1z;
import xsna.t3l0;
import xsna.u9l0;
import xsna.ucl0;
import xsna.vfe;
import xsna.w16;
import xsna.ww50;
import xsna.yn3;

/* compiled from: LegoStickersBottomSheetDialog.kt */
/* loaded from: classes5.dex */
public final class LegoStickersBottomSheetDialog extends FragmentImpl implements t3l0, r3l0, sdf0, dhr0.e {
    public static final /* synthetic */ int d0 = 0;
    public View O;
    public VkBottomBar P;
    public int Q;
    public ImageView R;
    public ImageView S;
    public ContextUser V;
    public UserId W;
    public String X;
    public SearchStatsLoggingInfo Y;
    public t1z Z;
    public u9l0 a0;
    public a b0;
    public VkBlurContentView c0;
    public final bpn0 N = new bpn0(new nd1(19));
    public boolean T = true;
    public GiftData U = GiftData.d;

    /* compiled from: LegoStickersBottomSheetDialog.kt */
    public final class a implements fcn {
        public final ww50<?> b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Context context) {
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
            LegoStickersBottomSheetDialog legoStickersBottomSheetDialog = LegoStickersBottomSheetDialog.this;
            Dialog dialog = legoStickersBottomSheetDialog.s;
            if (dialog != null) {
                dialog.dismiss();
            }
            a aVar = legoStickersBottomSheetDialog.b0;
            if (aVar == null || (ww50Var = aVar.b) == null) {
                return;
            }
            ww50Var.H(aVar);
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

    public LegoStickersBottomSheetDialog() {
        dhr0.f(this);
    }

    @Override // xsna.r3l0
    public final void Dk(StickerStockItem stickerStockItem, SearchStatsLoggingInfo searchStatsLoggingInfo) {
        u9l0 u9l0Var = this.a0;
        if (u9l0Var != null) {
            u9l0Var.a(stickerStockItem, this.V, this.U, searchStatsLoggingInfo);
        }
        ho();
    }

    @Override // xsna.t3l0
    public final void Oh(StickerStockItem stickerStockItem, d790 d790Var) {
        t1z t1zVar = this.Z;
        if (t1zVar != null) {
            t1zVar.Oh(stickerStockItem, d790Var);
        }
        go();
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
        u9l0 u9l0Var = this.a0;
        if (u9l0Var != null) {
            u9l0Var.b.getClass();
            UiTracker.i.g();
            FragmentManager fragmentManager = u9l0Var.a;
            if (fragmentManager.K() > 1) {
                fragmentManager.Y();
                ho();
                return;
            }
            fragmentManager.Y();
        }
        Dialog dialog = this.s;
        if (dialog != null) {
            dialog.dismiss();
        }
        a aVar = this.b0;
        if (aVar == null || (ww50Var = aVar.b) == null) {
            return;
        }
        ww50Var.H(aVar);
    }

    public final void go() {
        View view;
        ViewGroup viewGroup;
        VkBottomBar vkBottomBar = this.P;
        if (vkBottomBar == null || (view = this.O) == null || (viewGroup = (ViewGroup) view.findViewById(R.id.longtap_recycler)) == null) {
            return;
        }
        View view2 = this.O;
        ViewGroup.LayoutParams layoutParams = view2 != null ? view2.getLayoutParams() : null;
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.bottomMargin = 0;
            View view3 = this.O;
            if (view3 != null) {
                view3.requestLayout();
            }
        }
        awt0.s(vkBottomBar, new ctn(viewGroup, vkBottomBar, this, 2));
    }

    public final void ho() {
        u9l0 u9l0Var = this.a0;
        int K = u9l0Var != null ? u9l0Var.a.K() : 1;
        ImageView imageView = this.R;
        if (imageView != null) {
            if (K <= 1) {
                imageView.setImageDrawable(dhr0.t.b(R.drawable.vk_icon_lego_cross_28, R.attr.vk_ui_icon_primary));
                imageView.setOnClickListener(new w16(this, 8));
            } else {
                imageView.setImageDrawable(dhr0.t.b(R.drawable.vk_icon_back_24, R.attr.vk_ui_icon_primary));
                imageView.setOnClickListener(new yn3(this, 12));
            }
        }
        ImageView imageView2 = this.S;
        if (imageView2 != null) {
            imageView2.setImageDrawable(dhr0.t.b(R.drawable.vk_icon_lego_storefront_outline_28, R.attr.vk_ui_icon_primary));
        }
    }

    @Override // xsna.sdf0
    public final rdf0 ii() {
        return (rdf0) this.N.getValue();
    }

    @Override // xsna.t3l0
    public final void m6(StickerStockItem stickerStockItem, StickerStockItem stickerStockItem2) {
        t1z t1zVar = this.Z;
        if (t1zVar != null) {
            t1zVar.m6(stickerStockItem, stickerStockItem2);
        }
        go();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        GiftData giftData;
        super.onAttach(context);
        Bundle arguments = getArguments();
        this.T = arguments != null ? arguments.getBoolean("key_show_catalog_button") : true;
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (giftData = (GiftData) arguments2.getParcelable("key_gift_data")) == null) {
            giftData = GiftData.d;
        }
        this.U = giftData;
        Bundle arguments3 = getArguments();
        this.V = arguments3 != null ? (ContextUser) arguments3.getParcelable("key_context_user") : null;
        Bundle arguments4 = getArguments();
        this.W = arguments4 != null ? (UserId) arguments4.getParcelable("key_current_user") : null;
        Bundle arguments5 = getArguments();
        this.X = arguments5 != null ? arguments5.getString("key_ref") : null;
        Bundle arguments6 = getArguments();
        this.Y = arguments6 != null ? (SearchStatsLoggingInfo) arguments6.getParcelable("search_stats_logging_info") : null;
        this.a0 = new u9l0(kn(), getChildFragmentManager());
    }

    @Override // androidx.fragment.app.d, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        ww50<?> ww50Var;
        a aVar = this.b0;
        if (aVar == null || (ww50Var = aVar.b) == null) {
            return;
        }
        ww50Var.H(aVar);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        eo();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.c0 = null;
        this.R = null;
        this.S = null;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        Window window;
        View decorView;
        super.onResume();
        Dialog dialog = this.s;
        if (dialog != null && (window = dialog.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            sp.u(decorView, true);
        }
        eo();
    }

    @Override // androidx.fragment.app.d
    public final int vn() {
        return R.style.VkFullScreenBottomSheetTheme;
    }

    @Override // androidx.fragment.app.d
    public final Dialog yn(Bundle bundle) {
        StickerStockItem stickerStockItem;
        String str;
        lpj lpjVar = new lpj(requireContext(), R.style.Theme_AppCompat_Empty);
        dhr0 dhr0Var = dhr0.a;
        dhr0Var.g(lpjVar);
        this.Q = hbh0.b(42, lpjVar);
        VkBottomBar vkBottomBar = new VkBottomBar(lpjVar, null, 6);
        vkBottomBar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        vkBottomBar.getTabBar().setVisibility(8);
        this.P = vkBottomBar;
        Context requireContext = requireContext();
        bpn0 bpn0Var = enj.a;
        Activity h = e3m.h(requireContext);
        VkBottomBar vkBottomBar2 = this.P;
        if (vkBottomBar2 != null) {
            t1z t1zVar = new t1z(h, vkBottomBar2, this.U, this.V, this.X, this.W);
            t1zVar.n = new dwg(this, 27);
            t1zVar.h.a5(new nhj(this, 1));
            t1zVar.i = new vfe(this);
            this.Z = t1zVar;
        }
        nw20 nw20Var = new nw20(requireContext(), R.style.VkFullScreenBottomSheetTheme);
        nw20Var.a1 = true;
        nw20Var.u = requireContext().getString(R.string.stickers_title);
        nw20Var.R = R.attr.vk_ui_background_content;
        VkBottomBar vkBottomBar3 = this.P;
        if (vkBottomBar3 != null) {
            nw20Var.q0 = vkBottomBar3;
            nw20Var.r0 = new a470();
            nw20Var.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: xsna.b2z
                @Override // android.content.DialogInterface.OnKeyListener
                public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                    int i2 = LegoStickersBottomSheetDialog.d0;
                    LegoStickersBottomSheetDialog legoStickersBottomSheetDialog = LegoStickersBottomSheetDialog.this;
                    legoStickersBottomSheetDialog.getClass();
                    if (i != 4 || keyEvent.getAction() != 0) {
                        return false;
                    }
                    legoStickersBottomSheetDialog.fo();
                    return true;
                }
            });
            nw20Var.l = false;
            if (this.T) {
                nw20Var.F = dhr0.t.b(R.drawable.vk_icon_lego_storefront_outline_28, R.attr.vk_ui_icon_primary);
                nw20Var.N = new qd1(18, this, nw20Var);
            }
        }
        if (bundle == null) {
            ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            VkBlurContentView vkBlurContentView = new VkBlurContentView(requireContext(), null, 6);
            Context requireContext2 = requireContext();
            ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(requireContext2).inflate(R.layout.modal_bottom_sheet, (ViewGroup) null, false);
            LinearLayout linearLayout = (LinearLayout) viewGroup.findViewById(R.id.content);
            viewGroup.setPadding(0, 0, 0, 0);
            viewGroup.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
            linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            viewGroup.removeAllViews();
            lpj lpjVar2 = new lpj(requireContext2, R.style.Theme_AppCompat_Empty);
            dhr0Var.g(lpjVar2);
            HashSet hashSet = iah0.a;
            int a2 = fnj.a(requireContext2);
            float f = requireContext2.getResources().getDisplayMetrics().density;
            int i = (int) (16 * f);
            float f2 = 8;
            int i2 = (int) (f * f2);
            LinearLayout linearLayout2 = new LinearLayout(lpjVar2);
            linearLayout2.setOrientation(0);
            linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            linearLayout2.setPadding(i, a2 + i2, i, i2);
            linearLayout2.setGravity(16);
            TextView textView = new TextView(lpjVar2);
            textView.setText(requireContext2.getString(R.string.stickers_title));
            TypedArray obtainStyledAttributes = lpjVar2.obtainStyledAttributes(new int[]{R.attr.vk_ui_typography_title1});
            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            obtainStyledAttributes.recycle();
            if (resourceId != 0) {
                textView.setTextAppearance(resourceId);
            }
            abg0 abg0Var = dhr0.t;
            textView.setTextColor(abg0Var.c(R.attr.vk_ui_text_primary));
            textView.setIncludeFontPadding(false);
            textView.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
            linearLayout2.addView(textView);
            if (this.T) {
                float f3 = requireContext2.getResources().getDisplayMetrics().density;
                int i3 = (int) (f2 * f3);
                int i4 = (int) (28 * f3);
                ImageView imageView = new ImageView(lpjVar2);
                imageView.setImageDrawable(abg0Var.b(R.drawable.vk_icon_lego_storefront_outline_28, R.attr.vk_ui_icon_primary));
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i4, i4);
                layoutParams2.setMarginStart(i3);
                imageView.setLayoutParams(layoutParams2);
                imageView.setOnClickListener(new cm1(4, this, requireContext2));
                this.S = imageView;
                linearLayout2.addView(imageView);
            }
            float f4 = lpjVar2.getResources().getDisplayMetrics().density;
            int i5 = (int) (f2 * f4);
            int i6 = (int) (28 * f4);
            ImageView imageView2 = new ImageView(lpjVar2);
            imageView2.setImageDrawable(abg0Var.b(R.drawable.vk_icon_lego_cross_28, R.attr.vk_ui_icon_primary));
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(i6, i6);
            layoutParams3.setMarginStart(i5);
            imageView2.setLayoutParams(layoutParams3);
            imageView2.setOnClickListener(new aj6(this, 7));
            this.R = imageView2;
            linearLayout2.addView(imageView2);
            viewGroup.addView(linearLayout2);
            View inflate = e3m.b(requireContext()).inflate(R.layout.sticker_details_fragment_container, (ViewGroup) null);
            this.O = inflate;
            viewGroup.addView(inflate);
            linearLayout.setClipToOutline(true);
            vkBlurContentView.addView(viewGroup, new FrameLayout.LayoutParams(-1, -1));
            this.c0 = vkBlurContentView;
            nw20Var.setContentView(vkBlurContentView, layoutParams);
            VkBottomBar vkBottomBar4 = this.P;
            VkBottomBar vkBottomBar5 = vkBottomBar4 != null ? vkBottomBar4 : null;
            if (vkBottomBar5 != null) {
                vkBottomBar5.setupWithBlurContentView(this.c0);
            }
            View findViewById = nw20Var.findViewById(R.id.toolbar);
            if (findViewById != null) {
                findViewById.setVisibility(8);
            }
            View findViewById2 = nw20Var.findViewById(R.id.header_shadow);
            if (findViewById2 != null) {
                findViewById2.setVisibility(8);
            }
            Bundle arguments = getArguments();
            if (arguments != null && (stickerStockItem = (StickerStockItem) arguments.getParcelable("key_pack")) != null) {
                SearchStatsLoggingInfo searchStatsLoggingInfo = this.Y;
                if (searchStatsLoggingInfo != null && (str = searchStatsLoggingInfo.f) != null) {
                    ucl0 ucl0Var = new ucl0(str, stickerStockItem.b);
                    t1z t1zVar2 = this.Z;
                    if (t1zVar2 != null) {
                        t1zVar2.m = ucl0Var;
                    }
                }
                Dk(stickerStockItem, searchStatsLoggingInfo);
            }
        } else {
            new Handler(Looper.getMainLooper()).postDelayed(new pu5(this, 9), 100L);
        }
        a aVar = new a(requireContext());
        this.b0 = aVar;
        ww50<?> ww50Var = aVar.b;
        if (ww50Var != null) {
            ww50Var.S(aVar);
        }
        return nw20Var;
    }
}
