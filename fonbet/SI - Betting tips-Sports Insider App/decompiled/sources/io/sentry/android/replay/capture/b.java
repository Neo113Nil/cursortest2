package io.sentry.android.replay.capture;

import ag.u;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15971a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f15972b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f15973c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c f15974d;

    public b(c cVar, c cVar2, int i5) {
        this.f15971a = i5;
        switch (i5) {
            case 2:
                this.f15973c = cVar;
                this.f15974d = cVar2;
                this.f15972b = new AtomicReference(null);
                break;
            case 3:
                this.f15973c = cVar;
                this.f15974d = cVar2;
                this.f15972b = new AtomicReference(null);
                break;
            case 4:
                this.f15973c = cVar;
                this.f15974d = cVar2;
                this.f15972b = new AtomicReference(null);
                break;
            case 5:
                this.f15973c = cVar;
                this.f15974d = cVar2;
                this.f15972b = new AtomicReference(null);
                break;
            default:
                this.f15973c = cVar;
                this.f15974d = cVar2;
                this.f15972b = new AtomicReference(-1);
                break;
        }
    }

    public final Object a(Object obj, u property) {
        switch (this.f15971a) {
            case 0:
                Intrinsics.checkNotNullParameter(property, "property");
                break;
            case 1:
                Intrinsics.checkNotNullParameter(property, "property");
                break;
            case 2:
                Intrinsics.checkNotNullParameter(property, "property");
                break;
            case 3:
                Intrinsics.checkNotNullParameter(property, "property");
                break;
            case 4:
                Intrinsics.checkNotNullParameter(property, "property");
                break;
            default:
                Intrinsics.checkNotNullParameter(property, "property");
                break;
        }
        return this.f15972b.get();
    }

    public b(Object obj, c cVar, c cVar2) {
        this.f15971a = 0;
        this.f15973c = cVar;
        this.f15974d = cVar2;
        this.f15972b = new AtomicReference(obj);
    }
}
