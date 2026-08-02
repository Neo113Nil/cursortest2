package io.intercom.android.sdk.ui.theme;

import androidx.compose.ui.graphics.Color;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: IntercomColors.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u000f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0010\u0010\tJ\u0010\u0010\u0011\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0012\u0010\tJ.\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0019\u001a\u00020\u001aH×\u0001J\t\u0010\u001b\u001a\u00020\u001cH×\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\tR\u0013\u0010\u0005\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\f\u0010\t¨\u0006\u001d"}, d2 = {"Lio/intercom/android/sdk/ui/theme/IntercomBaseColors;", "", "base", "Landroidx/compose/ui/graphics/Color;", MetricTracker.Object.INPUT, "inputAlt", "<init>", "(JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBase-0d7_KjU", "()J", "J", "getInput-0d7_KjU", "getInputAlt-0d7_KjU", "component1", "component1-0d7_KjU", "component2", "component2-0d7_KjU", "component3", "component3-0d7_KjU", "copy", "copy-ysEtTa8", "(JJJ)Lio/intercom/android/sdk/ui/theme/IntercomBaseColors;", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class IntercomBaseColors {
    public static final int $stable = 0;
    private final long base;
    private final long input;
    private final long inputAlt;

    public /* synthetic */ IntercomBaseColors(long j, long j2, long j3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3);
    }

    /* renamed from: copy-ysEtTa8$default, reason: not valid java name */
    public static /* synthetic */ IntercomBaseColors m13042copyysEtTa8$default(IntercomBaseColors intercomBaseColors, long j, long j2, long j3, int i, Object obj) {
        if ((i & 1) != 0) {
            j = intercomBaseColors.base;
        }
        long j4 = j;
        if ((i & 2) != 0) {
            j2 = intercomBaseColors.input;
        }
        long j5 = j2;
        if ((i & 4) != 0) {
            j3 = intercomBaseColors.inputAlt;
        }
        return intercomBaseColors.m13046copyysEtTa8(j4, j5, j3);
    }

    /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
    public final long getBase() {
        return this.base;
    }

    /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
    public final long getInput() {
        return this.input;
    }

    /* renamed from: component3-0d7_KjU, reason: not valid java name and from getter */
    public final long getInputAlt() {
        return this.inputAlt;
    }

    /* renamed from: copy-ysEtTa8, reason: not valid java name */
    public final IntercomBaseColors m13046copyysEtTa8(long base, long input, long inputAlt) {
        return new IntercomBaseColors(base, input, inputAlt, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IntercomBaseColors)) {
            return false;
        }
        IntercomBaseColors intercomBaseColors = (IntercomBaseColors) other;
        return Color.m6040equalsimpl0(this.base, intercomBaseColors.base) && Color.m6040equalsimpl0(this.input, intercomBaseColors.input) && Color.m6040equalsimpl0(this.inputAlt, intercomBaseColors.inputAlt);
    }

    public int hashCode() {
        return (((Color.m6046hashCodeimpl(this.base) * 31) + Color.m6046hashCodeimpl(this.input)) * 31) + Color.m6046hashCodeimpl(this.inputAlt);
    }

    public String toString() {
        return "IntercomBaseColors(base=" + ((Object) Color.m6047toStringimpl(this.base)) + ", input=" + ((Object) Color.m6047toStringimpl(this.input)) + ", inputAlt=" + ((Object) Color.m6047toStringimpl(this.inputAlt)) + ')';
    }

    private IntercomBaseColors(long j, long j2, long j3) {
        this.base = j;
        this.input = j2;
        this.inputAlt = j3;
    }

    /* renamed from: getBase-0d7_KjU, reason: not valid java name */
    public final long m13047getBase0d7_KjU() {
        return this.base;
    }

    /* renamed from: getInput-0d7_KjU, reason: not valid java name */
    public final long m13048getInput0d7_KjU() {
        return this.input;
    }

    /* renamed from: getInputAlt-0d7_KjU, reason: not valid java name */
    public final long m13049getInputAlt0d7_KjU() {
        return this.inputAlt;
    }
}
