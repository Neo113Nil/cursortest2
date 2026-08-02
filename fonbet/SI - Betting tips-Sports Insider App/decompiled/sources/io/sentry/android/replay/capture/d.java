package io.sentry.android.replay.capture;

import io.sentry.protocol.v;
import java.util.Date;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15990a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f15991b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Date f15992c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v f15993d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ io.sentry.android.replay.v f15994e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Lambda f15995f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c f15996g;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ d(g gVar, long j, Date date, v vVar, io.sentry.android.replay.v vVar2, Function1 function1) {
        this.f15996g = gVar;
        this.f15991b = j;
        this.f15992c = date;
        this.f15993d = vVar;
        this.f15994e = vVar2;
        this.f15995f = (Lambda) function1;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r1v5, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15990a) {
            case 0:
                g gVar = (g) this.f15996g;
                int j = gVar.j();
                io.sentry.android.replay.v vVar = this.f15994e;
                this.f15995f.invoke(c.h(gVar, this.f15991b, this.f15992c, this.f15993d, j, vVar.f16138b, vVar.f16137a, vVar.f16141e, vVar.f16142f));
                break;
            default:
                o oVar = (o) this.f15996g;
                int j6 = oVar.j();
                io.sentry.android.replay.v vVar2 = this.f15994e;
                this.f15995f.invoke(c.h(oVar, this.f15991b, this.f15992c, this.f15993d, j6, vVar2.f16138b, vVar2.f16137a, vVar2.f16141e, vVar2.f16142f));
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ d(o oVar, long j, Date date, v vVar, io.sentry.android.replay.v vVar2, Function1 function1) {
        this.f15996g = oVar;
        this.f15991b = j;
        this.f15992c = date;
        this.f15993d = vVar;
        this.f15994e = vVar2;
        this.f15995f = (Lambda) function1;
    }
}
