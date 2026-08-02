package ru.ozon.uni.atoms.utils;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$id;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.v3.AtomV3;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u001aa\u0010\r\u001a\u00020\u000b\"\u0016\b\u0000\u0010\u0002*\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0006\b\u0001\u0012\u00020\u00010\u0000\"\b\b\u0001\u0010\u0004*\u00020\u0003*\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\u0004\b\r\u0010\u000e\u001aa\u0010\u000f\u001a\u00020\u000b\"\u0016\b\u0000\u0010\u0002*\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0006\b\u0001\u0012\u00020\u00010\u0000\"\b\b\u0001\u0010\u0004*\u00020\u0003*\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\u0004\b\u000f\u0010\u000e\u001a!\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\b\u0001\u0012\u00020\u0001\u0018\u00010\u0000*\u00020\u0005¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/uni/atoms/v3/AtomV3;", "Landroid/view/View;", "Holder", "Lru/ozon/uni/atoms/data/AtomDTO;", "DTO", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "dto", "Lkotlin/Function0;", "provider", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "bindHolder", "(Lru/ozon/uni/android/uikit/view/atoms/AtomView;Lru/ozon/uni/atoms/data/AtomDTO;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "bindNewHolder", "getHolder", "(Lru/ozon/uni/android/uikit/view/atoms/AtomView;)Lru/ozon/uni/atoms/v3/AtomV3;", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class BindExtKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <Holder extends AtomV3<DTO, ? extends View>, DTO extends AtomDTO> void bindHolder(@NotNull AtomView atomView, @NotNull DTO dto, @NotNull Function0<? extends Holder> provider, Function1<? super AtomAction, Unit> function1) {
        Intrinsics.checkNotNullParameter(atomView, "<this>");
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(provider, "provider");
        View view = (View) atomView;
        Object tag = view.getTag(R$id.atom_holder_id);
        Holder holder = tag instanceof AtomV3 ? (Holder) tag : null;
        if (holder == null) {
            holder = provider.invoke();
            view.setTag(R$id.atom_holder_id, holder);
        }
        if (function1 == null) {
            function1 = BindExtKt$bindHolder$1.INSTANCE;
        }
        holder.withAction(function1);
        holder.bind(dto);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <Holder extends AtomV3<DTO, ? extends View>, DTO extends AtomDTO> void bindNewHolder(@NotNull AtomView atomView, @NotNull DTO dto, @NotNull Function0<? extends Holder> provider, Function1<? super AtomAction, Unit> function1) {
        Intrinsics.checkNotNullParameter(atomView, "<this>");
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(provider, "provider");
        View view = (View) atomView;
        Holder invoke = provider.invoke();
        if (function1 == null) {
            function1 = BindExtKt$bindNewHolder$holder$1$1.INSTANCE;
        }
        invoke.withAction(function1);
        view.setTag(R$id.atom_holder_id, invoke);
        invoke.bind(dto);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final AtomV3<AtomDTO, ? extends View> getHolder(@NotNull AtomView atomView) {
        Intrinsics.checkNotNullParameter(atomView, "<this>");
        Object tag = ((View) atomView).getTag(R$id.atom_holder_id);
        if (tag instanceof AtomV3) {
            return (AtomV3) tag;
        }
        return null;
    }
}
