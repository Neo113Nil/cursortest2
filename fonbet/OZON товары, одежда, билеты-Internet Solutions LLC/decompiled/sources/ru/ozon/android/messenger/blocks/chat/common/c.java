package ru.ozon.android.messenger.blocks.chat.common;

import android.net.Uri;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.data.remote.models.items.ContextMenuDTO;
import ru.ozon.uni.atoms.data.button.Icon;

/* loaded from: classes10.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.presentation.models.c f84502a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final m f84503b;

    /* renamed from: c, reason: collision with root package name */
    private final String f84504c;

    /* renamed from: d, reason: collision with root package name */
    private final PreviewVO f84505d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final List<Icon> f84506e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final Uri f84507f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final Object f84508g;

    /* renamed from: h, reason: collision with root package name */
    private final e f84509h;

    /* renamed from: i, reason: collision with root package name */
    private final ContextMenuDTO f84510i;

    public c(@NotNull ru.ozon.android.messenger.framework.presentation.models.c blockId, @NotNull m unreadCountIndicator, String str, PreviewVO previewVO, @NotNull List<Icon> titleIcons, @NotNull Uri deeplink, @NotNull List<ru.ozon.android.messenger.blocks.chat.common.menuItems.b> contextMenuItems, e eVar, ContextMenuDTO contextMenuDTO) {
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        Intrinsics.checkNotNullParameter(unreadCountIndicator, "unreadCountIndicator");
        Intrinsics.checkNotNullParameter(titleIcons, "titleIcons");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(contextMenuItems, "contextMenuItems");
        this.f84502a = blockId;
        this.f84503b = unreadCountIndicator;
        this.f84504c = str;
        this.f84505d = previewVO;
        this.f84506e = titleIcons;
        this.f84507f = deeplink;
        this.f84508g = contextMenuItems;
        this.f84509h = eVar;
        this.f84510i = contextMenuDTO;
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.List] */
    public static c e(c cVar, PreviewVO previewVO) {
        ru.ozon.android.messenger.framework.presentation.models.c blockId = cVar.f84502a;
        m unreadCountIndicator = cVar.f84503b;
        String str = cVar.f84504c;
        List<Icon> titleIcons = cVar.f84506e;
        Uri deeplink = cVar.f84507f;
        ?? contextMenuItems = cVar.f84508g;
        e eVar = cVar.f84509h;
        ContextMenuDTO contextMenuDTO = cVar.f84510i;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        Intrinsics.checkNotNullParameter(unreadCountIndicator, "unreadCountIndicator");
        Intrinsics.checkNotNullParameter(titleIcons, "titleIcons");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(contextMenuItems, "contextMenuItems");
        return new c(blockId, unreadCountIndicator, str, previewVO, titleIcons, deeplink, contextMenuItems, eVar, contextMenuDTO);
    }

    @Override // ru.ozon.android.messenger.blocks.chat.common.b
    public final String a() {
        return this.f84504c;
    }

    @Override // ru.ozon.android.messenger.blocks.chat.common.b
    public final ContextMenuDTO b() {
        return this.f84510i;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List<ru.ozon.android.messenger.blocks.chat.common.menuItems.b>] */
    @Override // ru.ozon.android.messenger.blocks.chat.common.b
    @NotNull
    public final List<ru.ozon.android.messenger.blocks.chat.common.menuItems.b> c() {
        return this.f84508g;
    }

    @Override // ru.ozon.android.messenger.blocks.chat.common.b
    @NotNull
    public final m d() {
        return this.f84503b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f84502a, cVar.f84502a) && this.f84503b.equals(cVar.f84503b) && Intrinsics.d(this.f84504c, cVar.f84504c) && Intrinsics.d(this.f84505d, cVar.f84505d) && Intrinsics.d(this.f84506e, cVar.f84506e) && Intrinsics.d(this.f84507f, cVar.f84507f) && Intrinsics.d(this.f84508g, cVar.f84508g) && this.f84509h == cVar.f84509h && Intrinsics.d(this.f84510i, cVar.f84510i);
    }

    public final e f() {
        return this.f84509h;
    }

    @NotNull
    public final Uri g() {
        return this.f84507f;
    }

    @Override // ru.ozon.android.messenger.blocks.chat.common.b
    @NotNull
    public final ru.ozon.android.messenger.framework.presentation.models.c getBlockId() {
        return this.f84502a;
    }

    public final PreviewVO h() {
        return this.f84505d;
    }

    public final int hashCode() {
        int hashCode = (this.f84503b.hashCode() + (this.f84502a.hashCode() * 31)) * 31;
        String str = this.f84504c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        PreviewVO previewVO = this.f84505d;
        int c11 = H00.a.c((this.f84507f.hashCode() + G.g.b((hashCode2 + (previewVO == null ? 0 : previewVO.hashCode())) * 31, 31, this.f84506e)) * 31, 31, this.f84508g);
        e eVar = this.f84509h;
        int hashCode3 = (c11 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        ContextMenuDTO contextMenuDTO = this.f84510i;
        return hashCode3 + (contextMenuDTO != null ? contextMenuDTO.hashCode() : 0);
    }

    @NotNull
    public final List<Icon> i() {
        return this.f84506e;
    }

    @NotNull
    public final String toString() {
        return "ChatBaseInfoVO(blockId=" + this.f84502a + ", unreadCountIndicator=" + this.f84503b + ", firstUnreadMessageId=" + this.f84504c + ", preview=" + this.f84505d + ", titleIcons=" + this.f84506e + ", deeplink=" + this.f84507f + ", contextMenuItems=" + this.f84508g + ", animation=" + this.f84509h + ", contextMenu=" + this.f84510i + ")";
    }
}
