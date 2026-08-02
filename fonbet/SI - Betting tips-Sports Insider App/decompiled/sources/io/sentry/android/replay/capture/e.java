package io.sentry.android.replay.capture;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e extends Lambda implements Function1 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f15997e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g f15998f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(g gVar, int i5) {
        super(1);
        this.f15997e = i5;
        this.f15998f = gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f15997e) {
            case 0:
                k segment = (k) obj;
                Intrinsics.checkNotNullParameter(segment, "segment");
                if (segment instanceof i) {
                    g gVar = this.f15998f;
                    gVar.f16006v.add(segment);
                    gVar.l(gVar.j() + 1);
                }
                break;
            default:
                k segment2 = (k) obj;
                Intrinsics.checkNotNullParameter(segment2, "segment");
                if (segment2 instanceof i) {
                    g gVar2 = this.f15998f;
                    gVar2.f16006v.add(segment2);
                    gVar2.l(gVar2.j() + 1);
                }
                break;
        }
        return Unit.f19194a;
    }
}
