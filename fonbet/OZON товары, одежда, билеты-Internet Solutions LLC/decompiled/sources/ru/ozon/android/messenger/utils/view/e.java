package ru.ozon.android.messenger.utils.view;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.text.TextDTO;

/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final Icon f92002a;

    /* renamed from: b, reason: collision with root package name */
    private final TextDTO f92003b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final c f92004c;

    static {
        int i11 = Icon.$stable;
    }

    public e(Icon icon, TextDTO textDTO, @NotNull c iconPosition) {
        Intrinsics.checkNotNullParameter(iconPosition, "iconPosition");
        this.f92002a = icon;
        this.f92003b = textDTO;
        this.f92004c = iconPosition;
    }

    public final Icon a() {
        return this.f92002a;
    }

    @NotNull
    public final c b() {
        return this.f92004c;
    }

    public final TextDTO c() {
        return this.f92003b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.f92002a, eVar.f92002a) && Intrinsics.d(this.f92003b, eVar.f92003b) && this.f92004c == eVar.f92004c;
    }

    public final int hashCode() {
        Icon icon = this.f92002a;
        int hashCode = (icon == null ? 0 : icon.hashCode()) * 31;
        TextDTO textDTO = this.f92003b;
        return this.f92004c.hashCode() + ((hashCode + (textDTO != null ? textDTO.hashCode() : 0)) * 31);
    }

    @NotNull
    public final String toString() {
        return "LabeledIconMetaVO(icon=" + this.f92002a + ", label=" + this.f92003b + ", iconPosition=" + this.f92004c + ")";
    }
}
