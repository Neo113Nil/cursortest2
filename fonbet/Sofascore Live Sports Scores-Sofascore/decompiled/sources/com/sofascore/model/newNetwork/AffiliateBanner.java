package com.sofascore.model.newNetwork;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.dmi;
import defpackage.me4;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.vxd;
import defpackage.w1l;
import defpackage.wf3;
import defpackage.wt3;
import defpackage.wv8;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b!\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000276B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rBY\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\f\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001cJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001cJ\u0010\u0010\"\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010\u001eJ\u0010\u0010#\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b#\u0010$JV\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b'\u0010\u001eJ\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u001cJ\u001a\u0010*\u001a\u00020\n2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b/\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b0\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b1\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b2\u0010\u001cR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b3\u0010\u001eR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00104\u001a\u0004\b5\u0010$¨\u00068"}, d2 = {"Lcom/sofascore/model/newNetwork/AffiliateBanner;", "", "", "id", "", "name", "type", "width", "height", HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT, "", "enabled", "<init>", "(ILjava/lang/String;Ljava/lang/String;IILjava/lang/String;Z)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/String;IILjava/lang/String;ZLt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/AffiliateBanner;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "component7", "()Z", "copy", "(ILjava/lang/String;Ljava/lang/String;IILjava/lang/String;Z)Lcom/sofascore/model/newNetwork/AffiliateBanner;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Ljava/lang/String;", "getName", "getType", "getWidth", "getHeight", "getContent", "Z", "getEnabled", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AffiliateBanner {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String content;
    private final boolean enabled;
    private final int height;
    private final int id;

    @NotNull
    private final String name;

    @NotNull
    private final String type;
    private final int width;

    public /* synthetic */ AffiliateBanner(int i, int i2, String str, String str2, int i3, int i4, String str3, boolean z, t5h t5hVar) {
        if (127 != (i & Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE)) {
            oea.z(i, Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, AffiliateBanner$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i2;
        this.name = str;
        this.type = str2;
        this.width = i3;
        this.height = i4;
        this.content = str3;
        this.enabled = z;
    }

    public static /* synthetic */ AffiliateBanner copy$default(AffiliateBanner affiliateBanner, int i, String str, String str2, int i2, int i3, String str3, boolean z, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = affiliateBanner.id;
        }
        if ((i4 & 2) != 0) {
            str = affiliateBanner.name;
        }
        if ((i4 & 4) != 0) {
            str2 = affiliateBanner.type;
        }
        if ((i4 & 8) != 0) {
            i2 = affiliateBanner.width;
        }
        if ((i4 & 16) != 0) {
            i3 = affiliateBanner.height;
        }
        if ((i4 & 32) != 0) {
            str3 = affiliateBanner.content;
        }
        if ((i4 & 64) != 0) {
            z = affiliateBanner.enabled;
        }
        String str4 = str3;
        boolean z2 = z;
        int i5 = i3;
        String str5 = str2;
        return affiliateBanner.copy(i, str, str5, i2, i5, str4, z2);
    }

    public static final /* synthetic */ void write$Self$model_release(AffiliateBanner self, wf3 output, SerialDescriptor serialDesc) {
        output.u(0, self.id, serialDesc);
        output.y(serialDesc, 1, self.name);
        output.y(serialDesc, 2, self.type);
        output.u(3, self.width, serialDesc);
        output.u(4, self.height, serialDesc);
        output.y(serialDesc, 5, self.content);
        output.x(serialDesc, 6, self.enabled);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component4, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* renamed from: component5, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    @NotNull
    public final AffiliateBanner copy(int id, @NotNull String name, @NotNull String type, int width, int height, @NotNull String content, boolean enabled) {
        name.getClass();
        type.getClass();
        content.getClass();
        return new AffiliateBanner(id, name, type, width, height, content, enabled);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AffiliateBanner)) {
            return false;
        }
        AffiliateBanner affiliateBanner = (AffiliateBanner) other;
        return this.id == affiliateBanner.id && Intrinsics.c(this.name, affiliateBanner.name) && Intrinsics.c(this.type, affiliateBanner.type) && this.width == affiliateBanner.width && this.height == affiliateBanner.height && Intrinsics.c(this.content, affiliateBanner.content) && this.enabled == affiliateBanner.enabled;
    }

    @NotNull
    public final String getContent() {
        return this.content;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return Boolean.hashCode(this.enabled) + dmi.c(wv8.a(this.height, wv8.a(this.width, dmi.c(dmi.c(Integer.hashCode(this.id) * 31, 31, this.name), 31, this.type), 31), 31), 31, this.content);
    }

    @NotNull
    public String toString() {
        int i = this.id;
        String str = this.name;
        String str2 = this.type;
        int i2 = this.width;
        int i3 = this.height;
        String str3 = this.content;
        boolean z = this.enabled;
        StringBuilder t = dmi.t(i, "AffiliateBanner(id=", ", name=", str, ", type=");
        w1l.q(i2, str2, ", width=", ", height=", t);
        vxd.p(i3, ", content=", str3, ", enabled=", t);
        return wt3.p(t, z, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/AffiliateBanner$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/AffiliateBanner;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return AffiliateBanner$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public AffiliateBanner(int i, @NotNull String str, @NotNull String str2, int i2, int i3, @NotNull String str3, boolean z) {
        me4.p(str, str2, str3);
        this.id = i;
        this.name = str;
        this.type = str2;
        this.width = i2;
        this.height = i3;
        this.content = str3;
        this.enabled = z;
    }
}
