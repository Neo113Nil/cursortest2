package com.vk.dto.stickers;

import com.coremedia.iso.boxes.FreeBox;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.NotificationImage;
import com.vk.dto.common.PaymentType;
import com.vk.dto.newsfeed.ButtonAction;
import com.vk.dto.stickers.Badge;
import com.vk.dto.stickers.Price;
import com.vk.dto.stickers.StickerItem;
import com.vk.dto.stickers.StickerStockItemPreviewImage;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.c5g;
import xsna.epx;
import xsna.f370;
import xsna.ho8;
import xsna.mge0;
import xsna.rl3;
import xsna.urd0;
import xsna.z230;

/* compiled from: StickerStockItem.kt */
/* loaded from: classes18.dex */
public final class StickerStockItem extends Serializer.StreamParcelableAdapter implements mge0, Comparable<StickerStockItem> {
    public static final Serializer.c<StickerStockItem> CREATOR = new b();
    public final boolean A;
    public final String B;
    public final StickerStockItemPreviewImage C;
    public final String D;
    public final Badge E;
    public final PurchaseDetails F;
    public final boolean G;
    public final VmojiAvatar H;
    public final String I;
    public final List<Integer> J;
    public final List<Integer> K;
    public final Integer L;
    public final boolean M;
    public final String N;
    public String O;
    public String P;
    public final boolean Q;
    public Boolean R;
    public Boolean S;
    public final Boolean T;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final List<StickerItem> g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final Price n;
    public final String o;
    public final String p;
    public final String q;
    public final String r;
    public final String s;
    public final String t;
    public final String u;
    public final NotificationImage v;
    public final String w;
    public final long x;
    public final boolean y;
    public final int z;

    /* compiled from: StickerStockItem.kt */
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v17, types: [kotlin.collections.EmptyList] */
        /* JADX WARN: Type inference failed for: r1v18 */
        /* JADX WARN: Type inference failed for: r1v44, types: [java.util.ArrayList] */
        public static StickerStockItem a(JSONObject jSONObject) {
            Badge badge;
            PurchaseDetails purchaseDetails;
            StickerStockItemPreviewImage stickerStockItemPreviewImage;
            String str;
            ?? r1;
            NotificationImage notificationImage;
            JSONArray optJSONArray;
            int i;
            ArrayList arrayList;
            String str2;
            String str3;
            PurchaseDetailsButton purchaseDetailsButton;
            JSONObject jSONObject2 = jSONObject;
            String optString = jSONObject2.optString("author");
            String optString2 = jSONObject2.optString("track_code");
            String optString3 = jSONObject2.optString("description");
            boolean z = jSONObject2.optInt("can_purchase") == 1;
            boolean z2 = jSONObject2.optInt("can_purchase_for") == 1;
            boolean z3 = jSONObject2.optInt("can_gift") == 1;
            boolean z4 = jSONObject2.optInt(FreeBox.TYPE) == 1;
            Serializer.c<Price> cVar = Price.CREATOR;
            int optInt = jSONObject2.optInt("price_buy");
            String optString4 = jSONObject2.optString("price_buy_str");
            int optInt2 = jSONObject2.optInt("old_price_buy");
            String optString5 = jSONObject2.optString("old_price_buy_str");
            int optInt3 = jSONObject2.optInt("price_gift");
            String optString6 = jSONObject2.optString("price_gift_str");
            int optInt4 = jSONObject2.optInt("old_price_gift");
            String optString7 = jSONObject2.optString("old_price_gift_str");
            String optString8 = jSONObject2.optString("price_buy_discount");
            String optString9 = jSONObject2.optString("price_gift_discount");
            JSONObject optJSONObject = jSONObject2.optJSONObject("additional_view_price_buy");
            VmojiAvatar vmojiAvatar = null;
            Price price = new Price(new Price.PriceInfo(optInt, optString4), new Price.PriceInfo(optInt2, optString5), new Price.PriceInfo(optInt3, optString6), new Price.PriceInfo(optInt4, optString7), optString8, optString9, optJSONObject != null ? optJSONObject.optString("price_str") : null);
            String optString10 = jSONObject2.optString("merchant_product_id");
            String optString11 = jSONObject2.optString("payment_type");
            String optString12 = jSONObject2.optString("photo_35");
            String optString13 = jSONObject2.optString("photo_70");
            String optString14 = jSONObject2.optString("photo_140");
            String optString15 = jSONObject2.optString("photo_296");
            String optString16 = jSONObject2.optString("photo_592");
            String optString17 = jSONObject2.optString("no_purchase_reason");
            String optString18 = jSONObject2.optString("note");
            JSONObject optJSONObject2 = jSONObject2.optJSONObject("badge");
            if (optJSONObject2 != null) {
                String string = optJSONObject2.getString("type");
                Badge.BadgeSubtype.a aVar = Badge.BadgeSubtype.Companion;
                String optString19 = optJSONObject2.optString("subtype");
                aVar.getClass();
                badge = new Badge(string, Badge.BadgeSubtype.a.a(optString19), optJSONObject2.optString("text"));
            } else {
                badge = null;
            }
            JSONObject optJSONObject3 = jSONObject2.optJSONObject("purchase_details");
            if (optJSONObject3 != null) {
                Serializer.c<PurchaseDetails> cVar2 = PurchaseDetails.CREATOR;
                String optString20 = optJSONObject3.optString("label");
                String optString21 = optJSONObject3.optString("title");
                String optString22 = optJSONObject3.optString("text");
                JSONObject optJSONObject4 = optJSONObject3.optJSONObject("button");
                if (optJSONObject4 != null) {
                    Serializer.c<PurchaseDetailsButton> cVar3 = PurchaseDetailsButton.CREATOR;
                    String optString23 = optJSONObject4.optString("title");
                    JSONObject optJSONObject5 = optJSONObject4.optJSONObject("action");
                    purchaseDetailsButton = new PurchaseDetailsButton(optString23, optJSONObject5 != null ? new ButtonAction(optJSONObject5) : null);
                } else {
                    purchaseDetailsButton = null;
                }
                purchaseDetails = new PurchaseDetails(optString20, optString21, optString22, purchaseDetailsButton);
            } else {
                purchaseDetails = null;
            }
            boolean z5 = jSONObject2.optInt("vkme_only") == 1;
            String optString24 = jSONObject2.optString("version_hash");
            JSONObject optJSONObject6 = jSONObject2.optJSONObject("wishlists_status");
            Boolean q = optJSONObject6 != null ? f370.q(optJSONObject6, "is_added") : null;
            JSONObject optJSONObject7 = jSONObject2.optJSONObject("stickers_author_subscription");
            Boolean q2 = optJSONObject7 != null ? f370.q(optJSONObject7, "is_subscribed") : null;
            if (jSONObject2.has("product")) {
                jSONObject2 = jSONObject2.getJSONObject("product");
            }
            int optInt5 = jSONObject2.optInt("id");
            String optString25 = jSONObject2.optString("type");
            String optString26 = jSONObject2.optString("title");
            JSONObject optJSONObject8 = jSONObject2.optJSONObject("icon");
            if (optJSONObject8 != null) {
                Serializer.c<StickerStockItemPreviewImage> cVar4 = StickerStockItemPreviewImage.CREATOR;
                stickerStockItemPreviewImage = StickerStockItemPreviewImage.a.a(optJSONObject8);
            } else {
                stickerStockItemPreviewImage = null;
            }
            String optString27 = jSONObject2.optString("url");
            JSONArray optJSONArray2 = jSONObject2.optJSONArray("stickers");
            if (optJSONArray2 != null) {
                ArrayList arrayList2 = new ArrayList(optJSONArray2.length());
                int length = optJSONArray2.length();
                int i2 = 0;
                while (i2 < length) {
                    arrayList2.add(optJSONArray2.getJSONObject(i2));
                    i2++;
                    optString10 = optString10;
                }
                str = optString10;
                r1 = new ArrayList(c5g.u(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    JSONObject jSONObject3 = (JSONObject) it.next();
                    StickerItem stickerItem = StickerItem.l;
                    r1.add(StickerItem.a.a(jSONObject3));
                }
            } else {
                str = optString10;
                r1 = EmptyList.b;
            }
            List list = r1;
            boolean z6 = jSONObject2.optInt("purchased") == 1;
            boolean z7 = jSONObject2.optInt(SignalingProtocol.KEY_ACTIVE) == 1;
            boolean z8 = jSONObject2.optInt("promoted") == 1;
            long optLong = jSONObject2.optLong("purchase_date");
            boolean optBoolean = jSONObject2.optBoolean("has_animation");
            boolean z9 = z6;
            JSONArray optJSONArray3 = jSONObject2.optJSONArray("previews");
            if (optJSONArray3 != null) {
                Serializer.c<NotificationImage> cVar5 = NotificationImage.CREATOR;
                notificationImage = NotificationImage.a.a(optJSONArray3);
            } else {
                notificationImage = null;
            }
            boolean optBoolean2 = jSONObject2.optBoolean("is_new");
            JSONArray optJSONArray4 = jSONObject2.optJSONArray("style_ids");
            List J = optJSONArray4 != null ? f370.J(optJSONArray4) : EmptyList.b;
            if (jSONObject2.isNull("style_sticker_ids") || (optJSONArray = jSONObject2.optJSONArray("style_sticker_ids")) == null) {
                i = optInt5;
                str2 = optString25;
                str3 = optString26;
                arrayList = null;
            } else {
                i = optInt5;
                str2 = optString25;
                arrayList = new ArrayList(optJSONArray.length());
                int length2 = optJSONArray.length();
                str3 = optString26;
                int i3 = 0;
                while (i3 < length2) {
                    arrayList.add(Integer.valueOf(optJSONArray.getInt(i3)));
                    i3++;
                    optJSONArray = optJSONArray;
                }
            }
            Integer valueOf = jSONObject2.isNull("base_id") ? null : Integer.valueOf(jSONObject2.optInt("base_id"));
            String optString28 = jSONObject2.optString("copyright");
            JSONObject optJSONObject9 = jSONObject2.optJSONObject("vmoji_avatar");
            if (optJSONObject9 != null) {
                Serializer.c<VmojiAvatar> cVar6 = VmojiAvatar.CREATOR;
                vmojiAvatar = new VmojiAvatar(optJSONObject9.getString("id"), optJSONObject9.getString("character_id"), optJSONObject9.getString("name"), optJSONObject9.getBoolean("is_active"), null, 16, null);
            }
            return new StickerStockItem(i, str2, str3, optString, optString3, list, z9, z, z2, z7, z8, z4, price, str, optString11, optString12, optString13, optString14, optString15, optString16, notificationImage, optString17, optLong, optBoolean, 0, z3, optString18, stickerStockItemPreviewImage, optString27, badge, purchaseDetails, z5, vmojiAvatar, optString24, J, arrayList, valueOf, optBoolean2, optString28, null, optString2, jSONObject2.optBoolean("is_vmoji"), q, q2, Boolean.valueOf(jSONObject2.optBoolean("is_popup")), 0, 128, null);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<StickerStockItem> {
        @Override // com.vk.core.serialize.Serializer.c
        public final StickerStockItem a(Serializer serializer) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            int u = serializer.u();
            String H = serializer.H();
            String H2 = serializer.H();
            String H3 = serializer.H();
            String H4 = serializer.H();
            ArrayList j = serializer.j(StickerItem.CREATOR);
            boolean z6 = false;
            boolean z7 = true;
            boolean z8 = serializer.p() != 0;
            if (serializer.p() != 0) {
                z = false;
                z6 = true;
            } else {
                z = false;
            }
            if (serializer.p() != 0) {
                z2 = true;
            } else {
                z2 = true;
                z7 = z;
            }
            if (serializer.p() != 0) {
                z3 = z;
                z = z2;
            } else {
                z3 = z;
            }
            if (serializer.p() != 0) {
                z4 = z2;
            } else {
                z4 = z2;
                z2 = z3;
            }
            if (serializer.p() != 0) {
                z5 = z3;
                z3 = z4;
            } else {
                z5 = z3;
            }
            Price price = (Price) serializer.G(Price.class.getClassLoader());
            boolean z9 = z5;
            String H5 = serializer.H();
            boolean z10 = z4;
            String H6 = serializer.H();
            String H7 = serializer.H();
            String H8 = serializer.H();
            String H9 = serializer.H();
            String H10 = serializer.H();
            String H11 = serializer.H();
            NotificationImage notificationImage = (NotificationImage) serializer.G(NotificationImage.class.getClassLoader());
            String H12 = serializer.H();
            boolean z11 = z9;
            long w = serializer.w();
            if (serializer.p() != 0) {
                z11 = z10;
            }
            int u2 = serializer.u();
            boolean m = serializer.m();
            String H13 = serializer.H();
            StickerStockItemPreviewImage stickerStockItemPreviewImage = (StickerStockItemPreviewImage) serializer.G(StickerStockItemPreviewImage.class.getClassLoader());
            String H14 = serializer.H();
            Badge badge = (Badge) serializer.G(Badge.class.getClassLoader());
            PurchaseDetails purchaseDetails = (PurchaseDetails) serializer.G(PurchaseDetails.class.getClassLoader());
            boolean m2 = serializer.m();
            VmojiAvatar vmojiAvatar = (VmojiAvatar) serializer.G(VmojiAvatar.class.getClassLoader());
            String H15 = serializer.H();
            if (H15 == null) {
                H15 = "";
            }
            boolean m3 = serializer.m();
            List<Integer> s0 = rl3.s0(serializer.c());
            int[] c = serializer.c();
            return new StickerStockItem(u, H, H2, H3, H4, j, z8, z6, z7, z, z2, z3, price, H5, H6, H7, H8, H9, H10, H11, notificationImage, H12, w, z11, u2, m, H13, stickerStockItemPreviewImage, H14, badge, purchaseDetails, m2, vmojiAvatar, H15, s0, c != null ? rl3.s0(c) : null, serializer.v(), m3, serializer.H(), null, serializer.H(), serializer.m(), serializer.n(), serializer.n(), serializer.n(), 0, 128, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StickerStockItem[i];
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ StickerStockItem(int r51, java.lang.String r52, java.lang.String r53, java.lang.String r54, java.lang.String r55, java.util.List r56, boolean r57, boolean r58, boolean r59, boolean r60, boolean r61, boolean r62, com.vk.dto.stickers.Price r63, java.lang.String r64, java.lang.String r65, java.lang.String r66, java.lang.String r67, java.lang.String r68, java.lang.String r69, java.lang.String r70, com.vk.dto.common.NotificationImage r71, java.lang.String r72, long r73, boolean r75, int r76, boolean r77, java.lang.String r78, com.vk.dto.stickers.StickerStockItemPreviewImage r79, java.lang.String r80, com.vk.dto.stickers.Badge r81, com.vk.dto.stickers.PurchaseDetails r82, boolean r83, com.vk.dto.stickers.VmojiAvatar r84, java.lang.String r85, java.util.List r86, java.util.List r87, java.lang.Integer r88, boolean r89, java.lang.String r90, java.lang.String r91, java.lang.String r92, boolean r93, java.lang.Boolean r94, java.lang.Boolean r95, java.lang.Boolean r96, int r97, int r98, xsna.zcl r99) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.dto.stickers.StickerStockItem.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, boolean, boolean, boolean, boolean, boolean, boolean, com.vk.dto.stickers.Price, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.vk.dto.common.NotificationImage, java.lang.String, long, boolean, int, boolean, java.lang.String, com.vk.dto.stickers.StickerStockItemPreviewImage, java.lang.String, com.vk.dto.stickers.Badge, com.vk.dto.stickers.PurchaseDetails, boolean, com.vk.dto.stickers.VmojiAvatar, java.lang.String, java.util.List, java.util.List, java.lang.Integer, boolean, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, int, int, xsna.zcl):void");
    }

    public static StickerStockItem Ab(StickerStockItem stickerStockItem, boolean z, int i, Boolean bool, Boolean bool2, int i2, int i3) {
        boolean z2;
        String str;
        Badge badge;
        VmojiAvatar vmojiAvatar;
        String str2;
        Integer num;
        boolean z3;
        int i4 = stickerStockItem.b;
        String str3 = stickerStockItem.c;
        String str4 = stickerStockItem.d;
        String str5 = stickerStockItem.e;
        String str6 = stickerStockItem.f;
        List<StickerItem> list = stickerStockItem.g;
        boolean z4 = (i2 & 64) != 0 ? stickerStockItem.h : true;
        boolean z5 = stickerStockItem.i;
        boolean z6 = z4;
        boolean z7 = stickerStockItem.j;
        boolean z8 = (i2 & 512) != 0 ? stickerStockItem.k : z;
        boolean z9 = stickerStockItem.l;
        boolean z10 = z8;
        boolean z11 = stickerStockItem.m;
        Price price = stickerStockItem.n;
        String str7 = stickerStockItem.o;
        String str8 = stickerStockItem.p;
        String str9 = stickerStockItem.q;
        String str10 = stickerStockItem.r;
        String str11 = stickerStockItem.s;
        String str12 = stickerStockItem.t;
        String str13 = stickerStockItem.u;
        NotificationImage notificationImage = stickerStockItem.v;
        String str14 = stickerStockItem.w;
        long j = stickerStockItem.x;
        boolean z12 = stickerStockItem.y;
        if ((i2 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0) {
            z2 = z12;
            i = stickerStockItem.z;
        } else {
            z2 = z12;
        }
        boolean z13 = stickerStockItem.A;
        String str15 = stickerStockItem.B;
        StickerStockItemPreviewImage stickerStockItemPreviewImage = stickerStockItem.C;
        String str16 = stickerStockItem.D;
        if ((i2 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0) {
            str = str16;
            badge = stickerStockItem.E;
        } else {
            str = str16;
            badge = null;
        }
        Badge badge2 = badge;
        PurchaseDetails purchaseDetails = stickerStockItem.F;
        boolean z14 = stickerStockItem.G;
        VmojiAvatar vmojiAvatar2 = stickerStockItem.H;
        if ((i3 & 2) != 0) {
            vmojiAvatar = vmojiAvatar2;
            str2 = stickerStockItem.I;
        } else {
            vmojiAvatar = vmojiAvatar2;
            str2 = "";
        }
        String str17 = str2;
        List<Integer> list2 = stickerStockItem.J;
        List<Integer> list3 = stickerStockItem.K;
        Integer num2 = stickerStockItem.L;
        if ((i3 & 32) != 0) {
            num = num2;
            z3 = stickerStockItem.M;
        } else {
            num = num2;
            z3 = false;
        }
        boolean z15 = z3;
        String str18 = stickerStockItem.N;
        String str19 = stickerStockItem.O;
        String str20 = stickerStockItem.P;
        boolean z16 = stickerStockItem.Q;
        Boolean bool3 = (i3 & 1024) != 0 ? stickerStockItem.R : bool;
        Boolean bool4 = (i3 & 2048) != 0 ? stickerStockItem.S : bool2;
        Boolean bool5 = stickerStockItem.T;
        stickerStockItem.getClass();
        return new StickerStockItem(i4, str3, str4, str5, str6, list, z6, z5, z7, z10, z9, z11, price, str7, str8, str9, str10, str11, str12, str13, notificationImage, str14, j, z2, i, z13, str15, stickerStockItemPreviewImage, str, badge2, purchaseDetails, z14, vmojiAvatar, str17, list2, list3, num, z15, str18, str19, str20, z16, bool3, bool4, bool5);
    }

    public final boolean Bb() {
        String str;
        return (this.i || (str = this.w) == null || str.length() <= 0) ? false : true;
    }

    public final boolean Cb() {
        return this.h;
    }

    @Override // xsna.mge0
    public final String D8() {
        return this.P;
    }

    public final StickerItem Db(int i) {
        Object obj;
        Iterator<T> it = this.g.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((StickerItem) obj).b == i) {
                break;
            }
        }
        return (StickerItem) obj;
    }

    public final ArrayList Eb() {
        List<StickerItem> list = this.g;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((StickerItem) it.next()).b));
        }
        return arrayList;
    }

    public final boolean Fb() {
        Price price = this.n;
        return price.zb() != null && price.zb().length() > 0;
    }

    public final boolean Gb() {
        Price price = this.n;
        return price.Ab() != null && price.Ab().length() > 0;
    }

    public final boolean Hb() {
        return this.L == null && !this.J.isEmpty();
    }

    public final boolean Ib() {
        return this.L == null && this.J.isEmpty();
    }

    public final boolean Jb() {
        return this.Q;
    }

    @Override // xsna.mge0
    public final String L4() {
        return this.o;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.j0(this.f);
        serializer.o0(this.g);
        serializer.L(this.h ? (byte) 1 : (byte) 0);
        serializer.L(this.i ? (byte) 1 : (byte) 0);
        serializer.L(this.j ? (byte) 1 : (byte) 0);
        serializer.L(this.k ? (byte) 1 : (byte) 0);
        serializer.L(this.l ? (byte) 1 : (byte) 0);
        serializer.L(this.m ? (byte) 1 : (byte) 0);
        serializer.i0(this.n);
        serializer.j0(this.o);
        serializer.j0(this.p);
        serializer.j0(this.q);
        serializer.j0(this.r);
        serializer.j0(this.s);
        serializer.j0(this.t);
        serializer.j0(this.u);
        serializer.i0(this.v);
        serializer.j0(this.w);
        serializer.Y(this.x);
        serializer.L(this.y ? (byte) 1 : (byte) 0);
        serializer.S(this.z);
        serializer.L(this.A ? (byte) 1 : (byte) 0);
        serializer.j0(this.B);
        serializer.i0(this.C);
        serializer.j0(this.D);
        serializer.i0(this.E);
        serializer.i0(this.F);
        serializer.L(this.G ? (byte) 1 : (byte) 0);
        serializer.i0(this.H);
        serializer.j0(this.I);
        serializer.L(this.M ? (byte) 1 : (byte) 0);
        serializer.U(this.J);
        serializer.U(this.K);
        serializer.V(this.L);
        serializer.j0(this.N);
        serializer.j0(this.P);
        serializer.L(this.Q ? (byte) 1 : (byte) 0);
        serializer.J(this.R);
        serializer.J(this.S);
        serializer.J(this.T);
    }

    @Override // xsna.mge0
    public final String R8() {
        return "";
    }

    @Override // xsna.mge0
    public final String W6() {
        return z230.b.c() + ",1," + this.b + ',' + z230.b.c();
    }

    @Override // xsna.mge0
    public final void cb(JSONObject jSONObject) {
        Price.PriceInfo Eb = this.n.Eb();
        if (Eb != null) {
            String optString = jSONObject.optString("price_buy");
            if (optString == null) {
                optString = "";
            }
            Eb.Bb(optString);
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(StickerStockItem stickerStockItem) {
        int i = stickerStockItem.z;
        int i2 = this.z;
        if (i2 < i) {
            return -1;
        }
        return i2 == i ? 0 : 1;
    }

    @Override // xsna.mge0
    public final boolean d1() {
        return this.m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!StickerStockItem.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        StickerStockItem stickerStockItem = (StickerStockItem) obj;
        return this.b == stickerStockItem.b && epx.f(this.H, stickerStockItem.H);
    }

    @Override // xsna.mge0
    public final int getId() {
        return this.b;
    }

    @Override // xsna.mge0
    public final String getType() {
        return this.c;
    }

    public final int hashCode() {
        int a2 = urd0.a(this.b * 31, 31, this.d);
        VmojiAvatar vmojiAvatar = this.H;
        return a2 + (vmojiAvatar != null ? vmojiAvatar.hashCode() : 0);
    }

    @Override // xsna.mge0
    public final boolean ma() {
        return this.i;
    }

    @Override // xsna.mge0
    public final String n() {
        return this.O;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickerStockItem(id=");
        sb.append(this.b);
        sb.append(", title=");
        return ho8.a(sb, this.d, ')');
    }

    @Override // xsna.mge0
    public final PaymentType u3() {
        String str = this.p;
        if (str == null) {
            return null;
        }
        switch (str) {
            case "balance":
                return PaymentType.Balance;
            case "subs":
                return PaymentType.Subs;
            case "inapp":
                return PaymentType.Inapp;
            default:
                return null;
        }
    }

    public final StickerStockItem zb(int i, boolean z) {
        return Ab(this, z, i, null, null, -16777729, 8191);
    }

    public StickerStockItem(int i, String str, String str2, String str3, String str4, List<StickerItem> list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, Price price, String str5, String str6, String str7, String str8, String str9, String str10, String str11, NotificationImage notificationImage, String str12, long j, boolean z7, int i2, boolean z8, String str13, StickerStockItemPreviewImage stickerStockItemPreviewImage, String str14, Badge badge, PurchaseDetails purchaseDetails, boolean z9, VmojiAvatar vmojiAvatar, String str15, List<Integer> list2, List<Integer> list3, Integer num, boolean z10, String str16, String str17, String str18, boolean z11, Boolean bool, Boolean bool2, Boolean bool3) {
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = list;
        this.h = z;
        this.i = z2;
        this.j = z3;
        this.k = z4;
        this.l = z5;
        this.m = z6;
        this.n = price;
        this.o = str5;
        this.p = str6;
        this.q = str7;
        this.r = str8;
        this.s = str9;
        this.t = str10;
        this.u = str11;
        this.v = notificationImage;
        this.w = str12;
        this.x = j;
        this.y = z7;
        this.z = i2;
        this.A = z8;
        this.B = str13;
        this.C = stickerStockItemPreviewImage;
        this.D = str14;
        this.E = badge;
        this.F = purchaseDetails;
        this.G = z9;
        this.H = vmojiAvatar;
        this.I = str15;
        this.J = list2;
        this.K = list3;
        this.L = num;
        this.M = z10;
        this.N = str16;
        this.O = str17;
        this.P = str18;
        this.Q = z11;
        this.R = bool;
        this.S = bool2;
        this.T = bool3;
    }
}
