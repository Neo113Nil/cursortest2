package com.vk.statistic;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.huawei.hms.framework.common.BundleUtil;
import com.vk.core.serialize.Serializer;
import java.util.UUID;
import xsna.i5s;

/* loaded from: classes5.dex */
public class DeprecatedStatisticUrl extends DeprecatedStatisticBase {
    public static final Serializer.c<DeprecatedStatisticUrl> CREATOR = new a();
    public final String f;

    public class a extends Serializer.c<DeprecatedStatisticUrl> {
        @Override // com.vk.core.serialize.Serializer.c
        public final DeprecatedStatisticUrl a(@NonNull Serializer serializer) {
            String H = serializer.H();
            String H2 = serializer.H();
            String H3 = serializer.H();
            String I = serializer.I();
            DeprecatedStatisticUrl deprecatedStatisticUrl = new DeprecatedStatisticUrl(H, H2, H3, I != null ? UUID.fromString(I) : null);
            deprecatedStatisticUrl.e = serializer.u() != 0;
            return deprecatedStatisticUrl;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DeprecatedStatisticUrl[i];
        }
    }

    public DeprecatedStatisticUrl(@NonNull String str, @Nullable String str2, @Nullable String str3, @Nullable UUID uuid) {
        super(str2, str3, uuid);
        this.f = str;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(@NonNull Serializer serializer) {
        serializer.j0(this.f);
        serializer.j0(this.b);
        serializer.j0(this.c);
        UUID uuid = this.d;
        serializer.m0(uuid != null ? uuid.toString() : null);
        serializer.S(this.e ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DeprecatedStatisticUrl{sent=");
        sb.append(this.e);
        sb.append(",type=");
        sb.append(this.b);
        sb.append(",key=");
        sb.append(this.c);
        sb.append(",uniqueId=");
        UUID uuid = this.d;
        sb.append(uuid != null ? uuid.toString() : null);
        sb.append(",value=");
        return i5s.a(sb, this.f, "}");
    }

    public DeprecatedStatisticUrl(@NonNull String str, @Nullable String str2, @Nullable String str3) {
        super(str2, str3, UUID.nameUUIDFromBytes(str.getBytes()));
        this.f = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DeprecatedStatisticUrl(@NonNull String str, @Nullable String str2, int i, int i2, int i3, DeprecatedStatisticInterface deprecatedStatisticInterface) {
        this(str, str2, r5, UUID.nameUUIDFromBytes(str.getBytes()));
        String str3;
        if ((i == 0 && i2 == 0) || str2 == null) {
            str3 = null;
        } else if (deprecatedStatisticInterface != null) {
            str3 = str2 + BundleUtil.UNDERLINE_TAG + i + BundleUtil.UNDERLINE_TAG + i2 + BundleUtil.UNDERLINE_TAG + i3 + BundleUtil.UNDERLINE_TAG + deprecatedStatisticInterface.Wa();
        } else {
            str3 = str2 + BundleUtil.UNDERLINE_TAG + i + BundleUtil.UNDERLINE_TAG + i2 + BundleUtil.UNDERLINE_TAG + i3 + BundleUtil.UNDERLINE_TAG;
        }
    }
}
