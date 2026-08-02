package com.blaze.blazesdk.app_configurations.models.universal_links;

import androidx.annotation.Keep;
import defpackage.lnb;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B'\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/blaze/blazesdk/app_configurations/models/universal_links/SharingPathDto;", "", "", "story", "moment", "video", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SharingPathDto {
    public final String a;
    public final String b;
    public final String c;

    @Keep
    public SharingPathDto(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public static SharingPathDto copy$default(SharingPathDto sharingPathDto, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sharingPathDto.a;
        }
        if ((i & 2) != 0) {
            str2 = sharingPathDto.b;
        }
        if ((i & 4) != 0) {
            str3 = sharingPathDto.c;
        }
        sharingPathDto.getClass();
        return new SharingPathDto(str, str2, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SharingPathDto)) {
            return false;
        }
        SharingPathDto sharingPathDto = (SharingPathDto) obj;
        return Intrinsics.c(this.a, sharingPathDto.a) && Intrinsics.c(this.b, sharingPathDto.b) && Intrinsics.c(this.c, sharingPathDto.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SharingPathDto(story=");
        sb.append(this.a);
        sb.append(", moment=");
        sb.append(this.b);
        sb.append(", video=");
        return lnb.q(sb, this.c, ')');
    }
}
