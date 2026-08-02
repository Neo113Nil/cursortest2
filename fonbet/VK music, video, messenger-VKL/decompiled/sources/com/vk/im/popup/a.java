package com.vk.im.popup;

import android.graphics.Rect;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.vk.im.popup.Popup;
import java.util.List;
import xsna.gzs;
import xsna.izs;
import xsna.jtb;
import xsna.km1;
import xsna.lwb0;
import xsna.s3q0;

/* compiled from: PopupVc.kt */
/* loaded from: classes2.dex */
public interface a {

    /* compiled from: PopupVc.kt */
    /* renamed from: com.vk.im.popup.a$a, reason: collision with other inner class name */
    public static final class C1129a {
        public static com.vk.im.popup.b a(FragmentActivity fragmentActivity) {
            return new com.vk.im.popup.b(fragmentActivity);
        }
    }

    /* compiled from: PopupVc.kt */
    public interface b<T> {
        void setItems(List<lwb0<T>> list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void d(a aVar, Popup.e eVar, gzs gzsVar, jtb jtbVar, km1 km1Var, int i) {
        if ((i & 2) != 0) {
            gzsVar = null;
        }
        if ((i & 4) != 0) {
            jtbVar = null;
        }
        if ((i & 8) != 0) {
            km1Var = null;
        }
        aVar.a(eVar, gzsVar, jtbVar, km1Var);
    }

    void a(Popup.e eVar, gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2, gzs<s3q0> gzsVar3);

    void b(Popup.c cVar, gzs<s3q0> gzsVar);

    <T> void c(Popup.a<T> aVar, izs<? super T, s3q0> izsVar, gzs<s3q0> gzsVar);

    void dismiss();

    void e(Popup.f fVar, izs izsVar);

    void f(Popup.a aVar, View view, Rect rect, izs izsVar);

    b g(Popup.a aVar, izs izsVar, izs izsVar2);
}
