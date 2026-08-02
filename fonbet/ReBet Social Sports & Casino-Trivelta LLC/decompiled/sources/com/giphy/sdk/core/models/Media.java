package com.giphy.sdk.core.models;

import Gb.c;
import N8.m;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.uimanager.ViewProps;
import com.giphy.sdk.analytics.models.enums.EventType;
import com.giphy.sdk.core.models.enums.MediaType;
import com.giphy.sdk.core.models.enums.RatingType;
import com.twilio.voice.EventKeys;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b`\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002Bõ\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0011\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u001d\u0012\b\b\u0002\u0010#\u001a\u00020\"\u0012\b\b\u0002\u0010$\u001a\u00020\"\u0012\b\b\u0002\u0010%\u001a\u00020\"\u0012\b\b\u0002\u0010&\u001a\u00020\"\u0012\b\b\u0002\u0010'\u001a\u00020\"\u0012\b\b\u0002\u0010(\u001a\u00020\"\u0012\b\b\u0002\u0010)\u001a\u00020\"\u0012\b\b\u0002\u0010*\u001a\u00020\"\u0012\b\b\u0002\u0010+\u001a\u00020\"\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010/\u0012\b\b\u0002\u00101\u001a\u00020\"\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u000104\u0012\u0010\b\u0002\u00106\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0011\u0012\u0016\b\u0002\u00108\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u000107¢\u0006\u0004\b9\u0010:J\r\u0010<\u001a\u00020;¢\u0006\u0004\b<\u0010=J\u0010\u0010>\u001a\u000204HÖ\u0001¢\u0006\u0004\b>\u0010?J \u0010C\u001a\u00020;2\u0006\u0010A\u001a\u00020@2\u0006\u0010B\u001a\u000204HÖ\u0001¢\u0006\u0004\bC\u0010DR\"\u0010\u0004\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010E\u001a\u0004\bO\u0010GR$\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010E\u001a\u0004\bP\u0010G\"\u0004\bQ\u0010IR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010E\u001a\u0004\bR\u0010GR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010E\u001a\u0004\bS\u0010GR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010E\u001a\u0004\bT\u0010GR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010E\u001a\u0004\bU\u0010GR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\r\u0010E\u001a\u0004\bV\u0010GR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010W\u001a\u0004\bX\u0010YR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010E\u001a\u0004\bZ\u0010GR\u001f\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010[\u001a\u0004\b\\\u0010]R\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010[\u001a\u0004\b^\u0010]R$\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\"\u0010\u0017\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR$\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001a\u0010E\u001a\u0004\bn\u0010GR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010E\u001a\u0004\bo\u0010GR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010E\u001a\u0004\bp\u0010GR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010q\u001a\u0004\br\u0010sR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010q\u001a\u0004\bt\u0010sR\u001c\u0010 \u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010q\u001a\u0004\bu\u0010sR\u001c\u0010!\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010q\u001a\u0004\bv\u0010sR\u001a\u0010#\u001a\u00020\"8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010w\u001a\u0004\b#\u0010xR\u001a\u0010$\u001a\u00020\"8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010w\u001a\u0004\b$\u0010xR\u001a\u0010%\u001a\u00020\"8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010w\u001a\u0004\b%\u0010xR\u001a\u0010&\u001a\u00020\"8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010w\u001a\u0004\b&\u0010xR\u001a\u0010'\u001a\u00020\"8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010w\u001a\u0004\b'\u0010xR\u001a\u0010(\u001a\u00020\"8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010w\u001a\u0004\b(\u0010xR\u001a\u0010)\u001a\u00020\"8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010w\u001a\u0004\b)\u0010xR\u001a\u0010*\u001a\u00020\"8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010w\u001a\u0004\b*\u0010xR\u001a\u0010+\u001a\u00020\"8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010w\u001a\u0004\b+\u0010xR$\u0010-\u001a\u0004\u0018\u00010,8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b-\u0010y\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R\u001c\u0010.\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010E\u001a\u0004\b~\u0010GR\u001b\u00100\u001a\u0004\u0018\u00010/8\u0006¢\u0006\u000e\n\u0004\b0\u0010\u007f\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R%\u00101\u001a\u00020\"8\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0004\b1\u0010w\u001a\u0005\b\u0082\u0001\u0010x\"\u0006\b\u0083\u0001\u0010\u0084\u0001R&\u00102\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0004\b2\u0010E\u001a\u0005\b\u0085\u0001\u0010G\"\u0005\b\u0086\u0001\u0010IR&\u00103\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0004\b3\u0010E\u001a\u0005\b\u0087\u0001\u0010G\"\u0005\b\u0088\u0001\u0010IR)\u00105\u001a\u0004\u0018\u0001048\u0006@\u0006X\u0087\u000e¢\u0006\u0017\n\u0005\b5\u0010\u0089\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0006\b\u008c\u0001\u0010\u008d\u0001R-\u00106\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00118\u0016@\u0016X\u0096\u000e¢\u0006\u0015\n\u0004\b6\u0010[\u001a\u0005\b\u008e\u0001\u0010]\"\u0006\b\u008f\u0001\u0010\u0090\u0001R5\u00108\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u0001078\u0016@\u0016X\u0096\u000e¢\u0006\u0017\n\u0005\b8\u0010\u0091\u0001\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001\"\u0006\b\u0094\u0001\u0010\u0095\u0001R\u0018\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0096\u0001\u0010GR\u001e\u0010\u0099\u0001\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00118VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0098\u0001\u0010]R,\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u00032\t\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u00038V@VX\u0096\u000e¢\u0006\u000e\u001a\u0005\b\u009b\u0001\u0010G\"\u0005\b\u009c\u0001\u0010IR.\u0010 \u0001\u001a\u0004\u0018\u0001042\t\u0010\u009a\u0001\u001a\u0004\u0018\u0001048V@VX\u0096\u000e¢\u0006\u0010\u001a\u0006\b\u009e\u0001\u0010\u008b\u0001\"\u0006\b\u009f\u0001\u0010\u008d\u0001R0\u0010¦\u0001\u001a\u0005\u0018\u00010¡\u00012\n\u0010\u009a\u0001\u001a\u0005\u0018\u00010¡\u00018V@VX\u0096\u000e¢\u0006\u0010\u001a\u0006\b¢\u0001\u0010£\u0001\"\u0006\b¤\u0001\u0010¥\u0001¨\u0006§\u0001"}, d2 = {"Lcom/giphy/sdk/core/models/Media;", "Landroid/os/Parcelable;", "LN8/m;", "", StackTraceHelper.ID_KEY, "Lcom/giphy/sdk/core/models/enums/MediaType;", "type", "slug", EventKeys.URL, "bitlyGifUrl", "bitlyUrl", "embedUrl", "source", "title", "Lcom/giphy/sdk/core/models/enums/RatingType;", "rating", "contentUrl", "", "tags", "featuredTags", "Lcom/giphy/sdk/core/models/User;", "user", "Lcom/giphy/sdk/core/models/Images;", "images", "Lcom/giphy/sdk/core/models/Video;", "video", "analyticsResponsePayload", "sourceTld", "sourcePostUrl", "Ljava/util/Date;", "updateDate", "createDate", "importDate", "trendingDate", "", "isHidden", "isRemoved", "isCommunity", "isAnonymous", "isFeatured", "isRealtime", "isIndexable", "isSticker", "isDynamic", "Lcom/giphy/sdk/core/models/BottleData;", "bottleData", "animatedTextStyle", "Lcom/giphy/sdk/core/models/Cta;", "cta", "hasAttributions", "altText", "variation", "", "variationCount", "injectedPixels", "Ljava/util/HashMap;", "userDictionary", "<init>", "(Ljava/lang/String;Lcom/giphy/sdk/core/models/enums/MediaType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/giphy/sdk/core/models/enums/RatingType;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/giphy/sdk/core/models/User;Lcom/giphy/sdk/core/models/Images;Lcom/giphy/sdk/core/models/Video;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;ZZZZZZZZZLcom/giphy/sdk/core/models/BottleData;Ljava/lang/String;Lcom/giphy/sdk/core/models/Cta;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/util/HashMap;)V", "", "postProcess", "()V", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "Lcom/giphy/sdk/core/models/enums/MediaType;", "getType", "()Lcom/giphy/sdk/core/models/enums/MediaType;", "setType", "(Lcom/giphy/sdk/core/models/enums/MediaType;)V", "getSlug", "getUrl", "setUrl", "getBitlyGifUrl", "getBitlyUrl", "getEmbedUrl", "getSource", "getTitle", "Lcom/giphy/sdk/core/models/enums/RatingType;", "getRating", "()Lcom/giphy/sdk/core/models/enums/RatingType;", "getContentUrl", "Ljava/util/List;", "getTags", "()Ljava/util/List;", "getFeaturedTags", "Lcom/giphy/sdk/core/models/User;", "getUser", "()Lcom/giphy/sdk/core/models/User;", "setUser", "(Lcom/giphy/sdk/core/models/User;)V", "Lcom/giphy/sdk/core/models/Images;", "getImages", "()Lcom/giphy/sdk/core/models/Images;", "setImages", "(Lcom/giphy/sdk/core/models/Images;)V", "Lcom/giphy/sdk/core/models/Video;", "getVideo", "()Lcom/giphy/sdk/core/models/Video;", "setVideo", "(Lcom/giphy/sdk/core/models/Video;)V", "getAnalyticsResponsePayload", "getSourceTld", "getSourcePostUrl", "Ljava/util/Date;", "getUpdateDate", "()Ljava/util/Date;", "getCreateDate", "getImportDate", "getTrendingDate", "Z", "()Z", "Lcom/giphy/sdk/core/models/BottleData;", "getBottleData", "()Lcom/giphy/sdk/core/models/BottleData;", "setBottleData", "(Lcom/giphy/sdk/core/models/BottleData;)V", "getAnimatedTextStyle", "Lcom/giphy/sdk/core/models/Cta;", "getCta", "()Lcom/giphy/sdk/core/models/Cta;", "getHasAttributions", "setHasAttributions", "(Z)V", "getAltText", "setAltText", "getVariation", "setVariation", "Ljava/lang/Integer;", "getVariationCount", "()Ljava/lang/Integer;", "setVariationCount", "(Ljava/lang/Integer;)V", "getInjectedPixels", "setInjectedPixels", "(Ljava/util/List;)V", "Ljava/util/HashMap;", "getUserDictionary", "()Ljava/util/HashMap;", "setUserDictionary", "(Ljava/util/HashMap;)V", "getTid", "tid", "getBottleDataTags", "bottleDataTags", EventKeys.VALUE_KEY, "getResponseId", "setResponseId", "responseId", "getPosition", "setPosition", ViewProps.POSITION, "Lcom/giphy/sdk/analytics/models/enums/EventType;", "getEventType", "()Lcom/giphy/sdk/analytics/models/enums/EventType;", "setEventType", "(Lcom/giphy/sdk/analytics/models/enums/EventType;)V", "eventType", "giphy-ui-2.3.17_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMedia.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Media.kt\ncom/giphy/sdk/core/models/Media\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,286:1\n1#2:287\n*E\n"})
/* loaded from: classes2.dex */
public final class Media implements Parcelable, m {

    @NotNull
    public static final Parcelable.Creator<Media> CREATOR = new Creator();

    @c("alt_text")
    @Nullable
    private String altText;

    @c("analytics_response_payload")
    @Nullable
    private final String analyticsResponsePayload;

    @c("animated_text_style")
    @Nullable
    private final String animatedTextStyle;

    @c("bitly_gif_url")
    @Nullable
    private final String bitlyGifUrl;

    @c("bitly_url")
    @Nullable
    private final String bitlyUrl;

    @c("bottle_data")
    @Nullable
    private BottleData bottleData;

    @c("content_url")
    @Nullable
    private final String contentUrl;

    @c("create_datetime")
    @Nullable
    private final Date createDate;

    @Nullable
    private final Cta cta;

    @c("embed_url")
    @Nullable
    private final String embedUrl;

    @c("featured_tags")
    @Nullable
    private final List<String> featuredTags;

    @c("has_attribution")
    private boolean hasAttributions;

    @NotNull
    private String id;

    @NotNull
    private Images images;

    @c("import_datetime")
    @Nullable
    private final Date importDate;

    @Nullable
    private List<String> injectedPixels;

    @c("is_anonymous")
    private final boolean isAnonymous;

    @c("is_community")
    private final boolean isCommunity;

    @c("is_dynamic")
    private final boolean isDynamic;

    @c("is_featured")
    private final boolean isFeatured;

    @c("is_hidden")
    private final boolean isHidden;

    @c("is_indexable")
    private final boolean isIndexable;

    @c("is_realtime")
    private final boolean isRealtime;

    @c("is_removed")
    private final boolean isRemoved;

    @c("is_sticker")
    private final boolean isSticker;

    @Nullable
    private final RatingType rating;

    @Nullable
    private final String slug;

    @Nullable
    private final String source;

    @c("source_post_url")
    @Nullable
    private final String sourcePostUrl;

    @c("source_tld")
    @Nullable
    private final String sourceTld;

    @Nullable
    private final List<String> tags;

    @Nullable
    private final String title;

    @c("trending_datetime")
    @Nullable
    private final Date trendingDate;

    @Nullable
    private MediaType type;

    @c("update_datetime")
    @Nullable
    private final Date updateDate;

    @Nullable
    private String url;

    @Nullable
    private User user;

    @Nullable
    private HashMap<String, String> userDictionary;

    @c("variation")
    @Nullable
    private String variation;

    @c("variation_count")
    @Nullable
    private Integer variationCount;

    @Nullable
    private Video video;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Media> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Media createFromParcel(@NotNull Parcel parcel) {
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            boolean z15;
            boolean z16;
            boolean z17;
            boolean z18;
            BottleData bottleData;
            Cta cta;
            HashMap hashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            MediaType createFromParcel = parcel.readInt() == 0 ? null : MediaType.CREATOR.createFromParcel(parcel);
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            RatingType valueOf = parcel.readInt() == 0 ? null : RatingType.valueOf(parcel.readString());
            String readString9 = parcel.readString();
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
            User createFromParcel2 = parcel.readInt() == 0 ? null : User.CREATOR.createFromParcel(parcel);
            Images createFromParcel3 = Images.CREATOR.createFromParcel(parcel);
            Video createFromParcel4 = parcel.readInt() == 0 ? null : Video.CREATOR.createFromParcel(parcel);
            String readString10 = parcel.readString();
            String readString11 = parcel.readString();
            String readString12 = parcel.readString();
            Date date = (Date) parcel.readSerializable();
            Date date2 = (Date) parcel.readSerializable();
            Date date3 = (Date) parcel.readSerializable();
            Date date4 = (Date) parcel.readSerializable();
            boolean z19 = false;
            boolean z20 = true;
            if (parcel.readInt() != 0) {
                z10 = false;
                z19 = true;
            } else {
                z10 = false;
            }
            if (parcel.readInt() != 0) {
                z11 = true;
            } else {
                z11 = true;
                z20 = z10;
            }
            if (parcel.readInt() != 0) {
                z12 = z11;
            } else {
                z12 = z11;
                z11 = z10;
            }
            if (parcel.readInt() != 0) {
                z13 = z12;
            } else {
                z13 = z12;
                z12 = z10;
            }
            if (parcel.readInt() != 0) {
                z14 = z13;
            } else {
                z14 = z13;
                z13 = z10;
            }
            if (parcel.readInt() != 0) {
                z15 = z14;
            } else {
                z15 = z14;
                z14 = z10;
            }
            if (parcel.readInt() != 0) {
                z16 = z15;
            } else {
                z16 = z15;
                z15 = z10;
            }
            if (parcel.readInt() != 0) {
                z17 = z16;
            } else {
                z17 = z16;
                z16 = z10;
            }
            if (parcel.readInt() != 0) {
                z18 = z17;
            } else {
                z18 = z17;
                z17 = z10;
            }
            BottleData createFromParcel5 = parcel.readInt() == 0 ? null : BottleData.CREATOR.createFromParcel(parcel);
            String readString13 = parcel.readString();
            Cta createFromParcel6 = parcel.readInt() == 0 ? null : Cta.CREATOR.createFromParcel(parcel);
            boolean z21 = parcel.readInt() != 0 ? z18 : false;
            String readString14 = parcel.readString();
            String readString15 = parcel.readString();
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            ArrayList<String> createStringArrayList3 = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                cta = createFromParcel6;
                hashMap = null;
                bottleData = createFromParcel5;
            } else {
                int readInt = parcel.readInt();
                bottleData = createFromParcel5;
                HashMap hashMap2 = new HashMap(readInt);
                cta = createFromParcel6;
                int i10 = 0;
                while (i10 != readInt) {
                    hashMap2.put(parcel.readString(), parcel.readString());
                    i10++;
                    readInt = readInt;
                }
                hashMap = hashMap2;
            }
            return new Media(readString, createFromParcel, readString2, readString3, readString4, readString5, readString6, readString7, readString8, valueOf, readString9, createStringArrayList, createStringArrayList2, createFromParcel2, createFromParcel3, createFromParcel4, readString10, readString11, readString12, date, date2, date3, date4, z19, z20, z11, z12, z13, z14, z15, z16, z17, bottleData, readString13, cta, z21, readString14, readString15, valueOf2, createStringArrayList3, hashMap);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Media[] newArray(int i10) {
            return new Media[i10];
        }
    }

    public Media(@NotNull String id2, @Nullable MediaType mediaType, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable RatingType ratingType, @Nullable String str8, @Nullable List<String> list, @Nullable List<String> list2, @Nullable User user, @NotNull Images images, @Nullable Video video, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable Date date, @Nullable Date date2, @Nullable Date date3, @Nullable Date date4, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, @Nullable BottleData bottleData, @Nullable String str12, @Nullable Cta cta, boolean z19, @Nullable String str13, @Nullable String str14, @Nullable Integer num, @Nullable List<String> list3, @Nullable HashMap<String, String> hashMap) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(images, "images");
        this.id = id2;
        this.type = mediaType;
        this.slug = str;
        this.url = str2;
        this.bitlyGifUrl = str3;
        this.bitlyUrl = str4;
        this.embedUrl = str5;
        this.source = str6;
        this.title = str7;
        this.rating = ratingType;
        this.contentUrl = str8;
        this.tags = list;
        this.featuredTags = list2;
        this.user = user;
        this.images = images;
        this.video = video;
        this.analyticsResponsePayload = str9;
        this.sourceTld = str10;
        this.sourcePostUrl = str11;
        this.updateDate = date;
        this.createDate = date2;
        this.importDate = date3;
        this.trendingDate = date4;
        this.isHidden = z10;
        this.isRemoved = z11;
        this.isCommunity = z12;
        this.isAnonymous = z13;
        this.isFeatured = z14;
        this.isRealtime = z15;
        this.isIndexable = z16;
        this.isSticker = z17;
        this.isDynamic = z18;
        this.bottleData = bottleData;
        this.animatedTextStyle = str12;
        this.cta = cta;
        this.hasAttributions = z19;
        this.altText = str13;
        this.variation = str14;
        this.variationCount = num;
        this.injectedPixels = list3;
        this.userDictionary = hashMap;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final String getAltText() {
        return this.altText;
    }

    @Override // N8.m
    @Nullable
    public String getAnalyticsResponsePayload() {
        return this.analyticsResponsePayload;
    }

    @Nullable
    public final String getAnimatedTextStyle() {
        return this.animatedTextStyle;
    }

    @Nullable
    public final String getBitlyGifUrl() {
        return this.bitlyGifUrl;
    }

    @Nullable
    public final String getBitlyUrl() {
        return this.bitlyUrl;
    }

    @Nullable
    public final BottleData getBottleData() {
        return this.bottleData;
    }

    @Override // N8.m
    @Nullable
    public List<String> getBottleDataTags() {
        BottleData bottleData = this.bottleData;
        if (bottleData != null) {
            return bottleData.getTags();
        }
        return null;
    }

    @Nullable
    public final String getContentUrl() {
        return this.contentUrl;
    }

    @Nullable
    public final Date getCreateDate() {
        return this.createDate;
    }

    @Nullable
    public final Cta getCta() {
        return this.cta;
    }

    @Nullable
    public final String getEmbedUrl() {
        return this.embedUrl;
    }

    @Override // N8.m
    @Nullable
    public EventType getEventType() {
        String str;
        HashMap<String, String> userDictionary = getUserDictionary();
        if (userDictionary == null || (str = userDictionary.get("gph_etk")) == null) {
            return null;
        }
        return EventType.values()[Integer.parseInt(str)];
    }

    @Nullable
    public final List<String> getFeaturedTags() {
        return this.featuredTags;
    }

    public final boolean getHasAttributions() {
        return this.hasAttributions;
    }

    @Override // N8.m
    @NotNull
    public String getId() {
        return this.id;
    }

    @NotNull
    public final Images getImages() {
        return this.images;
    }

    @Nullable
    public final Date getImportDate() {
        return this.importDate;
    }

    @Override // N8.m
    @Nullable
    public List<String> getInjectedPixels() {
        return this.injectedPixels;
    }

    @Override // N8.m
    @Nullable
    public Integer getPosition() {
        String str;
        HashMap<String, String> userDictionary = getUserDictionary();
        if (userDictionary == null || (str = userDictionary.get("gph_pk")) == null) {
            return null;
        }
        return Integer.valueOf(Integer.parseInt(str));
    }

    @Nullable
    public final RatingType getRating() {
        return this.rating;
    }

    @Override // N8.m
    @Nullable
    public String getResponseId() {
        HashMap<String, String> userDictionary = getUserDictionary();
        if (userDictionary != null) {
            return userDictionary.get("gph_rk");
        }
        return null;
    }

    @Nullable
    public final String getSlug() {
        return this.slug;
    }

    @Nullable
    public final String getSource() {
        return this.source;
    }

    @Nullable
    public final String getSourcePostUrl() {
        return this.sourcePostUrl;
    }

    @Nullable
    public final String getSourceTld() {
        return this.sourceTld;
    }

    @Nullable
    public final List<String> getTags() {
        return this.tags;
    }

    @Override // N8.m
    @Nullable
    public String getTid() {
        BottleData bottleData = this.bottleData;
        if (bottleData == null) {
            return null;
        }
        Intrinsics.checkNotNull(bottleData);
        return bottleData.getTid();
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final Date getTrendingDate() {
        return this.trendingDate;
    }

    @Nullable
    public final MediaType getType() {
        return this.type;
    }

    @Nullable
    public final Date getUpdateDate() {
        return this.updateDate;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    @Nullable
    public final User getUser() {
        return this.user;
    }

    @Nullable
    public HashMap<String, String> getUserDictionary() {
        return this.userDictionary;
    }

    @Nullable
    public final String getVariation() {
        return this.variation;
    }

    @Nullable
    public final Integer getVariationCount() {
        return this.variationCount;
    }

    @Nullable
    public final Video getVideo() {
        return this.video;
    }

    /* renamed from: isAnonymous, reason: from getter */
    public final boolean getIsAnonymous() {
        return this.isAnonymous;
    }

    /* renamed from: isCommunity, reason: from getter */
    public final boolean getIsCommunity() {
        return this.isCommunity;
    }

    /* renamed from: isDynamic, reason: from getter */
    public final boolean getIsDynamic() {
        return this.isDynamic;
    }

    /* renamed from: isFeatured, reason: from getter */
    public final boolean getIsFeatured() {
        return this.isFeatured;
    }

    /* renamed from: isHidden, reason: from getter */
    public final boolean getIsHidden() {
        return this.isHidden;
    }

    /* renamed from: isIndexable, reason: from getter */
    public final boolean getIsIndexable() {
        return this.isIndexable;
    }

    /* renamed from: isRealtime, reason: from getter */
    public final boolean getIsRealtime() {
        return this.isRealtime;
    }

    /* renamed from: isRemoved, reason: from getter */
    public final boolean getIsRemoved() {
        return this.isRemoved;
    }

    /* renamed from: isSticker, reason: from getter */
    public final boolean getIsSticker() {
        return this.isSticker;
    }

    public final void postProcess() {
        this.images.setMediaId(getId());
        this.images.postProcess();
    }

    public final void setAltText(@Nullable String str) {
        this.altText = str;
    }

    public final void setBottleData(@Nullable BottleData bottleData) {
        this.bottleData = bottleData;
    }

    public void setEventType(@Nullable EventType eventType) {
        HashMap<String, String> userDictionary;
        HashMap<String, String> userDictionary2 = getUserDictionary();
        if (userDictionary2 == null) {
            userDictionary2 = new HashMap<>();
        }
        setUserDictionary(userDictionary2);
        if (eventType == null || (userDictionary = getUserDictionary()) == null) {
            return;
        }
        userDictionary.put("gph_etk", String.valueOf(eventType.ordinal()));
    }

    public final void setHasAttributions(boolean z10) {
        this.hasAttributions = z10;
    }

    public void setId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.id = str;
    }

    public final void setImages(@NotNull Images images) {
        Intrinsics.checkNotNullParameter(images, "<set-?>");
        this.images = images;
    }

    public void setInjectedPixels(@Nullable List<String> list) {
        this.injectedPixels = list;
    }

    public void setPosition(@Nullable Integer num) {
        HashMap<String, String> userDictionary = getUserDictionary();
        if (userDictionary == null) {
            userDictionary = new HashMap<>();
        }
        setUserDictionary(userDictionary);
        if (num != null) {
            int intValue = num.intValue();
            HashMap<String, String> userDictionary2 = getUserDictionary();
            if (userDictionary2 != null) {
                userDictionary2.put("gph_pk", String.valueOf(intValue));
            }
        }
    }

    public void setResponseId(@Nullable String str) {
        HashMap<String, String> userDictionary;
        HashMap<String, String> userDictionary2 = getUserDictionary();
        if (userDictionary2 == null) {
            userDictionary2 = new HashMap<>();
        }
        setUserDictionary(userDictionary2);
        if (str == null || (userDictionary = getUserDictionary()) == null) {
            return;
        }
        userDictionary.put("gph_rk", str);
    }

    public final void setType(@Nullable MediaType mediaType) {
        this.type = mediaType;
    }

    public final void setUrl(@Nullable String str) {
        this.url = str;
    }

    public final void setUser(@Nullable User user) {
        this.user = user;
    }

    public void setUserDictionary(@Nullable HashMap<String, String> hashMap) {
        this.userDictionary = hashMap;
    }

    public final void setVariation(@Nullable String str) {
        this.variation = str;
    }

    public final void setVariationCount(@Nullable Integer num) {
        this.variationCount = num;
    }

    public final void setVideo(@Nullable Video video) {
        this.video = video;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.id);
        MediaType mediaType = this.type;
        if (mediaType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            mediaType.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.slug);
        parcel.writeString(this.url);
        parcel.writeString(this.bitlyGifUrl);
        parcel.writeString(this.bitlyUrl);
        parcel.writeString(this.embedUrl);
        parcel.writeString(this.source);
        parcel.writeString(this.title);
        RatingType ratingType = this.rating;
        if (ratingType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(ratingType.name());
        }
        parcel.writeString(this.contentUrl);
        parcel.writeStringList(this.tags);
        parcel.writeStringList(this.featuredTags);
        User user = this.user;
        if (user == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            user.writeToParcel(parcel, flags);
        }
        this.images.writeToParcel(parcel, flags);
        Video video = this.video;
        if (video == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            video.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.analyticsResponsePayload);
        parcel.writeString(this.sourceTld);
        parcel.writeString(this.sourcePostUrl);
        parcel.writeSerializable(this.updateDate);
        parcel.writeSerializable(this.createDate);
        parcel.writeSerializable(this.importDate);
        parcel.writeSerializable(this.trendingDate);
        parcel.writeInt(this.isHidden ? 1 : 0);
        parcel.writeInt(this.isRemoved ? 1 : 0);
        parcel.writeInt(this.isCommunity ? 1 : 0);
        parcel.writeInt(this.isAnonymous ? 1 : 0);
        parcel.writeInt(this.isFeatured ? 1 : 0);
        parcel.writeInt(this.isRealtime ? 1 : 0);
        parcel.writeInt(this.isIndexable ? 1 : 0);
        parcel.writeInt(this.isSticker ? 1 : 0);
        parcel.writeInt(this.isDynamic ? 1 : 0);
        BottleData bottleData = this.bottleData;
        if (bottleData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bottleData.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.animatedTextStyle);
        Cta cta = this.cta;
        if (cta == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cta.writeToParcel(parcel, flags);
        }
        parcel.writeInt(this.hasAttributions ? 1 : 0);
        parcel.writeString(this.altText);
        parcel.writeString(this.variation);
        Integer num = this.variationCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeStringList(this.injectedPixels);
        HashMap<String, String> hashMap = this.userDictionary;
        if (hashMap == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(hashMap.size());
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
    }

    public /* synthetic */ Media(String str, MediaType mediaType, String str2, String str3, String str4, String str5, String str6, String str7, String str8, RatingType ratingType, String str9, List list, List list2, User user, Images images, Video video, String str10, String str11, String str12, Date date, Date date2, Date date3, Date date4, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, BottleData bottleData, String str13, Cta cta, boolean z19, String str14, String str15, Integer num, List list3, HashMap hashMap, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : mediaType, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : str3, (i10 & 16) != 0 ? null : str4, (i10 & 32) != 0 ? null : str5, (i10 & 64) != 0 ? null : str6, (i10 & 128) != 0 ? null : str7, (i10 & 256) != 0 ? null : str8, (i10 & 512) != 0 ? null : ratingType, (i10 & 1024) != 0 ? null : str9, (i10 & 2048) != 0 ? null : list, (i10 & 4096) != 0 ? null : list2, (i10 & 8192) != 0 ? null : user, images, (32768 & i10) != 0 ? null : video, (65536 & i10) != 0 ? null : str10, (131072 & i10) != 0 ? null : str11, (262144 & i10) != 0 ? null : str12, (524288 & i10) != 0 ? null : date, (1048576 & i10) != 0 ? null : date2, (2097152 & i10) != 0 ? null : date3, (4194304 & i10) != 0 ? null : date4, (8388608 & i10) != 0 ? false : z10, (16777216 & i10) != 0 ? false : z11, (33554432 & i10) != 0 ? false : z12, (67108864 & i10) != 0 ? false : z13, (134217728 & i10) != 0 ? false : z14, (268435456 & i10) != 0 ? false : z15, (536870912 & i10) != 0 ? false : z16, (1073741824 & i10) != 0 ? false : z17, (i10 & Integer.MIN_VALUE) != 0 ? false : z18, (i11 & 1) != 0 ? null : bottleData, (i11 & 2) != 0 ? null : str13, (i11 & 4) != 0 ? null : cta, (i11 & 8) != 0 ? false : z19, (i11 & 16) != 0 ? null : str14, (i11 & 32) != 0 ? null : str15, (i11 & 64) != 0 ? null : num, (i11 & 128) != 0 ? null : list3, (i11 & 256) != 0 ? null : hashMap);
    }
}
