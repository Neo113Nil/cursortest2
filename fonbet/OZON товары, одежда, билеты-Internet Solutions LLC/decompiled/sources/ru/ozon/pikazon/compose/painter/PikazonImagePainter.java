package ru.ozon.pikazon.compose.painter;

import Ae.C0;
import Ae.C2399j;
import Ae.C2408n0;
import Ae.E0;
import Ae.InterfaceC2395h;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import B1.InterfaceC2547p;
import Kk.C3532b;
import S0.C3991w0;
import S0.D1;
import S0.V0;
import S0.n1;
import Sc.s;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import androidx.compose.ui.graphics.painter.ColorPainter;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.accompanist.drawablepainter.DrawablePainter;
import k1.C7464j;
import k1.C7465k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7809a0;
import l1.C7811b0;
import l1.C7848y;
import n1.C8408a;
import n1.InterfaceC8412e;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;
import q1.C8971a;
import ru.ozon.app.android.pikazon.Pikazon;
import ru.ozon.app.android.pikazon.image.ImageSize;
import ru.ozon.app.android.pikazon.request.PikazonRequest;
import ru.ozon.app.android.pikazon.request.PikazonRequestBuilder;
import ru.ozon.app.android.pikazon.request.target.CustomTarget;
import ru.ozon.app.android.pikazon.retry.OnConnectionRestored;
import ru.ozon.app.android.pikazon.retry.domain.OnConnectionRestoredExtKt;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;
import xe.H0;
import xe.M;
import ze.EnumC11113a;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/pikazon/compose/painter/PikazonImagePainter;", "Lq1/b;", "LS0/V0;", "State", "pikazon-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PikazonImagePainter extends AbstractC8972b implements V0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f97636a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C0 f97637b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C3991w0 f97638c;

    /* renamed from: d, reason: collision with root package name */
    private float f97639d;

    /* renamed from: e, reason: collision with root package name */
    private C7809a0 f97640e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private PikazonRequest<Drawable> f97641f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final x0<State> f97642g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final M0<State> f97643h;

    /* renamed from: i, reason: collision with root package name */
    private int f97644i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f97645j;

    /* renamed from: k, reason: collision with root package name */
    private B0 f97646k;

    /* renamed from: l, reason: collision with root package name */
    public M f97647l;

    /* renamed from: m, reason: collision with root package name */
    private Function1<? super State, Unit> f97648m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private InterfaceC2547p f97649n;

    public interface State {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/pikazon/compose/painter/PikazonImagePainter$State$Cleared;", "Lru/ozon/pikazon/compose/painter/PikazonImagePainter$State;", "Lq1/b;", "painter", "Lq1/b;", "a", "()Lq1/b;", "pikazon-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final /* data */ class Cleared implements State {
            private final AbstractC8972b painter;

            public Cleared(AbstractC8972b abstractC8972b) {
                this.painter = abstractC8972b;
            }

            @Override // ru.ozon.pikazon.compose.painter.PikazonImagePainter.State
            /* renamed from: a, reason: from getter */
            public final AbstractC8972b getPainter() {
                return this.painter;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Cleared) && Intrinsics.d(this.painter, ((Cleared) obj).painter);
            }

            public final int hashCode() {
                AbstractC8972b abstractC8972b = this.painter;
                if (abstractC8972b == null) {
                    return 0;
                }
                return abstractC8972b.hashCode();
            }

            @NotNull
            public final String toString() {
                return "Cleared(painter=" + this.painter + ")";
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\n\u0018\u00002\u00020\u0001R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/pikazon/compose/painter/PikazonImagePainter$State$Empty;", "Lru/ozon/pikazon/compose/painter/PikazonImagePainter$State;", "Lq1/b;", "painter", "Lq1/b;", "a", "()Lq1/b;", "pikazon-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Empty implements State {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final Empty f97650a = new Empty();
            private static final AbstractC8972b painter = null;

            @Override // ru.ozon.pikazon.compose.painter.PikazonImagePainter.State
            /* renamed from: a */
            public final AbstractC8972b getPainter() {
                return painter;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Empty);
            }

            public final int hashCode() {
                return -1292518592;
            }

            @NotNull
            public final String toString() {
                return "Empty";
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/pikazon/compose/painter/PikazonImagePainter$State$Error;", "Lru/ozon/pikazon/compose/painter/PikazonImagePainter$State;", "Lq1/b;", "painter", "Lq1/b;", "a", "()Lq1/b;", "pikazon-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final /* data */ class Error implements State {
            private final AbstractC8972b painter;

            public Error(AbstractC8972b abstractC8972b) {
                this.painter = abstractC8972b;
            }

            @Override // ru.ozon.pikazon.compose.painter.PikazonImagePainter.State
            /* renamed from: a, reason: from getter */
            public final AbstractC8972b getPainter() {
                return this.painter;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && Intrinsics.d(this.painter, ((Error) obj).painter);
            }

            public final int hashCode() {
                AbstractC8972b abstractC8972b = this.painter;
                if (abstractC8972b == null) {
                    return 0;
                }
                return abstractC8972b.hashCode();
            }

            @NotNull
            public final String toString() {
                return "Error(painter=" + this.painter + ")";
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/pikazon/compose/painter/PikazonImagePainter$State$Fail;", "Lru/ozon/pikazon/compose/painter/PikazonImagePainter$State;", "Lq1/b;", "painter", "Lq1/b;", "a", "()Lq1/b;", "pikazon-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Fail implements State {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            private final CustomTarget.Result.Fail f97651a;
            private final AbstractC8972b painter;

            public Fail(@NotNull CustomTarget.Result.Fail result) {
                Intrinsics.checkNotNullParameter(result, "result");
                this.f97651a = result;
            }

            @Override // ru.ozon.pikazon.compose.painter.PikazonImagePainter.State
            /* renamed from: a, reason: from getter */
            public final AbstractC8972b getPainter() {
                return this.painter;
            }

            @NotNull
            /* renamed from: b, reason: from getter */
            public final CustomTarget.Result.Fail getF97651a() {
                return this.f97651a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Fail) && Intrinsics.d(this.f97651a, ((Fail) obj).f97651a);
            }

            public final int hashCode() {
                return this.f97651a.hashCode();
            }

            @NotNull
            public final String toString() {
                return "Fail(result=" + this.f97651a + ")";
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/pikazon/compose/painter/PikazonImagePainter$State$Loading;", "Lru/ozon/pikazon/compose/painter/PikazonImagePainter$State;", "Lq1/b;", "painter", "Lq1/b;", "a", "()Lq1/b;", "pikazon-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Loading implements State {
            private final AbstractC8972b painter;

            public Loading(AbstractC8972b abstractC8972b) {
                this.painter = abstractC8972b;
            }

            @Override // ru.ozon.pikazon.compose.painter.PikazonImagePainter.State
            /* renamed from: a, reason: from getter */
            public final AbstractC8972b getPainter() {
                return this.painter;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Loading) && Intrinsics.d(this.painter, ((Loading) obj).painter);
            }

            public final int hashCode() {
                AbstractC8972b abstractC8972b = this.painter;
                if (abstractC8972b == null) {
                    return 0;
                }
                return abstractC8972b.hashCode();
            }

            @NotNull
            public final String toString() {
                return "Loading(painter=" + this.painter + ")";
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/pikazon/compose/painter/PikazonImagePainter$State$Success;", "Lru/ozon/pikazon/compose/painter/PikazonImagePainter$State;", "Lq1/b;", "painter", "Lq1/b;", "a", "()Lq1/b;", "pikazon-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Success implements State {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            private final CustomTarget.Result.Success<Drawable> f97652a;

            @NotNull
            private final AbstractC8972b painter;

            public Success(@NotNull AbstractC8972b painter, @NotNull CustomTarget.Result.Success<Drawable> result) {
                Intrinsics.checkNotNullParameter(painter, "painter");
                Intrinsics.checkNotNullParameter(result, "result");
                this.painter = painter;
                this.f97652a = result;
            }

            @Override // ru.ozon.pikazon.compose.painter.PikazonImagePainter.State
            @NotNull
            /* renamed from: a, reason: from getter */
            public final AbstractC8972b getPainter() {
                return this.painter;
            }

            @NotNull
            public final CustomTarget.Result.Success<Drawable> b() {
                return this.f97652a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Success)) {
                    return false;
                }
                Success success = (Success) obj;
                return Intrinsics.d(this.painter, success.painter) && Intrinsics.d(this.f97652a, success.f97652a);
            }

            public final int hashCode() {
                return this.f97652a.hashCode() + (this.painter.hashCode() * 31);
            }

            @NotNull
            public final String toString() {
                return "Success(painter=" + this.painter + ", result=" + this.f97652a + ")";
            }
        }

        /* renamed from: a */
        AbstractC8972b getPainter();
    }

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f97653a;

        static {
            int[] iArr = new int[CustomTarget.Result.Placeholder.Type.values().length];
            try {
                iArr[CustomTarget.Result.Placeholder.Type.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CustomTarget.Result.Placeholder.Type.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CustomTarget.Result.Placeholder.Type.CLEARED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f97653a = iArr;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.pikazon.compose.painter.PikazonImagePainter$launchRequest$1", f = "PikazonImagePainter.kt", l = {247}, m = "invokeSuspend")
    static final class b extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f97654d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ PikazonRequest<Drawable> f97656f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f97657g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(PikazonRequest<Drawable> pikazonRequest, int i11, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f97656f = pikazonRequest;
            this.f97657g = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return PikazonImagePainter.this.new b(this.f97656f, this.f97657g, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f97654d;
            if (i11 == 0) {
                s.b(obj);
                this.f97654d = 1;
                if (PikazonImagePainter.a(PikazonImagePainter.this, this.f97656f, this.f97657g, this) == aVar) {
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

    public PikazonImagePainter(@NotNull Context context, @NotNull PikazonRequest<Drawable> request) {
        C3991w0 f7;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(request, "request");
        this.f97636a = context;
        this.f97637b = E0.b(1, 0, EnumC11113a.DROP_OLDEST, 2);
        f7 = n1.f(null, D1.f25195a);
        this.f97638c = f7;
        this.f97639d = 1.0f;
        this.f97641f = request;
        x0<State> a11 = O0.a(State.Empty.f97650a);
        this.f97642g = a11;
        this.f97643h = C2399j.b(a11);
        this.f97649n = InterfaceC2547p.a.d();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00f0, code lost:
    
        if (r4.collect(r8, r0) == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(PikazonImagePainter pikazonImagePainter, PikazonRequest pikazonRequest, int i11, kotlin.coroutines.jvm.internal.c cVar) {
        ru.ozon.pikazon.compose.painter.a aVar;
        int i12;
        PikazonRequestBuilder newBuilder;
        PikazonImagePainter pikazonImagePainter2;
        Object obj;
        PikazonRequestBuilder pikazonRequestBuilder;
        PikazonImagePainter pikazonImagePainter3;
        OnConnectionRestored onConnectionRestored;
        ConnectivityManager connectivityManager;
        pikazonImagePainter.getClass();
        if (cVar instanceof ru.ozon.pikazon.compose.painter.a) {
            aVar = (ru.ozon.pikazon.compose.painter.a) cVar;
            int i13 = aVar.f97665k;
            if ((i13 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                aVar.f97665k = i13 - LinearLayoutManager.INVALID_OFFSET;
                Object obj2 = aVar.f97663i;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i12 = aVar.f97665k;
                if (i12 != 0) {
                    s.b(obj2);
                    newBuilder = pikazonRequest.newBuilder();
                    if (pikazonRequest.getSize() == null) {
                        aVar.f97658d = pikazonImagePainter;
                        aVar.f97659e = newBuilder;
                        aVar.f97660f = newBuilder;
                        aVar.f97661g = pikazonImagePainter;
                        aVar.f97662h = i11;
                        aVar.f97665k = 1;
                        Object u11 = C2399j.u(new Bg0.b(pikazonImagePainter.f97637b), aVar);
                        if (u11 != aVar2) {
                            obj = u11;
                            pikazonRequestBuilder = newBuilder;
                            pikazonImagePainter3 = pikazonImagePainter;
                        }
                        return aVar2;
                    }
                    pikazonImagePainter2 = pikazonImagePainter;
                    Intrinsics.checkNotNullParameter(newBuilder, "<this>");
                    InterfaceC2395h aVar3 = new Bg0.a(C2399j.e(new g(newBuilder, null)), pikazonImagePainter2);
                    pikazonImagePainter.getClass();
                    onConnectionRestored = Pikazon.INSTANCE.getInstance().getOnConnectionRestored();
                    if ((onConnectionRestored instanceof OnConnectionRestored.Retry) && OnConnectionRestoredExtKt.canRetry((OnConnectionRestored.Retry) onConnectionRestored, i11)) {
                        Context applicationContext = pikazonImagePainter.f97636a.getApplicationContext();
                        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                        Intrinsics.checkNotNullParameter(applicationContext, "<this>");
                        connectivityManager = (ConnectivityManager) androidx.core.content.a.getSystemService(applicationContext.getApplicationContext(), ConnectivityManager.class);
                        if (connectivityManager != null) {
                            aVar3 = new C2408n0(aVar3, new d(rj.b.f83580f.a(connectivityManager), pikazonImagePainter, null));
                        }
                    }
                    ru.ozon.pikazon.compose.painter.b bVar = new ru.ozon.pikazon.compose.painter.b(pikazonImagePainter2);
                    aVar.f97658d = null;
                    aVar.f97659e = null;
                    aVar.f97660f = null;
                    aVar.f97661g = null;
                    aVar.f97665k = 2;
                } else {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj2);
                        return Unit.f71690a;
                    }
                    i11 = aVar.f97662h;
                    PikazonImagePainter pikazonImagePainter4 = aVar.f97661g;
                    PikazonRequestBuilder pikazonRequestBuilder2 = aVar.f97660f;
                    PikazonRequestBuilder pikazonRequestBuilder3 = aVar.f97659e;
                    PikazonImagePainter pikazonImagePainter5 = aVar.f97658d;
                    s.b(obj2);
                    pikazonImagePainter3 = pikazonImagePainter4;
                    pikazonImagePainter = pikazonImagePainter5;
                    pikazonRequestBuilder = pikazonRequestBuilder3;
                    obj = obj2;
                    newBuilder = pikazonRequestBuilder2;
                }
                newBuilder.size((ImageSize) obj);
                PikazonImagePainter pikazonImagePainter6 = pikazonImagePainter3;
                pikazonImagePainter2 = pikazonImagePainter;
                pikazonImagePainter = pikazonImagePainter6;
                newBuilder = pikazonRequestBuilder;
                Intrinsics.checkNotNullParameter(newBuilder, "<this>");
                InterfaceC2395h aVar32 = new Bg0.a(C2399j.e(new g(newBuilder, null)), pikazonImagePainter2);
                pikazonImagePainter.getClass();
                onConnectionRestored = Pikazon.INSTANCE.getInstance().getOnConnectionRestored();
                if (onConnectionRestored instanceof OnConnectionRestored.Retry) {
                    Context applicationContext2 = pikazonImagePainter.f97636a.getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
                    Intrinsics.checkNotNullParameter(applicationContext2, "<this>");
                    connectivityManager = (ConnectivityManager) androidx.core.content.a.getSystemService(applicationContext2.getApplicationContext(), ConnectivityManager.class);
                    if (connectivityManager != null) {
                    }
                }
                ru.ozon.pikazon.compose.painter.b bVar2 = new ru.ozon.pikazon.compose.painter.b(pikazonImagePainter2);
                aVar.f97658d = null;
                aVar.f97659e = null;
                aVar.f97660f = null;
                aVar.f97661g = null;
                aVar.f97665k = 2;
            }
        }
        aVar = new ru.ozon.pikazon.compose.painter.a(pikazonImagePainter, cVar);
        Object obj22 = aVar.f97663i;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i12 = aVar.f97665k;
        if (i12 != 0) {
        }
        newBuilder.size((ImageSize) obj);
        PikazonImagePainter pikazonImagePainter62 = pikazonImagePainter3;
        pikazonImagePainter2 = pikazonImagePainter;
        pikazonImagePainter = pikazonImagePainter62;
        newBuilder = pikazonRequestBuilder;
        Intrinsics.checkNotNullParameter(newBuilder, "<this>");
        InterfaceC2395h aVar322 = new Bg0.a(C2399j.e(new g(newBuilder, null)), pikazonImagePainter2);
        pikazonImagePainter.getClass();
        onConnectionRestored = Pikazon.INSTANCE.getInstance().getOnConnectionRestored();
        if (onConnectionRestored instanceof OnConnectionRestored.Retry) {
        }
        ru.ozon.pikazon.compose.painter.b bVar22 = new ru.ozon.pikazon.compose.painter.b(pikazonImagePainter2);
        aVar.f97658d = null;
        aVar.f97659e = null;
        aVar.f97660f = null;
        aVar.f97661g = null;
        aVar.f97665k = 2;
    }

    public static final /* synthetic */ Unit c(PikazonImagePainter pikazonImagePainter, State state) {
        pikazonImagePainter.n(state);
        return Unit.f71690a;
    }

    public static final AbstractC8972b f(PikazonImagePainter pikazonImagePainter, Drawable drawable) {
        pikazonImagePainter.getClass();
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            Intrinsics.checkNotNullExpressionValue(bitmap, "getBitmap(...)");
            return C8971a.a(new C7848y(bitmap), 1);
        }
        if (drawable instanceof ColorDrawable) {
            return new ColorPainter(C7811b0.b(((ColorDrawable) drawable).getColor()));
        }
        Drawable mutate = drawable.mutate();
        Intrinsics.checkNotNullExpressionValue(mutate, "mutate(...)");
        return new DrawablePainter(mutate);
    }

    private final void h(InterfaceC8412e interfaceC8412e, AbstractC8972b abstractC8972b, float f7) {
        float f11 = C7464j.f(abstractC8972b.getF40457d()) * f7;
        float d11 = C7464j.d(abstractC8972b.getF40457d()) * f7;
        float f12 = (C7464j.f(interfaceC8412e.i()) - f11) / 2.0f;
        float d12 = (C7464j.d(interfaceC8412e.i()) - d11) / 2.0f;
        C8408a.b w02 = interfaceC8412e.w0();
        long e11 = w02.e();
        w02.a().save();
        try {
            w02.f().g(f12, d12);
            abstractC8972b.m444drawx_KDEd0(interfaceC8412e, C7465k.a(f11, d11), this.f97639d, this.f97640e);
        } finally {
            C3532b.b(w02, e11);
        }
    }

    private final void i(int i11) {
        PikazonRequest<Drawable> pikazonRequest = this.f97641f;
        M m11 = this.f97647l;
        if (m11 == null) {
            Intrinsics.n("scope");
            throw null;
        }
        C10720e0 c10720e0 = C10720e0.f105451a;
        B0 c11 = C10727i.c(m11, De.s.f6650a.x(), null, new b(pikazonRequest, i11, null), 2);
        B0 b02 = this.f97646k;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
        this.f97646k = c11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(State state) {
        AbstractC8972b crossfadePainter;
        Function1<? super State, Unit> function1;
        x0<State> x0Var = this.f97642g;
        State value = x0Var.getValue();
        x0Var.setValue(state);
        boolean z11 = state instanceof State.Success;
        if ((z11 || (state instanceof State.Fail)) && z11) {
            State.Success success = (State.Success) state;
            if (success.b().getDataSource() == T5.a.REMOTE && success.b().getWithCrossFade()) {
                AbstractC8972b painter = value.getPainter();
                if (!(value instanceof State.Loading)) {
                    painter = null;
                }
                crossfadePainter = new CrossfadePainter(painter, ((State.Success) state).getPainter(), this.f97649n, !(state instanceof State.Fail));
                if (crossfadePainter == null) {
                    crossfadePainter = state.getPainter();
                }
                this.f97638c.setValue(crossfadePainter);
                if (value.getPainter() != state.getPainter()) {
                    Object painter2 = value.getPainter();
                    V0 v02 = painter2 instanceof V0 ? (V0) painter2 : null;
                    if (v02 != null) {
                        v02.e();
                    }
                    Object painter3 = state.getPainter();
                    V0 v03 = painter3 instanceof V0 ? (V0) painter3 : null;
                    if (v03 != null) {
                        v03.b();
                    }
                }
                function1 = this.f97648m;
                if (function1 == null) {
                    function1.invoke(state);
                    return;
                }
                return;
            }
        }
        crossfadePainter = null;
        if (crossfadePainter == null) {
        }
        this.f97638c.setValue(crossfadePainter);
        if (value.getPainter() != state.getPainter()) {
        }
        function1 = this.f97648m;
        if (function1 == null) {
        }
    }

    @Override // q1.AbstractC8972b
    protected final boolean applyAlpha(float f7) {
        this.f97639d = f7;
        return true;
    }

    @Override // q1.AbstractC8972b
    protected final boolean applyColorFilter(C7809a0 c7809a0) {
        this.f97640e = c7809a0;
        return true;
    }

    @Override // S0.V0
    public final void b() {
        Object obj = (AbstractC8972b) this.f97638c.getValue();
        V0 v02 = obj instanceof V0 ? (V0) obj : null;
        if (v02 != null) {
            v02.b();
        }
        if (Pikazon.INSTANCE.getInstance().getIsInTestMode()) {
            this.f97641f.newBuilder().target(new CustomTarget(new c(this))).build().load();
        } else {
            i(this.f97644i);
            this.f97645j = true;
        }
    }

    @Override // S0.V0
    public final void d() {
        B0 b02 = this.f97646k;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
        this.f97646k = null;
        Object obj = (AbstractC8972b) this.f97638c.getValue();
        V0 v02 = obj instanceof V0 ? (V0) obj : null;
        if (v02 != null) {
            v02.d();
        }
        this.f97645j = false;
        this.f97644i = 0;
    }

    @Override // S0.V0
    public final void e() {
        B0 b02 = this.f97646k;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
        this.f97646k = null;
        Object obj = (AbstractC8972b) this.f97638c.getValue();
        V0 v02 = obj instanceof V0 ? (V0) obj : null;
        if (v02 != null) {
            v02.e();
        }
        this.f97645j = false;
        this.f97644i = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // q1.AbstractC8972b
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public final long getF40457d() {
        AbstractC8972b abstractC8972b = (AbstractC8972b) this.f97638c.getValue();
        if (abstractC8972b == null) {
            return 9205357640488583168L;
        }
        C7464j a11 = C7464j.a(abstractC8972b.getF40457d());
        if (!Pikazon.INSTANCE.getInstance().isComposeIntrinsicSizeEnabled()) {
            a11 = null;
        }
        if (a11 != null) {
            return a11.i();
        }
        return 9205357640488583168L;
    }

    public final void j() {
        if (this.f97645j) {
            int i11 = this.f97644i + 1;
            this.f97644i = i11;
            i(i11);
        }
    }

    public final void k(@NotNull InterfaceC2547p interfaceC2547p) {
        Intrinsics.checkNotNullParameter(interfaceC2547p, "<set-?>");
        this.f97649n = interfaceC2547p;
    }

    public final void l(Function1<? super State, Unit> function1) {
        this.f97648m = function1;
    }

    public final void m(@NotNull PikazonRequest<Drawable> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (Intrinsics.d(this.f97641f, value)) {
            return;
        }
        this.f97641f = value;
        j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // q1.AbstractC8972b
    protected final void onDraw(@NotNull InterfaceC8412e interfaceC8412e) {
        Intrinsics.checkNotNullParameter(interfaceC8412e, "<this>");
        this.f97637b.tryEmit(C7464j.a(interfaceC8412e.i()));
        AbstractC8972b abstractC8972b = (AbstractC8972b) this.f97638c.getValue();
        if (abstractC8972b != null) {
            if (Pikazon.INSTANCE.getInstance().isComposeIntrinsicSizeEnabled()) {
                abstractC8972b.m444drawx_KDEd0(interfaceC8412e, interfaceC8412e.i(), this.f97639d, this.f97640e);
            } else if (Intrinsics.d(this.f97649n, InterfaceC2547p.a.d())) {
                h(interfaceC8412e, abstractC8972b, Math.min(C7464j.f(interfaceC8412e.i()) / C7464j.f(abstractC8972b.getF40457d()), C7464j.d(interfaceC8412e.i()) / C7464j.d(abstractC8972b.getF40457d())));
            } else {
                h(interfaceC8412e, abstractC8972b, Math.max(C7464j.f(interfaceC8412e.i()) / C7464j.f(abstractC8972b.getF40457d()), C7464j.d(interfaceC8412e.i()) / C7464j.d(abstractC8972b.getF40457d())));
            }
        }
    }
}
