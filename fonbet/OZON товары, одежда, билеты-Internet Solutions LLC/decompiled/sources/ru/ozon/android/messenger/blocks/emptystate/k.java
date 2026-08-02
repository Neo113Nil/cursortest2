package ru.ozon.android.messenger.blocks.emptystate;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.presentation.models.n;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

/* loaded from: classes10.dex */
public final class k implements ru.ozon.android.messenger.framework.presentation.models.g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.presentation.models.c f85106a;

    /* renamed from: b, reason: collision with root package name */
    private final n f85107b;

    /* renamed from: c, reason: collision with root package name */
    private final TextAtom f85108c;

    /* renamed from: d, reason: collision with root package name */
    private final TextAtom f85109d;

    /* renamed from: e, reason: collision with root package name */
    private final ButtonV3Atom.LargeButton f85110e;

    /* renamed from: f, reason: collision with root package name */
    private final Boolean f85111f;

    public k() {
        throw null;
    }

    public k(ru.ozon.android.messenger.framework.presentation.models.c blockId, n nVar, TextAtom textAtom, TextAtom textAtom2, ButtonV3Atom.LargeButton largeButton, Boolean bool) {
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        this.f85106a = blockId;
        this.f85107b = nVar;
        this.f85108c = textAtom;
        this.f85109d = textAtom2;
        this.f85110e = largeButton;
        this.f85111f = bool;
    }

    public final TextAtom a() {
        return this.f85109d;
    }

    public final n b() {
        return this.f85107b;
    }

    public final ButtonV3Atom.LargeButton c() {
        return this.f85110e;
    }

    public final TextAtom d() {
        return this.f85108c;
    }

    public final Boolean e() {
        return this.f85111f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Intrinsics.d(this.f85106a, kVar.f85106a) && Intrinsics.d(this.f85107b, kVar.f85107b) && Intrinsics.d(this.f85108c, kVar.f85108c) && Intrinsics.d(this.f85109d, kVar.f85109d) && Intrinsics.d(this.f85110e, kVar.f85110e) && Intrinsics.d(this.f85111f, kVar.f85111f);
    }

    @Override // ru.ozon.android.messenger.framework.presentation.models.g
    @NotNull
    public final ru.ozon.android.messenger.framework.presentation.models.c getBlockId() {
        return this.f85106a;
    }

    public final int hashCode() {
        int hashCode = this.f85106a.hashCode() * 31;
        n nVar = this.f85107b;
        int hashCode2 = (hashCode + (nVar == null ? 0 : nVar.hashCode())) * 31;
        TextAtom textAtom = this.f85108c;
        int hashCode3 = (hashCode2 + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
        TextAtom textAtom2 = this.f85109d;
        int hashCode4 = (hashCode3 + (textAtom2 == null ? 0 : textAtom2.hashCode())) * 31;
        ButtonV3Atom.LargeButton largeButton = this.f85110e;
        int hashCode5 = (hashCode4 + (largeButton == null ? 0 : largeButton.hashCode())) * 31;
        Boolean bool = this.f85111f;
        return (hashCode5 + (bool != null ? bool.hashCode() : 0)) * 29791;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EmptyStateVO(blockId=");
        sb2.append(this.f85106a);
        sb2.append(", imageSource=");
        sb2.append(this.f85107b);
        sb2.append(", title=");
        sb2.append(this.f85108c);
        sb2.append(", description=");
        sb2.append(this.f85109d);
        sb2.append(", largeButton=");
        sb2.append(this.f85110e);
        sb2.append(", isFullScreen=");
        return D3.g.d(sb2, this.f85111f, ", buttons=null, buttonsV2=null, trackingInfo=null)");
    }
}
