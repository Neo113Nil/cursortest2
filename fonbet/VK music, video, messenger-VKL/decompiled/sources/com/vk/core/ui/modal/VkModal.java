package com.vk.core.ui.modal;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.vk.core.ui.modal.a;
import com.vk.core.ui.modal.b;
import com.vk.core.ui.modalpage.VkModalPage$PageMode;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.a470;
import xsna.asp;
import xsna.c5v0;
import xsna.cpo;
import xsna.dw20;
import xsna.e3m;
import xsna.g5v0;
import xsna.gzs;
import xsna.h5v0;
import xsna.izs;
import xsna.pzt0;
import xsna.s3q0;
import xsna.tfm0;
import xsna.uhs0;
import xsna.y4v0;
import xsna.zrp;

/* compiled from: VkModal.kt */
/* loaded from: classes17.dex */
public final class VkModal {
    public final Mode a;
    public b b;
    public final boolean c;
    public final gzs<s3q0> d;
    public final boolean e;
    public dw20 f;
    public izs<? super View, s3q0> g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkModal.kt */
    public static final class Mode {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Mode[] $VALUES;
        public static final Mode Card;
        public static final Mode DynamicHeight;
        public static final Mode FullScreen;

        static {
            Mode mode = new Mode("FullScreen", 0);
            FullScreen = mode;
            Mode mode2 = new Mode("DynamicHeight", 1);
            DynamicHeight = mode2;
            Mode mode3 = new Mode("Card", 2);
            Card = mode3;
            Mode[] modeArr = {mode, mode2, mode3};
            $VALUES = modeArr;
            $ENTRIES = new asp(modeArr);
        }

        public Mode() {
            throw null;
        }

        public static Mode valueOf(String str) {
            return (Mode) Enum.valueOf(Mode.class, str);
        }

        public static Mode[] values() {
            return (Mode[]) $VALUES.clone();
        }
    }

    /* compiled from: VkModal.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Mode.values().length];
            try {
                iArr[Mode.FullScreen.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Mode.DynamicHeight.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Mode.Card.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public VkModal() {
        this(null, null, null, false, 31);
    }

    public final void a() {
        dw20 dw20Var = this.f;
        if (dw20Var != null) {
            dw20Var.dismiss();
        }
        this.f = null;
    }

    public final dw20 b(Context context, String str) {
        com.vk.core.ui.bottomsheet.internal.b a470Var;
        int[] iArr = a.$EnumSwitchMapping$0;
        Mode mode = this.a;
        int i = iArr[mode.ordinal()];
        h5v0 h5v0Var = null;
        View view = null;
        if (i == 1 || i == 2) {
            VkModalPage$PageMode vkModalPage$PageMode = mode == Mode.FullScreen ? VkModalPage$PageMode.FullScreen : VkModalPage$PageMode.DynamicHeight;
            b bVar = this.b;
            b.C0791b c0791b = bVar instanceof b.C0791b ? (b.C0791b) bVar : null;
            uhs0 uhs0Var = new uhs0(this, 9);
            izs<? super View, s3q0> izsVar = this.g;
            dw20.b bVar2 = new dw20.b(context, null);
            int i2 = com.vk.core.ui.modal.a.a;
            dw20.b C = bVar2.C(0.4f);
            int i3 = g5v0.$EnumSwitchMapping$0[vkModalPage$PageMode.ordinal()];
            if (i3 == 1) {
                a470Var = new a470();
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                a470Var = new cpo(false, 0, 3);
            }
            dw20.b f0 = C.c(a470Var).E(this.c).F0(true).B(com.vk.core.ui.modal.a.c, true, false).f0(izsVar);
            if (c0791b != null) {
                h5v0Var = new h5v0(context);
                h5v0Var.setTopBar(c0791b.b);
                h5v0Var.setContent(c0791b.a);
            }
            if (h5v0Var != null) {
                f0.D0(h5v0Var, vkModalPage$PageMode == VkModalPage$PageMode.FullScreen);
            }
            f0.a0(uhs0Var);
            dw20 I0 = f0.I0(str);
            this.f = I0;
            return I0;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        b bVar3 = this.b;
        b.a aVar = bVar3 instanceof b.a ? (b.a) bVar3 : null;
        tfm0 tfm0Var = new tfm0(this, 24);
        boolean z = this.e;
        y4v0 y4v0Var = new y4v0(aVar, z, tfm0Var);
        y4v0Var.d = this.g;
        dw20.b bVar4 = new dw20.b(context, null);
        int i4 = com.vk.core.ui.modal.a.a;
        bVar4.C(0.4f);
        int i5 = com.vk.core.ui.modal.a.a;
        bVar4.o0(i5);
        bVar4.m0(i5);
        bVar4.n0(i5);
        bVar4.p0(i5);
        bVar4.p(z);
        bVar4.f0(y4v0Var.d);
        bVar4.N0();
        if (aVar != null) {
            if (aVar instanceof b.a.C0790b) {
                c5v0 c5v0Var = new c5v0(context);
                b.a.C0790b c0790b = (b.a.C0790b) aVar;
                c5v0Var.setTop(c0790b.a);
                c5v0Var.setMain(c0790b.b);
                c5v0Var.setBottomContent(c0790b.c);
                c5v0Var.setButtons(c0790b.d);
                c5v0Var.setWithPaddings(c0790b.e);
                view = y4v0Var.a(c5v0Var, c0790b.f);
            } else {
                if (!(aVar instanceof b.a.C0789a)) {
                    throw new NoWhenBranchMatchedException();
                }
                b.a.C0789a c0789a = (b.a.C0789a) aVar;
                view = y4v0Var.a(c0789a.a, c0789a.b);
            }
        }
        if (view != null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(e3m.f(R.attr.vk_ui_background_modal, view.getContext()));
            gradientDrawable.setCornerRadius(com.vk.core.ui.modal.a.b);
            view.setBackground(gradientDrawable);
            bVar4.D0(view, false);
        }
        dw20 I02 = bVar4.I0(str);
        y4v0Var.c = I02;
        this.f = I02;
        return I02;
    }

    public VkModal(Mode mode, b bVar, gzs gzsVar, boolean z, int i) {
        mode = (i & 1) != 0 ? Mode.FullScreen : mode;
        bVar = (i & 2) != 0 ? null : bVar;
        boolean z2 = false;
        int i2 = 1;
        if ((i & 4) != 0) {
            int i3 = com.vk.core.ui.modal.a.a;
            int i4 = a.C0788a.$EnumSwitchMapping$0[mode.ordinal()];
            if (i4 != 1) {
                if (i4 != 2 && i4 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                z2 = true;
            }
        }
        gzsVar = (i & 8) != 0 ? null : gzsVar;
        z = (i & 16) != 0 ? true : z;
        this.a = mode;
        this.b = bVar;
        this.c = z2;
        this.d = gzsVar;
        this.e = z;
        this.g = new pzt0(i2);
    }
}
