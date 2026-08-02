package ru.ozon.app.android.pdp.widgets.aspectsV4.markdownReason.presentation;

import Ns.b;
import TY.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/aspectsV4/markdownReason/presentation/AspectsV4MarkdownReasonVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "button", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class AspectsV4MarkdownReasonVO implements c {
    private final ButtonV3DTO button;
    private final long id;

    @NotNull
    private final TextDTO text;

    public AspectsV4MarkdownReasonVO(long j11, @NotNull TextDTO text, ButtonV3DTO buttonV3DTO) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.id = j11;
        this.text = text;
        this.button = buttonV3DTO;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AspectsV4MarkdownReasonVO)) {
            return false;
        }
        AspectsV4MarkdownReasonVO aspectsV4MarkdownReasonVO = (AspectsV4MarkdownReasonVO) other;
        return this.id == aspectsV4MarkdownReasonVO.id && Intrinsics.d(this.text, aspectsV4MarkdownReasonVO.text) && Intrinsics.d(this.button, aspectsV4MarkdownReasonVO.button);
    }

    public final ButtonV3DTO getButton() {
        return this.button;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final TextDTO getText() {
        return this.text;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = b.a(this.text, Long.hashCode(this.id) * 31, 31);
        ButtonV3DTO buttonV3DTO = this.button;
        return a11 + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode());
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.text;
        ButtonV3DTO buttonV3DTO = this.button;
        StringBuilder b11 = a.b("AspectsV4MarkdownReasonVO(id=", j11, ", text=", textDTO);
        b11.append(", button=");
        b11.append(buttonV3DTO);
        b11.append(")");
        return b11.toString();
    }
}
