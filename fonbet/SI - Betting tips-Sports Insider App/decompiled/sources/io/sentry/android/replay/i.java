package io.sentry.android.replay;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i extends Lambda implements Function1 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f16048e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j f16049f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f16050g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(long j, j jVar, Ref.ObjectRef objectRef) {
        super(1);
        this.f16048e = j;
        this.f16049f = jVar;
        this.f16050g = objectRef;
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [T, java.lang.String] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        k it = (k) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.f16062b < this.f16048e) {
            this.f16049f.k(it.f16061a);
            return Boolean.TRUE;
        }
        Ref.ObjectRef objectRef = this.f16050g;
        if (objectRef.element == 0) {
            objectRef.element = it.f16063c;
        }
        return Boolean.FALSE;
    }
}
