package defpackage;

import com.sofascore.model.mvvm.model.PlayerData;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class qq5 implements Serializable {
    public final PlayerData a;
    public final PlayerData b;
    public final int c;

    public qq5(PlayerData playerData, PlayerData playerData2, int i) {
        this.a = playerData;
        this.b = playerData2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qq5)) {
            return false;
        }
        qq5 qq5Var = (qq5) obj;
        return Intrinsics.c(this.a, qq5Var.a) && Intrinsics.c(this.b, qq5Var.b) && this.c == qq5Var.c;
    }

    public final int hashCode() {
        PlayerData playerData = this.a;
        int hashCode = (playerData == null ? 0 : playerData.hashCode()) * 31;
        PlayerData playerData2 = this.b;
        return Integer.hashCode(this.c) + ((hashCode + (playerData2 != null ? playerData2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EsportsLineupsRowData(firstPlayer=");
        sb.append(this.a);
        sb.append(", secondPlayer=");
        sb.append(this.b);
        sb.append(", categoryId=");
        return fc6.h(this.c, ")", sb);
    }
}
