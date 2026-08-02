package com.vk.core.view.components.context.menu;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.context.menu.e;
import com.vk.core.view.components.divider.VkSeparator;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.f4m;
import xsna.hbh0;
import xsna.hkp;
import xsna.jpj0;

/* compiled from: VkUiContextMenu.kt */
/* loaded from: classes17.dex */
public final class c extends jpj0<VkContextMenu.a> {
    public final /* synthetic */ e.a c;
    public final /* synthetic */ ArrayList d;

    public c(e.a aVar, ArrayList arrayList) {
        this.c = aVar;
        this.d = arrayList;
    }

    @Override // xsna.jpj0, xsna.s770
    public final hkp p(View view) {
        hkp p = super.p(view);
        TextView textView = (TextView) view.findViewById(R.id.action_text);
        ImageView imageView = (ImageView) view.findViewById(R.id.action_check_icon);
        VkSeparator vkSeparator = (VkSeparator) view.findViewById(R.id.separator);
        e.a aVar = this.c;
        Drawable drawable = aVar.g;
        if (drawable != null && imageView != null) {
            imageView.setImageDrawable(drawable);
        }
        if (imageView != null) {
            p.d(imageView);
        }
        ArrayList arrayList = this.d;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((VkContextMenu.a) it.next()).d) {
                    break;
                }
            }
        }
        if (imageView != null) {
            f4m.j(imageView);
        }
        View findViewById = view.findViewById(R.id.action_icon);
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (((VkContextMenu.a) it2.next()).b != null) {
                    findViewById.setVisibility(0);
                    Integer num = aVar.h;
                    f4m.s(num != null ? num.intValue() : hbh0.b(16, findViewById.getContext()), textView);
                    if (f4m.f(imageView)) {
                        Integer num2 = aVar.i;
                        f4m.r(num2 != null ? num2.intValue() : hbh0.b(20, findViewById.getContext()), textView);
                    }
                }
            }
        }
        p.d(findViewById);
        if (vkSeparator != null) {
            p.d(vkSeparator);
        }
        return p;
    }

    @Override // xsna.jpj0
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final void m(hkp hkpVar, VkContextMenu.a aVar, int i) {
        super.m(hkpVar, aVar, i);
        ImageView imageView = (ImageView) hkpVar.f(R.id.action_check_icon);
        e.a aVar2 = this.c;
        if (imageView != null) {
            if (aVar.d) {
                if (aVar2.g == null || aVar2.k) {
                    imageView.setColorFilter(aVar2.d);
                }
                imageView.setVisibility(0);
            } else if (!f4m.f(imageView)) {
                imageView.setVisibility(4);
            }
        }
        ImageView imageView2 = (ImageView) hkpVar.f(R.id.action_icon);
        imageView2.setImageDrawable(aVar.b);
        Integer num = aVar.c;
        if (num == null) {
            num = aVar2.j.invoke();
        }
        if (num != null) {
            imageView2.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
        VkSeparator vkSeparator = (VkSeparator) hkpVar.f(R.id.separator);
        if (vkSeparator != null) {
            f4m.E(vkSeparator, aVar.e);
        }
    }
}
