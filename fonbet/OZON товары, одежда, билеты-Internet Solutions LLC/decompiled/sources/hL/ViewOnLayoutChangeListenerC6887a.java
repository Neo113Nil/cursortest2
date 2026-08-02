package hL;

import android.view.View;
import ru.ozon.app.android.commonwidgets.widgets.curtainSettings.presentation.CurtainSettingsViewHolder;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.managers.ShellNavBarCornersManagerImpl;
import ru.ozon.app.android.travel.molecules.view.input.TravelEditTextInputLayoutV2;

/* renamed from: hL.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class ViewOnLayoutChangeListenerC6887a implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f65212a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f65213b;

    public /* synthetic */ ViewOnLayoutChangeListenerC6887a(Object obj, int i11) {
        this.f65212a = i11;
        this.f65213b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        switch (this.f65212a) {
            case 0:
                ShellNavBarCornersManagerImpl.cornerRadiusListener$lambda$1((ShellNavBarCornersManagerImpl) this.f65213b, view, i11, i12, i13, i14, i15, i16, i17, i18);
                break;
            case 1:
                TravelEditTextInputLayoutV2.updateLayout$default((TravelEditTextInputLayoutV2) this.f65213b, false, 1, null);
                break;
            default:
                CurtainSettingsViewHolder.onContainerLayoutChanged$lambda$1((CurtainSettingsViewHolder) this.f65213b, view, i11, i12, i13, i14, i15, i16, i17, i18);
                break;
        }
    }
}
