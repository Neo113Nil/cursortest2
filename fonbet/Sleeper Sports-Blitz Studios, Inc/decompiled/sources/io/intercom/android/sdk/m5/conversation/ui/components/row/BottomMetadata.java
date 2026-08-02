package io.intercom.android.sdk.m5.conversation.ui.components.row;

import androidx.compose.ui.unit.Dp;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ClickableMessageRow.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0013\u0010\rJ\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J.\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÇ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001a\u001a\u00020\u001bH×\u0001J\t\u0010\u001c\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/ui/components/row/BottomMetadata;", "", "text", "", ViewProps.PADDING, "Landroidx/compose/ui/unit/Dp;", "alwaysShow", "", "<init>", "(Ljava/lang/String;FZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getText", "()Ljava/lang/String;", "getPadding-D9Ej5fM", "()F", "F", "getAlwaysShow", "()Z", "component1", "component2", "component2-D9Ej5fM", "component3", "copy", "copy-lG28NQ4", "(Ljava/lang/String;FZ)Lio/intercom/android/sdk/m5/conversation/ui/components/row/BottomMetadata;", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class BottomMetadata {
    public static final int $stable = 0;
    private final boolean alwaysShow;
    private final float padding;
    private final String text;

    public /* synthetic */ BottomMetadata(String str, float f, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, f, z);
    }

    /* renamed from: copy-lG28NQ4$default, reason: not valid java name */
    public static /* synthetic */ BottomMetadata m12322copylG28NQ4$default(BottomMetadata bottomMetadata, String str, float f, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bottomMetadata.text;
        }
        if ((i & 2) != 0) {
            f = bottomMetadata.padding;
        }
        if ((i & 4) != 0) {
            z = bottomMetadata.alwaysShow;
        }
        return bottomMetadata.m12324copylG28NQ4(str, f, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component2-D9Ej5fM, reason: not valid java name and from getter */
    public final float getPadding() {
        return this.padding;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getAlwaysShow() {
        return this.alwaysShow;
    }

    /* renamed from: copy-lG28NQ4, reason: not valid java name */
    public final BottomMetadata m12324copylG28NQ4(String text, float padding, boolean alwaysShow) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new BottomMetadata(text, padding, alwaysShow, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BottomMetadata)) {
            return false;
        }
        BottomMetadata bottomMetadata = (BottomMetadata) other;
        return Intrinsics.areEqual(this.text, bottomMetadata.text) && Dp.m8803equalsimpl0(this.padding, bottomMetadata.padding) && this.alwaysShow == bottomMetadata.alwaysShow;
    }

    public int hashCode() {
        return (((this.text.hashCode() * 31) + Dp.m8804hashCodeimpl(this.padding)) * 31) + Boolean.hashCode(this.alwaysShow);
    }

    public String toString() {
        return "BottomMetadata(text=" + this.text + ", padding=" + ((Object) Dp.m8809toStringimpl(this.padding)) + ", alwaysShow=" + this.alwaysShow + ')';
    }

    private BottomMetadata(String text, float f, boolean z) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.text = text;
        this.padding = f;
        this.alwaysShow = z;
    }

    public final String getText() {
        return this.text;
    }

    /* renamed from: getPadding-D9Ej5fM, reason: not valid java name */
    public final float m12325getPaddingD9Ej5fM() {
        return this.padding;
    }

    public final boolean getAlwaysShow() {
        return this.alwaysShow;
    }

    public /* synthetic */ BottomMetadata(String str, float f, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? Dp.m8798constructorimpl(4) : f, (i & 4) != 0 ? false : z, null);
    }
}
