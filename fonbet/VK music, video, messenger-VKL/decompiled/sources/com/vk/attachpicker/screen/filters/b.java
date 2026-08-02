package com.vk.attachpicker.screen.filters;

import android.content.Context;
import android.graphics.Bitmap;
import com.vk.attachpicker.screen.filters.LocalExtendedLutsDataSource;
import com.vk.photo.editor.domain.LowMemoryException;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.core.w;
import io.reactivex.rxjava3.processors.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.ba00;
import xsna.e43;
import xsna.hvf0;
import xsna.izs;
import xsna.j5g;
import xsna.n3p;
import xsna.pn00;
import xsna.qpj;
import xsna.rbq;
import xsna.s3q0;
import xsna.sf;
import xsna.v900;
import xsna.w900;
import xsna.wmi0;
import xsna.x900;
import xsna.xq3;
import xsna.y900;

/* compiled from: ExtendedLutsProvider.kt */
/* loaded from: classes15.dex */
public final class b implements ba00 {
    public a a;
    public final io.reactivex.rxjava3.disposables.b b = new io.reactivex.rxjava3.disposables.b();
    public final w c = io.reactivex.rxjava3.schedulers.a.c();
    public ba00.a d;
    public Object e;
    public List<? extends y900> f;
    public final HashMap<Integer, Integer> g;
    public final Object h;
    public final hvf0 i;
    public final LocalExtendedLutsDataSource j;

    public b() {
        EmptyList emptyList = EmptyList.b;
        this.e = emptyList;
        this.f = emptyList;
        this.g = new HashMap<>();
        this.h = new Object();
        this.i = new hvf0();
        this.j = new LocalExtendedLutsDataSource();
    }

    public static ArrayList e(Context context) {
        v900 v900Var = new v900(-10000001, context.getString(R.string.lut_title_default), true, new x900.b(e43.m(n3p.c(context.getResources(), R.drawable.lut_default))));
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Map.Entry entry : pn00.k(new Pair(Integer.valueOf(R.drawable.lut_contrast), Integer.valueOf(R.string.editor_lut_contrast)), new Pair(Integer.valueOf(R.drawable.lut_soft), Integer.valueOf(R.string.lut_title_soft)), new Pair(Integer.valueOf(R.drawable.lut_bright), Integer.valueOf(R.string.editor_lut_bright)), new Pair(Integer.valueOf(R.drawable.lut_dark), Integer.valueOf(R.string.lut_title_dark)), new Pair(Integer.valueOf(R.drawable.lut_warm), Integer.valueOf(R.string.lut_title_warm)), new Pair(Integer.valueOf(R.drawable.lut_cold), Integer.valueOf(R.string.lut_title_cold)), new Pair(Integer.valueOf(R.drawable.lut_bwcold), Integer.valueOf(R.string.editor_lut_bw_cold))).entrySet()) {
            Bitmap c = n3p.c(context.getResources(), ((Number) entry.getKey()).intValue());
            if (c != null) {
                arrayList.add(new v900(i - 10000000, context.getString(((Number) entry.getValue()).intValue()), false, new x900.b(Collections.singletonList(c))));
                i++;
            }
        }
        return j5g.u0(arrayList, Collections.singletonList(v900Var));
    }

    public static int f(y900 y900Var) {
        if (y900Var instanceof v900) {
            return ((v900) y900Var).c;
        }
        if (y900Var instanceof w900) {
            return ((v900) j5g.Y(((w900) y900Var).f)).c;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static List i(int i, List list, izs izsVar) {
        int i2;
        Object obj;
        Iterator it = list.iterator();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i2 = -1;
            if (!it.hasNext()) {
                i4 = -1;
                break;
            }
            y900 y900Var = (y900) it.next();
            if (y900Var.a() == i && (y900Var instanceof v900)) {
                break;
            }
            i4++;
        }
        if (i4 != -1) {
            v900 v900Var = (v900) izsVar.invoke((v900) list.get(i4));
            ArrayList arrayList = new ArrayList(list);
            arrayList.set(i4, v900Var);
            return arrayList;
        }
        Iterator it2 = list.iterator();
        int i5 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i5 = -1;
                break;
            }
            y900 y900Var2 = (y900) it2.next();
            if (y900Var2 instanceof w900) {
                Iterator<T> it3 = ((w900) y900Var2).f.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it3.next();
                    if (((v900) obj).c == i) {
                        break;
                    }
                }
                if (obj != null) {
                    break;
                }
            }
            i5++;
        }
        if (i5 == -1) {
            return list;
        }
        w900 w900Var = (w900) list.get(i5);
        List<v900> list2 = w900Var.f;
        Iterator<v900> it4 = list2.iterator();
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            if (it4.next().c == i) {
                i2 = i3;
                break;
            }
            i3++;
        }
        v900 v900Var2 = (v900) izsVar.invoke(list2.get(i2));
        ArrayList arrayList2 = new ArrayList(list2);
        arrayList2.set(i2, v900Var2);
        w900 w900Var2 = new w900(w900Var.c, w900Var.d, w900Var.e, arrayList2);
        ArrayList arrayList3 = new ArrayList(list);
        arrayList3.set(i5, w900Var2);
        return arrayList3;
    }

    @Override // xsna.ba00
    public final void a(y900 y900Var) {
        a aVar = this.a;
        if (aVar != null) {
            aVar.a(y900Var.a());
        }
    }

    @Override // xsna.ba00
    public final void b(Context context, ba00.a aVar) {
        LocalExtendedLutsDataSource localExtendedLutsDataSource = this.j;
        try {
            this.d = aVar;
            ArrayList e = e(context);
            this.e = e;
            aVar.a(e);
            aVar.b();
            localExtendedLutsDataSource.getClass();
            rbq a = LocalExtendedLutsDataSource.a();
            if (a != null) {
                g(a);
            }
            rbq a2 = this.i.a();
            if (a2 != null) {
                g(a2);
                wmi0.a.m("photo_editor_luts_cache", Collections.singletonList(new LocalExtendedLutsDataSource.DataWrapper(a2)));
            }
            aVar.c();
        } catch (LowMemoryException e2) {
            aVar.d(e2);
        }
    }

    @Override // xsna.ba00
    public final void c(y900 y900Var) {
        int f = f(y900Var);
        synchronized (this.h) {
            try {
                this.g.put(Integer.valueOf(y900Var.a()), Integer.valueOf((this.g.get(Integer.valueOf(f)) != null ? r0.intValue() : 0) - 1));
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // xsna.ba00
    public final void d(y900 y900Var) {
        a aVar = this.a;
        if (aVar != null) {
            aVar.a(y900Var.a());
        }
        int f = f(y900Var);
        synchronized (this.h) {
            try {
                HashMap<Integer, Integer> hashMap = this.g;
                Integer valueOf = Integer.valueOf(f);
                Integer num = this.g.get(Integer.valueOf(f));
                hashMap.put(valueOf, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(rbq rbqVar) {
        a aVar;
        c cVar;
        ArrayList arrayList = rbqVar.a;
        this.f = arrayList;
        ArrayList u0 = j5g.u0(arrayList, (Collection) this.e);
        ba00.a aVar2 = this.d;
        if (aVar2 != null) {
            aVar2.a(u0);
        }
        ba00.a aVar3 = this.d;
        if (aVar3 != null) {
            aVar3.c();
        }
        a aVar4 = this.a;
        if (aVar4 != null) {
            aVar4.f.dispose();
        }
        this.a = new a();
        this.b.e();
        a aVar5 = this.a;
        this.b.b((aVar5 == null || (cVar = aVar5.b) == null) ? null : cVar.j(this.c).subscribe(new sf(new qpj(this, 10), 24)));
        a aVar6 = this.a;
        if (aVar6 != null) {
            List<? extends y900> list = this.f;
            aVar6.c.putAll(rbqVar.b);
            for (y900 y900Var : list) {
                if (y900Var instanceof v900) {
                    aVar6.a(((v900) y900Var).c);
                } else {
                    if (!(y900Var instanceof w900)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar6.a(((w900) y900Var).f.get(0).c);
                }
                s3q0 s3q0Var = s3q0.a;
            }
        }
        synchronized (this.h) {
            try {
                for (Map.Entry<Integer, Integer> entry : this.g.entrySet()) {
                    int intValue = entry.getKey().intValue();
                    if (entry.getValue().intValue() > 0 && (aVar = this.a) != null) {
                        aVar.a(intValue);
                    }
                }
                s3q0 s3q0Var2 = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h() {
        this.c.c(new xq3(this, 6));
    }
}
