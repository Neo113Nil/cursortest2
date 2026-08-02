package ru.ozon.android.messenger.blocks.input;

import C.o0;
import Kk.C3532b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.presentation.models.C9514a;
import ru.ozon.android.messenger.framework.presentation.models.g;

/* loaded from: classes10.dex */
public final class d implements g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.presentation.models.c f85512a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f85513b;

    /* renamed from: c, reason: collision with root package name */
    private final String f85514c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f85515d;

    /* renamed from: e, reason: collision with root package name */
    private final String f85516e;

    /* renamed from: f, reason: collision with root package name */
    private final Map<String, String> f85517f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final a f85518g;

    /* renamed from: h, reason: collision with root package name */
    private final CustomBlockDTO f85519h;

    /* renamed from: i, reason: collision with root package name */
    private final C9514a f85520i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final List<SendButtonModeDTO> f85521j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final e f85522k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f85523l;

    /* renamed from: m, reason: collision with root package name */
    private final String f85524m;

    public d(@NotNull ru.ozon.android.messenger.framework.presentation.models.c blockId, boolean z11, String str, @NotNull String chatId, String str2, Map<String, String> map, @NotNull a config, CustomBlockDTO customBlockDTO, C9514a c9514a, @NotNull List<SendButtonModeDTO> sendButtonModes, @NotNull e currentModeName, boolean z12, String str3) {
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(sendButtonModes, "sendButtonModes");
        Intrinsics.checkNotNullParameter(currentModeName, "currentModeName");
        this.f85512a = blockId;
        this.f85513b = z11;
        this.f85514c = str;
        this.f85515d = chatId;
        this.f85516e = str2;
        this.f85517f = map;
        this.f85518g = config;
        this.f85519h = customBlockDTO;
        this.f85520i = c9514a;
        this.f85521j = sendButtonModes;
        this.f85522k = currentModeName;
        this.f85523l = z12;
        this.f85524m = str3;
    }

    public static d a(d dVar, String str, CustomBlockDTO customBlockDTO, e eVar, boolean z11, String str2, int i11) {
        ru.ozon.android.messenger.framework.presentation.models.c blockId = dVar.f85512a;
        boolean z12 = (i11 & 2) != 0 ? dVar.f85513b : false;
        String str3 = dVar.f85514c;
        String chatId = dVar.f85515d;
        String str4 = (i11 & 16) != 0 ? dVar.f85516e : str;
        Map<String, String> map = dVar.f85517f;
        a config = dVar.f85518g;
        CustomBlockDTO customBlockDTO2 = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? dVar.f85519h : customBlockDTO;
        C9514a c9514a = dVar.f85520i;
        List<SendButtonModeDTO> sendButtonModes = dVar.f85521j;
        e currentModeName = (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? dVar.f85522k : eVar;
        boolean z13 = (i11 & 2048) != 0 ? dVar.f85523l : z11;
        String str5 = (i11 & 4096) != 0 ? dVar.f85524m : str2;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(sendButtonModes, "sendButtonModes");
        Intrinsics.checkNotNullParameter(currentModeName, "currentModeName");
        return new d(blockId, z12, str3, chatId, str4, map, config, customBlockDTO2, c9514a, sendButtonModes, currentModeName, z13, str5);
    }

    public final C9514a b() {
        return this.f85520i;
    }

    @NotNull
    public final String c() {
        return this.f85515d;
    }

    @NotNull
    public final a d() {
        return this.f85518g;
    }

    @NotNull
    public final e e() {
        return this.f85522k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f85512a, dVar.f85512a) && this.f85513b == dVar.f85513b && Intrinsics.d(this.f85514c, dVar.f85514c) && Intrinsics.d(this.f85515d, dVar.f85515d) && Intrinsics.d(this.f85516e, dVar.f85516e) && Intrinsics.d(this.f85517f, dVar.f85517f) && Intrinsics.d(this.f85518g, dVar.f85518g) && Intrinsics.d(this.f85519h, dVar.f85519h) && Intrinsics.d(this.f85520i, dVar.f85520i) && Intrinsics.d(this.f85521j, dVar.f85521j) && Intrinsics.d(this.f85522k, dVar.f85522k) && this.f85523l == dVar.f85523l && Intrinsics.d(this.f85524m, dVar.f85524m);
    }

    public final CustomBlockDTO f() {
        return this.f85519h;
    }

    public final boolean g() {
        return this.f85523l;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.models.g
    @NotNull
    public final ru.ozon.android.messenger.framework.presentation.models.c getBlockId() {
        return this.f85512a;
    }

    public final Map<String, String> h() {
        return this.f85517f;
    }

    public final int hashCode() {
        int a11 = C3532b.a(this.f85512a.hashCode() * 31, 31, this.f85513b);
        String str = this.f85514c;
        int a12 = G.g.a((a11 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f85515d);
        String str2 = this.f85516e;
        int hashCode = (a12 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map<String, String> map = this.f85517f;
        int hashCode2 = (this.f85518g.hashCode() + ((hashCode + (map == null ? 0 : map.hashCode())) * 31)) * 31;
        CustomBlockDTO customBlockDTO = this.f85519h;
        int hashCode3 = (hashCode2 + (customBlockDTO == null ? 0 : customBlockDTO.hashCode())) * 31;
        C9514a c9514a = this.f85520i;
        int a13 = C3532b.a((this.f85522k.hashCode() + G.g.b((hashCode3 + (c9514a == null ? 0 : c9514a.hashCode())) * 31, 31, this.f85521j)) * 31, 31, this.f85523l);
        String str3 = this.f85524m;
        return a13 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String i() {
        return this.f85514c;
    }

    @NotNull
    public final List<SendButtonModeDTO> j() {
        return this.f85521j;
    }

    public final String k() {
        return this.f85516e;
    }

    public final String l() {
        return this.f85524m;
    }

    public final boolean m() {
        return this.f85513b;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InputVO(blockId=");
        sb2.append(this.f85512a);
        sb2.append(", isDisabled=");
        sb2.append(this.f85513b);
        sb2.append(", placeholder=");
        sb2.append(this.f85514c);
        sb2.append(", chatId=");
        sb2.append(this.f85515d);
        sb2.append(", text=");
        sb2.append(this.f85516e);
        sb2.append(", lexemes=");
        sb2.append(this.f85517f);
        sb2.append(", config=");
        sb2.append(this.f85518g);
        sb2.append(", customBlock=");
        sb2.append(this.f85519h);
        sb2.append(", actionCurtain=");
        sb2.append(this.f85520i);
        sb2.append(", sendButtonModes=");
        sb2.append(this.f85521j);
        sb2.append(", currentModeName=");
        sb2.append(this.f85522k);
        sb2.append(", keepCurrentState=");
        sb2.append(this.f85523l);
        sb2.append(", updateKey=");
        return o0.c(sb2, this.f85524m, ")");
    }
}
