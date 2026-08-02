package ru.ozon.android.messenger.blocks.ai.tapTags.presentation.view;

import D3.h;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.FlexboxLayoutManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.ai.tapTags.presentation.a;
import ru.ozon.android.messenger.blocks.ai.tapTags.presentation.c;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/ozon/android/messenger/blocks/ai/tapTags/presentation/view/TapTagsView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TapTagsView extends ConstraintLayout {

    /* renamed from: h, reason: collision with root package name */
    private static final int f84334h;

    /* renamed from: i, reason: collision with root package name */
    private static final int f84335i;

    /* renamed from: j, reason: collision with root package name */
    private static final int f84336j;

    /* renamed from: k, reason: collision with root package name */
    private static final int f84337k;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final TextAtomV2View f84338c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ButtonV3View f84339d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final RecyclerView f84340e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final b f84341f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.blocks.ai.tapTags.presentation.view.adapter.b f84342g;

    static final class a extends AbstractC7737t implements Function1<ru.ozon.android.messenger.blocks.ai.tapTags.presentation.b, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f84343b = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ru.ozon.android.messenger.blocks.ai.tapTags.presentation.b bVar) {
            Intrinsics.checkNotNullParameter(bVar, "<unused var>");
            return Unit.f71690a;
        }
    }

    static {
        int px = ResourceExtKt.toPx(4);
        f84334h = px;
        f84335i = ResourceExtKt.toPx(16);
        f84336j = ResourceExtKt.toPx(16);
        f84337k = px;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TapTagsView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        h.f(0, -2, textAtomV2View);
        textAtomV2View.setEllipsize(TextUtils.TruncateAt.END);
        this.f84338c = textAtomV2View;
        ButtonV3View buttonV3View = new ButtonV3View(context, null, 0, 0, 14, null);
        buttonV3View.setId(View.generateViewId());
        buttonV3View.setLayoutParams(new ConstraintLayout.b(-2, -2));
        this.f84339d = buttonV3View;
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setId(View.generateViewId());
        recyclerView.setLayoutParams(new ConstraintLayout.b(0, -2));
        recyclerView.setLayoutManager(new FlexboxLayoutManager(context));
        recyclerView.setItemAnimator(null);
        recyclerView.setContentDescription("itemsRecyclerView");
        recyclerView.setNestedScrollingEnabled(false);
        this.f84340e = recyclerView;
        b bVar = new b(context);
        bVar.setId(View.generateViewId());
        bVar.setLayoutParams(new ConstraintLayout.b(0, -2));
        bVar.setContentDescription("itemsRecyclerView");
        this.f84341f = bVar;
        ru.ozon.android.messenger.blocks.ai.tapTags.presentation.view.adapter.b bVar2 = new ru.ozon.android.messenger.blocks.ai.tapTags.presentation.view.adapter.b();
        this.f84342g = bVar2;
        recyclerView.setAdapter(bVar2);
        addView(textAtomV2View);
        addView(buttonV3View);
        addView(recyclerView);
        addView(bVar);
        d(null);
    }

    public final void c(@NotNull c item, boolean z11, @NotNull Function1<? super AtomAction, Unit> onTitleAction, @NotNull Function1<? super AtomAction, Unit> onTitleRightButtonAction, @NotNull Function1<? super AtomAction, Unit> onItemAction) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(onTitleAction, "onTitleAction");
        Intrinsics.checkNotNullParameter(onTitleRightButtonAction, "onTitleRightButtonAction");
        Intrinsics.checkNotNullParameter(onItemAction, "onItemAction");
        TextAtomV2View textAtomV2View = this.f84338c;
        textAtomV2View.setPadding(0, 0, 0, 0);
        TextHolderKt.bindOrGone(textAtomV2View, item.d(), onTitleAction);
        ButtonV3DTO e11 = item.e();
        if (textAtomV2View.getVisibility() != 0) {
            e11 = null;
        }
        ButtonV3HolderKt.bindOrGone(this.f84339d, e11, onTitleRightButtonAction);
        ru.ozon.android.messenger.blocks.ai.tapTags.presentation.a b11 = item.b();
        RecyclerView recyclerView = this.f84340e;
        ru.ozon.android.messenger.blocks.ai.tapTags.presentation.view.adapter.b bVar = this.f84342g;
        b bVar2 = this.f84341f;
        if (b11 == null) {
            bVar2.c();
            bVar2.setVisibility(8);
            recyclerView.setVisibility(0);
            d(null);
            bVar.setActionHandler(onItemAction);
            bVar.submitList(item.c());
            return;
        }
        recyclerView.setVisibility(8);
        bVar.submitList(K.f71697a);
        bVar2.setVisibility(0);
        bVar2.d(b11.c());
        d(b11.g());
        bVar2.e(b11);
        bVar2.setTags(item.c());
        bVar2.setMode(z11);
        bVar2.setItemActionHandlers(onItemAction, a.f84343b);
        bVar2.invalidateAllTags();
    }

    public final void d(a.C1464a c1464a) {
        d dVar = new d();
        dVar.p(this);
        TextAtomV2View textAtomV2View = this.f84338c;
        int id2 = textAtomV2View.getId();
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        dVar.t(id2, 6, 0, 6, 0);
        int id3 = textAtomV2View.getId();
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        dVar.t(id3, 3, 0, 3, 0);
        int id4 = textAtomV2View.getId();
        ButtonV3View buttonV3View = this.f84339d;
        int id5 = buttonV3View.getId();
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        dVar.t(id4, 7, id5, 6, 0);
        ru.ozon.android.messenger.utils.view.a.a(dVar, buttonV3View.getId(), f84334h);
        int id6 = buttonV3View.getId();
        int id7 = textAtomV2View.getId();
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        dVar.t(id6, 3, id7, 3, 0);
        int id8 = buttonV3View.getId();
        int id9 = textAtomV2View.getId();
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        dVar.t(id8, 4, id9, 4, 0);
        RecyclerView recyclerView = this.f84340e;
        int id10 = recyclerView.getId();
        int i11 = f84335i;
        int i12 = f84337k;
        int i13 = i11 - i12;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        dVar.t(id10, 6, 0, 6, i13);
        ru.ozon.android.messenger.utils.view.a.a(dVar, recyclerView.getId(), i13);
        int id11 = recyclerView.getId();
        int id12 = textAtomV2View.getId();
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        dVar.t(id11, 3, id12, 4, 0);
        int id13 = recyclerView.getId();
        int i14 = f84336j;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        dVar.t(id13, 4, 0, 4, i14 - i12);
        b bVar = this.f84341f;
        int id14 = bVar.getId();
        int c11 = c1464a != null ? c1464a.c() : i11;
        int f7 = c1464a != null ? c1464a.f() : i12;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        dVar.t(id14, 6, 0, 6, c11 - f7);
        int id15 = bVar.getId();
        if (c1464a != null) {
            i11 = c1464a.d();
        }
        ru.ozon.android.messenger.utils.view.a.a(dVar, id15, i11 - (c1464a != null ? c1464a.f() : i12));
        int id16 = bVar.getId();
        int id17 = textAtomV2View.getId();
        int e11 = c1464a != null ? c1464a.e() : 0;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        dVar.t(id16, 3, id17, 4, e11);
        int id18 = bVar.getId();
        if (c1464a != null) {
            i14 = c1464a.b();
        }
        if (c1464a != null) {
            i12 = c1464a.a();
        }
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        dVar.t(id18, 4, 0, 4, i14 - i12);
        dVar.f(this);
    }
}
