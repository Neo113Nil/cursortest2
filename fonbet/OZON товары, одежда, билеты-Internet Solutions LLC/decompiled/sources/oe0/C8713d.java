package oe0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import te0.C9867b;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.common.locationcontroller.locationProvider.FusedSubscribeLocationUpdates$monitorProvidersBroadcast$1", f = "FusedSubscribeLocationUpdates.kt", l = {318}, m = "invokeSuspend")
/* renamed from: oe0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C8713d extends kotlin.coroutines.jvm.internal.j implements Function2<ze.u<? super List<? extends String>>, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f78146d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f78147e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Context f78148f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C8711b f78149g;

    /* renamed from: oe0.d$a */
    static final class a extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f78150b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f78151c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f78152d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, b bVar, List<String> list) {
            super(0);
            this.f78150b = context;
            this.f78151c = bVar;
            this.f78152d = list;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f78150b.unregisterReceiver(this.f78151c);
            C9867b c9867b = C9867b.f99466a;
            C9867b.g("Unregister monitorProvidersBroadcast: " + this.f78152d, null, 6);
            return Unit.f71690a;
        }
    }

    /* renamed from: oe0.d$b */
    public static final class b extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C8711b f78153a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ze.u<List<String>> f78154b;

        /* JADX WARN: Multi-variable type inference failed */
        b(C8711b c8711b, ze.u<? super List<String>> uVar) {
            this.f78153a = c8711b;
            this.f78154b = uVar;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context c11, Intent intent) {
            L l11;
            Intrinsics.checkNotNullParameter(c11, "c");
            Intrinsics.checkNotNullParameter(intent, "intent");
            l11 = this.f78153a.f78137c;
            List<String> a11 = l11 != null ? l11.a() : kotlin.collections.K.f71697a;
            C9867b c9867b = C9867b.f99466a;
            C9867b.g("LocationManager.PROVIDERS_CHANGED_ACTION triggered, check new list of available providers: " + a11, null, 6);
            this.f78154b.b(a11);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C8713d(Context context, C8711b c8711b, kotlin.coroutines.d<? super C8713d> dVar) {
        super(2, dVar);
        this.f78148f = context;
        this.f78149g = c8711b;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        C8713d c8713d = new C8713d(this.f78148f, this.f78149g, dVar);
        c8713d.f78147e = obj;
        return c8713d;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ze.u<? super List<? extends String>> uVar, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C8713d) create(uVar, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        L l11;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f78146d;
        if (i11 == 0) {
            Sc.s.b(obj);
            ze.u uVar = (ze.u) this.f78147e;
            C8711b c8711b = this.f78149g;
            b bVar = new b(c8711b, uVar);
            IntentFilter intentFilter = new IntentFilter("android.location.PROVIDERS_CHANGED");
            Context context = this.f78148f;
            context.registerReceiver(bVar, intentFilter);
            l11 = c8711b.f78137c;
            List a11 = l11 != null ? l11.a() : kotlin.collections.K.f71697a;
            C9867b c9867b = C9867b.f99466a;
            C9867b.g("Init monitorProvidersBroadcast, check list of available providers: " + a11, null, 6);
            uVar.b(a11);
            a aVar2 = new a(context, bVar, a11);
            this.f78146d = 1;
            if (ze.s.a(uVar, aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        return Unit.f71690a;
    }
}
