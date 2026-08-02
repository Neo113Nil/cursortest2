package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class s9 extends h {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f5240c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f5241d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i4 f5242e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s9(i4 i4Var, boolean z5, boolean z7) {
        super("log");
        this.f5242e = i4Var;
        this.f5240c = z5;
        this.f5241d = z7;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0092  */
    @Override // com.google.android.gms.internal.measurement.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final n j(com.google.firebase.messaging.x xVar, List list) {
        int i5;
        int i10;
        ci.c.g0("log", list, 1);
        int size = list.size();
        r rVar = n.S;
        i4 i4Var = this.f5242e;
        if (size == 1) {
            ((r7.a) i4Var.f5085d).k(3, ((t) xVar.f6183b).c(xVar, (n) list.get(0)).h(), Collections.EMPTY_LIST, this.f5240c, this.f5241d);
            return rVar;
        }
        n nVar = (n) list.get(0);
        t tVar = (t) xVar.f6183b;
        t tVar2 = (t) xVar.f6183b;
        int l02 = ci.c.l0(tVar.c(xVar, nVar).d().doubleValue());
        if (l02 != 2) {
            i5 = 3;
            if (l02 == 3) {
                i10 = 1;
            } else if (l02 == 5) {
                i10 = 5;
            } else if (l02 == 6) {
                i10 = 2;
            }
            String h10 = tVar2.c(xVar, (n) list.get(1)).h();
            if (list.size() != 2) {
                ((r7.a) i4Var.f5085d).k(i10, h10, Collections.EMPTY_LIST, this.f5240c, this.f5241d);
                return rVar;
            }
            ArrayList arrayList = new ArrayList();
            for (int i11 = 2; i11 < Math.min(list.size(), 5); i11++) {
                arrayList.add(tVar2.c(xVar, (n) list.get(i11)).h());
            }
            ((r7.a) i4Var.f5085d).k(i10, h10, arrayList, this.f5240c, this.f5241d);
            return rVar;
        }
        i5 = 4;
        i10 = i5;
        String h102 = tVar2.c(xVar, (n) list.get(1)).h();
        if (list.size() != 2) {
        }
    }
}
