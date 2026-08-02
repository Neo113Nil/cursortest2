package io.sentry.android.replay.capture;

import io.sentry.b5;
import io.sentry.b6;
import java.io.File;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f extends Lambda implements Function1 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f15999e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g f16000f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Ref.BooleanRef f16001g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(long j, g gVar, Ref.BooleanRef booleanRef) {
        super(1);
        this.f15999e = j;
        this.f16000f = gVar;
        this.f16001g = booleanRef;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        i it = (i) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.f16007a.f16324u.getTime() >= this.f15999e) {
            return Boolean.FALSE;
        }
        g gVar = this.f16000f;
        gVar.l(gVar.j() - 1);
        File file = it.f16007a.f16320p;
        b6 b6Var = gVar.f16002r;
        if (file != null) {
            try {
                if (!file.delete()) {
                    b6Var.getLogger().h(b5.ERROR, "Failed to delete replay segment: %s", file.getAbsolutePath());
                }
            } catch (Throwable th2) {
                b6Var.getLogger().b(b5.ERROR, th2, "Failed to delete replay segment: %s", file.getAbsolutePath());
            }
        }
        this.f16001g.element = true;
        return Boolean.TRUE;
    }
}
