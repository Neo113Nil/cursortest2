package ru.ozon.android.messenger.blocks.ai.input.presentation;

import C.o0;
import Ns.b;
import T7.E;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.ai.input.data.AiInputButton;
import ru.ozon.android.messenger.blocks.ai.input.data.Settings;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.android.messenger.framework.presentation.models.c;
import ru.ozon.android.messenger.framework.presentation.models.g;
import ru.ozon.uni.atoms.data.text.TextDTO;

/* loaded from: classes10.dex */
public final class a implements g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final c f84199a;

    /* renamed from: b, reason: collision with root package name */
    private final String f84200b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final TextDTO f84201c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C1461a f84202d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final String f84203e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.blocks.ai.input.data.a f84204f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final List<AiInputButton> f84205g;

    /* renamed from: h, reason: collision with root package name */
    private final Settings f84206h;

    /* renamed from: i, reason: collision with root package name */
    private final Object f84207i;

    /* renamed from: ru.ozon.android.messenger.blocks.ai.input.presentation.a$a, reason: collision with other inner class name */
    public static final class C1461a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f84208a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f84209b;

        public C1461a(@NotNull String str, @NotNull String focused) {
            Intrinsics.checkNotNullParameter(str, "default");
            Intrinsics.checkNotNullParameter(focused, "focused");
            this.f84208a = str;
            this.f84209b = focused;
        }

        @NotNull
        public final String a() {
            return this.f84208a;
        }

        @NotNull
        public final String b() {
            return this.f84209b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1461a)) {
                return false;
            }
            C1461a c1461a = (C1461a) obj;
            return Intrinsics.d(this.f84208a, c1461a.f84208a) && Intrinsics.d(this.f84209b, c1461a.f84209b);
        }

        public final int hashCode() {
            return this.f84209b.hashCode() + (this.f84208a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OutlineColor(default=");
            sb2.append(this.f84208a);
            sb2.append(", focused=");
            return o0.c(sb2, this.f84209b, ")");
        }
    }

    public a(@NotNull c blockId, String str, @NotNull TextDTO placeholder, @NotNull C1461a outlineColor, @NotNull String cursorColor, @NotNull ru.ozon.android.messenger.blocks.ai.input.data.a mode, @NotNull List<AiInputButton> iconButtons, Settings settings, Map<String, MessengerTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        Intrinsics.checkNotNullParameter(placeholder, "placeholder");
        Intrinsics.checkNotNullParameter(outlineColor, "outlineColor");
        Intrinsics.checkNotNullParameter(cursorColor, "cursorColor");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(iconButtons, "iconButtons");
        this.f84199a = blockId;
        this.f84200b = str;
        this.f84201c = placeholder;
        this.f84202d = outlineColor;
        this.f84203e = cursorColor;
        this.f84204f = mode;
        this.f84205g = iconButtons;
        this.f84206h = settings;
        this.f84207i = map;
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.util.Map] */
    public static a a(a aVar, String str, ru.ozon.android.messenger.blocks.ai.input.data.a aVar2, int i11) {
        c blockId = aVar.f84199a;
        TextDTO placeholder = aVar.f84201c;
        C1461a outlineColor = aVar.f84202d;
        String cursorColor = aVar.f84203e;
        if ((i11 & 32) != 0) {
            aVar2 = aVar.f84204f;
        }
        ru.ozon.android.messenger.blocks.ai.input.data.a mode = aVar2;
        List<AiInputButton> iconButtons = aVar.f84205g;
        Settings settings = aVar.f84206h;
        ?? r92 = aVar.f84207i;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        Intrinsics.checkNotNullParameter(placeholder, "placeholder");
        Intrinsics.checkNotNullParameter(outlineColor, "outlineColor");
        Intrinsics.checkNotNullParameter(cursorColor, "cursorColor");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(iconButtons, "iconButtons");
        return new a(blockId, str, placeholder, outlineColor, cursorColor, mode, iconButtons, settings, r92);
    }

    @NotNull
    public final String b() {
        return this.f84203e;
    }

    @NotNull
    public final List<AiInputButton> c() {
        return this.f84205g;
    }

    @NotNull
    public final ru.ozon.android.messenger.blocks.ai.input.data.a d() {
        return this.f84204f;
    }

    @NotNull
    public final C1461a e() {
        return this.f84202d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f84199a, aVar.f84199a) && Intrinsics.d(this.f84200b, aVar.f84200b) && Intrinsics.d(this.f84201c, aVar.f84201c) && this.f84202d.equals(aVar.f84202d) && Intrinsics.d(this.f84203e, aVar.f84203e) && this.f84204f == aVar.f84204f && Intrinsics.d(this.f84205g, aVar.f84205g) && Intrinsics.d(this.f84206h, aVar.f84206h) && this.f84207i.equals(aVar.f84207i);
    }

    @NotNull
    public final TextDTO f() {
        return this.f84201c;
    }

    public final Settings g() {
        return this.f84206h;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.models.g
    @NotNull
    public final c getBlockId() {
        return this.f84199a;
    }

    public final String h() {
        return this.f84200b;
    }

    public final int hashCode() {
        int hashCode = this.f84199a.hashCode() * 31;
        String str = this.f84200b;
        int b11 = G.g.b((this.f84204f.hashCode() + G.g.a((this.f84202d.hashCode() + b.a(this.f84201c, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31)) * 31, 31, this.f84203e)) * 31, 31, this.f84205g);
        Settings settings = this.f84206h;
        return this.f84207i.hashCode() + ((b11 + (settings != null ? settings.hashCode() : 0)) * 31);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map<java.lang.String, ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo>] */
    public final Map<String, MessengerTrackingInfo> i() {
        return this.f84207i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AiInputVO(blockId=");
        sb2.append(this.f84199a);
        sb2.append(", text=");
        sb2.append(this.f84200b);
        sb2.append(", placeholder=");
        sb2.append(this.f84201c);
        sb2.append(", outlineColor=");
        sb2.append(this.f84202d);
        sb2.append(", cursorColor=");
        sb2.append(this.f84203e);
        sb2.append(", mode=");
        sb2.append(this.f84204f);
        sb2.append(", iconButtons=");
        sb2.append(this.f84205g);
        sb2.append(", settings=");
        sb2.append(this.f84206h);
        sb2.append(", trackingInfo=");
        return E.c(this.f84207i, ")", sb2);
    }
}
