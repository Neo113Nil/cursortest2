package bo.app;

import com.braze.models.IPutIntoJson;
import java.util.LinkedHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.ranges.RangesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class w7 implements IPutIntoJson {

    /* renamed from: A, reason: collision with root package name */
    public static final w7 f26158A;

    /* renamed from: B, reason: collision with root package name */
    public static final w7 f26159B;

    /* renamed from: C, reason: collision with root package name */
    public static final w7 f26160C;

    /* renamed from: D, reason: collision with root package name */
    public static final w7 f26161D;

    /* renamed from: E, reason: collision with root package name */
    public static final w7 f26162E;

    /* renamed from: F, reason: collision with root package name */
    public static final w7 f26163F;

    /* renamed from: G, reason: collision with root package name */
    public static final w7 f26164G;

    /* renamed from: H, reason: collision with root package name */
    public static final w7 f26165H;

    /* renamed from: I, reason: collision with root package name */
    public static final w7 f26166I;

    /* renamed from: J, reason: collision with root package name */
    public static final w7 f26167J;

    /* renamed from: K, reason: collision with root package name */
    public static final /* synthetic */ w7[] f26168K;

    /* renamed from: b, reason: collision with root package name */
    public static final v7 f26169b;

    /* renamed from: c, reason: collision with root package name */
    public static final LinkedHashMap f26170c;

    /* renamed from: d, reason: collision with root package name */
    public static final w7 f26171d;

    /* renamed from: e, reason: collision with root package name */
    public static final w7 f26172e;

    /* renamed from: f, reason: collision with root package name */
    public static final w7 f26173f;

    /* renamed from: g, reason: collision with root package name */
    public static final w7 f26174g;

    /* renamed from: h, reason: collision with root package name */
    public static final w7 f26175h;

    /* renamed from: i, reason: collision with root package name */
    public static final w7 f26176i;

    /* renamed from: j, reason: collision with root package name */
    public static final w7 f26177j;

    /* renamed from: k, reason: collision with root package name */
    public static final w7 f26178k;

    /* renamed from: l, reason: collision with root package name */
    public static final w7 f26179l;

    /* renamed from: m, reason: collision with root package name */
    public static final w7 f26180m;

    /* renamed from: n, reason: collision with root package name */
    public static final w7 f26181n;

    /* renamed from: o, reason: collision with root package name */
    public static final w7 f26182o;

    /* renamed from: p, reason: collision with root package name */
    public static final w7 f26183p;

    /* renamed from: q, reason: collision with root package name */
    public static final w7 f26184q;

    /* renamed from: r, reason: collision with root package name */
    public static final w7 f26185r;

    /* renamed from: s, reason: collision with root package name */
    public static final w7 f26186s;

    /* renamed from: t, reason: collision with root package name */
    public static final w7 f26187t;

    /* renamed from: u, reason: collision with root package name */
    public static final w7 f26188u;

    /* renamed from: v, reason: collision with root package name */
    public static final w7 f26189v;

    /* renamed from: w, reason: collision with root package name */
    public static final w7 f26190w;

    /* renamed from: x, reason: collision with root package name */
    public static final w7 f26191x;

    /* renamed from: y, reason: collision with root package name */
    public static final w7 f26192y;

    /* renamed from: z, reason: collision with root package name */
    public static final w7 f26193z;

    /* renamed from: a, reason: collision with root package name */
    public final String f26194a;

    static {
        w7 w7Var = new w7("LOCATION_RECORDED", 0, "lr");
        f26171d = w7Var;
        w7 w7Var2 = new w7("CUSTOM_EVENT", 1, "ce");
        f26172e = w7Var2;
        w7 w7Var3 = new w7("PURCHASE", 2, "p");
        f26173f = w7Var3;
        w7 w7Var4 = new w7("PUSH_STORY_PAGE_CLICK", 3, "cic");
        f26174g = w7Var4;
        w7 w7Var5 = new w7("PUSH_CLICKED", 4, "pc");
        f26175h = w7Var5;
        w7 w7Var6 = new w7("PUSH_ACTION_BUTTON_CLICKED", 5, "ca");
        f26176i = w7Var6;
        w7 w7Var7 = new w7("INTERNAL", 6, com.google.android.material.shape.i.f35755A);
        w7 w7Var8 = new w7("INTERNAL_ERROR", 7, "ie");
        f26177j = w7Var8;
        w7 w7Var9 = new w7("GEOFENCE", 8, "g");
        f26178k = w7Var9;
        w7 w7Var10 = new w7("CONTENT_CARDS_CLICK", 9, "ccc");
        f26179l = w7Var10;
        w7 w7Var11 = new w7("CONTENT_CARDS_IMPRESSION", 10, "cci");
        f26180m = w7Var11;
        w7 w7Var12 = new w7("CONTENT_CARDS_CONTROL_IMPRESSION", 11, "ccic");
        f26181n = w7Var12;
        w7 w7Var13 = new w7("CONTENT_CARDS_DISMISS", 12, "ccd");
        f26182o = w7Var13;
        w7 w7Var14 = new w7("INCREMENT", 13, "inc");
        f26183p = w7Var14;
        w7 w7Var15 = new w7("ADD_TO_CUSTOM_ATTRIBUTE_ARRAY", 14, "add");
        f26184q = w7Var15;
        w7 w7Var16 = new w7("REMOVE_FROM_CUSTOM_ATTRIBUTE_ARRAY", 15, "rem");
        f26185r = w7Var16;
        w7 w7Var17 = new w7("SET_CUSTOM_ATTRIBUTE_ARRAY", 16, "set");
        f26186s = w7Var17;
        w7 w7Var18 = new w7("INAPP_MESSAGE_IMPRESSION", 17, "si");
        f26187t = w7Var18;
        w7 w7Var19 = new w7("INAPP_MESSAGE_CONTROL_IMPRESSION", 18, "iec");
        f26188u = w7Var19;
        w7 w7Var20 = new w7("INAPP_MESSAGE_CLICK", 19, "sc");
        f26189v = w7Var20;
        w7 w7Var21 = new w7("INAPP_MESSAGE_BUTTON_CLICK", 20, "sbc");
        f26190w = w7Var21;
        w7 w7Var22 = new w7("INAPP_MESSAGE_MESSAGE_EXTRAS", 21, "message_extras");
        w7 w7Var23 = new w7("USER_ALIAS", 22, "uae");
        f26191x = w7Var23;
        w7 w7Var24 = new w7("SESSION_START", 23, "ss");
        f26192y = w7Var24;
        w7 w7Var25 = new w7("SESSION_END", 24, "se");
        f26193z = w7Var25;
        w7 w7Var26 = new w7("TEST_TYPE", 25, "tt");
        w7 w7Var27 = new w7("LOCATION_CUSTOM_ATTRIBUTE_ADD", 26, "lcaa");
        f26158A = w7Var27;
        w7 w7Var28 = new w7("LOCATION_CUSTOM_ATTRIBUTE_REMOVE", 27, "lcar");
        f26159B = w7Var28;
        w7 w7Var29 = new w7("NESTED_CUSTOM_ATTRIBUTE_MERGE", 28, "ncam");
        f26160C = w7Var29;
        w7 w7Var30 = new w7("SUBSCRIPTION_GROUP_UPDATE", 29, "sgu");
        f26161D = w7Var30;
        w7 w7Var31 = new w7("FEATURE_FLAG_IMPRESSION_EVENT", 30, "ffi");
        f26162E = w7Var31;
        w7 w7Var32 = new w7("BANNER_IMPRESSION_EVENT", 31, "bi");
        f26163F = w7Var32;
        w7 w7Var33 = new w7("BANNER_CLICK_EVENT", 32, "bc");
        f26164G = w7Var33;
        w7 w7Var34 = new w7("BANNER_DISMISS_EVENT", 33, "bd");
        f26165H = w7Var34;
        w7 w7Var35 = new w7("PUSH_DELIVERY_EVENT", 34, "pde");
        f26166I = w7Var35;
        w7 w7Var36 = new w7("UNKNOWN", 35, "");
        f26167J = w7Var36;
        w7[] w7VarArr = {w7Var, w7Var2, w7Var3, w7Var4, w7Var5, w7Var6, w7Var7, w7Var8, w7Var9, w7Var10, w7Var11, w7Var12, w7Var13, w7Var14, w7Var15, w7Var16, w7Var17, w7Var18, w7Var19, w7Var20, w7Var21, w7Var22, w7Var23, w7Var24, w7Var25, w7Var26, w7Var27, w7Var28, w7Var29, w7Var30, w7Var31, w7Var32, w7Var33, w7Var34, w7Var35, w7Var36};
        f26168K = w7VarArr;
        EnumEntries enumEntries = EnumEntriesKt.enumEntries(w7VarArr);
        f26169b = new v7();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(enumEntries, 10)), 16));
        for (Object obj : enumEntries) {
            linkedHashMap.put(((w7) obj).f26194a, obj);
        }
        f26170c = linkedHashMap;
    }

    public w7(String str, int i10, String str2) {
        this.f26194a = str2;
    }

    public static w7 valueOf(String str) {
        return (w7) Enum.valueOf(w7.class, str);
    }

    public static w7[] values() {
        return (w7[]) f26168K.clone();
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut */
    public final Object getPropertiesJSONObject() {
        return this.f26194a;
    }
}
