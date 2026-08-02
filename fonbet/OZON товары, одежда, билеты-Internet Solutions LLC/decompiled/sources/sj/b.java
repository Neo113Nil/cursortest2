package sj;

import android.content.SharedPreferences;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes6.dex */
final class b extends AbstractC7737t implements Function0<Boolean> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ c f98804b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(c cVar) {
        super(0);
        this.f98804b = cVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        SharedPreferences sharedPreferences = this.f98804b.u().getSharedPreferences("ozon_logger_prefs", 0);
        boolean z11 = sharedPreferences.getBoolean("is_first_launch", true);
        if (z11) {
            sharedPreferences.edit().putBoolean("is_first_launch", false).apply();
        }
        return Boolean.valueOf(z11);
    }
}
