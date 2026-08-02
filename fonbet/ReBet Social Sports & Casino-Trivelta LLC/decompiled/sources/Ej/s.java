package Ej;

import Ej.p;
import android.content.Context;
import android.content.Intent;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import zendesk.core.CoreModule;
import zendesk.core.Zendesk;
import zendesk.talk.android.internal.call.setup.TalkCallSetupActivity;

/* loaded from: classes5.dex */
public final class s implements Dj.q {

    /* renamed from: e, reason: collision with root package name */
    public static final a f3210e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    public static p f3211f;

    /* renamed from: b, reason: collision with root package name */
    public final Vj.c f3212b;

    /* renamed from: c, reason: collision with root package name */
    public final Qj.a f3213c;

    /* renamed from: d, reason: collision with root package name */
    public final Ij.a f3214d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final s a() {
            p.a a10 = k.a();
            CoreModule coreModule = Zendesk.INSTANCE.coreModule();
            Intrinsics.checkNotNull(coreModule);
            c(a10.a(coreModule));
            return b().c();
        }

        public final p b() {
            p pVar = s.f3211f;
            if (pVar != null) {
                return pVar;
            }
            Intrinsics.throwUninitializedPropertyAccessException("talkComponent");
            return null;
        }

        public final void c(p pVar) {
            Intrinsics.checkNotNullParameter(pVar, "<set-?>");
            s.f3211f = pVar;
        }

        public a() {
        }
    }

    public s(Vj.c lineStatusProvider, Qj.a permissionsHelper, Ij.a callCreator) {
        Intrinsics.checkNotNullParameter(lineStatusProvider, "lineStatusProvider");
        Intrinsics.checkNotNullParameter(permissionsHelper, "permissionsHelper");
        Intrinsics.checkNotNullParameter(callCreator, "callCreator");
        this.f3212b = lineStatusProvider;
        this.f3213c = permissionsHelper;
        this.f3214d = callCreator;
    }

    @Override // Dj.q
    public Object a(String str, Continuation continuation) {
        return this.f3212b.c(str, continuation);
    }

    @Override // Dj.q
    public Object b(Dj.c cVar, Continuation continuation) {
        return this.f3214d.b(cVar, continuation);
    }

    @Override // Dj.q
    public void c(Context context, String digitalLine, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(digitalLine, "digitalLine");
        if (intent != null && intent.resolveActivity(context.getPackageManager()) == null) {
            throw new IllegalStateException("successIntent must target an Activity");
        }
        context.startActivity(TalkCallSetupActivity.INSTANCE.e(context, digitalLine, intent));
    }

    @Override // Dj.q
    public boolean d() {
        return this.f3213c.a();
    }
}
