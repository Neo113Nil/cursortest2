package ru.ozon.app.android.common.filterWidgets.filters.common;

import CD.a;
import Dc0.m;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JB\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filters/common/Utils;", "", "<init>", "()V", "setClickableZones", "", "clickableArea", "Landroid/view/View;", "rightButton", "Lru/ozon/uni/atoms/v3/containers/SingleAtom;", "rightIcon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "callback", "Lkotlin/Function0;", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class Utils {

    @NotNull
    public static final Utils INSTANCE = new Utils();

    private Utils() {
    }

    public final void setClickableZones(@NotNull View clickableArea, @NotNull SingleAtom rightButton, IconDTO rightIcon, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull Function0<Unit> callback) {
        Intrinsics.checkNotNullParameter(clickableArea, "clickableArea");
        Intrinsics.checkNotNullParameter(rightButton, "rightButton");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (rightIcon == null) {
            clickableArea.setOnClickListener(new a(callback, 1));
            rightButton.setOnClickListener(null);
            rightButton.setOnAction(actionHandler);
        } else {
            clickableArea.setOnClickListener(null);
            rightButton.setOnAction(null);
            rightButton.setOnClickListener(new m(callback, 3));
        }
    }
}
