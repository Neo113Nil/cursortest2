package io.sentry.okhttp;

import io.sentry.i1;
import io.sentry.q6;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b extends Lambda implements Function1 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f16698e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ IOException f16699f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(IOException iOException, int i5) {
        super(1);
        this.f16698e = i5;
        this.f16699f = iOException;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f16698e) {
            case 0:
                i1 it = (i1) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                it.a(q6.INTERNAL_ERROR);
                it.g(this.f16699f);
                break;
            case 1:
                i1 it2 = (i1) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                it2.g(this.f16699f);
                it2.a(q6.INTERNAL_ERROR);
                break;
            case 2:
                i1 it3 = (i1) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                if (!it3.d()) {
                    it3.a(q6.INTERNAL_ERROR);
                    it3.g(this.f16699f);
                }
                break;
            case 3:
                i1 it4 = (i1) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                it4.a(q6.INTERNAL_ERROR);
                it4.g(this.f16699f);
                break;
            case 4:
                i1 it5 = (i1) obj;
                Intrinsics.checkNotNullParameter(it5, "it");
                if (!it5.d()) {
                    it5.a(q6.INTERNAL_ERROR);
                    it5.g(this.f16699f);
                }
                break;
            default:
                i1 it6 = (i1) obj;
                Intrinsics.checkNotNullParameter(it6, "it");
                it6.a(q6.INTERNAL_ERROR);
                it6.g(this.f16699f);
                break;
        }
        return Unit.f19194a;
    }
}
