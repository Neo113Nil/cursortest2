package com.vk.superapp.miniapps.picker;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.cell.VkCell;
import com.vk.external.miniapp.net.app.WebImageSize;
import com.vk.superapp.miniapps.picker.PickerItem;
import com.vk.superapp.miniapps.picker.g;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.bwt0;
import xsna.gzs;
import xsna.hxp;
import xsna.izs;
import xsna.k1u0;
import xsna.kp20;
import xsna.oq;
import xsna.rki0;
import xsna.t3e0;
import xsna.tlo0;
import xsna.yha0;
import xsna.zoj0;

/* compiled from: PickerAdapter.kt */
/* loaded from: classes6.dex */
public final class i extends zoj0<PickerItem, RecyclerView.e0> {
    public final b e;

    /* compiled from: PickerAdapter.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PickerItem.ViewType.values().length];
            try {
                iArr[PickerItem.ViewType.Banner.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PickerItem.ViewType.Header.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PickerItem.ViewType.ItemSend.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PickerItem.ViewType.Separator.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PickerItem.ViewType.Error.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PickerItem.ViewType.Progress.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PickerItem.ViewType.ItemOpen.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public i(b bVar) {
        super(new com.vk.lists.a(new yha0()));
        this.e = bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return ((PickerItem) this.c.c(i)).b();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        PickerItem pickerItem = (PickerItem) this.c.c(i);
        if (pickerItem instanceof PickerItem.b) {
            d dVar = e0Var instanceof d ? (d) e0Var : null;
            if (dVar != null) {
                PickerItem.b bVar = (PickerItem.b) pickerItem;
                TextView textView = dVar.l;
                if (textView != null) {
                    textView.setText(bVar.c);
                    return;
                }
                return;
            }
            return;
        }
        if (pickerItem instanceof PickerItem.d) {
            f fVar = e0Var instanceof f ? (f) e0Var : null;
            if (fVar != null) {
                PickerItem.d dVar2 = (PickerItem.d) pickerItem;
                VkCell vkCell = fVar.m;
                fVar.n = dVar2;
                WebImageSize f = dVar2.c.f(f.o);
                String str = f != null ? f.b : null;
                vkCell.setLeftMainPictureController(new kp20());
                vkCell.setLeft(new VkCell.Left.b(new VkCell.Left.Main.d(new g.a(str), VkCell.Left.Main.Size.Medium), null));
                tlo0.h d = oq.d(tlo0.Companion, dVar2.d);
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                vkCell.setMiddle(new VkCell.Middle.b(new VkCell.Middle.e(d, 1, truncateAt, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 50), new VkCell.Middle.d(new tlo0.h(dVar2.e), (gzs) null, 1, truncateAt, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 50), (VkCell.Middle.c) null, (VkCell.Middle.Size) null, 12));
                return;
            }
            return;
        }
        if (pickerItem instanceof PickerItem.e) {
            h hVar = e0Var instanceof h ? (h) e0Var : null;
            if (hVar != null) {
                PickerItem.e eVar = (PickerItem.e) pickerItem;
                hVar.n.setImageResource(eVar.d);
                hVar.o.setText(eVar.b);
                hVar.p.setText(eVar.c);
                return;
            }
            return;
        }
        if (!(pickerItem instanceof PickerItem.c)) {
            if (!(pickerItem instanceof PickerItem.g) && !(pickerItem instanceof PickerItem.a) && !(pickerItem instanceof PickerItem.f)) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        e eVar2 = e0Var instanceof e ? (e) e0Var : null;
        if (eVar2 != null) {
            PickerItem.c cVar = (PickerItem.c) pickerItem;
            VkCell vkCell2 = eVar2.m;
            eVar2.n = cVar;
            WebImageSize f2 = cVar.c.f(e.o);
            String str2 = f2 != null ? f2.b : null;
            vkCell2.setLeftMainPictureController(new kp20());
            vkCell2.setLeft(new VkCell.Left.b(new VkCell.Left.Main.d(new g.a(str2), VkCell.Left.Main.Size.Medium), null));
            tlo0.h d2 = oq.d(tlo0.Companion, cVar.d);
            TextUtils.TruncateAt truncateAt2 = TextUtils.TruncateAt.END;
            vkCell2.setMiddle(new VkCell.Middle.b(new VkCell.Middle.e(d2, 1, truncateAt2, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 50), new VkCell.Middle.d(new tlo0.h(cVar.e), (gzs) null, 1, truncateAt2, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 50), (VkCell.Middle.c) null, (VkCell.Middle.Size) null, 12));
            vkCell2.setRight(new VkCell.Right.d((VkCell.Right.a) null, (VkCell.Right.e) null, (VkCell.Right.ExtraAction.a) null, new VkCell.Right.b((izs) null, new tlo0.f(R.string.close), (k1u0.a) null, 5), 23));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        PickerItem.ViewType viewType = (PickerItem.ViewType) PickerItem.a.get(Integer.valueOf(i));
        if (viewType == null) {
            throw new IllegalStateException("Illegal view type!");
        }
        View I = bwt0.I(viewType.h(), viewGroup, false);
        int i2 = a.$EnumSwitchMapping$0[viewType.ordinal()];
        b bVar = this.e;
        switch (i2) {
            case 1:
                return new h(I, bVar);
            case 2:
                return new d(I);
            case 3:
                return new f(I, bVar);
            case 4:
                return new rki0(I);
            case 5:
                return new hxp(I, bVar);
            case 6:
                return new t3e0(I);
            case 7:
                return new e(I, bVar);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
