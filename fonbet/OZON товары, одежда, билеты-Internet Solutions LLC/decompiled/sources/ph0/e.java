package ph0;

import C.C2702w;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ph0.InterfaceC8932a;

/* loaded from: classes7.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final SharedPreferences f80550a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function0<InterfaceC8932a> f80551b;

    /* loaded from: classes3.dex */
    static final class a extends AbstractC7737t implements Function0<String> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<InterfaceC8932a.C1363a> f80552b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(List<InterfaceC8932a.C1363a> list) {
            super(0);
            this.f80552b = list;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            List<InterfaceC8932a.C1363a> list = this.f80552b;
            if (list.isEmpty()) {
                return "There are no push providers.";
            }
            String V11 = C7714v.V(list, null, null, null, d.f80549b, 31);
            return "The are " + list.size() + " push providers: " + V11;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(@NotNull SharedPreferences sharedPreferences, @NotNull Function0<? extends InterfaceC8932a> pushProvidersDetectorProvider) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        Intrinsics.checkNotNullParameter(pushProvidersDetectorProvider, "pushProvidersDetectorProvider");
        this.f80550a = sharedPreferences;
        this.f80551b = pushProvidersDetectorProvider;
    }

    public final void a() {
        SharedPreferences sharedPreferences = this.f80550a;
        if (sharedPreferences.getBoolean("ru.ozon.push.sdk.internal.debug.IS_ALREADY_TRACKED", false)) {
            return;
        }
        ArrayList a11 = this.f80551b.invoke().a();
        int i11 = sh0.b.f98783c;
        sh0.b.e("PushProvidersTracker", sj.f.b(new Pair("pushProvidersInfo", a11)), Boolean.FALSE, new a(a11));
        C2702w.e(sharedPreferences, "ru.ozon.push.sdk.internal.debug.IS_ALREADY_TRACKED", true);
    }
}
