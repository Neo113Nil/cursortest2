package ru.ozon.android.messenger.blocks.chat.search;

import T7.P;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

/* loaded from: classes10.dex */
public final class i implements ru.ozon.android.messenger.framework.presentation.models.g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.presentation.models.c f84613a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final TextDTO f84614b;

    /* renamed from: c, reason: collision with root package name */
    private final List<BadgeDTO> f84615c;

    /* renamed from: d, reason: collision with root package name */
    private final TextDTO f84616d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final a f84617e;

    /* renamed from: f, reason: collision with root package name */
    private final IconDTO f84618f;

    /* renamed from: g, reason: collision with root package name */
    private final List<Icon> f84619g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final String f84620h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final String f84621i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final String f84622j;

    /* renamed from: k, reason: collision with root package name */
    private final Map<String, MessengerTrackingInfo> f84623k;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final TextDTO f84624a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final DateTime f84625b;

        public a(@NotNull TextDTO textDTO, @NotNull DateTime timestamp) {
            Intrinsics.checkNotNullParameter(textDTO, "textDTO");
            Intrinsics.checkNotNullParameter(timestamp, "timestamp");
            this.f84624a = textDTO;
            this.f84625b = timestamp;
        }

        @NotNull
        public final TextDTO a() {
            return this.f84624a;
        }

        @NotNull
        public final DateTime b() {
            return this.f84625b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.d(this.f84624a, aVar.f84624a) && Intrinsics.d(this.f84625b, aVar.f84625b);
        }

        public final int hashCode() {
            return this.f84625b.hashCode() + (this.f84624a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return "SearchPreviewVO(textDTO=" + this.f84624a + ", timestamp=" + this.f84625b + ")";
        }
    }

    public i(@NotNull ru.ozon.android.messenger.framework.presentation.models.c blockId, @NotNull TextDTO title, List<BadgeDTO> list, TextDTO textDTO, @NotNull a preview, IconDTO iconDTO, List<Icon> list2, @NotNull String deeplink, @NotNull String messageId, @NotNull String chatId, Map<String, MessengerTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(preview, "preview");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        this.f84613a = blockId;
        this.f84614b = title;
        this.f84615c = list;
        this.f84616d = textDTO;
        this.f84617e = preview;
        this.f84618f = iconDTO;
        this.f84619g = list2;
        this.f84620h = deeplink;
        this.f84621i = messageId;
        this.f84622j = chatId;
        this.f84623k = map;
    }

    public final IconDTO a() {
        return this.f84618f;
    }

    public final List<BadgeDTO> b() {
        return this.f84615c;
    }

    @NotNull
    public final String c() {
        return this.f84622j;
    }

    public final TextDTO d() {
        return this.f84616d;
    }

    @NotNull
    public final String e() {
        return this.f84620h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.d(this.f84613a, iVar.f84613a) && Intrinsics.d(this.f84614b, iVar.f84614b) && Intrinsics.d(this.f84615c, iVar.f84615c) && Intrinsics.d(this.f84616d, iVar.f84616d) && Intrinsics.d(this.f84617e, iVar.f84617e) && Intrinsics.d(this.f84618f, iVar.f84618f) && Intrinsics.d(this.f84619g, iVar.f84619g) && Intrinsics.d(this.f84620h, iVar.f84620h) && Intrinsics.d(this.f84621i, iVar.f84621i) && Intrinsics.d(this.f84622j, iVar.f84622j) && Intrinsics.d(this.f84623k, iVar.f84623k);
    }

    @NotNull
    public final String f() {
        return this.f84621i;
    }

    @NotNull
    public final a g() {
        return this.f84617e;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.models.g
    @NotNull
    public final ru.ozon.android.messenger.framework.presentation.models.c getBlockId() {
        return this.f84613a;
    }

    @NotNull
    public final TextDTO h() {
        return this.f84614b;
    }

    public final int hashCode() {
        int a11 = Ns.b.a(this.f84614b, this.f84613a.hashCode() * 31, 31);
        List<BadgeDTO> list = this.f84615c;
        int hashCode = (a11 + (list == null ? 0 : list.hashCode())) * 31;
        TextDTO textDTO = this.f84616d;
        int hashCode2 = (this.f84617e.hashCode() + ((hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31)) * 31;
        IconDTO iconDTO = this.f84618f;
        int hashCode3 = (hashCode2 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
        List<Icon> list2 = this.f84619g;
        int a12 = G.g.a(G.g.a(G.g.a((hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31, 31, this.f84620h), 31, this.f84621i), 31, this.f84622j);
        Map<String, MessengerTrackingInfo> map = this.f84623k;
        return a12 + (map != null ? map.hashCode() : 0);
    }

    public final List<Icon> i() {
        return this.f84619g;
    }

    public final Map<String, MessengerTrackingInfo> j() {
        return this.f84623k;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SearchChatVO(blockId=");
        sb2.append(this.f84613a);
        sb2.append(", title=");
        sb2.append(this.f84614b);
        sb2.append(", badges=");
        sb2.append(this.f84615c);
        sb2.append(", conversationId=");
        sb2.append(this.f84616d);
        sb2.append(", preview=");
        sb2.append(this.f84617e);
        sb2.append(", avatarIcon=");
        sb2.append(this.f84618f);
        sb2.append(", titleIcons=");
        sb2.append(this.f84619g);
        sb2.append(", deeplink=");
        sb2.append(this.f84620h);
        sb2.append(", messageId=");
        sb2.append(this.f84621i);
        sb2.append(", chatId=");
        sb2.append(this.f84622j);
        sb2.append(", trackingInfo=");
        return P.f(sb2, this.f84623k, ")");
    }
}
