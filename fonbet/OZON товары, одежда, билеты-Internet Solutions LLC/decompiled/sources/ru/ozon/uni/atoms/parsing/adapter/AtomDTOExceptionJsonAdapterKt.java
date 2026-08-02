package ru.ozon.uni.atoms.parsing.adapter;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u001aW\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00030\u0006\"\b\b\u0000\u0010\u0001*\u00020\u00002*\u0010\u0005\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00030\u0002\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/uni/atoms/data/AtomDTO;", "DTO", "", "Lkotlin/Function1;", "", "blocks", "", "validations", "([Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AtomDTOExceptionJsonAdapterKt {
    @NotNull
    public static final <DTO extends AtomDTO> List<Function1<DTO, Unit>> validations(@NotNull Function1<? super DTO, Unit>... blocks) {
        Intrinsics.checkNotNullParameter(blocks, "blocks");
        return C7705l.e(blocks);
    }
}
