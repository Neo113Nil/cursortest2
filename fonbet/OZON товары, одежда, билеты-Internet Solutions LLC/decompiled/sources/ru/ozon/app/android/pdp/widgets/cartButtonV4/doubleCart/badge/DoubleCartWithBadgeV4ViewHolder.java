package ru.ozon.app.android.pdp.widgets.cartButtonV4.doubleCart.badge;

import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.pdp.flags.HapticsActionEnabledFlag;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.doubleCart.DoubleCartVO;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.doubleCart.DoubleCartView;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.doubleCart.DoubleCartViewBinder;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.doubleCart.core.BaseDoubleCartV4ViewHolder;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/badge/DoubleCartWithBadgeV4ViewHolder;", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/core/BaseDoubleCartV4ViewHolder;", "Ll10/i;", "container", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartViewBinder;", "binder", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartVO$CartMode;", "mode", "", "hasShadow", "LSc/j;", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartView;", "doubleCartViewLazy", "<init>", "(Ll10/i;Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartViewBinder;Lru/ozon/app/android/network/abtool/FeatureChecker;Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartVO$CartMode;ZLSc/j;)V", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DoubleCartWithBadgeV4ViewHolder extends BaseDoubleCartV4ViewHolder {

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/badge/DoubleCartWithBadgeViewV4;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.pdp.widgets.cartButtonV4.doubleCart.badge.DoubleCartWithBadgeV4ViewHolder$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<DoubleCartWithBadgeViewV4> {
        final /* synthetic */ i $container;
        final /* synthetic */ FeatureChecker $featureChecker;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(i iVar, FeatureChecker featureChecker) {
            super(0);
            this.$container = iVar;
            this.$featureChecker = featureChecker;
        }

        @Override // kotlin.jvm.functions.Function0
        public final DoubleCartWithBadgeViewV4 invoke() {
            Context L11 = this.$container.L();
            Intrinsics.checkNotNullExpressionValue(L11, "<get-context>(...)");
            return new DoubleCartWithBadgeViewV4(L11, this.$featureChecker.isEnabled(HapticsActionEnabledFlag.INSTANCE));
        }
    }

    public /* synthetic */ DoubleCartWithBadgeV4ViewHolder(i iVar, DoubleCartViewBinder doubleCartViewBinder, FeatureChecker featureChecker, DoubleCartVO.CartMode cartMode, boolean z11, InterfaceC4008j interfaceC4008j, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(iVar, doubleCartViewBinder, featureChecker, cartMode, z11, (i11 & 32) != 0 ? k.b(new AnonymousClass1(iVar, featureChecker)) : interfaceC4008j);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DoubleCartWithBadgeV4ViewHolder(@NotNull i container, @NotNull DoubleCartViewBinder binder, @NotNull FeatureChecker featureChecker, @NotNull DoubleCartVO.CartMode mode, boolean z11, @NotNull InterfaceC4008j<? extends DoubleCartView> doubleCartViewLazy) {
        super(container, doubleCartViewLazy, binder, mode, z11);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(binder, "binder");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(doubleCartViewLazy, "doubleCartViewLazy");
    }
}
