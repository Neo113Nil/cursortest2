package com.vk.sharing.core.view;

import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewManager;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEventSource;
import com.vk.sharing.api.dto.ActionsInfo;
import com.vk.sharing.api.dto.Target;
import java.util.List;
import xsna.gax0;
import xsna.ify;
import xsna.kbj0;
import xsna.pq9;
import xsna.qfq;
import xsna.w74;

/* compiled from: ViewForSharing.kt */
/* loaded from: classes5.dex */
public interface l extends Drawable.Callback, KeyEvent.Callback, AccessibilityEventSource, ViewParent, ViewManager, ify.a {
    void D0(int i);

    void Dj();

    void E9();

    void Gf();

    void Gg();

    void I1();

    void Mh(List<Target> list, boolean z);

    void Nj();

    void O8();

    void Pg();

    void Pk();

    int S1(Target target);

    void Sb();

    void Ul(kbj0.a aVar);

    void V5();

    boolean Vg();

    void Vm();

    void Ye();

    void ae(ActionsInfo actionsInfo, int i);

    void b6();

    void d0();

    void e0();

    void ee();

    void f0();

    void g0();

    String getCommentText();

    a getDelegate();

    boolean getFullScreen();

    a getPresenter();

    List<Target> getTargets();

    View getView();

    gax0 getWallPostSettingsView();

    void h0(boolean z);

    void hide();

    void hideTitle();

    void i0();

    void il();

    void j7();

    void mh(boolean z);

    void n8();

    void nk();

    void p3();

    void se();

    void setAttachmentViewHolder(w74 w74Var);

    void setCommentHint(boolean z);

    void setDelegatePresenter(a aVar);

    void setEmptyText(String str);

    void setErrorMessage(String str);

    void setExternalApps(List<? extends qfq> list);

    void setFullScreen(boolean z);

    void setPostForFriendsOnlyHint(boolean z);

    void setPresenter(a aVar);

    void setSearchHint(String str);

    void setSearchQuery(String str);

    void setToggleFaveActionIsEnabled(boolean z);

    void showTitle();

    void t3(String str);

    void ta();

    void tg();

    void tm();

    void u0(String str, boolean z);

    void ug(boolean z);

    void uk();

    void w7();

    void x4();

    void xa();

    void xm();

    void z8(String str);

    /* compiled from: ViewForSharing.kt */
    public interface a {
        void D2();

        void E2(boolean z);

        void F2();

        void H2(int i);

        boolean I2();

        void K2(Target target, int i);

        void M2();

        void O2(boolean z);

        void b();

        void c();

        void e(Target target, int i);

        void g2();

        boolean h(Target target);

        void h2();

        void i2();

        void k2(qfq qfqVar);

        void l2(Target target, int i, boolean z);

        void m2(boolean z);

        void p2(String str);

        boolean q2();

        void s2();

        pq9 t2();

        void u2(Target target, int i, String str);

        boolean w2();

        void x2(boolean z);

        default void B2() {
        }

        default void o2() {
        }

        default void z2() {
        }

        default void P2(long j) {
        }

        default void y2(Target target, int i, String str) {
        }
    }
}
