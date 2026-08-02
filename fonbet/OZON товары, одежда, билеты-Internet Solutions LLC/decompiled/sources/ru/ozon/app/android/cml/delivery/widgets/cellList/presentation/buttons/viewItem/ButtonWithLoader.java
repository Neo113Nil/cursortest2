package ru.ozon.app.android.cml.delivery.widgets.cellList.presentation.buttons.viewItem;

import De.C2859b;
import Pk0.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000e\b\u0080\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ.\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u0007\u0010\u001a¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/cellList/presentation/buttons/viewItem/ButtonWithLoader;", "", "", "id", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "button", "", "isLoading", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Z)V", "copy", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Z)Lru/ozon/app/android/cml/delivery/widgets/cellList/presentation/buttons/viewItem/ButtonWithLoader;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "Z", "()Z", "Companion", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ButtonWithLoader {

    @NotNull
    private final ButtonV3DTO button;

    @NotNull
    private final String id;
    private final boolean isLoading;

    public ButtonWithLoader(@NotNull String id2, @NotNull ButtonV3DTO button, boolean z11) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(button, "button");
        this.id = id2;
        this.button = button;
        this.isLoading = z11;
    }

    public static /* synthetic */ ButtonWithLoader copy$default(ButtonWithLoader buttonWithLoader, String str, ButtonV3DTO buttonV3DTO, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = buttonWithLoader.id;
        }
        if ((i11 & 2) != 0) {
            buttonV3DTO = buttonWithLoader.button;
        }
        if ((i11 & 4) != 0) {
            z11 = buttonWithLoader.isLoading;
        }
        return buttonWithLoader.copy(str, buttonV3DTO, z11);
    }

    @NotNull
    public final ButtonWithLoader copy(@NotNull String id2, @NotNull ButtonV3DTO button, boolean isLoading) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(button, "button");
        return new ButtonWithLoader(id2, button, isLoading);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonWithLoader)) {
            return false;
        }
        ButtonWithLoader buttonWithLoader = (ButtonWithLoader) other;
        return Intrinsics.d(this.id, buttonWithLoader.id) && Intrinsics.d(this.button, buttonWithLoader.button) && this.isLoading == buttonWithLoader.isLoading;
    }

    @NotNull
    public final ButtonV3DTO getButton() {
        return this.button;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isLoading) + C2859b.c(this.button, this.id.hashCode() * 31, 31);
    }

    /* renamed from: isLoading, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    @NotNull
    public String toString() {
        String str = this.id;
        ButtonV3DTO buttonV3DTO = this.button;
        boolean z11 = this.isLoading;
        StringBuilder sb2 = new StringBuilder("ButtonWithLoader(id=");
        sb2.append(str);
        sb2.append(", button=");
        sb2.append(buttonV3DTO);
        sb2.append(", isLoading=");
        return a.a(")", sb2, z11);
    }
}
