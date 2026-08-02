package ru.ozon.app.android.button.actions.redirect;

import V.e;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.button.data.ActionButtonDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/button/actions/redirect/CommonRedirectActionDTO;", "Lru/ozon/app/android/button/data/ActionButtonDTO$ButtonsItem$Action;", "type", "", "deeplink", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "getDeeplink", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "button_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CommonRedirectActionDTO implements ActionButtonDTO.ButtonsItem.Action {
    private final String deeplink;

    @NotNull
    private final String type;

    public CommonRedirectActionDTO(@NotNull String type, String str) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.deeplink = str;
    }

    public static /* synthetic */ CommonRedirectActionDTO copy$default(CommonRedirectActionDTO commonRedirectActionDTO, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = commonRedirectActionDTO.type;
        }
        if ((i11 & 2) != 0) {
            str2 = commonRedirectActionDTO.deeplink;
        }
        return commonRedirectActionDTO.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDeeplink() {
        return this.deeplink;
    }

    @NotNull
    public final CommonRedirectActionDTO copy(@NotNull String type, String deeplink) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new CommonRedirectActionDTO(type, deeplink);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommonRedirectActionDTO)) {
            return false;
        }
        CommonRedirectActionDTO commonRedirectActionDTO = (CommonRedirectActionDTO) other;
        return Intrinsics.d(this.type, commonRedirectActionDTO.type) && Intrinsics.d(this.deeplink, commonRedirectActionDTO.deeplink);
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    @Override // ru.ozon.app.android.button.data.ActionButtonDTO.ButtonsItem.Action
    @NotNull
    public String getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        String str = this.deeplink;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return e.a("CommonRedirectActionDTO(type=", this.type, ", deeplink=", this.deeplink, ")");
    }

    public /* synthetic */ CommonRedirectActionDTO(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "common.redirect" : str, str2);
    }
}
