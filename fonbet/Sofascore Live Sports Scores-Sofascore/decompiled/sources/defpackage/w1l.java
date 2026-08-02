package defpackage;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Parcel;
import android.text.TextUtils;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.adexpress.dynamic.oo.kj;
import com.inmobi.media.AbstractC3587m1;
import com.inmobi.media.C3906y9;
import com.inmobi.media.GestureDetectorOnGestureListenerC3889xi;
import com.ironsource.sdk.utils.Logger;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.same.image.b;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.i;
import com.mbridge.msdk.video.bt.component.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class w1l {
    public static void A(ArrayList arrayList, int i) {
        arrayList.add(new Integer(i));
    }

    public static boolean B(kj kjVar, String str) {
        return TextUtils.equals(kjVar.ork().sf(), str);
    }

    public static void C(String str, AbstractC3587m1 abstractC3587m1, C3906y9 c3906y9, String str2) {
        c3906y9.c(str2, str + abstractC3587m1);
    }

    public static void D(String str, String str2, String str3, String str4) {
        Logger.i(str4, str + str2 + str3);
    }

    public static int a(Parcel parcel, LinkedHashMap linkedHashMap, String str, int i, int i2) {
        linkedHashMap.put(str, parcel.readString());
        return i + i2;
    }

    public static GradientDrawable b(int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(i);
        return gradientDrawable;
    }

    public static RelativeLayout.LayoutParams c(int i, int i2, int i3) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, i2);
        layoutParams.addRule(i3);
        return layoutParams;
    }

    public static b d() {
        return b.a(c.n().d());
    }

    public static g e(i iVar) {
        return iVar.f(c.n().b());
    }

    public static String f(GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi, String str, String str2) {
        str.getClass();
        return str2 + gestureDetectorOnGestureListenerC3889xi;
    }

    public static String g(Number number, String str) {
        return number.getClass().getName().concat(str);
    }

    public static String h(String str, ssi ssiVar, String str2, ssi ssiVar2) {
        return str + ssiVar + str2 + ssiVar2;
    }

    public static String i(String str, String str2, StringBuilder sb, boolean z, boolean z2) {
        sb.append(z);
        sb.append(str);
        sb.append(z2);
        sb.append(str2);
        return sb.toString();
    }

    public static String j(String str, Map map) {
        return String.valueOf(map.get(com.mbridge.msdk.config.component.common.util.c.c(str)));
    }

    public static StringBuilder k(String str, boolean z, String str2, boolean z2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(z);
        sb.append(str2);
        sb.append(z2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder l(Throwable th, a aVar, Object obj, String str) {
        aVar.a(obj, th.getMessage());
        return new StringBuilder(str);
    }

    public static LinkedHashSet m(LinkedHashMap linkedHashMap, String str, psi psiVar) {
        linkedHashMap.put(str, psiVar);
        return new LinkedHashSet();
    }

    public static List n() {
        return Collections.synchronizedList(new ArrayList());
    }

    public static void o(float f, boolean z, av8 av8Var) {
        nq8.h(av8Var, new goa(f, z));
    }

    public static void p(int i, int i2, int i3, HashMap hashMap, String str) {
        hashMap.put(str, Integer.valueOf(Color.rgb(i, i2, i3)));
    }

    public static void q(int i, String str, String str2, String str3, StringBuilder sb) {
        sb.append(str);
        sb.append(str2);
        sb.append(i);
        sb.append(str3);
    }

    public static void r(qm8 qm8Var, vsj vsjVar) {
        vsjVar.d(new androidx.media3.common.b(qm8Var));
    }

    public static void s(utc utcVar, float f, av8 av8Var, boolean z) {
        nq8.h(av8Var, bkh.e(utcVar, f));
        av8Var.s(z);
    }

    public static void t(glg glgVar, glg glgVar2, String str, glg glgVar3, String str2) {
        glgVar.getClass();
        b0a.F(glgVar2, str);
        b0a.F(glgVar3, str2);
    }

    public static void u(Parcel parcel, int i, Integer num) {
        parcel.writeInt(i);
        parcel.writeInt(num.intValue());
    }

    public static void v(Exception exc, StringBuilder sb, String str) {
        sb.append(exc.getMessage());
        q0.b(str, sb.toString());
    }

    public static void w(String str, AbstractC3587m1 abstractC3587m1, C3906y9 c3906y9, String str2) {
        c3906y9.a(str2, str + abstractC3587m1);
    }

    public static void x(String str, String str2, String str3) {
        q0.a(str3, str + str2);
    }

    public static void y(String str, String str2, String str3, String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
    }

    public static void z(String str, StringBuilder sb, Throwable th) {
        sb.append(th.getMessage());
        q0.a(str, sb.toString());
    }
}
