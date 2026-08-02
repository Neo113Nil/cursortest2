package ru.ozon.uni.atoms.v3.holders.selectionControls;

import Sc.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.atom.selectionControls.ToggleSize;
import ru.ozon.uni.android.atom.selectionControls.ToggleView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.selectionControls.toggle.ToggleDTO;
import ru.ozon.uni.atoms.utils.BindExtKt;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a1\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a3\u0010\t\u001a\u00020\u0005*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\b\"\u0017\u0010\u000e\u001a\u00020\u000b*\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lru/ozon/uni/android/atom/selectionControls/ToggleView;", "Lru/ozon/uni/atoms/data/selectionControls/toggle/ToggleDTO;", "dto", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "bind", "(Lru/ozon/uni/android/atom/selectionControls/ToggleView;Lru/ozon/uni/atoms/data/selectionControls/toggle/ToggleDTO;Lkotlin/jvm/functions/Function1;)V", "bindOrGone", "Lru/ozon/uni/atoms/data/selectionControls/toggle/ToggleDTO$ToggleSize;", "Lru/ozon/uni/android/atom/selectionControls/ToggleSize;", "getViewSize", "(Lru/ozon/uni/atoms/data/selectionControls/toggle/ToggleDTO$ToggleSize;)Lru/ozon/uni/android/atom/selectionControls/ToggleSize;", "viewSize", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ToggleHolderKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ToggleDTO.ToggleSize.values().length];
            try {
                iArr[ToggleDTO.ToggleSize.SIZE_500.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ToggleDTO.ToggleSize.SIZE_600.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void bind(@NotNull ToggleView toggleView, @NotNull ToggleDTO dto, Function1<? super AtomAction, Unit> function1) {
        Intrinsics.checkNotNullParameter(toggleView, "<this>");
        Intrinsics.checkNotNullParameter(dto, "dto");
        BindExtKt.bindHolder(toggleView, dto, new ToggleHolderKt$bind$provider$1(toggleView), function1);
    }

    public static /* synthetic */ void bind$default(ToggleView toggleView, ToggleDTO toggleDTO, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function1 = null;
        }
        bind(toggleView, toggleDTO, function1);
    }

    public static final void bindOrGone(@NotNull ToggleView toggleView, ToggleDTO toggleDTO, Function1<? super AtomAction, Unit> function1) {
        Intrinsics.checkNotNullParameter(toggleView, "<this>");
        if (toggleDTO == null) {
            toggleView.setVisibility(8);
        } else {
            toggleView.setVisibility(0);
            bind(toggleView, toggleDTO, function1);
        }
    }

    public static /* synthetic */ void bindOrGone$default(ToggleView toggleView, ToggleDTO toggleDTO, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function1 = null;
        }
        bindOrGone(toggleView, toggleDTO, function1);
    }

    @NotNull
    public static final ToggleSize getViewSize(ToggleDTO.ToggleSize toggleSize) {
        int i11 = toggleSize == null ? -1 : WhenMappings.$EnumSwitchMapping$0[toggleSize.ordinal()];
        if (i11 != -1) {
            if (i11 == 1) {
                return ToggleSize.Toggle500.INSTANCE;
            }
            if (i11 != 2) {
                throw new o();
            }
        }
        return ToggleSize.Toggle600.INSTANCE;
    }
}
