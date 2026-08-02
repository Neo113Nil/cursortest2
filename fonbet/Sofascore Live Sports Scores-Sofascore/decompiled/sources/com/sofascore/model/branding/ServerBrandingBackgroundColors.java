package com.sofascore.model.branding;

import com.blaze.blazesdk.widgets.models.WidgetRemoteConfigRemoteResponse;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u0016¨\u0006("}, d2 = {"Lcom/sofascore/model/branding/ServerBrandingBackgroundColors;", "", "Lcom/sofascore/model/branding/ServerBrandGradientColors;", WidgetRemoteConfigRemoteResponse.DEFAULT_LAYOUT_KEY, "dark", "<init>", "(Lcom/sofascore/model/branding/ServerBrandGradientColors;Lcom/sofascore/model/branding/ServerBrandGradientColors;)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/branding/ServerBrandGradientColors;Lcom/sofascore/model/branding/ServerBrandGradientColors;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/branding/ServerBrandingBackgroundColors;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/sofascore/model/branding/ServerBrandGradientColors;", "component2", "copy", "(Lcom/sofascore/model/branding/ServerBrandGradientColors;Lcom/sofascore/model/branding/ServerBrandGradientColors;)Lcom/sofascore/model/branding/ServerBrandingBackgroundColors;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/sofascore/model/branding/ServerBrandGradientColors;", "getLight", "getDark", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ServerBrandingBackgroundColors {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final ServerBrandGradientColors dark;

    @NotNull
    private final ServerBrandGradientColors light;

    public /* synthetic */ ServerBrandingBackgroundColors(int i, ServerBrandGradientColors serverBrandGradientColors, ServerBrandGradientColors serverBrandGradientColors2, t5h t5hVar) {
        if (3 != (i & 3)) {
            oea.z(i, 3, ServerBrandingBackgroundColors$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.light = serverBrandGradientColors;
        this.dark = serverBrandGradientColors2;
    }

    public static /* synthetic */ ServerBrandingBackgroundColors copy$default(ServerBrandingBackgroundColors serverBrandingBackgroundColors, ServerBrandGradientColors serverBrandGradientColors, ServerBrandGradientColors serverBrandGradientColors2, int i, Object obj) {
        if ((i & 1) != 0) {
            serverBrandGradientColors = serverBrandingBackgroundColors.light;
        }
        if ((i & 2) != 0) {
            serverBrandGradientColors2 = serverBrandingBackgroundColors.dark;
        }
        return serverBrandingBackgroundColors.copy(serverBrandGradientColors, serverBrandGradientColors2);
    }

    public static final /* synthetic */ void write$Self$model_release(ServerBrandingBackgroundColors self, wf3 output, SerialDescriptor serialDesc) {
        ServerBrandGradientColors$$serializer serverBrandGradientColors$$serializer = ServerBrandGradientColors$$serializer.INSTANCE;
        output.f(serialDesc, 0, serverBrandGradientColors$$serializer, self.light);
        output.f(serialDesc, 1, serverBrandGradientColors$$serializer, self.dark);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ServerBrandGradientColors getLight() {
        return this.light;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final ServerBrandGradientColors getDark() {
        return this.dark;
    }

    @NotNull
    public final ServerBrandingBackgroundColors copy(@NotNull ServerBrandGradientColors light, @NotNull ServerBrandGradientColors dark) {
        light.getClass();
        dark.getClass();
        return new ServerBrandingBackgroundColors(light, dark);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServerBrandingBackgroundColors)) {
            return false;
        }
        ServerBrandingBackgroundColors serverBrandingBackgroundColors = (ServerBrandingBackgroundColors) other;
        return Intrinsics.c(this.light, serverBrandingBackgroundColors.light) && Intrinsics.c(this.dark, serverBrandingBackgroundColors.dark);
    }

    @NotNull
    public final ServerBrandGradientColors getDark() {
        return this.dark;
    }

    @NotNull
    public final ServerBrandGradientColors getLight() {
        return this.light;
    }

    public int hashCode() {
        return this.dark.hashCode() + (this.light.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "ServerBrandingBackgroundColors(light=" + this.light + ", dark=" + this.dark + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/branding/ServerBrandingBackgroundColors$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/branding/ServerBrandingBackgroundColors;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return ServerBrandingBackgroundColors$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public ServerBrandingBackgroundColors(@NotNull ServerBrandGradientColors serverBrandGradientColors, @NotNull ServerBrandGradientColors serverBrandGradientColors2) {
        serverBrandGradientColors.getClass();
        serverBrandGradientColors2.getClass();
        this.light = serverBrandGradientColors;
        this.dark = serverBrandGradientColors2;
    }
}
