package ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.presentation.submitButton;

import Ak.C2436a;
import G.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/submitButton/DocsDeliverySubmitButtonVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "deliveryVariantId", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "submitButton", "<init>", "(JLjava/lang/String;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getDeliveryVariantId", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getSubmitButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class DocsDeliverySubmitButtonVO implements c {
    public static final int $stable = ButtonV3Atom.LargeButton.$stable;

    @NotNull
    private final String deliveryVariantId;
    private final long id;

    @NotNull
    private final ButtonV3Atom.LargeButton submitButton;

    public DocsDeliverySubmitButtonVO(long j11, @NotNull String deliveryVariantId, @NotNull ButtonV3Atom.LargeButton submitButton) {
        Intrinsics.checkNotNullParameter(deliveryVariantId, "deliveryVariantId");
        Intrinsics.checkNotNullParameter(submitButton, "submitButton");
        this.id = j11;
        this.deliveryVariantId = deliveryVariantId;
        this.submitButton = submitButton;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocsDeliverySubmitButtonVO)) {
            return false;
        }
        DocsDeliverySubmitButtonVO docsDeliverySubmitButtonVO = (DocsDeliverySubmitButtonVO) other;
        return this.id == docsDeliverySubmitButtonVO.id && Intrinsics.d(this.deliveryVariantId, docsDeliverySubmitButtonVO.deliveryVariantId) && Intrinsics.d(this.submitButton, docsDeliverySubmitButtonVO.submitButton);
    }

    @NotNull
    public final String getDeliveryVariantId() {
        return this.deliveryVariantId;
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
    public final ButtonV3Atom.LargeButton getSubmitButton() {
        return this.submitButton;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        return this.submitButton.hashCode() + g.a(Long.hashCode(this.id) * 31, 31, this.deliveryVariantId);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.deliveryVariantId;
        ButtonV3Atom.LargeButton largeButton = this.submitButton;
        StringBuilder c11 = C2436a.c(j11, "DocsDeliverySubmitButtonVO(id=", ", deliveryVariantId=", str);
        c11.append(", submitButton=");
        c11.append(largeButton);
        c11.append(")");
        return c11.toString();
    }
}
