package ru.ozon.tracker.worker;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.tracker.db.entities.DbEvent;

/* loaded from: classes3.dex */
final class d extends AbstractC7737t implements Function1<DbEvent, String> {

    /* renamed from: b, reason: collision with root package name */
    public static final d f97892b = new d(1);

    @Override // kotlin.jvm.functions.Function1
    public final String invoke(DbEvent dbEvent) {
        DbEvent it = dbEvent;
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getEventBody();
    }
}
