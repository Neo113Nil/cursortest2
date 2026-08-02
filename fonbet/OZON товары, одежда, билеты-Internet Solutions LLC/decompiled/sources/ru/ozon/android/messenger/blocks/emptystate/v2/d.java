package ru.ozon.android.messenger.blocks.emptystate.v2;

import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.messenger.framework.data.remote.models.blocks.BlockDTO;
import ru.ozon.app.android.messenger.databinding.MBlockEmptyStateV2Binding;

/* loaded from: classes10.dex */
public final class d extends b {

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final JsonParser f85121f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@NotNull JsonParser deserializer) {
        super(deserializer);
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.f85121f = deserializer;
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
        binding.emptyStateButtons.a(viewObject.b(), new c(references, this, viewObject));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0042 A[RETURN] */
    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean canMap(Object obj) {
        if (obj instanceof ru.ozon.android.messenger.framework.presentation.models.e) {
            ru.ozon.android.messenger.framework.presentation.models.e eVar = (ru.ozon.android.messenger.framework.presentation.models.e) obj;
            return (eVar.b() instanceof g) && ((g) eVar.b()).a() == a.HORIZONTAL;
        }
        if (obj instanceof BlockDTO) {
            long version = ((BlockDTO) obj).getVersion();
            long[] jArr = {2};
            Intrinsics.checkNotNullParameter(jArr, "<this>");
            if (version == Long.valueOf(jArr[0]).longValue()) {
            }
        }
    }
}
