package com.blaze.ima;

import androidx.annotation.Keep;
import com.blaze.blazesdk.ads.models.ui.BlazeContentExtraInfo;
import defpackage.wx4;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0004HÖ\u0001R(\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/blaze/ima/BlazeIMAAdRequestInformation;", "", "contentExtraInfo", "", "", "extraInfo", "Lcom/blaze/blazesdk/ads/models/ui/BlazeContentExtraInfo;", "<init>", "(Ljava/util/Map;Lcom/blaze/blazesdk/ads/models/ui/BlazeContentExtraInfo;)V", "getContentExtraInfo$annotations", "()V", "getContentExtraInfo", "()Ljava/util/Map;", "getExtraInfo", "()Lcom/blaze/blazesdk/ads/models/ui/BlazeContentExtraInfo;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "blaze_ima_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BlazeIMAAdRequestInformation {

    @NotNull
    private final Map<String, String> contentExtraInfo;

    @NotNull
    private final BlazeContentExtraInfo extraInfo;

    public BlazeIMAAdRequestInformation(@NotNull Map<String, String> map, @NotNull BlazeContentExtraInfo blazeContentExtraInfo) {
        map.getClass();
        blazeContentExtraInfo.getClass();
        this.contentExtraInfo = map;
        this.extraInfo = blazeContentExtraInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BlazeIMAAdRequestInformation copy$default(BlazeIMAAdRequestInformation blazeIMAAdRequestInformation, Map map, BlazeContentExtraInfo blazeContentExtraInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            map = blazeIMAAdRequestInformation.contentExtraInfo;
        }
        if ((i & 2) != 0) {
            blazeContentExtraInfo = blazeIMAAdRequestInformation.extraInfo;
        }
        return blazeIMAAdRequestInformation.copy(map, blazeContentExtraInfo);
    }

    @NotNull
    public final Map<String, String> component1() {
        return this.contentExtraInfo;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final BlazeContentExtraInfo getExtraInfo() {
        return this.extraInfo;
    }

    @NotNull
    public final BlazeIMAAdRequestInformation copy(@NotNull Map<String, String> contentExtraInfo, @NotNull BlazeContentExtraInfo extraInfo) {
        contentExtraInfo.getClass();
        extraInfo.getClass();
        return new BlazeIMAAdRequestInformation(contentExtraInfo, extraInfo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlazeIMAAdRequestInformation)) {
            return false;
        }
        BlazeIMAAdRequestInformation blazeIMAAdRequestInformation = (BlazeIMAAdRequestInformation) other;
        return Intrinsics.c(this.contentExtraInfo, blazeIMAAdRequestInformation.contentExtraInfo) && Intrinsics.c(this.extraInfo, blazeIMAAdRequestInformation.extraInfo);
    }

    @NotNull
    public final Map<String, String> getContentExtraInfo() {
        return this.contentExtraInfo;
    }

    @NotNull
    public final BlazeContentExtraInfo getExtraInfo() {
        return this.extraInfo;
    }

    public int hashCode() {
        return this.extraInfo.hashCode() + (this.contentExtraInfo.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "BlazeIMAAdRequestInformation(contentExtraInfo=" + this.contentExtraInfo + ", extraInfo=" + this.extraInfo + ')';
    }

    @wx4
    public static /* synthetic */ void getContentExtraInfo$annotations() {
    }
}
