package ru.ozon.android.messenger.blocks.ai.tapTags.presentation;

import B90.C2618u;
import Kk.C3532b;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.presentation.models.g;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

/* loaded from: classes10.dex */
public final class c implements g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.presentation.models.c f84329a;

    /* renamed from: b, reason: collision with root package name */
    private final TextDTO f84330b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ArrayList f84331c;

    /* renamed from: d, reason: collision with root package name */
    private final ButtonV3DTO f84332d;

    /* renamed from: e, reason: collision with root package name */
    private final a f84333e;

    public c(@NotNull ru.ozon.android.messenger.framework.presentation.models.c blockId, TextDTO textDTO, @NotNull ArrayList tagsItems, ButtonV3DTO buttonV3DTO, a aVar) {
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        Intrinsics.checkNotNullParameter(tagsItems, "tagsItems");
        this.f84329a = blockId;
        this.f84330b = textDTO;
        this.f84331c = tagsItems;
        this.f84332d = buttonV3DTO;
        this.f84333e = aVar;
    }

    public static c a(c cVar, ArrayList tagsItems) {
        ru.ozon.android.messenger.framework.presentation.models.c blockId = cVar.f84329a;
        TextDTO textDTO = cVar.f84330b;
        ButtonV3DTO buttonV3DTO = cVar.f84332d;
        cVar.getClass();
        a aVar = cVar.f84333e;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        Intrinsics.checkNotNullParameter(tagsItems, "tagsItems");
        return new c(blockId, textDTO, tagsItems, buttonV3DTO, aVar);
    }

    public final a b() {
        return this.f84333e;
    }

    @NotNull
    public final List<b> c() {
        return this.f84331c;
    }

    public final TextDTO d() {
        return this.f84330b;
    }

    public final ButtonV3DTO e() {
        return this.f84332d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f84329a, cVar.f84329a) && Intrinsics.d(this.f84330b, cVar.f84330b) && this.f84331c.equals(cVar.f84331c) && Intrinsics.d(this.f84332d, cVar.f84332d) && Intrinsics.d(this.f84333e, cVar.f84333e);
    }

    @Override // ru.ozon.android.messenger.framework.presentation.models.g
    @NotNull
    public final ru.ozon.android.messenger.framework.presentation.models.c getBlockId() {
        return this.f84329a;
    }

    public final int hashCode() {
        int hashCode = this.f84329a.hashCode() * 31;
        TextDTO textDTO = this.f84330b;
        int b11 = C2618u.b(this.f84331c, (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31, 31);
        ButtonV3DTO buttonV3DTO = this.f84332d;
        int a11 = C3532b.a((b11 + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31, 31, false);
        a aVar = this.f84333e;
        return a11 + (aVar != null ? aVar.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "TapTagsVO(blockId=" + this.f84329a + ", title=" + this.f84330b + ", tagsItems=" + this.f84331c + ", titleRightButton=" + this.f84332d + ", isAllList=false, presentationSettings=" + this.f84333e + ")";
    }
}
