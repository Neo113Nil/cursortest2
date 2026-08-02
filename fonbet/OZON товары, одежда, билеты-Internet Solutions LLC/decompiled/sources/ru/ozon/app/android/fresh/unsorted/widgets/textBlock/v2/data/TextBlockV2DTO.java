package ru.ozon.app.android.fresh.unsorted.widgets.textBlock.v2.data;

import Kk.C3532b;
import T7.P;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u0017\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0003J5\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000eR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/textBlock/v2/data/TextBlockV2DTO;", "", "text", "Lru/ozon/uni/atoms/data/text/TextDTO;", "isTagSupported", "", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;ZLjava/util/Map;)V", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "()Z", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class TextBlockV2DTO {
    public static final int $stable = 8;
    private final boolean isTagSupported;

    @NotNull
    private final TextDTO text;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public TextBlockV2DTO(@NotNull TextDTO text, boolean z11, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.text = text;
        this.isTagSupported = z11;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TextBlockV2DTO copy$default(TextBlockV2DTO textBlockV2DTO, TextDTO textDTO, boolean z11, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = textBlockV2DTO.text;
        }
        if ((i11 & 2) != 0) {
            z11 = textBlockV2DTO.isTagSupported;
        }
        if ((i11 & 4) != 0) {
            map = textBlockV2DTO.trackingInfo;
        }
        return textBlockV2DTO.copy(textDTO, z11, map);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsTagSupported() {
        return this.isTagSupported;
    }

    public final Map<String, TokenizedTrackingInfo> component3() {
        return this.trackingInfo;
    }

    @NotNull
    public final TextBlockV2DTO copy(@NotNull TextDTO text, boolean isTagSupported, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new TextBlockV2DTO(text, isTagSupported, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextBlockV2DTO)) {
            return false;
        }
        TextBlockV2DTO textBlockV2DTO = (TextBlockV2DTO) other;
        return Intrinsics.d(this.text, textBlockV2DTO.text) && this.isTagSupported == textBlockV2DTO.isTagSupported && Intrinsics.d(this.trackingInfo, textBlockV2DTO.trackingInfo);
    }

    @NotNull
    public final TextDTO getText() {
        return this.text;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int a11 = C3532b.a(this.text.hashCode() * 31, 31, this.isTagSupported);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return a11 + (map == null ? 0 : map.hashCode());
    }

    public final boolean isTagSupported() {
        return this.isTagSupported;
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.text;
        boolean z11 = this.isTagSupported;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("TextBlockV2DTO(text=");
        sb2.append(textDTO);
        sb2.append(", isTagSupported=");
        sb2.append(z11);
        sb2.append(", trackingInfo=");
        return P.f(sb2, map, ")");
    }

    public /* synthetic */ TextBlockV2DTO(TextDTO textDTO, boolean z11, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(textDTO, (i11 & 2) != 0 ? false : z11, (i11 & 4) != 0 ? null : map);
    }
}
