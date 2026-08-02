package fi0;

import Sc.InterfaceC4008j;
import android.content.Context;
import android.content.SharedPreferences;
import com.squareup.moshi.Moshi;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class k implements j {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f63493a;

    static final class a extends AbstractC7737t implements Function0<SharedPreferences> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f63494b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context) {
            super(0);
            this.f63494b = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final SharedPreferences invoke() {
            return this.f63494b.getSharedPreferences("storage", 0);
        }
    }

    public k(@NotNull Context context, @NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.f63493a = Sc.k.b(new a(context));
    }

    @Override // fi0.j
    public final synchronized void a(String str) {
        Intrinsics.checkNotNullParameter("installId", "key");
        ((SharedPreferences) this.f63493a.getValue()).edit().putString("installId", str).apply();
    }

    @Override // fi0.j
    public final synchronized String b() {
        Intrinsics.checkNotNullParameter("installId", "key");
        return ((SharedPreferences) this.f63493a.getValue()).getString("installId", null);
    }
}
