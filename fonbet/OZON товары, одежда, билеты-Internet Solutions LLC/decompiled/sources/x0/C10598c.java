package x0;

import D1.AbstractC2810k0;
import Sc.r;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: x0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10598c implements B1.f0 {

    /* renamed from: a, reason: collision with root package name */
    private boolean f104729a;

    /* renamed from: b, reason: collision with root package name */
    private kotlin.coroutines.h f104730b;

    /* JADX WARN: Removed duplicated region for block: B:11:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        C10597b frame;
        int i11;
        kotlin.coroutines.h hVar;
        if (cVar instanceof C10597b) {
            frame = (C10597b) cVar;
            int i12 = frame.f104728g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                frame.f104728g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = frame.f104726e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = frame.f104728g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    if (!this.f104729a) {
                        kotlin.coroutines.h hVar2 = this.f104730b;
                        frame.f104725d = hVar2;
                        frame.f104728g = 1;
                        kotlin.coroutines.h hVar3 = new kotlin.coroutines.h(Wc.b.b(frame));
                        this.f104730b = hVar3;
                        Object a11 = hVar3.a();
                        if (a11 == aVar) {
                            Intrinsics.checkNotNullParameter(frame, "frame");
                        }
                        if (a11 == aVar) {
                            return aVar;
                        }
                        hVar = hVar2;
                    }
                    return Unit.f71690a;
                }
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                hVar = frame.f104725d;
                Sc.s.b(obj);
                if (hVar != null) {
                    r.Companion companion = Sc.r.INSTANCE;
                    hVar.resumeWith(Unit.f71690a);
                }
                return Unit.f71690a;
            }
        }
        frame = new C10597b(this, cVar);
        Object obj2 = frame.f104726e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = frame.f104728g;
        if (i11 != 0) {
        }
        if (hVar != null) {
        }
        return Unit.f71690a;
    }

    @Override // B1.f0
    public final void s(@NotNull AbstractC2810k0 abstractC2810k0) {
        if (this.f104729a) {
            return;
        }
        this.f104729a = true;
        kotlin.coroutines.h hVar = this.f104730b;
        if (hVar != null) {
            r.Companion companion = Sc.r.INSTANCE;
            hVar.resumeWith(Unit.f71690a);
        }
        this.f104730b = null;
    }
}
