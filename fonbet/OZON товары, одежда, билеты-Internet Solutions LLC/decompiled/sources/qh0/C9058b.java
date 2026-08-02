package qh0;

import R2.InterfaceC3917k;
import Sc.s;
import W2.f;
import com.google.protobuf.DescriptorProtos$FileOptions;
import com.squareup.moshi.JsonAdapter;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.I;
import ru.ozon.push.sdk.external.service.RemoteMessage;
import xe.M;

@e(c = "ru.ozon.push.sdk.internal.deduplication.DeduplicationHelper$isDuplicate$1", f = "DeduplicationHelper.kt", l = {DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER}, m = "invokeSuspend")
/* renamed from: qh0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C9058b extends j implements Function2<M, d<? super Boolean>, Object> {

    /* renamed from: d, reason: collision with root package name */
    I f82107d;

    /* renamed from: e, reason: collision with root package name */
    int f82108e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C9057a f82109f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ RemoteMessage f82110g;

    @e(c = "ru.ozon.push.sdk.internal.deduplication.DeduplicationHelper$isDuplicate$1$1", f = "DeduplicationHelper.kt", l = {}, m = "invokeSuspend")
    /* renamed from: qh0.b$a */
    static final class a extends j implements Function2<W2.b, d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f82111d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C9057a f82112e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ I f82113f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f82114g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f82115h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C9057a c9057a, I i11, String str, long j11, d<? super a> dVar) {
            super(2, dVar);
            this.f82112e = c9057a;
            this.f82113f = i11;
            this.f82114g = str;
            this.f82115h = j11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            a aVar = new a(this.f82112e, this.f82113f, this.f82114g, this.f82115h, dVar);
            aVar.f82111d = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(W2.b bVar, d<? super Unit> dVar) {
            return ((a) create(bVar, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Map c11;
            f.a aVar;
            long j11;
            f.a aVar2;
            C9057a c9057a = this.f82112e;
            Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            W2.b bVar = (W2.b) this.f82111d;
            try {
                JsonAdapter d11 = C9057a.d(c9057a);
                aVar2 = C9057a.f82100e;
                String str = (String) bVar.c(aVar2);
                if (str == null) {
                    str = "";
                }
                c11 = (Map) d11.fromJson(str);
                if (c11 == null) {
                    c11 = U.c();
                }
            } catch (Throwable unused) {
                c11 = U.c();
            }
            aVar = C9057a.f82100e;
            JsonAdapter d12 = C9057a.d(c9057a);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = c11.entrySet().iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                long j12 = this.f82115h;
                if (!hasNext) {
                    Long l11 = new Long(j12);
                    String str2 = this.f82114g;
                    bVar.i(aVar, d12.toJson(U.n(linkedHashMap, new Pair(str2, l11))));
                    this.f82113f.f71783a = c11.containsKey(str2);
                    return Unit.f71690a;
                }
                Map.Entry entry = (Map.Entry) it.next();
                long longValue = j12 - ((Number) entry.getValue()).longValue();
                j11 = c9057a.f82105d;
                if (longValue < j11) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9058b(C9057a c9057a, RemoteMessage remoteMessage, d<? super C9058b> dVar) {
        super(2, dVar);
        this.f82109f = c9057a;
        this.f82110g = remoteMessage;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new C9058b(this.f82109f, this.f82110g, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Boolean> dVar) {
        return ((C9058b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC3917k interfaceC3917k;
        I i11;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i12 = this.f82108e;
        if (i12 == 0) {
            s.b(obj);
            RemoteMessage remoteMessage = this.f82110g;
            int i13 = C9057a.f82101f;
            C9057a c9057a = this.f82109f;
            c9057a.getClass();
            String str = remoteMessage.b().get("first_message_id");
            if (str == null) {
                return Boolean.FALSE;
            }
            long currentTimeMillis = System.currentTimeMillis();
            I i14 = new I();
            interfaceC3917k = c9057a.f82102a;
            a aVar2 = new a(this.f82109f, i14, str, currentTimeMillis, null);
            this.f82107d = i14;
            this.f82108e = 1;
            if (W2.j.a(interfaceC3917k, aVar2, this) == aVar) {
                return aVar;
            }
            i11 = i14;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i11 = this.f82107d;
            s.b(obj);
        }
        return Boolean.valueOf(i11.f71783a);
    }
}
