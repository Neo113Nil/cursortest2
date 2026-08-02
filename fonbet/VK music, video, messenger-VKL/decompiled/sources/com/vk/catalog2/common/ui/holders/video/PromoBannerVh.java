package com.vk.catalog2.common.ui.holders.video;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.dto.ui.UIBlockPlaceholder;
import com.vk.catalog2.common.dto.ui.actions.UIBlockHideBlockButton;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.serialize.Serializer;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.Image;
import com.vk.dto.newsfeed.Owner;
import com.vk.imageloader.view.VKImageView;
import com.vk.libvideo.bottomsheet.about.delegate.r;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import xsna.b0u0;
import xsna.bwt0;
import xsna.ezt0;
import xsna.fnj;
import xsna.gkc0;
import xsna.iah0;
import xsna.itg0;
import xsna.iut0;
import xsna.mll0;
import xsna.q3a;
import xsna.rsg0;
import xsna.xga;
import xsna.yfb;

/* compiled from: PromoBannerVh.kt */
/* loaded from: classes16.dex */
public final class PromoBannerVh implements CatalogViewHolder {
    public final q3a c;
    public final mll0 d;
    public VKImageView f;
    public TextView g;
    public View h;
    public UIBlockPlaceholder i;
    public final xga b = new xga();
    public final r e = new r(new ezt0(new gkc0(this, 4)), null);

    /* compiled from: ViewExt.kt */
    public static final class a implements View.OnLayoutChangeListener {
        public final /* synthetic */ VKImageView b;
        public final /* synthetic */ UIBlock c;

        public a(VKImageView vKImageView, UIBlock uIBlock) {
            this.b = vKImageView;
            this.c = uIBlock;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            String str;
            view.removeOnLayoutChangeListener(this);
            Image image = ((UIBlockPlaceholder) this.c).B;
            VKImageView vKImageView = this.b;
            if (image != null) {
                Serializer.c<Owner> cVar = Owner.CREATOR;
                str = Owner.a.a(vKImageView.getWidth(), image);
            } else {
                str = null;
            }
            vKImageView.load(str);
        }
    }

    public PromoBannerVh(q3a q3aVar, mll0 mll0Var) {
        this.c = q3aVar;
        this.d = mll0Var;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        boolean z;
        String str;
        UIBlockPlaceholder uIBlockPlaceholder = uIBlock instanceof UIBlockPlaceholder ? (UIBlockPlaceholder) uIBlock : null;
        if (uIBlockPlaceholder != null) {
            String str2 = uIBlockPlaceholder.A;
            if (str2.length() == 0 || uIBlockPlaceholder.B == null) {
                return;
            }
            this.i = uIBlockPlaceholder;
            VKImageView vKImageView = this.f;
            if (vKImageView != null) {
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                if (vKImageView.isLaidOut()) {
                    Image image = ((UIBlockPlaceholder) uIBlock).B;
                    if (image != null) {
                        Serializer.c<Owner> cVar = Owner.CREATOR;
                        str = Owner.a.a(vKImageView.getWidth(), image);
                    } else {
                        str = null;
                    }
                    vKImageView.load(str);
                } else {
                    vKImageView.addOnLayoutChangeListener(new a(vKImageView, uIBlock));
                }
            }
            TextView textView = this.g;
            if (textView != null) {
                textView.setText(str2);
            }
            ArrayList<UIBlockAction> arrayList = uIBlockPlaceholder.G;
            if (arrayList == null || !arrayList.isEmpty()) {
                Iterator<T> it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((UIBlockAction) it.next()) instanceof UIBlockHideBlockButton) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            View view = this.h;
            if (view != null) {
                view.setVisibility(z ? 0 : 8);
            }
            this.d.invoke();
            itg0.k(rsg0.W(yfb.x(this.b.m(((UIBlockPlaceholder) uIBlock).z, null)), 7), null, null, 3);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        r.a aVar;
        if (viewGroup != null) {
            r rVar = this.e;
            rVar.getClass();
            aVar = new r.a(viewGroup, rVar.a, rVar.b);
        } else {
            aVar = null;
        }
        View view = aVar != null ? aVar.itemView : null;
        Context context = view != null ? view.getContext() : null;
        if (context != null) {
            HashSet hashSet = iah0.a;
            if (fnj.d(context)) {
                int a2 = iah0.a(32);
                bwt0.f0(view, a2, 0, a2, 0, 10);
            }
        }
        this.f = view != null ? (VKImageView) view.findViewById(R.id.icon) : null;
        this.g = view != null ? (TextView) view.findViewById(R.id.title) : null;
        this.h = view != null ? view.findViewById(R.id.hide_btn) : null;
        View findViewById = view != null ? view.findViewById(R.id.divider) : null;
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
        return view;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
        N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return false;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
