package ru.ozon.android.messenger.blocks.input.viewdelegates;

import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import java.util.Map;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.input.views.PastePlainTextEditText;
import ru.ozon.app.android.messenger.databinding.MViewChatInputBinding;
import xe.C10727i;

/* loaded from: classes10.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.blocks.input.viewmodel.h f85574a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final l f85575b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final e f85576c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final j f85577d;

    public f(@NotNull ru.ozon.android.messenger.blocks.input.viewmodel.h chatInputViewModel, @NotNull n inputIncidentsPresenter, @NotNull ru.ozon.android.messenger.framework.core.d references) {
        Intrinsics.checkNotNullParameter(chatInputViewModel, "chatInputViewModel");
        Intrinsics.checkNotNullParameter(inputIncidentsPresenter, "inputIncidentsPresenter");
        Intrinsics.checkNotNullParameter(references, "references");
        this.f85574a = chatInputViewModel;
        this.f85575b = new l(chatInputViewModel, references);
        this.f85576c = new e(chatInputViewModel, inputIncidentsPresenter);
        this.f85577d = new j(chatInputViewModel, references);
    }

    public final void a(@NotNull ViewGroup parent, @NotNull MViewChatInputBinding binding, @NotNull ru.ozon.android.messenger.blocks.input.d viewObject) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        this.f85575b.d(parent, viewObject);
        this.f85576c.f(parent);
        parent.addView(binding.getConstraintLayout());
        j jVar = this.f85577d;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(binding, "binding");
        binding.attachIv.setOnClickListener(new Cw.b(jVar, 14));
        PastePlainTextEditText inputEt = binding.inputEt;
        Intrinsics.checkNotNullExpressionValue(inputEt, "inputEt");
        inputEt.addTextChangedListener(new i(jVar));
    }

    public final void b(@NotNull MViewChatInputBinding binding, @NotNull ru.ozon.android.messenger.framework.core.d references, @NotNull ru.ozon.android.messenger.blocks.input.d viewObject) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        this.f85574a.y0(viewObject, references.b(), references.d());
        this.f85577d.e(binding, references.f());
        J lifecycleOwner = references.f();
        l lVar = this.f85575b;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        C10727i.c(K.a(lifecycleOwner), null, null, new k(lVar, null), 3);
        ComponentCallbacksC5392m d11 = references.d();
        J f7 = references.f();
        Map<String, String> h11 = viewObject.h();
        if (h11 == null) {
            h11 = U.c();
        }
        this.f85576c.g(d11, f7, h11);
    }

    public final void c(@NotNull ViewGroup parent, @NotNull MViewChatInputBinding binding) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f85577d.f();
        parent.removeView(binding.getConstraintLayout());
        this.f85575b.e(parent);
        this.f85576c.h(parent);
    }
}
