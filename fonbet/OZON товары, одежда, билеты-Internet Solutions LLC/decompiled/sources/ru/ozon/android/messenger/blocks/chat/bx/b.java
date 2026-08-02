package ru.ozon.android.messenger.blocks.chat.bx;

import El.C2971a;
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

/* loaded from: classes10.dex */
public final class b implements g, ru.ozon.android.messenger.blocks.chat.common.b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f84489a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final IconDTO f84490b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.blocks.chat.common.c f84491c;

    public b(@NotNull String title, @NotNull IconDTO avatarIcon, @NotNull ru.ozon.android.messenger.blocks.chat.common.c chatBaseInfoVO) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(avatarIcon, "avatarIcon");
        Intrinsics.checkNotNullParameter(chatBaseInfoVO, "chatBaseInfoVO");
        this.f84489a = title;
        this.f84490b = avatarIcon;
        this.f84491c = chatBaseInfoVO;
    }

    public static b e(b bVar, ru.ozon.android.messenger.blocks.chat.common.c chatBaseInfoVO) {
        String title = bVar.f84489a;
        Intrinsics.checkNotNullParameter(title, "title");
        IconDTO avatarIcon = bVar.f84490b;
        Intrinsics.checkNotNullParameter(avatarIcon, "avatarIcon");
        Intrinsics.checkNotNullParameter(chatBaseInfoVO, "chatBaseInfoVO");
        return new b(title, avatarIcon, chatBaseInfoVO);
    }

    @Override // ru.ozon.android.messenger.blocks.chat.common.b
    public final String a() {
        return this.f84491c.a();
    }

    @Override // ru.ozon.android.messenger.blocks.chat.common.b
    public final ContextMenuDTO b() {
        return this.f84491c.b();
    }

    @Override // ru.ozon.android.messenger.blocks.chat.common.b
    @NotNull
    public final List<ru.ozon.android.messenger.blocks.chat.common.menuItems.b> c() {
        return this.f84491c.c();
    }

    @Override // ru.ozon.android.messenger.blocks.chat.common.b
    @NotNull
    public final m d() {
        return this.f84491c.d();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f84489a, bVar.f84489a) && Intrinsics.d(this.f84490b, bVar.f84490b) && Intrinsics.d(this.f84491c, bVar.f84491c);
    }

    public final ru.ozon.android.messenger.blocks.chat.common.e f() {
        return this.f84491c.f();
    }

    @NotNull
    public final IconDTO g() {
        return this.f84490b;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.models.g
    @NotNull
    public final ru.ozon.android.messenger.framework.presentation.models.c getBlockId() {
        return this.f84491c.getBlockId();
    }

    @NotNull
    public final ru.ozon.android.messenger.blocks.chat.common.c h() {
        return this.f84491c;
    }

    public final int hashCode() {
        return this.f84491c.hashCode() + C2971a.a(this.f84490b, this.f84489a.hashCode() * 31, 31);
    }

    @NotNull
    public final Uri i() {
        return this.f84491c.g();
    }

    public final PreviewVO j() {
        return this.f84491c.h();
    }

    @NotNull
    public final String k() {
        return this.f84489a;
    }

    @NotNull
    public final List<Icon> l() {
        return this.f84491c.i();
    }

    @NotNull
    public final String toString() {
        return "BxChatVO(title=" + this.f84489a + ", avatarIcon=" + this.f84490b + ", chatBaseInfoVO=" + this.f84491c + ")";
    }
}
