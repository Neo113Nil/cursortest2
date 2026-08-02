package com.sofascore.model.buzzer;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import defpackage.a7a;
import defpackage.bf3;
import defpackage.dmi;
import defpackage.lnb;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.vxd;
import defpackage.wf3;
import defpackage.wv8;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u0000 K2\u00020\u0001:\u0002LKB\u0081\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0012\u0010\u0013B\u0095\u0001\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0012\u0010\u0017J\r\u0010\u0018\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b#\u0010\u001fJ\u0012\u0010$\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b$\u0010\u001fJ\u0010\u0010%\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b%\u0010\u0019J\u0012\u0010&\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b&\u0010\u001fJ\u0012\u0010'\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b'\u0010\u001fJ\u0012\u0010(\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b(\u0010\u001fJ\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010!J¤\u0001\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b,\u0010\u001fJ\u0010\u0010-\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b-\u0010\u001bJ\u001a\u00100\u001a\u00020\f2\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b0\u00101J'\u0010:\u001a\u0002072\u0006\u00102\u001a\u00020\u00002\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u000205H\u0001¢\u0006\u0004\b8\u00109R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010;\u001a\u0004\b<\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010;\u001a\u0004\b=\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010;\u001a\u0004\b>\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010?\u001a\u0004\b@\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010A\u001a\u0004\bB\u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010A\u001a\u0004\bC\u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010?\u001a\u0004\bD\u0010\u001fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u0010?\u001a\u0004\bE\u0010\u001fR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010F\u001a\u0004\b\r\u0010\u0019R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u000e\u0010?\u001a\u0004\bG\u0010\u001fR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010?\u001a\u0004\bH\u0010\u001fR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010?\u001a\u0004\bI\u0010\u001fR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010A\u001a\u0004\bJ\u0010!¨\u0006M"}, d2 = {"Lcom/sofascore/model/buzzer/NetworkBuzzerTile;", "Ljava/io/Serializable;", "", "id", "type", "action", "", "actionValue", "eventId", "position", "imageUrl", "sportSlug", "", "isDismissible", "text", "label", "labelBackground", "overlay", "<init>", "(IIILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IIIILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lt5h;)V", "hasPriority", "()Z", "component1", "()I", "component2", "component3", "component4", "()Ljava/lang/String;", "component5", "()Ljava/lang/Integer;", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(IIILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/sofascore/model/buzzer/NetworkBuzzerTile;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/buzzer/NetworkBuzzerTile;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "I", "getId", "getType", "getAction", "Ljava/lang/String;", "getActionValue", "Ljava/lang/Integer;", "getEventId", "getPosition", "getImageUrl", "getSportSlug", "Z", "getText", "getLabel", "getLabelBackground", "getOverlay", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class NetworkBuzzerTile implements Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int action;

    @Nullable
    private final String actionValue;

    @Nullable
    private final Integer eventId;
    private final int id;

    @Nullable
    private final String imageUrl;
    private final boolean isDismissible;

    @Nullable
    private final String label;

    @Nullable
    private final String labelBackground;

    @Nullable
    private final Integer overlay;

    @Nullable
    private final Integer position;

    @Nullable
    private final String sportSlug;

    @Nullable
    private final String text;
    private final int type;

    public /* synthetic */ NetworkBuzzerTile(int i, int i2, int i3, int i4, String str, Integer num, Integer num2, String str2, String str3, boolean z, String str4, String str5, String str6, Integer num3, t5h t5hVar) {
        if (8191 != (i & 8191)) {
            oea.z(i, 8191, NetworkBuzzerTile$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i2;
        this.type = i3;
        this.action = i4;
        this.actionValue = str;
        this.eventId = num;
        this.position = num2;
        this.imageUrl = str2;
        this.sportSlug = str3;
        this.isDismissible = z;
        this.text = str4;
        this.label = str5;
        this.labelBackground = str6;
        this.overlay = num3;
    }

    public static /* synthetic */ NetworkBuzzerTile copy$default(NetworkBuzzerTile networkBuzzerTile, int i, int i2, int i3, String str, Integer num, Integer num2, String str2, String str3, boolean z, String str4, String str5, String str6, Integer num3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = networkBuzzerTile.id;
        }
        return networkBuzzerTile.copy(i, (i4 & 2) != 0 ? networkBuzzerTile.type : i2, (i4 & 4) != 0 ? networkBuzzerTile.action : i3, (i4 & 8) != 0 ? networkBuzzerTile.actionValue : str, (i4 & 16) != 0 ? networkBuzzerTile.eventId : num, (i4 & 32) != 0 ? networkBuzzerTile.position : num2, (i4 & 64) != 0 ? networkBuzzerTile.imageUrl : str2, (i4 & 128) != 0 ? networkBuzzerTile.sportSlug : str3, (i4 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? networkBuzzerTile.isDismissible : z, (i4 & 512) != 0 ? networkBuzzerTile.text : str4, (i4 & 1024) != 0 ? networkBuzzerTile.label : str5, (i4 & a.o) != 0 ? networkBuzzerTile.labelBackground : str6, (i4 & 4096) != 0 ? networkBuzzerTile.overlay : num3);
    }

    public static final /* synthetic */ void write$Self$model_release(NetworkBuzzerTile self, wf3 output, SerialDescriptor serialDesc) {
        output.u(0, self.id, serialDesc);
        output.u(1, self.type, serialDesc);
        output.u(2, self.action, serialDesc);
        uhi uhiVar = uhi.a;
        output.h(serialDesc, 3, uhiVar, self.actionValue);
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 4, a7aVar, self.eventId);
        output.h(serialDesc, 5, a7aVar, self.position);
        output.h(serialDesc, 6, uhiVar, self.imageUrl);
        output.h(serialDesc, 7, uhiVar, self.sportSlug);
        output.x(serialDesc, 8, self.isDismissible);
        output.h(serialDesc, 9, uhiVar, self.text);
        output.h(serialDesc, 10, uhiVar, self.label);
        output.h(serialDesc, 11, uhiVar, self.labelBackground);
        output.h(serialDesc, 12, a7aVar, self.overlay);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final String getLabelBackground() {
        return this.labelBackground;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final Integer getOverlay() {
        return this.overlay;
    }

    /* renamed from: component2, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* renamed from: component3, reason: from getter */
    public final int getAction() {
        return this.action;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getActionValue() {
        return this.actionValue;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Integer getEventId() {
        return this.eventId;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Integer getPosition() {
        return this.position;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final String getSportSlug() {
        return this.sportSlug;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsDismissible() {
        return this.isDismissible;
    }

    @NotNull
    public final NetworkBuzzerTile copy(int id, int type, int action, @Nullable String actionValue, @Nullable Integer eventId, @Nullable Integer position, @Nullable String imageUrl, @Nullable String sportSlug, boolean isDismissible, @Nullable String text, @Nullable String label, @Nullable String labelBackground, @Nullable Integer overlay) {
        return new NetworkBuzzerTile(id, type, action, actionValue, eventId, position, imageUrl, sportSlug, isDismissible, text, label, labelBackground, overlay);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkBuzzerTile)) {
            return false;
        }
        NetworkBuzzerTile networkBuzzerTile = (NetworkBuzzerTile) other;
        return this.id == networkBuzzerTile.id && this.type == networkBuzzerTile.type && this.action == networkBuzzerTile.action && Intrinsics.c(this.actionValue, networkBuzzerTile.actionValue) && Intrinsics.c(this.eventId, networkBuzzerTile.eventId) && Intrinsics.c(this.position, networkBuzzerTile.position) && Intrinsics.c(this.imageUrl, networkBuzzerTile.imageUrl) && Intrinsics.c(this.sportSlug, networkBuzzerTile.sportSlug) && this.isDismissible == networkBuzzerTile.isDismissible && Intrinsics.c(this.text, networkBuzzerTile.text) && Intrinsics.c(this.label, networkBuzzerTile.label) && Intrinsics.c(this.labelBackground, networkBuzzerTile.labelBackground) && Intrinsics.c(this.overlay, networkBuzzerTile.overlay);
    }

    public final int getAction() {
        return this.action;
    }

    @Nullable
    public final String getActionValue() {
        return this.actionValue;
    }

    @Nullable
    public final Integer getEventId() {
        return this.eventId;
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @Nullable
    public final String getLabel() {
        return this.label;
    }

    @Nullable
    public final String getLabelBackground() {
        return this.labelBackground;
    }

    @Nullable
    public final Integer getOverlay() {
        return this.overlay;
    }

    @Nullable
    public final Integer getPosition() {
        return this.position;
    }

    @Nullable
    public final String getSportSlug() {
        return this.sportSlug;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    public final int getType() {
        return this.type;
    }

    public final boolean hasPriority() {
        Integer num = this.position;
        return (num != null ? num.intValue() : -1) >= 0;
    }

    public int hashCode() {
        int a = wv8.a(this.action, wv8.a(this.type, Integer.hashCode(this.id) * 31, 31), 31);
        String str = this.actionValue;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.eventId;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.position;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.imageUrl;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sportSlug;
        int e = dmi.e((hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.isDismissible);
        String str4 = this.text;
        int hashCode5 = (e + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.label;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.labelBackground;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num3 = this.overlay;
        return hashCode7 + (num3 != null ? num3.hashCode() : 0);
    }

    public final boolean isDismissible() {
        return this.isDismissible;
    }

    @NotNull
    public String toString() {
        int i = this.id;
        int i2 = this.type;
        int i3 = this.action;
        String str = this.actionValue;
        Integer num = this.eventId;
        Integer num2 = this.position;
        String str2 = this.imageUrl;
        String str3 = this.sportSlug;
        boolean z = this.isDismissible;
        String str4 = this.text;
        String str5 = this.label;
        String str6 = this.labelBackground;
        Integer num3 = this.overlay;
        StringBuilder s = lnb.s(i, i2, "NetworkBuzzerTile(id=", ", type=", ", action=");
        vxd.p(i3, ", actionValue=", str, ", eventId=", s);
        vxd.r(num, num2, ", position=", ", imageUrl=", s);
        bf3.v(s, str2, ", sportSlug=", str3, ", isDismissible=");
        s.append(z);
        s.append(", text=");
        s.append(str4);
        s.append(", label=");
        bf3.v(s, str5, ", labelBackground=", str6, ", overlay=");
        return vxd.n(s, num3, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/buzzer/NetworkBuzzerTile$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/buzzer/NetworkBuzzerTile;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return NetworkBuzzerTile$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public NetworkBuzzerTile(int i, int i2, int i3, @Nullable String str, @Nullable Integer num, @Nullable Integer num2, @Nullable String str2, @Nullable String str3, boolean z, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Integer num3) {
        this.id = i;
        this.type = i2;
        this.action = i3;
        this.actionValue = str;
        this.eventId = num;
        this.position = num2;
        this.imageUrl = str2;
        this.sportSlug = str3;
        this.isDismissible = z;
        this.text = str4;
        this.label = str5;
        this.labelBackground = str6;
        this.overlay = num3;
    }
}
