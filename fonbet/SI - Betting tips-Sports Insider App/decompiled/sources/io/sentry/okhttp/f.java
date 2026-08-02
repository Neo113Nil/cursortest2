package io.sentry.okhttp;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f extends Lambda implements Function1 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f16708e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ io.sentry.e f16709f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(io.sentry.e eVar, int i5) {
        super(1);
        this.f16708e = i5;
        this.f16709f = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f16708e) {
            case 0:
                this.f16709f.c(Long.valueOf(((Number) obj).longValue()), "http.request_content_length");
                break;
            default:
                this.f16709f.c(Long.valueOf(((Number) obj).longValue()), "http.response_content_length");
                break;
        }
        return Unit.f19194a;
    }
}
