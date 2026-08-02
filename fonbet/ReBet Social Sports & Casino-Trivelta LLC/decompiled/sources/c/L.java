package c;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import zc.C6957c;

/* loaded from: classes.dex */
public final class L extends Lambda implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C6957c f26454d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(C6957c c6957c) {
        super(0);
        this.f26454d = c6957c;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f26454d.f68669a.getSharedPreferences("surt_guardian_attestation", 0);
    }
}
