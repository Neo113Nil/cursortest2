package ru.ozon.android.messenger.blocks.emptystate.v2;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.emptystate.g;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.android.messenger.framework.presentation.models.n;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

/* loaded from: classes10.dex */
public final class g implements ru.ozon.android.messenger.framework.presentation.models.g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.presentation.models.c f85126a;

    /* renamed from: b, reason: collision with root package name */
    private final ImageDTO f85127b;

    /* renamed from: c, reason: collision with root package name */
    private final n.a f85128c;

    /* renamed from: d, reason: collision with root package name */
    private final TextDTO f85129d;

    /* renamed from: e, reason: collision with root package name */
    private final TextDTO f85130e;

    /* renamed from: f, reason: collision with root package name */
    private final Boolean f85131f;

    /* renamed from: g, reason: collision with root package name */
    private final List<ButtonV3DTO> f85132g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final a f85133h;

    /* renamed from: i, reason: collision with root package name */
    private final Map<String, MessengerTrackingInfo> f85134i;

    /* renamed from: j, reason: collision with root package name */
    private final ru.ozon.android.messenger.blocks.emptystate.g f85135j;

    public g() {
        throw null;
    }

    public g(ru.ozon.android.messenger.framework.presentation.models.c blockId, ImageDTO imageDTO, n.a aVar, TextDTO textDTO, TextDTO textDTO2, Boolean bool, List list, a buttonLayout, Map map, g.a aVar2, int i11) {
        textDTO2 = (i11 & 16) != 0 ? null : textDTO2;
        bool = (i11 & 64) != 0 ? Boolean.TRUE : bool;
        list = (i11 & 256) != 0 ? null : list;
        buttonLayout = (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? a.HORIZONTAL : buttonLayout;
        map = (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : map;
        aVar2 = (i11 & 2048) != 0 ? null : aVar2;
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        Intrinsics.checkNotNullParameter(buttonLayout, "buttonLayout");
        this.f85126a = blockId;
        this.f85127b = imageDTO;
        this.f85128c = aVar;
        this.f85129d = textDTO;
        this.f85130e = textDTO2;
        this.f85131f = bool;
        this.f85132g = list;
        this.f85133h = buttonLayout;
        this.f85134i = map;
        this.f85135j = aVar2;
    }

    @NotNull
    public final a a() {
        return this.f85133h;
    }

    public final List<ButtonV3DTO> b() {
        return this.f85132g;
    }

    public final ru.ozon.android.messenger.blocks.emptystate.g c() {
        return this.f85135j;
    }

    public final TextDTO d() {
        return this.f85130e;
    }

    public final ImageDTO e() {
        return this.f85127b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.d(this.f85126a, gVar.f85126a) && Intrinsics.d(this.f85127b, gVar.f85127b) && Intrinsics.d(this.f85128c, gVar.f85128c) && Intrinsics.d(this.f85129d, gVar.f85129d) && Intrinsics.d(this.f85130e, gVar.f85130e) && Intrinsics.d(this.f85131f, gVar.f85131f) && Intrinsics.d(this.f85132g, gVar.f85132g) && this.f85133h == gVar.f85133h && Intrinsics.d(this.f85134i, gVar.f85134i) && Intrinsics.d(this.f85135j, gVar.f85135j);
    }

    public final n f() {
        return this.f85128c;
    }

    public final TextDTO g() {
        return this.f85129d;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.models.g
    @NotNull
    public final ru.ozon.android.messenger.framework.presentation.models.c getBlockId() {
        return this.f85126a;
    }

    public final Map<String, MessengerTrackingInfo> h() {
        return this.f85134i;
    }

    public final int hashCode() {
        int hashCode = this.f85126a.hashCode() * 31;
        ImageDTO imageDTO = this.f85127b;
        int hashCode2 = (hashCode + (imageDTO == null ? 0 : imageDTO.hashCode())) * 31;
        n.a aVar = this.f85128c;
        int hashCode3 = (hashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        TextDTO textDTO = this.f85129d;
        int hashCode4 = (hashCode3 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        TextDTO textDTO2 = this.f85130e;
        int hashCode5 = (hashCode4 + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 961;
        Boolean bool = this.f85131f;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 961;
        List<ButtonV3DTO> list = this.f85132g;
        int hashCode7 = (this.f85133h.hashCode() + ((hashCode6 + (list == null ? 0 : list.hashCode())) * 31)) * 31;
        Map<String, MessengerTrackingInfo> map = this.f85134i;
        int hashCode8 = (hashCode7 + (map == null ? 0 : map.hashCode())) * 31;
        ru.ozon.android.messenger.blocks.emptystate.g gVar = this.f85135j;
        return hashCode8 + (gVar != null ? gVar.hashCode() : 0);
    }

    public final Boolean i() {
        return this.f85131f;
    }

    @NotNull
    public final String toString() {
        return "EmptyStateV2VO(blockId=" + this.f85126a + ", image=" + this.f85127b + ", imageSource=" + this.f85128c + ", titleV2=" + this.f85129d + ", descriptionV2=" + this.f85130e + ", largeButton=null, isFullScreen=" + this.f85131f + ", buttons=null, buttonsV2=" + this.f85132g + ", buttonLayout=" + this.f85133h + ", trackingInfo=" + this.f85134i + ", customInfo=" + this.f85135j + ")";
    }
}
