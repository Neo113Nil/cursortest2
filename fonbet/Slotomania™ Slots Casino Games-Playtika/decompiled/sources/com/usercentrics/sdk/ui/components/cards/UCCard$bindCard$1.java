package com.usercentrics.sdk.ui.components.cards;

import com.usercentrics.sdk.ui.theme.UCThemeData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: UCCard.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "expanded", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class UCCard$bindCard$1 extends Lambda implements Function1<Boolean, Unit> {
    final /* synthetic */ UCCardPM $model;
    final /* synthetic */ Function1<String, Unit> $onMoreInfo;
    final /* synthetic */ UCThemeData $theme;
    final /* synthetic */ UCCard this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    UCCard$bindCard$1(UCCard uCCard, UCThemeData uCThemeData, UCCardPM uCCardPM, Function1<? super String, Unit> function1) {
        super(1);
        this.this$0 = uCCard;
        this.$theme = uCThemeData;
        this.$model = uCCardPM;
        this.$onMoreInfo = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z) {
        this.this$0.updateExpandableContent(this.$theme, this.$model, this.$onMoreInfo);
        if (z) {
            final UCCard uCCard = this.this$0;
            uCCard.post(new Runnable() { // from class: com.usercentrics.sdk.ui.components.cards.UCCard$bindCard$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    UCCard$bindCard$1.invoke$lambda$0(UCCard.this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(UCCard this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int[] iArr = {0, 0};
        this$0.getLocationOnScreen(iArr);
        this$0.getOnExpandedListener().invoke(Integer.valueOf(iArr[1]), Integer.valueOf(this$0.getHeight()));
    }
}
