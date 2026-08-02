package ru.ozon.uni.atoms.parsing.adapter;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.parsing.ParserStateHolder;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Ljava/lang/Class;", "Lru/ozon/uni/atoms/data/AtomDTO;", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class AtomPolymorphicJsonAdapter$toJson$1$1$1 extends AbstractC7737t implements Function0<Map<Class<? extends AtomDTO>, ? extends String>> {
    public static final AtomPolymorphicJsonAdapter$toJson$1$1$1 INSTANCE = new AtomPolymorphicJsonAdapter$toJson$1$1$1();

    AtomPolymorphicJsonAdapter$toJson$1$1$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<Class<? extends AtomDTO>, ? extends String> invoke() {
        return ParserStateHolder.INSTANCE.getConfig$uni_release().getLabels();
    }
}
