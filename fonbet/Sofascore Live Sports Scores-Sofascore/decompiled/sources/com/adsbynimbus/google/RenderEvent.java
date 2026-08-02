package com.adsbynimbus.google;

import defpackage.lnb;
import defpackage.oea;
import defpackage.q5h;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import defpackage.wx4;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081\b\u0018\u0000 )2\u00020\u0001:\u0002*)B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B3\b\u0011\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ(\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÁ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b!\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u0016R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b&\u0010\"\u0012\u0004\b(\u0010%\u001a\u0004\b'\u0010\u0016¨\u0006+"}, d2 = {"Lcom/adsbynimbus/google/RenderEvent;", "", "", "auctionId", "googleClickEvent", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$google_release", "(Lcom/adsbynimbus/google/RenderEvent;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/adsbynimbus/google/RenderEvent;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getAuctionId", "getAuctionId$annotations", "()V", "b", "getGoogleClickEvent", "getGoogleClickEvent$annotations", "Companion", "$serializer", "google_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class RenderEvent {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: from kotlin metadata */
    public final String auctionId;

    /* renamed from: b, reason: from kotlin metadata */
    public final String googleClickEvent;

    @wx4
    public /* synthetic */ RenderEvent(int i, @q5h("na_id") String str, @q5h("ga_click") String str2, t5h t5hVar) {
        if (3 != (i & 3)) {
            oea.z(i, 3, RenderEvent$$serializer.a.getDescriptor());
            throw null;
        }
        this.auctionId = str;
        this.googleClickEvent = str2;
    }

    public static /* synthetic */ RenderEvent copy$default(RenderEvent renderEvent, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = renderEvent.auctionId;
        }
        if ((i & 2) != 0) {
            str2 = renderEvent.googleClickEvent;
        }
        return renderEvent.copy(str, str2);
    }

    public static final /* synthetic */ void write$Self$google_release(RenderEvent self, wf3 output, SerialDescriptor serialDesc) {
        output.y(serialDesc, 0, self.auctionId);
        output.y(serialDesc, 1, self.googleClickEvent);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getAuctionId() {
        return this.auctionId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getGoogleClickEvent() {
        return this.googleClickEvent;
    }

    @NotNull
    public final RenderEvent copy(@NotNull String auctionId, @NotNull String googleClickEvent) {
        auctionId.getClass();
        googleClickEvent.getClass();
        return new RenderEvent(auctionId, googleClickEvent);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RenderEvent)) {
            return false;
        }
        RenderEvent renderEvent = (RenderEvent) other;
        return Intrinsics.c(this.auctionId, renderEvent.auctionId) && Intrinsics.c(this.googleClickEvent, renderEvent.googleClickEvent);
    }

    @NotNull
    public final String getAuctionId() {
        return this.auctionId;
    }

    @NotNull
    public final String getGoogleClickEvent() {
        return this.googleClickEvent;
    }

    public int hashCode() {
        return this.googleClickEvent.hashCode() + (this.auctionId.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("RenderEvent(auctionId=");
        sb.append(this.auctionId);
        sb.append(", googleClickEvent=");
        return lnb.q(sb, this.googleClickEvent, ')');
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/adsbynimbus/google/RenderEvent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/adsbynimbus/google/RenderEvent;", "google_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return RenderEvent$$serializer.a;
        }

        private Companion() {
        }
    }

    @q5h("na_id")
    public static /* synthetic */ void getAuctionId$annotations() {
    }

    @q5h("ga_click")
    public static /* synthetic */ void getGoogleClickEvent$annotations() {
    }

    public RenderEvent(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        this.auctionId = str;
        this.googleClickEvent = str2;
    }
}
