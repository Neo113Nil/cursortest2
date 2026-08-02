package io.sentry.android.sqlite;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d extends Lambda implements Function0 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f16189e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e f16190f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f16191g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(e eVar, Object obj, int i5) {
        super(0);
        this.f16189e = i5;
        this.f16190f = eVar;
        this.f16191g = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f16189e) {
            case 0:
                this.f16190f.f16192a.p((String) this.f16191g);
                return Unit.f19194a;
            case 1:
                this.f16190f.f16192a.F((Object[]) this.f16191g);
                return Unit.f19194a;
            default:
                return this.f16190f.f16192a.Z((r7.a) this.f16191g);
        }
    }
}
