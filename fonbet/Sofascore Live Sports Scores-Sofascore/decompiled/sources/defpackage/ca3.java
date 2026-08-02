package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.u;
import com.sofascore.model.Section;
import com.sofascore.model.mvvm.model.PinnedTournament;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.results.R;
import com.sofascore.results.ads.iml.banner.AdBannerView;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.ListIterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ca3 extends q2 {
    public final i43 q;
    public final ox1 r;
    public final Drawable s;
    public final Drawable t;
    public final Drawable u;
    public final LayoutInflater v;
    public k43 w;
    public boolean x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ca3(Context context, i43 i43Var, ox1 ox1Var) {
        super(context);
        context.getClass();
        this.q = i43Var;
        this.r = ox1Var;
        Drawable drawable = context.getDrawable(R.drawable.ic_pin_on);
        Drawable drawable2 = null;
        if (drawable != null) {
            drawable.mutate().setTintList(ColorStateList.valueOf(context.getColor(R.color.n_lv_1)));
        } else {
            drawable = null;
        }
        this.s = drawable;
        Drawable drawable3 = context.getDrawable(R.drawable.ic_pin_off);
        if (drawable3 != null) {
            drawable3.mutate().setTintList(ColorStateList.valueOf(context.getColor(R.color.neutral_default)));
        } else {
            drawable3 = null;
        }
        this.t = drawable3;
        Drawable drawable4 = context.getDrawable(R.drawable.ic_reorder);
        if (drawable4 != null) {
            drawable4.mutate().setTintList(ColorStateList.valueOf(context.getColor(R.color.primary_default)));
            drawable2 = drawable4;
        }
        this.u = drawable2;
        this.v = LayoutInflater.from(context);
    }

    @Override // defpackage.g7
    public final boolean E(u uVar, u uVar2) {
        int i;
        int intValue;
        uVar.getClass();
        if (!super.E(uVar, uVar2)) {
            return false;
        }
        int absoluteAdapterPosition = uVar.getAbsoluteAdapterPosition();
        int absoluteAdapterPosition2 = uVar2.getAbsoluteAdapterPosition();
        ArrayList arrayList = this.g;
        int size = absoluteAdapterPosition - arrayList.size();
        int size2 = absoluteAdapterPosition2 - arrayList.size();
        ArrayList arrayList2 = this.i;
        arrayList2.getClass();
        ListIterator listIterator = arrayList2.listIterator(arrayList2.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                i = -1;
                break;
            }
            Object previous = listIterator.previous();
            previous.getClass();
            if (v(previous) == 3) {
                i = listIterator.nextIndex();
                break;
            }
        }
        Integer valueOf = i == -1 ? null : Integer.valueOf(i);
        if (valueOf != null && (size == (intValue = valueOf.intValue()) || size2 == intValue)) {
            notifyItemChanged(absoluteAdapterPosition);
            notifyItemChanged(absoluteAdapterPosition2);
        }
        return true;
    }

    @Override // defpackage.w0
    public final void G(t54 t54Var, int i, int i2, AdBannerView adBannerView) {
        int i3;
        super.G(t54Var, i, i2, adBannerView);
        FrameLayout frameLayout = t54Var.b;
        ArrayList arrayList = this.i;
        int i4 = i + 1;
        if (arrayList.size() > i4) {
            Object obj = arrayList.get(i4);
            obj.getClass();
            i3 = v(obj);
        } else {
            i3 = -1;
        }
        Context context = this.b;
        if (i == 0) {
            adBannerView.setBackgroundColor(context.getColor(R.color.surface_0));
            return;
        }
        if (i3 != 3) {
            frameLayout.setBackgroundColor(context.getColor(R.color.surface_0));
            sea.v(frameLayout, false, false, 16, 2, 0, null, 112);
        } else {
            adBannerView.setBackgroundColor(context.getColor(R.color.surface_2));
            sea.v(frameLayout, false, false, 16, 2, 0, null, 112);
            frameLayout.setPaddingRelative(ao2.s(8, context), 0, ao2.s(8, context), 0);
        }
    }

    @Override // defpackage.w0
    public final f3 I(ArrayList arrayList) {
        ArrayList arrayList2 = this.i;
        arrayList2.getClass();
        return new th(arrayList2, arrayList, 7);
    }

    @Override // defpackage.ysk
    public final Integer a(int i) {
        if (i != 0) {
            if (i == 3) {
                return Integer.valueOf(R.id.background_container);
            }
            if (i != 5) {
                return null;
            }
        }
        return Integer.valueOf(R.id.card_content);
    }

    @Override // defpackage.ysk
    public final boolean j(int i, Object obj) {
        if ((obj instanceof w93) || (obj instanceof x93)) {
            return true;
        }
        return obj instanceof y93 ? (this.x || ((y93) obj).c.isEmpty()) ? false : true : (obj instanceof UniqueTournament) || (obj instanceof ba3) || (obj instanceof PinnedTournament);
    }

    @Override // defpackage.w0, defpackage.g7
    public final int v(Object obj) {
        obj.getClass();
        if (obj instanceof y93) {
            return 1;
        }
        if (obj instanceof w93) {
            return 0;
        }
        if (obj instanceof x93) {
            return 5;
        }
        if (obj instanceof ba3) {
            return 2;
        }
        if (obj instanceof PinnedTournament) {
            return 3;
        }
        if (obj instanceof Section) {
            return 4;
        }
        super.v(obj);
        return Sdk.SDKError.Reason.AD_NO_FILL_VALUE;
    }

    @Override // defpackage.w0, defpackage.g7
    public final p8 z(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        LayoutInflater layoutInflater = this.v;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? super.z(viewGroup, i) : new v93(this, z82.g(layoutInflater, viewGroup), 1) : new ob5(h04.e(layoutInflater, viewGroup), 1) : new aa3(this, z82.j(layoutInflater, viewGroup)) : new vh(this, z82.j(layoutInflater, viewGroup)) : new z02(esk.b(layoutInflater, viewGroup), new ox1(this, 23), (ct8) this.a.d) : new v93(this, z82.g(layoutInflater, viewGroup), 0);
    }
}
