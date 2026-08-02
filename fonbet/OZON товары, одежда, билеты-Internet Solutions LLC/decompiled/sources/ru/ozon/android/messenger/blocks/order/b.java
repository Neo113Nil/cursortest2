package ru.ozon.android.messenger.blocks.order;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.android.messenger.framework.presentation.models.g;
import ru.ozon.android.messenger.framework.presentation.models.j;
import ru.ozon.android.messenger.utils.view.e;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.productMedia.ProductMediaDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

/* loaded from: classes10.dex */
public final class b implements g, j {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.presentation.models.c f85960a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final TextDTO f85961b;

    /* renamed from: c, reason: collision with root package name */
    private final TextDTO f85962c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomActionDTO f85963d;

    /* renamed from: e, reason: collision with root package name */
    private final Map<String, MessengerTrackingInfo> f85964e;

    /* renamed from: f, reason: collision with root package name */
    private final e f85965f;

    /* renamed from: g, reason: collision with root package name */
    private final ProductMediaDTO f85966g;

    /* renamed from: h, reason: collision with root package name */
    private String f85967h;

    public b() {
        throw null;
    }

    public b(ru.ozon.android.messenger.framework.presentation.models.c blockId, TextDTO title, TextDTO textDTO, AtomActionDTO atomActionDTO, Map map, e eVar, ProductMediaDTO productMediaDTO) {
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f85960a = blockId;
        this.f85961b = title;
        this.f85962c = textDTO;
        this.f85963d = atomActionDTO;
        this.f85964e = map;
        this.f85965f = eVar;
        this.f85966g = productMediaDTO;
        this.f85967h = null;
    }

    public final AtomActionDTO a() {
        return this.f85963d;
    }

    public final e b() {
        return this.f85965f;
    }

    public final ProductMediaDTO c() {
        return this.f85966g;
    }

    public final TextDTO d() {
        return this.f85962c;
    }

    @NotNull
    public final TextDTO e() {
        return this.f85961b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f85960a, bVar.f85960a) && Intrinsics.d(this.f85961b, bVar.f85961b) && Intrinsics.d(this.f85962c, bVar.f85962c) && Intrinsics.d(this.f85963d, bVar.f85963d) && Intrinsics.d(this.f85964e, bVar.f85964e) && Intrinsics.d(this.f85965f, bVar.f85965f) && Intrinsics.d(this.f85966g, bVar.f85966g) && Intrinsics.d(this.f85967h, bVar.f85967h);
    }

    public final Map<String, MessengerTrackingInfo> f() {
        return this.f85964e;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.models.g
    @NotNull
    public final ru.ozon.android.messenger.framework.presentation.models.c getBlockId() {
        return this.f85960a;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.models.j
    public final String getSendTime() {
        return this.f85967h;
    }

    public final int hashCode() {
        int a11 = Ns.b.a(this.f85961b, this.f85960a.hashCode() * 31, 31);
        TextDTO textDTO = this.f85962c;
        int hashCode = (a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.f85963d;
        int hashCode2 = (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        Map<String, MessengerTrackingInfo> map = this.f85964e;
        int hashCode3 = (hashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        e eVar = this.f85965f;
        int hashCode4 = (hashCode3 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        ProductMediaDTO productMediaDTO = this.f85966g;
        int hashCode5 = (hashCode4 + (productMediaDTO == null ? 0 : productMediaDTO.hashCode())) * 31;
        String str = this.f85967h;
        return hashCode5 + (str != null ? str.hashCode() : 0);
    }

    @Override // ru.ozon.android.messenger.framework.presentation.models.j
    public final void setSendTime(String str) {
        this.f85967h = str;
    }

    @NotNull
    public final String toString() {
        return "OrderVO(blockId=" + this.f85960a + ", title=" + this.f85961b + ", subtitle=" + this.f85962c + ", action=" + this.f85963d + ", trackingInfo=" + this.f85964e + ", labeledIcon=" + this.f85965f + ", productMedia=" + this.f85966g + ", sendTime=" + this.f85967h + ")";
    }
}
