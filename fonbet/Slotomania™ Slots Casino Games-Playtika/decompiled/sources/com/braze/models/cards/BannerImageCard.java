package com.braze.models.cards;

import bo.app.b2;
import bo.app.z1;
import com.braze.enums.CardKey;
import com.braze.enums.CardType;
import com.braze.storage.ICardStorageProvider;
import com.braze.support.JsonUtils;
import com.ironsource.X3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001BA\b\u0007\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b \u0010!J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0005\u001a\u0004\b\t\u0010\u0007R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lcom/braze/models/cards/BannerImageCard;", "Lcom/braze/models/cards/Card;", "", "toString", "imageUrl", "Ljava/lang/String;", "getImageUrl", "()Ljava/lang/String;", "url", "getUrl", X3.j.D, "getDomain", "", "aspectRatio", "F", "getAspectRatio", "()F", "Lcom/braze/enums/CardType;", "cardType", "Lcom/braze/enums/CardType;", "getCardType", "()Lcom/braze/enums/CardType;", "Lorg/json/JSONObject;", "jsonObject", "Lcom/braze/enums/CardKey$Provider;", "cardKeyProvider", "Lbo/app/z1;", "manager", "Lcom/braze/storage/ICardStorageProvider;", "cardStorageProvider", "Lbo/app/b2;", "cardAnalyticsProvider", "<init>", "(Lorg/json/JSONObject;Lcom/braze/enums/CardKey$Provider;Lbo/app/z1;Lcom/braze/storage/ICardStorageProvider;Lbo/app/b2;)V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public final class BannerImageCard extends Card {
    private final float aspectRatio;
    private final CardType cardType;
    private final String domain;
    private final String imageUrl;
    private final String url;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BannerImageCard(JSONObject jsonObject, CardKey.Provider cardKeyProvider) {
        this(jsonObject, cardKeyProvider, null, null, null, 28, null);
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(cardKeyProvider, "cardKeyProvider");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BannerImageCard(JSONObject jsonObject, CardKey.Provider cardKeyProvider, z1 z1Var) {
        this(jsonObject, cardKeyProvider, z1Var, null, null, 24, null);
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(cardKeyProvider, "cardKeyProvider");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BannerImageCard(JSONObject jsonObject, CardKey.Provider cardKeyProvider, z1 z1Var, ICardStorageProvider<?> iCardStorageProvider) {
        this(jsonObject, cardKeyProvider, z1Var, iCardStorageProvider, null, 16, null);
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(cardKeyProvider, "cardKeyProvider");
    }

    public /* synthetic */ BannerImageCard(JSONObject jSONObject, CardKey.Provider provider, z1 z1Var, ICardStorageProvider iCardStorageProvider, b2 b2Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(jSONObject, provider, (i & 4) != 0 ? null : z1Var, (i & 8) != 0 ? null : iCardStorageProvider, (i & 16) != 0 ? null : b2Var);
    }

    public final float getAspectRatio() {
        return this.aspectRatio;
    }

    @Override // com.braze.models.cards.Card
    public CardType getCardType() {
        return this.cardType;
    }

    public final String getDomain() {
        return this.domain;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    @Override // com.braze.models.cards.Card
    public String getUrl() {
        return this.url;
    }

    @Override // com.braze.models.cards.Card
    public String toString() {
        return StringsKt.trimIndent("\n            BannerImageCard{imageUrl='" + this.imageUrl + "'\n            url='" + ((Object) getUrl()) + "'\n            domain='" + ((Object) this.domain) + "'\n            aspectRatio=" + this.aspectRatio + "\n            " + super.toString() + "}\n            \n        ");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerImageCard(JSONObject jsonObject, CardKey.Provider cardKeyProvider, z1 z1Var, ICardStorageProvider<?> iCardStorageProvider, b2 b2Var) {
        super(jsonObject, cardKeyProvider, z1Var, iCardStorageProvider, b2Var);
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(cardKeyProvider, "cardKeyProvider");
        String string = jsonObject.getString(cardKeyProvider.getKey(CardKey.BANNER_IMAGE_IMAGE));
        Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(car…dKey.BANNER_IMAGE_IMAGE))");
        this.imageUrl = string;
        this.url = JsonUtils.getOptionalString(jsonObject, cardKeyProvider.getKey(CardKey.BANNER_IMAGE_URL));
        this.domain = JsonUtils.getOptionalString(jsonObject, cardKeyProvider.getKey(CardKey.BANNER_IMAGE_DOMAIN));
        this.aspectRatio = (float) jsonObject.optDouble(cardKeyProvider.getKey(CardKey.BANNER_IMAGE_ASPECT_RATIO), 0.0d);
        this.cardType = CardType.BANNER;
    }
}
