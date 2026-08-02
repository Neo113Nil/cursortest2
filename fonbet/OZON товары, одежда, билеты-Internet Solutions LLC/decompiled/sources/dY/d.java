package dY;

import android.view.View;
import ru.ozon.app.android.marketing.widgets.bigPromoNavbar.presentation.BigPromoNavbarViewHolder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.TileGrid2ViewHolder;
import ru.ozon.composer.ui.widget.k;

/* loaded from: classes7.dex */
public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f61429a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f61430b;

    public /* synthetic */ d(int i11, k kVar) {
        this.f61429a = i11;
        this.f61430b = kVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f61429a) {
            case 0:
                TileGrid2ViewHolder.lambda$8$lambda$6((TileGrid2ViewHolder) this.f61430b, view);
                break;
            default:
                BigPromoNavbarViewHolder._init_$lambda$0((BigPromoNavbarViewHolder) this.f61430b, view);
                break;
        }
    }
}
