package com.vk.api.parsers;

import android.graphics.Color;
import android.os.Bundle;
import android.util.SparseArray;
import com.vk.dto.badges.BadgeImage;
import com.vk.dto.badges.BadgeItem;
import com.vk.dto.badges.BadgeUnlockInfo;
import com.vk.dto.badges.UnlockButton;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.webrtc.Privacy;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.drm0;
import xsna.epx;
import xsna.f370;
import xsna.zrp;

/* compiled from: BadgesParsers.kt */
/* loaded from: classes15.dex */
public final class BadgesParsers {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BadgesParsers.kt */
    public static final class CounterType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ CounterType[] $VALUES;
        public static final CounterType BADGE;
        public static final CounterType FRIENDS;
        public static final CounterType TOTAL;

        static {
            CounterType counterType = new CounterType("BADGE", 0);
            BADGE = counterType;
            CounterType counterType2 = new CounterType("TOTAL", 1);
            TOTAL = counterType2;
            CounterType counterType3 = new CounterType(Privacy.FRIENDS, 2);
            FRIENDS = counterType3;
            CounterType[] counterTypeArr = {counterType, counterType2, counterType3};
            $VALUES = counterTypeArr;
            $ENTRIES = new asp(counterTypeArr);
        }

        public CounterType() {
            throw null;
        }

        public static CounterType valueOf(String str) {
            return (CounterType) Enum.valueOf(CounterType.class, str);
        }

        public static CounterType[] values() {
            return (CounterType[]) $VALUES.clone();
        }
    }

    /* compiled from: BadgesParsers.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CounterType.values().length];
            try {
                iArr[CounterType.BADGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CounterType.TOTAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CounterType.FRIENDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static BadgeUnlockInfo a(JSONObject jSONObject) {
        Bundle bundle;
        String string = jSONObject.getString("title");
        String string2 = jSONObject.getString("text");
        JSONObject optJSONObject = jSONObject.optJSONObject("button");
        UnlockButton unlockButton = null;
        Bundle bundle2 = null;
        String str = null;
        if (optJSONObject != null) {
            String optString = optJSONObject.optString("title");
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("action");
            if (optJSONObject2 != null) {
                String optString2 = optJSONObject2.optString("url");
                JSONObject optJSONObject3 = optJSONObject2.optJSONObject("away_params");
                if (optJSONObject3 != null) {
                    bundle2 = new Bundle();
                    Iterator<String> keys = optJSONObject3.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        bundle2.putString(next, optJSONObject3.optString(next, ""));
                    }
                }
                bundle = bundle2;
                str = optString2;
            } else {
                bundle = null;
            }
            unlockButton = new UnlockButton(optString, str, bundle);
        }
        return new BadgeUnlockInfo(string, string2, unlockButton);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x020d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final SparseArray<BadgeItem> b(JSONObject jSONObject) {
        BadgeItem.BadgeType badgeType;
        BadgeItem.BadgeType badgeType2;
        JSONArray optJSONArray;
        JSONArray jSONArray;
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        int length;
        int i;
        JSONObject jSONObject2;
        CounterType counterType;
        int i2;
        int i3;
        Integer x;
        JSONObject optJSONObject = jSONObject != null ? jSONObject.optJSONObject("owner_info") : null;
        JSONArray optJSONArray2 = optJSONObject != null ? optJSONObject.optJSONArray("counters") : null;
        JSONArray jSONArray2 = new JSONArray();
        JSONArray optJSONArray3 = jSONObject != null ? jSONObject.optJSONArray("items") : null;
        ArrayList arrayList = new ArrayList();
        if (optJSONArray3 != null) {
            int length2 = optJSONArray3.length();
            for (int i4 = 0; i4 < length2; i4++) {
                JSONObject jSONObject3 = optJSONArray3.getJSONObject(i4);
                JSONObject optJSONObject2 = jSONObject3.optJSONObject("donut_badge_info");
                if (optJSONObject2 != null) {
                    jSONArray2.put(optJSONObject2);
                }
                JSONObject optJSONObject3 = jSONObject3.optJSONObject("badges");
                if (optJSONObject3 != null) {
                    arrayList.add(optJSONObject3);
                }
            }
        }
        JSONArray jSONArray3 = new JSONArray();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            JSONArray optJSONArray4 = ((JSONObject) it.next()).optJSONArray("counters");
            if (optJSONArray4 != null) {
                int length3 = optJSONArray4.length();
                for (int i5 = 0; i5 < length3; i5++) {
                    jSONArray3.put(optJSONArray4.getJSONObject(i5));
                }
            }
        }
        JSONArray optJSONArray5 = jSONObject != null ? jSONObject.optJSONArray("badges") : null;
        if (optJSONArray2 == null) {
            optJSONArray2 = jSONArray3;
        }
        SparseArray<BadgeItem> sparseArray = new SparseArray<>();
        if (optJSONArray5 != null) {
            int length4 = optJSONArray5.length();
            int i6 = 0;
            while (i6 < length4) {
                JSONObject jSONObject4 = optJSONArray5.getJSONObject(i6);
                JSONObject optJSONObject4 = jSONObject4.optJSONObject("price");
                JSONObject optJSONObject5 = jSONObject4.optJSONObject("label");
                JSONObject jSONObject5 = jSONObject4.getJSONObject("image");
                int optInt = jSONObject4.optInt("id");
                String optString = jSONObject4.optString("title");
                String optString2 = jSONObject4.optString("description");
                BadgeImage badgeImage = new BadgeImage(jSONObject5.getString("base_url"));
                Integer x2 = f370.x(jSONObject4, SignalingProtocol.KEY_LIMIT);
                BadgeItem.BadgeLockStatus.a aVar = BadgeItem.BadgeLockStatus.Companion;
                int optInt2 = jSONObject4.optInt("lock_status");
                aVar.getClass();
                BadgeItem.BadgeLockStatus a2 = BadgeItem.BadgeLockStatus.a.a(optInt2);
                int optInt3 = optJSONObject4 != null ? optJSONObject4.optInt("current") : 0;
                Integer x3 = optJSONObject4 != null ? f370.x(optJSONObject4, "regular") : null;
                Integer valueOf = Integer.valueOf((optJSONObject4 == null || (x = f370.x(optJSONObject4, "discount")) == null) ? 0 : x.intValue());
                BadgeItem.BadgeType.a aVar2 = BadgeItem.BadgeType.Companion;
                String optString3 = jSONObject4.optString("label");
                aVar2.getClass();
                if (optString3.equals("new")) {
                    badgeType2 = BadgeItem.BadgeType.NEW;
                } else if (optString3.equals("discount")) {
                    badgeType2 = BadgeItem.BadgeType.DISCOUNT;
                } else {
                    badgeType = null;
                    String optString4 = optJSONObject5 == null ? optJSONObject5.optString("text") : null;
                    JSONObject optJSONObject6 = jSONObject4.optJSONObject("unlock_info");
                    BadgeUnlockInfo a3 = optJSONObject6 == null ? a(optJSONObject6) : null;
                    boolean optBoolean = jSONObject4.optBoolean("is_disabled");
                    optJSONArray = jSONObject4.optJSONArray("styles");
                    if (optJSONArray == null) {
                        int length5 = optJSONArray.length();
                        int i7 = 0;
                        num3 = null;
                        num4 = null;
                        Integer num5 = null;
                        Integer num6 = null;
                        while (i7 < length5) {
                            JSONObject jSONObject6 = optJSONArray.getJSONObject(i7);
                            JSONArray jSONArray4 = optJSONArray5;
                            try {
                                i2 = Color.parseColor(jSONObject6.getString("background_color"));
                            } catch (IllegalArgumentException unused) {
                                i2 = 0;
                            }
                            try {
                                i3 = Color.parseColor(jSONObject6.getString("text_color"));
                            } catch (IllegalArgumentException unused2) {
                                i3 = 0;
                            }
                            String string = jSONObject6.getString("color_scheme");
                            if (epx.f(string, "light")) {
                                num3 = Integer.valueOf(i2);
                                num5 = Integer.valueOf(i3);
                            } else if (epx.f(string, "dark")) {
                                num4 = Integer.valueOf(i2);
                                num6 = Integer.valueOf(i3);
                            }
                            i7++;
                            optJSONArray5 = jSONArray4;
                        }
                        jSONArray = optJSONArray5;
                        num = num5;
                        num2 = num6;
                    } else {
                        jSONArray = optJSONArray5;
                        num = null;
                        num2 = null;
                        num3 = null;
                        num4 = null;
                    }
                    BadgeItem.BadgeStyle badgeStyle = new BadgeItem.BadgeStyle(num, num2, num3, num4);
                    int optInt4 = jSONObject4.optInt("id");
                    length = optJSONArray2.length();
                    i = 0;
                    while (true) {
                        if (i < length) {
                            jSONObject2 = null;
                            break;
                        }
                        jSONObject2 = optJSONArray2.getJSONObject(i);
                        try {
                            counterType = CounterType.valueOf(jSONObject2.optString("type").toUpperCase(Locale.ROOT));
                        } catch (Exception unused3) {
                            counterType = CounterType.TOTAL;
                        }
                        if (a.$EnumSwitchMapping$0[counterType.ordinal()] == 1) {
                            int optInt5 = jSONObject2.optInt("badge_id");
                            String optString5 = jSONObject2.optString("donut_sum");
                            if (optInt5 == optInt4 && optString5 != null && !drm0.N(optString5)) {
                                break;
                            }
                        }
                        i++;
                    }
                    BadgeItem badgeItem = new BadgeItem(optInt, optString, optString2, badgeImage, x2, a2, optInt3, x3, valueOf, badgeType, optString4, a3, optBoolean, badgeStyle, jSONObject2 == null, jSONObject4.optString("alt_text"));
                    sparseArray.put(badgeItem.b, badgeItem);
                    i6++;
                    optJSONArray5 = jSONArray;
                }
                badgeType = badgeType2;
                if (optJSONObject5 == null) {
                }
                JSONObject optJSONObject62 = jSONObject4.optJSONObject("unlock_info");
                if (optJSONObject62 == null) {
                }
                boolean optBoolean2 = jSONObject4.optBoolean("is_disabled");
                optJSONArray = jSONObject4.optJSONArray("styles");
                if (optJSONArray == null) {
                }
                BadgeItem.BadgeStyle badgeStyle2 = new BadgeItem.BadgeStyle(num, num2, num3, num4);
                int optInt42 = jSONObject4.optInt("id");
                length = optJSONArray2.length();
                i = 0;
                while (true) {
                    if (i < length) {
                    }
                    i++;
                }
                BadgeItem badgeItem2 = new BadgeItem(optInt, optString, optString2, badgeImage, x2, a2, optInt3, x3, valueOf, badgeType, optString4, a3, optBoolean2, badgeStyle2, jSONObject2 == null, jSONObject4.optString("alt_text"));
                sparseArray.put(badgeItem2.b, badgeItem2);
                i6++;
                optJSONArray5 = jSONArray;
            }
        }
        return sparseArray;
    }
}
