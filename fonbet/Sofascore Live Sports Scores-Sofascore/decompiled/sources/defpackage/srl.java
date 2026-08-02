package defpackage;

import androidx.core.app.NotificationCompat;
import com.blaze.blazesdk.features.shared.models.ui_shared.i;
import com.blaze.blazesdk.interactions.models.ui.InteractionModel;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class srl implements eqm {
    public final String a;
    public final double b;
    public final boolean c;
    public final xvm d;
    public final i e;
    public final Date f;
    public final rvl g;
    public Boolean h;
    public final String i;
    public final int j;
    public final Date k;
    public final InteractionModel l;
    public final boolean m;
    public final List n;
    public final String o;
    public final Map p;
    public final boolean q;
    public final Map r;

    public srl(@NotNull String str, double d, boolean z, @NotNull xvm xvmVar, @NotNull i iVar, @Nullable Date date, @NotNull rvl rvlVar, @Nullable Boolean bool, @NotNull String str2, int i, @Nullable Date date2, @Nullable InteractionModel interactionModel, boolean z2, @Nullable List<gbm> list, @Nullable String str3, @NotNull Map<String, String> map, boolean z3, @Nullable Map<String, String> map2) {
        str.getClass();
        xvmVar.getClass();
        iVar.getClass();
        rvlVar.getClass();
        str2.getClass();
        map.getClass();
        this.a = str;
        this.b = d;
        this.c = z;
        this.d = xvmVar;
        this.e = iVar;
        this.f = date;
        this.g = rvlVar;
        this.h = bool;
        this.i = str2;
        this.j = i;
        this.k = date2;
        this.l = interactionModel;
        this.m = z2;
        this.n = list;
        this.o = str3;
        this.p = map;
        this.q = z3;
        this.r = map2;
    }

    public static srl copy$default(srl srlVar, String str, double d, boolean z, xvm xvmVar, i iVar, Date date, rvl rvlVar, Boolean bool, String str2, int i, Date date2, InteractionModel interactionModel, boolean z2, List list, String str3, Map map, boolean z3, Map map2, int i2, Object obj) {
        String str4 = (i2 & 1) != 0 ? srlVar.a : str;
        double d2 = (i2 & 2) != 0 ? srlVar.b : d;
        boolean z4 = (i2 & 4) != 0 ? srlVar.c : z;
        xvm xvmVar2 = (i2 & 8) != 0 ? srlVar.d : xvmVar;
        i iVar2 = (i2 & 16) != 0 ? srlVar.e : iVar;
        Date date3 = (i2 & 32) != 0 ? srlVar.f : date;
        rvl rvlVar2 = (i2 & 64) != 0 ? srlVar.g : rvlVar;
        Boolean bool2 = (i2 & 128) != 0 ? srlVar.h : bool;
        String str5 = (i2 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? srlVar.i : str2;
        int i3 = (i2 & 512) != 0 ? srlVar.j : i;
        Date date4 = (i2 & 1024) != 0 ? srlVar.k : date2;
        InteractionModel interactionModel2 = (i2 & a.o) != 0 ? srlVar.l : interactionModel;
        boolean z5 = (i2 & 4096) != 0 ? srlVar.m : z2;
        String str6 = str4;
        List list2 = (i2 & 8192) != 0 ? srlVar.n : list;
        String str7 = (i2 & 16384) != 0 ? srlVar.o : str3;
        Map map3 = (i2 & 32768) != 0 ? srlVar.p : map;
        boolean z6 = (i2 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? srlVar.q : z3;
        Map map4 = (i2 & 131072) != 0 ? srlVar.r : map2;
        srlVar.getClass();
        str6.getClass();
        xvmVar2.getClass();
        iVar2.getClass();
        rvlVar2.getClass();
        str5.getClass();
        map3.getClass();
        return new srl(str6, d2, z4, xvmVar2, iVar2, date3, rvlVar2, bool2, str5, i3, date4, interactionModel2, z5, list2, str7, map3, z6, map4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof srl)) {
            return false;
        }
        srl srlVar = (srl) obj;
        return Intrinsics.c(this.a, srlVar.a) && Double.compare(this.b, srlVar.b) == 0 && this.c == srlVar.c && Intrinsics.c(this.d, srlVar.d) && Intrinsics.c(this.e, srlVar.e) && Intrinsics.c(this.f, srlVar.f) && Intrinsics.c(this.g, srlVar.g) && Intrinsics.c(this.h, srlVar.h) && Intrinsics.c(this.i, srlVar.i) && this.j == srlVar.j && Intrinsics.c(this.k, srlVar.k) && Intrinsics.c(this.l, srlVar.l) && this.m == srlVar.m && Intrinsics.c(this.n, srlVar.n) && Intrinsics.c(this.o, srlVar.o) && Intrinsics.c(this.p, srlVar.p) && this.q == srlVar.q && Intrinsics.c(this.r, srlVar.r);
    }

    @Override // defpackage.eqm
    /* renamed from: h */
    public final List getX() {
        return this.n;
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + ((this.d.hashCode() + u0a.t(dmi.b(this.a.hashCode() * 31, 31, this.b), this.c)) * 31)) * 31;
        Date date = this.f;
        int hashCode2 = (this.g.hashCode() + ((hashCode + (date == null ? 0 : date.hashCode())) * 31)) * 31;
        Boolean bool = this.h;
        int e = l4a.e(this.j, o6a.k(this.i, (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31));
        Date date2 = this.k;
        int hashCode3 = (e + (date2 == null ? 0 : date2.hashCode())) * 31;
        InteractionModel interactionModel = this.l;
        int t = u0a.t((hashCode3 + (interactionModel == null ? 0 : interactionModel.hashCode())) * 31, this.m);
        List list = this.n;
        int hashCode4 = (t + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.o;
        int t2 = u0a.t(dmi.g(this.p, (hashCode4 + (str == null ? 0 : str.hashCode())) * 31, 31), this.q);
        Map map = this.r;
        return t2 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PageModel(id=");
        sb.append(this.a);
        sb.append(", duration=");
        sb.append(this.b);
        sb.append(", isSkippable=");
        sb.append(this.c);
        sb.append(", thumbnail=");
        sb.append(this.d);
        sb.append(", cta=");
        sb.append(this.e);
        sb.append(", updateTime=");
        sb.append(this.f);
        sb.append(", baseLayer=");
        sb.append(this.g);
        sb.append(", isRead=");
        sb.append(this.h);
        sb.append(", pageType=");
        sb.append(this.i);
        sb.append(", index=");
        sb.append(this.j);
        sb.append(", createTime=");
        sb.append(this.k);
        sb.append(", interaction=");
        sb.append(this.l);
        sb.append(", ignoreReadStatusForStory=");
        sb.append(this.m);
        sb.append(", closedCaptions=");
        sb.append(this.n);
        sb.append(", parentStoryId=");
        sb.append(this.o);
        sb.append(", extraInfo=");
        sb.append(this.p);
        sb.append(", shouldShowBannerAd=");
        sb.append(this.q);
        sb.append(", retrievedLanguages=");
        return dmi.s(sb, this.r, ')');
    }
}
