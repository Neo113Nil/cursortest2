package ru.ozon.android.messenger.blocks.ai.tapTags.presentation.view.adapter;

import android.view.View;
import androidx.core.view.C5314e0;
import androidx.core.view.C5316f0;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.ai.tapTags.presentation.b;
import ru.ozon.uni.android.controls.tag.TagButtonView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;
import ru.ozon.uni.atoms.v3.holders.controls.tag.TagButtonHolderKt;

/* loaded from: classes10.dex */
public final class d extends RecyclerView.C {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final TagButtonView f84355a;

    static {
        TagButtonView.Companion companion = TagButtonView.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@NotNull TagButtonView view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        this.f84355a = view;
    }

    public final void e(@NotNull b.C1465b item, Function1<? super AtomAction, Unit> function1) {
        Intrinsics.checkNotNullParameter(item, "item");
        TagButtonDTO b11 = item.b();
        TagButtonView tagButtonView = this.f84355a;
        TagButtonHolderKt.bindOrGone(tagButtonView, b11, function1);
        Iterator<View> it = C5316f0.b(tagButtonView).iterator();
        while (true) {
            C5314e0 c5314e0 = (C5314e0) it;
            if (!c5314e0.hasNext()) {
                return;
            } else {
                ((View) c5314e0.next()).setContentDescription("ButtonV3.titleLabel");
            }
        }
    }
}
