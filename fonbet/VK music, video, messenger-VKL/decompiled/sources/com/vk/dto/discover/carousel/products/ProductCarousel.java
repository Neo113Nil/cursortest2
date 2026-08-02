package com.vk.dto.discover.carousel.products;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.Price;
import com.vk.dto.common.actions.Action;
import com.vk.dto.common.id.UserId;
import com.vk.dto.discover.carousel.Carousel;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.photo.Photo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.asp;
import xsna.bpn0;
import xsna.cqm0;
import xsna.epx;
import xsna.f370;
import xsna.zrp;

/* compiled from: ProductCarousel.kt */
/* loaded from: classes18.dex */
public final class ProductCarousel extends Carousel<ProductCarouselItem> {
    public static final Serializer.c<ProductCarousel> CREATOR = new a();
    public Object o;
    public final ProductCarouselPromoItem p;
    public String q;
    public String r;
    public String s;
    public final String t;
    public final String u;
    public final Object v;
    public final boolean w;
    public final Type x;
    public final Action y;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ProductCarousel.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final a Companion;
        public static final Type MARKET_ITEM;
        private final String id = "market_item";

        /* compiled from: ProductCarousel.kt */
        public static final class a {
        }

        static {
            Type type = new Type();
            MARKET_ITEM = type;
            Type[] typeArr = {type};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
            Companion = new a();
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }

        public final String getId() {
            return this.id;
        }
    }

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ProductCarousel> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ProductCarousel a(Serializer serializer) {
            return new ProductCarousel(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ProductCarousel[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v3, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.LinkedHashMap, java.util.Map] */
    public ProductCarousel(JSONObject jSONObject, Map<UserId, Owner> map, int i, String str) {
        super(jSONObject, i, str);
        ArrayList arrayList;
        String str2;
        ProductCarouselPromoItem productCarouselPromoItem;
        ?? r3;
        ?? r8;
        ?? r1;
        JSONArray optJSONArray;
        JSONObject optJSONObject;
        String str3;
        Image image;
        JSONObject optJSONObject2;
        JSONArray optJSONArray2;
        JSONObject optJSONObject3;
        int i2;
        JSONObject optJSONObject4;
        JSONObject optJSONObject5;
        this.x = Type.MARKET_ITEM;
        this.w = jSONObject.optBoolean("use_oneline_product_title");
        JSONArray optJSONArray3 = jSONObject.optJSONArray("items");
        if (optJSONArray3 != null) {
            arrayList = new ArrayList(optJSONArray3.length());
            int i3 = 0;
            for (int length = optJSONArray3.length(); i3 < length; length = length) {
                JSONObject jSONObject2 = optJSONArray3.getJSONObject(i3);
                Serializer.c<ProductCarouselItem> cVar = ProductCarouselItem.CREATOR;
                String str4 = this.l;
                boolean z = this.w;
                Type type = this.x;
                String optString = jSONObject2.optString("id");
                bpn0 bpn0Var = cqm0.a;
                try {
                    i2 = Integer.parseInt(optString);
                } catch (Throwable unused) {
                    i2 = 0;
                }
                String optString2 = jSONObject2.optString("title");
                boolean optBoolean = jSONObject2.optBoolean("is_favorite");
                Serializer.c<Price> cVar2 = Price.CREATOR;
                Price a2 = Price.a.a(jSONObject2.getJSONObject("price"));
                JSONObject optJSONObject6 = jSONObject2.optJSONObject("photo");
                JSONArray jSONArray = optJSONArray3;
                Photo photo = optJSONObject6 != null ? (Photo) Photo.R.a(optJSONObject6) : null;
                JSONObject optJSONObject7 = jSONObject2.optJSONObject("action_button");
                String D = (optJSONObject7 == null || (optJSONObject5 = optJSONObject7.optJSONObject("action")) == null) ? null : f370.D(optJSONObject5, "url");
                JSONObject optJSONObject8 = jSONObject2.optJSONObject("action_button");
                String D2 = optJSONObject8 != null ? f370.D(optJSONObject8, "title") : null;
                JSONObject optJSONObject9 = jSONObject2.optJSONObject("details_button");
                arrayList.add(new ProductCarouselItem(i2, optString2, optBoolean, a2, photo, D, D2, (optJSONObject9 == null || (optJSONObject4 = optJSONObject9.optJSONObject("action")) == null) ? null : f370.D(optJSONObject4, "url"), f370.D(jSONObject2, "url"), new UserId(jSONObject2.optLong("owner_id")), f370.D(jSONObject2, "discount_text"), z, str4, type, null, null, null, 65536, null));
                i3++;
                optJSONArray3 = jSONArray;
            }
        } else {
            arrayList = new ArrayList();
        }
        this.o = arrayList;
        this.q = jSONObject.optString("block_title");
        JSONObject optJSONObject10 = jSONObject.optJSONObject("more_button");
        Action.b bVar = Action.b;
        this.y = Action.a.a(optJSONObject10 != null ? optJSONObject10.optJSONObject("action") : null);
        this.r = (optJSONObject10 == null || (optJSONObject3 = optJSONObject10.optJSONObject("action")) == null) ? null : f370.D(optJSONObject3, "url");
        this.s = optJSONObject10 != null ? f370.D(optJSONObject10, "title") : null;
        JSONObject optJSONObject11 = jSONObject.optJSONObject("promo_card");
        if (optJSONObject11 != null) {
            Serializer.c<ProductCarouselPromoItem> cVar3 = ProductCarouselPromoItem.CREATOR;
            String str5 = this.l;
            JSONObject optJSONObject12 = optJSONObject11.optJSONObject("action_button");
            JSONObject optJSONObject13 = optJSONObject11.optJSONObject("icon");
            if (optJSONObject13 == null || (optJSONArray2 = optJSONObject13.optJSONArray("images")) == null) {
                str3 = null;
                image = null;
            } else {
                str3 = null;
                image = new Image(optJSONArray2, null, 2, null);
            }
            String optString3 = optJSONObject11.optString("title");
            String optString4 = optJSONObject11.optString("subtitle");
            String optString5 = optJSONObject12 != null ? optJSONObject12.optString("title") : str3;
            JSONObject optJSONObject14 = optJSONObject11.optJSONObject("action_button");
            String D3 = (optJSONObject14 == null || (optJSONObject2 = optJSONObject14.optJSONObject("action")) == null) ? str3 : f370.D(optJSONObject2, "url");
            Integer valueOf = Integer.valueOf(optJSONObject11.optInt("card_position"));
            str2 = str3;
            productCarouselPromoItem = new ProductCarouselPromoItem(image, optString3, optString4, optString5, D3, valueOf, str5);
        } else {
            str2 = null;
            productCarouselPromoItem = null;
        }
        this.p = productCarouselPromoItem;
        JSONObject optJSONObject15 = jSONObject.optJSONObject("footer");
        this.t = (optJSONObject15 == null || (optJSONObject = optJSONObject15.optJSONObject("action")) == null) ? str2 : f370.D(optJSONObject, "url");
        this.u = optJSONObject15 != null ? f370.D(optJSONObject15, "text") : str2;
        if (optJSONObject15 == null || (optJSONArray = optJSONObject15.optJSONArray("user_ids")) == null) {
            r3 = EmptyList.b;
        } else {
            r3 = new ArrayList(optJSONArray.length());
            int length2 = optJSONArray.length();
            for (int i4 = 0; i4 < length2; i4++) {
                r3.add(Long.valueOf(optJSONArray.getLong(i4)));
            }
        }
        if (map != null) {
            r8 = new LinkedHashMap();
            for (Map.Entry<UserId, Owner> entry : map.entrySet()) {
                if (r3.contains(Long.valueOf(entry.getKey().b))) {
                    r8.put(entry.getKey(), entry.getValue());
                }
            }
        } else {
            r8 = str2;
        }
        if (r8 != 0) {
            r1 = new ArrayList();
            Iterator it = r8.entrySet().iterator();
            while (it.hasNext()) {
                String f = ((Owner) ((Map.Entry) it.next()).getValue()).f(100);
                if (f != null) {
                    r1.add(f);
                }
            }
        } else {
            r1 = EmptyList.b;
        }
        this.v = r1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.util.List] */
    @Override // com.vk.dto.discover.carousel.Carousel, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.W(this.o);
        serializer.j0(this.q);
        serializer.j0(this.r);
        serializer.j0(this.s);
        serializer.i0(this.p);
        serializer.j0(this.t);
        serializer.j0(this.u);
        serializer.l0(this.v);
        serializer.L(this.w ? (byte) 1 : (byte) 0);
        Type type = this.x;
        serializer.j0(type != null ? type.getId() : null);
        serializer.i0(this.y);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List<com.vk.dto.discover.carousel.products.ProductCarouselItem>] */
    @Override // com.vk.dto.discover.carousel.Carousel
    public final List<ProductCarouselItem> getItems() {
        return this.o;
    }

    @Override // com.vk.dto.discover.carousel.Carousel, xsna.iux0, xsna.kru
    public final String getTitle() {
        return this.q;
    }

    public ProductCarousel(Serializer serializer) {
        super(serializer);
        Type type;
        Object k = serializer.k(ProductCarouselItem.class);
        this.o = k == null ? EmptyList.b : k;
        this.q = serializer.H();
        this.r = serializer.H();
        this.s = serializer.H();
        this.p = (ProductCarouselPromoItem) serializer.G(ProductCarouselPromoItem.class.getClassLoader());
        this.t = serializer.H();
        this.u = serializer.H();
        this.v = com.vk.core.serialize.a.a(serializer);
        this.w = serializer.m();
        Type.a aVar = Type.Companion;
        String H = serializer.H();
        aVar.getClass();
        Type[] values = Type.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                type = null;
                break;
            }
            type = values[i];
            if (epx.f(type.getId(), H)) {
                break;
            } else {
                i++;
            }
        }
        this.x = type;
        this.y = (Action) serializer.G(Action.class.getClassLoader());
    }
}
