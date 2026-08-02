package ru.ozon.app.android.favorites.ui.favoritebutton.favoriteentity.composeDelegate;

import WZ.l;
import a00.C4911f;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\n\u0010\t\u001a\u00060\u0007j\u0002`\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\u0010\u000e\u001a\u00060\fj\u0002`\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001b\u0010\t\u001a\u00060\u0007j\u0002`\b8\u0006¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b%\u0010&R\u001b\u0010\u000e\u001a\u00060\fj\u0002`\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteentity/composeDelegate/ComposeWidgetInfo;", "", "", "widgetId", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "La00/f;", "Lru/ozon/app/android/composer/OwnerContainer;", "ownerContainer", "Landroidx/lifecycle/J;", "lifecycleOwner", "Ll10/b;", "Lru/ozon/app/android/composer/ComposerController;", "composerController", "<init>", "(JLWZ/l;La00/f;Landroidx/lifecycle/J;Ll10/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getWidgetId", "()J", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "La00/f;", "getOwnerContainer", "()La00/f;", "Landroidx/lifecycle/J;", "getLifecycleOwner", "()Landroidx/lifecycle/J;", "Ll10/b;", "getComposerController", "()Ll10/b;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ComposeWidgetInfo {

    @NotNull
    private final InterfaceC7851b composerController;

    @NotNull
    private final J lifecycleOwner;

    @NotNull
    private final C4911f ownerContainer;

    @NotNull
    private final l tokenizedAnalytics;
    private final long widgetId;

    public ComposeWidgetInfo(long j11, @NotNull l tokenizedAnalytics, @NotNull C4911f ownerContainer, @NotNull J lifecycleOwner, @NotNull InterfaceC7851b composerController) {
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(ownerContainer, "ownerContainer");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(composerController, "composerController");
        this.widgetId = j11;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.ownerContainer = ownerContainer;
        this.lifecycleOwner = lifecycleOwner;
        this.composerController = composerController;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ComposeWidgetInfo)) {
            return false;
        }
        ComposeWidgetInfo composeWidgetInfo = (ComposeWidgetInfo) other;
        return this.widgetId == composeWidgetInfo.widgetId && Intrinsics.d(this.tokenizedAnalytics, composeWidgetInfo.tokenizedAnalytics) && Intrinsics.d(this.ownerContainer, composeWidgetInfo.ownerContainer) && Intrinsics.d(this.lifecycleOwner, composeWidgetInfo.lifecycleOwner) && Intrinsics.d(this.composerController, composeWidgetInfo.composerController);
    }

    @NotNull
    public final InterfaceC7851b getComposerController() {
        return this.composerController;
    }

    @NotNull
    public final J getLifecycleOwner() {
        return this.lifecycleOwner;
    }

    @NotNull
    public final C4911f getOwnerContainer() {
        return this.ownerContainer;
    }

    @NotNull
    public final l getTokenizedAnalytics() {
        return this.tokenizedAnalytics;
    }

    public final long getWidgetId() {
        return this.widgetId;
    }

    public int hashCode() {
        return this.composerController.hashCode() + ((this.lifecycleOwner.hashCode() + ((this.ownerContainer.hashCode() + ((this.tokenizedAnalytics.hashCode() + (Long.hashCode(this.widgetId) * 31)) * 31)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "ComposeWidgetInfo(widgetId=" + this.widgetId + ", tokenizedAnalytics=" + this.tokenizedAnalytics + ", ownerContainer=" + this.ownerContainer + ", lifecycleOwner=" + this.lifecycleOwner + ", composerController=" + this.composerController + ")";
    }
}
