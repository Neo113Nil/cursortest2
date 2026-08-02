package io.sentry.android.replay.capture;

import io.sentry.android.replay.v;
import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a extends Lambda implements Function0 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f15967e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f15968f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f15969g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c f15970h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj, Object obj2, c cVar, int i5) {
        super(0);
        this.f15967e = i5;
        this.f15968f = obj;
        this.f15969g = obj2;
        this.f15970h = cVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f15967e) {
            case 0:
                io.sentry.android.replay.j jVar = this.f15970h.f15982h;
                if (jVar != null) {
                    jVar.r("replay.id", String.valueOf(this.f15969g));
                }
                break;
            case 1:
                io.sentry.android.replay.j jVar2 = this.f15970h.f15982h;
                if (jVar2 != null) {
                    jVar2.r("replay.type", String.valueOf(this.f15969g));
                }
                break;
            case 2:
                v vVar = (v) this.f15969g;
                if (vVar != null) {
                    c cVar = this.f15970h;
                    io.sentry.android.replay.j jVar3 = cVar.f15982h;
                    if (jVar3 != null) {
                        jVar3.r("config.height", String.valueOf(vVar.f16138b));
                    }
                    io.sentry.android.replay.j jVar4 = cVar.f15982h;
                    if (jVar4 != null) {
                        jVar4.r("config.width", String.valueOf(vVar.f16137a));
                    }
                    io.sentry.android.replay.j jVar5 = cVar.f15982h;
                    if (jVar5 != null) {
                        jVar5.r("config.frame-rate", String.valueOf(vVar.f16141e));
                    }
                    io.sentry.android.replay.j jVar6 = cVar.f15982h;
                    if (jVar6 != null) {
                        jVar6.r("config.bit-rate", String.valueOf(vVar.f16142f));
                    }
                }
                break;
            case 3:
                Date date = (Date) this.f15969g;
                io.sentry.android.replay.j jVar7 = this.f15970h.f15982h;
                if (jVar7 != null) {
                    jVar7.r("segment.timestamp", date == null ? null : com.google.android.play.core.appupdate.b.u(date));
                }
                break;
            default:
                io.sentry.android.replay.j jVar8 = this.f15970h.f15982h;
                if (jVar8 != null) {
                    jVar8.r("replay.screen-at-start", String.valueOf(this.f15969g));
                }
                break;
        }
        return Unit.f19194a;
    }
}
