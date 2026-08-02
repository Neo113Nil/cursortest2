package io.sentry.android.fragment;

import io.sentry.android.replay.ReplayIntegration;
import io.sentry.u3;
import io.sentry.z0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements u3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15910a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f15911b;

    public /* synthetic */ c(Ref.ObjectRef objectRef, int i5) {
        this.f15910a = i5;
        this.f15911b = objectRef;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v1, types: [T, io.sentry.k1] */
    @Override // io.sentry.u3
    public final void g(z0 it) {
        int i5 = this.f15910a;
        Ref.ObjectRef objectRef = this.f15911b;
        switch (i5) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                objectRef.element = it.n();
                break;
            case 1:
                int i10 = ReplayIntegration.f15922r;
                Intrinsics.checkNotNullParameter(it, "it");
                String J = it.J();
                objectRef.element = J != null ? StringsKt.V('.', J, J) : 0;
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "scope");
                objectRef.element = new ArrayList(it.w());
                break;
        }
    }
}
