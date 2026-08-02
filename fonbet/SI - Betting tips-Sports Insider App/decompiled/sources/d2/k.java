package d2;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import e.y;
import hg.d1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class k implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f8105a;

    public k(l lVar) {
        this.f8105a = lVar;
    }

    public final void onBackCancelled() {
        l input = this.f8105a;
        c cVar = input.f8088a;
        if (cVar == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.");
        }
        if (!input.f8089b) {
            cVar.d(input, null);
        }
        Intrinsics.checkNotNullParameter(input, "input");
        f fVar = cVar.f8083b;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(input, "input");
        if (Intrinsics.areEqual(input, fVar.f8097h) && -1 == fVar.f8096g) {
            y yVar = fVar.f8095f;
            if (yVar == null) {
                yVar = fVar.c(-1);
            }
            fVar.f8095f = null;
            fVar.f8096g = 0;
            fVar.f8097h = null;
            if (yVar != null) {
                yVar.f8452f.a();
            }
            d1 d1Var = fVar.f8090a;
            d1Var.getClass();
            d1Var.k(null, g.f8103c);
        }
        input.f8089b = false;
    }

    public final void onBackInvoked() {
        this.f8105a.a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        b event = i.a(backEvent);
        Intrinsics.checkNotNullParameter(event, "event");
        l input = this.f8105a;
        c cVar = input.f8088a;
        if (cVar == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.");
        }
        if (input.f8089b) {
            Intrinsics.checkNotNullParameter(input, "input");
            Intrinsics.checkNotNullParameter(event, "event");
            f fVar = cVar.f8083b;
            fVar.getClass();
            Intrinsics.checkNotNullParameter(input, "input");
            Intrinsics.checkNotNullParameter(event, "event");
            if (Intrinsics.areEqual(input, fVar.f8097h) && -1 == fVar.f8096g) {
                y yVar = fVar.f8095f;
                if (yVar == null) {
                    yVar = fVar.c(-1);
                }
                if (yVar != null) {
                    Intrinsics.checkNotNullParameter(event, "event");
                    Intrinsics.checkNotNullParameter(event, "latestEvent");
                    Intrinsics.checkNotNullParameter(event, "event");
                    yVar.f8452f.c(new e.a(event));
                }
                d1 d1Var = fVar.f8090a;
                h hVar = new h(event);
                d1Var.getClass();
                d1Var.k(null, hVar);
            }
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        b event = i.a(backEvent);
        Intrinsics.checkNotNullParameter(event, "event");
        l lVar = this.f8105a;
        c cVar = lVar.f8088a;
        if (cVar == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.");
        }
        if (lVar.f8089b) {
            return;
        }
        cVar.d(lVar, event);
        lVar.f8089b = true;
    }
}
