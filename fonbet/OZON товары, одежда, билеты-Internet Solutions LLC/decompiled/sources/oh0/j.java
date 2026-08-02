package oh0;

import Sc.s;
import Yg0.a;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.LinearLayoutManager;
import ch.C5832c;
import ch.InterfaceC5830a;
import com.google.protobuf.DescriptorProtos$FileOptions;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10727i;
import xe.M;

/* loaded from: classes7.dex */
public final class j implements DefaultLifecycleObserver {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Yg0.a f78356a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final d f78357b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final c f78358c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f78359d;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.push.sdk.internal.channel.NotificationChannelStatusObserver$onResume$1", f = "NotificationChannelStatusObserver.kt", l = {DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f78360d;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return j.this.new a(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f78360d;
            if (i11 == 0) {
                s.b(obj);
                this.f78360d = 1;
                if (j.a(j.this, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    public j(@NotNull Yg0.a ozonPush, @NotNull d notificationAvailabilityChecker, @NotNull c notificationAvailabilityCacheRepository) {
        Intrinsics.checkNotNullParameter(ozonPush, "ozonPush");
        Intrinsics.checkNotNullParameter(notificationAvailabilityChecker, "notificationAvailabilityChecker");
        Intrinsics.checkNotNullParameter(notificationAvailabilityCacheRepository, "notificationAvailabilityCacheRepository");
        this.f78356a = ozonPush;
        this.f78357b = notificationAvailabilityChecker;
        this.f78358c = notificationAvailabilityCacheRepository;
        this.f78359d = notificationAvailabilityChecker.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(j jVar, kotlin.coroutines.jvm.internal.c cVar) {
        g gVar;
        int i11;
        int intValue;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i12 = gVar.f78351g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                gVar.f78351g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = gVar.f78349e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = gVar.f78351g;
                if (i11 != 0) {
                    s.b(obj);
                    InterfaceC5830a j11 = jVar.f78356a.j();
                    gVar.f78348d = jVar;
                    gVar.f78351g = 1;
                    obj = C5832c.a(j11, gVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jVar = gVar.f78348d;
                    s.b(obj);
                }
                intValue = ((Number) obj).intValue();
                if (jVar.f78358c.b() != intValue) {
                    jh0.c cVar2 = jh0.c.NOTIFICATIONS_STATE_CHANGED;
                    Yg0.a aVar2 = jVar.f78356a;
                    a.C0652a c0652a = Yg0.a.f35038y;
                    CompletableFuture<Unit> B11 = aVar2.B(cVar2, true);
                    final h hVar = new h(jVar, intValue);
                    B11.thenApply(new Function() { // from class: oh0.e
                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            return (Unit) Function1.this.invoke(obj2);
                        }
                    });
                }
                return Unit.f71690a;
            }
        }
        gVar = new g(jVar, cVar);
        Object obj2 = gVar.f78349e;
        Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
        i11 = gVar.f78351g;
        if (i11 != 0) {
        }
        intValue = ((Number) obj2).intValue();
        if (jVar.f78358c.b() != intValue) {
        }
        return Unit.f71690a;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        boolean a11 = this.f78357b.a();
        if (this.f78359d != a11) {
            jh0.c cVar = jh0.c.NOTIFICATIONS_STATE_CHANGED;
            Yg0.a aVar = this.f78356a;
            a.C0652a c0652a = Yg0.a.f35038y;
            CompletableFuture<Unit> B11 = aVar.B(cVar, true);
            final i iVar = new i(this, a11);
            B11.thenApply(new Function() { // from class: oh0.f
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return (Unit) Function1.this.invoke(obj);
                }
            });
        }
        C10727i.c(K.a(owner), null, null, new a(null), 3);
    }
}
