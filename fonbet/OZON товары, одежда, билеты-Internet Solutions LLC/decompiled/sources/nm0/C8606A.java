package nm0;

import B90.C2621x;
import Sc.r;
import android.content.Context;
import android.content.Intent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import nl0.C8604d;
import ru.rustore.sdk.review.model.ReviewInfo;

/* renamed from: nm0.A, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8606A extends AbstractC7737t implements Function1<lm0.e<Unit>, Unit> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C8609D f77378b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ReviewInfo f77379c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8606A(C8609D c8609d, ReviewInfo reviewInfo) {
        super(1);
        this.f77378b = c8609d;
        this.f77379c = reviewInfo;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(lm0.e<Unit> eVar) {
        Object a11;
        lm0.e<Unit> emitter = eVar;
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        C8609D c8609d = this.f77378b;
        ReviewInfo reviewInfo = this.f77379c;
        try {
            r.Companion companion = Sc.r.INSTANCE;
            Context context = c8609d.f77384a;
            Intent intent = new Intent("ru.vk.store.RequestAppReview");
            intent.putExtra("KEY_APPLICATION_ID", c8609d.f77385b);
            intent.putExtras(reviewInfo.toBundle$sdk_public_review_release());
            C8604d.a(context, intent, new C2621x(emitter));
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
