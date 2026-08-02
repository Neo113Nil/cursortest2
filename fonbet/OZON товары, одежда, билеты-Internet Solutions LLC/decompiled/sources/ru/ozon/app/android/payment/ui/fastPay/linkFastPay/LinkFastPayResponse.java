package ru.ozon.app.android.payment.ui.fastPay.linkFastPay;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/payment/ui/fastPay/linkFastPay/LinkFastPayResponse;", "", "attachFastPayUrl", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "getAttachFastPayUrl", "()Ljava/lang/String;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "payment_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class LinkFastPayResponse {

    @NotNull
    private final AtomActionDTO action;
    private final String attachFastPayUrl;

    public LinkFastPayResponse(String str, @NotNull AtomActionDTO action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.attachFastPayUrl = str;
        this.action = action;
    }

    public static /* synthetic */ LinkFastPayResponse copy$default(LinkFastPayResponse linkFastPayResponse, String str, AtomActionDTO atomActionDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = linkFastPayResponse.attachFastPayUrl;
        }
        if ((i11 & 2) != 0) {
            atomActionDTO = linkFastPayResponse.action;
        }
        return linkFastPayResponse.copy(str, atomActionDTO);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAttachFastPayUrl() {
        return this.attachFastPayUrl;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    @NotNull
    public final LinkFastPayResponse copy(String attachFastPayUrl, @NotNull AtomActionDTO action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return new LinkFastPayResponse(attachFastPayUrl, action);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LinkFastPayResponse)) {
            return false;
        }
        LinkFastPayResponse linkFastPayResponse = (LinkFastPayResponse) other;
        return Intrinsics.d(this.attachFastPayUrl, linkFastPayResponse.attachFastPayUrl) && Intrinsics.d(this.action, linkFastPayResponse.action);
    }

    @NotNull
    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final String getAttachFastPayUrl() {
        return this.attachFastPayUrl;
    }

    public int hashCode() {
        String str = this.attachFastPayUrl;
        return this.action.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @NotNull
    public String toString() {
        return "LinkFastPayResponse(attachFastPayUrl=" + this.attachFastPayUrl + ", action=" + this.action + ")";
    }
}
