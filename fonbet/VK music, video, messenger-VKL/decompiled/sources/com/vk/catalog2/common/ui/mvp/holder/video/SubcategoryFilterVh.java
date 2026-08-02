package com.vk.catalog2.common.ui.mvp.holder.video;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import com.vk.catalog2.common.dto.api.CatalogFilterData;
import com.vk.catalog2.common.dto.api.style.CatalogActionFilterStyle;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionFilter;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vkontakte.android.R;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.e3m;
import xsna.epx;
import xsna.f4m;
import xsna.fpf0;
import xsna.hno0;
import xsna.iah0;
import xsna.jjc;
import xsna.pgn;
import xsna.qcy;
import xsna.sf4;
import xsna.uzp;
import xsna.wtm0;

/* compiled from: SubcategoryFilterVh.kt */
/* loaded from: classes16.dex */
public final class SubcategoryFilterVh implements CatalogViewHolder {
    public static final /* synthetic */ qcy<Object>[] f;
    public final wtm0 b;
    public CheckedTextView c;
    public final pgn d = new pgn();
    public CatalogFilterData e;

    /* compiled from: SubcategoryFilterVh.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CatalogFilterData.FromType.values().length];
            try {
                iArr[CatalogFilterData.FromType.CUSTOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CatalogFilterData.FromType.BACKEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CatalogActionFilterStyle.Style.values().length];
            try {
                iArr2[CatalogActionFilterStyle.Style.INLINE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[CatalogActionFilterStyle.Style.GRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(SubcategoryFilterVh.class, "iconRequest", "getIconRequest()Lio/reactivex/rxjava3/disposables/Disposable;", 0);
        fpf0.a.getClass();
        f = new qcy[]{mutablePropertyReference1Impl};
    }

    public SubcategoryFilterVh(wtm0 wtm0Var) {
        this.b = wtm0Var;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        int f2;
        if (uIBlock instanceof UIBlockActionFilter) {
            CatalogViewStyle catalogViewStyle = uIBlock.l;
            CatalogActionFilterStyle catalogActionFilterStyle = catalogViewStyle instanceof CatalogActionFilterStyle ? (CatalogActionFilterStyle) catalogViewStyle : null;
            if (catalogActionFilterStyle != null) {
                CheckedTextView checkedTextView = this.c;
                if (checkedTextView == null) {
                    checkedTextView = null;
                }
                CatalogActionFilterStyle.Style style = catalogActionFilterStyle.b;
                CatalogFilterData.FromType fromType = ((UIBlockActionFilter) uIBlock).z.j;
                int i = style == null ? -1 : a.$EnumSwitchMapping$1[style.ordinal()];
                if (i == 1) {
                    int[] iArr = a.$EnumSwitchMapping$0;
                    Integer valueOf = iArr[fromType.ordinal()] == 2 ? Integer.valueOf(R.drawable.subcategory_filter_button_background_gray) : null;
                    int i2 = iArr[fromType.ordinal()] == 2 ? 12 : 0;
                    if (valueOf != null) {
                        checkedTextView.setBackground(checkedTextView.getContext().getDrawable(valueOf.intValue()));
                    } else {
                        checkedTextView.setBackground(null);
                    }
                    float f3 = 12;
                    f4m.t(iah0.a(f3), checkedTextView);
                    f4m.q(iah0.a(f3), checkedTextView);
                    float f4 = 6;
                    checkedTextView.setPadding(iah0.a(f3), iah0.a(f4), iah0.a(i2), iah0.a(f4));
                    checkedTextView.setMinHeight(iah0.a(36));
                } else if (i != 2) {
                    int[] iArr2 = a.$EnumSwitchMapping$0;
                    Integer valueOf2 = iArr2[fromType.ordinal()] == 2 ? Integer.valueOf(R.drawable.subcategory_filter_button_background) : null;
                    int i3 = iArr2[fromType.ordinal()] == 2 ? 16 : 0;
                    if (valueOf2 != null) {
                        checkedTextView.setBackground(checkedTextView.getContext().getDrawable(valueOf2.intValue()));
                    } else {
                        checkedTextView.setBackground(null);
                    }
                    float f5 = 16;
                    f4m.t(iah0.a(f5), checkedTextView);
                    f4m.q(iah0.a(f5), checkedTextView);
                    float f6 = 6;
                    checkedTextView.setPadding(iah0.a(12), iah0.a(f6), iah0.a(i3), iah0.a(f6));
                    checkedTextView.setMinHeight(iah0.a(36));
                } else {
                    int[] iArr3 = a.$EnumSwitchMapping$0;
                    Integer valueOf3 = iArr3[fromType.ordinal()] == 2 ? Integer.valueOf(R.drawable.subcategory_filter_button_background_gray) : null;
                    int i4 = iArr3[fromType.ordinal()] == 2 ? 12 : 0;
                    if (valueOf3 != null) {
                        checkedTextView.setBackground(checkedTextView.getContext().getDrawable(valueOf3.intValue()));
                    } else {
                        checkedTextView.setBackground(null);
                    }
                    float f7 = 8;
                    f4m.t(iah0.a(f7), checkedTextView);
                    f4m.q(iah0.a(f7), checkedTextView);
                    checkedTextView.setPadding(iah0.a(12), iah0.a(0), iah0.a(i4), iah0.a(1));
                    checkedTextView.setMinHeight(iah0.a(30));
                }
            }
            UIBlockActionFilter uIBlockActionFilter = (UIBlockActionFilter) uIBlock;
            CatalogFilterData catalogFilterData = uIBlockActionFilter.z;
            if (a.$EnumSwitchMapping$0[catalogFilterData.j.ordinal()] == 1) {
                CheckedTextView checkedTextView2 = this.c;
                if (checkedTextView2 == null) {
                    checkedTextView2 = null;
                }
                f2 = checkedTextView2.getContext().getColor(R.color.vk_steel_gray_300);
            } else {
                CheckedTextView checkedTextView3 = this.c;
                if (checkedTextView3 == null) {
                    checkedTextView3 = null;
                }
                f2 = e3m.f(R.attr.vk_ui_icon_accent, checkedTextView3.getContext());
            }
            CheckedTextView checkedTextView4 = this.c;
            if (checkedTextView4 == null) {
                checkedTextView4 = null;
            }
            hno0.a(checkedTextView4, ColorStateList.valueOf(f2));
            if (!epx.f(this.e, catalogFilterData)) {
                if ((catalogActionFilterStyle != null ? catalogActionFilterStyle.b : null) != CatalogActionFilterStyle.Style.INLINE) {
                    CheckedTextView checkedTextView5 = this.c;
                    if (checkedTextView5 == null) {
                        checkedTextView5 = null;
                    }
                    io.reactivex.rxjava3.disposables.c c = uzp.c(checkedTextView5, uIBlockActionFilter);
                    qcy<Object> qcyVar = f[0];
                    this.d.b(c);
                }
            }
            this.e = catalogFilterData;
            CheckedTextView checkedTextView6 = this.c;
            if (checkedTextView6 == null) {
                checkedTextView6 = null;
            }
            checkedTextView6.setText(catalogFilterData.c);
            CheckedTextView checkedTextView7 = this.c;
            if (checkedTextView7 == null) {
                checkedTextView7 = null;
            }
            checkedTextView7.setChecked(catalogFilterData.e);
            CheckedTextView checkedTextView8 = this.c;
            jjc.g(checkedTextView8 != null ? checkedTextView8 : null, new sf4(24, this, uIBlock));
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog2_subcategory_filter, viewGroup, false);
        this.c = (CheckedTextView) inflate;
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
