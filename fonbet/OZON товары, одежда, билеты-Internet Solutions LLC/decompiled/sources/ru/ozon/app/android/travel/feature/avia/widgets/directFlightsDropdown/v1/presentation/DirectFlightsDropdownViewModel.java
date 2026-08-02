package ru.ozon.app.android.travel.feature.avia.widgets.directFlightsDropdown.v1.presentation;

import Ae.B0;
import Ae.C0;
import Ae.C2399j;
import Ae.E0;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import WZ.t;
import androidx.lifecycle.w0;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.widgets.directFlightsDropdown.v1.presentation.DirectFlightsDropdownVO;
import xe.C10727i;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0003R\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001f\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/directFlightsDropdown/v1/presentation/DirectFlightsDropdownViewModel;", "Landroidx/lifecycle/w0;", "<init>", "()V", "Lru/ozon/app/android/travel/feature/avia/widgets/directFlightsDropdown/v1/presentation/DirectFlightsDropdownVO$ExpandCollapseButtonVO;", "expandCollapseButton", "", "sendAnalyticsEvent", "(Lru/ozon/app/android/travel/feature/avia/widgets/directFlightsDropdown/v1/presentation/DirectFlightsDropdownVO$ExpandCollapseButtonVO;)V", "", "isExpanded", "Lru/ozon/app/android/travel/feature/avia/widgets/directFlightsDropdown/v1/presentation/DirectFlightsDropdownVO;", "data", "getNewState", "(ZLru/ozon/app/android/travel/feature/avia/widgets/directFlightsDropdown/v1/presentation/DirectFlightsDropdownVO;)Lru/ozon/app/android/travel/feature/avia/widgets/directFlightsDropdown/v1/presentation/DirectFlightsDropdownVO;", "bind", "(Lru/ozon/app/android/travel/feature/avia/widgets/directFlightsDropdown/v1/presentation/DirectFlightsDropdownVO;)V", "switchExpandedState", "LAe/x0;", "_widgetState", "LAe/x0;", "LAe/M0;", "widgetState", "LAe/M0;", "getWidgetState", "()LAe/M0;", "LAe/w0;", "LWZ/t;", "_widgetAnalyticsEvents", "LAe/w0;", "LAe/B0;", "widgetAnalyticsEvents", "LAe/B0;", "getWidgetAnalyticsEvents", "()LAe/B0;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DirectFlightsDropdownViewModel extends w0 {

    @NotNull
    private final Ae.w0<t> _widgetAnalyticsEvents;

    @NotNull
    private final x0<DirectFlightsDropdownVO> _widgetState;

    @NotNull
    private final B0<t> widgetAnalyticsEvents;

    @NotNull
    private final M0<DirectFlightsDropdownVO> widgetState;

    public DirectFlightsDropdownViewModel() {
        x0<DirectFlightsDropdownVO> a11 = O0.a(null);
        this._widgetState = a11;
        this.widgetState = C2399j.b(a11);
        C0 b11 = E0.b(0, 0, null, 7);
        this._widgetAnalyticsEvents = b11;
        this.widgetAnalyticsEvents = C2399j.a(b11);
    }

    private final DirectFlightsDropdownVO getNewState(boolean isExpanded, DirectFlightsDropdownVO data) {
        List K02 = C7714v.K0(data.getItems(), isExpanded ? data.getItems().size() : data.getInitialVisibleItemsCount());
        DirectFlightsDropdownVO.ExpandCollapseButtonVO expandCollapseButton = data.getExpandCollapseButton();
        return DirectFlightsDropdownVO.copy$default(data, 0L, null, 0, null, K02, null, expandCollapseButton != null ? DirectFlightsDropdownVO.ExpandCollapseButtonVO.copy$default(expandCollapseButton, null, null, null, null, null, isExpanded, 31, null) : null, null, 175, null);
    }

    private final void sendAnalyticsEvent(DirectFlightsDropdownVO.ExpandCollapseButtonVO expandCollapseButton) {
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new DirectFlightsDropdownViewModel$sendAnalyticsEvent$1(expandCollapseButton.getIsExpanded(), expandCollapseButton, this, null), 3);
    }

    public final void bind(@NotNull DirectFlightsDropdownVO data) {
        Intrinsics.checkNotNullParameter(data, "data");
        x0<DirectFlightsDropdownVO> x0Var = this._widgetState;
        DirectFlightsDropdownVO value = x0Var.getValue();
        if (value != null) {
            DirectFlightsDropdownVO.ExpandCollapseButtonVO expandCollapseButton = value.getExpandCollapseButton();
            DirectFlightsDropdownVO newState = getNewState(expandCollapseButton != null ? expandCollapseButton.getIsExpanded() : false, data);
            if (newState != null) {
                data = newState;
            }
        }
        x0Var.setValue(data);
    }

    @NotNull
    public final B0<t> getWidgetAnalyticsEvents() {
        return this.widgetAnalyticsEvents;
    }

    @NotNull
    public final M0<DirectFlightsDropdownVO> getWidgetState() {
        return this.widgetState;
    }

    public final void switchExpandedState() {
        DirectFlightsDropdownVO directFlightsDropdownVO;
        x0<DirectFlightsDropdownVO> x0Var = this._widgetState;
        DirectFlightsDropdownVO value = x0Var.getValue();
        if (value != null) {
            DirectFlightsDropdownVO.ExpandCollapseButtonVO expandCollapseButton = value.getExpandCollapseButton();
            if (expandCollapseButton != null) {
                sendAnalyticsEvent(expandCollapseButton);
            }
            DirectFlightsDropdownVO.ExpandCollapseButtonVO expandCollapseButton2 = value.getExpandCollapseButton();
            boolean z11 = false;
            if (expandCollapseButton2 != null && !expandCollapseButton2.getIsExpanded()) {
                z11 = true;
            }
            directFlightsDropdownVO = getNewState(z11, value);
        } else {
            directFlightsDropdownVO = null;
        }
        x0Var.setValue(directFlightsDropdownVO);
    }
}
