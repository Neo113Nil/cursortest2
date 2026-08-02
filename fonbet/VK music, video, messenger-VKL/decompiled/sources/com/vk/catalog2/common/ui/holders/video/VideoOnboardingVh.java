package com.vk.catalog2.common.ui.holders.video;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.vk.catalog2.common.dto.api.CatalogFilterData;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockChips;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOnboarding;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.disposables.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import xsna.arm0;
import xsna.awt0;
import xsna.biq;
import xsna.bwt0;
import xsna.dnp0;
import xsna.i0q0;
import xsna.ibc;
import xsna.k29;
import xsna.q3a;
import xsna.ryc;
import xsna.v9b;
import xsna.wra;
import xsna.zmp0;

/* compiled from: VideoOnboardingVh.kt */
/* loaded from: classes16.dex */
public final class VideoOnboardingVh implements CatalogViewHolder {
    public final q3a b;
    public String c;
    public String d;
    public View e;
    public LinearLayout f;
    public ChipGroup g;
    public TextView h;
    public TextView i;
    public TextView j;
    public ImageView k;
    public ProgressBar l;
    public TextView m;
    public LayoutInflater n;
    public final dnp0 o;
    public final ryc p;
    public c q;

    public VideoOnboardingVh(q3a q3aVar) {
        this.b = q3aVar;
        dnp0 dnp0Var = new dnp0();
        dnp0Var.g(0);
        dnp0Var.e(500L);
        dnp0Var.c(new biq(2));
        dnp0Var.c(new wra());
        dnp0Var.c(new biq(1));
        this.o = dnp0Var;
        this.p = new ryc(this, 13);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        c cVar = this.q;
        if (cVar != null) {
            cVar.dispose();
        }
        this.q = null;
        i0q0.g(this.p);
        ChipGroup chipGroup = this.g;
        (chipGroup != null ? chipGroup : null).removeAllViews();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        Object obj;
        UIBlockChips uIBlockChips = uIBlock instanceof UIBlockChips ? (UIBlockChips) uIBlock : null;
        if (uIBlockChips == null) {
            return;
        }
        i0q0.g(this.p);
        boolean z = true;
        b(true);
        this.c = uIBlock.b;
        TextView textView = this.h;
        if (textView == null) {
            textView = null;
        }
        textView.setText(uIBlockChips.y);
        TextView textView2 = this.i;
        if (textView2 == null) {
            textView2 = null;
        }
        textView2.setText(uIBlockChips.z);
        Iterator it = ((UIBlockChips) uIBlock).A.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (obj instanceof UIBlockActionOnboarding) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        if (!(obj instanceof UIBlockActionOnboarding)) {
            obj = null;
        }
        UIBlockActionOnboarding uIBlockActionOnboarding = (UIBlockActionOnboarding) obj;
        if (uIBlockActionOnboarding != null) {
            List<CatalogFilterData> list = uIBlockActionOnboarding.B;
            this.d = uIBlockActionOnboarding.z;
            TextView textView3 = this.j;
            if (textView3 == null) {
                textView3 = null;
            }
            textView3.setText(uIBlockActionOnboarding.A);
            TextView textView4 = this.j;
            if (textView4 == null) {
                textView4 = null;
            }
            List<CatalogFilterData> list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    if (((CatalogFilterData) it2.next()).e) {
                        break;
                    }
                }
            }
            z = false;
            bwt0.p0(textView4, z);
            ChipGroup chipGroup = this.g;
            if (chipGroup == null) {
                chipGroup = null;
            }
            chipGroup.removeAllViews();
            for (CatalogFilterData catalogFilterData : list2) {
                LayoutInflater layoutInflater = this.n;
                if (layoutInflater == null) {
                    layoutInflater = null;
                }
                ChipGroup chipGroup2 = this.g;
                if (chipGroup2 == null) {
                    chipGroup2 = null;
                }
                Chip chip = (Chip) layoutInflater.inflate(R.layout.catalog_video_onboarding_chip, (ViewGroup) chipGroup2, false);
                Integer m = arm0.m(10, catalogFilterData.b);
                if (m != null) {
                    chip.setId(m.intValue());
                }
                chip.setOutlineProvider(new ibc());
                chip.setText(catalogFilterData.c);
                chip.setChecked(catalogFilterData.e);
                chip.setOnCheckedChangeListener(new k29(this, 1));
                ChipGroup chipGroup3 = this.g;
                if (chipGroup3 == null) {
                    chipGroup3 = null;
                }
                chipGroup3.addView(chip);
            }
        }
    }

    public final ArrayList a() {
        ChipGroup chipGroup = this.g;
        if (chipGroup == null) {
            chipGroup = null;
        }
        View[] d = awt0.d(chipGroup);
        ArrayList arrayList = new ArrayList();
        for (View view : d) {
            if (view instanceof Chip) {
                arrayList.add(view);
            }
        }
        return arrayList;
    }

    public final void b(boolean z) {
        boolean z2;
        LinearLayout linearLayout = this.f;
        if (linearLayout == null) {
            linearLayout = null;
        }
        zmp0.b(linearLayout);
        LinearLayout linearLayout2 = this.f;
        if (linearLayout2 == null) {
            linearLayout2 = null;
        }
        zmp0.a(linearLayout2, this.o);
        ImageView imageView = this.k;
        if (imageView == null) {
            imageView = null;
        }
        boolean z3 = !z;
        bwt0.p0(imageView, z3);
        TextView textView = this.m;
        if (textView == null) {
            textView = null;
        }
        bwt0.p0(textView, z3);
        TextView textView2 = this.h;
        if (textView2 == null) {
            textView2 = null;
        }
        bwt0.p0(textView2, z);
        TextView textView3 = this.i;
        if (textView3 == null) {
            textView3 = null;
        }
        bwt0.p0(textView3, z);
        ChipGroup chipGroup = this.g;
        if (chipGroup == null) {
            chipGroup = null;
        }
        bwt0.p0(chipGroup, z);
        TextView textView4 = this.j;
        TextView textView5 = textView4 != null ? textView4 : null;
        if (z) {
            ArrayList a = a();
            if (!a.isEmpty()) {
                Iterator it = a.iterator();
                while (it.hasNext()) {
                    if (((Chip) it.next()).isChecked()) {
                        z2 = true;
                        break;
                    }
                }
            }
        }
        z2 = false;
        bwt0.p0(textView5, z2);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog_video_onboarding, viewGroup, false);
        this.e = inflate;
        this.f = (LinearLayout) inflate.findViewById(R.id.onboarding);
        View view = this.e;
        if (view == null) {
            view = null;
        }
        this.h = (TextView) view.findViewById(R.id.title);
        View view2 = this.e;
        if (view2 == null) {
            view2 = null;
        }
        this.i = (TextView) view2.findViewById(R.id.subtitle);
        View view3 = this.e;
        if (view3 == null) {
            view3 = null;
        }
        this.g = (ChipGroup) view3.findViewById(R.id.interests);
        View view4 = this.e;
        if (view4 == null) {
            view4 = null;
        }
        this.k = (ImageView) view4.findViewById(R.id.like_icon);
        View view5 = this.e;
        if (view5 == null) {
            view5 = null;
        }
        this.l = (ProgressBar) view5.findViewById(R.id.onboarding_progress);
        View view6 = this.e;
        if (view6 == null) {
            view6 = null;
        }
        this.m = (TextView) view6.findViewById(R.id.response_message);
        View view7 = this.e;
        if (view7 == null) {
            view7 = null;
        }
        TextView textView = (TextView) view7.findViewById(R.id.submit);
        textView.setOnClickListener(new v9b(this, 13));
        this.j = textView;
        this.n = layoutInflater;
        View view8 = this.e;
        if (view8 == null) {
            return null;
        }
        return view8;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
        N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return false;
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
