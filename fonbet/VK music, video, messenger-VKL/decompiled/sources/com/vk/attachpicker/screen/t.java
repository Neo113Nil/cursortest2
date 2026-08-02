package com.vk.attachpicker.screen;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import androidx.viewpager.widget.PagerAdapter;
import com.vk.attachpicker.screen.a;
import com.vk.attachpicker.screen.p;
import com.vk.attachpicker.widget.VkViewPager;
import com.vk.mediastore.system.MediaStoreEntry;
import java.util.ArrayList;
import xsna.ic3;
import xsna.js2;
import xsna.ktc0;
import xsna.s770;
import xsna.v16;
import xsna.w16;
import xsna.x16;
import xsna.yn3;
import xsna.zjt;
import xsna.zmw;

/* compiled from: ViewerScreenViewDelegate.kt */
/* loaded from: classes15.dex */
public interface t {
    LayoutInflater A(Activity activity);

    void B(ic3 ic3Var);

    void C();

    void D(r rVar);

    ArrayList E();

    void F(View view);

    void G(int i);

    ktc0 H(MediaStoreEntry mediaStoreEntry);

    void I(x16 x16Var);

    void J(int i);

    void L(int i);

    ArrayList M();

    default s770 N() {
        return null;
    }

    void O(int i);

    VkViewPager P();

    void Q(js2 js2Var);

    void R(int i);

    void S(yn3 yn3Var);

    int T();

    void U(String str);

    void V(boolean z);

    void W(String str);

    void Z(boolean z, boolean z2);

    void a0(w16 w16Var);

    int p();

    Context q();

    PagerAdapter r();

    void t(p.a aVar);

    void v(boolean z);

    void w(zmw zmwVar);

    void x(float f);

    void y(v16 v16Var);

    int z(Activity activity);

    default void K(int i) {
    }

    default void X(com.vk.core.simplescreen.a aVar) {
    }

    default void Y(ArrayList arrayList) {
    }

    default void setAlpha(int i) {
    }

    default void u(com.vk.core.simplescreen.a aVar) {
    }

    default void s(a.c cVar, zjt<?> zjtVar) {
    }
}
