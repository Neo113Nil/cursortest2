package ru.ozon.app.android.pdp.widgets.aspectProductV2.presentation;

import Go.e;
import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import d20.AbstractC6065b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import v10.C10183a;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u000bJ\u000f\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001e¨\u0006\""}, d2 = {"Lru/ozon/app/android/pdp/widgets/aspectProductV2/presentation/AspectProductV2ViewHolder;", "Ld20/b;", "Lru/ozon/app/android/pdp/widgets/aspectProductV2/presentation/AspectProductV2VO;", "Ll10/i;", "container", "Lru/ozon/app/android/composer/ComposerNavigator;", "composerNavigator", "<init>", "(Ll10/i;Lru/ozon/app/android/composer/ComposerNavigator;)V", "", "onWidgetCreated", "()V", "addView", "item", "bind", "(Lru/ozon/app/android/pdp/widgets/aspectProductV2/presentation/AspectProductV2VO;)V", "removeView", "onWidgetDestroyed", "Ll10/i;", "Lru/ozon/app/android/composer/ComposerNavigator;", "Landroid/graphics/drawable/Drawable;", "parentInitialBackground", "Landroid/graphics/drawable/Drawable;", "Landroid/widget/LinearLayout;", "parent", "Landroid/widget/LinearLayout;", "Lru/ozon/app/android/pdp/widgets/aspectProductV2/presentation/AspectProductV2View;", "view$delegate", "LSc/j;", "getView", "()Lru/ozon/app/android/pdp/widgets/aspectProductV2/presentation/AspectProductV2View;", "view", "getMetricView", "metricView", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AspectProductV2ViewHolder extends AbstractC6065b<AspectProductV2VO> {

    @NotNull
    private final ComposerNavigator composerNavigator;

    @NotNull
    private final i container;

    @NotNull
    private final LinearLayout parent;
    private Drawable parentInitialBackground;

    /* renamed from: view$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j view;

    public AspectProductV2ViewHolder(@NotNull i container, @NotNull ComposerNavigator composerNavigator) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(composerNavigator, "composerNavigator");
        this.container = container;
        this.composerNavigator = composerNavigator;
        LinearLayout o11 = C10183a.o(container.Y());
        o11.setClickable(true);
        this.parent = o11;
        this.view = k.b(new AspectProductV2ViewHolder$view$2(this));
        getView().setOnClickListener(new e(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(AspectProductV2ViewHolder aspectProductV2ViewHolder, View view) {
        String deeplink;
        AspectProductV2VO boundData = aspectProductV2ViewHolder.getBoundData();
        if (boundData == null || (deeplink = boundData.getDeeplink()) == null) {
            return;
        }
        ComposerNavigator.DefaultImpls.openDeeplink$default(aspectProductV2ViewHolder.composerNavigator, deeplink, null, 2, null);
    }

    private final AspectProductV2View getView() {
        return (AspectProductV2View) this.view.getValue();
    }

    @Override // d20.AbstractC6065b
    public void addView() {
        this.parent.addView(getView());
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        super.onWidgetCreated();
        this.parentInitialBackground = this.parent.getBackground();
        LinearLayout linearLayout = this.parent;
        Context L11 = this.container.L();
        Intrinsics.checkNotNullExpressionValue(L11, "<get-context>(...)");
        linearLayout.setBackgroundColor(ThemeExtKt.themeColor(L11, R$attr.layerFloor1));
    }

    @Override // d20.AbstractC6065b
    public void onWidgetDestroyed() {
        super.onWidgetDestroyed();
        this.parent.setBackground(this.parentInitialBackground);
        this.parentInitialBackground = null;
    }

    @Override // d20.AbstractC6065b
    public void removeView() {
        this.parent.removeView(getView());
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull AspectProductV2VO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        getView().bind(item);
    }

    @Override // d20.AbstractC6065b
    @NotNull
    public AspectProductV2View getMetricView() {
        return getView();
    }
}
