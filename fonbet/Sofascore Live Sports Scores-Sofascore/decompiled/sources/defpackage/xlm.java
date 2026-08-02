package defpackage;

import com.blaze.blazesdk.ads.models.ui.BlazeAdInfoModel;
import com.blaze.blazesdk.ads.models.ui.BlazeBannerAdInfo;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class xlm {
    public final String a;
    public List b;
    public n4m c;
    public int d;
    public final boolean e;
    public final BlazeAdInfoModel f;
    public final BlazeBannerAdInfo g;
    public final BlazeAdInfoModel h;

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ xlm(java.lang.String r10, java.util.List r11, defpackage.n4m r12, int r13, boolean r14, com.blaze.blazesdk.ads.models.ui.BlazeAdInfoModel r15, com.blaze.blazesdk.ads.models.ui.BlazeBannerAdInfo r16, com.blaze.blazesdk.ads.models.ui.BlazeAdInfoModel r17, int r18, kotlin.jvm.internal.DefaultConstructorMarker r19) {
        /*
            r9 = this;
            r0 = r18
            r1 = r0 & 8
            if (r1 == 0) goto L7
            r13 = -1
        L7:
            r4 = r13
            r13 = r0 & 16
            if (r13 == 0) goto Lf
            r13 = 0
            r5 = r13
            goto L10
        Lf:
            r5 = r14
        L10:
            r13 = r0 & 32
            r1 = 0
            if (r13 == 0) goto L17
            r6 = r1
            goto L18
        L17:
            r6 = r15
        L18:
            r13 = r0 & 64
            if (r13 == 0) goto L1e
            r7 = r1
            goto L20
        L1e:
            r7 = r16
        L20:
            r13 = r0 & 128(0x80, float:1.8E-43)
            if (r13 == 0) goto L2a
            r8 = r1
            r0 = r9
            r2 = r11
            r3 = r12
            r1 = r10
            goto L30
        L2a:
            r8 = r17
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
        L30:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xlm.<init>(java.lang.String, java.util.List, n4m, int, boolean, com.blaze.blazesdk.ads.models.ui.BlazeAdInfoModel, com.blaze.blazesdk.ads.models.ui.BlazeBannerAdInfo, com.blaze.blazesdk.ads.models.ui.BlazeAdInfoModel, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public static xlm copy$default(xlm xlmVar, String str, List list, n4m n4mVar, int i, boolean z, BlazeAdInfoModel blazeAdInfoModel, BlazeBannerAdInfo blazeBannerAdInfo, BlazeAdInfoModel blazeAdInfoModel2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = xlmVar.a;
        }
        if ((i2 & 2) != 0) {
            list = xlmVar.b;
        }
        if ((i2 & 4) != 0) {
            n4mVar = xlmVar.c;
        }
        if ((i2 & 8) != 0) {
            i = xlmVar.d;
        }
        if ((i2 & 16) != 0) {
            z = xlmVar.e;
        }
        if ((i2 & 32) != 0) {
            blazeAdInfoModel = xlmVar.f;
        }
        if ((i2 & 64) != 0) {
            blazeBannerAdInfo = xlmVar.g;
        }
        if ((i2 & 128) != 0) {
            blazeAdInfoModel2 = xlmVar.h;
        }
        BlazeAdInfoModel blazeAdInfoModel3 = blazeAdInfoModel2;
        xlmVar.getClass();
        str.getClass();
        list.getClass();
        BlazeAdInfoModel blazeAdInfoModel4 = blazeAdInfoModel;
        BlazeBannerAdInfo blazeBannerAdInfo2 = blazeBannerAdInfo;
        boolean z2 = z;
        n4m n4mVar2 = n4mVar;
        return new xlm(str, list, n4mVar2, i, z2, blazeAdInfoModel4, blazeBannerAdInfo2, blazeAdInfoModel3);
    }

    public final int a() {
        Iterator it = this.b.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            Object next = it.next();
            if (i < 0) {
                b.q();
                throw null;
            }
            String str = ((n4m) next).a;
            n4m n4mVar = this.c;
            if (Intrinsics.c(str, n4mVar != null ? n4mVar.a : null)) {
                break;
            }
            i++;
        }
        Integer valueOf = i >= 0 ? Integer.valueOf(i) : null;
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xlm)) {
            return false;
        }
        xlm xlmVar = (xlm) obj;
        return Intrinsics.c(this.a, xlmVar.a) && Intrinsics.c(this.b, xlmVar.b) && Intrinsics.c(this.c, xlmVar.c) && this.d == xlmVar.d && this.e == xlmVar.e && Intrinsics.c(this.f, xlmVar.f) && Intrinsics.c(this.g, xlmVar.g) && Intrinsics.c(this.h, xlmVar.h);
    }

    public final int hashCode() {
        int d = dmi.d(this.a.hashCode() * 31, 31, this.b);
        n4m n4mVar = this.c;
        int t = u0a.t(l4a.e(this.d, (d + (n4mVar == null ? 0 : n4mVar.hashCode())) * 31), this.e);
        BlazeAdInfoModel blazeAdInfoModel = this.f;
        int hashCode = (t + (blazeAdInfoModel == null ? 0 : blazeAdInfoModel.hashCode())) * 31;
        BlazeBannerAdInfo blazeBannerAdInfo = this.g;
        int hashCode2 = (hashCode + (blazeBannerAdInfo == null ? 0 : blazeBannerAdInfo.hashCode())) * 31;
        BlazeAdInfoModel blazeAdInfoModel2 = this.h;
        return hashCode2 + (blazeAdInfoModel2 != null ? blazeAdInfoModel2.hashCode() : 0);
    }

    public final String toString() {
        return "BlazePlaylist(id=" + this.a + ", playables=" + this.b + ", lastPlayingPlayable=" + this.c + ", indexInArray=" + this.d + ", isRead=" + this.e + ", adInfo=" + this.f + ", bannerAdInfo=" + this.g + ", defaultAdsInfo=" + this.h + ')';
    }

    public xlm(@NotNull String str, @NotNull List<n4m> list, @Nullable n4m n4mVar, int i, boolean z, @Nullable BlazeAdInfoModel blazeAdInfoModel, @Nullable BlazeBannerAdInfo blazeBannerAdInfo, @Nullable BlazeAdInfoModel blazeAdInfoModel2) {
        str.getClass();
        list.getClass();
        this.a = str;
        this.b = list;
        this.c = n4mVar;
        this.d = i;
        this.e = z;
        this.f = blazeAdInfoModel;
        this.g = blazeBannerAdInfo;
        this.h = blazeAdInfoModel2;
    }
}
