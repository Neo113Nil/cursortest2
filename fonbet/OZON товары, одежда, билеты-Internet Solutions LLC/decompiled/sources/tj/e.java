package tj;

import Dc0.m;
import De.C2862e;
import De.s;
import Sc.k;
import Sc.n;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.appcompat.widget.SwitchCompat;
import androidx.fragment.app.ComponentCallbacksC5392m;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import vj.C10325b;
import xe.C10720e0;
import xe.C10727i;
import xe.N;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltj/e;", "Landroidx/fragment/app/m;", "<init>", "()V", "ozon-logger-android_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e extends ComponentCallbacksC5392m {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Object f99562a = k.a(n.NONE, a.f99564b);

    /* renamed from: b, reason: collision with root package name */
    private C2862e f99563b;

    static final class a extends AbstractC7737t implements Function0<sj.d> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f99564b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final sj.d invoke() {
            return sj.e.f98817f.q(new sj.a("DevX", "OzonLoggerDebug", null));
        }
    }

    public static void t(e eVar) {
        C2862e c2862e = eVar.f99563b;
        if (c2862e != null) {
            C10727i.c(c2862e, null, null, new C9880b(eVar, null), 3);
        }
    }

    public static void u(e eVar) {
        C2862e c2862e = eVar.f99563b;
        if (c2862e != null) {
            C10727i.c(c2862e, null, null, new c(eVar, null), 3);
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [Sc.j, java.lang.Object] */
    public static void v(e eVar, SwitchCompat switchCompat) {
        ((sj.d) eVar.f99562a.getValue()).f((ru.ozon.android.ozonLogger.core.c) C7714v.r0(ru.ozon.android.ozonLogger.core.c.a(), kotlin.random.c.INSTANCE), "Тестовое сообщение!", sj.f.b(new Pair("testField", "anything")), Boolean.valueOf(switchCompat.isChecked()));
    }

    public static void w(e eVar) {
        C2862e c2862e = eVar.f99563b;
        if (c2862e != null) {
            C10727i.c(c2862e, null, null, new d(eVar, null), 3);
        }
    }

    public static final void x(Context context, String str) {
        Toast.makeText(context, str, 0).show();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final View onCreateView(@NotNull LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R.layout.ozon_logger_android_debug_main_fragment, viewGroup, false);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onDestroyView() {
        super.onDestroyView();
        C2862e c2862e = this.f99563b;
        if (c2862e != null) {
            N.c(c2862e, null);
        }
        this.f99563b = null;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onViewCreated(@NotNull View view, Bundle bundle) {
        int i11 = 16;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        C10720e0 c10720e0 = C10720e0.f105451a;
        this.f99563b = N.a(s.f6650a.x());
        view.findViewById(R.id.backButton).setOnClickListener(new m(this, 19));
        SwitchCompat switchCompat = (SwitchCompat) view.findViewById(R.id.localLogsSwitch);
        view.findViewById(R.id.showLogsButton).setOnClickListener(new CG.c(this, i11));
        view.findViewById(R.id.createLogButton).setOnClickListener(new Lo.a(4, this, switchCompat));
        view.findViewById(R.id.shareLogsButton).setOnClickListener(new FG.a(this, 22));
        view.findViewById(R.id.clearLogsButton).setOnClickListener(new BC.a(this, i11));
        try {
            C10325b c10325b = C10325b.f103003h;
            if (c10325b == null) {
                throw new IllegalStateException("Error OzonHarLogger is not initialized, you need to call OzonHarLogger.init()");
            }
            boolean g10 = C10325b.g(c10325b);
            SwitchCompat switchCompat2 = (SwitchCompat) view.findViewById(R.id.harLogsSwitch);
            switchCompat2.setChecked(g10);
            switchCompat2.setOnCheckedChangeListener(new C9879a());
            view.findViewById(R.id.shareHarLogsButton).setOnClickListener(new CG.a(this, 19));
            view.findViewById(R.id.clearHarLogsButton).setOnClickListener(new CG.b(this, 21));
        } catch (IllegalStateException unused) {
            view.findViewById(R.id.harLogsGroup).setVisibility(8);
            view.findViewById(R.id.harLogsError).setVisibility(0);
        }
    }
}
