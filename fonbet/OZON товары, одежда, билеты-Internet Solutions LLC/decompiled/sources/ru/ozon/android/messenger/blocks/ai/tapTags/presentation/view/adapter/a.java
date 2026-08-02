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
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;

/* loaded from: classes10.dex */
public final class a extends RecyclerView.C {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ButtonV3View f84353a;

    static {
        ButtonV3View.Companion companion = ButtonV3View.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull ButtonV3View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        this.f84353a = view;
    }

    public final void e(@NotNull b.a item, Function1<? super AtomAction, Unit> function1) {
        Intrinsics.checkNotNullParameter(item, "item");
        ButtonV3DTO b11 = item.b();
        ButtonV3View buttonV3View = this.f84353a;
        ButtonV3HolderKt.bindOrGone(buttonV3View, b11, function1);
        Iterator<View> it = C5316f0.b(buttonV3View).iterator();
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
