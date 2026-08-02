package io.sentry.android.replay.capture;

import java.util.ArrayList;
import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
final class s extends AbstractC7737t implements Function1<io.sentry.rrweb.b, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Date f67529b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ArrayList f67530c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    s(Date date, ArrayList arrayList) {
        super(1);
        this.f67529b = date;
        this.f67530c = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(io.sentry.rrweb.b bVar) {
        io.sentry.rrweb.b event = bVar;
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.e() >= this.f67529b.getTime()) {
            this.f67530c.add(event);
        }
        return Unit.f71690a;
    }
}
