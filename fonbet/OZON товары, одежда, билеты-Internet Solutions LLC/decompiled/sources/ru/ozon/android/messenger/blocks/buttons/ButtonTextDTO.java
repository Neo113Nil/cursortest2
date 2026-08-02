package ru.ozon.android.messenger.blocks.buttons;

import C.o0;
import N3.C3660k;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lru/ozon/android/messenger/blocks/buttons/ButtonTextDTO;", "", "body", "", "color", "style", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBody", "()Ljava/lang/String;", "getColor", "getStyle", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ButtonTextDTO {
    public static final int $stable = 0;

    @NotNull
    private final String body;

    @NotNull
    private final String color;

    @NotNull
    private final String style;

    public ButtonTextDTO(@NotNull String body, @NotNull String color, @NotNull String style) {
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(style, "style");
        this.body = body;
        this.color = color;
        this.style = style;
    }

    public static /* synthetic */ ButtonTextDTO copy$default(ButtonTextDTO buttonTextDTO, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = buttonTextDTO.body;
        }
        if ((i11 & 2) != 0) {
            str2 = buttonTextDTO.color;
        }
        if ((i11 & 4) != 0) {
            str3 = buttonTextDTO.style;
        }
        return buttonTextDTO.copy(str, str2, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    @NotNull
    public final ButtonTextDTO copy(@NotNull String body, @NotNull String color, @NotNull String style) {
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(style, "style");
        return new ButtonTextDTO(body, color, style);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonTextDTO)) {
            return false;
        }
        ButtonTextDTO buttonTextDTO = (ButtonTextDTO) other;
        return Intrinsics.d(this.body, buttonTextDTO.body) && Intrinsics.d(this.color, buttonTextDTO.color) && Intrinsics.d(this.style, buttonTextDTO.style);
    }

    @NotNull
    public final String getBody() {
        return this.body;
    }

    @NotNull
    public final String getColor() {
        return this.color;
    }

    @NotNull
    public final String getStyle() {
        return this.style;
    }

    public int hashCode() {
        return this.style.hashCode() + G.g.a(this.body.hashCode() * 31, 31, this.color);
    }

    @NotNull
    public String toString() {
        String str = this.body;
        String str2 = this.color;
        return o0.c(C3660k.d("ButtonTextDTO(body=", str, ", color=", str2, ", style="), this.style, ")");
    }
}
