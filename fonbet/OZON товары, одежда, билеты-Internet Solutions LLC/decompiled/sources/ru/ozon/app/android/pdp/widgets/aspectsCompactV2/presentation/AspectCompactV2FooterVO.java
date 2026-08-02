package ru.ozon.app.android.pdp.widgets.aspectsCompactV2.presentation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u001cB#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u001b\u0010\u001a¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/pdp/widgets/aspectsCompactV2/presentation/AspectCompactV2FooterVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/pdp/widgets/aspectsCompactV2/presentation/AspectCompactV2FooterVO$TextButton;", "leftButton", "rightButton", "<init>", "(JLru/ozon/app/android/pdp/widgets/aspectsCompactV2/presentation/AspectCompactV2FooterVO$TextButton;Lru/ozon/app/android/pdp/widgets/aspectsCompactV2/presentation/AspectCompactV2FooterVO$TextButton;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/pdp/widgets/aspectsCompactV2/presentation/AspectCompactV2FooterVO$TextButton;", "getLeftButton", "()Lru/ozon/app/android/pdp/widgets/aspectsCompactV2/presentation/AspectCompactV2FooterVO$TextButton;", "getRightButton", "TextButton", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class AspectCompactV2FooterVO implements c {
    public static final int $stable = AtomAction.$stable;
    private final long id;
    private final TextButton leftButton;
    private final TextButton rightButton;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/pdp/widgets/aspectsCompactV2/presentation/AspectCompactV2FooterVO$TextButton;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "button", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/af/AtomAction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getButton", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TextButton {
        public static final int $stable = AtomAction.$stable;
        private final AtomAction action;

        @NotNull
        private final TextDTO button;

        public TextButton(@NotNull TextDTO button, AtomAction atomAction) {
            Intrinsics.checkNotNullParameter(button, "button");
            this.button = button;
            this.action = atomAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TextButton)) {
                return false;
            }
            TextButton textButton = (TextButton) other;
            return Intrinsics.d(this.button, textButton.button) && Intrinsics.d(this.action, textButton.action);
        }

        public final AtomAction getAction() {
            return this.action;
        }

        @NotNull
        public final TextDTO getButton() {
            return this.button;
        }

        public int hashCode() {
            int hashCode = this.button.hashCode() * 31;
            AtomAction atomAction = this.action;
            return hashCode + (atomAction == null ? 0 : atomAction.hashCode());
        }

        @NotNull
        public String toString() {
            return "TextButton(button=" + this.button + ", action=" + this.action + ")";
        }
    }

    public AspectCompactV2FooterVO(long j11, TextButton textButton, TextButton textButton2) {
        this.id = j11;
        this.leftButton = textButton;
        this.rightButton = textButton2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AspectCompactV2FooterVO)) {
            return false;
        }
        AspectCompactV2FooterVO aspectCompactV2FooterVO = (AspectCompactV2FooterVO) other;
        return this.id == aspectCompactV2FooterVO.id && Intrinsics.d(this.leftButton, aspectCompactV2FooterVO.leftButton) && Intrinsics.d(this.rightButton, aspectCompactV2FooterVO.rightButton);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final TextButton getLeftButton() {
        return this.leftButton;
    }

    public final TextButton getRightButton() {
        return this.rightButton;
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
        TextButton textButton = this.leftButton;
        int hashCode2 = (hashCode + (textButton == null ? 0 : textButton.hashCode())) * 31;
        TextButton textButton2 = this.rightButton;
        return hashCode2 + (textButton2 != null ? textButton2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AspectCompactV2FooterVO(id=" + this.id + ", leftButton=" + this.leftButton + ", rightButton=" + this.rightButton + ")";
    }
}
