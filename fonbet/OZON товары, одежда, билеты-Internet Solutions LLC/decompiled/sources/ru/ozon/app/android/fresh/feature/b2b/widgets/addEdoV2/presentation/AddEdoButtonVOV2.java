package ru.ozon.app.android.fresh.feature.b2b.widgets.addEdoV2.presentation;

import De.C2859b;
import TY.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b \u0010\u001f¨\u0006!"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/presentation/AddEdoButtonVOV2;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", "description", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "button", "additionalButton", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getDescription", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getAdditionalButton", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AddEdoButtonVOV2 implements c {
    private final ButtonV3DTO additionalButton;

    @NotNull
    private final ButtonV3DTO button;
    private final TextDTO description;
    private final long id;

    public AddEdoButtonVOV2(long j11, TextDTO textDTO, @NotNull ButtonV3DTO button, ButtonV3DTO buttonV3DTO) {
        Intrinsics.checkNotNullParameter(button, "button");
        this.id = j11;
        this.description = textDTO;
        this.button = button;
        this.additionalButton = buttonV3DTO;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddEdoButtonVOV2)) {
            return false;
        }
        AddEdoButtonVOV2 addEdoButtonVOV2 = (AddEdoButtonVOV2) other;
        return this.id == addEdoButtonVOV2.id && Intrinsics.d(this.description, addEdoButtonVOV2.description) && Intrinsics.d(this.button, addEdoButtonVOV2.button) && Intrinsics.d(this.additionalButton, addEdoButtonVOV2.additionalButton);
    }

    public final ButtonV3DTO getAdditionalButton() {
        return this.additionalButton;
    }

    @NotNull
    public final ButtonV3DTO getButton() {
        return this.button;
    }

    public final TextDTO getDescription() {
        return this.description;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        TextDTO textDTO = this.description;
        int c11 = C2859b.c(this.button, (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31, 31);
        ButtonV3DTO buttonV3DTO = this.additionalButton;
        return c11 + (buttonV3DTO != null ? buttonV3DTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.description;
        ButtonV3DTO buttonV3DTO = this.button;
        ButtonV3DTO buttonV3DTO2 = this.additionalButton;
        StringBuilder b11 = a.b("AddEdoButtonVOV2(id=", j11, ", description=", textDTO);
        b11.append(", button=");
        b11.append(buttonV3DTO);
        b11.append(", additionalButton=");
        b11.append(buttonV3DTO2);
        b11.append(")");
        return b11.toString();
    }
}
