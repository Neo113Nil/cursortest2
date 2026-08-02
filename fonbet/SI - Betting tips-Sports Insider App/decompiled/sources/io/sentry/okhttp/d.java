package io.sentry.okhttp;

import io.sentry.i1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d extends Lambda implements Function1 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f16703e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f16704f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(long j, int i5) {
        super(1);
        this.f16703e = i5;
        this.f16704f = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f16703e) {
            case 0:
                i1 it = (i1) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                long j = this.f16704f;
                if (j > 0) {
                    it.m(Long.valueOf(j), "http.request_content_length");
                }
                break;
            default:
                i1 it2 = (i1) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                long j6 = this.f16704f;
                if (j6 > 0) {
                    it2.m(Long.valueOf(j6), "http.response_content_length");
                }
                break;
        }
        return Unit.f19194a;
    }
}
