package ru.ozon.android.messenger.blocks.originalText;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.text.TextDTO;

/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final TextDTO f85994a;

    /* renamed from: b, reason: collision with root package name */
    private final String f85995b;

    public e(TextDTO textDTO, String str) {
        this.f85994a = textDTO;
        this.f85995b = str;
    }

    public final String a() {
        return this.f85995b;
    }

    public final TextDTO b() {
        return this.f85994a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.f85994a, eVar.f85994a) && Intrinsics.d(this.f85995b, eVar.f85995b);
    }

    public final int hashCode() {
        TextDTO textDTO = this.f85994a;
        int hashCode = (textDTO == null ? 0 : textDTO.hashCode()) * 31;
        String str = this.f85995b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "OriginalTextResponseVO(text=" + this.f85994a + ", error=" + this.f85995b + ")";
    }
}
