package ru.ozon.android.messenger.blocks.showTextButton;

import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.q;
import ru.ozon.app.android.messenger.databinding.MBlockShowTextButtonBinding;

/* loaded from: classes10.dex */
public final class o extends q<l, MBlockShowTextButtonBinding> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.core.d f86411a;

    static final class a extends AbstractC7737t implements Function1<MBlockShowTextButtonBinding, Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ l f86413c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.presentation.models.p f86414d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.presentation.models.d f86415e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Object f86416f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(l lVar, ru.ozon.android.messenger.framework.presentation.models.p pVar, ru.ozon.android.messenger.framework.presentation.models.d dVar, Object obj) {
            super(1);
            this.f86413c = lVar;
            this.f86414d = pVar;
            this.f86415e = dVar;
            this.f86416f = obj;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(MBlockShowTextButtonBinding mBlockShowTextButtonBinding) {
            MBlockShowTextButtonBinding withBinding = mBlockShowTextButtonBinding;
            Intrinsics.checkNotNullParameter(withBinding, "$this$withBinding");
            ru.ozon.android.messenger.framework.presentation.models.d dVar = this.f86415e;
            Object obj = this.f86416f;
            o oVar = o.this;
            l lVar = this.f86413c;
            o.super.bind(lVar, this.f86414d, dVar, obj);
            withBinding.showTextButtonRootCl.a(new C4912a(true, -474848154, new n(lVar, oVar)));
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(@NotNull MBlockShowTextButtonBinding binding, @NotNull ru.ozon.android.messenger.framework.core.d references) {
        super(binding, references);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        this.f86411a = references;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.common.view.recycler.q
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void bind(@NotNull l block, @NotNull ru.ozon.android.messenger.framework.presentation.models.p itemInfo, @NotNull ru.ozon.android.messenger.framework.presentation.models.d blockInfo, Object obj) {
        Intrinsics.checkNotNullParameter(block, "block");
        Intrinsics.checkNotNullParameter(itemInfo, "itemInfo");
        Intrinsics.checkNotNullParameter(blockInfo, "blockInfo");
        withBinding(new a(block, itemInfo, blockInfo, obj));
    }
}
