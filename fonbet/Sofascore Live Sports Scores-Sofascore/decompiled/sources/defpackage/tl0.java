package defpackage;

import androidx.core.app.NotificationCompat;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.LinkedHashMap;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class tl0 {
    public static final tl0 A;
    public static final tl0 B;
    public static final tl0 C;
    public static final tl0 D;
    public static final tl0 E;
    public static final /* synthetic */ tl0[] F;
    public static final tl0 b;
    public static final tl0 c;
    public static final tl0 d;
    public static final tl0 e;
    public static final tl0 f;
    public static final tl0 g;
    public static final tl0 h;
    public static final tl0 i;
    public static final tl0 j;
    public static final tl0 k;
    public static final tl0 l;
    public static final tl0 m;
    public static final tl0 n;
    public static final tl0 o;
    public static final tl0 p;
    public static final tl0 q;
    public static final tl0 r;
    public static final tl0 s;
    public static final tl0 t;
    public static final tl0 u;
    public static final tl0 v;
    public static final tl0 w;
    public static final tl0 x;
    public static final tl0 y;
    public static final tl0 z;
    public final String a;

    static {
        tl0 tl0Var = new tl0("ATOM", 0, "feed");
        b = tl0Var;
        tl0 tl0Var2 = new tl0(NativeAdContent.ViewTag.AD_TITLE, 1, "title");
        c = tl0Var2;
        tl0 tl0Var3 = new tl0(NativeAdContent.ViewTag.AD_ICON, 2, "icon");
        d = tl0Var3;
        tl0 tl0Var4 = new tl0("SUBTITLE", 3, "subtitle");
        e = tl0Var4;
        tl0 tl0Var5 = new tl0("UPDATED", 4, "updated");
        f = tl0Var5;
        tl0 tl0Var6 = new tl0("LINK", 5, "link");
        g = tl0Var6;
        tl0 tl0Var7 = new tl0("LINK_HREF", 6, "href");
        h = tl0Var7;
        tl0 tl0Var8 = new tl0("LINK_REL", 7, "rel");
        i = tl0Var8;
        tl0 tl0Var9 = new tl0("LINK_REL_ALTERNATE", 8, "alternate");
        tl0 tl0Var10 = new tl0("LINK_REL_ENCLOSURE", 9, "enclosure");
        tl0 tl0Var11 = new tl0("LINK_REL_REPLIES", 10, "replies");
        tl0 tl0Var12 = new tl0("LINK_EDIT", 11, "edit");
        tl0 tl0Var13 = new tl0("LINK_SELF", 12, "self");
        tl0 tl0Var14 = new tl0("ENTRY_ITEM", 13, "entry");
        j = tl0Var14;
        tl0 tl0Var15 = new tl0("ENTRY_GUID", 14, "id");
        k = tl0Var15;
        tl0 tl0Var16 = new tl0("ENTRY_CONTENT", 15, HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT);
        l = tl0Var16;
        tl0 tl0Var17 = new tl0("ENTRY_PUBLISHED", 16, "published");
        m = tl0Var17;
        tl0 tl0Var18 = new tl0("ENTRY_CATEGORY", 17, "category");
        n = tl0Var18;
        tl0 tl0Var19 = new tl0("ENTRY_TERM", 18, "term");
        o = tl0Var19;
        tl0 tl0Var20 = new tl0("ENTRY_DESCRIPTION", 19, "summary");
        p = tl0Var20;
        tl0 tl0Var21 = new tl0("ENTRY_AUTHOR", 20, "name");
        q = tl0Var21;
        tl0 tl0Var22 = new tl0("ENTRY_AUTHOR_METADATA", 21, "author");
        r = tl0Var22;
        tl0 tl0Var23 = new tl0("ENTRY_EMAIL", 22, NotificationCompat.CATEGORY_EMAIL);
        tl0 tl0Var24 = new tl0("MEDIA_GROUP_CONTENT", 23, "media:content");
        s = tl0Var24;
        tl0 tl0Var25 = new tl0("YOUTUBE_CHANNEL_ID", 24, "yt:channelId");
        t = tl0Var25;
        tl0 tl0Var26 = new tl0("YOUTUBE_VIDEO_ID", 25, "yt:videoId");
        u = tl0Var26;
        tl0 tl0Var27 = new tl0("YOUTUBE_MEDIA_GROUP", 26, "media:group");
        v = tl0Var27;
        tl0 tl0Var28 = new tl0("YOUTUBE_MEDIA_GROUP_TITLE", 27, "media:title");
        w = tl0Var28;
        tl0 tl0Var29 = new tl0("YOUTUBE_MEDIA_GROUP_CONTENT_URL", 28, "url");
        x = tl0Var29;
        tl0 tl0Var30 = new tl0("YOUTUBE_MEDIA_GROUP_THUMBNAIL", 29, "media:thumbnail");
        y = tl0Var30;
        tl0 tl0Var31 = new tl0("YOUTUBE_MEDIA_GROUP_THUMBNAIL_URL", 30, "url");
        z = tl0Var31;
        tl0 tl0Var32 = new tl0("YOUTUBE_MEDIA_GROUP_DESCRIPTION", 31, "media:description");
        A = tl0Var32;
        tl0 tl0Var33 = new tl0("YOUTUBE_MEDIA_GROUP_COMMUNITY", 32, "media:community");
        tl0 tl0Var34 = new tl0("YOUTUBE_MEDIA_GROUP_COMMUNITY_STAR_RATING", 33, "media:starRating");
        B = tl0Var34;
        tl0 tl0Var35 = new tl0("YOUTUBE_MEDIA_GROUP_COMMUNITY_STAR_RATING_COUNT", 34, "count");
        C = tl0Var35;
        tl0 tl0Var36 = new tl0("YOUTUBE_MEDIA_GROUP_COMMUNITY_STATISTICS", 35, "media:statistics");
        D = tl0Var36;
        tl0 tl0Var37 = new tl0("YOUTUBE_MEDIA_GROUP_COMMUNITY_STATISTICS_VIEWS", 36, "views");
        E = tl0Var37;
        tl0[] tl0VarArr = {tl0Var, tl0Var2, tl0Var3, tl0Var4, tl0Var5, tl0Var6, tl0Var7, tl0Var8, tl0Var9, tl0Var10, tl0Var11, tl0Var12, tl0Var13, tl0Var14, tl0Var15, tl0Var16, tl0Var17, tl0Var18, tl0Var19, tl0Var20, tl0Var21, tl0Var22, tl0Var23, tl0Var24, tl0Var25, tl0Var26, tl0Var27, tl0Var28, tl0Var29, tl0Var30, tl0Var31, tl0Var32, tl0Var33, tl0Var34, tl0Var35, tl0Var36, tl0Var37};
        F = tl0VarArr;
        kp5 kp5Var = new kp5(tl0VarArr);
        int c2 = sub.c(k13.r(kp5Var, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(c2 < 16 ? 16 : c2);
        for (Object obj : kp5Var) {
            String lowerCase = ((tl0) obj).a.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            linkedHashMap.put(lowerCase, obj);
        }
    }

    public tl0(String str, int i2, String str2) {
        this.a = str2;
    }

    public static tl0 valueOf(String str) {
        return (tl0) Enum.valueOf(tl0.class, str);
    }

    public static tl0[] values() {
        return (tl0[]) F.clone();
    }
}
