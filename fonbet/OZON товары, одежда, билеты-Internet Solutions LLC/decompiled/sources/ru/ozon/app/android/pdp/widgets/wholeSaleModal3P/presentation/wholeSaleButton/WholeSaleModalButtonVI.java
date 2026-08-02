package ru.ozon.app.android.pdp.widgets.wholeSaleModal3P.presentation.wholeSaleButton;

import De.C2859b;
import F3.G;
import g.C6594f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/pdp/widgets/wholeSaleModal3P/presentation/wholeSaleButton/WholeSaleModalButtonVI;", "Ll20/c;", "", "id", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "button", "", "messageTemplate", "<init>", "(JLru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "Ljava/lang/String;", "getMessageTemplate", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class WholeSaleModalButtonVI implements c {

    @NotNull
    private final ButtonV3DTO button;
    private final long id;

    @NotNull
    private final String messageTemplate;

    public WholeSaleModalButtonVI(long j11, @NotNull ButtonV3DTO button, @NotNull String messageTemplate) {
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(messageTemplate, "messageTemplate");
        this.id = j11;
        this.button = button;
        this.messageTemplate = messageTemplate;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WholeSaleModalButtonVI)) {
            return false;
        }
        WholeSaleModalButtonVI wholeSaleModalButtonVI = (WholeSaleModalButtonVI) other;
        return this.id == wholeSaleModalButtonVI.id && Intrinsics.d(this.button, wholeSaleModalButtonVI.button) && Intrinsics.d(this.messageTemplate, wholeSaleModalButtonVI.messageTemplate);
    }

    @NotNull
    public final ButtonV3DTO getButton() {
        return this.button;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final String getMessageTemplate() {
        return this.messageTemplate;
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
        return this.messageTemplate.hashCode() + C2859b.c(this.button, Long.hashCode(this.id) * 31, 31);
    }

    @NotNull
    public String toString() {
        return C6594f.a(", messageTemplate=", this.messageTemplate, ")", G.c("WholeSaleModalButtonVI(id=", this.id, ", button=", this.button));
    }
}
