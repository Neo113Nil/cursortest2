package com.sofascore.local_persistance;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.dmi;
import defpackage.duf;
import defpackage.gc2;
import defpackage.mz1;
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
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\u0018\u0000 #2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#BQ\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0018\u0010\u0019JW\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\u0019R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001e\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001f\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b \u0010\u0019R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b!\u0010\u0019R\u001a\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\"\u0010\u0019¨\u0006$"}, d2 = {"Lcom/sofascore/local_persistance/BrandingBoostedOdds;", "Lcom/squareup/wire/Message;", "", "", "home", "draw", "away", "homeUrl", "drawUrl", "awayUrl", "Lgc2;", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgc2;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgc2;)Lcom/sofascore/local_persistance/BrandingBoostedOdds;", "Ljava/lang/String;", "getHome", "getDraw", "getAway", "getHomeUrl", "getDrawUrl", "getAwayUrl", "Companion", "localPersistence_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BrandingBoostedOdds extends Message {

    @NotNull
    public static final ProtoAdapter<BrandingBoostedOdds> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    @NotNull
    private final String away;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    @NotNull
    private final String awayUrl;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    @Nullable
    private final String draw;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
    @Nullable
    private final String drawUrl;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    @NotNull
    private final String home;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    @NotNull
    private final String homeUrl;

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(BrandingBoostedOdds.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<BrandingBoostedOdds>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.sofascore.local_persistance.BrandingBoostedOdds$Companion$ADAPTER$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public BrandingBoostedOdds decode(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                String str = "";
                String str2 = "";
                String str3 = str2;
                String str4 = null;
                String str5 = null;
                String str6 = str3;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new BrandingBoostedOdds(str, str4, str6, str2, str5, str3, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            str = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 2:
                            str4 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 3:
                            str6 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 4:
                            str2 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 5:
                            str5 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 6:
                            str3 = ProtoAdapter.STRING.decode(reader);
                            break;
                        default:
                            reader.readUnknownField(nextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, BrandingBoostedOdds value) {
                writer.getClass();
                value.getClass();
                if (!Intrinsics.c(value.getHome(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getHome());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 2, (int) value.getDraw());
                if (!Intrinsics.c(value.getAway(), "")) {
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getAway());
                }
                if (!Intrinsics.c(value.getHomeUrl(), "")) {
                    protoAdapter.encodeWithTag(writer, 4, (int) value.getHomeUrl());
                }
                protoAdapter.encodeWithTag(writer, 5, (int) value.getDrawUrl());
                if (!Intrinsics.c(value.getAwayUrl(), "")) {
                    protoAdapter.encodeWithTag(writer, 6, (int) value.getAwayUrl());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(BrandingBoostedOdds value) {
                value.getClass();
                int h = value.unknownFields().h();
                if (!Intrinsics.c(value.getHome(), "")) {
                    h += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getHome());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(2, value.getDraw()) + h;
                if (!Intrinsics.c(value.getAway(), "")) {
                    encodedSizeWithTag += protoAdapter.encodedSizeWithTag(3, value.getAway());
                }
                if (!Intrinsics.c(value.getHomeUrl(), "")) {
                    encodedSizeWithTag += protoAdapter.encodedSizeWithTag(4, value.getHomeUrl());
                }
                int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(5, value.getDrawUrl()) + encodedSizeWithTag;
                return !Intrinsics.c(value.getAwayUrl(), "") ? protoAdapter.encodedSizeWithTag(6, value.getAwayUrl()) + encodedSizeWithTag2 : encodedSizeWithTag2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public BrandingBoostedOdds redact(BrandingBoostedOdds value) {
                value.getClass();
                return BrandingBoostedOdds.copy$default(value, null, null, null, null, null, null, gc2.d, 63, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, BrandingBoostedOdds value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.c(value.getAwayUrl(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getAwayUrl());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 5, (int) value.getDrawUrl());
                if (!Intrinsics.c(value.getHomeUrl(), "")) {
                    protoAdapter.encodeWithTag(writer, 4, (int) value.getHomeUrl());
                }
                if (!Intrinsics.c(value.getAway(), "")) {
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getAway());
                }
                protoAdapter.encodeWithTag(writer, 2, (int) value.getDraw());
                if (Intrinsics.c(value.getHome(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getHome());
            }
        };
    }

    public /* synthetic */ BrandingBoostedOdds(String str, String str2, String str3, String str4, String str5, String str6, gc2 gc2Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? gc2.d : gc2Var);
    }

    public static /* synthetic */ BrandingBoostedOdds copy$default(BrandingBoostedOdds brandingBoostedOdds, String str, String str2, String str3, String str4, String str5, String str6, gc2 gc2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            str = brandingBoostedOdds.home;
        }
        if ((i & 2) != 0) {
            str2 = brandingBoostedOdds.draw;
        }
        if ((i & 4) != 0) {
            str3 = brandingBoostedOdds.away;
        }
        if ((i & 8) != 0) {
            str4 = brandingBoostedOdds.homeUrl;
        }
        if ((i & 16) != 0) {
            str5 = brandingBoostedOdds.drawUrl;
        }
        if ((i & 32) != 0) {
            str6 = brandingBoostedOdds.awayUrl;
        }
        if ((i & 64) != 0) {
            gc2Var = brandingBoostedOdds.unknownFields();
        }
        String str7 = str6;
        gc2 gc2Var2 = gc2Var;
        String str8 = str5;
        String str9 = str3;
        return brandingBoostedOdds.copy(str, str2, str9, str4, str8, str7, gc2Var2);
    }

    @NotNull
    public final BrandingBoostedOdds copy(@NotNull String home, @Nullable String draw, @NotNull String away, @NotNull String homeUrl, @Nullable String drawUrl, @NotNull String awayUrl, @NotNull gc2 unknownFields) {
        home.getClass();
        away.getClass();
        homeUrl.getClass();
        awayUrl.getClass();
        unknownFields.getClass();
        return new BrandingBoostedOdds(home, draw, away, homeUrl, drawUrl, awayUrl, unknownFields);
    }

    public boolean equals(@Nullable Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof BrandingBoostedOdds)) {
            return false;
        }
        BrandingBoostedOdds brandingBoostedOdds = (BrandingBoostedOdds) other;
        return Intrinsics.c(unknownFields(), brandingBoostedOdds.unknownFields()) && Intrinsics.c(this.home, brandingBoostedOdds.home) && Intrinsics.c(this.draw, brandingBoostedOdds.draw) && Intrinsics.c(this.away, brandingBoostedOdds.away) && Intrinsics.c(this.homeUrl, brandingBoostedOdds.homeUrl) && Intrinsics.c(this.drawUrl, brandingBoostedOdds.drawUrl) && Intrinsics.c(this.awayUrl, brandingBoostedOdds.awayUrl);
    }

    @NotNull
    public final String getAway() {
        return this.away;
    }

    @NotNull
    public final String getAwayUrl() {
        return this.awayUrl;
    }

    @Nullable
    public final String getDraw() {
        return this.draw;
    }

    @Nullable
    public final String getDrawUrl() {
        return this.drawUrl;
    }

    @NotNull
    public final String getHome() {
        return this.home;
    }

    @NotNull
    public final String getHomeUrl() {
        return this.homeUrl;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int c = dmi.c(unknownFields().hashCode() * 37, 37, this.home);
        String str = this.draw;
        int c2 = dmi.c(dmi.c((c + (str != null ? str.hashCode() : 0)) * 37, 37, this.away), 37, this.homeUrl);
        String str2 = this.drawUrl;
        int hashCode = this.awayUrl.hashCode() + ((c2 + (str2 != null ? str2.hashCode() : 0)) * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @wx4
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m679newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    @Override // com.squareup.wire.Message
    @NotNull
    public String toString() {
        ArrayList arrayList = new ArrayList();
        mz1.A(arrayList, "home=", Internal.sanitize(this.home));
        String str = this.draw;
        if (str != null) {
            mz1.A(arrayList, "draw=", Internal.sanitize(str));
        }
        mz1.A(arrayList, "away=", Internal.sanitize(this.away));
        mz1.A(arrayList, "homeUrl=", Internal.sanitize(this.homeUrl));
        String str2 = this.drawUrl;
        if (str2 != null) {
            mz1.A(arrayList, "drawUrl=", Internal.sanitize(str2));
        }
        mz1.A(arrayList, "awayUrl=", Internal.sanitize(this.awayUrl));
        return CollectionsKt.f0(arrayList, ", ", "BrandingBoostedOdds{", "}", null, 56);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m679newBuilder();
    }

    public BrandingBoostedOdds() {
        this(null, null, null, null, null, null, null, Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrandingBoostedOdds(@NotNull String str, @Nullable String str2, @NotNull String str3, @NotNull String str4, @Nullable String str5, @NotNull String str6, @NotNull gc2 gc2Var) {
        super(ADAPTER, gc2Var);
        str.getClass();
        str3.getClass();
        str4.getClass();
        str6.getClass();
        gc2Var.getClass();
        this.home = str;
        this.draw = str2;
        this.away = str3;
        this.homeUrl = str4;
        this.drawUrl = str5;
        this.awayUrl = str6;
    }
}
