package ij;

import Sc.k;
import Sc.n;
import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Object f66502a;

    static final class a extends AbstractC7737t implements Function0<SharedPreferences> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f66503b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context) {
            super(0);
            this.f66503b = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final SharedPreferences invoke() {
            return this.f66503b.getSharedPreferences("download_prefs", 0);
        }
    }

    public d(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        a initializer = new a(context);
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        this.f66502a = k.a(n.NONE, initializer);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    public final void a() {
        Object value = this.f66502a.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        SharedPreferences.Editor edit = ((SharedPreferences) value).edit();
        edit.clear();
        edit.commit();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    public final long b() {
        Object value = this.f66502a.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return ((SharedPreferences) value).getLong("download_id", -1L);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    public final void c(long j11) {
        Object value = this.f66502a.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        SharedPreferences.Editor edit = ((SharedPreferences) value).edit();
        edit.putLong("download_id", j11);
        edit.commit();
    }
}
