package com.braze.enums;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.braze.models.IPutIntoJson;
import com.braze.models.inappmessage.InAppMessageBase;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.util.LinkedHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.ranges.RangesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class d implements IPutIntoJson {
    public static final d A;
    public static final d B;
    public static final d C;
    public static final d D;
    public static final d E;
    public static final d F;
    public static final d G;
    public static final d H;
    public static final d I;
    public static final /* synthetic */ d[] J;
    public static final c b;
    public static final LinkedHashMap c;
    public static final d d;
    public static final d e;
    public static final d f;
    public static final d g;
    public static final d h;
    public static final d i;
    public static final d j;
    public static final d k;
    public static final d l;
    public static final d m;
    public static final d n;
    public static final d o;
    public static final d p;
    public static final d q;
    public static final d r;
    public static final d s;
    public static final d t;
    public static final d u;
    public static final d v;
    public static final d w;
    public static final d x;
    public static final d y;
    public static final d z;

    /* renamed from: a, reason: collision with root package name */
    public final String f503a;

    static {
        d dVar = new d("LOCATION_RECORDED", 0, "lr");
        d = dVar;
        d dVar2 = new d("CUSTOM_EVENT", 1, "ce");
        e = dVar2;
        d dVar3 = new d(ViewHierarchyConstants.PURCHASE, 2, "p");
        f = dVar3;
        d dVar4 = new d("PUSH_STORY_PAGE_CLICK", 3, "cic");
        g = dVar4;
        d dVar5 = new d("PUSH_CLICKED", 4, "pc");
        h = dVar5;
        d dVar6 = new d("PUSH_ACTION_BUTTON_CLICKED", 5, "ca");
        i = dVar6;
        d dVar7 = new d("INTERNAL", 6, "i");
        d dVar8 = new d("INTERNAL_ERROR", 7, "ie");
        j = dVar8;
        d dVar9 = new d("GEOFENCE", 8, "g");
        k = dVar9;
        d dVar10 = new d("CONTENT_CARDS_CLICK", 9, "ccc");
        l = dVar10;
        d dVar11 = new d("CONTENT_CARDS_IMPRESSION", 10, "cci");
        m = dVar11;
        d dVar12 = new d("CONTENT_CARDS_CONTROL_IMPRESSION", 11, "ccic");
        n = dVar12;
        d dVar13 = new d("CONTENT_CARDS_DISMISS", 12, "ccd");
        o = dVar13;
        d dVar14 = new d("INCREMENT", 13, "inc");
        p = dVar14;
        d dVar15 = new d("ADD_TO_CUSTOM_ATTRIBUTE_ARRAY", 14, "add");
        q = dVar15;
        d dVar16 = new d("REMOVE_FROM_CUSTOM_ATTRIBUTE_ARRAY", 15, "rem");
        r = dVar16;
        d dVar17 = new d("SET_CUSTOM_ATTRIBUTE_ARRAY", 16, "set");
        s = dVar17;
        d dVar18 = new d("INAPP_MESSAGE_IMPRESSION", 17, "si");
        t = dVar18;
        d dVar19 = new d("INAPP_MESSAGE_CONTROL_IMPRESSION", 18, "iec");
        u = dVar19;
        d dVar20 = new d("INAPP_MESSAGE_CLICK", 19, "sc");
        v = dVar20;
        d dVar21 = new d("INAPP_MESSAGE_BUTTON_CLICK", 20, "sbc");
        w = dVar21;
        d dVar22 = new d("INAPP_MESSAGE_MESSAGE_EXTRAS", 21, InAppMessageBase.MESSAGE_EXTRAS);
        d dVar23 = new d("USER_ALIAS", 22, "uae");
        x = dVar23;
        d dVar24 = new d("SESSION_START", 23, "ss");
        y = dVar24;
        d dVar25 = new d("SESSION_END", 24, "se");
        z = dVar25;
        d dVar26 = new d("TEST_TYPE", 25, TtmlNode.TAG_TT);
        d dVar27 = new d("LOCATION_CUSTOM_ATTRIBUTE_ADD", 26, "lcaa");
        A = dVar27;
        d dVar28 = new d("LOCATION_CUSTOM_ATTRIBUTE_REMOVE", 27, "lcar");
        B = dVar28;
        d dVar29 = new d("NESTED_CUSTOM_ATTRIBUTE_MERGE", 28, "ncam");
        C = dVar29;
        d dVar30 = new d("SUBSCRIPTION_GROUP_UPDATE", 29, "sgu");
        D = dVar30;
        d dVar31 = new d("FEATURE_FLAG_IMPRESSION_EVENT", 30, "ffi");
        E = dVar31;
        d dVar32 = new d("BANNER_IMPRESSION_EVENT", 31, "bi");
        F = dVar32;
        d dVar33 = new d("BANNER_CLICK_EVENT", 32, "bc");
        G = dVar33;
        d dVar34 = new d("PUSH_DELIVERY_EVENT", 33, "pde");
        H = dVar34;
        d dVar35 = new d("UNKNOWN", 34, "");
        I = dVar35;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, dVar8, dVar9, dVar10, dVar11, dVar12, dVar13, dVar14, dVar15, dVar16, dVar17, dVar18, dVar19, dVar20, dVar21, dVar22, dVar23, dVar24, dVar25, dVar26, dVar27, dVar28, dVar29, dVar30, dVar31, dVar32, dVar33, dVar34, dVar35};
        J = dVarArr;
        EnumEntries enumEntries = EnumEntriesKt.enumEntries(dVarArr);
        b = new c();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(enumEntries, 10)), 16));
        for (Object obj : enumEntries) {
            linkedHashMap.put(((d) obj).f503a, obj);
        }
        c = linkedHashMap;
    }

    public d(String str, int i2, String str2) {
        this.f503a = str2;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) J.clone();
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut */
    public final Object getPropertiesJSONObject() {
        return this.f503a;
    }
}
