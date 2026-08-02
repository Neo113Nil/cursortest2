package ru.ozon.android.messenger.framework.domain.usecases;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import ru.ozon.android.messenger.blocks.date.DateDTO;
import ru.ozon.android.messenger.framework.domain.f;

/* renamed from: ru.ozon.android.messenger.framework.domain.usecases.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C9385b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.domain.repository.b f89057a;

    /* renamed from: ru.ozon.android.messenger.framework.domain.usecases.b$a */
    static final class a extends AbstractC7737t implements Function1<ru.ozon.android.messenger.framework.presentation.models.q, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f89058b = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(ru.ozon.android.messenger.framework.presentation.models.q qVar) {
            ru.ozon.android.messenger.framework.presentation.models.q it = qVar;
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(ru.ozon.android.messenger.framework.presentation.models.r.g(it));
        }
    }

    public C9385b(@NotNull ru.ozon.android.messenger.framework.domain.repository.b repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f89057a = repository;
    }

    private static LocalDate a(ru.ozon.android.messenger.framework.presentation.models.q qVar) {
        DateTime a11;
        DateTime h11;
        ru.ozon.android.messenger.framework.presentation.models.p c11 = qVar.c();
        ru.ozon.android.messenger.framework.presentation.models.s sVar = c11 instanceof ru.ozon.android.messenger.framework.presentation.models.s ? (ru.ozon.android.messenger.framework.presentation.models.s) c11 : null;
        if (sVar != null && (h11 = sVar.h()) != null) {
            return new LocalDate(h11.getMillis(), h11.getChronology());
        }
        ru.ozon.android.messenger.framework.presentation.models.g b11 = ru.ozon.android.messenger.framework.presentation.models.r.b(qVar);
        ru.ozon.android.messenger.blocks.date.a aVar = b11 instanceof ru.ozon.android.messenger.blocks.date.a ? (ru.ozon.android.messenger.blocks.date.a) b11 : null;
        if (aVar == null || (a11 = aVar.a()) == null) {
            return null;
        }
        return new LocalDate(a11.getMillis(), a11.getChronology());
    }

    public final void b(int i11, int i12, @NotNull List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        if (items.isEmpty()) {
            return;
        }
        int i13 = 0;
        int e11 = kotlin.ranges.h.e(i11, 0, C7714v.P(items));
        int e12 = kotlin.ranges.h.e(i12, 0, C7714v.P(items));
        ru.ozon.android.messenger.framework.presentation.models.q qVar = (ru.ozon.android.messenger.framework.presentation.models.q) ru.ozon.android.messenger.utils.b.b(items, e12 + 1, items.size(), C9384a.f89041b);
        Integer valueOf = qVar != null ? Integer.valueOf(items.indexOf(qVar)) : null;
        if (valueOf != null) {
            e12 = valueOf.intValue();
        }
        ArrayList arrayList = new ArrayList();
        ru.ozon.android.messenger.framework.presentation.models.q qVar2 = (ru.ozon.android.messenger.framework.presentation.models.q) ru.ozon.android.messenger.utils.b.c(items, e11, a.f89058b);
        LocalDate a11 = qVar2 != null ? a(qVar2) : null;
        for (Object obj : items) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                C7714v.O0();
                throw null;
            }
            ru.ozon.android.messenger.framework.presentation.models.q qVar3 = (ru.ozon.android.messenger.framework.presentation.models.q) obj;
            if (e11 > i13 || i13 > e12) {
                arrayList.add(qVar3);
                LocalDate a12 = a(qVar3);
                if (a11 == null || (a12 != null && a12.e(a11))) {
                    a11 = a12;
                }
            } else if (qVar3.c() instanceof ru.ozon.android.messenger.framework.presentation.models.s) {
                DateTime h11 = ((ru.ozon.android.messenger.framework.presentation.models.s) qVar3.c()).h();
                h11.getClass();
                LocalDate localDate = new LocalDate(h11.getMillis(), h11.getChronology());
                if (a11 == null || localDate.e(a11)) {
                    arrayList.add(this.f89057a.z(f.b.DATE, new DateDTO(((ru.ozon.android.messenger.framework.presentation.models.s) qVar3.c()).h())));
                    a11 = localDate;
                }
                arrayList.add(qVar3);
            } else if (!(ru.ozon.android.messenger.framework.presentation.models.r.b(qVar3) instanceof ru.ozon.android.messenger.blocks.date.a)) {
                arrayList.add(qVar3);
            }
            i13 = i14;
        }
        items.clear();
        items.addAll(arrayList);
    }
}
