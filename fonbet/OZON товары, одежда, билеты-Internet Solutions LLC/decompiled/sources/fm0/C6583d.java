package fm0;

import R2.InterfaceC3917k;
import Sc.s;
import W2.f;
import W2.i;
import Yl0.m;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: fm0.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C6583d implements InterfaceC6586g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final InterfaceC3917k<W2.f> f63636a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final f.a<String> f63637b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final f.a<Boolean> f63638c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final f.a<String> f63639d;

    @kotlin.coroutines.jvm.internal.e(c = "ru.rustore.sdk.pushclient.internal.push.storage.DataStorePushStorage$saveLastDeliveredToClientToken$2", f = "DataStorePushStorage.kt", l = {}, m = "invokeSuspend")
    /* renamed from: fm0.d$a */
    /* loaded from: classes4.dex */
    public static final class a extends j implements Function2<W2.b, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f63640d;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f63642f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f63642f = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = C6583d.this.new a(this.f63642f, dVar);
            aVar.f63640d = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(W2.b bVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(bVar, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            ((W2.b) this.f63640d).i(C6583d.this.f63639d, this.f63642f);
            return Unit.f71690a;
        }
    }

    public C6583d(@NotNull InterfaceC3917k<W2.f> dataStore) {
        Intrinsics.checkNotNullParameter(dataStore, "dataStore");
        this.f63636a = dataStore;
        this.f63637b = i.c("push_token");
        this.f63638c = i.a("push_token_delivered_to_client_app");
        this.f63639d = i.c("last_delivered_push_token");
    }

    @Override // fm0.InterfaceC6586g
    public final Object a(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        return Eb.g.c(this.f63636a, this.f63637b, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // fm0.InterfaceC6586g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        C6581b c6581b;
        int i11;
        String value;
        if (cVar instanceof C6581b) {
            c6581b = (C6581b) cVar;
            int i12 = c6581b.f63632f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c6581b.f63632f = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c6581b.f63630d;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c6581b.f63632f;
                if (i11 != 0) {
                    s.b(obj);
                    c6581b.f63632f = 1;
                    obj = Eb.g.c(this.f63636a, this.f63637b, c6581b);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                value = (String) obj;
                if (value == null) {
                    value = "";
                }
                Intrinsics.checkNotNullParameter(value, "value");
                return value;
            }
        }
        c6581b = new C6581b(this, cVar);
        Object obj2 = c6581b.f63630d;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c6581b.f63632f;
        if (i11 != 0) {
        }
        value = (String) obj2;
        if (value == null) {
        }
        Intrinsics.checkNotNullParameter(value, "value");
        return value;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // fm0.InterfaceC6586g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        C6582c c6582c;
        int i11;
        if (cVar instanceof C6582c) {
            c6582c = (C6582c) cVar;
            int i12 = c6582c.f63635f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c6582c.f63635f = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c6582c.f63633d;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c6582c.f63635f;
                if (i11 != 0) {
                    s.b(obj);
                    c6582c.f63635f = 1;
                    obj = Eb.g.c(this.f63636a, this.f63638c, c6582c);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                Boolean bool = (Boolean) obj;
                return Boolean.valueOf(bool == null ? bool.booleanValue() : false);
            }
        }
        c6582c = new C6582c(this, cVar);
        Object obj2 = c6582c.f63633d;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c6582c.f63635f;
        if (i11 != 0) {
        }
        Boolean bool2 = (Boolean) obj2;
        return Boolean.valueOf(bool2 == null ? bool2.booleanValue() : false);
    }

    @Override // fm0.InterfaceC6586g
    public final Object d(@NotNull m mVar) {
        Object a11 = W2.j.a(this.f63636a, new C6585f(this, null), mVar);
        return a11 == Wc.a.COROUTINE_SUSPENDED ? a11 : Unit.f71690a;
    }

    @Override // fm0.InterfaceC6586g
    public final Object e(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        Object a11 = W2.j.a(this.f63636a, new C6580a(), cVar);
        return a11 == Wc.a.COROUTINE_SUSPENDED ? a11 : Unit.f71690a;
    }

    @Override // fm0.InterfaceC6586g
    public final Object f(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        return Eb.g.c(this.f63636a, this.f63639d, cVar);
    }

    @Override // fm0.InterfaceC6586g
    public final Object g(@NotNull String str, @NotNull El0.c cVar) {
        Object a11 = W2.j.a(this.f63636a, new C6584e(this, str, null), cVar);
        return a11 == Wc.a.COROUTINE_SUSPENDED ? a11 : Unit.f71690a;
    }

    @Override // fm0.InterfaceC6586g
    public final Object a(@NotNull String str, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object a11 = W2.j.a(this.f63636a, new a(str, null), dVar);
        return a11 == Wc.a.COROUTINE_SUSPENDED ? a11 : Unit.f71690a;
    }
}
