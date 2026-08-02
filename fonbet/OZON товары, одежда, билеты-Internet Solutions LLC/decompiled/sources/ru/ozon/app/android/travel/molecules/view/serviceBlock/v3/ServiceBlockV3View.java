package ru.ozon.app.android.travel.molecules.view.serviceBlock.v3;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.travel.molecules.dto.serviceBlock.v3.ServiceBlockV3DTO;
import ru.ozon.app.android.travel.molecules.view.serviceBlock.v3.ShowingStrategyV3;
import ru.ozon.app.android.travel.molecules.view.serviceBlock.v3.adapters.ServiceBlockV3Decoration;
import ru.ozon.app.android.travel.ui.molecules.databinding.ViewServiceBlockV3Binding;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ9\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/serviceBlock/v3/ServiceBlockV3View;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lru/ozon/app/android/travel/molecules/dto/serviceBlock/v3/ServiceBlockV3DTO;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onClick", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "bind", "(Lru/ozon/app/android/travel/molecules/dto/serviceBlock/v3/ServiceBlockV3DTO;Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/composer/ComposerReferences;)V", "Lru/ozon/app/android/travel/ui/molecules/databinding/ViewServiceBlockV3Binding;", "binding", "Lru/ozon/app/android/travel/ui/molecules/databinding/ViewServiceBlockV3Binding;", "", "", "Lru/ozon/app/android/travel/molecules/view/serviceBlock/v3/ShowingStrategyV3;", "showingStrategies", "Ljava/util/Map;", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ServiceBlockV3View extends ConstraintLayout {

    @NotNull
    private final ViewServiceBlockV3Binding binding;

    @NotNull
    private final Map<Boolean, ShowingStrategyV3> showingStrategies;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ServiceBlockV3View(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void bind$default(ServiceBlockV3View serviceBlockV3View, ServiceBlockV3DTO serviceBlockV3DTO, Function1 function1, ComposerReferences composerReferences, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function1 = null;
        }
        if ((i11 & 4) != 0) {
            composerReferences = null;
        }
        serviceBlockV3View.bind(serviceBlockV3DTO, function1, composerReferences);
    }

    public final void bind(@NotNull ServiceBlockV3DTO item, Function1<? super AtomAction, Unit> onClick, ComposerReferences refs) {
        Intrinsics.checkNotNullParameter(item, "item");
        ShowingStrategyV3 showingStrategyV3 = this.showingStrategies.get(Boolean.valueOf(item.getNextOptionBenefitDescription() != null));
        if (showingStrategyV3 != null) {
            showingStrategyV3.bind(item, onClick, refs);
        }
    }

    public /* synthetic */ ServiceBlockV3View(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServiceBlockV3View(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewServiceBlockV3Binding inflate = ViewServiceBlockV3Binding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
        this.showingStrategies = U.j(new Pair(Boolean.TRUE, new ShowingStrategyV3.WithNextServiceBenefits(inflate)), new Pair(Boolean.FALSE, new ShowingStrategyV3.WithoutNextServiceBenefits(inflate)));
        RecyclerView recyclerView = inflate.additionalInfoListRV;
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.addItemDecoration(new ServiceBlockV3Decoration(context));
    }
}
