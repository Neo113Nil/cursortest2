package com.vk.clips.design.view.author;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.vk.clips.design.view.author.a;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.components.picture.c;
import com.vk.core.view.components.userstack.VkDiagonalUserStack;
import com.vkontakte.android.R;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.ayv0;
import xsna.d8d;
import xsna.e43;
import xsna.en9;
import xsna.epx;
import xsna.gi8;
import xsna.gko;
import xsna.gzs;
import xsna.k1;
import xsna.kmc;
import xsna.mdd;
import xsna.q3;
import xsna.s3q0;
import xsna.tlo0;
import xsna.x01;

/* compiled from: ClipAuthorCellView.kt */
/* loaded from: classes16.dex */
public final class ClipAuthorCellView extends FrameLayout {
    public a b;
    public final VkCell c;
    public final kmc d;
    public final d8d e;
    public final mdd f;

    public ClipAuthorCellView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        VkCell vkCell = new VkCell(context, null, 6, 0);
        this.c = vkCell;
        kmc kmcVar = new kmc(context);
        this.d = kmcVar;
        d8d d8dVar = new d8d(context);
        this.e = d8dVar;
        this.f = new mdd(context);
        vkCell.setSexyCellBeforeSlots(Collections.singletonList(kmcVar));
        vkCell.setSexyCellMiddleSlots(Collections.singletonList(d8dVar));
        addView(vkCell, new FrameLayout.LayoutParams(-1, -2));
        setClickable(true);
        setFocusable(true);
        vkCell.setClickable(false);
        vkCell.setFocusable(false);
    }

    public final a getState() {
        return this.b;
    }

    public final void setState(a aVar) {
        if (epx.f(this.b, aVar)) {
            return;
        }
        this.b = aVar;
        setVisibility(aVar == null ? 8 : 0);
        if (aVar == null) {
            return;
        }
        setVisibility(0);
        a.InterfaceC0555a interfaceC0555a = aVar.a;
        kmc kmcVar = this.d;
        VkDiagonalUserStack vkDiagonalUserStack = kmcVar.c;
        VkAvatar vkAvatar = kmcVar.b;
        int i = 2;
        int i2 = 1;
        if (interfaceC0555a instanceof a.InterfaceC0555a.C0556a) {
            vkAvatar.setVisibility(8);
            vkDiagonalUserStack.setVisibility(8);
        } else if (interfaceC0555a instanceof a.InterfaceC0555a.b) {
            vkAvatar.setVisibility(0);
            vkDiagonalUserStack.setVisibility(8);
            gko.b bVar = gko.Companion;
            a.InterfaceC0555a.b bVar2 = (a.InterfaceC0555a.b) interfaceC0555a;
            String str = bVar2.a;
            vkAvatar.setContent(str != null ? new c.d(str, new gko(R.drawable.user_placeholder)) : new c.b(new gko(R.drawable.user_placeholder)));
            vkAvatar.setBorder(bVar2.b);
            if (bVar2.c != null) {
                vkAvatar.setOnClickListener(new en9(interfaceC0555a, i));
                vkAvatar.setClickable(true);
            } else {
                vkAvatar.setOnClickListener(null);
                vkAvatar.setClickable(false);
            }
        } else {
            if (!(interfaceC0555a instanceof a.InterfaceC0555a.c)) {
                throw new NoWhenBranchMatchedException();
            }
            vkAvatar.setVisibility(8);
            vkDiagonalUserStack.setVisibility(0);
            a.InterfaceC0555a.c cVar = (a.InterfaceC0555a.c) interfaceC0555a;
            String str2 = cVar.a;
            ayv0 cVar2 = str2 != null ? new ayv0.c(str2) : new ayv0.b(R.drawable.user_placeholder);
            String str3 = cVar.b;
            vkDiagonalUserStack.setAvatars(e43.l(cVar2, str3 != null ? new ayv0.c(str3) : new ayv0.b(R.drawable.user_placeholder)));
            if (cVar.c != null) {
                vkDiagonalUserStack.setOnClickListener(new gi8(interfaceC0555a, i2));
                vkDiagonalUserStack.setClickable(true);
            } else {
                vkDiagonalUserStack.setOnClickListener(null);
                vkDiagonalUserStack.setClickable(false);
            }
        }
        a.c cVar3 = aVar.b;
        a.b bVar3 = aVar.c;
        d8d d8dVar = this.e;
        VkImage vkImage = d8dVar.d;
        b bVar4 = d8dVar.e;
        d8dVar.b.setText(cVar3.a.a(d8dVar.f.getContext()));
        d8dVar.c.setVisibility(cVar3.b ? 0 : 8);
        String str4 = cVar3.c;
        if (str4 != null) {
            vkImage.setVisibility(0);
            vkImage.o0(str4, null);
        } else {
            vkImage.setVisibility(8);
        }
        if (bVar3 == null) {
            bVar4.setVisibility(8);
            bVar4.setItems(EmptyList.b);
        } else {
            bVar4.setVisibility(0);
            bVar4.setItems(bVar3.a);
            gzs<s3q0> gzsVar = bVar3.b;
            if (gzsVar != null) {
                bVar4.setOnClickListener(new q3(gzsVar, 2));
                bVar4.setClickable(true);
            } else {
                bVar4.setOnClickListener(null);
                bVar4.setClickable(false);
            }
        }
        a.d dVar = aVar.d;
        VkCell vkCell = this.c;
        if (dVar == null) {
            vkCell.setSexyCellAfterSlots(null);
            return;
        }
        mdd mddVar = this.f;
        VkButton vkButton = mddVar.b;
        vkButton.setVisibility(8);
        VkImage vkImage2 = mddVar.c;
        vkImage2.setVisibility(8);
        if (dVar instanceof a.d.C0561a) {
            vkButton.setVisibility(0);
            a.d.C0561a c0561a = (a.d.C0561a) dVar;
            vkButton.setText(tlo0.b.a(c0561a.a, mddVar.d.getContext()));
            vkButton.setOnClickListener(new x01(dVar, i2));
            a.d.C0561a.InterfaceC0562a interfaceC0562a = c0561a.b;
            if (epx.f(interfaceC0562a, a.d.C0561a.InterfaceC0562a.b.a)) {
                vkButton.setMode(VkButton.Mode.Primary);
                vkButton.setAppearance(VkButton.Appearance.Overlay);
                vkButton.setupBlur(null);
            } else {
                if (!(interfaceC0562a instanceof a.d.C0561a.InterfaceC0562a.C0563a)) {
                    throw new NoWhenBranchMatchedException();
                }
                vkButton.setMode(VkButton.Mode.Secondary);
                vkButton.setAppearance(VkButton.Appearance.Overlay);
                vkButton.setupBlur(((a.d.C0561a.InterfaceC0562a.C0563a) interfaceC0562a).a);
            }
        } else {
            if (!(dVar instanceof a.d.b)) {
                throw new NoWhenBranchMatchedException();
            }
            vkButton.setupBlur(null);
            vkImage2.setVisibility(0);
            vkImage2.setOnClickListener(new k1(dVar, 6));
        }
        vkCell.setSexyCellAfterSlots(Collections.singletonList(mddVar));
    }
}
