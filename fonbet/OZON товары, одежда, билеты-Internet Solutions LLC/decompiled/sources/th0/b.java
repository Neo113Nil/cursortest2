package th0;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
final class b extends AbstractC7737t implements Function0<SharedPreferences> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f99529b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(Context context) {
        super(0);
        this.f99529b = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final SharedPreferences invoke() {
        SharedPreferences sharedPreferences = this.f99529b.getSharedPreferences("FIRST_INSTALL_SDK_VERSION_STORAGE", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        return sharedPreferences;
    }
}
