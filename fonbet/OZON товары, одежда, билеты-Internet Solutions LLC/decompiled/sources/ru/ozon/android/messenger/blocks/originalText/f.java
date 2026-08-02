package ru.ozon.android.messenger.blocks.originalText;

import K1.G;
import T7.P;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

/* loaded from: classes10.dex */
public final class f implements ru.ozon.android.messenger.framework.presentation.models.g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.presentation.models.c f85996a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final a f85997b;

    /* renamed from: c, reason: collision with root package name */
    private final TextDTO f85998c;

    /* renamed from: d, reason: collision with root package name */
    private final String f85999d;

    /* renamed from: e, reason: collision with root package name */
    private final Map<String, MessengerTrackingInfo> f86000e;

    /* renamed from: f, reason: collision with root package name */
    private final Map<String, String> f86001f;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final TextDTO f86002a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f86003b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final String f86004c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private final AtomActionDTO f86005d;

        public a(@NotNull TextDTO text, @NotNull String icon, @NotNull String iconTintColor, @NotNull AtomActionDTO action) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(iconTintColor, "iconTintColor");
            Intrinsics.checkNotNullParameter(action, "action");
            this.f86002a = text;
            this.f86003b = icon;
            this.f86004c = iconTintColor;
            this.f86005d = action;
        }

        @NotNull
        public final AtomActionDTO a() {
            return this.f86005d;
        }

        @NotNull
        public final String b() {
            return this.f86003b;
        }

        @NotNull
        public final String c() {
            return this.f86004c;
        }

        @NotNull
        public final TextDTO d() {
            return this.f86002a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.d(this.f86002a, aVar.f86002a) && Intrinsics.d(this.f86003b, aVar.f86003b) && Intrinsics.d(this.f86004c, aVar.f86004c) && Intrinsics.d(this.f86005d, aVar.f86005d);
        }

        public final int hashCode() {
            return this.f86005d.hashCode() + G.g.a(G.g.a(this.f86002a.hashCode() * 31, 31, this.f86003b), 31, this.f86004c);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OriginalTextButtonVO(text=");
            sb2.append(this.f86002a);
            sb2.append(", icon=");
            sb2.append(this.f86003b);
            sb2.append(", iconTintColor=");
            sb2.append(this.f86004c);
            sb2.append(", action=");
            return G.c(sb2, this.f86005d, ")");
        }
    }

    public f(@NotNull ru.ozon.android.messenger.framework.presentation.models.c blockId, @NotNull a button, TextDTO textDTO, String str, Map<String, MessengerTrackingInfo> map, Map<String, String> map2) {
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        Intrinsics.checkNotNullParameter(button, "button");
        this.f85996a = blockId;
        this.f85997b = button;
        this.f85998c = textDTO;
        this.f85999d = str;
        this.f86000e = map;
        this.f86001f = map2;
    }

    public static f a(f fVar, TextDTO textDTO, String str, int i11) {
        ru.ozon.android.messenger.framework.presentation.models.c blockId = fVar.f85996a;
        a button = fVar.f85997b;
        if ((i11 & 4) != 0) {
            textDTO = fVar.f85998c;
        }
        TextDTO textDTO2 = textDTO;
        if ((i11 & 8) != 0) {
            str = fVar.f85999d;
        }
        Map<String, MessengerTrackingInfo> map = fVar.f86000e;
        Map<String, String> map2 = fVar.f86001f;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        Intrinsics.checkNotNullParameter(button, "button");
        return new f(blockId, button, textDTO2, str, map, map2);
    }

    @NotNull
    public final a b() {
        return this.f85997b;
    }

    public final String c() {
        return this.f85999d;
    }

    public final TextDTO d() {
        return this.f85998c;
    }

    public final Map<String, MessengerTrackingInfo> e() {
        return this.f86000e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.d(this.f85996a, fVar.f85996a) && Intrinsics.d(this.f85997b, fVar.f85997b) && Intrinsics.d(this.f85998c, fVar.f85998c) && Intrinsics.d(this.f85999d, fVar.f85999d) && Intrinsics.d(this.f86000e, fVar.f86000e) && Intrinsics.d(this.f86001f, fVar.f86001f);
    }

    @Override // ru.ozon.android.messenger.framework.presentation.models.g
    @NotNull
    public final ru.ozon.android.messenger.framework.presentation.models.c getBlockId() {
        return this.f85996a;
    }

    public final int hashCode() {
        int hashCode = (this.f85997b.hashCode() + (this.f85996a.hashCode() * 31)) * 31;
        TextDTO textDTO = this.f85998c;
        int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        String str = this.f85999d;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, MessengerTrackingInfo> map = this.f86000e;
        int hashCode4 = (hashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, String> map2 = this.f86001f;
        return hashCode4 + (map2 != null ? map2.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OriginalTextVO(blockId=");
        sb2.append(this.f85996a);
        sb2.append(", button=");
        sb2.append(this.f85997b);
        sb2.append(", originalText=");
        sb2.append(this.f85998c);
        sb2.append(", error=");
        sb2.append(this.f85999d);
        sb2.append(", trackingInfo=");
        sb2.append(this.f86000e);
        sb2.append(", lexemes=");
        return P.f(sb2, this.f86001f, ")");
    }
}
