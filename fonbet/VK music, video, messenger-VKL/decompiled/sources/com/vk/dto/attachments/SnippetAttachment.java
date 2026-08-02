package com.vk.dto.attachments;

import android.graphics.Color;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.vk.common.links.AwayLink;
import com.vk.core.serialize.Serializer;
import com.vk.dto.articles.AMP;
import com.vk.dto.articles.Article;
import com.vk.dto.attachments.Product;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Availability;
import com.vk.dto.common.ClassifiedJob;
import com.vk.dto.common.Currency;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.ImageSizeKey;
import com.vk.dto.common.Salary;
import com.vk.dto.common.SalaryPeriod;
import com.vk.dto.common.data.ApiApplication;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.ButtonAction;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.photo.Photo;
import com.vk.log.L;
import com.vkontakte.android.R;
import io.appmetrica.analytics.impl.L2;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.a0a;
import xsna.bxx;
import xsna.dd80;
import xsna.f370;
import xsna.glw;
import xsna.gmq;
import xsna.ixj0;
import xsna.tec0;
import xsna.tfw;
import xsna.vj90;

/* loaded from: classes18.dex */
public class SnippetAttachment extends Attachment implements tfw, gmq, bxx, tec0 {

    @Nullable
    public final ApiApplication A;

    @Nullable
    public final VmojiAttachInfo B;

    @Nullable
    public final String C;

    @Nullable
    public final String D;
    public final int E;

    @Nullable
    public final transient Image F;

    @Nullable
    public final transient ImageSize G;
    public final AwayLink f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;

    @Nullable
    public final String m;

    @Nullable
    public final String n;
    public final String o;

    @Nullable
    public final Photo p;
    public AMP q;

    @Nullable
    public final Product r;
    public final float s;
    public boolean t;
    public String u;

    @Nullable
    public final ButtonAction v;
    public Boolean w;

    @Nullable
    public final String x;

    @Nullable
    public final Article y;

    @Nullable
    public final ClassifiedJob z;
    public static final char[] H = {ImageSizeKey.SIZE_X_0604.i(), ImageSizeKey.SIZE_Z_1080.i()};
    public static final Serializer.c<SnippetAttachment> CREATOR = new a();

    public class a extends Serializer.c<SnippetAttachment> {
        @Override // com.vk.core.serialize.Serializer.c
        public final SnippetAttachment a(@NonNull Serializer serializer) {
            Photo photo = (Photo) serializer.G(Photo.class.getClassLoader());
            AMP amp = (AMP) serializer.G(AMP.class.getClassLoader());
            return new SnippetAttachment(serializer.H(), serializer.H(), serializer.H(), (AwayLink) serializer.G(AwayLink.class.getClassLoader()), serializer.H(), photo, amp, (Product) serializer.G(Product.class.getClassLoader()), serializer.H(), serializer.H(), serializer.s(), serializer.H(), (ButtonAction) serializer.G(ButtonAction.class.getClassLoader()), serializer.m(), serializer.H(), serializer.m(), (Article) serializer.G(Article.class.getClassLoader()), (ClassifiedJob) serializer.G(ClassifiedJob.class.getClassLoader()), serializer.H(), (ApiApplication) serializer.G(ApiApplication.class.getClassLoader()), (VmojiAttachInfo) serializer.G(VmojiAttachInfo.class.getClassLoader()), serializer.H(), serializer.H(), serializer.u(), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SnippetAttachment[i];
        }
    }

    public SnippetAttachment(String str, String str2, String str3, AwayLink awayLink, String str4, @Nullable Photo photo, AMP amp, @Nullable Product product, String str5, String str6, float f, String str7, @Nullable ButtonAction buttonAction, boolean z, @Nullable String str8, boolean z2, @Nullable Article article, @Nullable ClassifiedJob classifiedJob, @Nullable String str9, @Nullable ApiApplication apiApplication, @Nullable VmojiAttachInfo vmojiAttachInfo, @Nullable String str10, @Nullable String str11, int i, @Nullable String str12) {
        this.g = str;
        this.h = str2;
        this.i = str3;
        this.p = photo;
        this.q = amp;
        this.f = awayLink;
        this.j = str4;
        this.r = product;
        this.k = str5;
        this.l = str6;
        this.s = f;
        this.o = str7;
        if (TextUtils.isEmpty(str3)) {
            this.i = Uri.parse(awayLink.b).getAuthority();
        }
        if (TextUtils.isEmpty(str)) {
            this.g = awayLink.b;
        }
        if (buttonAction != null) {
            this.v = buttonAction;
        }
        this.w = Boolean.valueOf(z);
        this.x = str8;
        this.t = z2;
        if (!z2 && photo != null) {
            ArrayList arrayList = photo.y.b;
            int size = arrayList.size();
            ArrayList arrayList2 = null;
            for (int i2 = 0; i2 < size; i2++) {
                ImageSize imageSize = (ImageSize) arrayList.get(i2);
                int i3 = imageSize.d.b;
                float f2 = i3 / r1.c;
                char c = imageSize.b;
                if (f2 > 2.1f && f2 <= 4.1f && (c == 'l' || c == 'k' || ((c == 'x' || c == 'z') && i3 >= 537))) {
                    arrayList2 = arrayList2 == null ? new ArrayList(size) : arrayList2;
                    arrayList2.add(imageSize);
                    if (this.G == null) {
                        this.G = imageSize;
                    }
                }
            }
            Image image = arrayList2 != null ? new Image(arrayList2) : null;
            this.F = image;
            this.G = image != null ? this.G : null;
        }
        this.y = article;
        this.z = classifiedJob;
        this.m = str9;
        this.A = apiApplication;
        this.B = vmojiAttachInfo;
        this.C = str10;
        this.D = str11;
        this.E = i;
        this.n = str12;
    }

    @NonNull
    public static SnippetAttachment Ib(@NonNull JSONObject jSONObject, @Nullable Map<UserId, Owner> map) throws JSONException {
        String str;
        String str2;
        String str3;
        String str4;
        ButtonAction buttonAction;
        Product product;
        ClassifiedJob classifiedJob;
        float f;
        int i;
        String str5;
        VmojiAttachInfo vmojiAttachInfo;
        String str6;
        String str7;
        String D;
        String D2;
        ClassifiedJob classifiedJob2;
        if (jSONObject.has("button")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("button");
            String string = jSONObject2.getString("title");
            String optString = jSONObject2.optString("url");
            JSONObject optJSONObject = jSONObject2.optJSONObject("action");
            ButtonAction buttonAction2 = optJSONObject != null ? new ButtonAction(optJSONObject) : null;
            String optString2 = jSONObject2.optString("icon");
            str4 = jSONObject2.optString(TtmlNode.TAG_STYLE);
            str = string;
            str2 = optString;
            str3 = optString2;
            buttonAction = buttonAction2;
        } else {
            str = "";
            str2 = str;
            str3 = str2;
            str4 = str3;
            buttonAction = null;
        }
        String optString3 = jSONObject.optString("target", "");
        JSONObject optJSONObject2 = jSONObject.optJSONObject("amp");
        AMP amp = optJSONObject2 != null ? new AMP(optJSONObject2.optString("url"), optJSONObject2.optInt("views"), optJSONObject2.optBoolean("is_favorite")) : null;
        JSONObject optJSONObject3 = jSONObject.optJSONObject("product");
        if (optJSONObject3 != null) {
            Serializer.c<Product> cVar = Product.CREATOR;
            product = Product.a.a(optJSONObject3);
        } else {
            product = null;
        }
        JSONObject optJSONObject4 = jSONObject.optJSONObject("classified_worki");
        if (optJSONObject4 != null) {
            Serializer.c<ClassifiedJob> cVar2 = ClassifiedJob.CREATOR;
            String D3 = f370.D(optJSONObject4, "company");
            if (D3 != null && (D = f370.D(optJSONObject4, "profession")) != null && (D2 = f370.D(optJSONObject4, "city")) != null) {
                double optDouble = optJSONObject4.optDouble("distance");
                JSONObject optJSONObject5 = optJSONObject4.optJSONObject("availability");
                if (optJSONObject5 != null) {
                    Availability availability = new Availability(optJSONObject5.optBoolean("remote"), optJSONObject5.optBoolean("no_experience"), optJSONObject5.optBoolean("parttime"), optJSONObject5.optBoolean("watch"));
                    JSONObject optJSONObject6 = optJSONObject4.optJSONObject("salary");
                    if (optJSONObject6 != null) {
                        double optDouble2 = optJSONObject6.optDouble("from");
                        double optDouble3 = optJSONObject6.optDouble("to");
                        Serializer.c<Currency> cVar3 = Currency.CREATOR;
                        Currency a2 = Currency.a.a(optJSONObject6.getJSONObject(InAppPurchaseMetaData.KEY_CURRENCY));
                        SalaryPeriod.a aVar = SalaryPeriod.Companion;
                        String D4 = f370.D(optJSONObject6, "period");
                        aVar.getClass();
                        classifiedJob2 = new ClassifiedJob(D3, D, D2, optDouble, availability, new Salary(optDouble2, optDouble3, a2, SalaryPeriod.a.a(D4)), f370.D(optJSONObject4, "fullname"), f370.D(optJSONObject4, "phone"));
                        classifiedJob = classifiedJob2;
                    }
                }
            }
            classifiedJob2 = null;
            classifiedJob = classifiedJob2;
        } else {
            classifiedJob = null;
        }
        JSONObject optJSONObject7 = jSONObject.optJSONObject(CampaignEx.JSON_KEY_STAR);
        if (optJSONObject7 != null) {
            f = (float) optJSONObject7.optDouble("stars");
            i = optJSONObject7.optInt("reviews_count");
        } else {
            f = Float.NaN;
            i = 0;
        }
        float f2 = f;
        JSONObject optJSONObject8 = jSONObject.optJSONObject("preview_article");
        Article a3 = (optJSONObject8 == null || map == null) ? null : vj90.a(optJSONObject8, map.get(new UserId(optJSONObject8.optLong("owner_id"))));
        JSONObject optJSONObject9 = jSONObject.optJSONObject("photo");
        Photo photo = optJSONObject9 != null ? new Photo(optJSONObject9) : null;
        JSONObject optJSONObject10 = jSONObject.optJSONObject("mini_app");
        ApiApplication apiApplication = optJSONObject10 != null ? new ApiApplication(optJSONObject10) : null;
        if (jSONObject.has("vmoji_avatar")) {
            vmojiAttachInfo = new VmojiAttachInfo(false, Integer.valueOf(Color.parseColor(jSONObject.getJSONObject("vmoji_avatar").getString(L2.g))));
            str5 = null;
        } else if (jSONObject.has("stickers_pack")) {
            str5 = null;
            vmojiAttachInfo = new VmojiAttachInfo(jSONObject.getJSONObject("stickers_pack").getBoolean("is_vmoji"), null);
        } else {
            str5 = null;
            vmojiAttachInfo = null;
        }
        if (jSONObject.has("seller_product")) {
            JSONObject jSONObject3 = jSONObject.getJSONObject("seller_product");
            String string2 = jSONObject3.getString("owner_name");
            str7 = jSONObject3.has("favicon_link") ? jSONObject3.getString("favicon_link") : str5;
            str6 = string2;
        } else {
            str6 = str5;
            str7 = str6;
        }
        return new SnippetAttachment(jSONObject.getString("title"), jSONObject.optString("description"), jSONObject.optString("caption"), new AwayLink(jSONObject.getString("url"), AwayLink.a.a(jSONObject)), optString3, photo, amp, product, str, str2, f2, jSONObject.optString("preview_page"), buttonAction, jSONObject.optBoolean("is_favorite"), jSONObject.optString("id"), false, a3, classifiedJob, str3, apiApplication, vmojiAttachInfo, str6, str7, i, str4);
    }

    @Override // com.vk.dto.common.Attachment
    public final int Ab() {
        return Gb() ? 13 : 6;
    }

    @Override // com.vk.dto.common.Attachment
    public final int Bb() {
        return dd80.r;
    }

    public final boolean Db() {
        return this.z != null;
    }

    @Deprecated
    public final boolean Eb() {
        String str = this.n;
        return str != null && str.equals("quick-solution-for-color-button");
    }

    public final boolean Fb() {
        return this.z == null && this.B == null && TextUtils.isEmpty(this.k) && this.v == null && this.r == null;
    }

    public final boolean Gb() {
        return this.r != null;
    }

    public final boolean Hb() {
        return this.C != null;
    }

    public final Article Jb() {
        if (this.q == null) {
            return null;
        }
        UserId userId = UserId.d;
        Owner owner = new Owner(userId, this.i, null, null);
        String str = this.f.b;
        AMP amp = this.q;
        return new Article(0, userId, null, 0L, this.g, this.h, owner, str, amp.b, null, this.p, amp.c, amp.d, true, false, null, null, null, 0, false);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(@NonNull Serializer serializer) {
        serializer.i0(this.p);
        serializer.i0(this.q);
        serializer.i0(this.f);
        serializer.j0(this.g);
        serializer.j0(this.h);
        serializer.j0(this.i);
        serializer.j0(this.j);
        serializer.i0(this.r);
        serializer.j0(this.k);
        serializer.j0(this.l);
        serializer.P(this.s);
        serializer.j0(this.o);
        serializer.i0(this.v);
        serializer.L(this.w.booleanValue() ? (byte) 1 : (byte) 0);
        serializer.j0(this.x);
        serializer.L(this.t ? (byte) 1 : (byte) 0);
        serializer.i0(this.y);
        serializer.i0(this.z);
        serializer.j0(this.m);
        serializer.i0(this.A);
        serializer.i0(this.B);
        serializer.j0(this.C);
        serializer.j0(this.D);
        serializer.S(this.E);
        serializer.j0(this.n);
    }

    @Override // xsna.tec0
    @NonNull
    public final JSONObject Q3() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", 12);
            jSONObject.put("snippet", e5());
            return jSONObject;
        } catch (JSONException e) {
            L.i(e);
            return jSONObject;
        }
    }

    @Override // xsna.gmq
    public final boolean X() {
        return this.w.booleanValue();
    }

    @Override // xsna.bxx
    @NonNull
    public final JSONObject e5() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("url", this.f.b);
            jSONObject.put("title", this.g);
            jSONObject.put("description", this.h);
            jSONObject.put("target", this.j);
            jSONObject.put("preview_page", this.o);
            Photo photo = this.p;
            if (photo != null) {
                jSONObject.put("photo", photo.Q3());
            }
            Product product = this.r;
            if (product != null) {
                jSONObject.put("product", product.e5());
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("title", this.k);
            jSONObject2.put("url", this.l);
            jSONObject.put("button", jSONObject2);
            return jSONObject;
        } catch (JSONException e) {
            L.i(e);
            return jSONObject;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            SnippetAttachment snippetAttachment = (SnippetAttachment) obj;
            if (Objects.equals(this.p, snippetAttachment.p) && Objects.equals(this.f, snippetAttachment.f)) {
                return true;
            }
        }
        return false;
    }

    @Override // xsna.tfw
    public final String h9() {
        Photo photo = this.p;
        if (photo == null) {
            return null;
        }
        Image image = photo.y;
        if (image.b.isEmpty()) {
            return null;
        }
        Image image2 = this.F;
        if (image2 != null && glw.a().b()) {
            image = image2;
        }
        return ixj0.n(image.b);
    }

    public final int hashCode() {
        AwayLink awayLink = this.f;
        int hashCode = (awayLink != null ? awayLink.hashCode() : 0) * 31;
        Photo photo = this.p;
        return hashCode + (photo != null ? photo.hashCode() : 0);
    }

    @Override // xsna.gmq
    public final void s0(boolean z) {
        this.w = Boolean.valueOf(z);
        AMP amp = this.q;
        if (amp != null) {
            String str = amp.b;
            int i = amp.c;
            amp.getClass();
            this.q = new AMP(str, i, z);
        }
    }

    public final String toString() {
        AwayLink awayLink = this.f;
        String str = awayLink.b;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.startsWith("http://") || str.startsWith("https://")) {
            return str;
        }
        return "http://" + awayLink.b;
    }

    @Override // com.vk.dto.common.Attachment
    public final int zb() {
        String str = this.f.b;
        if (TextUtils.isEmpty(str)) {
            return R.string.attachment;
        }
        StringBuilder sb = new StringBuilder("https://");
        sb.append(a0a.d);
        sb.append("/story");
        return (str.startsWith(sb.toString()) || str.startsWith("https://vk.com/story")) ? R.string.story : R.string.attachment;
    }
}
