package com.vk.catalog2.common.ui.holders.video;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.dto.ui.UIBlockPlaceholder;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionTextButton;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.serialize.Serializer;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.Image;
import com.vk.dto.hints.HintId;
import com.vk.dto.newsfeed.Owner;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.WeakHashMap;
import xsna.b0u0;
import xsna.bpn0;
import xsna.epx;
import xsna.iut0;
import xsna.niy;
import xsna.ro5;
import xsna.uv0;

/* compiled from: KidsModeVh.kt */
/* loaded from: classes16.dex */
public final class KidsModeVh implements CatalogViewHolder {
    public final ro5 b;
    public TextView c;
    public VKImageView d;
    public TextView e;
    public View f;
    public final bpn0 g = new bpn0(new uv0(19));

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

    public KidsModeVh(ro5 ro5Var) {
        this.b = ro5Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        UIBlockActionTextButton uIBlockActionTextButton;
        String str;
        if (uIBlock instanceof UIBlockPlaceholder) {
            TextView textView = this.c;
            if (textView != null) {
                textView.setText(((UIBlockPlaceholder) uIBlock).D);
            }
            VKImageView vKImageView = this.d;
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
            Iterator it = ((UIBlockPlaceholder) uIBlock).G.iterator();
            while (true) {
                if (!it.hasNext()) {
                    uIBlockActionTextButton = 0;
                    break;
                } else {
                    uIBlockActionTextButton = it.next();
                    if (((UIBlockAction) uIBlockActionTextButton).d == CatalogViewType.SYNTHETIC_ACTION_OPEN_MODAL) {
                        break;
                    }
                }
            }
            UIBlockActionTextButton uIBlockActionTextButton2 = uIBlockActionTextButton instanceof UIBlockActionTextButton ? uIBlockActionTextButton : null;
            TextView textView2 = this.e;
            if (uIBlockActionTextButton2 == null || textView2 == null) {
                return;
            }
            textView2.setText(uIBlockActionTextButton2.z);
            UIBlockHint uIBlockHint = uIBlock.j;
            if (uIBlockHint != null) {
                if (!epx.f(uIBlockHint.y, HintId.INFO_KIDS_TOOLTIP_ON_BUTTON.getId())) {
                    textView2.postDelayed(new niy(this, uIBlockHint, textView2), 350L);
                } else if (((Boolean) this.g.getValue()).booleanValue()) {
                    this.b.getClass();
                    textView2.postDelayed(new niy(this, uIBlockHint, textView2), 350L);
                }
            }
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.video_kids_mode_view, viewGroup, false);
        this.f = inflate;
        this.c = (TextView) inflate.findViewById(R.id.title);
        this.d = (VKImageView) inflate.findViewById(R.id.icon);
        this.e = (TextView) inflate.findViewById(R.id.action);
        return inflate;
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
