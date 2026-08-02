package com.vk.superapp.vkpay.checkout.feature.success;

import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.superapp.vkpay.checkout.feature.success.states.Action;
import com.vk.superapp.vkpay.checkout.feature.success.states.ButtonAction;
import com.vk.superapp.vkpay.checkout.feature.success.states.Icon;
import com.vk.superapp.vkpay.checkout.feature.success.states.StatusActionStyle;
import com.vk.superapp.vkpay.checkout.feature.success.states.StatusState;
import com.vkontakte.android.R;
import java.io.Serializable;
import xsna.bb6;
import xsna.bbv0;
import xsna.f4m;
import xsna.fm6;
import xsna.iv5;
import xsna.krv0;
import xsna.nn9;
import xsna.x8c;

/* compiled from: CheckoutStatusFragment.kt */
/* loaded from: classes6.dex */
public final class CheckoutStatusFragment extends bb6<Object> implements iv5 {
    public ImageView i;
    public TextView j;
    public TextView k;
    public TextView l;
    public TextView m;
    public final x8c n;

    /* compiled from: CheckoutStatusFragment.kt */
    public interface OnBackPressedListener extends Serializable {
        void a0();
    }

    /* compiled from: CheckoutStatusFragment.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StatusActionStyle.values().length];
            try {
                iArr[StatusActionStyle.PRIMARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StatusActionStyle.TERTIARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public CheckoutStatusFragment() {
        bbv0.g.getClass();
        this.n = new x8c(this, bbv0.a.f().d);
    }

    @Override // xsna.gi6, xsna.iv5
    public final boolean a0() {
        Bundle arguments = getArguments();
        Serializable serializable = arguments != null ? arguments.getSerializable("on_back_listener") : null;
        OnBackPressedListener onBackPressedListener = serializable instanceof OnBackPressedListener ? (OnBackPressedListener) serializable : null;
        if (onBackPressedListener == null) {
            return true;
        }
        onBackPressedListener.a0();
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.vk_pay_checkout_status_view, viewGroup, false);
    }

    @Override // xsna.gi6, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
    }

    @Override // xsna.gi6, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        TextView textView;
        TextView textView2;
        super.onViewCreated(view, bundle);
        this.i = (ImageView) view.findViewById(R.id.status_view_icon);
        this.l = (TextView) view.findViewById(R.id.status_view_action_primary);
        this.j = (TextView) view.findViewById(R.id.status_view_title);
        this.k = (TextView) view.findViewById(R.id.status_view_subtitle);
        this.m = (TextView) view.findViewById(R.id.status_view_action_tertiary);
        Bundle arguments = getArguments();
        TextView textView3 = null;
        Serializable serializable = arguments != null ? arguments.getSerializable("status") : null;
        Status status = serializable instanceof Status ? (Status) serializable : null;
        if (status == null) {
            throw new IllegalArgumentException("No status passed to CheckoutStatusFragment");
        }
        x8c x8cVar = this.n;
        if (x8cVar != null) {
            CheckoutStatusFragment checkoutStatusFragment = (CheckoutStatusFragment) x8cVar.b;
            StatusState g = status.g();
            Action d = status.d();
            if (g.h().length() == 0 && (textView2 = checkoutStatusFragment.j) != null) {
                f4m.j(textView2);
            }
            if (g.g().length() == 0 && (textView = checkoutStatusFragment.k) != null) {
                textView.setVisibility(4);
            }
            Icon d2 = g.d();
            ImageView imageView = checkoutStatusFragment.i;
            if (imageView != null) {
                if (d2.g() != -1) {
                    TypedValue typedValue = krv0.a;
                    krv0.p(imageView, d2.d(), d2.g());
                } else {
                    imageView.setImageResource(d2.d());
                }
            }
            String h = g.h();
            TextView textView4 = checkoutStatusFragment.j;
            if (textView4 != null) {
                textView4.setText(h);
            }
            String g2 = g.g();
            TextView textView5 = checkoutStatusFragment.k;
            if (textView5 != null) {
                textView5.setText(g2);
            }
            if (d instanceof ButtonAction) {
                ButtonAction buttonAction = (ButtonAction) d;
                int i = a.$EnumSwitchMapping$0[buttonAction.g().ordinal()];
                int i2 = 1;
                if (i == 1) {
                    textView3 = checkoutStatusFragment.l;
                } else if (i == 2) {
                    textView3 = checkoutStatusFragment.m;
                }
                if (textView3 != null) {
                    textView3.setVisibility(0);
                    textView3.setText(buttonAction.h());
                    textView3.setOnClickListener(new nn9(d, i2));
                }
            }
        }
    }

    @Override // xsna.gi6
    public final fm6 tn() {
        return this.n;
    }
}
