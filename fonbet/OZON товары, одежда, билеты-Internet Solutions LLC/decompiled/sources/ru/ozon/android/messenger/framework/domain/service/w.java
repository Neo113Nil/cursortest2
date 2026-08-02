package ru.ozon.android.messenger.framework.domain.service;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
final class w extends AbstractC7737t implements Function1<List<ru.ozon.android.messenger.framework.presentation.models.q>, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f88944b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.presentation.models.q f88945c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f88946d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.presentation.models.z f88947e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ g f88948f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    w(String str, ru.ozon.android.messenger.framework.presentation.models.q qVar, boolean z11, ru.ozon.android.messenger.framework.presentation.models.z zVar, g gVar) {
        super(1);
        this.f88944b = str;
        this.f88945c = qVar;
        this.f88946d = z11;
        this.f88947e = zVar;
        this.f88948f = gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.Object, java.util.List] */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<ru.ozon.android.messenger.framework.presentation.models.q> list) {
        ru.ozon.android.messenger.framework.presentation.models.q qVar;
        ?? blocks;
        List<ru.ozon.android.messenger.framework.presentation.models.u> b11;
        List<ru.ozon.android.messenger.framework.presentation.models.q> updateBlocks = list;
        Intrinsics.checkNotNullParameter(updateBlocks, "$this$updateBlocks");
        ListIterator<ru.ozon.android.messenger.framework.presentation.models.q> listIterator = updateBlocks.listIterator(updateBlocks.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                qVar = null;
                break;
            }
            qVar = listIterator.previous();
            ru.ozon.android.messenger.framework.presentation.models.s f7 = ru.ozon.android.messenger.framework.presentation.models.r.f(qVar);
            if (Intrinsics.d(f7 != null ? f7.i() : null, this.f88944b)) {
                break;
            }
        }
        ru.ozon.android.messenger.framework.presentation.models.q qVar2 = qVar;
        if (qVar2 != null && (qVar2.c() instanceof ru.ozon.android.messenger.framework.presentation.models.s)) {
            ru.ozon.android.messenger.framework.presentation.models.q qVar3 = this.f88945c;
            g gVar = this.f88948f;
            if (qVar3 == null || ru.ozon.android.messenger.framework.presentation.models.r.b(qVar3).getClass() == ru.ozon.android.messenger.framework.presentation.models.r.b(qVar2).getClass()) {
                int indexOf = updateBlocks.indexOf(qVar2);
                if (!Intrinsics.d(ru.ozon.android.messenger.framework.presentation.models.r.d((ru.ozon.android.messenger.framework.presentation.models.q) C7714v.X(updateBlocks)), qVar3 != null ? ru.ozon.android.messenger.framework.presentation.models.r.d(qVar3) : null) || C7714v.P(updateBlocks) == indexOf) {
                    ru.ozon.android.messenger.framework.presentation.models.s f11 = ru.ozon.android.messenger.framework.presentation.models.r.f(qVar3 == null ? qVar2 : qVar3);
                    ru.ozon.android.messenger.framework.presentation.models.s itemInfo = f11 != null ? ru.ozon.android.messenger.framework.presentation.models.s.d(f11, this.f88944b, ((ru.ozon.android.messenger.framework.presentation.models.s) qVar2.c()).j(), null, 0.0d, ((ru.ozon.android.messenger.framework.presentation.models.s) qVar2.c()).f(), this.f88946d, 0, this.f88947e, 250873) : null;
                    if (qVar3 != null && (b11 = qVar3.b()) != null && b11.size() == qVar2.b().size()) {
                        List<ru.ozon.android.messenger.framework.presentation.models.u> b12 = qVar2.b();
                        blocks = new ArrayList(C7714v.z(b12, 10));
                        int i11 = 0;
                        for (Object obj : b12) {
                            int i12 = i11 + 1;
                            if (i11 < 0) {
                                C7714v.O0();
                                throw null;
                            }
                            ru.ozon.android.messenger.framework.presentation.models.u uVar = (ru.ozon.android.messenger.framework.presentation.models.u) obj;
                            blocks.add(ru.ozon.android.messenger.framework.presentation.models.u.a(uVar, g.j(gVar, qVar3.b().get(i11), uVar)));
                            i11 = i12;
                        }
                    } else if (qVar3 == null || (blocks = qVar3.b()) == 0) {
                        blocks = qVar2.b();
                    }
                    if (itemInfo != null) {
                        Intrinsics.checkNotNullParameter(blocks, "blocks");
                        Intrinsics.checkNotNullParameter(itemInfo, "itemInfo");
                        updateBlocks.set(indexOf, new ru.ozon.android.messenger.framework.presentation.models.q(blocks, itemInfo));
                    }
                } else {
                    updateBlocks.remove(indexOf);
                }
            } else {
                if (qVar3.b().size() == qVar2.b().size()) {
                    List<ru.ozon.android.messenger.framework.presentation.models.u> b13 = qVar2.b();
                    ArrayList arrayList = new ArrayList(C7714v.z(b13, 10));
                    int i13 = 0;
                    for (Object obj2 : b13) {
                        int i14 = i13 + 1;
                        if (i13 < 0) {
                            C7714v.O0();
                            throw null;
                        }
                        ru.ozon.android.messenger.framework.presentation.models.u uVar2 = (ru.ozon.android.messenger.framework.presentation.models.u) obj2;
                        arrayList.add(ru.ozon.android.messenger.framework.presentation.models.u.a(uVar2, g.j(gVar, qVar3.b().get(i13), uVar2)));
                        i13 = i14;
                    }
                }
                updateBlocks.set(updateBlocks.indexOf(qVar2), qVar3);
            }
        }
        return Unit.f71690a;
    }
}
