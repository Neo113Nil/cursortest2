package com.vk.ecomm.market.good.ui;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.SparseArray;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.text.VkText;
import com.vk.core.view.components.text.links.VkLinkedText;
import com.vk.dto.common.actions.Action;
import com.vk.dto.common.data.CallProducerButton;
import com.vk.dto.common.data.InaccessibilityMessage;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.market.api.dto.OwnerResponseTime;
import com.vk.ecomm.market.good.ui.ProductActionButton;
import com.vk.ecomm.market.good.ui.d;
import com.vk.toggle.features.SoccomFeatures;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.text.Regex;
import xsna.bwt0;
import xsna.f4m;
import xsna.g06;
import xsna.i750;
import xsna.iah0;
import xsna.jai;
import xsna.jn7;
import xsna.k170;
import xsna.kjt;
import xsna.m7s;
import xsna.n34;
import xsna.nik0;
import xsna.qaz;
import xsna.r19;
import xsna.r1z;
import xsna.ta8;
import xsna.u3u;
import xsna.xc50;
import xsna.yb1;
import xsna.zk10;

/* compiled from: ProductButtonsBinderImpl.kt */
/* loaded from: classes18.dex */
public final class e implements d {
    public final View a;
    public final ComposeView b;
    public final ComposeView c;
    public final boolean d;
    public final VkButton e;
    public final VkButton f;
    public final VkButton g;
    public final ComposeView h;
    public final VkButton i;
    public final VkLinkedText j;
    public final VkText k;
    public c l;
    public d.a m;
    public int n;

    /* compiled from: ProductButtonsBinderImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ProductActionButton.Type.values().length];
            try {
                iArr[ProductActionButton.Type.NATIVE_CART.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProductActionButton.Type.CONTACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProductActionButton.Type.LINK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ProductActionButton.Type.LINK_MINIAPP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ProductActionButton.Type.CUSTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ProductActionButton.Type.UNDEFINED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ProductActionButton.Style.values().length];
            try {
                iArr2[ProductActionButton.Style.PRIMARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ProductActionButton.Style.SECONDARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public e(View view) {
        this.a = view;
        ComposeView composeView = (ComposeView) view.findViewById(R.id.product_card_cta_cart_button_compose_view);
        composeView.setContent(n34.c);
        this.b = composeView;
        ComposeView composeView2 = (ComposeView) view.findViewById(R.id.product_card_cta_quantity_control_compose_view);
        composeView2.setContent(n34.d);
        this.c = composeView2;
        SoccomFeatures soccomFeatures = SoccomFeatures.MULTI_INTEGRATION;
        soccomFeatures.getClass();
        this.d = com.vk.toggle.b.A.a(soccomFeatures);
        VkButton vkButton = (VkButton) view.findViewById(R.id.product_card_cta_primary_button);
        this.e = vkButton;
        VkButton vkButton2 = (VkButton) view.findViewById(R.id.product_card_cta_secondary_button);
        this.f = vkButton2;
        VkButton vkButton3 = (VkButton) view.findViewById(R.id.product_card_cta_call_primary_button);
        this.g = vkButton3;
        ComposeView composeView3 = (ComposeView) view.findViewById(R.id.product_card_cta_call_primary_button_compose);
        composeView3.setContent(n34.e);
        this.h = composeView3;
        VkButton vkButton4 = (VkButton) view.findViewById(R.id.product_card_cta_call_secondary_button);
        this.i = vkButton4;
        this.j = (VkLinkedText) view.findViewById(R.id.conditions_text);
        this.k = (VkText) view.findViewById(R.id.owner_answer_time_text);
        bwt0.i0(vkButton, new xc50(this, 11));
        bwt0.i0(vkButton2, new i750(this, 18));
        bwt0.i0(vkButton3, new u3u(this, 28));
        bwt0.i0(vkButton4, new k170(this, 14));
    }

    public static boolean d(CallProducerButton callProducerButton) {
        return (callProducerButton != null && callProducerButton.b == 0) || (callProducerButton != null && callProducerButton.b == 1) || ((callProducerButton != null && callProducerButton.b == 2) || (callProducerButton != null && callProducerButton.b == 6));
    }

    @Override // com.vk.ecomm.market.good.ui.d
    public final void a(c cVar) {
        int a2;
        String str = cVar.d;
        int i = cVar.a;
        this.n = 0;
        g(cVar.b, cVar);
        this.l = cVar;
        this.m = cVar.i;
        ComposeView composeView = this.b;
        f4m.j(composeView);
        f4m.j(this.c);
        ProductActionButton productActionButton = cVar.e;
        VkButton vkButton = this.e;
        c(productActionButton, vkButton);
        ProductActionButton productActionButton2 = cVar.f;
        VkButton vkButton2 = this.f;
        c(productActionButton2, vkButton2);
        CallProducerButton callProducerButton = cVar.g;
        OwnerResponseTime ownerResponseTime = cVar.k;
        VkButton vkButton3 = this.g;
        b(callProducerButton, vkButton3, ownerResponseTime);
        CallProducerButton callProducerButton2 = cVar.h;
        VkButton vkButton4 = this.i;
        b(callProducerButton2, vkButton4, ownerResponseTime);
        Integer num = cVar.c;
        if (num != null) {
            if (i == 0 && num.intValue() == 0) {
                g(false, cVar);
                this.n++;
            } else if (i >= num.intValue()) {
                f4m.j(vkButton);
                vkButton.a5(true, null);
            }
        }
        VkLinkedText vkLinkedText = this.j;
        if (str == null || str.length() == 0) {
            f4m.j(vkLinkedText);
        } else {
            vkLinkedText.setVisibility(0);
            Regex regex = r1z.a;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            kjt.a aVar = new kjt.a(Regex.d(r1z.a, str));
            int i2 = 0;
            while (aVar.hasNext()) {
                zk10 zk10Var = (zk10) aVar.next();
                spannableStringBuilder.append((CharSequence) str.substring(i2, zk10Var.c().b));
                spannableStringBuilder.append(zk10Var.b().get(2), new qaz(zk10Var.b().get(1), 0), 33);
                i2 = zk10Var.c().c + 1;
            }
            SparseArray<ForegroundColorSpan> sparseArray = nik0.a;
            vkLinkedText.setText(new SpannableString(spannableStringBuilder));
        }
        int i3 = this.n;
        View view = this.a;
        ComposeView composeView2 = this.h;
        if (i3 == 1) {
            float f = 8;
            f4m.t(iah0.a(f), vkButton3);
            f4m.t(iah0.a(f), composeView2);
            f4m.t(iah0.a(f), vkButton4);
            c cVar2 = this.l;
            if ((cVar2 != null ? cVar2.g : null) == null) {
                if ((cVar2 != null ? cVar2.h : null) == null) {
                    f4m.y(iah0.a(12), view);
                    return;
                }
            }
            f4m.y(iah0.a(0), view);
            return;
        }
        float f2 = 12;
        f4m.t(iah0.a(f2), vkButton3);
        f4m.t(iah0.a(f2), composeView2);
        f4m.t(iah0.a(f2), vkButton4);
        if (!bwt0.K(composeView)) {
            c cVar3 = this.l;
            if ((cVar3 != null ? cVar3.e : null) == null || !bwt0.K(vkButton)) {
                c cVar4 = this.l;
                if ((cVar4 != null ? cVar4.f : null) == null || !bwt0.K(vkButton2)) {
                    c cVar5 = this.l;
                    if ((cVar5 != null ? cVar5.g : null) == null || !bwt0.K(vkButton3)) {
                        c cVar6 = this.l;
                        if ((cVar6 != null ? cVar6.g : null) == null || !bwt0.K(composeView2)) {
                            c cVar7 = this.l;
                            if ((cVar7 != null ? cVar7.h : null) == null || !bwt0.K(vkButton4)) {
                                a2 = iah0.a(f2);
                                f4m.y(a2, view);
                            }
                        }
                    }
                }
                a2 = iah0.a(0);
                f4m.y(a2, view);
            }
        }
        a2 = iah0.a(f2);
        f4m.y(a2, view);
    }

    public final void b(CallProducerButton callProducerButton, VkButton vkButton, OwnerResponseTime ownerResponseTime) {
        int i;
        if (callProducerButton == null || (i = callProducerButton.b) == -1) {
            f4m.j(vkButton);
            return;
        }
        VkText vkText = this.k;
        if (i == 0) {
            SpannableString spannableString = null;
            if (ownerResponseTime != null) {
                String str = ownerResponseTime.d;
                String str2 = ownerResponseTime.c;
                if (str.length() != 0) {
                    spannableString = new SpannableString(str2.concat(str));
                    spannableString.setSpan(new m7s(R.attr.vk_ui_text_positive), 0, str2.length(), 0);
                }
            }
            vkText.setText(spannableString);
            vkText.setVisibility(0);
        } else {
            f4m.j(vkText);
        }
        this.n++;
        vkButton.setVisibility(0);
        vkButton.setText(callProducerButton.c);
        if (!callProducerButton.m || this.d) {
            return;
        }
        vkButton.setVisibility(4);
        this.h.setContent(new jai(1874546198, new ta8(5, callProducerButton, this), true));
    }

    public final void c(ProductActionButton productActionButton, VkButton vkButton) {
        VkButton.Mode mode;
        if (productActionButton == null) {
            f4m.j(vkButton);
            return;
        }
        CharSequence charSequence = productActionButton.a;
        int i = a.$EnumSwitchMapping$1[productActionButton.c.ordinal()];
        if (i == 1) {
            mode = VkButton.Mode.Primary;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            mode = VkButton.Mode.Secondary;
        }
        vkButton.setMode(mode);
        int i2 = a.$EnumSwitchMapping$0[productActionButton.b.ordinal()];
        ComposeView composeView = this.c;
        ComposeView composeView2 = this.b;
        switch (i2) {
            case 1:
                c cVar = this.l;
                f4m.j(vkButton);
                vkButton.a5(true, null);
                composeView2.setVisibility(0);
                this.n++;
                if (cVar == null || cVar.a <= 0) {
                    composeView2.setContent(new jai(1739101043, new jn7(9, productActionButton, this), true));
                    f4m.r(0, composeView2);
                    f4m.j(composeView);
                    return;
                } else {
                    composeView2.setContent(new jai(-82964260, new yb1(10, productActionButton, this), true));
                    f4m.r(iah0.a(12), composeView2);
                    composeView.setVisibility(0);
                    composeView.setContent(new jai(-2039598462, new g06(12, cVar, this), true));
                    return;
                }
            case 2:
                f4m.j(composeView2);
                f4m.j(composeView);
                vkButton.setVisibility(0);
                vkButton.setText(charSequence);
                vkButton.a5(true, null);
                this.n++;
                return;
            case 3:
                f4m.j(composeView2);
                f4m.j(composeView);
                vkButton.setVisibility(0);
                vkButton.setText(charSequence);
                vkButton.a5(true, Integer.valueOf(R.drawable.vk_icon_link_24));
                this.n++;
                return;
            case 4:
                f4m.j(composeView2);
                f4m.j(composeView);
                vkButton.setVisibility(0);
                vkButton.setText(charSequence);
                vkButton.a5(true, Integer.valueOf(R.drawable.vk_icon_services_outline_24));
                this.n++;
                return;
            case 5:
                f4m.j(composeView2);
                f4m.j(composeView);
                vkButton.setVisibility(0);
                vkButton.setText(charSequence);
                vkButton.a5(true, null);
                this.n++;
                return;
            case 6:
                f4m.j(composeView2);
                f4m.j(composeView);
                f4m.j(vkButton);
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final void e(ProductActionButton productActionButton, boolean z, Context context) {
        Action action;
        d.a aVar;
        if (productActionButton == null) {
            return;
        }
        int i = a.$EnumSwitchMapping$0[productActionButton.b.ordinal()];
        if (i == 1) {
            d.a aVar2 = this.m;
            if (aVar2 != null) {
                aVar2.b();
                return;
            }
            return;
        }
        if (i == 2) {
            d.a aVar3 = this.m;
            if (aVar3 != null) {
                aVar3.g(context, z);
                return;
            }
            return;
        }
        if (i == 3) {
            d.a aVar4 = this.m;
            if (aVar4 != null) {
                aVar4.e(context, z);
                return;
            }
            return;
        }
        if (i == 4) {
            d.a aVar5 = this.m;
            if (aVar5 != null) {
                aVar5.e(context, z);
                return;
            }
            return;
        }
        if (i != 5 || (action = productActionButton.d) == null || (aVar = this.m) == null) {
            return;
        }
        aVar.i(context, action);
    }

    public final void f(CallProducerButton callProducerButton, UserId userId, boolean z, Context context) {
        d.a aVar;
        String str;
        d.a aVar2;
        d.a aVar3;
        Integer valueOf = callProducerButton != null ? Integer.valueOf(callProducerButton.b) : null;
        if (valueOf != null && valueOf.intValue() == 2) {
            String str2 = callProducerButton.d;
            Boolean bool = callProducerButton.f;
            InaccessibilityMessage inaccessibilityMessage = callProducerButton.j;
            if (str2 == null || bool == null || (aVar = this.m) == null) {
                return;
            }
            aVar.c(new r19(str2, bool.booleanValue(), inaccessibilityMessage, userId, z, context));
            return;
        }
        if (valueOf != null && valueOf.intValue() == 0) {
            UserId userId2 = callProducerButton.i;
            String str3 = callProducerButton.h;
            if (userId2 == null || str3 == null || (aVar3 = this.m) == null) {
                return;
            }
            aVar3.d(context, userId2, z);
            return;
        }
        if (((valueOf == null || valueOf.intValue() != 1) && (valueOf == null || valueOf.intValue() != 6)) || (str = callProducerButton.k) == null || (aVar2 = this.m) == null) {
            return;
        }
        aVar2.h(context, str, callProducerButton.m, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(boolean z, c cVar) {
        boolean z2;
        boolean z3;
        boolean z4 = true;
        if (!z) {
            ProductActionButton productActionButton = cVar.e;
            if ((productActionButton != null ? productActionButton.b : null) != ProductActionButton.Type.CONTACT) {
                z2 = false;
                this.e.setEnabled(z2);
                if (!z) {
                    ProductActionButton productActionButton2 = cVar.f;
                    if ((productActionButton2 != null ? productActionButton2.b : null) != ProductActionButton.Type.CONTACT) {
                        z3 = false;
                        this.f.setEnabled(z3);
                        this.g.setEnabled(!z || d(cVar.g));
                        this.h.setEnabled(!z || d(cVar.g));
                        if (!z && !d(cVar.h)) {
                            z4 = false;
                        }
                        this.i.setEnabled(z4);
                    }
                }
                z3 = true;
                this.f.setEnabled(z3);
                this.g.setEnabled(!z || d(cVar.g));
                this.h.setEnabled(!z || d(cVar.g));
                if (!z) {
                    z4 = false;
                }
                this.i.setEnabled(z4);
            }
        }
        z2 = true;
        this.e.setEnabled(z2);
        if (!z) {
        }
        z3 = true;
        this.f.setEnabled(z3);
        this.g.setEnabled(!z || d(cVar.g));
        this.h.setEnabled(!z || d(cVar.g));
        if (!z) {
        }
        this.i.setEnabled(z4);
    }
}
