package ru.ozon.app.android.geo.map.presentation.selector;

import Dy.ViewOnClickListenerC2883a;
import WZ.t;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import fd.InterfaceC6511n;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.geo.R$layout;
import ru.ozon.app.android.geo.map.data.AddressEditMapDTO;
import ru.ozon.app.android.geo.map.presentation.AddressEditMapVO;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JI\u0010\u0013\u001a\u00020\u000f2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2$\b\u0002\u0010\u0010\u001a\u001e\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000b2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/geo/map/presentation/selector/SwitchButtonsLayout;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$Selector;", "buttonsList", "Lkotlin/Function3;", "", "LWZ/t;", "Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$Selector$Type;", "", "onSelected", "", "isSelectApp", "createItems", "(Ljava/util/List;Lfd/n;Z)V", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SwitchButtonsLayout extends LinearLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitchButtonsLayout(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attributeSet, "attributeSet");
        setGravity(16);
        setOrientation(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createItems$lambda$1$lambda$0(InterfaceC6511n interfaceC6511n, AddressEditMapVO.Selector selector, View view) {
        if (interfaceC6511n != null) {
            String link = selector.getAction().getLink();
            Intrinsics.f(link);
            interfaceC6511n.invoke(link, selector.getEvent(), selector.getType());
        }
    }

    public final void createItems(@NotNull List<AddressEditMapVO.Selector> buttonsList, InterfaceC6511n<? super String, ? super t, ? super AddressEditMapDTO.Selector.Type, Unit> onSelected, boolean isSelectApp) {
        Intrinsics.checkNotNullParameter(buttonsList, "buttonsList");
        removeAllViews();
        int i11 = 0;
        for (Object obj : buttonsList) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            AddressEditMapVO.Selector selector = (AddressEditMapVO.Selector) obj;
            View.inflate(getContext(), isSelectApp ? R$layout.switch_btn_select : R$layout.switch_btn, this);
            View childAt = getChildAt(i11);
            Intrinsics.g(childAt, "null cannot be cast to non-null type android.widget.Button");
            Button button = (Button) childAt;
            button.setActivated(selector.getSelected());
            button.setText(selector.getTitle());
            if (!selector.getSelected()) {
                button.setOnClickListener(new ViewOnClickListenerC2883a(0, onSelected, selector));
            }
            i11 = i12;
        }
    }
}
