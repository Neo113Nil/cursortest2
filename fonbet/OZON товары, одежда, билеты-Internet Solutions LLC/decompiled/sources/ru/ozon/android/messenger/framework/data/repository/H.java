package ru.ozon.android.messenger.framework.data.repository;

import android.content.Context;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.chat.common.PreviewVO;
import ru.ozon.android.messenger.framework.core.viewmapper.e;
import ru.ozon.android.messenger.framework.data.b;
import ru.ozon.android.messenger.framework.data.local.database.undelivered.entity.UndeliveredMessageEntity;
import ru.ozon.android.messenger.framework.domain.f;

/* loaded from: classes10.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.data.local.mapper.c f88275a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.data.b f88276b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final b0 f88277c;

    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t2, T t11) {
            return Vc.a.b(Double.valueOf(((ru.ozon.android.messenger.framework.presentation.models.q) t11).c().c()), Double.valueOf(((ru.ozon.android.messenger.framework.presentation.models.q) t2).c().c()));
        }
    }

    public H(@NotNull ru.ozon.android.messenger.framework.data.local.mapper.c undeliveredMessagesMapper, @NotNull ru.ozon.android.messenger.framework.data.b blockStore, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(undeliveredMessagesMapper, "undeliveredMessagesMapper");
        Intrinsics.checkNotNullParameter(blockStore, "blockStore");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f88275a = undeliveredMessagesMapper;
        this.f88276b = blockStore;
        this.f88277c = new b0(context);
    }

    private final PreviewVO a(PreviewVO previewVO, ru.ozon.android.messenger.framework.presentation.models.q qVar, ru.ozon.android.messenger.blocks.input.b bVar) {
        if ((previewVO != null ? previewVO.getChatStatus() : null) != ru.ozon.android.messenger.blocks.chat.common.f.CHAT_STATUS_INACTIVE) {
            b0 b0Var = this.f88277c;
            if (bVar != null && !bVar.e()) {
                return b0Var.a(previewVO, qVar, bVar);
            }
            if (qVar != null) {
                return b0Var.b(qVar);
            }
        }
        return null;
    }

    private static List b(ru.ozon.android.messenger.framework.data.b bVar, String str) {
        Object obj;
        List<ru.ozon.android.messenger.framework.core.viewmapper.d<? extends Object, ? extends ru.ozon.android.messenger.framework.presentation.models.g>> c11 = bVar.c(b.a.a("messenger", str));
        if (c11 != null) {
            Iterator<T> it = c11.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C7705l.l(((ru.ozon.android.messenger.framework.core.viewmapper.d) obj).getSupportedVersions(), 1L)) {
                    break;
                }
            }
            if (obj != null) {
                return c11;
            }
        }
        return null;
    }

    @NotNull
    public final ru.ozon.android.messenger.framework.presentation.models.responses.g c(@NotNull ru.ozon.android.messenger.framework.presentation.models.responses.g remoteResponse, @NotNull Map<String, UndeliveredMessageEntity> groupedUndeliveredMessages, @NotNull Map<String, ru.ozon.android.messenger.blocks.input.b> draftsGroupedByChatId) {
        ru.ozon.android.messenger.framework.presentation.models.c blockId;
        Intrinsics.checkNotNullParameter(remoteResponse, "remoteResponse");
        Intrinsics.checkNotNullParameter(groupedUndeliveredMessages, "groupedUndeliveredMessages");
        Intrinsics.checkNotNullParameter(draftsGroupedByChatId, "draftsGroupedByChatId");
        List<ru.ozon.android.messenger.framework.presentation.models.q> c11 = remoteResponse.c();
        ArrayList arrayList = new ArrayList(C7714v.z(c11, 10));
        Iterator<T> it = c11.iterator();
        while (true) {
            ru.ozon.android.messenger.framework.presentation.models.q qVar = null;
            if (!it.hasNext()) {
                return ru.ozon.android.messenger.framework.presentation.models.responses.g.a(remoteResponse, C7714v.I0(new a(), arrayList), null, 62);
            }
            ru.ozon.android.messenger.framework.presentation.models.q qVar2 = (ru.ozon.android.messenger.framework.presentation.models.q) it.next();
            ru.ozon.android.messenger.framework.presentation.models.p c12 = qVar2.c();
            ru.ozon.android.messenger.framework.presentation.models.u uVar = (ru.ozon.android.messenger.framework.presentation.models.u) C7714v.M(qVar2.b());
            ru.ozon.android.messenger.framework.presentation.models.g c13 = uVar != null ? uVar.c() : null;
            ru.ozon.android.messenger.blocks.chat.common.b bVar = c13 instanceof ru.ozon.android.messenger.blocks.chat.common.b ? (ru.ozon.android.messenger.blocks.chat.common.b) c13 : null;
            String a11 = (bVar == null || (blockId = bVar.getBlockId()) == null) ? null : blockId.a();
            if (a11 != null) {
                UndeliveredMessageEntity undeliveredMessageEntity = groupedUndeliveredMessages.get(a11);
                ru.ozon.android.messenger.framework.presentation.models.q c14 = undeliveredMessageEntity != null ? this.f88275a.c(undeliveredMessageEntity) : null;
                if (c14 != null && c14.c().c() > c12.c()) {
                    qVar = c14;
                }
                qVar2 = d(qVar2, qVar, draftsGroupedByChatId.get(a11));
            }
            arrayList.add(qVar2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00e8  */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ru.ozon.android.messenger.framework.presentation.models.q d(@NotNull ru.ozon.android.messenger.framework.presentation.models.q block, ru.ozon.android.messenger.framework.presentation.models.q qVar, ru.ozon.android.messenger.blocks.input.b bVar) {
        ru.ozon.android.messenger.framework.presentation.models.u uVar;
        ru.ozon.android.messenger.framework.presentation.models.p c11;
        Intrinsics.checkNotNullParameter(block, "block");
        if (qVar == null && (bVar == null || bVar.e())) {
            return block;
        }
        ru.ozon.android.messenger.framework.presentation.models.u uVar2 = (ru.ozon.android.messenger.framework.presentation.models.u) C7714v.M(block.b());
        ru.ozon.android.messenger.framework.presentation.models.u uVar3 = null;
        ru.ozon.android.messenger.framework.presentation.models.g c12 = uVar2 != null ? uVar2.c() : null;
        ru.ozon.android.messenger.framework.presentation.models.p c13 = block.c();
        boolean z11 = c12 instanceof ru.ozon.android.messenger.blocks.chat.sx.b;
        ru.ozon.android.messenger.framework.data.b bVar2 = this.f88276b;
        if (z11) {
            ru.ozon.android.messenger.blocks.chat.sx.b bVar3 = (ru.ozon.android.messenger.blocks.chat.sx.b) c12;
            List<? extends ru.ozon.android.messenger.framework.core.viewmapper.d<? extends Object, ? extends ru.ozon.android.messenger.framework.presentation.models.g>> b11 = b(bVar2, f.c.SX_CHAT.b());
            PreviewVO a11 = a(bVar3.g().h(), qVar, bVar);
            ru.ozon.android.messenger.blocks.chat.common.c g10 = bVar3.g();
            if (a11 == null) {
                a11 = bVar3.g().h();
            }
            uVar = new ru.ozon.android.messenger.framework.presentation.models.u(ru.ozon.android.messenger.blocks.chat.sx.b.e(bVar3, ru.ozon.android.messenger.blocks.chat.common.c.e(g10, a11)), bVar2.a(b11), e.a.f87374a);
        } else {
            if (!(c12 instanceof ru.ozon.android.messenger.blocks.chat.bx.b)) {
                if (c12 instanceof ru.ozon.android.messenger.blocks.chat.old.c) {
                    ru.ozon.android.messenger.blocks.chat.old.c cVar = (ru.ozon.android.messenger.blocks.chat.old.c) c12;
                    List<? extends ru.ozon.android.messenger.framework.core.viewmapper.d<? extends Object, ? extends ru.ozon.android.messenger.framework.presentation.models.g>> b12 = b(bVar2, f.c.CHAT.b());
                    PreviewVO a12 = a(cVar.i().h(), qVar, bVar);
                    ru.ozon.android.messenger.blocks.chat.common.c i11 = cVar.i();
                    if (a12 == null) {
                        a12 = cVar.i().h();
                    }
                    uVar = new ru.ozon.android.messenger.framework.presentation.models.u(ru.ozon.android.messenger.blocks.chat.old.c.e(cVar, ru.ozon.android.messenger.blocks.chat.common.c.e(i11, a12)), bVar2.a(b12), e.a.f87374a);
                }
                if (uVar3 != null) {
                    block = new ru.ozon.android.messenger.framework.presentation.models.q(C7714v.a0(uVar3), new ru.ozon.android.messenger.framework.presentation.models.p(c13.getId(), c13.a(), (qVar == null || (c11 = qVar.c()) == null) ? c13.c() : c11.c()));
                }
                return block;
            }
            ru.ozon.android.messenger.blocks.chat.bx.b bVar4 = (ru.ozon.android.messenger.blocks.chat.bx.b) c12;
            List<? extends ru.ozon.android.messenger.framework.core.viewmapper.d<? extends Object, ? extends ru.ozon.android.messenger.framework.presentation.models.g>> b13 = b(bVar2, f.c.BX_CHAT.b());
            PreviewVO a13 = a(bVar4.h().h(), qVar, bVar);
            ru.ozon.android.messenger.blocks.chat.common.c h11 = bVar4.h();
            if (a13 == null) {
                a13 = bVar4.h().h();
            }
            uVar = new ru.ozon.android.messenger.framework.presentation.models.u(ru.ozon.android.messenger.blocks.chat.bx.b.e(bVar4, ru.ozon.android.messenger.blocks.chat.common.c.e(h11, a13)), bVar2.a(b13), e.a.f87374a);
        }
        uVar3 = uVar;
        if (uVar3 != null) {
        }
        return block;
    }
}
