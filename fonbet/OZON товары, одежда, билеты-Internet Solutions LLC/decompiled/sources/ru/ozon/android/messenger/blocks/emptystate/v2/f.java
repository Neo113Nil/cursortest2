package ru.ozon.android.messenger.blocks.emptystate.v2;

import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.messenger.databinding.MBlockEmptyStateV2Binding;

/* loaded from: classes10.dex */
public final class f extends b {

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final JsonParser f85125f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(@NotNull JsonParser deserializer) {
        super(deserializer);
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.f85125f = deserializer;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.b
    public final void c(ViewGroup rootView, X4.a aVar, ru.ozon.android.messenger.framework.core.d references, ru.ozon.android.messenger.framework.presentation.models.g gVar) {
        MBlockEmptyStateV2Binding binding = (MBlockEmptyStateV2Binding) aVar;
        g viewObject = (g) gVar;
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        super.o(rootView, binding, references, viewObject);
        r(references, viewObject);
        binding.emptyStateBottomButtons.a(viewObject.b(), new e(references, this, viewObject));
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    public final boolean canMap(Object obj) {
        if (obj instanceof ru.ozon.android.messenger.framework.presentation.models.e) {
            ru.ozon.android.messenger.framework.presentation.models.e eVar = (ru.ozon.android.messenger.framework.presentation.models.e) obj;
            if ((eVar.b() instanceof g) && ((g) eVar.b()).a() == a.VERTICAL) {
                return true;
            }
        }
        return false;
    }
}
