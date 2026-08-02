package ru.ozon.android.messenger.framework.data.local.mapper;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.input.attachments.presentation.b;
import ru.ozon.android.messenger.framework.data.local.database.draft.entity.a;
import ru.ozon.android.messenger.framework.data.local.database.draft.entity.d;

/* loaded from: classes10.dex */
public final class a {
    @NotNull
    public static ru.ozon.android.messenger.framework.data.local.database.draft.entity.a a(@NotNull String chatId, @NotNull ru.ozon.android.messenger.blocks.input.attachments.presentation.b vo) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(vo, "vo");
        String uuid = vo.b().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        boolean z11 = vo instanceof b.C1500b;
        a.AbstractC1573a abstractC1573a = z11 ? a.AbstractC1573a.b.f87505b : a.AbstractC1573a.C1574a.f87504b;
        String uri = vo.c().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        String g10 = vo.g();
        String d11 = vo.d();
        b.C1500b c1500b = z11 ? (b.C1500b) vo : null;
        Integer width = c1500b != null ? c1500b.getWidth() : null;
        b.C1500b c1500b2 = z11 ? (b.C1500b) vo : null;
        Integer height = c1500b2 != null ? c1500b2.getHeight() : null;
        boolean z12 = vo instanceof b.a;
        b.a aVar = z12 ? (b.a) vo : null;
        String j11 = aVar != null ? aVar.j() : null;
        b.a aVar2 = z12 ? (b.a) vo : null;
        return new ru.ozon.android.messenger.framework.data.local.database.draft.entity.a(uuid, chatId, abstractC1573a, uri, g10, d11, width, height, j11, aVar2 != null ? aVar2.k() : null);
    }

    @NotNull
    public static ru.ozon.android.messenger.blocks.input.b b(@NotNull ru.ozon.android.messenger.framework.data.local.database.draft.model.a entityWithRelations) {
        String str;
        ru.ozon.android.messenger.blocks.input.attachments.presentation.b aVar;
        Intrinsics.checkNotNullParameter(entityWithRelations, "entityWithRelations");
        String a11 = entityWithRelations.a().a();
        long b11 = entityWithRelations.a().b();
        d b12 = entityWithRelations.b();
        if (b12 == null || (str = b12.b()) == null) {
            str = "";
        }
        String str2 = str;
        List<ru.ozon.android.messenger.framework.data.local.database.draft.entity.a> c11 = entityWithRelations.c();
        ArrayList arrayList = new ArrayList(C7714v.z(c11, 10));
        Iterator<T> it = c11.iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                ru.ozon.android.messenger.framework.data.local.database.draft.entity.b bVar = (ru.ozon.android.messenger.framework.data.local.database.draft.entity.b) C7714v.M(entityWithRelations.d());
                return new ru.ozon.android.messenger.blocks.input.b(a11, b11, str2, bVar != null ? bVar.b() : null, arrayList);
            }
            Object next = it.next();
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            ru.ozon.android.messenger.framework.data.local.database.draft.entity.a aVar2 = (ru.ozon.android.messenger.framework.data.local.database.draft.entity.a) next;
            if (Intrinsics.d(aVar2.j(), a.AbstractC1573a.b.f87505b)) {
                UUID fromString = UUID.fromString(aVar2.d());
                Intrinsics.checkNotNullExpressionValue(fromString, "fromString(...)");
                String i13 = aVar2.i();
                Uri parse = Uri.parse(aVar2.g());
                Intrinsics.checkNotNullExpressionValue(parse, "parse(...)");
                aVar = new b.C1500b(fromString, i13, parse, aVar2.h(), b.c.C1502b.f85481a, i11, 0, false, aVar2.f(), aVar2.e());
            } else {
                UUID fromString2 = UUID.fromString(aVar2.d());
                Intrinsics.checkNotNullExpressionValue(fromString2, "fromString(...)");
                String i14 = aVar2.i();
                Uri parse2 = Uri.parse(aVar2.g());
                Intrinsics.checkNotNullExpressionValue(parse2, "parse(...)");
                aVar = new b.a(fromString2, i14, parse2, aVar2.h(), b.c.C1502b.f85481a, i11, 0, false, aVar2.c(), aVar2.b());
            }
            arrayList.add(aVar);
            i11 = i12;
        }
    }
}
