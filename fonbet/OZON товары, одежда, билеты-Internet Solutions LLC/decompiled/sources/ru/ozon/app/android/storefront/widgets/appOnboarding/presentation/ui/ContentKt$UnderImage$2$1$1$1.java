package ru.ozon.app.android.storefront.widgets.appOnboarding.presentation.ui;

import P9.a;
import i1.C6987g;
import i1.C6992l;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;
import l1.C7807Z;
import l1.w0;
import n1.InterfaceC8410c;
import n1.InterfaceC8412e;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Li1/g;", "Li1/l;", "invoke", "(Li1/g;)Li1/l;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class ContentKt$UnderImage$2$1$1$1 extends AbstractC7737t implements Function1<C6987g, C6992l> {
    final /* synthetic */ long $endGradientColor;
    final /* synthetic */ long $startGradientColor;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln1/c;", "", "invoke", "(Ln1/c;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.storefront.widgets.appOnboarding.presentation.ui.ContentKt$UnderImage$2$1$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<InterfaceC8410c, Unit> {
        final /* synthetic */ long $endGradientColor;
        final /* synthetic */ long $startGradientColor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(long j11, long j12) {
            super(1);
            this.$startGradientColor = j11;
            this.$endGradientColor = j12;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC8410c interfaceC8410c) {
            invoke2(interfaceC8410c);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(InterfaceC8410c onDrawWithContent) {
            Intrinsics.checkNotNullParameter(onDrawWithContent, "$this$onDrawWithContent");
            onDrawWithContent.F0();
            AbstractC7799Q.a aVar = AbstractC7799Q.Companion;
            List b02 = C7714v.b0(C7807Z.m(this.$startGradientColor), C7807Z.m(this.$endGradientColor));
            long a11 = a.a(UiExtKt.toPxF(57.0f), UiExtKt.toPxF(234.0f));
            float pxF = UiExtKt.toPxF(274.0f);
            aVar.getClass();
            InterfaceC8412e.k0(onDrawWithContent, new w0(pxF, a11, null, b02), 0L, 0L, 0.0f, null, 9, 62);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ContentKt$UnderImage$2$1$1$1(long j11, long j12) {
        super(1);
        this.$startGradientColor = j11;
        this.$endGradientColor = j12;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C6992l invoke(C6987g drawWithCache) {
        Intrinsics.checkNotNullParameter(drawWithCache, "$this$drawWithCache");
        return drawWithCache.t(new AnonymousClass1(this.$startGradientColor, this.$endGradientColor));
    }
}
