package ru.ozon.android.messenger.framework.data.local.mapper;

import Sc.o;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.T;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import ru.ozon.android.messenger.blocks.input.CustomBlockDTO;
import ru.ozon.android.messenger.blocks.messagefile.FileDTO;
import ru.ozon.android.messenger.blocks.messageimage.ImageDTO;
import ru.ozon.android.messenger.blocks.messagetext.f;
import ru.ozon.android.messenger.framework.core.viewmapper.d;
import ru.ozon.android.messenger.framework.core.viewmapper.e;
import ru.ozon.android.messenger.framework.data.b;
import ru.ozon.android.messenger.framework.data.local.database.undelivered.entity.UndeliveredMessageEntity;
import ru.ozon.android.messenger.framework.data.remote.models.blocks.BlockDTO;
import ru.ozon.android.messenger.framework.data.remote.models.items.ContextMenuDTO;
import ru.ozon.android.messenger.framework.domain.f;
import ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.y0;
import ru.ozon.android.messenger.framework.presentation.models.C9515b;
import ru.ozon.android.messenger.framework.presentation.models.g;
import ru.ozon.android.messenger.framework.presentation.models.h;
import ru.ozon.android.messenger.framework.presentation.models.p;
import ru.ozon.android.messenger.framework.presentation.models.q;
import ru.ozon.android.messenger.framework.presentation.models.s;
import ru.ozon.android.messenger.framework.presentation.models.t;
import ru.ozon.android.messenger.framework.presentation.models.u;
import ru.ozon.android.messenger.framework.presentation.models.z;

/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.data.b f87611a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.blocks.messageimage.a f87612b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.blocks.messagefile.a f87613c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.data.remote.mapper.a f87614d;

    public c(@NotNull ru.ozon.android.messenger.blocks.messagefile.a fileMapper, @NotNull ru.ozon.android.messenger.blocks.messageimage.a imageMapper, @NotNull ru.ozon.android.messenger.framework.data.b blockStore, @NotNull ru.ozon.android.messenger.framework.data.remote.mapper.a blocksItemMapper) {
        Intrinsics.checkNotNullParameter(blockStore, "blockStore");
        Intrinsics.checkNotNullParameter(imageMapper, "imageMapper");
        Intrinsics.checkNotNullParameter(fileMapper, "fileMapper");
        Intrinsics.checkNotNullParameter(blocksItemMapper, "blocksItemMapper");
        this.f87611a = blockStore;
        this.f87612b = imageMapper;
        this.f87613c = fileMapper;
        this.f87614d = blocksItemMapper;
    }

    private static List a(ru.ozon.android.messenger.framework.data.b bVar, String str) {
        Object obj;
        List<d<? extends Object, ? extends g>> c11 = bVar.c(b.a.a("messenger", str));
        if (c11 != null) {
            Iterator<T> it = c11.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C7705l.l(((d) obj).getSupportedVersions(), 1L)) {
                    break;
                }
            }
            if (obj != null) {
                return c11;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static UndeliveredMessageEntity b(@NotNull q itemVO, @NotNull ru.ozon.android.messenger.framework.data.remote.models.c model, @NotNull String chatId) {
        g c11;
        UndeliveredMessageEntity.UndeliveredMessage undeliveredMessage;
        FileDTO a11;
        UndeliveredMessageEntity.UndeliveredMessage.Text text;
        Spannable d11;
        String obj;
        Intrinsics.checkNotNullParameter(itemVO, "itemVO");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        p c12 = itemVO.c();
        s sVar = c12 instanceof s ? (s) c12 : null;
        if (sVar != null) {
            String g10 = model.g();
            BlockDTO e11 = model.e();
            int i11 = e11 != null ? 1 : 0;
            u uVar = (u) C7714v.Q(i11, itemVO.b());
            if (uVar != null && (c11 = uVar.c()) != null) {
                if (c11 instanceof f) {
                    String obj2 = ((f) c11).d().toString();
                    y0 f7 = model.f();
                    y0.d dVar = f7 instanceof y0.d ? (y0.d) f7 : null;
                    text = new UndeliveredMessageEntity.UndeliveredMessage.Text(obj2, dVar != null ? dVar.a() : null, g10, e11);
                } else {
                    String str = "";
                    if (c11 instanceof ru.ozon.android.messenger.blocks.order.b) {
                        u uVar2 = (u) C7714v.Q(i11 + 1, itemVO.b());
                        g c13 = uVar2 != null ? uVar2.c() : null;
                        f fVar = c13 instanceof f ? (f) c13 : null;
                        if (fVar == null || (d11 = fVar.d()) == null || (obj = d11.toString()) == null) {
                            Intrinsics.checkNotNullParameter(T.f71792a, "<this>");
                        } else {
                            str = obj;
                        }
                        y0 f11 = model.f();
                        y0.d dVar2 = f11 instanceof y0.d ? (y0.d) f11 : null;
                        text = new UndeliveredMessageEntity.UndeliveredMessage.Text(str, dVar2 != null ? dVar2.a() : null, g10, e11);
                    } else {
                        if (c11 instanceof ru.ozon.android.messenger.blocks.messageimage.c) {
                            ru.ozon.android.messenger.blocks.messageimage.c cVar = (ru.ozon.android.messenger.blocks.messageimage.c) c11;
                            String c14 = cVar.c();
                            undeliveredMessage = new UndeliveredMessageEntity.UndeliveredMessage.Image(c14 == null ? "" : c14, cVar.e(), new ImageDTO(cVar.e(), cVar.c(), cVar.d(), cVar.getWidth(), cVar.getHeight()), null, null, 24, null);
                        } else if (c11 instanceof ru.ozon.android.messenger.blocks.messagefile.c) {
                            ru.ozon.android.messenger.blocks.messagefile.c cVar2 = (ru.ozon.android.messenger.blocks.messagefile.c) c11;
                            String i12 = cVar2.i();
                            y0 f12 = model.f();
                            y0.b bVar = f12 instanceof y0.b ? (y0.b) f12 : null;
                            undeliveredMessage = new UndeliveredMessageEntity.UndeliveredMessage.File(i12, (bVar == null || (a11 = bVar.a()) == null) ? null : a11.getUrl(), new FileDTO(cVar2.i(), cVar2.e(), cVar2.g(), cVar2.f(), cVar2.h()), null, null, 24, null);
                        } else {
                            undeliveredMessage = null;
                        }
                        if (undeliveredMessage != null) {
                            return new UndeliveredMessageEntity(h.b(c11), chatId, sVar.h().getMillis(), undeliveredMessage);
                        }
                    }
                }
                undeliveredMessage = text;
                if (undeliveredMessage != null) {
                }
            }
        }
        return null;
    }

    @NotNull
    public final q c(@NotNull UndeliveredMessageEntity entity) {
        Iterable a02;
        u e11;
        Intrinsics.checkNotNullParameter(entity, "entity");
        DateTime dateTime = new DateTime(entity.d());
        s sVar = new s(entity.b(), entity.b(), (t) t.c.f91549a, (C9515b) null, dateTime, dateTime, entity.d(), false, true, true, false, 1, (z) z.b.f91564a, (ContextMenuDTO) null, (p.b) null, (Map) null, (String) null, 32768);
        BlockDTO localMessageBlock = entity.c().getLocalMessageBlock();
        List a03 = (localMessageBlock == null || (e11 = this.f87614d.e(localMessageBlock, entity.b())) == null) ? null : C7714v.a0(e11);
        if (a03 == null) {
            a03 = K.f71697a;
        }
        UndeliveredMessageEntity.UndeliveredMessage c11 = entity.c();
        boolean z11 = c11 instanceof UndeliveredMessageEntity.UndeliveredMessage.Text;
        ru.ozon.android.messenger.framework.data.b bVar = this.f87611a;
        if (z11) {
            UndeliveredMessageEntity.UndeliveredMessage.Text text = (UndeliveredMessageEntity.UndeliveredMessage.Text) entity.c();
            ru.ozon.android.messenger.framework.presentation.models.c a11 = h.a(sVar.getId());
            CustomBlockDTO customBlockDTO = text.getCustomBlockDTO();
            ru.ozon.android.messenger.blocks.order.b a12 = customBlockDTO != null ? ru.ozon.android.messenger.blocks.messagetext.a.a(customBlockDTO, a11) : null;
            f fVar = new f(a11, SpannableString.valueOf(text.getMessageText()), null, null);
            List<? extends d<? extends Object, ? extends g>> a13 = a(bVar, f.c.TEXT.b());
            List<? extends d<? extends Object, ? extends g>> a14 = a(bVar, f.c.ORDER.b());
            Tc.b builder = C7714v.B();
            if (a12 != null) {
                builder.add(new u(a12, bVar.a(a14), e.a.f87374a));
            }
            if (fVar.d().length() > 0) {
                builder.add(new u(fVar, bVar.a(a13), e.a.f87374a));
            }
            Intrinsics.checkNotNullParameter(builder, "builder");
            a02 = builder.B();
        } else if (c11 instanceof UndeliveredMessageEntity.UndeliveredMessage.Image) {
            UndeliveredMessageEntity.UndeliveredMessage.Image image = (UndeliveredMessageEntity.UndeliveredMessage.Image) entity.c();
            ImageDTO dto = image.getImageDTO();
            ru.ozon.android.messenger.framework.presentation.models.c blockId = h.a(sVar.getId());
            this.f87612b.getClass();
            Intrinsics.checkNotNullParameter(dto, "dto");
            Intrinsics.checkNotNullParameter(blockId, "blockId");
            List a04 = C7714v.a0(ru.ozon.android.messenger.blocks.messageimage.a.a(dto, blockId));
            List<? extends d<? extends Object, ? extends g>> a15 = a(bVar, f.c.IMAGE.b());
            ru.ozon.android.messenger.blocks.messageimage.c cVar = (ru.ozon.android.messenger.blocks.messageimage.c) C7714v.K(a04);
            String remoteUrlString = image.getRemoteUrlString();
            if (remoteUrlString == null) {
                remoteUrlString = image.getLocalUriString();
            }
            a02 = C7714v.a0(new u(ru.ozon.android.messenger.blocks.messageimage.c.a(cVar, remoteUrlString, image.getLocalUriString(), null, 505), bVar.a(a15), e.a.f87374a));
        } else {
            if (!(c11 instanceof UndeliveredMessageEntity.UndeliveredMessage.File)) {
                throw new o();
            }
            UndeliveredMessageEntity.UndeliveredMessage.File file = (UndeliveredMessageEntity.UndeliveredMessage.File) entity.c();
            FileDTO fileDTO = file.getFileDTO();
            ru.ozon.android.messenger.framework.presentation.models.c a16 = h.a(sVar.getId());
            this.f87613c.getClass();
            List a17 = ru.ozon.android.messenger.blocks.messagefile.a.a(fileDTO, a16);
            List<? extends d<? extends Object, ? extends g>> a18 = a(bVar, f.c.FILE.b());
            ru.ozon.android.messenger.blocks.messagefile.c cVar2 = (ru.ozon.android.messenger.blocks.messagefile.c) C7714v.K(a17);
            String remoteUrlString2 = file.getRemoteUrlString();
            if (remoteUrlString2 == null) {
                remoteUrlString2 = file.getLocalUriString();
            }
            a02 = C7714v.a0(new u(ru.ozon.android.messenger.blocks.messagefile.c.c(cVar2, remoteUrlString2, file.getLocalUriString(), false, 505), bVar.a(a18), e.a.f87374a));
        }
        ArrayList p02 = C7714v.p0(a02, a03);
        return new q(p02, s.d(sVar, null, null, null, 0.0d, false, false, p02.size(), null, 258047));
    }
}
