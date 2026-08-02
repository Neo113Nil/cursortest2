package ru.ozon.app.android.cscore.copybutton;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cscore.copybutton.models.CopyButtonDTO;
import ru.ozon.app.android.cscore.copybutton.models.CopyButtonVO;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\u00020\u0005*\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\tJ&\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/cscore/copybutton/CopyButtonMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/cscore/copybutton/models/CopyButtonDTO;", "Ll20/d;", "", "Lru/ozon/app/android/cscore/copybutton/models/CopyButtonVO;", "<init>", "()V", "toVO", "(Lru/ozon/app/android/cscore/copybutton/models/CopyButtonDTO;)Lru/ozon/app/android/cscore/copybutton/models/CopyButtonVO;", "dto", "info", "invoke", "(Lru/ozon/app/android/cscore/copybutton/models/CopyButtonDTO;Ll20/d;)Ljava/util/List;", "csma_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CopyButtonMapper implements Function2<CopyButtonDTO, d, List<? extends CopyButtonVO>> {
    private final CopyButtonVO toVO(CopyButtonDTO copyButtonDTO) {
        return new CopyButtonVO(copyButtonDTO.getAction().hashCode(), copyButtonDTO.getIcon(), copyButtonDTO.getAction());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<CopyButtonVO> invoke(@NotNull CopyButtonDTO dto, @NotNull d info) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(info, "info");
        return C7714v.a0(toVO(dto));
    }
}
