package qh0;

import R2.InterfaceC3917k;
import Sc.InterfaceC4008j;
import Sc.k;
import W2.f;
import W2.i;
import com.squareup.moshi.E;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.util.Map;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.q;
import kotlin.reflect.s;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.push.sdk.external.service.RemoteMessage;
import xe.C10727i;

/* renamed from: qh0.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C9057a {

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private static final f.a<String> f82100e = i.c("deduplication_cache");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f82101f = 0;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC3917k<f> f82102a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Moshi f82103b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f82104c;

    /* renamed from: d, reason: collision with root package name */
    private final long f82105d;

    /* renamed from: qh0.a$a, reason: collision with other inner class name */
    private static final class C1393a {
    }

    /* renamed from: qh0.a$b */
    static final class b extends AbstractC7737t implements Function0<JsonAdapter<Map<String, ? extends Long>>> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final JsonAdapter<Map<String, ? extends Long>> invoke() {
            Moshi moshi = C9057a.this.f82103b;
            KTypeProjection.Companion companion = KTypeProjection.INSTANCE;
            q type = N.l(String.class);
            companion.getClass();
            Intrinsics.checkNotNullParameter(type, "type");
            s sVar = s.INVARIANT;
            KTypeProjection kTypeProjection = new KTypeProjection(sVar, type);
            q type2 = N.l(Long.TYPE);
            Intrinsics.checkNotNullParameter(type2, "type");
            return E.a(moshi, N.m(kTypeProjection, new KTypeProjection(sVar, type2)));
        }
    }

    public C9057a(@NotNull InterfaceC3917k<f> dataStore, @NotNull Moshi moshi, boolean z11) {
        Intrinsics.checkNotNullParameter(dataStore, "dataStore");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.f82102a = dataStore;
        this.f82103b = moshi;
        this.f82104c = k.b(new b());
        long j11 = 259200000;
        if (z11) {
            String c11 = Hg0.a.c("debug.ozon.push_dedup_window", null);
            Long y02 = c11 != null ? h.y0(c11) : null;
            if (y02 != null) {
                j11 = y02.longValue();
            }
        }
        this.f82105d = j11;
    }

    public static final JsonAdapter d(C9057a c9057a) {
        return (JsonAdapter) c9057a.f82104c.getValue();
    }

    public final C9059c f(@NotNull RemoteMessage push) {
        Intrinsics.checkNotNullParameter(push, "push");
        String str = push.b().get("first_message_id");
        if (str == null) {
            return null;
        }
        return new C9059c(str, ((Boolean) C10727i.d(g.f71771a, new C9058b(this, push, null))).booleanValue());
    }
}
