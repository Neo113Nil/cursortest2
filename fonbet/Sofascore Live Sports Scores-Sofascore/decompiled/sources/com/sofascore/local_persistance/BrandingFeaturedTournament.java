package com.sofascore.local_persistance;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
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
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b \u0018\u0000 82\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00018B\u0093\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0099\u0001\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010\u001eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b)\u0010*R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b,\u0010-R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b.\u0010-R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b/\u0010*R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010+\u001a\u0004\b0\u0010-R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010+\u001a\u0004\b1\u0010-R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00102\u001a\u0004\b3\u00104R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00102\u001a\u0004\b5\u00104R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u00106\u001a\u0004\b7\u0010 ¨\u00069"}, d2 = {"Lcom/sofascore/local_persistance/BrandingFeaturedTournament;", "Lcom/squareup/wire/Message;", "", "", "id", "Lcom/sofascore/local_persistance/Brand;", "brand", "Lcom/sofascore/local_persistance/ImageDisplayType;", "upperImageDisplayType", "upperBannerHeight", "upperAdUnitHeight", "lowerImageDisplayType", "lowerBannerHeight", "lowerAdUnitHeight", "", "playerOfTheMatch", "timerImage", "", "url", "Lgc2;", "unknownFields", "<init>", "(ILcom/sofascore/local_persistance/Brand;Lcom/sofascore/local_persistance/ImageDisplayType;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/sofascore/local_persistance/ImageDisplayType;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lgc2;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(ILcom/sofascore/local_persistance/Brand;Lcom/sofascore/local_persistance/ImageDisplayType;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/sofascore/local_persistance/ImageDisplayType;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lgc2;)Lcom/sofascore/local_persistance/BrandingFeaturedTournament;", "I", "getId", "Lcom/sofascore/local_persistance/Brand;", "getBrand", "()Lcom/sofascore/local_persistance/Brand;", "Lcom/sofascore/local_persistance/ImageDisplayType;", "getUpperImageDisplayType", "()Lcom/sofascore/local_persistance/ImageDisplayType;", "Ljava/lang/Integer;", "getUpperBannerHeight", "()Ljava/lang/Integer;", "getUpperAdUnitHeight", "getLowerImageDisplayType", "getLowerBannerHeight", "getLowerAdUnitHeight", "Ljava/lang/Boolean;", "getPlayerOfTheMatch", "()Ljava/lang/Boolean;", "getTimerImage", "Ljava/lang/String;", "getUrl", "Companion", "localPersistence_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BrandingFeaturedTournament extends Message {

    @NotNull
    public static final ProtoAdapter<BrandingFeaturedTournament> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.sofascore.local_persistance.Brand#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    @Nullable
    private final Brand brand;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final int id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 7, tag = 8)
    @Nullable
    private final Integer lowerAdUnitHeight;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 6, tag = 7)
    @Nullable
    private final Integer lowerBannerHeight;

    @WireField(adapter = "com.sofascore.local_persistance.ImageDisplayType#ADAPTER", schemaIndex = 5, tag = 6)
    @Nullable
    private final ImageDisplayType lowerImageDisplayType;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 8, tag = 9)
    @Nullable
    private final Boolean playerOfTheMatch;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 9, tag = 10)
    @Nullable
    private final Boolean timerImage;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 4, tag = 5)
    @Nullable
    private final Integer upperAdUnitHeight;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 3, tag = 4)
    @Nullable
    private final Integer upperBannerHeight;

    @WireField(adapter = "com.sofascore.local_persistance.ImageDisplayType#ADAPTER", schemaIndex = 2, tag = 3)
    @Nullable
    private final ImageDisplayType upperImageDisplayType;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 10, tag = 11)
    @Nullable
    private final String url;

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(BrandingFeaturedTournament.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<BrandingFeaturedTournament>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.sofascore.local_persistance.BrandingFeaturedTournament$Companion$ADAPTER$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public BrandingFeaturedTournament decode(ProtoReader reader) {
                Brand brand;
                ImageDisplayType imageDisplayType;
                int i;
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Brand brand2 = null;
                int i2 = 0;
                ImageDisplayType imageDisplayType2 = null;
                Integer num = null;
                Integer num2 = null;
                ImageDisplayType imageDisplayType3 = null;
                Integer num3 = null;
                Integer num4 = null;
                Boolean bool = null;
                Boolean bool2 = null;
                String str = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new BrandingFeaturedTournament(i2, brand2, imageDisplayType2, num, num2, imageDisplayType3, num3, num4, bool, bool2, str, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            i2 = ProtoAdapter.INT32.decode(reader).intValue();
                            continue;
                        case 2:
                            brand2 = Brand.ADAPTER.decode(reader);
                            continue;
                        case 3:
                            brand = brand2;
                            imageDisplayType = imageDisplayType2;
                            i = i2;
                            try {
                                brand2 = brand;
                                imageDisplayType2 = ImageDisplayType.ADAPTER.decode(reader);
                                i2 = i;
                                continue;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                break;
                            }
                        case 4:
                            num = ProtoAdapter.INT32.decode(reader);
                            continue;
                        case 5:
                            num2 = ProtoAdapter.INT32.decode(reader);
                            continue;
                        case 6:
                            try {
                                imageDisplayType3 = ImageDisplayType.ADAPTER.decode(reader);
                                continue;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                brand = brand2;
                                imageDisplayType = imageDisplayType2;
                                i = i2;
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                break;
                            }
                        case 7:
                            num3 = ProtoAdapter.INT32.decode(reader);
                            continue;
                        case 8:
                            num4 = ProtoAdapter.INT32.decode(reader);
                            continue;
                        case 9:
                            bool = ProtoAdapter.BOOL.decode(reader);
                            continue;
                        case 10:
                            bool2 = ProtoAdapter.BOOL.decode(reader);
                            continue;
                        case 11:
                            str = ProtoAdapter.STRING.decode(reader);
                            continue;
                        default:
                            reader.readUnknownField(nextTag);
                            brand = brand2;
                            imageDisplayType = imageDisplayType2;
                            i = i2;
                            break;
                    }
                    brand2 = brand;
                    i2 = i;
                    imageDisplayType2 = imageDisplayType;
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, BrandingFeaturedTournament value) {
                writer.getClass();
                value.getClass();
                if (value.getId() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 1, (int) Integer.valueOf(value.getId()));
                }
                if (value.getBrand() != null) {
                    Brand.ADAPTER.encodeWithTag(writer, 2, (int) value.getBrand());
                }
                ProtoAdapter<ImageDisplayType> protoAdapter = ImageDisplayType.ADAPTER;
                protoAdapter.encodeWithTag(writer, 3, (int) value.getUpperImageDisplayType());
                ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
                protoAdapter2.encodeWithTag(writer, 4, (int) value.getUpperBannerHeight());
                protoAdapter2.encodeWithTag(writer, 5, (int) value.getUpperAdUnitHeight());
                protoAdapter.encodeWithTag(writer, 6, (int) value.getLowerImageDisplayType());
                protoAdapter2.encodeWithTag(writer, 7, (int) value.getLowerBannerHeight());
                protoAdapter2.encodeWithTag(writer, 8, (int) value.getLowerAdUnitHeight());
                ProtoAdapter<Boolean> protoAdapter3 = ProtoAdapter.BOOL;
                protoAdapter3.encodeWithTag(writer, 9, (int) value.getPlayerOfTheMatch());
                protoAdapter3.encodeWithTag(writer, 10, (int) value.getTimerImage());
                ProtoAdapter.STRING.encodeWithTag(writer, 11, (int) value.getUrl());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(BrandingFeaturedTournament value) {
                value.getClass();
                int h = value.unknownFields().h();
                if (value.getId() != 0) {
                    h += ProtoAdapter.INT32.encodedSizeWithTag(1, Integer.valueOf(value.getId()));
                }
                if (value.getBrand() != null) {
                    h += Brand.ADAPTER.encodedSizeWithTag(2, value.getBrand());
                }
                ProtoAdapter<ImageDisplayType> protoAdapter = ImageDisplayType.ADAPTER;
                int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(3, value.getUpperImageDisplayType()) + h;
                ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
                int encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(8, value.getLowerAdUnitHeight()) + protoAdapter2.encodedSizeWithTag(7, value.getLowerBannerHeight()) + protoAdapter.encodedSizeWithTag(6, value.getLowerImageDisplayType()) + protoAdapter2.encodedSizeWithTag(5, value.getUpperAdUnitHeight()) + protoAdapter2.encodedSizeWithTag(4, value.getUpperBannerHeight()) + encodedSizeWithTag;
                ProtoAdapter<Boolean> protoAdapter3 = ProtoAdapter.BOOL;
                return ProtoAdapter.STRING.encodedSizeWithTag(11, value.getUrl()) + protoAdapter3.encodedSizeWithTag(10, value.getTimerImage()) + protoAdapter3.encodedSizeWithTag(9, value.getPlayerOfTheMatch()) + encodedSizeWithTag2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public BrandingFeaturedTournament redact(BrandingFeaturedTournament value) {
                value.getClass();
                Brand brand = value.getBrand();
                return BrandingFeaturedTournament.copy$default(value, 0, brand != null ? Brand.ADAPTER.redact(brand) : null, null, null, null, null, null, null, null, null, null, gc2.d, 2045, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, BrandingFeaturedTournament value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter.STRING.encodeWithTag(writer, 11, (int) value.getUrl());
                ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
                protoAdapter.encodeWithTag(writer, 10, (int) value.getTimerImage());
                protoAdapter.encodeWithTag(writer, 9, (int) value.getPlayerOfTheMatch());
                ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
                protoAdapter2.encodeWithTag(writer, 8, (int) value.getLowerAdUnitHeight());
                protoAdapter2.encodeWithTag(writer, 7, (int) value.getLowerBannerHeight());
                ProtoAdapter<ImageDisplayType> protoAdapter3 = ImageDisplayType.ADAPTER;
                protoAdapter3.encodeWithTag(writer, 6, (int) value.getLowerImageDisplayType());
                protoAdapter2.encodeWithTag(writer, 5, (int) value.getUpperAdUnitHeight());
                protoAdapter2.encodeWithTag(writer, 4, (int) value.getUpperBannerHeight());
                protoAdapter3.encodeWithTag(writer, 3, (int) value.getUpperImageDisplayType());
                if (value.getBrand() != null) {
                    Brand.ADAPTER.encodeWithTag(writer, 2, (int) value.getBrand());
                }
                if (value.getId() != 0) {
                    protoAdapter2.encodeWithTag(writer, 1, (int) Integer.valueOf(value.getId()));
                }
            }
        };
    }

    public /* synthetic */ BrandingFeaturedTournament(int i, Brand brand, ImageDisplayType imageDisplayType, Integer num, Integer num2, ImageDisplayType imageDisplayType2, Integer num3, Integer num4, Boolean bool, Boolean bool2, String str, gc2 gc2Var, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : brand, (i2 & 4) != 0 ? null : imageDisplayType, (i2 & 8) != 0 ? null : num, (i2 & 16) != 0 ? null : num2, (i2 & 32) != 0 ? null : imageDisplayType2, (i2 & 64) != 0 ? null : num3, (i2 & 128) != 0 ? null : num4, (i2 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : bool, (i2 & 512) != 0 ? null : bool2, (i2 & 1024) != 0 ? null : str, (i2 & a.o) != 0 ? gc2.d : gc2Var);
    }

    public static /* synthetic */ BrandingFeaturedTournament copy$default(BrandingFeaturedTournament brandingFeaturedTournament, int i, Brand brand, ImageDisplayType imageDisplayType, Integer num, Integer num2, ImageDisplayType imageDisplayType2, Integer num3, Integer num4, Boolean bool, Boolean bool2, String str, gc2 gc2Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = brandingFeaturedTournament.id;
        }
        if ((i2 & 2) != 0) {
            brand = brandingFeaturedTournament.brand;
        }
        if ((i2 & 4) != 0) {
            imageDisplayType = brandingFeaturedTournament.upperImageDisplayType;
        }
        if ((i2 & 8) != 0) {
            num = brandingFeaturedTournament.upperBannerHeight;
        }
        if ((i2 & 16) != 0) {
            num2 = brandingFeaturedTournament.upperAdUnitHeight;
        }
        if ((i2 & 32) != 0) {
            imageDisplayType2 = brandingFeaturedTournament.lowerImageDisplayType;
        }
        if ((i2 & 64) != 0) {
            num3 = brandingFeaturedTournament.lowerBannerHeight;
        }
        if ((i2 & 128) != 0) {
            num4 = brandingFeaturedTournament.lowerAdUnitHeight;
        }
        if ((i2 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            bool = brandingFeaturedTournament.playerOfTheMatch;
        }
        if ((i2 & 512) != 0) {
            bool2 = brandingFeaturedTournament.timerImage;
        }
        if ((i2 & 1024) != 0) {
            str = brandingFeaturedTournament.url;
        }
        if ((i2 & a.o) != 0) {
            gc2Var = brandingFeaturedTournament.unknownFields();
        }
        String str2 = str;
        gc2 gc2Var2 = gc2Var;
        Boolean bool3 = bool;
        Boolean bool4 = bool2;
        Integer num5 = num3;
        Integer num6 = num4;
        Integer num7 = num2;
        ImageDisplayType imageDisplayType3 = imageDisplayType2;
        return brandingFeaturedTournament.copy(i, brand, imageDisplayType, num, num7, imageDisplayType3, num5, num6, bool3, bool4, str2, gc2Var2);
    }

    @NotNull
    public final BrandingFeaturedTournament copy(int id, @Nullable Brand brand, @Nullable ImageDisplayType upperImageDisplayType, @Nullable Integer upperBannerHeight, @Nullable Integer upperAdUnitHeight, @Nullable ImageDisplayType lowerImageDisplayType, @Nullable Integer lowerBannerHeight, @Nullable Integer lowerAdUnitHeight, @Nullable Boolean playerOfTheMatch, @Nullable Boolean timerImage, @Nullable String url, @NotNull gc2 unknownFields) {
        unknownFields.getClass();
        return new BrandingFeaturedTournament(id, brand, upperImageDisplayType, upperBannerHeight, upperAdUnitHeight, lowerImageDisplayType, lowerBannerHeight, lowerAdUnitHeight, playerOfTheMatch, timerImage, url, unknownFields);
    }

    public boolean equals(@Nullable Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof BrandingFeaturedTournament)) {
            return false;
        }
        BrandingFeaturedTournament brandingFeaturedTournament = (BrandingFeaturedTournament) other;
        return Intrinsics.c(unknownFields(), brandingFeaturedTournament.unknownFields()) && this.id == brandingFeaturedTournament.id && Intrinsics.c(this.brand, brandingFeaturedTournament.brand) && this.upperImageDisplayType == brandingFeaturedTournament.upperImageDisplayType && Intrinsics.c(this.upperBannerHeight, brandingFeaturedTournament.upperBannerHeight) && Intrinsics.c(this.upperAdUnitHeight, brandingFeaturedTournament.upperAdUnitHeight) && this.lowerImageDisplayType == brandingFeaturedTournament.lowerImageDisplayType && Intrinsics.c(this.lowerBannerHeight, brandingFeaturedTournament.lowerBannerHeight) && Intrinsics.c(this.lowerAdUnitHeight, brandingFeaturedTournament.lowerAdUnitHeight) && Intrinsics.c(this.playerOfTheMatch, brandingFeaturedTournament.playerOfTheMatch) && Intrinsics.c(this.timerImage, brandingFeaturedTournament.timerImage) && Intrinsics.c(this.url, brandingFeaturedTournament.url);
    }

    @Nullable
    public final Brand getBrand() {
        return this.brand;
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final Integer getLowerAdUnitHeight() {
        return this.lowerAdUnitHeight;
    }

    @Nullable
    public final Integer getLowerBannerHeight() {
        return this.lowerBannerHeight;
    }

    @Nullable
    public final ImageDisplayType getLowerImageDisplayType() {
        return this.lowerImageDisplayType;
    }

    @Nullable
    public final Boolean getPlayerOfTheMatch() {
        return this.playerOfTheMatch;
    }

    @Nullable
    public final Boolean getTimerImage() {
        return this.timerImage;
    }

    @Nullable
    public final Integer getUpperAdUnitHeight() {
        return this.upperAdUnitHeight;
    }

    @Nullable
    public final Integer getUpperBannerHeight() {
        return this.upperBannerHeight;
    }

    @Nullable
    public final ImageDisplayType getUpperImageDisplayType() {
        return this.upperImageDisplayType;
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
        ImageDisplayType imageDisplayType = this.upperImageDisplayType;
        int hashCode2 = (hashCode + (imageDisplayType != null ? imageDisplayType.hashCode() : 0)) * 37;
        Integer num = this.upperBannerHeight;
        int hashCode3 = (hashCode2 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        Integer num2 = this.upperAdUnitHeight;
        int hashCode4 = (hashCode3 + (num2 != null ? Integer.hashCode(num2.intValue()) : 0)) * 37;
        ImageDisplayType imageDisplayType2 = this.lowerImageDisplayType;
        int hashCode5 = (hashCode4 + (imageDisplayType2 != null ? imageDisplayType2.hashCode() : 0)) * 37;
        Integer num3 = this.lowerBannerHeight;
        int hashCode6 = (hashCode5 + (num3 != null ? Integer.hashCode(num3.intValue()) : 0)) * 37;
        Integer num4 = this.lowerAdUnitHeight;
        int hashCode7 = (hashCode6 + (num4 != null ? Integer.hashCode(num4.intValue()) : 0)) * 37;
        Boolean bool = this.playerOfTheMatch;
        int hashCode8 = (hashCode7 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Boolean bool2 = this.timerImage;
        int hashCode9 = (hashCode8 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
        String str = this.url;
        int hashCode10 = hashCode9 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode10;
        return hashCode10;
    }

    @wx4
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m683newBuilder() {
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
        ImageDisplayType imageDisplayType = this.upperImageDisplayType;
        if (imageDisplayType != null) {
            arrayList.add("upperImageDisplayType=" + imageDisplayType);
        }
        Integer num = this.upperBannerHeight;
        if (num != null) {
            arrayList.add("upperBannerHeight=" + num);
        }
        Integer num2 = this.upperAdUnitHeight;
        if (num2 != null) {
            arrayList.add("upperAdUnitHeight=" + num2);
        }
        ImageDisplayType imageDisplayType2 = this.lowerImageDisplayType;
        if (imageDisplayType2 != null) {
            arrayList.add("lowerImageDisplayType=" + imageDisplayType2);
        }
        Integer num3 = this.lowerBannerHeight;
        if (num3 != null) {
            arrayList.add("lowerBannerHeight=" + num3);
        }
        Integer num4 = this.lowerAdUnitHeight;
        if (num4 != null) {
            arrayList.add("lowerAdUnitHeight=" + num4);
        }
        Boolean bool = this.playerOfTheMatch;
        if (bool != null) {
            mz1.y("playerOfTheMatch=", bool, arrayList);
        }
        Boolean bool2 = this.timerImage;
        if (bool2 != null) {
            mz1.y("timerImage=", bool2, arrayList);
        }
        String str = this.url;
        if (str != null) {
            mz1.A(arrayList, "url=", Internal.sanitize(str));
        }
        return CollectionsKt.f0(arrayList, ", ", "BrandingFeaturedTournament{", "}", null, 56);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m683newBuilder();
    }

    public BrandingFeaturedTournament() {
        this(0, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrandingFeaturedTournament(int i, @Nullable Brand brand, @Nullable ImageDisplayType imageDisplayType, @Nullable Integer num, @Nullable Integer num2, @Nullable ImageDisplayType imageDisplayType2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable String str, @NotNull gc2 gc2Var) {
        super(ADAPTER, gc2Var);
        gc2Var.getClass();
        this.id = i;
        this.brand = brand;
        this.upperImageDisplayType = imageDisplayType;
        this.upperBannerHeight = num;
        this.upperAdUnitHeight = num2;
        this.lowerImageDisplayType = imageDisplayType2;
        this.lowerBannerHeight = num3;
        this.lowerAdUnitHeight = num4;
        this.playerOfTheMatch = bool;
        this.timerImage = bool2;
        this.url = str;
    }
}
