package com.vk.superapp;

import com.vk.superapp.SuperAppFeatures;
import com.vk.superapp.api.dto.menu.QueueParams;
import com.vk.superapp.api.dto.menu.SuperAppAnimationConfig;
import com.vk.superapp.ui.widgets.SuperAppWidget;
import com.vk.superapp.ui.widgets.miniwidgets.MiniWidgetItem;
import io.reactivex.rxjava3.core.q;
import java.util.List;
import xsna.enx0;
import xsna.it80;
import xsna.n9n0;
import xsna.qnx0;
import xsna.s3q0;

/* compiled from: SuperAppCache.kt */
/* loaded from: classes11.dex */
public interface b {
    q<it80<Throwable>> A();

    q<Boolean> B();

    boolean C();

    void D(SuperAppWidget superAppWidget);

    void E(SuperAppWidget superAppWidget);

    q<QueueParams> F();

    String a(SuperAppFeatures.RequestName requestName);

    boolean b(SuperAppWidget superAppWidget);

    q<it80<n9n0>> c();

    void d(List<? extends MiniWidgetItem> list);

    boolean e();

    q<it80<n9n0>> f(String str);

    void g(SuperAppWidget superAppWidget);

    void h(List<String> list);

    void i(List<qnx0> list);

    void j(List list);

    void k();

    void l(long j);

    SuperAppAnimationConfig m();

    void n();

    q<SuperAppAnimationConfig> o();

    void p(String str, enx0 enx0Var);

    void q(String str, boolean z);

    void r(String str);

    void s(boolean z);

    void t(String str);

    void u();

    q<s3q0> v();

    void w();

    boolean x();

    void y(String str);

    n9n0 z();
}
