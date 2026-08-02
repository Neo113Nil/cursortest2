package ru.ozon.android.messenger.blocks.chat.sx;

import android.net.Uri;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.chat.common.PreviewVO;
import ru.ozon.android.messenger.blocks.chat.common.m;
import ru.ozon.android.messenger.framework.data.remote.models.items.ContextMenuDTO;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

/* loaded from: classes10.dex */
public final class b implements ru.ozon.android.messenger.framework.presentation.models.g, ru.ozon.android.messenger.blocks.chat.common.b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f84630a;

    /* renamed from: b, reason: collision with root package name */
    private final List<BadgeDTO> f84631b;

    /* renamed from: c, reason: collision with root package name */
    private final String f84632c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final a f84633d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.blocks.chat.common.c f84634e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a EXTENDED;
        public static final a INVALID;
        public static final a REGULAR;

        static {
            a aVar = new a("INVALID", 0);
            INVALID = aVar;
            a aVar2 = new a("REGULAR", 1);
            REGULAR = aVar2;
            a aVar3 = new a("EXTENDED", 2);
            EXTENDED = aVar3;
            a[] aVarArr = {aVar, aVar2, aVar3};
            $VALUES = aVarArr;
            $ENTRIES = Xc.b.a(aVarArr);
        }

        private a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public b(@NotNull String title, List list, String str, @NotNull a displayType, @NotNull ru.ozon.android.messenger.blocks.chat.common.c chatBaseInfoVO) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(displayType, "displayType");
        Intrinsics.checkNotNullParameter(chatBaseInfoVO, "chatBaseInfoVO");
        this.f84630a = title;
        this.f84631b = list;
        this.f84632c = str;
        this.f84633d = displayType;
        this.f84634e = chatBaseInfoVO;
    }

    public static b e(b bVar, ru.ozon.android.messenger.blocks.chat.common.c chatBaseInfoVO) {
        String title = bVar.f84630a;
        Intrinsics.checkNotNullParameter(title, "title");
        a displayType = bVar.f84633d;
        Intrinsics.checkNotNullParameter(displayType, "displayType");
        Intrinsics.checkNotNullParameter(chatBaseInfoVO, "chatBaseInfoVO");
        return new b(title, bVar.f84631b, bVar.f84632c, displayType, chatBaseInfoVO);
    }

    @Override // ru.ozon.android.messenger.blocks.chat.common.b
    public final String a() {
        return this.f84634e.a();
    }

    @Override // ru.ozon.android.messenger.blocks.chat.common.b
    public final ContextMenuDTO b() {
        return this.f84634e.b();
    }

    @Override // ru.ozon.android.messenger.blocks.chat.common.b
    @NotNull
    public final List<ru.ozon.android.messenger.blocks.chat.common.menuItems.b> c() {
        return this.f84634e.c();
    }

    @Override // ru.ozon.android.messenger.blocks.chat.common.b
    @NotNull
    public final m d() {
        return this.f84634e.d();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f84630a, bVar.f84630a) && Intrinsics.d(this.f84631b, bVar.f84631b) && Intrinsics.d(this.f84632c, bVar.f84632c) && this.f84633d == bVar.f84633d && this.f84634e.equals(bVar.f84634e);
    }

    public final ru.ozon.android.messenger.blocks.chat.common.e f() {
        return this.f84634e.f();
    }

    @NotNull
    public final ru.ozon.android.messenger.blocks.chat.common.c g() {
        return this.f84634e;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.models.g
    @NotNull
    public final ru.ozon.android.messenger.framework.presentation.models.c getBlockId() {
        return this.f84634e.getBlockId();
    }

    public final String h() {
        return this.f84632c;
    }

    public final int hashCode() {
        int hashCode = this.f84630a.hashCode() * 31;
        List<BadgeDTO> list = this.f84631b;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.f84632c;
        return this.f84634e.hashCode() + ((this.f84633d.hashCode() + ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31)) * 961);
    }

    @NotNull
    public final Uri i() {
        return this.f84634e.g();
    }

    @NotNull
    public final a j() {
        return this.f84633d;
    }

    public final PreviewVO k() {
        return this.f84634e.h();
    }

    public final List<BadgeDTO> l() {
        return this.f84631b;
    }

    @NotNull
    public final String m() {
        return this.f84630a;
    }

    @NotNull
    public final List<Icon> n() {
        return this.f84634e.i();
    }

    @NotNull
    public final String toString() {
        return "SxChatVO(title=" + this.f84630a + ", previewBadges=" + this.f84631b + ", conversationId=" + this.f84632c + ", displayType=" + this.f84633d + ", chatType=null, chatBaseInfoVO=" + this.f84634e + ")";
    }
}
