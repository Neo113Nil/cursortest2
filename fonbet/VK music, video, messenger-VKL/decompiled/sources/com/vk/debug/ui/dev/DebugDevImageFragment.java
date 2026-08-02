package com.vk.debug.ui.dev;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.SwitchCompat;
import com.vk.core.fragments.BaseFragment;
import com.vk.debug.ui.dev.DebugDevImageFragment;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import defpackage.h0;
import io.reactivex.rxjava3.internal.operators.single.d0;
import io.reactivex.rxjava3.internal.operators.single.v;
import java.io.File;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.abg0;
import xsna.bwt0;
import xsna.dhr0;
import xsna.enj;
import xsna.g2v;
import xsna.gjv;
import xsna.hg1;
import xsna.hjv;
import xsna.iah0;
import xsna.itg0;
import xsna.l370;
import xsna.m0v0;
import xsna.n460;
import xsna.o2l;
import xsna.p41;
import xsna.rr;
import xsna.s3q0;
import xsna.s73;
import xsna.sa30;
import xsna.t2l;
import xsna.t3h;
import xsna.u2l;
import xsna.uek;
import xsna.x2l;
import xsna.zr;

/* compiled from: DebugDevImageFragment.kt */
/* loaded from: classes17.dex */
public final class DebugDevImageFragment extends BaseFragment {
    public static final int U = View.generateViewId();
    public static final int V = View.generateViewId();
    public static final int W = View.generateViewId();
    public static final int X = View.generateViewId();
    public static final int Y = View.generateViewId();
    public static final int Z = View.generateViewId();
    public static final int a0 = View.generateViewId();
    public static final int b0 = View.generateViewId();
    public static final int c0 = View.generateViewId();
    public final s73 S = new s73();
    public final AtomicBoolean T = new AtomicBoolean(false);

    /* compiled from: DebugDevImageFragment.kt */
    public static final class a {
        public final int a;
        public final t2l b;
        public final AtomicInteger c = new AtomicInteger(0);

        public a(int i, t2l t2lVar) {
            this.a = i;
            this.b = t2lVar;
        }
    }

    /* compiled from: DebugDevImageFragment.kt */
    public static final class b {
        public long a;
    }

    public static final void io(View view, SwitchCompat switchCompat, View view2, EditText editText, EditText editText2, boolean z) {
        boolean z2 = !z;
        view.setEnabled(z2);
        switchCompat.setEnabled(z2);
        view2.setEnabled(z);
        editText.setEnabled(z2);
        editText2.setEnabled(z2);
    }

    public final void jo(uek uekVar) {
        if (!uekVar.a()) {
            enj.r(mo2getContext(), "Запись NetLog не поддерживается", 0);
            return;
        }
        uekVar.c();
        try {
            File L = l370.L(uekVar.e);
            g2v.c().getClass();
            m0v0.a.b(requireContext(), L);
        } catch (Throwable th) {
            enj.r(mo2getContext(), "Netlog compress failed:" + th, 0);
        }
        this.S.getClass();
        o2l.a.getClass();
        if (o2l.b("__dbg_network_netlog_write", false)) {
            uekVar.b();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = layoutInflater.getContext();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        LinearLayout linearLayout3 = new LinearLayout(context);
        Button button = new Button(context);
        button.setId(W);
        button.setText("Start");
        linearLayout3.addView(button, new LinearLayout.LayoutParams(-2, -2, 1.0f));
        Button button2 = new Button(context);
        button2.setId(X);
        button2.setText("Stop loop");
        linearLayout3.addView(button2, new LinearLayout.LayoutParams(-2, -2, 1.0f));
        linearLayout2.addView(linearLayout3);
        SwitchCompat switchCompat = new SwitchCompat(context, null);
        switchCompat.setId(Y);
        switchCompat.setText("Использовать Loop?");
        switchCompat.setTextSize(17.0f);
        float f = 12;
        switchCompat.setPadding(iah0.a(f), iah0.a(f), iah0.a(f), iah0.a(f));
        linearLayout2.addView(switchCompat, -1, -2);
        EditText editText = new EditText(context);
        editText.setId(U);
        editText.setInputType(2);
        editText.setTextSize(17.0f);
        abg0 abg0Var = dhr0.t;
        editText.setTextColor(abg0Var.c(R.attr.vk_ui_text_primary));
        editText.setHintTextColor(abg0Var.c(R.attr.vk_ui_text_secondary));
        linearLayout2.addView(editText, -1, -2);
        EditText editText2 = new EditText(context);
        editText2.setId(V);
        editText2.setInputType(2);
        editText2.setTextSize(17.0f);
        editText2.setText("sun9-17");
        editText2.setTextColor(abg0Var.c(R.attr.vk_ui_text_primary));
        editText2.setHintTextColor(abg0Var.c(R.attr.vk_ui_text_secondary));
        linearLayout2.addView(editText2, -1, -2);
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setId(Z);
        appCompatTextView.setText("Protocol: -");
        appCompatTextView.setTextSize(17.0f);
        appCompatTextView.setPadding(iah0.a(f), iah0.a(f), iah0.a(f), iah0.a(f));
        linearLayout2.addView(appCompatTextView, -1, -2);
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context);
        appCompatTextView2.setId(a0);
        appCompatTextView2.setText("Time: -");
        appCompatTextView2.setTextSize(17.0f);
        appCompatTextView2.setPadding(iah0.a(f), iah0.a(f), iah0.a(f), iah0.a(f));
        linearLayout2.addView(appCompatTextView2, -1, -2);
        AppCompatTextView appCompatTextView3 = new AppCompatTextView(context);
        appCompatTextView3.setId(c0);
        appCompatTextView3.setText("Total Time: -");
        appCompatTextView3.setTextSize(17.0f);
        appCompatTextView3.setPadding(iah0.a(f), iah0.a(f), iah0.a(f), iah0.a(f));
        linearLayout2.addView(appCompatTextView3, -1, -2);
        View vKImageView = new VKImageView(context, null, 6, 0);
        vKImageView.setId(b0);
        Xn(context.getColor(R.color.vk_gray_750));
        bwt0.p0(vKImageView, false);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iah0.f().widthPixels / 2, iah0.f().widthPixels / 2);
        layoutParams.gravity = 17;
        s3q0 s3q0Var = s3q0.a;
        linearLayout2.addView(vKImageView, layoutParams);
        linearLayout.addView(linearLayout2, -1, -2);
        return linearLayout;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0118, code lost:
    
        if (r0 == null) goto L6;
     */
    /* JADX WARN: Type inference failed for: r0v14, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v0, types: [T, kotlin.collections.EmptyList] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onViewCreated(final View view, Bundle bundle) {
        n460 n460Var;
        super.onViewCreated(view, bundle);
        super.onViewCreated(view, bundle);
        final EditText editText = (EditText) view.findViewById(U);
        final EditText editText2 = (EditText) view.findViewById(V);
        final View findViewById = view.findViewById(W);
        final View findViewById2 = view.findViewById(X);
        final VKImageView vKImageView = (VKImageView) view.findViewById(b0);
        final SwitchCompat switchCompat = (SwitchCompat) view.findViewById(Y);
        final AppCompatTextView appCompatTextView = (AppCompatTextView) view.findViewById(Z);
        final AppCompatTextView appCompatTextView2 = (AppCompatTextView) view.findViewById(a0);
        final AppCompatTextView appCompatTextView3 = (AppCompatTextView) view.findViewById(c0);
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        switchCompat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: xsna.s2l
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                int i = DebugDevImageFragment.U;
                bwt0.p0(editText, !z);
                bwt0.p0(vKImageView, z);
                bwt0.p0(findViewById2, z);
                bwt0.p0(appCompatTextView, z);
                bwt0.p0(appCompatTextView2, z);
                bwt0.p0(appCompatTextView3, z);
                bwt0.p0(editText2, z);
            }
        });
        switchCompat.setChecked(false);
        bwt0.p0(editText, !switchCompat.isChecked());
        bwt0.p0(vKImageView, switchCompat.isChecked());
        bwt0.p0(findViewById2, switchCompat.isChecked());
        bwt0.p0(appCompatTextView, switchCompat.isChecked());
        bwt0.p0(appCompatTextView2, switchCompat.isChecked());
        bwt0.p0(appCompatTextView3, switchCompat.isChecked());
        bwt0.p0(editText2, switchCompat.isChecked());
        final b bVar = new b();
        final Ref$LongRef ref$LongRef = new Ref$LongRef();
        final Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        ref$ObjectRef2.element = EmptyList.b;
        final Ref$ObjectRef ref$ObjectRef3 = new Ref$ObjectRef();
        ref$ObjectRef3.element = zr.a("https://", editText2.getText().toString(), ".userapi.com/impg/qTu_KlOl0pQtKu-GjWQhGt5bN8p_VrvgyPJc0A/ag2AIRz9u-w.jpg?size=2560x1637&quality=96&sign=83a2270732be35220507172b59372c8e");
        itg0.k(new d0(hg1.n(sa30.c(new v(new x2l())), requireContext(), false, null, 62), new rr(11), null), new t3h(new h0(12, ref$ObjectRef2, editText), 6), null, 2);
        if (gjv.b != null) {
            hjv.a.getClass();
            n460Var = hjv.c;
        }
        n460Var = (n460) gjv.e.getValue();
        fo(sa30.b(n460Var.e).subscribe(new p41(new u2l(ref$ObjectRef3, appCompatTextView, appCompatTextView2, appCompatTextView3, ref$LongRef, 0), 14)));
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: xsna.v2l
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v2, types: [T, android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
            /* JADX WARN: Type inference failed for: r15v23, types: [T, java.lang.String] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i;
                int i2 = DebugDevImageFragment.U;
                SwitchCompat switchCompat2 = SwitchCompat.this;
                boolean isChecked = switchCompat2.isChecked();
                DebugDevImageFragment debugDevImageFragment = this;
                Ref$ObjectRef ref$ObjectRef4 = ref$ObjectRef;
                View view3 = view;
                EditText editText3 = editText2;
                VKImageView vKImageView2 = vKImageView;
                View view4 = findViewById;
                View view5 = findViewById2;
                EditText editText4 = editText;
                int i3 = 0;
                if (isChecked) {
                    enj.r(debugDevImageFragment.mo2getContext(), "Start loading!", 0);
                    DebugDevImageFragment.io(view4, switchCompat2, view5, editText4, editText3, true);
                    wjy.a.getClass();
                    uek b2 = wjy.b();
                    if (!b2.a()) {
                        enj.r(debugDevImageFragment.mo2getContext(), "Please enable http executor!", 0);
                        DebugDevImageFragment.io(view4, switchCompat2, view5, editText4, editText3, false);
                        return;
                    }
                    b2.c();
                    b2.b();
                    T t = ref$ObjectRef4.element;
                    if (t != 0) {
                        ((LinearLayout) view3).removeView((View) t);
                    }
                    debugDevImageFragment.T.set(true);
                    ?? a2 = zr.a("https://", editText3.getText().toString(), ".userapi.com/impg/qTu_KlOl0pQtKu-GjWQhGt5bN8p_VrvgyPJc0A/ag2AIRz9u-w.jpg?size=2560x1637&quality=96&sign=83a2270732be35220507172b59372c8e");
                    Ref$ObjectRef ref$ObjectRef5 = ref$ObjectRef3;
                    ref$ObjectRef5.element = a2;
                    DebugDevImageFragment.b bVar2 = bVar;
                    bVar2.a = 0L;
                    vKImageView2.v0(a2);
                    vKImageView2.setOnLoadCallback(new com.vk.debug.ui.dev.b(bVar2, ref$LongRef, debugDevImageFragment, vKImageView2, ref$ObjectRef5));
                    return;
                }
                try {
                    i = Integer.parseInt(editText4.getText().toString());
                } catch (NumberFormatException unused) {
                    i = 100;
                }
                enj.r(debugDevImageFragment.mo2getContext(), "Start loading!", 0);
                DebugDevImageFragment.io(view4, switchCompat2, view5, editText4, editText3, true);
                wjy.a.getClass();
                uek b3 = wjy.b();
                if (!b3.a()) {
                    enj.r(debugDevImageFragment.mo2getContext(), "Please enable http executor!", 0);
                    DebugDevImageFragment.io(view4, switchCompat2, view5, editText4, editText3, false);
                    return;
                }
                bwt0.p0(vKImageView2, false);
                b3.c();
                b3.b();
                T t2 = ref$ObjectRef4.element;
                if (t2 != 0) {
                    ((LinearLayout) view3).removeView((View) t2);
                }
                Ref$ObjectRef ref$ObjectRef6 = ref$ObjectRef2;
                List<String> H0 = ((List) ref$ObjectRef6.element).size() >= i ? j5g.H0((Iterable) ref$ObjectRef6.element, i) : (List) ref$ObjectRef6.element;
                LinearLayout linearLayout = (LinearLayout) view3;
                Context context = linearLayout.getContext();
                y2l y2lVar = new y2l(debugDevImageFragment, b3, view4, switchCompat2, view5, editText4, editText3);
                int size = H0.size();
                int ceil = (int) Math.ceil(Math.sqrt(size));
                int i4 = iah0.f().widthPixels / ceil;
                DebugDevImageFragment.a aVar = new DebugDevImageFragment.a(size, new t2l(y2lVar, i3));
                ?? frameLayout = new FrameLayout(context);
                ScrollView scrollView = new ScrollView(context);
                scrollView.setFillViewport(true);
                GridLayout gridLayout = new GridLayout(context);
                gridLayout.setRowCount(ceil);
                gridLayout.setColumnCount(gridLayout.getRowCount());
                for (String str : H0) {
                    int i5 = DebugDevImageFragment.U;
                    VKImageView vKImageView3 = new VKImageView(context, null, 6, 0);
                    debugDevImageFragment.Xn(context.getColor(R.color.vk_gray_750));
                    vKImageView3.setOnLoadCallback(new com.vk.debug.ui.dev.a(aVar));
                    vKImageView3.v0(str);
                    gridLayout.addView(vKImageView3, i4, i4);
                }
                scrollView.addView(gridLayout, -1, -2);
                frameLayout.addView(scrollView, -1, -1);
                ref$ObjectRef4.element = frameLayout;
                linearLayout.addView((View) frameLayout, -1, -1);
            }
        });
        findViewById2.setOnClickListener(new View.OnClickListener() { // from class: xsna.w2l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i = DebugDevImageFragment.U;
                DebugDevImageFragment debugDevImageFragment = DebugDevImageFragment.this;
                enj.r(debugDevImageFragment.mo2getContext(), "Stop loading!", 0);
                DebugDevImageFragment.io(findViewById, switchCompat, findViewById2, editText, editText2, false);
                debugDevImageFragment.T.set(false);
                wjy.a.getClass();
                debugDevImageFragment.jo(wjy.b());
            }
        });
    }
}
