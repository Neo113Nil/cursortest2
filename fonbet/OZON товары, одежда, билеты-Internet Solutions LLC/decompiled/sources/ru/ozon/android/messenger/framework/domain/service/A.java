package ru.ozon.android.messenger.framework.domain.service;

import android.text.SpannableString;
import java.util.ArrayList;
import java.util.Map;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import ru.ozon.android.messenger.blocks.input.CustomBlockDTO;
import ru.ozon.android.messenger.blocks.messagefile.FileDTO;
import ru.ozon.android.messenger.blocks.messageimage.ImageDTO;
import ru.ozon.android.messenger.framework.core.viewmapper.e;
import ru.ozon.android.messenger.framework.data.remote.models.blocks.BlockDTO;
import ru.ozon.android.messenger.framework.data.remote.models.items.ContextMenuDTO;
import ru.ozon.android.messenger.framework.domain.f;
import ru.ozon.android.messenger.framework.domain.model.g;
import ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.y0;
import ru.ozon.android.messenger.framework.presentation.models.C9515b;
import ru.ozon.android.messenger.framework.presentation.models.p;
import ru.ozon.android.messenger.framework.presentation.models.t;
import ru.ozon.android.messenger.framework.presentation.models.z;
import ru.ozon.android.messenger.utils.i;

/* loaded from: classes10.dex */
public final class A implements z {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.blocks.messageimage.a f88856a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.blocks.messagefile.a f88857b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.data.b f88858c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.data.remote.mapper.a f88859d;

    public A(@NotNull ru.ozon.android.messenger.blocks.messagefile.a fileMapper, @NotNull ru.ozon.android.messenger.blocks.messageimage.a imageMapper, @NotNull ru.ozon.android.messenger.framework.data.b blockStore, @NotNull ru.ozon.android.messenger.framework.data.remote.mapper.a blocksItemMapper) {
        Intrinsics.checkNotNullParameter(imageMapper, "imageMapper");
        Intrinsics.checkNotNullParameter(fileMapper, "fileMapper");
        Intrinsics.checkNotNullParameter(blockStore, "blockStore");
        Intrinsics.checkNotNullParameter(blocksItemMapper, "blocksItemMapper");
        this.f88856a = imageMapper;
        this.f88857b = fileMapper;
        this.f88858c = blockStore;
        this.f88859d = blocksItemMapper;
    }

    private final ru.ozon.android.messenger.framework.domain.model.e b(g.a.C1635a c1635a, String str) {
        String e11 = c1635a.e();
        ru.ozon.android.messenger.framework.presentation.models.c a11 = ru.ozon.android.messenger.framework.presentation.models.h.a(e11);
        ru.ozon.android.messenger.framework.presentation.models.s d11 = d(e11);
        ArrayList arrayList = new ArrayList();
        if (c1635a.f().length() > 0) {
            arrayList.add(e(new ru.ozon.android.messenger.blocks.messagetext.f(a11, new SpannableString(c1635a.f()), null, null), f.c.TEXT));
        }
        return new ru.ozon.android.messenger.framework.domain.model.e(new ru.ozon.android.messenger.framework.presentation.models.q(arrayList, ru.ozon.android.messenger.framework.presentation.models.s.d(d11, null, null, null, 0.0d, false, false, arrayList.size(), null, 258047)), new ru.ozon.android.messenger.framework.data.remote.models.c(str, e11, new y0.a(c1635a.f(), null, c1635a.d()), ru.ozon.android.messenger.framework.data.remote.mapper.j.b(c1635a.c()), null, null, 224));
    }

    private final ru.ozon.android.messenger.framework.domain.model.e c(g.a.d dVar, String str) {
        String e11 = dVar.e();
        ru.ozon.android.messenger.framework.presentation.models.c a11 = ru.ozon.android.messenger.framework.presentation.models.h.a(e11);
        ru.ozon.android.messenger.framework.presentation.models.s d11 = d(e11);
        BlockDTO f7 = dVar.f();
        ru.ozon.android.messenger.framework.presentation.models.u e12 = f7 != null ? this.f88859d.e(f7, e11) : null;
        CustomBlockDTO d12 = dVar.d();
        ru.ozon.android.messenger.framework.presentation.models.u e13 = d12 != null ? e(ru.ozon.android.messenger.blocks.messagetext.a.a(d12, a11), f.c.ORDER) : null;
        String g10 = dVar.g();
        if (g10.length() <= 0) {
            g10 = null;
        }
        ru.ozon.android.messenger.framework.presentation.models.u[] elements = {e12, e13, g10 != null ? e(new ru.ozon.android.messenger.blocks.messagetext.f(a11, new SpannableString(g10), null, null), f.c.TEXT) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        ArrayList B11 = C7705l.B(elements);
        return new ru.ozon.android.messenger.framework.domain.model.e(new ru.ozon.android.messenger.framework.presentation.models.q(B11, ru.ozon.android.messenger.framework.presentation.models.s.d(d11, null, null, null, 0.0d, false, false, B11.size(), null, 258047)), new ru.ozon.android.messenger.framework.data.remote.models.c(str, e11, new y0.d(dVar.g(), dVar.d()), ru.ozon.android.messenger.framework.data.remote.mapper.j.b(dVar.c()), dVar.h(), dVar.f(), 32));
    }

    private static ru.ozon.android.messenger.framework.presentation.models.s d(String str) {
        return new ru.ozon.android.messenger.framework.presentation.models.s(str, str, (ru.ozon.android.messenger.framework.presentation.models.t) t.c.f91549a, (C9515b) null, new DateTime(), new DateTime(), 0.0d, true, true, false, true, 1, (ru.ozon.android.messenger.framework.presentation.models.z) z.d.f91566a, (ContextMenuDTO) null, (p.b) null, (Map) null, (String) null, 98304);
    }

    private final ru.ozon.android.messenger.framework.presentation.models.u e(ru.ozon.android.messenger.framework.presentation.models.g gVar, f.c cVar) {
        return new ru.ozon.android.messenger.framework.presentation.models.u(gVar, ru.ozon.android.messenger.framework.data.d.g(this.f88858c, cVar), e.a.f87374a);
    }

    @Override // ru.ozon.android.messenger.framework.domain.service.z
    public final ru.ozon.android.messenger.utils.i a(@NotNull g.a aVar, @NotNull String str) {
        ru.ozon.android.messenger.framework.domain.model.e b11;
        ru.ozon.android.messenger.framework.domain.model.e eVar;
        try {
            if (aVar instanceof g.a.d) {
                b11 = c((g.a.d) aVar, str);
            } else {
                if (aVar instanceof g.a.c) {
                    g.a.c cVar = (g.a.c) aVar;
                    String e11 = cVar.e();
                    ru.ozon.android.messenger.framework.presentation.models.c a11 = ru.ozon.android.messenger.framework.presentation.models.h.a(e11);
                    ru.ozon.android.messenger.framework.presentation.models.s d11 = d(e11);
                    ru.ozon.android.messenger.blocks.messageimage.a aVar2 = this.f88856a;
                    ImageDTO d12 = cVar.d();
                    aVar2.getClass();
                    eVar = new ru.ozon.android.messenger.framework.domain.model.e(ru.ozon.android.messenger.framework.presentation.models.v.c(e(ru.ozon.android.messenger.blocks.messageimage.a.a(d12, a11), f.c.IMAGE), d11), ru.ozon.android.messenger.framework.data.remote.mapper.j.a(cVar.d(), e11, str, cVar.c()));
                } else if (aVar instanceof g.a.b) {
                    g.a.b bVar = (g.a.b) aVar;
                    String e12 = bVar.e();
                    ru.ozon.android.messenger.framework.presentation.models.c a12 = ru.ozon.android.messenger.framework.presentation.models.h.a(e12);
                    ru.ozon.android.messenger.framework.presentation.models.s d13 = d(e12);
                    ru.ozon.android.messenger.blocks.messagefile.a aVar3 = this.f88857b;
                    FileDTO d14 = bVar.d();
                    aVar3.getClass();
                    eVar = new ru.ozon.android.messenger.framework.domain.model.e(ru.ozon.android.messenger.framework.presentation.models.v.c(e(ru.ozon.android.messenger.blocks.messagefile.a.b(d14, a12), f.c.FILE), d13), ru.ozon.android.messenger.framework.data.remote.mapper.j.a(bVar.d(), e12, str, bVar.c()));
                } else {
                    if (!(aVar instanceof g.a.C1635a)) {
                        throw new IllegalStateException("Not a new message");
                    }
                    b11 = b((g.a.C1635a) aVar, str);
                }
                b11 = eVar;
            }
            return new i.b(b11);
        } catch (Exception e13) {
            String message = e13.getMessage();
            if (message == null) {
                message = "Unknown error";
            }
            return new i.a.f(message, null);
        }
    }
}
