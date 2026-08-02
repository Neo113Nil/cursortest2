package ru.ozon.uni.atoms.v3.holders.controls.buttonV3;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.utils.BindExtKt;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a1\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a3\u0010\t\u001a\u00020\u0005*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "dto", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "bind", "(Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lkotlin/jvm/functions/Function1;)V", "bindOrGone", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class IconButtonV3HolderKt {
    public static final void bind(@NotNull IconButtonV3View iconButtonV3View, @NotNull IconButtonV3DTO dto, Function1<? super AtomAction, Unit> function1) {
        Intrinsics.checkNotNullParameter(iconButtonV3View, "<this>");
        Intrinsics.checkNotNullParameter(dto, "dto");
        BindExtKt.bindHolder(iconButtonV3View, dto, new IconButtonV3HolderKt$bind$provider$1(iconButtonV3View), function1);
    }

    public static /* synthetic */ void bind$default(IconButtonV3View iconButtonV3View, IconButtonV3DTO iconButtonV3DTO, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function1 = null;
        }
        bind(iconButtonV3View, iconButtonV3DTO, function1);
    }

    public static final void bindOrGone(@NotNull IconButtonV3View iconButtonV3View, IconButtonV3DTO iconButtonV3DTO, Function1<? super AtomAction, Unit> function1) {
        Intrinsics.checkNotNullParameter(iconButtonV3View, "<this>");
        if (iconButtonV3DTO == null) {
            iconButtonV3View.setVisibility(8);
        } else {
            iconButtonV3View.setVisibility(0);
            bind(iconButtonV3View, iconButtonV3DTO, function1);
        }
    }

    public static /* synthetic */ void bindOrGone$default(IconButtonV3View iconButtonV3View, IconButtonV3DTO iconButtonV3DTO, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function1 = null;
        }
        bindOrGone(iconButtonV3View, iconButtonV3DTO, function1);
    }
}
