package com.vk.dto.common;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.huawei.hms.framework.common.BundleUtil;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.Price;
import com.vk.dto.common.data.CallProducerButton;
import com.vk.dto.common.data.LikeInfo;
import com.vk.dto.common.id.UserId;
import com.vk.dto.market.CharacteristicsItem;
import com.vk.dto.market.GoodBadge;
import com.vk.dto.market.GoodVariantItem;
import com.vk.dto.market.MarketBanner;
import com.vk.dto.market.MarketItemType;
import com.vk.dto.market.VariantGroup;
import com.vk.dto.market.order.CancellationInfo;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.photo.Photo;
import com.vk.dto.profile.Address;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.sdk.api.login.LoginRequest;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.aay;
import xsna.bxx;
import xsna.dz5;
import xsna.f370;
import xsna.kvf;
import xsna.l490;
import xsna.t3u;

@Deprecated
/* loaded from: classes18.dex */
public class Good extends Serializer.StreamParcelableAdapter implements l490, bxx {
    public static final Serializer.c<Good> CREATOR = new b();
    public static final c p0 = new c();

    @Nullable
    public final ArrayList<Photo> A;
    public final boolean B;
    public final boolean C;
    public final boolean D;
    public final int E;
    public final int F;
    public final List<LikeInfo> G;
    public final int H;
    public final int I;
    public boolean J;
    public final String K;
    public final String L;

    @Nullable
    public Owner M;

    @Nullable
    public final MarketBanner N;

    @Nullable
    public final List<GoodBadge> O;
    public final int P;

    @Nullable
    public final String Q;
    public final float R;
    public final int S;

    @Nullable
    public final String T;

    @Nullable
    public final CancellationInfo U;
    public final boolean V;

    @Nullable
    public final List<LinkButton> W;

    @Nullable
    public final List<Address> X;
    public final int Y;
    public final int Z;

    @Nullable
    public final String a0;
    public final long b;

    @Nullable
    public final String b0;
    public final UserId c;

    @Nullable
    public final String c0;
    public final String d;

    @Nullable
    public final String d0;
    public final String e;

    @Nullable
    public final MarketRejectInfo e0;

    @Nullable
    public final MarketItemType f;

    @Nullable
    public final String f0;

    @Nullable
    public final String g;
    public final boolean g0;

    @NonNull
    public final Price h;
    public final boolean h0;
    public final int i;
    public final boolean i0;
    public final String j;

    @Nullable
    public final String j0;
    public final int k;

    @Nullable
    public final String k0;
    public final String l;

    @Nullable
    public final String l0;
    public final boolean m;

    @Nullable
    public final List<Image> m0;

    @Nullable
    public final Image n;

    @Nullable
    public List<CallProducerButton> n0;
    public final int o;

    @Nullable
    public final List<CharacteristicsItem> o0;
    public final int p;
    public final DeliveryInfo q;

    @Nullable
    public final IntegrationInfo r;

    @Nullable
    public List<OtherGoods> s;

    @Nullable
    public final MarketItemRating t;

    @Nullable
    public final List<GoodVariantItem> u;

    @Nullable
    public final Integer v;

    @Nullable
    public final List<Integer> w;
    public int x;
    public final int y;
    public final List<VariantGroup> z;

    public class a extends aay<LinkButton> {
        @Override // xsna.aay
        public final LinkButton a(JSONObject jSONObject) throws JSONException {
            return new LinkButton(jSONObject);
        }
    }

    public class b extends Serializer.c<Good> {
        @Override // com.vk.core.serialize.Serializer.c
        public final Good a(@NonNull Serializer serializer) {
            return new Good(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Good[i];
        }
    }

    public class c extends aay<Good> {
        @Override // xsna.aay
        public final Good a(@NonNull JSONObject jSONObject) throws JSONException {
            return new Good(jSONObject, null);
        }
    }

    public Good() {
        this.G = null;
        this.M = null;
        this.f0 = null;
        this.j0 = null;
        this.k0 = null;
        this.l0 = null;
        this.b = 1L;
        UserId userId = new UserId(1L);
        this.c = userId;
        this.d = "Test";
        this.e = "Test";
        this.g = null;
        this.h = new Price(10L, 9L, new Currency(1, "RUB", "₽"), "0.1 P", "0.09 P", 10, "", "", null);
        this.i = 1;
        this.j = "Test";
        this.k = 1;
        this.l = "Test";
        this.m = false;
        this.o = 12345;
        this.p = 1;
        this.x = 1;
        this.y = 1;
        List list = Collections.EMPTY_LIST;
        this.z = list;
        this.A = new ArrayList<>();
        this.B = false;
        this.C = false;
        this.D = false;
        this.E = 0;
        this.F = 10;
        this.H = 10;
        this.I = 10;
        this.G = list;
        this.J = false;
        this.M = new Owner(userId, "User");
        this.K = LoginRequest.CLIENT_NAME;
        this.L = LoginRequest.CLIENT_NAME;
        Serializer.c<Image> cVar = Image.CREATOR;
        ImageSizeKey imageSizeKey = ImageSizeKey.SIZE_M_0130;
        this.n = Image.b.c(LoginRequest.CLIENT_NAME, imageSizeKey.getHeight(), imageSizeKey.getWidth(), imageSizeKey.i());
        this.q = new DeliveryInfo(LoginRequest.CLIENT_NAME);
        this.r = new IntegrationInfo(LoginRequest.CLIENT_NAME);
        this.N = null;
        this.O = list;
        this.P = 0;
        this.Q = "5318008";
        this.R = 2.5f;
        this.S = 666;
        this.U = null;
        this.s = list;
        this.t = null;
        this.u = list;
        this.v = null;
        this.w = list;
        this.T = null;
        this.V = false;
        this.X = null;
        this.Y = 0;
        this.W = null;
        this.Z = 0;
        this.a0 = null;
        this.b0 = null;
        this.c0 = null;
        this.d0 = null;
        this.e0 = null;
        this.f0 = null;
        this.g0 = false;
        this.h0 = false;
        this.i0 = false;
        this.j0 = null;
        this.k0 = null;
        this.l0 = null;
        this.m0 = null;
        this.n0 = null;
        this.o0 = null;
        this.f = MarketItemType.VK;
    }

    public static boolean Db(JSONObject jSONObject) {
        if (jSONObject.optInt("id") == 12) {
            return true;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("parent");
        if (optJSONObject != null) {
            return Db(optJSONObject);
        }
        return false;
    }

    @Nullable
    public static <T> T Eb(JSONObject jSONObject, String str, aay<T> aayVar) {
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject != null) {
            try {
                return aayVar.a(optJSONObject);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public static t3u zb() {
        t3u t3uVar = new t3u();
        t3uVar.b = UserId.d;
        t3uVar.c = "";
        t3uVar.d = "";
        t3uVar.f = new Price(0L, 0L, new Currency(0, "", ""), "", "", 0, "", "", null, 256, null);
        t3uVar.h = "";
        t3uVar.i = "";
        t3uVar.s = -1;
        t3uVar.t = new ArrayList();
        t3uVar.z = "";
        t3uVar.A = "";
        return t3uVar;
    }

    public final String Ab() {
        return this.c + BundleUtil.UNDERLINE_TAG + this.b;
    }

    public final boolean Bb() {
        return this.p == 0;
    }

    public final boolean Cb() {
        return this.i0 && !this.g0;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(@NonNull Serializer serializer) {
        serializer.Y(this.b);
        serializer.e0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.j0(this.g);
        serializer.i0(this.h);
        serializer.S(this.i);
        serializer.j0(this.j);
        serializer.S(this.k);
        serializer.j0(this.l);
        serializer.L(this.m ? (byte) 1 : (byte) 0);
        serializer.S(this.o);
        serializer.S(this.p);
        serializer.S(this.x);
        serializer.S(this.y);
        serializer.o0(this.z);
        serializer.f0(this.A);
        serializer.L(this.B ? (byte) 1 : (byte) 0);
        serializer.L(this.C ? (byte) 1 : (byte) 0);
        serializer.L(this.D ? (byte) 1 : (byte) 0);
        serializer.S(this.E);
        serializer.S(this.F);
        serializer.S(this.H);
        serializer.S(this.I);
        serializer.o0(this.G);
        serializer.L(this.J ? (byte) 1 : (byte) 0);
        serializer.i0(this.M);
        serializer.j0(this.K);
        serializer.j0(this.L);
        serializer.i0(this.n);
        serializer.i0(this.q);
        serializer.i0(this.r);
        serializer.i0(this.t);
        serializer.i0(this.N);
        serializer.o0(this.O);
        serializer.S(this.P);
        serializer.j0(this.Q);
        serializer.P(this.R);
        serializer.S(this.S);
        serializer.i0(this.U);
        serializer.o0(this.s);
        serializer.o0(this.u);
        serializer.V(this.v);
        serializer.U(this.w);
        serializer.j0(this.T);
        serializer.L(this.V ? (byte) 1 : (byte) 0);
        serializer.o0(this.X);
        serializer.S(this.Y);
        serializer.o0(this.W);
        serializer.S(this.Z);
        serializer.j0(this.a0);
        serializer.j0(this.b0);
        serializer.j0(this.c0);
        serializer.j0(this.d0);
        serializer.i0(this.e0);
        serializer.j0(this.f0);
        serializer.L(this.g0 ? (byte) 1 : (byte) 0);
        serializer.L(this.h0 ? (byte) 1 : (byte) 0);
        serializer.L(this.i0 ? (byte) 1 : (byte) 0);
        serializer.j0(this.j0);
        serializer.j0(this.k0);
        serializer.j0(this.l0);
        serializer.o0(this.m0);
        serializer.o0(this.n0);
        serializer.o0(this.o0);
        MarketItemType marketItemType = this.f;
        if (marketItemType == null) {
            marketItemType = MarketItemType.VK;
        }
        serializer.V(Integer.valueOf(marketItemType.h()));
    }

    @Override // xsna.bxx
    @NonNull
    public final JSONObject e5() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.b);
            jSONObject.put("owner_id", this.c.b);
            jSONObject.put("title", this.d);
            jSONObject.put("description", this.e);
            jSONObject.put("description_url", this.g);
            Image image = this.n;
            if (image != null) {
                jSONObject.put("thumb", image.Gb());
            }
            jSONObject.put("is_favorite", this.J);
            jSONObject.put("price", this.h.e5());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", this.i);
            jSONObject2.put("name", this.j);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("id", this.k);
            jSONObject3.put("name", this.l);
            jSONObject2.put("section", jSONObject3);
            jSONObject.put("category", jSONObject2);
            jSONObject.put("cart_quantity", this.x);
            jSONObject.put("stock_amount", this.y);
            List<VariantGroup> list = this.z;
            if (list != null) {
                jSONObject.put("variants_grid", kvf.a(list));
            }
            ArrayList<Photo> arrayList = this.A;
            if (arrayList != null) {
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i != arrayList.size(); i++) {
                    jSONArray.put(arrayList.get(i).Q3());
                }
                jSONObject.put("photos", jSONArray);
            }
            if (this.s != null) {
                JSONArray jSONArray2 = new JSONArray();
                Iterator<OtherGoods> it = this.s.iterator();
                while (it.hasNext()) {
                    jSONArray2.put(it.next().e5());
                }
                jSONObject.put("other_items", jSONArray2);
            }
            MarketItemRating marketItemRating = this.t;
            if (marketItemRating != null) {
                jSONObject.put("item_rating", marketItemRating.e5());
            }
            List<GoodVariantItem> list2 = this.u;
            if (list2 != null) {
                jSONObject.put("variants", kvf.a(list2));
            }
            Object obj = this.v;
            if (obj != null) {
                jSONObject.put("variants_grouping_id", obj);
            }
            List<Integer> list3 = this.w;
            if (list3 != null) {
                JSONArray jSONArray3 = new JSONArray();
                Iterator<Integer> it2 = list3.iterator();
                while (it2.hasNext()) {
                    jSONArray3.put(it2.next());
                }
                jSONObject.put("albums_ids", jSONArray3);
            }
            DeliveryInfo deliveryInfo = this.q;
            if (deliveryInfo != null) {
                jSONObject.put("delivery_info", deliveryInfo.e5());
            }
            IntegrationInfo integrationInfo = this.r;
            if (integrationInfo != null) {
                jSONObject.put("integration_info", integrationInfo.e5());
            }
            MarketBanner marketBanner = this.N;
            if (marketBanner != null) {
                jSONObject.put("banner", marketBanner.e5());
            }
            List<GoodBadge> list4 = this.O;
            if (list4 != null) {
                JSONArray jSONArray4 = new JSONArray();
                Iterator<GoodBadge> it3 = list4.iterator();
                while (it3.hasNext()) {
                    jSONArray4.put(it3.next().e5());
                }
                jSONObject.put("badges", jSONArray4);
            }
            int i2 = this.P;
            if (i2 > 0) {
                jSONObject.put("wishlist_item_id", i2);
            }
            Object obj2 = this.Q;
            if (obj2 != null) {
                jSONObject.put("sku", obj2);
            }
            jSONObject.put(CampaignEx.JSON_KEY_STAR, this.R);
            jSONObject.put("orders_count", this.S);
            jSONObject.put("user_agreement_info", this.T);
            jSONObject.put("ad_id", this.c0);
            jSONObject.put("track_code", this.d0);
            MarketRejectInfo marketRejectInfo = this.e0;
            if (marketRejectInfo != null) {
                jSONObject.put("reject_info", marketRejectInfo.e5());
            }
            jSONObject.put("group_name", this.f0);
            jSONObject.put("is_owner", this.g0);
            jSONObject.put("is_adult", this.h0);
            jSONObject.put("is_hardblocked", this.i0);
            jSONObject.put("open_market_link", this.j0);
            jSONObject.put("market_url", this.k0);
            jSONObject.put("characteristics", this.o0);
            MarketItemType marketItemType = this.f;
            if (marketItemType == null) {
                marketItemType = MarketItemType.VK;
            }
            jSONObject.put("item_type", marketItemType.h());
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Good good = (Good) obj;
            if (this.b == good.b && Objects.equals(this.c, good.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.b), this.c);
    }

    @Override // xsna.l490
    @Nullable
    public final Owner s() {
        return this.M;
    }

    public Good(long j, @NonNull UserId userId, @NonNull String str, @Nullable Image image, @NonNull String str2) {
        this.G = null;
        this.M = null;
        this.f0 = null;
        this.j0 = null;
        this.k0 = null;
        this.l0 = null;
        this.b = j;
        this.c = userId;
        this.d = str;
        this.n = image;
        this.h = new Price(0L, 0L, new Currency(0, "", ""), str2, null, 0, "", "", null);
        this.e = null;
        this.g = null;
        this.i = 0;
        this.j = null;
        this.k = 0;
        this.l = null;
        this.m = false;
        this.o = 0;
        this.p = 0;
        this.x = 0;
        this.y = 0;
        this.z = null;
        this.A = new ArrayList<>();
        this.B = false;
        this.C = false;
        this.D = false;
        this.E = 0;
        this.F = 0;
        this.H = 0;
        this.I = 0;
        this.G = null;
        this.J = false;
        this.M = new Owner(userId, "");
        this.K = null;
        this.L = null;
        this.q = null;
        this.r = null;
        this.N = null;
        this.O = null;
        this.P = 0;
        this.Q = null;
        this.R = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.S = 0;
        this.U = null;
        this.s = null;
        this.t = null;
        this.u = null;
        this.v = null;
        this.w = null;
        this.T = null;
        this.V = false;
        this.X = null;
        this.Y = 0;
        this.W = null;
        this.Z = 0;
        this.a0 = null;
        this.b0 = null;
        this.c0 = null;
        this.d0 = null;
        this.e0 = null;
        this.g0 = false;
        this.h0 = false;
        this.i0 = false;
        this.j0 = null;
        this.k0 = null;
        this.l0 = null;
        this.m0 = null;
        this.n0 = null;
        this.o0 = null;
        this.f = MarketItemType.VK;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v35, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v36, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.List<com.vk.dto.market.VariantGroup>] */
    public Good(JSONObject jSONObject, @Nullable Map<UserId, Owner> map) throws JSONException {
        ?? r1;
        ArrayList arrayList = null;
        this.G = null;
        this.M = null;
        this.f0 = null;
        this.j0 = null;
        this.k0 = null;
        this.l0 = null;
        Serializer.c<Price> cVar = Price.CREATOR;
        this.h = Price.a.a(jSONObject.getJSONObject("price"));
        this.b = jSONObject.optLong("id");
        UserId userId = new UserId(jSONObject.optLong("owner_id"));
        this.c = userId;
        this.d = jSONObject.optString("title");
        this.e = jSONObject.optString("description");
        this.g = f370.D(jSONObject, "description_url");
        if (map != null) {
            this.M = map.get(userId);
        }
        this.q = (DeliveryInfo) Eb(jSONObject, "delivery_info", DeliveryInfo.c);
        this.r = (IntegrationInfo) Eb(jSONObject, "integration_info", IntegrationInfo.c);
        this.s = aay.a.a(jSONObject, "other_items", OtherGoods.h);
        this.u = aay.a.a(jSONObject, "variants", GoodVariantItem.f);
        this.v = jSONObject.has("variants_grouping_id") ? Integer.valueOf(jSONObject.optInt("variants_grouping_id")) : null;
        this.w = dz5.E(jSONObject.optJSONArray("albums_ids"));
        JSONObject optJSONObject = jSONObject.optJSONObject("category");
        if (optJSONObject != null) {
            this.i = optJSONObject.optInt("id");
            this.j = optJSONObject.optString("name");
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("section");
            if (optJSONObject2 != null) {
                this.k = optJSONObject2.optInt("id");
                this.l = optJSONObject2.optString("name");
            } else {
                this.k = 0;
                this.l = null;
            }
            this.m = Db(optJSONObject);
        } else {
            this.k = 0;
            this.i = 0;
            this.l = null;
            this.j = null;
            this.m = false;
        }
        this.V = jSONObject.optBoolean("is_price_list_service");
        this.o = jSONObject.optInt("date", -1);
        this.p = jSONObject.optInt("availability");
        this.t = (MarketItemRating) Eb(jSONObject, "item_rating", MarketItemRating.e);
        this.H = jSONObject.optInt("views_count", -1);
        JSONObject optJSONObject3 = jSONObject.optJSONObject("reposts");
        if (optJSONObject3 != null) {
            this.I = optJSONObject3.optInt("count");
        } else {
            this.I = 0;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("thumb");
        Image image = optJSONArray != null ? new Image(optJSONArray) : null;
        if (image == null) {
            String optString = jSONObject.optString("thumb_photo");
            if (!optString.isEmpty()) {
                Serializer.c<Image> cVar2 = Image.CREATOR;
                image = Image.b.a(optString);
            }
        }
        this.n = image;
        this.x = jSONObject.optInt("cart_quantity");
        this.y = jSONObject.optInt("stock_amount", -1);
        JSONArray optJSONArray2 = jSONObject.optJSONArray("variants_grid");
        Serializer.c<VariantGroup> cVar3 = VariantGroup.CREATOR;
        if (optJSONArray2 != null) {
            r1 = new ArrayList(optJSONArray2.length());
            int length = optJSONArray2.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject4 = optJSONArray2.optJSONObject(i);
                if (optJSONObject4 != null) {
                    Serializer.c<VariantGroup> cVar4 = VariantGroup.CREATOR;
                    r1.add(VariantGroup.a.a(optJSONObject4));
                }
            }
        } else {
            r1 = 0;
        }
        this.z = r1 == 0 ? Collections.EMPTY_LIST : r1;
        JSONArray optJSONArray3 = jSONObject.optJSONArray("photos");
        if (optJSONArray3 != null) {
            this.A = new ArrayList<>(optJSONArray3.length());
            for (int i2 = 0; i2 < optJSONArray3.length(); i2++) {
                JSONObject optJSONObject5 = optJSONArray3.optJSONObject(i2);
                if (optJSONObject5 != null) {
                    try {
                        this.A.add((Photo) Photo.R.a(optJSONObject5));
                    } catch (JSONException unused) {
                    }
                }
            }
        } else {
            this.A = null;
        }
        this.B = jSONObject.optInt("can_comment") != 0;
        this.C = jSONObject.optInt("show_comments") != 0;
        this.D = jSONObject.optInt("can_repost") != 0;
        JSONObject optJSONObject6 = jSONObject.optJSONObject("likes");
        if (optJSONObject6 != null) {
            this.E = optJSONObject6.optInt("user_likes");
            this.F = optJSONObject6.optInt("count");
        } else {
            this.F = 0;
            this.E = 0;
        }
        this.J = jSONObject.optBoolean("is_favorite");
        this.K = jSONObject.optString("url");
        this.L = jSONObject.optString("button_title");
        this.N = (MarketBanner) Eb(jSONObject, "banner", MarketBanner.e);
        this.O = aay.a.a(jSONObject, "badges", GoodBadge.i);
        this.P = jSONObject.optInt("wishlist_item_id", 0);
        this.Q = jSONObject.optString("sku");
        this.R = (float) jSONObject.optDouble(CampaignEx.JSON_KEY_STAR, ConnectivityTracker.DEFAULT_UPLINK_BITRATE);
        this.S = jSONObject.optInt("orders_count", 0);
        this.T = jSONObject.optString("user_agreement_info");
        this.U = (CancellationInfo) Eb(jSONObject, "cancel_info", CancellationInfo.d);
        JSONObject optJSONObject7 = jSONObject.optJSONObject("addresses");
        if (optJSONObject7 != null) {
            this.X = Address.Ab(optJSONObject7);
            this.Y = optJSONObject7.optInt("count");
        } else {
            this.X = null;
            this.Y = 0;
        }
        this.W = aay.a.a(jSONObject, "action_buttons", new a());
        JSONObject optJSONObject8 = jSONObject.optJSONObject("service_duration");
        if (optJSONObject8 != null) {
            this.Z = optJSONObject8.optInt("minutes");
            this.a0 = optJSONObject8.optString("text");
        } else {
            this.Z = 0;
            this.a0 = null;
        }
        this.b0 = f370.D(jSONObject, "external_id");
        this.c0 = jSONObject.isNull("ad_id") ? null : jSONObject.optString("ad_id");
        this.d0 = jSONObject.isNull("track_code") ? null : jSONObject.optString("track_code");
        if (jSONObject.has("reject_info")) {
            this.e0 = (MarketRejectInfo) MarketRejectInfo.i.a(jSONObject.getJSONObject("reject_info"));
        } else {
            this.e0 = null;
        }
        this.f0 = jSONObject.isNull("group_name") ? null : jSONObject.optString("group_name");
        this.g0 = jSONObject.optBoolean("is_owner", false);
        this.h0 = jSONObject.optBoolean("is_adult", false);
        this.i0 = jSONObject.optBoolean("is_hardblocked", false);
        this.j0 = jSONObject.optString("open_market_link");
        this.k0 = jSONObject.optString("market_url");
        JSONObject optJSONObject9 = jSONObject.optJSONObject("owner_info");
        if (optJSONObject9 != null) {
            this.l0 = optJSONObject9.optString("market_type");
        }
        JSONArray optJSONArray4 = jSONObject.optJSONArray("thumbs");
        if (optJSONArray4 != null) {
            arrayList = new ArrayList();
            for (int i3 = 0; i3 < optJSONArray4.length(); i3++) {
                JSONArray optJSONArray5 = optJSONArray4.optJSONArray(i3);
                if (optJSONArray5 != null) {
                    arrayList.add(new Image(optJSONArray5));
                }
            }
        }
        this.m0 = arrayList;
        this.n0 = aay.a.a(jSONObject, "buttons", CallProducerButton.n);
        this.o0 = aay.a.a(jSONObject, "characteristics", CharacteristicsItem.e);
        MarketItemType.a aVar = MarketItemType.Companion;
        Integer valueOf = Integer.valueOf(jSONObject.optInt("item_type"));
        aVar.getClass();
        this.f = MarketItemType.a.a(valueOf);
    }

    public Good(Good good) {
        this.G = null;
        this.M = null;
        this.f0 = null;
        this.j0 = null;
        this.k0 = null;
        this.l0 = null;
        this.b = good.b;
        this.c = good.c;
        this.d = good.d;
        this.e = good.e;
        this.g = good.g;
        this.h = good.h;
        this.i = good.i;
        this.j = good.j;
        this.k = good.k;
        this.l = good.l;
        this.m = good.m;
        this.o = good.o;
        this.p = good.p;
        this.x = good.x;
        this.y = good.y;
        this.z = good.z;
        this.A = good.A;
        this.B = good.B;
        this.C = good.C;
        this.D = good.D;
        this.E = good.E;
        this.F = good.F;
        this.H = good.H;
        this.I = good.I;
        this.G = good.G;
        this.J = good.J;
        this.M = good.M;
        this.K = good.K;
        this.L = good.L;
        this.n = good.n;
        this.q = good.q;
        this.r = good.r;
        this.t = good.t;
        this.N = good.N;
        this.O = good.O;
        this.P = good.P;
        this.Q = good.Q;
        this.R = good.R;
        this.S = good.S;
        this.U = good.U;
        this.s = good.s;
        this.u = good.u;
        this.v = good.v;
        this.w = good.w;
        this.T = good.T;
        this.V = good.V;
        this.X = good.X;
        this.Y = good.Y;
        this.W = good.W;
        this.Z = good.Z;
        this.a0 = good.a0;
        this.b0 = good.b0;
        this.c0 = good.c0;
        this.d0 = good.d0;
        this.e0 = good.e0;
        this.f0 = good.f0;
        this.g0 = good.g0;
        this.h0 = good.h0;
        this.i0 = good.i0;
        this.j0 = good.j0;
        this.k0 = good.k0;
        this.l0 = good.l0;
        this.m0 = good.m0;
        this.n0 = good.n0;
        this.o0 = good.o0;
        this.f = good.f;
    }

    public Good(long j, UserId userId, String str, String str2, @Nullable String str3, @NonNull Price price, int i, String str4, int i2, String str5, boolean z, @Nullable Image image, int i3, int i4, DeliveryInfo deliveryInfo, @Nullable IntegrationInfo integrationInfo, @Nullable MarketItemRating marketItemRating, @Nullable List<OtherGoods> list, @Nullable List<GoodVariantItem> list2, @Nullable Integer num, @Nullable List<Integer> list3, int i5, int i6, List<VariantGroup> list4, @Nullable ArrayList<Photo> arrayList, boolean z2, boolean z3, boolean z4, int i7, int i8, @Nullable List<LikeInfo> list5, int i9, int i10, boolean z5, String str6, String str7, @Nullable Owner owner, @Nullable MarketBanner marketBanner, @Nullable List<GoodBadge> list6, int i11, @Nullable String str8, float f, int i12, @Nullable String str9, @Nullable CancellationInfo cancellationInfo, boolean z6, @Nullable List<LinkButton> list7, @Nullable List<Address> list8, int i13, int i14, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable MarketRejectInfo marketRejectInfo, @Nullable String str14, boolean z7, boolean z8, boolean z9, @Nullable String str15, @Nullable String str16, @Nullable String str17, @Nullable List<Image> list9, @Nullable List<CallProducerButton> list10, @Nullable List<CharacteristicsItem> list11, @Nullable MarketItemType marketItemType) {
        this.b = j;
        this.c = userId;
        this.d = str;
        this.e = str2;
        this.g = str3;
        this.h = price;
        this.i = i;
        this.j = str4;
        this.k = i2;
        this.l = str5;
        this.m = z;
        this.o = i3;
        this.p = i4;
        this.x = i5;
        this.y = i6;
        this.z = list4;
        this.A = arrayList;
        this.B = z2;
        this.C = z3;
        this.D = z4;
        this.E = i7;
        this.F = i8;
        this.H = i9;
        this.I = i10;
        this.G = list5;
        this.J = z5;
        this.M = owner;
        this.K = str6;
        this.L = str7;
        this.n = image;
        this.q = deliveryInfo;
        this.r = integrationInfo;
        this.t = marketItemRating;
        this.N = marketBanner;
        this.O = list6;
        this.P = i11;
        this.Q = str8;
        this.R = f;
        this.S = i12;
        this.U = cancellationInfo;
        this.s = list;
        this.u = list2;
        this.v = num;
        this.w = list3;
        this.T = str9;
        this.V = z6;
        this.X = list8;
        this.Y = i13;
        this.W = list7;
        this.Z = i14;
        this.a0 = str10;
        this.b0 = str11;
        this.c0 = str12;
        this.d0 = str13;
        this.e0 = marketRejectInfo;
        this.f0 = str14;
        this.g0 = z7;
        this.h0 = z8;
        this.i0 = z9;
        this.j0 = str15;
        this.k0 = str16;
        this.l0 = str17;
        this.m0 = list9;
        this.n0 = list10;
        this.o0 = list11;
        this.f = marketItemType;
    }

    public Good(Serializer serializer) {
        this.G = null;
        this.M = null;
        this.f0 = null;
        this.j0 = null;
        this.k0 = null;
        this.l0 = null;
        this.b = serializer.w();
        this.c = (UserId) serializer.A(UserId.class.getClassLoader());
        this.d = serializer.H();
        this.e = serializer.H();
        this.g = serializer.H();
        this.h = (Price) serializer.G(Price.class.getClassLoader());
        this.i = serializer.u();
        this.j = serializer.H();
        this.k = serializer.u();
        this.l = serializer.H();
        this.m = serializer.m();
        this.o = serializer.u();
        this.p = serializer.u();
        this.x = serializer.u();
        this.y = serializer.u();
        this.z = serializer.j(VariantGroup.CREATOR);
        this.A = serializer.B(Photo.class.getClassLoader());
        this.B = serializer.p() != 0;
        this.C = serializer.p() != 0;
        this.D = serializer.p() != 0;
        this.E = serializer.u();
        this.F = serializer.u();
        this.H = serializer.u();
        this.I = serializer.u();
        this.G = serializer.j(LikeInfo.CREATOR);
        this.J = serializer.m();
        this.M = (Owner) serializer.G(Owner.class.getClassLoader());
        this.K = serializer.H();
        this.L = serializer.H();
        this.n = (Image) serializer.G(Image.class.getClassLoader());
        this.q = (DeliveryInfo) serializer.G(DeliveryInfo.class.getClassLoader());
        this.r = (IntegrationInfo) serializer.G(IntegrationInfo.class.getClassLoader());
        this.t = (MarketItemRating) serializer.G(MarketItemRating.class.getClassLoader());
        this.N = (MarketBanner) serializer.G(MarketBanner.class.getClassLoader());
        this.O = serializer.j(GoodBadge.CREATOR);
        this.P = serializer.u();
        this.Q = serializer.H();
        this.R = serializer.s();
        this.S = serializer.u();
        this.U = (CancellationInfo) serializer.G(CancellationInfo.class.getClassLoader());
        this.s = serializer.j(OtherGoods.CREATOR);
        this.u = serializer.j(GoodVariantItem.CREATOR);
        this.v = serializer.v();
        this.w = serializer.d();
        this.T = serializer.H();
        this.V = serializer.m();
        this.X = serializer.j(Address.CREATOR);
        this.Y = serializer.u();
        this.W = serializer.j(LinkButton.CREATOR);
        this.Z = serializer.u();
        this.a0 = serializer.H();
        this.b0 = serializer.H();
        this.c0 = serializer.H();
        this.d0 = serializer.H();
        this.e0 = (MarketRejectInfo) serializer.G(MarketRejectInfo.class.getClassLoader());
        this.f0 = serializer.H();
        this.g0 = serializer.m();
        this.h0 = serializer.m();
        this.i0 = serializer.m();
        this.j0 = serializer.H();
        this.k0 = serializer.H();
        this.l0 = serializer.H();
        this.m0 = serializer.j(Image.CREATOR);
        this.n0 = serializer.j(CallProducerButton.CREATOR);
        this.o0 = serializer.j(CharacteristicsItem.CREATOR);
        MarketItemType.a aVar = MarketItemType.Companion;
        Integer v = serializer.v();
        aVar.getClass();
        this.f = MarketItemType.a.a(v);
    }
}
