package ru.ozon.android.messenger.framework.composer.widgets.fastAnswerTemplateEditor.presentation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

/* loaded from: classes10.dex */
public final class t implements l20.c {

    /* renamed from: a, reason: collision with root package name */
    private final long f86921a;

    /* renamed from: b, reason: collision with root package name */
    private final y f86922b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ButtonV3DTO f86923c;

    public t(long j11, y yVar, @NotNull ButtonV3DTO button) {
        Intrinsics.checkNotNullParameter(button, "button");
        this.f86921a = j11;
        this.f86922b = yVar;
        this.f86923c = button;
    }

    @NotNull
    public final ButtonV3DTO a() {
        return this.f86923c;
    }

    public final y b() {
        return this.f86922b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f86921a == tVar.f86921a && Intrinsics.d(this.f86922b, tVar.f86922b) && Intrinsics.d(this.f86923c, tVar.f86923c);
    }

    @Override // l20.c
    public final long getId() {
        return this.f86921a;
    }

    @Override // l20.c
    public final Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public final int getViewItemKey() {
        return hashCode();
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.f86921a) * 31;
        y yVar = this.f86922b;
        return this.f86923c.hashCode() + ((hashCode + (yVar == null ? 0 : yVar.hashCode())) * 31);
    }

    @NotNull
    public final String toString() {
        return "FastAnswerTemplateEditorVO(id=" + this.f86921a + ", input=" + this.f86922b + ", button=" + this.f86923c + ")";
    }
}
