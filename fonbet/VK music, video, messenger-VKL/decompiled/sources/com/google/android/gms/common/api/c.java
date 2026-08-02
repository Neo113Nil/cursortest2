package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import xsna.ehz;
import xsna.exc0;
import xsna.i380;
import xsna.knz0;
import xsna.nlz0;
import xsna.olc;
import xsna.pkz0;
import xsna.qdg0;
import xsna.snz0;
import xsna.tdj;
import xsna.vpz0;
import xsna.x2o0;
import xsna.x3j;
import xsna.xlj0;
import xsna.ylj0;
import xsna.yoz0;
import xsna.zk3;
import xsna.zr;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
@Deprecated
/* loaded from: classes.dex */
public abstract class c {
    public static final Set b = Collections.newSetFromMap(new WeakHashMap());

    /* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
    @Deprecated
    public static final class a {
        public final String c;
        public final String d;
        public final Context f;
        public final Looper i;
        public final HashSet a = new HashSet();
        public final HashSet b = new HashSet();
        public final zk3 e = new zk3();
        public final zk3 g = new zk3();
        public final int h = -1;
        public final GoogleApiAvailability j = GoogleApiAvailability.getInstance();
        public final pkz0 k = snz0.a;
        public final ArrayList l = new ArrayList();
        public final ArrayList m = new ArrayList();

        public a(@NonNull Context context) {
            this.f = context;
            this.i = context.getMainLooper();
            this.c = context.getPackageName();
            this.d = context.getClass().getName();
        }

        @NonNull
        public final void a(@NonNull com.google.android.gms.common.api.a aVar) {
            exc0.j(aVar, "Api must not be null");
            this.g.put(aVar, null);
            a.AbstractC0111a abstractC0111a = aVar.a;
            exc0.j(abstractC0111a, "Base client builder must not be null");
            List<Scope> impliedScopes = abstractC0111a.getImpliedScopes(null);
            this.b.addAll(impliedScopes);
            this.a.addAll(impliedScopes);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NonNull
        public final nlz0 b() {
            zk3 zk3Var = this.g;
            exc0.a("must call addApi() to add at least one API", !zk3Var.isEmpty());
            ylj0 ylj0Var = ylj0.b;
            zk3 zk3Var2 = this.g;
            com.google.android.gms.common.api.a aVar = snz0.b;
            if (zk3Var2.containsKey(aVar)) {
                ylj0Var = (ylj0) zk3Var2.get(aVar);
            }
            olc olcVar = new olc(null, this.a, this.e, this.c, this.d, ylj0Var);
            Map map = olcVar.d;
            zk3 zk3Var3 = new zk3();
            zk3 zk3Var4 = new zk3();
            ArrayList arrayList = new ArrayList();
            Iterator it = ((zk3.c) zk3Var.keySet()).iterator();
            com.google.android.gms.common.api.a aVar2 = null;
            boolean z = false;
            while (it.hasNext()) {
                com.google.android.gms.common.api.a aVar3 = (com.google.android.gms.common.api.a) it.next();
                olc olcVar2 = olcVar;
                V v = zk3Var.get(aVar3);
                boolean z2 = map.get(aVar3) != null;
                zk3Var3.put(aVar3, Boolean.valueOf(z2));
                vpz0 vpz0Var = new vpz0(aVar3, z2);
                arrayList.add(vpz0Var);
                a.AbstractC0111a abstractC0111a = aVar3.a;
                exc0.i(abstractC0111a);
                a.f buildClient = abstractC0111a.buildClient(this.f, this.i, olcVar2, (olc) v, (b) vpz0Var, (InterfaceC0114c) vpz0Var);
                olcVar = olcVar2;
                zk3Var4.put(aVar3.b, buildClient);
                if (abstractC0111a.getPriority() == 1) {
                    z = v != 0;
                }
                if (buildClient.providesSignIn()) {
                    if (aVar2 != null) {
                        String str = aVar3.c;
                        String str2 = aVar2.c;
                        throw new IllegalStateException(tdj.a(new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length()), str, " cannot be used with ", str2));
                    }
                    aVar2 = aVar3;
                }
            }
            if (aVar2 != null) {
                if (z) {
                    String str3 = aVar2.c;
                    throw new IllegalStateException(tdj.a(new StringBuilder(String.valueOf(str3).length() + 82), "With using ", str3, ", GamesOptions can only be specified within GoogleSignInOptions.Builder"));
                }
                boolean equals = this.a.equals(this.b);
                String str4 = aVar2.c;
                if (!equals) {
                    throw new IllegalStateException(zr.a("Must not set scopes in GoogleApiClient.Builder when using ", str4, ". Set account in GoogleSignInOptions.Builder instead."));
                }
            }
            nlz0 nlz0Var = new nlz0(this.f, new ReentrantLock(), this.i, olcVar, this.j, this.k, zk3Var3, this.l, this.m, zk3Var4, this.h, nlz0.q(zk3Var4.values(), true), arrayList);
            Set set = c.b;
            synchronized (set) {
                set.add(nlz0Var);
            }
            if (this.h >= 0) {
                yoz0.e().f(this.h, nlz0Var);
            }
            return nlz0Var;
        }
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
    @Deprecated
    public interface b extends x3j {
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
    @Deprecated
    /* renamed from: com.google.android.gms.common.api.c$c, reason: collision with other inner class name */
    public interface InterfaceC0114c extends i380 {
    }

    @NonNull
    public <A extends a.b, R extends qdg0, T extends com.google.android.gms.common.api.internal.a<R, A>> T a(@NonNull T t) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    public <A extends a.b, T extends com.google.android.gms.common.api.internal.a<? extends qdg0, A>> T b(@NonNull T t) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    public a.f c(@NonNull a.g gVar) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    public Looper d() {
        throw new UnsupportedOperationException();
    }

    public boolean f(@NonNull xlj0 xlj0Var) {
        throw new UnsupportedOperationException();
    }

    public void h() {
        throw new UnsupportedOperationException();
    }

    @NonNull
    public ehz i(@NonNull x2o0.a aVar) {
        throw new UnsupportedOperationException();
    }

    public void j(knz0 knz0Var) {
        throw new UnsupportedOperationException();
    }

    public void k(knz0 knz0Var) {
        throw new UnsupportedOperationException();
    }
}
