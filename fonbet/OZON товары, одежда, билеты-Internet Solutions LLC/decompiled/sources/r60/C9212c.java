package r60;

import Sc.k;
import U50.j;
import U50.n;
import android.content.Context;
import b90.C5595b;
import com.squareup.moshi.Moshi;
import g30.InterfaceC6618a;
import h3.C6788a;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p60.C8865b;
import q60.AbstractC8994a;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.open.file.models.OpenFileRequest;
import xe.C10727i;
import xe.J;

/* renamed from: r60.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9212c extends V50.a<OpenFileRequest> implements n<AbstractC8994a.C1378a> {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Context f83190b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final U30.a f83191c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC6618a f83192d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C6788a f83193e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final Q90.c f83194f;

    /* renamed from: g, reason: collision with root package name */
    private final Function1<OpenFileRequest, Unit> f83195g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final String f83196h;

    /* renamed from: i, reason: collision with root package name */
    private j f83197i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final Object f83198j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final C9211b f83199k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9212c(@NotNull Context context, @NotNull U30.a fintechFileManager, @NotNull InterfaceC6618a fintechAnalyticInteractor, @NotNull C6788a scope, @NotNull Q90.c featureToggles, Function1 function1, @NotNull Moshi moshi) {
        super(moshi);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fintechFileManager, "fintechFileManager");
        Intrinsics.checkNotNullParameter(fintechAnalyticInteractor, "fintechAnalyticInteractor");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(featureToggles, "featureToggles");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.f83190b = context;
        this.f83191c = fintechFileManager;
        this.f83192d = fintechAnalyticInteractor;
        this.f83193e = scope;
        this.f83194f = featureToggles;
        this.f83195g = function1;
        this.f83196h = "file";
        this.f83198j = k.a(Sc.n.PUBLICATION, new C5595b(this, 2));
        this.f83199k = new C9211b(J.f105405n0, this);
    }

    public static C8865b e(C9212c c9212c) {
        return new C8865b(c9212c.f83190b, c9212c.f83192d, c9212c.f83191c, c9212c.f83194f);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Sc.j, java.lang.Object] */
    public static final C8865b h(C9212c c9212c) {
        return (C8865b) c9212c.f83198j.getValue();
    }

    @Override // U50.n
    public final void a(AbstractC8994a.C1378a c1378a) {
        AbstractC8994a.C1378a result = c1378a;
        Intrinsics.checkNotNullParameter(result, "result");
        C10727i.c(this.f83193e, this.f83199k, null, new C9210a(this, result, null), 2);
    }

    @Override // V50.a
    @NotNull
    public final Class<OpenFileRequest> b() {
        return OpenFileRequest.class;
    }

    @Override // V50.a
    public final void d(WeakReference weakReference, Object obj, j callback) {
        OpenFileRequest value = (OpenFileRequest) obj;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f83197i = callback;
        Function1<OpenFileRequest, Unit> function1 = this.f83195g;
        if (function1 != null) {
            function1.invoke(value);
        }
    }

    @Override // U50.c
    @NotNull
    public final String getInterfaceName() {
        return this.f83196h;
    }
}
