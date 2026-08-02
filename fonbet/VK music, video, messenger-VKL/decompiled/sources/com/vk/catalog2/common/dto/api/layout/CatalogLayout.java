package com.vk.catalog2.common.dto.api.layout;

import android.os.Bundle;
import com.vk.catalog2.common.dto.api.CatalogCustomAttributes$Keys;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.layout.LayoutSize;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;
import xsna.aay;
import xsna.bh10;
import xsna.bxx;
import xsna.cqm0;
import xsna.epx;
import xsna.fsk;
import xsna.j5g;
import xsna.qoy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: CatalogLayout.kt */
/* loaded from: classes16.dex */
public class CatalogLayout extends Serializer.StreamParcelableAdapter implements bxx {
    public final CatalogViewType b;
    public final UserId c;
    public final String d;
    public final String e;
    public final TopTitle f;
    public final boolean g;
    public final Bundle h;
    public final LayoutSize i;
    public final String j;
    public static final c k = new c();
    public static final Serializer.c<CatalogLayout> CREATOR = new d();
    public static final CatalogLayout l = new CatalogLayout(CatalogViewType.UNKNOWN, UserId.d, "", "", null, false, null, null, null, 496, null);

    /* compiled from: CatalogLayout.kt */
    public static final class a {

        /* compiled from: CatalogLayout.kt */
        /* renamed from: com.vk.catalog2.common.dto.api.layout.CatalogLayout$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0480a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[CatalogViewType.values().length];
                try {
                    iArr[CatalogViewType.SLIDER.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[CatalogViewType.LARGE_SLIDER.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[CatalogViewType.LARGE_LIST.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[CatalogViewType.LARGE_SLIDER_WITH_VERTICAL_VIDEOS.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[CatalogViewType.PROMO_BANNERS_SLIDER.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[CatalogViewType.PODCAST_BANNERS_SLIDER.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[CatalogViewType.SLIDER_CARD.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[CatalogViewType.HORIZONTAL_BUTTONS_STACK.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public static final CatalogViewType a(JSONObject jSONObject) {
            c cVar = CatalogLayout.k;
            CatalogViewType I = fsk.I(jSONObject.optString("name"));
            if (!jSONObject.optBoolean("infinite_repeat")) {
                return I;
            }
            switch (C0480a.$EnumSwitchMapping$0[I.ordinal()]) {
                case 1:
                    return CatalogViewType.SLIDER_INFINITE;
                case 2:
                    return CatalogViewType.LARGE_SLIDER_INFINITE;
                case 3:
                    return CatalogViewType.LARGE_LIST_INFINITE;
                case 4:
                    return CatalogViewType.LARGE_SLIDER_INFINITE;
                case 5:
                    return CatalogViewType.PROMO_BANNERS_SLIDER_INFINITE;
                case 6:
                    return CatalogViewType.PODCAST_BANNERS_SLIDER_INFINITE;
                case 7:
                    return CatalogViewType.SLIDER_CARD_INFINITE;
                case 8:
                    return CatalogViewType.HORIZONTAL_BUTTONS_STACK;
                default:
                    return I;
            }
        }
    }

    /* compiled from: CatalogLayout.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CatalogViewType.values().length];
            try {
                iArr[CatalogViewType.GRID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CatalogViewType.BANNER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: JsonParser.kt */
    public static final class c extends aay<CatalogLayout> {
        @Override // xsna.aay
        public final CatalogLayout a(JSONObject jSONObject) {
            c cVar = CatalogLayout.k;
            int i = b.$EnumSwitchMapping$0[a.a(jSONObject).ordinal()];
            return i != 1 ? i != 2 ? new CatalogLayout(jSONObject) : new CatalogBannerLayout(jSONObject) : new CatalogGridLayout(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class d extends Serializer.c<CatalogLayout> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogLayout a(Serializer serializer) {
            return new CatalogLayout(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogLayout[i];
        }
    }

    public /* synthetic */ CatalogLayout(CatalogViewType catalogViewType, UserId userId, String str, String str2, TopTitle topTitle, boolean z, Bundle bundle, LayoutSize layoutSize, String str3, int i, zcl zclVar) {
        this(catalogViewType, (i & 2) != 0 ? UserId.d : userId, (i & 4) != 0 ? "" : str, (i & 8) == 0 ? str2 : "", (i & 16) != 0 ? null : topTitle, (i & 32) != 0 ? false : z, (i & 64) != 0 ? new Bundle() : bundle, (i & 128) != 0 ? null : layoutSize, (i & 256) != 0 ? null : str3);
    }

    public static CatalogLayout zb(CatalogLayout catalogLayout, CatalogViewType catalogViewType, Bundle bundle, int i) {
        if ((i & 1) != 0) {
            catalogViewType = null;
        }
        if ((i & 2) != 0) {
            bundle = null;
        }
        if (catalogViewType == null) {
            catalogViewType = catalogLayout.b;
        }
        CatalogViewType catalogViewType2 = catalogViewType;
        UserId userId = catalogLayout.c;
        String str = catalogLayout.d;
        String str2 = catalogLayout.e;
        TopTitle topTitle = catalogLayout.f;
        boolean z = catalogLayout.g;
        if (bundle == null) {
            bundle = catalogLayout.h;
        }
        return new CatalogLayout(catalogViewType2, userId, str, str2, topTitle, z, bundle, catalogLayout.i, catalogLayout.j);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public void O7(Serializer serializer) {
        serializer.j0(this.b.getId());
        serializer.e0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.e0(this.f);
        serializer.L(this.g ? (byte) 1 : (byte) 0);
        serializer.e0(this.h);
        LayoutSize layoutSize = this.i;
        serializer.j0(layoutSize != null ? layoutSize.getId() : null);
        serializer.j0(this.j);
    }

    public JSONObject e5() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", this.b.getId());
        jSONObject.put("owner_id", this.c.b);
        jSONObject.put("title", this.d);
        jSONObject.put("subtitle", this.e);
        jSONObject.put("top_title", this.f);
        jSONObject.put("infinite_repeat", this.g);
        Bundle bundle = this.h;
        for (String str : bundle.keySet()) {
            jSONObject.put(str, bundle.get(str));
        }
        jSONObject.put("size", this.i);
        jSONObject.put("icon", this.j);
        return jSONObject;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        CatalogLayout catalogLayout = (CatalogLayout) obj;
        if (this.b != catalogLayout.b || !epx.f(this.c, catalogLayout.c) || !epx.f(this.d, catalogLayout.d) || !epx.f(this.e, catalogLayout.e) || !epx.f(this.f, catalogLayout.f) || !epx.f(this.j, catalogLayout.j) || this.g != catalogLayout.g) {
            return false;
        }
        Bundle bundle = catalogLayout.h;
        Bundle bundle2 = this.h;
        for (String str : j5g.T0(bundle2.keySet(), bundle.keySet())) {
            if (!epx.f(bundle2.get(str), bundle.get(str))) {
                return false;
            }
        }
        return this.i == catalogLayout.i;
    }

    public int hashCode() {
        int a2 = urd0.a(urd0.a(bh10.a(this.b.hashCode() * 31, 31, this.c.b), 31, this.d), 31, this.e);
        String str = this.j;
        int hashCode = (a2 + (str != null ? str.hashCode() : 0)) * 31;
        TopTitle topTitle = this.f;
        int hashCode2 = (this.h.hashCode() + qoy.b((hashCode + (topTitle != null ? topTitle.hashCode() : 0)) * 31, 31, this.g)) * 31;
        LayoutSize layoutSize = this.i;
        return hashCode2 + (layoutSize != null ? layoutSize.hashCode() : 0);
    }

    public CatalogLayout(CatalogViewType catalogViewType, UserId userId, String str, String str2, TopTitle topTitle, boolean z, Bundle bundle, LayoutSize layoutSize, String str3) {
        this.b = catalogViewType;
        this.c = userId;
        this.d = str;
        this.e = str2;
        this.f = topTitle;
        this.g = z;
        this.h = bundle;
        this.i = layoutSize;
        this.j = str3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CatalogLayout(JSONObject jSONObject) {
        this(r1, r2, r3, r4, r5, r0, r7, LayoutSize.a.a(r8), cqm0.a(jSONObject.optString("icon")));
        CatalogViewType a2 = a.a(jSONObject);
        UserId userId = new UserId(jSONObject.optLong("owner_id"));
        String optString = jSONObject.optString("title");
        String optString2 = jSONObject.optString("subtitle");
        TopTitle topTitle = jSONObject.has("top_title") ? (TopTitle) TopTitle.d.a(jSONObject.getJSONObject("top_title")) : null;
        boolean optBoolean = jSONObject.optBoolean("infinite_repeat");
        Bundle bundle = new Bundle();
        CatalogCustomAttributes$Keys[] values = CatalogCustomAttributes$Keys.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (CatalogCustomAttributes$Keys catalogCustomAttributes$Keys : values) {
            arrayList.add(catalogCustomAttributes$Keys.h());
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Object opt = jSONObject.opt(str);
            String str2 = opt instanceof String ? (String) opt : null;
            if (str2 != null) {
                bundle.putString(str, str2);
            }
        }
        LayoutSize.a aVar = LayoutSize.Companion;
        String optString3 = jSONObject.optString("size");
        aVar.getClass();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CatalogLayout(Serializer serializer) {
        this(r2, r3, r4, r5, r6, r7, r8, LayoutSize.a.a(r1), serializer.H());
        CatalogViewType I = fsk.I(serializer.H());
        UserId userId = (UserId) serializer.A(UserId.class.getClassLoader());
        String H = serializer.H();
        String str = H == null ? "" : H;
        String H2 = serializer.H();
        String str2 = H2 == null ? "" : H2;
        TopTitle topTitle = (TopTitle) serializer.A(TopTitle.class.getClassLoader());
        boolean m = serializer.m();
        Bundle bundle = (Bundle) serializer.A(Bundle.class.getClassLoader());
        Bundle bundle2 = bundle == null ? Bundle.EMPTY : bundle;
        LayoutSize.a aVar = LayoutSize.Companion;
        String H3 = serializer.H();
        aVar.getClass();
    }
}
