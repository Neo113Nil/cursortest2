package ru.ozon.app.android.session.auth.data;

import G.g;
import N3.C3660k;
import Ul.C4070a;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007HÆ\u0003JC\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/session/auth/data/HintClickDTO;", "", "action", "", "deeplink", "type", "postData", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getAction", "()Ljava/lang/String;", "getDeeplink", "getType", "getPostData", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class HintClickDTO {
    public static final int $stable = 8;
    private final String action;
    private final String deeplink;
    private final Map<String, Object> postData;

    @NotNull
    private final String type;

    public HintClickDTO(String str, String str2, @NotNull String type, Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.action = str;
        this.deeplink = str2;
        this.type = type;
        this.postData = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HintClickDTO copy$default(HintClickDTO hintClickDTO, String str, String str2, String str3, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = hintClickDTO.action;
        }
        if ((i11 & 2) != 0) {
            str2 = hintClickDTO.deeplink;
        }
        if ((i11 & 4) != 0) {
            str3 = hintClickDTO.type;
        }
        if ((i11 & 8) != 0) {
            map = hintClickDTO.postData;
        }
        return hintClickDTO.copy(str, str2, str3, map);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDeeplink() {
        return this.deeplink;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final Map<String, Object> component4() {
        return this.postData;
    }

    @NotNull
    public final HintClickDTO copy(String action, String deeplink, @NotNull String type, Map<String, ? extends Object> postData) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new HintClickDTO(action, deeplink, type, postData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HintClickDTO)) {
            return false;
        }
        HintClickDTO hintClickDTO = (HintClickDTO) other;
        return Intrinsics.d(this.action, hintClickDTO.action) && Intrinsics.d(this.deeplink, hintClickDTO.deeplink) && Intrinsics.d(this.type, hintClickDTO.type) && Intrinsics.d(this.postData, hintClickDTO.postData);
    }

    public final String getAction() {
        return this.action;
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    public final Map<String, Object> getPostData() {
        return this.postData;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.action;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.deeplink;
        int a11 = g.a((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.type);
        Map<String, Object> map = this.postData;
        return a11 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.action;
        String str2 = this.deeplink;
        return C4070a.a(C3660k.d("HintClickDTO(action=", str, ", deeplink=", str2, ", type="), this.type, ", postData=", this.postData, ")");
    }
}
