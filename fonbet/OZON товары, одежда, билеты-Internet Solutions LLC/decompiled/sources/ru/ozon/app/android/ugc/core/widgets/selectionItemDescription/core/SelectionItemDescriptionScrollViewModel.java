package ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.core;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import h20.InterfaceC6786a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.data.SelectionItemDescriptionDTO;
import ze.C11115c;
import ze.h;
import ze.k;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0004J\u0015\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\u0004R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/selectionItemDescription/core/SelectionItemDescriptionScrollViewModel;", "Lh20/a;", "Lru/ozon/app/android/composer/viewmodel/ComposerWidgetViewModel;", "<init>", "()V", "", "onCleared", "Lru/ozon/app/android/ugc/core/widgets/selectionItemDescription/data/SelectionItemDescriptionDTO$ScrollPosition;", "scrollPosition", "setPendingScroll", "(Lru/ozon/app/android/ugc/core/widgets/selectionItemDescription/data/SelectionItemDescriptionDTO$ScrollPosition;)V", "markScrollConsumed", "Lze/h;", "_scrollEvent", "Lze/h;", "LAe/h;", "scrollEvent", "LAe/h;", "getScrollEvent", "()LAe/h;", "", "scrollDone", "Z", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SelectionItemDescriptionScrollViewModel implements InterfaceC6786a {

    @NotNull
    private final h<SelectionItemDescriptionDTO.ScrollPosition> _scrollEvent;
    private boolean scrollDone;

    @NotNull
    private final InterfaceC2395h<SelectionItemDescriptionDTO.ScrollPosition> scrollEvent;

    public SelectionItemDescriptionScrollViewModel() {
        C11115c a11 = k.a(-1, 6, null);
        this._scrollEvent = a11;
        this.scrollEvent = C2399j.H(a11);
    }

    @NotNull
    public final InterfaceC2395h<SelectionItemDescriptionDTO.ScrollPosition> getScrollEvent() {
        return this.scrollEvent;
    }

    public final void markScrollConsumed() {
        this.scrollDone = true;
    }

    @Override // h20.InterfaceC6786a
    public void onCleared() {
        this._scrollEvent.l(null);
    }

    public final void setPendingScroll(@NotNull SelectionItemDescriptionDTO.ScrollPosition scrollPosition) {
        Intrinsics.checkNotNullParameter(scrollPosition, "scrollPosition");
        if (scrollPosition == SelectionItemDescriptionDTO.ScrollPosition.NONE || this.scrollDone) {
            return;
        }
        this._scrollEvent.b(scrollPosition);
    }
}
