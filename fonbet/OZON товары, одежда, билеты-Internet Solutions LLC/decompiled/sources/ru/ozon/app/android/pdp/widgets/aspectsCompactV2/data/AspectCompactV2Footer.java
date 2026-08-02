package ru.ozon.app.android.pdp.widgets.aspectsCompactV2.data;

import Lc.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/pdp/widgets/aspectsCompactV2/data/AspectCompactV2Footer;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "leftButton", "rightButton", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getLeftButton", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getRightButton", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class AspectCompactV2Footer {
    private final TextDTO leftButton;
    private final TextDTO rightButton;

    public AspectCompactV2Footer(TextDTO textDTO, TextDTO textDTO2) {
        this.leftButton = textDTO;
        this.rightButton = textDTO2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AspectCompactV2Footer)) {
            return false;
        }
        AspectCompactV2Footer aspectCompactV2Footer = (AspectCompactV2Footer) other;
        return Intrinsics.d(this.leftButton, aspectCompactV2Footer.leftButton) && Intrinsics.d(this.rightButton, aspectCompactV2Footer.rightButton);
    }

    public final TextDTO getLeftButton() {
        return this.leftButton;
    }

    public final TextDTO getRightButton() {
        return this.rightButton;
    }

    public int hashCode() {
        TextDTO textDTO = this.leftButton;
        int hashCode = (textDTO == null ? 0 : textDTO.hashCode()) * 31;
        TextDTO textDTO2 = this.rightButton;
        return hashCode + (textDTO2 != null ? textDTO2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return a.b("AspectCompactV2Footer(leftButton=", this.leftButton, ", rightButton=", this.rightButton, ")");
    }
}
