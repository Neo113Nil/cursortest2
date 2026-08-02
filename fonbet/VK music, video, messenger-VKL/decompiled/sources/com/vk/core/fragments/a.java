package com.vk.core.fragments;

import android.os.Bundle;
import com.vk.im.ui.fragments.chat.ChatFragment;
import java.util.ArrayList;
import xsna.eu2;
import xsna.gb;
import xsna.izs;
import xsna.or50;
import xsna.ui90;

/* compiled from: FragmentNavigationController.kt */
/* loaded from: classes.dex */
public interface a {

    /* compiled from: FragmentNavigationController.kt */
    /* renamed from: com.vk.core.fragments.a$a, reason: collision with other inner class name */
    public interface InterfaceC0769a {
        int a(FragmentImpl fragmentImpl);
    }

    boolean A(Class<? extends FragmentImpl> cls);

    void B();

    void C(izs izsVar, boolean z);

    void D(FragmentImpl fragmentImpl, FragmentEntry fragmentEntry, int i);

    boolean E(FragmentImpl fragmentImpl);

    ArrayList F();

    void G(FragmentImpl fragmentImpl);

    void H(ArrayList arrayList);

    void a(FragmentEntry fragmentEntry, boolean z, or50 or50Var, gb gbVar);

    boolean a0();

    FragmentImpl b(String str);

    void h(Bundle bundle);

    FragmentImpl i(Class<? extends FragmentImpl> cls);

    boolean j(ChatFragment chatFragment);

    void k(FragmentEntry fragmentEntry, boolean z);

    void l(Bundle bundle);

    FragmentImpl m();

    void n(ArrayList arrayList, FragmentEntry fragmentEntry);

    FragmentImpl o();

    Class<? extends FragmentImpl> p(FragmentImpl fragmentImpl);

    void q(FragmentEntry fragmentEntry);

    void r(eu2 eu2Var);

    boolean s(FragmentImpl fragmentImpl, boolean z);

    void t(ArrayList arrayList, boolean z);

    void u(ui90.a aVar);

    int v();

    void w(FragmentEntry fragmentEntry);

    int x(FragmentImpl fragmentImpl);

    boolean y(FragmentImpl fragmentImpl);

    void z(ui90.a aVar);
}
