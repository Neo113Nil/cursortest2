package ru.ozon.android.messenger.blocks.buttons.presentation;

import Sc.o;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.view.C5314e0;
import androidx.core.view.C5316f0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.FlexboxLayoutManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.buttons.d;
import ru.ozon.android.messenger.blocks.buttons.f;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.q;
import ru.ozon.android.messenger.framework.presentation.models.p;
import ru.ozon.android.messenger.utils.g;
import ru.ozon.android.messenger.utils.view.s;
import ru.ozon.app.android.messenger.R$drawable;
import ru.ozon.app.android.messenger.databinding.MBlockButtonsBinding;

/* loaded from: classes10.dex */
public final class e extends q<f, MBlockButtonsBinding> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.core.d f84432a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f84433b;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f84434a;

        static {
            int[] iArr = new int[d.b.values().length];
            try {
                iArr[d.b.STATE_CHANGED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.b.BUTTONS_CHANGED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f84434a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(@NotNull MBlockButtonsBinding binding, @NotNull ru.ozon.android.messenger.framework.core.d references) {
        super(binding, references);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        this.f84432a = references;
        this.f84433b = true;
    }

    private final void b(f fVar) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        getBinding().buttonsContainerLL.removeAllViews();
        Iterator it = ((ArrayList) fVar.b()).iterator();
        while (it.hasNext()) {
            f.a aVar = (f.a) it.next();
            boolean z11 = aVar.b() == ru.ozon.android.messenger.blocks.buttons.b.FLEX;
            boolean c11 = fVar.c();
            ru.ozon.android.messenger.framework.core.d dVar = this.f84432a;
            c cVar = new c(dVar.c(), g.f(dVar.d()), c11);
            RecyclerView recyclerView = new RecyclerView(getContext());
            recyclerView.setAdapter(cVar);
            if (z11) {
                com.google.android.flexbox.e eVar = new com.google.android.flexbox.e(recyclerView.getContext());
                eVar.setDrawable(androidx.core.content.a.getDrawable(recyclerView.getContext(), R$drawable.m_chat_buttons_flex_decorator));
                eVar.setOrientation(1);
                recyclerView.addItemDecoration(eVar);
                recyclerView.setLayoutManager(new FlexboxLayoutManager(recyclerView.getContext()));
                if (this.f84433b) {
                    i14 = ru.ozon.android.messenger.utils.e.f91909f;
                    i15 = ru.ozon.android.messenger.utils.e.f91911h;
                    s.g(recyclerView, i14, 0, i15, 0, 10);
                    this.f84433b = false;
                } else {
                    i11 = ru.ozon.android.messenger.utils.e.f91909f;
                    i12 = ru.ozon.android.messenger.utils.e.f91911h;
                    i13 = ru.ozon.android.messenger.utils.e.f91907d;
                    s.g(recyclerView, i11, i13, i12, 0, 8);
                }
            } else {
                recyclerView.addItemDecoration(new ru.ozon.android.messenger.framework.presentation.chatdetail.view.a(this.f84433b));
                recyclerView.setLayoutManager(new FlexboxLayoutManager(recyclerView.getContext(), 0, 0));
                if (this.f84433b) {
                    this.f84433b = false;
                }
            }
            getBinding().buttonsContainerLL.addView(recyclerView);
            cVar.submitList(aVar.a());
        }
    }

    @Override // ru.ozon.android.messenger.framework.presentation.common.view.recycler.q
    public final void bind(f fVar, p itemInfo, ru.ozon.android.messenger.framework.presentation.models.d blockInfo, Object obj) {
        f block = fVar;
        Intrinsics.checkNotNullParameter(block, "block");
        Intrinsics.checkNotNullParameter(itemInfo, "itemInfo");
        Intrinsics.checkNotNullParameter(blockInfo, "blockInfo");
        super.bind(block, itemInfo, blockInfo, obj);
        if (obj == null) {
            b(block);
            return;
        }
        List list = obj instanceof List ? (List) obj : null;
        if (list == null || list.isEmpty()) {
            list = C7705l.f0(d.b.values());
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int i11 = a.f84434a[((d.b) ((Enum) it.next())).ordinal()];
            if (i11 == 1) {
                boolean c11 = block.c();
                LinearLayout buttonsContainerLL = getBinding().buttonsContainerLL;
                Intrinsics.checkNotNullExpressionValue(buttonsContainerLL, "buttonsContainerLL");
                Iterator<View> it2 = C5316f0.b(buttonsContainerLL).iterator();
                while (true) {
                    C5314e0 c5314e0 = (C5314e0) it2;
                    if (c5314e0.hasNext()) {
                        RecyclerView.g adapter = ((RecyclerView) ((View) c5314e0.next())).getAdapter();
                        c cVar = adapter instanceof c ? (c) adapter : null;
                        if (cVar != null) {
                            cVar.f(c11);
                        }
                    }
                }
            } else {
                if (i11 != 2) {
                    throw new o();
                }
                b(block);
            }
        }
    }
}
