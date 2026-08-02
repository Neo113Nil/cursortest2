package com.sofascore.model.newNetwork;

import androidx.core.app.NotificationCompat;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.network.response.serializers.EventSerializer;
import defpackage.bf3;
import defpackage.fc6;
import defpackage.joa;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.uzj;
import defpackage.wf3;
import defpackage.wv8;
import defpackage.ypa;
import defpackage.ysa;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u0000 K2\u00020\u0001:\u0002LKBs\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0012\u0010\u0013B{\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0012\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b%\u0010$J\u0012\u0010&\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b&\u0010$J\u0012\u0010'\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b'\u0010$J\u0080\u0001\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b*\u0010$J\u0010\u0010+\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b+\u0010\u0019J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010/J'\u00108\u001a\u0002052\u0006\u00100\u001a\u00020\u00002\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u000203H\u0001¢\u0006\u0004\b6\u00107R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00109\u001a\u0004\b:\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010;\u001a\u0004\b<\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00109\u001a\u0004\b=\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010>\u001a\u0004\b?\u0010\u001eR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010@\u001a\u0004\bA\u0010 R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010B\u001a\u0004\bC\u0010\"R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010D\u001a\u0004\bE\u0010$R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010D\u001a\u0004\bF\u0010$R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u0010\u0010D\u001a\u0004\bG\u0010$R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u0011\u0010D\u001a\u0004\bH\u0010$R\u0011\u0010I\u001a\u00020-8F¢\u0006\u0006\u001a\u0004\bI\u0010J¨\u0006M"}, d2 = {"Lcom/sofascore/model/newNetwork/TrendingGridTile;", "", "", "id", "Lcom/sofascore/model/newNetwork/TrendingGridTileSize;", "size", "position", "Lcom/sofascore/model/newNetwork/TrendingGridTileType;", "type", "Lcom/sofascore/model/mvvm/model/Event;", "event", "Lcom/sofascore/model/newNetwork/TrendingGridTileImage;", "image", "", "text", "labelText", "labelColor", "actionValue", "<init>", "(ILcom/sofascore/model/newNetwork/TrendingGridTileSize;ILcom/sofascore/model/newNetwork/TrendingGridTileType;Lcom/sofascore/model/mvvm/model/Event;Lcom/sofascore/model/newNetwork/TrendingGridTileImage;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IILcom/sofascore/model/newNetwork/TrendingGridTileSize;ILcom/sofascore/model/newNetwork/TrendingGridTileType;Lcom/sofascore/model/mvvm/model/Event;Lcom/sofascore/model/newNetwork/TrendingGridTileImage;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lt5h;)V", "component1", "()I", "component2", "()Lcom/sofascore/model/newNetwork/TrendingGridTileSize;", "component3", "component4", "()Lcom/sofascore/model/newNetwork/TrendingGridTileType;", "component5", "()Lcom/sofascore/model/mvvm/model/Event;", "component6", "()Lcom/sofascore/model/newNetwork/TrendingGridTileImage;", "component7", "()Ljava/lang/String;", "component8", "component9", "component10", "copy", "(ILcom/sofascore/model/newNetwork/TrendingGridTileSize;ILcom/sofascore/model/newNetwork/TrendingGridTileType;Lcom/sofascore/model/mvvm/model/Event;Lcom/sofascore/model/newNetwork/TrendingGridTileImage;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/sofascore/model/newNetwork/TrendingGridTile;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/TrendingGridTile;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "I", "getId", "Lcom/sofascore/model/newNetwork/TrendingGridTileSize;", "getSize", "getPosition", "Lcom/sofascore/model/newNetwork/TrendingGridTileType;", "getType", "Lcom/sofascore/model/mvvm/model/Event;", "getEvent", "Lcom/sofascore/model/newNetwork/TrendingGridTileImage;", "getImage", "Ljava/lang/String;", "getText", "getLabelText", "getLabelColor", "getActionValue", "isMonetizable", "()Z", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TrendingGridTile {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final String actionValue;

    @Nullable
    private final Event event;
    private final int id;

    @Nullable
    private final TrendingGridTileImage image;

    @Nullable
    private final String labelColor;

    @Nullable
    private final String labelText;
    private final int position;

    @NotNull
    private final TrendingGridTileSize size;

    @Nullable
    private final String text;

    @NotNull
    private final TrendingGridTileType type;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{null, ypa.a(ysaVar, new uzj(0)), null, ypa.a(ysaVar, new uzj(1)), null, null, null, null, null, null};
    }

    public /* synthetic */ TrendingGridTile(int i, int i2, TrendingGridTileSize trendingGridTileSize, int i3, TrendingGridTileType trendingGridTileType, Event event, TrendingGridTileImage trendingGridTileImage, String str, String str2, String str3, String str4, t5h t5hVar) {
        if (5 != (i & 5)) {
            oea.z(i, 5, TrendingGridTile$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i2;
        if ((i & 2) == 0) {
            this.size = TrendingGridTileSize.UNKNOWN;
        } else {
            this.size = trendingGridTileSize;
        }
        this.position = i3;
        if ((i & 8) == 0) {
            this.type = TrendingGridTileType.UNKNOWN;
        } else {
            this.type = trendingGridTileType;
        }
        if ((i & 16) == 0) {
            this.event = null;
        } else {
            this.event = event;
        }
        if ((i & 32) == 0) {
            this.image = null;
        } else {
            this.image = trendingGridTileImage;
        }
        if ((i & 64) == 0) {
            this.text = null;
        } else {
            this.text = str;
        }
        if ((i & 128) == 0) {
            this.labelText = null;
        } else {
            this.labelText = str2;
        }
        if ((i & NotificationCompat.FLAG_LOCAL_ONLY) == 0) {
            this.labelColor = null;
        } else {
            this.labelColor = str3;
        }
        if ((i & 512) == 0) {
            this.actionValue = null;
        } else {
            this.actionValue = str4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return TrendingGridTileSize.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return TrendingGridTileType.INSTANCE.serializer();
    }

    public static /* synthetic */ TrendingGridTile copy$default(TrendingGridTile trendingGridTile, int i, TrendingGridTileSize trendingGridTileSize, int i2, TrendingGridTileType trendingGridTileType, Event event, TrendingGridTileImage trendingGridTileImage, String str, String str2, String str3, String str4, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = trendingGridTile.id;
        }
        if ((i3 & 2) != 0) {
            trendingGridTileSize = trendingGridTile.size;
        }
        if ((i3 & 4) != 0) {
            i2 = trendingGridTile.position;
        }
        if ((i3 & 8) != 0) {
            trendingGridTileType = trendingGridTile.type;
        }
        if ((i3 & 16) != 0) {
            event = trendingGridTile.event;
        }
        if ((i3 & 32) != 0) {
            trendingGridTileImage = trendingGridTile.image;
        }
        if ((i3 & 64) != 0) {
            str = trendingGridTile.text;
        }
        if ((i3 & 128) != 0) {
            str2 = trendingGridTile.labelText;
        }
        if ((i3 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            str3 = trendingGridTile.labelColor;
        }
        if ((i3 & 512) != 0) {
            str4 = trendingGridTile.actionValue;
        }
        String str5 = str3;
        String str6 = str4;
        String str7 = str;
        String str8 = str2;
        Event event2 = event;
        TrendingGridTileImage trendingGridTileImage2 = trendingGridTileImage;
        return trendingGridTile.copy(i, trendingGridTileSize, i2, trendingGridTileType, event2, trendingGridTileImage2, str7, str8, str5, str6);
    }

    public static final /* synthetic */ void write$Self$model_release(TrendingGridTile self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.u(0, self.id, serialDesc);
        if (output.o(serialDesc) || self.size != TrendingGridTileSize.UNKNOWN) {
            output.f(serialDesc, 1, (KSerializer) joaVarArr[1].getValue(), self.size);
        }
        output.u(2, self.position, serialDesc);
        if (output.o(serialDesc) || self.type != TrendingGridTileType.UNKNOWN) {
            output.f(serialDesc, 3, (KSerializer) joaVarArr[3].getValue(), self.type);
        }
        if (output.o(serialDesc) || self.event != null) {
            output.h(serialDesc, 4, EventSerializer.INSTANCE, self.event);
        }
        if (output.o(serialDesc) || self.image != null) {
            output.h(serialDesc, 5, TrendingGridTileImage$$serializer.INSTANCE, self.image);
        }
        if (output.o(serialDesc) || self.text != null) {
            output.h(serialDesc, 6, uhi.a, self.text);
        }
        if (output.o(serialDesc) || self.labelText != null) {
            output.h(serialDesc, 7, uhi.a, self.labelText);
        }
        if (output.o(serialDesc) || self.labelColor != null) {
            output.h(serialDesc, 8, uhi.a, self.labelColor);
        }
        if (!output.o(serialDesc) && self.actionValue == null) {
            return;
        }
        output.h(serialDesc, 9, uhi.a, self.actionValue);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final String getActionValue() {
        return this.actionValue;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TrendingGridTileSize getSize() {
        return this.size;
    }

    /* renamed from: component3, reason: from getter */
    public final int getPosition() {
        return this.position;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final TrendingGridTileType getType() {
        return this.type;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Event getEvent() {
        return this.event;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final TrendingGridTileImage getImage() {
        return this.image;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final String getLabelText() {
        return this.labelText;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final String getLabelColor() {
        return this.labelColor;
    }

    @NotNull
    public final TrendingGridTile copy(int id, @NotNull TrendingGridTileSize size, int position, @NotNull TrendingGridTileType type, @Nullable Event event, @Nullable TrendingGridTileImage image, @Nullable String text, @Nullable String labelText, @Nullable String labelColor, @Nullable String actionValue) {
        size.getClass();
        type.getClass();
        return new TrendingGridTile(id, size, position, type, event, image, text, labelText, labelColor, actionValue);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrendingGridTile)) {
            return false;
        }
        TrendingGridTile trendingGridTile = (TrendingGridTile) other;
        return this.id == trendingGridTile.id && this.size == trendingGridTile.size && this.position == trendingGridTile.position && this.type == trendingGridTile.type && Intrinsics.c(this.event, trendingGridTile.event) && Intrinsics.c(this.image, trendingGridTile.image) && Intrinsics.c(this.text, trendingGridTile.text) && Intrinsics.c(this.labelText, trendingGridTile.labelText) && Intrinsics.c(this.labelColor, trendingGridTile.labelColor) && Intrinsics.c(this.actionValue, trendingGridTile.actionValue);
    }

    @Nullable
    public final String getActionValue() {
        return this.actionValue;
    }

    @Nullable
    public final Event getEvent() {
        return this.event;
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final TrendingGridTileImage getImage() {
        return this.image;
    }

    @Nullable
    public final String getLabelColor() {
        return this.labelColor;
    }

    @Nullable
    public final String getLabelText() {
        return this.labelText;
    }

    public final int getPosition() {
        return this.position;
    }

    @NotNull
    public final TrendingGridTileSize getSize() {
        return this.size;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    @NotNull
    public final TrendingGridTileType getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = (this.type.hashCode() + wv8.a(this.position, (this.size.hashCode() + (Integer.hashCode(this.id) * 31)) * 31, 31)) * 31;
        Event event = this.event;
        int hashCode2 = (hashCode + (event == null ? 0 : event.hashCode())) * 31;
        TrendingGridTileImage trendingGridTileImage = this.image;
        int hashCode3 = (hashCode2 + (trendingGridTileImage == null ? 0 : trendingGridTileImage.hashCode())) * 31;
        String str = this.text;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.labelText;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.labelColor;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.actionValue;
        return hashCode6 + (str4 != null ? str4.hashCode() : 0);
    }

    public final boolean isMonetizable() {
        return this.type == TrendingGridTileType.PAID_AD;
    }

    @NotNull
    public String toString() {
        int i = this.id;
        TrendingGridTileSize trendingGridTileSize = this.size;
        int i2 = this.position;
        TrendingGridTileType trendingGridTileType = this.type;
        Event event = this.event;
        TrendingGridTileImage trendingGridTileImage = this.image;
        String str = this.text;
        String str2 = this.labelText;
        String str3 = this.labelColor;
        String str4 = this.actionValue;
        StringBuilder sb = new StringBuilder("TrendingGridTile(id=");
        sb.append(i);
        sb.append(", size=");
        sb.append(trendingGridTileSize);
        sb.append(", position=");
        sb.append(i2);
        sb.append(", type=");
        sb.append(trendingGridTileType);
        sb.append(", event=");
        sb.append(event);
        sb.append(", image=");
        sb.append(trendingGridTileImage);
        sb.append(", text=");
        bf3.v(sb, str, ", labelText=", str2, ", labelColor=");
        return fc6.o(sb, str3, ", actionValue=", str4, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/TrendingGridTile$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/TrendingGridTile;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return TrendingGridTile$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public TrendingGridTile(int i, @NotNull TrendingGridTileSize trendingGridTileSize, int i2, @NotNull TrendingGridTileType trendingGridTileType, @Nullable Event event, @Nullable TrendingGridTileImage trendingGridTileImage, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        trendingGridTileSize.getClass();
        trendingGridTileType.getClass();
        this.id = i;
        this.size = trendingGridTileSize;
        this.position = i2;
        this.type = trendingGridTileType;
        this.event = event;
        this.image = trendingGridTileImage;
        this.text = str;
        this.labelText = str2;
        this.labelColor = str3;
        this.actionValue = str4;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ TrendingGridTile(int r12, com.sofascore.model.newNetwork.TrendingGridTileSize r13, int r14, com.sofascore.model.newNetwork.TrendingGridTileType r15, com.sofascore.model.mvvm.model.Event r16, com.sofascore.model.newNetwork.TrendingGridTileImage r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, int r22, kotlin.jvm.internal.DefaultConstructorMarker r23) {
        /*
            r11 = this;
            r0 = r22
            r1 = r0 & 2
            if (r1 == 0) goto L8
            com.sofascore.model.newNetwork.TrendingGridTileSize r13 = com.sofascore.model.newNetwork.TrendingGridTileSize.UNKNOWN
        L8:
            r2 = r13
            r13 = r0 & 8
            if (r13 == 0) goto L11
            com.sofascore.model.newNetwork.TrendingGridTileType r13 = com.sofascore.model.newNetwork.TrendingGridTileType.UNKNOWN
            r4 = r13
            goto L12
        L11:
            r4 = r15
        L12:
            r13 = r0 & 16
            r1 = 0
            if (r13 == 0) goto L19
            r5 = r1
            goto L1b
        L19:
            r5 = r16
        L1b:
            r13 = r0 & 32
            if (r13 == 0) goto L21
            r6 = r1
            goto L23
        L21:
            r6 = r17
        L23:
            r13 = r0 & 64
            if (r13 == 0) goto L29
            r7 = r1
            goto L2b
        L29:
            r7 = r18
        L2b:
            r13 = r0 & 128(0x80, float:1.8E-43)
            if (r13 == 0) goto L31
            r8 = r1
            goto L33
        L31:
            r8 = r19
        L33:
            r13 = r0 & 256(0x100, float:3.59E-43)
            if (r13 == 0) goto L39
            r9 = r1
            goto L3b
        L39:
            r9 = r20
        L3b:
            r13 = r0 & 512(0x200, float:7.17E-43)
            if (r13 == 0) goto L44
            r10 = r1
            r0 = r11
            r3 = r14
            r1 = r12
            goto L49
        L44:
            r10 = r21
            r0 = r11
            r1 = r12
            r3 = r14
        L49:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sofascore.model.newNetwork.TrendingGridTile.<init>(int, com.sofascore.model.newNetwork.TrendingGridTileSize, int, com.sofascore.model.newNetwork.TrendingGridTileType, com.sofascore.model.mvvm.model.Event, com.sofascore.model.newNetwork.TrendingGridTileImage, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
