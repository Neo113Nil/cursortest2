package q5;

import Sc.s;
import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import l5.InterfaceC7874c;
import org.jetbrains.annotations.NotNull;
import q5.i;
import v5.AbstractC10235i;
import v5.C10234h;
import v5.C10236j;
import w5.C10435g;

/* loaded from: classes8.dex */
public final class k implements i.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C10234h f81703a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ArrayList f81704b;

    /* renamed from: c, reason: collision with root package name */
    private final int f81705c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C10234h f81706d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C10435g f81707e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC7874c f81708f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f81709g;

    public k(@NotNull C10234h c10234h, @NotNull ArrayList arrayList, int i11, @NotNull C10234h c10234h2, @NotNull C10435g c10435g, @NotNull InterfaceC7874c interfaceC7874c, boolean z11) {
        this.f81703a = c10234h;
        this.f81704b = arrayList;
        this.f81705c = i11;
        this.f81706d = c10234h2;
        this.f81707e = c10435g;
        this.f81708f = interfaceC7874c;
        this.f81709g = z11;
    }

    private final void a(C10234h c10234h, i iVar) {
        Context l11 = c10234h.l();
        C10234h c10234h2 = this.f81703a;
        if (l11 != c10234h2.l()) {
            throw new IllegalStateException(("Interceptor '" + iVar + "' cannot modify the request's context.").toString());
        }
        if (c10234h.m() == C10236j.f102246a) {
            throw new IllegalStateException(("Interceptor '" + iVar + "' cannot set the request's data to null.").toString());
        }
        if (c10234h.M() != c10234h2.M()) {
            throw new IllegalStateException(("Interceptor '" + iVar + "' cannot modify the request's target.").toString());
        }
        if (c10234h.z() != c10234h2.z()) {
            throw new IllegalStateException(("Interceptor '" + iVar + "' cannot modify the request's lifecycle.").toString());
        }
        if (c10234h.K() == c10234h2.K()) {
            return;
        }
        throw new IllegalStateException(("Interceptor '" + iVar + "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.").toString());
    }

    @NotNull
    public final InterfaceC7874c b() {
        return this.f81708f;
    }

    @NotNull
    public final C10435g c() {
        return this.f81707e;
    }

    public final boolean d() {
        return this.f81709g;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(@NotNull C10234h c10234h, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        j jVar;
        int i11;
        k kVar;
        i iVar;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i12 = jVar.f81702h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                jVar.f81702h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = jVar.f81700f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = jVar.f81702h;
                if (i11 != 0) {
                    s.b(obj);
                    ArrayList arrayList = this.f81704b;
                    int i13 = this.f81705c;
                    if (i13 > 0) {
                        a(c10234h, (i) arrayList.get(i13 - 1));
                    }
                    i iVar2 = (i) arrayList.get(i13);
                    k kVar2 = new k(this.f81703a, arrayList, i13 + 1, c10234h, this.f81707e, this.f81708f, this.f81709g);
                    jVar.f81698d = this;
                    jVar.f81699e = iVar2;
                    jVar.f81702h = 1;
                    obj = iVar2.a(kVar2, jVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                    kVar = this;
                    iVar = iVar2;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    iVar = jVar.f81699e;
                    kVar = jVar.f81698d;
                    s.b(obj);
                }
                AbstractC10235i abstractC10235i = (AbstractC10235i) obj;
                kVar.a(abstractC10235i.b(), iVar);
                return abstractC10235i;
            }
        }
        jVar = new j(this, cVar);
        Object obj2 = jVar.f81700f;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = jVar.f81702h;
        if (i11 != 0) {
        }
        AbstractC10235i abstractC10235i2 = (AbstractC10235i) obj2;
        kVar.a(abstractC10235i2.b(), iVar);
        return abstractC10235i2;
    }

    @Override // q5.i.a
    @NotNull
    public final C10234h getRequest() {
        return this.f81706d;
    }
}
