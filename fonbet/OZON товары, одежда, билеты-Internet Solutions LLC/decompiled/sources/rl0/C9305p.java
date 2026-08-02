package rl0;

import Sc.r;
import android.content.Context;
import android.content.Intent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import nl0.C8604d;
import ru.rustore.sdk.activitylauncher.a;
import ru.rustore.sdk.appupdate.errors.RuStoreInstallException;
import zl0.C11151b;

/* renamed from: rl0.p, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C9305p extends AbstractC7737t implements Function1<lm0.e<Unit>, Unit> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y f83703b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f83704c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9305p(Y y11, int i11) {
        super(1);
        this.f83703b = y11;
        this.f83704c = i11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(lm0.e<Unit> eVar) {
        Object a11;
        lm0.e<Unit> emitter = eVar;
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        Y y11 = this.f83703b;
        Context context = y11.f83656a;
        int i11 = this.f83704c;
        try {
            r.Companion companion = Sc.r.INSTANCE;
            Intrinsics.checkNotNullParameter(context, "context");
            if (!C11151b.a(context, "ru.vk.store.qa") && !C11151b.a(context, "ru.vk.store")) {
                emitter.a(new wl0.d());
            }
            Intent a12 = y11.a("ru.vk.store.FlexibleAppUpdate", new C9304o(y11, i11));
            if (a12 != null) {
                C8604d.a(context, a12, new B90.X(emitter));
            } else {
                emitter.a(new RuStoreInstallException(a.C2157a.f97948b.a()));
            }
            a11 = Unit.f71690a;
        } catch (Throwable th2) {
            r.Companion companion2 = Sc.r.INSTANCE;
            a11 = Sc.s.a(th2);
        }
        Throwable b11 = Sc.r.b(a11);
        if (b11 != null) {
            emitter.a(b11);
        }
        return Unit.f71690a;
    }
}
