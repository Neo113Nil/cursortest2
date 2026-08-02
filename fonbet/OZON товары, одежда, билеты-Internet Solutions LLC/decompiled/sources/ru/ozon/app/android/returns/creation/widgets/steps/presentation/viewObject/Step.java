package ru.ozon.app.android.returns.creation.widgets.steps.presentation.viewObject;

import Ns.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/steps/presentation/viewObject/Step;", "", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icon", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "common", "<init>", "(Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class Step {
    public static final int $stable = IconDTO.$stable;
    private final CommonControlSettings common;

    @NotNull
    private final IconDTO icon;

    @NotNull
    private final TextDTO text;

    public Step(@NotNull IconDTO icon, @NotNull TextDTO text, CommonControlSettings commonControlSettings) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(text, "text");
        this.icon = icon;
        this.text = text;
        this.common = commonControlSettings;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Step)) {
            return false;
        }
        Step step = (Step) other;
        return Intrinsics.d(this.icon, step.icon) && Intrinsics.d(this.text, step.text) && Intrinsics.d(this.common, step.common);
    }

    public final CommonControlSettings getCommon() {
        return this.common;
    }

    @NotNull
    public final IconDTO getIcon() {
        return this.icon;
    }

    @NotNull
    public final TextDTO getText() {
        return this.text;
    }

    public int hashCode() {
        int a11 = b.a(this.text, this.icon.hashCode() * 31, 31);
        CommonControlSettings commonControlSettings = this.common;
        return a11 + (commonControlSettings == null ? 0 : commonControlSettings.hashCode());
    }

    @NotNull
    public String toString() {
        IconDTO iconDTO = this.icon;
        TextDTO textDTO = this.text;
        return Ak.b.g(Bi.b.i("Step(icon=", ", text=", ", common=", iconDTO, textDTO), this.common, ")");
    }
}
