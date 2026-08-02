package com.vk.statistic;

import androidx.annotation.NonNull;
import com.huawei.hms.framework.common.BundleUtil;
import com.vk.core.serialize.Serializer;
import xsna.i5s;
import xsna.odj;

/* loaded from: classes5.dex */
public class DeprecatedStatisticPrettyCard extends DeprecatedStatisticBase {
    public static final Serializer.c<DeprecatedStatisticPrettyCard> CREATOR = new a();
    public final String f;
    public final String g;

    public class a extends Serializer.c<DeprecatedStatisticPrettyCard> {
        @Override // com.vk.core.serialize.Serializer.c
        public final DeprecatedStatisticPrettyCard a(@NonNull Serializer serializer) {
            DeprecatedStatisticPrettyCard deprecatedStatisticPrettyCard = new DeprecatedStatisticPrettyCard(serializer.H(), serializer.H(), serializer.H());
            deprecatedStatisticPrettyCard.e = serializer.u() != 0;
            return deprecatedStatisticPrettyCard;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DeprecatedStatisticPrettyCard[i];
        }
    }

    public DeprecatedStatisticPrettyCard(String str, String str2, String str3) {
        super("ads/impression_pretty_card", str, null);
        this.f = str2;
        this.g = str3;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(@NonNull Serializer serializer) {
        serializer.j0(this.c);
        serializer.j0(this.f);
        serializer.j0(this.g);
        serializer.S(this.e ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeprecatedStatisticPrettyCard{type=");
        sb.append(this.b);
        sb.append(",key=");
        sb.append(this.c);
        sb.append(",adData=");
        sb.append(this.f);
        sb.append(", cardData=");
        return i5s.a(sb, this.g, "}");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DeprecatedStatisticPrettyCard(String str, String str2, int i, int i2, String str3) {
        this(r5.toString(), str, str2);
        StringBuilder a2 = odj.a(i, i2, "ads/impression_pretty_card_", BundleUtil.UNDERLINE_TAG, BundleUtil.UNDERLINE_TAG);
        a2.append(str3);
    }
}
