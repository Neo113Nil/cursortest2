package ru.ozon.app.android.atoms.af.layout;

import android.content.res.TypedArray;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.atoms.R$styleable;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "styledAttrs", "Landroid/content/res/TypedArray;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class FrameAtomsLayout$initAttrs$1 extends AbstractC7737t implements Function1<TypedArray, Unit> {
    final /* synthetic */ FrameAtomsLayout this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FrameAtomsLayout$initAttrs$1(FrameAtomsLayout frameAtomsLayout) {
        super(1);
        this.this$0 = frameAtomsLayout;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(TypedArray typedArray) {
        invoke2(typedArray);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(TypedArray styledAttrs) {
        Intrinsics.checkNotNullParameter(styledAttrs, "styledAttrs");
        this.this$0.defaultGravity = styledAttrs.getInt(R$styleable.FrameAtomsLayout_childGravity, 17);
    }
}
