package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.SQLException;
import android.database.sqlite.SQLiteConstraintException;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.text.Spannable;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.s;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.File;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class fp4 implements qs3, ol5, ooh, xj6, hd9, w9e {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public fp4(int i) {
        this.a = i;
        int i2 = 0;
        switch (i) {
            case 7:
                this.b = new HashMap();
                this.c = new ba2(1);
                break;
            case 15:
                this.b = new HashMap();
                this.c = vz2.b;
                break;
            case 17:
                this.b = new gh0(0);
                this.c = new HashMap();
                break;
            case 27:
                this.b = new c49(null);
                this.c = new HashMap();
                break;
            case 29:
                this.b = new byte[]{48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
                byte[] bArr = new byte[128];
                this.c = bArr;
                for (int i3 = 0; i3 < 128; i3++) {
                    bArr[i3] = -1;
                }
                while (true) {
                    byte[] bArr2 = (byte[]) this.b;
                    if (i2 >= bArr2.length) {
                        bArr[65] = bArr[97];
                        bArr[66] = bArr[98];
                        bArr[67] = bArr[99];
                        bArr[68] = bArr[100];
                        bArr[69] = bArr[101];
                        bArr[70] = bArr[102];
                        break;
                    } else {
                        bArr[bArr2[i2]] = (byte) i2;
                        i2++;
                    }
                }
            default:
                this.b = new xmk(0);
                this.c = new xmk(0);
                break;
        }
    }

    public static void h(SQLException sQLException) {
        String message = sQLException.getMessage();
        if (message == null) {
            throw sQLException;
        }
        if (!StringsKt.J(message, "unique", true) && !StringsKt.J(message, "2067", false) && !StringsKt.J(message, "1555", false)) {
            throw sQLException;
        }
    }

    public static vz2 k(vz2 vz2Var, List list) {
        vz2Var.getClass();
        Map map = vz2Var.a;
        HashMap hashMap = new HashMap(map);
        HashSet hashSet = new HashSet(list);
        for (String str : map.keySet()) {
            if (!hashSet.contains(str)) {
                hashMap.remove(str);
            }
        }
        return new vz2(hashMap);
    }

    public void A(Fragment fragment, boolean z) {
        Fragment fragment2 = ((s) this.b).z;
        if (fragment2 != null) {
            s parentFragmentManager = fragment2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.p.A(fragment, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            qo8 qo8Var = (qo8) it.next();
            if (!z || qo8Var.b) {
                ap8 ap8Var = qo8Var.a;
            }
        }
    }

    public Object B(h0f h0fVar) {
        HashMap hashMap = (HashMap) this.c;
        c49 c49Var = (c49) hashMap.get(h0fVar);
        if (c49Var == null) {
            c49Var = new c49(h0fVar);
            hashMap.put(h0fVar, c49Var);
        } else {
            h0fVar.a();
        }
        c49 c49Var2 = c49Var.d;
        c49Var2.c = c49Var.c;
        c49Var.c.d = c49Var2;
        c49 c49Var3 = (c49) this.b;
        c49Var.d = c49Var3;
        c49 c49Var4 = c49Var3.c;
        c49Var.c = c49Var4;
        c49Var4.d = c49Var;
        c49Var.d.c = c49Var;
        ArrayList arrayList = c49Var.b;
        int size = arrayList != null ? arrayList.size() : 0;
        if (size > 0) {
            return c49Var.b.remove(size - 1);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Serializable C(int i, int i2, int i3, sq3 sq3Var) {
        p56 p56Var;
        lu3 lu3Var;
        int i4;
        int i5;
        int i6;
        int i7;
        Object obj;
        List list;
        int i8;
        Object R;
        int i9;
        int i10;
        List list2;
        List list3;
        List list4;
        if (sq3Var instanceof p56) {
            p56Var = (p56) sq3Var;
            int i11 = p56Var.x;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                p56Var.x = i11 - Integer.MIN_VALUE;
                Object obj2 = p56Var.v;
                lu3Var = lu3.a;
                i4 = p56Var.x;
                int i12 = 0;
                rq3 rq3Var = null;
                int i13 = 2;
                int i14 = 1;
                if (i4 != 0) {
                    y6a.M(obj2);
                    p56Var.r = i;
                    i5 = i2;
                    p56Var.s = i5;
                    p56Var.t = i3;
                    p56Var.x = 1;
                    hs4 hs4Var = z45.a;
                    Object R2 = xw3.R(hq4.c, new o56(this, i, rq3Var, i14), p56Var);
                    if (R2 != lu3Var) {
                        i6 = i;
                        i7 = i3;
                        obj = R2;
                    }
                    return lu3Var;
                }
                if (i4 != 1) {
                    if (i4 == 2) {
                        i7 = p56Var.t;
                        i8 = p56Var.s;
                        i6 = p56Var.r;
                        y6a.M(obj2);
                        int i15 = i8;
                        list = (List) obj2;
                        i5 = i15;
                        List H0 = CollectionsKt.H0(list, o93.a(new au5(11), new au5(12)));
                        p56Var.u = H0;
                        p56Var.r = i6;
                        p56Var.s = i5;
                        p56Var.t = i7;
                        p56Var.x = 3;
                        hs4 hs4Var2 = z45.a;
                        R = xw3.R(hq4.c, new o56(this, i6, rq3Var, i12), p56Var);
                        if (R != lu3Var) {
                            i9 = i5;
                            obj2 = R;
                            i10 = i6;
                            list2 = H0;
                            list3 = (List) obj2;
                            if (list3 == null) {
                            }
                            return new Pair(list2, CollectionsKt.H0(list3, o93.a(new au5(13), new au5(14))));
                        }
                        return lu3Var;
                    }
                    if (i4 != 3) {
                        if (i4 != 4) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        list4 = p56Var.u;
                        y6a.M(obj2);
                        list3 = (List) obj2;
                        list2 = list4;
                        return new Pair(list2, CollectionsKt.H0(list3, o93.a(new au5(13), new au5(14))));
                    }
                    i7 = p56Var.t;
                    i9 = p56Var.s;
                    i10 = p56Var.r;
                    list2 = p56Var.u;
                    y6a.M(obj2);
                    list3 = (List) obj2;
                    if (list3 == null) {
                        p56Var.u = list2;
                        p56Var.r = i10;
                        p56Var.s = i9;
                        p56Var.t = i7;
                        p56Var.x = 4;
                        hs4 hs4Var3 = z45.a;
                        obj2 = xw3.R(hq4.c, new o56(this, i7, rq3Var, i13), p56Var);
                        if (obj2 != lu3Var) {
                            list4 = list2;
                            list3 = (List) obj2;
                            list2 = list4;
                        }
                        return lu3Var;
                    }
                    return new Pair(list2, CollectionsKt.H0(list3, o93.a(new au5(13), new au5(14))));
                }
                i7 = p56Var.t;
                int i16 = p56Var.s;
                i6 = p56Var.r;
                y6a.M(obj2);
                obj = obj2;
                i5 = i16;
                list = (List) obj;
                if (list == null) {
                    p56Var.r = i6;
                    p56Var.s = i5;
                    p56Var.t = i7;
                    p56Var.x = 2;
                    hs4 hs4Var4 = z45.a;
                    Object R3 = xw3.R(hq4.c, new o56(this, i5, rq3Var, i13), p56Var);
                    if (R3 != lu3Var) {
                        i8 = i5;
                        obj2 = R3;
                        int i152 = i8;
                        list = (List) obj2;
                        i5 = i152;
                    }
                    return lu3Var;
                }
                List H02 = CollectionsKt.H0(list, o93.a(new au5(11), new au5(12)));
                p56Var.u = H02;
                p56Var.r = i6;
                p56Var.s = i5;
                p56Var.t = i7;
                p56Var.x = 3;
                hs4 hs4Var22 = z45.a;
                R = xw3.R(hq4.c, new o56(this, i6, rq3Var, i12), p56Var);
                if (R != lu3Var) {
                }
                return lu3Var;
            }
        }
        p56Var = new p56(this, sq3Var);
        Object obj22 = p56Var.v;
        lu3Var = lu3.a;
        i4 = p56Var.x;
        int i122 = 0;
        rq3 rq3Var2 = null;
        int i132 = 2;
        int i142 = 1;
        if (i4 != 0) {
        }
        list = (List) obj;
        if (list == null) {
        }
        List H022 = CollectionsKt.H0(list, o93.a(new au5(11), new au5(12)));
        p56Var.u = H022;
        p56Var.r = i6;
        p56Var.s = i5;
        p56Var.t = i7;
        p56Var.x = 3;
        hs4 hs4Var222 = z45.a;
        R = xw3.R(hq4.c, new o56(this, i6, rq3Var2, i122), p56Var);
        if (R != lu3Var) {
        }
        return lu3Var;
    }

    public ll6 D(Object... objArr) {
        Constructor a;
        synchronized (((AtomicBoolean) this.c)) {
            if (!((AtomicBoolean) this.c).get()) {
                try {
                    a = ((ep4) this.b).a();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.c).set(true);
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating extension", e);
                }
            }
            a = null;
        }
        if (a == null) {
            return null;
        }
        try {
            return (ll6) a.newInstance(objArr);
        } catch (Exception e2) {
            sw9.m("Unexpected error creating extractor", e2);
            return null;
        }
    }

    public void E() {
        String str = (String) this.b;
        if (((FileChannel) this.c) != null) {
            return;
        }
        try {
            File file = new File(str);
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileChannel channel = new FileOutputStream(file).getChannel();
            this.c = channel;
            if (channel != null) {
                channel.lock();
            }
        } catch (Throwable th) {
            FileChannel fileChannel = (FileChannel) this.c;
            if (fileChannel != null) {
                fileChannel.close();
            }
            this.c = null;
            sw9.m(lnb.o("Unable to lock file: '", str, "'."), th);
        }
    }

    public void F(vz2 vz2Var) {
        for (Map.Entry entry : new HashMap((HashMap) this.b).entrySet()) {
            if (entry.getKey() != null) {
                pvd.j();
                return;
            } else {
                List list = (List) entry.getValue();
                if (!k(vz2Var, list).equals(k((vz2) this.c, list))) {
                    throw null;
                }
            }
        }
        this.c = vz2Var;
    }

    public void G(h0f h0fVar, Object obj) {
        HashMap hashMap = (HashMap) this.c;
        c49 c49Var = (c49) hashMap.get(h0fVar);
        if (c49Var == null) {
            c49Var = new c49(h0fVar);
            c49Var.d = c49Var;
            c49 c49Var2 = (c49) this.b;
            c49Var.d = c49Var2.d;
            c49Var.c = c49Var2;
            c49Var2.d = c49Var;
            c49Var.d.c = c49Var;
            hashMap.put(h0fVar, c49Var);
        } else {
            h0fVar.a();
        }
        ArrayList arrayList = c49Var.b;
        if (arrayList == null) {
            arrayList = new ArrayList();
            c49Var.b = arrayList;
        }
        arrayList.add(obj);
    }

    public void H(String str) {
        u35 u35Var;
        synchronized (this) {
            try {
                u35Var = (u35) ((HashMap) this.b).get(str);
                w1a.m(u35Var, "Argument must not be null");
                int i = u35Var.b;
                if (i < 1) {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + u35Var.b);
                }
                int i2 = i - 1;
                u35Var.b = i2;
                if (i2 == 0) {
                    u35 u35Var2 = (u35) ((HashMap) this.b).remove(str);
                    if (!u35Var2.equals(u35Var)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + u35Var + ", but actually removed: " + u35Var2 + ", safeKey: " + str);
                    }
                    ba2 ba2Var = (ba2) this.c;
                    synchronized (ba2Var.a) {
                        try {
                            if (ba2Var.a.size() < 10) {
                                ba2Var.a.offer(u35Var2);
                            }
                        } finally {
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        u35Var.a.unlock();
    }

    public Object I() {
        c49 c49Var = (c49) this.b;
        c49 c49Var2 = c49Var.d;
        while (true) {
            boolean equals = c49Var2.equals(c49Var);
            Object obj = c49Var2.a;
            if (equals) {
                return null;
            }
            ArrayList arrayList = c49Var2.b;
            int size = arrayList != null ? arrayList.size() : 0;
            Object remove = size > 0 ? c49Var2.b.remove(size - 1) : null;
            if (remove != null) {
                return remove;
            }
            c49 c49Var3 = c49Var2.d;
            c49Var3.c = c49Var2.c;
            c49Var2.c.d = c49Var3;
            ((HashMap) this.c).remove(obj);
            ((h0f) obj).a();
            c49Var2 = c49Var2.d;
        }
    }

    public void J(glg glgVar, Iterable iterable) {
        if (iterable == null) {
            return;
        }
        for (Object obj : iterable) {
            try {
                ((ml4) this.b).a0(glgVar, obj);
            } catch (SQLException e) {
                h(e);
                ((td4) this.c).e0(glgVar, obj);
            }
        }
    }

    public void K(glg glgVar, Object obj) {
        try {
            ((ml4) this.b).a0(glgVar, obj);
        } catch (SQLException e) {
            h(e);
            ((td4) this.c).e0(glgVar, obj);
        }
    }

    public long L(glg glgVar, Object obj) {
        try {
            return ((ml4) this.b).b0(glgVar, obj);
        } catch (SQLException e) {
            h(e);
            ((td4) this.c).e0(glgVar, obj);
            return -1L;
        }
    }

    public long[] M(glg glgVar, Collection collection) {
        long j;
        if (collection == null) {
            return new long[0];
        }
        int size = collection.size();
        long[] jArr = new long[size];
        for (int i = 0; i < size; i++) {
            try {
                j = ((ml4) this.b).b0(glgVar, CollectionsKt.U(i, collection));
            } catch (SQLException e) {
                h(e);
                ((td4) this.c).e0(glgVar, CollectionsKt.U(i, collection));
                j = -1;
            }
            jArr[i] = j;
        }
        return jArr;
    }

    public xbb N(List list) {
        xbb b = a.b();
        for (Object obj : list) {
            try {
                b.add(Long.valueOf(((ap5) this.b).z(obj)));
            } catch (SQLiteConstraintException e) {
                String message = e.getMessage();
                if (message == null) {
                    throw e;
                }
                if (!StringsKt.J(message, "unique", true) && !StringsKt.J(message, "2067", false) && !StringsKt.J(message, "1555", false)) {
                    throw e;
                }
                ap5 ap5Var = (ap5) this.c;
                mni a = ap5Var.a();
                try {
                    ap5Var.v(a, obj);
                    a.F();
                    ap5Var.m(a);
                    b.add(-1L);
                } catch (Throwable th) {
                    ap5Var.m(a);
                    throw th;
                }
            }
        }
        return a.a(b);
    }

    @Override // defpackage.ol5
    public Object a() {
        return (fck) this.b;
    }

    @Override // defpackage.hd9
    public w9e b(dd9 dd9Var, zc9 zc9Var) {
        return new fp4(21, ((hd9) this.b).b(dd9Var, zc9Var), (List) this.c);
    }

    @Override // defpackage.hd9
    public w9e c() {
        return new fp4(21, ((hd9) this.b).c(), (List) this.c);
    }

    @Override // defpackage.qs3
    public Object convert(Object obj) {
        switch (this.a) {
            case 3:
                i2g i2gVar = (i2g) obj;
                i2gVar.getClass();
                yia yiaVar = (yia) this.c;
                return ((yea) yiaVar.b).b((dy4) this.b, i2gVar.string());
            default:
                i2g i2gVar2 = (i2g) obj;
                JsonReader newJsonReader = ((Gson) this.b).newJsonReader(i2gVar2.charStream());
                try {
                    Object a = ((u4k) this.c).a(newJsonReader);
                    if (newJsonReader.peek() == JsonToken.END_DOCUMENT) {
                        return a;
                    }
                    throw new zfa("JSON document was not fully consumed.");
                } finally {
                    i2gVar2.close();
                }
        }
    }

    @Override // defpackage.ol5
    public boolean d(CharSequence charSequence, int i, int i2, d6k d6kVar) {
        if ((d6kVar.c & 4) > 0) {
            return true;
        }
        if (((fck) this.b) == null) {
            this.b = new fck(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((kpg) this.c).getClass();
        ((fck) this.b).setSpan(new e6k(d6kVar), i, i2, 33);
        return true;
    }

    @Override // defpackage.w9e
    public Object e(Uri uri, ue4 ue4Var) {
        b38 b38Var = (b38) ((w9e) this.b).e(uri, ue4Var);
        List list = (List) this.c;
        return (list == null || list.isEmpty()) ? b38Var : (b38) b38Var.copy(list);
    }

    public wcj f(List list) {
        vg5 vg5Var;
        vg5 vg5Var2 = null;
        try {
            int size = list.size();
            int i = 0;
            vg5 vg5Var3 = null;
            while (i < size) {
                try {
                    vg5Var = (vg5) list.get(i);
                } catch (Exception e) {
                    e = e;
                    vg5Var2 = vg5Var3;
                }
                try {
                    vg5Var.a((xl0) this.c);
                    i++;
                    vg5Var3 = vg5Var;
                } catch (Exception e2) {
                    e = e2;
                    vg5Var2 = vg5Var;
                    StringBuilder sb = new StringBuilder();
                    StringBuilder sb2 = new StringBuilder("Error while applying EditCommand batch to buffer (length=");
                    sb2.append(((j12) ((xl0) this.c).f).s());
                    sb2.append(", composition=");
                    sb2.append(((xl0) this.c).e());
                    sb2.append(", selection=");
                    xl0 xl0Var = (xl0) this.c;
                    sb2.append((Object) pej.i(t6a.g(xl0Var.b, xl0Var.c)));
                    sb2.append("):");
                    sb.append(sb2.toString());
                    sb.append('\n');
                    CollectionsKt.e0(list, sb, "\n", null, null, new kz3(vg5Var2, this), 60);
                    throw new RuntimeException(sb.toString(), e);
                }
            }
            xl0 xl0Var2 = (xl0) this.c;
            xl0Var2.getClass();
            q80 q80Var = new q80(((j12) xl0Var2.f).toString());
            xl0 xl0Var3 = (xl0) this.c;
            long g = t6a.g(xl0Var3.b, xl0Var3.c);
            pej pejVar = pej.h(((wcj) this.b).b) ? null : new pej(g);
            wcj wcjVar = new wcj(q80Var, pejVar != null ? pejVar.a : t6a.g(pej.f(g), pej.g(g)), ((xl0) this.c).e());
            this.b = wcjVar;
            return wcjVar;
        } catch (Exception e3) {
            e = e3;
        }
    }

    public dd2 g() {
        p75 p75Var = (p75) this.b;
        if (p75Var != null) {
            return new fd2(p75Var.a);
        }
        String str = (String) this.c;
        return str != null ? kd2.q(str) : kd2.q("wrap");
    }

    @Override // defpackage.xj6
    public int getHeight() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) ((t9d) this.b).a;
        ExtendedFloatingActionButton extendedFloatingActionButton2 = (ExtendedFloatingActionButton) this.c;
        int i = extendedFloatingActionButton2.i0;
        if (i != -1) {
            return (i == 0 || i == -2) ? extendedFloatingActionButton.getMeasuredHeight() : i;
        }
        if (!(extendedFloatingActionButton2.getParent() instanceof View)) {
            return extendedFloatingActionButton.getMeasuredHeight();
        }
        View view = (View) extendedFloatingActionButton2.getParent();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null || layoutParams.height != -2) {
            return (view.getHeight() - ((!(extendedFloatingActionButton2.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) extendedFloatingActionButton2.getLayoutParams()) == null) ? 0 : marginLayoutParams.topMargin + marginLayoutParams.bottomMargin)) - (view.getPaddingBottom() + view.getPaddingTop());
        }
        return extendedFloatingActionButton.getMeasuredHeight();
    }

    @Override // defpackage.xj6
    public ViewGroup.LayoutParams getLayoutParams() {
        int i = ((ExtendedFloatingActionButton) this.c).i0;
        if (i == 0) {
            i = -2;
        }
        return new ViewGroup.LayoutParams(-1, i);
    }

    @Override // defpackage.xj6
    public int getPaddingEnd() {
        return ((ExtendedFloatingActionButton) this.c).b0;
    }

    @Override // defpackage.xj6
    public int getPaddingStart() {
        return ((ExtendedFloatingActionButton) this.c).a0;
    }

    @Override // defpackage.ooh
    public cwh getSource() {
        return (fe6) this.c;
    }

    @Override // defpackage.xj6
    public int getWidth() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        t9d t9dVar = (t9d) this.b;
        ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) this.c;
        if (!(extendedFloatingActionButton.getParent() instanceof View)) {
            return t9dVar.getWidth();
        }
        View view = (View) extendedFloatingActionButton.getParent();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null || layoutParams.width != -2) {
            return (view.getWidth() - ((!(extendedFloatingActionButton.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) extendedFloatingActionButton.getLayoutParams()) == null) ? 0 : marginLayoutParams.leftMargin + marginLayoutParams.rightMargin)) - (view.getPaddingRight() + view.getPaddingLeft());
        }
        return t9dVar.getWidth();
    }

    @Override // defpackage.ooh
    public ejh i() {
        return (ee6) this.b;
    }

    public void j() {
        switch (this.a) {
            case 22:
                this.b = null;
                this.c = null;
                break;
            default:
                this.b = null;
                this.c = null;
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public m51[] l(Handler handler, lg6 lg6Var, lg6 lg6Var2, lg6 lg6Var3, lg6 lg6Var4) {
        ArrayList arrayList = new ArrayList();
        Context context = (Context) this.b;
        f7a f7aVar = (f7a) this.c;
        arrayList.add(new a4c(context, f7aVar, handler, lg6Var));
        hcc hccVar = new hcc(6, false);
        in0 in0Var = in0.c;
        hccVar.b = in0Var;
        hccVar.d = a99.c;
        Intent C = lik.C(context, null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
        int i = lik.a;
        if (i >= 17) {
            String str = lik.c;
            if (("Amazon".equals(str) || "Xiaomi".equals(str)) && Settings.Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) == 1) {
                in0Var = in0.d;
                in0Var.getClass();
                hccVar.b = in0Var;
                if (((ejg) hccVar.c) == null) {
                    hccVar.c = new ejg(new lo0[0]);
                }
                arrayList.add(new t2c((Context) this.b, f7aVar, handler, lg6Var2, new on4(hccVar)));
                arrayList.add(new rej(lg6Var3, handler.getLooper()));
                arrayList.add(new com.google.android.exoplayer2.metadata.a(lg6Var4, handler.getLooper()));
                arrayList.add(new ei2());
                return (m51[]) arrayList.toArray(new m51[0]);
            }
        }
        if (i >= 29 && (lik.x(context) || (i >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")))) {
            in0Var = new in0(gn0.a(), 8);
        } else if (C != null && C.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 0) {
            in0Var = new in0(C.getIntArrayExtra("android.media.extra.ENCODINGS"), C.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8));
        }
        in0Var.getClass();
        hccVar.b = in0Var;
        if (((ejg) hccVar.c) == null) {
        }
        arrayList.add(new t2c((Context) this.b, f7aVar, handler, lg6Var2, new on4(hccVar)));
        arrayList.add(new rej(lg6Var3, handler.getLooper()));
        arrayList.add(new com.google.android.exoplayer2.metadata.a(lg6Var4, handler.getLooper()));
        arrayList.add(new ei2());
        return (m51[]) arrayList.toArray(new m51[0]);
    }

    public byte[] m(int i, String str) {
        byte[] bArr = (byte[]) this.c;
        if (i < 0 || str.length() - i < 0) {
            zzl.r("invalid offset and/or length specified");
            return null;
        }
        if ((i & 1) != 0) {
            is8.e("a hexadecimal encoding must have an even number of characters");
            return null;
        }
        int i2 = i >>> 1;
        byte[] bArr2 = new byte[i2];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = i3 + 1;
            byte b = bArr[str.charAt(i3)];
            i3 += 2;
            int i6 = bArr[str.charAt(i5)] | (b << 4);
            if (i6 < 0) {
                is8.e("invalid characters encountered in Hex string");
                return null;
            }
            bArr2[i4] = (byte) i6;
        }
        return bArr2;
    }

    public void n(Fragment fragment, boolean z) {
        Fragment fragment2 = ((s) this.b).z;
        if (fragment2 != null) {
            s parentFragmentManager = fragment2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.p.n(fragment, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            qo8 qo8Var = (qo8) it.next();
            if (!z || qo8Var.b) {
                ap8 ap8Var = qo8Var.a;
            }
        }
    }

    public void o(Fragment fragment, boolean z) {
        s sVar = (s) this.b;
        Context context = sVar.x.b;
        Fragment fragment2 = sVar.z;
        if (fragment2 != null) {
            s parentFragmentManager = fragment2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.p.o(fragment, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            qo8 qo8Var = (qo8) it.next();
            if (!z || qo8Var.b) {
                ap8 ap8Var = qo8Var.a;
            }
        }
    }

    public void p(Fragment fragment, boolean z) {
        Fragment fragment2 = ((s) this.b).z;
        if (fragment2 != null) {
            s parentFragmentManager = fragment2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.p.p(fragment, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            qo8 qo8Var = (qo8) it.next();
            if (!z || qo8Var.b) {
                ap8 ap8Var = qo8Var.a;
            }
        }
    }

    public void q(Fragment fragment, boolean z) {
        s sVar = (s) this.b;
        Fragment fragment2 = sVar.z;
        if (fragment2 != null) {
            s parentFragmentManager = fragment2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.p.q(fragment, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            qo8 qo8Var = (qo8) it.next();
            if (!z || qo8Var.b) {
                qo8Var.a.a(sVar, fragment);
            }
        }
    }

    public void r(Fragment fragment, boolean z) {
        Fragment fragment2 = ((s) this.b).z;
        if (fragment2 != null) {
            s parentFragmentManager = fragment2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.p.r(fragment, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            qo8 qo8Var = (qo8) it.next();
            if (!z || qo8Var.b) {
                ap8 ap8Var = qo8Var.a;
            }
        }
    }

    public void s(Fragment fragment, boolean z) {
        Fragment fragment2 = ((s) this.b).z;
        if (fragment2 != null) {
            s parentFragmentManager = fragment2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.p.s(fragment, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            qo8 qo8Var = (qo8) it.next();
            if (!z || qo8Var.b) {
                qo8Var.a.b(fragment);
            }
        }
    }

    public void t(Fragment fragment, boolean z) {
        s sVar = (s) this.b;
        Context context = sVar.x.b;
        Fragment fragment2 = sVar.z;
        if (fragment2 != null) {
            s parentFragmentManager = fragment2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.p.t(fragment, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            qo8 qo8Var = (qo8) it.next();
            if (!z || qo8Var.b) {
                ap8 ap8Var = qo8Var.a;
            }
        }
    }

    public String toString() {
        switch (this.a) {
            case 27:
                StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
                c49 c49Var = (c49) this.b;
                c49 c49Var2 = c49Var.c;
                boolean z = false;
                while (!c49Var2.equals(c49Var)) {
                    sb.append('{');
                    sb.append(c49Var2.a);
                    sb.append(':');
                    ArrayList arrayList = c49Var2.b;
                    sb.append(arrayList != null ? arrayList.size() : 0);
                    sb.append("}, ");
                    c49Var2 = c49Var2.c;
                    z = true;
                }
                if (z) {
                    sb.delete(sb.length() - 2, sb.length());
                }
                sb.append(" )");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public void u(Fragment fragment, boolean z) {
        Fragment fragment2 = ((s) this.b).z;
        if (fragment2 != null) {
            s parentFragmentManager = fragment2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.p.u(fragment, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            qo8 qo8Var = (qo8) it.next();
            if (!z || qo8Var.b) {
                ap8 ap8Var = qo8Var.a;
            }
        }
    }

    public void v(Fragment fragment, boolean z) {
        Fragment fragment2 = ((s) this.b).z;
        if (fragment2 != null) {
            s parentFragmentManager = fragment2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.p.v(fragment, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            qo8 qo8Var = (qo8) it.next();
            if (!z || qo8Var.b) {
                qo8Var.a.c(fragment);
            }
        }
    }

    public void w(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = ((s) this.b).z;
        if (fragment2 != null) {
            s parentFragmentManager = fragment2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.p.w(fragment, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            qo8 qo8Var = (qo8) it.next();
            if (!z || qo8Var.b) {
                ap8 ap8Var = qo8Var.a;
            }
        }
    }

    public void x(Fragment fragment, boolean z) {
        Fragment fragment2 = ((s) this.b).z;
        if (fragment2 != null) {
            s parentFragmentManager = fragment2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.p.x(fragment, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            qo8 qo8Var = (qo8) it.next();
            if (!z || qo8Var.b) {
                ap8 ap8Var = qo8Var.a;
            }
        }
    }

    public void y(Fragment fragment, boolean z) {
        Fragment fragment2 = ((s) this.b).z;
        if (fragment2 != null) {
            s parentFragmentManager = fragment2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.p.y(fragment, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            qo8 qo8Var = (qo8) it.next();
            if (!z || qo8Var.b) {
                ap8 ap8Var = qo8Var.a;
            }
        }
    }

    public void z(Fragment fragment, View view, Bundle bundle, boolean z) {
        view.getClass();
        s sVar = (s) this.b;
        Fragment fragment2 = sVar.z;
        if (fragment2 != null) {
            s parentFragmentManager = fragment2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.p.z(fragment, view, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            qo8 qo8Var = (qo8) it.next();
            if (!z || qo8Var.b) {
                qo8Var.a.d(sVar, fragment, view);
            }
        }
    }

    public /* synthetic */ fp4(int i, boolean z) {
        this.a = i;
    }

    public /* synthetic */ fp4(Object obj, int i) {
        this.a = i;
        this.b = obj;
        this.c = null;
    }

    public fp4(s96 s96Var, j0j j0jVar) {
        this.a = 13;
        s96Var.getClass();
        j0jVar.getClass();
        this.b = s96Var;
        this.c = j0jVar;
    }

    public /* synthetic */ fp4(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public fp4(s sVar) {
        this.a = 25;
        this.b = sVar;
        this.c = new CopyOnWriteArrayList();
    }

    public fp4(String str) {
        this.a = 19;
        this.b = str.concat(".lck");
    }

    public fp4(Context context) {
        this.a = 1;
        this.b = context;
        this.c = new f7a(21);
    }

    public fp4(ge6 ge6Var) {
        this.a = 14;
        ie6 ie6Var = (ie6) ge6Var.e;
        this.b = new ee6(ge6Var, ie6Var.i().i(), -1L, true);
        this.c = new fe6(ge6Var, ie6Var.i().getSource(), -1L, true);
    }

    public fp4(Animator animator) {
        this.a = 24;
        this.b = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.c = animatorSet;
        animatorSet.play(animator);
    }

    public fp4(EditText editText) {
        this.a = 9;
        this.b = editText;
        vl5 vl5Var = new vl5(editText);
        this.c = vl5Var;
        editText.addTextChangedListener(vl5Var);
        if (il5.b == null) {
            synchronized (il5.a) {
                try {
                    if (il5.b == null) {
                        il5 il5Var = new il5();
                        try {
                            il5.c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, il5.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        il5.b = il5Var;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(il5.b);
    }

    public fp4(ru4 ru4Var) {
        this.a = 2;
        this.c = ru4Var;
    }

    public fp4(ExtendedFloatingActionButton extendedFloatingActionButton, t9d t9dVar) {
        this.a = 16;
        this.c = extendedFloatingActionButton;
        this.b = t9dVar;
    }

    public fp4(ep4 ep4Var) {
        this.a = 0;
        this.b = ep4Var;
        this.c = new AtomicBoolean(false);
    }

    public fp4(String str, String str2) {
        this.a = 6;
        this.b = null;
        this.c = str;
    }
}
