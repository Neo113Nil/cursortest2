package ru.ozon.android.messenger.blocks.ai.tapTags.presentation.view.adapter;

import Sc.o;
import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t;
import com.google.android.flexbox.FlexboxLayoutManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.ai.tapTags.presentation.b;
import ru.ozon.android.messenger.blocks.ai.tapTags.presentation.view.TapTagsView;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.controls.tag.TagButtonView;
import ru.ozon.uni.atoms.af.AtomAction;

/* loaded from: classes10.dex */
public final class b extends t<ru.ozon.android.messenger.blocks.ai.tapTags.presentation.b, RecyclerView.C> {

    /* renamed from: a, reason: collision with root package name */
    private Function1<? super AtomAction, Unit> f84354a;

    public b() {
        super(new c());
    }

    private static FlexboxLayoutManager.b f() {
        int i11;
        int i12;
        int i13;
        int i14;
        FlexboxLayoutManager.b bVar = new FlexboxLayoutManager.b(-2, -2);
        i11 = TapTagsView.f84337k;
        ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = i11;
        i12 = TapTagsView.f84337k;
        ((ViewGroup.MarginLayoutParams) bVar).leftMargin = i12;
        i13 = TapTagsView.f84337k;
        ((ViewGroup.MarginLayoutParams) bVar).rightMargin = i13;
        i14 = TapTagsView.f84337k;
        ((ViewGroup.MarginLayoutParams) bVar).topMargin = i14;
        return bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final long getItemId(int i11) {
        return getItem(i11).getId();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final int getItemViewType(int i11) {
        ru.ozon.android.messenger.blocks.ai.tapTags.presentation.b item = getItem(i11);
        if (item instanceof b.a) {
            return 1;
        }
        if (item instanceof b.C1465b) {
            return 2;
        }
        throw new o();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onBindViewHolder(@NotNull RecyclerView.C holder, int i11) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof a) {
            ru.ozon.android.messenger.blocks.ai.tapTags.presentation.b item = getItem(i11);
            Intrinsics.g(item, "null cannot be cast to non-null type ru.ozon.android.messenger.blocks.ai.tapTags.presentation.TapTagItemVO.ButtonItem");
            ((a) holder).e((b.a) item, this.f84354a);
        } else if (holder instanceof d) {
            ru.ozon.android.messenger.blocks.ai.tapTags.presentation.b item2 = getItem(i11);
            Intrinsics.g(item2, "null cannot be cast to non-null type ru.ozon.android.messenger.blocks.ai.tapTags.presentation.TapTagItemVO.TagButtonItem");
            ((d) holder).e((b.C1465b) item2, this.f84354a);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public final RecyclerView.C onCreateViewHolder(@NotNull ViewGroup parent, int i11) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (i11 == 1) {
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            ButtonV3View buttonV3View = new ButtonV3View(context, null, 0, 0, 14, null);
            buttonV3View.setLayoutParams(f());
            return new a(buttonV3View);
        }
        if (i11 != 2) {
            throw new IllegalArgumentException("invalid viewHolder type");
        }
        Context context2 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        TagButtonView tagButtonView = new TagButtonView(context2, null, 0, 0, 14, null);
        tagButtonView.setLayoutParams(f());
        return new d(tagButtonView);
    }

    public final void setActionHandler(Function1<? super AtomAction, Unit> function1) {
        this.f84354a = function1;
    }
}
