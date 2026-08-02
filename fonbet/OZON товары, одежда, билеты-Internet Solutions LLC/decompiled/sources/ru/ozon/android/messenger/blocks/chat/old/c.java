package ru.ozon.android.messenger.blocks.chat.old;

import android.net.Uri;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.chat.common.PreviewVO;
import ru.ozon.android.messenger.blocks.chat.common.m;
import ru.ozon.android.messenger.framework.data.remote.models.items.ContextMenuDTO;
import ru.ozon.android.messenger.framework.presentation.models.g;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

/* loaded from: classes10.dex */
public final class c implements g, ru.ozon.android.messenger.blocks.chat.common.b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final TextDTO f84566a;

    /* renamed from: b, reason: collision with root package name */
    private final IconDTO f84567b;

    /* renamed from: c, reason: collision with root package name */
    private final ru.ozon.android.messenger.blocks.chat.common.a f84568c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.blocks.chat.common.c f84569d;

    public c(@NotNull TextDTO titleAtom, IconDTO iconDTO, ru.ozon.android.messenger.blocks.chat.common.a aVar, @NotNull ru.ozon.android.messenger.blocks.chat.common.c chatBaseInfoVO) {
        Intrinsics.checkNotNullParameter(titleAtom, "titleAtom");
        Intrinsics.checkNotNullParameter(chatBaseInfoVO, "chatBaseInfoVO");
        this.f84566a = titleAtom;
        this.f84567b = iconDTO;
        this.f84568c = aVar;
        this.f84569d = chatBaseInfoVO;
    }

    public static c e(c cVar, ru.ozon.android.messenger.blocks.chat.common.c chatBaseInfoVO) {
        TextDTO titleAtom = cVar.f84566a;
        Intrinsics.checkNotNullParameter(titleAtom, "titleAtom");
        Intrinsics.checkNotNullParameter(chatBaseInfoVO, "chatBaseInfoVO");
        return new c(titleAtom, cVar.f84567b, cVar.f84568c, chatBaseInfoVO);
    }

    @Override // ru.ozon.android.messenger.blocks.chat.common.b
    public final String a() {
        return this.f84569d.a();
    }

    @Override // ru.ozon.android.messenger.blocks.chat.common.b
    public final ContextMenuDTO b() {
        return this.f84569d.b();
    }

    @Override // ru.ozon.android.messenger.blocks.chat.common.b
    @NotNull
    public final List<ru.ozon.android.messenger.blocks.chat.common.menuItems.b> c() {
        return this.f84569d.c();
    }

    @Override // ru.ozon.android.messenger.blocks.chat.common.b
    @NotNull
    public final m d() {
        return this.f84569d.d();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f84566a, cVar.f84566a) && Intrinsics.d(this.f84567b, cVar.f84567b) && this.f84568c == cVar.f84568c && Intrinsics.d(this.f84569d, cVar.f84569d);
    }

    public final ru.ozon.android.messenger.blocks.chat.common.e f() {
        return this.f84569d.f();
    }

    public final IconDTO g() {
        return this.f84567b;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.models.g
    @NotNull
    public final ru.ozon.android.messenger.framework.presentation.models.c getBlockId() {
        return this.f84569d.getBlockId();
    }

    public final ru.ozon.android.messenger.blocks.chat.common.a h() {
        return this.f84568c;
    }

    public final int hashCode() {
        int hashCode = this.f84566a.hashCode() * 31;
        IconDTO iconDTO = this.f84567b;
        int hashCode2 = (hashCode + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
        ru.ozon.android.messenger.blocks.chat.common.a aVar = this.f84568c;
        return this.f84569d.hashCode() + ((hashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31);
    }

    @NotNull
    public final ru.ozon.android.messenger.blocks.chat.common.c i() {
        return this.f84569d;
    }

    @NotNull
    public final Uri j() {
        return this.f84569d.g();
    }

    public final PreviewVO k() {
        return this.f84569d.h();
    }

    @NotNull
    public final TextDTO l() {
        return this.f84566a;
    }

    @NotNull
    public final List<Icon> m() {
        return this.f84569d.i();
    }

    @NotNull
    public final String toString() {
        return "ChatVO(titleAtom=" + this.f84566a + ", avatarIcon=" + this.f84567b + ", avatarIconVerticalAlignment=" + this.f84568c + ", chatBaseInfoVO=" + this.f84569d + ")";
    }
}
