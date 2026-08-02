package com.sofascore.local_persistance;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import defpackage.duf;
import defpackage.gc2;
import defpackage.mz1;
import defpackage.wv8;
import defpackage.wx4;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b)\u0018\u0000 H2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001HBÏ\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020\u00072\b\u0010!\u001a\u0004\u0018\u00010 H\u0096\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0003H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\tH\u0016¢\u0006\u0004\b&\u0010'JÕ\u0001\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b(\u0010)R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b+\u0010%R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010.R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b0\u00101R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b3\u0010'R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00104\u001a\u0004\b5\u00106R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00104\u001a\u0004\b7\u00106R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00108\u001a\u0004\b9\u0010:R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010/\u001a\u0004\b;\u00101R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010/\u001a\u0004\b<\u00101R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010/\u001a\u0004\b=\u00101R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010/\u001a\u0004\b>\u00101R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010?\u001a\u0004\b@\u0010AR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010B\u001a\u0004\bC\u0010DR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u00104\u001a\u0004\bE\u00106R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010/\u001a\u0004\bF\u00101R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u00104\u001a\u0004\bG\u00106¨\u0006I"}, d2 = {"Lcom/sofascore/local_persistance/BrandingTeam;", "Lcom/squareup/wire/Message;", "", "", "id", "Lcom/sofascore/local_persistance/Brand;", "brand", "", "banner", "", "url", "bannerHeight", "adUnitHeight", "Lcom/sofascore/local_persistance/ImageDisplayType;", "imageDisplayType", "header", "appHeader", "contentHeader", "background", "Lcom/sofascore/local_persistance/BrandColors;", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "Lcom/sofascore/local_persistance/BrandingBackgroundColors;", "backgroundGradientColor", "oddsProviderId", "takeoverImage", "takeoverImageHeight", "Lgc2;", "unknownFields", "<init>", "(ILcom/sofascore/local_persistance/Brand;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/sofascore/local_persistance/ImageDisplayType;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/sofascore/local_persistance/BrandColors;Lcom/sofascore/local_persistance/BrandingBackgroundColors;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Lgc2;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(ILcom/sofascore/local_persistance/Brand;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/sofascore/local_persistance/ImageDisplayType;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/sofascore/local_persistance/BrandColors;Lcom/sofascore/local_persistance/BrandingBackgroundColors;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Lgc2;)Lcom/sofascore/local_persistance/BrandingTeam;", "I", "getId", "Lcom/sofascore/local_persistance/Brand;", "getBrand", "()Lcom/sofascore/local_persistance/Brand;", "Ljava/lang/Boolean;", "getBanner", "()Ljava/lang/Boolean;", "Ljava/lang/String;", "getUrl", "Ljava/lang/Integer;", "getBannerHeight", "()Ljava/lang/Integer;", "getAdUnitHeight", "Lcom/sofascore/local_persistance/ImageDisplayType;", "getImageDisplayType", "()Lcom/sofascore/local_persistance/ImageDisplayType;", "getHeader", "getAppHeader", "getContentHeader", "getBackground", "Lcom/sofascore/local_persistance/BrandColors;", "getBackgroundColor", "()Lcom/sofascore/local_persistance/BrandColors;", "Lcom/sofascore/local_persistance/BrandingBackgroundColors;", "getBackgroundGradientColor", "()Lcom/sofascore/local_persistance/BrandingBackgroundColors;", "getOddsProviderId", "getTakeoverImage", "getTakeoverImageHeight", "Companion", "localPersistence_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BrandingTeam extends Message {

    @NotNull
    public static final ProtoAdapter<BrandingTeam> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 5, tag = 6)
    @Nullable
    private final Integer adUnitHeight;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 8, tag = 9)
    @Nullable
    private final Boolean appHeader;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 10, tag = 11)
    @Nullable
    private final Boolean background;

    @WireField(adapter = "com.sofascore.local_persistance.BrandColors#ADAPTER", schemaIndex = 11, tag = 12)
    @Nullable
    private final BrandColors backgroundColor;

    @WireField(adapter = "com.sofascore.local_persistance.BrandingBackgroundColors#ADAPTER", schemaIndex = 12, tag = 13)
    @Nullable
    private final BrandingBackgroundColors backgroundGradientColor;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 2, tag = 3)
    @Nullable
    private final Boolean banner;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 4, tag = 5)
    @Nullable
    private final Integer bannerHeight;

    @WireField(adapter = "com.sofascore.local_persistance.Brand#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    @Nullable
    private final Brand brand;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 9, tag = 10)
    @Nullable
    private final Boolean contentHeader;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 7, tag = 8)
    @Nullable
    private final Boolean header;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final int id;

    @WireField(adapter = "com.sofascore.local_persistance.ImageDisplayType#ADAPTER", schemaIndex = 6, tag = 7)
    @Nullable
    private final ImageDisplayType imageDisplayType;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 13, tag = 14)
    @Nullable
    private final Integer oddsProviderId;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 14, tag = 15)
    @Nullable
    private final Boolean takeoverImage;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 15, tag = 16)
    @Nullable
    private final Integer takeoverImageHeight;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    @Nullable
    private final String url;

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(BrandingTeam.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<BrandingTeam>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.sofascore.local_persistance.BrandingTeam$Companion$ADAPTER$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public BrandingTeam decode(ProtoReader reader) {
                Boolean bool;
                int i;
                String str;
                Brand decode;
                reader.getClass();
                long beginMessage = reader.beginMessage();
                int i2 = 0;
                Brand brand = null;
                Boolean bool2 = null;
                String str2 = null;
                Integer num = null;
                Integer num2 = null;
                ImageDisplayType imageDisplayType = null;
                Boolean bool3 = null;
                Boolean bool4 = null;
                Boolean bool5 = null;
                Boolean bool6 = null;
                BrandColors brandColors = null;
                BrandingBackgroundColors brandingBackgroundColors = null;
                Integer num3 = null;
                Boolean bool7 = null;
                Integer num4 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new BrandingTeam(i2, brand, bool2, str2, num, num2, imageDisplayType, bool3, bool4, bool5, bool6, brandColors, brandingBackgroundColors, num3, bool7, num4, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            i2 = ProtoAdapter.INT32.decode(reader).intValue();
                            decode = brand;
                            break;
                        case 2:
                            decode = Brand.ADAPTER.decode(reader);
                            break;
                        case 3:
                            bool2 = ProtoAdapter.BOOL.decode(reader);
                            decode = brand;
                            break;
                        case 4:
                            str2 = ProtoAdapter.STRING.decode(reader);
                            decode = brand;
                            break;
                        case 5:
                            num = ProtoAdapter.INT32.decode(reader);
                            decode = brand;
                            break;
                        case 6:
                            num2 = ProtoAdapter.INT32.decode(reader);
                            decode = brand;
                            break;
                        case 7:
                            try {
                                imageDisplayType = ImageDisplayType.ADAPTER.decode(reader);
                                decode = brand;
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                bool = bool2;
                                i = i2;
                                str = str2;
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                break;
                            }
                        case 8:
                            bool3 = ProtoAdapter.BOOL.decode(reader);
                            decode = brand;
                            break;
                        case 9:
                            bool4 = ProtoAdapter.BOOL.decode(reader);
                            decode = brand;
                            break;
                        case 10:
                            bool5 = ProtoAdapter.BOOL.decode(reader);
                            decode = brand;
                            break;
                        case 11:
                            bool6 = ProtoAdapter.BOOL.decode(reader);
                            decode = brand;
                            break;
                        case 12:
                            brandColors = BrandColors.ADAPTER.decode(reader);
                            decode = brand;
                            break;
                        case 13:
                            brandingBackgroundColors = BrandingBackgroundColors.ADAPTER.decode(reader);
                            decode = brand;
                            break;
                        case 14:
                            num3 = ProtoAdapter.INT32.decode(reader);
                            decode = brand;
                            break;
                        case 15:
                            bool7 = ProtoAdapter.BOOL.decode(reader);
                            decode = brand;
                            break;
                        case 16:
                            num4 = ProtoAdapter.INT32.decode(reader);
                            decode = brand;
                            break;
                        default:
                            reader.readUnknownField(nextTag);
                            bool = bool2;
                            i = i2;
                            str = str2;
                            decode = brand;
                            bool2 = bool;
                            i2 = i;
                            str2 = str;
                            break;
                    }
                    brand = decode;
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, BrandingTeam value) {
                writer.getClass();
                value.getClass();
                if (value.getId() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 1, (int) Integer.valueOf(value.getId()));
                }
                if (value.getBrand() != null) {
                    Brand.ADAPTER.encodeWithTag(writer, 2, (int) value.getBrand());
                }
                ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
                protoAdapter.encodeWithTag(writer, 3, (int) value.getBanner());
                ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getUrl());
                ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
                protoAdapter2.encodeWithTag(writer, 5, (int) value.getBannerHeight());
                protoAdapter2.encodeWithTag(writer, 6, (int) value.getAdUnitHeight());
                ImageDisplayType.ADAPTER.encodeWithTag(writer, 7, (int) value.getImageDisplayType());
                protoAdapter.encodeWithTag(writer, 8, (int) value.getHeader());
                protoAdapter.encodeWithTag(writer, 9, (int) value.getAppHeader());
                protoAdapter.encodeWithTag(writer, 10, (int) value.getContentHeader());
                protoAdapter.encodeWithTag(writer, 11, (int) value.getBackground());
                BrandColors.ADAPTER.encodeWithTag(writer, 12, (int) value.getBackgroundColor());
                BrandingBackgroundColors.ADAPTER.encodeWithTag(writer, 13, (int) value.getBackgroundGradientColor());
                protoAdapter2.encodeWithTag(writer, 14, (int) value.getOddsProviderId());
                protoAdapter.encodeWithTag(writer, 15, (int) value.getTakeoverImage());
                protoAdapter2.encodeWithTag(writer, 16, (int) value.getTakeoverImageHeight());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(BrandingTeam value) {
                value.getClass();
                int h = value.unknownFields().h();
                if (value.getId() != 0) {
                    h += ProtoAdapter.INT32.encodedSizeWithTag(1, Integer.valueOf(value.getId()));
                }
                if (value.getBrand() != null) {
                    h += Brand.ADAPTER.encodedSizeWithTag(2, value.getBrand());
                }
                ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
                int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(4, value.getUrl()) + protoAdapter.encodedSizeWithTag(3, value.getBanner()) + h;
                ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
                return protoAdapter2.encodedSizeWithTag(16, value.getTakeoverImageHeight()) + protoAdapter.encodedSizeWithTag(15, value.getTakeoverImage()) + protoAdapter2.encodedSizeWithTag(14, value.getOddsProviderId()) + BrandingBackgroundColors.ADAPTER.encodedSizeWithTag(13, value.getBackgroundGradientColor()) + BrandColors.ADAPTER.encodedSizeWithTag(12, value.getBackgroundColor()) + protoAdapter.encodedSizeWithTag(11, value.getBackground()) + protoAdapter.encodedSizeWithTag(10, value.getContentHeader()) + protoAdapter.encodedSizeWithTag(9, value.getAppHeader()) + protoAdapter.encodedSizeWithTag(8, value.getHeader()) + ImageDisplayType.ADAPTER.encodedSizeWithTag(7, value.getImageDisplayType()) + protoAdapter2.encodedSizeWithTag(6, value.getAdUnitHeight()) + protoAdapter2.encodedSizeWithTag(5, value.getBannerHeight()) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public BrandingTeam redact(BrandingTeam value) {
                BrandingTeam copy;
                value.getClass();
                Brand brand = value.getBrand();
                Brand redact = brand != null ? Brand.ADAPTER.redact(brand) : null;
                BrandColors backgroundColor = value.getBackgroundColor();
                BrandColors redact2 = backgroundColor != null ? BrandColors.ADAPTER.redact(backgroundColor) : null;
                BrandingBackgroundColors backgroundGradientColor = value.getBackgroundGradientColor();
                copy = value.copy((r35 & 1) != 0 ? value.id : 0, (r35 & 2) != 0 ? value.brand : redact, (r35 & 4) != 0 ? value.banner : null, (r35 & 8) != 0 ? value.url : null, (r35 & 16) != 0 ? value.bannerHeight : null, (r35 & 32) != 0 ? value.adUnitHeight : null, (r35 & 64) != 0 ? value.imageDisplayType : null, (r35 & 128) != 0 ? value.header : null, (r35 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? value.appHeader : null, (r35 & 512) != 0 ? value.contentHeader : null, (r35 & 1024) != 0 ? value.background : null, (r35 & a.o) != 0 ? value.backgroundColor : redact2, (r35 & 4096) != 0 ? value.backgroundGradientColor : backgroundGradientColor != null ? BrandingBackgroundColors.ADAPTER.redact(backgroundGradientColor) : null, (r35 & 8192) != 0 ? value.oddsProviderId : null, (r35 & 16384) != 0 ? value.takeoverImage : null, (r35 & 32768) != 0 ? value.takeoverImageHeight : null, (r35 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? value.unknownFields() : gc2.d);
                return copy;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, BrandingTeam value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
                protoAdapter.encodeWithTag(writer, 16, (int) value.getTakeoverImageHeight());
                ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
                protoAdapter2.encodeWithTag(writer, 15, (int) value.getTakeoverImage());
                protoAdapter.encodeWithTag(writer, 14, (int) value.getOddsProviderId());
                BrandingBackgroundColors.ADAPTER.encodeWithTag(writer, 13, (int) value.getBackgroundGradientColor());
                BrandColors.ADAPTER.encodeWithTag(writer, 12, (int) value.getBackgroundColor());
                protoAdapter2.encodeWithTag(writer, 11, (int) value.getBackground());
                protoAdapter2.encodeWithTag(writer, 10, (int) value.getContentHeader());
                protoAdapter2.encodeWithTag(writer, 9, (int) value.getAppHeader());
                protoAdapter2.encodeWithTag(writer, 8, (int) value.getHeader());
                ImageDisplayType.ADAPTER.encodeWithTag(writer, 7, (int) value.getImageDisplayType());
                protoAdapter.encodeWithTag(writer, 6, (int) value.getAdUnitHeight());
                protoAdapter.encodeWithTag(writer, 5, (int) value.getBannerHeight());
                ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getUrl());
                protoAdapter2.encodeWithTag(writer, 3, (int) value.getBanner());
                if (value.getBrand() != null) {
                    Brand.ADAPTER.encodeWithTag(writer, 2, (int) value.getBrand());
                }
                if (value.getId() != 0) {
                    protoAdapter.encodeWithTag(writer, 1, (int) Integer.valueOf(value.getId()));
                }
            }
        };
    }

    public /* synthetic */ BrandingTeam(int i, Brand brand, Boolean bool, String str, Integer num, Integer num2, ImageDisplayType imageDisplayType, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, BrandColors brandColors, BrandingBackgroundColors brandingBackgroundColors, Integer num3, Boolean bool6, Integer num4, gc2 gc2Var, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : brand, (i2 & 4) != 0 ? null : bool, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? null : num, (i2 & 32) != 0 ? null : num2, (i2 & 64) != 0 ? null : imageDisplayType, (i2 & 128) != 0 ? null : bool2, (i2 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : bool3, (i2 & 512) != 0 ? null : bool4, (i2 & 1024) != 0 ? null : bool5, (i2 & a.o) != 0 ? null : brandColors, (i2 & 4096) != 0 ? null : brandingBackgroundColors, (i2 & 8192) != 0 ? null : num3, (i2 & 16384) != 0 ? null : bool6, (i2 & 32768) != 0 ? null : num4, (i2 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? gc2.d : gc2Var);
    }

    @NotNull
    public final BrandingTeam copy(int id, @Nullable Brand brand, @Nullable Boolean banner, @Nullable String url, @Nullable Integer bannerHeight, @Nullable Integer adUnitHeight, @Nullable ImageDisplayType imageDisplayType, @Nullable Boolean header, @Nullable Boolean appHeader, @Nullable Boolean contentHeader, @Nullable Boolean background, @Nullable BrandColors backgroundColor, @Nullable BrandingBackgroundColors backgroundGradientColor, @Nullable Integer oddsProviderId, @Nullable Boolean takeoverImage, @Nullable Integer takeoverImageHeight, @NotNull gc2 unknownFields) {
        unknownFields.getClass();
        return new BrandingTeam(id, brand, banner, url, bannerHeight, adUnitHeight, imageDisplayType, header, appHeader, contentHeader, background, backgroundColor, backgroundGradientColor, oddsProviderId, takeoverImage, takeoverImageHeight, unknownFields);
    }

    public boolean equals(@Nullable Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof BrandingTeam)) {
            return false;
        }
        BrandingTeam brandingTeam = (BrandingTeam) other;
        return Intrinsics.c(unknownFields(), brandingTeam.unknownFields()) && this.id == brandingTeam.id && Intrinsics.c(this.brand, brandingTeam.brand) && Intrinsics.c(this.banner, brandingTeam.banner) && Intrinsics.c(this.url, brandingTeam.url) && Intrinsics.c(this.bannerHeight, brandingTeam.bannerHeight) && Intrinsics.c(this.adUnitHeight, brandingTeam.adUnitHeight) && this.imageDisplayType == brandingTeam.imageDisplayType && Intrinsics.c(this.header, brandingTeam.header) && Intrinsics.c(this.appHeader, brandingTeam.appHeader) && Intrinsics.c(this.contentHeader, brandingTeam.contentHeader) && Intrinsics.c(this.background, brandingTeam.background) && Intrinsics.c(this.backgroundColor, brandingTeam.backgroundColor) && Intrinsics.c(this.backgroundGradientColor, brandingTeam.backgroundGradientColor) && Intrinsics.c(this.oddsProviderId, brandingTeam.oddsProviderId) && Intrinsics.c(this.takeoverImage, brandingTeam.takeoverImage) && Intrinsics.c(this.takeoverImageHeight, brandingTeam.takeoverImageHeight);
    }

    @Nullable
    public final Integer getAdUnitHeight() {
        return this.adUnitHeight;
    }

    @Nullable
    public final Boolean getAppHeader() {
        return this.appHeader;
    }

    @Nullable
    public final Boolean getBackground() {
        return this.background;
    }

    @Nullable
    public final BrandColors getBackgroundColor() {
        return this.backgroundColor;
    }

    @Nullable
    public final BrandingBackgroundColors getBackgroundGradientColor() {
        return this.backgroundGradientColor;
    }

    @Nullable
    public final Boolean getBanner() {
        return this.banner;
    }

    @Nullable
    public final Integer getBannerHeight() {
        return this.bannerHeight;
    }

    @Nullable
    public final Brand getBrand() {
        return this.brand;
    }

    @Nullable
    public final Boolean getContentHeader() {
        return this.contentHeader;
    }

    @Nullable
    public final Boolean getHeader() {
        return this.header;
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final ImageDisplayType getImageDisplayType() {
        return this.imageDisplayType;
    }

    @Nullable
    public final Integer getOddsProviderId() {
        return this.oddsProviderId;
    }

    @Nullable
    public final Boolean getTakeoverImage() {
        return this.takeoverImage;
    }

    @Nullable
    public final Integer getTakeoverImageHeight() {
        return this.takeoverImageHeight;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int a = wv8.a(this.id, unknownFields().hashCode() * 37, 37);
        Brand brand = this.brand;
        int hashCode = (a + (brand != null ? brand.hashCode() : 0)) * 37;
        Boolean bool = this.banner;
        int hashCode2 = (hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        String str = this.url;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        Integer num = this.bannerHeight;
        int hashCode4 = (hashCode3 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        Integer num2 = this.adUnitHeight;
        int hashCode5 = (hashCode4 + (num2 != null ? Integer.hashCode(num2.intValue()) : 0)) * 37;
        ImageDisplayType imageDisplayType = this.imageDisplayType;
        int hashCode6 = (hashCode5 + (imageDisplayType != null ? imageDisplayType.hashCode() : 0)) * 37;
        Boolean bool2 = this.header;
        int hashCode7 = (hashCode6 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
        Boolean bool3 = this.appHeader;
        int hashCode8 = (hashCode7 + (bool3 != null ? Boolean.hashCode(bool3.booleanValue()) : 0)) * 37;
        Boolean bool4 = this.contentHeader;
        int hashCode9 = (hashCode8 + (bool4 != null ? Boolean.hashCode(bool4.booleanValue()) : 0)) * 37;
        Boolean bool5 = this.background;
        int hashCode10 = (hashCode9 + (bool5 != null ? Boolean.hashCode(bool5.booleanValue()) : 0)) * 37;
        BrandColors brandColors = this.backgroundColor;
        int hashCode11 = (hashCode10 + (brandColors != null ? brandColors.hashCode() : 0)) * 37;
        BrandingBackgroundColors brandingBackgroundColors = this.backgroundGradientColor;
        int hashCode12 = (hashCode11 + (brandingBackgroundColors != null ? brandingBackgroundColors.hashCode() : 0)) * 37;
        Integer num3 = this.oddsProviderId;
        int hashCode13 = (hashCode12 + (num3 != null ? Integer.hashCode(num3.intValue()) : 0)) * 37;
        Boolean bool6 = this.takeoverImage;
        int hashCode14 = (hashCode13 + (bool6 != null ? Boolean.hashCode(bool6.booleanValue()) : 0)) * 37;
        Integer num4 = this.takeoverImageHeight;
        int hashCode15 = hashCode14 + (num4 != null ? Integer.hashCode(num4.intValue()) : 0);
        this.hashCode = hashCode15;
        return hashCode15;
    }

    @wx4
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m685newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    @Override // com.squareup.wire.Message
    @NotNull
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + this.id);
        Brand brand = this.brand;
        if (brand != null) {
            arrayList.add("brand=" + brand);
        }
        Boolean bool = this.banner;
        if (bool != null) {
            mz1.y("banner=", bool, arrayList);
        }
        String str = this.url;
        if (str != null) {
            mz1.A(arrayList, "url=", Internal.sanitize(str));
        }
        Integer num = this.bannerHeight;
        if (num != null) {
            arrayList.add("bannerHeight=" + num);
        }
        Integer num2 = this.adUnitHeight;
        if (num2 != null) {
            arrayList.add("adUnitHeight=" + num2);
        }
        ImageDisplayType imageDisplayType = this.imageDisplayType;
        if (imageDisplayType != null) {
            arrayList.add("imageDisplayType=" + imageDisplayType);
        }
        Boolean bool2 = this.header;
        if (bool2 != null) {
            mz1.y("header=", bool2, arrayList);
        }
        Boolean bool3 = this.appHeader;
        if (bool3 != null) {
            mz1.y("appHeader=", bool3, arrayList);
        }
        Boolean bool4 = this.contentHeader;
        if (bool4 != null) {
            mz1.y("contentHeader=", bool4, arrayList);
        }
        Boolean bool5 = this.background;
        if (bool5 != null) {
            mz1.y("background=", bool5, arrayList);
        }
        BrandColors brandColors = this.backgroundColor;
        if (brandColors != null) {
            arrayList.add("backgroundColor=" + brandColors);
        }
        BrandingBackgroundColors brandingBackgroundColors = this.backgroundGradientColor;
        if (brandingBackgroundColors != null) {
            arrayList.add("backgroundGradientColor=" + brandingBackgroundColors);
        }
        Integer num3 = this.oddsProviderId;
        if (num3 != null) {
            arrayList.add("oddsProviderId=" + num3);
        }
        Boolean bool6 = this.takeoverImage;
        if (bool6 != null) {
            mz1.y("takeoverImage=", bool6, arrayList);
        }
        Integer num4 = this.takeoverImageHeight;
        if (num4 != null) {
            arrayList.add("takeoverImageHeight=" + num4);
        }
        return CollectionsKt.f0(arrayList, ", ", "BrandingTeam{", "}", null, 56);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m685newBuilder();
    }

    public BrandingTeam() {
        this(0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrandingTeam(int i, @Nullable Brand brand, @Nullable Boolean bool, @Nullable String str, @Nullable Integer num, @Nullable Integer num2, @Nullable ImageDisplayType imageDisplayType, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable Boolean bool5, @Nullable BrandColors brandColors, @Nullable BrandingBackgroundColors brandingBackgroundColors, @Nullable Integer num3, @Nullable Boolean bool6, @Nullable Integer num4, @NotNull gc2 gc2Var) {
        super(ADAPTER, gc2Var);
        gc2Var.getClass();
        this.id = i;
        this.brand = brand;
        this.banner = bool;
        this.url = str;
        this.bannerHeight = num;
        this.adUnitHeight = num2;
        this.imageDisplayType = imageDisplayType;
        this.header = bool2;
        this.appHeader = bool3;
        this.contentHeader = bool4;
        this.background = bool5;
        this.backgroundColor = brandColors;
        this.backgroundGradientColor = brandingBackgroundColors;
        this.oddsProviderId = num3;
        this.takeoverImage = bool6;
        this.takeoverImageHeight = num4;
    }
}
