package ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation;

import android.view.ViewPropertyAnimator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/FadeAnimRefs;", "", "Landroid/view/ViewPropertyAnimator;", "start", "end", "<init>", "(Landroid/view/ViewPropertyAnimator;Landroid/view/ViewPropertyAnimator;)V", "", "cancel", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/view/ViewPropertyAnimator;", "getStart", "()Landroid/view/ViewPropertyAnimator;", "setStart", "(Landroid/view/ViewPropertyAnimator;)V", "getEnd", "setEnd", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class FadeAnimRefs {
    private ViewPropertyAnimator end;
    private ViewPropertyAnimator start;

    /* JADX WARN: Multi-variable type inference failed */
    public FadeAnimRefs() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final void cancel() {
        ViewPropertyAnimator viewPropertyAnimator = this.start;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.end;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
        }
        this.start = null;
        this.end = null;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FadeAnimRefs)) {
            return false;
        }
        FadeAnimRefs fadeAnimRefs = (FadeAnimRefs) other;
        return Intrinsics.d(this.start, fadeAnimRefs.start) && Intrinsics.d(this.end, fadeAnimRefs.end);
    }

    public final ViewPropertyAnimator getEnd() {
        return this.end;
    }

    public final ViewPropertyAnimator getStart() {
        return this.start;
    }

    public int hashCode() {
        ViewPropertyAnimator viewPropertyAnimator = this.start;
        int hashCode = (viewPropertyAnimator == null ? 0 : viewPropertyAnimator.hashCode()) * 31;
        ViewPropertyAnimator viewPropertyAnimator2 = this.end;
        return hashCode + (viewPropertyAnimator2 != null ? viewPropertyAnimator2.hashCode() : 0);
    }

    public final void setEnd(ViewPropertyAnimator viewPropertyAnimator) {
        this.end = viewPropertyAnimator;
    }

    public final void setStart(ViewPropertyAnimator viewPropertyAnimator) {
        this.start = viewPropertyAnimator;
    }

    @NotNull
    public String toString() {
        return "FadeAnimRefs(start=" + this.start + ", end=" + this.end + ")";
    }

    public FadeAnimRefs(ViewPropertyAnimator viewPropertyAnimator, ViewPropertyAnimator viewPropertyAnimator2) {
        this.start = viewPropertyAnimator;
        this.end = viewPropertyAnimator2;
    }

    public /* synthetic */ FadeAnimRefs(ViewPropertyAnimator viewPropertyAnimator, ViewPropertyAnimator viewPropertyAnimator2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : viewPropertyAnimator, (i11 & 2) != 0 ? null : viewPropertyAnimator2);
    }
}
