package ru.ozon.android.messenger.blocks.disclaimer;

import B0.C2454a;
import B90.C2619v;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.presentation.models.g;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

/* loaded from: classes10.dex */
public final class a implements g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.presentation.models.c f85033a;

    /* renamed from: b, reason: collision with root package name */
    private final TextAtom f85034b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final TextAtom f85035c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final List<ButtonV3Atom.SmallBorderlessButton> f85036d;

    /* renamed from: e, reason: collision with root package name */
    private final int f85037e;

    /* renamed from: f, reason: collision with root package name */
    private final String f85038f;

    static {
        int i11 = ButtonV3Atom.SmallBorderlessButton.$stable;
        int i12 = TextAtom.$stable;
    }

    public a(@NotNull ru.ozon.android.messenger.framework.presentation.models.c blockId, TextAtom textAtom, @NotNull TextAtom description, @NotNull List<ButtonV3Atom.SmallBorderlessButton> buttons, int i11, String str) {
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        this.f85033a = blockId;
        this.f85034b = textAtom;
        this.f85035c = description;
        this.f85036d = buttons;
        this.f85037e = i11;
        this.f85038f = str;
    }

    public final int a() {
        return this.f85037e;
    }

    public final String b() {
        return this.f85038f;
    }

    @NotNull
    public final List<ButtonV3Atom.SmallBorderlessButton> c() {
        return this.f85036d;
    }

    @NotNull
    public final TextAtom d() {
        return this.f85035c;
    }

    public final TextAtom e() {
        return this.f85034b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f85033a, aVar.f85033a) && Intrinsics.d(this.f85034b, aVar.f85034b) && Intrinsics.d(this.f85035c, aVar.f85035c) && Intrinsics.d(this.f85036d, aVar.f85036d) && this.f85037e == aVar.f85037e && Intrinsics.d(this.f85038f, aVar.f85038f);
    }

    @Override // ru.ozon.android.messenger.framework.presentation.models.g
    @NotNull
    public final ru.ozon.android.messenger.framework.presentation.models.c getBlockId() {
        return this.f85033a;
    }

    public final int hashCode() {
        int hashCode = this.f85033a.hashCode() * 31;
        TextAtom textAtom = this.f85034b;
        int a11 = C2454a.a(this.f85037e, G.g.b(C2619v.b((hashCode + (textAtom == null ? 0 : textAtom.hashCode())) * 31, 31, this.f85035c), 31, this.f85036d), 31);
        String str = this.f85038f;
        return a11 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "DisclaimerVO(blockId=" + this.f85033a + ", title=" + this.f85034b + ", description=" + this.f85035c + ", buttons=" + this.f85036d + ", backgroundColor=" + this.f85037e + ", backgroundImage=" + this.f85038f + ")";
    }
}
