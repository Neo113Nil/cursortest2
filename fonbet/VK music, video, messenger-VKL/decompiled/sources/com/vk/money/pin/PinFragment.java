package com.vk.money.pin;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.vk.core.fragments.BaseMvpFragment;
import com.vk.pin.views.dots.PinDotsView;
import com.vk.pin.views.keyboard.PinKeyboardView;
import com.vk.pin.views.status.StatusView;
import com.vkontakte.android.R;
import java.util.Iterator;
import xsna.dzk0;
import xsna.f4m;
import xsna.jma0;
import xsna.oz50;
import xsna.qla0;
import xsna.sf6;
import xsna.t01;
import xsna.u01;
import xsna.u1u0;
import xsna.vds;

/* compiled from: PinFragment.kt */
/* loaded from: classes3.dex */
public abstract class PinFragment extends BaseMvpFragment<qla0> implements vds {
    public static final /* synthetic */ int b0 = 0;
    public final b T = new b();
    public Toolbar U;
    public PinDotsView V;
    public PinKeyboardView W;
    public TextView X;
    public StatusView Y;
    public View Z;
    public View a0;

    /* compiled from: PinFragment.kt */
    public static class a extends oz50 {
    }

    /* compiled from: PinFragment.kt */
    public static final class b implements PinKeyboardView.a {
        public b() {
        }

        @Override // com.vk.pin.views.keyboard.PinKeyboardView.a
        public final void C(boolean z) {
            qla0 qla0Var = (qla0) PinFragment.this.S;
            if (qla0Var != null) {
                qla0Var.C(z);
            }
        }

        @Override // com.vk.pin.views.keyboard.PinKeyboardView.a
        public final void s(String str) {
            qla0 qla0Var = (qla0) PinFragment.this.S;
            if (qla0Var != null) {
                qla0Var.s(str);
            }
        }
    }

    public final void Ob() {
        PinKeyboardView pinKeyboardView = this.W;
        if (pinKeyboardView == null) {
            pinKeyboardView = null;
        }
        pinKeyboardView.e = false;
        Iterator it = pinKeyboardView.d.iterator();
        while (it.hasNext()) {
            ((sf6) it.next()).a.setClickable(true);
        }
        PinKeyboardView pinKeyboardView2 = this.W;
        (pinKeyboardView2 != null ? pinKeyboardView2 : null).setAlpha(1.0f);
    }

    @Override // xsna.vds
    public final int Q0() {
        return 1;
    }

    public qla0 jo(Bundle bundle) {
        return new jma0(this, requireArguments().getInt("symbols_count", 4));
    }

    public final void ko(int i) {
        Intent intent = new Intent();
        Bundle arguments = getArguments();
        if (arguments != null) {
            intent.putExtras(arguments);
        }
        Mf(i, intent);
    }

    public final void lo(dzk0 dzk0Var) {
        if (requireArguments().getBoolean("has_status")) {
            StatusView statusView = this.Y;
            if (statusView == null) {
                statusView = null;
            }
            statusView.setStatus(dzk0Var);
            StatusView statusView2 = this.Y;
            if (statusView2 == null) {
                statusView2 = null;
            }
            statusView2.setVisibility(0);
            View view = this.Z;
            f4m.j(view != null ? view : null);
        }
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.S = jo(getArguments());
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.pin_fragment, (ViewGroup) null);
        this.Z = inflate.findViewById(R.id.content);
        this.U = (Toolbar) inflate.findViewById(R.id.toolbar);
        this.V = (PinDotsView) inflate.findViewById(R.id.pin_input_dots);
        this.X = (TextView) inflate.findViewById(R.id.pin_form_hint);
        PinKeyboardView pinKeyboardView = (PinKeyboardView) inflate.findViewById(R.id.pin_keyboard_view);
        this.W = pinKeyboardView;
        if (pinKeyboardView == null) {
            pinKeyboardView = null;
        }
        pinKeyboardView.setOnKeysListener(this.T);
        TextView textView = (TextView) inflate.findViewById(R.id.pin_restore);
        if (textView == null) {
            textView = null;
        }
        textView.setOnClickListener(new u01(this, 11));
        this.Y = (StatusView) inflate.findViewById(R.id.pin_status_view);
        this.a0 = inflate.findViewById(R.id.pin_progress);
        String string = requireArguments().getString("title");
        if (string == null) {
            Toolbar toolbar = this.U;
            if (toolbar == null) {
                toolbar = null;
            }
            f4m.j(toolbar);
        } else {
            Toolbar toolbar2 = this.U;
            if (toolbar2 == null) {
                toolbar2 = null;
            }
            toolbar2.setTitle(string);
        }
        Toolbar toolbar3 = this.U;
        if (toolbar3 == null) {
            toolbar3 = null;
        }
        u1u0.j(toolbar3, R.drawable.vk_icon_arrow_left_outline_28);
        Toolbar toolbar4 = this.U;
        (toolbar4 != null ? toolbar4 : null).setNavigationOnClickListener(new t01(this, 7));
        return inflate;
    }
}
