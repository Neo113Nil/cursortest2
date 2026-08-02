package kotlin.reflect.full;

import defpackage.il4;
import defpackage.rq3;
import defpackage.sq3;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@il4(c = "kotlin.reflect.full.KCallables", f = "KCallables.kt", l = {56}, m = "callSuspend")
/* loaded from: classes7.dex */
public final class KCallables$callSuspend$1<R> extends sq3 {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    public KCallables$callSuspend$1(rq3<? super KCallables$callSuspend$1> rq3Var) {
        super(rq3Var);
    }

    @Override // defpackage.h21
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return KCallables.callSuspend(null, null, this);
    }
}
