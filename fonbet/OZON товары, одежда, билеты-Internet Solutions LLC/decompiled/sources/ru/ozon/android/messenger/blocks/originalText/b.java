package ru.ozon.android.messenger.blocks.originalText;

import android.animation.Animator;
import android.widget.ImageView;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.core.initialization.newinit.d;
import ru.ozon.android.messenger.framework.presentation.models.h;
import ru.ozon.app.android.messenger.databinding.MBlockOriginalTextBinding;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

/* loaded from: classes10.dex */
public final class b implements Animator.AnimatorListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ f f85983a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ MBlockOriginalTextBinding f85984b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ d.a f85985c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ c f85986d;

    b(f fVar, MBlockOriginalTextBinding mBlockOriginalTextBinding, d.a aVar, c cVar) {
        this.f85983a = fVar;
        this.f85984b = mBlockOriginalTextBinding;
        this.f85985c = aVar;
        this.f85986d = cVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        f fVar = this.f85983a;
        TextDTO d11 = fVar.d();
        MBlockOriginalTextBinding mBlockOriginalTextBinding = this.f85984b;
        if (d11 != null) {
            TextAtomV2View originalText = mBlockOriginalTextBinding.originalText;
            Intrinsics.checkNotNullExpressionValue(originalText, "originalText");
            TextHolderKt.bindOrGone$default(originalText, fVar.d(), null, 2, null);
        } else {
            ImageView iconOriginalText = mBlockOriginalTextBinding.iconOriginalText;
            Intrinsics.checkNotNullExpressionValue(iconOriginalText, "iconOriginalText");
            ru.ozon.android.messenger.utils.image.c.a(iconOriginalText, "ic_s_loading_filled_compact", this.f85985c);
            this.f85986d.f85987a.c().q(ru.ozon.android.messenger.framework.navigation.action.b.d(fVar.b().a(), U.i(new Pair("itemId", h.b(fVar)))));
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }
}
