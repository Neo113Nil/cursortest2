package ph0;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class i extends AbstractC7737t implements Function0<SharedPreferences> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h<Object> f80571b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(h<Object> hVar) {
        super(0);
        this.f80571b = hVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final SharedPreferences invoke() {
        Context context;
        h<Object> hVar = this.f80571b;
        context = ((h) hVar).f80559a;
        return context.getSharedPreferences(((h) hVar).f80560b, 0);
    }
}
