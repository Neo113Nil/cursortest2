package io.sentry.android.sqlite;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f extends Lambda implements Function0 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f16194e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g f16195f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(g gVar, int i5) {
        super(0);
        this.f16194e = i5;
        this.f16195f = gVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f16194e) {
            case 0:
                g gVar = this.f16195f;
                return new e(gVar.f16196a.M(), gVar.f16197b);
            default:
                g gVar2 = this.f16195f;
                return new e(gVar2.f16196a.Q(), gVar2.f16197b);
        }
    }
}
