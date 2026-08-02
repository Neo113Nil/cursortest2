package com.vk.core.ui.bottomsheet.actionsheet;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import com.vk.core.ui.bottomsheet.actionsheet.ModalActionSheetListItem;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;
import java.util.List;
import xsna.av20;
import xsna.awt0;
import xsna.bfm;
import xsna.dh6;
import xsna.dw20;
import xsna.e3m;
import xsna.f4m;
import xsna.foi;
import xsna.gzs;
import xsna.hkp;
import xsna.hmb;
import xsna.iah0;
import xsna.izs;
import xsna.s3q0;
import xsna.s770;
import xsna.vu20;
import xsna.wu20;
import xsna.x2;
import xsna.xu20;
import xsna.yu20;

/* compiled from: ModalActionSheet.kt */
/* loaded from: classes17.dex */
public final class a {
    public final List<yu20> a;
    public final izs<ModalActionSheetListItem, s3q0> b;
    public final gzs<s3q0> c;
    public final boolean d;
    public dw20 e;

    /* compiled from: ModalActionSheet.kt */
    /* renamed from: com.vk.core.ui.bottomsheet.actionsheet.a$a, reason: collision with other inner class name */
    public static class C0785a {
        public List<? extends yu20> b;
        public izs<? super ModalActionSheetListItem, s3q0> c;
        public bfm d;
        public dh6.a e;
        public boolean f;
        public int g;

        public final dw20 a(Context context, String str) {
            List<? extends yu20> list = this.b;
            if (list == null) {
                throw new IllegalArgumentException("items must not be null!");
            }
            izs<? super ModalActionSheetListItem, s3q0> izsVar = this.c;
            if (izsVar == null) {
                throw new IllegalArgumentException("onClickAction must not be null!");
            }
            bfm bfmVar = this.d;
            dh6.a aVar = this.e;
            boolean z = this.f;
            int i = this.g;
            a aVar2 = new a(list, izsVar, bfmVar, aVar, z, i);
            x2 x2Var = new x2(5, aVar2, context);
            av20.a aVar3 = new av20.a();
            aVar3.d(R.layout.modal_action_sheet_item, LayoutInflater.from(context));
            aVar3.d = new b();
            aVar3.e = new wu20(x2Var);
            av20 b = aVar3.b();
            b.setItems(list);
            dw20.b X = new dw20.b(context, aVar).Z(new vu20(aVar2, 0)).X(new foi(aVar2, 25));
            if (i != 0) {
                X.u0(i);
            }
            dw20 I0 = ((dw20.b) dw20.a.k(X.o0(iah0.a(10)), b, 4)).I0(str);
            aVar2.e = I0;
            return I0;
        }
    }

    /* compiled from: ModalActionSheet.kt */
    public static final class b extends s770 {
        @Override // xsna.s770
        public final void m(hkp hkpVar, Object obj, int i) {
            yu20 yu20Var = (yu20) obj;
            if (!(yu20Var instanceof ModalActionSheetListItem)) {
                if (yu20Var instanceof xu20) {
                    xu20 xu20Var = (xu20) yu20Var;
                    String str = xu20Var.a;
                    hkpVar.f(R.id.actionContent).setEnabled(false);
                    VkText vkText = (VkText) hkpVar.f(R.id.title);
                    String str2 = xu20Var.b;
                    vkText.setText(str);
                    vkText.setTextAppearance(R.style.VkUiTypography_FootnoteMedium);
                    vkText.setTextColor(e3m.f(R.attr.vk_ui_text_subhead, vkText.getContext()));
                    vkText.setMaxLines(2);
                    awt0.v(vkText, !(str == null || str.length() == 0));
                    VkText vkText2 = (VkText) hkpVar.f(R.id.description);
                    vkText2.setText(str2);
                    vkText2.setTextAppearance(R.style.VkUiTypography_Footnote);
                    vkText2.setTextColor(e3m.f(R.attr.vk_ui_text_subhead, vkText2.getContext()));
                    f4m.t(iah0.a(8), vkText2);
                    vkText2.setMaxLines(xu20Var.c);
                    awt0.v(vkText2, !(str2 == null || str2.length() == 0));
                    izs<Activity, s3q0> izsVar = xu20Var.d;
                    if (izsVar != null) {
                        vkText2.setOnClickListener(new hmb(3, izsVar, vkText2));
                    }
                    f4m.j((VkImageSimple) hkpVar.f(R.id.icon));
                    f4m.j((VkImageSimple) hkpVar.f(R.id.checked_icon));
                    return;
                }
                return;
            }
            ModalActionSheetListItem modalActionSheetListItem = (ModalActionSheetListItem) yu20Var;
            View f = hkpVar.f(R.id.actionContent);
            ModalActionSheetListItem.Appearance appearance = modalActionSheetListItem.b;
            int i2 = modalActionSheetListItem.f;
            ModalActionSheetListItem.IconSize iconSize = modalActionSheetListItem.g;
            String str3 = modalActionSheetListItem.e;
            String str4 = modalActionSheetListItem.c;
            f.setEnabled(appearance != ModalActionSheetListItem.Appearance.Disabled);
            VkText vkText3 = (VkText) hkpVar.f(R.id.title);
            vkText3.setText(str4);
            vkText3.setTextAppearance(R.style.VkUiTypography_Text);
            vkText3.setTextColor(e3m.f(appearance.i(), vkText3.getContext()));
            vkText3.setMaxLines(modalActionSheetListItem.i ? Integer.MAX_VALUE : 1);
            awt0.v(vkText3, !(str4 == null || str4.length() == 0));
            VkText vkText4 = (VkText) hkpVar.f(R.id.description);
            vkText4.setText(str3);
            vkText4.setTextAppearance(R.style.VkUiTypography_Subhead);
            vkText4.setTextColor(e3m.f(R.attr.vk_ui_icon_secondary, vkText4.getContext()));
            f4m.t(iah0.a(2), vkText4);
            vkText4.setMaxLines(Integer.MAX_VALUE);
            awt0.v(vkText4, !(str3 == null || str3.length() == 0));
            VkImageSimple vkImageSimple = (VkImageSimple) hkpVar.f(R.id.icon);
            f4m.z(iah0.a(iconSize.i()), iah0.a(iconSize.i()), vkImageSimple);
            vkImageSimple.setImageResource(i2);
            vkImageSimple.setColorFilter(e3m.f(appearance.h(), vkImageSimple.getContext()));
            awt0.v(vkImageSimple, i2 > 0);
            awt0.v((VkImageSimple) hkpVar.f(R.id.checked_icon), modalActionSheetListItem.h);
        }

        @Override // xsna.s770
        public final hkp p(View view) {
            hkp hkpVar = new hkp(7);
            hkpVar.e(view.findViewById(R.id.actionContent), view.findViewById(R.id.title), view.findViewById(R.id.description), view.findViewById(R.id.icon), view.findViewById(R.id.checked_icon));
            return hkpVar;
        }
    }

    public a(List list, izs izsVar, bfm bfmVar, dh6.a aVar, boolean z, int i) {
        this.a = list;
        this.b = izsVar;
        this.c = bfmVar;
        this.d = z;
    }
}
