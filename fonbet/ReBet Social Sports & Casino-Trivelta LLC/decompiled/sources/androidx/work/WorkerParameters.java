package androidx.work;

import Q2.D;
import Q2.InterfaceC1499j;
import Q2.O;
import android.net.Network;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class WorkerParameters {

    /* renamed from: a, reason: collision with root package name */
    public UUID f23714a;

    /* renamed from: b, reason: collision with root package name */
    public b f23715b;

    /* renamed from: c, reason: collision with root package name */
    public Set f23716c;

    /* renamed from: d, reason: collision with root package name */
    public a f23717d;

    /* renamed from: e, reason: collision with root package name */
    public int f23718e;

    /* renamed from: f, reason: collision with root package name */
    public Executor f23719f;

    /* renamed from: g, reason: collision with root package name */
    public CoroutineContext f23720g;

    /* renamed from: h, reason: collision with root package name */
    public Z2.b f23721h;

    /* renamed from: i, reason: collision with root package name */
    public O f23722i;

    /* renamed from: j, reason: collision with root package name */
    public D f23723j;

    /* renamed from: k, reason: collision with root package name */
    public InterfaceC1499j f23724k;

    /* renamed from: l, reason: collision with root package name */
    public int f23725l;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public List f23726a;

        /* renamed from: b, reason: collision with root package name */
        public List f23727b;

        /* renamed from: c, reason: collision with root package name */
        public Network f23728c;

        public a() {
            List list = Collections.EMPTY_LIST;
            this.f23726a = list;
            this.f23727b = list;
        }
    }

    public WorkerParameters(UUID uuid, b bVar, Collection collection, a aVar, int i10, int i11, Executor executor, CoroutineContext coroutineContext, Z2.b bVar2, O o10, D d10, InterfaceC1499j interfaceC1499j) {
        this.f23714a = uuid;
        this.f23715b = bVar;
        this.f23716c = new HashSet(collection);
        this.f23717d = aVar;
        this.f23718e = i10;
        this.f23725l = i11;
        this.f23719f = executor;
        this.f23720g = coroutineContext;
        this.f23721h = bVar2;
        this.f23722i = o10;
        this.f23723j = d10;
        this.f23724k = interfaceC1499j;
    }

    public Executor a() {
        return this.f23719f;
    }

    public InterfaceC1499j b() {
        return this.f23724k;
    }

    public UUID c() {
        return this.f23714a;
    }

    public b d() {
        return this.f23715b;
    }

    public Network e() {
        return this.f23717d.f23728c;
    }

    public D f() {
        return this.f23723j;
    }

    public int g() {
        return this.f23718e;
    }

    public Set h() {
        return this.f23716c;
    }

    public Z2.b i() {
        return this.f23721h;
    }

    public List j() {
        return this.f23717d.f23726a;
    }

    public List k() {
        return this.f23717d.f23727b;
    }

    public CoroutineContext l() {
        return this.f23720g;
    }

    public O m() {
        return this.f23722i;
    }
}
