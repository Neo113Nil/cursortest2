package io.sentry.android.replay.capture;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class n extends Lambda implements Function1 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f16014e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o f16015f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(o oVar, int i5) {
        super(1);
        this.f16014e = i5;
        this.f16015f = oVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f16014e) {
            case 0:
                k segment = (k) obj;
                Intrinsics.checkNotNullParameter(segment, "segment");
                if (segment instanceof i) {
                    i iVar = (i) segment;
                    o oVar = this.f16015f;
                    i.a(iVar, oVar.f16017s);
                    oVar.l(oVar.j() + 1);
                    oVar.m(iVar.f16007a.f16324u);
                }
                break;
            default:
                k segment2 = (k) obj;
                Intrinsics.checkNotNullParameter(segment2, "segment");
                if (segment2 instanceof i) {
                    o oVar2 = this.f16015f;
                    i.a((i) segment2, oVar2.f16017s);
                    oVar2.l(oVar2.j() + 1);
                }
                break;
        }
        return Unit.f19194a;
    }
}
