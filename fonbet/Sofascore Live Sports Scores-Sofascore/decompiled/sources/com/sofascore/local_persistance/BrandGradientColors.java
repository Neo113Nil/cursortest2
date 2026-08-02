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
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB%\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001a\u0010\u0015¨\u0006\u001c"}, d2 = {"Lcom/sofascore/local_persistance/BrandGradientColors;", "Lcom/squareup/wire/Message;", "", "", "color1", "color2", "Lgc2;", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lgc2;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lgc2;)Lcom/sofascore/local_persistance/BrandGradientColors;", "Ljava/lang/String;", "getColor1", "getColor2", "Companion", "localPersistence_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BrandGradientColors extends Message {

    @NotNull
    public static final ProtoAdapter<BrandGradientColors> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    @NotNull
    private final String color1;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    @NotNull
    private final String color2;

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(BrandGradientColors.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<BrandGradientColors>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.sofascore.local_persistance.BrandGradientColors$Companion$ADAPTER$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public BrandGradientColors decode(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                String str = "";
                String str2 = "";
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new BrandGradientColors(str, str2, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        str = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag != 2) {
                        reader.readUnknownField(nextTag);
                    } else {
                        str2 = ProtoAdapter.STRING.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, BrandGradientColors value) {
                writer.getClass();
                value.getClass();
                if (!Intrinsics.c(value.getColor1(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getColor1());
                }
                if (!Intrinsics.c(value.getColor2(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getColor2());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(BrandGradientColors value) {
                value.getClass();
                int h = value.unknownFields().h();
                if (!Intrinsics.c(value.getColor1(), "")) {
                    h += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getColor1());
                }
                return !Intrinsics.c(value.getColor2(), "") ? ProtoAdapter.STRING.encodedSizeWithTag(2, value.getColor2()) + h : h;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public BrandGradientColors redact(BrandGradientColors value) {
                value.getClass();
                return BrandGradientColors.copy$default(value, null, null, gc2.d, 3, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, BrandGradientColors value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.c(value.getColor2(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getColor2());
                }
                if (Intrinsics.c(value.getColor1(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getColor1());
            }
        };
    }

    public /* synthetic */ BrandGradientColors(String str, String str2, gc2 gc2Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? gc2.d : gc2Var);
    }

    public static /* synthetic */ BrandGradientColors copy$default(BrandGradientColors brandGradientColors, String str, String str2, gc2 gc2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            str = brandGradientColors.color1;
        }
        if ((i & 2) != 0) {
            str2 = brandGradientColors.color2;
        }
        if ((i & 4) != 0) {
            gc2Var = brandGradientColors.unknownFields();
        }
        return brandGradientColors.copy(str, str2, gc2Var);
    }

    @NotNull
    public final BrandGradientColors copy(@NotNull String color1, @NotNull String color2, @NotNull gc2 unknownFields) {
        color1.getClass();
        color2.getClass();
        unknownFields.getClass();
        return new BrandGradientColors(color1, color2, unknownFields);
    }

    public boolean equals(@Nullable Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof BrandGradientColors)) {
            return false;
        }
        BrandGradientColors brandGradientColors = (BrandGradientColors) other;
        return Intrinsics.c(unknownFields(), brandGradientColors.unknownFields()) && Intrinsics.c(this.color1, brandGradientColors.color1) && Intrinsics.c(this.color2, brandGradientColors.color2);
    }

    @NotNull
    public final String getColor1() {
        return this.color1;
    }

    @NotNull
    public final String getColor2() {
        return this.color2;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.color2.hashCode() + dmi.c(unknownFields().hashCode() * 37, 37, this.color1);
        this.hashCode = hashCode;
        return hashCode;
    }

    @wx4
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m677newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    @Override // com.squareup.wire.Message
    @NotNull
    public String toString() {
        ArrayList arrayList = new ArrayList();
        mz1.A(arrayList, "color1=", Internal.sanitize(this.color1));
        mz1.A(arrayList, "color2=", Internal.sanitize(this.color2));
        return CollectionsKt.f0(arrayList, ", ", "BrandGradientColors{", "}", null, 56);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m677newBuilder();
    }

    public BrandGradientColors() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrandGradientColors(@NotNull String str, @NotNull String str2, @NotNull gc2 gc2Var) {
        super(ADAPTER, gc2Var);
        str.getClass();
        str2.getClass();
        gc2Var.getClass();
        this.color1 = str;
        this.color2 = str2;
    }
}
