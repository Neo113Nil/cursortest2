package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.internal.ads.s;
import com.google.android.gms.internal.ads.zzbd;
import com.google.android.gms.internal.ads.zzbf;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzfm;
import com.google.android.gms.internal.ads.zzgxm;
import com.google.android.gms.internal.ads.zzgxo;
import com.google.android.gms.internal.ads.zzno;
import com.google.android.gms.internal.ads.zzxo;
import com.google.android.gms.tasks.Tasks;
import com.ironsource.L6;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.sofascore.results.R;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import kotlin.collections.CollectionsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ox9 {
    public static final it7 h = new it7(26);
    public static ox9 i;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;

    public ox9() {
        this.a = 1;
        this.b = new int[]{2131231054, 2131231052, 2131230978};
        this.c = new int[]{2131231002, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
        this.d = new int[]{2131231051, 2131231053, 2131230995, R.drawable.abc_text_cursor_material, 2131231048, 2131231049, 2131231050};
        this.e = new int[]{2131231027, R.drawable.abc_cab_background_internal_bg, 2131231026};
        this.f = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
        this.g = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
    }

    public static boolean b(int i2, int[] iArr) {
        for (int i3 : iArr) {
            if (i3 == i2) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList f(int i2, Context context) {
        int c = wfj.c(R.attr.colorControlHighlight, context);
        int b = wfj.b(R.attr.colorButtonNormal, context);
        int[] iArr = wfj.b;
        int[] iArr2 = wfj.d;
        int h2 = o23.h(c, i2);
        return new ColorStateList(new int[][]{iArr, iArr2, wfj.c, wfj.f}, new int[]{b, h2, o23.h(c, i2), i2});
    }

    public static rcc h(zke zkeVar, hv9 hv9Var, rcc rccVar, hij hijVar) {
        int b;
        ug6 ug6Var = (ug6) zkeVar;
        lij j = ug6Var.j();
        ug6Var.T();
        if (ug6Var.i0.a.p()) {
            b = 0;
        } else {
            eke ekeVar = ug6Var.i0;
            b = ekeVar.a.b(ekeVar.b.a);
        }
        Object l = j.p() ? null : j.l(b);
        int b2 = (ug6Var.u() || j.p()) ? -1 : j.f(b, hijVar, false).b(lik.y(ug6Var.h()) - hijVar.e);
        for (int i2 = 0; i2 < hv9Var.size(); i2++) {
            rcc rccVar2 = (rcc) hv9Var.get(i2);
            if (m(rccVar2, l, ug6Var.u(), ug6Var.e(), ug6Var.f(), b2)) {
                return rccVar2;
            }
        }
        if (hv9Var.isEmpty() && rccVar != null && m(rccVar, l, ug6Var.u(), ug6Var.e(), ug6Var.f(), b2)) {
            return rccVar;
        }
        return null;
    }

    public static LayerDrawable j(t1g t1gVar, Context context, int i2) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i2);
        Drawable c = t1gVar.c(R.drawable.abc_star_black_48dp, context);
        Drawable c2 = t1gVar.c(R.drawable.abc_star_half_black_48dp, context);
        if ((c instanceof BitmapDrawable) && c.getIntrinsicWidth() == dimensionPixelSize && c.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) c;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            c.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            c.draw(canvas);
            bitmapDrawable = new BitmapDrawable(createBitmap);
            bitmapDrawable2 = new BitmapDrawable(createBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((c2 instanceof BitmapDrawable) && c2.getIntrinsicWidth() == dimensionPixelSize && c2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) c2;
        } else {
            Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            c2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            c2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(createBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public static boolean m(rcc rccVar, Object obj, boolean z, int i2, int i3, int i4) {
        Object obj2 = rccVar.a;
        int i5 = rccVar.b;
        if (!obj2.equals(obj)) {
            return false;
        }
        if (z && i5 == i2 && rccVar.c == i3) {
            return true;
        }
        return !z && i5 == -1 && rccVar.e == i4;
    }

    public static void q(Drawable drawable, int i2, PorterDuff.Mode mode) {
        Drawable mutate = drawable.mutate();
        if (mode == null) {
            mode = xb0.b;
        }
        mutate.setColorFilter(xb0.c(i2, mode));
    }

    public static zzxo x(zzno zznoVar, zzgxm zzgxmVar, zzxo zzxoVar, zzbd zzbdVar) {
        zzbf zzq = zznoVar.zzq();
        zznoVar.c.b();
        int q = zznoVar.b.q();
        Object f = zzq.g() ? null : zzq.f(q);
        if (!zznoVar.f() && !zzq.g()) {
            zzbd d = zzq.d(q, zzbdVar, false);
            zznoVar.d();
            String str = zzfm.a;
            d.getClass();
        }
        for (int i2 = 0; i2 < zzgxmVar.size(); i2++) {
            zzxo zzxoVar2 = (zzxo) zzgxmVar.get(i2);
            if (y(zzxoVar2, f, zznoVar.f(), zznoVar.g(), zznoVar.h())) {
                return zzxoVar2;
            }
        }
        if (zzgxmVar.isEmpty() && zzxoVar != null && y(zzxoVar, f, zznoVar.f(), zznoVar.g(), zznoVar.h())) {
            return zzxoVar;
        }
        return null;
    }

    public static boolean y(zzxo zzxoVar, Object obj, boolean z, int i2, int i3) {
        if (!zzxoVar.a.equals(obj)) {
            return false;
        }
        int i4 = zzxoVar.b;
        return z ? i4 == i2 && zzxoVar.c == i3 : i4 == -1 && zzxoVar.e == -1;
    }

    public void a(b10 b10Var, rcc rccVar, lij lijVar) {
        if (rccVar == null) {
            return;
        }
        if (lijVar.b(rccVar.a) != -1) {
            b10Var.A(rccVar, lijVar);
            return;
        }
        lij lijVar2 = (lij) ((awf) this.d).get(rccVar);
        if (lijVar2 != null) {
            b10Var.A(rccVar, lijVar2);
        }
    }

    public bpf c() {
        Context context = (Context) this.b;
        ds4 ds4Var = (ds4) this.c;
        mqi mqiVar = (mqi) this.d;
        if (mqiVar == null) {
            mqiVar = ypa.b(new vs9(this, 0));
        }
        mqi mqiVar2 = (mqi) this.e;
        if (mqiVar2 == null) {
            mqiVar2 = ypa.b(new vs9(this, 1));
        }
        mqi b = ypa.b(zg3.u);
        km5 km5Var = km5.a;
        return new bpf(context, ds4Var, mqiVar, mqiVar2, b, new jc3(km5Var, km5Var, km5Var, km5Var, km5Var), (ws9) this.f, (zid) this.g);
    }

    public ch2 d(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List list = (List) this.f;
        int indexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i2 = indexOf; i2 < size; i2++) {
            ch2 a = ((bh2) list.get(i2)).a(type, annotationArr);
            if (a != null) {
                return a;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = list.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(((bh2) list.get(indexOf)).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public Object e(Class cls) {
        if (!cls.isInterface()) {
            a70.p("API declarations must be interfaces.");
            return null;
        }
        ArrayDeque arrayDeque = new ArrayDeque(1);
        arrayDeque.add(cls);
        while (!arrayDeque.isEmpty()) {
            Class cls2 = (Class) arrayDeque.removeFirst();
            if (cls2.getTypeParameters().length != 0) {
                StringBuilder sb = new StringBuilder("Type parameters are unsupported on ");
                sb.append(cls2.getName());
                if (cls2 != cls) {
                    sb.append(" which is an interface of ");
                    sb.append(cls.getName());
                }
                throw new IllegalArgumentException(sb.toString());
            }
            Collections.addAll(arrayDeque, cls2.getInterfaces());
        }
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new dx9(this, cls));
    }

    public boolean equals(Object obj) {
        switch (this.a) {
            case 8:
                if (obj == null) {
                    return false;
                }
                return afn.a(this, obj, new String[0]);
            default:
                return super.equals(obj);
        }
    }

    public ica g() {
        ArrayList arrayList = (ArrayList) this.g;
        Intent intent = (Intent) this.e;
        g7d g7dVar = (g7d) this.f;
        if (arrayList.isEmpty()) {
            a70.r("You must call setDestination() or addDestination() before constructing the deep link");
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>();
        Iterator it = arrayList.iterator();
        s6d s6dVar = null;
        while (true) {
            int i2 = 0;
            if (!it.hasNext()) {
                intent.putExtra("android-support-nav:controller:deepLinkIds", CollectionsKt.R0(arrayList2));
                intent.putParcelableArrayListExtra("android-support-nav:controller:deepLinkArgs", arrayList3);
                ica icaVar = new ica((Context) this.b);
                ArrayList arrayList4 = (ArrayList) icaVar.b;
                icaVar.a(new Intent(intent));
                int size = arrayList4.size();
                while (i2 < size) {
                    Intent intent2 = (Intent) arrayList4.get(i2);
                    if (intent2 != null) {
                        intent2.putExtra("android-support-nav:controller:deepLinkIntent", intent);
                    }
                    i2++;
                }
                return icaVar;
            }
            q6d q6dVar = (q6d) it.next();
            int i3 = q6dVar.a;
            Bundle bundle = q6dVar.b;
            s6d i4 = i(i3);
            if (i4 == null) {
                int i5 = s6d.f;
                yhk.m("Navigation destination ", l4a.q((fl5) this.c, i3), " cannot be found in the navigation graph ", g7dVar);
                return null;
            }
            int[] d = i4.d(s6dVar);
            int length = d.length;
            while (i2 < length) {
                arrayList2.add(Integer.valueOf(d[i2]));
                arrayList3.add(bundle);
                i2++;
            }
            s6dVar = i4;
        }
    }

    public int hashCode() {
        switch (this.a) {
            case 8:
                return efn.a(this, new String[0]);
            default:
                return super.hashCode();
        }
    }

    public s6d i(int i2) {
        vg0 vg0Var = new vg0();
        vg0Var.addLast((g7d) this.f);
        while (!vg0Var.isEmpty()) {
            s6d s6dVar = (s6d) vg0Var.removeFirst();
            if (s6dVar.b.b == i2) {
                return s6dVar;
            }
            if (s6dVar instanceof g7d) {
                Iterator it = ((g7d) s6dVar).iterator();
                while (true) {
                    i7d i7dVar = (i7d) it;
                    if (i7dVar.hasNext()) {
                        vg0Var.addLast((s6d) i7dVar.next());
                    }
                }
            }
        }
        return null;
    }

    public Object k(px9 px9Var, ArrayList arrayList) {
        Object B;
        Object B2;
        Class cls = (Class) this.c;
        if (!cw3.a.contains(this)) {
            try {
                Object B3 = qx9.B((Class) this.b, null, (Method) this.d, new Object[0]);
                if (B3 != null && (B = qx9.B(cls, B3, (Method) this.e, px9Var.a)) != null && (B2 = qx9.B(cls, B, (Method) this.f, arrayList)) != null) {
                    return qx9.B(cls, B2, (Method) this.g, new Object[0]);
                }
            } catch (Throwable th) {
                cw3.a(this, th);
                return null;
            }
        }
        return null;
    }

    public ColorStateList l(int i2, Context context) {
        if (i2 == R.drawable.abc_edit_text_material) {
            return eq3.q(R.color.abc_tint_edittext, context);
        }
        if (i2 == 2131231044) {
            return eq3.q(R.color.abc_tint_switch_track, context);
        }
        if (i2 != R.drawable.abc_switch_thumb_material) {
            if (i2 == R.drawable.abc_btn_default_mtrl_shape) {
                return f(wfj.c(R.attr.colorButtonNormal, context), context);
            }
            if (i2 == R.drawable.abc_btn_borderless_material) {
                return f(0, context);
            }
            if (i2 == R.drawable.abc_btn_colored_material) {
                return f(wfj.c(R.attr.colorAccent, context), context);
            }
            if (i2 == 2131231039 || i2 == R.drawable.abc_spinner_textfield_background_material) {
                return eq3.q(R.color.abc_tint_spinner, context);
            }
            if (b(i2, (int[]) this.c)) {
                return wfj.d(R.attr.colorControlNormal, context);
            }
            if (b(i2, (int[]) this.f)) {
                return eq3.q(R.color.abc_tint_default, context);
            }
            if (b(i2, (int[]) this.g)) {
                return eq3.q(R.color.abc_tint_btn_checkable, context);
            }
            if (i2 == R.drawable.abc_seekbar_thumb_material) {
                return eq3.q(R.color.abc_tint_seek_thumb, context);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList d = wfj.d(R.attr.colorSwitchThumbNormal, context);
        if (d == null || !d.isStateful()) {
            iArr[0] = wfj.b;
            iArr2[0] = wfj.b(R.attr.colorSwitchThumbNormal, context);
            iArr[1] = wfj.e;
            iArr2[1] = wfj.c(R.attr.colorControlActivated, context);
            iArr[2] = wfj.f;
            iArr2[2] = wfj.c(R.attr.colorSwitchThumbNormal, context);
        } else {
            int[] iArr3 = wfj.b;
            iArr[0] = iArr3;
            iArr2[0] = d.getColorForState(iArr3, 0);
            iArr[1] = wfj.e;
            iArr2[1] = wfj.c(R.attr.colorControlActivated, context);
            iArr[2] = wfj.f;
            iArr2[2] = d.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    public qs3 n(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        List list = (List) this.e;
        int indexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i2 = indexOf; i2 < size; i2++) {
            qs3 a = ((ps3) list.get(i2)).a(type, annotationArr, annotationArr2, this);
            if (a != null) {
                return a;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = list.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(((ps3) list.get(indexOf)).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public qs3 o(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List list = (List) this.e;
        int indexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i2 = indexOf; i2 < size; i2++) {
            qs3 b = ((ps3) list.get(i2)).b(type, annotationArr, this);
            if (b != null) {
                return b;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = list.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(((ps3) list.get(indexOf)).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public void p(String str, Bundle bundle, boolean z) {
        String str2;
        String str3;
        boolean e;
        int i2;
        bundle.putString("scope", "*");
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        r38 r38Var = (r38) this.b;
        r38Var.a();
        bundle.putString("gmp_app_id", r38Var.c.b);
        bundle.putString("gmsv", Integer.toString(((pic) this.c).d()));
        bundle.putString(L6.G, Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", ((pic) this.c).b());
        pic picVar = (pic) this.c;
        synchronized (picVar) {
            try {
                if (((String) picVar.e) == null) {
                    picVar.f();
                }
                str2 = (String) picVar.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        bundle.putString("app_ver_name", str2);
        r38 r38Var2 = (r38) this.b;
        r38Var2.a();
        try {
            str3 = Base64.encodeToString(MessageDigest.getInstance(AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1).digest(r38Var2.b.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            str3 = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", str3);
        if (z) {
            r38 r38Var3 = (r38) this.b;
            r38Var3.a();
            bundle.putString("Goog-Api-Key", r38Var3.c.a);
        }
        try {
            String str4 = ((mu0) Tasks.await(((k48) ((l48) this.g)).d())).a;
            if (!TextUtils.isEmpty(str4)) {
                bundle.putString("Goog-Firebase-Installations-Auth", str4);
            }
        } catch (InterruptedException | ExecutionException unused2) {
        }
        bundle.putString("appid", (String) Tasks.await(((k48) ((l48) this.g)).c()));
        bundle.putString("cliv", "fcm-25.1.1");
        c99 c99Var = (c99) ((vff) this.f).get();
        nu4 nu4Var = (nu4) ((vff) this.e).get();
        if (c99Var == null || nu4Var == null) {
            return;
        }
        op4 op4Var = (op4) c99Var;
        synchronized (op4Var) {
            long currentTimeMillis = System.currentTimeMillis();
            d99 d99Var = (d99) op4Var.a.get();
            synchronized (d99Var) {
                e = d99Var.e(d99.b, currentTimeMillis);
            }
            if (e) {
                synchronized (d99Var) {
                    d99Var.a.a(new jp1(d99Var, d99.b(System.currentTimeMillis())));
                }
                i2 = 3;
            } else {
                i2 = 1;
            }
        }
        if (i2 != 1) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(wt3.C(i2)));
            bundle.putString("Firebase-Client", nu4Var.a());
        }
    }

    public void r(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        List list = (List) this.e;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((ps3) list.get(i2)).getClass();
        }
    }

    public void s(lij lijVar) {
        hv9 hv9Var;
        b10 d = lv9.d();
        if (((hv9) this.c).isEmpty()) {
            a(d, (rcc) this.f, lijVar);
            if (!sha.r((rcc) this.g, (rcc) this.f)) {
                a(d, (rcc) this.g, lijVar);
            }
            if (!sha.r((rcc) this.e, (rcc) this.f) && !sha.r((rcc) this.e, (rcc) this.g)) {
                a(d, (rcc) this.e, lijVar);
            }
        } else {
            int i2 = 0;
            while (true) {
                int size = ((hv9) this.c).size();
                hv9Var = (hv9) this.c;
                if (i2 >= size) {
                    break;
                }
                a(d, (rcc) hv9Var.get(i2), lijVar);
                i2++;
            }
            if (!hv9Var.contains((rcc) this.e)) {
                a(d, (rcc) this.e, lijVar);
            }
        }
        this.d = d.c(true);
    }

    public void t() {
        Iterator it = ((ArrayList) this.g).iterator();
        while (it.hasNext()) {
            int i2 = ((q6d) it.next()).a;
            if (i(i2) == null) {
                int i3 = s6d.f;
                vp2.f(wt3.q("Navigation destination ", l4a.q((fl5) this.c, i2), " cannot be found in the navigation graph "), (g7d) this.f);
                return;
            }
        }
    }

    public /* synthetic */ String u() {
        String str = (String) zzba.zzc().a(zzbjg.Eb);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("objectId", (Long) this.b);
            jSONObject.put("eventCategory", (String) this.c);
            jSONObject.putOpt("event", (String) this.d);
            jSONObject.putOpt(IronSourceConstants.EVENTS_ERROR_CODE, (Integer) this.e);
            jSONObject.putOpt("rewardType", (String) this.f);
            jSONObject.putOpt(IronSourceConstants.EVENTS_REWARD_AMOUNT, (Integer) this.g);
        } catch (JSONException unused) {
            int i2 = zze.zza;
            zzo.zzi("Could not convert parameters to JSON.");
        }
        String jSONObject2 = jSONObject.toString();
        int length = String.valueOf(str).length();
        return fc6.o(new StringBuilder(String.valueOf(jSONObject2).length() + length + 14 + 2), str, "(\"h5adsEvent\",", jSONObject2, ");");
    }

    public void v(zzbf zzbfVar) {
        zzgxm zzgxmVar;
        zzgxo zzgxoVar = new zzgxo();
        if (((zzgxm) this.c).isEmpty()) {
            w(zzgxoVar, (zzxo) this.f, zzbfVar);
            if (!Objects.equals((zzxo) this.g, (zzxo) this.f)) {
                w(zzgxoVar, (zzxo) this.g, zzbfVar);
            }
            if (!Objects.equals((zzxo) this.e, (zzxo) this.f) && !Objects.equals((zzxo) this.e, (zzxo) this.g)) {
                w(zzgxoVar, (zzxo) this.e, zzbfVar);
            }
        } else {
            int i2 = 0;
            while (true) {
                int size = ((zzgxm) this.c).size();
                zzgxmVar = (zzgxm) this.c;
                if (i2 >= size) {
                    break;
                }
                w(zzgxoVar, (zzxo) zzgxmVar.get(i2), zzbfVar);
                i2++;
            }
            if (!zzgxmVar.contains((zzxo) this.e)) {
                w(zzgxoVar, (zzxo) this.e, zzbfVar);
            }
        }
        this.d = zzgxoVar.d(true);
    }

    public void w(zzgxo zzgxoVar, zzxo zzxoVar, zzbf zzbfVar) {
        if (zzxoVar == null) {
            return;
        }
        if (zzbfVar.e(zzxoVar.a) != -1) {
            zzgxoVar.a(zzxoVar, zzbfVar);
            return;
        }
        zzbf zzbfVar2 = (zzbf) ((njo) this.d).get(zzxoVar);
        if (zzbfVar2 != null) {
            zzgxoVar.a(zzxoVar, zzbfVar2);
        }
    }

    public ox9(xf xfVar, gmo gmoVar, tkn tknVar) {
        this.a = 8;
        new ArrayList();
        this.e = u1p.a;
        this.b = xfVar;
        this.c = gmoVar;
        this.e = b2p.l(tknVar);
    }

    public ox9(zzbd zzbdVar) {
        this.a = 10;
        this.b = zzbdVar;
        mio mioVar = zzgxm.b;
        this.c = s.e;
        this.d = njo.g;
    }

    public ox9(Class cls, Class cls2, Method method, Method method2, Method method3, Method method4) {
        this.a = 0;
        this.b = cls;
        this.c = cls2;
        this.d = method;
        this.e = method2;
        this.f = method3;
        this.g = method4;
    }

    public ox9(k7d k7dVar) {
        Intent launchIntentForPackage;
        this.a = 6;
        k7dVar.getClass();
        Context context = k7dVar.a;
        context.getClass();
        this.b = context;
        this.c = new fl5(context, false);
        Activity activity = (Activity) i5h.j(i5h.o(e5h.e(context, new clc(27)), new clc(28)));
        this.d = activity;
        if (activity != null) {
            launchIntentForPackage = new Intent(context, activity.getClass());
        } else {
            launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage == null) {
                launchIntentForPackage = new Intent();
            }
        }
        launchIntentForPackage.addFlags(268468224);
        this.e = launchIntentForPackage;
        this.g = new ArrayList();
        this.f = k7dVar.b.g();
    }

    public /* synthetic */ ox9(String str) {
        this.a = 9;
        this.c = str;
    }

    public ox9(yg2 yg2Var, jl9 jl9Var, List list, List list2, Executor executor) {
        this.a = 7;
        this.b = new ConcurrentHashMap();
        this.c = yg2Var;
        this.d = jl9Var;
        this.e = list;
        this.f = list2;
        this.g = executor;
    }

    public ox9(Context context) {
        this.a = 5;
        this.b = context.getApplicationContext();
        this.c = j.a;
        this.d = null;
        this.e = null;
        this.f = new ws9(4, 2, true, true, true);
        this.g = null;
    }

    public ox9(fu3 fu3Var, g33 g33Var, ad2 ad2Var, h63 h63Var) {
        this.a = 2;
        this.b = fu3Var;
        this.c = g33Var;
        this.d = ad2Var;
        this.e = h63Var;
    }

    public ox9(r38 r38Var, pic picVar, vff vffVar, vff vffVar2, l48 l48Var) {
        this.a = 4;
        r38Var.a();
        Rpc rpc = new Rpc(r38Var.a);
        this.b = r38Var;
        this.c = picVar;
        this.d = rpc;
        this.e = vffVar;
        this.f = vffVar2;
        this.g = l48Var;
    }

    public ox9(hij hijVar) {
        this.a = 3;
        this.b = hijVar;
        av9 av9Var = hv9.b;
        this.c = vvf.e;
        this.d = awf.g;
    }
}
