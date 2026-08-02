package ru.ozon.app.android.storefront.widgets.appOnboarding.presentation.ui;

import B1.U;
import B1.W;
import B1.m0;
import B1.z0;
import Z1.b;
import Z1.c;
import Z1.l;
import a1.C4912a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.storefront.widgets.appOnboarding.presentation.AppOnboardingVI;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.ds.compose.util.DsSpacings;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LB1/z0;", "LZ1/b;", "constraints", "LB1/W;", "invoke-0kLqBqw", "(LB1/z0;J)LB1/W;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class ContentKt$Page$1$1 extends AbstractC7737t implements Function2<z0, b, W> {
    final /* synthetic */ ImageSizeHelper $imageSizeHelper;
    final /* synthetic */ AppOnboardingVI.Content.Page $state;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LB1/m0$a;", "", "invoke", "(LB1/m0$a;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.storefront.widgets.appOnboarding.presentation.ui.ContentKt$Page$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<m0.a, Unit> {
        final /* synthetic */ long $constraints;
        final /* synthetic */ int $horizontalPaddings;
        final /* synthetic */ m0 $imagePlaceable;
        final /* synthetic */ ImageSizeHelper $imageSizeHelper;
        final /* synthetic */ m0 $subtitlePlaceable;
        final /* synthetic */ z0 $this_SubcomposeLayout;
        final /* synthetic */ m0 $titlePlaceable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(z0 z0Var, m0 m0Var, long j11, ImageSizeHelper imageSizeHelper, m0 m0Var2, int i11, m0 m0Var3) {
            super(1);
            this.$this_SubcomposeLayout = z0Var;
            this.$imagePlaceable = m0Var;
            this.$constraints = j11;
            this.$imageSizeHelper = imageSizeHelper;
            this.$titlePlaceable = m0Var2;
            this.$horizontalPaddings = i11;
            this.$subtitlePlaceable = m0Var3;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(m0.a aVar) {
            invoke2(aVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(m0.a layout) {
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            z0 z0Var = this.$this_SubcomposeLayout;
            DsSpacings dsSpacings = DsSpacings.INSTANCE;
            int Y02 = z0Var.Y0(dsSpacings.m1858getDp56D9Ej5fM());
            layout.d(this.$imagePlaceable, (b.k(this.$constraints) - this.$imageSizeHelper.getImageSizeState()) / 2, Y02, 0.0f);
            int Y03 = this.$this_SubcomposeLayout.Y0(dsSpacings.m1855getDp40D9Ej5fM()) + this.$imageSizeHelper.getImageSizeState() + Y02;
            layout.d(this.$titlePlaceable, Math.max(b.k(this.$constraints) - this.$titlePlaceable.u0(), this.$horizontalPaddings) / 2, Y03, 0.0f);
            int l02 = this.$titlePlaceable.l0() + Y03;
            m0 m0Var = this.$subtitlePlaceable;
            if (m0Var != null) {
                layout.d(m0Var, Math.max(b.k(this.$constraints) - this.$subtitlePlaceable.u0(), this.$horizontalPaddings) / 2, l02, 0.0f);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ContentKt$Page$1$1(AppOnboardingVI.Content.Page page, ImageSizeHelper imageSizeHelper) {
        super(2);
        this.$state = page;
        this.$imageSizeHelper = imageSizeHelper;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ W invoke(z0 z0Var, b bVar) {
        return m1036invoke0kLqBqw(z0Var, bVar.p());
    }

    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
    public final W m1036invoke0kLqBqw(z0 SubcomposeLayout, long j11) {
        W z02;
        Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
        DsSpacings dsSpacings = DsSpacings.INSTANCE;
        int Y02 = SubcomposeLayout.Y0(dsSpacings.m1850getDp24D9Ej5fM()) * 2;
        m0 a02 = SubcomposeLayout.L0(SelectionItemFormDTO.TITLE_FIELD_NAME, new C4912a(true, 1172037518, new ContentKt$Page$1$1$titlePlaceable$1(this.$state))).get(0).a0(b.c(0, b.k(j11) - Y02, 0, 0, 12, j11));
        TextDTO subtitle = this.$state.getSubtitle();
        m0 a03 = subtitle != null ? SubcomposeLayout.L0("subtitle", new C4912a(true, -932079502, new ContentKt$Page$1$1$subtitlePlaceable$1$1(subtitle))).get(0).a0(b.c(0, b.k(j11) - Y02, 0, 0, 12, j11)) : null;
        this.$imageSizeHelper.addSize(Math.min(b.k(j11) - Y02, b.j(j11) - (SubcomposeLayout.Y0(dsSpacings.m1845getDp16D9Ej5fM()) + (SubcomposeLayout.Y0(dsSpacings.m1858getDp56D9Ej5fM()) + (SubcomposeLayout.Y0(dsSpacings.m1855getDp40D9Ej5fM()) + (a02.l0() + (a03 != null ? a03.l0() : 0)))))));
        U u11 = SubcomposeLayout.L0("image", new C4912a(true, 1097866705, new ContentKt$Page$1$1$imagePlaceable$1(this.$state, SubcomposeLayout, this.$imageSizeHelper))).get(0);
        int imageSizeState = this.$imageSizeHelper.getImageSizeState();
        int imageSizeState2 = this.$imageSizeHelper.getImageSizeState();
        if (imageSizeState >= 0 && imageSizeState2 >= 0) {
            z02 = SubcomposeLayout.z0(b.k(j11), b.j(j11), kotlin.collections.U.c(), new AnonymousClass1(SubcomposeLayout, u11.a0(c.i(imageSizeState, imageSizeState, imageSizeState2, imageSizeState2)), j11, this.$imageSizeHelper, a02, Y02, a03));
            return z02;
        }
        l.a("width(" + imageSizeState + ") and height(" + imageSizeState2 + ") must be >= 0");
        throw null;
    }
}
