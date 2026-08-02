package s60;

import Sc.k;
import U50.j;
import U50.n;
import android.content.Context;
import com.squareup.moshi.Moshi;
import g30.InterfaceC6618a;
import h3.C6788a;
import java.lang.ref.WeakReference;
import k70.C7600a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p60.C8865b;
import q60.AbstractC8994a;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeResult;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;
import xe.C10727i;
import xe.J;

/* renamed from: s60.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9605c implements U50.a, n<AbstractC8994a.b> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f98222a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final U30.a f98223b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC6618a f98224c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C6788a f98225d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Q90.c f98226e;

    /* renamed from: f, reason: collision with root package name */
    private final Function0<Unit> f98227f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final Moshi f98228g;

    /* renamed from: h, reason: collision with root package name */
    private j f98229h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final Object f98230i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final C9604b f98231j;

    public C9605c(@NotNull Context context, @NotNull U30.a fintechFileManager, @NotNull InterfaceC6618a fintechAnalyticInteractor, @NotNull C6788a scope, @NotNull Q90.c featureToggles, Function0 function0, @NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fintechFileManager, "fintechFileManager");
        Intrinsics.checkNotNullParameter(fintechAnalyticInteractor, "fintechAnalyticInteractor");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(featureToggles, "featureToggles");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.f98222a = context;
        this.f98223b = fintechFileManager;
        this.f98224c = fintechAnalyticInteractor;
        this.f98225d = scope;
        this.f98226e = featureToggles;
        this.f98227f = function0;
        this.f98228g = moshi;
        this.f98230i = k.a(Sc.n.PUBLICATION, new C7600a(this, 2));
        this.f98231j = new C9604b(J.f105405n0, this);
    }

    public static C8865b b(C9605c c9605c) {
        return new C8865b(c9605c.f98222a, c9605c.f98224c, c9605c.f98223b, c9605c.f98226e);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Sc.j, java.lang.Object] */
    public static final C8865b e(C9605c c9605c) {
        return (C8865b) c9605c.f98230i.getValue();
    }

    @Override // U50.n
    public final void a(AbstractC8994a.b bVar) {
        AbstractC8994a.b result = bVar;
        Intrinsics.checkNotNullParameter(result, "result");
        C10727i.c(this.f98225d, this.f98231j, null, new C9603a(this, result, null), 2);
    }

    @Override // U50.c
    @NotNull
    public final String getInterfaceName() {
        return "gallery";
    }

    @Override // U50.a
    public final void handle(WeakReference<FintechWebView> weakReference, @NotNull String parameterJson, @NotNull Function1<? super NativeResult, Unit> callback) {
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f98229h = (j) callback;
        Function0<Unit> function0 = this.f98227f;
        if (function0 != null) {
            function0.invoke();
        }
    }
}
