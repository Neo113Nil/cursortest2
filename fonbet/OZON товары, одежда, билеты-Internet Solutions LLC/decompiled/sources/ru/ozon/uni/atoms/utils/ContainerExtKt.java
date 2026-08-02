package ru.ozon.uni.atoms.utils;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a%\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/uni/atoms/v3/containers/SingleAtom;", "Lru/ozon/uni/atoms/data/AtomDTO;", "item", "", "forceChange", "", "bindOrGone", "(Lru/ozon/uni/atoms/v3/containers/SingleAtom;Lru/ozon/uni/atoms/data/AtomDTO;Z)V", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ContainerExtKt {
    public static final void bindOrGone(@NotNull SingleAtom singleAtom, AtomDTO atomDTO, boolean z11) {
        int i11;
        Intrinsics.checkNotNullParameter(singleAtom, "<this>");
        if (atomDTO != null) {
            singleAtom.bind(atomDTO, z11);
            i11 = 0;
        } else {
            i11 = 8;
        }
        singleAtom.setVisibility(i11);
    }

    public static /* synthetic */ void bindOrGone$default(SingleAtom singleAtom, AtomDTO atomDTO, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        bindOrGone(singleAtom, atomDTO, z11);
    }
}
