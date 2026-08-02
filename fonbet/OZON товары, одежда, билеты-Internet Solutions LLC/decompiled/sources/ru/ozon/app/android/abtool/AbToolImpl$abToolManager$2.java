package ru.ozon.app.android.abtool;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/abtool/AbToolManager;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class AbToolImpl$abToolManager$2 extends AbstractC7737t implements Function0<AbToolManager> {
    final /* synthetic */ AbToolImpl this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "abVariants", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.abtool.AbToolImpl$abToolManager$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<String, Unit> {
        final /* synthetic */ AbToolImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AbToolImpl abToolImpl) {
            super(1);
            this.this$0 = abToolImpl;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String abVariants) {
            Intrinsics.checkNotNullParameter(abVariants, "abVariants");
            this.this$0.setAbVariants(abVariants);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "abVariants", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.abtool.AbToolImpl$abToolManager$2$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<String, Unit> {
        final /* synthetic */ AbToolImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(AbToolImpl abToolImpl) {
            super(1);
            this.this$0 = abToolImpl;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String abVariants) {
            Intrinsics.checkNotNullParameter(abVariants, "abVariants");
            this.this$0.setLibsAbVariants(abVariants);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "abVariantsHeader", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.abtool.AbToolImpl$abToolManager$2$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function1<String, Unit> {
        final /* synthetic */ AbToolImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(AbToolImpl abToolImpl) {
            super(1);
            this.this$0 = abToolImpl;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
            this.this$0.setAbVariantsHeader(str);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AbToolImpl$abToolManager$2(AbToolImpl abToolImpl) {
        super(0);
        this.this$0 = abToolImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final AbToolManager invoke() {
        return new AbToolManager(this.this$0.getFeatureServiceConfig(), new AnonymousClass1(this.this$0), new AnonymousClass2(this.this$0), new AnonymousClass3(this.this$0));
    }
}
