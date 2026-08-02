package com.vk.ml;

import com.vk.api.generated.account.dto.AccountModelDto;
import com.vk.api.generated.account.dto.AccountModelKeyDto;
import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import com.vk.log.L;
import com.vk.ml.MLFeatures;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import io.reactivex.rxjava3.internal.operators.observable.j1;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.EmptyList;
import xsna.aq1;
import xsna.br;
import xsna.brm0;
import xsna.c8;
import xsna.cr;
import xsna.dkg;
import xsna.dnz;
import xsna.dug0;
import xsna.e8r;
import xsna.epx;
import xsna.es;
import xsna.fo20;
import xsna.fs00;
import xsna.go9;
import xsna.hzg0;
import xsna.i5g;
import xsna.izs;
import xsna.j330;
import xsna.j8;
import xsna.jh;
import xsna.jtv;
import xsna.k73;
import xsna.kl6;
import xsna.l400;
import xsna.l8w;
import xsna.lhg;
import xsna.n330;
import xsna.nm3;
import xsna.o25;
import xsna.o330;
import xsna.ogd;
import xsna.or20;
import xsna.p330;
import xsna.pjp;
import xsna.pq;
import xsna.q330;
import xsna.qq;
import xsna.r330;
import xsna.rli0;
import xsna.rp;
import xsna.rsg0;
import xsna.s3q0;
import xsna.s7;
import xsna.shy;
import xsna.st0;
import xsna.t330;
import xsna.tfx;
import xsna.uf20;
import xsna.ulp0;
import xsna.ulz;
import xsna.v330;
import xsna.vu5;
import xsna.x8m;
import xsna.xb20;
import xsna.xpt;
import xsna.yfb;
import xsna.ysg0;
import xsna.zb00;
import xsna.zr;

/* compiled from: ModelsManager.kt */
/* loaded from: classes3.dex */
public final class b {
    public final LinkedList<AccountModelDto> a = new LinkedList<>();
    public final File b;
    public volatile boolean c;
    public volatile j330 d;
    public final ConcurrentHashMap<MLFeatures.MLFeature, ReentrantLock> e;
    public final AtomicInteger f;
    public final es g;

    /* compiled from: ModelsManager.kt */
    public static final class a {
        public final AccountModelDto a;
        public final int b;
        public final int c;

        public a(AccountModelDto accountModelDto, int i, int i2) {
            this.a = accountModelDto;
            this.b = i;
            this.c = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + shy.a(this.b, this.a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("QueueItem(dto=");
            sb.append(this.a);
            sb.append(", downloadType=");
            sb.append(this.b);
            sb.append(", syncIteration=");
            return vu5.b(sb, this.c, ')');
        }
    }

    public b() {
        PrivateFiles.a b;
        b = e8r.a.b(r1, PrivateSubdir.ML_MODELS.h(), true);
        this.b = b.a;
        this.e = new ConcurrentHashMap<>();
        this.f = new AtomicInteger(0);
        this.g = new es();
    }

    public static String c(String str) {
        return zr.a("ml_", str, "_key");
    }

    public static boolean g(zb00 zb00Var) {
        String str;
        if (zb00Var == null || (str = zb00Var.b) == null) {
            str = "";
        }
        return com.vk.core.files.a.y(str);
    }

    public final q<String> a(String str, File file, String str2, MLFeatures.MLFeature mLFeature, int i) {
        return (str == null || str.length() == 0) ? q.T("") : new i0(dug0.a(file, str).U(new uf20(new jtv(this, i), 1)), new c8(new ulz(4), 20)).U(new nm3(new t330(this, mLFeature, i, str2, str), 21));
    }

    public final void b(LinkedList<a> linkedList, List<AccountModelKeyDto> list, int i, izs<? super Throwable, s3q0> izsVar) {
        File file;
        j1 U;
        Object obj;
        StringBuilder sb = new StringBuilder("downloading: ");
        String str = null;
        sb.append(rli0.r(new ulp0(new i5g(linkedList), new fo20(1)), StringUtils.COMMA, null, 62));
        L.e("ModelsManager", sb.toString());
        a pollFirst = linkedList.pollFirst();
        if (pollFirst == null) {
            return;
        }
        if (pollFirst.c > i) {
            linkedList.addFirst(pollFirst);
            return;
        }
        a aVar = pollFirst;
        do {
            int i2 = aVar.c;
            if (i2 >= i) {
                if (i != i2) {
                    L.l("ModelsManager", "conflicting iterations");
                }
                q330 q330Var = new q330(this, linkedList, list, i, izsVar);
                AccountModelDto accountModelDto = aVar.a;
                int i3 = aVar.b;
                int i4 = aVar.c;
                String g = accountModelDto.g();
                MLFeatures.MLFeature a2 = rp.a(accountModelDto);
                File file2 = this.b;
                File file3 = new File(file2, g + "-model-" + i4 + ".tmp");
                File file4 = new File(file2, g + "-meta-" + i4 + ".tmp");
                L.e("ModelsManager", go9.b("download ", g));
                if (accountModelDto.d()) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        } else {
                            obj = it.next();
                            if (epx.f(((AccountModelKeyDto) obj).e(), accountModelDto.g())) {
                                break;
                            }
                        }
                    }
                    AccountModelKeyDto accountModelKeyDto = (AccountModelKeyDto) obj;
                    if (accountModelKeyDto != null) {
                        str = accountModelKeyDto.d();
                    }
                }
                String str2 = str;
                if (i3 == 0) {
                    file = file4;
                    U = q.I0(a(accountModelDto.getUrl(), file3, str2, a2, i4), a(accountModelDto.e(), file, null, a2, i4), new k73(22)).U(new or20(new aq1(13, this, accountModelDto), 1));
                } else if (i3 == 1) {
                    file = file4;
                    q<String> a3 = a(accountModelDto.getUrl(), file3, str2, a2, i4);
                    r330 r330Var = new r330(this, a2, g, accountModelDto, 0);
                    a2 = a2;
                    U = a3.U(new s7(r330Var, 20));
                } else {
                    if (i3 != 2) {
                        throw new IllegalArgumentException(lhg.a(i3, "Wrong download type: "));
                    }
                    file = file4;
                    U = a(accountModelDto.e(), file4, null, a2, i4).U(new xb20(new ogd(this, g, accountModelDto, 2), 1));
                }
                U.D(new l8w(new c(a2), 5)).subscribe(new fs00(new d(a2, q330Var), 2), new st0(new l400(1, file, izsVar, file3, q330Var), 27));
                return;
            }
            aVar = linkedList.pollFirst();
        } while (aVar != null);
    }

    public final zb00 d(MLFeatures.MLFeature mLFeature) {
        j330 j330Var = this.d;
        if (j330Var != null) {
            return j330Var.b(mLFeature.name());
        }
        return null;
    }

    public final io.reactivex.rxjava3.internal.operators.observable.a e(ArrayList arrayList, boolean z) {
        es esVar = this.g;
        if (z) {
            esVar.getClass();
            tfx tfxVar = new tfx("account.getModelsNoAuth", new jh(1), new qq(0));
            tfx.l(tfxVar, "version", 1, 0, 0, 12);
            return rsg0.T(yfb.x(tfxVar)).U(new dnz(new dkg(arrayList, 29), 2));
        }
        esVar.getClass();
        tfx tfxVar2 = new tfx("account.getModels", new pq(0), new j8(1));
        tfxVar2.e = "no-cache";
        tfxVar2.i("names", arrayList);
        tfx.l(tfxVar2, "version", 1, 0, 0, 12);
        return rsg0.T(yfb.x(tfxVar2));
    }

    public final boolean f() {
        return this.c && this.d != null;
    }

    public final boolean h(MLFeatures.MLFeature mLFeature) {
        zb00 d = d(mLFeature);
        if (d == null) {
            return false;
        }
        if (!d.f) {
            return true;
        }
        String c = c(new File(d.b).getName());
        hzg0 hzg0Var = pjp.a;
        return pjp.a(c) != null;
    }

    public final void i(MLFeatures.MLFeature mLFeature) {
        ConcurrentHashMap<MLFeatures.MLFeature, ReentrantLock> concurrentHashMap = this.e;
        if (concurrentHashMap.get(mLFeature) == null) {
            concurrentHashMap.putIfAbsent(mLFeature, new ReentrantLock());
        }
        L.A("ModelsManager", "lockModel: gaining lock on " + mLFeature);
        ReentrantLock reentrantLock = null;
        while (reentrantLock == null) {
            reentrantLock = concurrentHashMap.get(mLFeature);
        }
        L.A("ModelsManager", "lockModel: gained lock on " + mLFeature);
        if (reentrantLock.isLocked()) {
            L.e("ModelsManager", "contention on " + mLFeature);
        }
        reentrantLock.lock();
    }

    public final void j(List list, int i, izs izsVar, ArrayList arrayList) {
        int i2;
        Object obj;
        ysg0.b.a(v330.a);
        j330 j330Var = this.d;
        Iterable d = j330Var != null ? j330Var.d(null, null) : EmptyList.b;
        LinkedList<a> linkedList = new LinkedList<>();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            AccountModelDto accountModelDto = (AccountModelDto) it.next();
            MLFeatures.MLFeature a2 = rp.a(accountModelDto);
            Iterator it2 = d.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it2.next();
                    if (brm0.w(((zb00) obj).a, accountModelDto.g(), true)) {
                        break;
                    }
                }
            }
            zb00 zb00Var = (zb00) obj;
            boolean z = g(zb00Var) && h(a2);
            int i3 = accountModelDto.i();
            Integer f = accountModelDto.f();
            int intValue = f != null ? f.intValue() : 0;
            int i4 = (!z || zb00Var == null) ? 0 : zb00Var.c;
            int i5 = zb00Var != null ? zb00Var.e : 0;
            i2 = (i3 == i4 || intValue == i5) ? i3 != i4 ? 1 : intValue != i5 ? 2 : -1 : 0;
            MLFeatures.MLFeature a3 = rp.a(accountModelDto);
            if (arrayList != null && arrayList.contains(a3)) {
                this.a.add(accountModelDto);
                L.e("ModelsManager", "onDemandLoadingModels " + a3);
            } else if (i2 >= 0) {
                linkedList.add(new a(accountModelDto, i2, i));
            }
            s3q0 s3q0Var = s3q0.a;
            if (i2 < 0) {
                ysg0.b.a(new e(a2));
            }
        }
        L.e("ModelsManager", "startDownloads downloadQueue size: " + linkedList.size());
        if (linkedList.isEmpty()) {
            return;
        }
        List A = rli0.A(new ulp0(rli0.j(new i5g(linkedList), new x8m(20)), new xpt(7)));
        if (A.isEmpty()) {
            b(linkedList, EmptyList.b, i, izsVar);
        } else if (o25.a().b()) {
            tfx tfxVar = new tfx("account.getModelKeys", new br(i2), new cr(i2));
            tfxVar.i("names", A);
            tfx.l(tfxVar, "version", 1, 0, 0, 12);
            rsg0.T(yfb.x(tfxVar)).subscribe(new o330(new n330(i, 0, this, linkedList, izsVar), i2), new kl6(new p330(this, linkedList, i, izsVar), 27));
        }
    }

    public final void k(MLFeatures.MLFeature mLFeature) {
        L.A("ModelsManager", "unlockModel: gaining lock on " + mLFeature);
        ReentrantLock reentrantLock = null;
        while (reentrantLock == null) {
            reentrantLock = this.e.get(mLFeature);
        }
        L.A("ModelsManager", "unlockModel: gained lock on " + mLFeature);
        if (reentrantLock.isLocked()) {
            reentrantLock.unlock();
            return;
        }
        L.e("ModelsManager", "unlockModel: no locks held on " + mLFeature);
    }
}
