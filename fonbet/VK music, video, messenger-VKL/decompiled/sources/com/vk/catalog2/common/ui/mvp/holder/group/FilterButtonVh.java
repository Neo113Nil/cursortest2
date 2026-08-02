package com.vk.catalog2.common.ui.mvp.holder.group;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.ironsource.X3;
import com.vk.catalog2.common.dto.api.CatalogFilterData;
import com.vk.catalog2.common.dto.api.badge.CatalogBadge;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionFilter;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vkontakte.android.R;
import kotlin.jvm.internal.Ref$IntRef;
import xsna.cn70;
import xsna.dhr0;
import xsna.eda;
import xsna.f4m;
import xsna.jjc;
import xsna.jno0;
import xsna.kcr;
import xsna.lfa;

/* compiled from: FilterButtonVh.kt */
/* loaded from: classes16.dex */
public final class FilterButtonVh implements CatalogViewHolder {
    public final eda b;
    public View c;
    public TextView d;
    public TextView e;

    public FilterButtonVh(eda edaVar) {
        this.b = edaVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0126  */
    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N6(UIBlock uIBlock) {
        String str;
        View view;
        if (uIBlock instanceof UIBlockActionFilter) {
            CatalogFilterData catalogFilterData = ((UIBlockActionFilter) uIBlock).z;
            TextView textView = this.d;
            if (textView == null) {
                textView = null;
            }
            String str2 = catalogFilterData.c;
            CatalogBadge catalogBadge = catalogFilterData.g;
            boolean z = catalogFilterData.e;
            textView.setText(str2);
            TextView textView2 = this.d;
            TextView textView3 = textView2 == null ? null : textView2;
            if (textView2 == null) {
                textView2 = null;
            }
            textView3.setTextColor(dhr0.Y(z ? R.attr.vk_ui_text_primary : R.attr.vk_ui_text_secondary, textView2.getContext()));
            if (catalogBadge == null || (str = catalogBadge.b) == null) {
                str = "";
            }
            String str3 = str;
            TextView textView4 = this.e;
            if (textView4 == null) {
                textView4 = null;
            }
            textView4.setText(str3);
            int b = cn70.b(4);
            String str4 = catalogBadge != null ? catalogBadge.c : null;
            if (str4 != null) {
                int hashCode = str4.hashCode();
                if (hashCode != -817598092) {
                    if (hashCode != -804936122) {
                        if (hashCode == -314765822 && str4.equals("primary")) {
                            TextView textView5 = this.e;
                            if (textView5 == null) {
                                textView5 = null;
                            }
                            jno0.c(textView5, R.attr.vk_ui_text_contrast_themed);
                            TextView textView6 = this.e;
                            if (textView6 == null) {
                                textView6 = null;
                            }
                            textView6.setBackgroundResource(R.drawable.catalog_bg_counter_primary);
                            TextView textView7 = this.e;
                            if (textView7 == null) {
                                textView7 = null;
                            }
                            textView7.setPadding(b, textView7.getPaddingTop(), b, textView7.getPaddingBottom());
                        }
                    } else if (str4.equals("prominent")) {
                        TextView textView8 = this.e;
                        if (textView8 == null) {
                            textView8 = null;
                        }
                        jno0.c(textView8, R.attr.vk_ui_text_contrast);
                        TextView textView9 = this.e;
                        if (textView9 == null) {
                            textView9 = null;
                        }
                        textView9.setBackgroundResource(R.drawable.catalog_bg_counter_prominent);
                        TextView textView10 = this.e;
                        if (textView10 == null) {
                            textView10 = null;
                        }
                        textView10.setPadding(b, textView10.getPaddingTop(), b, textView10.getPaddingBottom());
                    }
                } else if (str4.equals(X3.i.Y)) {
                    TextView textView11 = this.e;
                    if (textView11 == null) {
                        textView11 = null;
                    }
                    textView11.setBackgroundResource(R.drawable.catalog_bg_counter_secondary);
                    TextView textView12 = this.e;
                    if (textView12 == null) {
                        textView12 = null;
                    }
                    jno0.c(textView12, R.attr.vk_ui_text_contrast_themed);
                    TextView textView13 = this.e;
                    if (textView13 == null) {
                        textView13 = null;
                    }
                    textView13.setPadding(b, textView13.getPaddingTop(), b, textView13.getPaddingBottom());
                }
                View view2 = this.c;
                View view3 = view2 != null ? null : view2;
                Ref$IntRef ref$IntRef = new Ref$IntRef();
                ref$IntRef.element = view3.getMeasuredWidth();
                Ref$IntRef ref$IntRef2 = new Ref$IntRef();
                ref$IntRef2.element = view3.getMeasuredHeight();
                f4m.a(view3, new kcr(view3, ref$IntRef, ref$IntRef2, this, str3));
                view = this.c;
                if (view == null) {
                    view = null;
                }
                view.setSelected(z);
                View view4 = this.c;
                jjc.g(view4 != null ? view4 : null, new lfa(5, this, catalogFilterData));
            }
            TextView textView14 = this.e;
            if (textView14 == null) {
                textView14 = null;
            }
            textView14.setBackgroundResource(R.drawable.transparent);
            TextView textView15 = this.e;
            if (textView15 == null) {
                textView15 = null;
            }
            jno0.c(textView15, R.attr.vk_ui_text_tertiary);
            TextView textView16 = this.e;
            if (textView16 == null) {
                textView16 = null;
            }
            textView16.setPadding(0, textView16.getPaddingTop(), 0, textView16.getPaddingBottom());
            View view22 = this.c;
            if (view22 != null) {
            }
            Ref$IntRef ref$IntRef3 = new Ref$IntRef();
            ref$IntRef3.element = view3.getMeasuredWidth();
            Ref$IntRef ref$IntRef22 = new Ref$IntRef();
            ref$IntRef22.element = view3.getMeasuredHeight();
            f4m.a(view3, new kcr(view3, ref$IntRef3, ref$IntRef22, this, str3));
            view = this.c;
            if (view == null) {
            }
            view.setSelected(z);
            View view42 = this.c;
            jjc.g(view42 != null ? view42 : null, new lfa(5, this, catalogFilterData));
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog_filter_button_item, viewGroup, false);
        this.c = inflate;
        this.d = (TextView) inflate.findViewById(R.id.title);
        this.e = (TextView) inflate.findViewById(R.id.counter);
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
