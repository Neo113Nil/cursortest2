package ru.ozon.app.android.atoms.v3.holders.disclosure;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.disclosure.DisclosureAtom;
import ru.ozon.app.android.uikit.view.atoms.disclosure.DisclosureView;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.utils.BindExtKt;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a*\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006\u001a,\u0010\b\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006¨\u0006\t"}, d2 = {"bind", "", "Lru/ozon/app/android/uikit/view/atoms/disclosure/DisclosureView;", "dto", "Lru/ozon/app/android/atoms/data/disclosure/DisclosureAtom;", "onAction", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "bindOrGone", "atoms_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DisclosureHolderKt {
    public static final void bind(@NotNull DisclosureView disclosureView, @NotNull DisclosureAtom dto, Function1<? super AtomAction, Unit> function1) {
        Intrinsics.checkNotNullParameter(disclosureView, "<this>");
        Intrinsics.checkNotNullParameter(dto, "dto");
        BindExtKt.bindHolder(disclosureView, dto, new DisclosureHolderKt$bind$1(disclosureView), function1);
    }

    public static /* synthetic */ void bind$default(DisclosureView disclosureView, DisclosureAtom disclosureAtom, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function1 = null;
        }
        bind(disclosureView, disclosureAtom, function1);
    }

    public static final void bindOrGone(@NotNull DisclosureView disclosureView, DisclosureAtom disclosureAtom, Function1<? super AtomAction, Unit> function1) {
        Intrinsics.checkNotNullParameter(disclosureView, "<this>");
        if (disclosureAtom == null) {
            ViewExtKt.gone(disclosureView);
        } else {
            bind(disclosureView, disclosureAtom, function1);
            ViewExtKt.show(disclosureView);
        }
    }

    public static /* synthetic */ void bindOrGone$default(DisclosureView disclosureView, DisclosureAtom disclosureAtom, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function1 = null;
        }
        bindOrGone(disclosureView, disclosureAtom, function1);
    }
}
